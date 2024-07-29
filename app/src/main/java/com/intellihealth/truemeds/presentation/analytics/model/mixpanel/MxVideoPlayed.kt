package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxVideoPlayed(
    @SerializedName("source")
    var source: String? = null,
    @SerializedName("total_playtime")
    var totalPlaytime: Int? = null,
    @SerializedName("video_id")
    var videoId: Int? = null,
    @SerializedName("video_name")
    var videoName: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("\$mp_api_timestamp_ms")
    var timestamp: Long? = null

)