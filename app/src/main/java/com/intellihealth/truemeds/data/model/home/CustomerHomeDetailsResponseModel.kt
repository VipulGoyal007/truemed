package com.intellihealth.truemeds.data.model.home

data class CustomerHomeDetailsResponseModel(
    val message: String,
    val responseData: ResponseData?=null,
    val statusCode: Int,
    val statusValue: String,
    val timeTakenInMs: String? = ""
) {
    data class ResponseData(
        val customerDetails: CustomerDetails,
        val tmCash: Double = 0.0,
        val tmWallet: Double = 0.0,
        val tmCredit: Double = 0.0,
        val acceptedPP: Boolean,
        val acceptedTnC: Boolean,
        val isFtc: Boolean,
        val orderIdForRating: String? = "",
        val incompleteOrderId: Long? = 0,
        val prescriptionCount: Int? = 0,

        val prevDeliveredAddressId: Long? = 0,
        val prevDeliveredPatientId: Long? = 0,
        val prevDeliveredOrderId: Long? = 0,
        val prevPatientName: String? = "",
        val referralData: ReferralData,
        val totalSavingsTillDate: String = ""
    ) {
        data class CustomerDetails(
            val age: Int = 0,
            val categoryList: List<Category>? = emptyList(),
            val customerId: Long,
            val customerName: String? = "",
            val emailAddress: String? = "",
            val gender: String? = "",
            val genderId: Int,
            val mobileNo: String? = ""
        ) {
            data class Category(
                val additionalProperties: List<AdditionalProperty>? = emptyList(),
                val category: String? = "",
                val categoryType: String? = "",
                val id: Long,
                val sourceVersion: String? = ""
            ) {
                data class AdditionalProperty(
                    val active: Boolean,
                    val createdOn: Long,
                    val experimentMasterId: Int = 0,
                    val id: Long = 0,
                    val modifiedOn: Long,
                    val value: String? = "",
                    val variant: String? = ""
                )
            }
        }
        data class ReferralData(
            var referralAmount: Int?,
            var registeredCustomerName: String?
        )
    }
}