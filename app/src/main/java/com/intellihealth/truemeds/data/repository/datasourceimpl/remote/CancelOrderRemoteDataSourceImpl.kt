package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.facebook.share.Share
import com.intellihealth.truemeds.data.api.CancelOrderApi
import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.CancelOrderRemoteDataSource
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class CancelOrderRemoteDataSourceImpl @Inject constructor(
    private val cancelOrderApi: CancelOrderApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : CancelOrderRemoteDataSource {
    //private val authorization: String = SharedPrefManager.getInstance().loggedInUserAccessToken
    override suspend fun getReasonsForOrderCancellation(): Response<CancelReasonResponse> {
        return cancelOrderApi.getReasonsForOrderCancellation(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
        )
    }

    override suspend fun getL1ReasonsForOrderCancellation(): Response<CancelReasonResponse> {
        return cancelOrderApi.getL1ReasonsForOrderCancellation(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
        )
    }

    override suspend fun getSubsReasonsForOrderCancellation(reasonId: String): Response<CancelReasonResponse> {
        return cancelOrderApi.getSubsReasonsForOrderCancellation(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            reasonId
        )
    }

    override suspend fun cancelOrder(
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): Response<ResponseBody> {
        return cancelOrderApi.cancelOrder(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            orderId,
            reasonId,
            notes,
            cancelledById
        )
    }

    override suspend fun discardOrderWithReason(
        orderId: Long,
        reasonId: String?,
        notes: String?,
        cancelledById: Int
    ): Response<ResponseBody> {
        return cancelOrderApi.discardOrderWithReason(
            contentType, SharedPrefManager.getInstance().loggedInUserAccessToken,
            SharedPrefManager.getInstance().loggedInUserId, orderId, reasonId, notes, cancelledById
        )
    }
}