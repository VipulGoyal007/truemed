package com.intellihealth.truemeds.data.model.user

data class SavePatientResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var isSuccess: Boolean = true,
    var responseData: ResponseData
){
    data class ResponseData(
        val patientId: Long? = 0
    )
}