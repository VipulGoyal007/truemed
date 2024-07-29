package com.intellihealth.truemeds.data.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderreminder.GetReminderResponse
import com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel
import com.intellihealth.truemeds.data.model.orderreminder.SetReminderResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.OrderReminderRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.OrderReminderRepository
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class OrderReminderRepositoryImpl @Inject constructor(
    private val orderReminderRemoteDataSource: OrderReminderRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : OrderReminderRepository {
    override suspend fun getReminders(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        patientId: Long?
    ): Resource<Response<GetReminderResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderReminderRemoteDataSource.getReminders(customerId, patientId) }
    }

    override suspend fun setReminder(
        mxInternalErrorOccurred: MxInternalErrorOccurred, reminderRequestModel: ReminderRequestModel
    ): Resource<Response<SetReminderResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { orderReminderRemoteDataSource.setReminder(reminderRequestModel) }
    }

    override suspend fun deletePillReminderData(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        reminderId: Long
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            orderReminderRemoteDataSource.deletePillReminderData(
                customerId,
                reminderId
            )
        }
    }
}