package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxPatientDetailsEdited(
    @SerializedName("age_edited")
    var ageEdited: Boolean = false,
    @SerializedName("gender_edited")
    var genderEdited: Boolean = false,
    @SerializedName("name_edited")
    var nameEdited: Boolean = false,
    @SerializedName("patient_type")
    var patientType: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)