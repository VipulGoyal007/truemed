package com.intellihealth.truemeds.mvvm.data.appsflyer

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class AFPatientAdded(
    @SerializedName("patient_type")val patientType : String?=""
)