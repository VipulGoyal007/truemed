package com.intellihealth.truemeds.data.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderConfirmBoxVerifyResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse
import com.intellihealth.truemeds.data.model.orderstatus.VideoOrderStatusResponse
import com.intellihealth.truemeds.data.model.user.SaveEmailResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderStatusRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.OrderStatusRepository
import retrofit2.Response
import javax.inject.Inject

class OrderStatusRepositoryImpl @Inject constructor(
    private val orderStatusRemoteDataSource: OrderStatusRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : OrderStatusRepository {
    override suspend fun getOrderStatus(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        customerId: String
    ): Resource<Response<OrderStatusResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderStatusRemoteDataSource.getOrderStatus(orderId, customerId) }
    }

    override suspend fun fetchDoctorOrderConfirmedAndBoxVerifiedDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred, orderId: Long
    ): Resource<Response<OrderConfirmBoxVerifyResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderStatusRemoteDataSource.fetchDoctorOrderConfirmedAndBoxVerifiedDetails(
                orderId
            )
        }
    }

    override suspend fun getOrderStatusVideo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        app: String?
    ): Resource<Response<VideoOrderStatusResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderStatusRemoteDataSource.getOrderStatusVideo(orderId, app) }
    }

    override suspend fun saveAlternateNumberForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        alternateNumber: String
    ): Resource<Response<AlternateNumberResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderStatusRemoteDataSource.saveAlternateNumberForOrder(
                orderId,
                alternateNumber
            )
        }
    }

    override suspend fun deleteAlternateNumberForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long
    ): Resource<Response<DeleteAlternateNumberResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderStatusRemoteDataSource.deleteAlternateNumberForOrder(
                orderId)
        }
    }

    override suspend fun generateReturnUrlResponse(
        mxInternalErrorOccurred: MxInternalErrorOccurred, orderId: Long
    ): Resource<Response<GenerateReturnUrlResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderStatusRemoteDataSource.generateReturnUrlResponse(orderId) }
    }

    override suspend fun saveCustomerEmailAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        emailId: String?,
        transactionId: String?
    ): Resource<Response<SaveEmailResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderStatusRemoteDataSource.saveCustomerEmailAddress(
                customerId,
                emailId,
                transactionId
            )
        }
    }
}