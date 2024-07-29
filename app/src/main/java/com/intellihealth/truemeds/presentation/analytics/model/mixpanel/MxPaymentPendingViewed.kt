package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxPaymentPendingViewed(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("estimated_payable_amount")
    var estimatedPayableAmount: Double? = null,
    @SerializedName("order_id")
    var orderId: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge: Double? = null
)