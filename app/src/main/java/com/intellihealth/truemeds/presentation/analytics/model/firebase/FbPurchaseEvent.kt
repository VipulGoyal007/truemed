package com.intellihealth.truemeds.presentation.analytics.model.firebase

import com.google.gson.annotations.SerializedName

data class FbPurchaseEvent(
//    todo add firebase existing parameter also
    @SerializedName("customer_id")
    var customerId: String? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    var estimatedPayableAmount: Double,
)
