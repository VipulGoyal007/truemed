package com.intellihealth.truemeds.data.repository

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderIssueRemoteData
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.OrderIssueRepository
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class OrderIssueRepositoryImpl @Inject constructor(
    private val orderIssueRemoteData: OrderIssueRemoteData,
    private val apiCallInitClass: ApiCallInitClass
) :
    OrderIssueRepository {
    override suspend fun getAllIssueMedicines(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        customerId: Long?
    ): Resource<Response<ResponseBody?>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderIssueRemoteData.getAllIssueMedicines(orderId, customerId) }
    }

    override suspend fun raiseOrderIssues(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        ticketObj: JsonObject?,
        isReturn: String?,
        customerId: Long?
    ): Resource<Response<ResponseBody?>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderIssueRemoteData.raiseOrderIssues(
                orderId,
                ticketObj,
                isReturn,
                customerId
            )
        }
    }

    override suspend fun getTicketIssueDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        ticketId: String?,
        customerId: Long?
    ): Resource<Response<ResponseBody?>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderIssueRemoteData.getTicketIssueDetails(ticketId, customerId) }
    }
}