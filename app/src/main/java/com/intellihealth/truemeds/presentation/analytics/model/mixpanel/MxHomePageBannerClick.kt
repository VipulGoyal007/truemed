package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName

data class MxHomePageBannerClick(
    @SerializedName("banner_index")
    var bannerIndex: Int? = null,
    @SerializedName("image_name")
    var imageName: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)