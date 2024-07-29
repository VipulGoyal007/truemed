package com.intellihealth.truemeds.data.model.orderstatus

data class GenerateReturnUrlResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData
) {
    data class ResponseData(
        var redirectUrl:String?=""
    )

}
