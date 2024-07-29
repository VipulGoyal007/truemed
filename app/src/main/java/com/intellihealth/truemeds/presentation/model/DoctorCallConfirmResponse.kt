package com.intellihealth.truemeds.presentation.model

data class DoctorCallConfirmResponse(
    val orderId : Long,
    var paymentValue : Double,
    var count : Int,
    var discount : Double
)