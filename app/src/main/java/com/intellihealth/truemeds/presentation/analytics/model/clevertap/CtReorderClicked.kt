package com.intellihealth.truemeds.data.model.clevertap

import com.google.gson.annotations.SerializedName

data class CtReorderClicked(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,

    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,

    @SerializedName("discount_amount")
    var discountAmount: Double? = null,

    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,

    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,

    @SerializedName("tm_reward_amount")
    var tmRewardAmount: String? = null,

    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,

    @SerializedName("savings_amount")
    var savingsAmount: Double? = null,

)
