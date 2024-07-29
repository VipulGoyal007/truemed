package com.intellihealth.truemeds.data.repository.datasource.remote

import com.google.gson.JsonObject
import okhttp3.ResponseBody
import retrofit2.Response

interface OrderIssueRemoteData {
    suspend fun getAllIssueMedicines(
        orderId: Long?,
        customerId: Long?,
    ): Response<ResponseBody?>

    suspend fun raiseOrderIssues(
        orderId: Long?,
        ticketObj: JsonObject?,
        isReturn: String?,
        customerId: Long?,
    ): Response<ResponseBody?>

    suspend fun getTicketIssueDetails(
        ticketId: String?,
        customerId: Long?,
    ): Response<ResponseBody?>
}