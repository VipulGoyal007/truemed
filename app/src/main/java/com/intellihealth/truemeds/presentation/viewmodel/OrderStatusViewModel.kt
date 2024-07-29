package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.gson.JsonObject
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.DetailedTimelineModel
import com.intellihealth.salt.models.DoctorCallCardModel
import com.intellihealth.salt.models.FooterBillItem
import com.intellihealth.salt.models.HistoryAccordionModel
import com.intellihealth.salt.models.NotificationType
import com.intellihealth.salt.models.OrderPersonalDetailsModel
import com.intellihealth.salt.models.OrderTrackerModel
import com.intellihealth.salt.models.OrderedItemCardModel
import com.intellihealth.salt.models.PaymentContainerModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.models.ReminderCardModel
import com.intellihealth.salt.models.SavingCardsModel
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.salt.models.TooltipProductCardModel
import com.intellihealth.salt.utils.formatDecimal
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxAlternateContactSaved
import com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxOrderStatusViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxPaymentPendingViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderBottomSheetViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet
import com.intellihealth.truemeds.data.model.mixpanel.MxVideoFloaterClicked
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.CustomerOrderDetailsResponseData
import com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.model.orderflow.PatientDetail
import com.intellihealth.truemeds.data.model.orderstatus.AlternateNumberResponse
import com.intellihealth.truemeds.data.model.orderstatus.DoctorRating
import com.intellihealth.truemeds.data.model.orderstatus.ModificationItem
import com.intellihealth.truemeds.data.model.orderstatus.OrderStatusResponse
import com.intellihealth.truemeds.data.model.ordersummary.AddressResponse
import com.intellihealth.truemeds.data.model.reminder.ReminderListModel
import com.intellihealth.truemeds.data.repository.datasource.local.entity.PillReminder
import com.intellihealth.truemeds.data.repository.datasource.local.entity.SaveVideoFAQ
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.domain.usecase.OrderStatusUseCase
import com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase
import com.intellihealth.truemeds.domain.usecase.ReminderUseCase
import com.intellihealth.truemeds.domain.usecase.ReorderUseCase
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPageVisited
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxViewDetailsClicked
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.forEachUntil
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.utils.roundOffDecimal
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

/*private val orderFlowUseCase: OrderFlowUseCase,
private var localDbUseCase: LocalDbUseCase,*/

