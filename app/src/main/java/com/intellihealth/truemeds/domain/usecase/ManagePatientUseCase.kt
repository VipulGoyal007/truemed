package com.intellihealth.truemeds.domain.usecase

import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.UserDataRepository
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import javax.inject.Inject

class ManagePatientUseCase @Inject constructor(
    private val localDbUseCase: LocalDbUseCase,
    private val userDataRepository: UserDataRepository
) {
    suspend fun getAllPatients(
        showMyself: Boolean,
        customerId: Long
    ): GetAllPatientResponse? =
        when (val res = userDataRepository.getAllPatient(
            MxInternalErrorOccurred(), showMyself, customerId
        )) {
            is Resource.Success -> res.value?.body()
            is Resource.Failure -> null
            else -> null
        }

    suspend fun deletePatient(
        patientId: String,
        customerId: Long
    ): ApiCoreResponse? =
        when (val res = userDataRepository.deletePatient(
            MxInternalErrorOccurred(), patientId, customerId
        )) {
            is Resource.Success -> {
                if(res.value?.isSuccessful == true) {
                    if (SharedPrefManager.getInstance().patientId > 0 &&
                        patientId == SharedPrefManager.getInstance().patientId.toString()) {
                        SharedPrefManager.getInstance().patientId = 0
                    }
                    res.value.body()
                }
                else{
                    val response = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    )
                    response.isSuccess = false

                    response
                }
            }

            is Resource.Failure -> {
                var response = Gson().fromJson(
                    res.errorBody?.string(),
                    ApiCoreResponse::class.java
                )
                response.isSuccess = false

                response
            }

            else -> null
        }
}