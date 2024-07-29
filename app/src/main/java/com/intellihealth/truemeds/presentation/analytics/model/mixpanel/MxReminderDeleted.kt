package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxReminderDeleted(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("variant_name")
    var variantName: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)