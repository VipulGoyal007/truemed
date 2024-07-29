package com.intellihealth.truemeds.data.model.clevertap

import com.google.gson.annotations.SerializedName
import org.json.JSONArray

data class CtCartViewed(
    @SerializedName("no_of_item")
    var noOfItem: Int? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("sales_price")
    var salesPrice: Double? = null,
    @SerializedName("item_names")
    var itemNames: JSONArray? = null,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("coupon_applied")
    var couponApplied: Boolean? = null,

    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,

    @SerializedName("applied_coupon_name")
    var appliedCouponName: String? = null,

    @SerializedName("discount_amount")
    var discountAmount: Double? = null,

    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,

    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    )
