package com.intellihealth.truemeds.data.model.orderreminder

class SetReminderResponse
    (
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var timeTakenInMs: Int = 0,
    var responseData: ResponseData
) {
    data class ResponseData(
        var reminderId: Long = 0
    )
}