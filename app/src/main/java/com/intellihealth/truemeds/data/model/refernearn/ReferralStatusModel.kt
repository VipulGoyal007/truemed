package com.intellihealth.truemeds.data.model.refernearn

import com.intellihealth.salt.models.ReferralStageItem
import com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse


data class ReferralStatusModel(
    var referralAmount: Double? = 0.00,
    var registeredCustomerName: String? = null,
    var referralOrderFlowStatus: String? = null,
    var referralStatus: String? = null,
    var referralStages: ArrayList<ReferralStages> = arrayListOf()
) {
    data class ReferralStages(
        var stageName: String? = null,
        var onDate: String? = null,
        var isCompleted: Boolean? = null
    ) {
        fun toReferralStageItemModel(referralList: List<ReferralStatusResponse.ReferralStage>?): List<ReferralStageItem> {

            var localList = arrayListOf<ReferralStageItem>()
            for (referralStages in referralList!!) {

                localList.add(
                    ReferralStageItem(
                        referralStages.stageName?:"",
                        changeDateFormat(referralStages.onDate ?:""),
                        referralStages.completed?:false
                    )
                )
            }

            return localList
        }
        private fun changeDateFormat(inputDateStr: String): String {
            try {
                return inputDateStr.split(" ").take(3).joinToString(" ")
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return ""
        }
    }


}
