package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxPdpMedicineDetailsViewed(
    @SerializedName("product_details_section")
    var productDetailsSection: String? = null,
    @SerializedName("product_id")
    var productId: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("product_name")
    var product_name:String?= null
)