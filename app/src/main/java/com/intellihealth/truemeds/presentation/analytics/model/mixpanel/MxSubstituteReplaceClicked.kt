package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxSubstituteReplaceClicked(
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("is_quantity_updated")
    var isQuantityUpdated: Boolean = false,
    @SerializedName("is_replace_all")
    var isReplaceAll: Boolean = false,
    @SerializedName("item_names")
    var itemNames: List<String?>? = null,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("replace_all_total_possible_savings")
    var replaceAllTotalPossibleSavings: Double? = null,
    @SerializedName("replace_savings")
    var replaceSavings: Double? = null,
    @SerializedName("replaceable_items_count")
    var replaceableItemsCount: Int? = null,
    @SerializedName("replaced_items_count")
    var replacedItemsCount: Int? = null,
    @SerializedName("selected_substitutable_items_list")
    var selectedSubstitutableItemsList: List<String?>? = null,
    @SerializedName("selected_substitute_items_list")
    var selectedSubstituteItemsList: List<String?>? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge: Double? = null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null
)