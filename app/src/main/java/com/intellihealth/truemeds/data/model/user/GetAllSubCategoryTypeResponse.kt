package com.intellihealth.truemeds.data.model.user

data class GetAllSubCategoryTypeResponse(
    val subCategoryTypeList: List<SubCategoryType?>?
) {
    data class SubCategoryType(
        val id: String?,
        val categoryName: String?,
        val subCategoryId: String="",
        val subCategoryName: String="",
        var isSelected: Boolean=false,
        val level: String?,
        val collectionId: Int,
        val position: Int,
        )
}