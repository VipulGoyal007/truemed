package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName

//todo this is used for order_detail_cancelled_clicked
//todo this is used for first_cancel_page_viewed
//todo this is used for second_page_cancel_reason

data class MxCancelledClicked(
    @SerializedName("address_type")
    var addressType: String? = null,
    @SerializedName("coupon_applied")
    var couponApplied: Boolean = false,
    @SerializedName("coupon_discount_amount")
    var couponDiscountAmount: Double? = null,
    @SerializedName("current_order_state")
    var currentOrderState: String? = null,
    @SerializedName("delivery_charge_amount")
    var deliveryChargeAmount: Double? = null,
    @SerializedName("delivery_days")
    var deliveryDays: Double? = null,
    @SerializedName("discount_amount")
    var discountAmount: Double? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("gender")
    var gender: String? = null,
    @SerializedName("is_reorder")
    var isReorder: Boolean = false,
    @SerializedName("item_names")
    var itemNames: List<String?>? = null,
    @SerializedName("mrp_total_amount")
    var mrpTotalAmount: Double? = null,
    @SerializedName("no_of_items")
    var noOfItems: Int? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("packaging_charge_amount")
    var packagingChargeAmount: Int? = null,
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
    var rxRequired: Boolean? = null,
    @SerializedName("savings_amount")
    var savingsAmount: Double? = null,
    @SerializedName("shipping_city")
    var shippingCity: String? = null,
    @SerializedName("shipping_pincode")
    var shippingPincode: String? = null,
    @SerializedName("shipping_state")
    var shippingState: String? = null,
    @SerializedName("subs_id")
    var subsId: String? = null,
    @SerializedName("tm_credit_amount")
    var tmCreditAmount: Int? = null,
    @SerializedName("tm_reward_amount")
    var tmRewardAmount: Int? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("first_page_cancel_reason")
    var firstPageCancelReason: String? = null,
    @SerializedName("second_page_cancel_reason")
    var secondPageCancelReason: String? = null

)