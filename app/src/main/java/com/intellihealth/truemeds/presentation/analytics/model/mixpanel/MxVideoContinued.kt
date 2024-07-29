package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


// todo use for video_completed
//todo use for video_player_closed
data class MxVideoContinued(
    @SerializedName("video_id")
    var videoId: Int? = null,
    @SerializedName("video_name")
    var videoName: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("\$mp_api_timestamp_ms")
    var timestamp: Long? = null
)