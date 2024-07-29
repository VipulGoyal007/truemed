package com.intellihealth.truemeds.presentation.model

data class CartMedicineModel (
    var orgInfoModel: ProductInfoModel? = null,
    var subsMedicineModel: ProductInfoModel? = null,
    var autoReplaced: Boolean? = false,
    var totalSavings: Double = 0.0,
    var sequence: Int = 0
)