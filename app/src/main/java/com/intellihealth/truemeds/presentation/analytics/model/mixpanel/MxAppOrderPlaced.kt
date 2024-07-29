package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.clevertap.CtAppOrderPlaced
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent
import com.intellihealth.truemeds.presentation.analytics.model.appsflyer.AFOrderPlaced
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbPurchaseEvent
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager


data class MxAppOrderPlaced(
    @SerializedName("address_type")
    var addressType: String? = null,
    @SerializedName("applied_coupon_name")
    var appliedCouponName: String? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("cod_order_value_difference")
    var codOrdervalueDifference: Double? = null,
    @SerializedName("coupon_applied")
    var couponApplied: Boolean = false,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("cross_selling_trays_used")
    var crossSellingTraysUsed: String? = null,
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
    @SerializedName("experiment_list")
    var experimentList: String? = null,
    @SerializedName("gender")
    var gender: String? = null,
    @SerializedName("is_chronic")
    var isChronic: Boolean = false,
    @SerializedName("is_cod_defaulter")
    var isCodDefaulter: Boolean = false,
    @SerializedName("is_cross_selling_item_present")
    var isCrossSellingItemPresent: Boolean = false,
    @SerializedName("is_generic")
    var isGeneric: Boolean = false,
    @SerializedName("is_otc")
    var isOtc: Boolean = false,
    @SerializedName("is_reorder")
    var isReorder: Boolean = false,
    @SerializedName("is_tm_contact_saved")
    var isTmContactSaved: Boolean = false,
    @SerializedName("item_names")
    var itemNames: List<String?>? = null,
    @SerializedName("mrp")
    var mrp: Double? = null,
    @SerializedName("no_of_item")
    var noOfItem: Int? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("out_of_stock_no")
    var outOfStockNo: Int? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Double? = null,
    @SerializedName("patient_age")
    var patientAge: Int? = null,
    @SerializedName("patient_type")
    var patientType: String? = null,
    @SerializedName("payment_method")
    var paymentMethod: String? = null,
    @SerializedName("prescription_uploaded_count")
    var prescriptionUploadedCount: Int? = null,
    @SerializedName("products_ids")
    var productsIds: List<String?>? = null,
    @SerializedName("rx_required")
    var rxRequired: Boolean = false,
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
    @SerializedName("wh_id")
    var whId: String? = null,

    @SerializedName("cross_selling_total_selling_price")
    var crossSellingTotalSellingPrice: Double? = null,
    @SerializedName("cross_selling_total_mrp")
    var crossSellingTotalMrp: Double? = null,
    @SerializedName("reorder_patient_name")
    var reorderPatientName: String? = null,
    @SerializedName("type_of_reorder")
    var reorderType: String? = null,
    
    
    val cxAcceptedSubsCount: Int,
    @SerializedName("previous_stage") var previousStage: String? = null,
    @SerializedName("page_section") var pageSection: String? = null,
    @SerializedName("urgency_time_remaining")
    var urgencyTimeRemaining: Long? = 0L,
    @SerializedName("reorder_cross_selling")
    var reorderCrossSelling : Boolean? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge : Double?= null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null
){
    fun toCleverTap(): CtAppOrderPlaced {
        return CtAppOrderPlaced(isReorder, shippingCity, shippingState, gender, patientType, noOfItem,
            subsId, itemNames, salesPrice, mrp, discountAmount, estimatedPayableAmount, tmCreditAmount,
            tmRewardAmount, couponDiscountAmount, patientAge, shippingPincode, couponApplied)
    }

    fun toAppsFlyer():Map<String, Any> {
        return AppsFlyerEvent.convertJsonToHashmap(
            Gson().toJson(
                AFOrderPlaced(
                    mrpTotalAmount = mrp,
                    sellingPriceTotalAmount = salesPrice,
                    discountAmount = discountAmount,
                    packingChargeAmount = packagingChargeAmount,
                    deliveryChargeAmount = deliveryChargeAmount,
                    tmCreditAmount = tmCreditAmount ?: 0.0,
                    tmRewardAmount = tmRewardAmount ?: 0.0,
                    afRevenue = (estimatedPayableAmount ?: 0.0) + (tmCreditAmount ?:0.0),
                    afCurrency = "INR",
                    noOfItem = noOfItem,
                    estimatedPayableAmount = estimatedPayableAmount ?: 0.0,
                    isChronicAdded = isChronic,
                    isSubsAdded = cxAcceptedSubsCount > 0,
                    isOtcAdded = isOtc,
                    isPrescriptionAdded = (prescriptionUploadedCount ?: 0) > 0,
                    couponDiscountAmount = couponDiscountAmount,
                    couponApplied = couponApplied,
                    orderId = (orderId?:"0").toLong()
                )
            )
        )
    }
    /*fun toAppsFlyer():Map<String, Any> {
        return AppsFlyerEvent.convertJsonToHashmap(
            Gson().toJson(
                AFOrderPlaced(mrpTotalAmount = estimatedPayableAmount, sellingPriceTotalAmount = estimatedPayableAmount, packingChargeAmount = packagingChargeAmount, deliveryChargeAmount = deliveryChargeAmount, couponDiscountAmount = couponDiscountAmount,
                    tmCreditAmount = tmCreditAmount, tmRewardAmount = tmRewardAmount, noOfItem = noOfItem,
                    estimatedPayableAmount = estimatedPayableAmount, discountAmount = discountAmount,
                    couponApplied = if(couponDiscountAmount != null && (couponDiscountAmount ?:0.0 > 0) && SharedPrefManager.getInstance().couponModel != null) SharedPrefManager.getInstance().couponModel.promoCode else null,
                    afRevenue = estimatedPayableAmount?: 0.0 + (tmCreditAmount ?:0.0), isChronicAdded = isChronic )
            ))
    }*/
    fun toFireBase() : FbPurchaseEvent {
        return FbPurchaseEvent(SharedPrefManager.getInstance().loggedInUserId, orderId, estimatedPayableAmount?:0.0)
    }

}