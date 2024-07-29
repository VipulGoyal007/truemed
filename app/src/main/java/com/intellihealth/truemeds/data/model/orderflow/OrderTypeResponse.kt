package com.intellihealth.truemeds.data.model.orderflow

class OrderTypeResponse : ArrayList<OrderTypeResponse.OrderType>() {
    data class OrderType(
        val displayName: String,
        val statusName: String,
        var isSelected: Boolean,
        val statusIds: String,

        )
}