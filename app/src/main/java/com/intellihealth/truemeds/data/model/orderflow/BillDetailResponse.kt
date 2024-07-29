package com.intellihealth.truemeds.data.model.orderflow

import com.intellihealth.salt.models.CashHandlingApplicableInfo
import com.intellihealth.salt.models.CashHandlingInfoModel

data class BillDetailResponse(
    var message: String,
    var responseData: ResponseData,
    var statusCode: Int,
    var statusValue: String,
    var timeTakenInMs: Int
) {
    data class ResponseData(
        var addMoreForFreeDelivery: Double?= 0.0,
        var couponCode: String?="",
        var couponCodeForEvent: String="",
        var couponDiscountAmt: Double?= 0.0,
        var couponAppliedAmt: Double?= 0.0,
        var deliveryCharge: Double?= 0.0,
        var waiveOffDeliveryCharge: Double?= 0.0,
        var discount: Double?= 0.0,
        var mrp: Double?= 0.0,
        var sellingPrice:Double?=0.0,
        var mrpWithSubs: Double?= 0.0,
        var orderId: Long?= 0,
        var packagingCharge: Double?= 0.0,
        var payableAmt: Double?= 0.0,
        var paymentMode: String?="",
        var paymentSelectionInfo: PaymentSelectionInfo?,
        var savingPercentageWithSubs: Double?= 0.0,
        var savingValue: Double?= 0.0,
        var totalSavings:Double?=0.0,
        var savingsText: String?="",
        var couldHaveSaved:String?="",
        var couldHaveSavedAmount: Double?=0.0,
        var sellingPriceWithSubs: Double?= 0.0,
        var tmCash: Double?= 0.0,
        var tmCredit: Double?= 0.0,
        var couponIconUrl: String? = "",
        var addMoreForCod: Double = 0.0,
        var restrictedPaymentType: Int? = 0,
        var deliveryChargeMessage : String?="",
        var deliveryChargeTooltipMessage : String?="",
        var currentOrderStatus: Int? = 0,
        var currentOrderState :String?,
        var cashHandlingInfo: CashHandlingInfoModel? = null,
        var cashHandlingApplicableInfo: CashHandlingApplicableInfo? = null,
        var payableAmountWithoutChc:Double=0.0,
        var cashHandlingRefundMsg:String?,
        var pspViewed: Boolean
        ) {
        data class PaymentSelectionInfo(
            var lastPaymentMethod: String?="",
            var lastPaymentMethodIconUrl: String?="",
            var lastPaymentMethodId: Int,
            var paymentMethod: String?="",
            var paymentMethodIconUrl: String?="",
            var paymentMethodId: Int?,
            var paymentNote: String?="",
            var paymentSpecificCouponApplied: Boolean?=false
        )
    }
}