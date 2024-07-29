package com.intellihealth.truemeds.presentation.model

data class OtcDeepLink(
    var superCategoryId:Int,
    var categoryId:Int ,
    var subCategoryId:Int,
    var brandsList: List<String> = emptyList(),
    var superCategoryName:String?,
    var position:Int?=0,
    var categoryType:String?
)
