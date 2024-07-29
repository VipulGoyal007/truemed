package com.intellihealth.truemeds.data.repository.datasource.remote

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel
import com.intellihealth.truemeds.data.model.productlistanddetails.CallElasticSearchResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.ElasticSearchResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.FetchMedicineDetailsOfPatientResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.MedicineDetailsResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.ReorderOtcProductResponse
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse
import okhttp3.ResponseBody
import retrofit2.Response

interface ProductListAndDetailsRemoteDataSource {

    suspend fun fetchElasticSearch(
        warehouseId: String, elasticSearchType: String,
        searchString: String?,
        isMultiSearch: Boolean,
        variantId: Long?,
        sizeCount: Int?
    ): Response<ElasticSearchResponse>

    /*suspend fun getElasticResultByProductCode(jsonObject: JsonObject?,
        warehouseId: String?, variantId: Long?
    ): Response<CallElasticSearchResponse>*/

    suspend fun fetchMedicineDetails(
        productCd: String,
        warehouseId: String,
    ): Response<MedicineDetailsResultResponse>

    suspend fun fetchReOrderOTCProduct(
        productCodes: Set<String?>?,
        customerId: String?,
        patientId: String?,
        orderId: Long?
    ): Response<ReorderOtcProductResponse>

    suspend fun getCrossSellingRecommendedProducts(
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        type: String?,
        subType: Set<String>?,
        pageSize: Int?,
        variantId: Long?,
        productCode:String?
    ): Response<CrossSellingRecommendedProductResponse>

    suspend fun saveProductSearchData(
        sessionToken: String,
        wareHouseId: String,
        productCode: String
    ): Response<ResponseBody>

    suspend fun saveCrossProductAddedData(
        crossProductCode: String?,
        productCode: String?,
        wareHouseId: String?
    ): Response<ResponseBody>

    suspend fun fetchMedicineDetailsOfPatient(
        customerId: String?,
        page: Int,
        result: Int,
        patientId: String?,
    ): Response<CustomerMedicinesResponseModel>

    suspend fun getTrendingSearches(
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        pageSize: Int?
    ): Response<TrendingSearchResponse>
}