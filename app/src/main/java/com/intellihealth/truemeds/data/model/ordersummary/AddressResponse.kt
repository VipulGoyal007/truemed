package com.intellihealth.truemeds.data.model.ordersummary

data class AddressResponse(
    var message: String,
    var responseData: List<ResponseData>,
    var statusCode: Int,
    var statusValue: String,
    var timeTakenInMs: Long
) {
    data class ResponseData(
        var active: Boolean?=false,
        var addressId: Long?=0,
        var addressType: String?=null,
        var addressline1: String?=null,
        var addressline2: String?=null,
        var addressline3: String?=null,
        var cityId: Int=0,
        var cityName: String?=null,
        var clubbedAddress: String?=null,
        var countryId: Int=0,
        var countryName: String?=null,
        var customerCity: String?=null,
        var customerState: String?=null,
        var landmark: String?=null,
        var pincode: String?=null,
        var pincodeId: Int=0,
        var selected: Boolean?=false,
        var stateId: Int=0,
        var stateName: String?=null
    )
}