package com.intellihealth.truemeds.domain.repository

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.login.DefaultTokenResponse
import com.intellihealth.truemeds.data.model.login.LoginVerificationResponse
import com.intellihealth.truemeds.data.model.login.MobileOtpRequest
import com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse
import com.intellihealth.truemeds.data.model.login.TruecallerTokenResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.utils.Resource
import retrofit2.Response

interface LoginRepository {

    /**
     * This service provides login token from Truecaller and pass it to next Truecaller API
     * **/
    suspend fun getTrueCallerToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String
    ): Resource<Response<TruecallerTokenResponse>>

    /**
     *This service provides the default session token in  case if user's firebase id is null or empty
     * **/
    suspend fun fetchDefaultToken(mxInternalErrorOccurred: MxInternalErrorOccurred,
        encodeToString: String
    ): Resource<Response<DefaultTokenResponse>>


    /**
     * This service is used to fetch default session token before Login and fetching cross selling products
     * **/
    suspend fun getSessionToken(mxInternalErrorOccurred: MxInternalErrorOccurred,
        encodeToString: JsonObject
    ): Resource<Response<DefaultTokenResponse>>


    /**
     * This service generate OTP on the entered mobile number
     * In response we capture isNewCustomer attribute
     * **/
    suspend fun sendMobileOtp(mxInternalErrorOccurred: MxInternalErrorOccurred,
        mobileOtpRequest: MobileOtpRequest?
    ): Resource<Response<SendMobileOtpResponse>>

    /**
     * This service verify the login token received from @getTrueCallerToken
     * In response we get User details
     * **/
    suspend fun verifyTrueCallerToken(mxInternalErrorOccurred: MxInternalErrorOccurred,
        tcToken: String,
        firebaseID: String,
        loginSkipped: Boolean,
        isIos: Boolean,
        source: String,
        aaId: String,
        sessionToken: String
    ): Resource<Response<LoginVerificationResponse>>

    /**
     * This service is used to verify the API received on SMS
     * **/
    suspend fun verifyOtp(mxInternalErrorOccurred: MxInternalErrorOccurred,
        mobileNo: String?,
        otp: String?,
        deviceKey: String?,
        isIos: Boolean?,
        aaid: String?,
        source: String?,
        skippedLogin: Boolean
    ): Resource<Response<LoginVerificationResponse>>

}