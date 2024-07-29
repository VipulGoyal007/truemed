package com.intellihealth.truemeds.data.model.reminder

data class FrequencyListModel(
    var frequencyList: ArrayList<FrequencyList> = arrayListOf()
) {
    class FrequencyList(
        var frequency: Int? = null,
        var frequencyText: String? = null,
        var nextReminderDate: String? = null,
        var showReminderDate: String? = null,
        var isSelected: Boolean = false
    )
}