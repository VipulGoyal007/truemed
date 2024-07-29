package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxProductListPageViewed(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("item_list")
    var itemList: List<String?>? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("section_heading")
    var sectionHeading: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)