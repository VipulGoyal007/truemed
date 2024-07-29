package com.intellihealth.truemeds.data.model.user

data class SaveEmailResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData
){
    data class ResponseData(
        var message: String,
        val emailId: Long?
    )
}