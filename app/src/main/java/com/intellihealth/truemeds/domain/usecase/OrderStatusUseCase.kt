package com.intellihealth.truemeds.domain.usecase

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.text.SpannableStringBuilder
import android.util.Log
import androidx.core.content.ContextCompat
import com.google.gson.Gson
import com.intellihealth.salt.constants.OrderStatusConstants
import com.intellihealth.salt.models.ActivityTimelineModel
import com.intellihealth.salt.models.CashHandlingInfoModel
import com.intellihealth.salt.models.DetailedTimelineModel
import com.intellihealth.salt.models.DoctorCallCardModel
import com.intellihealth.salt.models.HistoryAccordionModel
import com.intellihealth.salt.models.OrderPersonalDetailsModel
import com.intellihealth.salt.models.OrderStatusCardModel
import com.intellihealth.salt.models.OrderTrackerModel
import com.intellihealth.salt.models.PaymentContainerModel
import com.intellihealth.salt.models.SavingCardsModel
import com.intellihealth.salt.models.StatusModel
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.salt.views.payments.PaymentContainerType
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.CustomerOrderDetailsResponseData
import com.intellihealth.truemeds.data.model.orderflow.PatientDetail
import com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.DeleteAlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.GenerateReturnUrlResponse
import com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse
import com.intellihealth.truemeds.data.model.ordersummary.AddressResponse
import com.intellihealth.truemeds.data.model.user.SaveEmailResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.data.utils.ResponseData
import com.intellihealth.truemeds.domain.repository.OrderStatusRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import javax.inject.Inject


