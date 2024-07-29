package com.intellihealth.truemeds.data.model.ordersummary

import com.intellihealth.truemeds.presentation.model.ProductInfoModel

data class LastMinutePurchaseResponse(
    var message: String,
    var responseData: ResponseData?,
    var statusCode: Int,
    var statusValue: String,
    var timeTakenInMs: Int
) {
    data class ResponseData(
        var LAST_MINUTE_BUY: List<ProductInfoModel>?,
        var productCodeList: List<String>?
    )
}