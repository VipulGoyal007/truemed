package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxSubstituteQuantityScreenViewed(
    @SerializedName("is_replace_all")
    var isReplaceAll: Boolean = false,
    @SerializedName("replace_all_total_possible_savings")
    var replaceAllTotalPossibleSavings: Int? = null,
    @SerializedName("replace_savings")
    var replaceSavings: Double? = null,
    @SerializedName("replaceable_items_count")
    var replaceableItemsCount: Int? = null,
    @SerializedName("replaced_items_count")
    var replacedItemsCount: Int? = null,
    @SerializedName("selected_substitutable_items_list")
    var selectedSubstitutableItemsList: List<String?>? = null,
    @SerializedName("selected_substitute_items_list")
    var selectedSubstituteItemsList: List<String?>? = null,
    @SerializedName("wh_id")
    var whId: String? = null
)