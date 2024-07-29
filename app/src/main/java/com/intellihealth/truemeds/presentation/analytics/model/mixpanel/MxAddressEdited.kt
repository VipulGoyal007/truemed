package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxAddressEdited(
    @SerializedName("address_line_1_edited")
    var addressLine1Edited: Boolean = false,
    @SerializedName("address_line_2_edited")
    var addressLine2Edited: Boolean = false,
    @SerializedName("address_type_changed")
    var addressTypeChanged: String? = null,
    @SerializedName("city_edited")
    var cityEdited: Boolean = false,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("landmark_edited")
    var landmarkEdited: Boolean = false,
    @SerializedName("state_edited")
    var stateEdited: Boolean = false,
    @SerializedName("wh_id")
    var whId: String? = null
)