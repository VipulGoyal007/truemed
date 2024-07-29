package com.intellihealth.truemeds.data.api

import com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel
import com.intellihealth.truemeds.data.model.productlistanddetails.*
import com.intellihealth.truemeds.data.model.search.SearchSuggestionResponse
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse
import com.intellihealth.truemeds.presentation.model.SearchResultResponse
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface ProductListAndDetailsApi {

    /*@GET(ApiEndpointConstants.FETCH_FROM_ELASTIC_SEARCH)
    suspend fun fetchElasticSearch(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Query("warehouseId") warehouseId: String,
        @Query("elasticSearchType") elasticSearchType: String,
        @Query("searchString") searchString: String?,
        @Query("isMultiSearch") isMultiSearch: Boolean,
        @Query("variantId") variantId: Long?,
        @Query("sizeCount") sizeCount: Int?
    ): Response<ElasticSearchResponse>*/

    @GET(ApiEndpointConstants.SEARCH_SUGGESTION_RESULTS)
    suspend fun fetchFromReactiveSearch(
        @Header("Content-Type") contentType: String,
        @Header("customerId") customerId: String?,
        @Query("warehouseId") warehouseId: String,
        @Query("elasticSearchType") elasticSearchType: String,
        @Query("searchString") searchString: String?,
        @Query("isMultiSearch") isMultiSearch: Boolean,
        @Query("searchVariant") searchVariant:String
    ): Response<SearchSuggestionResponse>

    @GET(ApiEndpointConstants.SEARCH_RESULTS)
    suspend fun getSearchResults(
        @Header("Content-Type") contentType: String,
        @Query("warehouseId") warehouseId: String,
        @Query("elasticSearchType") elasticSearchType: String,
        @Query("searchString") searchString: String?,
        @Query("sizeCount") sizeCount: Int,
        @Query("variantId") variantId: Long?,
        @Query("page") page: Int,
        @Query("searchVariant") searchVariant:String,
        @Query("isMultiSearch") isMultiSearch:Boolean
    ): Response<SearchResultResponse>

    /*@POST(ApiEndpointConstants.CALL_ELASTIC_SEARCH)
    suspend fun getElasticResultByProductCode(
        @Header("Authorization") authorization: String?,
        @Body jsonObject: JsonObject?,
        @Query("warehouseId") warehouseId: String?,
        @Query("variantId") variantId: Long?
    ): Response<CallElasticSearchResponse>*/

    @GET(ApiEndpointConstants.FETCH_MEDICINE_DETAILS)
    suspend fun fetchMedicineDetails(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("productCode") productCode: String?,
        @Query("warehouseId") warehouseId: String?,
    ): Response<MedicineDetailsResultResponse>

    @POST(ApiEndpointConstants.FETCH_REORDER_OTC_PRODUCT)
    suspend fun fetchReOrderOTCProduct(
        @Header("Content-Type") contentType: String,
        @Header("Authorization") authorization: String?,
        @Body productCodes: Set<String?>?,
        @Query("customerId") customerId: String?,
        @Query("patientId") patientId: String?,
        @Query("orderId") orderId: Long?
    ): Response<ReorderOtcProductResponse>

    @POST(ApiEndpointConstants.GET_CROSS_SELLING_RECOMMENDED_PRODUCTS)
    suspend fun getCrossSellingRecommendedProducts(
        @Header("Content-Type") contentType: String?,
        @Query("sessionToken") sessionToken: String?,
        @Query("warehouseId") warehouseId: String?,
        @Query("pageNumber") pageNumber: Int?,
        @Query("type") type: String?,
        @Body subType: Set<String>?,
        @Query("pageSize") pageSize: Int?,
        @Query("variantId") variantId: Long?,
        @Query("productCode") productCode: String?
    ): Response<CrossSellingRecommendedProductResponse>


    @POST(ApiEndpointConstants.SAVE_PRODUCT_SEARCH_DATA)
    suspend fun saveProductSearchData(
        @Header("Content-Type") contentType: String,
        @Query("sessionToken") sessionToken: String,
        @Query("warehouseId") wareHouseId: String,
        @Query("productCode") productCode: String
    ): Response<ResponseBody>

    @POST(ApiEndpointConstants.SAVE_CROSS_PRODUCT_ADDED_DATA)
    suspend fun saveCrossProductAddedData(
        @Header("Content-Type") contentType: String,
        @Query("crossProductCode") crossProductCode: String?,
        @Query("productCode") productCode: String?,
        @Query("warehouseId") wareHouseId: String?
    ): Response<ResponseBody>

    @GET(ApiEndpointConstants.FETCH_MEDICINE_DETAILS_OF_PATIENT)
    suspend fun fetchMedicineDetailsOfPatient(
        @Header("Content-Type") contentType: String?,
        @Header("Authorization") authorization: String?,
        @Query("customerId") customerId: String?,
        @Query("page") page: Int, @Query("result") result: Int,
        @Query("patientId") patientId: String?,
    ): Response<CustomerMedicinesResponseModel>

    @GET(ApiEndpointConstants.GET_TRENDING_SEARCH_PRODUCTS)
    suspend fun fetchTrendingSearches(
        @Header("Content-Type") contentType: String?,
        @Query("sessionToken") sessionToken: String?,
        @Query("warehouseId") customerId: String?,
        @Query("pageNumber") pageNumber: Int?,
        @Query("pageSize") pageSize: Int?
    ): Response<TrendingSearchResponse>

}