package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.intellihealth.truemeds.data.api.OrderStatusApi
import com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderConfirmBoxVerifyResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse
import com.intellihealth.truemeds.data.model.orderstatus.VideoOrderStatusResponse
import com.intellihealth.truemeds.data.model.user.SaveEmailResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderStatusRemoteDataSource
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class OrderStatusRemoteDataSourceImpl @Inject constructor(
    private val orderStatusApi: OrderStatusApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
): OrderStatusRemoteDataSource {
    /*var authorization = ""
    init {
        authorization = SharedPrefManager.getInstance().loggedInUserAccessToken
    }*/
    override suspend fun getOrderStatus(
        orderId: Long,
        customerId: String
    ): Response<OrderStatusResponse> {
        return orderStatusApi.getOrderStatus(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, orderId, customerId)
    }

    override suspend fun fetchDoctorOrderConfirmedAndBoxVerifiedDetails(orderId: Long): Response<OrderConfirmBoxVerifyResponse> {
        return orderStatusApi.fetchDoctorOrderConfirmedAndBoxVerifiedDetails(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, orderId)
    }

    override fun getOrderStatusVideo(
        orderId: Long,
        app: String?
    ): Response<VideoOrderStatusResponse> {
        return orderStatusApi.getOrderStatusVideo(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, orderId, app)
    }

    override suspend fun saveAlternateNumberForOrder(
        orderId: Long,
        alternateNumber: String
    ): Response<AlternateNumberResponse> {
        return orderStatusApi.saveAlternateNumberForOrder(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, orderId, alternateNumber)
    }
    override suspend fun deleteAlternateNumberForOrder(
        orderId: Long,
    ): Response<DeleteAlternateNumberResponse> {
        return orderStatusApi.deleteAlternateNumberForOrder(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, orderId)
    }

    override suspend fun generateReturnUrlResponse(orderId: Long): Response<GenerateReturnUrlResponse> {
        return orderStatusApi.generateReturnUrlResponse(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, orderId)

    }

    override suspend fun saveCustomerEmailAddress(
        customerId: String,
        emailId: String?,
        transactionId: String?
    ): Response<SaveEmailResponse> {
        return orderStatusApi.saveCustomerEmailAddress(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            emailId,
            transactionId
        )
    }
}