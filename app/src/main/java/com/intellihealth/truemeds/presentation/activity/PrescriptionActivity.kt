package com.intellihealth.truemeds.presentation.activity

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.Glide
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.data.utils.isSingleClick
import com.intellihealth.truemeds.databinding.ActivityPrescriptionBinding
import com.intellihealth.truemeds.domain.enums.AddressEdited
import com.intellihealth.truemeds.domain.navigation.navigateToAddAddressActivity
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToDeliveryDetailsActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked
import com.intellihealth.truemeds.presentation.bottomsheet.DeleteImageBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.cart.RxPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.RequestCodeConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.truecaller.android.sdk.oAuth.TcSdk
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@AndroidEntryPoint
class PrescriptionActivity : BaseActivityWithLogin() {

    private val binding by viewBinding(ActivityPrescriptionBinding::inflate)
    private lateinit var context: Context
    private var isRecallRxForOrder=false
    var bottomSheet:UploadPrescriptionBottomSheet? = null
    private lateinit var loginBottomSheet : LoginBottomSheet
    override fun sendLoginPageViewedEvent() {
        val mxLoginPageViewed = MxLoginPageViewed(
            "upload_prescription",
            "main",
            viewModel.isTruecaller
        )
        val afLoginPageViewed = AFLoginPageViewed(viewModel.isTruecaller)
        viewModel.loginPageViewedEvent(mxLoginPageViewed, afLoginPageViewed)
    }

    override fun setIsTruecaller(isTruecaller: Boolean) {
        viewModel.isTruecaller = isTruecaller
    }

    override fun getTrueCallerUserDetails() {
        viewModel.currentPageNameForSignup = "upload_prescription"
        viewModel.getTrueCallerUserDetails(
            textAuthorizationCode = "authorization_code",
            clientId = resources.getString(R.string.truecaller_client_id),
            authorizationCode,
            codeVerifier,
            context
        )
    }

    override fun openLoginBottomSheet() {
        loginBottomSheet = LoginBottomSheet("upload_prescription", pageSection)
        loginBottomSheet.isCancelable = false
        if (!loginBottomSheet.isVisible)
            loginBottomSheet.show(supportFragmentManager, "LocationBottomSheet")
    }

    override fun closeLoginBottomSheet() {
        if (this::loginBottomSheet.isInitialized && loginBottomSheet.isVisible) {
            loginBottomSheet.dismiss()
        }
    }

    lateinit var viewModel: PrescriptionViewModel
    private lateinit var dialog: Dialog
    var prescriptionImageId: Long = 0
    private var deleteImageBottomSheet = DeleteImageBottomSheet()
    private var mLastClickTime = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[PrescriptionViewModel::class.java]
        context = this
        viewModel.getCartCount()
        binding.prescriptionViewModel = viewModel
        binding.lifecycleOwner = this
        dialog = Dialog(this)

       // viewModel.clickedOnPage= intent.getStringExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)?:""
      //  viewModel.pageSection =intent.getStringExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION)?:""

        extractIntentData()
        viewModel.orderIdEvent = SharedPrefManager.getInstance().incompleteOrderId.toString()



        setApiCall()
        setObserver()
        setClickListener()
        updateStatusBarColor()
        loadImageInGlide()
    }

    override fun extractIntentData(){
        viewModel.clickedOnPage= intent.extras?.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)?:""
        viewModel.pageSection = intent.extras?.getString(BundleConstants.BUNDLE_KEY_PAGE_SECTION)?:""
    }

    private fun loadImageInGlide() {
        Glide.with(binding.prescriptionCardImg).asGif()
            .load(R.drawable.pharmacist_doctor_call)
            .into(binding.prescriptionCardImg)
    }

    private fun setApiCall() {
        viewModel.currentPageName="prescription_activity"

        //get prescription images
        viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)

     //   viewModel.setEventForPrescriptionUploadPageViewed()

