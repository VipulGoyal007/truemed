package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName

data class MxLoginSuccess(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,

    @SerializedName("fill_type")
    var fillType: String? = null,

    @SerializedName("mobile_number")
    var mobileNumber: Long? = null,

    @SerializedName("total_otp_attempts")
    var totalOtpAttempts: Int? = null

)
