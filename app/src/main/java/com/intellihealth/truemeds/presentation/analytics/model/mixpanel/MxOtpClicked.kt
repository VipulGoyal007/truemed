package com.intellihealth.truemeds.data.model.mixpanel


import com.google.gson.annotations.SerializedName

data class MxOtpClicked(
    @SerializedName("is_new_user")
    var isNewUser: Boolean? = null,
    @SerializedName("mobile_number")
    var mobileNumber: String? = null
)