package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxOneClickSubstitutionPopupViewed(
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("one_click_estimated_payable_amount")
    var oneClickEstimatedPayableAmount: Double? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("subs_savings_percentage")
    var subsSavingsPercentage: Double? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)