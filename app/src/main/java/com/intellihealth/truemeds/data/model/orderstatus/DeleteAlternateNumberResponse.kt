package com.intellihealth.truemeds.data.model.orderstatus


import com.google.gson.annotations.SerializedName

data class DeleteAlternateNumberResponse(
    @SerializedName("message")
    val message: String,
    @SerializedName("responseData")
    val responseData: ResponseData,
    @SerializedName("statusCode")
    val statusCode: Int,
    @SerializedName("statusValue")
    val statusValue: String,
    @SerializedName("timeTakenInMs")
    val timeTakenInMs: Int
) {
    class ResponseData
}