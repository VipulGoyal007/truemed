package com.intellihealth.truemeds.data.model.home


data class SuperCategoryModel(
    val id: Int,
    val name: String? = "",
    val url: String? = "",
    val image: String? = "",
    val type: String? = "",
    val priority: Int = 0,
    val banner: String? = null,
    val banners: List<BannersItem>,
    var categoryLevel2List: List<ChildCategoryModel>,
    var selectedCategory: Boolean? = false

) {
    data class BannersItem(
        val image: String? = "",
        val redirectUrl: String? = "",
        val active: Boolean? = false,
        val description: String? = "",
        val redirectTo: String? = "",
        val drugType: String? = "",
        val type: String? = "",
        val webUrl: String? = "",
        val header: String? = "",
        val eventName: String? = "",
        val ranking: Int? = 0,
        val subType: String? = "",
        val id: Int? = 0,

        )
}
