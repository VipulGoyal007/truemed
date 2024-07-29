package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.api.CashFreeApi
import com.intellihealth.truemeds.data.repository.datasource.remote.CashFreeRemoteDataSource
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class CashFreeRemoteDataSourceImpl @Inject constructor(
    private val cashFreeApi: CashFreeApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String,
): CashFreeRemoteDataSource {

    //private val authorization: String = SharedPrefManager.getInstance().loggedInUserAccessToken

    override suspend fun saveCashFreeResponse(cfTxnRequestBody: JsonObject?): Response<ResponseBody> {
        return cashFreeApi.saveCashFreeResponse(contentType, cfTxnRequestBody, SharedPrefManager.getInstance().loggedInUserAccessToken,)
    }

    override suspend fun createOrderTokenInCashFree(
        transactionId: String?,
        orderId: Long?,
        version: Int
    ): Response<ResponseBody> {
        return cashFreeApi.createOrderTokenInCashFree(contentType, transactionId, orderId, SharedPrefManager.getInstance().loggedInUserAccessToken, version)
    }

}