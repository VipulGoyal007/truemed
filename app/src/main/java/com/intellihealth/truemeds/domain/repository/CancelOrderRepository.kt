package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.Resource
import okhttp3.ResponseBody
import retrofit2.Response

interface CancelOrderRepository {
    /**
     * This service provides cancellation reason list
     * **/
    suspend fun getReasonsForOrderCancellation(mxInternalErrorOccurred: MxInternalErrorOccurred): Resource<Response<CancelReasonResponse>>

    /**
     * This service provides Top level cancellation reasons list
     * **/
    suspend fun getL1ReasonsForOrderCancellation(mxInternalErrorOccurred: MxInternalErrorOccurred): Resource<Response<CancelReasonResponse>>

    /**
     * This service provides second level cancellation reason list
     * **/
    suspend fun getSubsReasonsForOrderCancellation(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        reasonId: String
    ): Resource<Response<CancelReasonResponse>>

    /**
     * This service is used to cancel order with order id ,reason id and additional text i.e notes.
     * **/
    suspend fun cancelOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): Resource<Response<ResponseBody>>

    suspend fun discardOrderWithReason(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): Resource<Response<ResponseBody>>
}