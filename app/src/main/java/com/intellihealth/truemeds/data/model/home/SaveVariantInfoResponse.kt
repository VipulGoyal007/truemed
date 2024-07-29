package com.intellihealth.truemeds.data.model.home

data class SaveVariantInfoResponse(
    var message: String,
    var responseData: ResponseData,
    var statusCode: Int,
    var statusValue: String,
    var timeTakenInMs: Any
) {
    data class ResponseData(
        var experimentMapping: List<ExperimentMapping>
    ) {
        data class ExperimentMapping(
            var experimentName: String?,
            var variant: String?,
            var variantId: Long?
        )
    }
}