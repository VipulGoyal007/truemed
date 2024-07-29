package com.intellihealth.truemeds.data.model.login

import com.google.gson.annotations.SerializedName

data class LoginVerificationResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData? = null,
) {
    data class ResponseData(
        @SerializedName("access_token")
        var accessToken: String?,
        var previousAddressId: Int?,
        var previousPatientId: Int?,
        @SerializedName("token_type")
        var tokenType: String?,
        var customerId: String? = null,
        var customerName: String,
        var mobileNo: String,
        var emailAddress: String,
        var isNewCustomer: Boolean,
        var totalOtpAttempts: Int,
        var skippedLogin: Boolean
//        var loginCustomerDto: LoginCustomerDto
    )

    /* data class LoginCustomerDto(
         var customerId: String?,
         var customerName: String,
         var mobileNo: String,
         var emailAddress: String,
         var isNewCustomer : Boolean,
         var totalOtpAttempts : Int,
         var skippedLogin : Boolean

     )*/
}