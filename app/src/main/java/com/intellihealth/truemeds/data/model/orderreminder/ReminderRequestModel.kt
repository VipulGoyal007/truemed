package com.intellihealth.truemeds.data.model.orderreminder

data class ReminderRequestModel(
    val customerId : Long,
    val patientId : Long,
    val reminderDate : String,
    val frequency : Int,
    val isSetByPharmacist : Boolean
)