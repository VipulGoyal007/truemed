package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxArticlesCategorySectionViewed(
    @SerializedName("category")
    var category: String? = null,
    @SerializedName("category_id")
    var categoryId: String? = null,
    @SerializedName("clicked_on_article_name")
    var clickedOnArticleName: String? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)