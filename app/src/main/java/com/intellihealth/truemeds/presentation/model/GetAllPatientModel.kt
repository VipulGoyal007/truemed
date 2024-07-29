package com.intellihealth.truemeds.presentation.model


import com.google.gson.annotations.SerializedName

data class GetAllPatientModel(
    @SerializedName("message")
    val message: String,
    @SerializedName("responseData")
    val responseData: List<ResponseData>,
    @SerializedName("statusCode")
    val statusCode: Int,
    @SerializedName("statusValue")
    val statusValue: String,
    @SerializedName("timeTakenInMs")
    val timeTakenInMs: Int
) {
    data class ResponseData(
        @SerializedName("age")
        val age: Any,
        @SerializedName("emailId")
        val emailId: Any,
        @SerializedName("firstName")
        val firstName: Any,
        @SerializedName("gender")
        val gender: Any,
        @SerializedName("genderId")
        val genderId: Any,
        @SerializedName("lastName")
        val lastName: Any,
        @SerializedName("patientId")
        val patientId: Int,
        @SerializedName("patientName")
        val patientName: String,
        @SerializedName("relationId")
        val relationId: Any,
        @SerializedName("relationName")
        val relationName: Any,
        @SerializedName("rxCount")
        val rxCount: Int
    )
}