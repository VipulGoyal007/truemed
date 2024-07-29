package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFItemSearched(
    @SerializedName("term_searched") val term_searched: String? = "",
    @SerializedName("result_found_count") val result_found_count: Int? = 0
)