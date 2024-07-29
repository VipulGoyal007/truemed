package com.intellihealth.truemeds.data.model.clevertap

import com.google.gson.annotations.SerializedName

data class CtOrderStatusViewed(
    @SerializedName("order_id")
    var orderId: String? = null,

    @SerializedName("current_order_status")
    var currentOrderStatus: Int? = null,

    @SerializedName("estimated_delivery_date")
    var estimatedDeliveryDate: String? = null,

    )
