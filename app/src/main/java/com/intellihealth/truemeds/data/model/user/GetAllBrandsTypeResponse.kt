package com.intellihealth.truemeds.data.model.user

data class GetAllBrandsTypeResponse(
    val brandTypeList: List<BrandType?>?
) {
    data class BrandType(
        val id: String?,
        val brandName: String?,
        var isSelected: Int=2,
    )
}