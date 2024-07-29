package com.intellihealth.truemeds.data.repository.datasource.remote

import com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse
import com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel
import com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse
import okhttp3.ResponseBody
import retrofit2.Response

interface OrderReminderRemoteDataSource {
    suspend fun getReminders(
        customerId: String,
        patientId: Long?
    ): Response<GetReminderResponse>

    suspend fun setReminder(
        requestModel: ReminderRequestModel?,
    ): Response<SetReminderResponse>

    suspend fun deletePillReminderData(
        customerId: String,
        reminderId: Long
    ): Response<ResponseBody>
}