package com.intellihealth.truemeds.data.repository.datasource.remote

import com.google.gson.JsonObject
import okhttp3.ResponseBody
import retrofit2.Response

interface CashFreeRemoteDataSource {
    suspend fun saveCashFreeResponse(cfTxnRequestBody: JsonObject?): Response<ResponseBody>

    suspend fun createOrderTokenInCashFree(
        transactionId: String?,
        orderId: Long?,
        version: Int
    ): Response<ResponseBody>
}