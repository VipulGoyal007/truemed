package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.errorprone.annotations.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class MxViewDetailsClicked(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("total_discount_amount")
    var totalDiscountAmount: Double? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,
    @SerializedName("sales_price")
    var salesPrice: Double? = null,
    @SerializedName("pay_cta_visible")
    var payCtaVisible: Boolean? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("estimated_delivery_date")
    var estimatedDeliveryDate: String? = null,
    @SerializedName("order_id")
    var orderId: Long? = null,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double? = null,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("current_order_status")
    var currentOrderStatus: String? = null,
    @SerializedName("applied_coupon_name")
    var appliedCouponName: String? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge : Double?= null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null
)
