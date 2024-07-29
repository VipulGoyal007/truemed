package com.intellihealth.truemeds.mvvm.data.mixpanel

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import java.util.*

@Keep
data class MxCouponApplied (
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount : Double? = null,
    @SerializedName("coupon_expiry_date")
    var couponExpiryDate : Date? = null,
    @SerializedName("coupon_expiry_period")
    var couponExpiryPeriod : Int?= null,
    @SerializedName("coupon_id")
    var couponId : String? = null,
    @SerializedName("coupon_name")
    var couponName : String? = null,
    @SerializedName("coupon_subtitle")
    var couponSubtitle : String? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount : Double?= null,
    @SerializedName("discount_amount")
    var discountAmount : Double? = null,
    @SerializedName("item_names")
    var itemNames: List<String?>? = null,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount : Double?= null,
    @SerializedName("no_of_item")
    var noOfItem : Int?= null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("packaging_charges_amount")
    var packagingChargesAmount : Double?= null,
    @SerializedName("previous_estimated_payable_amount")
    var previousEstimatedPayableAmount : Double? = null,
    @SerializedName("products_ids")
    var productsIds: List<String?>? = null,
    @SerializedName("subs_id")
    var subsId : String? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount : Double?= null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount : Double?= null,
    @SerializedName("updated_estimated_payable_amount")
    var updatedEstimatedPayableAmount: Double?= null,
    @SerializedName("urgency_time_remaining")
    var urgencyTimeRemaining: Long?= null,
    @SerializedName("total_discount_amount")
    var total_discount_amount: String? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge : Double?= null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null
)