package com.intellihealth.truemeds.data.model.productlistanddetails

import com.intellihealth.truemeds.presentation.model.ProductInfoModel


data class CrossSellingRecommendedProductResponse(
    val statusCode: Int = 0,
    val statusValue: String = "",
    val message: String = "",
    val timeTakenInMs: String? = "",
    val responseData: ResponseData? = null
) {

    data class ResponseData(
        val productCodeList: ArrayList<String?>?,
        var LIMITED_OFFER: ArrayList<ProductInfoModel>? = arrayListOf(),
        var NEW_ARRIVAL: ArrayList<ProductInfoModel>? = arrayListOf(),
        var LAST_MINUTE_BUY: ArrayList<ProductInfoModel>? = arrayListOf(),
        var TRENDING_IN_CITY: ArrayList<ProductInfoModel>? = arrayListOf(),
        var CUSTOMER_ALSO_BOUGHT: ArrayList<ProductInfoModel>? = arrayListOf()
    )
}