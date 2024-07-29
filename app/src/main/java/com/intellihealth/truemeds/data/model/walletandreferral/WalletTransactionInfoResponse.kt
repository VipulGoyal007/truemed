package com.intellihealth.truemeds.data.model.walletandreferral

data class WalletTransactionInfoResponse(
    val message: String? = null,

    val responseData: ResponseData? = null,

    val statusCode: Int? = null,

    val statusValue: String? = null,

    val timeTakenInMs: Int? = null
){
    data class ResponseData(
        var tmCredit: TmCreditAndCash?,
        val tmCash: TmCreditAndCash?
    ) {
        data class TmCreditAndCash(
            var customerId: Int = 0,

            var walletId: Int = 0,

            var truemedsCash: Double = 0.0,

            var ledger: ArrayList<LedgerItem?>?,

            var truemedsCredit: Double = 0.0
        )

    }


}
