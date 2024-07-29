package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxApplyCouponClick(
    @SerializedName("mrp")
    var mrp: Double? = null,
    @SerializedName("order_id")
    var orderId: Long? = null,
    @SerializedName("sales_price")
    var salesPrice: Double? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)