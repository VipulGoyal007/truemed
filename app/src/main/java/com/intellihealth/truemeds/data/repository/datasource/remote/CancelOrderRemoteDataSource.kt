package com.intellihealth.truemeds.data.repository.datasource.remote

import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import okhttp3.ResponseBody
import retrofit2.Response

interface CancelOrderRemoteDataSource {
    suspend fun getReasonsForOrderCancellation(): Response<CancelReasonResponse>

    suspend fun getL1ReasonsForOrderCancellation(): Response<CancelReasonResponse>

    suspend fun getSubsReasonsForOrderCancellation(reasonId: String): Response<CancelReasonResponse>

    suspend fun cancelOrder(
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): Response<ResponseBody>
    suspend fun discardOrderWithReason(
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): Response<ResponseBody>

}