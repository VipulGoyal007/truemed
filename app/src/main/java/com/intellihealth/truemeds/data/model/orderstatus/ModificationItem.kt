package com.intellihealth.truemeds.data.model.orderstatus

import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.models.TooltipProductCardModel


data class ModificationItem(
    val productDetailModel : ProductInfoModel,
    val tooltipProductCardModel: TooltipProductCardModel
)
