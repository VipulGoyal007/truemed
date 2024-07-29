package com.intellihealth.truemeds.presentation.analytics.model.clevertap

import com.google.gson.annotations.SerializedName

data class CtSrpViewed(
    @SerializedName("term_searched")
    var termSearched: String? = null,
    @SerializedName("results_viewed")
    var resultsViewed: List<String?>? = null,
)
