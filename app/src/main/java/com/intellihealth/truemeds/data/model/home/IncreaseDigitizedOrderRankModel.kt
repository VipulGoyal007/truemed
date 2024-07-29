package com.intellihealth.truemeds.data.model.home

import com.google.gson.annotations.SerializedName


data class IncreaseDigitizedOrderRankModel(
    @SerializedName("message")
    val message: String = "",
    @SerializedName("responseData")
    val responseData: ResponseData?  ,
    @SerializedName("statusCode")
    val statusCode: Int = 0,
    @SerializedName("statusValue")
    val statusValue: String = "",
    @SerializedName("timeTakenInMs")
    val timeTakenInMs: Int = 0
) {
    data class ResponseData(

        @SerializedName("doctorCallMsg")
        val doctorCallMsg: String = ""
    )

}
