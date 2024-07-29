package com.intellihealth.truemeds.data.model.orderflow

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import kotlinx.parcelize.Parcelize

@Parcelize
data class CartBillDetails(
    
    @SerializedName("orderId") var orderId: Long? = null,
    @SerializedName("savingValue") var savingValue: Double? = null,
    @SerializedName("discount") var discount: Double? = null,
    @SerializedName("tmCash") var tmCash: Double? = null,
    @SerializedName("deliveryCharge") var deliveryCharge: Double? = null,
    @SerializedName("tmCredit") var tmCredit: Double? = null,
    @SerializedName("packagingCharge") var packagingCharge: Double? = null,
    @SerializedName("couponDiscountAmt") var couponDiscountAmt: Double? = null,
    @SerializedName("mrp") var mrp: Double? = null,
    @SerializedName("payableAmt") var payableAmt: Double? = null,
    @SerializedName("savingsText") var savingsText: String? = null,
    @SerializedName("paymentMode") var paymentMode: String? = null,
    @SerializedName("addMoreForFreeDelivery") var addMoreForFreeDelivery: Int? = null,
    @SerializedName("couponCode") var couponCode: String? = null,
    @SerializedName("paymentSelectionInfo") var paymentSelectionInfo:PaymentSelectionInfo? = null,
    var billDetailsTitle: String = "",

) :Parcelable {
    
    fun toSdkModel(
        billDetailsTitle: String,
        totalPayable: String,
        gst: String,
        sellerPackagingCharge: String,
        saveOrderPrice: String
    ): BillDetailsModel {
        return BillDetailsModel(
            billDetailsTitle = billDetailsTitle,
            savedOrderMessage = saveOrderPrice,
            savedOrderPrice = saveOrderPrice,
            mrpValue = mrp!!,
            discountValue = discount!!,
            couponName = couponCode!!,
            couponValue = couponDiscountAmt!!,
            taxesAndChargesValue = packagingCharge!!,
            deliveryChargesValue = deliveryCharge!!,
            tmCreditValue = tmCredit!!,
            tmRewardValue = tmCash!!,
            isTypePharmacistPaymentOn = false,
            isTypePharmacistPaymentOff = false,
            estimatedPayableValue = payableAmt!!,
            paymentModeValue = SharedPrefManager.getInstance().selectedPaymentMethod,
            isTooltipForDeliveryCharges = true,
            tooltipDeliveryChargeValue = "Add items worth ₹71 more to get free delivery",
            tooltipEstimatedPayableValue = totalPayable,
            isTooltipForEstimatedPayable = true,
            isTooltipForTaxesCharges = true,
            tooltipTaxesChargesHeaderLeft = gst, //context.getString(R.string.gst)
            tooltipTaxesChargesBodyLeft = sellerPackagingCharge, //context.getString(R.string.seller_packaging_charges),
            tooltipTaxesChargesBodyRight = "₹7.00",
            tooltipTaxesChargesBodyRightStroked = "₹21.00",
            tooltipTaxesChargesHeaderRight = "Included in MRP",
        )
    }
}

@Parcelize
data class PaymentSelectionInfo(
    @SerializedName("paymentMethodIconUrl") var paymentMethodIconUrl: String? = null,
    @SerializedName("paymentMethod") var paymentMethod: String? = null,
    @SerializedName("paymentMethodId") var paymentMethodId: Long? = null,
    @SerializedName("paymentNote") var paymentNote: String? = null,
    @SerializedName("lastPaymentMethodIconUrl") var lastPaymentMethodIconUrl: String? = null,
    @SerializedName("lastPaymentMethod") var lastPaymentMethod: String? = null,
    @SerializedName("lastPaymentMethodId") var lastPaymentMethodId: Int? = null,
    @SerializedName("paymentSpecificCouponApplied") var paymentSpecificCouponApplied: Boolean? = false,

):Parcelable