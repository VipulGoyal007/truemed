package com.intellihealth.truemeds.domain.repository

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.productlistanddetails.CallElasticSearchResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.ElasticSearchResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.MedicineDetailsResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.ReorderOtcProductResponse
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse
import okhttp3.ResponseBody
import retrofit2.Response

interface ProductListAndDetailsRepository {

    /**
     * This service provides list of products available for particular mother brand or disease
     *
     * **/
    suspend fun fetchElasticSearch(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String,
        elasticSearchType: String,
        searchString: String?,
        isMultiSearch: Boolean,
        variantId: Long?,
        sizeCount: Int?
    ): Resource<Response<ElasticSearchResponse>>

    /**
     * This service provides medicine details from product code
     * **/
    /*suspend fun getElasticResultByProductCode(jsonObject: JsonObject?,
                                              warehouseId: String?, variantId: Long?
    ): Resource<Response<CallElasticSearchResponse>>*/

    /**
     * This service provides medicine details like manufactures and medicine info
     * **/
    suspend fun fetchMedicineDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        productCd: String,
        warehouseId: String,
    ): Resource<Response<MedicineDetailsResultResponse>>

    /**
     * This service provides OTC product list to display on infinite scroll card on Order Summary page
     * **/
    suspend fun fetchReOrderOTCProduct(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        productCodes: Set<String?>?,
        customerId: String?,
        patientId: String?,
        orderId: Long?
    ): Resource<Response<ReorderOtcProductResponse>>

    /**
     * This service provides cross selling products list
     * **/
    suspend fun getCrossSellingRecommendedProducts(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String?,
        warehouseId: String?,
        pageNumber: Int?,
        pageSize: Int?,
        type: String?,
        productCd: String?,
        variantId: Long?,
        subType: Set<String>?
    ): Resource<Response<CrossSellingRecommendedProductResponse>>

    /**
     * This service is used to store product code of the medicine when we add it in cart
     * **/
    suspend fun saveProductSearchData(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String,
        wareHouseId: String,
        productCode: String
    ): Resource<Response<ResponseBody>>

    /**
     * This service is used to store product code of Cross selling medicine when we add it in cart
     * **/
    suspend fun saveCrossProductAddedData(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        crossProductCode: String?,
        productCode: String?,
        wareHouseId: String?
    ): Resource<Response<ResponseBody>>

    suspend fun getTrendingSearches(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        pageSize: Int?
    ): Resource<Response<TrendingSearchResponse>>

    suspend fun fetchMedicineDetailsOfPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String?,
        page: Int,
        result: Int,
        patientId: String?,
    ): Resource<Response<CustomerMedicinesResponseModel>>
}