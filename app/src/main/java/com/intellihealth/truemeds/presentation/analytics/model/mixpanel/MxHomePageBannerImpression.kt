package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName
data class MxHomePageBannerImpression(
    @SerializedName("banner_index")
    var bannerIndex: Int? = null,
    @SerializedName("image_name")
    var imageName: String? = null
)