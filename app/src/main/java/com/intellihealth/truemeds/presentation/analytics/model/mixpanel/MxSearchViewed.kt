package com.intellihealth.truemeds.data.model.mixpanel


import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFOrderCancelled
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFSearchViewed
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent

data class MxSearchViewed(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("discount_variant_id")
    var discountVariantId: Int? = null,
    @SerializedName("page_section")
    var pageSection: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null


){
    fun toAppsFlyer() : Map<String, Any>{
        return AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(AFSearchViewed(clickedOnPage = clickedOnPage, pageSection = pageSection)))
    }
}