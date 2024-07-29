package com.intellihealth.truemeds.presentation.model

import com.intellihealth.salt.constants.OrderTypeConstants
import com.intellihealth.salt.models.OrderStatusType
import com.intellihealth.salt.models.TmOrderStatusCardModel

data class DeliveredOrders(
    var ordersList: List<Orders?>?,
    var pageCount: Int,
    var recordsCount: Int
) {
    data class Orders(
        var actionButtonText: String?,
        var actionButtonType: String?,
        var date: String?,
        var orderForPatientName: String?,
        var orderId: Int,
        var payableAmount: Double,
        var productNameList: List<ProductName?>?,
        var statuses: List<Statuse?>?,
        var buttonName: String="Reorder"
    ) {
        data class ProductName(
            var quantity: Int,
            var skuName: String?
        )

        data class Statuse(
            var bgColor: String?,
            var statusName: String?
        )

        fun toOrderStatusCardsModel(): TmOrderStatusCardModel {
            var productList=ArrayList<String>()
            productNameList?.forEach{
                productList.add(it?.quantity.toString()+"x"+it?.skuName)

            }
            return TmOrderStatusCardModel(
                    orderId.toString(),
                    date,
                    payableAmount.toString(),
                    "",
                    productList,
                    orderForPatientName,
                    "",
                arrayListOf(
                    OrderStatusType("Order Returned", OrderTypeConstants.WARNING),
                    OrderStatusType("Order Cancelled", OrderTypeConstants.CRITICAL),
                    OrderStatusType("Order Delivered", OrderTypeConstants.SUCCESS) ),
                buttonName = buttonName


            )
        }
    }
}