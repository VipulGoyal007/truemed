package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxExperimentStarted(
    @SerializedName("Experiment id")
    var experimentId: Long? = null,
    @SerializedName("Experiment name")
    var experimentName: String? = null,
    @SerializedName("Variant id")
    var variantId: Long? = null,
    @SerializedName("Variant name")
    var variantName: String? = null,
    @SerializedName("assigned")
    var assigned: String? = "post-login"
)