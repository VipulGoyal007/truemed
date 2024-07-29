package com.intellihealth.truemeds.data.model.productlistanddetails

data class FetchMedicineDetailsOfPatientResponse(
    val count: Int?,
    val patientDetails: List<PatientDetail?>?,
    val result: List<Result?>?
) {
    data class PatientDetail(
        val active: Boolean?,
        val age: String?,
        val createdById: Int?,
        val createdOn: Long?,
        val customerId: Int?,
        val dateOfConsultant: Long?,
        val genderId: Int?,
        val height: Any?,
        val highBp: String?,
        val lowBp: String?,
        val modifiedById: Int?,
        val modifiedOn: Long?,
        val notes: Any?,
        val patientId: Int?,
        val patientName: String?,
        val relationId: Int?,
        val temperature: Any?,
        val weight: Any?
    )

    data class Result(
        val hits: Hits?,
        val _shards: Shards?,
        val timed_out: Boolean?,
        val took: Int?
    )

}