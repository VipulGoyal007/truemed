package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxItemImpression(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("free_delivery_required_amount")
    var freeDeliveryRequiredAmount: Double? = null,
    @SerializedName("is_otc")
    var isOtc: Boolean = false,
    @SerializedName("mrp")
    var mrp: Double? = null,
    @SerializedName("org_mrp")
    var orgMrp: Double? = null,
    @SerializedName("org_product_id")
    var orgProductId: String? = null,
    @SerializedName("org_product_name")
    var orgProductName: String? = null,
    @SerializedName("org_sales_price")
    var orgSalesPrice: Double? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("product_discount_percentage")
    var productDiscountPercentage: Double? = null,
    @SerializedName("product_id")
    var productId: String? = null,
    @SerializedName("product_name")
    var productName: String? = null,
    @SerializedName("result_position")
    var resultPosition: Int? = null,
    @SerializedName("sales_price")
    var salesPrice: Double? = null,
    @SerializedName("section_heading")
    var sectionHeading: String? = null,
    @SerializedName("section_index")
    var sectionIndex: Int? = null,
    @SerializedName("section_row")
    var sectionRow: Int? = null,
    @SerializedName("subs_id")
    var subsId: Int? = null,
    @SerializedName("subs_mrp")
    var subsMrp: Double? = null,
    @SerializedName("subs_sales_price")
    var subsSalesPrice: Double? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("suggestion_term_clicked")
    var suggestionTermClicked: String? = null,
    @SerializedName("term_searched")
    var termSearched: String? = null
)