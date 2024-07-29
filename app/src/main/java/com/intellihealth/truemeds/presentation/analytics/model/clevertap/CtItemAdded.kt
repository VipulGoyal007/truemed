package com.intellihealth.truemeds.data.model.clevertap

import com.google.gson.annotations.SerializedName

data class CtItemAdded(
    @SerializedName("product_id")
    var productId: String? = null,
    @SerializedName("product_name")
    var productName: String? = null,
    @SerializedName("substitute_available")
    var substituteAvailable: Boolean = false,
    @SerializedName("is_substitute")
    var isSubstitute: Boolean = false,
    @SerializedName("org_discount_percentage")
    var orgDiscountPercentage: Double? = null,
    @SerializedName("org_sale_price")
    var orgSalePrice: Double? = null,
    @SerializedName("org_mrp")
    var orgMrp: Double? = null,
    @SerializedName("subs_savings")
    var subsSavings: Double? = null,
    @SerializedName("subs_product_name")
    var subsProductName: String? = null,
    @SerializedName("subs_product_id")
    var subsProductId: String? = null,
    @SerializedName("subs_sale_price")
    var subsSalePrice: Double? = null,
    @SerializedName("subs_mrp")
    var subsMrp: Double? = null,
    @SerializedName("pack_size_difference")
    var packSizeDifference: String? = null,
    )