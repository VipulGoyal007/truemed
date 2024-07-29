package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxAddressAdded
import com.intellihealth.truemeds.data.model.mixpanel.MxAddressEdited
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.MessageConstant
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.enums.AddressType
import com.intellihealth.truemeds.domain.enums.NetworkResponseType
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.Validator
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
open class ManageAddressViewModel @Inject constructor(
    private val useCase: UserDataUseCase,
    private val homePageUseCase: HomePageUseCase,//private val orderFlowUseCase: OrderFlowUseCase

) : BaseViewModel(),
    DefaultLifecycleObserver {
    val addressList = MutableLiveData<List<GetAllAddressResponse.ResponseObj?>?>()
    val getManageAddressData: LiveData<List<GetAllAddressResponse.ResponseObj?>?> get() = addressList

    var _addressItemList = MutableLiveData<GetAllAddressResponse.ResponseObj?>()
    var cityTxt = ""
    var stateTxt = ""
    val addressItemList: LiveData<GetAllAddressResponse.ResponseObj?> get() = _addressItemList

    val showMessage = MutableLiveData<Event<MessageConstant>>()
    val eventMessage: LiveData<Event<MessageConstant>> get() = showMessage
    val isEditClick: MutableLiveData<Boolean> = MutableLiveData(false)
    var isLocationPermissionGranted = MutableLiveData(false)

    var showShimmer = MutableLiveData<Boolean>(true)
    var showManageAddressView = MutableLiveData<Boolean>(false)
    var showManageAddressListView = MutableLiveData<Boolean>(false)
    private var userLocationClick = false
    var userTypeCity = ""
    var userTypeState = ""
    var userTypeAddressLine2 = ""
    var userTypePinCode = ""
    var isPinCodeGet = false
    var isPincodeServicable = MutableLiveData(false)
    var apiType: Int = 0

    val showShimmerLiveData: LiveData<Boolean> get() = showShimmer
    var address: MutableLiveData<String> = MutableLiveData("")
    var address2: MutableLiveData<String> = MutableLiveData("")
    var pincode: MutableLiveData<String> = MutableLiveData("")
    var landMark: MutableLiveData<String> = MutableLiveData("")
    var city: MutableLiveData<String> = MutableLiveData("")
    var state: MutableLiveData<String> = MutableLiveData("")
    var other: MutableLiveData<String> = MutableLiveData("")
    var chipTypeSelected: MutableLiveData<Int> = MutableLiveData(0)
    var validator = Validator()
    private lateinit var context: Context
    var patientExperiment: MutableLiveData<String> = MutableLiveData("B")

    //var PIN_PATTERN: Pattern = Pattern.compile("^\\d{4}$")

    var addressData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var address2Data: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var otherError: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var pincodeData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var cityData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var stateData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var chipData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var landMarkData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var headerType: MutableLiveData<MobileSectionHeadersModel> = MutableLiveData(
        MobileSectionHeadersModel(
            "Address Details", "", "",
            "", 0, null
        )
    )

    val isLoading = MutableLiveData(false)
    var callSaveAddress = false

    var isHomeAddressAdded = false
    var isOfficeAddressAdded = false
    var isEditAddress = false

//    var isEditCaseWithCityStateAvailable = false
    var newlyCreatedAddId: Long = -1
    val requestFocus = MutableLiveData<Int>(0)

    //mxp
    var addressLine1Edited = false
    var addressLine2Edited = false
    var landmarkEdited = false
    var cityEdited = false
    var clickedOnPage = ""
    var pinCodeEdited = true
    var stateEdited = false
    var typeOfAddress = ""
    var ogState = ""
    var ogCity = ""
    var addressChangedFrom = ""
    var mxInternalErrorOccurred = MxInternalErrorOccurred()
    var pincodeFillType = "Pincode typed"
    fun getManageAddressData(customerId: Long) = viewModelScope.launch(IO) {
        val manageAddressList = useCase.getAllAddresses(mxInternalErrorOccurred, customerId)

        //below code is added manage home and office selection condition on AddAddressActivity.kt
        isOfficeAddressAdded = false
        isHomeAddressAdded = false
        if (!manageAddressList.isNullOrEmpty()) {

            for (i in 0..manageAddressList.size - 1) {
                if (manageAddressList.get(i)?.addressType.equals("office", true))
                    isOfficeAddressAdded = true
                else if (manageAddressList.get(i)?.addressType.equals("home", true))
                    isHomeAddressAdded = true

                if (isOfficeAddressAdded && isHomeAddressAdded)
                    break
            }
        }

        addressList.postValue(manageAddressList)

        when {
            !manageAddressList.isNullOrEmpty() -> {
                showShimmer.postValue(false)
                showManageAddressListView.postValue(true)
                showManageAddressView.postValue(false)
            }

            else -> {
                showShimmer.postValue(false)
                showManageAddressListView.postValue(false)
                showManageAddressView.postValue(true)
            }
        }
    }

    fun onSaveButtonClicked(mContext: Context) {
        context = mContext
        if (isAllFieldsValidate()) {
            doSaveButtonClickApiCalling()

        }
    }

    fun doSaveButtonClickApiCalling() {

        apiType = 1
        if (isNetworkAvailable(context)) {


            if (chipTypeSelected.value == 3 && other.value?.toLowerCase()
                    .equals("home") || other.value?.toLowerCase().equals("office")
            ) {
                otherError.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterOtherAddressExist),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                return
            }
            viewModelScope.launch(IO) {
                showLoader()
                val bodyData = getAddressJsonObj() ?: return@launch
                Log.d("TAG", "doSaveButtonClickApiCalling: $bodyData")
                val saveAddressResponse = useCase.saveAddress(
                    mxInternalErrorOccurred, bodyData,
                    SharedPrefManager.getInstance().loggedInUserId.toLong()
                )
                saveAddressResponse?.let {
                    if (it.statusCode == 200) {
                        newlyCreatedAddId = it.responseData.addressId ?: 0

                        if(!callSaveAddress){
                            if(SharedPrefManager.getInstance().addressId == addressItemList.value?.addressId){
                                callSaveAddress = true
                            }
                        }

                        if (callSaveAddress && SharedPrefManager.getInstance().incompleteOrderId > 0) {
                            saveAddressForOrder(
                                SharedPrefManager.getInstance().incompleteOrderId,
                                it.responseData.addressId ?: 0,
                                SharedPrefManager.getInstance().loggedInUserId
                            )
                        } else {
                            SharedPrefManager.getInstance().addressId = 0L
                            showMessage.postValue(
                                Event(
                                    MessageConstant(
                                        MESSAGES.ADD_ADDRESS_SUCCESSFULLY,
                                        it.message.toString()
                                    )
                                )
                            )
                        }

                        if (!isEditAddress) {


//                            if (userLocationClick && pinCodeEdited) {
//                                pincodeFillType = "Pincode typed"
//                                useLocationUsed = true
//                            } else if (pinCodeEdited) {
//                                pincodeFillType = "Pincode typed"
//                                useLocationUsed = false
//                            } else if (userLocationClick) {
//                                pincodeFillType = "Location used"
//                                useLocationUsed = true
//                            } else {
//                                pincodeFillType = "Already Filled"
//                                useLocationUsed = false
//                            }

                            /*addressList.value?.find { it2 -> it2?.addressId == saveAddressResponse.responseData.addressId }
                                ?.let { it3 ->*/
                            sendAddressAddedEvent(
                                MxAddressAdded(
                                    addressLine2Edited,
                                    typeOfAddress,
                                    city.value,
                                    cityEdited,
                                    clickedOnPage,
                                    if (SharedPrefManager.getInstance().incompleteOrderId == 0L)
                                        null
                                    else
                                        SharedPrefManager.getInstance().incompleteOrderId.toString(),
                                    pincode.value?.toInt(),
                                    pinCodeEdited,
                                    pincodeFillType,
                                    state.value,
                                    stateEdited,
                                    userLocationClick,
                                    SharedPrefManager.getInstance().selectedWarehouseID

                                )
                            )
                            //}
                        } else {
//                            var pincodeFillType = ""
//                            var useLocationUsed = false
//
//
//                            if (userLocationClick && pinCodeEdited) {
//                                pincodeFillType = "Pincode typed"
//                                useLocationUsed = true
//                            } else if (pinCodeEdited) {
//                                pincodeFillType = "Pincode typed"
//                                useLocationUsed = false
//                            } else if (userLocationClick) {
//                                pincodeFillType = "Location used"
//                                useLocationUsed = true
//                            } else {
//                                pincodeFillType = "Already Filled"
//                                useLocationUsed = false
//                            }

                            sendAddressEditedEvent(
                                MxAddressEdited(
                                    addressLine1Edited = addressItemList.value?.addressline1 != address.value,
                                    addressLine2Edited = addressItemList.value?.addressline2 != address2.value,
                                    addressTypeChanged = addressChangedFrom,
                                    cityEdited = addressItemList.value?.customerCity != city.value,
                                    clickedOnPage = clickedOnPage,
                                    landmarkEdited = addressItemList.value?.landmark != landMark.value,
                                    stateEdited = addressItemList.value?.customerState != state.value,
                                    whId = SharedPrefManager.getInstance().selectedWarehouseID
                                )
                            )
                        }
                    } else {
                        showMessage.postValue(
                            Event(
                                MessageConstant(
                                    MESSAGES.ADD_ADDRESS_FAILED,
                                    it.message.toString()
                                )
                            )
                        )
                    }
                    hideLoader()
                }

            }
        } else
            showMessage.postValue(
                Event(
                    MessageConstant(
                        MESSAGES.NO_NETWORK
                    )
                )
            )
    }

    fun deleteAddressApiCalling() {
        showMessage.postValue(
            Event(
                MessageConstant(
                    MESSAGES.DELETE_ADDRESS_API_CALLING
                )
            )
        )
    }

    fun deleteAddress(addressId: String, customerId: Long) {
        viewModelScope.launch(IO) {
            showLoader()
            val responseMsg = useCase.deleteAddress(mxInternalErrorOccurred, addressId, customerId)
            responseMsg?.let {
                if (!responseMsg.isSuccess) {
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.ADDRESS_DELETED_UNSUCCESSFULLY, it.message.toString()
                            )
                        )
                    )
                } else {
                    if (SharedPrefManager.getInstance().addressId == addressId.toLong()) {
                        SharedPrefManager.getInstance().address = ""
                        SharedPrefManager.getInstance().addressType = ""
                        SharedPrefManager.getInstance().pincode = 400079
                        SharedPrefManager.getInstance().addressId = -1
                    }
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.ADDRESS_REMOVED_SUCCESSFULLY, it.message.toString()
                            )
                        )
                    )
                }
                hideLoader()
            }
        }
    }

    fun initContext(mContext: Context) {
        context = mContext
    }

    private fun isAllFieldsValidate(): Boolean {
        requestFocus.value = 0
        var isValid = true
        if (!isPinCodeGet) {
            isValid = false
            if (!validator.isPinCodeEntered(pincode.value.toString())) {
                pincodeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterPinCode),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
            } else if (!validator.isValidPinCode(pincode.value.toString())) {
                pincodeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterValidPinCode),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
            }
        } else {
            if (!validator.isPinCodeEntered(pincode.value.toString())) {
                pincodeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterPinCode),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
                return false
            } else if (!validator.isValidPinCode(pincode.value.toString())) {
                pincodeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterValidPinCode),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
                return false
            } else {
                if (!isPincodeServicable.value!!) {
                    //  pincodeData.postValue(ErrorMessageData(context.getString(R.string.do_not_deliver_location), InputFieldConstants.STATE_ERROR))
                    isValid = false
                    return false
                }
            }
            if (!validator.isValidAddress(address.value.toString())) {
                if (requestFocus.value == 0) requestFocus.value = 2
                addressData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterAddress),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
            }
            if (!validator.isValidAddress(address2.value.toString())) {
                if (requestFocus.value == 0) requestFocus.value = 3
                address2Data.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterLocality),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
            }
            if (!validator.isValidCityState(city.value.toString())) {
                if (requestFocus.value == 0) requestFocus.value = 4
                cityData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterCity),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
            }
            if (!validator.isValidCityState(state.value.toString())) {
                if (requestFocus.value == 0) requestFocus.value = 5
                stateData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.enterState),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
            }
