package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName

//todo this is same use for add_patient_clicked
//todo this is same use for articles_section_viewed
//todo this is same use for prescription_removed
data class MxAddAddressClicked(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)