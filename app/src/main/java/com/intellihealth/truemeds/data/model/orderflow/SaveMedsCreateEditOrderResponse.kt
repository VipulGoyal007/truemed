package com.intellihealth.truemeds.data.model.orderflow

import com.google.gson.annotations.SerializedName

data class SaveMedsCreateEditOrderResponse(
    
    @SerializedName("message")
    var message : String? = null,
    @SerializedName("statusValue")
    var statusValue : String? = null,
    @SerializedName("statusCode")
    var statusCode : Int? = null,
    @SerializedName("timeTakenInMs")
    var timeTakenInMs : Int? = null,
    @SerializedName("responseData")
    var responseData : ResponseData? = ResponseData(),
    @SerializedName("logoUrlList")
    var logoUrlList : String? = null
) {
    data class ResponseData (
        @SerializedName("subOrderId")
        var subOrderId : Long? = null,
        @SerializedName("orderId")
        var orderId : Long? = null,
        @SerializedName("cappingLimitMessage")
        var cappingLimitMessage : String? = null
    )
}