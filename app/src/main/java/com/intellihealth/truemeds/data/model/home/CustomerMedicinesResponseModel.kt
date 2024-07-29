package com.intellihealth.truemeds.data.model.home

import com.intellihealth.truemeds.presentation.model.ProductInfoModel

data class CustomerMedicinesResponseModel(
    val message: String,
    val responseData: ResponseData,
    val statusCode: Int,
    val statusValue: String,
    val timeTakenInMs: Any?
) {
    data class ResponseData(
        val pageCount: Int,
        var patientDetails: List<PatientDetail>?,
       // val productList: List<List<Product>>,
        var productList: List<ProductInfoModel>?,
        val recordCount: Int
    ) {
        data class PatientDetail(
            val patientId: Int,
            val patientName: String
        )

    }
}