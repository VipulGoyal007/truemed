package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName

data class MxUploadPrescriptionClicked(
    @SerializedName("upload_method")
    var uploadMethod: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)