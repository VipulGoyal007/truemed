package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFOrderSummaryViewed
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager


data class MxOrderSummaryViewed(
    @SerializedName("address_type")
    var addressType: String? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("cod_order_value_difference")
    var codOrderValueDifference: Double? = null,
    @SerializedName("coupon_applied")
    var couponApplied: Boolean  = false,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("cta_type")
    var ctaType: String? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double? = null,
    @SerializedName("delivery_days")
    var deliveryDays: Int? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("discount_variant_id")
    var discountVariantId: Long? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("gender")
    var gender: String? = null,
    @SerializedName("is_cod_defaulter")
    var isCodDefaulter: Boolean  = false,
    @SerializedName("is_offer_available")
    var isOfferAvailable: Boolean?  = false,
    @SerializedName("is_reorder")
    var isReorder: Boolean  = false,
    @SerializedName("item_names")
    var itemNames: List<String>? = null,
    @SerializedName("mrp")
    var mrp: Double? = null,
    @SerializedName("no_of_item")
    var noOfItem: Int? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("out_of_stock_no")
    var outOfStockNo: Double? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("patient_age")
    var patientAge: Int? = null,
    @SerializedName("patient_type")
    var patientType: String? = null,
    @SerializedName("payment_method")
    var paymentMethod: String? = null,
    @SerializedName("payment_mode")
    var paymentMode: String? = null,
    @SerializedName("prescription_uploaded_count")
    var prescriptionUploadedCount: Int? = null,
    @SerializedName("products_ids")
    var productsIds: List<String?>? = null,
    @SerializedName("rx_required")
    var rxRequired: Boolean  = false,
    @SerializedName("sales_price")
    var salesPrice: Double? = null,
    @SerializedName("shipping_city")
    var shippingCity: String? = null,
    @SerializedName("shipping_pincode")
    var shippingPincode: Int? = null,
    @SerializedName("shipping_state")
    var shippingState: String? = null,
    @SerializedName("subs_id")
    var subsId: String? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Double? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Double? = null,
    @SerializedName("type_of_reorder")
    var typeOfReorder: String? = null,
    @SerializedName("cod_defaulter_type")
    var codDefaulterType: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("urgency_time_remaining")
    var urgencyTimeRemaining: Long? = null,
    @Transient
    var isChronic: Boolean? = false,
    @Transient
    @SerializedName("is_chronic_added")
    var isChronicAdded: Boolean?,
    @SerializedName("applied_coupon_name")
    var appliedCouponName: String? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge : Double?= null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null
){
    fun toAppsFlyer():Map<String, Any> {
        return AppsFlyerEvent.convertJsonToHashmap(
            Gson().toJson(AFOrderSummaryViewed(mrpTotalAmount = mrp,
                    sellingPriceTotalAmount = salesPrice,
                    packingChargeAmount = packagingChargeAmount,
                    deliveryChargeAmount = deliveryChargeAmount,
                    couponDiscountAmount = couponDiscountAmount,
                    tmCreditAmount = tmCreditAmount,
                    tmRewardAmount = tmRewardAmount,
                    noOfItem = noOfItem,
                    estimatedPayableAmount = estimatedPayableAmount,
                    discountAmount = discountAmount,
                   // couponApplied = if(couponDiscountAmount != null && (couponDiscountAmount ?:0.0 > 0) && SharedPrefManager.getInstance().couponModel != null) SharedPrefManager.getInstance().couponModel.promoCode else null,
                    couponApplied = couponApplied,
                    afRevenue = ((estimatedPayableAmount ?: 0.0) + (tmCreditAmount ?: 0.0)) ?: 0.0,
                    isChronicAdded = isChronicAdded,
                    isSubsAdded = SharedPrefManager.getInstance().cxAcceptedCount>0
                )
            )
        )
    }
}