class OrderStatusUseCase @Inject constructor(
    private val orderStatusRepository: OrderStatusRepository,
    @ApplicationContext private val context: Context,
    private val sdkEventUseCase: SdkEventUseCase
) {

    suspend fun getOrderStatusAndDetailsData(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        customerId: String
    ): OrderStatusResponse? {
        var response: OrderStatusResponse? = null
        when (val orderStatusResponse = orderStatusRepository.getOrderStatus(mxInternalErrorOccurred, orderId, customerId)) {
            is Resource.Success -> {
                try {
                    orderStatusResponse.let {
                        response = it.value?.body()!!
                        if (!it.value.isSuccessful) {
                            try {
                                mxInternalErrorOccurred.errorCode = it.value.code()
                                mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                    it.value.errorBody()?.string(),
                                    ApiCoreResponse::class.java
                                ).message
                                sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                            } catch (_: Exception) {
                            }
                        }
                    }
                } catch (e: Exception) {

                }
            }

            is Resource.Failure -> {
                orderStatusResponse.errorCode?.let {
                    orderStatusResponse.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            orderStatusResponse.errorCode,
                            resErrorBody, orderStatusResponse.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return response
    }

    fun getOrderTrackerData(
        context: Context,
        responseData: OrderStatusResponse.ResponseData?,
        fromActionBtnChange: Boolean
    ): OrderTrackerModel? {
        // Timeline data
        val list = ArrayList<StatusModel>()
        val green = Color.parseColor(responseData?.orderStatusBgColor ?: "FFFFFF")

        //todo status id not get from api
        responseData?.orderStatusTimeLineList.let { it ->
            it?.map {
                list.add(
                    StatusModel(
                        status = it.statusName ?: "",
                        statusId = 50,
                        edd = it.statusDate ?: ""
                    )
                )
            }

        }
        //todo status percent change pending
        val orderPlaced = ActivityTimelineModel(
            statusId = 1,
            statusDisplayedOnScreenList = list,
            textSelectedColor = green,
            progressSelectedColor = getProgressBarColor(responseData?.orderStatusBgColor),
            progressSelectedColorId = getProgressBarColor(responseData?.orderStatusBgColor),
            isStatusEnabled = true,
            progressPercent = responseData?.statusPercent?.toDouble() ?: 0.0
        )
        var orderPlacedStatus: OrderStatusCardModel? = null

        // Status card data
//        todo icon change
        responseData?.timeLineCard?.let {
            val isButtonPresent = if (it.actionButtonType != null) {
                !(fromActionBtnChange || it.actionButtonType.contains("done", ignoreCase = true))
            } else {
                false
            }
            orderPlacedStatus = OrderStatusCardModel(
                header = it.header ?: "",
                subHeader = it.description ?: "",
                cardColor = getBgColor(it.bgColor ?: ""),
                isButtonPresent = isButtonPresent,
                buttonText = it.actionButtonText ?: "",
                buttonAction = it.actionButtonType ?: "",
                cardIcon = getDrawableResourceIdForTimeLine(context, it.iconName),
                isTimerPresent = it.timer != null,
                timerInMillis = it.timer ?: 0L,
                progressPercent = responseData.statusPercent?.toDouble() ?: 0.0,
                loaderVisible = fromActionBtnChange,
                tickIconVisible = (it.actionButtonType?.contains("done", ignoreCase = true) == true)
            )
        }
        var orderPlacedModel: OrderTrackerModel? = null
        orderPlacedStatus?.let {
            orderPlacedModel = OrderTrackerModel(
                estimatedDeliveryDate = responseData?.deliveryBy,
                orderStatusCardModel = it,
                timelineModel = orderPlaced,
            )
        }
        return orderPlacedModel


    }

    fun getDetailedTimeLineData(responseData: OrderStatusResponse.ResponseData?): List<DetailedTimelineModel> {
        if (responseData == null) return emptyList()
        if (responseData.orderStatusDetailsList == null) return emptyList()


        val detailTimeLineList: ArrayList<DetailedTimelineModel> = arrayListOf()

        var orderPlacedStatusList: List<OrderStatusCardModel> = emptyList()
        var orderPlacedStatus: OrderStatusCardModel? = null
        responseData.orderStatusDetailsList.forEachIndexed { index, orderStatusDetailsList ->
            if (orderStatusDetailsList.activeCard) {
                // Status card data
                orderStatusDetailsList.let {
                    orderPlacedStatus = OrderStatusCardModel(
                        header = orderStatusDetailsList.header ?: "",
                        subHeader = orderStatusDetailsList.description ?: "",
                        cardColor = getBgColor(orderStatusDetailsList.activeCardDetails.activeCardBorderColor ?: "#178755"),
                        isButtonPresent = orderStatusDetailsList.activeCardDetails.actionButtonType != null,
                        buttonText = orderStatusDetailsList.activeCardDetails.actionButtonText
                            ?: "",
                        buttonAction = orderStatusDetailsList.activeCardDetails.actionButtonType
                            ?: "",
                        cardIcon = getDrawableResourceIdForTimeLine(context, it.iconName),
                        isTimerPresent = false,
                        timerInMillis = 0L,
                        progressPercent = responseData.statusPercent?.toDouble() ?: 0.0,
                        loaderVisible = false,
                        tickIconVisible = false
                    )


                }


            }
            detailTimeLineList.add(
                index, DetailedTimelineModel(
                    title = orderStatusDetailsList.header ?: "",
                    subTitle = orderStatusDetailsList.description ?: "",
                    iconName = orderStatusDetailsList.iconName ?: "",
                    iconUrl = if((orderStatusDetailsList.iconName ?: "".contains("http")) == true) orderStatusDetailsList.iconName ?: "" else "",
                    lineColor = orderStatusDetailsList.nextProgressLineColor?:"#FFFFFF",
                    borderColor = orderStatusDetailsList.nextProgressBorderColor ?: "#178755",
                    statusCardModel = if (orderStatusDetailsList.activeCard) orderPlacedStatus else null,
                    otherTimelinesEnabled = !orderStatusDetailsList.upcomingStage ?: false
                )
            )

        }
//        Log.d("orderPlacedStatus", "getDetailedTimeLineData: "+orderPlacedStatus)
        Log.d("detailTimeLineList", "getDetailedTimeLineData: " + detailTimeLineList)


        return detailTimeLineList

    }

    private fun getDrawableResourceIdForTimeLine(context: Context, imageName: String?): Int {
        val resourceId = if (imageName == null) {
            context.resources.getIdentifier("white_square", "drawable", context.packageName)
        } else {
            context.resources.getIdentifier(imageName, "drawable", context.packageName)
        }
        return resourceId
    }


    private fun getBgColor(orderStatusBgColor: String?): Int {
        return when (orderStatusBgColor) {
            "#1b69de" -> OrderStatusConstants.CardColor.CARD_COLOR_BLUE
            "#FFEDBC" -> OrderStatusConstants.CardColor.CARD_COLOR_YELLOW
            "#FFCA62" -> OrderStatusConstants.CardColor.CARD_COLOR_YELLOW
            "#F9B6B6" -> OrderStatusConstants.CardColor.CARD_COLOR_RED
            else -> OrderStatusConstants.CardColor.CARD_COLOR_BLUE
        }
    }


    fun getDoctorCallData(doctorDetails: OrderStatusResponse.DoctorDetails?): DoctorCallCardModel? {
        if (doctorDetails == null) return null
        val isRatingSubmitted = doctorDetails.orderRating > 0
        return DoctorCallCardModel(
            cardHeaderText = "You had a call with",
            doctorName = doctorDetails.doctorName ?: "",
            doctorSpeciality = doctorDetails.doctorSpec ?: "",
            consultedCustomersText = doctorDetails.doctorConsulted,
            doctorCurrentCallRating = doctorDetails.doctorCurrentCallRating,
            doctorOverallRating = doctorDetails.doctorRating.toDouble(),
            customerGivenRatingText = doctorDetails.orderRating.toString(),
            thanksFeedbackText = "Thanks for the feedback",
            rateValidationText = "*Please select a rating",
            consultedCustomersCount = doctorDetails.doctorConsulted,
            rateYourExperienceText = "Please rate your experience",
            isRatingSubmitted = isRatingSubmitted,
            doctorProfilePicImagePath = doctorDetails.doctorProfilePicImagePath ?: ""
        )

    }


    fun getStickyOrderStatusData(
        context: Context,
        responseData: OrderStatusResponse.ResponseData?,
        fromOrderStatus: Boolean
    ): StickyNonStickyNotificationModel {
        var orderStatusHeader = ""
        if (fromOrderStatus) {
            orderStatusHeader = responseData?.orderStatusTitle ?: ""
        } else {
            if (responseData?.orderStatusTitle?.contains("cancelled", ignoreCase = true) == true) {
                orderStatusHeader = responseData.orderStatusWithDate.toString()
            } else if (responseData?.orderStatusTitle?.contains(
                    "delivered",
                    ignoreCase = true
                ) == true
            ) {
                orderStatusHeader = responseData.orderStatusWithDate.toString()
            }
        }
        return StickyNonStickyNotificationModel(
            message = orderStatusHeader,
            amount = 0.0,
            subTitle = "",
            timer = "",
            buttonText = "",
            drawableRight = ContextCompat.getDrawable(
                context,
                com.intellihealth.salt.R.drawable.ic_chevron_right_white
            ),
            drawableLeft = getDrawableResourceIdForSticky(
                context,
                responseData?.orderStatusIconName
            ),
            updateColor = responseData?.orderStatusBgColor?:"#178755"

        )

    }

    private fun getDrawableResourceIdForSticky(context: Context, imageName: String?): Drawable? {
        var resourceId = if (imageName == null) {
            context.resources.getIdentifier(
                "ic_order_received_tick",
                "drawable",
                context.packageName
            )
        } else {
            context.resources.getIdentifier(imageName, "drawable", context.packageName)
        }
        return ContextCompat.getDrawable(context, resourceId)

    }


    fun getAddressDetailsData(
        patientDetail: PatientDetail,
        responseData: AddressResponse.ResponseData,
        fromOrderStatus: Boolean
    ): OrderPersonalDetailsModel {
        return OrderPersonalDetailsModel(
            header = if (fromOrderStatus) "Deliver to:" else "Address Details",
            name = patientDetail.patientName,
            addressType = responseData.addressType,
            address = responseData.clubbedAddress,
            pinCode = responseData.pincode?.toLong(),
            phoneNumber = "",
            alternatePhoneNumber = "",
            emailId = ""
        )

    }

    fun getNumberDetails(
        customerOrderDetailsResponseData: CustomerOrderDetailsResponseData?,
        fromOrderStatus: Boolean
    ): OrderPersonalDetailsModel {
        return OrderPersonalDetailsModel(
            header = if (fromOrderStatus) "Get delivery updates on" else "Contact Details",
            name = "Registered number",
            addressType = "",
            address = "",
            pinCode = 0,
            phoneNumber = customerOrderDetailsResponseData?.regMobNumber,
            alternatePhoneNumber = customerOrderDetailsResponseData?.altMobNumber,
            emailId = ""
        )
    }

    fun getCustomerEmailAddress(): OrderPersonalDetailsModel {
        return OrderPersonalDetailsModel(
            header = context.getString(R.string.email_label),
            name = context.getString(R.string.we_will_send_all_updates_related_to_your_order_to_this_email_id),
            addressType = "",
            address = "",
            pinCode = 0,
            phoneNumber = "",
            emailId = "",
            alternatePhoneNumber = ""
        )
    }

    fun getPaymentBottomData(
        bill: BillDetailResponse,
        paymentEnable: Boolean,
        paymentMode: String,
        cashHandlingPayMsg: String?,
        cashHandlingRefundMsg: String?
    ): PaymentContainerModel {

        return PaymentContainerModel(
            paymentMethodIconUrl = if (paymentMode == "COD") "" else bill.responseData.paymentSelectionInfo?.paymentMethodIconUrl
                ?: "",
            payUsingLabel = if (paymentMode == "COD") context.getString(R.string.cod_msg) else "Pay using",
            paymentMode = if (paymentMode == "COD") context.getString(R.string.current_payment_mode) +
                    context.getString(R.string.cash_on_delivery_btn_text) else
                bill.responseData.paymentSelectionInfo?.paymentMethod ?: "",
            paymentMessage = if (paymentMode == "COD") context.getString(R.string.current_payment_mode) +
                    context.getString(R.string.cash_on_delivery_btn_text)
            else "You can pay once order is ready for dispatch",
            payableAmount = bill.responseData.payableAmt ?: 0.0,
            couponIconUrl = bill.responseData.couponIconUrl ?: "",
            couponMessage = if (paymentMode == "COD") SpannableStringBuilder("")
            else SpannableStringBuilder(if (!bill.responseData.couponCode.isNullOrEmpty()) bill.responseData.couponCode + " Applied on your bill" else ""),
            deliveryToLabel = "",
            patientName = "",
            address = "",
            addressType = "",
            pinCode = "",
            deliveryByLabel = "",
            deliveryDate = "",
            btnTitle = if (paymentMode == "COD") "Pay ₹" + convertDecimalFormat(bill.responseData.payableAmt) + " now" else "Pay ₹" + convertDecimalFormat(
                bill.responseData.payableAmt
            ),
            paymentContainerType =
            if (paymentMode == "Online") {
                if (paymentEnable)
                    if (bill.responseData.couponCode != null)
                        if (!bill.responseData.couponCode.isNullOrEmpty())
                            if(bill.responseData.paymentSelectionInfo?.paymentMethod ==BundleConstants.PAYMENT_DEFAULT_OPTION)
                                PaymentContainerType.UPI_ACTIVE_COUPON
                            else
                                PaymentContainerType.UPI_ACTIVE
                        else
                            PaymentContainerType.UPI_ACTIVE
                    else PaymentContainerType.UPI_ACTIVE
                else PaymentContainerType.UPI_DISABLED
            } else {
                PaymentContainerType.COD_ACTIVE
            },
            cashHandlingInfoModel =
            if (paymentMode == "Online") null
            else {
                if (cashHandlingPayMsg.isNullOrEmpty()
                    || cashHandlingRefundMsg.isNullOrEmpty()
                ) null
                else CashHandlingInfoModel(
                    tooltipMsg = cashHandlingRefundMsg,
                    waivedOffCharge = bill.responseData.cashHandlingInfo?.waivedOffCharge ?: 0.0,
                    charge = bill.responseData.cashHandlingInfo?.charge?:0.0,
                    waivedOffMsg = bill.responseData.cashHandlingInfo?.waivedOffMsg,
                    chcMsg=cashHandlingPayMsg
                )
            }

        )

    }

    fun getSavingCardData(
        context: Context,
        bill: BillDetailResponse,
        pageTitle: String?
    ): SavingCardsModel? {
        var tagUrl: Drawable? = null
        if (pageTitle?.contains("cancelled") == true) {
            tagUrl = ContextCompat.getDrawable(
                context,
                com.intellihealth.salt.R.drawable.ic_oops_smiley
            )
        } else {
            tagUrl = ContextCompat.getDrawable(
                context,
                com.intellihealth.salt.R.drawable.ic_celebration
            )
        }
        var saveCardModel: SavingCardsModel? = null
        var savedText = ""
        if (!bill.responseData.savingsText.isNullOrEmpty() && bill.responseData.couldHaveSaved.isNullOrEmpty()) {
            savedText = bill.responseData.savingsText.toString()
            saveCardModel = SavingCardsModel(
                title = savedText,
                titleAmount = bill.responseData.savingValue.toString(),
                titleImageUrl = tagUrl,
                cartType = 0
            )
        } else if (!bill.responseData.savingsText.isNullOrEmpty() && !bill.responseData.couldHaveSaved.isNullOrEmpty()) {
            saveCardModel = SavingCardsModel(
                title = savedText,
                titleAmount = bill.responseData.savingValue.toString(),
                titleImageUrl = tagUrl,
                message = bill.responseData.couldHaveSaved,
                messageAmount = bill.responseData.couldHaveSavedAmount.toString(),
                cartType = 1
            )

        } else if (!bill.responseData.couldHaveSaved.isNullOrEmpty()) {
            saveCardModel = SavingCardsModel(
                title = bill.responseData.couldHaveSaved,
                titleAmount = bill.responseData.couldHaveSavedAmount.toString(),
                titleImageUrl = tagUrl,
                cartType = 0
            )
        }

        return saveCardModel

    }

    fun getDeliveryAccordionData(responseData: OrderStatusResponse.ResponseData?): HistoryAccordionModel? {
        if (responseData?.orderStatusDetailsList == null) return null

        var detailedTimelineModel: List<DetailedTimelineModel?>? = null
        detailedTimelineModel = responseData?.orderStatusDetailsList?.map {
            DetailedTimelineModel(
                title = it.header ?: "",
                subTitle = it.description ?: "",
                iconName = it.iconName ?: "order_status_order_placed",
                iconUrl = "",
                lineColor = it.nextProgressLineColor ?: "#178755",
                borderColor = "#178755",
                statusCardModel = null,
                otherTimelinesEnabled = !it.upcomingStage ?: false
            )
        }
//        todo delivery date,return date,cancel date
        var historyAccordionModel: HistoryAccordionModel? = null
        var buttonText = ""
        var linkText = ""
        var linkTextMsg = ""
        var isReturnDateExist = false
        if (responseData.orderStatusTitle?.contains("cancelled") == false) {
            if (!responseData.orderReturnMessage.isNullOrEmpty()) {
                if (!responseData.returnAllowed) {
                    buttonText = responseData.orderReturnMessage
                } else {
                    linkTextMsg = responseData.orderReturnMessage
                    linkText = "Return Order"
                }
                isReturnDateExist = true
            } else {
                isReturnDateExist = false
            }
        }
        if (detailedTimelineModel != null) {
            historyAccordionModel = HistoryAccordionModel(
                title = responseData.orderStatusWithDate ?: "",
                bottomTxt = if (isReturnDateExist) buttonText else "",
                linkTxt = if (isReturnDateExist) linkText else "",
                linkTxtMessage = if (isReturnDateExist) linkTextMsg else "",
                tmDetailedTimelines = detailedTimelineModel
            )
        }
        return historyAccordionModel
    }

    suspend fun saveAlternateNumberForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        alternateNumber: String
    ): AlternateNumberResponse? {
        var response: AlternateNumberResponse? = null
        when (val alternateNumberResponse =
            orderStatusRepository.saveAlternateNumberForOrder(mxInternalErrorOccurred, orderId, alternateNumber)) {
            is Resource.Success -> {
                try {
                    alternateNumberResponse.let {
                        response = it.value?.body()!!
                    }
                } catch (e: Exception) {

                }
            }

            is Resource.Failure -> {
                alternateNumberResponse.errorCode?.let {
                    alternateNumberResponse.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            alternateNumberResponse.errorCode,
                            resErrorBody, alternateNumberResponse.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return response
    }

    suspend fun saveCustomerEmailAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        emailId: String?,
        transactionId: String?
    ): SaveEmailResponse? {
        var response : SaveEmailResponse ? = null
        when (val alternateEmailResponse =
            orderStatusRepository.saveCustomerEmailAddress(
                mxInternalErrorOccurred,
                customerId = customerId,
                emailId = emailId,
                transactionId = transactionId
            )) {
            is Resource.Success -> {
                try {
                    val statusCode = alternateEmailResponse.value?.code()
                    val isSuccessful = alternateEmailResponse.value?.isSuccessful
                    response = if(statusCode == 200 && isSuccessful == true){
                        alternateEmailResponse.value.body()
                    }else {
                        val errorResponse = Gson().fromJson(
                            alternateEmailResponse.value?.errorBody()?.string(),
                            SaveEmailResponse::class.java
                        )
                        errorResponse
                    }
                } catch (e: Exception) {
                    Log.d("TAG", "saveCustomerEmailAddress: ${e.printStackTrace()}")
                }
            }

            is Resource.Failure -> {
                alternateEmailResponse.errorCode?.let {
                    alternateEmailResponse.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            alternateEmailResponse.errorCode,
                            resErrorBody, alternateEmailResponse.isNetworkError
                        )
                    }
                }
            }

            else -> {}
        }
        return response
    }

    suspend fun generateReturnUrlApiCall(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
    ): GenerateReturnUrlResponse? {
        var response: GenerateReturnUrlResponse? = null
        when (val generateReturnUrlResponse =
            orderStatusRepository.generateReturnUrlResponse(mxInternalErrorOccurred, orderId)) {
            is Resource.Success -> {
                try {
                    generateReturnUrlResponse.let {
                        response = it.value?.body()!!
                        if (!it.value.isSuccessful) {
                            try {
                                mxInternalErrorOccurred.errorCode = it.value.code()
                                mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                    it.value.errorBody()?.string(),
                                    ApiCoreResponse::class.java
                                ).message
                                sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                            } catch (_: Exception) {
                            }
                        }
                    }
                } catch (e: Exception) {

                }
            }

            is Resource.Failure -> {
                generateReturnUrlResponse.errorCode?.let {
                    generateReturnUrlResponse.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            generateReturnUrlResponse.errorCode,
                            resErrorBody, generateReturnUrlResponse.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return response
    }


    private suspend fun setErrorResponseBody(
        errorCode: Int,
        errorBody: ResponseBody,
        isNetworkError: Boolean
    ): ResponseData {
        return ResponseData(errorCode, errorBody, isNetworkError)
    }

    private fun getProgressBarColor(orderStatusBgColor: String?): Int {
        return when (orderStatusBgColor) {
            "#FFCA62" -> OrderStatusConstants.CardColor.CARD_COLOR_YELLOW
            else -> OrderStatusConstants.CardColor.CARD_COLOR_GREEN
        }
    }

    private fun convertDecimalFormat(payableAmt: Double?): String {
        val symbols = DecimalFormatSymbols(Locale.US)
        val decimalFormat = DecimalFormat("#.00", symbols)
        return decimalFormat.format(payableAmt)
    }

    private fun isReturnWindowClosed(givenDateStr: String): Boolean {
        var returnWindowClosed = false
        try {
            val dateFormatGiven = SimpleDateFormat("dd MMM", Locale.ENGLISH)
            val givenDate: Date = dateFormatGiven.parse(givenDateStr) ?: Date()

            val dateFormatFormatted = SimpleDateFormat("dd MM yyyy", Locale.ENGLISH)
            val formattedGivenDate = dateFormatFormatted.format(givenDate)
            val currentDate = Calendar.getInstance().time
            val formattedCurrentDate = dateFormatFormatted.format(currentDate)
            val comparisonResult = formattedGivenDate.compareTo(formattedCurrentDate)

            returnWindowClosed = when {
                comparisonResult < 0 -> true
                comparisonResult == 0 -> false
                else -> false
            }
        } catch (e: Exception) {

        }
        return returnWindowClosed
    }

    suspend fun deleteAlternateNumberForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long
    ): DeleteAlternateNumberResponse? {
        var response: DeleteAlternateNumberResponse? = null
        when (val deleteNumberResponse =
            orderStatusRepository.deleteAlternateNumberForOrder(mxInternalErrorOccurred, orderId)) {
            is Resource.Success -> {
                try {
                    deleteNumberResponse.let {
                       response = it.value?.body()
                    }
                } catch (_: Exception) {

                }
            }

            is Resource.Failure -> {
                deleteNumberResponse.errorCode?.let {
                    deleteNumberResponse.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            deleteNumberResponse.errorCode,
                            resErrorBody, deleteNumberResponse.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return response
    }
}