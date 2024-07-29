package com.intellihealth.truemeds.presentation.analytics.model.firebase

import com.google.gson.annotations.SerializedName

data class FbHomePageHealthArticle(
    @SerializedName("mobile")
    var mobile: String? = null,

    @SerializedName("customer_id")
    var customerId: String? = null,

    @SerializedName("category_id")
    var categoryId: String? = null,

    )
