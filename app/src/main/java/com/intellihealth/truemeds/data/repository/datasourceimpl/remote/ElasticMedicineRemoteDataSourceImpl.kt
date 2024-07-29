package com.intellihealth.truemeds.data.repository.datasourceimpl.remote

import com.intellihealth.truemeds.data.api.ProductListAndDetailsApi
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.search.SearchSuggestionResponse
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource
import com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse
import com.intellihealth.truemeds.presentation.model.SearchResultResponse
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.NamedConstants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Named

class ElasticMedicineRemoteDataSourceImpl @Inject constructor(
    private val productListAndDetailsApi: ProductListAndDetailsApi,
    @Named(NamedConstants.CONTENT_TYPE) private val contentType: String
) : ElasticMedicineRemoteDataSource {

    //private val authorization: String = SharedPrefManager.getInstance().loggedInUserAccessToken

    /*override suspend fun elasticSearch(
        applicationJson: String,
        loggedInUserAccessToken: String?,
        warehouseId: String,
        elasticSearchType: String,
        search: String?,
        isMultiSearch: Boolean,
        variantId: Long?,
        sizeCount: Int?
    ): Response<ResponseBody> {
        *//*return AppController.getInstance().dashboardApi.fetchElasticSearch(applicationJson,
            loggedInUserAccessToken,
            warehouseId,
            elasticSearchType,
            search,
            isMultiSearch,
            variantId,
            sizeCount
        )*//*
    }*/

    override suspend fun fetchReactiveSuggestions(
        customerId: String?,
        warehouseId: String,
        elasticSearchType: String,
        searchString: String,
        isMultiSearch: Boolean,
        searchVariant: String
    ): Response<SearchSuggestionResponse> {
        return productListAndDetailsApi.fetchFromReactiveSearch(
            contentType,
            customerId,
            warehouseId,
            elasticSearchType,
            searchString,
            isMultiSearch,
            searchVariant
        )
    }

    override suspend fun fetchSearchResults(
        warehouseId: String,
        elasticSearchType: String,
        searchString: String,
        sizeCount: Int,
        page: Int,
        variantId: Long?,
        searchVariant: String,
        isMultiSearch: Boolean
    ): Response<SearchResultResponse> {
        return productListAndDetailsApi.getSearchResults(
            contentType,
            warehouseId,
            elasticSearchType,
            searchString,
            sizeCount,
            if (variantId == null || variantId < 0) null else variantId,
            page,
            searchVariant,
            isMultiSearch
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

    override suspend fun getCrossSellingRecommendedProducts(
        sessionToken: String?,
        warehouseId: String?,
        pageNumber: Int?,
        pageSize: Int?,
        type: String?,
        productCd: String?,
        variantId: Long?,
        subType: Set<String>,
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
            productCd
        )
    }

}