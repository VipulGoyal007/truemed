package com.intellihealth.truemeds.domain.usecase

import android.content.Context
import android.text.TextUtils
import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.KeyValuePair
import com.intellihealth.truemeds.data.model.ResponseCodeModel
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.OrderDetailsResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.ConfirmOrderUseCaseResponse
import com.intellihealth.truemeds.data.model.orderflow.GetCustomerOrderDetails
import com.intellihealth.truemeds.data.model.orderflow.GetOrderMedicineDetails
import com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse
import com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.model.orderflow.ReorderStatusData
import com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse
import com.intellihealth.truemeds.data.model.orderflow.SaveRxImageForCustomerIdResponse
import com.intellihealth.truemeds.data.model.orderstatus.DoctorRating
import com.intellihealth.truemeds.data.model.ordersummary.AddressResponse
import com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo
import com.intellihealth.truemeds.data.repository.datasource.local.entity.getSellingPrice
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.data.utils.ResponseData
import com.intellihealth.truemeds.domain.enums.NetworkResponseType
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository
import com.intellihealth.truemeds.domain.repository.UserDataRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.mvvm.data.mixpanel.MxCouponApplied
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.model.GetAllPatientModel
import com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel
import com.intellihealth.truemeds.presentation.model.MedicineDetailsMain
import com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse
import com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.model.SearchResultElasticResponse
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.ClassNameConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.utils.VariantAssignments
import com.intellihealth.truemeds.presentation.utils.roundOffDecimal
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.TimeZone
import javax.inject.Inject

