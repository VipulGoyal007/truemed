package com.intellihealth.truemeds.data.repository

import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.repository.datasource.remote.CancelOrderRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.CancelOrderRepository
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class CancelOrderRepositoryImpl @Inject constructor(
    private val cancelOrderRemoteDataSource: CancelOrderRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : CancelOrderRepository {
    override suspend fun getReasonsForOrderCancellation(mxInternalErrorOccurred: MxInternalErrorOccurred): Resource<Response<CancelReasonResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { cancelOrderRemoteDataSource.getReasonsForOrderCancellation() }
    }

    override suspend fun getL1ReasonsForOrderCancellation(mxInternalErrorOccurred: MxInternalErrorOccurred): Resource<Response<CancelReasonResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { cancelOrderRemoteDataSource.getL1ReasonsForOrderCancellation() }
    }

    override suspend fun getSubsReasonsForOrderCancellation(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        reasonId: String
    ): Resource<Response<CancelReasonResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            cancelOrderRemoteDataSource.getSubsReasonsForOrderCancellation(
                reasonId
            )
        }
    }

    override suspend fun cancelOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            cancelOrderRemoteDataSource.cancelOrder(
                orderId,
                reasonId,
                notes,
                cancelledById
            )
        }
    }

    override suspend fun discardOrderWithReason(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            cancelOrderRemoteDataSource.discardOrderWithReason(
                orderId,
                reasonId,
                notes,
                cancelledById
            )
        }
    }
}