package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.example.example.CustomerDeviceInfoRequest
import com.example.example.EventIdForCustomerRequest
import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.api.UserDataApi
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoResponse
import com.intellihealth.truemeds.data.model.user.*
import com.intellihealth.truemeds.data.repository.datasource.remote.UserRemoteDataSource
import com.intellihealth.truemeds.domain.model.CustomerDetails
import com.intellihealth.truemeds.domain.model.PatientDetails
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class UserRemoteDataSourceImpl @Inject constructor(
    private val userDataApi: UserDataApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : UserRemoteDataSource {

    override suspend fun setCustomerDeviceInfo(
        addressObj: CustomerDeviceInfoRequest
    ): Response<ResponseBody> {
        return userDataApi.setCustomerDeviceInfo(contentType, addressObj)
    }

    override suspend fun setEventIdForCustomer(
        jsonArray: List<EventIdForCustomerRequest>
    ): Response<ResponseBody> {
        return userDataApi.setEventIdForCustomer(
            contentType,SharedPrefManager.getInstance().loggedInUserAccessToken ,jsonArray
        )
    }

    override suspend fun saveAaIdAndFcm(
        customerId: Long?,
        aaid: String?,
        deviceKey: String?
    ): Response<ResponseBody> {
        return userDataApi.saveAaIdAndFcm(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId, aaid, deviceKey)
    }

    override suspend fun updateProfile(
        nameObj: CustomerDetails,
        customerId: Long
    ): Response<UpdateProfileResponse> {
        return userDataApi.updateProfile(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, nameObj, customerId)
    }

    override suspend fun saveAddress(
        addressObj: JsonObject?,
        customerId: Long?
    ): Response<SaveAddressResponse> {
        return userDataApi.saveAddress(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, addressObj, customerId)
    }

    override suspend fun deleteAddress(
        addressId: String,
        customerId: Long
    ): Response<ApiCoreResponse> {
        return userDataApi.deleteAddress(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, addressId, customerId)
    }

    override suspend fun getAllAddresses(
        customerId: Long?
    ): Response<GetAllAddressResponse> {
        return userDataApi.getAllAddresses(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId)
    }

    override suspend fun addPatient(
        patientDetails: PatientDetails,
        customerId: Long?
    ): Response<SavePatientResponse> {
        return userDataApi.addPatient(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, patientDetails, customerId)
    }

    override suspend fun updateProfileForFreshUser(
        patientDetails: PatientDetails,
        customerId: Long?
    ): Response<UpdateProfileResponse> {
        return userDataApi.updateProfileForFreshUser(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            patientDetails,
            customerId
        )
    }

    override suspend fun editPatient(
        patientDetails: PatientDetails,
        customerId: Long?,
        patientId: Long?
    ): Response<SavePatientResponse> {
        return userDataApi.editPatient(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            patientDetails,
            customerId,
            patientId
        )
    }

    override suspend fun deletePatient(
        patientId: String?,
        customerId: Long?
    ): Response<ApiCoreResponse> {
        return userDataApi.deletePatient(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, patientId, customerId)
    }

    override suspend fun getAllPatient(
        showMyself: Boolean?,
        customerId: Long?
    ): Response<GetAllPatientResponse> {
        return userDataApi.getAllPatient(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, showMyself, customerId)
    }

    override suspend fun getPatientById(
        patientId: String?,
        orderId: Long?
    ): Response<ResponseBody> {
        return userDataApi.getPatientById(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, patientId, orderId)
    }

    override suspend fun getCustomerDetails(
        customerId: Long?
    ): Response<CustomerDetailsResponse> {
        return userDataApi.getCustomerDetails(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId)
    }

    override suspend fun getCustomerAndOrderDetailsForHome(
        customerId: Long?
    ): Response<CustomerHomeDetailsResponseModel> {
        return userDataApi.getCustomerAndOrderDetailsForHome(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
        )
    }

    override suspend fun getCustomerDeliveryCharge(customerId: Long?):
            Response<CustomerDeliveryChargeDataResponse> {
        return userDataApi.getCustomerDeliveryCharge(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId)
    }

    override suspend fun generateNewToken(
        mobileOtpRequest: JsonObject?,
        source: String?
    ): Response<ResponseBody?> {
        return userDataApi.generateNewToken(contentType, mobileOtpRequest, source)
    }

    override suspend fun setCustomerCategory(
        category: String,
        categoryType: String,
        sourceVersion: String
    ): Response<CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category??> {
        return userDataApi.setCustomerCategory(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            category,
            categoryType,
            sourceVersion,
            SharedPrefManager.getInstance().deviceID,
        )
    }

    override suspend fun deactivateCustomerCategory(
        categoryId: Long
    ): Response<ResponseBody> {
        return userDataApi.deActivateCustomerCategory(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, categoryId)
    }

    override suspend fun getNameValidationList(typeList: ArrayList<String>): Response<NameValidationResponse> {
        return userDataApi.getNameValidationList(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, typeList)
    }

    override suspend fun saveVariantInfo(saveVariantInfoRequest: SaveVariantInfoRequest): Response<SaveVariantInfoResponse> {
        return userDataApi.saveVariantInfo(
            deviceId = SharedPrefManager.getInstance().deviceID,
            customerId = SharedPrefManager.getInstance().loggedInUserId.toLong(),
            contentType = contentType,
            sourceVersion = CommonFunc.getSourceVersion(),
            saveVariantInfoRequest = saveVariantInfoRequest
        )
    }

    override suspend fun updateVariantInfo(saveVariantInfoRequest: SaveVariantInfoRequest): Response<SaveVariantInfoResponse> {
        return userDataApi.updateVariantInfo(
            authorization = SharedPrefManager.getInstance().loggedInUserAccessToken,
            contentType = contentType,
            deviceId = SharedPrefManager.getInstance().deviceID,
            customerId = SharedPrefManager.getInstance().loggedInUserId.toLong(),
            sourceVersion = CommonFunc.getSourceVersion(),
            saveVariantInfoRequest = saveVariantInfoRequest
        )
    }
}