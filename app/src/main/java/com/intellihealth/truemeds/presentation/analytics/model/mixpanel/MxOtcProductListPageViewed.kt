package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class MxOtcProductListPageViewed(
    @SerializedName("super_category_name")
    var superCategoryName: String? = null,
    @SerializedName("category_name")
    var categoryName: String? = null,
    @SerializedName("sub_category_name")
    var subCategoryName: String? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("filter_applied")
    var filterApplied: Boolean = false,
    @SerializedName("brands_selected")
    var brandsSelected: List<String>?=null,
    @SerializedName("banner_viewed")
    var bannerViewed: Boolean = false,
    @SerializedName("is_empty")
    var isEmpty: Boolean = false,
)