package com.intellihealth.truemeds.data.model.prescription

data class PastPrescriptions(
    var parentIndex: Int = 0,
    var createdDate: String = "",
    var activeRxList: List<ActiveRx> = listOf(),
//    var callback: ReloadPastPrescriptions? = null
)


