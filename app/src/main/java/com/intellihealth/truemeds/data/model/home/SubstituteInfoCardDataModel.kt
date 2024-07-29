package com.intellihealth.truemeds.data.model.home

import com.intellihealth.salt.models.SubstituteInfoCardModel
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants

data class SubstituteInfoCardDataModel(
    var id:Int=4,
    var type :String= HomeSectionConstants.SUBS,
    var substituteInfoCardModel:SubstituteInfoCardModel?=null
)
