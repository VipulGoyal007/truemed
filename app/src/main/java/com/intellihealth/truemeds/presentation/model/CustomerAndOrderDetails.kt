package com.intellihealth.truemeds.presentation.model


data class CustomerAndOrderDetails(
    var acceptedPP: Boolean?,
    var acceptedTnC: Boolean?,
    var customerDetails: CustomerDetails?,
    var incompleteOrderId: Int?,
    var isFtc: Boolean?,
    var orderIdForRating: Int?,
    var prescriptionCount: Int?,
    var prevDeliveredAddressId: Int?,
    var prevDeliveredPatientId: Int?,
    var productCount: Int?,
    var referralData: List<ReferralData?>?,
    var tmWallet: Int?
) {

    data class CustomerDetails(
        var age: Int?,
        var categoryList: List<Category?>?,
        var customerName: String?,
        var firstName: String?,
        var gender: String?,
        var genderId: Int?,
        var lastName: String?
    ) {

        data class Category(
            var additionalProps: List<AdditionalProp?>?,
            var category: String?,
            var categoryType: String?,
            var id: Int?
        ) {

            data class AdditionalProp(
                var id: Int?,
                var value: Value?
            ) {

                data class Value(
                    var baseDiscount: Int?
                )
            }
        }
    }


    data class ReferralData(
        var referralAmount: Int?,
        var registeredCustomerName: String?
    )
}