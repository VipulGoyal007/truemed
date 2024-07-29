package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
//import com.intellihealth.truemeds.utils.Constants

@Keep
data class AFOrderCancelled(
    @SerializedName("mrp_total_amount") val mrpTotalAmount: Double? = 0.0,
    @SerializedName("selling_price_total_amount") var sellingPriceTotalAmount: Double? = 0.0,
    @SerializedName("discount_amount") val discountAmount: Double? = 0.0,
    @SerializedName("packaging_charge_amount") val packingChargeAmount: Double? = 0.0,
    @SerializedName("delivery_charge_amount") val deliveryChargeAmount: Double? = 0.0,
    @SerializedName("tm_credit_amount") val tmCreditAmount: Double? = 0.0,
    @SerializedName("tm_reward_amount") val tmRewardAmount: Double? = 0.0,
    @SerializedName("af_revenue") val afRevenue: Double? = 0.0,
    @SerializedName("estimated_payable_amount") val estimatedPayableAmount: Double? = 0.0,
    @SerializedName("no_of_items") val noOfItem: Int? = 0,
    @SerializedName("is_chronic_added") val isChronicAdded: Boolean?,
    @SerializedName("is_substitute_added") val isSubsAdded: Boolean? = false,
    @SerializedName("is_ftc") val is_ftc: Boolean? = false,
    @SerializedName("order_id") val order_id: String? = "",
    @SerializedName("products_ids") val products_ids: String? = "",
    @SerializedName("af_currency") val afCurrency: String = /*Constants.AF_CURRENCY*/ "INR",
    @SerializedName("payment_method") var paymentMethod: String? = null,
    @SerializedName("coupon_discount") var couponDiscount: Double? = 0.0,
)