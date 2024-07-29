package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.constants.CouponConstant
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.model.mixpanel.MxCouponListOpened
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxOfferSheetViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxUrgencyTimerStarted
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.MessageConstant
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.util.Locale
import javax.inject.Inject

@HiltViewModel
open class CouponViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    //private val couponUseCase: CouponUseCase,
    //private val orderFlowUseCase: OrderFlowUseCase
) : BaseViewModel(), DefaultLifecycleObserver {

    var couponList: MutableLiveData<MutableList<Coupon>> = MutableLiveData(mutableListOf())
    var searchedCouponList: MutableList<Coupon> = mutableListOf()
    var couponListResponse: MutableList<Coupon> = mutableListOf()
    var tempList: MutableLiveData<MutableList<Coupon>> = MutableLiveData(mutableListOf())

    private val openCouponPopup = MutableLiveData<Event<Pair<Coupon, CouponSaveRemoveResponse?>>>()
    val eventOpenCouponPopup: LiveData<Event<Pair<Coupon, CouponSaveRemoveResponse?>>> get() = openCouponPopup
    val openCouponFailed = MutableLiveData<Event<Coupon?>>()
    val eventOpenCouponFailed: LiveData<Event<Coupon?>> get() = openCouponFailed

    private val applyCouponFailed = MutableLiveData<Event<Any>>()
    val eventApplyCouponFailed: LiveData<Event<Any>> get() = applyCouponFailed

    var notificationData: MutableLiveData<StickyNonStickyNotificationModel>? = MutableLiveData()
    private val openCouponBottomSheet = MutableLiveData<Event<Coupon>>()
    val eventOpenCouponBottomSheet: LiveData<Event<Coupon>> get() = openCouponBottomSheet
    private val showError = MutableLiveData<Event<Any>>()
    val eventShowError: LiveData<Event<Any>> get() = showError
    var ftcCounterTime: MutableLiveData<String> = MutableLiveData("")
    var currentServerFtcTime = MutableLiveData(0L)
    var expiryServerFtcTime = MutableLiveData(0L)
    var errorMsgHelper: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))
    var initCountDownTimerTriggerEvent: MutableLiveData<Event<Long>> =
        MutableLiveData<Event<Long>>()
    val isLoadingEnabled = MutableLiveData(false)
    val setTextFieldEmpty = MutableLiveData(false)

    val noCouponFound = MutableLiveData(false)
    var hasRxOrder: MutableLiveData<Boolean> = MutableLiveData(false)
    var currentPaymentIconType = ""
    var isCouponRemoved = false
    val showMessage = MutableLiveData<Event<MessageConstant>>()
    val eventMessage: LiveData<Event<MessageConstant>> get() = showMessage

    //event data
    var clickedOnPage = ""
    var clickedOnPageFromIntent = ""
    var couponDiscountAmountEventValue :Double =0.0
    var deliveryChargeAmountEventValue:Double =0.0
    var discountAmountEventValue :Double =0.0
    var estimatedPayableAmountEventValue :Double =0.0
    var itemNamesEventValue :ArrayList<String> = arrayListOf()
    var mrpTotalAmountEventValue :Double =0.0
    var noOfItemEventValue :Int =0
    var orderIdEventValue :String =""
    var packagingChargesAmountEventValue :Double =0.0
    var productsIdsEventValue :ArrayList<String> = arrayListOf()
    var subsIdEventValue :Int =0
    var tmCreditAmountEventValue:Double =0.0
    var tmRewardAmountEventValue :Double =0.0
    var cashHandlingCharge :Double? = null
    var cashHandlingChargeApplicable :Double? = null
    var whIdEventValue :String =""
    var billDetailsData : BillDetailResponse.ResponseData?=null
    var medicineListDataReceived :ArrayList<MedicineListDetailsSent> = arrayListOf()
    var mxInternalErrorOccurred=MxInternalErrorOccurred()
    var clickedOnPageNameForCouponEvent: String = ""
    var clickedOnPageNameForCouponApplyEvent: String = ""


    fun setCouponData() {
        loaderValue.postValue(true)
        viewModelScope.launch(Dispatchers.IO) {
            val customerCategory = if (SharedPrefManager.getInstance().isFtc) {
                "FTC_Coupon_Urgency"
            } else {
                val genericDiscountVariantId = localDbUseCase.getCustomerCategoryId(UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType)
                if (genericDiscountVariantId > 0) {
                    UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType
                } else {
                    "NFTC_DynamicDiscount"
                }
            }
            couponUseCase.fetchAllOffers(
                mxInternalErrorOccurred, 100,
                SharedPrefManager.getInstance().pincode.toString(),
                "ALL_OFFERS",
                customerCategory,
                if (SharedPrefManager.getInstance().algoSpecificVariantId == null || SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId,
            )?.let {
                loaderValue.postValue(false)
                if (it.responseData == null) return@launch
                if (it.responseData.isEmpty()) noCouponFound.postValue(true)
                if (SharedPrefManager.getInstance().couponModel != null) {
                    it.responseData.forEach { item ->
                        if (!item.promoCode.isNullOrEmpty() && item.promoCode == SharedPrefManager.getInstance().couponModel.promoCode) {
                            item.couponType = CouponConstant.DISCOUNT_COUPON_APPLIED
                            item.applyLabel = context.getString(R.string.coupon_applied)
                            item.isCouponApplied = true
                        } else {
                            if (item.couponCodeRequired == true) {
                                if (item.promoCode.isNullOrEmpty()) {
                                    item.applyLabel = ""
                                    item.couponType = CouponConstant.CASH_BACK_COUPON
                                } else {
                                    item.applyLabel = context.getString(R.string.apply_label)
                                    item.couponType = CouponConstant.DISCOUNT_COUPON
                                }
                            } else {
                                item.applyLabel = ""
                                item.couponType = CouponConstant.CASH_BACK_COUPON
                            }
                            item.isCouponApplied = false
                            /*item.couponType = CouponConstant.DISCOUNT_COUPON
                            item.isCouponApplied = false
                            item.applyLabel = context.getString(R.string.apply_label)
                             */
                        }
                        item.expiryDateFromApi=item.expiryDate
                    }
                } else {
                    it.responseData.forEach { item ->
                        item.isCouponApplied = false
                        if (item.couponCodeRequired == true) {
                            if (item.promoCode.isNullOrEmpty()) {
                                item.applyLabel = ""
                                item.couponType = CouponConstant.CASH_BACK_COUPON
                            } else {
                                item.applyLabel = context.getString(R.string.apply_label)
                                item.couponType = CouponConstant.DISCOUNT_COUPON
                            }
                        } else {
                            item.applyLabel = ""
                            item.couponType = CouponConstant.CASH_BACK_COUPON
                        }

                    }
                }
                if (couponListResponse.isEmpty())
                    couponListResponse = it.responseData.toMutableList()
                couponList.postValue(it.responseData.sortedBy { item -> !item.isCouponApplied }
                    .filter { it.offersVisible == true }.toMutableList())
                tempList.postValue(it.responseData.sortedBy { item -> !item.isCouponApplied }
                    .filter { it.offersVisible == true }.toMutableList())
                //couponList.postValue(it.responseData.toMutableList())
                //tempList.postValue(it.responseData.toMutableList())


                callEventForCouponListOpened()
            }
        }
    }

    fun callEventForCouponListOpened(){
        viewModelScope.launch(Dispatchers.IO) {
            whIdEventValue = SharedPrefManager.getInstance().selectedWarehouseID
            orderIdEventValue = SharedPrefManager.getInstance().incompleteOrderId.toString()
            noOfItemEventValue = itemNamesEventValue.size
    
            var subsId = localDbUseCase.getSubsIdOfOrder()
            var mixPanelData = MxCouponListOpened(
                clickedOnPageFromIntent,
                couponDiscountAmountEventValue,
                deliveryChargeAmountEventValue,
                discountAmountEventValue,
                estimatedPayableAmountEventValue,
                itemNamesEventValue,
                mrpTotalAmountEventValue,
                noOfItemEventValue,
                orderIdEventValue,
                packagingChargesAmountEventValue,
                productsIdsEventValue,
                subsId.toString(),
                tmCreditAmountEventValue,
                tmRewardAmountEventValue,
                whIdEventValue,
                cashHandlingCharge,
                cashHandlingChargeApplicable
            )
    
            sdkEventUseCase.sendCouponListOpenedEvent(mixPanelData)
        }
    }
    fun couponEventPageName(offerId:String=""):String
    {
        if (offerId.toInt() > 0)
        {
            //  return clickedOnPage
            return clickedOnPageNameForCouponApplyEvent
        }
        else
        {
          //  return clickedOnPageNameForCouponEvent
           // return clickedOnPage
            return "couponcodeactivity"
        }

    }

    fun applyCouponClick(coupon: Coupon?,clickedOnPageNameForCouponApplyEvent:String="") {
        setTextFieldEmpty.postValue(true)

        currentPaymentIconType = ""
        viewModelScope.launch(Dispatchers.IO) {
            if (isNetworkAvailable(context)) {
                isLoadingEnabled.postValue(true)
                /*var paymentTypeId = if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1)
                    PaymentMode.ONLINE.ordinal.toLong()
                else
                    SharedPrefManager.getInstance().lastSelectedPaymentModeId;*/

                var paymentMode: Int = 16
                coupon?.applicableOn?.let { applicable ->
                    if (applicable.contains("Online")) {
                        paymentMode = 16
                        SharedPrefManager.getInstance().selectedPaymentMethod=""
                        SharedPrefManager.getInstance().selectedPaymentMethodId=-1L
                        SharedPrefManager.getInstance().selectedPaymentMethodIconUrl=""
                    } else {
                        paymentMode = 17
                    }
                }
                var pageName=""
                if(!clickedOnPageNameForCouponApplyEvent.isNullOrEmpty())
                    pageName=clickedOnPageNameForCouponApplyEvent
                else
                    pageName=couponEventPageName(coupon?.offerId.toString())


                val couponSaveRemoveResponse = async {
                  //  couponEventPageName(coupon.offerId.toString()),
                    couponUseCase.applyAndRemoveCouponCode(
                        mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId,
                        paymentMode.toString(), coupon?.offerId.toString(),
                        billDetailsData, pageName,coupon,medicineListDataReceived
                       // billDetailsData,clickedOnPage,coupon,medicineListDataReceived
                    )
                }.await()

                if (couponSaveRemoveResponse != null) {
                    if (couponSaveRemoveResponse.message == "Success") {
                        /*coupon.applicableOn?.let {applicable ->
                            if (applicable.contains("Online")) {
                                orderFlowUseCase.setPaymentSelectionMethod(SharedPrefManager.getInstance().incompleteOrderId,
                                    16,
                                    PaymentModeName.ONLINE.toString())
                            } else {
                                orderFlowUseCase.setPaymentSelectionMethod(SharedPrefManager.getInstance().incompleteOrderId,
                                    17,
                                    PaymentModeName.COD.toString())
                            }
                        }*/


                        /* if(coupon.currentDate!! > 0){
                             coupon.currentDate = System.currentTimeMillis()
                         }*/

                        if (coupon?.expiryDate!! > 0) {
                            SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                                coupon.currentDate!!.toLong()
                            coupon.expiryDate =
                                SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                            
//                            sendFtcCounterStarted.postValue()
                        }
                        if (couponSaveRemoveResponse.responseData?.isOfferApplied == true) {
                            SharedPrefManager.getInstance().offerId = coupon.offerId.toString()
                            SharedPrefManager.getInstance().couponModel = coupon

                            coupon.paymentMethods?.let {
                                SharedPrefManager.getInstance().selectedPaymentMethodId =
                                    coupon.paymentMethods!![0].paymentMethodId
                                SharedPrefManager.getInstance().selectedPaymentMethod =
                                    coupon.paymentMethods!![0].iconType
                                SharedPrefManager.getInstance().selectedPaymentMethodIconUrl =
                                    coupon.paymentMethods!![0].iconPath
                                currentPaymentIconType =
                                    coupon.paymentMethods?.get(0)?.iconType ?: ""

                            }


                            /**
                             * This code is used to insert into sharedpreferences only when
                             * only COD coupon is applied
                             * **/
                            if (paymentMode == 17) {
                                SharedPrefManager.getInstance().selectedPaymentMethodId =
                                    11
                                SharedPrefManager.getInstance().selectedPaymentMethod =
                                    "Cash on delivery"
                                SharedPrefManager.getInstance().selectedPaymentMethodIconUrl =
                                    ""

                            }
                        }

                        openCouponPopup.postValue(Event(Pair(coupon, couponSaveRemoveResponse)))
                    } else applyCouponFailed.postValue(Event(Any()))


                } else applyCouponFailed.postValue(Event(Any()))
                isLoadingEnabled.postValue(false)

            } else {
                openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
            }
        }

    }

    fun removeCoupon(coupon: CouponCodeResponse.Coupon) {
        viewModelScope.launch(Dispatchers.IO) {
            if (isNetworkAvailable(context)) {
                val couponSaveRemoveResponse = couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId,
                    "16"/*todo*/,
                    "0",
                    billDetailsData, couponEventPageName("0"),coupon,medicineListDataReceived
                )
                couponSaveRemoveResponse?.responseData?.let {
                    SharedPrefManager.getInstance().couponModel = null
                    SharedPrefManager.getInstance().offerId = "0"
                    SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                    isCouponRemoved = true
                    showMessage.postValue(
                        Event(
                            MessageConstant(
                                MESSAGES.REMOVED_COUPON_SUCCESSFULLY,
                                it.description?.get(0) ?: ""
                            )
                        )
                    )
                }
            } else {
                openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
            }
        }
    }

    fun searchApplyCouponClick(couponCode: String) {
        if (couponCode.isNotEmpty()) {
            searchedCouponList.clear()
            for (item in tempList.value!!) {
                if ((item.promoCode ?: "").lowercase().contains(couponCode.lowercase())) {
                    searchedCouponList.add(item)
                }
            }
            if (searchedCouponList.isEmpty()) {
                /*   errorMsgHelper.postValue(
                       ErrorMessageData(
                           context.getString(R.string.coupon_validation_msg),
                           InputFieldConstants.STATE_ERROR
                       )
                   )*/
                couponList.value = searchedCouponList
                couponList.postValue(tempList.value)

            } else {
                couponList.value = searchedCouponList
                couponList.postValue(searchedCouponList)
                errorMsgHelper.postValue(
                    ErrorMessageData(
                        "",
                        InputFieldConstants.STATE_ACTIVE
                    )
                )


            }

        } else {
            /*   errorMsgHelper.postValue(
                   ErrorMessageData(
                       context.getString(R.string.coupon_validation_msg),
                       InputFieldConstants.STATE_ERROR
                   )
               )*/
        }
    }

    fun searchApplyClicked(couponCode: String, currentCartValue: Double) {
        /**
         *   Calling apply coupon code case for the searched/valid coupon code
         *
         */
        run promoSearch@{
            var mSearch = if (searchedCouponList.isEmpty()) couponListResponse else searchedCouponList
            if (!mSearch.isNullOrEmpty()) {
                var isCouponAppliedOnce=false
                mSearch.forEach { coupon ->
                    Log.e("search_data","::::::"+(coupon.promoCode ?: "").lowercase(Locale.getDefault())+":::::"+couponCode.lowercase(
                        Locale.getDefault()))
                    if ((coupon.promoCode
                            ?: "").lowercase(Locale.getDefault()) .equals( couponCode.lowercase(
                            Locale.getDefault()
                        ),true)
                    ) {
                        if (currentCartValue >= (coupon.minCartValue
                                ?: 0) || (SharedPrefManager.getInstance().prescriptionCount > 0 && currentCartValue == 0.0)
                        ) {
                            isCouponAppliedOnce=true
                            Log.e("else_case", "aaa:::yes")
                            viewModelScope.launch(Dispatchers.IO) {
                                if (isNetworkAvailable(context)) {

                                    var paymentMethodId: Int = 16
                                    coupon.applicableOn?.let { applicable ->
                                        if (applicable.contains("Online")) {
                                            paymentMethodId = 16
                                        } else {
                                            paymentMethodId = 17
                                        }
                                    }

                                    val couponSaveRemoveResponse = async {
                                        couponUseCase.applyAndRemoveCouponCode(
                                            mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId,
                                            paymentMethodId.toString(),
                                            coupon.offerId.toString(),
                                            billDetailsData, couponEventPageName(coupon.offerId.toString()),coupon,medicineListDataReceived
                                        )
                                    }.await()

                                    if (couponSaveRemoveResponse != null) {
                                        if (couponSaveRemoveResponse.message == "Success") {
                                            /*coupon.applicableOn?.let {applicable ->
                                                if (applicable.contains("Online")) {
                                                    orderFlowUseCase.setPaymentSelectionMethod(SharedPrefManager.getInstance().incompleteOrderId,
                                                        16,
                                                        PaymentModeName.ONLINE.toString())
                                                } else {
                                                    orderFlowUseCase.setPaymentSelectionMethod(SharedPrefManager.getInstance().incompleteOrderId,
                                                        17,
                                                        PaymentModeName.COD.toString())
                                                }
                                            }*/
                                            if ((couponSaveRemoveResponse.responseData?.isOfferApplied ?: false) == true) {
                                                if (coupon.currentDate!! > 0) {
                                                    coupon.currentDate = System.currentTimeMillis()
                                                }

                                                if (coupon.expiryDate!! > 0) {
                                                    coupon.expiryDate =
                                                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                                                }


                                                SharedPrefManager.getInstance().offerId =
                                                    coupon.offerId.toString()
                                                SharedPrefManager.getInstance().couponModel = coupon
                                            }
                                            openCouponPopup.postValue(
                                                Event(
                                                    Pair(
                                                        coupon,
                                                        couponSaveRemoveResponse
                                                    )
                                                )
                                            )

                                        } else applyCouponFailed.postValue(Event(Any()))


                                    } else
                                        applyCouponFailed.postValue(Event(Any()))


                                } else {
                                    openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
                                }
                            }
                        } else {
                            openCouponFailed.postValue(Event(coupon))

                        }
                        return@promoSearch
                    } /*else {
                        Log.e("case11111", "333::yes")
                        errorMsgHelper.postValue(
                            ErrorMessageData(
                                context.getString(R.string.coupon_validation_msg),
                                InputFieldConstants.STATE_ERROR
                            )
                        )
                    }*/
                }
                if(!isCouponAppliedOnce)
                {
                    Log.e("case11111", "333::yes")
                    errorMsgHelper.postValue(
                        ErrorMessageData(
                            context.getString(R.string.coupon_validation_msg),
                            InputFieldConstants.STATE_ERROR
                        )
                    )
                }

            } else {
                Log.e("case11111", "444::yes")
                errorMsgHelper.postValue(
                    ErrorMessageData(
                        context.getString(R.string.coupon_validation_msg),
                        InputFieldConstants.STATE_ERROR
                    )
                )
            }
        }
    }


    fun openCouponBottomSheet(couponCodeResponse: Coupon) {
        Log.i("couponresp", "" + couponCodeResponse)
        openCouponBottomSheet.value = Event(couponCodeResponse)
    }

    fun changeCouponButtonState(isApplied: Boolean, offerId: Int) {
        if (isApplied) {
            couponList.value?.forEach {
                if (it.offerId == offerId) {
                    it.couponType = CouponConstant.DISCOUNT_COUPON
                    it.applyLabel = context.getString(R.string.apply_label)
                    it.isCouponApplied = false
                } else {
                    if (it.isCouponApplied) {
                        it.couponType = CouponConstant.DISCOUNT_COUPON
                        it.isCouponApplied = false
                        it.applyLabel = context.getString(R.string.apply_label)
                    }
                }
            }
            tempList.value?.forEach {
                if (it.offerId == offerId) {
                    it.couponType = CouponConstant.DISCOUNT_COUPON
                    it.applyLabel = context.getString(R.string.apply_label)
                    it.isCouponApplied = false
                } else {
                    if (it.isCouponApplied == true) {
                        it.couponType = CouponConstant.DISCOUNT_COUPON
                        it.isCouponApplied = false
                        it.applyLabel = context.getString(R.string.apply_label)
                    }
                }
            }
        } else {
            couponList.value?.forEach {
                if (it.offerId == offerId) {
                    it.couponType = CouponConstant.DISCOUNT_COUPON_APPLIED
                    it.applyLabel = context.getString(R.string.coupon_applied)
                    it.isCouponApplied = true
                } else {
                    if (it.isCouponApplied) {
                        it.couponType = CouponConstant.DISCOUNT_COUPON
                        it.isCouponApplied = false
                        it.applyLabel = context.getString(R.string.apply_label)
                    }
                }
            }
            tempList.value?.forEach {
                if (it.offerId == offerId) {
                    it.couponType = CouponConstant.DISCOUNT_COUPON_APPLIED
                    it.applyLabel = context.getString(R.string.coupon_applied)
                    it.isCouponApplied = true
                } else {
                    if (it.isCouponApplied == true) {
                        it.couponType = CouponConstant.DISCOUNT_COUPON
                        it.isCouponApplied = false
                        it.applyLabel = context.getString(R.string.apply_label)
                    }
                }
            }
        }
        val data = couponList.value
        data?.let {
            couponList.value = it
        }
    }

    open fun setCountDownTimerTrigger(millis: Long) {
        initCountDownTimerTriggerEvent.value = Event(millis)
    }

    fun setEventOfferSheetViewed(applyCouponBottomSheetModel: CouponCodeResponse.Coupon?){
        var clickedOnPage="coupon_list"// todo - need to change when managed in entire app

        var mov=applyCouponBottomSheetModel?.minCartValue.toString()
        var offerName=applyCouponBottomSheetModel?.title
        var offerType=""


        if (applyCouponBottomSheetModel?.couponCodeRequired?:false) offerType = "coupon" //couponCodeDataModel.getCoupon_code();
        else offerType = "no_coupon_code"


        var validTill=applyCouponBottomSheetModel?.expiryDays
        var whId=SharedPrefManager.getInstance().selectedWarehouseID

        var mixPanelData= MxOfferSheetViewed(clickedOnPage,mov,offerName,offerType,validTill,whId)


        sdkEventUseCase.sendOfferSheetViewedEvent(mixPanelData)
    }

    fun sendFtcCounterStarted(timestamp: Long) {
        val mxUrgencyTimerStarted = MxUrgencyTimerStarted(
            DateUtils.convertMillisToSeconds(DateUtils.convertEpochTimeStampToDateMillis(timestamp, System.currentTimeMillis())))
        sdkEventUseCase.sendFtcTimerStartedEvent(mxUrgencyTimerStarted)
    }
}