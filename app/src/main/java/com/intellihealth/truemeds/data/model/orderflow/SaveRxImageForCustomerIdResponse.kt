package com.intellihealth.truemeds.data.model.orderflow


import com.google.gson.annotations.SerializedName

data class SaveRxImageForCustomerIdResponse(
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
        @SerializedName("imageId")
        val imageId: Int,
        @SerializedName("imageUrl")
        val imageUrl: String,
        @SerializedName("orderId")
        val orderId: Int,
        @SerializedName("orderMedicineCount")
        val orderMedicineCount: Int,
        @SerializedName("patientId")
        val patientId: Int
    )
}