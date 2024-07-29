package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxCouponListOpened(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("item_names")
    var itemNames: List<String?>? = null,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("no_of_item")
    var noOfItem: Int? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("packaging_charges_amount")
    var packagingChargesAmount: Double? = null,
    @SerializedName("products_ids")
    var productsIds: List<String?>? = null,
    @SerializedName("subs_id")
    var subsId: String? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge : Double?= null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null
)