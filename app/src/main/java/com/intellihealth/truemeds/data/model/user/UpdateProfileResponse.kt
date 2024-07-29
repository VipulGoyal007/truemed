package com.intellihealth.truemeds.data.model.user

data class UpdateProfileResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData

){
    data class ResponseData(
        val customerId: Long?,
        val patientId: Long?,
        val customerName: String?
    )
}