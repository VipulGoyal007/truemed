package com.intellihealth.truemeds.data.model.search

data class TrendingSearchResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ArrayList<TrendingSearch>? = null
) {
//    data class ResponseData(var trendingSearch: ArrayList<TrendingSearch>)
    data class TrendingSearch(var name: String, var productCode: String)
}