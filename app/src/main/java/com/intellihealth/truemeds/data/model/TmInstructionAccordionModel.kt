package com.intellihealth.truemeds.data.model

import android.graphics.drawable.Drawable

data class TmInstructionAccordionModel(
    var list: ArrayList<HeaderModel> = arrayListOf()
)

data class HeaderModel(
    var title:String?="",
    var childList:List<ChildItemModel>? =arrayListOf()
)

data class ChildItemModel(
    var childItemImageDrawable: Drawable?=null,
    var childItemTitle:String?="",
    var childItemSubTitle: String?=""
)