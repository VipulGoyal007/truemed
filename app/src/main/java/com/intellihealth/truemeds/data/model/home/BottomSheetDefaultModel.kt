package com.intellihealth.truemeds.data.model.home

data class BottomSheetDefaultModel(
    var discountPercentage: Double = 0.0,
    var sellingPrice: Double = 0.0,
    var title: String? = null,
    var message: String? = null,
    var paymentType: String? = null,
    var paymentTypeLogoUrl: String? = null,
    var payableAmount: String? = null,
    var paymentMethodID: Long? = null,
    var orderId: Long = 0,
    val isReorder:Boolean?=false
)
