package com.intellihealth.truemeds.data.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse
import com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.TmWalletRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.TmWalletRepository
import retrofit2.Response
import javax.inject.Inject

class TmWalletRepositoryImpl @Inject constructor(
    private val walletRemoteDataSource: TmWalletRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : TmWalletRepository {
    override suspend fun getWallet(
        mxInternalErrorOccurred: MxInternalErrorOccurred, customerId: String
    ): Resource<Response<WalletInfoResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { walletRemoteDataSource.getWallet(customerId) }
    }

    override suspend fun getWalletInfo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        formDate: String?,
        toDate: String?
    ): Resource<Response<WalletTransactionInfoResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { walletRemoteDataSource.getWalletInfo(customerId, formDate, toDate) }
    }

    override suspend fun redeemReferralCode(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        mobile: String?,
        referCode: String?
    ): Resource<Response<RedeemResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { walletRemoteDataSource.redeemReferralCode(mobile, referCode) }
    }

    override suspend fun getReferralStatus(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        isNotified: Boolean
    ): Resource<Response<ReferralStatusResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) { walletRemoteDataSource.getReferralStatus(customerId, isNotified) }
    }
}