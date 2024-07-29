package com.intellihealth.truemeds.data.model.walletandreferral


data class WalletInfoResponse(
    val message: String? = null,

    val responseData: ResponseData? = null,

    val statusCode: Int? = null,

    val statusValue: String? = null,

    val timeTakenInMs: Int? = null

) {
    data class ResponseData(
        val banner: List<Any?>? = null,
        val referNowHeaderMessage: String? = null,
        val referralCode: String? = null,
        val referralLink: String? = null,
        val referralRedeemed: Boolean? = null,
        val shareText: String? = null,
        val tmCash: Double? = null,
        val tmCredit: Double? = null,
        val tmWallet: Double? = null,
        val yetToPlaceOrder: String? = "",
        val totalRewardsEarning: Double = 0.0,
        val successfulReferralCountMessage: String = "",
        val tmCashbackTransactions: Int = 0,
        val tmCashTransactions: Int = 0,
        val tmCreditTransactions: Int = 0,
        val alreadyRedeemed: Boolean = false
    )


}
