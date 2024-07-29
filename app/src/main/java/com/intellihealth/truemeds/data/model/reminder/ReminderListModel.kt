package com.intellihealth.truemeds.data.model.reminder

import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.truemeds.presentation.utils.DateUtils
import java.text.SimpleDateFormat
import java.util.Locale


data class ReminderListModel(
    var reminderList: ArrayList<ReminderList> = arrayListOf()
) {
    data class ReminderList(
        var id: Long = 0,
        var frequency: Int? = null,
        var reminderDate: String? = null,
        var patientName: String? = null,
        var patientId: Int? = null,
        var reminderOn: Long = 0
    ) {
        fun toSdkObject(): AddressPatientDetailsCardModel {
                        return AddressPatientDetailsCardModel(
                cardType = AddressPatientDetailsConstants.PATIENT_REMINDER_CARD,
                title = patientName,
                description = "Your next reminder is due on ${DateUtils.changeDateFormat(reminderDate)}",
                isProfileIcon = true
            )

        }

    }


}



