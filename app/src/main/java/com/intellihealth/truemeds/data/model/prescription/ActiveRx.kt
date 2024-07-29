package com.intellihealth.truemeds.data.model.prescription

data class ActiveRx(
    var uniqueId: Long = 0,
    var imageId: Long = 0,
    var imageUrl: String = "",
    var selected: Boolean = false
)