package com.intellihealth.truemeds.data.repository

import com.google.gson.JsonObject
import com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.productlistanddetails.CallElasticSearchResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.ElasticSearchResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.MedicineDetailsResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.ReorderOtcProductResponse
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.ProductListAndDetailsRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository
import com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse
import okhttp3.ResponseBody
import retrofit2.Response
import javax.inject.Inject

class ProductListAndDetailsRepositoryImpl @Inject constructor(
    private val productListAndDetailsRemoteDataSource: ProductListAndDetailsRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) :
    ProductListAndDetailsRepository {
    override suspend fun fetchElasticSearch(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String,
        elasticSearchType: String,
        searchString: String?,
        isMultiSearch: Boolean,
        variantId: Long?,
        sizeCount: Int?
    ): Resource<Response<ElasticSearchResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            productListAndDetailsRemoteDataSource.fetchElasticSearch(
                warehouseId,
                elasticSearchType,
                searchString,
                isMultiSearch,
                variantId,
                sizeCount
            )
        }
    }


    override suspend fun fetchMedicineDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        productCd: String,
        warehouseId: String
    ): Resource<Response<MedicineDetailsResultResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            productListAndDetailsRemoteDataSource.fetchMedicineDetails(
                productCd,
                warehouseId
            )
        }
    }

    override suspend fun fetchReOrderOTCProduct(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        productCodes: Set<String?>?,
        customerId: String?,
        patientId: String?,
        orderId: Long?
    ): Resource<Response<ReorderOtcProductResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            productListAndDetailsRemoteDataSource.fetchReOrderOTCProduct(
                productCodes,
                customerId,
                patientId,
                orderId
            )
        }
    }

    override suspend fun getCrossSellingRecommendedProducts(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String?,
        warehouseId: String?,
        pageNumber: Int?,
        pageSize: Int?,
        type: String?,
        productCode: String?,
        variantId: Long?,
        subType: Set<String>?
    ): Resource<Response<CrossSellingRecommendedProductResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            productListAndDetailsRemoteDataSource.getCrossSellingRecommendedProducts(
                warehouseId,
                sessionToken,
                pageNumber,
                type,
                subType,
                pageSize,
                variantId,
                productCode
            )
        }
    }

    override suspend fun saveProductSearchData(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String,
        wareHouseId: String,
        productCode: String
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            productListAndDetailsRemoteDataSource.saveProductSearchData(
                sessionToken,
                wareHouseId,
                productCode
            )
        }
    }

    override suspend fun saveCrossProductAddedData(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        crossProductCode: String?,
        productCode: String?,
        wareHouseId: String?
    ): Resource<Response<ResponseBody>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            productListAndDetailsRemoteDataSource.saveCrossProductAddedData(
                crossProductCode,
                productCode,
                wareHouseId
            )
        }
    }

    override suspend fun getTrendingSearches(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        pageSize: Int?
    ): Resource<Response<TrendingSearchResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            productListAndDetailsRemoteDataSource.getTrendingSearches(
                warehouseId,
                sessionToken,
                pageNumber,
                pageSize
            )
        }
    }

    override suspend fun fetchMedicineDetailsOfPatient(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String?,
        page: Int,
        result: Int,
        patientId: String?
    ): Resource<Response<CustomerMedicinesResponseModel>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            productListAndDetailsRemoteDataSource.fetchMedicineDetailsOfPatient(
                customerId,
                page, result, patientId
            )
        }
    }


}