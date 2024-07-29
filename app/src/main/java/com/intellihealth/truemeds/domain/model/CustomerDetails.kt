package com.intellihealth.truemeds.domain.model

data class CustomerDetails(
    var emailAddress: String? = "",
    var gender: Int? = 0,
    var firstName: String? = "",
    var lastName: String? = "",
    var mobileNo: String? = "",
    var age: String? = "",
)
