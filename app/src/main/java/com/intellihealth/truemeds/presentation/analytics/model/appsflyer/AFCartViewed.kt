package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
//import com.intellihealth.truemeds.utils.Constants

@Keep
data class AFCartViewed(
    @SerializedName("mrp_total_amount") val mrp_total_amount: Double? = 0.0,
    @SerializedName("selling_price_total_amount") val selling_price_total_amount: Double? = 0.0,
    @SerializedName("packaging_charge_amount") val packaging_charge_amount: Double? = 0.0,
    @SerializedName("delivery_charge_amount") val delivery_charge_amount: Double? = 0.0,
    @SerializedName("coupon_discount_amount") val coupon_discount_amount: Double? = 0.0,
    @SerializedName("tm_credit_amount") val tm_credit_amount: Double = 0.0,
    @SerializedName("tm_reward_amount") val tm_reward_amount: Double? = 0.0,
    @SerializedName("no_of_items") val no_of_item: Int? = 0,
    @SerializedName("estimated_payable_amount") val estimated_payable_amount: Double = 0.0,
    @SerializedName("is_substitute_added") val is_substitute_added: Boolean? = false,
    @SerializedName("discount_amount") val discount_amount: Double? = 0.0,
    @SerializedName("coupon_applied") val coupon_applied: Boolean? = false,
    @SerializedName("applied_coupon_name") val applied_coupon_name: String? = "",
    @SerializedName("af_revenue") val af_revenue: Double? = 0.0,
    @SerializedName("is_chronic_added") val is_chronic_added : Boolean? = null,
    @SerializedName("af_currency") val afCurrency: String = /*Constants.AF_CURRENCY*/ "INR"
)