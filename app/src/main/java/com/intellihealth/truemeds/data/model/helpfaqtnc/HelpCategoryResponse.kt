package com.intellihealth.truemeds.data.model.helpfaqtnc

/**
 * This is used to both help category and details of help category for customer
 * **/
data class HelpCategoryResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: List<CategoryList?>?
) {
    data class CategoryList(
        /**
         * This is used for fetching next level category
         * **/
        val categoryId: Int?,
        /**
         * This is used for showing category name
         * **/
        val categoryName: String?,
        val description: String?,
        val icon: String?,
        val answers: String?,
        val helpCategoryDetailsDTOs: List<CategoryList?>?,
        /**
         * This is used for showing details of help category
         * **/
        val issues: String?,
        val issuesId: Int?,
        var isFilterApplied: Boolean = false
    )
}