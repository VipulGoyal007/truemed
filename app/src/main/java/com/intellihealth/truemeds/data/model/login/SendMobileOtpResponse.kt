package com.intellihealth.truemeds.data.model.login

data class SendMobileOtpResponse(
    val message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var isSuccess: Boolean = true,
    var responseData: ResponseData? = null
) {
    data class ResponseData(val isNewCustomer: Boolean = false)
}