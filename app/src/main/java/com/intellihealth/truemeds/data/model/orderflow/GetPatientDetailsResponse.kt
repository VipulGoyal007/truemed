package com.intellihealth.truemeds.data.model.orderflow

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class GetPatientDetailsResponse(
    @SerializedName("message") var message: String? = null,
    @SerializedName("statusValue") var statusValue: String? = null,
    @SerializedName("statusCode") var statusCode: Int? = null,
    @SerializedName("timeTakenInMs") var timeTakenInMs: Int? = null,
    @SerializedName("responseData") var responseData: List<PatientDetail>? = listOf()
)
