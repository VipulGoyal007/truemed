package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse
import com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse
import com.intellihealth.truemeds.data.utils.Resource
import retrofit2.Response

interface TmWalletRepository {
    /**
     * This service provides wallet data contains wallet banners,tm transaction,credit cash etc..
     * **/
    suspend fun getWallet(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String
    ): Resource<Response<WalletInfoResponse>>

    /**
     *This service provides tm credit and cash and ledger
     * **/
    suspend fun getWalletInfo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        fromDate: String?,
        toDate: String?
    ): Resource<Response<WalletTransactionInfoResponse>>


    /**
     *This service provides referral code redeem successful and get successful text
     * **/
    suspend fun redeemReferralCode(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        mobile: String?,
        referCode: String?
    ): Resource<Response<RedeemResponse>>

    /**
     *This service provides referral status i.e order placed,registered, delivered.
     * **/
    suspend fun getReferralStatus(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String, isNotified: Boolean
    ): Resource<Response<ReferralStatusResponse>>
}