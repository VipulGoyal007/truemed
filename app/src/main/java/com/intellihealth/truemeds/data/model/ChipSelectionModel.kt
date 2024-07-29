package com.intellihealth.truemeds.data.model

import com.intellihealth.salt.models.ProductCardSectionChipModel

data class ChipSelectionModel(
    val chipName : ProductCardSectionChipModel,
    var isSelected:Boolean?=false
)