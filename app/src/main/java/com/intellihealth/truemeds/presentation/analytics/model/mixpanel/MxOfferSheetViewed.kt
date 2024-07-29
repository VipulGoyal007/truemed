package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxOfferSheetViewed(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("mov")
    var mov: String? = null,
    @SerializedName("offer_name")
    var offerName: String? = null,
    @SerializedName("offer_type")
    var offerType: String? = null,
    @SerializedName("valid_till")
    var validTill: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)