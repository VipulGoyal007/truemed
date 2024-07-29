package com.intellihealth.truemeds.data.model.search

import com.intellihealth.truemeds.presentation.model.ProductInfoModel

data class SearchBottomSheetModel(

    var products: List<ProductInfoModel> = emptyList() ,
    var selectedProduct: com.intellihealth.salt.models.ProductInfoModel,
    val position: Int

 )