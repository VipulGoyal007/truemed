package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxReferralScreenViewed(
    @SerializedName("is_bottom_nav")
    var isBottomNav: Boolean = false,
    @SerializedName("wh_id")
    var whId: String? = null
)