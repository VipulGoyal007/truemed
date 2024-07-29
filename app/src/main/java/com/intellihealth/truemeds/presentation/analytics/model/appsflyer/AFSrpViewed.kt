package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFSrpViewed(
    @SerializedName("result_list") val result_list: String? = "",
    @SerializedName("suggestion_term_clicked") val suggestion_term_clicked: String? = "",
    @SerializedName("term_searched") val term_searched: String? = ""

)