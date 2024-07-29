package com.intellihealth.truemeds.data.utils

import android.util.Log
import androidx.fragment.app.FragmentManager
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.PopUpModel
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.dialog.PopUpDialog

object PopUpManager {
    fun showPopUp(
        fragmentManager: FragmentManager,
        popUpType: PopUpType,
        callback: PopUpDialogCallback,
        isCancelable: Boolean,
        header: String = "",
        message: String = ""
    ) {
        val dialog =
            PopUpDialog(model = prepareData(popUpType, header, message), callback = callback)
        dialog.isCancelable = isCancelable
        if (!dialog.isVisible)
            dialog.show(fragmentManager, popUpType.name)
    }

    private fun prepareData(
        popUpType: PopUpType,
        header: String,
        message: String
    ): PopUpModel {
        return when (popUpType) {
            PopUpType.API_FAILURE -> PopUpModel(
                icon = R.drawable.ic_no_internet,
                header = header.ifEmpty { "Internal server error!" },
                message = message,
                buttonText = "Try again",
            )

            PopUpType.INTERNET_FAILURE -> PopUpModel(
                icon = R.drawable.ic_no_internet,
                header = "No internet connection",
                message = "Please check your internet connection",
                buttonText = "Try again",
            )

            PopUpType.THANKING -> PopUpModel(
                icon = R.drawable.ic_thank_you,
                header = "Thanks for your feedback!",
            )

            PopUpType.APP_UPDATE -> PopUpModel(
                icon = R.drawable.ic_update_app,
                header = "App update required!",
                message = "We have added new features and a few bug fixes to make your experience seamless",
                buttonText = "Update app",
                showCloseButton = false,
            )

            PopUpType.PRIVACY_POLICY -> PopUpModel(
                icon = R.drawable.ic_terms_condition,
                header = "Privacy policy updated!",
                message = "Please read and agree to the updated Terms & conditions and Privacy policy  to continue using our services",
                buttonText = "Ok",
                showCloseButton = false,
            )

            PopUpType.TERMS_CONDITIONS -> PopUpModel(
                icon = R.drawable.ic_terms_condition,
                header = "Terms & conditions updated!",
                message = "Please read and agree to the updated Terms & conditions and Privacy policy  to continue using our services",
                buttonText = "Ok",
                showCloseButton = false,
            )

            PopUpType.SESSION_EXPIRED -> PopUpModel(
                icon = R.drawable.ic_expiring_soon,
                header = "Session expired",
                message = "Please log in again",
                buttonText = "Try again",
                showCloseButton = false
            )

            PopUpType.REFERRAL_FAILED -> PopUpModel(
                icon = R.drawable.ic_referal_fail,
                header = "Oops! referral failed",
                message = "something went wrong,\n Please try again later.",
                buttonText = "Try again"
            )

            PopUpType.COUPON_FAILED -> PopUpModel(
                icon = R.drawable.ic_coupon_fail,
                header = "Oops! coupon code failed",
                message = "something went wrong,\n Please try again later.",
                buttonText = "Try again"
            )

            PopUpType.PAYMENT_CANCELLED -> PopUpModel(
                icon = 0,
                header = "Payment cancelled",
                message = "Please try again to pay",
                buttonText = "Ok"
            )

            PopUpType.PAYMENT_ERROR -> PopUpModel(
                icon = R.drawable.ic_referal_fail,
                header = "Payment error",
                message = "Something went wrong during the process, please try again later or contact us",
                buttonText = "Ok"
            )

            PopUpType.PAYMENT_PENDING -> PopUpModel(
                icon = 0,
                header = "Payment pending",
                message = "Your payment status will be updated shortly",
                buttonText = "Ok"
            )

        }
    }
}

enum class PopUpType {
    API_FAILURE, INTERNET_FAILURE, APP_UPDATE, PRIVACY_POLICY, TERMS_CONDITIONS, THANKING, SESSION_EXPIRED, REFERRAL_FAILED, COUPON_FAILED, PAYMENT_CANCELLED, PAYMENT_ERROR,
    PAYMENT_PENDING
}