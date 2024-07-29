package com.intellihealth.truemeds.presentation.analytics.model.firebase

import com.google.gson.annotations.SerializedName

data class FbHealthIssuesSelected(
    @SerializedName("mobile")
    var mobile: String? = null,

    @SerializedName("page_name")
    var pageName: String? = null,

    @SerializedName("customer_id")
    var customerId: String? = null,

    @SerializedName("medical_conditions")
    var medicalConditions: String? = null,

    @SerializedName("bill_value")
    var billValue: String? = null,
    )
