package com.intellihealth.truemeds.data.model.cancelorder

import com.google.gson.annotations.SerializedName
import com.intellihealth.salt.models.RadioListModel
import com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse

/**
 *This is used when cancel the order it contains cancellation reason list
 * **/
data class CancelReasonResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    @SerializedName("reasonList")
    var responseData: List<Reason?>?
) {
    data class Reason(
        val active: Boolean?,
        val isValid: Boolean?,
        /**
         * This is indicates level of reason i.e L1 reason
         * **/
        val name: String?,
        val orderDetailsStatistics: List<Any?>?,
        val parentReasonId: Int?,
        /**
         * This is used for provides sub reason list against this reason id
         * **/
        val reasonId: Int?,
        var shuffle: Boolean?,
        val smsTemplateId: Any?,
        val teamId: Any?,
        var isChecked: Boolean = true,
        /**
         * This is used for showing cancellation reason
         * **/
        val value: String?
    )

}