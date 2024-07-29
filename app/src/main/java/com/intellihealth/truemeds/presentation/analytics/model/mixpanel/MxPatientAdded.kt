package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFPatientAdded
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent


data class MxPatientAdded(
    @SerializedName("age")
    var age: Int? = null,
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("gender")
    var gender: String? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("patient_type")
    var patientType: String? = null,
    @SerializedName("last_name_added")
    var lastNameAdded: Boolean? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("email_added")
    var emailAdded: String?= null
){
    fun toAppsFlyer() : Map<String, Any> {
        return AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(AFPatientAdded(patientType)))
    }
}