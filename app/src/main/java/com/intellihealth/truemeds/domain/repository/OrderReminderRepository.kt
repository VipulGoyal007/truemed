package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse
import com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel
import com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse
import com.intellihealth.truemeds.data.utils.Resource
import okhttp3.ResponseBody
import retrofit2.Response

interface OrderReminderRepository {
    /**
     * This service provides reminder list which is set customer
     * **/
    suspend fun getReminders(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        patientId: Long?
    ): Resource<Response<GetReminderResponse>>

    /**
     * This service is used to set reminder with date and frequency of reminder
     * **/
    suspend fun setReminder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        reminderRequestModel: ReminderRequestModel
    ): Resource<Response<SetReminderResponse>>

    /**
     * This service is used to delete selected reminder
     * **/
    suspend fun deletePillReminderData(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        reminderId: Long
    ): Resource<Response<ResponseBody>>
}