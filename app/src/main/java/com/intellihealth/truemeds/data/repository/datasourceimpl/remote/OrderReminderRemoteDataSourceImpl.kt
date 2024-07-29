package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.intellihealth.truemeds.data.api.OrderReminderApi
import com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse
import com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel
import com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderReminderRemoteDataSource
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class OrderReminderRemoteDataSourceImpl @Inject constructor(
    private val orderReminderApi: OrderReminderApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : OrderReminderRemoteDataSource{

    //private val authorization = SharedPrefManager.getInstance().loggedInUserAccessToken
    override suspend fun getReminders(
        customerId: String,
        patientId: Long?
    ): Response<GetReminderResponse> {
        return orderReminderApi.getReminders(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId, patientId)
    }

    override suspend fun setReminder(requestModel: ReminderRequestModel?): Response<SetReminderResponse> {
        return orderReminderApi.setReminder(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, requestModel)
    }

    override suspend fun deletePillReminderData(
        customerId: String,
        reminderId: Long
    ): Response<ResponseBody> {
        return orderReminderApi.deletePillReminderData(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId, reminderId)
    }
}