package com.intellihealth.truemeds.data.repository.datasource.remote

import com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse
import com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse
import retrofit2.Response

interface TmWalletRemoteDataSource {
    suspend fun getWallet(
        customerId: String
    ): Response<WalletInfoResponse>

    suspend fun getWalletInfo(customerId: String,
        formDate: String?,
        toDate: String?
    ): Response<WalletTransactionInfoResponse>


    suspend fun redeemReferralCode(
        mobile: String?, referCode: String?
    ): Response<RedeemResponse>

    suspend fun getReferralStatus(
        customerId: String, isNotified: Boolean
    ): Response<ReferralStatusResponse>
}