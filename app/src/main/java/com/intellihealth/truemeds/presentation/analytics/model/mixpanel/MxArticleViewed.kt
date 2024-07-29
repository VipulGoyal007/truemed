package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName
import org.json.JSONArray


data class MxArticleViewed(
    @SerializedName("article_author")
    var articleAuthor: String? = null,
    @SerializedName("article_date")
    var articleDate: String? = null,
    @SerializedName("article_id")
    var articleId: String? = null,
    @SerializedName("article_title")
    var articleTitle: String? = null,
    @SerializedName("categories")
    var categories: ArrayList<String>? = null,
    @SerializedName("category_ids")
    var categoryIds: ArrayList<String>? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)