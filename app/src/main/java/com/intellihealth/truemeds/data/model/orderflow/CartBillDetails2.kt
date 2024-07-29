package com.intellihealth.truemeds.data.model.orderflow

import com.google.gson.annotations.SerializedName

data class CartBillDetails2(
    @SerializedName("orderId") var orderId: Long? = null,
    @SerializedName("savingValue") var savingValue: Double? = null,
    @SerializedName("discount") var discount: Double? = null,

    @SerializedName("addMoreForFreeDelivery") var addMoreForFreeDelivery: Int? = null,
    @SerializedName("couponCode") var couponCode: String? = null,
    @SerializedName("couponDiscountAmt") var couponDiscountAmt: Double? = null,
    @SerializedName("deliveryCharge") var deliveryCharge: Double? = null,
    @SerializedName("mrp") var mrp: Double? = null,
    @SerializedName("mrpWithSubs") var mrpWithSubs: Int?=0,
    @SerializedName("packagingCharge") var packagingCharge: Double? = null,
    @SerializedName("payableAmt") var payableAmt: Double? = null,
    @SerializedName("paymentMode") var paymentMode: String? = null,
    @SerializedName("paymentSelectionInfo") var paymentSelectionInfo: PaymentSelectionInfo?= PaymentSelectionInfo(),
    @SerializedName("savingPercentageWithSubs") var savingPercentageWithSubs: Int,
    @SerializedName("savingsText") var savingsText: String? = null,
    @SerializedName("sellingPriceWithSubs") var sellingPriceWithSubs: Int?=0,
    @SerializedName("tmCash") var tmCash: Double? = null,
    @SerializedName("tmCredit") var tmCredit: Double? = null
) {
    data class PaymentSelectionInfo(
        @SerializedName("lastPaymentMethod") var lastPaymentMethod: String?="",
        @SerializedName("lastPaymentMethodIconUrl") var lastPaymentMethodIconUrl: String?="",
        @SerializedName("lastPaymentMethodId") var lastPaymentMethodId: Int?=0,
        @SerializedName("paymentMethod") var paymentMethod: String?="",
        @SerializedName("paymentMethodIconUrl") var paymentMethodIconUrl: String?="",
        @SerializedName("paymentMethodId") var paymentMethodId: Int?=0,
        @SerializedName("paymentNote") var paymentNote: String?="",
        @SerializedName("paymentSpecificCouponApplied") var paymentSpecificCouponApplied: Boolean?=false
    )
}