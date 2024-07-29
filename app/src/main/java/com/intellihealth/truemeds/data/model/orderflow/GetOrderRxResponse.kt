package com.intellihealth.truemeds.data.model.orderflow

import com.google.gson.annotations.SerializedName

data class GetOrderRxResponse(
    @SerializedName("message")
    val message: String,
    @SerializedName("responseData")
    val responseData: ResponseData,
    @SerializedName("statusCode")
    val statusCode: Int,
    @SerializedName("statusValue")
    val statusValue: String,
    @SerializedName("timeTakenInMs")
    val timeTakenInMs: Long
) {
    data class ResponseData(
        @SerializedName("rxList")
        val rxList: List<OrderRxInfo>,
        @SerializedName("rxReqProductList")
        val rxReqProductList: List<String>
    )
}
