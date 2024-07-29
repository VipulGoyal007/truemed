package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.presentation.analytics.model.clevertap.CtPatientAdded

data class MxProfileDetailsAdded(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("first_name_added")
    var firstNameAdded: String? = null,
    @SerializedName("last_name_added")
    var lastNameAdded: String? = null,
    @SerializedName("mobile_number")
    var mobileNumber: Long? = null,
    @SerializedName("email_added")
    var emailAdded: String?= null,
    @SerializedName("age_added")
    var ageAdded: Int? = null,
    @SerializedName("gender_added")
    var genderAdded: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
){
    fun toCleverTap() : CtPatientAdded{
        return CtPatientAdded(age = ageAdded, clickedOnPage = clickedOnPage, gender = genderAdded, name = firstNameAdded, patientType = "MYSELF", lastNameAdded = !lastNameAdded.isNullOrEmpty(), emailAdded = emailAdded, platform = "APP")
    }
}

