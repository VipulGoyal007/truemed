package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxAppOpen(
    @SerializedName("device_id")
    var deviceId: String? = null,
    @SerializedName("customer_id")
    var customerId: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)