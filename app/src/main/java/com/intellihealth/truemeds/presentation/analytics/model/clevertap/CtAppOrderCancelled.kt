package com.intellihealth.truemeds.data.model.clevertap

import com.google.gson.annotations.SerializedName

data class CtAppOrderCancelled (
    @SerializedName("is_reorder")
    var isReorder: Boolean? = null,

    @SerializedName("coupon_applied")
    var couponApplied: Boolean? = null,

    @SerializedName("order_id")
    var orderId: String? = null,

    @SerializedName("rx_required")
    var rxRequired: Boolean? = null,

    @SerializedName("delivery_days")
    var deliveryDays: Double? = null,

    @SerializedName("payment_method")
    var paymentMethod: String? = null,


    @SerializedName("shipping_city")
    var shippingCity: String? = null,

    @SerializedName("shipping_state")
    var shippingState: String? = null,

    @SerializedName("discount_amount")
    var discountAmount: Double? = null,

    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,

    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,

    @SerializedName("savings_amount")
    var savingsAmount: Double? = null,

    @SerializedName("first_page_cancel_reason")
    var firstPageCancelReason: String? = null,

    @SerializedName("second_page_cancel_reason")
    var secondPageCancelReason: String? = null,

)