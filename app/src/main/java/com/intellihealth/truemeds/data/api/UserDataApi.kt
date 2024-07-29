package com.intellihealth.truemeds.data.api

import com.example.example.CustomerDeviceInfoRequest
import com.example.example.EventIdForCustomerRequest
import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse
import com.intellihealth.truemeds.data.model.user.*
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import com.intellihealth.truemeds.domain.model.CustomerDetails
import com.intellihealth.truemeds.domain.model.PatientDetails
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query


interface UserDataApi {
    @POST(ApiEndpointConstants.SAVE_CUSTOMER_DEVICE_INFO)
    suspend fun setCustomerDeviceInfo(
        @Header("Content-Type") contentType: String,
        @Body addressObj: CustomerDeviceInfoRequest?
    ): Response<ResponseBody>

    @POST(ApiEndpointConstants.SET_EVENT_ID_FOR_CUSTOMER)
    suspend fun setEventIdForCustomer(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization:String? ,
        @Body jsonArray: List<EventIdForCustomerRequest>
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.SAVE_AAID_OF_CUSTOMER)
    suspend fun saveAaIdAndFcm(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: Long?,
        @Query("aaid") aaid: String?,
        @Query("deviceKey") deviceKey: String?,
    ): Response<ResponseBody>

    @POST(ApiEndpointConstants.UPDATE_PROFILE_API)
    suspend fun updateProfile(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String,
        @Body nameObj: CustomerDetails?,
        @Query("customerId") customerId: Long,
    ): Response<UpdateProfileResponse>

    @POST(ApiEndpointConstants.SAVE_ADDRESS)
    suspend fun saveAddress(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Body addressObj: JsonObject?,
        @Query("customerId") customerId: Long?
    ): Response<SaveAddressResponse>

    @POST(ApiEndpointConstants.DELETE_ADDRESS)
    suspend fun deleteAddress(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("addressId") addressId: String,
        @Query("customerId") customerId: Long
    ): Response<ApiCoreResponse>

    @GET(ApiEndpointConstants.GET_ALL_ADDRESSES)
    suspend fun getAllAddresses(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: Long?
    ): Response<GetAllAddressResponse>

    @POST(ApiEndpointConstants.ADD_PATIENT)
    suspend fun addPatient(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Body patientDetails: PatientDetails,
        @Query("customerId") customerId: Long?,
    ): Response<SavePatientResponse>

    @POST(ApiEndpointConstants.ADD_PATIENT)
    suspend fun editPatient(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Body patientDetails: PatientDetails,
        @Query("customerId") customerId: Long?,
        @Query("patientId") patientId: Long?,
    ): Response<SavePatientResponse>

    @POST(ApiEndpointConstants.UPDATE_PROFILE_API)
    suspend fun updateProfileForFreshUser(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Body patientDetails: PatientDetails,
        @Query("customerId") customerId: Long?,
    ): Response<UpdateProfileResponse>


    @POST(ApiEndpointConstants.DELETE_PATIENT)
    suspend fun deletePatient(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("patientId") patientId: String?,
        @Query("customerId") customerId: Long?
    ): Response<ApiCoreResponse>

    @POST(ApiEndpointConstants.GET_ALL_PATIENT)
    suspend fun getAllPatient(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("showMyself") showMyself: Boolean?,
        @Query("customerId") customerId: Long?
    ): Response<GetAllPatientResponse>

    @POST(ApiEndpointConstants.GET_PATIENT_BY_ID)
    suspend fun getPatientById(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("patientId") patientId: String?,
        @Query("orderId") orderId: Long?
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.GET_CUSTOMER_DETAILS)
    suspend fun getCustomerDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: Long?
    ): Response<CustomerDetailsResponse>

    @GET(ApiEndpointConstants.GET_CUSTOMER_AND_ORDER_DETAILS_FOR_HOME)
    suspend fun getCustomerAndOrderDetailsForHome(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: Long?,
    ): Response<CustomerHomeDetailsResponseModel>

    /*@POST(ApiEndpointConstants.GET_ORDER_TRACK_ON_HOME)
    suspend fun getOrderTrackOnHome(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: Long?
    ): Response<OrderTrackOnHome>*/

    @GET(ApiEndpointConstants.GET_CUSTOMER_DELIVERY_CHARGE_DATA)
    suspend fun getCustomerDeliveryCharge(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: Long?
    ): Response<CustomerDeliveryChargeDataResponse>

    @POST(ApiEndpointConstants.GENERATE_NEW_TOKEN)
    suspend fun generateNewToken(
        @Header("Content-Type") contentType: String?,
        @Body mobileOtpRequest: JsonObject?,
        @Query("source") source: String?,
    ): Response<ResponseBody?>

    @POST(ApiEndpointConstants.SET_CUSTOMER_CATEGORY)
    suspend fun setCustomerCategory(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("category") category: String?,
        @Query("categoryType") categoryType: String?,
        @Query("sourceVersion") sourceVersion: String?,
        @Query("deviceId") deviceId: String?,
    ): Response<CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category??>

    @GET(ApiEndpointConstants.DEACTIVATE_CUSTOMER_CATEGORY)
    suspend fun deActivateCustomerCategory(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("categoryId") categoryId: Long,
    ): Response<ResponseBody>

    @POST(ApiEndpointConstants.NAME_VALIDATION_LIST)
    suspend fun getNameValidationList(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Body types: ArrayList<String>?
    ): Response<NameValidationResponse>

    @POST(ApiEndpointConstants.SAVE_VARIANT_INFO)
    suspend fun saveVariantInfo(
        @Query("deviceId") deviceId: String?,
        @Query("customerId") customerId: Long?,
        @Header("Content-Type") contentType: String?,
        @Query("sourceVersion") sourceVersion: String?,
        @Body saveVariantInfoRequest: SaveVariantInfoRequest,
    ): Response<SaveVariantInfoResponse>

    @POST(ApiEndpointConstants.UPDATE_VARIANT_INFO)
    suspend fun updateVariantInfo(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("deviceId") deviceId: String?,
        @Query("customerId") customerId: Long?,
        @Query("sourceVersion") sourceVersion: String?,
        @Body saveVariantInfoRequest: SaveVariantInfoRequest
    ): Response<SaveVariantInfoResponse>
}