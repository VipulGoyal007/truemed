package com.intellihealth.truemeds.data.repository.datasource.remote

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.login.DefaultTokenResponse
import com.intellihealth.truemeds.data.model.login.LoginVerificationResponse
import com.intellihealth.truemeds.data.model.login.MobileOtpRequest
import com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse
import com.intellihealth.truemeds.data.model.login.TruecallerTokenResponse
import retrofit2.Response

interface LoginRemoteData {

    suspend fun getTrueCallerToken(
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String
    ): Response<TruecallerTokenResponse>

    suspend fun fetchDefaultToken(
        encodeToString: String
    ): Response<DefaultTokenResponse>

    suspend fun getSessionToken(
        encodeToString: JsonObject
    ): Response<DefaultTokenResponse>

    suspend fun sendMobileOtp(
        mobileOtpRequest: MobileOtpRequest?
    ):Response<SendMobileOtpResponse>

    suspend fun verifyOtp(
        mobileNo: String?,
        otp: String?,
        deviceKey: String?,
        isIos: Boolean?,
        aaid: String?,
        source: String?,
        skippedLogin: Boolean
    ): Response<LoginVerificationResponse>


    suspend fun verifyTrueCallerToken(
        tcToken: String,
        firebaseID: String,
        loginSkipped: Boolean,
        isIos: Boolean,
        source: String,
        aaid: String,
        sessionToken: String
    ): Response<LoginVerificationResponse>
}