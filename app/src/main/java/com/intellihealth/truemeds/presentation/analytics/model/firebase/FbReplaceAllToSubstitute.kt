package com.intellihealth.truemeds.presentation.analytics.model.firebase

import com.google.gson.annotations.SerializedName

data class FbReplaceAllToSubstitute(
    @SerializedName("subs_source")
    var subsSource: String? = null,

    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,

    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,

    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,


    @SerializedName("savings_amount")
    var savingsAmount: Double? = null,

    @SerializedName("no_of_item")
    var noOfItem: Double? = null,


    @SerializedName("customer_id")
    var customerId: String? = null,

    @SerializedName("order_id")
    var orderId: String? = null,
    )
