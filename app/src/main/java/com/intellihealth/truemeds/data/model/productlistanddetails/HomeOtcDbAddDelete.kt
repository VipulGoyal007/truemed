package com.intellihealth.truemeds.data.model.productlistanddetails

import com.intellihealth.truemeds.presentation.model.ProductInfoModel

data class HomeOtcDbAddDelete(
    var item: ProductInfoModel?= null,
    var pos: Int = 0,
    var isFromLimitedOffer:Boolean?=true,
    var type:String?=""
)