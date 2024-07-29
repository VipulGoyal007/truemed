package com.intellihealth.truemeds.domain.usecase

import android.content.Context
import android.util.Log
import androidx.core.content.ContextCompat
import com.google.gson.Gson
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxCouponRemoved
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.data.utils.ResponseData
import com.intellihealth.truemeds.data.utils.removeExtraZeros
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.mvvm.data.mixpanel.MxCouponApplied
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.utils.roundOffDecimal
import okhttp3.ResponseBody
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.TimeZone
import javax.inject.Inject


class CouponUseCase @Inject constructor(
//    @ApplicationContext private val context: Context,
    private val orderFlowRepository: OrderFlowRepository,
    private val sdkEventUseCase: SdkEventUseCase
) {
    /*private val couponList: ArrayList<CouponCodeResponse> = ArrayList()
    private var couponCodeResponse: CouponCodeResponse? = null*/


    suspend fun fetchAllOffers(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        result: Int,
        pinCode: String,
        offerType: String,
        categoryType: String,
        variantId: Long?
    ): CouponCodeResponse? =
        when (val res = orderFlowRepository.fetchCouponData(mxInternalErrorOccurred,
            result,
            pinCode,
            offerType,
            categoryType,
            variantId
        )) {
            is Resource.Success -> if(res.value?.isSuccessful==true){
                res.value.body()?.responseData?.forEach{
                    it.expiryDateFromApi=it.expiryDate //original "expiryDate" set in "expiryDateFromApi" paramter
                }
                res.value.body()} else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }


    suspend fun applyAndRemoveCouponCode(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentId: String,
        offerId: String,
        billDetailsData: BillDetailResponse.ResponseData? = null,
        clickedOnPage: String = "",
        coupon: CouponCodeResponse.Coupon? = null,
        medicineListDataReceived: MutableList<MedicineListDetailsSent>? = null
    ): CouponSaveRemoveResponse? {
        var response: CouponSaveRemoveResponse? = null
        when (val res = orderFlowRepository.savePaymentAndCouponForOrder(mxInternalErrorOccurred,
            orderId,
            paymentId,
            offerId
        )) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        if (offerId.toInt() > 0) {

                            callCouponAppliedEvent(
                                billDetailsData,
                                clickedOnPage,
                                coupon,
                                orderId,
                                it.body()?.responseData?.couponDiscount?.toString() ?: "0",
                                medicineListDataReceived
                            )
                        } else {
                            callCouponRemovedEvent(billDetailsData, clickedOnPage, coupon, orderId,
                                it.body()?.responseData?.couponDiscount?.toString() ?: "0")

                        }
                        response = it.body()
                    }else {
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

            else -> null
        }
        return response
    }

    fun getCalendarData(millis: Long): Calendar? {
        val cal = Calendar.getInstance()
        cal.timeInMillis = millis * 1000L
        cal.timeZone = TimeZone.getTimeZone("UTC")
        return cal
    }

    fun callCouponRemovedEvent(
        billDetailsData: BillDetailResponse.ResponseData? = null,
        clickedOnPag: String = "",
        coupon: CouponCodeResponse.Coupon? = null,
        orderId: Long,
        discountAmountApiResponse: String = ""
    ) {
        if (coupon != null) {

            val cal: Calendar = getCalendarData(coupon?.expiryDateFromApi!!)!!

            //event data
            var clickedOnPage = clickedOnPag
            var couponDiscountAmountEventValue: Double = 0.0

           // var couponExpDate: Date? = cal.getTime()  //old app coupon removed value is removed
            var couponExpDate: Date? = convertMillisToDate(coupon?.expiryDateFromApi!!) // made same as coupon applied case
            Log.e("expirry_date:::::",coupon?.expiryDateFromApi.toString()+"::::::"+ couponExpDate.toString())

            var couponExpiryPeriod: Int = coupon?.couponExpiryPeriod?.toInt() ?: 0
            var couponId: String = coupon?.offerId?.toString() ?: ""
            var couponName: String = coupon?.promoCode.toString()
            var couponSubTitle: String = coupon?.title.toString()
            var discountAmountEventValue: Double = 0.0
            var urgencyTimeRemaining: Long = 0
            //  var urgencyTimeRemaining: Long = DateUtils.convertMillisToSeconds(DateUtils.convertEpochTimeStampToDateMillis(SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime, System.currentTimeMillis()))

            if (coupon.showFtcCounter == false) {
                urgencyTimeRemaining = 0
            } else if (coupon.showFtcCounter == true) {
                urgencyTimeRemaining = DateUtils.convertMillisToSeconds(
                    DateUtils.convertEpochTimeStampToDateMillis(
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime,
                        System.currentTimeMillis()
                    )
                )
            }


            var whIdEventValue = SharedPrefManager.getInstance().selectedWarehouseID


            if (billDetailsData != null) {
                /*billDetailsData?.let { billDetailsData ->
                    couponDiscountAmountEventValue = billDetailsData.couponAppliedAmt ?: 0.0
                    discountAmountEventValue = billDetailsData.discount ?: 0.0
                }*/
                couponDiscountAmountEventValue = billDetailsData.couponDiscountAmt ?: 0.0
                discountAmountEventValue = billDetailsData.discount ?: 0.0
            } else {
                val map = SharedPrefManager.getInstance().currentOrderAmountDetails
                couponDiscountAmountEventValue = removeExtraZeros((map[SharedPrefManager.PREF_COUPON_DISCOUNT_AMT_EVENT] ?: 0.0).toDouble())
                discountAmountEventValue =
                    removeExtraZeros(
                        (map[SharedPrefManager.PREF_DISCOUNT_EVENT]
                            ?: 0.0).toDouble()
                    )
            }
          // Log.e("coupon_discount:::",":::"+discountAmountApiResponse)
           // couponDiscountAmountEventValue = (discountAmountApiResponse.ifEmpty{"0.0"}).toDouble()


            var mxCouponRemoved = MxCouponRemoved(
                clickedOnPage = clickedOnPage,
                couponDiscountAmount = couponDiscountAmountEventValue,
                couponExpiryDate = couponExpDate,
                couponExpiryPeriod = couponExpiryPeriod,
                couponId = couponId,
                couponName = couponName,
                discountAmount = discountAmountEventValue,
                urgencyTimeRemaining = if (coupon.showFtcCounter == true) urgencyTimeRemaining else null,
                couponSubtitle = couponSubTitle,
                whId = whIdEventValue
            )
Log.e("removed_data::::",mxCouponRemoved.toString())
            sdkEventUseCase.sendCouponRemovedEvent(mxCouponRemoved)
        }
    }

    fun convertMillisToDate(millis: Long?): Date? {
        return try {
            val myFormat = SimpleDateFormat("dd MMM yyyy")
            val date = Date()
            val futureDateString = myFormat.format(millis)
            myFormat.parse(futureDateString)



        } catch (e: java.lang.Exception) {

            e.printStackTrace()
            null
        }
    }


    fun callCouponAppliedEvent(
        billDetailsData: BillDetailResponse.ResponseData? = null,
        clickedOnPag: String = "",
        coupon: CouponCodeResponse.Coupon? = null,
        orderId: Long,
        discountAmountApiResponse: String = "",
        medicineListDataReceived: MutableList<MedicineListDetailsSent>? = null
    ) {
        if (coupon != null) {

            val cal: Calendar = getCalendarData(coupon?.expiryDateFromApi!!)!!

            //event data
            var clickedOnPage = clickedOnPag
            var couponDiscountAmountEventValue: Double = 0.0
           // var couponExpDate: Date? = cal.getTime()
            var couponExpDate: Date? = convertMillisToDate(coupon?.expiryDateFromApi!!)
            Log.e("expirry_date:::::",coupon?.expiryDateFromApi.toString()+"======"+ couponExpDate.toString())
            var couponExpiryPeriod: Int = coupon?.couponExpiryPeriod?.toInt() ?: 0
            var couponId: String = coupon?.offerId?.toString() ?: ""
            var couponName: String = coupon?.promoCode.toString()
            var couponSubtitle: String = coupon?.description.toString()
            var deliveryChargeAmountEventValue: Double = 0.0
            var discountAmountEventValue: Double = 0.0
            var itemNamesEventValue: ArrayList<String> = arrayListOf()
            var mrpTotalAmountEventValue: Double = 0.0
            var noOfItemEventValue: Int = 0
            var orderIdEventValue: String = orderId.toString()
            var packagingChargesAmountEventValue: Double = 0.0
            var estimatedPayableAmountEventValue: Double = 0.0
            var productsIdsEventValue: ArrayList<String> = arrayListOf()
            var subsIdEventValue: Int = 0 // Todo -  when provide from getOrderMedicine api
            var tmCreditAmountEventValue: Double = 0.0
            var tmRewardAmountEventValue: Double = 0.0
            var updatedEstimatedPayableAmount: Double = 0.0
            var cashHandlingCharge: Double? = 0.0
            var cashHandlingChargeApplicable: Double? = 0.0
            //var urgencyTimeRemaining: Long = DateUtils.convertMillisToSeconds(DateUtils.convertEpochTimeStampToDateMillis(SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime, System.currentTimeMillis()))

            var urgencyTimeRemaining: Long = 0
            if (coupon.showFtcCounter == false) {
                urgencyTimeRemaining = 0
            } else if (coupon.showFtcCounter == true) {
                urgencyTimeRemaining = DateUtils.convertMillisToSeconds(
                    DateUtils.convertEpochTimeStampToDateMillis(
                        System.currentTimeMillis() + 3600000,
                        System.currentTimeMillis()
                    )
                )
            }


            var totalDiscountAmount: String = ""



            if (billDetailsData != null) {
                billDetailsData?.let { billDetailsData ->
//                    couponDiscountAmountEventValue = roundOffDecimal(billDetailsData.couponAppliedAmt ?: 0.0)//(discountAmountApiResponse.ifEmpty{"0.0"}).toDouble()
                    discountAmountEventValue =
                        billDetailsData.discount ?: 0.0
                    deliveryChargeAmountEventValue =
                        billDetailsData.deliveryCharge ?: 0.0
                    mrpTotalAmountEventValue =
                        billDetailsData.mrp ?: 0.0
                    packagingChargesAmountEventValue =
                        billDetailsData.packagingCharge ?: 0.0
                    estimatedPayableAmountEventValue =
                        billDetailsData.payableAmt ?: 0.0
                    tmCreditAmountEventValue =
                        billDetailsData.tmCredit ?: 0.0
                    tmRewardAmountEventValue =
                        billDetailsData.tmCash ?: 0.0
                    updatedEstimatedPayableAmount=  (billDetailsData.payableAmt!!.toDouble() -(discountAmountApiResponse.toDouble()))?:0.0
                    cashHandlingCharge= if(billDetailsData.pspViewed) billDetailsData.cashHandlingInfo?.charge ?: 0.0 else null
                    cashHandlingChargeApplicable=if(billDetailsData.pspViewed) CommonFunc.getApplicableCashHandlingCharger(billDetailsData) else null
                }
            } else {
                val map = SharedPrefManager.getInstance().currentOrderAmountDetails

              //  couponDiscountAmountEventValue = removeExtraZeros((map[SharedPrefManager.PREF_COUPON_DISCOUNT_AMT_EVENT] ?: 0.0).toDouble())
                discountAmountEventValue =
                    removeExtraZeros((map[SharedPrefManager.PREF_DISCOUNT_EVENT] ?: 0.0).toDouble())
                deliveryChargeAmountEventValue =
                    (map[SharedPrefManager.PREF_CURRENT_ORDER_DELIVERY_CHARGE] ?: 0.0).toDouble()
                mrpTotalAmountEventValue =
                    removeExtraZeros((map[SharedPrefManager.PREF_MRP_EVENT] ?: 0.0).toDouble())
                packagingChargesAmountEventValue =
                    (map[SharedPrefManager.PREF_CURRENT_ORDER_PACKAGE_CHARGE] ?: 0.0).toDouble()
                estimatedPayableAmountEventValue =
                    (map[SharedPrefManager.PREF_API_FINAL_CALC_PAYABLE] ?: 0.0).toDouble()
                tmCreditAmountEventValue =
                    (map[SharedPrefManager.PREF_CURRENT_ORDER_TM_CREDIT] ?: 0.0).toDouble()
                tmRewardAmountEventValue =
                    (map[SharedPrefManager.PREF_CURRENT_ORDER_TM_CASH] ?: 0.0).toDouble()

                updatedEstimatedPayableAmount=  (estimatedPayableAmountEventValue -(discountAmountApiResponse.toDouble()))?:0.0
            }


            totalDiscountAmount = discountAmountApiResponse

            if (!medicineListDataReceived.isNullOrEmpty()) {
                for (i in 0..medicineListDataReceived.size!! - 1) {
                    itemNamesEventValue.add(medicineListDataReceived.get(i)?.skuName ?: "")
                    productsIdsEventValue.add(medicineListDataReceived.get(i)?.productCode ?: "")
                }
            }

            noOfItemEventValue = itemNamesEventValue.size ?: 0
            couponDiscountAmountEventValue = removeExtraZeros((discountAmountApiResponse.ifEmpty{"0.0"}).toDouble())

            var mxCouponApplied = MxCouponApplied(
                clickedOnPage,
                roundOffDecimal( couponDiscountAmountEventValue ),
                couponExpDate,
                couponExpiryPeriod,
                couponId,
                couponName,
                couponSubtitle,
                deliveryChargeAmountEventValue,
                discountAmountEventValue,
                itemNamesEventValue,
                mrpTotalAmountEventValue,
                noOfItemEventValue,
                orderIdEventValue,
                packagingChargesAmountEventValue,
                estimatedPayableAmountEventValue,
                productsIdsEventValue,
                subsIdEventValue.toString(),
                tmCreditAmountEventValue,
                tmRewardAmountEventValue,
                updatedEstimatedPayableAmount,
                if (coupon.showFtcCounter == true) urgencyTimeRemaining else null,
                totalDiscountAmount,
                cashHandlingCharge = cashHandlingCharge,
                cashHandlingChargeApplicable = cashHandlingChargeApplicable
            )
            Log.e("coupon_applied","online:::::"+mxCouponApplied)

            sdkEventUseCase.sendCouponAppliedEvent(mxCouponApplied)
        }
    }

    private fun setStickyNotificationData(
        couponCode: kotlin.String,
        context: Context
    ): StickyNonStickyNotificationModel {
        return StickyNonStickyNotificationModel(
            message = "$couponCode applied",
            amount = 423.34,
            subTitle = "",
            timer = "Ends in 20m:05s",
            buttonText = "",
            drawableLeft = ContextCompat.getDrawable(
                context,
                R.drawable.ic_coupon_applied
            ),
            buttonIcon = null

        )
    }


    suspend fun setErrorResponseBody(
        errorCode: Int,
        errorBody: ResponseBody,
        isNetworkError: Boolean
    ): ResponseData {
        return ResponseData(errorCode, errorBody, isNetworkError)
    }
}





















