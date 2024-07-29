package com.intellihealth.truemeds.presentation.utils

import android.annotation.SuppressLint
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

object DateUtils {

    fun convertEpochTimeStampToDateMillis(epocTimeStamp1: Long, epocTimeStamp2: Long): Long {
        val countDownTimerTimeStamp = epocTimeStamp1 - epocTimeStamp2
        val date = Date(countDownTimerTimeStamp)
        @SuppressLint("SimpleDateFormat") val sdf = SimpleDateFormat("EEEE,MMMM d,yyyy h:mm:ss,a")
        val date1: String = sdf.format(date)
        return try {
            val date2 = sdf.parse(date1)
            date2?.time ?: 0
        } catch (_: Exception) {
            0
        }
    }

    fun convertMillisToSeconds(timeInMillis: Long): Long {
        return if (timeInMillis > 0) {
            timeInMillis / 1000
        } else 0
    }

    fun strDateTimeToDate(strDateTime: String?): Date? {
        return try {
            SimpleDateFormat("yyyy-MM-dd").parse(strDateTime)
        } catch (ex: Exception) {
            null
        }
    }

    fun getEndOfDay(date: Date): Long {
        val calendar = Calendar.getInstance()
        calendar.time = date
        calendar[Calendar.HOUR_OF_DAY] = 23
        calendar[Calendar.MINUTE] = 59
        calendar[Calendar.SECOND] = 59
        calendar[Calendar.MILLISECOND] = 999
        return calendar.timeInMillis
    }

    fun ddMMyyyyToddMMMMyyyy(reminderDate: String): String {
        return try {
            val inputDateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
            val outputDateFormat = SimpleDateFormat("dd MMMM yyyy", Locale.getDefault())

            val inputDate = inputDateFormat.parse(reminderDate)

            outputDateFormat.format(inputDate!!)
        } catch (_: Exception) {
            ""
        }
    }

    fun changeDateFormat(reminderDate: String?): String {
        return try {
            val inputDateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
            val outputDateFormat = SimpleDateFormat("dd MMMM yyyy", Locale.getDefault())

            val inputDate = inputDateFormat.parse(reminderDate.toString())

            outputDateFormat.format(inputDate!!)
        } catch (_: Exception) {
            ""
        }

    }
}