package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import androidx.annotation.Keep
import com.google.gson.JsonArray
import com.google.gson.annotations.SerializedName

@Keep
data class MXSuperCategorySectionImpression(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("glance_time")
    var glanceTime: Long? = null,
    @SerializedName("super_category_name")
    var superCategoryName: String? = null,
    @SerializedName("category_list")
    var categoryList: JsonArray?=null,
    @SerializedName("category_count")
    var categoryCount: Int? = null,
    @SerializedName("super_category_index")
    var superCategoryIndex: Int? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
)