package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.clevertap.CtAppOrderCancelled
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFOrderCancelled
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel.Companion.isChroniceOrderStatus
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel.Companion.isSubsAddedOrderStatus


data class MxAppOrderCancelled(
    @SerializedName("address_type")
    var addressType: String? = null,
    @SerializedName("cod_order_value_difference")
    var codOrderValueDifference: Int? = null,
    @SerializedName("coupon_applied")
    var couponApplied: Boolean? = false,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("current_order_state")
    var currentOrderState: String? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Int? = null,
    @SerializedName("delivery_days")
    var deliveryDays: Double? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("first_page_cancel_reason")
    var firstPageCancelReason: String? = null,
    @SerializedName("gender")
    var gender: String? = null,
    @SerializedName("is_cod_defaulter")
    var isCodDefaulter: Boolean? = false,
    @SerializedName("is_reorder")
    var isReorder: Boolean? = false,
    @SerializedName("item_names")
    var itemNames: List<String?>? = null,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("no_of_items")
    var noOfItems: Int? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("patient_age")
    var patientAge: Double? = null,
    @SerializedName("patient_type")
    var patientType: String? = null,
    @SerializedName("payment_method")
    var paymentMethod: String? = null,
    @SerializedName("prescription_uploaded_count")
    var prescriptionUploadedCount: Int? = null,
    @SerializedName("products_ids")
    var productsIds: List<String?>? = null,
    @SerializedName("rx_required")
    var rxRequired: Boolean? = false,
    @SerializedName("savings_amount")
    var savingsAmount: Double? = null,
    @SerializedName("second_page_cancel_reason")
    var secondPageCancelReason: String? = null,
    @SerializedName("shipping_city")
    var shippingCity: String? = null,
    @SerializedName("shipping_pincode")
    var shippingPincode: String? = null,
    @SerializedName("shipping_state")
    var shippingState: String? = null,
    @SerializedName("subs_id")
    var subsId: String? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("other_text")
    var otherText: String? = null,
    @SerializedName("cod_defaulter_type")
    var codDefaulterType: String? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge: Double? = null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null
) {
    fun toCleverTap(): CtAppOrderCancelled {
        return CtAppOrderCancelled(
            isReorder = isReorder,
            couponApplied = couponApplied,
            orderId = orderId,
            rxRequired = rxRequired,
            deliveryDays = deliveryDays,
            paymentMethod = paymentMethod,
            shippingCity = shippingCity,
            shippingState = shippingState,
            discountAmount = discountAmount,
            couponDiscountAmount = couponDiscountAmount,
            estimatedPayableAmount = estimatedPayableAmount,
            savingsAmount = savingsAmount,
            firstPageCancelReason = firstPageCancelReason,
            secondPageCancelReason = secondPageCancelReason
        )
    }

    fun toAppsFlyer(): AFOrderCancelled/*Map<String, Any>*/ {
        return AFOrderCancelled(
                    mrpTotalAmount = mrpTotalAmount,
                    discountAmount = discountAmount,
                    packingChargeAmount = packagingChargeAmount,
                    deliveryChargeAmount = deliveryChargeAmount?.toDouble()?:0.0,
                    tmCreditAmount = tmCreditAmount,
                    tmRewardAmount = tmRewardAmount,
                    afRevenue = ((estimatedPayableAmount ?: 0.0) + (tmCreditAmount ?: 0.0)) ?: 0.0,
                    estimatedPayableAmount = estimatedPayableAmount,
                    noOfItem = noOfItems,
                    isChronicAdded = isChroniceOrderStatus,
                    isSubsAdded = isSubsAddedOrderStatus,
                    is_ftc = SharedPrefManager.getInstance().isFtc,
                    order_id = orderId,
                    products_ids = productsIds.toString(),
                    afCurrency = "INR",
                    paymentMethod = paymentMethod,
                    couponDiscount = couponDiscountAmount,
                /*)
            )*/
        )
    }

}