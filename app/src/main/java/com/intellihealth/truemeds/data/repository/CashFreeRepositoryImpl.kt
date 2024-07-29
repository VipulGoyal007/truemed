package com.intellihealth.truemeds.data.repository

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.repository.datasource.remote.CashFreeRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.CashFreeRepository
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class CashFreeRepositoryImpl @Inject constructor(
    private val cashFreeRemoteDataSource: CashFreeRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : CashFreeRepository {
    override suspend fun saveCashFreeResponse(
        mxInternalErrorOccurred: MxInternalErrorOccurred, cfTxnRequestBody: JsonObject?
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { cashFreeRemoteDataSource.saveCashFreeResponse(cfTxnRequestBody) }
    }

    override suspend fun createOrderTokenInCashFree(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        transactionId: String?,
        orderId: Long?,
        version: Int
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            cashFreeRemoteDataSource.createOrderTokenInCashFree(
                transactionId,
                orderId,
                version
            )
        }
    }

}