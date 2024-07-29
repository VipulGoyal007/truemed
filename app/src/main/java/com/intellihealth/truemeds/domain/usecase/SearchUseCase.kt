package com.intellihealth.truemeds.domain.usecase

import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.search.SuggestionResponseData
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository
import com.intellihealth.truemeds.domain.repository.SearchRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel.Companion.timeTakenInMs
import org.json.JSONObject
import javax.inject.Inject

class SearchUseCase @Inject constructor(
    private val searchRepository: SearchRepository,
    private val localDbUseCase: LocalDbUseCase,
    private val sdkEventUseCase: SdkEventUseCase
) {

    suspend fun fetchElasticSearch(
        contentType: String,
        authorization: String?,
        warehouseId: String,
        elasticSearchType: String,
        searchString: String?,
        isMultiSearch: Boolean,
        variantId: Long?,
        sizeCount: Int?
    ): JSONObject {
        /*when (val res = searchRepository.fetchElasticSearch(
            contentType,
            authorization,
            warehouseId,
            elasticSearchType,
            searchString,
            isMultiSearch,
            variantId,
            sizeCount
        )) {
            is Resource.Success -> {}
            is Resource.Failure -> {}
            else -> {}
        }*/
        return JSONObject()
    }

    /*suspend fun fetchRecentlySearch(): List<SearchResult> {
        val suggestionList = searchRepository.getRecentlySearch()
        val list = mutableListOf<SearchResult>()
        for (med in suggestionList) {
            val result = SearchResult()
            result.isShowHistoryIcon = true
            result.name = med.medicineName
            result.productCode = med.productCode
            if (med.productCode == null || med.productCode == "" || med.productCode == "null") {
                result.iconType = 0
            } else {
                result.iconType = 1
            }
            result.keyName = med.keyName
            list.add(result)
        }
        return list
    }

    suspend fun fetchPreviouslyViewed(): List<SearchResult> {
        val list = mutableListOf<SearchResult>()
        val suggestionList = searchRepository.getPreviouslySearchMeds()
        for (med in suggestionList) {
            val result = SearchResult()
            result.isShowHistoryIcon = true
            result.name = med.medicineName
            result.productCode = med.productCode
            result.productImage = med.productImage
            result.drugType = med.drugType
            if (med.productCode == null || med.productCode == "" || med.productCode == "null") {
                result.iconType = 0
            } else {
                result.iconType = 1
            }
            result.keyName = med.keyName
            Log.e("Prev", med.medicineName)
            list.add(result)
        }
        return list
    }

    suspend fun getCartCount(): Long {
        return searchRepository.getCartCount()
    }*/


    suspend fun getReactiveResults(
        mxInternalErrorOccurred: MxInternalErrorOccurred, searchQuery: String): SuggestionResponseData {
        try {
            return when (val res =
                searchRepository.getReactiveSearch(mxInternalErrorOccurred,
                    null, "3", "SEARCH_SUGGESTION", searchQuery, true,
                    localDbUseCase.getCustomerCategory(UserCategoryEnum.SEARCH_EXPERIMENT_1.apiCategoryType)
                )) {
                is Resource.Success -> {
                    if (res.value?.isSuccessful==false) {
                        try {
                            mxInternalErrorOccurred.errorCode = res.value.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                res.value.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                    timeTakenInMs = res.value?.body()?.timeTakenInMs ?: 0
                    res.value?.body()?.responseData!!
                    /*if (res.value?.isSuccessful == true) {
                        val response = res.value?.body()
                        response?.responseData ?: listOf<SuggestionWithType>()
                    } else { val keyValuePairs = ArrayList<KeyValuePair>()
                        var jsonObject: JSONObject? = null
                        try {
                            jsonObject = JSONObject((res.value?.errorBody()?.string()))
                            val keys = jsonObject.keys()
                            var key = ""
                            var value = ""
                            while (keys.hasNext()) {
                                key = keys.next()
                                if (jsonObject != null) {
                                    value = jsonObject.optString(key)
                                }
                                if (key != "" && value != "") keyValuePairs.add(
                                    KeyValuePair(key, value)
                                )
                            }
                        } catch (e: JSONException) {
                            Log.i("e", e.message.toString())
                        }
                        return SendMobileOtpResponse(
                            isNewCustomer = false,
                            errorMsg = keyValuePairs[0].strVal ?: ""
                        )
                
                    }*/
                }

                is Resource.Failure -> SuggestionResponseData()
                else -> SuggestionResponseData()
            }

        } catch (ex: Exception) {
            return SuggestionResponseData()
        }
    }


}