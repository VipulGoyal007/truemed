package com.intellihealth.truemeds.data.model.walletandreferral

data class ReferralStatusResponse (
    val message: String? = null,
    val responseData: List<ResponseData?>? = null,
    val statusCode: Int? = null,
    val statusValue: String? = null,
    val timeTakenInMs: Int? = null
){
    data class ResponseData(
        val referralAmount: Double? = null,
        val referralOrderFlowStatus: String? = null,
        val referralStages: List<ReferralStage> ?= null,
        val referralStatus: String? = null,
        val registeredCustomerName: String? = "",
        val registeredCustomerMobile: String? = ""
    )

    data class ReferralStage(
        val completed: Boolean? = null,
        val onDate: String? = null,
        val stageName: String? = null
    )
}


