package com.intellihealth.truemeds.data.model.orderissue


data class AllIssueMedicineResponse(
    val issueCategories: List<IssueCategory?>?,
    val medicines: List<Medicine?>?
) {
    data class IssueCategory(
        val categoryId: Int?,
        val categoryName: String?
    )
    data class Medicine(
        val description: Any?,
        val issueCategory: Any?,
        val issueId: Any?,
        val medicineId: String?,
        val orderProducPrice: Double?,
        val orderProductName: String?,
        val orderProductQty: String?,
        val orgProductDisc: Double?,
        val orgProductcd: Any?,
        val originalProductQty: Any?,
        val productSellingPrice: Double?,
        val subsProductQty: Any?,
        val substituteProductName: Any?,
        val substituteProductOty: Any?,
        val substituteProductPrice: Double?
    )
}