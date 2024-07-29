package com.intellihealth.truemeds.data.model.home

import com.google.errorprone.annotations.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class ReorderResponse(
    @SerializedName("message") var message: String? = null,
    @SerializedName("statusValue") var statusValue: String? = null,
    @SerializedName("statusCode") var statusCode: Int? = null,
    @SerializedName("timeTakenInMs") var timeTakenInMs: Int? = null,
    @SerializedName("responseData") var responseData: ResponseData? = null//ResponseData()

)

@Keep
data class ResponseData(
    @SerializedName("orderId") var orderId: Long? = null,
    @SerializedName("isReOrder") var isReOrder: Boolean? = null
)