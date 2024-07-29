package com.intellihealth.truemeds.data.model.clevertap

import com.google.gson.annotations.SerializedName

data class CtItemSearched(
    @SerializedName("term_searched")
    var termSearched: String? = null,
    @SerializedName("suggestion_term_clicked")
    var suggestionTermClicked: String? = null
)
