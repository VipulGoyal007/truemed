package com.intellihealth.truemeds.data.callback

import java.util.Date

interface TimeIntervalCallback {
    fun selectedCustomTimeIntervalCallback(selectedFromDate: Date, selectedToDate: Date)
    fun selectedTimeIntervalCallback(selectedTimeInterval: String?)

    fun onEditCustomDatesClicked()
}