@HiltViewModel
class OrderStatusViewModel @Inject constructor(
    private val orderStatusUseCase: OrderStatusUseCase,
    private val reminderUseCase: ReminderUseCase,
    private var reorderUseCase: ReorderUseCase,
    private var paymentOptionsUseCase: PaymentOptionsUseCase,
    private var loginUseCase: LoginUseCase,
    private var homePageUseCase: HomePageUseCase,
    private var userDataUseCase: UserDataUseCase,
    @ApplicationContext private val context: Context
) :
    BaseViewModel(),
    DefaultLifecycleObserver {
    var notificationData: MutableLiveData<StickyNonStickyNotificationModel>? = MutableLiveData()
    var orderPlaceModel: MutableLiveData<OrderTrackerModel?>? = MutableLiveData()

    var reminderCardModel = MutableLiveData<ReminderCardModel>()

    var orderedItemsList: MutableLiveData<List<OrderedItemCardModel>> = MutableLiveData(emptyList())

    var modificationItemsList: List<ProductInfoModel> = emptyList()
    var replaceItemList: List<TooltipProductCardModel> = emptyList()

    var orderPersonalAddressModel: MutableLiveData<OrderPersonalDetailsModel> = MutableLiveData()
    var orderPersonalMobileDetail: MutableLiveData<OrderPersonalDetailsModel> = MutableLiveData()
    var orderPersonalEmailDetail: MutableLiveData<Boolean> = MutableLiveData()
    var paymentContainerModel: MutableLiveData<PaymentContainerModel> = MutableLiveData()
    var doctorCallCardModel: MutableLiveData<DoctorCallCardModel> = MutableLiveData()
    var billDetails = MutableLiveData<BillDetailsModel>()
    var billDetailsResponse = MutableLiveData<BillDetailResponse>()
    var detailedTimeLineDataList: MutableLiveData<List<DetailedTimelineModel>> = MutableLiveData()
    var prescriptionList = MutableLiveData<List<String>>(emptyList())
    val prescriptions = MutableLiveData<List<OrderRxInfo>>(emptyList())
    val combinedModificationList: MutableLiveData<List<ModificationItem>> = MutableLiveData()
    var savingCardData: MutableLiveData<SavingCardsModel>? = MutableLiveData()
    var deliveryAccordionData: MutableLiveData<HistoryAccordionModel?>? = MutableLiveData()
    var showShimmerLiveData = MutableLiveData(true)
    var list = arrayListOf<String>()
    var orderID = ""
    var orderStatusResponseData: MutableLiveData<OrderStatusResponse.ResponseData?> =
        MutableLiveData()
    var pageTitle: MutableLiveData<String?> = MutableLiveData()
    var reminderDataExist: MutableLiveData<Boolean> = MutableLiveData()
    var orderIdExistForReminder: MutableLiveData<Boolean> = MutableLiveData()
    var isShowVideoPopup: MutableLiveData<Boolean> = MutableLiveData()
    var alternateNumberResponse: MutableLiveData<AlternateNumberResponse?> =
        MutableLiveData()
    var patientIdForReminder: MutableLiveData<Long> = MutableLiveData()
    var editReminderDate: String = ""
    var editReminderFrequency: Int = 0
    var editReminderDeleteId: Long = 0
    var doctorRating: MutableLiveData<DoctorRating?> = MutableLiveData()
    var patientName: MutableLiveData<String> = MutableLiveData()
    var patientId: MutableLiveData<Long?> = MutableLiveData()
    var gifUrlVertical: MutableLiveData<String> = MutableLiveData()
    var bannerList: MutableLiveData<List<BannerItemModel>> = MutableLiveData()
    var videoUrl: MutableLiveData<String> = MutableLiveData()
    var videoId = 0
    var videoName = ""
    var orderStatusTitle: MutableLiveData<String> = MutableLiveData()
    var notificationType: MutableLiveData<NotificationType> =
        MutableLiveData(NotificationType.ORDER_RECEIVED)
    var doctorId: MutableLiveData<Int> = MutableLiveData()
    var paymentSelectionInfo: MutableLiveData<BillDetailResponse.ResponseData.PaymentSelectionInfo?> =
        MutableLiveData()
    var orderDate: MutableLiveData<String?> = MutableLiveData()
    var deliveryPartnerName: MutableLiveData<String?> = MutableLiveData()
    var deliveryPartnerContact: MutableLiveData<String?> = MutableLiveData()
    var clickPostTrackingUrl: MutableLiveData<String?> = MutableLiveData()
    var returnOrderUrl: MutableLiveData<String?> = MutableLiveData()
    var savingValue: MutableLiveData<Double?> = MutableLiveData()
    var showCancelButton: MutableLiveData<Boolean> = MutableLiveData()
    var clickedOnPage = ""
    var isDeleteNumberSuccessFully = false
//    var pageSection=""

    /*private val launchOrderSummary = MutableLiveData<Event<Any>>()
    val eventLaunchOrderSummary: LiveData<Event<Any>> get() = launchOrderSummary*/
//    fun launchOrderSummary() = launchOrderSummary.postValue(Event(Any()))
    val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> get() = _isLoading
    val showError = MutableLiveData<String>(null)
    var paymentEnable: Boolean = false
    var addressData: AddressResponse? = null
    var patientData: GetPatientDetailsResponse? = null
    var eventItemNames: MutableList<String> = mutableListOf()
    var eventProductsIds: MutableList<String> = mutableListOf()
    var customerOrderDetailsResponseData: CustomerOrderDetailsResponseData? = null
    var currentOrderStatus: Int = 0
    var currentOrderState: String = ""
    var deliveryDays: Int = 0
    var subsId: Int = 0
    var rxRequired: Boolean? = null
    var isChronicAdded: Boolean? = null
    var isReOrder: Boolean? = null
    var edd: String? = null
    var mxInternalErrorOccurred = MxInternalErrorOccurred()
    var mxOrderStatusBill: BillDetailResponse? = null
    var isFromDeleteAlternateNumber: Boolean = false
    var showToast = MutableLiveData<String>(null)

    var cashHandlingPayMsg :String?= null
    var cashHandlingRefundMsg : String?= null


    companion object {
        var isSubsAddedOrderStatus = false
        var isChroniceOrderStatus = false
        var isGenericAdded = false
    }

    /**
     * Set Order tracker data in orderPlaceModel
     * This data returns the current state of order
     * **/
    fun setOrderTrackerData(orderId: Long, fromOrderStatus: Boolean) {
        var orderStatusData: OrderStatusResponse? = null
        viewModelScope.launch(Dispatchers.IO) {
            orderID = orderId.toString()
            orderStatusData = orderStatusUseCase.getOrderStatusAndDetailsData(
                mxInternalErrorOccurred, orderId,
                SharedPrefManager.getInstance().loggedInUserId
            )

            orderStatusData?.responseData?.let {
                showCancelButton.postValue(orderStatusData?.responseData?.showCancelButton)
                orderStatusResponseData.postValue(it)
                pageTitle.postValue(it.pageTitle)
                currentOrderStatus = it.currentOrderStatus ?: 0
                currentOrderState = it.currentOrderState ?: ""
                deliveryDays = it.deliveryDays ?: 0
                rxRequired = it.rxRequired
                edd = it.deliveryBy ?: ""
                cashHandlingRefundMsg=it.cashHandlingRefundMsg
                cashHandlingPayMsg=it.cashHandlingPayMsg
                notificationData?.postValue(
                    orderStatusUseCase.getStickyOrderStatusData(
                        context,
                        it,
                        fromOrderStatus
                    )

                )
                clickPostTrackingUrl.postValue(it.clickpostUrl)
                if (fromOrderStatus) {
                    if (it.timeLineCard != null) {
                        val orderTrackerData =
                            orderStatusUseCase.getOrderTrackerData(context, it, false)
                        orderPlaceModel?.postValue(orderTrackerData)
                        detailedTimeLineDataList.postValue(
                            orderStatusUseCase.getDetailedTimeLineData(
                                it
                            )
                        )
                    }
                } else {
                    deliveryAccordionData?.postValue(orderStatusUseCase.getDeliveryAccordionData(it))
                }

                orderDate.postValue(it.orderDate)

                doctorCallCardModel.postValue(orderStatusUseCase.getDoctorCallData(orderStatusData?.responseData?.doctorDetails))
                doctorId.postValue(orderStatusData?.responseData?.doctorDetails?.doctorId)

                if (it.orderStatusTitle.toString().contains("cancelled", ignoreCase = true)) {
                    orderStatusTitle.postValue(it.orderStatusWithDate.toString())
                    notificationType.postValue(NotificationType.ORDER_CANCELLED)
                } else if (it.orderStatusTitle.toString()
                        .contains("delivered", ignoreCase = true)
                ) {
                    orderStatusTitle.postValue(it.orderStatusWithDate.toString())
                    notificationType.postValue(NotificationType.ORDER_RECEIVED)
                } else if (it.orderStatusTitle.toString().contains("payment", ignoreCase = true)) {
                    notificationType.postValue(NotificationType.PAYMENT_PENDING)
                } else if (it.orderStatusTitle.toString().contains("missed", ignoreCase = true)) {
                    notificationType.postValue(NotificationType.MISSED_CALL)
                } else if (it.orderStatusTitle.toString().contains("pending", ignoreCase = true)) {
                    notificationType.postValue(NotificationType.DR_CALL_PENDING)
                } else if (it.orderStatusTitle.toString()
                        .contains("reattempted", ignoreCase = true)
                ) {
                    notificationType.postValue(NotificationType.PAYMENT_PENDING)
                } else {
                    notificationType.postValue(NotificationType.ORDER_RECEIVED)
                }
                paymentEnable = it.paymentEnable

                setBillDetailsData(
                    orderId = orderId,
                    it.paymentEnable,
                    it.orderStatusTitle.toString(),
                    it.paymentDone, it.timeLineCard?.actionButtonText.toString(),
                    fromOrderStatus
                )

                if (it.videoFaqDTOList.isEmpty()) return@launch
                it.videoFaqDTOList.let { video ->
                    gifUrlVertical.postValue(video[0]?.gifUrl ?: "")
                    videoUrl.postValue(video[0]?.videoUrl ?: "")
                    videoId = video[0]?.videoFaqId ?: 0
                    videoName = video[0]?.title.toString()
                    bannerList.postValue(
                        listOf(
                            BannerItemModel(

                                id = 0,
                                video[0]?.thumbnailUrl ?: ""
                            )
                        )
                    )
                    checkOrderOpenFirstTimeForVideo(orderId)
                    /*sdkEventUseCase.sendVideoFloaterImpressionEvent(MxVideoFloaterClicked(orderId = orderId.toString(),
                        videoId = videoId.toString(), videoName = videoName,whId=SharedPrefManager.getInstance().selectedWarehouseID
                    ))*/
                }
            }

        }
        setOrderedItemListData(orderId, fromOrderStatus)
        setCustomerCategory()


    }

    fun sendVideoFloaterImpressionEvent(orderId: String) {
        sdkEventUseCase.sendVideoFloaterImpressionEvent(
            MxVideoFloaterClicked(
                orderId = orderId.toString(),
                videoId = videoId.toString(),
                videoName = videoName,
                whId = SharedPrefManager.getInstance().selectedWarehouseID
            )
        )
    }

    /**
     * This is used for showing sticky top bottom bar
     * This data returns the to show current order status e.g.order received..
     * **/
    fun stickyOrderStatusData() {
//        savingCardData?.value = orderStatusUseCase.getSavingCardData(context)
//        deliveryAccordionData?.value = orderStatusUseCase.getDeliveryAccordionData()
    }

    /**
     * This is used for showing reminder card value either set reminder or edit reminder
     * **/
    fun getReminderData(patientId: Long) {
        if (isNetworkAvailable(context)) {
            viewModelScope.launch(Dispatchers.IO) {
                val reminderList: ArrayList<ReminderListModel.ReminderList> = arrayListOf()
                val response = reminderUseCase.getReminderData(
                    mxInternalErrorOccurred,
                    SharedPrefManager.getInstance().loggedInUserId,
                    patientId
                )
                if (response != null) {
                    val list = response.responseData
                    if (list.isNullOrEmpty()) {
                        reminderDataExist.postValue(false)
                        reminderCardModel?.postValue(
                            ReminderCardModel(
                                "", "Set reminder call for next order",
                                "",
                                "", ""
                            )
                        )
                    } else {
                        list.forEach {
                            reminderList.add(it.toReminderListModel())
                        }
                        reminderCardModel?.postValue(
                            ReminderCardModel(
                                "",
                                time = "Next reminder date: " + DateUtils.changeDateFormat(list[0].reminderDate!!),
                                "Reminder call set for every " + list[0].frequency + " days",
                                "",
                                ""
                            )
                        )
                        editReminderDate = list[0].reminderDate.toString()
                        editReminderFrequency = list[0].frequency ?: 0
                        editReminderDeleteId = list[0].toReminderListModel().id
                        reminderDataExist.postValue(true)
                    }
                    patientIdForReminder.postValue(patientId)
                }

            }
        }
    }


    /**
     * This is used for setting all ordered items
     * This include view more and view less items
     * **/
    fun setOrderedItemListData(orderId: Long, fromOrderStatus: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.IO) {
                val response = orderFlowUseCase.getOrderMedicineDetails(
                    mxInternalErrorOccurred,
                    orderId
                ).responseData?.toSDKObject() ?: listOf()
                orderedItemsList.postValue(response)
                for (index in response.indices) {
                    eventItemNames.add(index, response[index].productDetailModel.product.skuName)
                    eventProductsIds.add(
                        index,
                        response[index].productDetailModel.product.productCode
                    )
                }
                response.forEachUntil { model -> //This loop will break when cxAcceptedSubs==true
                    isSubsAddedOrderStatus = model.productDetailModel.product.cxAcceptedSubs
                    model.productDetailModel.product.cxAcceptedSubs// Means , break here if True
                }

            }

            withContext(Dispatchers.IO) {
                setAddressDetailsData(orderId, fromOrderStatus)
                setMobileNumber(orderId, fromOrderStatus)
                getRxForOrder(orderId)
                checkOrderIdExistForReminder(orderId)

            }


        }

    }

    /*fun setModificationItemList() {
        combinedModificationList.value = orderStatusUseCase.getModificationItemList()
    }*/

    /**
     * This is used for setting bill details
     * **/
    //todo payment button status enable disable
    fun setBillDetailsData(
        orderId: Long,
        paymentEnable: Boolean,
        pageTitle: String,
        paymentDone: Boolean,
        actionBtnText: String,
        fromOrderStatus: Boolean
    ) =

        viewModelScope.launch(Dispatchers.IO) {
            orderFlowUseCase.calculateBillDetailsforApp(mxInternalErrorOccurred, orderId, true)
                .let { bill ->
                    if (bill != null) {
                        mxOrderStatusBill = bill
                        var hideSaveMsg = false
                        var savedText = ""
                        if (bill.responseData == null) return@launch
                        if (pageTitle.contains("cancelled") || pageTitle.contains("delivered") ||
                            bill.responseData.savingValue?.toInt() == 0
                        ) {
                            hideSaveMsg = true
                        }
                        var strikePackagingCharge = 0.0
                        bill.responseData.packagingCharge?.let {
                            strikePackagingCharge = 3 * it
                        }
                        bill.responseData.savingValue?.let {
                            if (!bill.responseData.savingsText.isNullOrEmpty()) {
                                savedText = bill.responseData.savingsText.toString()
                            } else {
                                savedText = ""
                            }
                        }
                        bill.responseData.couldHaveSaved?.let {
                            if (!bill.responseData.couldHaveSaved.isNullOrEmpty()) {
                                savedText = bill.responseData.couldHaveSaved.toString()
                            } else {
                                savedText = ""
                            }
                        }
                        val billDetailFooterList = arrayListOf<FooterBillItem>()
                        if (!bill.responseData.cashHandlingRefundMsg.isNullOrEmpty()) {
                            billDetailFooterList.add(
                                FooterBillItem(
                                    iconDrawable = R.drawable.wallet_icon_chc,
                                    iconUrl = null,
                                    title = bill.responseData.cashHandlingRefundMsg
                                )
                            )
                        }
                        val billData = convertToBillDetails(
                            bill.responseData,
                            "Bill Details",
                            totalPayable = bill.responseData.payableAmt.toString(),
                            gst = context.getString(R.string.gst),
                            sellerPackagingCharge = context.getString(R.string.seller_packaging_charges),
                            "₹" + bill.responseData.savingValue.toString(),
                            if (hideSaveMsg) "" else savedText,
                            strikePackagingCharge,
                            fromOrderStatus,
                            billDetailFooterList

                        )
                        billDetails.postValue(billData)
                        bill.let {
                            billDetailsResponse.postValue(it)

                        }

                        paymentSelectionInfo.postValue(bill.responseData.paymentSelectionInfo)
                        savingValue.postValue(bill.responseData.savingValue)
                        if (!paymentDone) {
                            setPaymentBottomData(bill, paymentEnable)
                        }
                        savingCardData?.postValue(
                            orderStatusUseCase.getSavingCardData(
                                context,
                                bill,
                                pageTitle
                            )
                        )
                        eventOrderStatusViewed(bill)
                        if (actionBtnText.contains("pay", ignoreCase = true)) {
                            sendPaymentPendingSheetViewed(
                                MxPaymentPendingViewed(
                                    clickedOnPage = "order_status",
                                    estimatedPayableAmount = bill.responseData.payableAmt,
                                    orderId = orderId.toString(),
                                    cashHandlingCharge = if (bill.responseData.pspViewed) bill.responseData.cashHandlingInfo?.charge ?: 0.0 else null,
                                    cashHandlingChargeApplicable = if (bill.responseData.pspViewed) CommonFunc.getApplicableCashHandlingCharger(bill.responseData) else null
                                )
                            )
                        }
                    }

                }
        }

    fun setAddressDetailsData(orderId: Long, fromOrderStatus: Boolean) {

        if (isNetworkAvailable(context)) {
            viewModelScope.launch(Dispatchers.IO) {
                addressData = orderFlowUseCase.getAllAddress(
                    mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
                    orderId
                )
                patientData = orderFlowUseCase.getOrderPatientDetails(
                    mxInternalErrorOccurred, orderId,
                    SharedPrefManager.getInstance().loggedInUserId
                )
                if (patientData != null && addressData != null) {
                    orderPersonalAddressModel.postValue(
                        orderStatusUseCase.getAddressDetailsData(
                            patientData?.responseData?.get(0) ?: PatientDetail(),
                            addressData?.responseData?.get(0) ?: AddressResponse.ResponseData(),
                            fromOrderStatus
                        )
                    )
                }
                patientData?.responseData?.let {
                    patientName.postValue(it[0].patientName ?: "")
                    SharedPrefManager.getInstance().patientName = it[0].patientName ?: ""
                    patientId.postValue(it[0].patientId ?: 0)
                    if (fromOrderStatus) {
                        getReminderData(
                            it[0].patientId ?: 0
                        )
                    }
                }

            }
        }
    }

    fun getCustomerEmailIdCard() = orderStatusUseCase.getCustomerEmailAddress()

    private fun setMobileNumber(orderId: Long, fromOrderStatus: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = orderFlowUseCase.getOrderDetails(
                mxInternalErrorOccurred, orderId,
                SharedPrefManager.getInstance().loggedInUserId
            )
            response?.responseData.let {
                orderPersonalMobileDetail.postValue(
                    orderStatusUseCase.getNumberDetails(
                        it,
                        fromOrderStatus
                    )
                )
                customerOrderDetailsResponseData = it
                deliveryDays = it?.deliveryDays ?: 0
                subsId = it?.subsId ?: 0
                isReOrder = it?.reorder
                edd = it?.edd
                isChroniceOrderStatus = it?.chronic ?: false
                isGenericAdded = it?.isGeneric ?: false
            }
        }

    }

    fun saveCustomerEmailAddress(
        customerId: String = SharedPrefManager.getInstance().loggedInUserId,
        emailId: String? = null,
        transactionId: String? = null
    ) = viewModelScope.launch(Dispatchers.IO) {
        val checkValidationResponse = loginUseCase.checkEmailId(emailId)
        if (checkValidationResponse.isValid) {
            orderStatusUseCase.saveCustomerEmailAddress(
                mxInternalErrorOccurred,
                customerId,
                emailId,
                transactionId
            )?.let {
                if (it.statusCode == 200) {
                    showToast.postValue(
                        it.message ?: context.getString(R.string.email_id_saved_successfully)
                    )
                    saveEmailAddress(emailId)
                    showError.postValue("")
                } else {
                    showError.postValue(it.message ?: context.getString(R.string.enterEmail))
                }
            }
        } else {
            showError.postValue(context.getString(R.string.enterEmail))
        }
    }

    private fun saveEmailAddress(emailId: String?) {
        emailId?.let {
            SharedPrefManager.getInstance().setUserEmail(it)
        }
        orderPersonalEmailDetail.postValue(false)
    }

    private fun setPaymentBottomData(billData: BillDetailResponse, paymentEnable: Boolean) {
        if ((billData.responseData.mrp ?: 0.0) > 0.0) {
            if (billData.responseData.paymentMode != "COD") {
                paymentContainerModel.postValue(
                    orderStatusUseCase.getPaymentBottomData(
                        billData,
                        paymentEnable,
                        "Online",
                        null,
                        null
                    )
                )
            } else {
                if (paymentEnable) {
                    paymentContainerModel.postValue(
                        orderStatusUseCase.getPaymentBottomData(
                            billData,
                            true,
                            "COD",
                            cashHandlingPayMsg,
                            cashHandlingRefundMsg
                        )
                    )
                }
            }
        }
    }


    fun getRxForOrder(orderId: Long) {
        if (orderId > 0) {
            viewModelScope.launch(Dispatchers.IO) {
                val response = orderFlowUseCase.getOrderRx(mxInternalErrorOccurred, orderId)
                response?.let {
                    val listTemp = it.responseData.rxList ?: listOf()
                    if (listTemp.isNotEmpty()) {
                        var finalList = mutableListOf<OrderRxInfo>()
                        /*finalList.add(
                            OrderRxInfo(
                                orderId,
                                null,
                                null
                            )
                        )*/
                        finalList.addAll(listTemp)
                        prescriptions.postValue(finalList.toList())
                        finalList.map {
                            orderID = it.orderId.toString()
                            it.imageUrl?.let { it1 -> list.add(it1) }
                            prescriptionList.postValue(list)
                        }
                    } else {
                        prescriptions.postValue(emptyList())
                    }
                }
            }
        }
    }

    /*fun getPrescriptionImages(orderId: Long) = viewModelScope.launch {
        val response = orderFlowUseCase.getPrescriptionImages(orderId)
        response?.responseData?.map {
            orderID = it.orderId.toString()
            list.add(it.imageUrl)
            prescriptionList.postValue(list)
        }
    }*/


    //todo
    private fun convertToBillDetails(
        billModel: BillDetailResponse.ResponseData,
        billDetailsTitle: String,
        totalPayable: String,
        gst: String,
        sellerPackagingCharge: String,
        saveOrderPrice: String,
        savedOrderMessage: String,
        strikePackagingCharge: Double,
        fromOrderStatus: Boolean,
        billDetailFooterList: ArrayList<FooterBillItem>
    ): BillDetailsModel = BillDetailsModel(
        billDetailsTitle = billDetailsTitle,
        savedOrderMessage = savedOrderMessage,
        savedOrderPrice = saveOrderPrice,
        mrpValue = billModel.mrp,
        discountValue = billModel.discount,
        couponName = billModel.couponCode,
        couponValue = billModel.couponDiscountAmt,
        taxesAndChargesValue = billModel.packagingCharge,
        deliveryChargesValue = billModel.deliveryCharge,
        waiveOffDeliveryCharge = billModel.waiveOffDeliveryCharge,
        tmCreditValue = billModel.tmCredit,
        tmRewardValue = billModel.tmCash,
        isTypePharmacistPaymentOn = false,
        isTypePharmacistPaymentOff = false,
        estimatedPayableValue = billModel.payableAmt,
        // paymentModeValue = billModel.paymentMode,
        //paymentModeValue set with new api parameter as per new requirement
        paymentModeValue = billModel.paymentSelectionInfo?.paymentMethod ?: billModel.paymentMode,
        isTooltipForDeliveryCharges = false,
        tooltipDeliveryChargeValue = "",
        tooltipEstimatedPayableValue = if (fromOrderStatus) context.getString(R.string.tooltip_estimated_payable_message) else "",
        isTooltipForEstimatedPayable = fromOrderStatus,
        isTooltipForTaxesCharges = billModel.packagingCharge!! > 0,
        tooltipTaxesChargesHeaderLeft = gst, //context.getString(R.string.gst)
        tooltipTaxesChargesBodyLeft = sellerPackagingCharge, //context.getString(R.string.seller_packaging_charges),
        tooltipTaxesChargesBodyRight = "₹" + formatDecimal(billModel.packagingCharge!!),
        tooltipTaxesChargesBodyRightStroked = "₹${formatDecimal(strikePackagingCharge)}",
        tooltipTaxesChargesHeaderRight = "Included in MRP",
        isFreeDelivery = (billModel.deliveryCharge == 0.0),
        sellingPrice = billModel.sellingPrice,
        mxCouponAppliedAmount = billModel.couponAppliedAmt ?: 0.0,
        cashHandlingInfoModel = billModel.cashHandlingInfo,
        footerList = billDetailFooterList
    )

    fun addAlternateNumberClick(orderId: Long, alternateNumber: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val checkValidationResponse = loginUseCase.checkPhoneNumber(alternateNumber)
            if (checkValidationResponse.isValid) {
                with(
                    orderStatusUseCase.saveAlternateNumberForOrder(
                        mxInternalErrorOccurred, orderId,
                        alternateNumber
                    )
                ) {
                    setMobileNumber(orderId, true)
                    showError.postValue("")
                    sdkEventUseCase.sendAlternateContactSavedEvent(
                        MxAlternateContactSaved(
                            currentContact = SharedPrefManager.getInstance().loggedInUserMobile,
                            orderId = orderId.toString(),
                            alternateContact = alternateNumber,
                            whId = SharedPrefManager.getInstance().selectedWarehouseID
                        )
                    )
                }
            } else {
                showError.postValue("Please enter a valid mobile number")
            }
        }
    }

    fun checkOrderIdExistForReminder(orderId: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            val lstReminder: List<PillReminder> =
                localDbUseCase.getPillReminderUsingOrderId(orderId)
            if (lstReminder.isNotEmpty()) {
                orderIdExistForReminder.postValue(true)
            } else {
                orderIdExistForReminder.postValue(false)
            }
        }

    }

    fun insertPillReminder(pillReminder: PillReminder) {
        viewModelScope.launch(Dispatchers.IO) {
            localDbUseCase.insertPillReminder(pillReminder)
        }
    }

    fun checkOrderOpenFirstTimeForVideo(orderId: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            val lstVideoFAQ: List<SaveVideoFAQ> = localDbUseCase.getSavedVideOFAQ(orderId)
            if (lstVideoFAQ.isNotEmpty()) {
                isShowVideoPopup.postValue(false)
            } else {
                isShowVideoPopup.postValue(true)
            }
        }

    }

    fun insertSaveVideoFAQ(saveVideoFAQ: SaveVideoFAQ) {
        viewModelScope.launch(Dispatchers.IO) {
            localDbUseCase.insertSaveVideoFAQ(saveVideoFAQ)
        }

    }

    fun submitDoctorRating(jsonObject: JsonObject, orderId: Long) {
        viewModelScope.launch {
            val rating = orderFlowUseCase.submitDoctorRating(mxInternalErrorOccurred, jsonObject)
            doctorRating.postValue(rating)

        }
    }

    fun getReorder(
        orderId: Long?,
        customerId: String?,
        patientListDto: ArrayList<Long?>?,
        variant: String?,
        checkAutoConfirmEligibility: Boolean,//true
        newAlgo: Boolean,
        serialId: Int?,
        reOrderMedCheck: Boolean,
        variantId: Long?
    ) = viewModelScope.launch(Dispatchers.IO) {
        reorderUseCase.reOrder(
            mxInternalErrorOccurred, orderId,
            customerId,
            patientListDto,
            variant,
            checkAutoConfirmEligibility,
            newAlgo,
            serialId,
            reOrderMedCheck,
            variantId
        )?.let { bannerResponse ->
            SharedPrefManager.getInstance()
                .setIsReOder(bannerResponse?.responseData?.isReOrder ?: false)
            bannerResponse?.responseData?.orderId?.let {
                /*if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                    orderFlowUseCase.discardOrder(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        SharedPrefManager.getInstance().loggedInUserId.toLong()
                    )
                }*/
                localDbUseCase.clearCart()
                localDbUseCase.clearCrossSellingProducts()
                SharedPrefManager.getInstance().incompleteOrderId = it
                getMedicineOrderDetailsList(mxInternalErrorOccurred, it, true)
                /*val response = orderFlowUseCase.getOrderMedicineDetails(SharedPrefManager.getInstance().incompleteOrderId)
                if (response != null && response.statusCode == 200) {
                    cartMedicineListResponse = response.responseData ?: listOf()
                }
                launchOrderSummary()*/
//                _isLoading.postValue(false)
            }
        }.run { /*_isLoading.postValue(false)*/ }
    }

    /**
     * This function is used to change the payment method selection
     * **/
    /*fun setPaymentSelectionMethod(data: Intent) {
        viewModelScope.launch(Dispatchers.IO) {

            val response = paymentOptionsUseCase.setPaymentSelectionMethod(
                data.getLongExtra(BundleConstants.ORDER_ID, 0),
                data.getLongExtra(BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID, 0),
                data.getStringExtra(BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD)
                    .toString()
            )
            if (response) {
                setBillDetailsData(data.getLongExtra(BundleConstants.ORDER_ID, 0), true, "", false)
            }
        }
    }*/

    fun generateReturnUrlApiCall(orderId: Long) {
        viewModelScope.launch {
            var generateReturnUrlResponse =
                orderStatusUseCase.generateReturnUrlApiCall(mxInternalErrorOccurred, orderId)
            generateReturnUrlResponse?.responseData?.redirectUrl.let {
                returnOrderUrl.postValue(it)
            }
//            returnOrderUrl.postValue("https://truemeds.clickpost.in/returns?security_key=fd533d76-a441-4ac5-92fe-3f191c8f06fb&waybill=3128934204294")
        }
    }


    fun getDoctorCallMeBack(orderId: Long) {
        val orderTrackerData =
            orderStatusUseCase.getOrderTrackerData(context, orderStatusResponseData.value, true)
        orderPlaceModel?.postValue(orderTrackerData)
        viewModelScope.launch(Dispatchers.IO) {
            val response = homePageUseCase.increaseDigitizedOrderRank(
                mxInternalErrorOccurred, orderId,
                ""
            )
            if (response != null) {
                setOrderTrackerData(orderId, true)
            }
        }
    }

    private fun setCustomerCategory() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val ftcCategoryVariant = localDbUseCase.getCustomerCategory("FTC_DynamicDiscount")
                val nftcCatgooryVariant = localDbUseCase.getCustomerCategory("NFTC_DynamicDiscount")
                if (nftcCatgooryVariant.isEmpty()) {
                    userDataUseCase.setCustomerCategory(
                        mxInternalErrorOccurred,
                        userCategoryEnum = UserCategoryEnum.NFTC_DYNAMIC_DISCOUNT,
                        ipVariant = ftcCategoryVariant,
                        sourceVersion = "TM_ANDROID_V_" + BuildConfig.VERSION_NAME
                    )
                } else if (ftcCategoryVariant.isEmpty()) {
                    userDataUseCase.setCustomerCategory(
                        mxInternalErrorOccurred,
                        userCategoryEnum = UserCategoryEnum.FTC_DYNAMIC_DISCOUNT,
                        ipVariant = nftcCatgooryVariant,
                        sourceVersion = "TM_ANDROID_V_" + BuildConfig.VERSION_NAME
                    )
                }
            } catch (_: Exception) {
            }
        }
    }

    fun appOrderCancelledData(): MxAppOrderCancelled {
        return MxAppOrderCancelled(
            addressType = addressData?.responseData?.get(0)?.addressType,
            codOrderValueDifference = billDetailsResponse.value?.responseData?.addMoreForCod?.toInt(),
            couponApplied = !billDetailsResponse.value?.responseData?.couponCode.isNullOrEmpty(),
            couponDiscountAmount = billDetailsResponse.value?.responseData?.couponAppliedAmt, //for dynamic discount B variant, couponDiscountAmt comes as zero,
            currentOrderState = currentOrderState,
            deliveryChargeAmount = billDetailsResponse.value?.responseData?.deliveryCharge?.toInt(),
            deliveryDays = deliveryDays.toDouble(),
            discountAmount = billDetailsResponse.value?.responseData?.discount,
            estimatedPayableAmount = billDetailsResponse.value?.responseData?.payableAmt,
            gender = patientData?.responseData?.get(0)?.gender,
            isCodDefaulter = (billDetailsResponse.value?.responseData?.restrictedPaymentType
                ?: 0) > 0,
            isReorder = isReOrder,
            itemNames = eventItemNames,
            mrpTotalAmount = billDetailsResponse.value?.responseData?.mrp,
            noOfItems = eventItemNames.size,
            orderId = orderID,
            packagingChargeAmount = billDetailsResponse.value?.responseData?.packagingCharge,
            patientAge = patientData?.responseData?.get(0)?.age?.toDouble(),
            patientType = if (patientData?.responseData?.get(0)?.relationName.equals(
                    "OTHER",
                    true
                )
            ) "someone_else" else patientData?.responseData?.get(0)?.relationName.toString(),
            paymentMethod = billDetailsResponse.value?.responseData?.paymentMode,
            prescriptionUploadedCount = prescriptionList.value?.size,
            productsIds = eventProductsIds,
            rxRequired = rxRequired,
            savingsAmount = billDetailsResponse.value?.responseData?.savingValue,
            shippingCity = addressData?.responseData?.get(0)?.customerCity,
            shippingPincode = addressData?.responseData?.get(0)?.pincode,
            shippingState = addressData?.responseData?.get(0)?.customerState,
            subsId = subsId.toString(),
            tmCreditAmount = billDetailsResponse.value?.responseData?.tmCredit,
            tmRewardAmount = billDetailsResponse.value?.responseData?.tmCash,
            whId = SharedPrefManager.getInstance().selectedWarehouseID,
            cashHandlingCharge = if(billDetailsResponse.value?.responseData?.pspViewed == true) billDetailsResponse.value?.responseData?.cashHandlingInfo?.charge?:0.0 else null,
            cashHandlingChargeApplicable = if(billDetailsResponse.value?.responseData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse.value?.responseData) else null
        )
    }

    fun eventOrderStatusViewed(billDetailResponse: BillDetailResponse?) {
        sdkEventUseCase.sendOrderStatusViewed(
            MxOrderStatusViewed(
                clickedOnPage = clickedOnPage,
                couponDiscountAmount = roundOffDecimal(
                    billDetailResponse?.responseData?.couponDiscountAmt ?: 0.0
                ),
                currentOrderStatus = currentOrderStatus,
                deliveryChargeAmount = billDetailResponse?.responseData?.deliveryCharge?.toDouble(),
                discountAmount = billDetailResponse?.responseData?.discount,
                estimatedDeliveryDate = edd,
                estimatedPayableAmount = billDetailResponse?.responseData?.payableAmt,
                mrpTotalAmount = billDetailResponse?.responseData?.mrp,
                orderId = orderID,
                packagingChargeAmount = billDetailResponse?.responseData?.packagingCharge,
                pageSection = "Order Status",
                payCtaVisible = orderStatusResponseData.value?.paymentEnable,
                salesPrice = billDetailResponse?.responseData?.sellingPrice,
                tmCreditAmount = billDetailResponse?.responseData?.tmCredit,
                tmRewardAmount = billDetailResponse?.responseData?.tmCash,
                whId = SharedPrefManager.getInstance().selectedWarehouseID
            )
        )
    }

    fun eventViewDetailsClicked(billDetailResponse: BillDetailResponse?) {
        sdkEventUseCase.sendViewDetailsClickedEventToMixpanel(
            MxViewDetailsClicked(
                clickedOnPage = "order status page",
                couponDiscountAmount = roundOffDecimal(
                    billDetailResponse?.responseData?.couponAppliedAmt ?: 0.0
                ),
                currentOrderStatus = currentOrderState,
                deliveryChargeAmount = billDetailResponse?.responseData?.deliveryCharge?.toDouble(),
                discountAmount = billDetailResponse?.responseData?.discount,
                estimatedDeliveryDate = edd,
                estimatedPayableAmount = billDetailResponse?.responseData?.payableAmt,
                mrpTotalAmount = billDetailResponse?.responseData?.mrp,
                orderId = orderID?.toLong(),
                packagingChargeAmount = billDetailResponse?.responseData?.packagingCharge,
                pageSection = "Order Status",
                payCtaVisible = orderStatusResponseData.value?.paymentEnable,
                salesPrice = billDetailResponse?.responseData?.sellingPrice,
                tmCreditAmount = billDetailResponse?.responseData?.tmCredit,
                tmRewardAmount = billDetailResponse?.responseData?.tmCash,
                totalDiscountAmount = roundOffDecimal(
                    (billDetailResponse?.responseData?.discount
                        ?: 0.0) + (billDetailResponse?.responseData?.couponAppliedAmt ?: 0.0)
                ),//
                appliedCouponName = billDetailResponse?.responseData?.couponCode ?: null,
                cashHandlingCharge= if(billDetailsResponse.value?.responseData?.pspViewed == true) billDetailsResponse.value?.responseData?.cashHandlingInfo?.charge?:0.0 else null,
                cashHandlingChargeApplicable = if (billDetailResponse?.responseData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailResponse?.responseData) else null
            )
        )
    }

    fun eventAppOrderCancelledClick(from: String) {
        sdkEventUseCase.sendAppOrderCancelledEvent(
            from,
            appOrderCancelledData(),
            billDetailsResponse.value?.responseData?.sellingPrice
        )
    }

    fun eventAddAlternateContactNumber(orderId: Long) {
        sdkEventUseCase.sendAddAlternateNumberEvent(orderId.toString())
    }

    fun eventVideoFloaterClickedEvent(orderId: Long) {
        sdkEventUseCase.sendVideoFloaterClickedEvent(
            MxVideoFloaterClicked(
                orderId = orderId.toString(),
                videoId = videoId.toString(),
                videoName = videoName,
                whId = SharedPrefManager.getInstance().selectedWarehouseID
            )
        )
    }

    fun sendReminderBottomSheetViewedEvent() {
        val mxReminderBottomSheetViewed = MxReminderBottomSheetViewed(
            addressType = addressData?.responseData?.get(0)?.addressType ?: "",
            couponDiscountAmount = roundOffDecimal(
                billDetailsResponse.value?.responseData?.couponDiscountAmt ?: 0.0
            ),
            discountAmount = billDetailsResponse.value?.responseData?.discount ?: 0.0,
            orderId = orderID,
            deliveryCharge = billDetailsResponse.value?.responseData?.deliveryCharge ?: 0.0,
            deliveryDays = customerOrderDetailsResponseData?.deliveryDays?.toDouble() ?: 0.0,
            estimatedPayableAmount = billDetailsResponse.value?.responseData?.payableAmt ?: 0.0,
            gender = patientData?.responseData?.get(0)?.gender ?: "",
            isDrCallRequired = customerOrderDetailsResponseData?.drCallRequired ?: false,
            mrpTotalAmount = billDetailsResponse.value?.responseData?.mrp ?: 0.0,
            packagingChargeAmount = billDetailsResponse.value?.responseData?.packagingCharge ?: 0.0,
            patientAge = patientData?.responseData?.get(0)?.age,
            patientType = patientData?.responseData?.get(0)?.relationName,
            paymentMethod = billDetailsResponse.value?.responseData?.paymentMode,
            rxRequired = rxRequired,
            shippingCity = addressData?.responseData?.get(0)?.cityName,
            shippingPincode = addressData?.responseData?.get(0)?.pincode,
            shippingState = addressData?.responseData?.get(0)?.stateName,
            tmCreditAmount = billDetailsResponse.value?.responseData?.tmCredit ?: 0.0,
            tmRewardAmount = billDetailsResponse.value?.responseData?.tmCash ?: 0.0,
            whId = SharedPrefManager.getInstance().selectedWarehouseID ?: "",
            viewedOnPage = "order_status_screen",
            variantName = "A", // as discuss
            cashHandlingCharge  = if(billDetailsResponse.value?.responseData?.pspViewed == true) billDetailsResponse.value?.responseData?.cashHandlingInfo?.charge?:0.0 else null,
            cashHandlingChargeApplicable = if(billDetailsResponse.value?.responseData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse.value?.responseData) else null
        )
        sdkEventUseCase.sendReminderBottomSheetViewedEvent(mxReminderBottomSheetViewed)
    }

    fun sendReminderEditClickedEvent() {
        val mxReminderSuccessfullySet = MxReminderSuccessfullySet(
            addressType = addressData?.responseData?.get(0)?.addressType ?: "",
            couponDiscountAmount = billDetailsResponse.value?.responseData?.couponDiscountAmt
                ?: 0.0,
            discountAmount = billDetailsResponse.value?.responseData?.discount ?: 0.0,
            orderId = orderID,
            deliveryChargeAmount = billDetailsResponse.value?.responseData?.deliveryCharge ?: 0.0,
            deliveryDays = customerOrderDetailsResponseData?.deliveryDays?.toDouble() ?: 0.0,
            estimatedPayableAmount = billDetailsResponse.value?.responseData?.payableAmt ?: 0.0,
            gender = patientData?.responseData?.get(0)?.gender ?: "",
            isDrCallRequired = customerOrderDetailsResponseData?.drCallRequired ?: false,
            mrpTotalAmount = billDetailsResponse.value?.responseData?.mrp ?: 0.0,
            packagingChargeAmount = billDetailsResponse.value?.responseData?.packagingCharge ?: 0.0,
            patientAge = patientData?.responseData?.get(0)?.age,
            patientType = patientData?.responseData?.get(0)?.relationName,
            paymentMethod = billDetailsResponse.value?.responseData?.paymentMode,
            rxRequired = rxRequired,
            shippingCity = addressData?.responseData?.get(0)?.cityName,
            shippingPincode = addressData?.responseData?.get(0)?.pincode,
            shippingState = addressData?.responseData?.get(0)?.stateName,
            tmCreditAmount = billDetailsResponse.value?.responseData?.tmCredit ?: 0.0,
            tmRewardAmount = billDetailsResponse.value?.responseData?.tmCash ?: 0.0,
            whId = SharedPrefManager.getInstance().selectedWarehouseID ?: "",
            reminderDate = convertMillisToDateFormat(editReminderDate),
            reminderFrequency = editReminderFrequency.toDouble(),
            clickedOnPage = "order_status_screen",
            variantName = "A", // as to discuss
            cashHandlingCharge = if(billDetailsResponse.value?.responseData?.pspViewed == true) billDetailsResponse.value?.responseData?.cashHandlingInfo?.charge ?: 0.0 else null,
            cashHandlingChargeApplicable = if(billDetailsResponse.value?.responseData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse.value?.responseData) else null

        )
        sdkEventUseCase.sendReminderEditClickedEvent(mxReminderSuccessfullySet)
    }

    fun sendPatientAndReminderSetButtonOrderStatus() {
        sdkEventUseCase.sendPatientAndReminderSetButtonOrderStatus()
    }

    fun convertStringToDate(date: String): Date? {
        var reminderDate: Date? = null
        try {
            reminderDate = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
                .parse(date)
            return reminderDate
        } catch (e: ParseException) {
            e.printStackTrace()
            return null
        }
    }

    fun sendPaymentPageVisitedEventToMixpanel(
        clickedOnPage: String?,
        pageSection: String?,
    ) = sdkEventUseCase.sendPaymentPageVisitedEvent(MxPaymentPageVisited().also {
        it.clickedOnPage = clickedOnPage
        it.currentOrderStatus = currentOrderState
        it.discountAmount = billDetailsResponse.value?.responseData?.discount
        it.estimatedPayableAmount = billDetailsResponse.value?.responseData?.payableAmt.toString()
        it.isReorder = isReOrder ?: false/*SharedPrefManager.getInstance().isReOrder*/
        it.mrpTotalAmount = billDetailsResponse.value?.responseData?.mrp
        it.orderId = orderID
        it.packagingChargeAmount = billDetailsResponse.value?.responseData?.packagingCharge
        it.pageSection = pageSection
        it.paymentMode =
            billDetailsResponse.value?.responseData?.paymentSelectionInfo?.paymentMethod
        it.salesPrice = billDetailsResponse.value?.responseData?.sellingPrice
        it.tmCreditAmount = billDetailsResponse.value?.responseData?.tmCredit
        it.tmRewardAmount = billDetailsResponse.value?.responseData?.tmCash
        it.deliveryChargeAmount = billDetailsResponse.value?.responseData?.deliveryCharge
        it.couponDiscountAmount = billDetailsResponse.value?.responseData?.couponDiscountAmt
        it.whId = SharedPrefManager.getInstance().selectedWarehouseID
        it.cashHandlingCharge= if(billDetailsResponse.value?.responseData?.pspViewed == true) billDetailsResponse.value?.responseData?.cashHandlingInfo?.charge?:0.0 else null
        it.cashHandlingChargeApplicable = if(billDetailsResponse.value?.responseData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse.value?.responseData) else null
    })

    fun eventReOrderButtonClicked() {

    }

    fun mxReminderSuccessfullySetDataToMixpanel(): MxReminderSuccessfullySet {
        return MxReminderSuccessfullySet(
            addressType = addressData?.responseData?.get(0)?.addressType ?: "",
            couponDiscountAmount = billDetailsResponse.value?.responseData?.couponDiscountAmt
                ?: 0.0,
            discountAmount = billDetailsResponse.value?.responseData?.discount ?: 0.0,
            orderId = orderID,
            deliveryChargeAmount = billDetailsResponse.value?.responseData?.deliveryCharge ?: 0.0,
            deliveryDays = customerOrderDetailsResponseData?.deliveryDays?.toDouble() ?: 0.0,
            estimatedPayableAmount = billDetailsResponse.value?.responseData?.payableAmt ?: 0.0,
            gender = patientData?.responseData?.get(0)?.gender ?: "",
            isDrCallRequired = customerOrderDetailsResponseData?.drCallRequired ?: false,
            mrpTotalAmount = billDetailsResponse.value?.responseData?.mrp ?: 0.0,
            packagingChargeAmount = billDetailsResponse.value?.responseData?.packagingCharge ?: 0.0,
            patientAge = patientData?.responseData?.get(0)?.age,
            patientType = patientData?.responseData?.get(0)?.relationName,
            paymentMethod = billDetailsResponse.value?.responseData?.paymentMode,
            rxRequired = rxRequired,
            shippingCity = addressData?.responseData?.get(0)?.cityName,
            shippingPincode = addressData?.responseData?.get(0)?.pincode,
            shippingState = addressData?.responseData?.get(0)?.stateName,
            tmCreditAmount = billDetailsResponse.value?.responseData?.tmCredit ?: 0.0,
            tmRewardAmount = billDetailsResponse.value?.responseData?.tmCash ?: 0.0,
            whId = SharedPrefManager.getInstance().selectedWarehouseID ?: "",
            reminderDate = convertMillisToDateFormat(editReminderDate),
            reminderFrequency = editReminderFrequency.toDouble(),
            clickedOnPage = "order_status_screen",
            variantName = "A", // as to discuss
            cashHandlingCharge  = if(billDetailsResponse.value?.responseData?.pspViewed == true) billDetailsResponse.value?.responseData?.cashHandlingInfo?.charge ?: 0.0 else null,
            cashHandlingChargeApplicable = if(billDetailsResponse.value?.responseData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse.value?.responseData) else null
        )

        /*return MxReminderSuccessfullySet(addressData?.responseData?.get(0)?.addressType?:null,
            "order_status_screen",
            couponDiscountAmount = billDetailsResponse.value?.responseData?.couponDiscountAmt ?: 0.0,
            deliveryChargeAmount = billDetailsResponse.value?.responseData?.deliveryCharge ?:0.0,
            deliveryDays = customerOrderDetailsResponseData?.deliveryDays?.toDouble() ?:0.0,
            discountAmount = billDetailsResponse.value?.responseData?.discount ?:0.0,
            estimatedPayableAmount = billDetailsResponse.value?.responseData?.payableAmt ?:0.0,
            gender = patientData?.responseData?.get(0)?.gender ?: "",
            isDrCallRequired = customerOrderDetailsResponseData?.drCallRequired ?: false,
            mrpTotalAmount = billDetailsResponse.value?.responseData?.mrp ?:0.0,
            orderId = orderID,
            packagingChargeAmount = billDetailsResponse.value?.responseData?.packagingCharge ?:0.0,
            patientAge = patientData?.responseData?.get(0)?.age,
            patientId = patientData?.responseData?.get(0)?.patientId.toString(),
            patientType = patientData?.responseData?.get(0)?.relationName,
            paymentMethod = billDetailsResponse.value?.responseData?.paymentMode,
            reminderDate = convertStringToDate(editReminderDate),
            reminderFrequency = editReminderFrequency.toDouble(),
            rxRequired = rxRequired,
            shippingCity = addressData?.responseData?.get(0)?.cityName,
            shippingPincode = addressData?.responseData?.get(0)?.pincode,
            shippingState = addressData?.responseData?.get(0)?.stateName,
            tmCreditAmount = billDetailsResponse.value?.responseData?.tmCredit ?: 0.0,
            tmRewardAmount = billDetailsResponse.value?.responseData?.tmCash ?: 0.0,
            variantName = "A", // as discuss
            )*/
    }

    fun deleteAlternateNumberClick(orderId: Long, alternateNumber: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val checkValidationResponse = loginUseCase.checkPhoneNumber(alternateNumber)
            if (checkValidationResponse.isValid) {
                with(
                    orderStatusUseCase.deleteAlternateNumberForOrder(
                        mxInternalErrorOccurred, orderId
                    )
                ) {
                    isDeleteNumberSuccessFully = this?.statusCode == 200
                    setMobileNumber(orderId, true)
                    showError.postValue(this?.message)
                }
            }
        }
    }
}
