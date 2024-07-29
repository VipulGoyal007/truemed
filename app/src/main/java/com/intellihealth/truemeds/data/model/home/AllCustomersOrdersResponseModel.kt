package com.intellihealth.truemeds.data.model.home

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Parcelable
import androidx.core.content.ContextCompat
import com.google.gson.annotations.SerializedName
import com.intellihealth.salt.constants.OrderTypeConstants
import com.intellihealth.salt.models.OrderStatusType
import com.intellihealth.salt.models.OrderTracking
import com.intellihealth.salt.models.OrderTrackingModel
import com.intellihealth.salt.models.ReorderModel
import com.intellihealth.salt.models.TmOrderStatusCardModel
import com.intellihealth.salt.utils.formatDecimal
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.app.ApplicationClass
import kotlinx.parcelize.Parcelize


data class AllCustomersOrdersResponseModel(
    @SerializedName("message")
    val message: String = "",
    @SerializedName("responseData")
    val responseData: ResponseData?,
    @SerializedName("statusCode")
    val statusCode: Int = 0,
    @SerializedName("statusValue")
    val statusValue: String = "",
    @SerializedName("timeTakenInMs")
    val timeTakenInMs: Int = 0
) {
    data class ResponseData(
        @SerializedName("ordersList")
        val ordersList: ArrayList<Orders> = arrayListOf(),
        @SerializedName("pageCount")
        val pageCount: Int = 0,
        @SerializedName("recordsCount")
        val recordsCount: Int = 0
    ) {
        data class Orders(
            @SerializedName("actionButtonText")
            val actionButtonText: String? = null,
            @SerializedName("actionButtonType")
            val actionButtonType: String,
            @SerializedName("cartActionType")
            val cartActionType: String? = null,
            @SerializedName("date")
            val date: String,
            @SerializedName("orderForPatientName")
            val orderForPatientName: String,
            @SerializedName("orderId")
            val orderId: Long,
            @SerializedName("deliveryDate")
            val deliveryDate: String,
            @SerializedName("homepageActionButtonType")
            val homepageActionButtonType: String,
            @SerializedName("homepageActionButtonText")
            val homepageActionButtonText: String,
            @SerializedName("payableAmount")
            val payableAmount: Double,
            @SerializedName("paymentValue")
            val paymentValue: Double,
            val discount: Double,
            @SerializedName("productNameList")
            val productNameList: List<ProductName>,
            @SerializedName("drCallbackValidMillis")
            val drCallbackValidMillis: Long,
            @SerializedName("doctorCallMissed")
            val doctorCallMissed: Boolean,
            var doctorCallConfirm: Boolean=false,
            val iconName: String,
            @SerializedName("bgCardColor")
            val color: String,
            @SerializedName("callbackRequested")
            val callbackRequested: Boolean,
            @SerializedName("paymentPending")
            var paymentPending: Boolean,
            @SerializedName("statuses")
            val statuses: List<Statuse>,
            @SerializedName("sdkEvents")
            val mxEvents: MxEvents,
            @SerializedName("savingsText")
            val savingText: String?=""
        ) {
            @Parcelize
            data class ProductName(
                @SerializedName("quantity")
                val quantity: Int,
                @SerializedName("sellingPrice")
                val sellingPrice: Double,
                @SerializedName("skuName")
                val skuName: String
            ) : Parcelable

            data class Statuse(
                @SerializedName("statusName")
                val statusName: String,
                @SerializedName("statusType")
                val statusType: String,
                @SerializedName("homepageStatusDesc")
                val homepageStatusDesc: String?,
            )

            data class MxEvents(
                val patientType: String? = "",
                val patientAge: String? = "",
                val patientId: Long? = 0,
                val patientGender: String? = "",
                val shippingCity: String? = "",
                val shippingState: String? = "",
                val shippingPincode: String? = "",
                val addressType: String? = "",
                val rxRequired: Boolean? = false,
                val statusId: Long? = 0,
                val doctorName: String? = "",
                val doctorId: Long? = 0,
                val productCodes: List<String>? = emptyList(),
                val reorder: Boolean? = false
            )

            /*fun toSdkReorderList(): List<ReorderModel> {
                return listOf(
                    ReorderModel(
                        orderForPatientName,
                        date.toString(),
                        savingText,
                        productNameList.map { it -> it.skuName })
                )
            }*/

            fun toSdkActiveOrderList(context: Context): OrderTrackingModel {
                var timerInMillis = 0L
                // if ((actionButtonType != null && actionButtonType.equals(OrderTracking.CALL_ME_BACK)) && !doctorCallMissed) {
                if (!drCallbackValidMillis.toString()
                        .isNullOrEmpty() && drCallbackValidMillis.toString() != "0"
                ) {
                    timerInMillis = drCallbackValidMillis
                } else {
                    timerInMillis = 0L
                }


                return OrderTrackingModel(
                    title = if (statuses == null) {
                        ""
                    } else {
                        statuses[0]?.homepageStatusDesc ?: ""
                    },
                    //  btnTitle = actionButtonText ?: "TRACKORDER",
                    btnTitle = homepageActionButtonText ?: "Track",
                    timerInMillis = timerInMillis,
                    imgIcon = getImageFromDrawable(context, iconName),
                    bgColor = color,
                    // orderType = getCategoryTypeForEnum(actionButtonType),
                    orderType = getCategoryTypeForEnum(homepageActionButtonType ?: ""),
                    orderId = orderId,
                    isReorder = mxEvents.reorder
                )
            }

            private fun getCategoryTypeForEnum(data: String): OrderTracking {
                return if (!data.isNullOrEmpty()) when (data) {
                    "TRACKORDER" -> OrderTracking.TRACK_ORDER
                    "PAYNOW" -> OrderTracking.PAY_NOW
                    "CALLNOW" -> OrderTracking.CALL_NOW
                    "CALLMEBACK" -> OrderTracking.CALL_ME_BACK
                    "CALL_ME" -> OrderTracking.CALL_NOW
                    "CALL_ME_BACK" -> OrderTracking.CALL_NOW
                    else -> OrderTracking.TRACK_ORDER
                } else OrderTracking.TRACK_ORDER
            }

            private fun getImageFromDrawable(context: Context, iconName: String): Drawable? {
                val drawableId: Int = context.resources.getIdentifier(iconName, "drawable", context.packageName)
                /*var drawableId: Int = R.drawable.ic_circle_exclamation
                if (iconName == "ic_doctor_call_pending") {
                    drawableId = R.drawable.ic_doctor_call_pending
                }*/

                return if (drawableId != 0) {
                    // Use ContextCompat.getDrawable() to retrieve the drawable
                    ContextCompat.getDrawable(ApplicationClass.getInstance(), drawableId)
                } else {
                    // Handle the case where the drawable is not found
                    // You might want to provide a default drawable or show an error message
                    ContextCompat.getDrawable(ApplicationClass.getInstance(), R.drawable.ic_circle_exclamation)!!
                }
            }

            fun toOrderStatusCardsModel(): TmOrderStatusCardModel {
                var productList = ArrayList<String>()
                var orderStatusTypeList = ArrayList<OrderStatusType>()

                if (productNameList.isEmpty()) {
                    productList.add("Prescription Uploaded")
                } else {
                    productNameList?.forEach {
                        productList.add(it?.quantity.toString() + "x" + it?.skuName)
                    }
                }
                statuses?.forEach {
                    val type = getStatusType(it.statusType)
                    orderStatusTypeList.add(OrderStatusType(it?.statusName ?: "", type))

                }

                return TmOrderStatusCardModel(
                    "Order #" + orderId.toString(),
                    "On " + date,
                    "₹ " + formatDecimal(payableAmount),
                    "",
                    productList,
                    orderForPatientName,
                    "",
                    orderStatusTypeList,
                    buttonName = if (actionButtonText.equals(
                            "Pay now",
                            true
                        )
                    ) "Track" else actionButtonText ?: ""


                )
            }
        }
    }

}

fun getStatusType(type: String): OrderTypeConstants {
    var returnedOrderType: OrderTypeConstants = OrderTypeConstants.WARNING
    if (type.equals("SUCCESS", true))
        returnedOrderType = OrderTypeConstants.SUCCESS
    else if (type.equals("WARNING", true))
        returnedOrderType = OrderTypeConstants.WARNING
    else
        returnedOrderType = OrderTypeConstants.CRITICAL
    return returnedOrderType
}