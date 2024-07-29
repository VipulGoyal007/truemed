package com.intellihealth.truemeds.presentation.activity

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.ButtonClickCallback
import com.intellihealth.salt.constants.MobileSectionTypeConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.ActivityManagePatientBinding
import com.intellihealth.truemeds.domain.navigation.navigateToAddAddressActivity
import com.intellihealth.truemeds.domain.navigation.navigateToAddPatientActivity
import com.intellihealth.truemeds.presentation.bottomsheet.managepatient.BottomSheetFragment
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ManagePatientActivity : BaseActivity() {
    private val binding by viewBinding(ActivityManagePatientBinding::inflate)
    private lateinit var viewModel: ManagePatientViewModel
    private lateinit var context: Context
    private var editDeleteAddressBottomSheet = BottomSheetFragment()
    private var comingFromAccountFragment:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.lifecycleOwner = this
        updateStatusBarColor()
        viewModel = ViewModelProvider(this)[ManagePatientViewModel::class.java]
        binding.viewModel = viewModel
        lifecycle.addObserver(viewModel)
        context = this
        initView()
        extractIntentData()
        setCallbacks()
        setObservers()
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)) {
                viewModel.clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()

                if(bundle.containsKey(BundleConstants.IS_FROM_ACCOUNT_FRAGMENT)){
                    comingFromAccountFragment = bundle.getBoolean(BundleConstants.IS_FROM_ACCOUNT_FRAGMENT, false)
                }
            }
        }
    }

    private fun initView() {

        binding.tmTopHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                getString(R.string.manage_patients), "", "",
                "", 0
            )
        )

        viewModel.deletePatientEventListener.observe(this, EventObserver {
            if (it) {
                editDeleteAddressBottomSheet.isCancelable = true
                if (!editDeleteAddressBottomSheet.isVisible)
                    editDeleteAddressBottomSheet.setBottomSheet(viewModel)
                editDeleteAddressBottomSheet.show(
                    supportFragmentManager, "Discard unsaved details?"
                )
            } else {
                editDeleteAddressBottomSheet.dismiss()
            }
        })

        viewModel.isDelete.observe(this, EventObserver {
            if (it) {
                editDeleteAddressBottomSheet.dismiss()
                checkForNetworkAndDoApiCallings(2)
            } else {
                editDeleteAddressBottomSheet.dismiss()
            }
        })

        checkForNetworkAndDoApiCallings()

    }


    fun checkForNetworkAndDoApiCallings(type: Int = 0) {
        if (isNetworkAvailable(context)) {
            //type 1 is for again calling patient list api in case of onActivityResult received
            if (type == 1)
                viewModel.getPatientDetails()
            //type 2 is for delete patient api calling
            else if (type == 2)
                viewModel.deletePatient()
            else
                viewModel.getPatientList()

        } else {
            showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                    checkForNetworkAndDoApiCallings(type)
                }

                override fun onCloseButtonClicked() {
                }
            }, true)
        }
    }

    private fun setCallbacks() {
        binding.tmTopHeader.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })

        binding.tmTopHeader.setButtonClickCallback(object :
            ButtonClickCallback {
            override fun buttonClick() {
                redirectToAddPatient()
            }

            override fun buttonClickWithParams(buttonType: String) {

            }
        })

    }

    fun setObservers() {
        viewModel.patientsList.observe(this) {
            binding.tmTopHeader.setMobileSectionHeadersViewType(MobileSectionTypeConstants.TEXT_WITH_CTA)
            binding.tmTopHeader.setUpMobileSectionHeadersData(
                MobileSectionHeadersModel(
                    getString(R.string.manage_patients), "", "",
                    getString(R.string.add_patient), 0,
                    buttonIconRight = ContextCompat.getDrawable(this, R.drawable.ic_plus_blue_icon)
                )
            )
        }

        viewModel.eventMessage.observe(this, EventObserver {
            if (it.messageEnum == MESSAGES.ADD_PATIENT_CLICK) {
                redirectToAddPatient()

            } else if (it.messageEnum == MESSAGES.EDIT_PATIENT_DETAILS_CLICK) {

                //Toast().showCustomToastMessage(context, "Edit patient redirection coming soon")


            } else if (it.messageEnum == MESSAGES.DELETE_PATIENT_SUCCESSFULLY) {

                if (it.displayMessage.isNotEmpty()) {
                    Toast().showCustomToastMessage(context, it.displayMessage)
                } else {
                    Toast().showCustomToastMessage(context, "Patient Deleted")
                }
                //viewModel.patientsList.postValue(viewModel.patientsList.value)


            } else if (it.messageEnum == MESSAGES.DELETE_PATIENT_FAILED) {
                Toast().showCustomToastMessage(context, it.displayMessage)
            } else if (it.messageEnum == MESSAGES.EDIT_PATIENT_SUCCESSFULLY) {
                viewModel.getPatientDetails()


            } else if (it.messageEnum == MESSAGES.ADD_PATIENT_SUCCESSFULLY) {
                viewModel.getPatientDetails()


            }

        })

        viewModel._launchEditPatient.observe(this, EventObserver {
            val patientJson = Gson().toJson(it)
            navigateToAddPatientActivity(
                params = bundleOf(
                    BundleConstants.PATIENT_EXPERIMENT to viewModel.patientExperiment.value,
                    "isFreshUser" to viewModel._isFreshUser,
                    BundleConstants.IS_FROM_ACCOUNT_FRAGMENT to comingFromAccountFragment,
                    BundleConstants.BUNDLE_KEY_IS_EDIT_PATIENT to true,
                    BundleConstants.BUNDLE_KEY_PATIENT_DETAILS to patientJson,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to viewModel.clickedOnPage
                ),
                activityLauncher = activityLauncher
            )
        })

        viewModel.eventShowError.observe(this, EventObserver {
            if (it.equals(ERRORS.NO_PATIENT_FOUND)) {
                binding.tmTopHeader.setMobileSectionHeadersViewType(MobileSectionTypeConstants.DEFAULT_WITHOUT_FILL)
                binding.tmTopHeader.setUpMobileSectionHeadersData(
                    MobileSectionHeadersModel(
                        getString(R.string.manage_patients), "", "",
                        getString(R.string.add_patient), 0,
                        buttonIconRight = ContextCompat.getDrawable(
                            this,
                            R.drawable.ic_plus_blue_icon
                        )
                    )
                )
            }

        })

        viewModel.showShimmerLiveData.observe(this) {
            if (it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }

        viewModel.eventLaunchAddPatient.observe(this, EventObserver { category ->
            navigateToAddPatientActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_FRESH_USER to ((viewModel.patientsList.value?.size?:0) ==0),
                    BundleConstants.PATIENT_EXPERIMENT to category,
                    BundleConstants.IS_FROM_ACCOUNT_FRAGMENT to comingFromAccountFragment,
                    BundleConstants.BUNDLE_KEY_IS_EDIT_PATIENT to false,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to viewModel.clickedOnPage
                ),
                activityLauncher = activityLauncher
            )
        })
    }

    fun redirectToAddPatient() {
        viewModel.sendAddPatientClickedEvent("manage_patient")
        viewModel.loaderValue.postValue(true)
        viewModel.getPatientExperimentCategory()

    }

    private var activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        if (result?.resultCode == Activity.RESULT_OK) {
            checkForNetworkAndDoApiCallings(1)

        }
    }

//    override fun onBackPressed() {
//        finish()
//        overridePendingTransition(0, R.anim.slide_out)
//        super.onBackPressed()
//
//    }
}


