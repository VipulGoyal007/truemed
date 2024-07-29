package com.intellihealth.truemeds.presentation.model

import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse

data class PaymentSelectionResponse(
    var selectedPaymentMethod : String,
    var selectedPaymentMethodId : Long,
    var selectedPaymentMethodUrl : String,
    var paymentOptionsList :  ArrayList<PaymentMethodResponse.ResponseData>
)