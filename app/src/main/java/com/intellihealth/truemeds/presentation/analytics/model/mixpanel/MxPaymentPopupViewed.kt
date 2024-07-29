package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxPaymentPopupViewed(
    @SerializedName("cta_type")
    var ctaType: String? = null,
    @SerializedName("current_order_status")
    var currentOrderStatus: String? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("is_reorder")
    var isReorder: Boolean = false,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("payment_mode")
    var paymentMode: String? = null,
    @SerializedName("sales_price")
    var salesPrice: Double? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("applied_coupon_name")
    var appliedCouponName: String? = null,
    @SerializedName("applied_coupon_type")
    var appliedCouponType: String? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double? = null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge: Double? = null
)