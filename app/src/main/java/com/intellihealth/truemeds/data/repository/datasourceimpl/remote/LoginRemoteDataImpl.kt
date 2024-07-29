package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.api.LoginApi
import com.intellihealth.truemeds.data.model.login.DefaultTokenResponse
import com.intellihealth.truemeds.data.model.login.TruecallerTokenResponse
import com.intellihealth.truemeds.data.model.login.LoginVerificationResponse
import com.intellihealth.truemeds.data.model.login.MobileOtpRequest
import com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.LoginRemoteData
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class LoginRemoteDataImpl @Inject constructor(
    private val loginApi: LoginApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : LoginRemoteData {

    override suspend fun getTrueCallerToken(
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String
    ): Response<TruecallerTokenResponse> {
        return loginApi.getTrueCallerToken(
            textAuthorizationCode,
            clientId,
            authorizationCode,
            codeVerifier
        )
    }

    override suspend fun fetchDefaultToken(
        encodeToString: String
    ): Response<DefaultTokenResponse> {
        return loginApi.fetchDefaultToken(
            contentType,
            encodeToString
        )
    }

    override suspend fun getSessionToken(
        encodeToString: JsonObject
    ): Response<DefaultTokenResponse> {
        return loginApi.fetchSessionToken(
            contentType,
            encodeToString
        )
    }

    override suspend fun sendMobileOtp(mobileOtpRequest: MobileOtpRequest?): Response<SendMobileOtpResponse> {
        return loginApi.sendMobileOtp(contentType, mobileOtpRequest)
    }

    override suspend fun verifyOtp(
        mobileNo: String?,
        otp: String?,
        deviceKey: String?,
        isIos: Boolean?,
        aaid: String?,
        source: String?,
        skippedLogin: Boolean
    ): Response<LoginVerificationResponse> {
        return loginApi.verifyOtp(
            contentType,
            mobileNo,
            otp,
            deviceKey,
            isIos,
            aaid,
            source,
            skippedLogin
        )
    }


    override suspend fun verifyTrueCallerToken(
        tcToken: String,
        firebaseID: String,
        loginSkipped: Boolean,
        isIos: Boolean,
        source: String,
        aaid: String,
        sessionToken: String
    ): Response<LoginVerificationResponse> {
        return loginApi.verifyTruecallerToken(
            tcToken,
            firebaseID,
            loginSkipped,
            isIos,
            source,
            aaid,
            sessionToken
        )
    }
}