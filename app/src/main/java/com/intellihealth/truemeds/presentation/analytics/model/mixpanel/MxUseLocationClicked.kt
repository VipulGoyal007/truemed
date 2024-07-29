package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.errorprone.annotations.Keep
import com.google.gson.annotations.SerializedName


@Keep
data class MxUseLocationClicked(
    @SerializedName("address_line_2")
    var addressLine2: String? = null,
    @SerializedName("city")
    var city: String? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("pincode")
    var pincode: String? = null,
    @SerializedName("pincode_fetched")
    var pincodeFetched: Boolean? = null,
    @SerializedName("pincode_fetched_response")
    var pincodeFetchedResponse: String? = null,
    @SerializedName("serviceable")
    var serviceable: Boolean? = null,
    @SerializedName("state")
    var state: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("order_id")
    var order_id:String?=null
)