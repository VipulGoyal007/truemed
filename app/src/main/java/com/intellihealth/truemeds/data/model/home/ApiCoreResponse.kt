package com.intellihealth.truemeds.data.model.home

data class ApiCoreResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var isSuccess: Boolean = true

)
