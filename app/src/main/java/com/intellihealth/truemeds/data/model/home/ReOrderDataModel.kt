package com.intellihealth.truemeds.data.model.home

import com.intellihealth.salt.models.ReorderModel
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants

data class ReOrderDataModel(
    var id: Int = 2,
    var type: String = HomeSectionConstants.REORDER,
    var list: List<ReorderModel>
)
