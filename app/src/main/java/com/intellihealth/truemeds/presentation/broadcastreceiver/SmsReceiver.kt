package com.intellihealth.truemeds.presentation.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.text.TextUtils
import com.google.android.gms.common.api.CommonStatusCodes
import com.google.android.gms.common.api.Status
import com.intellihealth.truemeds.presentation.callbacks.SmsListener
import java.util.regex.Pattern

class SmsReceiver : BroadcastReceiver() {
    companion object {
        private var mListener: SmsListener? = null
        private const val SMS_RETRIEVED_ACTION =
            "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
        private const val SMS_RETRIEVE_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS"
        private const val SMS_RETRIEVED_MESSAGE =
            "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"

        fun setListener(listener: SmsListener) {
            mListener = listener
        }
    }

    override fun onReceive(context: Context?, intent: Intent) {
        if (intent.action == SMS_RETRIEVED_ACTION) {
            val extras = intent.extras
            val status = extras?.get(SMS_RETRIEVE_STATUS) as? Status
            when (status?.statusCode) {
                CommonStatusCodes.SUCCESS -> {
                    val message = extras.get(SMS_RETRIEVED_MESSAGE) as? String
                    val pattern = Pattern.compile("(?<![-.])\\b[0-9]+\\b(?!\\.[0-9])")
                    if (!TextUtils.isEmpty(message)) {
                        val matcher = pattern.matcher(message)
                        var otp: String? = ""
                        if (matcher.find()) {
                            otp = matcher.group(0)
                            mListener?.messageReceived(otp)
                        }
                    }
                }

                CommonStatusCodes.TIMEOUT -> {
                    mListener?.onSmsTimeOut()
                }
            }
        }
    }
}