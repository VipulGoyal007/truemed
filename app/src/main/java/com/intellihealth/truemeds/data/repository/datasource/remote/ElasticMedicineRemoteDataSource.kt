package com.intellihealth.truemeds.data.repository.datasource.remote

import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.MedicineDetailsResponse
import com.intellihealth.truemeds.data.model.search.SearchSuggestionResponse
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.presentation.model.MedicineDetailsResultResponse
import com.intellihealth.truemeds.presentation.model.SearchResultResponse
import retrofit2.Response

interface ElasticMedicineRemoteDataSource {
    /*suspend fun elasticSearch(applicationJson: String,
                        loggedInUserAccessToken: String?,
                        warehouseId: String,
                        elasticSearchType: String,
                        search: String?,
                        isMultiSearch: Boolean, variantId: Long?, sizeCount: Int?): Response<ResponseBody>*/
    
    suspend fun fetchReactiveSuggestions(
        customerId: String?,
        warehouseId: String,
        elasticSearchType: String,
        searchString: String,
        isMultiSearch: Boolean,
        searchVariant: String
    ): Response<SearchSuggestionResponse>
    
    suspend fun fetchSearchResults(
        warehouseId: String,
        elasticSearchType: String,
        searchString: String,
        sizeCount: Int,
        page: Int,
        variantId: Long?,
        searchVariant: String,
        isMultiSearch: Boolean
    ): Response<SearchResultResponse>

    suspend fun fetchMedicineDetails(
        productCd: String,
        warehouseId: String
    ): Response<MedicineDetailsResultResponse>

    suspend fun getCrossSellingRecommendedProducts(
        sessionToken: String?,
        warehouseId: String?,
        pageNumber: Int?,
        pageSize: Int?,
        type: String?,
        productCode: String?,
        variantId: Long?,
        subType: Set<String>
    ): Response<CrossSellingRecommendedProductResponse>

    suspend fun getTrendingSearches(
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        pageSize: Int?
    ): Response<TrendingSearchResponse>



}