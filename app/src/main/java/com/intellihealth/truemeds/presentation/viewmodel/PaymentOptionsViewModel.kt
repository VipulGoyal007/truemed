package com.intellihealth.truemeds.presentation.viewmodel

import android.app.Application
import android.content.Context
import android.os.SystemClock
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.CashHandlingApplicableInfo
import com.intellihealth.salt.models.CashHandlingInfoModel
import com.intellihealth.salt.utils.formatDecimal
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxChangeToCodClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxViewBillClicked
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails
import com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase
import com.intellihealth.truemeds.domain.usecase.PaymentOptionsUseCase
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAppOrderPlaced
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPageVisited
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPspViewed
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.ApiParameterConstants
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONArray
import java.util.Collections
import javax.inject.Inject

@HiltViewModel
class PaymentOptionsViewModel @Inject constructor(
    //private val couponUseCase: CouponUseCase,
    private val paymentOptionsUseCase: PaymentOptionsUseCase,
    private val helpFaqTncUseCase: HelpFaqTncUseCase,
    private val application: Application,
    @ApplicationContext private val context: Context
) : BaseViewModel(),
    DefaultLifecycleObserver {

    /**
     * This is the list into which we fetch all the payment options coming from API response
     * **/
    private var paymentOptionsList = ArrayList<PaymentMethodResponse.ResponseData>()
    var totalPaymentOptionsList = ArrayList<PaymentMethodResponse.ResponseData>()

    /**
     * This is used to store the last selected payment method
     * **/
    var lastPaymentMethodSelectedMutableLiveData = MutableLiveData<String?>("")

    /**
     * This is used to store the last selected payment method id
     * **/
    var lastPaymentMethodSelectedIdMutableLiveData = MutableLiveData<Long>(0L)

    /**
     * This is used to store the last selected payment method url
     * **/
    var lastPaymentMethodSelectedIconUrlMutableLiveData = MutableLiveData<String>("")

    /**
     * This is used to store the payment mode whether online or cash on delivery
     * **/
    private val paymentModeMutableLiveData = MutableLiveData(0)

    /**
     * This is used to show only all payment methods, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     * **/
    var paymentOptionsMutableLiveData: MutableLiveData<List<PaymentMethodResponse.ResponseData>?> =
        MutableLiveData(Collections.emptyList())

    /**
     * This is used to show only visible payment methods, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     * **/
    var paymentOptionsVisibleMutableLiveData: MutableLiveData<List<PaymentMethodResponse.ResponseData>?> =
        MutableLiveData(Collections.emptyList())

    /**
     * This is used to store information whether the view is full expanded or half expanded
     * **/
    var viewExpandedMutableLiveData = MutableLiveData(false)

    /**
     * This is used to store whether we want to show loader or not, mutablelivedata will be used in viewmodel and livedata variable will be used in activity
     * **/
    private val showLoaderMutableLiveData = MutableLiveData(false)
    val showLoader: LiveData<Boolean> get() = showLoaderMutableLiveData

    /**
     * This is used to store the header data of faq
     * **/
    var tmListDataHeader = MutableLiveData(emptyList<String>())

    /**
     * This is used to store the information data of mapped to the header faq
     * **/
    var tmListDataChildMap: MutableLiveData<HashMap<String, List<String>>> =
        MutableLiveData(HashMap())

    private var listDataHeaderSize = MutableLiveData(0)
    var faqLoaded = MutableLiveData(false)

    private var processingFeeMutableLiveData = MutableLiveData(0.0)

    private var apiFinalCalcMutableLiveData = MutableLiveData(0.0)

    private var tmRewardMutableLiveData = MutableLiveData(0.0)

    private var tmCreditMutableLiveData = MutableLiveData(0.0)

    /**
     * used to store ftc coupon list
     * **/
    var ftcCouponListMutableLiveData = MutableLiveData(emptyList<CouponCodeDataModel>())

    private var updateFtcCouponUi = MutableLiveData<Event<Boolean>>()
    val eventUpdateFtcCouponUi: LiveData<Event<Boolean>> get() = updateFtcCouponUi

    var isFtcCouponApplied = MutableLiveData(false)
    var isShowFtc = MutableLiveData(false)
    var isShowFtcTimer = MutableLiveData(false)
    var currentServerFtcTime = MutableLiveData(0L)
    var expiryServerFtcTime = MutableLiveData(0L)
    var ftcCounterTime = MutableLiveData("")

    /**
     * This value is used to display amount in bill details bottomsheet
     * **/
    private var payableAmountLiveData = MutableLiveData(0.0)

    /**
     * This value is used to display amount above View Bill display text
     * **/
    var totalPayableAmountMutableLiveData = MutableLiveData("0.0")

    var clickedOnPageMutableLiveData = MutableLiveData("")

    private var goToPaymentActivityMutableLiveData = MutableLiveData<Event<Any>>()
    val goToPaymentActivityEvent: LiveData<Event<Any>> get() = goToPaymentActivityMutableLiveData

    private var eventButtonViewMoreClickedMutableLiveData = MutableLiveData<Event<Any>>()
    val eventButtonViewMoreClicked: LiveData<Event<Any>> get() = eventButtonViewMoreClickedMutableLiveData

    private val paymentFailed = MutableLiveData<Event<Any>>()
    val eventPaymentFailed: LiveData<Event<Any>> get() = paymentFailed

    private val paymentChange = MutableLiveData<Event<Any>>()
    val eventPaymentChange: LiveData<Event<Any>> get() = paymentChange

    private val changeToCodEvent = MutableLiveData<Event<Pair<Any, Any>>>()
    val changeToCodEventLiveData: LiveData<Event<Pair<Any, Any>>> get() = changeToCodEvent

    private val paymentChangeCloseBS = MutableLiveData<Event<Int>>()
    val eventPaymentChangeCloseBS: LiveData<Event<Int>> get() = paymentChangeCloseBS

    val launchOrderStatus = MutableLiveData<Event<Boolean>>()
    val eventLaunchOrderStatus: LiveData<Event<Boolean>> get() = launchOrderStatus

    /**
     * Open View Bill Details Bottomsheet
     * **/
    private val openBillDetailsBsMutableLiveData = MutableLiveData<Event<BillDetailsModel>>()
    val eventOpenBillDetailsBs: LiveData<Event<BillDetailsModel>> get() = openBillDetailsBsMutableLiveData

    private val openPaymentMethodChangePopupMutableLiveData =
        MutableLiveData<Event<Pair<PaymentMethodResponse.ResponseData, Int>>>()
    val eventOpenPaymentMethodChangePopup: LiveData<Event<Pair<PaymentMethodResponse.ResponseData, Int>>> get() = openPaymentMethodChangePopupMutableLiveData

    private var showShimmerPaymentMethods = MutableLiveData<Boolean>(true)
    val showShimmerPaymentMethodsLiveData: LiveData<Boolean> get() = showShimmerPaymentMethods

    var appliedCouponCode = MutableLiveData("")

    var viewOtherPaymentOptions = MutableLiveData("")
    var isPaymentSpecificCoupon = false
    var isDisableBackPress = false
    var payableAmountButtonText = false
    var orderId: Long = 0
    var paymentUnsuccessful = false
    var sellingPrice: Double? = null
    var billDetails = BillDetailsModel()
    var billDetailsResponse: BillDetailResponse.ResponseData? = null
    var cartBillDetails: MutableLiveData<BillDetailsModel>
    var estimatedPayableValueMutableLiveData = MutableLiveData(0.00)

    /**
     * Needs for Mix Panel Events
     * **/
    var patientName = ""
    var patientID = ""
    var patientType = ""
    var patientAge = ""
    var patientGender = ""
    var cityName = ""
    var stateName = ""
    var pinCode = ""
    var addressType = ""
    var isOtcAdded: Boolean? = null
    var isChronicAdded: Boolean? = null
    var isGenericAdded = false
    var noOfItems = 0
    var currentOrderStatus = ""
    var currentOrderStatusId = 0
    var pageSection = ""
    var totalOutOfStockCount = 0
    var prescUploadedCount = 0
    var isRxRequired = false
    var productIds  = ArrayList<String>(0)
    var itemNames  = ArrayList<String>(0)
    var trackPurchaseEvents = ""
    var addMoreForCod = 0.0
    var addCOD = false
    var paymentRestrictedType = 0
    var restrictCod = false
    var onlyPrescription = false
    var isReorder = false
    var orderIsBeingPlacedView = MutableLiveData<Boolean>(false)
    var orderPlacedView = MutableLiveData<Boolean>(false)
    var setMainDataView = MutableLiveData<Boolean>(true)

    //    var cartMedicineListResponse = listOf<ProductInfoModel>()
    var apiMedicineList = mutableListOf<ProductInfoModel>()
    var prescriptions = listOf<OrderRxInfo>()

    var isbackbuttonEnabled: Boolean = true
    var orderTypeId: String? = null
    var orderSubsId: String? = null
    var orderPageSection: String? = null
    var orderPreviousStage: String? = null
    var mxInternalErrorOccurred=MxInternalErrorOccurred()
    //var clickedPage = MutableLiveData("")
    var placeOrderSubsIdValue: String = ""
    var cxAcceptedSubsCount: Int = 0

    var deliveryDays: Int?=0

    var launchOrderIsBeingPlaced = MutableLiveData(false)
    var launchOrderIsBeingPlacedCaseFailed = MutableLiveData(false)
    var billData: BillDetailsModel? = null

    init {
        paymentModeMutableLiveData.value = SharedPrefManager.getInstance().lastSelectedPaymentModeId
        billDetails = BillDetailsModel(
            0, "", "",
            "",
            0.0, 0.0, "", 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0, false, false,
            0.0, "", false, ""
        )

        /*SharedPrefManager.getInstance().updateCouponDetails(
            "27", "FIRST25", "5.0",
            999, "16", 27, 1000, "DISCOUNT BY PERCENTAGE UPTO",
            "27", "50", 50, 20, 1000L, "test",
            "", 0L, ""
        )*/
        //SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTime()

        cartBillDetails = MutableLiveData(billDetails)
    }

    /**
     * 1) API call FetchIconMaster is processed here. Here we fetch different payment methods like UPI, Wallets, Netbanking, Cards etc
     * with their displaying icons.
     * addCOD is a parameter we get from Intent data, where if the payment gets failed by any of the online payment methods
     * addCOD parameter is returned true
     * addCOD is a  boolean value passed to this method to show COD(Cash on Delivery), if isAddCod - true show COD else dont show
     * 2) if payment specific coupon applied is also checked in this function if true then only show View More Button, if UPI coupon applied then only show one item
     * i.e UPI as selected and rest will be inside Show More Options if other than UPI payment specific coupon applied then show that selected payment method
     * in 2nd option with UPI at top and others will be inside View more options
     * 3) API call getAllFAQCategory()
     * 4) API call fetchFtcCoupons() - Whether the user is FTC or NFTC is checked from SharedPrefManager.getInstance().isFtc, if FTC then only we call this API
     * **/
    suspend fun fetchPaymentMethods(addCOD: Boolean) {

        //viewModelScope.launch(IO) {

        val iconMasterResponse =
            paymentOptionsUseCase.fetchIconMaster(mxInternalErrorOccurred,ApiParameterConstants.BUNDLE_KEY_ICON_TYPE)
        val calculateBillDetail = orderFlowUseCase.calculateBillDetailsforApp(
            mxInternalErrorOccurred,
            orderId,
            paymentSelectionInfo = true
        )
        convertToCalculateBillDetailModel(calculateBillDetail)
        billDetailsResponse = calculateBillDetail?.responseData
        showShimmerPaymentMethods.postValue(false)
        iconMasterResponse?.let {

            val paymentSelectionResponse =
                paymentOptionsUseCase.processPaymentMethodsResponse(
                    mxInternalErrorOccurred,iconMasterResponse.responseData,
                    lastPaymentMethodSelectedMutableLiveData.value,
                    isPaymentSpecificCoupon,
                    appliedCouponCode.value?:"",
                    payableAmountButtonText,
                    cartBillDetails.value?.estimatedPayableValue?:0.0,
                    addCOD,
                    addMoreForCod,
                    restrictCod,
                    orderId,
                    calculateBillDetail
                )
            withContext(Main) {
                lastPaymentMethodSelectedMutableLiveData.value =
                    paymentSelectionResponse.selectedPaymentMethod
                lastPaymentMethodSelectedIdMutableLiveData.value =
                    paymentSelectionResponse.selectedPaymentMethodId
                lastPaymentMethodSelectedIconUrlMutableLiveData.value =
                    paymentSelectionResponse.selectedPaymentMethodUrl
            }
            paymentOptionsList = paymentSelectionResponse.paymentOptionsList
            val (originalPaymentOptionsList, index) = paymentOptionsUseCase.setOriginalPaymentOptionsList(
                paymentOptionsList,
                application
            )
            totalPaymentOptionsList = originalPaymentOptionsList
            paymentOptionsMutableLiveData.postValue(originalPaymentOptionsList)
            //viewExpandedMutableLiveData.postValue(false)


            if (clickedOnPageMutableLiveData.value != BundleConstants.ORDER_SUMMARY ||
                clickedOnPageMutableLiveData.value != BundleConstants.REORDER
            ) {
                val temporaryPaymentOptionsList =
                    paymentOptionsUseCase.setTemporaryPaymentOptionsList(
                        paymentOptionsList,
                        index
                    )
                if (temporaryPaymentOptionsList.size > 2) {
                    if (isPaymentSpecificCoupon) {
                        //viewExpandedMutableLiveData.postValue(true)
                        viewOtherPaymentOptions.postValue(
                            application.getString(
                                R.string.show_other_payment_options
                            )
                        )
                    } else {
                        viewExpandedMutableLiveData.postValue(false)
                    }
                } else {
                    if (temporaryPaymentOptionsList.size > 2) {
                        if (isPaymentSpecificCoupon) {
                            //viewExpandedMutableLiveData.postValue(true)
                            viewOtherPaymentOptions.postValue(
                                application.getString(
                                    R.string.show_other_payment_options
                                )
                            )
                        } else {
                            viewExpandedMutableLiveData.postValue(false)
                        }
                    }
                }

                val visiblePaymentOptionsList =
                    paymentOptionsUseCase.checkForPaymentSpecificCouponApplied(
                        isPaymentSpecificCoupon,
                        originalPaymentOptionsList
                    )
                Log.i("visiblePaymentList", "" + visiblePaymentOptionsList)
                paymentOptionsVisibleMutableLiveData.postValue(visiblePaymentOptionsList)
            }

        }

        //}
        if ((clickedOnPageMutableLiveData.value == BundleConstants.ORDER_SUMMARY ||
                    clickedOnPageMutableLiveData.value == BundleConstants.REORDER) || paymentUnsuccessful
        ) {
            getAllFAQCategory()
            if (SharedPrefManager.getInstance().isFtc || (lastPaymentMethodSelectedMutableLiveData.value == ""
                        || lastPaymentMethodSelectedMutableLiveData.value?.isEmpty() == true
                        || lastPaymentMethodSelectedMutableLiveData.value == null
                        || lastPaymentMethodSelectedMutableLiveData.value == "null")
            ) {
                fetchFtcCoupons()
            } else {
                //fetchFtcCoupons()
            }
        } else {
            fetchFtcCoupons()
        }
        isbackbuttonEnabled = true
        showLoaderMutableLiveData.postValue(false)
    }

    /**
     * 1) Payment options screen displays a section at the bottom of the screen for FAQ's.
     * 2) This API call is used to fetch all FAQ category is processed here based on id and name
     * if name = 'Payment Screen' we get the Id of that name and call another API getFaqByCategory
     * where the API expects categoryId
     * **/
    private fun getAllFAQCategory() {
        viewModelScope.launch(IO) {
            isbackbuttonEnabled = true
            showLoaderMutableLiveData.postValue(false)
            val response = helpFaqTncUseCase.getAllFAQCategory(mxInternalErrorOccurred)
            response?.let {
                it.payload?.let { respPayload ->
                    if (respPayload.isNotEmpty()) {
                        for (faqCategoryPayloadItem in respPayload) {
                            if (faqCategoryPayloadItem?.name.equals(
                                    "Payment Screen", ignoreCase = true
                                )
                            ) {
                                getFaqByCategory(faqCategoryPayloadItem?.id!!)
                                break
                            } else {
                                isbackbuttonEnabled = true
                                showLoaderMutableLiveData.postValue(false)
                            }
                        }
                    }

                }

            }
        }
    }

    /**
     * This function needs to be called inside getAllFAQCategory() on successfull response where we will pass the categoryId from the
     * getAllFAQCategory response and based on that we will call another API getFaqByCategory where we will get the question and answer in response
     * to be displayed on the screen
     * **/
    private fun getFaqByCategory(categoryId: Int) {
        viewModelScope.launch(IO) {
            val (listDataHeader, listDataChild) = helpFaqTncUseCase.getFAQByCategory(mxInternalErrorOccurred,categoryId)
            if (listDataHeader.size > 0) {
                tmListDataHeader.postValue(listDataHeader)
                tmListDataChildMap.postValue(listDataChild)
                listDataHeaderSize.postValue(listDataHeader.size)
                faqLoaded.postValue(true)
            } else {
                listDataHeaderSize.postValue(0)
                faqLoaded.postValue(false)
            }
        }
    }

    /**
     * 1) If FTC then we execute this function which will call the getFtcCouponExpiryDate API to return the list of coupons( for example FIRST25, FIRST23) which are available for FTC users only
     * 2) If the size of list of couponList == 1, we assign the promoCode value to Constants.FTC_COUPON_CODE
     * 3) If the size of list of couponList == 2, we assign the 1st promoCode value to Constants.FTC_COUPON_CODE and
     * 2nd promoCode value to Constants.FTC_COUPON_CODE_1
     * **/
    private fun fetchFtcCoupons() {
        viewModelScope.launch(IO) {
            updateFtcCouponUi.postValue(Event(true))
        }
    }

    /**
     * 1) This method is called from PaymentMethodChangeBottomSheet on click of change mode button
     * 2) If any payment specific coupon method is already selected in PSP screen, and if we want to change the payment method
     * we remove the coupon by calling API savePaymentAndCouponForOrder inside this function by passing the following parameters
     * orderid, paymentid, offerid
     * offerid is always passed 0
     * paymentid is whether COD or Online
     * 3) Code Snippet - if SharedPrefManager.getInstance().couponPaymentMode == "online") - 16
     * else if (SharedPrefManager.getInstance().couponPaymentMode == "cod" - 17
     * else if SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1) 17
     * else SharedPrefManager.getInstance().lastSelectedPaymentModeId.toLong()
     * orderid - for which orderid we are removing the coupon
     * 4) if response of this API call is success we call getOrderDetails() API to get the bill details inside finalCalcAmt json object
     * **/
    fun setOfferIdForOrderId(offerId: Long) {
        val paymentId = orderFlowUseCase.setPaymentMode()
        viewModelScope.launch(IO) {
            val result = couponUseCase.applyAndRemoveCouponCode(
                mxInternalErrorOccurred,orderId,
                paymentId.toString(),
                offerId.toString()
            )
            result?.responseData?.let {
                calculateBillDetailsOnBillUpdate()
            }

        }
    }

    /**
     * This function is executed on click of Place Order button
     *
     * Note : Current working flow is where we create orderid by calling saveMedsAndCreateOrder but this will be decided as per discussion whether to directly call
    confirmOrder() API inside placeOrder() which is used to confirm the order


     * 1) Pass PaymentOptionsResponse.PaymentOptionsResponseItem as a parameter
     * 2) Check payableAmountButtonText true or not
     * 3) if payableAmountButtonText true then check the paymentCategory inside PaymentOptionsResponseItem
     * inside check if paymentCategory = COD if yes then call changeToCodApiCall() else setPaymentSelectionMethod() API call and go to Payment Activity
     * 4) if payableAmountButtonText false check
     * if paymentCategory = COD
     * inside check  if(clickedPage = "OrderSummary" || clickedPage="ReOrder")), if yes then call placeOrder() else changeToCodApiCall()
     * 5) if paymentCategory is other than COD then call placeOrder()
     *  **/
    fun setDataForPlaceOrder(item: PaymentMethodResponse.ResponseData) {
        if (payableAmountButtonText) {
            if (item.paymentCategory == application.getString(R.string.cash_on_delivery_btn_text)) {
                viewModelScope.launch(IO) {
                    isbackbuttonEnabled = false
                    showLoaderMutableLiveData.postValue(true)

                    sendEventChangeToCod()

                    val (response, responseMessage) = orderFlowUseCase.changeToCod(mxInternalErrorOccurred,orderId)
                    isbackbuttonEnabled = true
                    showLoaderMutableLiveData.postValue(false)
                    changeToCodEvent.postValue(Event(Pair(response, responseMessage)))

                }
            } else {
                viewModelScope.launch(IO) {
                    isbackbuttonEnabled = false
                    showLoaderMutableLiveData.postValue(true)
                    setPaymentSelectionMethod()
                    isbackbuttonEnabled = true
                    showLoaderMutableLiveData.postValue(false)
                    delay(1000)
                    Log.i("goToPaymentActivity", "false")
                    goToPaymentActivityMutableLiveData.postValue(Event(Any()))
                    Log.i("goToPaymentActivity", "true")
                }


            }
        } else {
            if (item.paymentCategory == application.getString(R.string.cash_on_delivery_btn_text)) {
                if (clickedOnPageMutableLiveData.value.equals(BundleConstants.ORDER_SUMMARY)
                    || clickedOnPageMutableLiveData.value.equals(BundleConstants.REORDER)
                ) {
                    Log.i("placeOrder", "COD")
                    placeOrder()
                } else {
                    viewModelScope.launch(IO) {
                        isbackbuttonEnabled = false
                        showLoaderMutableLiveData.postValue(true)
                        val (response, responseMessage) = orderFlowUseCase.changeToCod(mxInternalErrorOccurred,orderId)
                        isbackbuttonEnabled = true
                        showLoaderMutableLiveData.postValue(false)
                        changeToCodEvent.postValue(Event(Pair(response, responseMessage)))
                    }
                }
            } else {
                placeOrder()
            }
        }
    }

    fun setPaymentSelectionMethod() {
        viewModelScope.launch(IO) {
            val response = paymentOptionsUseCase.setPaymentSelectionMethod(
                mxInternalErrorOccurred,orderId.toLong(),
                lastPaymentMethodSelectedIdMutableLiveData.value!!,
                lastPaymentMethodSelectedMutableLiveData.value!!,
                SharedPrefManager.getInstance().lastSelectedPaymentModeId.toLong()
            )
            if (response) {

            }
        }
    }

    fun setPSPViewedByCustomer() {
        viewModelScope.launch(IO) {
            val response = paymentOptionsUseCase.setPspViewedByCustomer(
                mxInternalErrorOccurred,
                orderId
            )
        }
    }

    fun setPaymentSelectionMethodForPlaceOrder(
        placeOrderViaPaymentMethodId: Long,
        paymentMethod: String,
    ) {
        viewModelScope.launch(IO) {
            val response = paymentOptionsUseCase.setPaymentSelectionMethod(
                mxInternalErrorOccurred,orderId.toLong(),
                placeOrderViaPaymentMethodId,
                paymentMethod,
                SharedPrefManager.getInstance().lastSelectedPaymentModeId.toLong()
            )

            if (response) {
                 val calculateBillDetail = orderFlowUseCase.calculateBillDetailsforApp(
                    mxInternalErrorOccurred,
                    orderId,
                    paymentSelectionInfo = true
                )
                billDetailsResponse = calculateBillDetail?.responseData
                placeOrder()
            }
        }
    }

    /**
     *  call confirmOrder()
     * **/
    private fun placeOrder() {
        isDisableBackPress = true
        SharedPrefManager.getInstance().finalAmountValue =
            CommonFunc.getNumberFormat().format(billDetails.estimatedPayableValue)
        Log.i("placeOrder", "placeOrder")



        confirmOrder()
    }


    /**
     * OrderFlowUseCase call confirmOrder
     * **/
    private fun confirmOrder() {
        Log.i("placeOrder", "confirmOrder")
        var mLastClickTime = 0L
        if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
            Log.i("placeOrder", "return")
            return
        }
        mLastClickTime = SystemClock.elapsedRealtime()
        viewModelScope.launch(IO) {
            isbackbuttonEnabled = false
           // showLoaderMutableLiveData.postValue(true)
            launchOrderIsBeingPlaced.postValue(true)
            orderId = SharedPrefManager.getInstance().incompleteOrderId

            val response = orderFlowUseCase.placeOrder(
                mxInternalErrorOccurred,apiMedicineList,
                cartMedicineListResponse,
                prescriptions,
                SharedPrefManager.getInstance().lastSelectedPaymentModeId,
                lastPaymentMethodSelectedMutableLiveData.value!!,
                lastPaymentMethodSelectedIdMutableLiveData.value!!,
                lastPaymentMethodSelectedIconUrlMutableLiveData.value!!
            )
            Log.i("placeOrder", "confirmOrder response" + response)
            if (response.code == 200) {
                val addedItems = localDbUseCase.getAddedMedProductCode()
                val productIdArray = JSONArray()
                if (!addedItems.isNullOrEmpty()) {
                    for (i in addedItems.indices) {
                        productIdArray.put(addedItems[i])
                    }
                }
                sendItemOrderPlacedToMixPanel(productIdArray, cartMedicineListResponse)
                placeOrderMP()
                isbackbuttonEnabled = true
               // showLoaderMutableLiveData.postValue(false)
                localDbUseCase.clearCart()
                SharedPrefManager.getInstance().offerId = "0"
                SharedPrefManager.getInstance().couponModel = null
                SharedPrefManager.getInstance().isContactSheetClosed = false
                launchOrderStatus.postValue(Event(true))
                SharedPrefManager.getInstance().setIsReOder(false)
                SharedPrefManager.getInstance().prescriptionCount = 0
//                SharedPrefManager.getInstance().isPspViewed = false
            }
            else {
                //  loaderValue.postValue(false)
                launchOrderIsBeingPlacedCaseFailed.postValue(true)
                showInternalServerError.postValue(response.message?:"Internal server error, please try again")//

            }
        }
    }

    /**
     * 1) OrderFlowUseCase call getOrderDetails
     * 2) calculateBillDetailsOnBillUpdate() inside finalCalcAmt from API Response
     * **/
    private fun getOrderDetails() {
        isbackbuttonEnabled = false
        showLoaderMutableLiveData.value = true
        //TODO call bill details api
        /*viewModelScope.launch(IO) {
            val orderDetailsResponse = orderFlowUseCase.getOrderDetails(orderId)
            orderDetailsResponse?.let {
                orderDetailsResponse.finalCalcAmt?.let {
                    val calculateFinalCalcAmt = orderFlowUseCase.getBillDetailsFromOrderDetails(it)
                    processingFeeMutableLiveData.postValue(calculateFinalCalcAmt.packagingCharge)
                    tmRewardMutableLiveData.postValue(calculateFinalCalcAmt.tmCash)
                    tmCreditMutableLiveData.postValue(calculateFinalCalcAmt.tmCredit)
                    apiFinalCalcMutableLiveData.postValue(calculateFinalCalcAmt.payableAmt)
                    calculateBillDetailsOnBillUpdate()
                }
            }
              isbackbuttonEnabled=true
            showLoaderMutableLiveData.postValue(false)
        }*/
        isbackbuttonEnabled = true
        showLoaderMutableLiveData.value = false
    }


    /**
     * 1) This method accepts 3 parameters (item: PaymentOptionsResponse.PaymentOptionsResponseItem,position: Int,clickedOnPage:String)
     * 2) This function is for Payment selection change on PSP screen, the method is used when user comes from OrderSummary or ReOrder screen.
     * 3) If the coupon is applied while placing order and if the user selected payment specific coupon method
     * we put the selected method in session also and if the session payment method does not equals to the payment method selected
     * on the psp screen
     * then change of payment method selection bottomsheet is shown, where user will be asked to change the payment selection method,
     * once confirm the existing coupon will be removed and payment selection on psp screen will be changed
     * 4) if clickedOnPage = ReOrder/OrderSummary - We set SharedPrefManager.getInstance().selectedPaymentMethodIconUrl and
     * SharedPrefManager.getInstance().selectedPaymentMethod
     * 5) And also based on the payment method selection we determine whether the payment option is COD or Online
     * 6) There is one more value which we check inside this function - isPaymentSpecificCoupon which is a boolean value
     * 7) The importance of isPaymentSpecificCoupon is to show ViewMore button or not, the value is passed through intent and
     * the value is checked true only when we come from HomeScreen/OrderStatus to PSP Screen.
     * **/
    fun onPaymentMethodChanged(
        item: PaymentMethodResponse.ResponseData,
        position: Int
    ) {
        if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.isCouponApplied) {
            if (SharedPrefManager.getInstance().couponModel.paymentMethods?.get(0)?.iconType != item.paymentCategory && SharedPrefManager.getInstance().couponModel.paymentMethods?.get(
                    0
                )?.iconType != ""
                && SharedPrefManager.getInstance().couponModel.paymentMethods?.get(0)?.iconType != null
                && SharedPrefManager.getInstance().couponModel.paymentMethods?.get(0)?.iconType != "null"
                && isPaymentSpecificCoupon
            ) {
                openPaymentMethodChangePopupMutableLiveData.value = Event(Pair(item, position))
            } else {
                onPaymentMethodSelected(item, position, clickedOnPageMutableLiveData.value!!)
            }
        } else if (appliedCouponCode.value != null && appliedCouponCode.value != "null" && appliedCouponCode.value?.isNotEmpty() == true
            && lastPaymentMethodSelectedMutableLiveData.value?.isNotEmpty() == true &&
            lastPaymentMethodSelectedMutableLiveData.value != null && lastPaymentMethodSelectedMutableLiveData.value != "null"
            && isPaymentSpecificCoupon
        ) {
            if (lastPaymentMethodSelectedMutableLiveData.value != item.paymentCategory) {
                openPaymentMethodChangePopupMutableLiveData.value = Event(Pair(item, position))
            } else {
                onPaymentMethodSelected(item, position, clickedOnPageMutableLiveData.value.toString())
            }
        } else {
            onPaymentMethodSelected(item, position, clickedOnPageMutableLiveData.value.toString())
        }
    }

    /**
     * This method accepts 3 parameters (item: PaymentOptionsResponse.PaymentOptionsResponseItem,position: Int,clickedOnPage:String)
     * We call this function inside onPaymentMethodChanged() to show the selected payment method.
     * **/
    fun onPaymentMethodSelected(
        item: PaymentMethodResponse.ResponseData,
        position: Int, clickedOnPage: String
    ) {
        val paymentList = paymentOptionsMutableLiveData.value
        paymentList?.let {
            var cashHandlingMessageData:CashHandlingInfoModel? = null
            var cashHandlingApplicableInfo:CashHandlingApplicableInfo? = null
            var calculateBillDetail:BillDetailResponse?= null
            viewModelScope.launch(IO) {

                var methodId = lastPaymentMethodSelectedIdMutableLiveData.value!!
                var methodName = lastPaymentMethodSelectedMutableLiveData.value!!
                if (it[position].paymentOptions != null) {
                    methodId = it[position].paymentModeUrlId!!.toLong()
                        ?: lastPaymentMethodSelectedIdMutableLiveData.value!!
                    methodName =
                        it[position].paymentOptions!![0]?.paymentOptionRadioModel?.paymentName?.toString()
                            ?: lastPaymentMethodSelectedMutableLiveData.value!!
                }
                if (item.paymentCategory == context.getString(R.string.cash_on_delivery_btn_text)) {
                    SharedPrefManager.getInstance().setPaymentSelectedMode(17)
                } else {
                    SharedPrefManager.getInstance().setPaymentSelectedMode(16)
                }

                if (!(payableAmountButtonText && item.paymentCategory.equals("Cash on delivery"))) {
                    loaderValue.postValue(true)
                    val response = paymentOptionsUseCase.setPaymentSelectionMethod(
                        mxInternalErrorOccurred,orderId.toLong(),
                        methodId,
                        methodName,
                        SharedPrefManager.getInstance().lastSelectedPaymentModeId.toLong()
                    )

                     calculateBillDetail = orderFlowUseCase.calculateBillDetailsforApp(
                        mxInternalErrorOccurred,
                        orderId,
                        paymentSelectionInfo = true
                    )

                    convertToCalculateBillDetailModel(calculateBillDetail)

                    val numberFormat = CommonFunc.getNumberFormat()
                    totalPayableAmountMutableLiveData.postValue(
                        String.format("₹%s", numberFormat.format(calculateBillDetail?.responseData?.payableAmt)))

//                    cartBillDetails.value = (calculateBillDetail)
                    if(item.paymentModeUrlId == 11) {

                     // Log.d("1111", calculateBillDetails.toString())
                        cashHandlingMessageData = if(calculateBillDetail?.responseData?.cashHandlingInfo !=null) {
                            CashHandlingInfoModel(
                                charge = calculateBillDetail?.responseData?.cashHandlingInfo?.charge
                                    ?: 0.0,
                                waivedOffCharge = calculateBillDetail?.responseData?.cashHandlingInfo?.waivedOffCharge
                                    ?: 0.0,
                                placeOrderViaPaymentMethodId = 6,
                                chcMsg = calculateBillDetail?.responseData?.cashHandlingInfo?.chcMsg,
                                placeOrderViaMsg = context.getString(R.string.place_order_via_chc_msg) + calculateBillDetail?.responseData?.payableAmountWithoutChc,
                                isPayableAmountWithoutChcSameAsPayableAmnt =(calculateBillDetail?.responseData?.payableAmt  == calculateBillDetail?.responseData?.payableAmountWithoutChc)

                            )
                        } else null
                    }

                        cashHandlingApplicableInfo = if(calculateBillDetail?.responseData?.cashHandlingApplicableInfo !=null) {
                            CashHandlingApplicableInfo(
                                charge = calculateBillDetail?.responseData?.cashHandlingApplicableInfo?.charge
                                    ?: 0.0,
                                waivedOffCharge = calculateBillDetail?.responseData?.cashHandlingApplicableInfo?.waivedOffCharge
                                    ?: 0.0,
                                chcMsg = calculateBillDetail?.responseData?.cashHandlingApplicableInfo?.chcMsg
                            )
                        } else null


                    //loaderValue.postValue(false)
                }

                val paymentMethodSelectionModel = paymentOptionsUseCase.onPaymentMethodSelected(
                    item,
                    it, position, payableAmountButtonText,
                    payableAmountLiveData.value?:0.0,
                    clickedOnPage,
                    isPaymentSpecificCoupon,
                    appliedCouponCode.value.toString(),
                    addCOD, restrictCod, addMoreForCod, mxInternalErrorOccurred,orderId
                )

                    for (i in  paymentMethodSelectionModel.paymentOptionsList?.indices!!) {
                        if (paymentMethodSelectionModel.paymentOptionsList?.get(i)?.paymentCategory == context.getString(R.string.cash_on_delivery_btn_text)) {
                            paymentMethodSelectionModel.paymentOptionsList?.get(i)?.paymentOptions?.get(0)?.paymentOptionRadioModel?.chcModel =
                                cashHandlingMessageData
                            paymentMethodSelectionModel.paymentOptionsList?.get(i)?.paymentOptions?.get(0)?.paymentOptionRadioModel?.chcApplicableModel =
                                cashHandlingApplicableInfo
                            it.get(i).paymentOptions?.get(0)?.paymentOptionRadioModel?.buttonText=
                                if(calculateBillDetail?.responseData?.cashHandlingInfo != null  && calculateBillDetail?.responseData?.payableAmt  != calculateBillDetail?.responseData?.payableAmountWithoutChc ) ( (it.get(i).paymentOptions?.get(0)?.paymentOptionRadioModel?.buttonText?.toString()) + " at ₹"+ calculateBillDetail?.responseData?.payableAmt )else  (it.get(i).paymentOptions?.get(0)?.paymentOptionRadioModel?.buttonText?.toString())
                        }
                    }


                paymentOptionsMutableLiveData.postValue(paymentMethodSelectionModel.paymentOptionsList)
                withContext(Dispatchers.Main) {
                    if (clickedOnPage != BundleConstants.ORDER_SUMMARY || clickedOnPage != BundleConstants.REORDER) {
                        lastPaymentMethodSelectedMutableLiveData.value =
                            paymentMethodSelectionModel.paymentMethod
                        lastPaymentMethodSelectedIdMutableLiveData.value =
                            paymentMethodSelectionModel.paymentMethodId!!
                        lastPaymentMethodSelectedIconUrlMutableLiveData.value =
                            paymentMethodSelectionModel.paymentMethodUrl!!
                    }
                }

                loaderValue.postValue(false)
            }

            /*val paymentMethodSelectionModel = paymentOptionsUseCase.onPaymentMethodSelected(
                item,
                it, position, payableAmountButtonText,
                payableAmountLiveData.value!!,
                clickedOnPage,
                isPaymentSpecificCoupon,
                appliedCouponCode.value!!,
                addCOD, restrictCod, addMoreForCod, mxInternalErrorOccurred,orderId
            )
           if(cashHandlingMessageData != null) {
               paymentMethodSelectionModel.paymentOptionsList?.get(0)?.paymentOptions?.get(position)?.paymentOptionRadioModel?.chcModel =
                   cashHandlingMessageData
           }
            paymentOptionsMutableLiveData.postValue(paymentMethodSelectionModel.paymentOptionsList)
            if (clickedOnPage != BundleConstants.ORDER_SUMMARY || clickedOnPage != BundleConstants.REORDER) {
                lastPaymentMethodSelectedMutableLiveData.value =
                    paymentMethodSelectionModel.paymentMethod
                lastPaymentMethodSelectedIdMutableLiveData.value =
                    paymentMethodSelectionModel.paymentMethodId!!
                lastPaymentMethodSelectedIconUrlMutableLiveData.value =
                    paymentMethodSelectionModel.paymentMethodUrl!!
            }*/
        }
    }


    /**
     * Case 1: If any payment specific coupon has been applied while placing the order (eg. UPI)
     * The PSP screen will have UPI selected and the rest payment methods will be inside the accordion with the button View More visible
     * If you click on View more, the other payment methods will be visible.
     * Case 2: If any payment specific coupon other than UPI has been applied while placing the order then by default UPI will always
     * be present in the first position of PSP screen and the selected payment method with which you placed order
     * will be at position 2nd, while the rest payment methods will be inside the accordion with button View More visible
     * **/
    fun onBtnViewMoreClicked() {
        eventButtonViewMoreClickedMutableLiveData.postValue(Event(Any()))
    }

    /**
     * This is an on click event fired from Payment Method Change Bottomsheet
     * This function is called when the user clicks on change mode button
     * **/
    fun paymentMethodChangeBottomSheetEvent() {
        paymentChange.value = Event(Any())
    }

    /**
     * This is an on click event fired from Payment Method Change Bottomsheet
     * This function is called when the user clicks on don't remove button
     * **/
    fun closePaymentMethodChangeBottomSheetEvent() {
        paymentChangeCloseBS.value = Event(1)
    }

    /**
     * Process the bill details which we got from intent here, this processed data will be used to show in the bill details bottomsheet
     * 1) Create a payableAmountLiveData double variable and assign the value from billDetails.totalPayableAmount
     * 2) Create a totalPayableAmountLiveData string variable and assign the value from billDetails.totalPayableAmount which is used in xml to display amount with rupee symbol
     * totalPayableAmountLiveData.value = String.format("₹%s", numberFormat.format(billDetails.totalPayableAmount))
     * 3) Create a cartBillDetails mutablelivedata object and pass the billDetails as a parameter
     * cartBillDetails = MutableLiveData(billDetails)
     * **/
    fun processBillDetails() {
        val numberFormat = CommonFunc.getNumberFormat()
        if (billDetails.couponName != null && billDetails.couponName!!.contains(
                BundleConstants.PAYMENT_DEFAULT_OPTION
            ) && lastPaymentMethodSelectedMutableLiveData.value != BundleConstants.PAYMENT_DEFAULT_OPTION
        )
            billDetails.couponDiscountAmt = 0.0

        payableAmountLiveData.value = billDetails.estimatedPayableValue
        totalPayableAmountMutableLiveData.value =
            String.format("₹%s", numberFormat.format(billDetails.estimatedPayableValue))
        cartBillDetails = MutableLiveData(billDetails)
        estimatedPayableValueMutableLiveData.value=billDetails.estimatedPayableValue
    }

    /**
     * 1) check for PSP variant B or C
     * 2) check for if user is FTC and NFTC
     * 3) check for coupon applied or not for both FTC and NFTC
     * 4) If FTC and if coupon applied we will have a boolean variable showFtcCouponTimer and assign it to true
     * 5) If showFtcCouponTimer == true then we will show timer for the based on variants
     * NOTE : For NFTC there will be no timers
     * **/
    fun setDataBasedOnPspVariant() {
        val couponCode = paymentOptionsUseCase.setDataBasedOnPspVariant(appliedCouponCode.value!!)
        Log.i("couponCode", "" + couponCode)
        appliedCouponCode.value = couponCode
    }

    /**
     * 1) This function is called inside getOrderDetails API onSuccess callback and inside finalCalcAmt json object
     * where we override the processingFee, tmcash, tmreward values
     * 2) override the values of billdetails object
     * 3) assign the updated values of billdetails to cartBillDetails which will automatically show the updated values in Bill Details Bottomsheet
     * **/
    private fun calculateBillDetailsOnBillUpdate() {
        val (billDetails, payableAmount) = paymentOptionsUseCase.calculateBillDetailsOnBillUpdate(
            billDetails
        )

        viewModelScope.launch(Main) {
            payableAmountLiveData.value = (payableAmount)
            totalPayableAmountMutableLiveData.value =
                (String.format(
                    "₹%s",
                    CommonFunc.getNumberFormat().format(billDetails.estimatedPayableValue)
                ))
            cartBillDetails.value = (billDetails)
        }
    }

    /**
     * When user tries to change the payment method selection with already coupon applied
     * PaymentChangeSelectionBottomSheet is launched with 2 options, to remove coupon / dont remove
     * if user clicks on remove this method is called
     * **/
    //fun calculateFinalBillDetailsAfterCouponRemove(clickedOnPage: String, couponDiscount: Double) {
    fun calculateFinalBillDetailsAfterCouponRemove(
        clickedOnPage: String, couponDiscount: Double,
        item: PaymentMethodResponse.ResponseData,
        position: Int,
        estimatedPayableValue: Double
    ) {

        var payableAmount: Double =
            billDetails.estimatedPayableValue!!.plus(billDetails.couponValue!!)
        Log.i("payableAmount", "" + payableAmount)
        billDetails.estimatedPayableValue = payableAmount
        viewModelScope.launch(Main) {
            billDetails.couponValue = 0.0
            payableAmountLiveData.value =
                (billDetails.estimatedPayableValue!!.plus(billDetails.couponValue!!))
            billDetails.estimatedPayableValue = payableAmountLiveData.value
            totalPayableAmountMutableLiveData.value =
                (String.format(
                    "₹%s",
                    CommonFunc.getNumberFormat().format(billDetails.estimatedPayableValue)
                ))
            cartBillDetails.value = (billDetails)
            estimatedPayableValueMutableLiveData.value = estimatedPayableValue
            onPaymentMethodSelected(item, position, clickedOnPage)
        }
    }

    /**
     * 1) This event is fired when we click on View Bill or on the Total Bill Amount text
     * 2) The event will be observed in the PaymentOptionActivity which will call the showBillDetailsBottomSheet()
     * **/
    fun openBillDetailsBottomSheetEvent() {
//        cartBillDetails.value?.let {
//            val tmBillDetails =
//                orderFlowUseCase.showBillDetails(it, ClassNameConstants.PAYMENT_OPTION_ACTIVITY)
//            openBillDetailsBsMutableLiveData.value = Event(tmBillDetails)
//        }
        openBillDetailsBsMutableLiveData.value = Event(billData)

        Log.d("qwerty", "Bill Details : ${Gson().toJson(billData)}")

    }

    fun paymentAgain() {
        paymentFailed.value = Event(Any())
    }

    /**
     * TODO
     * This event is fired whenever we visit the PSP screen
     * **/
    private fun sendPspViewedMixPanelEvent() {

    }

    private fun getMedicineOrderDetailsList(orderId: Long) {
        viewModelScope.launch(IO) {
            val medicineDetails = orderFlowUseCase.getOrderMedicineDetails(mxInternalErrorOccurred,orderId)
            medicineDetails.let {
                if (it.statusCode == 200) {
                    cartMedicineListResponse = it.responseData?.elasticProductDetails ?: listOf()
                    apiMedicineList = (it.responseData?.elasticProductDetails ?: listOf()).toMutableList()
                } else {
                    showInternalServerError.postValue("Internal server error, please try again")
                }
            }
        }
    }

    fun removeCoupon() {
        // _isLoading.postValue(true)
        viewModelScope.launch(IO) {
            val couponSaveRemoveResponse = async {
                couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId,
                    getPaymentMode().toString(), "0"
                )
            }.await()
//                SharedPrefManager.getInstance().setCouponModel()
            if (couponSaveRemoveResponse != null && couponSaveRemoveResponse.message.equals(
                    BundleConstants.COUPON_REMOVED,
                    true
                )
            ) {
                SharedPrefManager.getInstance().couponModel = null
                SharedPrefManager.getInstance().offerId = "0"
                SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
            } else {
                //applyCouponFailed.postValue(Event(Any()))
            }
            //_isLoading.postValue(false)
        }

    }

    private fun getPaymentMode(): Long {
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

     fun sendPspViewedEvent() {
//         SharedPrefManager.getInstance().isPspViewed = true
         viewModelScope.launch(Dispatchers.IO) {
             val mxPspViewed = MxPspViewed()
             mxPspViewed.pageSection = pageSection
             mxPspViewed.ctaType = if (payableAmountButtonText) "pay" else "place_order"
             mxPspViewed.pageState =
                 if (viewOtherPaymentOptions.value == application.getString(R.string.show_other_payment_options)) "partial" else "complete"
             mxPspViewed.availablePaymentModes = JSONArray().apply {
                 paymentOptionsList.forEach {
                     this.put(it.paymentCategory)
                 }
             }
             mxPspViewed.paymentMode =
                 lastPaymentMethodSelectedMutableLiveData.value
             mxPspViewed.isReorder = isReorder//SharedPrefManager.getInstance().isReOrder
             mxPspViewed.clickedOnPage =
                 if (clickedOnPageMutableLiveData.value.equals("OrderSummary")) "order_summary"
                 else if (clickedOnPageMutableLiveData.value.equals("OrderStatus")) "order_status"
                 else if (clickedOnPageMutableLiveData.value.equals("HomePage")) "homepage"
                 else null
             mxPspViewed.noOfItem = noOfItems

             /*val productCodeList = localDbUseCase.getAddedMedProductCode()
             mxPspViewed.productsIds = if (productCodeList.isNullOrEmpty()) null else productCodeList*/

             mxPspViewed.productsIds = productIds


             mxPspViewed.subsId = if(localDbUseCase.getSubsIdOfOrder() > 0) localDbUseCase.getSubsIdOfOrder().toString() else null/*orderSubsId*/
             mxPspViewed.salesPrice = billDetails. sellingPrice
             /*val nameList = localDbUseCase.getAddedMedNames()
             mxPspViewed.itemNames = if (nameList.isNullOrEmpty()) null else nameList*/

             mxPspViewed.itemNames = itemNames

             mxPspViewed.appliedCouponName = if(appliedCouponCode.value=="") null else appliedCouponCode.value
             mxPspViewed.appliedCouponType =
                 if (!billDetails.couponName.isNullOrEmpty()) {
                     if (isPaymentSpecificCoupon) {
                         "payment_mode_specific"
                     } else {
                         "generic"
                     }
                 } else {
                     null
                 }
             mxPspViewed.orderId = orderId.toString()
             mxPspViewed.mrpTotalAmount = billDetails.mrpValue
             mxPspViewed.discountAmount = billDetails.discountValue
             mxPspViewed.packagingChargeAmount = billDetails.taxesAndChargesValue
             mxPspViewed.deliveryChargeAmount = billDetails.deliveryChargesValue
             mxPspViewed.couponDiscountAmount = billDetails.mxCouponAppliedAmount
             mxPspViewed.tmCreditAmount = billDetails.tmCreditValue
             mxPspViewed.tmRewardAmount = billDetails.tmRewardValue
             mxPspViewed.estimatedPayableAmount = billDetails.estimatedPayableValue
             mxPspViewed.rxRequired = isRxRequired
             mxPspViewed.paymentMethod = if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == 16) "Online" else "COD"
             mxPspViewed.patientType = if(patientType.equals("OTHER", true)) "someone_else" else patientType
             mxPspViewed.patientAge = patientAge.toIntOrNull() ?: 0
             mxPspViewed.shippingCity = cityName
             mxPspViewed.shippingState = stateName
             mxPspViewed.shippingPinCode = pinCode
             mxPspViewed.addressType = addressType
             mxPspViewed.gender = patientGender
             mxPspViewed.currentOrderStatus = currentOrderStatus
             mxPspViewed.cashHandlingCharge = if(billDetailsResponse?.pspViewed == true) billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null
             mxPspViewed.cashHandlingChargeApplicable = if(billDetailsResponse?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse) else null
             sdkEventUseCase.sendPspViewedEvent(mxPspViewed)
         }

    }


    suspend fun placeOrderMP() {
        try {
            val addedItems = localDbUseCase.getAddedMedProductCode()
            val addedItemNames = localDbUseCase.getAddedMedNames()

            val jArrOrgIds = ArrayList<String>()
            val jArrSubsIds = ArrayList<String?>()
            val jArrOrgName = ArrayList<String?>()
            val productIdArray = JSONArray()

            if (addedItems.isNotEmpty()) {
                for (i in addedItems.indices) {
                    jArrOrgIds.add(addedItems[i])
                    productIdArray.put(addedItems[i])
                }
            }
            if (addedItemNames.isNotEmpty()) {
                for (i in addedItemNames.indices) {
                    jArrOrgName.add(addedItemNames[i])
                }
            }

            val cartCount = localDbUseCase.getCartCount()
            val customerDetails: CustomerDetails = localDbUseCase.getCustomerDetails(SharedPrefManager.getInstance().loggedInUserMobile)
            val trayDetails: List<String> = localDbUseCase.getTrayDetailsOfItemAddedAttributes()
            val expList: List<String> = localDbUseCase.getAllCustomerCategory()
//            sendItemOrderPlacedToMixPanel(productIdArray, cartMedicineListResponse)
            val isAddedCrossSelling: Boolean = localDbUseCase.getAddedCrossSellingProductCount() > 0
            val isTmContactSaved: Boolean = localDbUseCase.getSavedContactsCount() > 0

            sdkEventUseCase.sendAppOrderPlacedEvent(
                MxAppOrderPlaced(
                    addressType = SharedPrefManager.getInstance().addressType,
                    appliedCouponName =  if (SharedPrefManager.getInstance().couponModel != null) SharedPrefManager.getInstance().couponModel.promoCode else null,
                    clickedOnPage = "psp",
                    codOrdervalueDifference = addMoreForCod,
                    couponApplied = SharedPrefManager.getInstance().couponModel != null,
                    couponDiscountAmount = if(cartBillDetails.value?.mxCouponAppliedAmount != null) cartBillDetails.value?.mxCouponAppliedAmount else null
                    /*if(SharedPrefManager.getInstance().couponModel != null) SharedPrefManager.getInstance().couponModel.discountValue.toDouble() else null*/,
                    crossSellingTraysUsed = removeDuplicates(trayDetails).toString(),
                    deliveryChargeAmount = billDetails.deliveryChargesValue,
                    deliveryDays = deliveryDays,/*getDeliveryDateDaysDifference(*//*)*///todo testing
                    discountAmount = billDetails.discountValue,
                    discountVariantId = SharedPrefManager.getInstance().algoSpecificVariantId,
                    estimatedPayableAmount = billDetails.estimatedPayableValue,
                    experimentList = expList.toString(),
                    gender = patientGender ?: "",
                    isChronic = isChronicAdded ?: false,
                    isCodDefaulter = ((paymentRestrictedType) ?: 0) > 0,
                    isCrossSellingItemPresent = isAddedCrossSelling,
                    isGeneric = isGenericAdded,
                    isOtc = isOtcAdded ?: false,
                    isReorder = isReorder/*SharedPrefManager.getInstance().isReOrder*/,
                    isTmContactSaved = isTmContactSaved,
                    itemNames = jArrOrgName,
                    mrp = billDetails.mrpValue,
                    noOfItem = cartCount,
                    orderId = SharedPrefManager.getInstance().incompleteOrderId.toString(),
                    outOfStockNo = totalOutOfStockCount,
                    packagingChargeAmount = billDetails.taxesAndChargesValue,
                    patientAge = patientAge.ifEmpty { "0.0" }.toInt(),
                    patientType = if(patientType.equals("OTHER", true)) "someone_else" else patientType,
                    paymentMethod = if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == 16) "Online" else "COD",
                    prescriptionUploadedCount = SharedPrefManager.getInstance().prescriptionCount,
                    productsIds = if (jArrOrgIds.isNullOrEmpty()) null else jArrOrgIds,
                    rxRequired = isRxRequired,
                    salesPrice = billDetails.sellingPrice,
                    shippingCity = SharedPrefManager.getInstance().selectedCity,
                    shippingPincode = SharedPrefManager.getInstance().pincode,
                    shippingState = SharedPrefManager.getInstance().selectedState,
                    /*placeOrderSubsIdValue*/
                    subsId = if(addedItemNames.size==0) null else if(localDbUseCase.getSubsIdOfOrder() > 0) localDbUseCase.getSubsIdOfOrder().toString() else null,
                    tmCreditAmount = billDetails.tmCreditValue,
                    tmRewardAmount = billDetails.tmRewardValue,
                    whId = SharedPrefManager.getInstance().selectedWarehouseID,
                    cxAcceptedSubsCount = SharedPrefManager.getInstance().cxAcceptedCount,
                    previousStage = if (isReorder && !orderPreviousStage.isNullOrEmpty()) orderPreviousStage else null,
                    pageSection = if (orderPageSection == "null") "main" else orderPageSection ?: "main",
                    urgencyTimeRemaining = if (SharedPrefManager.getInstance().isFtc) SharedPrefManager.getInstance().ftcCouponExpiryTime else BundleConstants.MX_FTC_COUNTDOWN_TIME_IN_SEC,
                    reorderCrossSelling = isAddedCrossSelling,
                    reorderType = if (SharedPrefManager.getInstance().isReOrder) "full" else null,
                    reorderPatientName = SharedPrefManager.getInstance().patientName,
                    cashHandlingCharge = if(billDetailsResponse?.pspViewed == true) billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null,
                    cashHandlingChargeApplicable = if(billDetailsResponse?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse) else null
                )
            )
        } catch (_: Exception) {
        }
    }

    fun sendViewBillClickedEvent(mxViewBillClicked: MxViewBillClicked) {
        sdkEventUseCase.sendViewBillClickedEvent(mxViewBillClicked)
    }

    fun sendPaymentPageVisitedEventToMixpanel(
        clickedOnPage: String?,
        pageSection: String?,
    ) =
        try {
            sdkEventUseCase.sendPaymentPageVisitedEvent(MxPaymentPageVisited().also {
                it.clickedOnPage = clickedOnPage
                it.currentOrderStatus = currentOrderStatus
                it.discountAmount = billDetails.discountValue
                it.estimatedPayableAmount = billDetails.estimatedPayableValue.toString()
                it.isReorder = isReorder
                it.mrpTotalAmount = billDetails.mrpValue
                it.orderId = orderId.toString()
                it.packagingChargeAmount = billDetails.deliveryChargesValue
                it.pageSection = pageSection
                it.paymentMode = lastPaymentMethodSelectedMutableLiveData.value
                it.salesPrice = ((billDetails.mrpValue
                    ?: 0.0)) - (if (billDetails.discountValue == null) 0.0 else billDetails.discountValue)!!
                it.tmCreditAmount = billDetails.tmCreditValue
                it.tmRewardAmount = billDetails.tmRewardValue
                it.couponDiscountAmount = billDetails.couponDiscountAmt
                it.deliveryChargeAmount = billDetails.deliveryChargesValue
                it.whId = SharedPrefManager.getInstance().selectedWarehouseID
                it.cashHandlingCharge = if(billDetails.pspViewed) billDetails.cashHandlingInfoModel?.charge ?: 0.0 else null
                it.cashHandlingChargeApplicable = if(billDetails.pspViewed) CommonFunc.getApplicableCashHandlingCharger(billDetails) else null
            })
        } catch (_: Exception) {

        }
    
    
    /*private suspend fun sendItemOrderPlacedToMixPanel(
        array: JSONArray?,
        list: List<MxItemAppOrderPlaced>?
    ) {
        try {
            if (array == null) return
        
        
            val finalList: MutableList<MxItemAppOrderPlaced> = mutableListOf()
            if (array != null) {
                var item = MxItemAppOrderPlaced()
                for (j in 0 until array!!.length()) {
                    val itemPlaced =
                        localDbUseCase.getItemAddedAttributes(array.getString(j) ?: "")
                    val itemDetails = getProductInfoDetails(list, array.getString(j) ?: "")
                    if (itemPlaced != null) {
                        item.clickedOnPage = itemPlaced.clickedPage
                        item.sectionHeading = itemPlaced.sectionHeading
                        item.pageSection = itemPlaced.pageSection
                    
                        if (item.clickedOnPage != null && item.clickedOnPage == "search_result") {
                            item.sectionIndex = "0"
                        } else {
                            item.sectionIndex = (itemPlaced.sectionIndex + 1).toString()
                        }
                    
                    
                        if (itemDetails != null) {
                            item.isReorder = SharedPrefManager.getInstance().isReOrder
                            item.isSubstitute = itemDetails.product.cxAcceptedSubs
                            item.itemIsOtc = itemDetails.product.isOtc
                            item.orderId = SharedPrefManager.getInstance().incompleteOrderId
                            item.productBrandName = itemDetails.product.manufacturerName
                            item.productDrugType = itemDetails.product.drugType
                            item.productId = itemDetails.product.productCode
                            item.productManufacturer = itemDetails.product.manufacturerName
                            item.productMrp = itemDetails.product.mrp
                            item.productName = itemDetails.product.skuName
                            item.productPack = itemDetails.product.packSize
                            item.productQtySold = itemDetails.product.qty
                            item.productSalePrice = itemDetails.product.sellingPrice
                            item.productSalt = itemDetails.product.composition
                            *//**
                             * 61 - Medicine has subs and cx opted for subs
                             * 62 - Medicine has subs and cx opted for org
                             * 211 -
                             * **//*
                            item.subsId = if (itemDetails.product.cxAcceptedSubs) {
                                61
                            } else if (itemDetails.suggestion != null && !itemDetails.product.cxAcceptedSubs) {
                                62
                            } else {
                                211
                            }
                            item.productDiscountPercentage = if (itemDetails.product.cxAcceptedSubs) itemDetails.product.subsSavingPercentage?.replace("%", "") else itemDetails.product.discount.toString()
                        }
                    
                    }
                    finalList.add(item)
                }
            }
            for (item in finalList) {
                sdkEventUseCase.sendItemAppOrderPlacedEvent(item)
            }
        
        } catch (ex: java.lang.Exception) {
            ex.printStackTrace()
        }
    }
*/
    fun sendEventChangeToCod(){
        sdkEventUseCase.sendEventChangeToCod(MxChangeToCodClicked(
             clickedOnPage="psp",
             couponDiscountAmount=cartBillDetails.value?.mxCouponAppliedAmount,
             deliveryChargeAmount=cartBillDetails.value?.deliveryChargesValue,
             discountAmount=cartBillDetails.value?.discountValue,
             estimatedPayableAmount=cartBillDetails.value?.estimatedPayableValue,
             mrpTotalAmount=cartBillDetails.value?.mrpValue,
             orderid= orderId.toString(),
             packagingChargeAmount=cartBillDetails.value?.taxesAndChargesValue,
             tmCreditAmount=cartBillDetails.value?.tmCreditValue,
             tmRewardAmount= cartBillDetails.value?.tmRewardValue,
             cashHandlingCharge = if(billDetails.pspViewed)cartBillDetails.value?.cashHandlingInfoModel?.charge else null,
             cashHandlingChargeApplicable = if(billDetails.pspViewed)CommonFunc.getApplicableCashHandlingCharger(cartBillDetails?.value) else null
        ))
    }

    fun getCustomerOrderDetails(
        orderId: Long,
        customerId: String,
        initialLoad: Boolean,
        className: String,
        callFetchMeds: Boolean
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = async { orderFlowUseCase.getOrderDetails(mxInternalErrorOccurred,orderId, customerId) }.await()
            response?.let {
                it.responseData?.reorder?.let { isReorder }
                deliveryDays = it.responseData?.deliveryDays
                placeOrderSubsIdValue = it.responseData?.subsId.toString()?:""
isChronicAdded = it.responseData?.chronic
                isOtcAdded = it.responseData?.otc
                isGenericAdded = it.responseData?.isGeneric ?: false

            }
        }
    }


    fun removeDuplicates(listWithDuplicates: List<String>?): List<String>? {
        val uniqueSet: Set<String> = HashSet(listWithDuplicates)
        return java.util.ArrayList(uniqueSet)
    }

    /*fun getDeliveryDateDaysDifference(delDate: String): Int {
        return try {
            var strFromDate = delDate
            val fromDateArray = delDate.split(" ".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()
            val myFormat = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
            try {
                strFromDate = fromDateArray[0] + " " + fromDateArray[1] + " " + fromDateArray[2]
            } catch (ignore: java.lang.Exception) {
            }
            try {
                val date = Date()
                val date1String = myFormat.format(date)
                val date1 = myFormat.parse(date1String)
                val date2 = myFormat.parse(strFromDate)
                val diff = date2.time - date1.time
                TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS).toInt()
            } catch (e: java.lang.Exception) {
                e.printStackTrace()
                0
            }
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
            0
        }
    }*/
    private fun convertToBillDetails(
        billModel: BillDetailResponse.ResponseData,
        strikePackagingCharge: Double
    ): BillDetailsModel = BillDetailsModel(
        billDetailsTitle = "",
        savedOrderMessage =  "",
        savedOrderPrice = "",
        mrpValue = billModel.mrp,
        discountValue = /*if ((billModel.discount ?: 0.0) > 0.0) (billModel.discount ?: 0.0) * -1 else*/ billModel.discount,
        couponName = billModel.couponCode,
        couponValue = billModel.couponDiscountAmt,
        taxesAndChargesValue = billModel.packagingCharge,
        deliveryChargesValue = billModel.deliveryCharge,
        waiveOffDeliveryCharge = billModel.waiveOffDeliveryCharge,
        tmCreditValue = /*if ((billModel.tmCredit ?: 0.0) > 0.0) (billModel.tmCredit ?: 0.0) * -1 else*/ billModel.tmCredit,
        tmRewardValue = /*if ((billModel.tmCash ?: 0.0) > 0.0) (billModel.tmCash ?: 0.0) * -1 else*/ billModel.tmCash,
        isTypePharmacistPaymentOn = false,
        isTypePharmacistPaymentOff = false,
        estimatedPayableValue = billModel.payableAmt,
        paymentModeValue = SharedPrefManager.getInstance().selectedPaymentMethod,
        isTooltipForDeliveryCharges = !billModel.deliveryChargeTooltipMessage.isNullOrEmpty(),
        //tooltipDeliveryChargeValue = "Add items worth ₹" + billModel.addMoreForFreeDelivery + " more to get free delivery",
        tooltipDeliveryChargeValue = billModel.deliveryChargeTooltipMessage,
        tooltipEstimatedPayableValue = context.getString(R.string.tooltip_estimated_payable_message),
        isTooltipForEstimatedPayable = true,
        isTooltipForTaxesCharges = billModel.packagingCharge!! > 0,
        tooltipTaxesChargesHeaderLeft = context.getString(R.string.gst),
        tooltipTaxesChargesBodyLeft =context.getString(R.string.seller_packaging_charges),
        tooltipTaxesChargesBodyRight = "₹" + formatDecimal(billModel.packagingCharge!!),
        tooltipTaxesChargesBodyRightStroked = "₹${formatDecimal(strikePackagingCharge)}",
        tooltipTaxesChargesHeaderRight = "Included in MRP",
        isFreeDelivery = (billModel.deliveryCharge == 0.0),
        deliveryChargeMessage = billModel.deliveryChargeMessage,
        sellingPrice = billModel.sellingPrice,
        mxCouponAppliedAmount = billModel.couponAppliedAmt ?: 0.0,
        cashHandlingInfoModel = billModel.cashHandlingInfo,
        cashHandlingApplicableInfoModel= billModel.cashHandlingApplicableInfo,
        footerList = footerList
    )

    private fun convertToCalculateBillDetailModel(calculateBillDetail: BillDetailResponse?) {
        billData = calculateBillDetail?.responseData?.let { it1 ->
            var strikePackagingCharge = 0.0
            it1.packagingCharge?.let {
                strikePackagingCharge = 3 * it
            }
            convertToBillDetails(
                it1,
                strikePackagingCharge
              /*  "",
                totalPayable = calculateBillDetail.responseData.payableAmt.toString(),
                gst = context.getString(R.string.gst),
                sellerPackagingCharge = context.getString(R.string.seller_packaging_charges),
                "₹" + calculateBillDetail.responseData.savingValue.toString(),
                "You saved ₹${it1.savingValue} on your order!",
                0.0,
                ClassNameConstants.PAYMENT_OPTION_ACTIVITY*/
            )
        }
//        openBillDetailsBsMutableLiveData.value = Event(billData)
    }
}