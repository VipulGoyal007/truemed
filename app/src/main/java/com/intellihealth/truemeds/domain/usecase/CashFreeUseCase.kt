package com.intellihealth.truemeds.domain.usecase

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.CashFreeRepository
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class CashFreeUseCase @Inject constructor(private val cashFreeRepository: CashFreeRepository) {
    suspend fun createOrderTokenInCashFree(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        transactionId: String?,
        orderId: Long?,
        version: Int
    ): Response<ResponseBody>? =
        when (val res =
            cashFreeRepository.createOrderTokenInCashFree(
                mxInternalErrorOccurred,
                transactionId,
                orderId,
                version
            )) {
            is Resource.Success -> res.value
            is Resource.Failure -> null
            else -> null
        }

    suspend fun saveCashFreeResponse(
        mxInternalErrorOccurred: MxInternalErrorOccurred, cfTxnRequestBody: JsonObject
    ): Response<ResponseBody>? =
        when (val res =
            cashFreeRepository.saveCashFreeResponse(mxInternalErrorOccurred, cfTxnRequestBody)) {
            is Resource.Success -> res.value
            is Resource.Failure -> null
            else -> null
        }
}