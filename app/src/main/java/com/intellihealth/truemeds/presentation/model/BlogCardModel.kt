package com.intellihealth.truemeds.presentation.model

import java.io.Serializable

data class BlogCardModel(
    val id : Int?=0,
    val date: String,
    val chipTitle: String,
    val title: String,
    val imgUrl: String,
    val writtenBy:String?="",
    val slug:String?="",
    val chipTitleList: List<com.intellihealth.salt.models.HealthArticleChipCategoryData> = emptyList()
) : Serializable
{
    fun toSdkObject(): com.intellihealth.salt.models.BlogCardModel {
        return com.intellihealth.salt.models.BlogCardModel(
            date, chipTitle, title, imgUrl, writtenBy
        )
    }
}
