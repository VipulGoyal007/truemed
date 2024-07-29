package com.intellihealth.truemeds.data.model.orderstatus

data class DoctorRating(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData ? = null

){
    class ResponseData
}


