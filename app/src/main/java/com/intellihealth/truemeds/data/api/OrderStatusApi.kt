package com.intellihealth.truemeds.data.api

import com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderConfirmBoxVerifyResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse
import com.intellihealth.truemeds.data.model.orderstatus.VideoOrderStatusResponse
import com.intellihealth.truemeds.data.model.user.SaveEmailResponse
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface OrderStatusApi {
    @GET(ApiEndpointConstants.GET_ORDER_STATUS)
    suspend fun getOrderStatus(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Query("customerId") customerId: String,
    ): Response<OrderStatusResponse>

    @GET(ApiEndpointConstants.FETCH_DOCTOR_ORDER_CONFIRMED_AND_BOX_VERIFIED_DETAILS)
    suspend fun fetchDoctorOrderConfirmedAndBoxVerifiedDetails(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
    ): Response<OrderConfirmBoxVerifyResponse>

    @GET(ApiEndpointConstants.ORDER_STATUS_VIDEO)
    fun getOrderStatusVideo(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long?,
        @Query("source") app: String?
    ): Response<VideoOrderStatusResponse>

    @GET(ApiEndpointConstants.SAVE_ALTERNATE_NUMBER_FOR_ORDER)
    suspend fun saveAlternateNumberForOrder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
        @Query("alternateNumber") alternateNumber: String,
    ): Response<AlternateNumberResponse>

    @POST(ApiEndpointConstants.DELETE_ALTERNATE_NUMBER_FOR_ORDER)
    suspend fun deleteAlternateNumberForOrder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
    ): Response<DeleteAlternateNumberResponse>


    @GET(ApiEndpointConstants.GENERATE_RETURN_URL)
    suspend fun generateReturnUrlResponse(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("orderId") orderId: Long,
    ): Response<GenerateReturnUrlResponse>

    @POST(ApiEndpointConstants.SAVE_CUSTOMER_EMAIL_ADDRESS)
    suspend fun saveCustomerEmailAddress(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: String,
        @Query("emailId") emailId: String?,
        @Query("transactionId") transactionId: String?
    ): Response<SaveEmailResponse>

}