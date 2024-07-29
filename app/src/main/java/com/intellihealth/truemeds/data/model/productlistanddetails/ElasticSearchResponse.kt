package com.intellihealth.truemeds.data.model.productlistanddetails

data class ElasticSearchResponse(
    val responses: List<Response?>?,
    val took: Int?
) {
    data class Response(
        val hits: Hits?,
        val _shards: Shards?,
        val status: Int?,
        val suggest: Suggest?,
        val timed_out: Boolean?,
        val took: Int?
    ) {
        data class Suggest(
            val skuNameSuggester: List<SkuNameSuggester?>?
        ) {
            data class SkuNameSuggester(
                val length: Int?,
                val offset: Int?,
                val options: List<Option?>?,
                val text: String?
            ) {
                data class Option(
                    val freq: Int?,
                    val score: Double?,
                    val text: String?
                )
            }
        }
    }

}
