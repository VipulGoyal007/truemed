package com.intellihealth.truemeds.presentation.analytics.model.firebase

import com.google.gson.annotations.SerializedName

data class FbErrorTracking(
    @SerializedName("deviceTag")
    var deviceTag: String? = null,

    @SerializedName("screen")
    var screen: String? = null,

    @SerializedName("errorLog")
    var errorLog: String? = null,

    @SerializedName("manufacturer")
    var manufacturer: String? = null,

    @SerializedName("model")
    var model: String? = null,

    @SerializedName("apiLevel")
    var apiLevel: String? = null,

    @SerializedName("dateTime")
    var dateTime: String? = null,

    )
