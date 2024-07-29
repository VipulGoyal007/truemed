package com.intellihealth.truemeds.data.model.orderstatus


data class AlternateNumberResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData:  ResponseData ? = null

){
    class ResponseData
}