package com.intellihealth.truemeds.data.model.productlistanddetails


data class Hits(
    val hits: List<Hit?>?,
    val max_score: Double?,
    val total: Total?
)

