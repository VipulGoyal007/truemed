package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName

data class MxLoginPageViewed(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("is_truecaller")
    var isTruecaller: Boolean = false
)