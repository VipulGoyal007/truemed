package com.intellihealth.truemeds.data.model.productlistanddetails

data class ResponseData(
    val LIMITED_OFFER: List<LIMITEDOFFER>,
    val productCodeList: List<String>
)