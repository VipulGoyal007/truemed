package com.intellihealth.truemeds.data.model.user

import com.google.gson.annotations.SerializedName

data class NameValidationResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData
) {
    data class ResponseData(
        @SerializedName("PATIENT NAME")
        val patientName: List<String?>? = null
    )
}