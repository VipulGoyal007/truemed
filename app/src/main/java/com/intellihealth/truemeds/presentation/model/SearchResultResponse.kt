package com.intellihealth.truemeds.presentation.model

import com.google.gson.annotations.SerializedName

data class SearchResultResponse(
    @SerializedName("message") var message: String? = null,
    @SerializedName("statusValue") var statusValue: String? = null,
    @SerializedName("statusCode") var statusCode: Int? = null,
    @SerializedName("timeTakenInMs") var timeTakenInMs: Int? = null,
    @SerializedName("responseData") var responseData: SearchResultElasticResponse? = null
)
