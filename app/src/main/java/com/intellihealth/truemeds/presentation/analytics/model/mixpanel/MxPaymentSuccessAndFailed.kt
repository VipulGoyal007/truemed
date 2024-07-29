package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName

//todo same use for payment_successful
data class MxPaymentSuccessAndFailed(
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("failure_type")
    var failureType: String? = null,
    @SerializedName("is_reorder")
    var isReorder: Boolean = false,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("order_id")
    var orderId: Long? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("payment_mode")
    var paymentMode: String? = null,
    @SerializedName("pg_response_code")
    var pgResponseCode: String? = null,
    @SerializedName("pg_response_statement")
    var pgResponseStatement: String? = null,
    @SerializedName("sales_price")
    var salesPrice: Double? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double = 0.0,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double = 0.0,
    @SerializedName("current_order_status")
    var currentOrderStatus: String? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double = 0.0,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double = 0.0,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge: Double? = null
)