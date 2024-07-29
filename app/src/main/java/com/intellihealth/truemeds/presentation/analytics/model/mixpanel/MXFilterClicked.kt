package com.intellihealth.truemeds.mvvm.data.mixpanel

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class MXFilterClicked(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("category_name")
    var categoryName: String? = null,
    @SerializedName("super_category_name")
    var superCategoryName: String? = null,
)