package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxPdpImageViewed(
    @SerializedName("image_available_count")
    var imageAvailableCount: Int? = null,
    @SerializedName("product_id")
    var productId: String? = null,
    @SerializedName("product_name")
    var productName: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)