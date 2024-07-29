package com.intellihealth.truemeds.data.model.helpfaqtnc

/**
 * This is used for showing privacy policy and terms and condition
 * **/
data class PrivacyPolicyAndTnCResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData
) {
    data class ResponseData(val Legals: List<Legal>?)

    data class Legal(
        /**
         * This is used to show title of the privacy policy and terms condition
         * **/
        val header: String?,
        /**
         * This is used to show description about the legals information
         * **/
        val description: String?
    )
}