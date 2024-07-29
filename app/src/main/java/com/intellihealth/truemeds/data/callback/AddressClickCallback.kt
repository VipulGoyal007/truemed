package com.intellihealth.truemeds.data.callback

import com.intellihealth.salt.views.tooltip.DefaultExpandedTooltip
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse

interface AddressClickCallback {
    fun editClick(address: GetAllAddressResponse.ResponseObj)
    fun dismissToolTip(toolTip: DefaultExpandedTooltip?)
    fun locationClicked(selectedLocation: String, selectedAddressId: Long, selectedAddressPinCode: String)
}