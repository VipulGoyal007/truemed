package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class MxCategoryImpression(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("category_name")
    var categoryName: String? = null,
    @SerializedName("super_category_name")
    var superCategoryName: String? = null,
    @SerializedName("category_index")
    var categoryIndex: Int? = null,
    @SerializedName("subtitle_text")
    var subTitleText: String? = null,
)