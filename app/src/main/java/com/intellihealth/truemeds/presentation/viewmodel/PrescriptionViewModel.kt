package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Base64
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.DropDownDefaultModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxPrescriptionUploadPageViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxUploadPrescriptionClicked
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.model.orderflow.SaveRxImageForCustomerIdResponse
import com.intellihealth.truemeds.data.model.prescription.ActiveRx
import com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest
import com.intellihealth.truemeds.data.model.prescription.PastPrescriptions
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.domain.usecase.CartUseCase
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked
import com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
open class PrescriptionViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    loginUseCase: LoginUseCase,
    private val userUseCase: UserDataUseCase,
) : BaseViewModelWithLogin(loginUseCase), DefaultLifecycleObserver {
    var existingCartItemCount = 0

    @Inject
    lateinit var firebaseEvent: FirebaseEventUseCase

    var patientDetails: List<DropDownDefaultModel>? = null
    var showPastPrescriptionView = MutableLiveData<Boolean>(false)

    var pastPrescription: MutableLiveData<List<PastPrescriptions>> = MutableLiveData(listOf())
    var medicineOgList: MutableLiveData<List<String>> = MutableLiveData(emptyList())
    var _medicineList: MutableLiveData<List<String>> = MutableLiveData()
    var patientList: MutableLiveData<GetAllPrescriptionDataModel?> = MutableLiveData()
    var isExpandable: MutableLiveData<Boolean> = MutableLiveData(false)
    val prescriptionList = MutableLiveData<List<String>>(emptyList())
    val prescriptions = MutableLiveData<List<OrderRxInfo>?>(emptyList())
    val pastRXClicked = MutableLiveData<Event<Pair<String?, String?>>>()
    val eventPastRXClicked: LiveData<Event<Pair<String?, String?>>> get() = pastRXClicked

    //val currentSelectedPrescriptionList: HashSet<ActiveRx>= emptyList()
    val currentSelectedPrescriptionList: HashMap<Long, ActiveRx> = HashMap()

    var list = arrayListOf<String>()

    //val isLoading = MutableLiveData(false)
    val isLoadingForPatient = MutableLiveData(false)
    val isLoadingForPrescriptions = MutableLiveData(false)
    val showMessageForPrescription = MutableLiveData<Event<MESSAGES>>()
    val eventMessageForPrescription: LiveData<Event<MESSAGES>> get() = showMessageForPrescription
    var cartCountValueFromDB = MutableLiveData(0)
    var apiType = 0

    private val openLoginBottomSheet = MutableLiveData<Event<Any>>()
    val eventLoginOpenBottomSheet: LiveData<Event<Any>> get() = openLoginBottomSheet
    var isPastPrescriptionSelected = MutableLiveData(false)
    var showDoNotHavePrescription: MutableLiveData<Boolean> = MutableLiveData(true)
    var showMedicineList: MutableLiveData<Boolean> = MutableLiveData(true)
    /*private val initiateLogin = MutableLiveData<Event<Any>>()
    val eventInitiateLogin: LiveData<Event<Any>> get() = initiateLogin*/

    var headerType: MutableLiveData<MobileSectionHeadersModel> = MutableLiveData(
        MobileSectionHeadersModel(
            "Upload Prescription", "", "",
            "", 0, null
        )
    )

    var addressCountRx = 0
    var patientsCountRx = 0
    var addressIdRx = 0L
    var patientIdRx = 0L
    var clickedOnPage = ""
    var orderPageSection = ""
    var orderPreviousStage:String? = null

    var pageSection = ""
    var orderIdEvent = ""
    var prescriptionUploadedCount = 0

    var proceedButtonTxt = MutableLiveData("Proceed to checkout")
var isFirstTimeScreenVisited=true
    var uploadedPastRx = mutableListOf<Long>()
    var mxInternalErrorOccurred=MxInternalErrorOccurred()
    var currentPageName:String=""

    @Inject
    protected lateinit var cartUseCase: CartUseCase


    /*fun getTrueCallerUserDetails(
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        context: Context
    ) = viewModelScope.launch(Dispatchers.IO) {
        try {
            //showSearching.postValue(true)
            val loginStatus = loginUseCase.getTrueCallerUserDetails(
                textAuthorizationCode,
                clientId,
                authorizationCode,
                codeVerifier,
                SharedPrefManager.getInstance().fcm,
                SharedPrefManager.getInstance().googleAdId,
                context
            )
            when (loginStatus) {
                LoginStatus.SUCCESS -> {
                    //for homepage bottom nav, to update data
                    SharedPrefManager.getInstance().isLoggedInFromBottomSheet = true
                    //hide loader
                    //showSearching.postValue(false)
                }

                LoginStatus.INVALID_OTP -> {
                    //showSearching.postValue(false)
                }


                LoginStatus.INVALID_ACCESS_TOKEN -> {
                    //showSearching.postValue(false)
                }

                LoginStatus.EXCEPTION_OCCURRED -> {
                    //showSearching.postValue(false)
                }

                LoginStatus.NULL -> {
                    //showSearching.postValue(false)
                    openLoginBottomSheet.postValue(Event(Any()))
                }
            }
        } catch (e: Exception) {
            openLoginBottomSheet.postValue(Event(Any()))
        }
    }*/

    fun getAllPatientDetails() {
        viewModelScope.launch {
//            isLoadingForPatient.postValue(true)
            _isLoading.postValue(true)
            val list = orderFlowUseCase.getPrescriptionsDetails(
                mxInternalErrorOccurred,SharedPrefManager.getInstance().loggedInUserId.toLong(),
                null
            )
            patientList.postValue(list)
            val dropDownDefaultModelList = list?.responseData?.patientList?.map {

                val patientName = "${it.patientName} (${it.rxCount})"
                DropDownDefaultModel(it.patientId.toInt(), patientName, false)
            }
            Log.e("set_visibility::", "::::yes")
            patientDetails = dropDownDefaultModelList

            if (!dropDownDefaultModelList.isNullOrEmpty() && dropDownDefaultModelList.size > 0)
                showPastPrescriptionView.postValue(true)

//                isLoadingForPatient.postValue(false)
            _isLoading.postValue(false)
            getAddressInfo("PRESCRIPTION")
        }

    }

    fun getAllPrescriptionDetails(patientId: Int) {
        apiType = 6
        if (isNetworkAvailable(context)) {
            viewModelScope.launch {
                isLoadingForPrescriptions.postValue(true)
                val list = orderFlowUseCase.getPrescriptionsDetails(
                    mxInternalErrorOccurred,SharedPrefManager.getInstance().loggedInUserId.toLong(),
                    patientId.toString()
                )
                if (list?.responseData?.customerRx != null && list.responseData.customerRx.isNotEmpty()) {
                    isLoadingForPrescriptions.postValue(false)
//                orderFlowUseCase.getPastPrescriptions()
                    var pastPrescriptionCustomerRxList =
                        list.responseData.customerRx.mapIndexed { index, customerRx ->
                            PastPrescriptions(index, customerRx.dateGroup,
                                customerRx.prescriptionList.map {
                                    ActiveRx(
                                        it.uniqueId,
                                        it.imageId.toLong(),
                                        it.imagePath,
                                        false
                                    )
                                })
                        }
                    Log.e(
                        "past_prescription::",
                        "111111:::" + pastPrescriptionCustomerRxList.toString()
                    )
                    pastPrescription.postValue(pastPrescriptionCustomerRxList)
                } else {
                    isLoadingForPrescriptions.postValue(false)
                    pastPrescription.postValue(emptyList())
                }
            }
        } else showMessageForPrescription.postValue(Event(MESSAGES.NO_NETWORK))
    }

    fun onPastImageClicked(tempId: String, imageUrl: String) {
        pastRXClicked.postValue(Event(Pair(tempId, imageUrl)))

        Log.e("parent_pos", "111:::" + tempId + ":::" + imageUrl)
        // tempIdImageClicked=tempId
        //  imageUrlImageClicked=imageUrl
        // showImageEventListener.postValue(Event(true))
    }


    fun onPastCheckboxClicked(item: ActiveRx, parentIndex: Int, childIndex: Int) {

        val list = pastPrescription.value
        val prescriptionList = list!![parentIndex]
        //item.selected =

        // prescriptionList.activeRxList[childIndex].selected  = !item.selected
        //above logic was changed bcoz the logic was reverse

        prescriptionList.activeRxList[childIndex].selected = item.selected
        //  pastPrescription.value = list!!


//setting new logic with hashmap list
        if (item.selected) {

            currentSelectedPrescriptionList.put(item.uniqueId, item)
            Log.e(
                "isPastPrescription",
                "00000::Clicked111::" + currentSelectedPrescriptionList.toString()
            )
        } else if (!item.selected) {

            currentSelectedPrescriptionList.remove(item.uniqueId)
            Log.e(
                "isPastPrescription",
                "00000::Clicked222::" + currentSelectedPrescriptionList.toString()
            )
        }


//commented below logic for now
        /*val selectedIdsList = list.map { it ->
            it.activeRxList.filter { it.selected }
        }
        for (selectedItem in selectedIdsList) {
            if (selectedItem.isNotEmpty()) {
                Log.e("isPastPrescription","1111::True")
                isPastPrescriptionSelected.postValue(true)
                break
            } else {
                Log.e("isPastPrescription","2222::False")
                isPastPrescriptionSelected.postValue(false)
                continue
            }
        }*/

        //new logic written on basis of hashmap list
        if (!currentSelectedPrescriptionList.isNullOrEmpty() && currentSelectedPrescriptionList.size > 0)
            isPastPrescriptionSelected.postValue(true)
        else
            isPastPrescriptionSelected.postValue(false)
    }

    fun getViewMoreLessList() {
        isExpandable.value?.let { setUpUi(it) }
    }


    fun setUpUi(isExpand: Boolean) {
        apiType = 7
        if (medicineOgList.value != null) {
            Log.d("TAG", "setUpUi: ${medicineOgList.value}")
            if (isExpand) {
                isExpandable.postValue(true)
                _medicineList.postValue(medicineOgList.value)
            } else if (medicineOgList.value!!.size > 2) {
                _medicineList.postValue(medicineOgList.value!!.subList(0, 2))
                isExpandable.postValue(false)
            } else {
                _medicineList.postValue(medicineOgList.value)
                isExpandable.postValue(false)
            }
        }
    }

    fun uploadImage(
        byteArray: ByteArray,
        uploadedPrescriptionId: Int,
        prevOrderId: Long,
        isFromCamera: Boolean
    ) {
        if (isFromCamera) apiType = 4 else apiType = 5
        if (isNetworkAvailable(context)) {
            _isLoading.postValue(true)
            viewModelScope.launch(Dispatchers.IO) {
                val request = ImageUploadRequest(fileName = "IMG${System.currentTimeMillis()}")
                if (uploadedPrescriptionId != -1) {
                    if (uploadedPrescriptionId == 0) {
                        val imgString =
                            "data:image/jpeg;base64," + Base64.encodeToString(
                                byteArray,
                                Base64.NO_WRAP
                            )
                        request.image = imgString
                    } else {
                        request.imageId = uploadedPrescriptionId.toString()

                        if (prevOrderId != -1L) {
                            request.prevOrderId = prevOrderId.toString()
                        }
                    }
                    request.orderId =
                        if (SharedPrefManager.getInstance().incompleteOrderId > 0) SharedPrefManager.getInstance().incompleteOrderId.toString() else null
                }
                val response = async {
                    orderFlowUseCase.uploadImage(
                        mxInternalErrorOccurred,SharedPrefManager.getInstance().pincode.toString(),
                        SharedPrefManager.getInstance().loggedInUserId,
                        request,
                        if (SharedPrefManager.getInstance().algoSpecificVariantId > 0) SharedPrefManager.getInstance().algoSpecificVariantId else null
                    )
                }.await()
                _isLoading.postValue(false)
                response?.responseData?.imageUrl?.let {
                    SharedPrefManager.getInstance().incompleteOrderId =
                        response.responseData.orderId.toLong()
                    getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
                    list.add(it)
                    prescriptionList.postValue(list)
                    showMessageForPrescription.postValue(Event(MESSAGES.UPLOAD_PRESCRIPTION_SUCCESSFULLY))
                }
            }
        } else {
            showMessageForPrescription.postValue(Event(MESSAGES.NO_NETWORK))
        }
    }

    fun setEventForPrescriptionUploadPageViewed(){
        if(isFirstTimeScreenVisited){
           // isFirstTimeScreenVisited=false
            callEventForPrescriptionUploadPageViewed()
        }

    }

    fun callEventForPrescriptionUploadPageViewed(){
            var mixPanelData=MxPrescriptionUploadPageViewed(
                clickedOnPage=clickedOnPage,
                orderId=orderIdEvent,
                pageSection=pageSection,
                prescriptionUploadedCount=prescriptionUploadedCount)
            sdkEventUseCase.sendPrescriptionUploadPageViewedEvent(mixPanelData)

        if(currentPageName.equals("prescription_activity")){
            currentPageName=""
            isFirstTimeScreenVisited=false
        }
    }

    fun setEventForUploadPrescriptionClicked(uploadMethod: String, pageName: String){
        var whId= SharedPrefManager.getInstance().selectedWarehouseID
        var mixPanelData= MxUploadPrescriptionClicked(uploadMethod,whId)
        sdkEventUseCase.sendUploadPrescriptionClickEvent(mixPanelData,pageName)
    }

    fun sendAddAddressClickedEventt(mxAddAddressClicked: MxAddAddressClicked) {
        sdkEventUseCase.sendAddAddressClickedEvent(mxAddAddressClicked)
    }


    fun getPrescriptionImages(orderId: Long) = viewModelScope.launch {
        if (orderId > 0) {
            _isLoading.postValue(true)
            val response = async { orderFlowUseCase.getOrderRx(mxInternalErrorOccurred,orderId) }.await()
            if (response != null) {

                //for medicine list
                if (!response.responseData.rxReqProductList.isNullOrEmpty()) {
                    medicineOgList.postValue(response.responseData.rxReqProductList)
                    if (response.responseData.rxReqProductList.size > 2) {
                        _medicineList.postValue(response.responseData.rxReqProductList.subList(0, 2))
                        isExpandable.postValue(false)
                    } else {
                        _medicineList.postValue(response.responseData.rxReqProductList)
                        isExpandable.postValue(false)
                    }

                } else {
                    medicineOgList.postValue(listOf())
                    _medicineList.postValue(listOf())
                }

                Log.e("event_fired::","yessss")
                prescriptionUploadedCount=response.responseData?.rxList?.size?:0

                if(currentPageName.equals("prescription_activity"))
                    setEventForPrescriptionUploadPageViewed()

            }
            _isLoading.postValue(false)

//        response?.responseData?.rxList?.let {
            val rxList = response?.responseData?.rxList
            if (rxList.isNullOrEmpty()) {
                prescriptions.postValue(emptyList())
                showMessageForPrescription.postValue(Event(MESSAGES.EMPTY_PRESCRIPTION_LIST))
                SharedPrefManager.getInstance().prescriptionCount = 0
            } else {

                val finalList = mutableListOf<OrderRxInfo>()
                finalList.add(
                    OrderRxInfo(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        null,
                        null
                    )
                )
                finalList.addAll(rxList)
                prescriptions.postValue(finalList.toList())
                SharedPrefManager.getInstance().prescriptionCount = rxList.size
                getAddressInfo()
            }
            //}
            // added below 2 lines to clear previous list
            if (!response?.responseData?.rxList.isNullOrEmpty()) {
                prescriptionList.value = emptyList()
                list.clear()
                list.add("add_more_prescription")
                uploadedPastRx.clear()
                response?.responseData?.rxList?.map {
//                orderID = it.orderId.toString()
                    list.add(it.imageUrl!!)
                    uploadedPastRx.add(it.imageId ?: -1)

                }
                prescriptionList.postValue(list)
            }

            /****
             * In only prescription case if the user has removed all the uploaded prescriptions, then remove applied coupon
             */
            viewModelScope.launch(Dispatchers.IO) {
                val medList = localDbUseCase.getAddedMedicines() ?: listOf()
                if (medList.isEmpty() && SharedPrefManager.getInstance().prescriptionCount == 0) {
                    if (SharedPrefManager.getInstance().couponModel == null) {
                        //this line is added to remove imcomplete order id- so that new order id can be used when new prescription is uploaded
                        SharedPrefManager.getInstance().incompleteOrderId = 0
//                        SharedPrefManager.getInstance().isPspViewed=false
                    }
                    SharedPrefManager.getInstance().couponModel?.let {
                        removeCoupon()
                    }
                }
            }
        }
        else{
            prescriptionUploadedCount=0
            if(currentPageName.equals("prescription_activity"))
                setEventForPrescriptionUploadPageViewed()
        }
    }

    fun deletePrescription(orderId: Long, edit: Boolean, images: List<Long>, customerId: String) {
        viewModelScope.launch {
            val response =
                orderFlowUseCase.deletePrescription(mxInternalErrorOccurred,orderId, edit, images, customerId)
            if (response != null) {
                if (uploadedPastRx.contains(images[0])) {
                    uploadedPastRx.remove(images[0])
                    firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_UPLOAD_PRESCRIPTION_REMOVE, "")
                }
                showMessageForPrescription.postValue(Event(MESSAGES.DELETE_PRESCRIPTION_SUCCESSFULLY))
            }
        }
    }

    fun uploadPastPrescriptionData(patientId: String?) {

        //below logic is commented for now
        /* val selectedIdsList = pastPrescription.value?.map { it ->
             it.activeRxList.filter { it.selected }.map { it.imageId }
         }*/


        var selectedIdsListTemp: ArrayList<Long> = arrayListOf()

        val currentSelectedPrescriptionListSent: HashMap<Long, ActiveRx> = HashMap()
        currentSelectedPrescriptionList.forEach {
            currentSelectedPrescriptionListSent.put(it.value.imageId,it.value)
        }

        currentSelectedPrescriptionListSent.forEach {
            selectedIdsListTemp.add(it.value.imageId)
        }
        var selectedIdsList: List<List<Long>> = listOf(selectedIdsListTemp.toList())

        Log.e("selected_idsss::", selectedIdsList.toString())
        if (!selectedIdsList.isNullOrEmpty()) {
            uploadedPastRx.clear()
            for (selectedId in selectedIdsList) {
                if (selectedId.isNotEmpty()) {
                    if (isNetworkAvailable(context)) {
                        viewModelScope.launch {
                            isLoadingForPrescriptions.postValue(true)
                            val request = ImageUploadRequest()
                            request.patientId = patientId
//            request.imageId = selectedIdsList?.get(0)?.toString()
                            val response = uploadPrescriptionImages(request, selectedId)
                            if (response != null) {
                                isLoadingForPrescriptions.postValue(false)
                                SharedPrefManager.getInstance().incompleteOrderId =
                                    response.responseData.orderId.toLong()
//                                uploadedPastRx.add(response.responseData.imageId.toLong())
                                showMessageForPrescription.postValue(Event(MESSAGES.PAST_PRESCRIPTION_IMAGE_UPLOAD_SUCCESSFULLY))

                            }
                        }
                    } else showMessageForPrescription.postValue(Event(MESSAGES.NO_NETWORK))
                }
            }
        }

    }

    private suspend fun uploadPrescriptionImages(
        request: ImageUploadRequest,
        imageIds: List<Long>?
    ): SaveRxImageForCustomerIdResponse? {
//       var response : SaveRxImageForCustomerIdResponse? = null
        var response: SaveRxImageForCustomerIdResponse? = null
        if (imageIds != null) {
            for (imageId in imageIds) {
                coroutineScope {
                    request.imageId = imageId.toString()
                    if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                        request.orderId =
                            SharedPrefManager.getInstance().incompleteOrderId.toString()
                    }
                    Log.e("Image_uploaded::","yesssss2222")
                    async {
                        response = orderFlowUseCase.uploadImage(
                            mxInternalErrorOccurred,SharedPrefManager.getInstance().pincode.toString(),
                            SharedPrefManager.getInstance().loggedInUserId,
                            request,
                            if (SharedPrefManager.getInstance().algoSpecificVariantId > 0) SharedPrefManager.getInstance().algoSpecificVariantId else null
                        )
                    }.await()

                    if (response != null) {
                        SharedPrefManager.getInstance().incompleteOrderId =
                            response!!.responseData.orderId.toLong()
                    }
                }
            }

        }
        return response
    }

    fun proceedToCheckoutClick() {
        showMessageForPrescription.postValue(Event(MESSAGES.PROCEED_TO_CHECKOUT_CLICK))
    }

    fun getRxPrescriptionImagesApiCalling() {
        apiType = 1
        if (isNetworkAvailable(context)) {
            viewModelScope.launch(Dispatchers.IO) {
                getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
            }
        } else
            showMessageForPrescription.postValue(
                Event(
                    MESSAGES.NO_NETWORK
                )
            )
    }

    fun getDeletePrescriptionApiCalling(prescriptionImageId: Long) {
        apiType = 1
        if (isNetworkAvailable(context)) {

            viewModelScope.launch(Dispatchers.IO) {
                deletePrescription(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    false,
                    listOf(prescriptionImageId),
                    SharedPrefManager.getInstance().loggedInUserId.toString()
                )
            }
        } else showMessageForPrescription.postValue(Event(MESSAGES.NO_NETWORK))
    }

    fun getCartCount() {
        viewModelScope.launch(Dispatchers.IO) {
            var cartCountValue = async {
                localDbUseCase.getCartCount()
            }.await()
            existingCartItemCount = cartCountValue
            if (cartCountValue > 0) {
                cartCountValueFromDB.postValue(cartCountValue)
            }
        }
    }

    fun getAddressInfo(page: String) = viewModelScope.launch(Dispatchers.IO) {
//        val addressData = cartUseCase.getAllAddress(SharedPrefManager.getInstance().loggedInUserId, SharedPrefManager.getInstance().incompleteOrderId)
        val addressData = async {
            cartUseCase.getAllAddress(
                mxInternalErrorOccurred,SharedPrefManager.getInstance().loggedInUserId,
                if (page == "CART") 0 else SharedPrefManager.getInstance().incompleteOrderId
            )
        }.await()
        addressData?.responseData?.let {
            if (it.isNotEmpty()) {
                val selectedAddressId = SharedPrefManager.getInstance().addressId
                if (selectedAddressId > 0) {
                    for (item in it) {
                        if (item.addressId == selectedAddressId) {
//                            addressCountRx += 1
                            SharedPrefManager.getInstance().addressType = item.addressType
                            break
                        }
                    }
                } else {
                    /**
                     * No selected address found in session
                     * **/
//                    addressCountRx = it.size
                }
            } else {
//                addressCountRx = 0
            }

            getPatientInfo(
                if (page == "CART") null else SharedPrefManager.getInstance().incompleteOrderId,
                SharedPrefManager.getInstance().loggedInUserId
            )
        }

    }

    fun getAddressInfo() {
//        if ((addressIdRx ?: 0) > 0L && (patientIdRx ?: 0) > 0L) {
//            updateProceedButtonText()
//            return
//        }

        SharedPrefManager.getInstance().let {
            if (it.incompleteOrderId == 0L) return@let
            viewModelScope.launch(Dispatchers.IO) {
                val res = async {
                    orderFlowUseCase.getOrderDetails(
                        mxInternalErrorOccurred,it.incompleteOrderId,
                        it.loggedInUserId
                    )
                }.await()
                res?.responseData?.let {
                    Log.d(
                        "qwerty",
                        "getAddressInfo: addressId = ${res.responseData?.addressId} patient id= ${res.responseData?.patientId}"
                    )
                    var orderId = res.responseData?.orderId?.toLong() ?: 0
                    var customerId = SharedPrefManager.getInstance().loggedInUserId
                    addressCountRx = res.responseData?.addedAddressCount ?: 0
                    patientsCountRx = res.responseData?.addedPatientCount ?: 0
                    addressIdRx = res.responseData?.addressId ?: 0L
                    patientIdRx = res.responseData?.patientId ?: 0L
    
    
                    if (addressCountRx == 1 && patientsCountRx == 1) {
                        val patient = async {
                            userUseCase.getAllPatients(
                                mxInternalErrorOccurred, true,
                                SharedPrefManager.getInstance().loggedInUserId.toLong()
            
                            )
                        }
                        patient.await()
        
                        val address = async {
                            userUseCase.getAllAddresses(
                                mxInternalErrorOccurred,
                                customerId.toLong()
                            )
                        }
                        address.await()
        
                        addressIdRx = address.getCompleted()?.first()?.addressId ?: 0
                        patientIdRx = patient.getCompleted()?.PatientList?.first()?.patientId ?: 0
                        SharedPrefManager.getInstance().patientId = patientIdRx
                        SharedPrefManager.getInstance().addressId = addressIdRx
        
                        savePatientId(
                            SharedPrefManager.getInstance().loggedInUserId,
                            orderId,
                            patientIdRx
                        )
        
                        val res: Int? = saveAddressId(
                            SharedPrefManager.getInstance().loggedInUserId,
                            orderId,
                            addressIdRx
                        )
                        if(res == 0) {
                            SharedPrefManager.getInstance().address =
                                address.getCompleted()?.first()?.clubbedAddress
                            SharedPrefManager.getInstance().selectedCity =
                                address.getCompleted()?.first()?.cityName
                            SharedPrefManager.getInstance().selectedState =
                                address.getCompleted()?.first()?.stateName
            
                            SharedPrefManager.getInstance().addressType =
                                address.getCompleted()?.first()?.addressType
                            SharedPrefManager.getInstance().pincode =
                                address.getCompleted()?.first()?.pincode?.toInt() ?: "400079".toInt()
                            SharedPrefManager.getInstance().addressId =
                                address.getCompleted()?.first()?.addressId
                            SharedPrefManager.getInstance().newSelectedPinCode = false
                        }
                    } else if (addressCountRx == 0 && patientsCountRx == 1) {
                        async { autoSelectPatient(orderId) }.await()
                    } else if (addressCountRx == 1 && patientsCountRx == 0) {
                        async { autoSelectAddress(customerId, orderId) }.await()
                    }
                    
                    
                    updateProceedButtonText()
                }
            }
        }
    }

    private fun getPatientInfo(orderId: Long?, customerId: String) {//
        viewModelScope.launch(Dispatchers.IO) {
            val response =
                async { orderFlowUseCase.getOrderPatientDetails(mxInternalErrorOccurred,orderId, customerId) }.await()
            response?.let {
                if (it.responseData?.isEmpty() == true) {
//                    patientsCountRx = 0
                } else {
                    if (it.responseData != null) {
                        val selectedPatientId = it.responseData?.get(0)?.patientId
                            ?: 0L /* TODO SharedPrefManager.getInstance().patientId = -1*/
                        if (selectedPatientId > 0) {

                            for (item in it.responseData!!) {
                                if (item.patientId == selectedPatientId) {
//                                    patientsCountRx += 1
                                    Log.i("patientsCnt inside", "" + patientsCountRx)
                                    /*patientName.postValue(item.patientName)
                                    patientId.postValue(item.patientId ?: 0)
                                    paymentContainerModel.patientName = item.patientName.toString()
                                    stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)*/
                                    break
                                }
                            }

                        } else {
                            /**
                             * No selected patient found `in` session
                             * **/
//                            patientsCountRx = it.responseData!!.size
                        }
                        Log.i("selectedPatientId", "" + selectedPatientId)
                        Log.i("patientsCnt outside", "" + patientsCountRx)
                    }
                }
            }
            updateProceedButtonText()
        }
    }

    /*  private fun updateProceedButtonText() {
          Log.i("inside botton text","updateProceedButtonText()")
          Log.i("patientId",""+SharedPrefManager.getInstance().patientId)
          Log.i("addressCnt", "$addressCnt,patientsCnt=$patientsCnt")

          var title = "Proceed to Checkout"
          if (addressCnt > 0 || patientsCnt > 0) {
              title = if (SharedPrefManager.getInstance().patientId > 0) {
                  "Proceed to Checkout"
              } else {
                  "Add Delivery Details"
              }
          } else if (patientsCnt == 0 && addressCnt == 0) {
              title = "Add Address"
          }
          proceedButtonTxt.postValue(title)
      }*/

    /*private fun updateProceedButtonText() {
        Log.d("qwerty", "address Id ${addressIdRx} patient Id ${patientIdRx}")
        var title = "Add Address"
        if ((addressIdRx ?: 0) > 0L && (patientIdRx ?: 0) > 0L && patientsCountRx > 0 && addressCountRx > 0) title = "Proceed to Checkout"
        else if (patientsCountRx > 0 || addressCountRx > 0) title = "Add Delivery Details"
        proceedButtonTxt.postValue(title)
    }*/

    fun updateProceedButtonText() {
        var title = "Add Address"
        if (patientsCountRx > 0 && addressCountRx > 0
            && (patientIdRx > 0L && SharedPrefManager.getInstance().patientId > 0)
            && (addressIdRx > 0L && SharedPrefManager.getInstance().addressId > 0)
        )
            title = "Proceed to Checkout"
        else if (patientsCountRx > 0 || addressCountRx > 0)
            title = "Add Delivery Details"

        proceedButtonTxt.postValue(title)
    }

    fun setUpUploadButtonVisibility() {
        val selectedIdsList = pastPrescription.value?.map { list ->
            list.activeRxList.filter { it.selected }
        }
        if (selectedIdsList != null) {
            for (selectedItem in selectedIdsList) {
                if (selectedItem.isNotEmpty()) {
                    Log.e("isPastPrescription", "3333::True")
                    isPastPrescriptionSelected.postValue(true)
                    break
                } else {
                    Log.e("isPastPrescription", "4444::false")
                    isPastPrescriptionSelected.postValue(false)
                    continue
                }
            }
        }
    }

    fun savePatientId(loggedInUserId: String, orderId: Long, patientId: Long) =
        viewModelScope.launch(Dispatchers.IO) {
            async {
                orderFlowUseCase.tagPatientIdWithOrder(mxInternalErrorOccurred,orderId, patientId, loggedInUserId)
            }.await()
        }

    suspend fun saveAddressId(loggedInUserId: String, orderId: Long, addressId: Long) : Int? {
        return orderFlowUseCase.saveAddressForOrder(mxInternalErrorOccurred, orderId, addressId, loggedInUserId)
    }

    private fun removeCoupon() {
        viewModelScope.launch(Dispatchers.IO) {
            if (isNetworkAvailable(context)) {
                val couponSaveRemoveResponse = couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId,
                    getPaymentMode().toString(),
                    "0"
                )
                couponSaveRemoveResponse?.responseData?.let {
                    SharedPrefManager.getInstance().couponModel = null
                    SharedPrefManager.getInstance().offerId = "0"
                    SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                    //this line is added to remove incomplete order id- so that new order id can be used when new prescription is uploaded
                    SharedPrefManager.getInstance().incompleteOrderId = 0
//                    SharedPrefManager.getInstance().isPspViewed=false
                    //showMessage.postValue(Event(MessageConstant(MESSAGES.REMOVED_COUPON_SUCCESSFULLY,it.description?.get(0) ?: "")))
                }
            } else {
                openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
            }
        }
    }

    fun getPaymentMode(): Long {
        var paymentId: Long
        paymentId = if (SharedPrefManager.getInstance().couponPaymentMode == "online") {
            16
        } else if (SharedPrefManager.getInstance().couponPaymentMode
                .equals("cod", ignoreCase = true)
        ) {
            17
        } else {
            if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1)
                17
            else
                SharedPrefManager.getInstance().lastSelectedPaymentModeId.toLong()
        }

        if (paymentId < 1) {
            paymentId = 16L
        }

        return paymentId
    }

    fun evenSendPrescriptionRemovedEvent(activePage:String){
        sdkEventUseCase.sendPrescriptionRemovedEvent(activePage)
    }
     fun eventOrderPrescriptionUploaded(){
         sdkEventUseCase.orderPrescriptionUploaded(FirebaseEventModel(
             mobile=SharedPrefManager.getInstance().loggedInUserMobile,
             pageName = "PrescriptionUploadActivity",
             customerId = SharedPrefManager.getInstance().loggedInUserId
         ))
     }

    fun eventUploadPrescriptionPrescriptionSelected(){
        sdkEventUseCase.uploadPrescriptionPrescriptionSelected(FirebaseEventModel(
            mobile=SharedPrefManager.getInstance().loggedInUserMobile,
            pageName = "PastUploadedPrescription",
            customerId = SharedPrefManager.getInstance().loggedInUserId
        ))

    }
    
    
    fun autoSelectAddress(customerId: String,orderId: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            val address = async {
                userUseCase.getAllAddresses(
                    mxInternalErrorOccurred,
                    customerId.toLong()
                )
            }
            address.await()
            addressIdRx = address.getCompleted()?.first()?.addressId ?: 0
            SharedPrefManager.getInstance().addressId = addressIdRx


            val res: Int? = saveAddressId(
                SharedPrefManager.getInstance().loggedInUserId,
                orderId,
                addressIdRx
            )
            if(res == 0) {
                SharedPrefManager.getInstance().address =
                    address.getCompleted()?.first()?.clubbedAddress
                SharedPrefManager.getInstance().selectedCity =
                    address.getCompleted()?.first()?.cityName
                SharedPrefManager.getInstance().selectedState =
                    address.getCompleted()?.first()?.stateName

                SharedPrefManager.getInstance().addressType =
                    address.getCompleted()?.first()?.addressType
                SharedPrefManager.getInstance().pincode =
                    address.getCompleted()?.first()?.pincode?.toInt() ?: "400079".toInt()
                SharedPrefManager.getInstance().addressId =
                    address.getCompleted()?.first()?.addressId
                SharedPrefManager.getInstance().newSelectedPinCode = false
            }
        }
    }
    
    fun autoSelectPatient(orderId: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            val patient = async {
                userUseCase.getAllPatients(
                    mxInternalErrorOccurred, true,
                    SharedPrefManager.getInstance().loggedInUserId.toLong()
                
                )
            }
            patient.await()
            patientIdRx = patient.getCompleted()?.PatientList?.first()?.patientId ?: 0
            SharedPrefManager.getInstance().patientId = patientIdRx
            savePatientId(
                SharedPrefManager.getInstance().loggedInUserId,
                orderId,
                patientIdRx
            )
        }
    }
    
}