package com.intellihealth.truemeds.domain.usecase

import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.SavePatientResponse
import com.intellihealth.truemeds.data.model.user.UpdateProfileResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.enums.NetworkResponseType
import com.intellihealth.truemeds.domain.model.PatientDetails
import com.intellihealth.truemeds.domain.repository.UserDataRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import javax.inject.Inject

class AddPatientUseCase @Inject constructor(
    private val userDataRepository: UserDataRepository,
    private val sdkEventUseCase: SdkEventUseCase
) {

    /**
     * Add patient
     * **/
    suspend fun addPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long,
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
                    )
                    try {
                        mxInternalErrorOccurred.errorCode = response.statusCode
                        mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                response.message ?: "Patient update failed",
                                ApiCoreResponse::class.java
                        ).message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                    }catch (_: JsonSyntaxException){
                    }
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
                val response = Gson().fromJson(
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

    /**
     * fresh user update profile
     * **/
    suspend fun updateProfileForFreshUser(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long,
    ): UpdateProfileResponse? =
        when (val res = userDataRepository.updateProfileForFreshUser(
            mxInternalErrorOccurred,
            patientDetails,
            customerId
        )) {
            is Resource.Success -> if (res.value?.isSuccessful == true)
                res.value.body()
            else {
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
}