package com.intellihealth.truemeds.data.api

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface CashFreeApi {
    @POST(ApiEndpointConstants.SAVE_CASHFREE_RESPONSE)
    suspend fun saveCashFreeResponse(
        @Header("Content-Type") contentType: String,
        @Body cfTxnRequestBody: JsonObject?,
        @Header("Authorization") authorization: String,
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.CREATE_ORDER_TOKEN_IN_CASHFREE)
    suspend fun createOrderTokenInCashFree(
        @Header("Content-Type") contentType: String,
        @Header("transactionId") transactionId: String?,
        @Query("orderId") orderId: Long?,
        @Header("Authorization") authorization: String,
        @Query("version") version: Int
    ): Response<ResponseBody>
}