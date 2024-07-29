package com.intellihealth.truemeds.data.model.user

import com.google.gson.annotations.SerializedName
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerCategory

data class CustomerDetailsResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData
){
    data class ResponseData(
        @SerializedName("CustomerDetails")
        val customerInfo: CustomerInfo?,
        val TmCash: Double?,
        val TmCredit: Double?
    )
     data class CustomerInfo(
        val active: Boolean?,
        val addressId: Any?,
        val age: Int? = 0,
        val ageGroupId: Any?,
        val ageGroupName: Any?,
        val altMobileNo: Any?,
        val category: Any?,
        val categoryList: List<CustomerCategory>,
        val createdOn: Any?,
        val customerId: Int?,
        val customerName: String?,
        val emailAddress: String?,
        val gender: Int?,
        val genderName: String?,
        val languageId: Int?,
        val languageName: String?,
        val mobileNo: String?,
        val organisationId: Any?,
        val profileImage: Any?,
        val profileImageUrl: Any?,
        val reorderVariant: Any?,
        val totalSavingsTillDate: Double?,
        val firstName: String?,
        val lastName: String?

    )
}