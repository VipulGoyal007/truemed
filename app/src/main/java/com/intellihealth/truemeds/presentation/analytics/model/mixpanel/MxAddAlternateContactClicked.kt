package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName

//todo use for undo_clicked
data class MxAddAlternateContactClicked(
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)