package com.intellihealth.truemeds.presentation.model

import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse

data class PaymentMethodSelectionModel(
    var paymentMethod: String? = null,
    var paymentMethodId: Long? = null,
    var paymentMethodUrl: String? = null,
    var paymentOptionsList: List<PaymentMethodResponse.ResponseData>? = emptyList()
)