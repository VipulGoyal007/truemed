package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxSrpAddSubBottomSheetViewed(
    @SerializedName("clicked_suggestion_type")
    var clickedSuggestionType: String? = null,
    @SerializedName("org_mrp")
    var orgMrp: Double? = null,
    @SerializedName("org_product_discount_percentage")
    var orgProductDiscountPercentage: Double? = null,
    @SerializedName("org_product_id")
    var orgProductId: String? = null,
    @SerializedName("org_product_name")
    var orgProductName: String? = null,
    @SerializedName("org_product_picture_exists")
    var orgProductPictureExists: Boolean? = false,
    @SerializedName("org_sale_price")
    var orgSalePrice: Double? = null,
    @SerializedName("pack_size_difference")
    var packSizeDifference: String? = null,
    @SerializedName("result_position")
    var resultPosition: Int? = null,
    @SerializedName("subs_discount_percentage")
    var subsDiscountPercentage: Double? = null,
    @SerializedName("subs_mrp")
    var subsMrp: Double? = null,
    @SerializedName("subs_product_id")
    var subsProductId: String? = null,
    @SerializedName("subs_product_name")
    var subsProductName: String? = null,
    @SerializedName("subs_product_picture_exists")
    var subsProductPictureExists: Boolean? = false,
    @SerializedName("subs_sale_price")
    var subsSalePrice: Double? = null,
    @SerializedName("subs_savings")
    var subsSavings: Double? = null,
    @SerializedName("substitute_available")
    var substituteAvailable: Boolean? = false,
    @SerializedName("term_searched")
    var termSearched: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)