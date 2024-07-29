package com.intellihealth.truemeds.domain.usecase

import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.SavePatientResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.model.PatientDetails
import com.intellihealth.truemeds.domain.repository.UserDataRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import javax.inject.Inject

class EditPatientUseCase @Inject constructor(
    private val userDataRepository: UserDataRepository,
    private val sdkEventUseCase: SdkEventUseCase
) {

    suspend fun editPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        patientDetails: PatientDetails,
        customerId: Long,
        patientId: Long
    ): SavePatientResponse? =
        when (val res = userDataRepository.editPatient(
            mxInternalErrorOccurred,
            patientDetails,
            customerId,
            patientId
        )) {
            is Resource.Success -> {
                if (res.value?.isSuccessful == true) {
                    val response = res.value.body()
                    response?.isSuccess = true
                    response
                } else {
                    val response = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        SavePatientResponse::class.java
                    )
                    response.isSuccess = false
                    try {
                        mxInternalErrorOccurred.errorCode = res.value?.code()
                        mxInternalErrorOccurred.errorStatement = response.message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                    } catch (_: Exception) {
                    }
                    null

                    response
                }
            }

            is Resource.Failure -> {
                var response = Gson().fromJson(
                    res.errorBody?.string(),
                    SavePatientResponse::class.java
                )
                response.isSuccess = false

                response
            }

            else -> null
        }
}