package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName

//todo use for video_floater_impression
data class MxVideoFloaterClicked(
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("video_id")
    var videoId: String? = null,
    @SerializedName("video_name")
    var videoName: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)