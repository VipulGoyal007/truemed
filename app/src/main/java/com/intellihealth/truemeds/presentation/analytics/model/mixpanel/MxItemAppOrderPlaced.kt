package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxItemAppOrderPlaced(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("is_reorder")
    var isReorder: Boolean = false,
    @SerializedName("is_substitute")
    var isSubstitute: Boolean = false,
    @SerializedName("item_is_otc")
    var itemIsOtc: Boolean = false,
    @SerializedName("order_id")
    var orderId: Long? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("product_brand_name")
    var productBrandName: String? = null,
    @SerializedName("product_discount_percentage")
    var productDiscountPercentage: String? = null,
    @SerializedName("product_drug_type")
    var productDrugType: String? = null,
    @SerializedName("product_id")
    var productId: String? = null,
    @SerializedName("product_manufacturer")
    var productManufacturer: String? = null,
    @SerializedName("product_mrp")
    var productMrp: Double? = null,
    @SerializedName("product_name")
    var productName: String? = null,
    @SerializedName("product_pack")
    var productPack: String? = null,
    @SerializedName("product_qty_sold")
    var productQtySold: Int? = null,
    @SerializedName("product_sale_price")
    var productSalePrice: Double? = null,
    @SerializedName("product_salt")
    var productSalt: String? = null,
    @SerializedName("section_heading")
    var sectionHeading: String? = null,
    @SerializedName("section_index")
    var sectionIndex: String? = null,
    @SerializedName("subs_id")
    var subsId: Int? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)