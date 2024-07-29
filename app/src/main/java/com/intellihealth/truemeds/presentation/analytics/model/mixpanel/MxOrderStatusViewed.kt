package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.clevertap.CtOrderStatusViewed


data class MxOrderStatusViewed(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("current_order_status")
    var currentOrderStatus: Int? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("estimated_delivery_date")
    var estimatedDeliveryDate: String? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("pay_cta_visible")
    var payCtaVisible: Boolean? = false,
    @SerializedName("sales_price")
    var salesPrice: Double? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    @SerializedName("wh_id")
    var whId: String? = null
){
    fun toCleverTap() : CtOrderStatusViewed {
        return CtOrderStatusViewed(orderId, currentOrderStatus, estimatedDeliveryDate)
    }
}