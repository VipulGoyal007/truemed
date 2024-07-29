package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.intellihealth.truemeds.data.api.WalletAndReferralApi
import com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse
import com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.TmWalletRemoteDataSource
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class TmWalletRemoteDataSourceImpl @Inject constructor(
    private val walletAndReferralApi: WalletAndReferralApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
): TmWalletRemoteDataSource {
    //private val authorization:String="Bearer eyJhbGciOiJIUzUxMiIsInppcCI6IkRFRiJ9.eNqqViouTVKyUjI3NjUzNzcwNzFT0lEqzi8tSk4Fiob4xjv6uQT5e7rEh5npmesZASWL8nNSfTKLS5SsopWC_H1c451Dg0P8fV2DlGJ1lFIrCpSsDM2NzY3MTMyNjHSUMhNLQAIGpuZGFkCBWgAAAAD__w.bPitV4YUl57Gp_-Nx8EooC6pxxXI9eSsCqheTJgnnORhqOlsw9pHxkaP7z-o7-ifHfTRB4yhHVwXPvc4AFInkQ"
    //private val authorization:String= SharedPrefManager.getInstance().loggedInUserAccessToken
    override suspend fun getWallet(customerId: String): Response<WalletInfoResponse> {
        return walletAndReferralApi.getWallet(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId)
    }

    override suspend fun getWalletInfo(
        customerId: String,
        formDate: String?,
        toDate: String?
    ): Response<WalletTransactionInfoResponse> {
        return walletAndReferralApi.getWalletInfo(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId, formDate, toDate)
    }

    override suspend fun redeemReferralCode(
        mobile: String?,
        referCode: String?
    ): Response<RedeemResponse> {
        return walletAndReferralApi.redeemReferralCode(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, mobile, referCode)
    }

    override suspend fun getReferralStatus(
        customerId: String,
        isNotified: Boolean
    ): Response<ReferralStatusResponse> {
        return walletAndReferralApi.getReferralStatus(contentType, SharedPrefManager.getInstance().loggedInUserAccessToken, customerId, isNotified)
    }
}