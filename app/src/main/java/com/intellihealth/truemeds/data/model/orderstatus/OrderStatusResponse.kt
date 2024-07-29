package com.intellihealth.truemeds.data.model.orderstatus

import com.google.gson.annotations.SerializedName


data class OrderStatusResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: Int = 0,
    var responseData: ResponseData
) {
    data class ResponseData(
        val orderId: Long?,
        val pageTitle: String?,
        val orderStatusTitle: String?,
        val orderStatusBgColor: String?,
        val orderStatusProgressLineColor: String?,
        val orderStatusIconName: String?,
        val deliveryBy: String?,
        val statusPercent: Int?,
        val orderStatusDetailsList: List<OrderStatusDetailList>,
        val orderStatusTimeLineList: List<OrderStatusTimeLineList>,
        val doctorDetails: DoctorDetails? = null,
        val paymentEnable: Boolean,
        val paymentDone: Boolean,
        val timeLineCard: TimeLineCard?=null,
        val videoFaqDTOList: List<VideoFaqDTO?>,
        val orderDate:String?,
        val orderStatusWithDate:String?,
        val orderDeliveryDate:String?,
        val returnAllowed:Boolean = false,
        @SerializedName("orderReturnDate")
        val orderReturnMessage:String?,
        val orderCancelDate:String?,
        val returnUrl:String?,
        val clickpostUrl:String?,
        var showCancelButton:Boolean = true,
        var currentOrderStatus: Int? = 0,
        var currentOrderState :String?,
        var deliveryDays: Int? = 0,
        var rxRequired: Boolean? = null,
        var cashHandlingPayMsg :String?="",
        var cashHandlingRefundMsg :String?=""


    )

    data class TimeLineCard(
        val header: String?,
        val description: String?,
        val iconName: String?="",
        val bgColor: String?,
        val actionButtonType: String?,
        val actionButtonText: String?,
        var timer:Long?
    )

    data class DoctorDetails(
        val doctorId:Int=0,
        val header: String?,
        val doctorName: String?,
        val doctorSpec: String?,
        val doctorConsulted: String? = "",
        val consultedCustomersText: String? = "",
        val doctorCurrentCallRating: Double? = 0.0,
        val doctorOverallRating: Double? = 0.0,
        val customerGivenRatingText: String? = "",
        val doctorProfilePicImagePath: String? = "",
        val orderRating:Int=0,
        val doctorRating:Int=0

    )

    data class OrderStatusDetailList(
        val header: String?,
        val description: String?,
        val iconName: String?="",
        val nextProgressLineColor: String?,
        val nextProgressBorderColor: String?,
        val activeCardDetails: ActiveCardDetails,
        val upcomingStage: Boolean,
        val activeCard: Boolean,
    )

    data class OrderStatusTimeLineList(
        val statusName: String?,
        val statusDate: String?,
        val statusEnabled: String?,
    )

    data class VideoFaqDTO(
        val categoryId: Int? = null,
        val categoryName: Any? = null,
        val description: String? = null,
        val duration: String? = null,
        val gifUrl: String? = null,
        val language: String? = null,
        val languageCode: String? = null,
        val requestedBySource: Any? = null,
        val thumbnailUrl: String? = null,
        val thumbnailUrlPortrait: Any? = null,
        val title: String? = null,
        val verticalThumbnailUrl: String? = null,
        val videoFaqId: Int? = null,
        val videoOrientation: String? = null,
        val videoUrl: String? = null
    )

    data class ActiveCardDetails(
        val activeCardBorderColor: String? = null,
        val actionButtonType: String? = null,
        val actionButtonText: String? = null,

    )
}

