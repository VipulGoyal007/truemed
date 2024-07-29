package com.intellihealth.truemeds.data.model.home



data class CouponExpiryDateResponse(
    val currentDate: Long?,
    val payLoad: List<PayLoad?>?,
    val variantName: String?
) {
    data class PayLoad(
        val applicableOn: String?,
        val applicableOnCx: String?,
        val colorCode: String?,
        val couponCodeRequired: Boolean?,
        val description: String?,
        val discountType: DiscountType?,
        val discountValue: Double?,
        val ftcUrgencyDescription: String?,
        val image: String?,
        val infoPanel: Any?,
        val maxDiscount: Double?,
        val minCartValue: Double?,
        val offerApplicableOnSorce: Any?,
        val offerApplicableOnVersion: Any?,
        val offerId: Int?,
        val offerOrderSummaryTitle: Any?,
        val offersVisible: Boolean?,
        val offersVisibleOnOrderSummary: Boolean?,
        val paymentMethods: Any?,
        val paymentSelectionMethod: Any?,
        val paymentSelectionMethodId: Any?,
        val promoCode: String?,
        val termsAndConditions: Any?,
        val title: String?,
        val validity: Long?
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
    }
}