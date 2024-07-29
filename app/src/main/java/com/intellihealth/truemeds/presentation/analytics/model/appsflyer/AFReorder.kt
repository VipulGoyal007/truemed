package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFReorder(
    @SerializedName("clicked_on_page") var clickedOnPage : String?="",
    @SerializedName("no_of_items") var noOfItems : Int?=0,
    @SerializedName("past_final_order_amount") var pastFinalOrderAmount : Double?=0.0,
    @SerializedName("mrp_total_amount") var mrpTotalAmount : Double?=0.0,
    @SerializedName("selling_price_total_amount") var sellingPriceTotalAmount : Double?=0.0,
    @SerializedName("discount_amount") var discountAmount : Double?=0.0,
    @SerializedName("past_order_coupon_applied") var pastOrderCouponApplied : String?="",
    @SerializedName("past_order_chronic_added") var pastOrderChronicAdded : Boolean?=false,
    @SerializedName("past_order_subs_added") var pastOrderSubsAdded : Boolean?=false,
    @SerializedName("customer_reordered_previously") var cxReorderdPreviously : Boolean?=false,
    @SerializedName("current_order_reorder_number") var reOrderNo : Long?=0,
)