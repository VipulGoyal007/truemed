package com.intellihealth.truemeds.data.repository

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
import com.intellihealth.truemeds.data.repository.datasource.remote.UserRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.model.CustomerDetails
import com.intellihealth.truemeds.domain.model.PatientDetails
import com.intellihealth.truemeds.domain.repository.UserDataRepository
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class UserDataRepositoryImpl @Inject constructor(
    private val userRemoteDataSource: UserRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : UserDataRepository {
    override suspend fun setCustomerDeviceInfo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        addressObj: CustomerDeviceInfoRequest
    ): Resource<Response<ResponseBody>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.setCustomerDeviceInfo(addressObj)}
    }

    override suspend fun setEventIdForCustomer(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        jsonArray: List<EventIdForCustomerRequest>
    ): Resource<Response<ResponseBody>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
             userRemoteDataSource.setEventIdForCustomer(
                 jsonArray
             )}
    }
    override suspend fun saveAaIdAndFcm(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long?,
        aaid: String,
        deviceKey: String?
    ): Resource<Response<ResponseBody>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.saveAaIdAndFcm(
             customerId,
             aaid,
             deviceKey
         )}
    }

    override suspend fun updateProfile(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        nameObj: CustomerDetails,
        customerId: Long
    ): Resource<Response<UpdateProfileResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.updateProfile(
            nameObj,
            customerId
        )}
    }

    override suspend fun saveAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        addressObj: JsonObject?,
        customerId: Long?
    ): Resource<Response<SaveAddressResponse>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.saveAddress(
             addressObj,
             customerId
         )}
    }

    override suspend fun deleteAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        addressId: String,
        customerId: Long
    ): Resource<Response<ApiCoreResponse>>{
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.deleteAddress(
             addressId,
             customerId
         )}
    }

    override suspend fun getAllAddresses(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long?
    ): Resource<Response<GetAllAddressResponse>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.getAllAddresses(customerId)}
    }

    override suspend fun addPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long?
    ): Resource<Response<SavePatientResponse>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.addPatient(patientDetails, customerId)}
    }

    override suspend fun updateProfileForFreshUser(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long
    ): Resource<Response<UpdateProfileResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.updateProfileForFreshUser(patientDetails, customerId)}
    }

    override suspend fun editPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long?,
        patientId: Long?
    ): Resource<Response<SavePatientResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.editPatient(patientDetails, customerId,patientId)}
    }

    override suspend fun deletePatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientId: String?,
        customerId: Long?
    ): Resource<Response<ApiCoreResponse>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.deletePatient(patientId,customerId)}
    }

    override suspend fun getAllPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        showMyself: Boolean?,
        customerId: Long?
    ): Resource<Response<GetAllPatientResponse>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.getAllPatient(showMyself,customerId)}
    }

    override suspend fun getPatientById(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientId: String?,
        orderId: Long?
    ): Resource<Response<ResponseBody>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.getPatientById(patientId,orderId)}
    }

    override suspend fun getCustomerDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long?
    ): Resource<Response<CustomerDetailsResponse>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.getCustomerDetails(customerId)}
    }

    override suspend fun getCustomerAndOrderDetailsForHome(
        mxInternalErrorOccurred: MxInternalErrorOccurred,customerId: Long?):
            Resource<Response<CustomerHomeDetailsResponseModel>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.getCustomerAndOrderDetailsForHome(customerId)}
    }

    /*override suspend fun getOrderTrackOnHome(
        customerId: Long?
    ): Resource<Response<OrderTrackOnHome>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.getOrderTrackOnHome(customerId)}
    }*/
    override suspend fun getCustomerDeliveryCharge(
        mxInternalErrorOccurred: MxInternalErrorOccurred,customerId: Long?):
            Resource<Response<CustomerDeliveryChargeDataResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            userRemoteDataSource.getCustomerDeliveryCharge(
                customerId
            )
        }
    }
    override suspend fun generateNewToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        mobileOtpRequest: JsonObject?,
        source: String?
    ): Resource<Response<ResponseBody?>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.generateNewToken(mobileOtpRequest,source)}
    }

    override suspend fun setCustomerCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        category: String,
        categoryType: String,
        sourceVersion: String
    ): Resource<Response<CustomerHomeDetailsResponseModel.ResponseData.CustomerDetails.Category?>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.setCustomerCategory(category,categoryType,sourceVersion)}
    }

    override suspend fun deactivateCustomerCategory(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        categoryId: Long
    ): Resource<Response<ResponseBody>> {
         return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.deactivateCustomerCategory(categoryId)}
    }

    override suspend fun getNameValidationList(
        mxInternalErrorOccurred: MxInternalErrorOccurred,typeList:ArrayList<String>): Resource<Response<NameValidationResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.getNameValidationList(typeList)}
    }

    override suspend fun saveVariantInfo(
        saveVariantInfoRequest: SaveVariantInfoRequest,
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): Resource<Response<SaveVariantInfoResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.saveVariantInfo(saveVariantInfoRequest)}
    }

    override suspend fun updateVariantInfo(
        saveVariantInfoRequest: SaveVariantInfoRequest,
        mxInternalErrorOccurred: MxInternalErrorOccurred
    ): Resource<Response<SaveVariantInfoResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {userRemoteDataSource.updateVariantInfo(saveVariantInfoRequest)}
    }
}