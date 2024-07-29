package com.intellihealth.truemeds.data.model.orderflow
data class AllOffersResponse(
    val payload: Payload?
) {
    data class Payload(
        val count: Int?,
        val currentDate: Long?,
        val `data`: List<Data?>?
    ) {
        data class Data(
            val applicableOn: String?,
            val applicableOnCx: String?,
            val colorCode: String?,
            val couponCodeRequired: Boolean?,
            val description: String?,
            val discountType: DiscountType?,
            val discountValue: Double?,
            val experimentMaster: Any?,
            val ftcUrgencyDescription: Any?,
            val image: String?,
            val infoPanel: String?,
            val maxDiscount: Double?,
            val minCartValue: Double?,
            val offerApplicableOnSorce: String?,
            val offerApplicableOnVersion: List<OfferApplicableOnVersion?>?,
            val offerId: Int?,
            val offerOrderSummaryTitle: String?,
            val offersVisible: Boolean?,
            val offersVisibleOnOrderSummary: Boolean?,
            val paymentMethods: List<PaymentMethod?>?,
            val paymentSelectionMethod: Any?,
            val paymentSelectionMethodId: Any?,
            val promoCode: String?,
            val showFtcCounter: Boolean?,
            val termsAndConditions: List<TermsAndCondition?>?,
            val title: String?,
            val validity: Long?,
            val variantMaster: Any?
        ) {
            data class DiscountType(
                val active: Boolean?,
                val createdBy: Any?,
                val createdOn: Long?,
                val description: String?,
                val hibernateLazyInitializer: HibernateLazyInitializer?,
                val lastModifiedBy: Any?,
                val lastModifiedOn: Long?,
                val name: String?,
                val serialId: Int?,
                val value: String?
            ) {
                class HibernateLazyInitializer
            }

            data class OfferApplicableOnVersion(
                val id: Int?,
                val offerId: Int?,
                val versionId: Any?
            )

            data class PaymentMethod(
                val active: Boolean?,
                val createdOn: Long?,
                val iconName: String?,
                val iconPath: String?,
                val iconSubType: String?,
                val iconType: String?,
                val paymentMethodId: Int?
            )

            data class TermsAndCondition(
                val description: String?,
                val id: Int?,
                val offersId: Int?
            )
        }
    }
}