package com.intellihealth.truemeds.presentation.model

import com.google.gson.annotations.SerializedName

data class SearchResultElasticResponse(
    @SerializedName("totalProducts") var totalProducts: Int? = null,
    @SerializedName("elasticProductDetails") var elasticProductDetails: List<ProductInfoModel>? = listOf()
)
