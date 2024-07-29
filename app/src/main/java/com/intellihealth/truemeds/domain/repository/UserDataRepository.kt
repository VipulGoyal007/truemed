package com.intellihealth.truemeds.domain.repository

import com.example.example.CustomerDeviceInfoRequest
import com.example.example.EventIdForCustomerRequest
import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.CustomerDeliveryChargeDataResponse
import com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.model.user.NameValidationResponse
import com.intellihealth.truemeds.data.model.user.SaveAddressResponse
import com.intellihealth.truemeds.data.model.user.SavePatientResponse
import com.intellihealth.truemeds.data.model.user.UpdateProfileResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.model.CustomerDetails
import com.intellihealth.truemeds.domain.model.PatientDetails
import okhttp3.ResponseBody
import retrofit2.Response

interface UserDataRepository {
    /**
     * This service save customer device information ie deviceModel,manufacturerName,osVersion,customerId etc...
     ***/
    suspend fun setCustomerDeviceInfo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        addressObj: CustomerDeviceInfoRequest
    ): Resource<Response<ResponseBody>>

    /**
     *This service save customer device GoogleAdId,sdkVersion,customerId,sdkSource etc..
     * **/
    suspend fun setEventIdForCustomer(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        jsonArray: List<EventIdForCustomerRequest>
    ): Resource<Response<ResponseBody>>

    /**
     * This service save customer GoogleAdId and Firebase id
     */
    suspend fun saveAaIdAndFcm(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long?,
        aaid: String,
        deviceKey: String?,
    ): Resource<Response<ResponseBody>>

    suspend fun updateProfile(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        nameObj: CustomerDetails,
        customerId: Long
    ): Resource<Response<UpdateProfileResponse>>

    /**
     * This service save customer address that customer enter data from address detail
     * This used for Edit address also
     * **/
    suspend fun saveAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        addressObj: JsonObject?, customerId: Long?
    ): Resource<Response<SaveAddressResponse>>

    /**
     * This service use for delete address
     * **/
    suspend fun deleteAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        addressId: String, customerId: Long
    ): Resource<Response<ApiCoreResponse>>?

    /**
     * Fetch all saved customer address
     * **/
    suspend fun getAllAddresses(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long?
    ): Resource<Response<GetAllAddressResponse>>

    /**
     *This service create and save patient with patientName,age,gender,relationId,patientId..in object
     * **/
    suspend fun addPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long?,
    ): Resource<Response<SavePatientResponse>>

    /**
     * update profile for fresh user
     * **/
    suspend fun updateProfileForFreshUser(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long
    ): Resource<Response<UpdateProfileResponse>>


    /**
     *This service edit patient with patientName,age,gender,relationId,patientId..in object
     * **/
    suspend fun editPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long?,
        patientId: Long?
    ): Resource<Response<SavePatientResponse>>


    /**
     * This service use for delete patient
     * **/
    suspend fun deletePatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientId: String?, customerId: Long?
    ): Resource<Response<ApiCoreResponse>>

    /**
     * This service provides all patient list of customer
     * **/
    suspend fun getAllPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        showMyself: Boolean?, customerId: Long?
    ): Resource<Response<GetAllPatientResponse>>

    /**
     * This service provides patient details using patient id
     * **/
    suspend fun getPatientById(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientId: String?, orderId: Long?
    ): Resource<Response<ResponseBody>>

    /**
     * This service provides customer details using customer id
     * **/
    suspend fun getCustomerDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long?
    ): Resource<Response<CustomerDetailsResponse>>

    /**
     * This service provides customer and order details
     * Live orders, incomplete order id, list of all variants for the users comes in this api
     * **/

    suspend fun getCustomerAndOrderDetailsForHome(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long?,
    ): Resource<Response<CustomerHomeDetailsResponseModel>>

    /**
     * This service provides data to check is user got TM Rewards by referral's successful delivered order
     */
    /*suspend fun getOrderTrackOnHome(
        customerId: Long?
    ): Resource<Response<OrderTrackOnHome>>*/

    /**
     * This service provides customer order number based delivery charge and minimum cart value data
     */
    suspend fun getCustomerDeliveryCharge(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long?
    ): Resource<Response<CustomerDeliveryChargeDataResponse>>

    /**
     * This service generate new token
     */
    suspend fun generateNewToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        mobileOtpRequest: JsonObject?,
        source: String?,
    ): Resource<Response<ResponseBody?>>?

    /**
     * This service creates customer category for variant
     * **/
    suspend fun setCustomerCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        category: String,
        categoryType: String,
        sourceVersion: String
    ): Resource<Response<CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category?>>?

    /**
     * This service deactivate category for variant
     * **/
    suspend fun deactivateCustomerCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        categoryId: Long
    ): Resource<Response<ResponseBody>>

    suspend fun getNameValidationList(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        typeList: ArrayList<String>
    ): Resource<Response<NameValidationResponse>>

    suspend fun saveVariantInfo(
        saveVariantInfoRequest: SaveVariantInfoRequest,
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): Resource<Response<SaveVariantInfoResponse>>

    suspend fun updateVariantInfo(
        saveVariantInfoRequest: SaveVariantInfoRequest,
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): Resource<Response<SaveVariantInfoResponse>>
}