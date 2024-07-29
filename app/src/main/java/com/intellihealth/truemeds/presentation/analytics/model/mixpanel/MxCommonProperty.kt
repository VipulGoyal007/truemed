package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName

data class MxCommonProperty(
    @SerializedName("wh_id")
    var warehouseId: Int? = null,
    /*@SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("page_section")
    var pageSection: String? = null*/
)
