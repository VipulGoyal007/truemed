package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
//import com.intellihealth.truemeds.utils.Constants

@Keep
data class AFOrderSummaryViewed(
    @SerializedName("mrp_total_amount") val mrpTotalAmount: Double? = 0.0,
    @SerializedName("selling_price_total_amount") val sellingPriceTotalAmount: Double? = 0.0,
    @SerializedName("discount_amount") val discountAmount: Double? = 0.0,
    @SerializedName("packaging_charge_amount") val packingChargeAmount: Double? = 0.0,
    @SerializedName("delivery_charge_amount") val deliveryChargeAmount: Double? = 0.0,
    @SerializedName("tm_credit_amount") val tmCreditAmount: Double? = 0.0,
    @SerializedName("tm_reward_amount") val tmRewardAmount: Double? = 0.0,
    @SerializedName("af_revenue") val afRevenue: Double? = 0.0,
    @SerializedName("no_of_items") val noOfItem: Int? = 0,
    @SerializedName("estimated_payable_amount") val estimatedPayableAmount: Double? = 0.0,
    @SerializedName("is_chronic_added") val isChronicAdded: Boolean?,
    @SerializedName("is_substitute_added") val isSubsAdded: Boolean? = false,
    @SerializedName("coupon_discount_amount") val couponDiscountAmount: Double? = 0.0,
  //  @SerializedName("coupon_applied") val couponApplied: String? = "",
    @SerializedName("coupon_applied") val couponApplied: Boolean? = false,
    @SerializedName("af_currency") val afCurrency: String = /*Constants.AF_CURRENCY*/ "INR"
)