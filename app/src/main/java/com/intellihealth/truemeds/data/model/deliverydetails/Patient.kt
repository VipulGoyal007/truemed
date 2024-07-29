package com.intellihealth.truemeds.data.model.deliverydetails


data class Patient(
    var patientId: Long = 0,
    var patientName: String = "",
    var patientRelation: String = "",
    var age: Int = 0,
    var type: String = "",
    var gender: Int = 0,
    var relationId: Int = 0,
    var selected: Boolean = false,
    var patientLastName: String = "",
    var rxCount: Int = 0
)
