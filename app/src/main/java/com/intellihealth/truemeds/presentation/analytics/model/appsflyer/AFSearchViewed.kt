package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFSearchViewed(
    @SerializedName("clicked_on_page")val clickedOnPage : String? = "",
    @SerializedName("page_section")val pageSection : String? = "",
)