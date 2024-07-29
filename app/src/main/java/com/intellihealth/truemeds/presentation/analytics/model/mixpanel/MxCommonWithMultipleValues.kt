package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName

abstract class MxCommonWithMultipleValues(
    @SerializedName("result_position") var resultPosition: Int? = null,
    @SerializedName("term_searched") var termSearched: String? = null,
    @SerializedName("suggestion_term_clicked") var suggestionTermClicked: String? = null,
    @SerializedName("suggestion_term_clicked_position") var suggestionTermClickedPosition: Int? = null,
    @SerializedName("clicked_suggestion_type") var clickedSuggestionType: String? = null,
    @SerializedName("section_heading") var sectionHeading: String? = null,
    @SerializedName("section_row") var sectionRow: Int? = null,
    @SerializedName("section_index") var sectionIndex: Int? = null,
    @SerializedName("wh_id") var warehouseId: Int? = null,
    @SerializedName("free_delivery_required_amount") var freeDeliveryRequiredAmount: Double? = null,
    @SerializedName("pdp_product_name") var pdpProductName: String? = null,
    @SerializedName("clicked_on_page") var clickedOnPage: String? = null,
    @SerializedName("page_section") var pageSection: String? = null,
    @SerializedName("category_name") var categoryName: String? = null,
    @SerializedName("super_category_name") var superCategoryName: String? = null
)
