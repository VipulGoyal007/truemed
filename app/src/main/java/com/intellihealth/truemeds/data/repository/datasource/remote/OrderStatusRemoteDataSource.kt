package com.intellihealth.truemeds.data.repository.datasource.remote

import com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderConfirmBoxVerifyResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse
import com.intellihealth.truemeds.data.model.orderstatus.VideoOrderStatusResponse
import com.intellihealth.truemeds.data.model.user.SaveEmailResponse
import retrofit2.Response

interface OrderStatusRemoteDataSource {

    suspend fun getOrderStatus(
        orderId: Long,
        customerId: String,
    ): Response<OrderStatusResponse>

    suspend fun fetchDoctorOrderConfirmedAndBoxVerifiedDetails(
        orderId: Long
    ): Response<OrderConfirmBoxVerifyResponse>

    fun getOrderStatusVideo(
        orderId: Long,
        app: String?
    ): Response<VideoOrderStatusResponse>

    suspend fun saveAlternateNumberForOrder(
        orderId: Long,
        alternateNumber: String,
    ): Response<AlternateNumberResponse>

    suspend fun deleteAlternateNumberForOrder(
        orderId: Long,
    ): Response<DeleteAlternateNumberResponse>

    suspend fun generateReturnUrlResponse(
        orderId: Long,
    ): Response<GenerateReturnUrlResponse>

    suspend fun saveCustomerEmailAddress(
        customerId: String,
        emailId: String?,
        transactionId: String?
    ): Response<SaveEmailResponse>
}