//todo validate other
            if (chipTypeSelected.value == 3 && other.value.isNullOrEmpty()) {
                if (requestFocus.value == 0) requestFocus.value = 6
                otherError.postValue(
                    ErrorMessageData(
                        context.getString(R.string.please_enter_details),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
            } else if (chipTypeSelected.value?.let { validator.isValidAddressType(it) }!!) {
                if (requestFocus.value == 0) requestFocus.value = 6
                chipData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.select_address_type),
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
            } else if (other.value != null && chipTypeSelected.value == 3 && !validator.otherText(
                    other.value!!
                )
            ) {
                if (requestFocus.value == 0) requestFocus.value = 6
                otherError.postValue(
                    ErrorMessageData(
                        "Special characters are not allowed.",
                        InputFieldConstants.STATE_ERROR
                    )
                )
                isValid = false
            }
        }
        return isValid
    }

    open fun onSelectLocationClicked() {
        apiType = 2
        if (isNetworkAvailable(context)) {
            userLocationClick = true
            pincodeFillType = "Location used"
            showMessage.postValue(
                Event(
                    MessageConstant(
                        MESSAGES.USER_CURRENT_LOCATION_CLICK
                    )
                )
            )

        } else
            showMessage.postValue(
                Event(
                    MessageConstant(
                        MESSAGES.NO_NETWORK
                    )
                )
            )
    }

    fun fetchPincodeAvailablility(pincode: String?, fromLocationClick: Boolean) {
        viewModelScope.launch(IO) {
            val response =
                homePageUseCase.checkPinCodeServiceability(mxInternalErrorOccurred, pincode)
            updateData(response, pincode, fromLocationClick)
        }
    }

    private fun updateData(
        response: PinCodeServiceabilityResponse?,
        pincode: String?,
        fromLocationClick: Boolean
    ) {
        if (response == null) {
            pincodeData.postValue(
                ErrorMessageData(
                    context.getString(R.string.do_not_deliver_location),
                    InputFieldConstants.STATE_ERROR
                )
            )
            if (fromLocationClick) {
                sendUseLocationClickedEvent(
                    MxUseLocationClicked(
                        clickedOnPage = "AddressDetailPage",
                        pincodeFetched = false,
                        pincodeFetchedResponse = "failed",
                        serviceable = false,
                        whId = SharedPrefManager.getInstance().selectedWarehouseID,
                        order_id = if (SharedPrefManager.getInstance().incompleteOrderId > 0) SharedPrefManager.getInstance().incompleteOrderId.toString() else null
                    )
                )
            }
        } else if (response.statusCode == 400) {
            pincodeData.postValue(
                ErrorMessageData(
                    response.message.toString(),
                    InputFieldConstants.STATE_ERROR
                )
            )

            if (fromLocationClick) {
                sendUseLocationClickedEvent(
                    MxUseLocationClicked(
                        clickedOnPage = "AddressDetailPage",
                        order_id = if (SharedPrefManager.getInstance().incompleteOrderId > 0) SharedPrefManager.getInstance().incompleteOrderId.toString() else null,
                        pincodeFetched = false,
                        pincodeFetchedResponse = "failed",
                        serviceable = false,
                        whId = SharedPrefManager.getInstance().selectedWarehouseID
                    )
                )
            }
        } else {
            val city = response.responseData.pincodeData?.get(0)?.city
            val state1 = response.responseData.pincodeData?.get(0)?.state
            val state = state1?.substring(0, 1)?.toUpperCase() + state1?.substring(1)?.toLowerCase()


//            if (!isEditCaseWithCityStateAvailable) {
//                this.city.postValue(response.responseData.pincodeData?.get(0)?.city)
//                //  this.state.postValue(response.pincodeData?.get(0)?.state)
//                this.state.postValue(state)
//            }

            if (city != null && state != null) {
                if (city.isNotEmpty() && state.isNotEmpty()) {
                    this._addressItemList.value?.cityName = city
                    this._addressItemList.value?.stateName = state
                    this._addressItemList.postValue(_addressItemList.value)
                    cityTxt = city
                    stateTxt = state
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.ADD_ADDRESS_CITY_STATE_FROM_LOCATION
                            )
                        )
                    )
                }
                if (fromLocationClick) {
                    sendUseLocationClickedEvent(
                        MxUseLocationClicked(
                            userTypeAddressLine2,
                            city,
                            "AddressDetailPage",
                            pincode,
                            true,
                            "success",
                            response.responseData.isServicable == true,
                            state,
                            order_id = if (SharedPrefManager.getInstance().incompleteOrderId > 0) SharedPrefManager.getInstance().incompleteOrderId.toString() else null
                        )
                    )
                }
            }
            if (response.responseData.isServicable == false) {
                pincodeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.pincode_unservicable),
                        InputFieldConstants.STATE_WARNING
                    )
                )
            } else {
                pincodeData.postValue(
                    ErrorMessageData(
                        context.getString(R.string.we_deliver_to_this_location),
                        InputFieldConstants.STATE_SUCCESS
                    )
                )
            }
            this.isPincodeServicable.postValue(response.responseData.isServicable)
            /*var isServiceable = false
            for (item in response.clickpostPincodeData?.result!!) {
                if (item?.serviceable?.COD!! && item.serviceable.PREPAID!!) {
                    isServiceable = true
                    break
                }
            }
            this.isPincodeServicable.postValue(isServiceable)
            if (isServiceable) {
                pincodeData.postValue(ErrorMessageData(context.getString(R.string.we_deliver_to_this_location), InputFieldConstants.STATE_SUCCESS));
            } else {
                pincodeData.postValue(ErrorMessageData(context.getString(R.string.do_not_deliver_location), InputFieldConstants.STATE_ERROR));
            }

             */
        }
    }

    fun showLoader() {
        isLoading.postValue(true)
    }

    fun hideLoader() {
        isLoading.postValue(false)
    }


    private fun saveAddressForOrder(orderId: Long, addressId: Long, customerId: String) {
        showLoader()
        viewModelScope.launch(Dispatchers.IO) {
            val saveAddressResponse =
                async {
                    orderFlowUseCase.saveAddressForOrder(
                        mxInternalErrorOccurred, orderId,
                        addressId,
                        customerId
                    )
                }.await()
            saveAddressResponse?.let {
                if (it == NetworkResponseType.SUCCESS.ordinal) {
                    SharedPrefManager.getInstance().addressId = addressId
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.ADD_ADDRESS_SUCCESSFULLY,
                                "Address updated successfully"
                            )
                        )
                    )
                } else if (it == NetworkResponseType.BADREQUEST.ordinal) {
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.ADD_ADDRESS_BAD_REQUEST,
                                "Sorry. We currently do not service this pincode. Please check again in few weeks"
                            )
                        )
                    )
                } else {
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.ADD_ADDRESS_FAILED,
                                "Address update failed"
                            )
                        )
                    )
                }
            }
            hideLoader()

            /*else {
                    showLoading.postValue(false)
                    productList.postValue(Collections.emptyList())
                }*/
        }
    }

    private fun getAddressJsonObj(): JsonObject? {
        if (chipTypeSelected.value == 3 && other.value.isNullOrEmpty()) {
            otherError.postValue(
                ErrorMessageData(
                    context.getString(R.string.enterOtherAddressExist),
                    InputFieldConstants.STATE_ERROR
                )
            )
            return null
        } else {

            when (chipTypeSelected.value) {
                1 -> {
                    typeOfAddress = "Home"
                }

                2 -> {
                    typeOfAddress = "Office"
                }

                3 -> {
                    typeOfAddress = other.value!!.ifEmpty { "other" }
                }
            }

            val addressObj = JsonObject()
            addressObj.addProperty("addressType", typeOfAddress.trim()?.replace("\\s+".toRegex(), " "))
            addressObj.addProperty("addressline1", address.value?.replace("\\s+".toRegex(), " "))
            addressObj.addProperty("addressline2", address2.value?.replace("\\s+".toRegex(), " "))
            addressObj.addProperty("landmark", landMark.value?.replace("\\s+".toRegex(), " "))
            addressObj.addProperty("pincode", pincode.value)
            addressObj.addProperty("isAppEdit", true)
            addressObj.addProperty("addressId", addressItemList.value?.addressId)

            /* if (addressIdToUpdate != null) {
                 addressObj.addProperty("addressId", addressModel?.addressId?.trim())
             } else {
                 addressObj.addProperty("addressId", "")
             }*/
            /*  if (!SharedPrefManager.getInstance().getPrefAddressExperimentVariant()
                      .equals(Constants.ADDRESS_EXPERIMENT_VARIANT_A)
              ) {
                  addressObj.addProperty("customerCity", customerCity)
                  addressObj.addProperty("customerState", customerState)
              }*/
            addressObj.addProperty("customerCity", city.value?.replace("\\s+".toRegex(), " "))
            addressObj.addProperty("customerState", state.value?.replace("\\s+".toRegex(), " "))
            Log.d("TAG", "getAddressJsonObj: " + Gson().toJson(addressObj))

            return addressObj
        }

    }

    fun getPatientExperiment() {
        viewModelScope.launch(IO) {
            /*var patientExp =
                localDbUseCase.getCustomerCategory(UserCategoryEnum.PATIENT_EXPERIMENT.apiCategoryType)

            if (patientExp.isEmpty())
                patientExp = "A"*/

            patientExperiment.postValue("B")//patientExp
        }
    }

    fun sendAddressAddedEvent(mxAddressAdded: MxAddressAdded) {
        sdkEventUseCase.sendAddressAddedEvent(mxAddressAdded)
    }

    fun sendAddressEditedEvent(mxAddressEdited: MxAddressEdited) {
        sdkEventUseCase.sendAddressEditedEvent(mxAddressEdited)
    }

    fun sendUseLocationClickedEvent(mxModel: MxUseLocationClicked) {
        sdkEventUseCase.sendUseLocationClickedEvent(mxModel)
    }

    fun sendAddAddressClickedEvent(mxAddAddressClicked: MxAddAddressClicked) {
        sdkEventUseCase.sendAddAddressClickedEvent(mxAddAddressClicked)
    }

    fun updateAddressType(type: AddressType) {
        addressChangedFrom = when(type){
            AddressType.OFFICE -> getAddressTransition().plus("office")
            AddressType.HOME -> getAddressTransition().plus("home")
            AddressType.OTHER -> getAddressTransition().plus("other")
        }

    }

    private fun getAddressTransition(): String {
        return if (addressItemList.value?.addressType?.equals("home", true) == true) {
            "home_to_"
        } else if (addressItemList.value?.addressType?.equals("office", true) == true) {
            "office_to_"
        } else {
            "other_to_"
        }
    }
}