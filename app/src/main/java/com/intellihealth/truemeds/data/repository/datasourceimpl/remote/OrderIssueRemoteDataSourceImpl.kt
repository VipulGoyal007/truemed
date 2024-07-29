package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import android.content.Context
import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.api.OrderIssueApi
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderIssueRemoteData
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class OrderIssueRemoteDataSourceImpl  @Inject constructor(
    @ApplicationContext context: Context,
    private val orderIssueApi: OrderIssueApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : OrderIssueRemoteData {

    //private val authorization: String = SharedPrefManager.getInstance().loggedInUserAccessToken

    override suspend fun getAllIssueMedicines(
        orderId: Long?,
        customerId: Long?
    ): Response<ResponseBody?> {
        return orderIssueApi.getAllIssueMedicines(contentType,SharedPrefManager.getInstance().loggedInUserAccessToken,orderId,customerId)
    }

    override suspend fun raiseOrderIssues(
        orderId: Long?,
        ticketObj: JsonObject?,
        isReturn: String?,
        customerId: Long?
    ): Response<ResponseBody?> {
        return orderIssueApi.raiseOrderIssues(contentType,SharedPrefManager.getInstance().loggedInUserAccessToken,orderId,ticketObj,isReturn,customerId)
    }

    override suspend fun getTicketIssueDetails(
        ticketId: String?,
        customerId: Long?
    ): Response<ResponseBody?> {
        return orderIssueApi.getTicketIssueDetails(contentType,SharedPrefManager.getInstance().loggedInUserAccessToken,ticketId,customerId)
    }
}