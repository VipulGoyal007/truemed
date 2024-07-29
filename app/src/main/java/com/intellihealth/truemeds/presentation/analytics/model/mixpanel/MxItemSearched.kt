package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.model.clevertap.CtItemSearched
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFItemSearched
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent


data class MxItemSearched(
    @SerializedName("clicked_suggestion_type")
    var clickedSuggestionType: String? = null,
    @SerializedName("clicked_suggestions_position")
    var clickedSuggestionsPosition: Int? = null,
    @SerializedName("did_you_mean_triggered")
    var didYouMeanTriggered: Boolean = false,
    @SerializedName("exit_action")
    var exitAction: String? = null,
    @SerializedName("is_previously_viewed")
    var isPreviouslyViewed: Boolean = false,
    @SerializedName("_qc")
    var qc: String? = null,
    @SerializedName("result_found_count")
    var resultFoundCount: Int? = null,
    @SerializedName("_rt")
    var rt: String? = null,
    @SerializedName("suggestion_term_clicked")
    var suggestionTermClicked: String? = null,
    @SerializedName("term_searched")
    var termSearched: String? = null,
    @SerializedName("term_searched_char_count")
    var termSearchedCharCount: Int? = null,
    @SerializedName("time_taken")
    var timeTaken: Int? = null,
    @SerializedName("wh_id")
    var whId: String? = null,
    @SerializedName("past_search_term_clicked")
    var pastSearchTermClicked: String? = null,
    @SerializedName("clicked_past_search_type")
    var clickedPastSearchType: String? = null,
    @SerializedName("\$mp_api_timestamp_ms")
    var timestamp: Long? = null
){
    fun toCleverTap() : CtItemSearched {
        val termSearched = if (exitAction == "cross") {
            termSearched
        } else {
            if (pastSearchTermClicked.isNullOrEmpty()) termSearched else pastSearchTermClicked
        }
        return CtItemSearched(termSearched, suggestionTermClicked)
    }

    fun toAppsFlyer() : Map<String, Any>{
        return AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(AFItemSearched(term_searched = if (pastSearchTermClicked.isNullOrEmpty()) termSearched else pastSearchTermClicked, result_found_count = resultFoundCount)))
    }
}