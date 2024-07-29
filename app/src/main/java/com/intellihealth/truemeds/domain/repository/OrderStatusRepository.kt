package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderConfirmBoxVerifyResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse
import com.intellihealth.truemeds.data.model.orderstatus.VideoOrderStatusResponse
import com.intellihealth.truemeds.data.model.user.SaveEmailResponse
import com.intellihealth.truemeds.data.utils.Resource
import retrofit2.Response

interface OrderStatusRepository {
    /**
     * This service provides order status data with status id and tracking details
     * **/
    suspend fun getOrderStatus(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        customerId: String,
    ): Resource<Response<OrderStatusResponse>>

    /**
     * This service provides doctor order confirm and medicine box verified or not
     * **/
    suspend fun fetchDoctorOrderConfirmedAndBoxVerifiedDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long
    ): Resource<Response<OrderConfirmBoxVerifyResponse>>

    /**
     * This service provide video url to display on order status
     * **/
    suspend fun getOrderStatusVideo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        app: String?
    ): Resource<Response<VideoOrderStatusResponse>>

    /**
     * This service is used to update alternate contact number against order
     * **/
    suspend fun saveAlternateNumberForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        alternateNumber: String,
    ): Resource<Response<AlternateNumberResponse>>

    suspend fun deleteAlternateNumberForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
    ): Resource<Response<DeleteAlternateNumberResponse>>

    suspend fun generateReturnUrlResponse(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long
    ): Resource<Response<GenerateReturnUrlResponse>>

    suspend fun saveCustomerEmailAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        emailId: String?,
        transactionId: String?
    ): Resource<Response<SaveEmailResponse>>

}