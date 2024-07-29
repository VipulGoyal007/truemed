package com.intellihealth.truemeds.presentation.callbacks

import com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel

interface PaymentPendingCallback {
    fun onPositiveActionClicked(model: BottomSheetDefaultModel?)
    fun onClosedActionClicked()
    fun onChangedActionClicked(model: BottomSheetDefaultModel?)
}