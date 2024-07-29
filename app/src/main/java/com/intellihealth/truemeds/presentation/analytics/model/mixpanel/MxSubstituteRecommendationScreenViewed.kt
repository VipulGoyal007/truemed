package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxSubstituteRecommendationScreenViewed(
    @SerializedName("replace_all_total_possible_savings")
    var replaceAllTotalPossibleSavings: Double? = null,
    @SerializedName("replaceable_items_count")
    var replaceableItemsCount: Int? = null,
    @SerializedName("substitutable_items_list")
    var substitutableItemsList: List<String?>? = null,
    @SerializedName("substitute_items_list")
    var substituteItemsList: List<String?>? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)