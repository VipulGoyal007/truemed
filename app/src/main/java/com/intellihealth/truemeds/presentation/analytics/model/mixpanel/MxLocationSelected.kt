package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxLocationSelected(
    @SerializedName("city")
    var city: String? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("pincode_collected")
    var pincodeCollected: Int? = null,
    @SerializedName("selection_method")
    var selectionMethod: String? = null,
    @SerializedName("state")
    var state: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)