class OrderFlowUseCase @Inject constructor(
    private val orderFlowRepository: OrderFlowRepository,
    private val userDataRepository: UserDataRepository,
    private val localDbUseCase: LocalDbUseCase,
    private val sdkEventUseCase: SdkEventUseCase,
    @ApplicationContext private val context: Context
) {

    /**
     * This api creates the order and returns orderId in response
     * **/
    suspend fun saveMedsAndCreateOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        loggedInUserId: String,
        orderId: Long,
        array: List<MedicineDto>,
        offerId: String,
        variantId: Long?,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        srcType: Long,
        pinCode: String
    ): SaveMedsCreateEditOrderResponse? {
        try {
            return when (val res = orderFlowRepository.saveMedsAndCreateOrder(
                mxInternalErrorOccurred,
                loggedInUserId,
                orderId,
                array,
                offerId,
                variantId,
                checkAutoConfirmEligibility,
                newAlgo,
                srcType,
                pinCode
            )) {
                is Resource.Success -> {

                    if (res.value?.isSuccessful == true) {
                        SharedPrefManager.getInstance().setIsReOder(false)
                        SharedPrefManager.getInstance().incompleteOrderId =
                            res.value?.body()?.responseData?.orderId ?: 0
                    }else {
                        try {
                            mxInternalErrorOccurred.errorCode = res.value?.code()?:0
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                res.value?.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                    res.value?.body()
                    /*res.value?.body()?.orderId?.let {
                        SharedPrefManager.getInstance().incompleteOrderId = it
                        200
                    }*/
                }

//                is Resource.Failure -> 1
                else -> return  null
            }
        } catch (ex: Exception) {
            return null
        }

    }

    /**
     * This api creates the order and returns orderId in response
     * **/
    suspend fun saveMedsAndCreateOrderWithCategoryId(
        loggedInUserId: String,
        orderId: String,
        array: JsonArray,
        offerId: String,
        processingFeeVariantId: Long,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        srcType: Int,
        pinCode: String
    ) {

    }

    suspend fun tagPatientIdWithOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        patientId: Long,
        loggedInUserId: String
    ): Int? {
        return try {
            when (val res =
                orderFlowRepository.updatePatientIdInSubOrder(mxInternalErrorOccurred, orderId, patientId, loggedInUserId)) {
                is Resource.Success -> {
                    if(res.value?.isSuccessful==true) res.value.body() else {
                        try {
                            mxInternalErrorOccurred.errorCode = res.value?.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                res.value?.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                    //SharedPrefManager.getInstance().patientId = patientId
                    NetworkResponseType.SUCCESS.ordinal
                }

                is Resource.Failure -> NetworkResponseType.FAILURE.ordinal
                else -> NetworkResponseType.UNEXPECTED.ordinal
            }
        } catch (ex: Exception) {
            NetworkResponseType.EXCEPTION.ordinal
        }
    }


    suspend fun saveAddressForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,orderId: Long, addressId: Long, loggedInUserId: String): Int? {
        return try {
            when (val res =
                orderFlowRepository.saveAddressForOrder(mxInternalErrorOccurred, orderId, addressId, loggedInUserId)) {
                is Resource.Success -> res.value?.let {
                    if (it.isSuccessful) {
//                        SharedPrefManager.getInstance().edd = it.body()?.edd
                        if(it.code()==200)
                            return NetworkResponseType.SUCCESS.ordinal
                        else if(it.code()==400)
                            return NetworkResponseType.BADREQUEST.ordinal
                        else
                            return NetworkResponseType.FAILURE.ordinal
                    } else {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }

                        return NetworkResponseType.FAILURE.ordinal
                    }
                }

                is Resource.Failure -> NetworkResponseType.FAILURE.ordinal
                else -> NetworkResponseType.UNEXPECTED.ordinal
            }
        } catch (ex: Exception) {
            NetworkResponseType.EXCEPTION.ordinal
        }
    }

    /**
     * Get Details of the orderId like
     * 1) Product Details List
     * 2) Payment Mode selected (Online or COD)
     * 3) Bill details
     * 4) Address Details
     * 5) Order Status
     * 6) Payment Method Selected Information from PSP screen (method, methodid, url, lastpaymentmethod etc)
     * **/
    suspend fun getOrderDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,orderId: Long, customerId: String): GetCustomerOrderDetails? {
        var response: GetCustomerOrderDetails? = null
        when (val res = orderFlowRepository.getCustomerOrderDetails(mxInternalErrorOccurred, orderId, customerId)) {
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

            else -> null
        }
        return response
    }


    suspend fun getOrderMedicineDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,orderId: Long): GetOrderMedicineDetails {
        when (val res = orderFlowRepository.getOrderMedicineDetails(mxInternalErrorOccurred, orderId)) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        return it.body() ?: GetOrderMedicineDetails()
                    } else {
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                it.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                        GetOrderMedicineDetails()
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
                        GetOrderMedicineDetails("Failure", "Failure", res.errorCode, 0, null)
                    }
                }

            }

            else -> GetOrderMedicineDetails()
        }
        return GetOrderMedicineDetails()
    }


    suspend fun getBillDetailsFromOrderDetails(finalCalcAmt: OrderDetailsResponse.FinalCalcAmt): OrderDetailsResponse.FinalCalcAmt {
        return OrderDetailsResponse.FinalCalcAmt(
            finalCalcAmt.couponDiscountPrice,
            finalCalcAmt.deliveryCharge,
            finalCalcAmt.discount,
            finalCalcAmt.payableAmt,
            finalCalcAmt.orderId,
            finalCalcAmt.mrp,
            finalCalcAmt.packagingCharge,
            finalCalcAmt.savingValue,
            finalCalcAmt.tmCash,
            finalCalcAmt.tmCredit,
            finalCalcAmt.couponCode,
            finalCalcAmt.addMoreForFreeDelivery,
            finalCalcAmt.savingsText
        )
    }

    suspend fun getOrderPatientDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long?,
        customerId: String
    ): GetPatientDetailsResponse? {
        var response: GetPatientDetailsResponse? = null
        when (val res = orderFlowRepository.getPatientDetails(mxInternalErrorOccurred, orderId, customerId)) {
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

            else -> null
        }
        return response
    }

    suspend fun getOrderRx(
        mxInternalErrorOccurred: MxInternalErrorOccurred,orderId: Long): GetOrderRxResponse? {
        var response: GetOrderRxResponse? = null
        when (val res = orderFlowRepository.getOrderRx(mxInternalErrorOccurred, orderId)) {
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

            else -> null
        }
        return response
    }

    fun getReorderData(): ReorderStatusData {
        return ReorderStatusData()
    }

    suspend fun editMedicine(
        mxInternalErrorOccurred: MxInternalErrorOccurred,orderId: Long, list: List<MedicineDto>): SaveMedsCreateEditOrderResponse? =
        //var response: SaveMedsCreateEditOrderResponse? = null
        when (val res = orderFlowRepository.editMedicine(
            mxInternalErrorOccurred, orderId, list, SharedPrefManager.getInstance().pincode.toString()
        )) {
            is Resource.Success -> {

                /*localDbUseCase.removeItemFromCart(
                    list[0].productCode,
                    list[0].cxAcceptedSubs ?: false
                )
*/

                if (res.value?.isSuccessful==false) {
                    try {
                        mxInternalErrorOccurred.errorCode = res.value.code()
                        mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                            res.value.errorBody()?.string(),
                            ApiCoreResponse::class.java
                        ).message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                    } catch (_: Exception) {
                    }
                }
                res.value?.body()
            }

            is Resource.Failure -> null
            else -> null
        }
    //response = orderFlowRepository.editMedicine(orderId, list)


    suspend fun replaceMedicineForIncompleteOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long, medList: List<MedicineDto>,
        loggedInUserId: String, offerId: String, checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean, srcType: Long, variantId: Long?
    ): SaveMedsCreateEditOrderResponse? {
        try {
            val res: Resource<Response<SaveMedsCreateEditOrderResponse>> = orderFlowRepository.replaceMedicineForIncompleteOrder(
                mxInternalErrorOccurred, orderId,
                medList,
                loggedInUserId,
                offerId,
                checkAutoConfirmEligibility,
                newAlgo,
                srcType,
                variantId,
                SharedPrefManager.getInstance().pincode.toString()
            )

            return when (res) {
                is Resource.Success -> if (res.value?.isSuccessful == true)
//                    ResponseCodeModel(200,res.value.body()?.message)
                    res.value.body()
                else {
                    try {
                        mxInternalErrorOccurred.errorCode = res.value?.code()
                        mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                            res.value?.errorBody()?.string(),
                            ApiCoreResponse::class.java
                        ).message
                        sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                    } catch (_: Exception) {
                    }
//                    ResponseCodeModel(0, res.value?.message())
                    res.value?.body()
                }
                /*res.value?.body()?.orderId?.let {
                        SharedPrefManager.getInstance().incompleteOrderId = it.toLong()
                        res.value?.code() ?: 200
                    }*/

                is Resource.Failure -> null
                else -> null
            }
        } catch (ex: Exception) {
            return null
        }

    }

    suspend fun discardOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,orderId: Long, customerId: Long): Int {
        try {
            return when (val res = orderFlowRepository.discardOrder(mxInternalErrorOccurred, orderId, customerId)) {
                is Resource.Success -> {
                    SharedPrefManager.getInstance().incompleteOrderId = 0
                    SharedPrefManager.getInstance().setIsReOder(false)
                    SharedPrefManager.getInstance().isUserSkippedReplace = false
                    SharedPrefManager.getInstance().setPaymentSelectedMode(-1)
                    SharedPrefManager.getInstance().selectedPaymentMethod = ""
                    SharedPrefManager.getInstance().selectedPaymentMethodIconUrl = ""
//                    SharedPrefManager.getInstance().isPspViewed=false

                    if (res.value?.isSuccessful==false) {
                        try {
                            mxInternalErrorOccurred.errorCode = res.value.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                res.value.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }

                    res.value?.code() ?: 200
                }

                is Resource.Failure -> 1
                else -> 1
            }
        } catch (ex: Exception) {
            return 2
        }
    }

    suspend fun removeCouponCode(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentId: String,
        offerId: String
    ): CouponSaveRemoveResponse? {
        var response: CouponSaveRemoveResponse? = null
        when (val res = orderFlowRepository.savePaymentAndCouponForOrder(
            mxInternalErrorOccurred, orderId,
            paymentId,
            offerId
        )) {
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

            else -> null
        }
        return response
    }

    suspend fun confirmOrderValidation(
        lastPaymentMode: Int, clickedOnPage: String,
        lastPaymentMethodIconUrl: String,
        lastPaymentMethod: String, lastPaymentMethodId: Long
    ): ConfirmOrderUseCaseResponse {


        var paymentmode = "17"
        var paymentMethod: String? = null
        var paymentMethodId: Long? = null
        if (lastPaymentMode != -1) {
            paymentmode = lastPaymentMode.toString()
        }

        var offerId = SharedPrefManager.getInstance().couponId
        if (TextUtils.isEmpty(offerId)) {
            offerId = "0"
        }

        if (clickedOnPage == BundleConstants.ORDER_SUMMARY || clickedOnPage == BundleConstants.REORDER) {
            SharedPrefManager.getInstance().selectedPaymentMethodIconUrl = lastPaymentMethodIconUrl
            SharedPrefManager.getInstance().selectedPaymentMethod = lastPaymentMethod
            SharedPrefManager.getInstance().selectedPaymentMethodId = lastPaymentMethodId
        }

        if (lastPaymentMethod != null && lastPaymentMethod == context.getString(
                R.string.cash_on_delivery_btn_text
            )
        ) {
            paymentMethod = ""
            paymentMethodId = 0
        } else {
            paymentMethod = lastPaymentMethod
            paymentMethodId = lastPaymentMethodId
        }

        SharedPrefManager.getInstance().setPaymentSelectedMode(paymentmode.toInt())
        return ConfirmOrderUseCaseResponse(offerId, paymentmode, paymentMethod, paymentMethodId)
    }

    /**
     * 1) API to confirm the order, orderId is confirmed once the API returns success
     * 2) Before calling this API, the orderId is still in incomplete state where we can access orderId by calling
     * SharedPrefManager.getInstance().incompleteOrderId
     * 3) On Success of this API, we assign SharedPrefManager.getInstance().incompleteOrderId = 0
     * 4) We also clear the added medicines from the local storage
     * 5) This API is used in OrderSummary, ReOrder, PSP screen
     * **/
    suspend fun confirmOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long, lastPaymentMode: Int,
        loggedInUserId: String, lastPaymentMethod: String,
        lastPaymentMethodId: Long, clickedOnPage: String,
        lastPaymentMethodUrl: String
    ): Boolean {

        var paymentMode = "17"
        var paymentMethod: String?
        var paymentMethodId: Long?
        if (lastPaymentMode != -1) {
            paymentMode = lastPaymentMode.toString()
        }

        var offerId = 0
        SharedPrefManager.getInstance().couponModel?.let {
            offerId = it.offerId
            if (offerId <= 0) {
                offerId = 0
            }
        }


        if (clickedOnPage == BundleConstants.ORDER_SUMMARY || clickedOnPage == BundleConstants.REORDER) {
            SharedPrefManager.getInstance().selectedPaymentMethodIconUrl = lastPaymentMethodUrl
            SharedPrefManager.getInstance().selectedPaymentMethod = lastPaymentMethod
            SharedPrefManager.getInstance().selectedPaymentMethodId = lastPaymentMethodId
        }

        if (lastPaymentMethod == context.getString(
                R.string.cash_on_delivery_btn_text
            )
        ) {
            paymentMethod = ""
            paymentMethodId = 0
        } else {
            paymentMethod = lastPaymentMethod
            paymentMethodId = lastPaymentMethodId
        }

        SharedPrefManager.getInstance().setPaymentSelectedMode(paymentMode.toInt())

        Log.i("placeOrder", "confirmOrder API")
        return when (val res = orderFlowRepository.confirmOrder(mxInternalErrorOccurred,
            orderId,
            SharedPrefManager.getInstance().lastSelectedPaymentModeId.toString(),
            offerId.toString(),
            loggedInUserId,
            paymentMethod,
            paymentMethodId,
            "APP",
            "v" + BuildConfig.VERSION_NAME,
            true
        )) {
            is Resource.Success -> {
                var output = false
                res.value?.let {
                    if (it.isSuccessful) {
                        //if FTC Dynamic Discount variant is generated and NFTC Dynamic Discount variant & Traditional base discount variant is not generated,
                        // then set FTC Dynamic Discount variant as NFTC Dynamic Discount
                        Log.i("placeOrder", "confirmOrder API success")
                        try {
                            if (SharedPrefManager.getInstance()
                                    .ftcPrefDynamicDiscountExperimentVariantId > 1 && SharedPrefManager.getInstance()
                                    .nftcPrefDynamicDiscountExperimentVariantId < 1 && SharedPrefManager.getInstance().traditionalBaseDiscountVariantId < 1
                            ) {
                                setUserCategoryApiCall(mxInternalErrorOccurred)
                            }

                            //SharedPrefManager.getInstance().incompleteOrderId = 0
//                            SharedPrefManager.getInstance().setIsReOder(false)//todo
                            SharedPrefManager.getInstance().isUserSkippedReplace = false
                            // This is not commented permanently, will enable once SearchProductActivity is created
                            // TODO
                            //SearchProductActivity.cartDataModelList = ArrayList<Any>()
                            SharedPrefManager.getInstance().myMedicine = null
//                            SharedPrefManager.getInstance().prescriptionCount = 0
                            // This is not commented permanently, will enable once clearAddedMeds is created in localDB
                            // TODO
                            //clearAddedMeds(appDao)

                            try {
                                val amount = SharedPrefManager.getInstance().finalAmountValue
                                var finalAmount = 0.0
                                if (amount.isNotEmpty()) {
                                    finalAmount =
                                        SharedPrefManager.getInstance().finalAmountValue.toDouble()
                                }

                                /**
                                 * // TODO
                                 * trackPurchaseEvents
                                 * **/
                                /*EventManager.getInstance().trackPurchaseEvents(
                                    getApplication(),
                                    trackPurchaseEvents,
                                    finalAmount,
                                    orderId
                                )*/

                                /**
                                 * // TODO
                                 * call sendOrderPlacedEvent mix panel event
                                 * **/
                                //sendOrderPlacedEvent()

                                //incrementEventCounter()

                                if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == 17) {
                                    SharedPrefManager.getInstance().setPaymentSelectedMode(-1)
                                }
                                SharedPrefManager.getInstance().selectedPaymentMethod = ""
                                SharedPrefManager.getInstance().selectedPaymentMethodId = -1L
                                SharedPrefManager.getInstance().selectedPaymentMethodIconUrl =
                                    ""

                                if (SharedPrefManager.getInstance().defaultPaymentMode == VariantAssignments.DEFAULT_PAYMENT_MODE_SELECTION_VARIANT_B
                                    || SharedPrefManager.getInstance().defaultPaymentMode == "-1"
                                ) {
                                    SharedPrefManager.getInstance().setPaymentSelectedMode(16)
                                }

                                //TODO
                                /*IncompleteOrderNotification.cancelOngoingNotification(
                                    getApplication()
                                )*/

//                                SharedPrefManager.getInstance().couponModel = null


                                SharedPrefManager.getInstance()
                                    .updateCrossSellingProductsIds(HashSet())
                                SharedPrefManager.getInstance()
                                    .setIsProceedWithoutPrescription(true)
                                SharedPrefManager.getInstance().finalAmountValue =
                                    ""

                                // TODO
                                /*Constants.clearAddedMeds(
                                    appDao
                                )
                                appDao.clearReorderAltSubsTable()*/
                                output = true

                            } catch (e: Exception) {
                                e.printStackTrace();
                            }

                        } catch (ex: Exception) {

                        }
                    }
                    else{
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
                return output
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
                return false
            }

            else -> {
                return false
            }
        }
    }
    
    suspend fun placeOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,cartList : MutableList<ProductInfoModel>,
                                   cartMedicineListResponse: List<ProductInfoModel>,
                                   prescriptions: List<OrderRxInfo>,
                                   paymentMode: Int,
                                   selectedPaymentMethod: String,
                                   selectedPaymentMethodId: Long,
                                   selectedPaymentMethodIconUrl: String, isConfirmOrder:Boolean= true) : ResponseCodeModel {
        var statusCode = 500
        var responseCode:SaveMedsCreateEditOrderResponse? = null
        if (cartList.isNullOrEmpty() && prescriptions.isNullOrEmpty()) {
            return ResponseCodeModel(statusCode,null)
        }
        if (!cartList.isNullOrEmpty()) {
            var orderDiscarded = false
            for (cartItem in cartList) {
        
                if (!cartItem.product.availabilityStatus.isNullOrEmpty()) {
                    val list = localDbUseCase.getCartMedicineDtoFromProductCode(
                        cartMedicineListResponse,
                        cartItem.product.productCode,
                        0
                    )
            
                    val apiResponse =
                        editMedicine(mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId, list)
                    if (apiResponse != null) {
                        if(list.isNotEmpty()) {
                            if (list.getOrNull(0)?.cxAcceptedSubs == true) {
                                /*val subsCode = async { localDbUseCase.getSubsProductCodeAfterDelete(list[0].productCode ?: "") }.await()
                            async { localDbUseCase.removeItemFromCart(subsCode, true) }.await()*/

                                /**
                                 * fetch switch back product code from
                                 * **/
                                val subsCode = localDbUseCase.getSubsProductCodeAfterDelete(
                                    list[0].productCode ?: ""
                                )
                                localDbUseCase.removeItemFromCart(subsCode ?: "", true)
                            } else {

                                localDbUseCase.removeItemFromCart(
                                    list[0].productCode ?: "",
                                    false
                                )

                            }
                            localDbUseCase.removeCrossSellingProductUsingId(
                                list[0].productCode ?: ""
                            )
//                            deleteOTCLocalDb(list[0].productCode)

//                                updateCrossSellingList(crossSellingProducts, list[0].productCode ?: "")


                            if (cartMedicineListResponse.size == 1) {
                                if (prescriptions.isEmpty()) {
                                    //discard order
                                    orderDiscarded = true
                                    statusCode = discardOrder(
                                        mxInternalErrorOccurred,
                                        SharedPrefManager.getInstance().incompleteOrderId,
                                        SharedPrefManager.getInstance().loggedInUserId.toLong()
                                    )
                                    //added now
                                    // launchotcList.value.filter {  }OrderSummary.postValue(Event(true))
                                }
                            }
                        }
                    } else {
                        statusCode = 500
                    }
                }
            }

            /**
             * if the saved coupon applicable is cod and the selected payment type is online then remove the applied coupon
             * if the saved coupon applicable is online and the selected payment type is cod then remove the applied coupon
             */
            SharedPrefManager.getInstance().couponModel?.let {
                if(it.applicableOn == "Online Payment" && SharedPrefManager.getInstance().selectedPaymentMethod == "Cash on delivery"){
                    val couponRemoveResponse = removeCouponCode(mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId,setPaymentMode().toString(), "0")
                    if (couponRemoveResponse != null && couponRemoveResponse.message.equals(
                            BundleConstants.COUPON_REMOVED,
                            true
                        )
                    ) {
                        SharedPrefManager.getInstance().couponModel = null
                        SharedPrefManager.getInstance().offerId = "0"
                        SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                    }
                }
                if(it.applicableOn == "Cod Payment" && SharedPrefManager.getInstance().selectedPaymentMethod != "Cash on delivery"){
                    val couponRemoveResponse = removeCouponCode(mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId,setPaymentMode().toString(), "0")
                    if (couponRemoveResponse != null && couponRemoveResponse.message.equals(
                            BundleConstants.COUPON_REMOVED,
                            true
                        )
                    ) {
                        SharedPrefManager.getInstance().couponModel = null
                        SharedPrefManager.getInstance().offerId = "0"
                        SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                    }
                }
            }
    
            val replaceList = localDbUseCase.getCartMedicineDto(
                cartMedicineListResponse,
                false,
                false
            )// getAddedMedicinesFromCart(false, false)
            responseCode = replaceMedicineForIncompleteOrder(
                mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId,
                replaceList,
                SharedPrefManager.getInstance().loggedInUserId,
                SharedPrefManager.getInstance().offerId,
                true,
                true,
                SharedPrefManager.getInstance().srcType,
                SharedPrefManager.getInstance().algoSpecificVariantId
            )

            statusCode = responseCode?.statusCode ?: 500
        }

        if(isConfirmOrder) {
            val responsePlaceOrder = confirmOrder(
                mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId,
                paymentMode,
                SharedPrefManager.getInstance().loggedInUserId,
                if (selectedPaymentMethod.isNullOrEmpty()) SharedPrefManager.getInstance().selectedPaymentMethod else selectedPaymentMethod,
                if (selectedPaymentMethodId <= 0L) SharedPrefManager.getInstance().selectedPaymentMethodId else selectedPaymentMethodId,
                BundleConstants.ORDER_SUMMARY,
                selectedPaymentMethodIconUrl
            )

            if (responsePlaceOrder) {
                statusCode = 200
            } else {
                statusCode = 500
                //*loaderValue.postValue(false)
//            showInternalServerError.postValue("Internal server error, please try again")*//*
            }
        } else{
            statusCode = 100
        }
        
        return ResponseCodeModel(statusCode,responseCode?.message)
    }

    private suspend fun setUserCategoryApiCall(
        mxInternalErrorOccurred: MxInternalErrorOccurred) {
        when (val res = userDataRepository.setCustomerCategory(
            mxInternalErrorOccurred, SharedPrefManager.getInstance()
                .ftcPrefDynamicDiscountExperimentVariant,
            BundleConstants.NFTC_DYNAMIC_DISCOUNT,
            "TM_ANDROID_V_" + BuildConfig.VERSION_NAME
        )) {
            is Resource.Success -> {
                res.value?.let {
                    if (res.value.isSuccessful) {
                        val category = res.value.body()?.category!!
                        val variantId = res.value.body()?.id!!
                        val categoryType = res.value.body()?.categoryType
                        var categoryTypeForMixPanel = categoryType
                        SharedPrefManager.getInstance().nftcPrefDynamicDiscountExperimentVariant =
                            category
                        SharedPrefManager.getInstance().nftcPrefDynamicDiscountExperimentVariantId =
                            variantId.toInt()
                        if (SharedPrefManager.getInstance().ftcPrefDynamicDiscountExperimentVariantId > 0) {
                            categoryTypeForMixPanel = "FTC_NFTC_DynamicDiscount"
                        }
                        try {
                            /**
                             * TODO
                             * mix panel event sendExperimentEventToMixPanel to be called
                             * **/
                        } catch (e: java.lang.Exception) {
                            e.printStackTrace()
                        }
                    }
                }
            }

            is Resource.Failure -> {

            }

            else -> {

            }
        }
    }

    /*suspend fun incrementEventCounter(){

    }*/

    fun setPaymentMode(): Long {
        var paymentId: Long
        paymentId = if (SharedPrefManager.getInstance().couponPaymentMode == "online") {
            16
        } else if (SharedPrefManager.getInstance().couponPaymentMode
                .equals("cod", ignoreCase = true)
        ) {
            17
        } else {
            if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1)
                17
            else
                SharedPrefManager.getInstance().lastSelectedPaymentModeId.toLong()
        }

        if (paymentId < 1) {
            paymentId = 16L
        }

        return paymentId
    }

    /**
     * 1) Whenever user clicks on apply/remove offer in Cart,OrderSummary,Reorder screen we call this API
     * 2) This API is also used in PSP screen when user tries to change the coupon specific payment method(eg. UPI)
     * 3) Only when user tries to remove coupon we pass 0L for offerId paramater, else we pass the offerId for that associated coupon
     * **/
    suspend fun setOfferIdForOrder(
        mxInternalErrorOccurred: MxInternalErrorOccurred,orderId: Long, paymentId: Long, offerId: Long): Boolean {
        var success = false
        when (val res =
            orderFlowRepository.setPaymentModeForAnOrder(mxInternalErrorOccurred, orderId, paymentId.toInt(), offerId)) {
            is Resource.Success -> {
                res.value?.let {
                    if (res.value.isSuccessful) {
                        success = true
                    }
                }
            }

            is Resource.Failure -> {
                success = false
                //TODO
                /*CommonFunc.showCustomToastMessage(
                    getApplication(),
                    "Unable to connect to server. Please try again"
                )*/
            }

            else -> {
            }
        }
        return success
    }

    /**
     * 1) User has the option to change the online payment mode to COD if payment is failed
     * 2) If user has selected online payment mode and has not done payment for 24 hrs, the payment mode
     * gets automatically converted to COD
     * **/
    suspend fun changeToCod(
        mxInternalErrorOccurred: MxInternalErrorOccurred,orderId: Long): Pair<Boolean, String> {
        var response = false
        var responseMessage = ""
        when (val res = orderFlowRepository.changePaymentMode(mxInternalErrorOccurred, orderId, "17")) {
            is Resource.Success -> {
                res.value?.let {
                    if (res.value.isSuccessful) {
                        response = true
                        responseMessage = "Success"
                    }

                    if (res.value.code() == 400) {
                        response = false
                        responseMessage = "Failure"
                        res.value.errorBody()?.let {
                            val jsonObject = JSONObject(res.value.errorBody()!!.string())
                            responseMessage = jsonObject.getString("message")
                        }
                        try {
                            mxInternalErrorOccurred.errorCode = it.code()
                            mxInternalErrorOccurred.errorStatement = responseMessage
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                }
            }

            is Resource.Failure -> {
                response = false
                val keyValuePairs = ArrayList<KeyValuePair>()
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
                    //CommonFunc.showCustomToastMessage(getApplication(), value)
                    responseMessage = value
                } catch (e: JSONException) {
                    Log.i("e", e.message.toString())
                    response = false
                    responseMessage = "Failure"
                    //TODO
                    /* CommonFunc.showCustomToastMessage(
                        getApplication(),
                        "Unable to connect to server. Please try again"
                    )*/
                }
            }

            else -> {
                response = false
                responseMessage = "Failure"
            }
        }

        return Pair(response, responseMessage)

    }

    /**
     * 1) User has the option to change the online payment mode to COD if payment is failed
     * 2) If user has selected online payment mode and has not done payment for 24 hrs, the payment mode
     * gets automatically converted to COD
     * **/
    /*suspend fun calculateBillDetailsforApp(orderId: Long,paymentSelectionInfo:Boolean) : BillDetailsResponse?{
        var billDetailsModel : BillDetailsResponse? = null
        when(val res = orderFlowRepository.calculateBillDetailsforApp(orderId,paymentSelectionInfo)){
            is Resource.Success -> {
                res.value?.let{
                    if(it.isSuccessful){
                        billDetailsModel = it.body()!!
                    }
                }
            }
            is Resource.Failure -> {
                Log.e("texttt",res.errorBody.toString())
            }
            else -> {

            }
        }

        return billDetailsModel

    }*/

    suspend fun calculateBillDetailsforApp(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentSelectionInfo: Boolean
    ): BillDetailResponse? = try {
        when (val res = orderFlowRepository.calculateBillDetailsforApp(mxInternalErrorOccurred,
                orderId,
                paymentSelectionInfo
            )) {
            is Resource.Success -> {
    
                res.value?.body()?.responseData?.let {
                    if(SharedPrefManager.getInstance().incompleteOrderId==orderId) {
                        Log.e("card_dataaaa::::","3333:::"+ it!!.toString())
                        SharedPrefManager.getInstance().accountTmCredit =(it.tmCredit?:0f).toFloat()
                        SharedPrefManager.getInstance().setCurrentOrderAmountDetails(
                            (it.tmCash ?: 0.0).toFloat(),
                            (it.tmCredit ?: 0.0).toFloat(),
                            (it.deliveryCharge ?: 0.0).toFloat(),
                           // (it.couponDiscountAmt ?: 0.0).toFloat(),
                            (it.couponAppliedAmt ?: 0.0).toFloat(),
                            (it.packagingCharge ?: 0.0).toFloat(),
                            (it.payableAmt ?: 0.0).toFloat(),
                            (it.couponDiscountAmt ?: 0.0).toFloat(),
                            (it.discount ?: 0.0).toFloat(),
                            (it.mrp ?: 0.0).toFloat()

                        )
                    }
                }
                /*res.value?.body()?.responseData?.tmCash
                    ?.let { SharedPrefManager.getInstance().setCustomerTmCash(it) }
                res.value?.body()?.responseData?.tmCredit
                    ?.let { SharedPrefManager.getInstance().setCustomerTmCredit(it) }
                res.value?.body()?.responseData?.deliveryCharge
                    ?.let { SharedPrefManager.getInstance().setCustomerDeliveryCharge(it) }
                res.value?.body()?.responseData?.packagingCharge
                    ?.let { SharedPrefManager.getInstance().setCustomerPackagingCharge(it) }*/

                if(res.value?.isSuccessful==true) res.value.body() else {
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
            }
            is Resource.Failure -> null
            else -> null
        }

    } catch (ex: Exception) {
        null
    }

    /**
     * This function is used for setting the estimated delivery date for the address already available
     * **/
    fun setEstimatedDeliveryDate(edd: String) {

    }

    /**
     * As the name suggests the order is not confirmed, its in incomplete state,
     * these are the medicines which are present in the cart or in our local storage
     * **/
    fun getIncompleteOrderArray(callConfirmOrder: Boolean) {

    }

    /**
     * Check if the pincode passed is serviceable or not
     * **/
    suspend fun newCheckPinCode(pinCode: String) {

    }

    suspend fun setErrorResponseBody(
        errorCode: Int,
        errorBody: ResponseBody,
        isNetworkError: Boolean
    ): ResponseData {
        return ResponseData(errorCode, errorBody, isNetworkError)
    }

    fun showBillDetails(
        cartBillDetailsModel: BillDetailsModel,
        className: String
    ): BillDetailsModel {
        return BillDetailsModel(
            billDetailsTitle = if (className == ClassNameConstants.PAYMENT_OPTION_ACTIVITY) "" else cartBillDetailsModel.billDetailsTitle,
            savedOrderMessage = if (className == ClassNameConstants.PAYMENT_OPTION_ACTIVITY) "" else "You saved ₹${cartBillDetailsModel.savedOrderPrice} on your order!",
            savedOrderPrice = if (className == ClassNameConstants.PAYMENT_OPTION_ACTIVITY) "" else "₹${cartBillDetailsModel.savedOrderPrice}",
            mrpValue = cartBillDetailsModel.mrpValue,
            discountValue = cartBillDetailsModel.discountValue,
            couponName = cartBillDetailsModel.couponName,
            couponValue = cartBillDetailsModel.couponValue,
            taxesAndChargesValue = cartBillDetailsModel.taxesAndChargesValue,
            deliveryChargesValue = cartBillDetailsModel.deliveryChargesValue,
            waiveOffDeliveryCharge = cartBillDetailsModel.waiveOffDeliveryCharge,
            tmCreditValue = cartBillDetailsModel.tmCreditValue,
            tmRewardValue = cartBillDetailsModel.tmRewardValue,
            isTypePharmacistPaymentOn = false,
            isTypePharmacistPaymentOff = false,
            estimatedPayableValue = cartBillDetailsModel.estimatedPayableValue,
            paymentModeValue = SharedPrefManager.getInstance().selectedPaymentMethod,
            isTooltipForDeliveryCharges = !cartBillDetailsModel.tooltipDeliveryChargeValue.isNullOrEmpty(),
            tooltipDeliveryChargeValue = if(!cartBillDetailsModel.tooltipDeliveryChargeValue.isNullOrEmpty())
                cartBillDetailsModel.tooltipDeliveryChargeValue else "",
            tooltipEstimatedPayableValue = context.getString(R.string.tooltip_estimated_payable_message),
            isTooltipForEstimatedPayable = true,
            isTooltipForTaxesCharges = (cartBillDetailsModel.taxesAndChargesValue ?: 0.0) > 0,
            tooltipTaxesChargesHeaderLeft = context.getString(R.string.gst),
            tooltipTaxesChargesBodyLeft = context.getString(R.string.seller_packaging_charges),
            tooltipTaxesChargesBodyRight = "${cartBillDetailsModel.tooltipTaxesChargesBodyRight}",
            tooltipTaxesChargesBodyRightStroked = "${cartBillDetailsModel.tooltipTaxesChargesBodyRightStroked}",
            tooltipTaxesChargesHeaderRight = "Included in MRP",
            isFreeDelivery = (cartBillDetailsModel.deliveryChargesValue == 0.0),
            deliveryChargeMessage = cartBillDetailsModel.deliveryChargeMessage,
            sellingPrice = cartBillDetailsModel.sellingPrice,
            mxCouponAppliedAmount = cartBillDetailsModel.mxCouponAppliedAmount,
            cashHandlingInfoModel = cartBillDetailsModel.cashHandlingInfoModel,
            footerList = cartBillDetailsModel.footerList

        )
    }


    /*
        fun getPastPrescriptions(): List<PastPrescriptions> {
            val prescription1 = PastPrescriptions(
                0,
                1698647785000,
                listOf(
                    ActiveRx(
                        1,
                        "https://images.unsplash.com/photo-1703701711673-453f0c0aed9b?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                        true
                    ),
                    ActiveRx(
                        2,
                        "https://images.unsplash.com/photo-1674936987060-72f3e7bf6126?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                        false
                    ),
                    ActiveRx(
                        3,
                        "https://images.unsplash.com/photo-1703607520372-bfa0946dd5d4?q=80&w=1976&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                        false
                    ),
                    ActiveRx(
                        4,
                        "https://images.unsplash.com/photo-1703607520372-bfa0946dd5d4?q=80&w=1976&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                        false
                    )


                )
            )

            val prescription2 = PastPrescriptions(
                1,
                1700747441000,
                listOf(
                    ActiveRx(
                        1,
                        "https://images.unsplash.com/photo-1703701711673-453f0c0aed9b?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                        false
                    ),
                    ActiveRx(
                        2,
                        "https://images.unsplash.com/photo-1674936987060-72f3e7bf6126?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                        false
                    )
                )
            )
            return listOf(prescription1, prescription2)
        }
    */

    fun getOriginalMedicineList(): List<String> {
        return listOf(
            "Ecosprin 75MG Tablet 14",
            "Dolo 650 Advanced Tablet 20",
            "Ecosprin 75MG Tablet 14",
            "Dolo 650 Advanced Tablet 20",
            "Ecosprin 75MG Tablet 14",
            "Dolo 650 Advanced Tablet 20",
            "Ecosprin 75MG Tablet 14",
            "Dolo 650 Advanced Tablet 20",
            "Dolo 650 Advanced Tablet 20",
            "Ecosprin 75MG Tablet 14",
            "Dolo 650 Advanced Tablet 20",
            "Ecosprin 75MG Tablet 14",
            "Dolo 650 Advanced Tablet 20",
        )
    }

    /**
     *
     * **/
    suspend fun addMedicineToCart(
        orgMedicine: CartMedicine,
        subsMedicine: OrgSubsInfo?,
        isSubs: Boolean,
        itemAdded: MxItemAdded?
    ) {
        localDbUseCase.addToCart(orgMedicine, subsMedicine, isSubs)
        localDbUseCase.updateOrgAvailable(orgMedicine.medicineId, true)
        if (itemAdded != null) {
            localDbUseCase.deleteItemAddedAttributesUsingProductCode(orgMedicine.medicineId)
            localDbUseCase.insertItemAddedAttributes(
                ItemAddedEventAttributes(
                    null,
                    orgMedicine.medicineId,
                    itemAdded?.clickedOnPage ?: "",
                    itemAdded?.pageSection ?: "",
                    itemAdded?.sectionHeading ?: "",
                    itemAdded?.resultPosition ?: 0
                )
            )

        }
    }

    suspend fun deleteMedicineFromCart(productCode: String, isSubs: Boolean) {
        localDbUseCase.removeItemFromCart(productCode, isSubs)
    }

    suspend fun updateCartMedicineCount(productCode: String, qty: Int) {
        localDbUseCase.updateMedicineQuantity(productCode, qty)
    }

    suspend fun getSearchResults(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        query: String,
        elasticSearchType: String,
        pageNumber: Int,
        isMultiSearch: Boolean = false,
    ): SearchResultElasticResponse? {
        try {
            return when (val res =
                orderFlowRepository.getSearchResults(mxInternalErrorOccurred,
                    SharedPrefManager.getInstance().selectedWarehouseID,
                    elasticSearchType,
                    query,
                    20,
                    pageNumber,
                    SharedPrefManager.getInstance().algoSpecificVariantId,
                    localDbUseCase.getCustomerCategory(UserCategoryEnum.SEARCH_EXPERIMENT_1.apiCategoryType),
                    isMultiSearch
                )) {
                is Resource.Success -> {
                    if (res.value?.isSuccessful==false) {
                        try {
                            mxInternalErrorOccurred.errorCode = res.value.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                res.value.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                    res.value?.body()?.responseData
                }

                is Resource.Failure -> SearchResultElasticResponse()
                else -> SearchResultElasticResponse()
            }

        } catch (ex: Exception) {
            return SearchResultElasticResponse()
        }
    }

    suspend fun getTrendingSearches(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        warehouseId: String?,
        sessionToken: String?,
        pageNumber: Int?,
        pageSize: Int?
    ): List<TrendingSearchResponse.TrendingSearch> {
        try {
            return when (val res =
                orderFlowRepository.getTrendingSearches(mxInternalErrorOccurred,
                    warehouseId,
                    sessionToken,
                    pageNumber,
                    pageSize
                )) {
                is Resource.Success -> {
                    res.value?.body()?.responseData ?: listOf()
                }

                is Resource.Failure -> listOf()
                else -> listOf()
            }

        } catch (ex: Exception) {
            return listOf()
        }
    }

    suspend fun uploadImage(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        pinCode: String,
        customerId: String?,
        uploadImageModel: ImageUploadRequest,
        variantId: Long?
    ): SaveRxImageForCustomerIdResponse? {
        return try {
            when (val res =
                orderFlowRepository.uploadImage(
                    mxInternalErrorOccurred,
                    pinCode = pinCode,
                    customerId = customerId,
                    uploadImageModel = uploadImageModel,
                    variantId = variantId
                )) {
                is Resource.Success ->{
                    sdkEventUseCase.sendPrescriptionUploadedClickEvent()
                    if(res.value?.isSuccessful==true) res.value.body() else {
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
                    } }
                is Resource.Failure -> null
                else -> null
            }

        } catch (ex: Exception) {
            null
        }
    }

    /*suspend fun getPrescriptionImages(orderId: Long): PrescriptionImagesResponse? = try {
        when (val res =
            orderFlowRepository.getPrescriptionImages(
                orderId = orderId
            )) {
            is Resource.Success -> {
    
                res.value?.body()?.responseData?.let {
                    *//*SharedPrefManager.getInstance().setCurrentOrderAmountDetails((it.tmCash ?: 0.0).toFloat(),
                        (it.tmCredit ?: 0.0).toFloat(),
                        (it.deliveryCharge ?: 0.0).toFloat(),
                        (it.couponDiscountAmt ?: 0.0).toFloat(),
                        (it.packagingCharge ?: 0.0).toFloat(),
                        (it.payableAmt ?: 0.0).toFloat()
                    )*//*
                }
                
                *//*res.value?.body()?.responseData?.tmCash
                    ?.let { SharedPrefManager.getInstance().setCustomerTmCash(it) }
                res.value?.body()?.responseData?.tmCredit
                    ?.let { SharedPrefManager.getInstance().setCustomerTmCredit(it) }
                res.value?.body()?.responseData?.deliveryCharge
                    ?.let { SharedPrefManager.getInstance().setCustomerDeliveryCharge(it) }
                res.value?.body()?.responseData?.packagingCharge
                    ?.let { SharedPrefManager.getInstance().setCustomerPackagingCharge(it) }*//*

                res.value?.body()
            }
            is Resource.Failure -> null
            else -> null
        }

    } catch (ex: Exception) {
        null
    }*/

    /*suspend fun fetchFtcCoupons(
        loggedInUserId: String,
        categoryType: String, version: String
    ): FtcCouponResponseList {
        var response: CouponExpiryDateResponse?
        var currentServerFtcTime = 0L
        var expiryServerFtcTime = 0L
        var isFtcCouponApplied = false
        val couponList: MutableList<CouponCodeDataModel> = ArrayList()
        when (val res = orderFlowRepository.getFtcCoupons(
            loggedInUserId,
            categoryType, version
        )) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        val response = it.body() as CouponExpiryDateResponse
                        currentServerFtcTime = response.currentDate ?: 0L
                        response.payLoad?.let {
                            for (item in it.indices) {
                                val couponObject = it[item]
                                couponList.add(
                                    CouponCodeDataModel(
                                        couponObject?.promoCode,
                                        couponObject?.title,
                                        couponObject?.description,
                                        "",
                                        couponObject?.offerId.toString(),
                                        couponObject?.validity,
                                        couponObject?.offersVisible,
                                        min_cart_value = couponObject?.minCartValue?.toInt() ?: 0,
                                        image = couponObject?.image,
                                        max_discount = couponObject?.maxDiscount?.toInt() ?: 0,
                                        offerId = couponObject?.offerId.toString(),
                                    )
                                )

                            }
                        }


                        *//*  response = it.body()
                          val jsonObject = JSONObject(response.toString())
                          if (jsonObject.has("currentDate") && !jsonObject.isNull("currentDate")) {
                              currentServerFtcTime = jsonObject.getLong("currentDate")
                          }

                          if (jsonObject.has("expiryDate") && !jsonObject.isNull("expiryDate")) {
                              expiryServerFtcTime = jsonObject.getLong("expiryDate")

                          }


                          val strPayload =
                              if (SharedPrefManager.getInstance().isFtc) "payLoad" else "nftcPayLoad"

                          if (jsonObject.has(strPayload) && !jsonObject.isNull(strPayload)
                              && jsonObject.getJSONArray(strPayload).length() > 0
                          ) {
                              val couponsJsonArray: JSONArray =
                                  jsonObject.getJSONArray(strPayload)
                              for (i in 0 until couponsJsonArray.length()) {
                                  val couponObject = couponsJsonArray.getJSONObject(i)
                                  var offerApplicableOnCX: String
                                  var isAlreadyAdded = false
                                  if (!TextUtils.isEmpty(SharedPrefManager.getInstance().couponCode)) {
                                      isAlreadyAdded =
                                          SharedPrefManager.getInstance().couponCode == couponObject.getString(
                                              "promoCode"
                                          )
                                      if (i == 0) {
                                          isFtcCouponApplied = isAlreadyAdded
                                      }
                                  }
                                  var discountValue = 0
                                  try {
                                      if (couponObject.getString("discountValue") != "null" && !TextUtils.isEmpty(
                                              couponObject.getString("discountValue")
                                          )
                                      ) {
                                          discountValue = couponObject.getInt("discountValue")
                                      }
                                  } catch (e: java.lang.Exception) {
                                      //Constants.printText("exception occured : $e")
                                  }
                                  var applicablePaymentMode = "online"
                                  if (couponObject.getString("applicableOn")
                                          .equals("Online Payment", ignoreCase = true)
                                  ) {
                                      applicablePaymentMode = "online"
                                  } else if (couponObject.getString("applicableOn")
                                          .equals("COD Payment", ignoreCase = true)
                                  ) {
                                      applicablePaymentMode = "cod"
                                  } else if (couponObject.getString("applicableOn")
                                          .equals("Online And Cod Payment", ignoreCase = true)
                                  ) {
                                      applicablePaymentMode = "both"
                                  }
                                  if (couponObject.has("applicableOnCx")) {
                                      offerApplicableOnCX =
                                          couponObject.getString("applicableOnCx")

                                      //Constants.printText("offerApplicableOnCX .................. " + offerApplicableOnCX);
                                      if (!TextUtils.isEmpty(offerApplicableOnCX) && offerApplicableOnCX != "null") {
                                          offerApplicableOnCX =
                                              when (offerApplicableOnCX) {
                                                  "New Customer" -> {
                                                      "newCustomer"
                                                  }

                                                  "Existing Customer" -> {
                                                      "existingCustomer"
                                                  }

                                                  else -> {
                                                      "both"
                                                  }
                                              }
                                      }
                                  }
                                  val discountType = couponObject.getJSONObject("discountType")
                                  val validity = couponObject.getLong("validity")
                                  val isAllowedToAdd = true
                                  var tncDescription: String? = ""
                                  if (couponObject.has("termsAndConditions")) {
                                      try {
                                          tncDescription =
                                              couponObject.getString("ftcUrgencyDescription")
                                          val dotOperator = "\u2022"
                                          if (null != tncDescription && tncDescription != "") {
                                              tncDescription =
                                                  "$dotOperator " + tncDescription.replace(
                                                      "\n".toRegex(),
                                                      "\n$dotOperator "
                                                  )
                                          }
                                      } catch (ignore: java.lang.Exception) {
                                      }
                                  }
                                  if (validity > System.currentTimeMillis() && isAllowedToAdd) {
                                      var cashbackValue = 0.0
                                      var activeAfterDeliveryDays = 0
                                      var validAfterActivation = 0
                                      if (couponObject.has("cashbackValue")) {
                                          try {
                                              cashbackValue =
                                                  couponObject.getDouble("cashbackValue")
                                              activeAfterDeliveryDays =
                                                  couponObject.getInt("activeAfterDeliveryDays")
                                              validAfterActivation =
                                                  couponObject.getInt("validAfterActivation")
                                          } catch (ex: java.lang.Exception) {
                                              cashbackValue = 0.0
                                              activeAfterDeliveryDays = 0
                                              validAfterActivation = 0
                                          }
                                      }
                                      var offerVisible = false
                                      if (couponObject.has("offersVisible")) {
                                          offerVisible = couponObject.getBoolean("offersVisible")
                                      }
                                      if (!offerVisible) {
                                          continue
                                      }
                                      couponList.add(
                                          CouponCodeDataModel(
                                              couponObject.getString("promoCode"),
                                              couponObject.getString("title"),
                                              couponObject.getString("description"),
                                              "",
                                              couponObject.getString("offerId"),
                                              couponObject.getLong("validity"),
                                              couponObject.getBoolean("offersVisible"),
                                              isAlreadyAdded,
                                              discountValue,
                                              applicablePaymentMode,
                                              couponObject.getInt("minCartValue"),
                                              discountType.getInt("serialId"),
                                              couponObject.getString("image"),
                                              discountType.getString("name"),
                                              discountType.getString("value"),
                                              couponObject.getInt("maxDiscount"),
                                              couponObject.getString("offerId"),
                                              tncDescription,
                                              cashbackValue,
                                              activeAfterDeliveryDays,
                                              validAfterActivation
                                          )
                                      )
                                      if (couponList.size == 1) {
                                          BundleConstants.FTC_COUPON_CODE =
                                              couponObject.getString("promoCode")
                                      } else if (couponList.size == 2) {
                                          BundleConstants.FTC_COUPON_CODE_1 =
                                              couponObject.getString("promoCode")
                                      }
                                  }
                              }
                          }*//*
                        //ftcCouponList.postValue(couponList)
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

        return FtcCouponResponseList(
            currentServerFtcTime, expiryServerFtcTime, isFtcCouponApplied,
            couponList
        )
    }*/


    suspend fun fetchMedicineDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,productCode: String): MedicineDetailsMain? {
        try {
            return when (val res =
                orderFlowRepository.fetchMedicineDetails(mxInternalErrorOccurred,
                    productCd = productCode,
                    warehouseId = SharedPrefManager.getInstance().selectedWarehouseID
                )) {
                is Resource.Success -> {
                    if (res.value?.isSuccessful==false) {
                        try {
                            mxInternalErrorOccurred.errorCode = res.value.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                res.value.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                    res.value?.body()?.responseData ?: MedicineDetailsMain()
                }

                is Resource.Failure -> MedicineDetailsMain()
                else -> MedicineDetailsMain()
            }

        } catch (ex: Exception) {
            return MedicineDetailsMain()
        }
    }

    suspend fun fetchOtcProductsForCategories(
        mxInternalErrorOccurred: MxInternalErrorOccurred,request: OtcProductsForCategoriesRequest): OtcCategoriesForProductsResponse? {
        return when (val res = orderFlowRepository.getOtcProductsForCategories(mxInternalErrorOccurred, request)) {
            is Resource.Success -> {
                if(res.value?.isSuccessful==true) res.value.body() else {
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
            }

            is Resource.Failure -> null
            else -> null
        }
    }

    /*suspend fun savePaymentAndCoupon(
        orderId: Long,
        paymentId: String,
        offerId: String
    ): Boolean =
        when (val res =
            orderFlowRepository.savePaymentAndCouponForOrder(orderId, paymentId, offerId)) {
            is Resource.Success -> true
            is Resource.Failure -> false
            else -> false
        }*/
    /*fun saveCouponCode(promocode: kotlin.String, orderId: kotlin.String) {

    }*/


    /*suspend fun applyCouponCode(orderId: Long, couponCodeResponse: CouponCodeResponse2.Coupon):Boolean {

        var applySuccess = false
        applySuccess = if ((couponCodeResponse.minCartValue ?: 0.0) >= 500) {//todo need to get min cart value
            savePaymentAndCoupon(
                orderId = orderId,
                paymentId = "",
                offerId = couponCodeResponse.offerId.toString())
        } else {
            false
        }


        return applySuccess
    }*/


    suspend fun getCrossSellingRecommendedProducts(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        sessionToken: String,
        warehouseId: String?,
        pageNumber: Int,
        pageSize: Int?,
        type: String,
        productCode: String,
        variantId: Long?
    ): CrossSellingRecommendedProductResponse? {
        try {
            return when (val res =
                orderFlowRepository.getCrossSellingRecommendedProducts(
                    mxInternalErrorOccurred,
                    sessionToken = sessionToken,
                    warehouseId = warehouseId,
                    pageNumber,
                    pageSize,
                    type,
                    productCode,
                    variantId
                )) {
                is Resource.Success -> {
                    if (res.value?.isSuccessful==false) {
                        try {
                            mxInternalErrorOccurred.errorCode = res.value.code()
                            mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                                res.value.errorBody()?.string(),
                                ApiCoreResponse::class.java
                            ).message
                            sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                        } catch (_: Exception) {
                        }
                    }
                    res.value?.body() ?: CrossSellingRecommendedProductResponse()
                }

                is Resource.Failure -> CrossSellingRecommendedProductResponse()
                else -> CrossSellingRecommendedProductResponse()
            }

        } catch (ex: Exception) {
            return CrossSellingRecommendedProductResponse()
        }

    }

    suspend fun getAllAddress(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String, orderId: Long
    ): AddressResponse? =
        when (val res = orderFlowRepository.getAllAddress(mxInternalErrorOccurred, customerId, orderId)) {
            is Resource.Success ->{
                if((res.value?.body()?.responseData?.size?:0) > 0) {
                    SharedPrefManager.getInstance().selectedState =
                        res.value?.body()?.responseData?.get(0)?.stateName ?: ""
                }
                res.value?.body()}
            is Resource.Failure -> null
            else -> null
        }

    /*suspend fun deleteUploadedRx(
        orderId: Long,
        edit: Boolean,
        images: List<Long>,
        customerId: String
    ): Int =
        when (val res = orderFlowRepository.deleteImages(orderId, edit, images, customerId)) {
            is Resource.Success -> {
                res.value?.body()
                NetworkResponseType.SUCCESS.ordinal
            }

            is Resource.Failure -> NetworkResponseType.FAILURE.ordinal
            else -> NetworkResponseType.UNEXPECTED.ordinal
        }*/

    /*suspend fun setCartTotalSellingPrice(): Double {
        var totalSellingPrice = 0.0
        try {
            var totalMrp = 0.0
            var totalDiscount = 0.0
            val isColdChainDeliverable =
                SharedPrefManager.getInstance().coldChainDeliverable

            val cartList = localDbUseCase.getAddedMedicines() ?: listOf()

            if (cartList != null) {

                for (i in cartList.indices) {
                    var maxAllowedQty = 0
                    try {
                        maxAllowedQty = cartList[i].maxCapped
                        if (maxAllowedQty == 0) {
                            maxAllowedQty = 30
                        }
                    } catch (ignore: java.lang.Exception) {
                    }

                    val numberFormat: DecimalFormat = CommonFunc.getNumberFormat()
                    var orgSellingPrice: Float
                    var orgMRP: Float
                    var addToBillDetails = true
                    var isColdStorage = cartList[i].coldStorage
                    if (isColdStorage && !isColdChainDeliverable) {
                        addToBillDetails = false
                    } else if (!cartList[i].orgAvailable) {
                        addToBillDetails = false
                    }

                    //Original Medicine
                    //boolean isSubAddedInCart = false;
                    if (cartList[i].medicineId == cartList[i].subsMedProductCode) {
                        orgMRP = CommonFunc.getNumberFormat().format(cartList[i].subsMrp)
                            .toFloat() * cartList[i].addedQty
                        orgSellingPrice = numberFormat.format(cartList[i].subsSellingPrice)
                            .toFloat()
                    } else {
                        orgMRP = CommonFunc.getNumberFormat().format(cartList[i].mrp)
                            .toFloat() * cartList[i].addedQty
                        val sellingPrice: Double =
                            orgMRP.minus(orgMRP * (cartList[i].discount * 0.01))
                        orgSellingPrice =
                            numberFormat.format(sellingPrice).toFloat()
                    }
                    if (addToBillDetails) {
                        totalMrp += orgMRP
                        totalSellingPrice += orgSellingPrice
                    }
                }
            }
            totalDiscount = totalMrp - totalSellingPrice
        } catch (ignore: java.lang.Exception) {
        }
        return CommonFunc.getNumberFormat().format(totalSellingPrice).toDouble()
    }*/

    suspend fun calculateSavingAmount(coupon: CouponCodeResponse.Coupon?,clickedOnPage: String = "",
                                      medicineListDataReceived: ArrayList<MedicineListDetailsSent>? = null,
                                      billDetailsData: BillDetailResponse.ResponseData? = null
                                      ,currentPayableAmount:Double): CouponResponse {
        var isAboveCouponDiscountAdded = false
        var totalSellingPrice = 0.0
        var totalSavingAmount = 0.0
        var totalProductDiscount = 0.0
        val couponResponse =
            CouponResponse(message = "", false, totalSellingPrice, totalSavingAmount)
        try {
            val baseDiscount = SharedPrefManager.getInstance().baseDiscount

            val cartList = localDbUseCase.getAddedMedicines()

            for (i in cartList.indices) {
                val item = cartList[i]
                //totalSellingPrice += (item.mrp - (item.mrp * (item.discount / 100))) * item.addedQty
                totalSellingPrice += item.getSellingPrice() * item.addedQty

                totalProductDiscount += (item.mrp * (item.discount / 100)) * item.addedQty

                if (item.discount >= baseDiscount && item.discount < (baseDiscount + (coupon?.discountValue ?: 0.0))
                    && totalSavingAmount <= coupon?.maxDiscount!!
                ) {
                    //totalSavingAmount += item.mrp * ((coupon.discountValue - item.discount) / 100) * item.addedQty
                    //SharedPrefManager.getInstance().getAlgoSpecificVariantId
                    totalSavingAmount += ((item.mrp * (coupon.discountValue ?: 0.0)) / 100) * item.addedQty
                }

                if (item.discount > (baseDiscount + (coupon?.discountValue ?: 0.0))) {
                    isAboveCouponDiscountAdded = true
                }

            }

            if (totalSavingAmount >= coupon?.maxDiscount!!) {
                totalSavingAmount = coupon.maxDiscount!!
            }
            if (totalSavingAmount > 0.0) {
                var dynamicDiscountVariant =
                    localDbUseCase.getCustomerCategory(UserCategoryEnum.TRADITIONAL_BASE_DISCOUNT.apiCategoryType)
                if (dynamicDiscountVariant.isNullOrEmpty()) {
                    dynamicDiscountVariant =
                        localDbUseCase.getCustomerCategory(UserCategoryEnum.NFTC_DYNAMIC_DISCOUNT.apiCategoryType)
                }
                if (dynamicDiscountVariant.isNullOrEmpty()) {
                    dynamicDiscountVariant =
                        localDbUseCase.getCustomerCategory(UserCategoryEnum.FTC_DYNAMIC_DISCOUNT.apiCategoryType)
                } else "A"

                couponResponse.couponAppliedAmt = Math.abs(totalSavingAmount)
                if (dynamicDiscountVariant == "B") {
                    totalSavingAmount += totalProductDiscount
                }
            }
            couponResponse.totalCartAmount = totalSellingPrice
            couponResponse.savingAmount = Math.abs(totalSavingAmount)

            if (cartList.isEmpty() && SharedPrefManager.getInstance().prescriptionCount > 0) {
                couponResponse.isSuccess = true
                couponResponse.message = "Coupon will be applied post processing"
            } else {

                if (totalSellingPrice < (coupon.minCartValue ?: 0)) {
                    couponResponse.isSuccess = false
                    couponResponse.message =
                        "Add items worth ₹${coupon.minCartValue} to avail benefits of this coupon"
                } else if (totalSavingAmount == 0.0) {
                    couponResponse.isSuccess = false
                    if (isAboveCouponDiscountAdded) {
                        couponResponse.message = "Best offer already applied"
                    }
                    else {
                        couponResponse.message = "This offer is not valid on this product"
                    }
                } else {
                    couponResponse.isSuccess = true
                    couponResponse.message = "Coupon applied"

                    var mrpTotalAmount=localDbUseCase.getCartTotalMrpPrice()
                    val cartTotalSellingPrice = localDbUseCase.getCartTotalSellingPrice()
                    val cartMedicineDiscount = roundOffDecimal(mrpTotalAmount - cartTotalSellingPrice)



                    callCouponAppliedEventForOfflineCouponCase(billDetailsData=billDetailsData,clickedOnPag = clickedOnPage, coupon = coupon, orderId = 0,
                        discountAmountApiResponse =  couponResponse.savingAmount.toString()?:"0" ,medicineListDataReceived = medicineListDataReceived,
                        mrpTotalAmount,cartMedicineDiscount,currentPayableAmount)
                }
            }

//            if (totalSellingPrice < (coupon.minCartValue ?: 0.0)) {
//                totalSavingAmount = 0.0
//            }

//            if (totalSavingAmount < coupon.responseData[0].minCartValue!!) {
//                couponResponse.isSuccess = false
//                couponResponse.message = "this is fail message"
//            } else {
//                couponResponse.isSuccess = true
//                couponResponse.message = "this is success message"
//            }

        } catch (e: Exception) {
            Log.d("getTotalCartAmount e", e.toString())
        }
        return couponResponse
    }
// offline coupon applied event calledd
    fun callCouponAppliedEventForOfflineCouponCase(
        billDetailsData: BillDetailResponse.ResponseData? = null,
        clickedOnPag: String = "",
        coupon: CouponCodeResponse.Coupon? = null,
        orderId: Long,
        discountAmountApiResponse: String = "",
        medicineListDataReceived: ArrayList<MedicineListDetailsSent>? = null,
        mrpTotalAmount:Double,
        cartMedicineDiscount:Double,
    currentPayableAmount:Double
    ) {
        if (coupon != null) {

            val cal: Calendar = getCalendarData(coupon?.expiryDate!!)!!

            //event data
            var clickedOnPage = clickedOnPag
            var couponDiscountAmountEventValue: Double = 0.0
            // var couponExpDate: Date? = cal.getTime()
            var couponExpDate: Date? = convertMillisToDate(coupon?.expiryDate!!)
            Log.e("expirry_date:::::",coupon?.expiryDate.toString()+"======"+ couponExpDate.toString())
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
            var cashHandlingChargeApplicable: Double? = if(billDetailsData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsData) else null
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
                 //   couponDiscountAmountEventValue = (discountAmountApiResponse.ifEmpty{"0.0"}).toDouble()
                  //  discountAmountEventValue = billDetailsData.discount ?: 0.0
                    deliveryChargeAmountEventValue =
                        billDetailsData.deliveryCharge ?: 0.0
                  //  mrpTotalAmountEventValue = billDetailsData.mrp ?: 0.0

                    packagingChargesAmountEventValue =
                        billDetailsData.packagingCharge ?: 0.0
                 //   estimatedPayableAmountEventValue = billDetailsData.payableAmt ?: 0.0
                    tmCreditAmountEventValue =
                        billDetailsData.tmCredit ?: 0.0
                    tmRewardAmountEventValue =
                        billDetailsData.tmCash ?: 0.0
                    cashHandlingCharge= billDetailsData.cashHandlingInfo?.charge

                }
            } else {
                val map = SharedPrefManager.getInstance().currentOrderAmountDetails

                /*couponDiscountAmountEventValue =
                    removeExtraZeros(
                        (map[SharedPrefManager.PREF_COUPON_DISCOUNT_AMT_EVENT] ?: 0.0).toDouble()
                    )*/

              //  discountAmountEventValue = removeExtraZeros((map[SharedPrefManager.PREF_DISCOUNT_EVENT] ?: 0.0).toDouble())
                deliveryChargeAmountEventValue =
                    (map[SharedPrefManager.PREF_CURRENT_ORDER_DELIVERY_CHARGE] ?: 0.0).toDouble()
               // mrpTotalAmountEventValue = removeExtraZeros((map[SharedPrefManager.PREF_MRP_EVENT] ?: 0.0).toDouble())

                packagingChargesAmountEventValue =
                    (map[SharedPrefManager.PREF_CURRENT_ORDER_PACKAGE_CHARGE] ?: 0.0).toDouble()
               // estimatedPayableAmountEventValue = (map[SharedPrefManager.PREF_API_FINAL_CALC_PAYABLE] ?: 0.0).toDouble()
                tmCreditAmountEventValue =
                    (map[SharedPrefManager.PREF_CURRENT_ORDER_TM_CREDIT] ?: 0.0).toDouble()
                tmRewardAmountEventValue =
                    (map[SharedPrefManager.PREF_CURRENT_ORDER_TM_CASH] ?: 0.0).toDouble()
            }



            if (!medicineListDataReceived.isNullOrEmpty()) {
                for (i in 0..medicineListDataReceived.size!! - 1) {
                    itemNamesEventValue.add(medicineListDataReceived.get(i)?.skuName ?: "")
                    productsIdsEventValue.add(medicineListDataReceived.get(i)?.productCode ?: "")
                }
            }

            noOfItemEventValue = itemNamesEventValue.size ?: 0

            //set new values here
            totalDiscountAmount = discountAmountApiResponse
            couponDiscountAmountEventValue=discountAmountApiResponse.toDouble()//not going

            mrpTotalAmountEventValue = mrpTotalAmount?:0.0 //not going
            discountAmountEventValue= cartMedicineDiscount //not going

            estimatedPayableAmountEventValue= currentPayableAmount
            updatedEstimatedPayableAmount =  currentPayableAmount- couponDiscountAmountEventValue


            var mxCouponApplied = MxCouponApplied(
                clickedOnPage,
                couponDiscountAmountEventValue,
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

            Log.e("coupon_applied","offline:::::"+mxCouponApplied)

            sdkEventUseCase.sendCouponAppliedEvent(mxCouponApplied)
        }
    }

    fun getCalendarData(millis: Long): Calendar? {
        val cal = Calendar.getInstance()
        cal.timeInMillis = millis * 1000L
        cal.timeZone = TimeZone.getTimeZone("UTC")
        return cal
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

    suspend fun deletePrescription(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        edit: Boolean,
        images: List<Long>,
        customerId: String
    ): ResponseBody? {
        var response: ResponseBody? = null
        when (val deletePrescriptionResponse =
            orderFlowRepository.deleteImages(mxInternalErrorOccurred, orderId, edit, images, customerId)) {
            is Resource.Success -> {
                deletePrescriptionResponse.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()!!
                    }else
                    {
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
                deletePrescriptionResponse.errorCode?.let {

                }

            }

            else -> null
        }
        return response

    }

    fun processValidationForPsp(
        patientID: String, patientName: String, orderAddress: String,
        isOrderAddressServiceable: Boolean, mrpValue: Float,
        prescriptionUploadedImgList: List<OrderRxInfo>,
        totalOutOfStockCount: Int, notDeliverableCount: Int
    ): Pair<Boolean, String> {
        var message = ""
        var isValid = false
        val addressId = SharedPrefManager.getInstance().addressId
        val selectedPatientId = SharedPrefManager.getInstance().patientId
        if (patientID == "0" || patientID == "-1" || patientName == ""
            || addressId <= 0
        ) {
            if (patientName == "" && addressId <= 0L) {
                message = context.getString(R.string.select_patient_name_address)
            } else if (selectedPatientId <= 0 || patientName == ""
            ) {
                message = context.getString(R.string.select_patient_name)
            } else if (addressId <= 0L) {
                message = context.getString(R.string.selectAddress)
            }
            isValid = false
        } else if (!isOrderAddressServiceable) {
            message = context.getString(R.string.txtSelectDifferentAddress)
            isValid = false
        } else if (SharedPrefManager.getInstance().newSelectedPinCode && SharedPrefManager.getInstance().addressId > 0) {
            message = context.getString(R.string.selectAddress)
            isValid = false
        }/*else if (mrpValue == 0f && prescriptionUploadedImgList.isEmpty()) {
            message = if (totalOutOfStockCount > 0) {
                context.getString(R.string.item_out_of_stock)
            } else if (notDeliverableCount > 0) {
                context.getString(R.string.medicines_not_deliverable)
            } else {
                context.getString(R.string.medicines_not_deliverable)
            }
            isValid = false
        } */else {
            isValid = true
        }
        return Pair(isValid, message)
    }

    suspend fun setPaymentSelectionMethod(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        orderId: Long,
        paymentMethodId: Long,
        paymentMethod: String,
        paymentMode : Long
    ) {
        when (val res = orderFlowRepository.setPaymentSelectionMethod(mxInternalErrorOccurred,
            orderId,
            paymentMethodId,
            paymentMethod,
            paymentMode
        )) {
            is Resource.Success -> {
                res.value?.let {
                    if (res.value.isSuccessful) {
                        SharedPrefManager.getInstance().selectedPaymentMethodId = paymentMethodId
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
                val keyValuePairs = ArrayList<KeyValuePair>()
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
                    /*CommonFunc.showCustomToastMessage(getApplication(), value)*/
                } catch (e: JSONException) {
                    Log.i("e", e.message.toString())
                    //TODO
                    /* CommonFunc.showCustomToastMessage(
                         getApplication(),
                         "Unable to connect to server. Please try again"
                     )*/
                }
            }

            else -> {

            }
        }
    }
    
    
    
    
    suspend fun getPatientDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,customerId: Long): GetAllPatientModel? =
        when (val res = orderFlowRepository.getPatientDetails(mxInternalErrorOccurred, customerId)) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
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

    suspend fun getPrescriptionsDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: Long,
        patientId: String?
    ): GetAllPrescriptionDataModel? =
        when (val res = orderFlowRepository.getPrescriptionDetails(mxInternalErrorOccurred, customerId, patientId)) {
            is Resource.Success -> res.value?.body()
            is Resource.Failure -> null
            else -> null
        }

    suspend fun submitDoctorRating(
        mxInternalErrorOccurred: MxInternalErrorOccurred,jsonObject: JsonObject): DoctorRating? {
        var response: DoctorRating? = null
        when (val res = orderFlowRepository.setDoctorRating(mxInternalErrorOccurred, jsonObject)) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.isSuccessful) {
                        response = it.body()
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
}
