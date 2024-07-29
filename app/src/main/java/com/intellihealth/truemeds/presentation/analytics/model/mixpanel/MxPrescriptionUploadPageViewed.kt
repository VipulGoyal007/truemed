package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName

data class MxPrescriptionUploadPageViewed(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("prescription_uploaded_count")
    var prescriptionUploadedCount: Int = 0,
)