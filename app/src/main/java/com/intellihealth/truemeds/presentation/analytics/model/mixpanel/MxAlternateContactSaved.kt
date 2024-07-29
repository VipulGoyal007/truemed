package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxAlternateContactSaved(
    @SerializedName("alternate_contact")
    var alternateContact: String? = null,
    @SerializedName("current_contact")
    var currentContact: String? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)