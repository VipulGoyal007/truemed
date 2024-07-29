package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel

data class MxHomePageViewed(
    @SerializedName("discount_variant_id")
    var discountVariantId: Long? = null,
    @SerializedName("wh_id")
    var whId: String? = null
){
    fun toAppsFlyer(): Map<String, Any> {
        return emptyMap()
    }

    fun toFireBase() : FirebaseEventModel {
        return FirebaseEventModel()
    }
}