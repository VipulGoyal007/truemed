package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.presentation.analytics.model.clevertap.CtPatientAdded

data class MxProfileDetailsEdited(
    @SerializedName("clicked_on_page")
    var clickedOnPage: String? = null,
    @SerializedName("first_name_edited")
    var firstNameEdited: String? = null,
    @SerializedName("last_name_edited")
    var lastNameEdited: String? = null,
    @SerializedName("mobile_number")
    var mobileNumber: Long? = null,
    @SerializedName("email_edited")
    var emailEdited: String?= null,
    @SerializedName("age_edited")
    var ageEdited: Int? = null,
    @SerializedName("gender_edited")
    var genderEdited: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
){
    fun toCleverTap() : CtPatientAdded{
        return CtPatientAdded(age = ageEdited, clickedOnPage = clickedOnPage, gender = genderEdited, name = firstNameEdited, patientType = "myself", lastNameAdded = !lastNameEdited.isNullOrEmpty(), emailAdded = emailEdited, platform = "APP")
    }
}
