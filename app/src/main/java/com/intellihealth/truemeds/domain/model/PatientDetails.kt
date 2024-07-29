package com.intellihealth.truemeds.domain.model

data class PatientDetails(
    var gender: String?,
    var firstName: String? = null,
    var lastName: String? = null,
    var age: String?,
    var relationId: String?,
    var patientId: String?,
    var patientName: String?,
    var emailAddress: String?
)
