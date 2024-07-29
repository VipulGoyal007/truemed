package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxArticleShared(
    @SerializedName("article_id")
    var articleId: String? = null,
    @SerializedName("article_title")
    var articleTitle: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)