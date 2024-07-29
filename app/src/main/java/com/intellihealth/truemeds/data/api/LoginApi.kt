package com.intellihealth.truemeds.data.api

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.login.DefaultTokenResponse
import com.intellihealth.truemeds.data.model.login.LoginVerificationResponse
import com.intellihealth.truemeds.data.model.login.MobileOtpRequest
import com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse
import com.intellihealth.truemeds.data.model.login.TruecallerTokenResponse
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface LoginApi {
    @POST(ApiEndpointConstants.FETCH_DEFAULT_TOKEN)
    suspend fun fetchDefaultToken(
        @Header("Content-Type") contentType: String?,
        @Body base64String: String?,
    ): Response<DefaultTokenResponse>

    @POST(ApiEndpointConstants.FETCH_SESSION_TOKEN)
    suspend fun fetchSessionToken(
        @Header("Content-Type") contentType: String?,
        @Body helpObject: JsonObject?,
    ): Response<DefaultTokenResponse>

    @POST(ApiEndpointConstants.SEND_MOBILE_OTP)
    suspend fun sendMobileOtp(
        @Header("Content-Type") contentType: String?,
        @Body mobileOtpRequest: MobileOtpRequest?,
    ): Response<SendMobileOtpResponse>

    @GET(ApiEndpointConstants.VERIFY_OTP)
    suspend fun verifyOtp(
        @Header("Content-Type") contentType: String?,
        @Query("mobileNo") mobileNo: String?,
        @Query("otp") otp: String?,
        @Query("deviceKey") deviceKey: String?,
        @Query("isIos") isIos: Boolean?,
        @Query("aaid") aaid: String?,
        @Query("source") source: String?,
        @Query("skippedLogin") skippedLogin: Boolean,
    ): Response<LoginVerificationResponse>

    @FormUrlEncoded
    @POST(ApiEndpointConstants.GET_TRUECALLER_TOKEN)
    suspend fun getTrueCallerToken(
        @Field("grant_type") grantType: String,
        @Field("client_id") clientId: String,
        @Field("code") code: String,
        @Field("code_verifier") codeVerifier: String
    ): Response<TruecallerTokenResponse>

    @POST(ApiEndpointConstants.VERIFY_TRUECALLER_TOKEN)
    suspend fun verifyTruecallerToken(
        @Query("truecallerToken") truecallerToken: String?,
        @Query("deviceKey") deviceKey: String?,
        @Query("skippedLogin") skippedLogin: Boolean,
        @Query("isIos") isIos: Boolean,
        @Query("source") source: String?,
        @Query("aaid") aaid: String?,
        @Query("sessionToken") sessionToken: String?
    ): Response<LoginVerificationResponse>

}