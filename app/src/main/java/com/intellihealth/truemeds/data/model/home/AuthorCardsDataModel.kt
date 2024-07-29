package com.intellihealth.truemeds.data.model.home

import com.intellihealth.salt.models.AuthorCardModel


data class AuthorCardsDataModel(
    var title:String?="",
    var authorsList: ArrayList<AuthorCardModel> = arrayListOf()
)
