package com.intellihealth.truemeds.data.model.coupon


data class CouponSaveRemoveResponse(
    val message: String? = "",
    val responseData: ResponseData? = null,
    val statusCode: Int? = null,
    val statusValue: String? = null,
    val timeTakenInMs: Any? = null
) {
    data class ResponseData(
        val couponDiscount: Double? = 0.0,
        var description: List<String>?=null,
        //var description: String?=null,
        var promoCode: String?=null,
        var tnc: String?=null,
        var isOfferApplied : Boolean? = false
    )
}