package com.intellihealth.truemeds.domain.usecase.analytics

import android.os.Bundle
import com.intellihealth.truemeds.presentation.analytics.FacebookEvent
import com.intellihealth.truemeds.presentation.utils.logD
import java.math.BigDecimal
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale
import javax.inject.Inject


class FacebookEventUseCase @Inject constructor(private val facebookEvent: FacebookEvent) {
    fun sendEvent(eventName: String) {
        facebookEvent.logFacebookEvent(eventName)
        logD("facebookEvent",eventName)
    }

    fun sendPurchaseEvent(payableAmount: Double) {
        val payableAmountFb = payableAmountForFbEvent(payableAmount).toDouble()
        val bundleFb = Bundle()
        bundleFb.putString("fb_currency", "INR")
        bundleFb.putDouble("_valueToSum", payableAmountFb)
        facebookEvent.logPurchase(BigDecimal.valueOf(payableAmountFb), bundleFb)
    }

    private fun getNumberFormat(): DecimalFormat {
        val symbols = DecimalFormatSymbols(Locale.US)
        return DecimalFormat("#0.00", symbols)
    }

    private fun payableAmountForFbEvent(value: Double): Int {
        var op = value.toInt()
        val percentage: String = getNumberFormat().format(value)
        if (percentage.contains(".")) {
            val separated = percentage.split("\\.".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()
            val wholeNumber = separated[0]
            val decimalNumber = separated[1]
            var num = 0
            try {
                num = decimalNumber.toInt()
            } catch (ignore: Exception) {
                ignore.message
            }
            if (num > 49) {
                op = op + 1
            }
        }
        return op
    }

}