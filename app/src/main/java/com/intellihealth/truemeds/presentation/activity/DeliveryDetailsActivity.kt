package com.intellihealth.truemeds.presentation.activity

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.views.tooltip.DefaultExpandedTooltip
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.AddressClickCallback
import com.intellihealth.truemeds.data.callback.PatientClickCallback
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.ActivityDeliveryDetailsBinding
import com.intellihealth.truemeds.domain.enums.AddressEdited
import com.intellihealth.truemeds.domain.navigation.navigateToAddAddressActivity
import com.intellihealth.truemeds.domain.navigation.navigateToAddPatientActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.RequestCodeConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DeliveryDetailsActivity : BaseActivity() {

    private val viewModel by lazy { ViewModelProvider(this)[DeliveryDetailsViewModel::class.java] }
    private val binding by viewBinding(ActivityDeliveryDetailsBinding::inflate)
    private var addressCount = 0
    private var patientCount = 0
    private var redirectToCart = false
    private var isFromPrescription = false
    private val handler = Handler()
    private var clickedOnPage = AddressEdited.DeliveryDetails.type
    override fun onResume() {
        super.onResume()
        viewModel.sendDeliveryDetailViewedEvent()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.getPatientExperiment()
        updateStatusBarColor()
        extractIntentData()
        initView()
        setupOnBackPressed()
        setCallbacks()
        setObservers()
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            clickedOnPage = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE) ?: "cart"
            patientCount = bundle.getInt(BundleConstants.BUNDLE_KEY_PATIENT_COUNT, 0)
            addressCount = bundle.getInt(BundleConstants.BUNDLE_KEY_ADDRESS_COUNT, 0)
            isFromPrescription = bundle.getBoolean(BundleConstants.IS_FROM_PRESCRIPTION, false)
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_REDIRECT_TO_CART)) {
                redirectToCart = bundle.getBoolean(BundleConstants.BUNDLE_KEY_REDIRECT_TO_CART, false)
            }
        }
    }

    fun initView() {
        checkForNetworkAndDoApiCallings(1)
        setSaveBtnText()
    }

    private fun setSaveBtnText() {
        if (isFromPrescription) {
            binding.btnCheckout.setTitle(this.getString(R.string.save_and_continue))
        } else {
            binding.btnCheckout.setTitle(this.getString(R.string.checkout))
        }
    }

    private fun setCallbacks() {

        binding.patientCallback = object : PatientClickCallback {
            override fun editClick(patient: GetAllPatientResponse.Patient) {
                if (SharedPrefManager.getInstance().isReOrder) {
                    if (patient.patientId != viewModel.selectedPatient?.patientId
                    ) showDiscardOrderDialog()
                    else
                        goToAddPatientActivity(patient)

                } else {
                    goToAddPatientActivity(patient)
                }
            }

        }
        binding.addressCallback = object : AddressClickCallback {
            override fun editClick(address: GetAllAddressResponse.ResponseObj) {
                val addressJson = Gson().toJson(address).toString()

                navigateToAddAddressActivity(
                    params = bundleOf(
                        "editList" to addressJson,
                        "isEditClick" to true,
                        "isHomeAddressAdded" to viewModel.isHomeAddressAdded,
                        "isOfficeAddressAdded" to viewModel.isOfficeAddressAdded,
                        BundleConstants.BUNDLE_FROM_DELIVERY_DELAY to true,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to AddressEdited.DeliveryDetails.type
                    ),
                    activityLauncher = activityLauncher
                )
            }

            override fun dismissToolTip(toolTip: DefaultExpandedTooltip?) {
                handler.postDelayed({
                    toolTip?.dismiss()
                }, 2000)
            }

            override fun locationClicked(
                selectedLocation: String,
                selectedAddressId: Long,
                selectedAddressPinCode: String
            ) {
                binding.btnCheckout.isClickable = false
                viewModel.isLoadingView.postValue(true)
                viewModel.fetchPinCodeOnAddressSelection(
                    selectedAddressPinCode,
                    selectedAddressId
                )
            }

        }

        binding.txtDeliveryDetails.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
//                finish()
                if (redirectToCart) {
                    finish()
                } else if (isFromPrescription) {
                    redirectToPrescriPtionPage()
                } else {
                    redirectToOrderSummary()
                }
            }
        })

    }

    private fun goToAddPatientActivity(patient: GetAllPatientResponse.Patient) {
        viewModel.sendAddPatientClickedEvent("delivery_details")
        val patientJson = Gson().toJson(patient)
        navigateToAddPatientActivity(
            params = bundleOf(
                BundleConstants.PATIENT_EXPERIMENT to viewModel.patientExperiment.value,
                BundleConstants.BUNDLE_KEY_FRESH_USER to ((viewModel.patientsList.value?.size ?: 0) == 0),
                BundleConstants.BUNDLE_KEY_IS_EDIT_PATIENT to true,
                BundleConstants.BUNDLE_KEY_PATIENT_DETAILS to patientJson,
                BundleConstants.BUNDLE_FROM_DELIVERY_DELAY to true,
                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "delivery details"
            ),
            activityLauncher = activityLauncher
        )
    }


    // show dialog to update patient info delivery details
    private fun showDiscardOrderDialog() {
        val factory = LayoutInflater.from(this)
        val view: View = factory.inflate(R.layout.update_patient_info_delivery_details, null)
        val dialog = AlertDialog.Builder(this).create()
        dialog.setView(view)

        //AppCompatTextView tvMessage = view.findViewById(R.id.tvMessage);
        val tvYes = view.findViewById<AppCompatTextView>(R.id.tvYes)
        val tvNo = view.findViewById<AppCompatTextView>(R.id.tvNo)
        tvNo.setOnClickListener { dialog.dismiss() }
        tvYes.setOnClickListener { _: View? ->
            dialog.dismiss()
            callBackToReorderActivity(true)
            finishActivity(0)
        }
        dialog.setCancelable(false)
        dialog.show()
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val displayWidth = displayMetrics.widthPixels
        val layoutParams = WindowManager.LayoutParams()
        layoutParams.copyFrom(dialog.window!!.attributes)
        layoutParams.width = (displayWidth * 0.8f).toInt()
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window!!.attributes = layoutParams
    }

    private fun callBackToReorderActivity(discard: Boolean) {
        val intent: Intent = Intent()
            .putExtra("selectedPatientId", SharedPrefManager.getInstance().patientId)
            .putExtra("selectedPatientName", SharedPrefManager.getInstance().patientName)
            .putExtra("discardOrder", discard)
            .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, clickedOnPage)

        setResult(2, intent)
        finish()
    }

    fun setObservers() {
        viewModel.eventMessage.observe(this, EventObserver {

            if (it.equals(MESSAGES.ADD_PATIENT_CLICK)) {
                if (SharedPrefManager.getInstance().isReOrder) {
                    showDiscardOrderDialog()
                } else {

                    redirectToAddPatient()
                }

            } else if (it.equals(MESSAGES.SHOW_DISCARD_ORDER_ALERT)) {
                showDiscardOrderDialog()
            } else if (it.equals(MESSAGES.ADD_NEW_ADDRESS_CLICK)) {


                redirectToAddAddress()

            } else if (it.equals(MESSAGES.EDIT_ADDRESS_CLICK)) {


                redirectToEditAddress()

            } else if (it.equals(MESSAGES.EDIT_PATIENT_CLICK)) {


                redirectToEditPatient()

            } else if (it.equals(MESSAGES.ADD_PATIENT_FAILED)) {
                CommonFunc.showCustomToastMessage(this, "Patient update failed")

            } else if (it.equals(MESSAGES.ADD_ADDRESS_FAILED)) {
                CommonFunc.showCustomToastMessage(this, "Address update failed")

            } else if (it.equals(MESSAGES.ADD_ADDRESS_BAD_REQUEST)) {
                CommonFunc.showCustomToastMessage(
                    this,
                    "Sorry. We currently do not service this pincode. Please check again in few weeks"
                )

            } else if (it.equals(MESSAGES.PROCEED_TO_CHECKOUT_CLICK)) {

                redirectToOrderSummary()
            } else if (it.equals(MESSAGES.ADDRESS_PATIENT_NOT_SELECTED)) {
                CommonFunc.showCustomToastMessage(this, "Please select patient details")
            } else if (it.equals(MESSAGES.ADDRESS_NOT_SELECTED)) {
                CommonFunc.showCustomToastMessage(this, "Please select delivery details")
            } else if (it.equals(MESSAGES.PATIENT_NOT_SELECTED)) {
                CommonFunc.showCustomToastMessage(this, "Please select patient details")
            } else if (it.equals(MESSAGES.PATIENT_NOT_ADDED)) {
                CommonFunc.showCustomToastMessage(this, "Please add personal details")
            } else if (it.equals(MESSAGES.ADDRESS_NOT_ADDED)) {
                CommonFunc.showCustomToastMessage(this, "Please add address details")
            }
        })

        viewModel.isLoadingView.observe(this) {
            if (!it) {
                binding.btnCheckout.isClickable = true
            }

        }

        viewModel.showShimmerPatientLiveData.observe(this) {
            if (it) {
                binding.shimmerViewContainerPatient.startShimmerAnimation()
            } else {
                binding.shimmerViewContainerPatient.stopShimmerAnimation()
            }
        }
        viewModel.showShimmerAddressLiveData.observe(this) {
            if (it) {
                binding.shimmerViewContainerAddress.startShimmerAnimation()
            } else {
                binding.shimmerViewContainerAddress.stopShimmerAnimation()
            }
        }


        viewModel.eventProceedToCheckout.observe(this, EventObserver {
            if (it) {
                if (isFromPrescription) {
                    setResult(RequestCodeConstants.PRESCRIPTION_UPLOAD_OK)
                    finish()
                } else {
                    if (redirectToCart) {
                        finish()
                    } else {
                        redirectToOrderSummary()
                    }
                }

            }
        })

        viewModel.eventLaunchAddPatient.observe(this, EventObserver {
            viewModel.sendAddPatientClickedEvent("delivery_details")
            navigateToAddPatientActivity(
                params = bundleOf(
                    BundleConstants.PATIENT_EXPERIMENT to it,
                    BundleConstants.BUNDLE_KEY_FRESH_USER to ((viewModel.patientsList.value?.size ?: 0) == 0),
                    BundleConstants.BUNDLE_FROM_DELIVERY_DELAY to true,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "delivery details"
                ),
                activityLauncher = activityLauncher
            )
        })
    }

    private fun redirectToAddPatient() {
        viewModel.getPatientExperimentCategory()
    }

    private fun redirectToAddAddress() {

        viewModel.sendAddAddressClickedEvent(
            MxAddAddressClicked(
                "delivery_details",

                SharedPrefManager.getInstance().selectedWarehouseID
            )
        )

        navigateToAddAddressActivity(
            params = bundleOf(
                "isHomeAddressAdded" to viewModel.isHomeAddressAdded,
                "isOfficeAddressAdded" to viewModel.isOfficeAddressAdded,
                BundleConstants.BUNDLE_FROM_DELIVERY_DELAY to true,
                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to AddressEdited.DeliveryDetails.type
            ),
            activityLauncher = activityLauncher
        )
    }

    private fun redirectToEditAddress() {
        navigateToAddAddressActivity(
            params = bundleOf(
                "isEditClick" to true,
                "isHomeAddressAdded" to viewModel.isHomeAddressAdded,
                "isOfficeAddressAdded" to viewModel.isOfficeAddressAdded,
                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to AddressEdited.DeliveryDetails.type
            ),
            activityLauncher = activityLauncher
        )
    }

    private fun redirectToEditPatient() {
        viewModel.sendAddPatientClickedEvent("delivery_details")
        navigateToAddPatientActivity(
            params = bundleOf(
                BundleConstants.PATIENT_EXPERIMENT to viewModel.patientExperiment.value,
                BundleConstants.BUNDLE_KEY_FRESH_USER to ((viewModel.patientsList.value?.size ?: 0) == 0),
                BundleConstants.BUNDLE_FROM_DELIVERY_DELAY to true,
                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "delivery details"
            )
        )
    }

    private fun redirectToOrderSummary() {
        val i = Intent(this, OrderSummaryActivity::class.java)
        val bundle = Bundle()
        i.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, clickedOnPage)
        i.putExtras(bundle)
        i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
        setResult(Activity.RESULT_OK)
        finish()
    }

    private var activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        if (result?.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            if (data != null && data.hasExtra(BundleConstants.BUNDLE_KEY_NEWLY_ADDED_ADDRESS_ID)) {
                viewModel.newlyCreatedAddressId =
                    data.getLongExtra(BundleConstants.BUNDLE_KEY_NEWLY_ADDED_ADDRESS_ID, -1)
                viewModel.getAddressListData(SharedPrefManager.getInstance().loggedInUserId.toLong())
            } else if (data != null && data.hasExtra(BundleConstants.BUNDLE_KEY_NEWLY_ADDED_PATIENT_ID)) {
                viewModel.newlyCreatedPatientId =
                    data.getLongExtra(BundleConstants.BUNDLE_KEY_NEWLY_ADDED_PATIENT_ID, -1)
                checkForNetworkAndDoApiCallings(isCallAddress = false)
            } else {
                checkForNetworkAndDoApiCallings()
            }
        }
    }

    fun checkForNetworkAndDoApiCallings(type: Int = 0, isCallAddress: Boolean = true) {
        if (isNetworkAvailable(this)) {
            //type 1 is for again calling patient list api in case of onActivityResult received
            //if(type==1)
            viewModel.getPatientList(type, isCallAddress)
//            else
//                viewModel.getPatientList()
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

    private fun setupOnBackPressed() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (redirectToCart) {
                    finish()
                } else if (isFromPrescription) {
                    redirectToPrescriPtionPage()
                } else {
                    redirectToOrderSummary()
                }
            }
        })
    }

    fun redirectToPrescriPtionPage() {
        val i = Intent(this, PrescriptionActivity::class.java)
        val bundle = Bundle()
        i.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, clickedOnPage)
        i.putExtras(bundle)
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        setResult(RequestCodeConstants.PRESCRIPTION_UPLOAD_OK)
        finish()
    }
}