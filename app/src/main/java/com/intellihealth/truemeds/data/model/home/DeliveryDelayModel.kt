package com.intellihealth.truemeds.data.model.home

data class DeliveryDelayModel(
    var orderID: String? = null,
    var title: String? = null,
    var message: String? = null,
    var buttonText : String? = null,
    var time: String? = null, // if timer string is not set then timer from the bottomSheet will be hidden
)
