package com.intellihealth.truemeds.data.model.home

data class SuperCategoryDataModel(
    var id:Int=5,
    var type :String="",
    var list: List<SuperCategoryModel> = emptyList()
)
