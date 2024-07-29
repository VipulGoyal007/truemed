package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFAddressAdded
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent


data class MxAddressAdded(
    @SerializedName("address_line_2_edited")
    var addressLine2Edited: Boolean = false,
    @SerializedName("address_type")
    var addressType: String? = null,
    @SerializedName("city")
    var city: String? = null,
    @SerializedName("city_edited")
    var cityEdited: Boolean = false,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("pincode")
    var pincode: Int? = null,
    @SerializedName("pincode_edited")
    var pincodeEdited: Boolean = false,
    @SerializedName("pincode_fill_type")
    var pincodeFillType: String? = null,
    @SerializedName("state")
    var state: String? = null,
    @SerializedName("state_edited")
    var stateEdited: Boolean = false,
    @SerializedName("use_location_used")
    var useLocationUsed: Boolean = false,
    @SerializedName("wh_id")
    var whId: String? = null
){
    fun toAppsFlyer() : Map<String, Any> {
        return AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(AFAddressAdded(city, pincode.toString(), state)))
    }
}