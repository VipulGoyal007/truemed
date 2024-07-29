package com.intellihealth.truemeds.domain.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.search.SearchSuggestionResponse
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.data.utils.Resource
import retrofit2.Response

interface SearchRepository {
    suspend fun getCartCount(): Long

    suspend fun getRecentlySearch(): List<RecentMedicine>

    suspend fun getPreviouslySearchMeds(): List<RecentMedicine>

    suspend fun getReactiveSearch(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String?,
        warehouseId: String,
        elasticSearchType: String,
        searchString: String,
        isMultiSearch: Boolean,
        searchVariant: String
    ): Resource<Response<SearchSuggestionResponse>>


}