/*        lifecycleScope.launch {
            viewModel.setEventForPrescriptionUploadPageViewed()
            viewModel.isFirstTimeScreenVisited=false
        }*/


        //get all patients data for past prescription patient list
       /* Log.d("TAG", "setApiCallbefore ${SharedPrefManager.getInstance().loggedInUserAccessToken}")
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
            Log.d("TAG", "setApiCall: ${SharedPrefManager.getInstance().loggedInUserAccessToken}")
            viewModel.getAllPatientDetails()
        }*/
    }



    private fun setObserver() {
        viewModel.eventLoginOpenBottomSheet.observe(this) {
            openLoginBottomSheet()
        }
        //event to initiate login
        viewModel.eventInitiateLogin.observe(
            this,
            EventObserver {
                initializationTrueCallerOAuth()
            })

        viewModel.eventMessageForPrescription.observe(
            this, EventObserver {
                if(it == null) return@EventObserver
                when {
                    it.equals(MESSAGES.UPLOAD_PRESCRIPTION_SUCCESSFULLY) -> {
                        Log.d("TAG", "setObserver: ACTION_UPLOAD_PRESCRIPTION")
                        com.intellihealth.salt.views.Toast().showCustomToastMessage(
                            this@PrescriptionActivity,
                            "Successfully uploaded"
                        )
                        callSaveAddressApi()
                        setResult(RESULT_OK)
                    }

                    it.equals(MESSAGES.PROCEED_TO_CHECKOUT_CLICK) -> {
                        Log.d(
                            "TAG",
                            "setObserver: medicinelist count = ${viewModel.cartCountValueFromDB.value?.toInt()}"
                        )
                        if (viewModel.existingCartItemCount > 0) {
                            navigateToCartActivity( flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
                        } else {
                            navigateToOrderSummaryActivity(
                                params = bundleOf(
                                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to AddressEdited.UploadPrescription.type,
                                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "main"
                                ),
                                flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                            )

                        }
                        viewModel.eventOrderPrescriptionUploaded()
                    }

                    it.equals(MESSAGES.PAST_PRESCRIPTION_IMAGE_UPLOAD_SUCCESSFULLY) -> {
                        bottomSheet?.bottomSheet?.dismiss()
                        viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
                        com.intellihealth.salt.views.Toast().showCustomToastMessage(
                            this@PrescriptionActivity,
                            "Successfully uploaded"
                        )
                        callSaveAddressApi()
                    }

                    it.equals(MESSAGES.DELETE_PRESCRIPTION_CLICK) -> {
                        viewModel.apiType = 2
                        if (isNetworkAvailable(this)) {
                            viewModel.deletePrescription(
                                SharedPrefManager.getInstance().incompleteOrderId,
                                false,
                                listOf(prescriptionImageId),
                                SharedPrefManager.getInstance().loggedInUserId.toString()
                            )
                        } else viewModel.showMessageForPrescription.postValue(Event(MESSAGES.NO_NETWORK))
                    }

                    it.equals(MESSAGES.DELETE_PRESCRIPTION_SUCCESSFULLY) -> {
                        viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
                        setResult(RESULT_OK)
                        viewModel.evenSendPrescriptionRemovedEvent("Prescription Upload")
                    }

                    it.equals(MESSAGES.NO_NETWORK) -> {
                        showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {

                                when (viewModel.apiType) {
                                    1 -> { //apiType=1 is for get Rx api data
                                        viewModel.getRxPrescriptionImagesApiCalling()
                                    }

                                    2 -> { //apiType=2 is for delete Rx api data
                                        viewModel.getDeletePrescriptionApiCalling(
                                            prescriptionImageId
                                        )
                                    }

                                    3 -> { //apiType=3 is for get past prescriptionHeaderPatientData
                                        viewModel.getAllPatientDetails()
                                    }

                                    4 -> { //apiType=4 is for upload image from camera
                                        startCamera { byteArray ->
                                            viewModel.uploadImage(byteArray, 0, -1, true)
                                        }
                                    }

                                    5 -> { //apiType=5 is for upload image from gallery
                                        pickImageFromGallery {
                                            viewModel.uploadImage(it, 0, -1, false)
                                        }
                                    }
                                    /*   7 -> { //apiType=7 is for get medicine list
                                          viewModel.setUpUi(false)
                                       }*/
                                }
                                Log.d("TAG", "onActionButtonClicked: ${viewModel.apiType}")
                            }

                            override fun onCloseButtonClicked() {
                            }
                        }, true)
                    }
                }
            })

        //this is setting observer for PastPrescriptionDetailsAdapter image item click to open full view
      //  PrescriptionViewModel.pastRXClicked.observe(
        viewModel.eventPastRXClicked.observe(
            this, EventObserver {
                Log.e("parent_pos",":::222222")

                //below is totally new logic written to handle the image view click
                val arrOfStr = it.first.toString().split("_")
                var parentId=arrOfStr[0]
                var childId=arrOfStr[1]

                Log.e("parent_pos",parentId+":::"+childId)

                var isCurrentItemFound=false
                var currentSelectedPos=0


                var prescriptionList: ArrayList<OrderRxInfo> = arrayListOf()
                for(i in 0..viewModel.pastPrescription.value?.size!!-1)
                {
                    viewModel.pastPrescription.value?.get(i).let {
                        for(j in 0..it?.activeRxList?.size!!-1)
                        {
                            it?.activeRxList?.get(j)?.let {
                               if(parentId.toInt()==i && childId.toInt()==j){
                                   isCurrentItemFound=true
                               }
                                else if(!isCurrentItemFound){
                                    currentSelectedPos=currentSelectedPos+1
                                }
                            prescriptionList.add(OrderRxInfo(0, it.imageUrl, it.imageId))
                            }
                        }
                    }
                }

                val bottomSheet = RxPrescriptionBottomSheet(
                   // childId.toInt(),
                    currentSelectedPos,
                   // prescriptionList =  viewModel.pastPrescription.value?.get(parentId.toInt())?.activeRxList!!.map { OrderRxInfo(0, it.imageUrl, it.imageId) }
                    prescriptionList =  prescriptionList.toList()
                )

                bottomSheet.isCancelable = true
                if (!bottomSheet.isVisible) bottomSheet.show(
                    supportFragmentManager,
                    "ViewPrescriptionBottomSheet"
                )


               /* viewModel.pastPrescription.value?.map { orderRxList ->


                    val arrOfStr = it.first.toString().split("_")
                    var parentId=arrOfStr[0]
                    var childId=arrOfStr[1]

                    Log.e("parent_pos",parentId+":::"+childId)

                    val bottomSheet = RxPrescriptionBottomSheet(
                        childId.toInt(),
                        prescriptionList =  orderRxList.activeRxList.map { OrderRxInfo(0, it.imageUrl, it.imageId) }
                    )

                    bottomSheet.isCancelable = true
                    if (!bottomSheet.isVisible) bottomSheet.show(
                        supportFragmentManager,
                        "ViewPrescriptionBottomSheet"
                    )
                }*/
            }
        )

        viewModel.proceedButtonTxt.observe(this, Observer {
            binding.btnCheckout.setTitle(it)
        })
    }

    private fun setClickListener() {
        binding.btnCheckout.setOnClickListener {
            addAddressFlow()
        }

        binding.btnUpload.setOnClickListener {
            if (SharedPrefManager.getInstance().loggedInUserAccessToken.isEmpty()) {
                pageSection = ""
                initializationTrueCallerOAuth()
            } else {
                openPrescriptionBottomSheet()
            }
        }
        //binding.customCheckBox.setEnable(false)
        //binding.customCheckBox.setState(CheckFieldConstants.STATE_SELECTED)

        binding.mobileSectionHeadersDefaultWithoutFill.setBackArrowClickCallback(object :
            BackArrowClickCallback {
            override fun onBackArrowClick() {
                finish()
//                Toast().showCustomToastMessage(context, "Back arrow click")
            }
        })
        viewModel.isLoading.observe(this) {
            if (it) enableLoadingView(dialog)
            else disableLoadingView(dialog)
        }

        val callback = object : ViewPrescriptionCallback {
            override fun onDeleteImage(imageId: Long) {
                prescriptionImageId = imageId
                showConfirmationBottomSheet()
            }

            override fun onViewPrescriptionClicked(position: Int, imageURL: String) {
                viewModel.prescriptions.value?.let {
                    if (it.size > 1) {
                        val bottomSheet = RxPrescriptionBottomSheet(
                            position - 1,
                            prescriptionList = viewModel.prescriptions.value!!
                        )
                        bottomSheet.isCancelable = true
                        if (!bottomSheet.isVisible) bottomSheet.show(
                            supportFragmentManager,
                            "ViewPrescriptionBottomSheet"
                        )
                    }
                }
            }

            override fun onAddMoreClicked() {
                openPrescriptionBottomSheet()
            }

        }

        binding.callback = callback

    }

    private fun openPrescriptionBottomSheet() {
        if (isNetworkAvailable(context)) {
            //this code is added to unselect all previous selected itemss
            viewModel.pastPrescription.value?.forEach { it ->
                it.activeRxList.forEach { activeRx ->

                    activeRx.selected = false

                }
            }

            viewModel.currentSelectedPrescriptionList.clear()


            viewModel.showDoNotHavePrescription.postValue(false)
            viewModel.showMedicineList.postValue(false)
            bottomSheet =
                UploadPrescriptionBottomSheet(
                    { onCameraClick() },
                    { onGalleryClick() },
                    viewModel,
                    "upload"
                )
            bottomSheet!!.isCancelable = true
            val lastRecordedData = isSingleClick(mLastClickTime)
            mLastClickTime = lastRecordedData.second
            if (!bottomSheet!!.isVisible && lastRecordedData.first)
                bottomSheet!!.show(
                    supportFragmentManager, "UploadPrescriptionBottomSheet"
                )
        }
        else {
            showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                   // checkForNetworkAndDoApiCallings(type)
                }

                override fun onCloseButtonClicked() {
                }
            }, true)
        }
    }

    private fun onCameraClick() {
        viewModel.setEventForUploadPrescriptionClicked("camera","upload")
        verifyPermissionsAndProceed(arrayOf(android.Manifest.permission.CAMERA)) { isGranted ->
            if (isGranted) {
                startCamera {
                    viewModel.uploadImage(it, 0, -1, true)
                }
            }
        }

    }

    private fun onGalleryClick() {
        viewModel.setEventForUploadPrescriptionClicked("gallery","upload")
        pickImageFromGallery {
            viewModel.uploadImage(it, 0, -1, false)
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.getAddressInfo()
        viewModel.getCartCount()

        if(isRecallRxForOrder) {
            isRecallRxForOrder=false
            viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
        }

        if(!viewModel.isFirstTimeScreenVisited && resumeCount>1)
        {
            Log.e("upload_clicked","33333::::yessss")
            viewModel.callEventForPrescriptionUploadPageViewed()
        }
       /* else{
            viewModel.isFirstTimeScreenVisited=false
        }*/
    }

    private fun showConfirmationBottomSheet() {
        deleteImageBottomSheet.isCancelable = true
        if (!deleteImageBottomSheet.isVisible)
            deleteImageBottomSheet.setViewModel(viewModel)
        supportFragmentManager.let {
            deleteImageBottomSheet.show(
                it, "Delete_Prescription"
            )
        }
    }

    private fun addAddressFlow() {

        if (viewModel.proceedButtonTxt.value.toString() == "Add Address") {
            viewModel.sendAddAddressClickedEventt(
                MxAddAddressClicked(
                    "upload prescription",
                    SharedPrefManager.getInstance().selectedWarehouseID
                )
            )
            navigateToAddAddressActivity(
                params = bundleOf(
                    "addPatient" to true,
                    "addPatientFrom" to "upload prescription",
                    "isFromCart" to true,
                    BundleConstants.IS_FROM_PRESCRIPTION to true,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to AddressEdited.UploadPrescription.type,
                ),
                activityLauncher = activityLauncher
            )
        } else if (viewModel.proceedButtonTxt.value.toString() == "Proceed to Checkout") {
            isRecallRxForOrder=true
            viewModel.proceedToCheckoutClick()
        } else if (viewModel.proceedButtonTxt.value.toString() == "Add Delivery Details") {
            navigateToDeliveryDetailsActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "upload prescription",
                    BundleConstants.BUNDLE_KEY_ADDRESS_COUNT to  viewModel.addressCountRx,
                    BundleConstants.BUNDLE_KEY_PATIENT_COUNT to  viewModel.patientsCountRx,
                    BundleConstants.IS_FROM_PRESCRIPTION to  true
                ),
                activityLauncher = activityLauncher
            )
        }
    }

    private var activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        if (result?.resultCode == RequestCodeConstants.PRESCRIPTION_UPLOAD_OK) {
            viewModel.getAddressInfo()
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            TcSdk.SHARE_PROFILE_REQUEST_CODE -> {
                TcSdk.getInstance().onActivityResultObtained(this, requestCode, resultCode, data)
            }
        }
    }

    private fun callSaveAddressApi(){
        viewModel.viewModelScope.launch(Dispatchers.IO) {
            if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                if (SharedPrefManager.getInstance().addressId > 0)
                    viewModel.saveAddressId(
                        SharedPrefManager.getInstance().loggedInUserId,
                        SharedPrefManager.getInstance().incompleteOrderId,
                        SharedPrefManager.getInstance().addressId
                    )
                if (SharedPrefManager.getInstance().patientId > 0)
                    viewModel.savePatientId(
                        SharedPrefManager.getInstance().loggedInUserId,
                        SharedPrefManager.getInstance().incompleteOrderId,
                        SharedPrefManager.getInstance().patientId
                    )
            }
        }
    }

}