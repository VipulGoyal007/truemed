package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cashfree.pg.api.CFPaymentGatewayService
import com.cashfree.pg.core.api.CFSession
import com.cashfree.pg.core.api.CFSession.CFSessionBuilder
import com.cashfree.pg.core.api.CFTheme.CFThemeBuilder
import com.cashfree.pg.core.api.callback.CFCheckoutResponseCallback
import com.cashfree.pg.core.api.exception.CFException
import com.cashfree.pg.core.api.utils.CFErrorResponse
import com.cashfree.pg.network.NetworkConnectivityUtil
import com.cashfree.pg.ui.api.CFDropCheckoutPayment.CFDropCheckoutPaymentBuilder
import com.cashfree.pg.ui.api.CFPaymentComponent
import com.cashfree.pg.ui.api.CFPaymentComponent.CFPaymentComponentBuilder
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.domain.usecase.CashFreeUseCase
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentSuccessAndFailed
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.getApplicableCashHandlingCharger
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class PaymentStatusViewModel @Inject constructor(
    private val cashFreeUseCase: CashFreeUseCase,
    private val orderFlowUseCase : OrderFlowUseCase,
    private val sdkEventUseCase: SdkEventUseCase,
    @ApplicationContext private val context: Context
) :
    ViewModel(), DefaultLifecycleObserver,
    CFCheckoutResponseCallback {
    var showPaymentSuccessView = MutableLiveData(false)
    var showPaymentFailureView = MutableLiveData(false)
    var showPaymentHoldOnView = MutableLiveData(true)
    var launchPaymentPage = MutableLiveData(false)
    var finishPage = MutableLiveData(false)
    var status:String=""
    var code:String=""
    private val showCancelledPopupEventMutableLiveData = MutableLiveData<Event<Any>>()
    val showCancelledPopupEventLiveData: LiveData<Event<Any>> get() = showCancelledPopupEventMutableLiveData

    private val showPaymentErrorPopupEventMutableLiveData = MutableLiveData<Event<Any>>()
    val showPaymentErrorPopupEventLiveData: LiveData<Event<Any>> get() = showPaymentErrorPopupEventMutableLiveData

    private val showPaymentPendingPopupEventMutableLiveData = MutableLiveData<Event<Any>>()
    val showPaymentPendingPopupEventLiveData: LiveData<Event<Any>> get() = showPaymentPendingPopupEventMutableLiveData
    var orderId: Long = 0
    var paymentMethod = MutableLiveData("")
    var paymentMethodId = 0L
    var paymentSessionId = ""
    var currentOrderStatus = ""
    var isReorder = false
    var clickedOnPage = ""
    var billDetails = BillDetailsModel()
    var billDetailsResponse:BillDetailResponse.ResponseData? = null
    var totalPayableAmount = MutableLiveData(0.0)
    var mxInternalErrorOccurred=MxInternalErrorOccurred()

    fun initCashFreeSdk(context: Context) {
        CFPaymentGatewayService.getInstance().setCheckoutCallback(this)
        viewModelScope.launch(IO) {
            try{
                showPaymentHoldOnView.postValue(true)
                var response = cashFreeUseCase.createOrderTokenInCashFree(mxInternalErrorOccurred,"", orderId, 3)
                Log.i("response",""+response)
                if (response != null && response.isSuccessful) {
                    paymentSessionId = response.body()!!.string()
                    doDropCheckoutPayment(context)
                }else {
                    try {
                        mxInternalErrorOccurred.errorCode = response?.code()?:0
                        mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                            response?.errorBody()?.string(),
                            ApiCoreResponse::class.java
                        ).message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                    } catch (_: Exception) {
                    }
                }
            }catch (ex: Exception){
                Log.i("cashfree exception ",""+ex.toString())
            }

        }
    }

    override fun onPaymentVerify(orderID: String?) {
        viewModelScope.launch(IO) { //query backend server for payment status and then call below api
            //https://docs.cashfree.com/docs/android-verify-payment
            val obj = JsonObject()
            obj.addProperty("txStatus", "SUCCESS")
            processPaymentDetails(obj)
        }

    }

    override fun onPaymentFailure(cfErrorResponse: CFErrorResponse?, orderID: String?) {
        viewModelScope.launch(IO) {
            status = cfErrorResponse!!.status
            code = cfErrorResponse!!.code

            if (code.equals("action_cancelled", ignoreCase = true)) status = "Cancelled"
            if (code.equals("operation_invalid", ignoreCase = true) || code.equals(
                    "action_flagged",
                    ignoreCase = true
                )
            ) status = "FLAGGED"
            val obj = JsonObject()
            obj.addProperty("txStatus", status)
            processPaymentDetails(obj)
        }
    }

    private suspend fun processPaymentDetails(jsonObject: JsonObject) {
        try {
            if (NetworkConnectivityUtil.isNetworkConnected(context)) {
                val jsonObjectToSend = jsonObject
                if (!jsonObjectToSend.has("orderId")) {
                    jsonObject.addProperty("orderId", orderId)
                }
                val response =
                    cashFreeUseCase.saveCashFreeResponse(mxInternalErrorOccurred, jsonObject)
                if (response?.isSuccessful == true) {
                    updateUI(jsonObjectToSend)
                } else {
                    try {
                        mxInternalErrorOccurred.errorCode = response?.code() ?: 0
                        mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                            response?.errorBody()?.string(),
                            ApiCoreResponse::class.java
                        ).message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                    } catch (_: Exception) {
                    }
                }
            } else {
                triggerPaymentFailedEvent()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private suspend fun updateUI(jsonObject: JsonObject) {
        try {
            if (jsonObject.has("txStatus")) {
                when (jsonObject["txStatus"].asString) {
                    "FAILED" -> {
                        launchPaymentPage.postValue(true)
                        triggerPaymentFailedEvent()
                    }

                    "SUCCESS" -> {
                        triggerPaymentSuccessEvent()
                        showPaymentHoldOnView.postValue(false)
                        showPaymentSuccessView.postValue(true)
                        delay(3000)
                        finishPage.postValue(true)
                    }

                    "Cancelled" -> {
                        showPaymentHoldOnView.postValue(false)
                        loadPageOnPaymentCancelled()
                        triggerPaymentFailedEvent()
                    }
                    "PENDING" -> {
                        //TODO show dialog
                        /*clPayInfo.setVisibility(View.VISIBLE)
                        tvTitle.setText("Payment processing")
                        tvDesc.setVisibility(View.GONE)
                        loanPageOnPaymentCompletion(4)*/
                        showPaymentHoldOnView.postValue(false)
                        loadOnPaymentPending()
                    }

                    "FLAGGED" -> {
                        showPaymentHoldOnView.postValue(false)
                        loadOnPaymentError()
                    }
                    else -> {
                        showPaymentHoldOnView.postValue(false)
                        loadOnPaymentError()
                        
                    }
                }
            }
        } catch (_: Exception) {
        }
    }

    private fun loadPageOnPaymentCancelled(){
        showCancelledPopupEventMutableLiveData.postValue(Event(true))
    }

    private fun loadOnPaymentError(){
        showPaymentErrorPopupEventMutableLiveData.postValue(Event(true))
    }

    private fun loadOnPaymentPending(){
        showPaymentPendingPopupEventMutableLiveData.postValue(Event(true))
    }

    private fun doDropCheckoutPayment(context: Context) {
        try {
            val cfSession = CFSessionBuilder()
                .setEnvironment(
                    if (BuildConfig.FLAVOR.equals(
                            "prod",
                            ignoreCase = true
                        )
                    ) CFSession.Environment.PRODUCTION else CFSession.Environment.SANDBOX
                )
                .setPaymentSessionID(paymentSessionId)
                .setOrderId(orderId.toString())
                .build()
            // Shows only Card and UPI modes
            var cfPaymentComponent: CFPaymentComponent? = null
            cfPaymentComponent = if (paymentMethod.value.equals("CARD", ignoreCase = true)) {
                CFPaymentComponentBuilder()
                    .add(CFPaymentComponent.CFPaymentModes.CARD).build()
            } else if (paymentMethod.value.equals("UPI", ignoreCase = true)) {
                CFPaymentComponentBuilder()
                    .add(CFPaymentComponent.CFPaymentModes.UPI).build()
            } else if (paymentMethod.value.equals("WALLET", ignoreCase = true)) {
                CFPaymentComponentBuilder()
                    .add(CFPaymentComponent.CFPaymentModes.WALLET).build()
            } else if (paymentMethod.value.equals("NB", ignoreCase = true)) {
                CFPaymentComponentBuilder()
                    .add(CFPaymentComponent.CFPaymentModes.NB).build()
            } else {
                CFPaymentComponentBuilder()
                    .add(CFPaymentComponent.CFPaymentModes.CARD)
                    .add(CFPaymentComponent.CFPaymentModes.UPI)
                    .add(CFPaymentComponent.CFPaymentModes.NB)
                    .add(CFPaymentComponent.CFPaymentModes.WALLET)
                    .add(CFPaymentComponent.CFPaymentModes.EMI)
                    .add(CFPaymentComponent.CFPaymentModes.PAY_LATER).build()
            }
            if (cfPaymentComponent != null) {
                // Replace with your application's theme colors
                val cfTheme = CFThemeBuilder().setNavigationBarBackgroundColor("#0071BC")
                    .setNavigationBarTextColor("#ffffff").setButtonBackgroundColor("#45AFF6")
                    .setButtonTextColor("#ffffff").setPrimaryTextColor("#000000")
                    .setSecondaryTextColor("#000000").build()
                val cfDropCheckoutPayment = CFDropCheckoutPaymentBuilder().setSession(cfSession)
                    .setCFUIPaymentModes(cfPaymentComponent).setCFNativeCheckoutUITheme(cfTheme)
                    .build()
                val gatewayService = CFPaymentGatewayService.getInstance()
                gatewayService.doPayment(context, cfDropCheckoutPayment)
            }
        } catch (exception: CFException) {
            exception.printStackTrace()
        }
    }

    fun getCartBillDetails(orderId: Long) = viewModelScope.launch(IO) {
        orderFlowUseCase.calculateBillDetailsforApp(mxInternalErrorOccurred,orderId, true).let { bill ->

            if (bill != null) {
                if (bill.responseData == null) return@launch

                var strikePackagingCharge = 0.0
                bill.responseData.packagingCharge?.let {
                    strikePackagingCharge = 3 * it
                }
                val billData: BillDetailsModel = CommonFunc.convertToBillDetails(
                    bill.responseData,
                    "",
                    totalPayable = bill.responseData.payableAmt.toString(),
                    gst = context.getString(R.string.gst),
                    sellerPackagingCharge = context.getString(R.string.seller_packaging_charges),
                    "",
                    "",
                    strikePackagingCharge
                )
                Log.d("qwerty", "Bill Details payment : ${Gson().toJson(billData)}")


                billDetails = (billData)
                billDetailsResponse = bill.responseData

                paymentMethod.postValue(bill.responseData.paymentSelectionInfo?.paymentMethod ?: "")
                if(bill.responseData.paymentSelectionInfo?.paymentMethodId==null){
                    paymentMethodId = 0
                }else{
                paymentMethodId=bill.responseData.paymentSelectionInfo?.paymentMethodId!!.toLong()
                }

                withContext(Main){
                    totalPayableAmount.value = (bill.responseData.payableAmt)
                    Log.i("pay intent response",""+totalPayableAmount.value)
                }


                //Log.i("paymentMethod",paymentMethod.value!!)
            }
        }
    }

    fun triggerPaymentFailedEvent() {
        sdkEventUseCase.sendPaymentFailedEvent(
            MxPaymentSuccessAndFailed(
                billDetails.discountValue,
                billDetails.estimatedPayableValue,
                if(status!="") status else null ,
                isReorder,
                billDetails.mrpValue,
                orderId,//SharedPrefManager.getInstance().incompleteOrderId
                billDetails.taxesAndChargesValue,
                if (paymentMethod.value.isNullOrEmpty()) null else paymentMethod.value,
                code,
                if(status!="") status else null,
                billDetails.sellingPrice,
                billDetails.tmCreditValue ?:0.0,
                billDetails.tmRewardValue?:0.0,
                currentOrderStatus,
                billDetails.deliveryChargesValue?:0.0,
                billDetails.couponValue?:0.0,
                SharedPrefManager.getInstance().selectedWarehouseID,
                cashHandlingCharge = if(billDetailsResponse?.pspViewed == true) billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null,
                cashHandlingChargeApplicable = if(billDetailsResponse?.pspViewed == true) getApplicableCashHandlingCharger(billDetailsResponse) else null

            )
        )
    }

    fun triggerPaymentSuccessEvent() {
        sdkEventUseCase.sendPaymentSuccessfulEvent(
            MxPaymentSuccessAndFailed(
                discountAmount = billDetails.discountValue,
                estimatedPayableAmount = billDetails.estimatedPayableValue,
                isReorder = isReorder,
                mrpTotalAmount = billDetails.mrpValue,
                orderId=orderId,
                packagingChargeAmount = billDetails.taxesAndChargesValue,
                paymentMode = if (paymentMethod.value.isNullOrEmpty()) null else paymentMethod.value,
                salesPrice = billDetails.sellingPrice,
                tmCreditAmount = billDetails.tmCreditValue?:0.0,
                tmRewardAmount = billDetails.tmRewardValue?:0.0,
                currentOrderStatus=currentOrderStatus,
                deliveryChargeAmount = billDetails.deliveryChargesValue?:0.0,
                couponDiscountAmount = billDetails.couponValue?:0.0,
                cashHandlingCharge = if(billDetailsResponse?.pspViewed == true) billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null,
                cashHandlingChargeApplicable = if(billDetailsResponse?.pspViewed == true) getApplicableCashHandlingCharger(billDetailsResponse) else null
            )
        )
    }
}