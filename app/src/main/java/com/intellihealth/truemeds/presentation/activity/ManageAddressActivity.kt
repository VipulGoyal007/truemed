package com.intellihealth.truemeds.presentation.activity

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.ButtonClickCallback
import com.intellihealth.salt.constants.MobileSectionTypeConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.ActivityManageAddressBinding
import com.intellihealth.truemeds.domain.enums.AddressEdited
import com.intellihealth.truemeds.domain.navigation.navigateToAddAddressActivity
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked
import com.intellihealth.truemeds.presentation.bottomsheet.EditDeleteAddressBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ManageAddressActivity : BaseActivity() {
    private val binding by viewBinding(ActivityManageAddressBinding::inflate)
    private lateinit var manageAddressViewModel: ManageAddressViewModel
    private lateinit var context: Context
    private var comingFromAccountFragment:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        try {
            manageAddressViewModel = ViewModelProvider(this)[ManageAddressViewModel::class.java]
        } catch (e:Exception){
            Log.d("Error Message", "error onCreate: "+e.message)
        }
        updateStatusBarColor()
        context = this
        checkForNetworkAndDoApiCallings()

        binding.manageAddressViewModel = manageAddressViewModel
        binding.lifecycleOwner = this
        //Set view model as lifecycle observer of the activity
        lifecycle.addObserver(manageAddressViewModel)
       // manageAddressViewModel.getManageAddressData(19)
        setHeaderData(MobileSectionTypeConstants.DEFAULT_WITHOUT_FILL)
        extractIntentData()
        setEventListener()
        setObserver()
    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            if(bundle.containsKey(BundleConstants.IS_FROM_ACCOUNT_FRAGMENT)){
                comingFromAccountFragment = bundle.getBoolean(BundleConstants.IS_FROM_ACCOUNT_FRAGMENT, false)
            }
        }
    }

    fun checkForNetworkAndDoApiCallings(type:Int=0){
        if (isNetworkAvailable(context)) {

            //type 1 is for delete address api calling
             if(type==1)
                 manageAddressViewModel.deleteAddress(manageAddressViewModel.addressItemList.value?.addressId.toString(),SharedPrefManager.getInstance().loggedInUserId.toLong())
            else
                manageAddressViewModel.getManageAddressData(SharedPrefManager.getInstance().loggedInUserId.toLong())
        }
        else {
            showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                    checkForNetworkAndDoApiCallings(type)
                }

                override fun onCloseButtonClicked() {
                }
            }, true)
        }
    }

    private fun setObserver() {
        manageAddressViewModel.showShimmerLiveData.observe(this) {
            if (it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }

    }

    private fun setEventListener() {
        //set header data
        manageAddressViewModel.getManageAddressData.observe(this@ManageAddressActivity, Observer {
            setHeaderData(if(it.isNullOrEmpty()) MobileSectionTypeConstants.DEFAULT_WITHOUT_FILL else MobileSectionTypeConstants.TEXT_WITH_CTA)
        })

        //Back arrow clicked
        binding.mobileSectionHeadersTextWithIcons.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                overridePendingTransition(0, R.anim.slide_out)
                finish()
            }
        })

        //add address click
        binding.mobileSectionHeadersTextWithIcons.setButtonClickCallback(object : ButtonClickCallback{
            override fun buttonClick() {
                manageAddressViewModel.sendAddAddressClickedEvent(MxAddAddressClicked("manage_address", SharedPrefManager.getInstance().selectedWarehouseID))
                navigateToAddAddressActivity(
                    params = bundleOf(
                        BundleConstants.IS_FROM_ACCOUNT_FRAGMENT to comingFromAccountFragment,
                        "isHomeAddressAdded" to manageAddressViewModel.isHomeAddressAdded,
                        "isOfficeAddressAdded" to manageAddressViewModel.isOfficeAddressAdded,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to AddressEdited.ManageAddress.type
                    ),
                    activityLauncher = activityLauncher
                )
            }

            override fun buttonClickWithParams(buttonType: String) {

            }
        })

        //redirect to add address clicked
        binding.addAddressBtn.setOnClickListener {
            manageAddressViewModel.sendAddAddressClickedEvent(
                MxAddAddressClicked(
                    "manage_address",
                    SharedPrefManager.getInstance().selectedWarehouseID
                )
            )
            navigateToAddAddressActivity(
                params = bundleOf(
                    BundleConstants.IS_FROM_ACCOUNT_FRAGMENT to comingFromAccountFragment,
                    "isHomeAddressAdded" to manageAddressViewModel.isHomeAddressAdded,
                    "isOfficeAddressAdded" to manageAddressViewModel.isOfficeAddressAdded,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to AddressEdited.ManageAddress.type
                ),
                activityLauncher = activityLauncher
            )
        }

        manageAddressViewModel.eventMessage.observe(this,
            com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver {
                when {
                    it.messageEnum == MESSAGES.ADD_ADDRESS_CLICK -> {

                    }
                    it.messageEnum == MESSAGES.ADD_ADDRESS_CITY_STATE_FROM_LOCATION -> {
                        manageAddressViewModel.addressItemList.observe(this, Observer {
                            Log.d("TAG", "setEventListenerSCManage: "+Gson().toJson(it))
                            var addAddressACtivity = AddAddressActivity()
                            addAddressACtivity.setManageAddressViewModel(manageAddressViewModel)

                            //binding.model = it
                        })
                    }
                    it.messageEnum == MESSAGES.DELETE_ADDRESS_CLICK -> {
                        val editDeleteAddressBottomSheet = EditDeleteAddressBottomSheet()
                        editDeleteAddressBottomSheet.isCancelable = true
                        editDeleteAddressBottomSheet.setManageAddressViewModel(manageAddressViewModel, false, true)
                        editDeleteAddressBottomSheet.show(
                            supportFragmentManager, "Discard unsaved details?"
                        )

                    }
                    it.messageEnum == MESSAGES.EDIT_ADDRESS_CLICK -> {

                        navigateToAddAddressActivity(
                            params = bundleOf(
                                "editList" to Gson().toJson(manageAddressViewModel.addressItemList.value).toString(),
                                BundleConstants.IS_FROM_ACCOUNT_FRAGMENT to comingFromAccountFragment,
                                "isEditClick" to true,
                                "isHomeAddressAdded" to manageAddressViewModel.isHomeAddressAdded,
                                "isOfficeAddressAdded" to manageAddressViewModel.isOfficeAddressAdded,
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to AddressEdited.ManageAddress.type
                            ),
                            activityLauncher = activityLauncher
                        )
                    }
                    it.messageEnum == MESSAGES.ADDRESS_DELETED_UNSUCCESSFULLY -> {
                        if(it.displayMessage.isNotEmpty()){
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        }else {
                            Toast().showCustomToastMessage(this, "Delete address failed")
                        }
                    }
                    it.messageEnum == MESSAGES.EDIT_ADDRESS_FAILED -> {
                        if(it.displayMessage.isNotEmpty()){
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        }else {
                            Toast().showCustomToastMessage(this, "Edit address failed")
                        }
                    }
                    it.messageEnum == MESSAGES.ADD_ADDRESS_SUCCESSFULLY -> {
                        if(it.displayMessage.isNotEmpty()){
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        }else {
                            Toast().showCustomToastMessage(this, "Add address successfully")
                        }
                        setResult(RESULT_OK)
                        finish()

                    }
                    it.messageEnum == MESSAGES.DELETE_ADDRESS_API_CALLING -> {
                        checkForNetworkAndDoApiCallings(1)

                    }
                    it.messageEnum == MESSAGES.ADD_ADDRESS_FAILED -> {
                        if(it.displayMessage.isNotEmpty()){
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        }else {
                            Toast().showCustomToastMessage(this, "Add address failed")
                        }
                    }
                    it.messageEnum == MESSAGES.ADD_ADDRESS_BAD_REQUEST -> {
                        if(it.displayMessage.isNotEmpty()){
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        }else {
                            Toast().showCustomToastMessage(this, "Sorry. We currently do not service this pincode. Please check again in few weeks")
                        }
                    }
                    it.messageEnum == MESSAGES.ADDRESS_REMOVED_SUCCESSFULLY -> {
                        if(it.displayMessage.isNotEmpty()){
                            Toast().showCustomToastMessage(this, it.displayMessage)

                        }else {
                            Toast().showCustomToastMessage(this, "Address removed successfully")
                        }
                        checkForNetworkAndDoApiCallings()
                      //  manageAddressViewModel.getManageAddressData(   SharedPrefManager.getInstance().loggedInUserId.toLong())
                    }
                    it.messageEnum == MESSAGES.DISCARD_EDIT_ADDRESS_CHANGES -> {
                        //Toast().showCustomToastMessage(this, "Edit Address changes not reflected!")
//                        finish()
//                        manageAddressViewModel.getManageAddressData(1650)
                    }
                }

            })

        val loader = Dialog(context)
        manageAddressViewModel.isLoading.observe(this) {
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }
    }

    private fun setHeaderData(type: MobileSectionTypeConstants) {
        binding.mobileSectionHeadersTextWithIcons.also {
            it.setUpMobileSectionHeadersData(MobileSectionHeadersModel("Manage Addresses","Sub-Header","20% off","Add Address",20,
                buttonIconRight=ContextCompat.getDrawable(this,com.intellihealth.salt.R.drawable.plus)))
            it.setMobileSectionHeadersViewType(type)
        }
    }

    private var activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        if(result?.resultCode == Activity.RESULT_OK){
            checkForNetworkAndDoApiCallings()
           // manageAddressViewModel.getManageAddressData(   SharedPrefManager.getInstance().loggedInUserId.toLong())
        }
    }

//    override fun onBackPressed() {
//        finish()
//        overridePendingTransition(0, R.anim.slide_out)
//        super.onBackPressed()
//
//    }

}