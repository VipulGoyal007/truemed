package com.intellihealth.truemeds.data.api

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse
import com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel
import com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface OrderReminderApi {
    @GET(ApiEndpointConstants.GET_REMINDERS)
    suspend fun getReminders(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String,
        @Query("patientId") patientId: Long?,
    ): Response<GetReminderResponse>

    @POST(ApiEndpointConstants.SET_REMINDER)
    suspend fun setReminder(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Body jsonObject: ReminderRequestModel?,
    ): Response<SetReminderResponse>

    @POST(ApiEndpointConstants.CANCEL_REMINDER)
    suspend fun deletePillReminderData(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String,
        @Query("reminderId") reminderId: Long,
    ): Response<ResponseBody>
}