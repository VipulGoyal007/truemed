package com.intellihealth.truemeds.presentation.model

data class OtcProductsForCategoriesRequest(
    var isApp: Boolean = true,
    var id: Int,
    var type: String,
    var collectionId: Int,
    var page: Int = 0,
    var result: Int,
    var isBrandOnly: Boolean = false,
    var sessionToken: String,
    var variantId: Long? = null,
    var warehouseId: Int = 3,
    var brands: List<String> = emptyList(),
)
