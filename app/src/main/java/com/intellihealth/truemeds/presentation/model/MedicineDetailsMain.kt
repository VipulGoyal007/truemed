package com.intellihealth.truemeds.presentation.model

import com.example.example.ProductInfoList
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.home.WrittenReviewBy

data class MedicineDetailsMain(
    @SerializedName("writtenReviewBy") var writtenReviewBy: ArrayList<WrittenReviewBy> = arrayListOf(),
    @SerializedName("productInfo") var productInfo: ArrayList<ProductInfoList> = arrayListOf()
)
