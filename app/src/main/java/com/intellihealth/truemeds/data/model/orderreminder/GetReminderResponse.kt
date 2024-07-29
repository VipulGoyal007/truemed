package com.intellihealth.truemeds.data.model.orderreminder

import com.intellihealth.truemeds.data.model.reminder.ReminderListModel

data class GetReminderResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var timeTakenInMs: Int = 0,
    var responseData: List<ResponseData>

) {
    data class ResponseData(
        val createdOn: Long? = 0L,
        val customerId: Int? = 0,
        val frequency: Int? = 0,
        val id: Int? = 0,
        val lastCall: Any? = null,
        val modifiedOn: Long? = 0L,
        val notes: Any? = null,
        val orderId: Long? = 0L,
        val orderValue: Double? = 0.0,
        val patientId: Int? = 0,
        val patientName: String? = "",
        val pillReminderByDate: Any? = null,
        val pillReminderType: Int? = 0,
        val pillReminderTypeName: String? = "",
        val reasonId: Int? = 0,
        val reminderDate: String? = "",
        val reminderOn: Long? = 0L,
        val setByPharmacist: Boolean? = false,
        val setByPharmicist: Boolean? = false,
        val sheduleCall: Any? = null,
        val status: Any? = null,
        val ftc: Boolean? = false
    ) {
        fun toReminderListModel(): ReminderListModel.ReminderList {
            return ReminderListModel.ReminderList(
                id = id!!.toLong(),
                frequency = frequency,
                reminderDate = reminderDate,
                patientName = patientName,
                patientId = patientId
            )
        }
    }

}