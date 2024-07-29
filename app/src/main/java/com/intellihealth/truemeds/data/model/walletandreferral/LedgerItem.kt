package com.intellihealth.truemeds.data.model.walletandreferral


data class LedgerItem(
    var earned: Double = 0.0,

    val balance: Double = 0.0,

    val orderId: Long? = 0,

    val spent: Double = 0.0,

    val transDate: Long = 0,

    val transactionDate: String?,

    val transactionDescription: String? = "",

    val type: String?,

    val transaction: String?,

    val status: Int = 0,

    val expiryDate: String?,

    val expired: Boolean
)