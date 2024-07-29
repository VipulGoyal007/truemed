package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class MxBannerClicked(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("super_category_name")
    var superCategoryName: String? = null,
    @SerializedName("banner_name")
    var bannerName: String? = null,
    @SerializedName("banner_url_link")
    var bannerUrlLink: String? = null,
    @SerializedName("image_name")
    var image_name: String? = null
)