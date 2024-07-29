package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName

data class MXPatientDetailsEditedImpression(
    @SerializedName("age_edited")
    var ageEdited: Boolean?,
    @SerializedName("gender_edited")
    var genderEdited: Boolean?,
    @SerializedName("name_edited")
    var nameEdited: Boolean?,
    @SerializedName("patient_type")
    var patientType: String?=null,
    @SerializedName("wh_id")
    var whId: String?= null,
    @SerializedName("emailID")
    var emailId: String?= null
)