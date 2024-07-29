package com.intellihealth.truemeds.data.repository.datasource.remote

import com.example.example.CustomerDeviceInfoRequest
import com.example.example.EventIdForCustomerRequest
import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse
import com.intellihealth.truemeds.data.model.user.CustomerDeliveryChargeDataResponse
import com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.model.user.NameValidationResponse
import com.intellihealth.truemeds.data.model.user.SaveAddressResponse
import com.intellihealth.truemeds.data.model.user.SavePatientResponse
import com.intellihealth.truemeds.data.model.user.UpdateProfileResponse
import com.intellihealth.truemeds.domain.model.CustomerDetails
import com.intellihealth.truemeds.domain.model.PatientDetails
import okhttp3.ResponseBody
import retrofit2.Response

interface UserRemoteDataSource {
    suspend fun setCustomerDeviceInfo(
        addressObj: CustomerDeviceInfoRequest
    ): Response<ResponseBody>

    suspend fun setEventIdForCustomer(
        jsonArray: List<EventIdForCustomerRequest>
    ): Response<ResponseBody>

    suspend fun saveAaIdAndFcm(
        customerId: Long?,
        aaid: String?,
        deviceKey: String?,
    ): Response<ResponseBody>


    suspend fun updateProfile(
        nameObj: CustomerDetails,
        customerId: Long
    ): Response<UpdateProfileResponse>


    suspend fun saveAddress(
        addressObj: JsonObject?,
        customerId: Long?
    ): Response<SaveAddressResponse>


    suspend fun deleteAddress(
        addressId: String,
        customerId: Long
    ): Response<ApiCoreResponse>

    suspend fun getAllAddresses(
        customerId: Long?
    ): Response<GetAllAddressResponse>

    suspend fun addPatient(
        patientDetails: PatientDetails,
        customerId: Long?,
    ): Response<SavePatientResponse>

    suspend fun updateProfileForFreshUser(
        patientDetails: PatientDetails,
        customerId: Long?,
    ): Response<UpdateProfileResponse>

    suspend fun editPatient(
        patientDetails: PatientDetails,
        customerId: Long?,
        patientId: Long?
    ): Response<SavePatientResponse>

    suspend fun deletePatient(
        patientId: String?,
        customerId: Long?
    ): Response<ApiCoreResponse>

    suspend fun getAllPatient(
        showMyself: Boolean?,
        customerId: Long?
    ): Response<GetAllPatientResponse>

    suspend fun getPatientById(
        patientId: String?,
        orderId: Long?
    ): Response<ResponseBody>

    suspend fun getCustomerDetails(
        customerId: Long?
    ): Response<CustomerDetailsResponse>

    suspend fun getCustomerAndOrderDetailsForHome(
        customerId: Long?
    ): Response<CustomerHomeDetailsResponseModel>

    /*suspend fun getOrderTrackOnHome(
        customerId: Long?
    ): Response<OrderTrackOnHome>*/

    suspend fun getCustomerDeliveryCharge(
        customerId: Long?
    ): Response<CustomerDeliveryChargeDataResponse>

    suspend fun generateNewToken(
        mobileOtpRequest: JsonObject?,
        source: String?,
    ): Response<ResponseBody?>

    suspend fun setCustomerCategory(
        category: String,
        categoryType: String,
        sourceVersion: String
    ): Response<CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category?>


    suspend fun deactivateCustomerCategory(
        categoryId: Long
    ): Response<ResponseBody>

    suspend fun getNameValidationList(
        typeList:ArrayList<String>
    ): Response<NameValidationResponse>

    suspend fun saveVariantInfo(
        saveVariantInfoRequest: SaveVariantInfoRequest
    ): Response<SaveVariantInfoResponse>

    suspend fun updateVariantInfo(
        saveVariantInfoRequest: SaveVariantInfoRequest
    ): Response<SaveVariantInfoResponse>

}