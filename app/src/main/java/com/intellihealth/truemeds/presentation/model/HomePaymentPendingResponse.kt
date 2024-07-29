package com.intellihealth.truemeds.presentation.model

import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.CashHandlingInfoModel
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse

data class HomePaymentPendingResponse(
    var billDetailsModel: BillDetailsModel?,
    var activeOrderItem : AllCustomersOrdersResponseModel.ResponseData.Orders?,
    var paymentSelectionInfo: BillDetailResponse.ResponseData.PaymentSelectionInfo?,
    val paymentPendingCount : Int,
    val cashHandlingInfo : CashHandlingInfoModel? = null,
    val billDetailsResponse : BillDetailResponse.ResponseData? = null
    )