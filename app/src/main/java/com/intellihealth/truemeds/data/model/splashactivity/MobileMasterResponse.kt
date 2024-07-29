package com.intellihealth.truemeds.data.model.splashactivity

import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrderFilter
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SearchCategory
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SubOptReasons
import com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion

data class MobileMasterResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var isAppVersionActive: Boolean? = false,
    var responseData: ResponseData?,
    val subsOptReasons: ArrayList<SubsOptReason>?

) {
    data class ResponseData(
        var srcTypeId: Long? = 0,
        var appVersionActive: Boolean,
        var orderFilterList: ArrayList<OrderFilter>?,
        var searchTypeMaster: ArrayList<SearchCategory>?,
        var tmContacts: ArrayList<TmContactVersion>?,
        var subOptReasons: ArrayList<SubOptReasons>?,
        var minMedDiscountToBeHidden: Float? = 0f
    )

    data class SubsOptReason(
        val active: Boolean?,
        val isValid: Boolean?,
        val name: String?,
        val orderDetailsStatistics: List<Any?>?,
        val parentReasonId: Any?,
        val reasonId: Int?,
        val shuffle: Boolean?,
        val smsTemplateId: Any?,
        val teamId: Any?,
        val value: String?
    )
}