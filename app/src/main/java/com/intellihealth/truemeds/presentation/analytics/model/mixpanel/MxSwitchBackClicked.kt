package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxSwitchBackClicked(
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("org_product_name")
    var orgProductName: String? = null,
    @SerializedName("subs_product_name")
    var subsProductName: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)