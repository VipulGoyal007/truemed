package com.intellihealth.truemeds.data.model.home

data class SaveVariantInfoRequest(
    var sessionToken: String,
    var experimentMapping: List<ExperimentMapping>,
) {
    data class ExperimentMapping(
        var experimentName: String,
        var variant: String? = null
    )
}