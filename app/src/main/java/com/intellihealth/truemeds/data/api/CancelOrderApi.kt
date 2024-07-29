package com.intellihealth.truemeds.data.api

import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface CancelOrderApi {
    @POST(ApiEndpointConstants.GET_REASONS_FOR_ORDER_CANCELLATION)
    suspend fun getReasonsForOrderCancellation(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String
    ): Response<CancelReasonResponse>

    @GET(ApiEndpointConstants.GET_L1_REASONS_FOR_ORDER_CANCELLATION)
    suspend fun getL1ReasonsForOrderCancellation(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String
    ): Response<CancelReasonResponse>

    @GET(ApiEndpointConstants.GET_SUBS_REASONS_FOR_ORDER_CANCELLATION)
    suspend fun getSubsReasonsForOrderCancellation(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("reasonId") reasonId: String?
    ): Response<CancelReasonResponse>

    @POST(ApiEndpointConstants.CANCEL_ORDER)
    suspend fun cancelOrder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Query("reasonId") reasonId: String?,
        @Query("notes") notes: String?,
        @Query("cancelledById") cancelledById: Int
    ): Response<ResponseBody>

    @POST(ApiEndpointConstants.DISCARD_ORDER)
    suspend fun discardOrderWithReason(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Header("customerId") customerId: String,
        @Query("orderId") orderId: Long,
        @Query("reasonId") reasonId: String?,
        @Query("notes") notes: String?,
        @Query("cancelledById") cancelledById: Int
    ): Response<ResponseBody>
}