package com.intellihealth.truemeds.data.callback

import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient

interface PatientClickCallback {
    fun editClick(patient: Patient)
}