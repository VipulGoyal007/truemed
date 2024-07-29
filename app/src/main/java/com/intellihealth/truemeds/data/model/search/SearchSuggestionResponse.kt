package com.intellihealth.truemeds.data.model.search

import com.google.gson.annotations.SerializedName

data class SearchSuggestionResponse(
    @SerializedName("message") var message: String? = null,
    @SerializedName("statusValue") var statusValue: String? = null,
    @SerializedName("statusCode") var statusCode: Int? = null,
    @SerializedName("timeTakenInMs") var timeTakenInMs: Int? = null,
    @SerializedName("responseData") var responseData: SuggestionResponseData? = SuggestionResponseData()


)