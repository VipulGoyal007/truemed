package com.intellihealth.truemeds.presentation.bottomsheet

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.intellihealth.salt.views.bottomsheet.BottomSheet
import com.intellihealth.truemeds.R

open class BaseBottomSheet:BottomSheet() {
    fun disableLoadingView(dialog: Dialog) {
        dialog.dismiss()
    }

    fun enableLoadingView(dialog: Dialog) {
        if (dialog != null) {
            dialog.setContentView(R.layout.dialog_progressbar)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.window?.setDimAmount(0f)
            dialog.show()
        }
    }
}