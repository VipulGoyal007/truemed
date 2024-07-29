package com.intellihealth.truemeds.presentation.callbacks

interface DoctorFraudCallback {
    fun onPositiveActionClicked()
    fun onNegativeActionClicked()

    fun onClosedActionClicked()
}