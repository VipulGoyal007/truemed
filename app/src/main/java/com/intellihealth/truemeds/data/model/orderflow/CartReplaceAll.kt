package com.intellihealth.truemeds.data.model.orderflow

import androidx.annotation.Keep

@Keep
data class CartReplaceAll (
    var showYaySavings: Boolean,
    var showReplaceAll: Boolean,
    var totalReplaceSavings : Double,
    var substitutableMedCount : Int,
    var loading: Boolean,
    var variant: String,
    var totalSaved: Double
    )