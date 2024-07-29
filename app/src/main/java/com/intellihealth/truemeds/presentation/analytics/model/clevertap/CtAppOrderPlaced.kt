package com.intellihealth.truemeds.data.model.clevertap

import com.google.gson.annotations.SerializedName
import org.json.JSONArray

data class CtAppOrderPlaced(
    @SerializedName("is_reorder")
    var isReorder: Boolean? = false,

    @SerializedName("shipping_city")
    var shippingCity: String? = null,

    @SerializedName("shipping_state")
    var shippingState: String? = null,

    @SerializedName("gender")
    var gender: String? = null,

    @SerializedName("patient_type")
    var patientType: String? = null,

    @SerializedName("no_of_item")
    var noOfItem: Int? = null,

    @SerializedName("org_subs_id")
    var orgSubsId: String? = null,

    @SerializedName("item_names")
    var itemNames: List<String?>? = null,

    @SerializedName("sales_price")
    var salesPrice: Double? = null,

    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,

    @SerializedName("discount_amount")
    var discountAmount: Double? = null,

    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,

    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,

    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,

    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,

    @SerializedName("patient_age")
    var patientAge: Int? = null,

    @SerializedName("shipping_pincode")
    var shippingPincode: Int? = null,

    @SerializedName("coupon_applied")
    var couponApplied: Boolean = false,
    @SerializedName("order_id")
    var orderId: String? = null
)
