package com.intellihealth.truemeds.domain.usecase

import android.app.Application
import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.intellihealth.salt.constants.PaymentOptionRadioConstants
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.CashHandlingApplicableInfo
import com.intellihealth.salt.models.CashHandlingInfoModel
import com.intellihealth.salt.models.PaymentOptionRadioModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.data.utils.ResponseData
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.model.PaymentMethodSelectionModel
import com.intellihealth.truemeds.presentation.model.PaymentSelectionResponse
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody
import java.util.Collections
import javax.inject.Inject

class PaymentOptionsUseCase @Inject constructor(private val orderFlowRepository: OrderFlowRepository,
    @ApplicationContext private val context: Context,
    private val sdkEventUseCase: SdkEventUseCase) {

    /**
     * Fetch icons and payment methods
     * **/
    suspend fun fetchIconMaster(
        mxInternalErrorOccurred: MxInternalErrorOccurred, iconType: String): PaymentMethodResponse? {
        var response: PaymentMethodResponse? = null
        when (val res = orderFlowRepository.fetchIconMaster(mxInternalErrorOccurred, iconType)) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()
                    }else{
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }

                }
            }

            is Resource.Failure -> {
                res.errorCode?.let {
                    res.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            res.errorCode,
                            resErrorBody, res.isNetworkError
                        )
                    }
                }

            }

            else -> {}
        }
        return response
    }

    suspend fun processPaymentMethodsResponse(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        iconMasterResponse: List<PaymentMethodResponse.ResponseData>,
        lastPaymentMethodSelected: String?, isPaymentSpecificCoupon: Boolean,
        couponCodeApplied: String, payableAmountButtonText: Boolean, totalPayableAmount: Double,
        addCOD: Boolean, addMoreForCod: Double, restrictCod: Boolean,
        orderId: Long,
        calculateBillDetail: BillDetailResponse?
    ): PaymentSelectionResponse {
        var paymentOptionsResponseItem: PaymentMethodResponse.ResponseData
        val paymentOptionsList = ArrayList<PaymentMethodResponse.ResponseData>()
        var selectedPaymentMethod = lastPaymentMethodSelected
        var selectedPaymentMethodId = 0L
        var selectedPaymentMethodUrl = ""
        var buttonText = ""
        iconMasterResponse.forEachIndexed{index,paymentResponse ->
            val paymentCategory = paymentResponse.paymentCategory
            val paymentModeUrl = paymentResponse.paymentModeUrl
            val paymentModeUrlId = paymentResponse.paymentModeUrlId
            val paymentOptions = paymentResponse.paymentOptions

            buttonText = if (payableAmountButtonText) {
                if (paymentCategory == context
                        .getString(R.string.cash_on_delivery_btn_text)) {
                    context.getString(R.string.change_to_cod)
                } else {
                    context.getString(R.string.pay_rupee) +
                            (CommonFunc.getNumberFormat().format(totalPayableAmount))
                }
            } else {
                context.getString(R.string.place_order)
            }

            if (selectedPaymentMethod == "" || selectedPaymentMethod?.isEmpty() == true
                || selectedPaymentMethod == null || selectedPaymentMethod == "null"
            ) {
                if (paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION) {
                    paymentOptions?.get(0)?.isPaymentMethodSelected = true
                    selectedPaymentMethod = paymentCategory
                    //selectedPaymentMethodId = paymentOptions?.get(0)?.paymentMethodId!!.toLong()
                    selectedPaymentMethodId = paymentModeUrlId!!.toLong()
                    selectedPaymentMethodUrl = paymentModeUrl!!
                    SharedPrefManager.getInstance().setPaymentSelectedMode(16)
                    SharedPrefManager.getInstance().selectedPaymentMethodIconUrl =
                        paymentModeUrl
                    SharedPrefManager.getInstance().selectedPaymentMethod = paymentCategory
                    SharedPrefManager.getInstance().selectedPaymentMethodId = selectedPaymentMethodId
                        //paymentOptions[0]?.paymentMethodId!!.toLong()
                    paymentOptions?.get(0)?.paymentOptionRadioModel = PaymentOptionRadioModel(
                        PaymentOptionRadioConstants.UPI,
                        selectedPaymentMethod,
                        context.getString(R.string.recommended),
                        context.getString(R.string.faster_checkout),
                        isPaymentSpecificCoupon,if (isPaymentSpecificCoupon) "$couponCodeApplied Applied" else "",
                        if (isPaymentSpecificCoupon) "Additional discount of $couponCodeApplied offer applied on your bill" else "",
                        paymentOptions?.get(0)?.iconPath,buttonText,true,"#FFEDBC",
                        false,"","0",showRecommended = true
                    )
                    val response = setPaymentSelectionMethod(
                        mxInternalErrorOccurred, orderId,
                        selectedPaymentMethodId,
                        selectedPaymentMethod!!,
                        SharedPrefManager.getInstance().lastSelectedPaymentModeId.toLong()
                    )
                }
            } else {
                if (paymentCategory == selectedPaymentMethod) {
                    paymentOptions?.get(0)?.isPaymentMethodSelected = true
                    selectedPaymentMethod = paymentCategory
                    //selectedPaymentMethodId = paymentOptions?.get(0)?.paymentMethodId!!.toLong()
                    selectedPaymentMethodId = paymentModeUrlId!!.toLong()
                    selectedPaymentMethodUrl = paymentModeUrl!!
                    SharedPrefManager.getInstance().selectedPaymentMethodIconUrl =
                        paymentModeUrl
                    SharedPrefManager.getInstance().selectedPaymentMethod = paymentCategory.toString()
                    SharedPrefManager.getInstance().selectedPaymentMethodId = selectedPaymentMethodId
                    if (paymentCategory == context.getString(R.string.cash_on_delivery_btn_text)) {
                        SharedPrefManager.getInstance().setPaymentSelectedMode(17)
                    } else {
                        SharedPrefManager.getInstance().setPaymentSelectedMode(16)
                    }

                    paymentOptions?.get(0)?.paymentOptionRadioModel = PaymentOptionRadioModel(
                        CommonFunc.getCategoryTypeForEnum(paymentCategory!!),
                        selectedPaymentMethod,
                        if(paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION) context.getString(R.string.recommended) else "",
                        if(paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION) context.getString(R.string.faster_checkout) else "",
                        isPaymentSpecificCoupon,if (isPaymentSpecificCoupon) "$couponCodeApplied Applied" else "",
                        if (isPaymentSpecificCoupon) "Additional discount of $couponCodeApplied offer applied on your bill" else "",
                        paymentOptions?.get(0)?.iconPath,buttonText,true,
                        if(paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION)"#FFEDBC" else "#FFFFFF",
                        false,if(selectedPaymentMethod== context.getString(R.string.cash_on_delivery_btn_text) &&
                            restrictCod && addMoreForCod > 0) "Add items worth ₹$addMoreForCod to enable cash on delivery" else "",
                        if(selectedPaymentMethod== context.getString(R.string.cash_on_delivery_btn_text) &&
                                    restrictCod && addMoreForCod > 0) addMoreForCod.toString() else "0",
                        paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION
                    )
                }else{

                    val PaymentOptionRadioModel = PaymentOptionRadioModel(
                        CommonFunc.getCategoryTypeForEnum(paymentCategory!!),
                        paymentCategory,
                        "",
                        "",
                        false,"",
                        "",
                        paymentOptions?.get(0)?.iconPath,buttonText,false,"#FFFFFF",
                        false,if(selectedPaymentMethod== context.getString(R.string.cash_on_delivery_btn_text) &&
                            restrictCod && addMoreForCod > 0) "Add items worth ₹$addMoreForCod to enable cash on delivery" else "",
                        if(selectedPaymentMethod== context.getString(R.string.cash_on_delivery_btn_text) &&
                            restrictCod && addMoreForCod > 0) addMoreForCod.toString() else "0",
                        paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION
                    )
                    paymentOptions?.get(0)?.paymentOptionRadioModel = PaymentOptionRadioModel
                }
            }




            paymentOptionsResponseItem = PaymentMethodResponse.ResponseData(
                paymentCategory,
                paymentModeUrl,
                paymentModeUrlId,
                paymentOptions
            )
            paymentOptionsList.add(paymentOptionsResponseItem)


        }
        if (addCOD) {
            addCodToPaymentOptionsList(
                addCOD, paymentOptionsList,
                context, selectedPaymentMethod,
                addMoreForCod,restrictCod,
                payableAmountButtonText,
                calculateBillDetail,
                totalPayableAmount
            )
        }

        return PaymentSelectionResponse(selectedPaymentMethod!!,selectedPaymentMethodId,
            selectedPaymentMethodUrl,paymentOptionsList, )
    }

    /**
     * Add COD payment method to the already existing payment option list
     * **/

    private fun addCodToPaymentOptionsList(
        addCOD: Boolean, paymentOptionsList: ArrayList<PaymentMethodResponse.ResponseData>,
        context: Context,
        lastPaymentMethodSelected: String?, addMoreForCod: Double, restrictCod: Boolean,
        payableAmountButtonText: Boolean,
        calculateBillDetail: BillDetailResponse?,
        totalPayableAmount: Double
    ) {
        var paymentOptionsResponseItemCOD: PaymentMethodResponse.ResponseData? = null
        if (addCOD) {

            val buttonText = if (payableAmountButtonText) {
                if (lastPaymentMethodSelected == context
                        .getString(R.string.cash_on_delivery_btn_text)) {
                    context.getString(R.string.change_to_cod)
                } else {
                    context.getString(R.string.place_order)
                }
            } else {
                context.getString(R.string.place_order)
            }

            val cashHandlingMessageData =
                if (calculateBillDetail?.responseData?.cashHandlingInfo != null) {
                    CashHandlingInfoModel(
                        charge = calculateBillDetail.responseData.cashHandlingInfo?.charge ?: 0.0,
                        waivedOffCharge = calculateBillDetail.responseData.cashHandlingInfo?.waivedOffCharge
                            ?: 0.0,
                        placeOrderViaPaymentMethodId = 6,
                        chcMsg = calculateBillDetail.responseData.cashHandlingInfo?.chcMsg,
                        placeOrderViaMsg = context.getString(R.string.place_order_via_chc_msg) + calculateBillDetail.responseData.payableAmountWithoutChc,
                        isPayableAmountWithoutChcSameAsPayableAmnt =(calculateBillDetail.responseData.payableAmt  == calculateBillDetail.responseData.payableAmountWithoutChc)
                    )
                } else null

            val cashHandlingApplicableMessageData =
                if (calculateBillDetail?.responseData?.cashHandlingApplicableInfo != null) {
                    CashHandlingApplicableInfo(
                        charge = calculateBillDetail.responseData.cashHandlingApplicableInfo?.charge ?: 0.0,
                        waivedOffCharge = calculateBillDetail.responseData.cashHandlingApplicableInfo?.waivedOffCharge
                            ?: 0.0,
                        chcMsg = calculateBillDetail.responseData.cashHandlingApplicableInfo?.chcMsg,
                    )
                } else null
            val paymentOptionRadioModel = PaymentOptionRadioModel(
                PaymentOptionRadioConstants.COD,
                context.getString(R.string.cash_on_delivery_btn_text),
               "",
                "",
                false,
                "",
                "","",if(calculateBillDetail?.responseData?.cashHandlingInfo != null && calculateBillDetail.responseData.payableAmt  != calculateBillDetail.responseData.payableAmountWithoutChc) (buttonText + " at ₹"+ calculateBillDetail?.responseData?.payableAmt )else buttonText,
                if(restrictCod && addMoreForCod > 0) false else lastPaymentMethodSelected == context
                        .getString(R.string.cash_on_delivery_btn_text),"#FFFFFF",
                restrictCod,if(restrictCod && addMoreForCod > 0) "Add items worth ₹$addMoreForCod to enable cash on delivery" else "",
                if(restrictCod && addMoreForCod > 0) addMoreForCod.toString() else "0",false,cashHandlingMessageData,
                chcApplicableModel= cashHandlingApplicableMessageData
            )

            val paymentOptions =
                ArrayList<PaymentMethodResponse.PaymentOption>()
            paymentOptions.add(
                PaymentMethodResponse.PaymentOption(
                    true,
                    System.currentTimeMillis(),
                    11,
                    context.getString(R.string.cash_on_delivery_btn_text),
                    "",
                    context.getString(R.string.cash_on_delivery_btn_text),
                    "",
                    11,false,paymentOptionRadioModel
                )
            )
            paymentOptionsResponseItemCOD = PaymentMethodResponse.ResponseData(
                context.getString(
                    R.string.cash_on_delivery_btn_text
                ), "", 11, paymentOptions
            )
            if (!paymentOptionsList.contains(paymentOptionsResponseItemCOD)) {
                paymentOptionsList.add(paymentOptionsList.size, paymentOptionsResponseItemCOD)
            }
        }
        paymentOptionsResponseItemCOD?.let {
            if (paymentOptionsResponseItemCOD.paymentCategory == lastPaymentMethodSelected) {
                paymentOptionsResponseItemCOD.paymentOptions?.get(0)?.isPaymentMethodSelected = true
            }

            /*if (paymentOptionsResponseItemCOD.paymentCategory == context.getString(
                    R.string.cash_on_delivery_btn_text
                )
            ) {
                SharedPrefManager.getInstance().setPaymentSelectedMode(17)
            } else {
                SharedPrefManager.getInstance().setPaymentSelectedMode(16)
            }*/
        }
    }

    /**
     * store all payment options list as coming from the API
     * **/
    suspend fun setOriginalPaymentOptionsList(
        paymentOptionsList: ArrayList<PaymentMethodResponse.ResponseData>,
        application: Application
    ):
            Pair<ArrayList<PaymentMethodResponse.ResponseData>, Int> {
        var selectedIndex = -1
        var totalPaymentOptionsList = ArrayList<PaymentMethodResponse.ResponseData>()
        for (i in 0 until paymentOptionsList.size) {
            if (paymentOptionsList[i].paymentOptions?.get(0)?.isPaymentMethodSelected!! && paymentOptionsList[i].paymentCategory != BundleConstants.PAYMENT_DEFAULT_OPTION
                && paymentOptionsList[i].paymentCategory != application.getString(
                    R.string.cash_on_delivery_btn_text
                )
            ) {
                selectedIndex = i
            }
        }
        totalPaymentOptionsList = paymentOptionsList
        return Pair(totalPaymentOptionsList, selectedIndex)
    }

    /**
     * Store temporary payment options list to show view more button functionality
     * This will be applicable for only if payment specific coupon is applied on the order
     * **/
    suspend fun setTemporaryPaymentOptionsList(
        paymentOptionsList: ArrayList<PaymentMethodResponse.ResponseData>,
        selectedIndex: Int
    ): ArrayList<PaymentMethodResponse.ResponseData> {
        val temp: PaymentMethodResponse.ResponseData
        var index = selectedIndex
        if (selectedIndex != -1) {
            temp = paymentOptionsList[1]
            paymentOptionsList[1] = paymentOptionsList[index]
            paymentOptionsList[index] = temp
            index = 0
        }
        return paymentOptionsList
    }

    fun onPaymentMethodSelected(
        item: PaymentMethodResponse.ResponseData,
        paymentList: List<PaymentMethodResponse.ResponseData>,
        position: Int,
        payableAmountButtonText: Boolean,
        totalPayableAmount: Double,
        clickedOnPage: String,
        isPaymentSpecificCoupon: Boolean,
        appliedCouponCode: String,
        addCOD: Boolean,
        restrictCod: Boolean,
        addMoreForCod: Double,
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long
    ) : PaymentMethodSelectionModel {

        Log.i("appliedCouponCode",appliedCouponCode)

        var buttonText = ""
        var paymentMethod = ""
        var paymentMethodId = 0L
        var paymentMethodUrl = ""
        var paymentMethodSelectionModel : PaymentMethodSelectionModel? = null
        if (paymentList != null) {
            buttonText = if (payableAmountButtonText) {
                if (paymentList[position].paymentCategory == context
                        .getString(R.string.cash_on_delivery_btn_text)
                ) {
                    context.getString(R.string.change_to_cod)
                } else {
                    context.getString(R.string.pay_rupee) +
                            (CommonFunc.getNumberFormat().format(totalPayableAmount))
                }
            } else {
                context.getString(R.string.place_order)
            }

            for (element in paymentList) {
                element.paymentOptions?.get(0)?.isPaymentMethodSelected = false
                element.paymentOptions?.get(0)?.paymentOptionRadioModel?.isSelected = false
                element.paymentOptions?.get(0)?.paymentOptionRadioModel?.isCouponApplied = false
                if (paymentList[position].paymentCategory == item.paymentCategory) {
                    Log.i("item.category",paymentList[position].paymentCategory!!)
                    paymentList[position].paymentOptions?.get(0)?.isPaymentMethodSelected = true
                    paymentMethod = paymentList[position].paymentCategory!!
                    paymentMethodId = paymentList[position].paymentModeUrlId?.toLong()!!
                    paymentMethodUrl = paymentList[position].paymentModeUrl.toString()
                     paymentList[position].paymentOptions?.get(0)?.paymentOptionRadioModel = PaymentOptionRadioModel(
                        CommonFunc.getCategoryTypeForEnum(paymentList[position].paymentCategory!!),
                        paymentList[position].paymentCategory,
                        if(paymentList[position].paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION) context.getString(R.string.recommended) else "",
                        if(paymentList[position].paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION) context.getString(R.string.faster_checkout) else "",
                        isPaymentSpecificCoupon,if (isPaymentSpecificCoupon) "$appliedCouponCode Applied" else "",
                        if (isPaymentSpecificCoupon) "Additional discount of $appliedCouponCode offer applied on your bill" else "",
                        paymentList[position].paymentOptions?.get(0)?.iconPath,buttonText,true,
                        if(paymentList[position].paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION)"#FFEDBC" else "#FFFFFF",
                        false,if(paymentList[position].paymentCategory== context.getString(R.string.cash_on_delivery_btn_text) &&
                            restrictCod && addMoreForCod > 0) "Add items worth ₹$addMoreForCod to enable cash on delivery" else "",
                        if(paymentList[position].paymentCategory== context.getString(R.string.cash_on_delivery_btn_text) &&
                            restrictCod && addMoreForCod > 0) addMoreForCod.toString() else "0",
                         paymentList[position].paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION
                    )
                    //paymentMethodSelected.value = true
                    if (clickedOnPage == BundleConstants.ORDER_SUMMARY || clickedOnPage == BundleConstants.REORDER) {
                        SharedPrefManager.getInstance().selectedPaymentMethodIconUrl =
                            paymentList[position].paymentModeUrl.toString()
                        SharedPrefManager.getInstance().selectedPaymentMethod =
                            paymentList[position].paymentCategory.toString()
                        SharedPrefManager.getInstance().selectedPaymentMethodId =
                            paymentList[position].paymentModeUrlId?.toLong()!!
                    }
                    if (item.paymentCategory == context.getString(R.string.cash_on_delivery_btn_text)) {
                        SharedPrefManager.getInstance().setPaymentSelectedMode(17)
                    } else {
                        SharedPrefManager.getInstance().setPaymentSelectedMode(16)
                    }
                }else{

                }
            }
            paymentMethodSelectionModel = PaymentMethodSelectionModel(paymentMethod,
                paymentMethodId,
                paymentMethodUrl,
                paymentList )
        }
        return paymentMethodSelectionModel!!
    }

    /**
     * Check if any payment specific coupon is applied on the order
     * **/
    suspend fun checkForPaymentSpecificCouponApplied(
        isPaymentSpecificCoupon: Boolean,
        totalPaymentOptionsList: ArrayList<PaymentMethodResponse.ResponseData>
    ):
            MutableList<PaymentMethodResponse.ResponseData> {

        val totalPaymentList = totalPaymentOptionsList

        if (isPaymentSpecificCoupon) {
            return if (totalPaymentList != null && totalPaymentList.size > 0) {
                if (totalPaymentList[0].paymentCategory == BundleConstants.PAYMENT_DEFAULT_OPTION &&
                    totalPaymentList[0].paymentOptions?.get(0)?.isPaymentMethodSelected!!
                ) {
                    totalPaymentList.subList(0, 1)
                } else {
                    if (totalPaymentList.size > 2) {
                        totalPaymentList.subList(0, 2)
                    } else {
                        totalPaymentList
                    }
                }
            } else {
                Collections.emptyList()
            }
        } else {
            return totalPaymentList
        }
    }

    /**
     * In PSP screen when the user has the option to PAY
     * 1) User clicks on Pay button on PSP screen
     * 2) Selected paymentMethodId, paymentMethod and orderId gets passed to the API as request parameters
     * 3) As well as user is redirected to Payment Activity(CashFree screen) where User gets the option to Pay via different payment methods or
     * selected payment method screen.
     * **/
    suspend fun setPaymentSelectionMethod(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentMethodId: Long,
        paymentMethod: String,
        paymentMode : Long
    ) : Boolean {
        var response = false
        when (val res = orderFlowRepository.setPaymentSelectionMethod(
            mxInternalErrorOccurred, orderId,
            paymentMethodId,
            paymentMethod,
            paymentMode
        )) {
            is Resource.Success -> {
                res.value?.let {
                    if (res.value.isSuccessful) {
                        response = true
                    }
                }
            }

            is Resource.Failure -> {
                response = false
                /*val keyValuePairs = ArrayList<KeyValuePair>()
                var jsonObject: JSONObject? = null
                try {
                    jsonObject = JSONObject(res.errorBody?.string())
                    val keys = jsonObject.keys()
                    var key = ""
                    var value = ""
                    while (keys.hasNext()) {
                        key = keys.next()
                        if (jsonObject != null) {
                            value = jsonObject.optString(key)
                        }
                        if (key != "" && value != "") keyValuePairs.add(
                            KeyValuePair(key, value)
                        )
                    }
                    //TODO
                    *//*CommonFunc.showCustomToastMessage(getApplication(), value)*//*
                } catch (e: JSONException) {
                    Log.i("e", e.message.toString())
                    response = false
                    //TODO
                    *//* CommonFunc.showCustomToastMessage(
                         getApplication(),
                         "Unable to connect to server. Please try again"
                     )*//*
                }*/
            }

            else -> {
                response = false
            }
        }
        return response
    }
    
    
    suspend fun setPspViewedByCustomer(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long
    ) {
        when (val res = orderFlowRepository.setPspViewedByCustomer(mxInternalErrorOccurred,
            orderId,
            true
        )) {
            is Resource.Success -> {
                res.value?.let {
                
                }
            }
            
            is Resource.Failure -> {
                /*val keyValuePairs = ArrayList<KeyValuePair>()
                var jsonObject: JSONObject? = null
                try {
                    jsonObject = JSONObject(res.errorBody!!.string())
                    val keys = jsonObject.keys()
                    var key = ""
                    var value = ""
                    while (keys.hasNext()) {
                        key = keys.next()
                        if (jsonObject != null) {
                            value = jsonObject.optString(key)
                        }
                        if (key != "" && value != "") keyValuePairs.add(
                            KeyValuePair(key, value)
                        )
                    }
                    //TODO
                    *//*CommonFunc.showCustomToastMessage(getApplication(), value)*//*
                } catch (e: JSONException) {
                    Log.i("e", e.message.toString())
                    //TODO
                    *//* CommonFunc.showCustomToastMessage(
                         getApplication(),
                         "Unable to connect to server. Please try again"
                     )*//*
                }*/
            }
            
            else -> {
            
            }
        }
    }

    fun calculateBillDetailsOnBillUpdate(billDetails : BillDetailsModel) : Pair<BillDetailsModel,Double>{
        if (SharedPrefManager.getInstance().couponModel == null) {
            billDetails.couponDiscountAmt = 0.0
            Log.i("couponModel","couponModel null")
            billDetails.couponName = ""
            billDetails.couponValue = 0.0
        }

        var payableAmount: Double =
            billDetails.mrpValue!!.minus(billDetails.discountValue!!).plus(billDetails.deliveryChargesValue!!)
                .plus(billDetails.taxesAndChargesValue!!).minus(billDetails.couponDiscountAmt!!)
                .minus(billDetails.tmRewardValue!!).minus(billDetails.tmCreditValue!!)

        Log.i("couponModel", "payableAmount $payableAmount")

        if (payableAmount < 0) {
            payableAmount = 0.0
        }
        billDetails.estimatedPayableValue = payableAmount
        return Pair(billDetails,payableAmount)

    }

    fun setDataBasedOnPspVariant(appliedCouponCode : String) : String{
        var couponCodeApplied = ""
        //if (SharedPrefManager.getInstance().prefPspExperimentVariant == VariantAssignments.PSP_EXPERIMENT_VARIANT_B) {
            if (SharedPrefManager.getInstance().isFtc) {
                if (SharedPrefManager.getInstance().couponModel != null) {
                    couponCodeApplied =
                        SharedPrefManager.getInstance().couponModel.promoCode.toString()
                }else{
                    couponCodeApplied = appliedCouponCode
                }
            } else {
                if (SharedPrefManager.getInstance().couponModel != null) {
                    couponCodeApplied =
                        SharedPrefManager.getInstance().couponModel.promoCode.toString()
                }else{
                    couponCodeApplied = appliedCouponCode
                }
            }
        //}
        /*else if (SharedPrefManager.getInstance().prefPspExperimentVariant.equals(VariantAssignments.PSP_EXPERIMENT_VARIANT_C)) {
            if (SharedPrefManager.getInstance().isFtc) {
                if (SharedPrefManager.getInstance().sessionCouponModel != null) {
                    if (SharedPrefManager.getInstance().sessionCouponModel.coupon_code_applied!!) {
                        if ((BundleConstants.FTC_COUPON_CODE.isNotEmpty() &&
                                    SharedPrefManager.getInstance().sessionCouponModel.coupon_code == BundleConstants.FTC_COUPON_CODE)
                            || (BundleConstants.FTC_COUPON_CODE_1.isNotEmpty() &&
                                    SharedPrefManager.getInstance().sessionCouponModel.coupon_code == BundleConstants.FTC_COUPON_CODE_1)
                        ) {
                            //showFtcCouponTimer.value = true
                        }
                        couponCodeApplied =
                            SharedPrefManager.getInstance().sessionCouponModel.coupon_code.toString()
                    }
                }
            } else {
                if (SharedPrefManager.getInstance().sessionCouponModel != null) {
                    couponCodeApplied =
                        SharedPrefManager.getInstance().sessionCouponModel.coupon_code.toString()
                }
            }
        }*/
        return couponCodeApplied
    }





    suspend fun setErrorResponseBody(
        errorCode: Int,
        errorBody: ResponseBody,
        isNetworkError: Boolean
    ): ResponseData {
        return ResponseData(errorCode, errorBody, isNetworkError)
    }
}