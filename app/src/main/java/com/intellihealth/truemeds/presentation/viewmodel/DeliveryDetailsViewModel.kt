package com.intellihealth.truemeds.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.domain.enums.NetworkResponseType
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class DeliveryDetailsViewModel @Inject constructor(
    private val userUseCase: UserDataUseCase,
    private val homePageUseCase: HomePageUseCase,
    //private val orderFlowUseCase: OrderFlowUseCase

    ) :
    BaseViewModel() {
    var isExpanded: MutableLiveData<Boolean> = MutableLiveData(false)
    var headerType: MutableLiveData<MobileSectionHeadersModel> = MutableLiveData(
        MobileSectionHeadersModel(
            "Delivery Details", "", "",
            "", 0, null
        )
    )
    private var originalPatientList: MutableList<GetAllPatientResponse.Patient?> = mutableListOf()


    //managing patient list
    var patientsList: MutableLiveData<MutableList<GetAllPatientResponse.Patient?>?> =
        MutableLiveData(mutableListOf())
    private val showError = MutableLiveData<Event<ERRORS>>()
    val eventShowError: LiveData<Event<ERRORS>> get() = showError

    private val showMessage = MutableLiveData<Event<MESSAGES>>()
    val eventMessage: LiveData<Event<MESSAGES>> get() = showMessage

    private val proceedToCheckout = MutableLiveData<Event<Boolean>>()
    val eventProceedToCheckout: LiveData<Event<Boolean>> get() = proceedToCheckout

    var showShimmerPatient = MutableLiveData<Boolean>(true)
    val showShimmerPatientLiveData: LiveData<Boolean> get() = showShimmerPatient
    var showAddPatientView = MutableLiveData<Boolean>(false)
    var showPatientListView = MutableLiveData<Boolean>(false)

    var addressList: MutableLiveData<List<GetAllAddressResponse.ResponseObj?>?> =
        MutableLiveData(
            listOf()
        )

    var showShimmerAddress = MutableLiveData<Boolean>(true)
    val showShimmerAddressLiveData: LiveData<Boolean> get() = showShimmerAddress

    var currentPatientSelectedPos: Int = -1
    var currentAddressSelectedPos: Int = -1

    var showAddAddressView = MutableLiveData<Boolean>(false)
    var showAddressListView = MutableLiveData<Boolean>(false)

    var isExpandedListCaseItemUnchecked = false
    var isExpandedListCaseItemPos = -1

    var selectedPatient: GetAllPatientResponse.Patient? = null
    var selectedAddress: GetAllAddressResponse.ResponseObj? = null
    var patientExperiment: MutableLiveData<String> = MutableLiveData("")
    private val launchAddPatient = MutableLiveData<Event<String>>()
    val eventLaunchAddPatient: LiveData<Event<String>> get() = launchAddPatient

    //note:- view more logic of patient list
    var showViewMoreViewLessPatientList: MutableLiveData<Boolean> = MutableLiveData(false)
    var isHomeAddressAdded = false
    var isOfficeAddressAdded = false
    var isLoadingView: MutableLiveData<Boolean> = MutableLiveData(false)
    var newlyCreatedAddressId : Long = -1
    var newlyCreatedPatientId : Long = -1
    var isFreshUser = false
    var mxInternalErrorOccurred=MxInternalErrorOccurred()
    var selectedWarehouseID=SharedPrefManager.getInstance().selectedWarehouseID

    fun getPatientList(type: Int = 0, isCallAddress: Boolean = true) {
        viewModelScope.launch {
            val response = userUseCase.getAllPatients(
                mxInternalErrorOccurred,true,
                SharedPrefManager.getInstance().loggedInUserId.toLong()

            )

            Log.e("response:::", response.toString())

            response?.PatientList?.let { tempPatientList ->
                if (isCallAddress)
                    getAddressListData(SharedPrefManager.getInstance().loggedInUserId.toLong())


                var patientListData: ArrayList<GetAllPatientResponse.Patient> = arrayListOf()
                patientListData.addAll(tempPatientList.sortedByDescending {
                    patient -> patient.patientId
                })

                /* patientList.forEach {
                     if (SharedPrefManager.getInstance().patientId == it.patientId) {
                         it.selected = true
                         selectedPatient = it
                     }
                 }*/
                isFreshUser = patientListData.size == 0

                for (i in 0..patientListData.size - 1) {
                    patientListData.get(i).let {
                        if (newlyCreatedPatientId > 0 && newlyCreatedPatientId == it.patientId) {
                            it.selected = true
                            selectedPatient = it
                        } else if (SharedPrefManager.getInstance().patientId == it.patientId) {
                            if (newlyCreatedPatientId > 0) {

                            } else {
                                it?.selected = true
                                selectedPatient = it
                            }
                        }
                    }
                }

                // this condition is written to show already selected patient on top
//                if (!patientListData.isNullOrEmpty() && patientListData.size > 0 && selectedPatient != null) {
//                    val index: Int = patientListData.indexOf(selectedPatient)
//                    if(index != -1) patientListData.removeAt(index)
//                    patientListData.add(0, selectedPatient!!)
//                }

                patientsList.value!!.clear()
                //   patientsList.value!!.addAll(patientList)
                patientsList.value!!.addAll(processPatientList(patientListData))
                when {
                    !patientsList.value!!.isNullOrEmpty() -> {
                        originalPatientList = mutableListOf()
                        originalPatientList.addAll(patientsList.value!!)
                        Log.e("responsepatient:::", patientsList.value!!.toString())
                        showShimmerPatient.value = false
                        showPatientListView.value = true
                        showAddPatientView.value = false
/*
                        if (type == 1) {
                            var selectedIndex = -1
                            var mySelfIndex = 0
                            for ((index,item) in originalPatientList.withIndex()) {
                                item?.selected = false
                                if (item != null && item.patientId == SharedPrefManager.getInstance().patientId) {
                                    item.selected = true
                                    selectedIndex = index
                                }
                                if (item?.relationName == "MYSELF") {
                                    mySelfIndex = index
                                }
                            }
                            if (selectedIndex == -1) {
                                originalPatientList.get(mySelfIndex)?.selected = true
                            }
//                            originalPatientList.forEach {
//                                it?.selected = false
//                                if (it != null && it.patientId == SharedPrefManager.getInstance().patientId) {
//                                    it.selected = true
//                                }
//                            }
                        }
*/
//                        for (item in originalPatientList) {
//                            item?.selected = false
//                            if (item != null && (item.patientId == newlyCreatedPatientId ||
//                                item.patientId == SharedPrefManager.getInstance().patientId)) {
//                                item.selected = true
//                                selectedPatient = item
//                                break
//                            }
//                        }
                        /*if (originalPatientList.size == 1) {
                            originalPatientList[0]?.selected = true
                            selectedPatient = originalPatientList[0]
                        }*/
                        originalPatientList.sortedBy { it?.selected != true }
                        updateListOnUI(isExpanded.value!!)
                    }

                    else -> {
                        showShimmerPatient.value = false
                        showPatientListView.value = false
                        showAddPatientView.value = true
                        showError.postValue(Event(ERRORS.NO_PATIENT_FOUND))
                    }
                }

            }
        }

    }

    fun getAddressListData(customerId: Long) = viewModelScope.launch(Dispatchers.IO) {
        val manageAddressList = userUseCase.getAllAddresses(mxInternalErrorOccurred,customerId)

        //below code is added manage home and office selection condition on AddAddressActivity.kt
        isOfficeAddressAdded = false
        isHomeAddressAdded = false

        when {


            !manageAddressList.isNullOrEmpty() -> {

                manageAddressList.forEach {
                    if (newlyCreatedAddressId > 0 && newlyCreatedAddressId == it?.addressId) {
                        it?.selected = true
                        selectedAddress = it
                    } else if (SharedPrefManager.getInstance().addressId == it?.addressId) {
                        if (newlyCreatedAddressId > 0) {
                        
                        } else {
                            it?.selected = true
                            selectedAddress = it
                        }
                    }

                    //below code is added manage home and office selection condition on AddAddressActivity.kt
                    if (it?.addressType.equals("office", true))
                        isOfficeAddressAdded = true
                    else if (it?.addressType.equals("home", true))
                        isHomeAddressAdded = true

                }
                showShimmerAddress.postValue(false)
                showAddressListView.postValue(true)
                showAddAddressView.postValue(false)
                addressList.postValue(processAddressList(manageAddressList!!))
            }

            else -> {
                showShimmerAddress.postValue(false)
                showAddressListView.postValue(false)
                showAddAddressView.postValue(true)
                showError.postValue(Event(ERRORS.NO_ADDRESS_FOUND))
            }
        }
    }

    private fun processAddressList(list: List<GetAllAddressResponse.ResponseObj?>) : MutableList<GetAllAddressResponse.ResponseObj> {
        var outputList = mutableListOf<GetAllAddressResponse.ResponseObj>()
        var firstIndexItem : GetAllAddressResponse.ResponseObj? = null
        for (item in list) {
            if (item != null) {
                if (item.selected) {
                    firstIndexItem = item
                } else {
                    outputList.add(item)
                }
            }
        }
        if (firstIndexItem != null) {
            outputList.add(0, firstIndexItem)
        }
        return outputList
    }

    private fun processPatientList(list: ArrayList<GetAllPatientResponse.Patient>) : MutableList<GetAllPatientResponse.Patient> {
        var outputList = mutableListOf<GetAllPatientResponse.Patient>()
        var firstIndexItem : GetAllPatientResponse.Patient? = null
        for (item in list) {
            if (item != null) {
                if (item.selected) {
                    firstIndexItem = item
                } else {
                    outputList.add(item)
                }
            }
        }
        if (firstIndexItem != null) {
            outputList.add(0, firstIndexItem)
        }
        return outputList
    }
    fun addNewPatientsButtonClick() {

        showMessage.postValue(Event(MESSAGES.ADD_PATIENT_CLICK))
    }

    fun addNewAddressButtonClick() {

        showMessage.postValue(Event(MESSAGES.ADD_NEW_ADDRESS_CLICK))
    }

    fun proceedToCheckoutClick() {
        Log.i("selectedAddress", "" + selectedAddress)
        Log.i("selectedPatient", "" + selectedPatient)

        if (patientsList.value.isNullOrEmpty()) {
            showMessage.postValue(Event(MESSAGES.PATIENT_NOT_ADDED))
            return
        } else if (addressList.value.isNullOrEmpty()) {
            showMessage.postValue(Event(MESSAGES.ADDRESS_NOT_ADDED))
            return
        } else if (selectedAddress == null && selectedPatient == null) {
            showMessage.postValue(Event(MESSAGES.ADDRESS_PATIENT_NOT_SELECTED))
            return
        } else if (selectedPatient == null) {
            showMessage.postValue(Event(MESSAGES.PATIENT_NOT_SELECTED))
            return
        } else if (selectedAddress == null) {
            showMessage.postValue(Event(MESSAGES.ADDRESS_NOT_SELECTED))
            return
        }

        selectedPatient?.let {
            selectedAddress?.let { selectedAddress ->
                savePatientForOrder(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    it,
                    SharedPrefManager.getInstance().loggedInUserId,
                    selectedAddress
                )
            }
        }

    }


    fun changeListStatus() {
        isExpanded.value = !isExpanded.value!!
        updateListOnUI(isExpanded.value!!)
    }


    private fun updateListOnUI(expanded: Boolean) {
        Log.e("view_more:::", originalPatientList.toString())
        if (expanded) {
            showViewMoreViewLessPatientList.value = true
            patientsList.value = originalPatientList

            //through these condition we are selecting the item again in expand case -
            // if selected item position is greater than 2
            if (isExpandedListCaseItemUnchecked) {
                patientsList.value?.get(isExpandedListCaseItemPos)?.selected = true
                currentPatientSelectedPos = isExpandedListCaseItemPos
                isExpandedListCaseItemUnchecked = false
                isExpandedListCaseItemPos = -1
            }

            patientsList.postValue(patientsList.value)
        } else {


            //through these condition we are unselecting the item in collapse case -
            // if selected item position is greater than 2
            if (currentPatientSelectedPos > 2) {
                patientsList.value?.get(currentPatientSelectedPos)!!.selected = false
                isExpandedListCaseItemUnchecked = true
                isExpandedListCaseItemPos = currentPatientSelectedPos
                currentPatientSelectedPos = -1

            }

            if (originalPatientList.size > 3) {
                showViewMoreViewLessPatientList.value = true
                patientsList.value = originalPatientList.subList(0, 3)
                patientsList.postValue(patientsList.value)
            } else {
                showViewMoreViewLessPatientList.value = false
                patientsList.value = originalPatientList
                patientsList.postValue(patientsList.value)
            }
        }
    }



    fun patientBoxClicked(patientDetailsCardModel: GetAllPatientResponse.Patient?, position: Int) {
        Log.d("TAG", "addpatient: clicked::" + position)

        if (SharedPrefManager.getInstance().isReOrder) {
            if (SharedPrefManager.getInstance().patientId != patientDetailsCardModel?.patientId) {
                /**
                 * TODO - show discard order alert
                 * **/

                showMessage.postValue(Event(MESSAGES.SHOW_DISCARD_ORDER_ALERT))
            }
        } else {
            isExpandedListCaseItemUnchecked = false
            isExpandedListCaseItemPos = -1

            for (index in 0 until (patientsList.value?.size!!)) {
                patientsList.value?.get(index)?.selected = false
            }

//            if (currentPatientSelectedPos != -1)
//                patientsList.value?.get(currentPatientSelectedPos)!!.selected = false

            patientsList.value?.get(position)!!.selected = true
            currentPatientSelectedPos = position


            Log.d("TAG", "addpatient: clicked::else case" )

            selectedPatient = patientDetailsCardModel
            //below 1 line is commented for now bcoz patient id should only be selected on proceed to checkout button click
           // SharedPrefManager.getInstance().patientId = selectedPatient?.patientId

            patientsList.postValue(patientsList.value)

            sendPatientChangedToMixPanel()
        }

        // TODO: launch new activity
    }

    private fun sendPatientChangedToMixPanel() {
        sdkEventUseCase.sendPatientChangedEvent()
    }

    fun editAddress(
        addressPatientDetailsCardModel: GetAllAddressResponse.ResponseObj?,
        position: Int
    ) {
        Log.e("edit_address::", "===" + position)
        showMessage.postValue(Event(MESSAGES.EDIT_ADDRESS_CLICK))
    }

    fun editPatient(patientDetailsCardModel: GetAllPatientResponse.Patient?, position: Int) {
        Log.e("edit_patient::", "===" + position)
        showMessage.postValue(Event(MESSAGES.EDIT_PATIENT_CLICK))

    }

    private fun savePatientForOrder(
        orderId: Long,
        patient: GetAllPatientResponse.Patient,
        customerId: String,
        address: GetAllAddressResponse.ResponseObj
    ) {
        Log.e("save_patient:::","api_called")
        viewModelScope.launch(Dispatchers.IO) {
            val saveAddressResponse =
                async {
                    orderFlowUseCase.tagPatientIdWithOrder(
                        mxInternalErrorOccurred,orderId,
                        patient.patientId,
                        customerId
                    )
                }.await()
            saveAddressResponse?.let {
                if (it == NetworkResponseType.SUCCESS.ordinal) {
                    SharedPrefManager.getInstance().patientName = patient.patientName
                    SharedPrefManager.getInstance().patientId = patient.patientId
                    SharedPrefManager.getInstance().patientType = patient.patientRelation

                    saveAddressForOrder(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        address, SharedPrefManager.getInstance().loggedInUserId
                    )
                    showMessage.postValue(Event(MESSAGES.ADD_PATIENT_SUCCESSFULLY))
                } else {
                    showMessage.postValue(Event(MESSAGES.ADD_PATIENT_FAILED))
                }
            }
        }
    }


    private fun saveAddressForOrder(
        orderId: Long,
        address: GetAllAddressResponse.ResponseObj,
        customerId: String
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            val saveAddressResponse =
                async {
                    orderFlowUseCase.saveAddressForOrder(
                        mxInternalErrorOccurred,orderId,
                        address.addressId ?: 0,
                        customerId
                    )
                }.await()
            saveAddressResponse?.let {
                if (it == NetworkResponseType.SUCCESS.ordinal) {
                    SharedPrefManager.getInstance().address = address.clubbedAddress
                    SharedPrefManager.getInstance().selectedCity = address.cityName
                    SharedPrefManager.getInstance().selectedState = address.stateName

                    SharedPrefManager.getInstance().addressType = address.addressType
                    SharedPrefManager.getInstance().coldChainDeliverable = homePageUseCase.isColdStoragePincode
                    SharedPrefManager.getInstance().pincode =
                        address.pincode?.toInt() ?: "400079".toInt()
                    SharedPrefManager.getInstance().addressId = address.addressId
                    SharedPrefManager.getInstance().newSelectedPinCode = false
                    Log.e("warehouse_updated::","4444:::"+  selectedWarehouseID)
                    SharedPrefManager.getInstance().selectedWarehouseID = selectedWarehouseID
                    
                    showMessage.postValue(Event(MESSAGES.ADD_ADDRESS_SUCCESSFULLY))
                    proceedToCheckout.postValue(Event(true))
                }else if (it == NetworkResponseType.BADREQUEST.ordinal) {
                    showMessage.postValue(Event(MESSAGES.ADD_ADDRESS_BAD_REQUEST))
                } else {
                    showMessage.postValue(Event(MESSAGES.ADD_ADDRESS_FAILED))

                }
            }
        }
    }

    fun getPatientExperimentCategory() {
        viewModelScope.launch(Dispatchers.IO) {
            val patientExp ="B"
                //localDbUseCase.getCustomerCategory(UserCategoryEnum.PATIENT_EXPERIMENT.apiCategoryType)
            if (patientExp.isNotEmpty()) {
//                patientExperiment.postValue(patientExp)
                launchAddPatient.postValue(Event(patientExp))
            } else {
//                patientExperiment.postValue(VariantAssignments.PATIENT_EXPERIMENT_VARIANT_A)
                launchAddPatient.postValue(Event(patientExp))
            }
        }
    }

    fun getPatientExperiment() {
        viewModelScope.launch(IO) {
            var patientExp ="B"
                //localDbUseCase.getCustomerCategory(UserCategoryEnum.PATIENT_EXPERIMENT.apiCategoryType)

            if (patientExp.isEmpty())
                patientExp = "A"

            patientExperiment.postValue(patientExp)
        }

    }

    fun fetchPinCodeOnAddressSelection(pinCode: String?, selectedAddressId: Long) {
        viewModelScope.launch(IO) {
            val response = homePageUseCase.checkPinCodeServiceability(mxInternalErrorOccurred,pinCode)
            updateSelectedAddressCard(pinCode, response, selectedAddressId)
        }
    }


    private fun updateSelectedAddressCard(
        pinCode: String?,
        response: PinCodeServiceabilityResponse?,
        selectedAddressId: Long = 0,
    ) {


        val addresses = addressList.value ?: listOf()
        if (response != null) {

            for (address in addresses) {
                if (response.responseData.pincodeData == null ){
                    if (selectedAddressId == address?.addressId){
                        address?.selected = true
                        address?.isServicable = false
                    }else{
                        address?.selected = false
                        address?.isServicable = true
                    }
                }else{
                    if (selectedAddressId == address?.addressId){
                        address?.selected = true
                        address?.isServicable = response.responseData.isServicable
                        /**
                         * The below code is same as HomeViewModel updateSelectedAddressCard
                         * Insert cold chain deliverable inside sharefprefernce is the pincode is cold chain
                         * **/
                        response.responseData.pincodeData!![0]?.let { pinData ->
                            
                            //this will only happen when user proceed with selected addess
                            /*SharedPrefManager.getInstance().selectedWarehouseID =
                                pinData.warehouseId.toString()*/
                            selectedWarehouseID = pinData.warehouseId.toString()
                            SharedPrefManager.getInstance().coldChainDeliverable =
                                pinData.isColdChainDeliverable ?: true
                        }
                    }else{
                        address?.selected = false
                        address?.isServicable = response.responseData.isServicable
                    }


                }

            }
            val data = addressList.value
            data?.let {
                addressList.postValue(it)
            }
            addressList.value!!.forEachIndexed{ index, s ->
            if (selectedAddressId == s?.addressId)
                if (s.isServicable!!){
                    selectedAddress = s
                }else{
                    selectedAddress = null
                }
            }
            isLoadingView.postValue(false)
        } else {
            val data = addressList.value
            data?.let {
                for (address in it) {
                    if (address?.addressId == selectedAddressId) {
                        address.isServicable = false
                        address.selected = true
                        break
                    }
                }
                addressList.postValue(addresses)

            }
            isLoadingView.postValue(false)

        }
    }

    fun sendAddAddressClickedEvent(mxAddAddressClicked: MxAddAddressClicked){
        sdkEventUseCase.sendAddAddressClickedEvent(mxAddAddressClicked)
    }
    fun sendAddressChangedEvent(){
        sdkEventUseCase.sendAddressChangedEvent()
    }
    fun sendAddPatientClickedEvent(clickedPage: String){
        sdkEventUseCase.sendAddPatientClickedEvent(clickedPage)
    }
    fun sendDeliveryDetailViewedEvent(){
        sdkEventUseCase.sendDeliveryDetailViewedEvent()
    }

//    fun sendPaymentPendingViewedToMixpanel(
//        clickedOnPage: String?,
//        estimatedPayableAmount: Double?,
//        orderId: String?,
//        whId:String?
//    ) {
//        val data = MxPaymentPendingViewed()
//        data.clickedOnPage = clickedOnPage
//        data.estimatedPayableAmount = estimatedPayableAmount
//        data.orderId = orderId
//        data.whId = whId
//        sdkEventUseCase.sendPaymentPendingViewedEvent(data)
//    }

}