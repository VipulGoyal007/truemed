package com.intellihealth.truemeds.data.model.home

import java.util.Collections

data class HomePageOtcResponse (
    val categories: List<SuperCategoryModel>? = Collections.emptyList()
)