package com.intellihealth.truemeds.data.model.orderflow

import androidx.annotation.Keep
import com.intellihealth.truemeds.presentation.model.ProductInfoModel

@Keep
data class ReplaceAllBottomSheetModel(
    val productMRP: Double,
    val suggestionMRP: Double,
    val productSellingPrice: Double,
    val suggestionSellingPrice: Double,
    val list: List<ProductInfoModel>,
    val savingPercent: String,
    var companyIconList: List<String>?= emptyList()
)
