package com.intellihealth.truemeds.data.model.home

import com.intellihealth.salt.models.ActionCardModel


data class ActionCardDataModel(
    var id:Int=3,
    var type :String="",
    var actionCardModel: ActionCardModel?=null
)
