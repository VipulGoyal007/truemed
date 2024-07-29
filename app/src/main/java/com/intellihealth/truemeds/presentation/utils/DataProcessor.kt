package com.intellihealth.truemeds.presentation.utils

import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun roundOffDecimal(number: Double): Double {
    try {
        val symbols = DecimalFormatSymbols(Locale.US)
        val df = DecimalFormat("#.##", symbols)
        df.roundingMode = RoundingMode.CEILING
        return df.format(number).toDouble()
    } catch (e: Exception) {
        return 0.0
    }
}

fun roundOffDecimal(number: String): String {
    val afterDot = number.substringAfter(".")
    return if (afterDot.length > 2) number.substringBefore(".")  + "." +  afterDot.substringAfter(".").subSequence(0,2)
    else number.substringBefore(".") + "." + afterDot.substringAfter(".")
}