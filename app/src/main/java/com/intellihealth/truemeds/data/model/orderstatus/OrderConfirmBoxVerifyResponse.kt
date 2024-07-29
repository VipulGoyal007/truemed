package com.intellihealth.truemeds.data.model.orderstatus

data class OrderConfirmBoxVerifyResponse(
    var isModified: Boolean = false,
    val DoctorOrderConfirmed: DoctorOrderConfirmedResponse?,
    val boxVerified: BoxVerified?,
) {
    data class DoctorOrderConfirmedResponse(
        var userId: Int = 0,
        private val userName: String?,

        private val statusId: Int = 0,

        private val statusName: String?,

        private val comments: String?,

        private val reason: Any?,

        private val prevFinalCalc: CurrFinalCalc?,

        private val currFinalCalc: CurrFinalCalc?,

        private val currentMedList: List<CurrentMedList>?,

        private val visibilityLvl: Int = 0,

        private val createdOn: Long = 0

    )

    data class BoxVerified(
        private var userId: Int = 0,

        private val userName: String?,

        private val statusId: Int = 0,

        private val statusName: String?,

        private val comments: String?,

        private val reason: Any?,

        private val prevFinalCalc: Any?,

        private val currFinalCalc: CurrFinalCalc?,

        private val currentMedList: List<CurrentMedList>?,

        private val visibilityLvl: Int = 0,

        private val createdOn: Long = 0

    )

    data class CurrentMedList(
        private var orgProductCd: String?,

        private val orgProductName: String?,

        private val orgProductQty: Int = 0,

        private val orgProductMrp: Any?,

        private val subsProductCd: String?,

        private val currProductCd: String?,

        private val currProductName: String?,

        private val currProductQty: Int = 0,

        private val currProductMrp: Double = 0.0,

        private val currProductSellingPrice: Double = 0.0,

        private val couponDiscount: Double = 0.0,

        private val orgProductActive: Boolean = false,

        private val currProductActive: Boolean = false
    )

    data class CurrFinalCalc(
        private var id: Int = 0,
        private val orderId: Long = 0,

        private val customerId: Int = 0,

        private val orderValue: Double = 0.0,

        private val savingValue: Double = 0.0,

        private val discount: Double = 0.0,

        private val subsMrp: Double = 0.0,

        private val tmCash: Double = 0.0,

        private val deliveryCharge: Double = 0.0,

        private val finalAmount: Double = 0.0,

        private val totalAmount: Double = 0.0,

        private val tmCredit: Double = 0.0,

        private val adjustmentAmt: Double = 0.0
    )

}
