package com.intellihealth.truemeds.data.model.user

data class CustomerDeliveryChargeDataResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData
) {
    data class ResponseData(
        var deliveryOnAmount: Int,
        var deliveryCharge: Int?,
        var deliveryChargeSubs: Int?,
        var baseDiscount: Int?,
        var deliveryOnAmountSubs: Int?
    )
}