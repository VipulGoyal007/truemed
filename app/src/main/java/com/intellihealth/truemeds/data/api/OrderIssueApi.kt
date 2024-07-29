package com.intellihealth.truemeds.data.api

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface OrderIssueApi {
    @GET(ApiEndpointConstants.GET_ALL_ISSUE_MEDICINES)
    suspend fun getAllIssueMedicines(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
        @Query("customerId") customerId: Long?,
    ): Response<ResponseBody?>

    @POST(ApiEndpointConstants.RAISE_ORDER_ISSUES)
    suspend fun raiseOrderIssues(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("orderId") orderId: Long?,
        @Body ticketObj: JsonObject?,
        @Query("isReturn") isReturn: String?,
        @Query("customerId") customerId: Long?,
    ): Response<ResponseBody?>

    @GET(ApiEndpointConstants.GET_TICKET_ISSUE_DETAILS)
    suspend fun getTicketIssueDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("ticketId") ticketId: String?,
        @Query("customerId") customerId: Long?,
    ): Response<ResponseBody?>
}