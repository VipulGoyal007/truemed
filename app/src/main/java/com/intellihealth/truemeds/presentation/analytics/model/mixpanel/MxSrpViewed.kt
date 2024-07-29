package com.intellihealth.truemeds.data.model.mixpanel

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFSrpViewed
import com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent
import com.intellihealth.truemeds.presentation.analytics.model.clevertap.CtSrpViewed


data class MxSrpViewed(
    @SerializedName("clicked_suggestion_type")
    var clickedSuggestionType: String? = null,
    @SerializedName("_qc")
    var qc: String? = null,
    @SerializedName("result_list")
    var resultList: List<String?>? = null,
    @SerializedName("results_viewed")
    var resultsViewed: List<String?>? = null,
    @SerializedName("_rt")
    var rt: String? = null,
    @SerializedName("suggestion_term_clicked")
    var suggestionTermClicked: String? = null,
    @SerializedName("suggestion_term_clicked_position")
    var suggestionTermClickedPosition: Int? = null,
    @SerializedName("term_searched")
    var termSearched: String? = null,
    @SerializedName("wh_id")
    var whId: String? = null
){
    fun toAppsFlyer() : Map<String, Any>{
        return AppsFlyerEvent.convertJsonToHashmap(Gson().toJson(AFSrpViewed(result_list = resultList.toString(), suggestion_term_clicked = suggestionTermClicked, term_searched = termSearched )))
    }

    fun toCleverTap():CtSrpViewed{
        return CtSrpViewed(if (suggestionTermClicked.isNullOrEmpty()) termSearched else suggestionTermClicked, resultsViewed)
    }
}