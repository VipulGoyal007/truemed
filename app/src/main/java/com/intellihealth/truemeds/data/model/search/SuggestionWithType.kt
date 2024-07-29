package com.intellihealth.truemeds.data.model.search

import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase

data class SuggestionWithType(
    
    @SerializedName("type") var type: String? = null,
    @SerializedName("text") var text: String? = null,
    @SerializedName("inSection") var inSection: String? = "",
    @SerializedName("_qc") var qc: String? = null,
    @SerializedName("_rt") var rt: ArrayList<String>? = arrayListOf(),
    @SerializedName("productCode") var productCode: String? = null

) {
    suspend fun getInSectionCategory(localDbUseCase: LocalDbUseCase) : String {
        return localDbUseCase.getInSectionForSearch(type ?: "")
    }
}