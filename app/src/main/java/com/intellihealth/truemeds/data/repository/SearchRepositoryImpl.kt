package com.intellihealth.truemeds.data.repository

import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.search.SearchSuggestionResponse
import com.intellihealth.truemeds.data.repository.datasource.local.TruemedsDao
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.data.repository.datasource.remote.ElasticMedicineRemoteDataSource
import com.intellihealth.truemeds.data.utils.ApiCallInitClass
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.repository.SearchRepository
import retrofit2.Response
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val appDao: TruemedsDao,
    private val elasticMedicineRemoteDataSource: ElasticMedicineRemoteDataSource,
    private val apiCallInitClass: ApiCallInitClass
) : SearchRepository {
    override suspend fun getCartCount(): Long {
        return 0
    }

    override suspend fun getRecentlySearch(): List<RecentMedicine> {
        return emptyList()
    }

    override suspend fun getPreviouslySearchMeds(): List<RecentMedicine> {
        return emptyList()
    }

    override suspend fun getReactiveSearch(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String?,
        warehouseId: String,
        elasticSearchType: String,
        searchString: String,
        isMultiSearch: Boolean,
        searchVariant: String
    ): Resource<Response<SearchSuggestionResponse>> {
        return apiCallInitClass.safeApiCall(mxInternalErrorOccurred) {
            elasticMedicineRemoteDataSource.fetchReactiveSuggestions(
                customerId,
                warehouseId,
                elasticSearchType,
                searchString,
                isMultiSearch,
                searchVariant
            )
        }
    }
}