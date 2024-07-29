package com.intellihealth.truemeds.data.model.login


data class DefaultTokenResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: String? = "",
    var client: String? = "",
    var responseData: ResponseObj? = null
) {
    data class ResponseObj(
        var token: String? = ""
    )
}