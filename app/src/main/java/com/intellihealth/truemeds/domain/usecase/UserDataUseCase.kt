package com.intellihealth.truemeds.domain.usecase

import android.util.Log
import com.example.example.CustomerDeviceInfoRequest
import com.example.example.EventIdForCustomerRequest
import com.facebook.share.Share
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel
import com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxExperimentStarted
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.CustomerDeliveryChargeDataResponse
import com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse
import com.intellihealth.truemeds.data.model.user.NameValidationResponse
import com.intellihealth.truemeds.data.model.user.SaveAddressResponse
import com.intellihealth.truemeds.data.model.user.SavePatientResponse
import com.intellihealth.truemeds.data.model.user.UpdateProfileResponse
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerCategory
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.data.utils.asciiWordSum
import com.intellihealth.truemeds.domain.enums.NetworkResponseType
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.domain.enums.UserCategoryServerEnum
import com.intellihealth.truemeds.domain.model.CustomerDetails
import com.intellihealth.truemeds.domain.model.PatientDetails
import com.intellihealth.truemeds.domain.repository.UserDataRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import org.json.JSONObject
import java.net.URL
import java.util.Scanner
import javax.inject.Inject


class UserDataUseCase @Inject constructor(
    private val localDbUseCase: LocalDbUseCase,
    private val userDataRepository: UserDataRepository,
    private val sdkEventUseCase: SdkEventUseCase
) {
    suspend fun getCustomerAndOrderDetailsForHome(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long
    ): CustomerHomeDetailsResponseModel? {
        var response: CustomerHomeDetailsResponseModel? = null
        when (val res = userDataRepository.getCustomerAndOrderDetailsForHome(
            mxInternalErrorOccurred, customerId
        )) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()
                    } else {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                        null
                    }
                }

            }

            is Resource.Failure -> null
            else -> null
        }
        return response
    }

    /**
     * This function is used to get the details of the customer
     * **/
    suspend fun getCustomerDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred, customerId: Long?
    ): CustomerDetailsResponse? {
        var response: CustomerDetailsResponse? = null
        when (val res =
            userDataRepository.getCustomerDetails(mxInternalErrorOccurred, customerId)) {
            is Resource.Success -> {
                res.value?.let {
                    response = it.body()
                    if (!it.isSuccessful) {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }
            }

            is Resource.Failure -> {

            }

            else -> {
            }
        }
        return response

    }

    suspend fun getInternetIp(): String {
        var publicIP = ""
        try {
            val s = Scanner(withContext(Dispatchers.IO) {
                URL("https://api.ipify.org").openStream()
            }, "UTF-8").useDelimiter("\\A")
            publicIP = s.next()
        } catch (ignore: java.lang.Exception) {
        }

        return publicIP
    }

    //suspend fun setCustomerDeviceInfo(addressObj: JsonObject): ResponseBody? =
    suspend fun setCustomerDeviceInfo(
        mxInternalErrorOccurred: MxInternalErrorOccurred, addressObj: CustomerDeviceInfoRequest
    ): ResponseBody? =
        when (val res = userDataRepository.setCustomerDeviceInfo(
            mxInternalErrorOccurred, addressObj
        )) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }

            is Resource.Failure -> null
            else -> null
        }

    suspend fun saveAaIdAndFcm(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long?,
        aaid: String,
        deviceKey: String?
    ): ResponseBody? =
        when (val res = userDataRepository.saveAaIdAndFcm(
            mxInternalErrorOccurred, customerId, aaid, deviceKey
        )) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }

            is Resource.Failure -> null
            else -> null
        }

    suspend fun setEventIdForCustomer(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        jsonArray: List<EventIdForCustomerRequest>
    ): ResponseBody? =
        when (val res =
            userDataRepository.setEventIdForCustomer(mxInternalErrorOccurred, jsonArray)) {
            is Resource.Success -> if (res.value?.isSuccessful == true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }

            is Resource.Failure -> null
            else -> null
        }


    suspend fun getCustomerCategoryDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ) {
        val response =
            getCustomerAndOrderDetailsForHome(
                mxInternalErrorOccurred,
                SharedPrefManager.getInstance().loggedInUserId.toLong()
            )

        if (response != null) {
            SharedPrefManager.getInstance().isFtc = response.responseData?.isFtc ?: true
            setupUserCategory(
                mxInternalErrorOccurred,
                response.responseData?.customerDetails?.categoryList,
                (response.responseData?.prevDeliveredAddressId ?: 0) > 0
            )

            if (SharedPrefManager.getInstance().addressId == 0L) {
                response.responseData?.prevDeliveredAddressId?.let { addressId ->
                    SharedPrefManager.getInstance().addressId = addressId
                }
            }
            if (SharedPrefManager.getInstance().patientId == 0L) {
                response.responseData?.prevDeliveredPatientId?.let { patientId ->
                    SharedPrefManager.getInstance().patientId = patientId
                }
            }
        }
    }


    suspend fun setupUserCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerCategoryList: List<CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category>?,
        hasDeliveredOrder: Boolean
    ) {
        UserCategoryEnum.entries.forEach { userCategoryEnum ->
            try {
                val userCategoryItem: CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category? =
                    customerCategoryList?.filter { userCategory ->
                        userCategory.categoryType == userCategoryEnum.apiCategoryType
                    }?.run { if (isNotEmpty()) this[0] else null }

                var variantId: Long = 0L
                var variant = ""
                userCategoryItem?.let {
                    variantId = userCategoryItem.id
                    variant = userCategoryItem.category ?: ""
                    if (variantId > 0) {
                        if (userCategoryEnum.isExperimentConcluded) {
                            deactivateCustomerCategory(mxInternalErrorOccurred, variantId)
                        } else {
                            if (variant.isEmpty()) {
                                //deactivate variant
                                deactivateCustomerCategory(
                                    mxInternalErrorOccurred,
                                    userCategoryItem.id
                                )
                                //reset variant in shared pref
//                            UserDataUtil.setVariantInSharedPreference(userCategoryEnum, -1, "")
                                localDbUseCase.deleteOfflineDbData(userCategoryEnum.apiCategoryType)
                                variantId = 0
                                variant = ""
                            } else {
                                localDbUseCase.deleteOfflineDbData(userCategoryEnum.apiCategoryType)
                                val customerCategory = CustomerCategory(
                                    variantId,
                                    userCategoryEnum.apiCategoryType,
                                    variant
                                )
                                localDbUseCase.addVariant(customerCategory)
                                setAlgoSpecificData(userCategoryItem)
                            }
                        }
                    }
                }

                if (!userCategoryEnum.isExperimentConcluded) {
                    //create experiment variant
                    if (variantId == 0L && userCategoryEnum.createVariantPostLogin) {
                        var shouldCreateExperiment = true;

                        when (userCategoryEnum) {

                            /*UserCategoryEnum.REORDER_DESIGN_EXPERIMENT -> {
                                if (!hasDeliveredOrder) {
                                    shouldCreateExperiment = false
                                }
                            }*/

                            UserCategoryEnum.FTC_DYNAMIC_DISCOUNT -> {
                                if (SharedPrefManager.getInstance().isFtc && !SharedPrefManager.getInstance().isLoginSkipped) {
                                    if (customerCategoryList.isNullOrEmpty()) {
                                        variant = ""
                                    } else {
                                        //check if NFTC DynamicDiscount variant exists
                                        val nftcDynamicDiscountVariant =
                                            customerCategoryList.filter { userCategory ->
                                                userCategory.categoryType == UserCategoryEnum.NFTC_DYNAMIC_DISCOUNT.apiCategoryType
                                            }
                                        val traditionalBaseDiscountVariant =
                                            customerCategoryList.filter { userCategory ->
                                                userCategory.categoryType == UserCategoryEnum.TRADITIONAL_BASE_DISCOUNT.apiCategoryType
                                            }
                                        if (nftcDynamicDiscountVariant.isEmpty() && traditionalBaseDiscountVariant.isEmpty()) {
                                            //in next step variant will be fetched from firebase
                                            variant = ""
                                        } else if (nftcDynamicDiscountVariant.isNotEmpty()) {
                                            //set NFTC DynamicDiscount variant as FTC DynamicDiscount variant
                                            variant = nftcDynamicDiscountVariant[0].category ?: ""
                                        }
                                    }
                                } else {
                                    shouldCreateExperiment = false;
                                }
                            }

                            UserCategoryEnum.NFTC_DYNAMIC_DISCOUNT -> {
                                if (!SharedPrefManager.getInstance().isFtc && !SharedPrefManager.getInstance().isLoginSkipped) {
                                    if (customerCategoryList.isNullOrEmpty()) {
                                        variant = ""
                                    } else {
                                        //check if FTC DynamicDiscount variant exists
                                        val ftcDynamicDiscountVariant =
                                            customerCategoryList.filter { userCategory ->
                                                userCategory.categoryType == UserCategoryEnum.FTC_DYNAMIC_DISCOUNT.apiCategoryType
                                            }
                                        val traditionalBaseDiscountVariant =
                                            customerCategoryList.filter { userCategory ->
                                                userCategory.categoryType == UserCategoryEnum.TRADITIONAL_BASE_DISCOUNT.apiCategoryType
                                            }
                                        if (ftcDynamicDiscountVariant.isEmpty() && traditionalBaseDiscountVariant.isEmpty()) {
                                            //in next step variant will be fetched from firebase
                                            variant = ""
                                        } else if (ftcDynamicDiscountVariant.isNotEmpty()) {
                                            //set FTC DynamicDiscount variant as NFTC DynamicDiscount variant
                                            variant = ftcDynamicDiscountVariant[0].category ?: ""
                                        }
                                    }
                                } else {
                                    shouldCreateExperiment = false;
                                }
                            }

                            UserCategoryEnum.TRADITIONAL_BASE_DISCOUNT -> {
                                if (SharedPrefManager.getInstance().isLoginSkipped) {
                                    if (customerCategoryList.isNullOrEmpty()) {
                                        variant = "A"
                                    } else {
                                        //check if FTC DynamicDiscount variant exists
                                        val ftcDynamicDiscountVariant =
                                            customerCategoryList.filter { userCategory ->
                                                userCategory.categoryType == UserCategoryEnum.FTC_DYNAMIC_DISCOUNT.apiCategoryType
                                            }
                                        //check if NFTC DynamicDiscount variant exists
                                        val nftcDynamicDiscountVariant =
                                            customerCategoryList.filter { userCategory ->
                                                userCategory.categoryType == UserCategoryEnum.NFTC_DYNAMIC_DISCOUNT.apiCategoryType
                                            }
                                        if (ftcDynamicDiscountVariant.isEmpty() && nftcDynamicDiscountVariant.isEmpty()) {
                                            //no firebase experiment for Traditional Base Discount
                                            variant = "A"
                                        } else {
                                            shouldCreateExperiment = false;
                                        }
                                    }
                                } else {
                                    shouldCreateExperiment = false;
                                }
                            }

                            UserCategoryEnum.GENERIC_CAP_DISCOUNT -> {
                                variant = ""
                                variant = try {
                                    localDbUseCase.getCustomerCategory(userCategoryEnum.apiCategoryType)
                                } catch (e: java.lang.Exception) {
                                    ""
                                }
                            }

                            else -> {}
                        }

                        //setCustomerCategory on server
                        if (shouldCreateExperiment)
                            setCustomerCategory(
                                mxInternalErrorOccurred,
                                userCategoryEnum = userCategoryEnum,
                                ipVariant = variant,
                                sourceVersion = "TM_ANDROID_V_" + BuildConfig.VERSION_NAME
                            )
                    }
                }
            } catch (ex: Exception) {
                ex.message
            }
        }

    }

    private suspend fun setAlgoSpecificData(userCategoryItem: CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category) {

        val genericDiscountVariantId =
            localDbUseCase.getCustomerCategoryId(UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType)
        if (genericDiscountVariantId < 1 || userCategoryItem.categoryType == UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType) {
            if (SharedPrefManager.getInstance().isFtc && !SharedPrefManager.getInstance().isLoginSkipped
                && userCategoryItem.categoryType == UserCategoryEnum.FTC_DYNAMIC_DISCOUNT.apiCategoryType
            ) {

                SharedPrefManager.getInstance().algoSpecificVariantId =
                    userCategoryItem.additionalProperties?.get(0)?.id

                var baseDiscountJson = userCategoryItem.additionalProperties
                    ?.get(0)?.value?.replace("\\\"", "")?.let { JSONObject(it) }
                if (baseDiscountJson != null) {
                    SharedPrefManager.getInstance().baseDiscount =
                        baseDiscountJson.getInt("baseDiscount")
                }
            } else if (!SharedPrefManager.getInstance().isFtc && !SharedPrefManager.getInstance().isLoginSkipped
                && userCategoryItem.categoryType == UserCategoryEnum.NFTC_DYNAMIC_DISCOUNT.apiCategoryType
            ) {
                SharedPrefManager.getInstance().algoSpecificVariantId =
                    userCategoryItem.additionalProperties?.get(0)?.id
                Log.i(
                    "basediscount", "" + userCategoryItem.additionalProperties
                        ?.get(0)?.value?.replace("\\\"", "")
                )
                var baseDiscountJson = userCategoryItem.additionalProperties
                    ?.get(0)?.value?.replace("\\\"", "")?.let { JSONObject(it) }
                if (baseDiscountJson != null) {
                    SharedPrefManager.getInstance().baseDiscount =
                        baseDiscountJson.getInt("baseDiscount")
                }
            } else if (SharedPrefManager.getInstance().isLoginSkipped
                && userCategoryItem.categoryType == UserCategoryEnum.TRADITIONAL_BASE_DISCOUNT.apiCategoryType
            ) {
                SharedPrefManager.getInstance().algoSpecificVariantId =
                    userCategoryItem.additionalProperties?.get(0)?.id
                Log.i(
                    "basediscount", "" + userCategoryItem.additionalProperties
                        ?.get(0)?.value?.replace("\\\"", "")
                )
                var baseDiscountJson = userCategoryItem.additionalProperties
                    ?.get(0)?.value?.replace("\\\"", "")?.let { JSONObject(it) }
                if (baseDiscountJson != null) {
                    SharedPrefManager.getInstance().baseDiscount =
                        baseDiscountJson.getInt("baseDiscount")
                }
            } else if (userCategoryItem.categoryType == UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType) {
                SharedPrefManager.getInstance().algoSpecificVariantId =
                    userCategoryItem.additionalProperties?.get(0)?.id
                var baseDiscountJson = userCategoryItem.additionalProperties
                    ?.get(0)?.value?.replace("\\\"", "")?.let { JSONObject(it) }
                if (baseDiscountJson != null) {
                    SharedPrefManager.getInstance().baseDiscount =
                        baseDiscountJson.getInt("baseDiscount")
                }
            }
        }
    }

    private suspend fun deactivateCustomerCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred, categoryId: Long
    ) {
        try {
            userDataRepository.deactivateCustomerCategory(
                mxInternalErrorOccurred, categoryId
            )
        } catch (_: Exception) {
        }
    }

    suspend fun setCustomerCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        userCategoryEnum: UserCategoryEnum,
        ipVariant: String,
        sourceVersion: String
    ) {
        try {
            var variantToCreate = ipVariant
            if (variantToCreate.isEmpty())
                variantToCreate =
                    getVariantFromFirebase(userCategoryEnum.firebaseParameterKey)

            if (variantToCreate.isNotEmpty())
                when (val res = userDataRepository.setCustomerCategory(
                    mxInternalErrorOccurred,
                    variantToCreate,
                    userCategoryEnum.apiCategoryType,
                    sourceVersion
                )) {
                    is Resource.Success -> {
                        val customerCategoryResponse: CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category? =
                            res.value?.body()

                        if (customerCategoryResponse != null) {
                            setAlgoSpecificData(customerCategoryResponse)
                            localDbUseCase.deleteOfflineDbData(userCategoryEnum.apiCategoryType)
                            val customerCategory = customerCategoryResponse?.let {
                                CustomerCategory(
                                    customerCategoryResponse.id,
                                    userCategoryEnum.apiCategoryType,
                                    it.category ?: ""
                                )
                            }

                            //GENERIC_CAP_DISCOUNT experiment should not be triggered here as it is already triggered when variant is created for the device
                            if (userCategoryEnum.apiCategoryType != UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType) {
                                sdkEventUseCase.sendExperimentStartedEvent(
                                    MxExperimentStarted(
                                        asciiWordSum(userCategoryEnum.firebaseParameterKey),
                                        userCategoryEnum.firebaseParameterKey,
                                        customerCategoryResponse.id,
                                        customerCategoryResponse.category
                                    )
                                )
                            }


                            if (customerCategory != null)
                                localDbUseCase.addVariant(customerCategory)
                        }
                    }

                    is Resource.Failure -> {}
                    else -> {}
                }
        } catch (_: Exception) {
        }
    }


    /**
     * This method will fetch variant from firebase
     */
    private suspend fun getVariantFromFirebase(firebaseParameterKey: String): String {
        try {
            val remoteConfig = FirebaseRemoteConfig.getInstance()
            val configSettings = FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(0)
                .build()
            remoteConfig.setConfigSettingsAsync(configSettings).await()
            remoteConfig.setDefaultsAsync(R.xml.remote_config_defaults).await()
            remoteConfig.fetchAndActivate().await()

            return remoteConfig.getString(firebaseParameterKey)
        } catch (_: Exception) {
            return ""
        }
    }

    suspend fun getCustomerDeliveryCharge(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long
    ): CustomerDeliveryChargeDataResponse? =
        when (val res = userDataRepository.getCustomerDeliveryCharge(
            mxInternalErrorOccurred, customerId
        )) {
            is Resource.Success -> res.value?.body()
            is Resource.Failure -> null
            else -> null
        }

    suspend fun getAllPatients(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        showMyself: Boolean,
        customerId: Long
    ): GetAllPatientResponse? =
        when (val res = userDataRepository.getAllPatient(
            mxInternalErrorOccurred, showMyself, customerId
        )) {
            is Resource.Success -> res.value?.body()
            is Resource.Failure -> null
            else -> null
        }


    fun saveDeliveryChargeAndBaseDiscount(response: CustomerDeliveryChargeDataResponse) {
        SharedPrefManager.getInstance().also {
            it.deliveryOnAmount = response.responseData.deliveryOnAmount
            it.deliveryCharge = response.responseData.deliveryCharge!!
            it.baseDiscount = response.responseData.baseDiscount!!
        }

        response.responseData.deliveryOnAmountSubs?.let {
            SharedPrefManager.getInstance().deliveryOnAmountSubs = it
        }
        response.responseData.deliveryChargeSubs?.let {
            SharedPrefManager.getInstance().deliveryChargeSubs = it
        }
    }


    suspend fun getAllAddresses(
        mxInternalErrorOccurred: MxInternalErrorOccurred, customerId: Long
    ): List<GetAllAddressResponse.ResponseObj?>? =
        when (val res = userDataRepository.getAllAddresses(mxInternalErrorOccurred, customerId)) {
            is Resource.Success -> {
                if ((res.value?.body()?.responseData?.size ?: 0) > 0) {
                    SharedPrefManager.getInstance().selectedState =
                        res.value?.body()?.responseData?.get(0)?.stateName ?: ""
                }
                res.value?.body()?.responseData
            }

            is Resource.Failure -> null
            else -> null
        }

    suspend fun deleteAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred, addressId: String, customerId: Long
    ): ApiCoreResponse? {
        return when (val res =
            userDataRepository.deleteAddress(mxInternalErrorOccurred, addressId, customerId)) {
            is Resource.Success -> {
                if (res.value?.isSuccessful == true) {
                    if (SharedPrefManager.getInstance().addressId > 0 &&
                        addressId == SharedPrefManager.getInstance().addressId.toString()
                    ) {
                        SharedPrefManager.getInstance().addressId = 0
                    }
                    res.value.body()
                } else {
                    val response = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ) ?: ApiCoreResponse()
                    response.isSuccess = false

                    try {
                        mxInternalErrorOccurred.errorCode = res.value?.code()
                        mxInternalErrorOccurred.errorStatement = response.message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                    } catch (_: Exception) {
                    }

                    response
                }
            }

            is Resource.Failure -> {
                var response = Gson().fromJson(
                    res.errorBody?.string(),
                    ApiCoreResponse::class.java
                ) ?: ApiCoreResponse()
                response.isSuccess = false

                response
            }

            else -> null
        }
    }


    suspend fun saveAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        jsonBody: JsonObject,
        customerId: Long
    ): SaveAddressResponse? {
        return when (val res =
            userDataRepository.saveAddress(mxInternalErrorOccurred, jsonBody, customerId)) {
            is Resource.Success -> {
                if (res.value?.isSuccessful == true) {
                    return res.value?.body()
                } else {
                    val response = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ) ?: ApiCoreResponse()
                    return SaveAddressResponse(
                        response.message ?: "Address update failed",
                        "failed",
                        response.statusCode,
                        SaveAddressResponse.ResponseData("", null)
                    )
                }
            }

            is Resource.Failure -> {
                val response = Gson().fromJson(
                    res.errorBody?.string(),
                    ApiCoreResponse::class.java
                ) ?: ApiCoreResponse()
                return SaveAddressResponse(
                    response?.message ?: "Something went wrong",
                    "exception",
                    response.statusCode,
                    SaveAddressResponse.ResponseData("", null)
                )
            }

            else -> return SaveAddressResponse(
                "Something went wrong",
                "exception",
                NetworkResponseType.EXCEPTION.ordinal,
                SaveAddressResponse.ResponseData("", null)
            )
        }
    }

    suspend fun getALlPatientList(
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): GetAllPatientResponse? =
        when (val res = userDataRepository.getAllPatient(mxInternalErrorOccurred, true, 19)) {
            is Resource.Success -> res.value?.body()
            is Resource.Failure -> null
            else -> null
        }

    suspend fun processPatientsResponse(response: GetAllPatientResponse): List<GetAllPatientResponse.Patient?>? {
        return response.PatientList
    }

    fun getPatientList(): MutableList<AddressPatientDetailsCardModel> {

        val list: MutableList<AddressPatientDetailsCardModel> = mutableListOf()
        for (i in 0..5) {
            if (i == 0) {
                val patientData = AddressPatientDetailsCardModel(
                    AddressPatientDetailsConstants.PATIENT_DETAILS_CARD,
                    "John Doe",
                    "Details", isProfileIcon = true, tag = "Myself"
                )
                list.add(patientData)
            } else {
                val patientData = AddressPatientDetailsCardModel(
                    AddressPatientDetailsConstants.PATIENT_DETAILS_CARD,
                    "Alex Carry",
                    "Details", isProfileIcon = true, tag = "Someone else"
                )
                list.add(patientData)
            }
        }

        return list

    }

    fun getAddressList(): MutableList<AddressPatientDetailsCardModel> {

        val list: MutableList<AddressPatientDetailsCardModel> = mutableListOf()
        for (i in 0..5) {
            val addressData = AddressPatientDetailsCardModel(
                AddressPatientDetailsConstants.ADDRESS_DETAILS_CARD,
                "Header",
                "B1 1601, The Address by Wadhwa, Ghatkopar, Mumbai 411004"
            )
            list.add(addressData)
        }
        return list

    }

    suspend fun updateProfile(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerDetail: CustomerDetails,
        customerId: Long
    ): UpdateProfileResponse? =
        when (val res =
            userDataRepository.updateProfile(mxInternalErrorOccurred, customerDetail, customerId)) {
            is Resource.Success -> res.value?.body()
            is Resource.Failure -> null
            else -> null
        }

    suspend fun addPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long
    ): SavePatientResponse? =
        when (val res =
            userDataRepository.addPatient(mxInternalErrorOccurred, patientDetails, customerId)) {
            is Resource.Success -> {
                if (res.value?.isSuccessful == true) {
                    res.value.body()
                } else {
                    val response = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ) ?: ApiCoreResponse()
                    SavePatientResponse(
                        response.message ?: "Patient update failed",
                        "failed",
                        response.statusCode,
                        false,
                        SavePatientResponse.ResponseData(null)
                    )
                }
            }

            is Resource.Failure -> {
                var response = Gson().fromJson(
                    res.errorBody?.string(),
                    ApiCoreResponse::class.java
                ) ?: ApiCoreResponse()
                SavePatientResponse(
                    response.message ?: "Something went wrong",
                    "exception",
                    response.statusCode,
                    false,
                    SavePatientResponse.ResponseData(null)
                )
            }

            else -> SavePatientResponse(
                "Something went wrong",
                "exception",
                NetworkResponseType.EXCEPTION.ordinal,
                false,
                SavePatientResponse.ResponseData(null)
            )
        }

    fun getSubCategoryTypeList(
        subList: MutableList<ChildCategoryModel>,
        category: String?
    ): ArrayList<GetAllSubCategoryTypeResponse.SubCategoryType> {
        var list = arrayListOf<GetAllSubCategoryTypeResponse.SubCategoryType>()
        subList.forEachIndexed { index, model ->
            if (model.categoryLevel3List.isNotEmpty()) {
                list.add(
                    GetAllSubCategoryTypeResponse.SubCategoryType(
                        model.id.toString(),
                        model.name,
                        "",
                        "",
                        false,
                        model.type,
                        model.collectionId,
                        index
                    )
                )
            }
            model.categoryLevel3List.forEachIndexed { position, level3 ->
                list.add(
                    GetAllSubCategoryTypeResponse.SubCategoryType(
                        id = model.id.toString(),
                        categoryName = model.name,
                        subCategoryId = level3.id.toString(),
                        subCategoryName = level3.name ?: "",
                        isSelected = false,
                        level = level3.type,
                        collectionId = model.collectionId,
                        position = index,
                    )
                )
            }
        }
        category?.let {
            val data = list.filter { it.categoryName == category }
            if (category != "All") list.clear()
            list.addAll(data)
        }
        return list
    }

    suspend fun getNameValidationList(
        mxInternalErrorOccurred: MxInternalErrorOccurred, typeList: ArrayList<String>
    ): NameValidationResponse? {
        var response: NameValidationResponse? = null
        when (val res =
            userDataRepository.getNameValidationList(mxInternalErrorOccurred, typeList)) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()
                    }
                }
            }

            is Resource.Failure -> {
            }

            else -> {

            }
        }
        return response

    }

    suspend fun checkNameExist(name: String): Int {
        return localDbUseCase.checkNameExist(name)
    }

    suspend fun saveVariantInfo(
        saveVariantInfoRequest: SaveVariantInfoRequest,
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        triggerExperimentStarted: Boolean
    ) {
        var response: SaveVariantInfoResponse? = null
        when (val res = userDataRepository.saveVariantInfo(
            saveVariantInfoRequest, mxInternalErrorOccurred
        )) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()
                        response?.responseData?.experimentMapping?.mapIndexed { index, data ->
                            localDbUseCase.deleteOfflineDbData(data.experimentName)
                            localDbUseCase.addVariant(
                                CustomerCategory(
                                    id = localDbUseCase.getLastCustomerCategoryId() + 1,
                                    categoryType = data.experimentName ?: "",
                                    category = data.variant ?: "",
                                )
                            )
                            if ((data.variantId ?: 0) > 0
                                && data.experimentName == UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType
                            ) {

                                SharedPrefManager.getInstance().algoSpecificVariantId =
                                    data.variantId
                                if (triggerExperimentStarted) {
                                    sdkEventUseCase.sendExperimentStartedEvent(
                                        MxExperimentStarted(
                                            asciiWordSum(data.experimentName),
                                            data.experimentName,
                                            data.variantId,
                                            data.variant,
                                            if (SharedPrefManager.getInstance().loggedInUserAccessToken.isEmpty()) "pre-login" else "post-login"
                                        )
                                    )
                                }
                            }
                        }

                    } else {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                        null
                    }
                }

            }

            is Resource.Failure -> null
            else -> null
        }
    }

    suspend fun updateVariantInfo(
        saveVariantInfoRequest: SaveVariantInfoRequest,
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ) {
        var response: SaveVariantInfoResponse? = null
        when (val res = userDataRepository.updateVariantInfo(
            saveVariantInfoRequest, mxInternalErrorOccurred
        )) {
            is Resource.Success -> {
            }

            is Resource.Failure -> null
            else -> null
        }
    }

    private suspend fun getMissingVariant(): List<UserCategoryServerEnum> {
        val enumList =
            UserCategoryServerEnum.entries.map { category -> category.apiCategoryType }.subtract(
                localDbUseCase.getAllCustomerCategory().toSet()
            )

        return UserCategoryServerEnum.entries.filter { it.apiCategoryType in enumList }
    }

    suspend fun setVariantInfo(
        sessionToken: String,
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ) {
        //check offline missing variant
        var missingVariant = getMissingVariant()

        //get variant info from api
        val experimentMappings: ArrayList<SaveVariantInfoRequest.ExperimentMapping> = arrayListOf()
        missingVariant.map { variant ->
            experimentMappings.add(
                SaveVariantInfoRequest.ExperimentMapping(
                    variant.apiCategoryType,
                    null
                )
            )
        }
        callSaveVariantInfoApi(experimentMappings, sessionToken, mxInternalErrorOccurred, false)

        //check offline missing variant after sync with api
        missingVariant = getMissingVariant()
        experimentMappings.clear()

        //set variant info
        missingVariant.map { variant ->
            val firebaseVariant = getVariantFromFirebase(variant.firebaseParameterKey)
            if (firebaseVariant.isNotEmpty())
                experimentMappings.add(
                    SaveVariantInfoRequest.ExperimentMapping(
                        variant.apiCategoryType,
                        firebaseVariant
                    )
                )
        }

        if (experimentMappings.size > 0)
            callSaveVariantInfoApi(experimentMappings, sessionToken, mxInternalErrorOccurred, true)
    }

    private suspend fun callSaveVariantInfoApi(
        experimentMappings: ArrayList<SaveVariantInfoRequest.ExperimentMapping>,
        sessionToken: String,
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        triggerExperimentStarted: Boolean
    ) {
        if (experimentMappings.isNotEmpty()) {
            val saveVariantInfoRequest = SaveVariantInfoRequest(
                sessionToken = sessionToken,
                experimentMapping = experimentMappings
            )
            saveVariantInfo(
                saveVariantInfoRequest,
                mxInternalErrorOccurred, triggerExperimentStarted
            )
        }
    }

}