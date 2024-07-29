package com.intellihealth.truemeds.data.model.walletandreferral

import com.google.gson.annotations.SerializedName

data class RedeemResponse(

    val responseData: ResponseData? = null,
    val message: String? = null,
    val statusCode: Int? = null,
    val statusValue: String? = null,
    val timeTakenInMs: Int? = null

    )
data class ResponseData(
    @SerializedName("SuccessText")
    val successText: String? = null,
    val Success: String? = null,
    val Conflict: String? = null,
    val Claimed: String? = null,
)
