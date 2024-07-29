package com.intellihealth.truemeds.data.model.search

import com.google.gson.annotations.SerializedName

data class SuggestionResponseData(
    @SerializedName("timeTaken")
    var timeTaken: Int? = null,
    @SerializedName("searchType") var searchType: String? = null,
    @SerializedName("didYouMean") var didYouMeanTriggered: Boolean = false,
    @SerializedName("suggestionWithType") var suggestionWithType: List<SuggestionWithType> = listOf(),
    @SerializedName("productList") var productList: List<ProductList> = listOf()
)
