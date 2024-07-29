package com.intellihealth.truemeds.data.model.clevertap

import com.google.gson.annotations.SerializedName

data class CtPdpViewed(
    @SerializedName("org_product_name")
    var orgProductName: String? = null,
    @SerializedName("org_product_mrp")
    var orgProductMrp: Double? = null,
    @SerializedName("org_product_sale_price")
    var orgProductSalePrice: Double? = null,

    @SerializedName("org_product_discount_percentage")
    var orgProductDiscountPercentage: String? = null,

    @SerializedName("product_id")
    var productId: String? = null,

    @SerializedName("product_name")
    var productName: String? = null,

    @SerializedName("subs_product_id")
    var subsProductId: String? = null,

    @SerializedName("subs_product_name")
    var subsProductName: String? = null,

    @SerializedName("subs_product_mrp")
    var subsProductMrp: Double? = null,

    @SerializedName("subs_product_sale_price")
    var subsProductSalePrice: Double? = null,

    @SerializedName("subs_product_discount_percentage")
    var subsProductDiscountPercentage: String? = null,

    @SerializedName("subs_savings")
    var subsSavings: String? = null,

    @SerializedName("substitute_available")
    var substituteAvailable: Boolean? = null,

    @SerializedName("product_mrp")
    var productMrp: Double? = null

    /*@SerializedName("section_heading")
    var section_heading: String? = null,*/
    )


