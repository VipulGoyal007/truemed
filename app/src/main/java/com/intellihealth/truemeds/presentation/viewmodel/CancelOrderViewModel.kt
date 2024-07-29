package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.RadioListModel
import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.usecase.CancelOrderUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.roundOffDecimal
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CancelOrderViewModel @Inject constructor(
    private val cancelOrderUseCase: CancelOrderUseCase,
    @ApplicationContext private val context: Context,
//    private val sdkEventUseCase: SdkEventUseCase
) : BaseViewModel(), DefaultLifecycleObserver {
    var appOrderCancelledModel: MxAppOrderCancelled? = null
    val _cancelOrderReasonList = MutableLiveData<List<CancelReasonResponse.Reason?>?>()
    val cancelOrderReasonList: LiveData<List<CancelReasonResponse.Reason?>?> get() = _cancelOrderReasonList

    val _cancelOrderSubReasonList = MutableLiveData<List<CancelReasonResponse.Reason?>?>()
    val cancelOrderRadioList: LiveData<List<RadioListModel>?> get() = _cancelOrderRadioList

    val _cancelOrderRadioList = MutableLiveData<List<RadioListModel>?>()
    val cancelOrderSubReasonList: LiveData<List<CancelReasonResponse.Reason?>?> get() = _cancelOrderSubReasonList
    var showShimmer = MutableLiveData<Boolean>(true)
    val showShimmerLiveData: LiveData<Boolean> get() = showShimmer

    var showShimmerForSubReason = MutableLiveData<Boolean>(true)
    val showShimmerForSubOrderLiveData: LiveData<Boolean> get() = showShimmerForSubReason

    var showCancelOrderReasonListView = MutableLiveData<Boolean>(false)

    var showCancelOrderSubReasonListView = MutableLiveData<Boolean>(false)

    var cancelOrderEventMutableLiveData = MutableLiveData<Event<Any>>()
    val cancelOrderEventLiveData: LiveData<Event<Any>> get() = cancelOrderEventMutableLiveData

    val showMessage = MutableLiveData<Event<MESSAGES>>()
    val eventMessage: LiveData<Event<MESSAGES>> get() = showMessage
    var reasonId: String = ""

    var firstPageCancelReason: String=""
    var firstPageCancelFinalReason:String=""
    var selectedReasonId= MutableLiveData<String>("")
    var notes= MutableLiveData<String>("")

    var previousPos: Int = -1
    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean> get() = _isLoading
    var billDetailsResponse:BillDetailResponse? = null

    var headerType: MutableLiveData<MobileSectionHeadersModel> = MutableLiveData(
        MobileSectionHeadersModel(
            "Cancel Order", "", "",
            "", 0, null
        )
    )

    fun getCancelOrderList() {
        if (isNetworkAvailable(context)) {
            viewModelScope.launch(IO) {
                val cancelOrderReasonResponse =
                    cancelOrderUseCase.getL1ReasonsForOrderCancellation(MxInternalErrorOccurred())
                _cancelOrderReasonList.postValue(cancelOrderReasonResponse?.responseData)
                eventAppOrderCancelled("FirstPage")
                when {
                    !cancelOrderReasonResponse?.responseData.isNullOrEmpty() -> {
                        showShimmer.postValue(false)
                        showCancelOrderReasonListView.postValue(true)
                    }

                    else -> {
                        showShimmer.postValue(false)
                        showCancelOrderReasonListView.postValue(false)
                    }
                }
            }
        } else showMessage.postValue(Event(MESSAGES.NO_NETWORK))
    }

    fun getCancelOrderSubList(reasonId: String) {
        if (isNetworkAvailable(context)) {
            viewModelScope.launch(IO) {
                val cancelOrderReasonResponse =
                    cancelOrderUseCase.getSubsReasonsForOrderCancellation(MxInternalErrorOccurred(), reasonId)
                _cancelOrderRadioList.postValue(
                    cancelOrderUseCase.getRadioList(
                        cancelOrderReasonResponse
                    )
                )
                eventAppOrderCancelled("SecondPage")
                when {
                    !cancelOrderReasonResponse?.responseData.isNullOrEmpty() -> {
                        showShimmerForSubReason.postValue(false)
                        showCancelOrderSubReasonListView.postValue(true)
                    }

                    else -> {
                        showShimmerForSubReason.postValue(false)
                        showCancelOrderSubReasonListView.postValue(false)
                    }
                }

            }
        } else showMessage.postValue(Event(MESSAGES.NO_NETWORK))
    }

    fun cancelOrder(orderId: Long, reasonId: Int, notes: String, currentOrderStatus: Int) {
        if (isNetworkAvailable(context)) {
            _isLoading.postValue(true)
            viewModelScope.launch(IO) {
                if (currentOrderStatus == 1 || currentOrderStatus == 2 ||
                    currentOrderStatus == 4 || currentOrderStatus == 81 || currentOrderStatus == 39
                ) {
                    val response =
                        cancelOrderUseCase.discardOrderWithReason(MxInternalErrorOccurred(),orderId, reasonId.toString(), notes, 512)
                    response?.let {
//                        _isLoading.postValue(false)
                        cancelOrderEventMutableLiveData.postValue(Event(true))
                    }
                } else {
                    val response =
                        cancelOrderUseCase.cancelOrder(MxInternalErrorOccurred(),orderId, reasonId.toString(), notes, 512)
                    response?.let {
//                        _isLoading.postValue(false)
                        cancelOrderEventMutableLiveData.postValue(Event(true))
                    }
                }
                    eventAppOrderCancelled("Cancelled")
                _isLoading.postValue(false)

            }
        } else showMessage.postValue(Event(MESSAGES.NO_NETWORK))
    }


    fun radioClickPosition(currentPos: Int) {
        if (previousPos != -1) _cancelOrderSubReasonList.value?.get(previousPos)?.isChecked = false
        _cancelOrderSubReasonList.value?.get(currentPos)?.isChecked = true
        previousPos = currentPos
        Log.e("list_data::", _cancelOrderSubReasonList.value.toString())
        _cancelOrderSubReasonList.postValue(_cancelOrderSubReasonList.value)
    }

    fun eventAppOrderCancelled(from:String){
        var firstPageCancel: String? =null
        var secondPageCancel: String? =null
        if(from=="SecondPage"){
            firstPageCancel=firstPageCancelFinalReason
        }
        if(from=="ThirdPage"|| from=="Cancelled"){
            for (model in _cancelOrderRadioList.value!!) {
                if (model != null) {
                    if (model.selected==true) {
                        secondPageCancel= model.title
                        break
                    }
                }
            }
            firstPageCancel=firstPageCancelFinalReason
        }
        sdkEventUseCase.sendAppOrderCancelledEvent(
            from, MxAppOrderCancelled(
                addressType= appOrderCancelledModel?.addressType,
                codOrderValueDifference = if(from=="Cancelled")appOrderCancelledModel?.codOrderValueDifference else null,
                couponApplied= appOrderCancelledModel?.couponApplied,
                couponDiscountAmount= roundOffDecimal(appOrderCancelledModel?.couponDiscountAmount ?: 0.0),
                currentOrderState=appOrderCancelledModel?.currentOrderState,
                deliveryChargeAmount=appOrderCancelledModel?.deliveryChargeAmount,
                deliveryDays=appOrderCancelledModel?.deliveryDays,
                discountAmount=appOrderCancelledModel?.discountAmount,
                estimatedPayableAmount=appOrderCancelledModel?.estimatedPayableAmount,
                gender=appOrderCancelledModel?.gender,
                isCodDefaulter=if(from=="Cancelled")appOrderCancelledModel?.isCodDefaulter else null,
                isReorder=appOrderCancelledModel?.isReorder,//backend
                itemNames = if(appOrderCancelledModel?.itemNames?.size!! > 0) appOrderCancelledModel?.itemNames else null,
                mrpTotalAmount=appOrderCancelledModel?.mrpTotalAmount,
                noOfItems=appOrderCancelledModel?.noOfItems,
                orderId=appOrderCancelledModel?.orderId,
                packagingChargeAmount=appOrderCancelledModel?.packagingChargeAmount,
                patientAge=appOrderCancelledModel?.patientAge,
                patientType=appOrderCancelledModel?.patientType,
                paymentMethod=appOrderCancelledModel?.paymentMethod,
                prescriptionUploadedCount=appOrderCancelledModel?.prescriptionUploadedCount,
                productsIds = if(appOrderCancelledModel?.productsIds?.size!! > 0) appOrderCancelledModel?.productsIds else null,
                rxRequired = appOrderCancelledModel?.rxRequired,
                savingsAmount=appOrderCancelledModel?.savingsAmount,
                shippingCity=appOrderCancelledModel?.shippingCity,
                shippingPincode =appOrderCancelledModel?.shippingPincode,
                shippingState =appOrderCancelledModel?.shippingState,
                subsId= if(Integer.parseInt(appOrderCancelledModel?.subsId.toString()) > 0) appOrderCancelledModel?.subsId else null,
                tmCreditAmount=appOrderCancelledModel?.tmCreditAmount,
                tmRewardAmount=appOrderCancelledModel?.tmRewardAmount,
                whId = SharedPrefManager.getInstance().selectedWarehouseID,
                firstPageCancelReason = firstPageCancel,
                secondPageCancelReason = secondPageCancel,
                otherText= if(notes.value.isNullOrEmpty()) null else notes.value,
                cashHandlingCharge = if(billDetailsResponse?.responseData?.pspViewed == true)  billDetailsResponse?.responseData?.cashHandlingInfo?.charge ?: 0.0 else null,
                cashHandlingChargeApplicable = if (billDetailsResponse?.responseData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse?.responseData) else null,
            ), billDetailsResponse?.responseData?.sellingPrice
        )
    }

}