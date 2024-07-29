package com.intellihealth.truemeds.presentation.analytics.model.mixpanel

import com.google.gson.annotations.SerializedName


data class MxSearchSuggestionImpression(
    @SerializedName("term_searched")
    var termSearched: String?=null,
    @SerializedName("suggestion_term_clicked")
    var suggestionTermClicked: String?=null,
    @SerializedName("clicked_suggestion_type")
    var clickedSuggestionType: String?=null,
    @SerializedName("exit_action")
    var exitAction: String?=null,
    @SerializedName("term_searched_char_count")
    var termSearchedCharCount: Int?=null,
    @SerializedName("clicked_suggestion_position")
    var clickedSuggestionPosition: Int?=null,
    @SerializedName("result_found_count")
    var resultFoundCount: Int?=null,
    @SerializedName("impression_type")
    var impressionType: String?=null,
    @SerializedName("_rt")
    var rt: String?=null,
    @SerializedName("_qc")
    var qc: String?=null,
    @SerializedName("is_recently_searched")
    var isRecentlySearched: Boolean?=false,
    @SerializedName("is_previously_viewed")
    var isPreviouslyViewed: Boolean?=false,
    @SerializedName("time_taken")
    var timeTaken: Long?=null
)