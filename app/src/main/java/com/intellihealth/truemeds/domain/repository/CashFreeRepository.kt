package com.intellihealth.truemeds.domain.repository

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.Resource
import okhttp3.ResponseBody
import retrofit2.Response

interface CashFreeRepository {
    /**
     * This service provides token for initiating payment in cash free
     * **/
    suspend fun createOrderTokenInCashFree(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        transactionId: String?,
        orderId: Long?,
        version: Int
    ): Resource<Response<ResponseBody>>

    /**
     * This service is used to save cash free response that payment success or not
     * **/
    suspend fun saveCashFreeResponse(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        cfTxnRequestBody: JsonObject?
    ): Resource<Response<ResponseBody>>
}