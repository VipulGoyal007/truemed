package com.intellihealth.truemeds.data.model.orderflow

import com.google.gson.annotations.SerializedName

data class PatientDetail(
    @SerializedName("patientId") var patientId: Long? = null,
    @SerializedName("patientName") var patientName: String? = "",
    @SerializedName("genderId") var genderId: Int? = null,
    @SerializedName("gender") var gender: String? = null,
    @SerializedName("age") var age: Int? = null,
    @SerializedName("relationId") var relationId: Int? = null,
    @SerializedName("relationName") var relationName: String? = null,
    @SerializedName("emailId") var emailId: String? = null,
    @SerializedName("firstName") var firstName: String? = null,
    @SerializedName("lastName") var lastName: String? = null
)
