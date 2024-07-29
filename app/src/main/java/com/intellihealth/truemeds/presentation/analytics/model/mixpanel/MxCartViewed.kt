package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.clevertap.CtCartViewed
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFCartViewed
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import org.json.JSONArray


data class MxCartViewed(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,

    @SerializedName("page_section")
    var pageSection: String? = null,

    @SerializedName("applied_coupon_name")
    var appliedCouponName: String? = null,

    @SerializedName("coupon_applied")
    var couponApplied: Boolean = false,

    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,

    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double? = null,

    @SerializedName("discount_amount")
    var discountAmount: Double? = null,

    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,

    @SerializedName("is_replace_all_visible")
    var isReplaceAllVisible: Boolean = false,

    @SerializedName("item_names")
    var itemNames: List<String>? = null,

    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,

    @SerializedName("no_of_item")
    var noOfItem: Int? = null,

    @SerializedName("order_id")
    var orderId: String? = null,

    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,

    @SerializedName("prescription_uploaded_count")
    var prescriptionUploadedCount: Int? = null,

    @SerializedName("products_ids")
    var productsIds: List<String>? = null,

    @SerializedName("replace_all_total_possible_savings")
    var replaceAllTotalPossibleSavings: Double? = null,

    @SerializedName("replaceable_items_count")
    var replaceableItemsCount: Int? = null,

    @SerializedName("rx_required")
    var rxRequired: Boolean = false,

    @SerializedName("sales_price")
    var salesPrice: Double? = null,

    @SerializedName("subs_id")
    var subsId: String? = null,

    @SerializedName("substitutable_items_list")
    var substitutableItemsList: List<String>? = null,

    @SerializedName("substitute_items_list")
    var substituteItemsList: List<String>? = null,

    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,

    @SerializedName("tm_reward_amount")

    var tmRewardAmount: Double? = null,

    @SerializedName("urgency_time_remaining")
    var urgencyTimeRemaining: Long? = null,

    @SerializedName("is_reorder")
    var is_reorder: Boolean = false,

    @SerializedName("type_of_reorder")
    var type_of_reorder: String? = null,

    @SerializedName("total_discount_amount")
    var total_discount_amount: String? = null,

    @Transient
    var isChronic: Boolean? = false,

    @SerializedName("cash_handling_charge")
    var cashHandlingCharge: Double? = null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null

){
    fun toCleverTap():CtCartViewed {
        return CtCartViewed(noOfItem, estimatedPayableAmount, salesPrice, JSONArray(itemNames), mrpTotalAmount, couponApplied, couponDiscountAmount, appliedCouponName,
            discountAmount, tmCreditAmount, tmRewardAmount)
    }
    fun toAppsFlyer():Map<String, Any> {
        return AppsFlyerEvent.convertJsonToHashmap(
            Gson().toJson(AFCartViewed(mrp_total_amount = mrpTotalAmount,
                selling_price_total_amount = if (salesPrice != null) {
                    if (salesPrice != 0.0) salesPrice else null
                } else {
                    null
                },
                packaging_charge_amount = if (packagingChargeAmount != null) {
                    if (packagingChargeAmount != 0.0) packagingChargeAmount else null
                } else {
                    null
                },
                delivery_charge_amount = if (deliveryChargeAmount != null) {
                    /*if (deliveryChargeAmount != 0.0) */deliveryChargeAmount /*else null*/
                } else {
                    null
                },
                coupon_discount_amount = if (couponDiscountAmount != null) {
                    if (couponDiscountAmount != 0.0) couponDiscountAmount else null
                } else {
                    null
                },
                tm_credit_amount = tmCreditAmount ?: 0.0,
                tm_reward_amount = if (tmRewardAmount != null) {
                    if (tmRewardAmount != 0.0) tmRewardAmount else null
                } else {
                    null
                },
                no_of_item = noOfItem,
                estimated_payable_amount = estimatedPayableAmount ?: 0.0,
                discount_amount = discountAmount,
                coupon_applied = couponApplied,
                applied_coupon_name = if (appliedCouponName.isNullOrEmpty()) null else appliedCouponName,
                af_revenue = (estimatedPayableAmount ?: 0.0) + (tmCreditAmount ?:0.0),
                is_chronic_added = isChronic,
                is_substitute_added = SharedPrefManager.getInstance().cxAcceptedCount>0)))
    }
}