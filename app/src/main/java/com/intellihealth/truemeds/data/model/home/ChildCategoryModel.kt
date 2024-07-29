package com.intellihealth.truemeds.data.model.home

import com.google.gson.annotations.SerializedName


data class ChildCategoryModel(
    val id: Int,
    val name: String? = "",
    val url: String? = "",
    val image: String? = "",
    val type: String? = "",
    val priority: Int = 0,
    @SerializedName("substitle")
    val subsTitle: String? = null,
    val collectionId: Int = 0,
    var selectedCategory: Boolean? = false,
    val discountPercentage: String? = "",
    val categoryLevel3List: List<CategoryLevel3List>,

    ) {
    data class CategoryLevel3List(
        val id: Int,
        val name: String? = "",
        val url: String? = "",
        val image: String? = "",
        val subsTitle: String? = "",
        val type: String? = "",
        val priority: Int = 0,
        val collectionId: Int = 0,
    )
}
