package com.intellihealth.truemeds.data.api

import com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse
import com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface WalletAndReferralApi {
    @GET(ApiEndpointConstants.WALLET)
    suspend fun getWallet(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String
    ): Response<WalletInfoResponse>

    @POST(ApiEndpointConstants.GET_WALLET_INFO)
    suspend fun getWalletInfo(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String,
        @Query("fromDate") formDate: String?,
        @Query("toDate") toDate: String?
    ): Response<WalletTransactionInfoResponse>

    @POST(ApiEndpointConstants.REDEEM_REFERRAL_CODE)
    suspend fun redeemReferralCode(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String,
        @Query("mobile") mobile: String?,
        @Query("referCode") referCode: String?
    ): Response<RedeemResponse>

    @GET(ApiEndpointConstants.REFERRAL_STATUS)
    suspend fun getReferralStatus(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String,
        @Query("customerId") customerId: String,
        @Query("isNotified") isNotified: Boolean
    ): Response<ReferralStatusResponse>
}