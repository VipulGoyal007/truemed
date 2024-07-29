package com.intellihealth.truemeds.data.model.productlistanddetails

data class ReorderOtcProductResponse(
    val productCodeList: List<String?>?,
    val reOrderCrossSellingProduct: ReOrderCrossSellingProduct?
) {
    data class ReOrderCrossSellingProduct(
        val hits: Hits?,
        val _shards: Shards?,
        val timed_out: Boolean?,
        val took: Int?
    )

}