package com.intellihealth.truemeds.data.callback

import com.intellihealth.salt.views.tooltip.DefaultExpandedTooltip
import com.intellihealth.salt.views.tooltip.DefaultExpandedTooltipWithMargin
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse

interface ChooseLocationCallback {
    fun locationClicked(selectedLocation: String, selectedAddressId: Long, selectedAddressPinCode: String)
    fun editAddressClicked(getAllAddressResponse: GetAllAddressResponse.ResponseObj?)
    fun dismissToolTip(toolTip: DefaultExpandedTooltipWithMargin?)
}