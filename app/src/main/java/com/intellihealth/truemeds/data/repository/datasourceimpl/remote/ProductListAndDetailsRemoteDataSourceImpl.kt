package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.intellihealth.truemeds.data.api.ProductListAndDetailsApi
import com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.ElasticSearchResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.ReorderOtcProductResponse
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.ProductListAndDetailsRemoteDataSource
import com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class ProductListAndDetailsRemoteDataSourceImpl @Inject constructor(
    private val productListAndDetailsApi: ProductListAndDetailsApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : ProductListAndDetailsRemoteDataSource {

    //private val authorization: String = SharedPrefManager.getInstance().loggedInUserAccessToken

    override suspend fun fetchElasticSearch(
        warehouseId: String,
        elasticSearchType: String,
        searchString: String?,
        isMultiSearch: Boolean,
        variantId: Long?,
        sizeCount: Int?
    ): Response<ElasticSearchResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun fetchMedicineDetails(
        productCd: String,
        warehouseId: String
    ): Response<MedicineDetailsResultResponse> {
        return productListAndDetailsApi.fetchMedicineDetails(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            productCd,
            warehouseId
        )
    }
    /*override suspend fun fetchElasticSearch(
        warehouseId: String,
        elasticSearchType: String,
        searchString: String?,
        isMultiSearch: Boolean,
        variantId: Long?,
        sizeCount: Int?
    ): Response<ElasticSearchResponse> {
        return productListAndDetailsApi.fetchElasticSearch(
            contentType,
            authorization,
            warehouseId,
            elasticSearchType,
            searchString,
            isMultiSearch,
            variantId,
            sizeCount
        )
    }*/

    /*override suspend fun getElasticResultByProductCode(
        jsonObject: JsonObject?,
        warehouseId: String?,
        variantId: Long?
    ): Response<CallElasticSearchResponse> {
        return productListAndDetailsApi.getElasticResultByProductCode(authorization, jsonObject, warehouseId, variantId)
    }*/

    override suspend fun fetchReOrderOTCProduct(
        productCodes: Set<String?>?,
        customerId: String?,
        patientId: String?,
        orderId: Long?
    ): Response<ReorderOtcProductResponse> {
        return productListAndDetailsApi.fetchReOrderOTCProduct(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            productCodes,
            customerId,
            patientId,
            orderId
        )
    }

    override suspend fun getCrossSellingRecommendedProducts(
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        type: String?,
        subType: Set<String>?,
        pageSize: Int?,
        variantId: Long?,
        productCode: String?,
    ): Response<CrossSellingRecommendedProductResponse> {
        return productListAndDetailsApi.getCrossSellingRecommendedProducts(
            contentType,
            sessionToken,
            warehouseId,
            pageNumber,
            type,
            subType,
            pageSize,
            if (variantId == null || variantId < 0) null else variantId,
            productCode
        )
    }

    override suspend fun saveProductSearchData(
        sessionToken: String,
        wareHouseId: String,
        productCode: String
    ): Response<ResponseBody> {
        return productListAndDetailsApi.saveProductSearchData(
            contentType,
            sessionToken,
            wareHouseId,
            productCode
        )
    }

    override suspend fun saveCrossProductAddedData(
        crossProductCode: String?,
        productCode: String?,
        wareHouseId: String?
    ): Response<ResponseBody> {
        return productListAndDetailsApi.saveCrossProductAddedData(
            contentType,
            crossProductCode,
            productCode,
            wareHouseId
        )
    }

    override suspend fun fetchMedicineDetailsOfPatient(
        customerId: String?,
        page: Int,
        result: Int,
        patientId: String?
    ): Response<CustomerMedicinesResponseModel> {
        return productListAndDetailsApi.fetchMedicineDetailsOfPatient(
            contentType,
            SharedPrefManager.getInstance().loggedInUserAccessToken,
            customerId,
            page,
            result,
            patientId
        )
    }

    override suspend fun getTrendingSearches(
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        pageSize: Int?
    ): Response<TrendingSearchResponse> {
        return productListAndDetailsApi.fetchTrendingSearches(
            contentType,
            sessionToken,
            warehouseId,
            pageNumber,
            pageSize
        )
    }


}