package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName
import org.json.JSONArray


data class MxPspViewed(
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("cta_type")
    var ctaType: String? = null,
    @SerializedName("page_state")
    var pageState: String? = null,
    @SerializedName("available_payment_modes")
    var availablePaymentModes: JSONArray? = null,
    @SerializedName("payment_mode")
    var paymentMode: String? = null,
    @SerializedName("is_reorder")
    var isReorder: Boolean = false,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("no_of_item") var
    noOfItem: Int? = null,
    @SerializedName("products_ids")
    var productsIds: List<String>? = null,
    @SerializedName("subs_id")
    var subsId: String? = null,
    @SerializedName("sales_price")
    var salesPrice: Double? = null,
    @SerializedName("item_names")
    var itemNames: List<String>? = null,
    @SerializedName("applied_coupon_name")
    var appliedCouponName: String? = null,
    @SerializedName("applied_coupon_type")
    var appliedCouponType: String? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double? = null,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("rx_required")
    var rxRequired: Boolean = false,
    @SerializedName("payment_method")
    var paymentMethod: String? = null,
    @SerializedName("patient_type")
    var patientType: String? = null,
    @SerializedName("patient_age")
    var patientAge: Int? = null,
    @SerializedName("shipping_city")
    var shippingCity: String? = null,
    @SerializedName("shipping_state")
    var shippingState: String? = null,
    @SerializedName("shipping_pincode")
    var shippingPinCode: String? = null,
    @SerializedName("address_type")
    var addressType: String? = null,
    @SerializedName("gender")
    var gender: String? = null,
    @SerializedName("current_order_status")
    var currentOrderStatus: String? = null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge: Double? = null
)