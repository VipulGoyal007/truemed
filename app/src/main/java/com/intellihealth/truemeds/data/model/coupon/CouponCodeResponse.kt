package com.intellihealth.truemeds.data.model.coupon

import com.intellihealth.salt.constants.CouponConstant
import com.intellihealth.salt.models.CouponModel

data class CouponCodeResponse(
    var message: String,
    var responseData: List<Coupon>,
    var statusCode: Int,
    var statusValue: String,
    var timeTakenInMs: Any
) {
    data class Coupon(
        var colorCode: String? = "",
        var couponCodeRequired: Boolean? = true,
        var description: String? = "",
        var discountValue: Double? = 0.0,
        var ftcUrgencyDescription: String? = "",
        var image: String? = "",
        var infoPanel: String? = null,
        var maxDiscount: Double? = 0.0,
        var minCartValue: Int? = 0,
        var offerId: Int = 0,
        var couponExpiryPeriod: Long = 0,
        var offersVisible: Boolean? = true,
        var promoCode: String? = "",
        var showFtcCounter: Boolean? = true,
        var termsAndConditions: List<TermsAndCondition> = emptyList(),
        var paymentMethods: List<PaymentMethod>?,
        var title: String? = "",
        var validity: Long = 0,
        var isOfferApplied : Boolean? = false,

        //later added
        val savingAmount: String = "",
        var applyLabel: String = "",
        var currentDate: Long? = 0,//timer
        var expiryDate: Long? = 0,
        var expiryDateFromApi: Long? = 0,//timer
        var expiryDays: String? = "",
        var subHeader: String? = "",
        var expiryMsg: String? = "",
        var applicableOn: String? = "",
        var offerTypeMsg : String?="",
        var isCouponApplied: Boolean = false,
        var couponType: CouponConstant
    ) {
        data class TermsAndCondition(
            var description: String,
            var id: Int,
            var offersId: Int
        )
        data class PaymentMethod(
            var paymentMethodId: Long,
            var active: Boolean,
            var iconType: String,
            var iconName: String,
            var iconPath: String,
            var createdOn: Long,
            var iconSubType: String
        )


        fun toSdkObject(): CouponModel {
            var couponCode = ""
            var applyText=""
            if (couponCodeRequired == true) {
                if (promoCode != null) {
                    couponCode = promoCode.toString()
                    applyText = when (isCouponApplied) {
                        null -> {
                            "Apply"
                        }
                        true -> {
                            "Applied"
                        }
                        false -> {
                            "Apply"
                        }
                    }
                }else{
                    applyText=""
                }
            } else {
                applyText = ""
                couponCode = "No code required"
            }
            return CouponModel(
                applyLable = applyText,
                couponCode = couponCode,
                couponHeading = title,
                couponSummary = description!!.split("/n").toList(),
                expireSoonLable = expiryMsg ?: "Ends in",//only for ftc expiring soon
                image_url = image,
                isFtcCoupon = showFtcCounter ?: false,
                showFtcCounter = showFtcCounter ?: false,
                timestamp = if(isCouponApplied) expiryDate!! else 0L,
                //timestamp = expiryDate ?: 0L,
                //timestamp = if(isCouponApplied) SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime.toLong() else 0L,
                tncLable = "Terms and conditions",
                timer = "",//difference between start time and end time convert to string i.e. ends in 20:00
                isCouponApplied = isCouponApplied,
                prefix = "Ends in ",
                couponType = couponType//CouponConstant.DISCOUNT_COUPON//if (isCouponApplied == null) CouponConstant.DISCOUNT_COUPON else if (isCouponApplied == true) CouponConstant.DISCOUNT_COUPON_APPLIED else if (isCouponApplied == false) CouponConstant.DISCOUNT_COUPON else CouponConstant.DISCOUNT_COUPON
            )
            //todo add validity to show coupon or hide
        }

    }


}