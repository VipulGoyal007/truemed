package com.intellihealth.truemeds.data.model.user

import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.models.AddressPatientDetailsCardModel


data class GetAllAddressResponse(
    var responseData : List<ResponseObj?>?=null
) {

    data class ResponseObj(
        val active: Boolean?,
        val addressId: Long?,
        val addressType: String?,
        val addressline1: String?,
        val addressline2: String?,
        val addressline3: String?,
        val cityId: Int?,
        var cityName: String?,
        var customerCity: String?,
        val countryId: Int?,
        val countryName: String?,
        val landmark: String?,
        val pincode: String?,
        val pincodeId: Int?,
        var selected: Boolean = false,
        val stateId: Int?,
        var stateName: String?,
        var customerState: String?,
        var isServicable: Boolean?,
        var clubbedAddress : String?
    ){

        fun toAddressPatientCardModel(): AddressPatientDetailsCardModel {
            val description: String =
                getAppendedString(addressline1, addressline2, addressline3, stateName)
            return AddressPatientDetailsCardModel(
                AddressPatientDetailsConstants.ADDRESS_DETAILS_CARD,
                "$addressType($pincode)",
                clubbedAddress,
                true,
                ""
            )
        }

        private fun getAppendedString(
            addressline1: String?,
            addressline2: String?,
            addressline3: String?,
            stateName: String?
        ): String {
            var description: String = ""
            if (addressline1?.isNotEmpty()!!) {
                description = addressline1
            }
            if (addressline2?.isNotEmpty()!!) {
                description += ",$addressline2"
            }
            if (addressline3?.isNotEmpty()!!) {
                description += ",$addressline3"
            }
            if (stateName?.isNotEmpty()!!) {
                description += ",$stateName"
            }
            return description
        }

        fun toDeliveryDetailsPatientCardModel(): AddressPatientDetailsCardModel {
            val description: String =
                "${addressline1}, ${addressline2}, ${addressline3}, ${stateName}, ${pincode}"
            return AddressPatientDetailsCardModel(
                AddressPatientDetailsConstants.ADDRESS_DETAILS_CARD,
                "$addressType($pincode)",
                clubbedAddress,
                false,
                "", isSelectable = true, isSelected = selected
            )
        }
    }
}