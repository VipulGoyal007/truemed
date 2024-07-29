package com.intellihealth.truemeds.presentation.model

data class HomeBanner(var banner: List<Banner>) {
    data class Banner(
        var image: String = "",
        var redirectTo: String = "",
        var redirectUrl: String = "",
        var sequence: Int = 0,
        var webImage: String = "",
        var thumbnailUrl: String = "",
        var position: Int = 0,
        var description: String?=null,
        var drugType: String?=null,
        var searchTerm: String?=null,
        var searchType: String?=null
    )
}