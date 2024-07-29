package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxReminderBottomSheetViewed(
    @SerializedName("address_type")
    var addressType: String? = null,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("delivery_charge")
    var deliveryCharge: Double? = null,
    @SerializedName("delivery_days")
    var deliveryDays: Double? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("gender")
    var gender: String? = null,
    @SerializedName("is_dr_call_required")
    var isDrCallRequired: Boolean = false,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("patient_age")
    var patientAge: Int? = null,
    @SerializedName("patient_type")
    var patientType: String? = null,
    @SerializedName("payment_method")
    var paymentMethod: String? = null,
    @SerializedName("rx_required")
    var rxRequired: Boolean? = null,
    @SerializedName("shipping_city")
    var shippingCity: String? = null,
    @SerializedName("shipping_pincode")
    var shippingPincode: String? = null,
    @SerializedName("shipping_state")
    var shippingState: String? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    @SerializedName("variant_name")
    var variantName: String? = null,
    @SerializedName("viewed_on_page")
    var viewedOnPage: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge: Double? = null
)