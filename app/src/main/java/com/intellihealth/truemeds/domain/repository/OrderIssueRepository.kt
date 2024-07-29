package com.intellihealth.truemeds.domain.repository

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.Resource
import okhttp3.ResponseBody
import retrofit2.Response

interface OrderIssueRepository {
    /**
     * This service provides medicine related issue
     * **/
    suspend fun getAllIssueMedicines(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        customerId: Long?,
    ): Resource<Response<ResponseBody?>>?

    /**
     *This service provides order related issue
     * **/
    suspend fun raiseOrderIssues(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        ticketObj: JsonObject?,
        isReturn: String?,
        customerId: Long?,
    ): Resource<Response<ResponseBody?>>?

    /**
     *This service provides tickets of issue in details
     * **/
    suspend fun getTicketIssueDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        ticketId: String?,
        customerId: Long?,
    ): Resource<Response<ResponseBody?>>?
}