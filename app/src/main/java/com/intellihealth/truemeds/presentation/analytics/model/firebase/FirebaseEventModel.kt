package com.intellihealth.truemeds.presentation.analytics.model.firebase

import com.google.gson.annotations.SerializedName


data class FirebaseEventModel(
    @SerializedName("mobile")
    var mobile: String? = null,

    @SerializedName("page_name")
    var pageName: String? = null,

    @SerializedName("customer_id")
    var customerId: String? = null,

    @SerializedName("medical_conditions")
    var medicalConditions: String? = null,

    @SerializedName("callUsNumber")
    var callUsNumber: String? = null,

    @SerializedName("orderId")
    var orderId: String? = null,
    @SerializedName("variant_id")
    var variantId: Int? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("Payment_flagged")
    var paymentFlagged: String? = null,
    @SerializedName("Payment_error")
    var paymentError: String? = null,

    @SerializedName("exp_id")
    var expId: String? = null,

    @SerializedName("product_code")
    var productCode: String? = null,

    @SerializedName("product_name")
    var productName: String? = null,

    @SerializedName("orgPackSize")
    var orgPackSize: String? = null,

    @SerializedName("url")
    var url: String? = null,

    @SerializedName("message")
    var message: String? = null,


    )
