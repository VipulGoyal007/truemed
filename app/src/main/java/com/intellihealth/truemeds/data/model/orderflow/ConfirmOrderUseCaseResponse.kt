package com.intellihealth.truemeds.data.model.orderflow

data class ConfirmOrderUseCaseResponse(
    val offerId : String? = null,
    val paymentMode : String? = null,
    val paymentMethod : String? = null,
    val paymentMethodId : Long? = null
)