package com.intellihealth.truemeds.data.model.orderflow

data class UploadImageResponse(
    val ImageId: Long?,
    val ImageUrl: String?,
    val OrderId: Long = 0,
    val orderMedicineCount: Int?,
    val PatientId: Long?
)