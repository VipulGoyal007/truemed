package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName

data class MxOtpTyped(
    @SerializedName("fill_type")
    var fillType: String?=null,
    @SerializedName("mobile_number")
    var mobileNumber: String?=null
)