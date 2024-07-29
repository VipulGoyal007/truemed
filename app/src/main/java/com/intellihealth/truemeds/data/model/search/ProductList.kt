package com.intellihealth.truemeds.data.model.search

import com.google.gson.annotations.SerializedName

data class ProductList(
    
    @SerializedName("skuName") var skuName: String? = null,
    @SerializedName("productCode") var productCode: String? = null,
    @SerializedName("productImage") var productImage: String? = null,
    @SerializedName("mrp") var mrp: Double? = null,
    @SerializedName("sellingPrice") var sellingPrice: Double? = null,
    @SerializedName("discount") var discount: Double? = null,
    @SerializedName("maxQuantity") var maxQuantity: Int? = null,
    @SerializedName("availabilityStatus") var availabilityStatus: String? = null,
    @SerializedName("isAvailable") var isAvailable: Boolean? = null,
    @SerializedName("suppliedByTm") var suppliedByTm: Boolean? = null

)