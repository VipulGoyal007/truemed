package com.intellihealth.truemeds.presentation.model


import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.deliverydetails.Patient

data class GetAllPrescriptionDataModel(
    @SerializedName("message")
    val message: String,
    @SerializedName("responseData")
    val responseData: ResponseData,
    @SerializedName("statusCode")
    val statusCode: Int,
    @SerializedName("statusValue")
    val statusValue: String,
    @SerializedName("timeTakenInMs")
    val timeTakenInMs: Int
) {
    data class ResponseData(
        @SerializedName("customerRx")
        val customerRx: List<CustomerRx>,

        @SerializedName("patientList")
        val patientList: List<Patient>
    ) {
        data class CustomerRx(
            @SerializedName("dateGroup")
            val dateGroup: String,
            @SerializedName("prescriptionList")
            val prescriptionList: List<Prescription>
        ) {
            data class Prescription(
                @SerializedName("fileName")
                val fileName: String,
                @SerializedName("imageId")
                val imageId: Int,
                @SerializedName("imagePath")
                val imagePath: String,
                @SerializedName("uniqueId")
                val uniqueId: Long,
            )
        }

      /*  data class Patient(
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
        )*/
    }
}