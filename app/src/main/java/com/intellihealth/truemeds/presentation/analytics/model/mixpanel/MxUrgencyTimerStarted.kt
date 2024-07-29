package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxUrgencyTimerStarted(
    @SerializedName("urgency_time_remaining")
    var urgencyTimeRemaining: Long? = null
)