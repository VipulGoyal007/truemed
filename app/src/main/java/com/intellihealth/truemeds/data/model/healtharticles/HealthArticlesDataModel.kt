package com.intellihealth.truemeds.data.model.healtharticles

import com.intellihealth.salt.models.HealthArticleChipCategoryData

data class HealthArticlesDataModel(
    val id : Int = 0,
    val title : String? = "",
    val author : String? = "",
    val url : String? =  "",
    val slug : String? = "",
    val category : String? = "",
    val type : String? = "",
    val date : String? = "",
    var content : String? = "",
    var isSuccess : Boolean = true,
    var message : String = "",
    var categoryNameChipList: ArrayList<HealthArticleChipCategoryData> = arrayListOf()
)