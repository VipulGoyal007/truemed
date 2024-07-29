package com.intellihealth.truemeds.data.repository

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.login.DefaultTokenResponse
import com.intellihealth.truemeds.data.model.login.TruecallerTokenResponse
import com.intellihealth.truemeds.data.model.login.LoginVerificationResponse
import com.intellihealth.truemeds.data.model.login.MobileOtpRequest
import com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.repository.datasource.remote.LoginRemoteData
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.LoginRepository
import retrofit2.Response
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(
    private val loginRemoteData: LoginRemoteData,
    private val apiCallInitClass: ApiCallInitClass
) :
    LoginRepository {
    override suspend fun getTrueCallerToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String
    ): Resource<Response<TruecallerTokenResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            loginRemoteData.getTrueCallerToken(
                textAuthorizationCode,
                clientId,
                authorizationCode,
                codeVerifier
            )
        }
    }

    override suspend fun fetchDefaultToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        encodeToString: String
    ): Resource<Response<DefaultTokenResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            (loginRemoteData.fetchDefaultToken(
                encodeToString
            ))
        }
    }

    override suspend fun getSessionToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        encodeToString: JsonObject
    ): Resource<Response<DefaultTokenResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            (loginRemoteData.getSessionToken(
                encodeToString
            ))
        }
    }

    override suspend fun sendMobileOtp(
        mxInternalErrorOccurred: MxInternalErrorOccurred,mobileOtpRequest: MobileOtpRequest?): Resource<Response<SendMobileOtpResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { (loginRemoteData.sendMobileOtp(mobileOtpRequest)) }
    }


    override suspend fun verifyTrueCallerToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        tcToken: String,
        firebaseID: String,
        loginSkipped: Boolean,
        isIos: Boolean,
        source: String,
        aaid: String,
        sessionToken: String
    ): Resource<Response<LoginVerificationResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            (loginRemoteData.verifyTrueCallerToken(
                tcToken,
                firebaseID,
                loginSkipped,
                isIos,
                source,
                aaid,
                sessionToken
            ))
        }
    }

    override suspend fun verifyOtp(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        mobileNo: String?,
        otp: String?,
        deviceKey: String?,
        isIos: Boolean?,
        aaid: String?,
        source: String?,
        skippedLogin: Boolean
    ): Resource<Response<LoginVerificationResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            (loginRemoteData.verifyOtp(
                mobileNo,
                otp,
                deviceKey,
                isIos,
                aaid,
                source,
                skippedLogin
            ))
        }
    }


}