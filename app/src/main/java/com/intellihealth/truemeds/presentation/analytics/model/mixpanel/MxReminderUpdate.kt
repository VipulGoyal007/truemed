package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName
import java.util.Date


data class MxReminderUpdate(
    @SerializedName("previous_reminder_date")
    var previousReminderDate: String? = null,
    @SerializedName("previous_reminder_frequency")
    var previousReminderFrequency: Double? = null,
    @SerializedName("reminder_date")
    var reminderDate: String? = null,
    @SerializedName("reminder_frequency")
    var reminderFrequency: Double? = null,
    @SerializedName("variant_name")
    var variantName: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("cash_handling_charge")
    var cashHandlingCharge: Double? = null,
    @SerializedName("cash_handling_charge_applicable")
    var cashHandlingChargeApplicable: Double? = null

)