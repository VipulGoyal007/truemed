package com.intellihealth.truemeds.data.model.home

import com.intellihealth.salt.models.ProductInfoModel

data class HomeReorderBottomSheetModel(
    var list:List<ProductInfoModel> = arrayListOf(),
    val header: String?,
    val subHeader : String?,
    val totalPrice: String?
)
