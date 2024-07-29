package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.errorprone.annotations.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class MxReorderSheetViewed (
    @SerializedName("order_id") var orderId: String? = "",
    @SerializedName("clicked_on_page") var clickedOnPage: String? = "",
    @SerializedName("patient_name") var patientName: String? = "",
    @SerializedName("no_of_item") var noOfItem: Int = 0
)