package com.intellihealth.truemeds.presentation.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.CartModel
import com.intellihealth.salt.models.FooterBillItem
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxApplyCouponClick
import com.intellihealth.truemeds.data.model.mixpanel.MxCouponRemoved
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxPaymentPendingViewed
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ItemAddedEventAttributes
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.removeExtraZeros
import com.intellihealth.truemeds.domain.usecase.CouponUseCase
import com.intellihealth.truemeds.domain.usecase.LocalDbUseCase
import com.intellihealth.truemeds.domain.usecase.OrderFlowUseCase
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFSubsItemAdded
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAppOrderPlaced
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemImpression
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc.formatMillisInTime
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.utils.roundOffDecimal
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import org.json.JSONArray
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import kotlin.math.min

@HiltViewModel
open class BaseViewModel @Inject constructor() : ViewModel() {
    private var timerJob: Job? = null
    val openErrorDialog = MutableLiveData<Event<Any>>()
    val eventOpenErrorDialog: LiveData<Event<Any>> get() = openErrorDialog

    val sendFtcCounterStarted = MutableLiveData<Long>(0L)
    val eventSendFtcCounterStarted: LiveData<Long> get() = sendFtcCounterStarted

    private val _reloadDataAfterDelete = MutableLiveData("")
    val reloadDataAfterDelete: LiveData<String> get() = _reloadDataAfterDelete

    private val _showApiCallLoader = MutableLiveData(false)
    val showApiCallLoader: LiveData<Boolean> get() = _showApiCallLoader

    private val showCustomToast = MutableLiveData<Event<Any>>()
    val eventShowToast: LiveData<Event<Any>> get() = showCustomToast

    val showInternalServerError = MutableLiveData("")
    val eventShowInternalServerError: LiveData<String> get() = showInternalServerError
    var cartMedicineListResponse = listOf<ProductInfoModel>()

    val launchOrderSummary = MutableLiveData<Event<Any>>()
    val eventLaunchOrderSummary: LiveData<Event<Any>> get() = launchOrderSummary


    val launchPrescription = MutableLiveData<Event<Any>>()
    val eventLaunchPrescription: LiveData<Event<Any>> get() = launchPrescription

    val launchSearch = MutableLiveData<Event<Any>>()
    val eventLaunchSearch: LiveData<Event<Any>> get() = launchSearch

    val couponTimer = MutableLiveData<String>()
    private var isCouponTimerRunning = false

    //=============== Cart ===========
    private var _cartItemCount = MutableLiveData(0)
    val cartItemCount: LiveData<Int> get() = _cartItemCount
    private var _cartSellingPrice = MutableLiveData(0.0)
    private var _cartTotalMrp = MutableLiveData(0.0)
    private var _cartTotalMedDiscount = MutableLiveData(0.0)
    var _medicineTotalSellingPrice = MutableLiveData(0.0)

    val cartSellingPrice: LiveData<Double> get() = _cartSellingPrice
    val cartTotalMrp: LiveData<Double> get() = _cartTotalMrp
    val cartTotalMedDiscount: LiveData<Double> get() = _cartTotalMedDiscount
    val medicineTotalSellingPrice: LiveData<Double> get() = _medicineTotalSellingPrice

    private val _cartModel = MutableLiveData(CartModel("View cart", 0, 0.0))
    val cartModel: LiveData<CartModel?> = _cartModel
    var customerName = MutableLiveData("")
    var customerEmail = MutableLiveData("")
    var customerMobile = MutableLiveData("")
    var userSaved = MutableLiveData("")
    var anyOrderTab = MutableLiveData(false)
    lateinit var customerDetail: CustomerDetails
    var loaderValue = MutableLiveData(false)

    @Inject
    protected lateinit var localDbUseCase: LocalDbUseCase

    @Inject
    protected lateinit var orderFlowUseCase: OrderFlowUseCase

    @Inject
    protected lateinit var couponUseCase: CouponUseCase

    @Inject
    protected lateinit var sdkEventUseCase: SdkEventUseCase

    //view cart
    var fromSummary = false
    val finishActivity = MutableLiveData<Event<Any>>()
    val eventFinishActivity: LiveData<Event<Any>> get() = finishActivity

    val openPrescriptionActivity = MutableLiveData<Event<Any>>()
    val eventOpenPrescriptionActivity: LiveData<Event<Any>> get() = openPrescriptionActivity

    val openOrderSummaryActivity = MutableLiveData<Event<Any>>()
    val eventOpenOrderSummaryActivity: LiveData<Event<Any>> get() = openOrderSummaryActivity

    val openCartActivity = MutableLiveData<Event<Any>>()
    val eventOpenCartActivity: LiveData<Event<Any>> get() = openCartActivity

    val initiateLogin = MutableLiveData<Event<Any>>()
    val eventInitiateLogin: LiveData<Event<Any>> get() = initiateLogin

    val openWalletActivity = MutableLiveData<Event<Any>>()
    val eventOpenWalletActivity: LiveData<Event<Any>> get() = openWalletActivity

    var stepperMessage: MutableLiveData<Event<String>> = MutableLiveData()
    val showBaseMessage = MutableLiveData<Event<MESSAGES>>()
    val eventBaseMessage: LiveData<Event<MESSAGES>> get() = showBaseMessage

    private val closeReorderBottomSheet = MutableLiveData<Event<Any>>()
    val eventCloseReorderBottomSheet: LiveData<Event<Any>> get() = closeReorderBottomSheet

    val footerList = arrayListOf<FooterBillItem>()

    companion object {
        var hasCouponTimerStopped = false
    }
    var mrpEventValueFromBaseVM: Double = 0.0
    var salesPriceEventValueFromBaseVM: Double = 0.0

    /**
     * This will start count down timer for coupon
     */
    fun startTimer(prefixText: String, endTimestamp: Long = 0L, notify: (String) -> Unit) {
        if (isCouponTimerRunning) stopCouponTimer()
        /** If received past time in `endTimestamp` this will not emit anything */
        Log.i("endTimestamp", "" + endTimestamp)
        var timestamp = endTimestamp
        //var currentTimeStamp = SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
        if (timestamp > 0L) {
            SharedPrefManager.getInstance().ftcCouponExpiryTime = timestamp
            //currentTimeStamp = timestamp
        } else {
            timestamp = SharedPrefManager.getInstance().ftcCouponExpiryTime
            //timestamp = SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
        }

        timerJob = CoroutineScope(IO).launch {
            if (!isCouponTimerRunning && timestamp > 0) {
                val currentTime = System.currentTimeMillis()
                val difference = timestamp - currentTime
                emitCouponTimer(difference).collect { time ->
                    isCouponTimerRunning = true
                    notify("$prefixText ${(time).formatMillisInTime()}")
                }
            }
        }
        /***
         *  setting MixPanel SDK event for urgency_timer_started
         */
        if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.showFtcCounter == true && timestamp > 0) {

            sendFtcCounterStarted.postValue(timestamp)
//            try {
//                if (::sdkEventUseCase.isInitialized) {
//                    val mxUrgencyTimerStarted = MxUrgencyTimerStarted(
//                        DateUtils.convertMillisToSeconds(DateUtils.convertEpochTimeStampToDateMillis(timestamp, System.currentTimeMillis())))
//                    sdkEventUseCase.sendFtcTimerStartedEvent(mxUrgencyTimerStarted)
//                }
//            } catch (e: java.lang.Exception) {
//                e.printStackTrace()
//            }
        }
    }

    /**
     * This will emit remaining time for a coupon
     */
    private fun emitCouponTimer(
        timestamp: Long,
        delayInSeconds: Long = 1_000L,
    ) = flow {
        var count = timestamp
        while (count >= 0L) {
            /** `count >= 0L` this condition is used, because it should not accept past time  */
            emit(count--)
            count -= 1000
            delay(delayInSeconds)
        }
    }

    /**
     * Invoke this to Stop coupon timer
     */
    fun stopCouponTimer() {
        timerJob?.cancel()
        SharedPrefManager.getInstance().isFtcCouponTimerMixpanelEventCalled = false
        isCouponTimerRunning = false
        hasCouponTimerStopped = true
        couponTimer.postValue("")

    }

    fun addToCart(
        productModel: ProductInfoModel,
        isSubs: Boolean,
        qty: Int,
        itemAdded: MxItemAdded?,
        suggestionTermClickedPosition: Int = 0,
        suggestion_term_clicked: String? = null,
        term_searched: String? = null,
        clicked_suggestion_type: String? = null
        //isCrossSelling: Boolean
    ) {
        viewModelScope.launch(IO) {
            if (qty == 1) {
                val cartItem: CartMedicine
                var orgSubsInfo: OrgSubsInfo? = null

                if (isSubs) {
                    cartItem = productModel.suggestionAsCartItem(false, 1)
                    orgSubsInfo = productModel.getOrgSubsInfo(false, 1)
//                    if (isCrossSelling) localDbUseCase.insertCrossSellingProduct(cartItem.medicineId)
                } else {
                    cartItem = productModel.productAsCartItem(false, 1)
//                    if (isCrossSelling) localDbUseCase.insertCrossSellingProduct(cartItem.medicineId)
                }
                //add item to cart
                localDbUseCase.addToCart(cartItem, orgSubsInfo, isSubs)
                //add selling price mapping
                localDbUseCase.insertCartSellingPrice(
                    CartItemSellingPrice(
                        if (isSubs) productModel.suggestion?.productCode!! else productModel.product.productCode,
                        if (isSubs) productModel.suggestion?.sellingPrice!! else productModel.product.sellingPrice // (productModel.product.qty ?: 1)
                    )
                )

                localDbUseCase.deleteItemAddedAttributesUsingProductCode(cartItem.medicineId)
                localDbUseCase.insertItemAddedAttributes(
                    ItemAddedEventAttributes(
                        null,
                        cartItem.medicineId,
                        itemAdded?.clickedOnPage ?: "",
                        itemAdded?.pageSection ?: "",
                        itemAdded?.sectionHeading ?: "",
                        itemAdded?.resultPosition ?: 0
                    )
                )
                
                

                /**
                 * ItemAdded only null when customer cart is synced via Home page after Login
                 * In rest other cases it will never be null
                 * Hence, the event will be triggered on each addition
                 * **/
                if (itemAdded != null) {
                    itemAdded.freeDeliveryRequiredAmount = 0.0
                    sendItemAddedEvent(productModel, null, null, itemAdded, isSubs,
                        suggestionTermClickedPosition = suggestionTermClickedPosition,
                        suggestionTermClicked = suggestion_term_clicked,
                        termSearched = term_searched,
                        clickedSuggestionType = clicked_suggestion_type)
                }
                if (isSubs) {
                    
                    val clickedPage = if (itemAdded?.clickedOnPage.isNullOrEmpty()) {
                        null
                    } else {
                        if (itemAdded?.clickedOnPage == "search_result") {
                            "search"
                        } else {
                            itemAdded?.clickedOnPage
                        }
                    }
                    sendSubstituteItemAddedEvent(
                        // AFSubsItemAdded(product_name = productModel.product.skuName, product_mrp = productModel.product.mrp , is_chronic = productModel.product.isChronic, product_sale_price = productModel.product.sellingPrice, is_otc = productModel.product.isOtc, clicked_on_page = itemAdded?.clickedOnPage ?:"" )
                        AFSubsItemAdded(
                            product_name = productModel.suggestion?.skuName,
                            product_mrp = productModel.suggestion?.mrp,
                            is_chronic = productModel.product.isChronic,
                            product_sale_price = productModel.suggestion?.sellingPrice,
                            is_otc = productModel.product.isOtc,
                            clicked_on_page = clickedPage
                        )
                    )
                }
                //update orgAvailable as true
                localDbUseCase.updateOrgAvailable(cartItem.medicineId, cartItem.orgAvailable)
            }
            setCartCount()
        }
    }

    fun updateQuantity(
        productModel: ProductInfoModel,
        qty: Int,
        isSubs: Boolean = false
    ) {
        viewModelScope.launch(IO) {
            localDbUseCase.updateMedicineQuantity(
                if (isSubs) productModel.suggestion?.productCode
                    ?: "" else productModel.product.productCode,
                qty
            )
            setCartCount()
        }
    }

    fun removeItemFromCart(
        productModel: ProductInfoModel,
        isSubs: Boolean,
        featureName: String = ""
    ): Boolean {
        var success = false
        viewModelScope.launch(IO) {
            var shouldDeleteFromOffline = false
            var productDetailsId =
                localDbUseCase.getProductDetailsId(productModel.product.productCode)
            shouldDeleteFromOffline =
                if (productDetailsId > 0 && SharedPrefManager.getInstance().incompleteOrderId > 0) {
                    _showApiCallLoader.postValue(true)
                    orderFlowUseCase.editMedicine(
                        MxInternalErrorOccurred(),
                        SharedPrefManager.getInstance().incompleteOrderId,
                        localDbUseCase.getCartMedicineDtoFromProductCode(
                            cartMedicineListResponse,
                            productModel.product.productCode,
                            0
                        )
                    )
                    true
                } else {
                    true
                }

            _showApiCallLoader.postValue(false)
            if (shouldDeleteFromOffline)
                localDbUseCase.removeItemFromCart(
                    if (isSubs) productModel.suggestion?.productCode
                        ?: "" else productModel.product.productCode, isSubs
                )

            success = true
            _reloadDataAfterDelete.postValue(featureName)
            setCartCount()
        }
        return success
    }

    fun setCartCount() {
        viewModelScope.launch(IO) {
            val cartCount = localDbUseCase.getCartCount()
            val cartTotalSellingPrice = localDbUseCase.getCartTotalSellingPrice()
            val cartTotalMrp = localDbUseCase.getCartTotalMrpPrice()
            val cartMedicineDiscount = roundOffDecimal(cartTotalMrp - cartTotalSellingPrice)


            try {
                var paymentType = "16"
                with(SharedPrefManager.getInstance()) {
                    if (couponModel != null) {
                        paymentType =
                            if (couponModel.applicableOn != null && couponModel.applicableOn?.contains(
                                    "Online"
                                ) == true
                            ) "16"
                            else if (couponModel.applicableOn?.contains("Offline") == true) "17"
                            else "16"

                        //if (!((SharedPrefManager.getInstance().prescriptionCount > 0) && couponModel.minCartValue == 0.0)) {
                        if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                            if (!((SharedPrefManager.getInstance().prescriptionCount > 0) && cartCount == 0)) {
                                if (cartTotalSellingPrice < (couponModel.minCartValue ?: 0) ) {

                                    couponUseCase.applyAndRemoveCouponCode(
                                        MxInternalErrorOccurred(), incompleteOrderId,
                                        paymentType,
                                        "0"
                                    )?.let { couponData ->
                                        if (couponData.message.equals(
                                                BundleConstants.COUPON_REMOVED,
                                                true
                                            )
                                        ) {
                                            SharedPrefManager.getInstance().couponModel = null
                                            SharedPrefManager.getInstance().offerId = "0"
                                            setFtcVariantCCouponExpiryTimeRestart(0)
                                            Log.d("Intent", "onCreate: setParameter call 8888:::"+SharedPrefManager.getInstance().couponDiscount.toDouble())

                                            SharedPrefManager.getInstance().setCouponDiscount(0f)
                                            showBaseMessage.postValue(Event(MESSAGES.REMOVED_COUPON_SUCCESSFULLY))
                                        }
                                    }
                                }
                            }
                        } else {
                            if (cartTotalSellingPrice < (couponModel.minCartValue ?: 0)) {
                                SharedPrefManager.getInstance().couponModel?.let {
                                    SharedPrefManager.getInstance().couponModel = null
                                    SharedPrefManager.getInstance().offerId = "0"
                                    Log.d("Intent", "onCreate: setParameter call 9999:::"+SharedPrefManager.getInstance().couponDiscount.toDouble())

                                    SharedPrefManager.getInstance().setCouponDiscount(0f)
                                    setFtcVariantCCouponExpiryTimeRestart(0)
                                    showBaseMessage.postValue(Event(MESSAGES.REMOVED_COUPON_SUCCESSFULLY))

                                }
                            }
                        }
                    }
                }
            } catch (e: Exception) {
                println(e)
            }


            val map = SharedPrefManager.getInstance().currentOrderAmountDetails
            var tmAccountCredit = SharedPrefManager.getInstance().accountTmCredit
            val tmCash = (map[SharedPrefManager.PREF_CURRENT_ORDER_TM_CASH] ?: 0.0).toFloat()
            val tmCredit = (map[SharedPrefManager.PREF_CURRENT_ORDER_TM_CREDIT] ?: 0.0).toFloat()
            val tmDelivery =
                (map[SharedPrefManager.PREF_CURRENT_ORDER_DELIVERY_CHARGE] ?: 0.0).toFloat()
            val tmPackaging =
                (map[SharedPrefManager.PREF_CURRENT_ORDER_PACKAGE_CHARGE] ?: 0.0).toFloat()
            val tmCoupon =
                (map[SharedPrefManager.PREF_CURRENT_ORDER_COUPON_CHARGE] ?: 0.0).toFloat()

            val finalAmount =
                (map[SharedPrefManager.PREF_API_FINAL_CALC_PAYABLE] ?: 0.0).toFloat()

            var total =
                cartTotalSellingPrice + tmPackaging + tmDelivery - tmCoupon - tmCredit - tmCash

            //new logic added for offline tmCredit amount apply
            if(SharedPrefManager.getInstance().incompleteOrderId<=0)
            {
                total = total - min(tmAccountCredit.toDouble(), total)
            }



            if (total <= 0.20) {
                total = finalAmount.toDouble()
            }

            if (total < 0.0) {
                total = 0.0
            }

            _cartItemCount.postValue(cartCount)
            _cartSellingPrice.postValue(removeExtraZeros(total))
            _cartTotalMrp.postValue(removeExtraZeros(cartTotalMrp))
            _cartTotalMedDiscount.postValue(removeExtraZeros(cartMedicineDiscount))
            _medicineTotalSellingPrice.postValue(removeExtraZeros(cartTotalSellingPrice))


            _cartModel.postValue(CartModel("View cart", cartCount, total))//cartTotalSellingPrice
        }

    }

    /**
     * 1) If user access token and user id is not null in shared preference then go to cart else show login bottomsheet else follow below steps
     * 2) If isReOrder is true in shared preference, then redirect to order summary page else redirect to cart page
     * 3) If Search page is opened from cart or order summary page, then on finish search page activity
     * and handle added products data update in Cart and OrderSummary page onResume section. This need to be done to avoid multiple stack of SearchActivity
     */
    fun onViewCartClicked(pageSection: String) {
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isEmpty()) {
            /**
             * Initialize Login
             * If TrueCaller bottomsheet can't be shown(this is returned by TrueCaller SDK), then open OTP based login bottomsheet
             */
            initiateLogin.value = Event(pageSection)

        } else {
            if (SharedPrefManager.getInstance().isReOrder && SharedPrefManager.getInstance().incompleteOrderId > 0) {
                if(_cartItemCount.value!! > 0 || SharedPrefManager.getInstance().prescriptionCount > 0) {
                    openOrderSummaryActivity.value = Event(Any())
                } else {
                    openCartActivity.value = Event(Any())
                }
            } else {
                if (_cartItemCount.value!! > 0) {
                    openCartActivity.value = Event(Any())
                } else if (_cartItemCount.value!! == 0 && SharedPrefManager.getInstance().prescriptionCount > 0
                    && SharedPrefManager.getInstance().patientId > 0 && SharedPrefManager.getInstance().addressId > 0
                ) {
                    openOrderSummaryActivity.value = Event(Any())
                } else if (_cartItemCount.value!! == 0 && SharedPrefManager.getInstance().prescriptionCount > 0) {
                    openPrescriptionActivity.value = Event(Any())
                } else {
                    openCartActivity.value = Event(Any())
                }
            }
            if (fromSummary) {
                finishActivity.value = Event(Any())
            }
            sdkEventUseCase.searchViewCart(
                FirebaseEventModel(
                    pageName = "Search",
                    mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                    customerId = SharedPrefManager.getInstance().loggedInUserId
                )
            )
        }
    }

    fun onWalletClicked() {
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isEmpty()) {
            /**
             * Initialize Login
             * If TrueCaller bottomsheet can't be shown(this is returned by TrueCaller SDK), then open OTP based login bottomsheet
             */

            initiateLogin.value = Event("toolbar_wallet")
        } else {
            openWalletActivity.value = Event(Any())
        }
    }

    fun showStepperMessageToast(msg: String) {
        if (msg.isNotEmpty())
            stepperMessage.postValue(Event(msg))
    }

    fun getUserData() {
        viewModelScope.launch(IO) {
            if (SharedPrefManager.getInstance().loggedInUserMobile.isNotEmpty()) {
                localDbUseCase.getCustomerDetails(SharedPrefManager.getInstance().loggedInUserMobile)
                    ?.let {
                        customerDetail = it
                        if (::customerDetail.isInitialized) {
                            if (customerDetail.customerName != null) {
                                customerName.postValue(customerDetail.customerName)
                            }
                            if (customerDetail.emailAddress != null) {
                                customerEmail.postValue(customerDetail.emailAddress)
                            }
                            if(!SharedPrefManager.getInstance().loggedInUserEmail.isNullOrEmpty()){
                                customerEmail.postValue(SharedPrefManager.getInstance().loggedInUserEmail)
                            }
                            if (customerDetail.mobileNo != null) {
                                customerMobile.postValue(customerDetail.mobileNo)
                            }

                        }
                    }

                if (!SharedPrefManager.getInstance().totalSavingTillDate.isNullOrEmpty() && SharedPrefManager.getInstance().totalSavingTillDate.toDouble() > 0.0) {
                    anyOrderTab.postValue(true)
                    userSaved.postValue("You have saved " + SharedPrefManager.getInstance().totalSavingTillDate)
                }
            }
        }
    }


    /***
     * This method will add only SUBS medicine mapping to orgSubsInfo table
     * **/
    suspend fun addSubsMedicineToDB(list: List<ProductInfoModel>) =
        viewModelScope.launch(IO) {
            for (item in list) {

                if (item.product.cxAcceptedSubs && item.product.switchBackProductCode != null) {
                    val count =
                        async { localDbUseCase.getAddedQtyOfAddedMedicine(item.product.productCode) }.await()
                    if (count == 0) {
                        /**
                         * This block will add SUBS medicine to addedCart items if in case it is not added to DB
                         * **/
                        val orgMedIndex = getOrgMedicineIndexFromCartList(
                            list,
                            item.product.switchBackProductCode!!
                        )
                        if (orgMedIndex != -1) {
                            //ORG-SUBS both added in cart create mapping
                            /**
                             * This block is executed when we found ORG med details in API response
                             * **/
                            val orgMedicine = list[orgMedIndex]
                            localDbUseCase.addToCart(
                                item.productAsCartItem(false, item.product.qty ?: 1),
                                orgMedicine.getOrgSubsInfo(false, 1),
                                true
                            )
                        } else {
                            //ORG not added in cart
                            /**
                             * This block is executed if ORG med details are not present in API response i.e USer only added SUBS
                             * **/
                            var orgSubsInfo = OrgSubsInfo(
                                id = null,
                                medicineId = item.product.switchBackProductCode!!,
                                medicineName = item.product.switchBackSkuName,
                                companyName = item.product.manufacturerName,
                                discount = item.product.discount,
                                mrp = item.product.mrp,
                                addedQty = 1,
                                composition = item.product.composition,
                                subsDiscountPercentage = item.product.subsSavingPercentage,
                                subsSellingPrice = item.product.sellingPrice,
                                subsFound = item.product.subsFound,
                                fromApi = false,
                                subsMedProductCode = item.product.productCode,
                                subsMrp = item.product.mrp,
                                subsMedName = item.product.skuName,
                                subCompanyName = item.product.skuName,
                                drugType = item.product.drugType,
                                originalPackSize = 10.0,
                                substitutePackSize = (item.product.packSize?.toDouble()) ?: 10.0,
                                rxRequired = false,
                                maxCapped = 20,
                                subsRecommendedQty = item.product.qty ?: 1,
                                originalCountryNm = "IN",
                                subsCountryNm = "IN",
                                subsUnit = item.product.unit,
                                originalUnit = item.product.unit,
                                productImageUrls = item.product.switchBackImageUrl,
                                originalCompanyAddress = item.product.manufacturerAddr,
                                orgAvailable = true,
                                coldStorage = true
                            )

                            /* item.suggestion = item.product
                             var subsMed = item.suggestionAsCartItem(false, 1)
 
                             subsMed.medicineId = item.product.switchBackProductCode
                             subsMed.medicineName = item.product.switchBackSkuName*/

                            localDbUseCase.addToCart(
                                item.productAsCartItem(false, item.product.qty ?: 1),
                                orgSubsInfo,
                                true
                            )
                        }
                    } else {

                        /**
                         * If SUBS medicine is already added to cart then proceed further and add ORG mapping in DB
                         * **/
                        val orgMedIndex = getOrgMedicineIndexFromCartList(
                            list,
                            item.product.switchBackProductCode!!
                        )
                        if (orgMedIndex != -1) {
                            //ORG-SUBS both added in cart create mapping
                            val orgMedicine = list[orgMedIndex]
                            val count =
                                async { localDbUseCase.getAddedSubsMedCountFromMedicineId(item.product.switchBackProductCode!!) }.await() // switch back pd-code is original medicine code
                            if (count == 0) {
                                localDbUseCase.addSubsInfo(orgMedicine.getOrgSubsInfo(false, 1))
                            }
                        } else {
                            var orgSubsInfo = OrgSubsInfo(
                                id = null,
                                medicineId = item.product.switchBackProductCode!!,
                                medicineName = item.product.switchBackSkuName,
                                companyName = item.product.manufacturerName,
                                discount = item.product.discount,
                                mrp = item.product.mrp,
                                addedQty = 1,
                                composition = item.product.composition,
                                subsDiscountPercentage = item.product.subsSavingPercentage,
                                subsSellingPrice = item.product.sellingPrice,
                                subsFound = item.product.subsFound,
                                fromApi = false,
                                subsMedProductCode = item.product.productCode,
                                subsMrp = item.product.mrp,
                                subsMedName = item.product.skuName,
                                subCompanyName = item.product.skuName,
                                drugType = item.product.drugType,
                                originalPackSize = 10.0,
                                substitutePackSize = (item.product.packSize?.toDouble()) ?: 10.0,
                                rxRequired = false,
                                maxCapped = 20,
                                subsRecommendedQty = item.product.qty ?: 1,
                                originalCountryNm = "IN",
                                subsCountryNm = "IN",
                                subsUnit = item.product.unit,
                                originalUnit = item.product.unit,
                                productImageUrls = item.product.switchBackImageUrl,
                                originalCompanyAddress = item.product.manufacturerAddr,
                                orgAvailable = true,
                                coldStorage = true
                            )

                            val count =
                                async { localDbUseCase.getAddedSubsMedCountFromMedicineId(item.product.switchBackProductCode!!) }.await() // switch back pd-code is original medicine code
                            if (count == 0) {
                                localDbUseCase.addSubsInfo(orgSubsInfo)
                            }

                        }

                        localDbUseCase.updateOrgAvailable(
                            item.product.productCode,
                            item.product.availabilityStatus.isNullOrEmpty()
                        )
                    }
                } else {

                }
            }
        }


    private fun getOrgMedicineIndexFromCartList(
        cartList: List<ProductInfoModel>,
        switchBackCode: String
    ): Int {
        var index = -1
        if (cartList == null) {
            return index
        }
        for (i in cartList.indices) {
            var item = cartList[i]
            if (item.product.productCode == switchBackCode) {
                index = i
                break
            }
        }
        return index
    }

    fun launchSearch() = launchSearch.postValue(Event(Any()))

    fun launchOrderSummary() = launchOrderSummary.postValue(Event(Any()))

    suspend fun getMedicineOrderDetailsList(
        mxInternalErrorOccurred: MxInternalErrorOccurred,orderId: Long, redirectToCart: Boolean) {
        val medicineDetails =orderFlowUseCase.getOrderMedicineDetails(mxInternalErrorOccurred, orderId)
        /*async {
                    orderFlowUseCase.getOrderMedicineDetails(
                        MxInternalErrorOccurred(),
                        orderId
                    )
                }.await()*/
        medicineDetails.let {
            val list = it.responseData?.elasticProductDetails ?: listOf()
            cartMedicineListResponse = it.responseData?.elasticProductDetails ?: listOf()

            removeMedsWhichAreNotInAPI()
            for (item in list) {

                localDbUseCase.updateProductDetailsId(
                    item.product.productCode,
                    item.product.productDetailsId ?: 0
                )

                if (!item.product.switchBackProductCode.isNullOrEmpty()) {
                    /**
                     * medicine is added as subs
                     * **/
                    var orgSubsMapping =
                        localDbUseCase.getAddedOrgInfoByOrgCode(item.product.switchBackProductCode!!)
                    if (orgSubsMapping != null) {
                        if (orgSubsMapping.subsMedProductCode != item.product.productCode) {
                            orgSubsMapping?.subsMedProductCode = item.product.productCode
                            orgSubsMapping?.subsMedName = item.product.skuName
                            localDbUseCase.addSubsInfo(orgSubsMapping)
                        }
                    }
                } else {
                    /**
                     * med added as ORG
                     * **/
                }


                val count =localDbUseCase.getAddedQtyOfAddedMedicine(item.product.productCode)
                /*async { localDbUseCase.getAddedQtyOfAddedMedicine(item.product.productCode) }.await()*/
                if (count == 0) {
                    item.product.mrp = item.product.mrp / (item.product.qty ?: 1)
                    localDbUseCase.addToCart(
                        item.productAsCartItem(false, item.product.qty ?: 1),
                        null,
                        false
                    )

                    localDbUseCase.insertCartSellingPrice(
                        CartItemSellingPrice(
                            item.product.productCode,
                            item.product.sellingPrice / (item.product.qty ?: 1)
                        )
                    )

                }
                localDbUseCase.updateOrgAvailable(
                    item.product.productCode,
                    item.product.availabilityStatus.isNullOrEmpty()
                )
            }

            addSubsMedicineToDB(list)
            getCustomerOrderDetails()
            setCartCount()

            if (list.isNullOrEmpty() && redirectToCart) {
                val response =orderFlowUseCase.getOrderRx(mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId)
                /*async {
                            orderFlowUseCase.getOrderRx(
                                MxInternalErrorOccurred(),
                                SharedPrefManager.getInstance().incompleteOrderId
                            )
                        }.await()*/
                if (response != null) {
                    val listTemp = response.responseData?.rxList ?: listOf()

                    if (listTemp.isEmpty()) {
                        closeReorderBottomSheet.postValue(Event(Any()))
                        launchSearch()
                        loaderValue.postValue(false)
                    } else {
                        closeReorderBottomSheet.postValue(Event(Any()))
                        launchOrderSummary()
                        loaderValue.postValue(false)
                    }
                } else {
                    closeReorderBottomSheet.postValue(Event(Any()))
                    loaderValue.postValue(false)

                }
            } else {
                if (redirectToCart) {
                    closeReorderBottomSheet.postValue(Event(Any()))
                    launchOrderSummary()
                    loaderValue.postValue(false)

                }
            }
        }
    }


    private fun getCustomerOrderDetails() {
        with(SharedPrefManager.getInstance()) {
            if (incompleteOrderId < 0L) return@with
            viewModelScope.launch(IO) {
                orderFlowUseCase.getOrderDetails(
                    MxInternalErrorOccurred(),
                    incompleteOrderId,
                    loggedInUserId
                )?.let {

                    /*SharedPrefManager.getInstance().addressId = it.responseData?.addressId ?: -1
                    SharedPrefManager.getInstance().patientId = it.responseData?.patientId ?: -1*/

                    /*it.responseData?.addressId?.let { addId -> addressId = addId
                        SharedPrefManager.getInstance().addressId = addId
                    }
                    it.responseData?.patientId?.let { patientID ->
                        patientId = patientID
                        SharedPrefManager.getInstance().patientId = patientID
                    }*/
                }
            }
        }
    }

    suspend fun removeMedsWhichAreNotInAPI() {
        val remoteList = getRemoteListProductCode()
        val localDBList = localDbUseCase.getAddedMedProductCode()

        for (item in localDBList) {
            /*val exists = containsInCartList(remoteList, item)
            if (!exists) {
                localDbUseCase.removeItemFromCart(item, false)
            }*/
            if (!remoteList.contains(item)) {
                val orgMedId = localDbUseCase.getOrgProductCodeFromSubs(item)
                val pdId = localDbUseCase.getProductDetailsId(item)
                if (pdId > 0) {
                    localDbUseCase.removeItemFromCart(item, false)
                    if (!orgMedId.isNullOrEmpty()) {
                        localDbUseCase.removeOrgSubsMapping(orgMedId)
                    }
                }
            }
        }
    }

    fun getRemoteListProductCode(): MutableList<String> {
        var list = mutableListOf<String>()
        if (!cartMedicineListResponse.isNullOrEmpty()) {
            for (item in cartMedicineListResponse) {
                list.add(item.product.productCode)
            }
        }
        return list
    }

    suspend fun sendItemAddedEvent(
        productInfoModel: ProductInfoModel?, qc: String?, rt: String?, itemAdded: MxItemAdded,
        isSubs: Boolean, termSearched: String? = null, clickedSuggestionType: String? = null,
        suggestionTermClicked: String? = null, suggestionTermClickedPosition: Int? = 0
    ) {
        if (productInfoModel == null) return
        try {
            /*localDbUseCase.deleteItemAddedAttributesUsingProductCode(productInfoModel.product.productCode)
            localDbUseCase.insertItemAddedAttributes(
                ItemAddedEventAttributes(
                    null,
                    productInfoModel.product.productCode,
                    itemAdded.clickedOnPage ?: "",
                    itemAdded.pageSection ?: "",
                    itemAdded.sectionHeading ?: "",
                    itemAdded.resultPosition ?: 0
                )
            )*/

            sdkEventUseCase.sendItemAddedEvent(
                itemAdded.also {
                    it.brand =
                        if (isSubs) productInfoModel.suggestion?.motherBrand else productInfoModel.product.motherBrand
                    it.isOtc = productInfoModel.product.isOtc
                    it.isSubstitute = isSubs
                    it.orgProductDiscountPercentage = productInfoModel.product.discount
                    it.subsProductId = productInfoModel.suggestion?.productCode
                    it.subsProductName = productInfoModel.suggestion?.skuName
                    it.orgProductId = productInfoModel.product.productCode
                    it.orgProductMrp = productInfoModel.product.mrp
                    it.orgProductName = productInfoModel.product.skuName
                    it.productName =
                        if (isSubs) productInfoModel.suggestion?.skuName else productInfoModel.product.skuName
                    it.orgProductSalePrice = productInfoModel.product.sellingPrice
                    it.productDiscountPercentage =
                        if (isSubs) if(productInfoModel.product.subsSavingPercentage.isNullOrEmpty()) null else productInfoModel.product.subsSavingPercentage?.replace("%", "")
                            ?.toDouble() else productInfoModel.product.discount
                    it.productId =
                        if (isSubs) productInfoModel.suggestion?.productCode else productInfoModel.product.productCode
                    it.productMrp =
                        if (isSubs) productInfoModel.suggestion?.mrp else productInfoModel.product.mrp
                    it.productPictureExists =
                        (if (isSubs) (productInfoModel.suggestion?.productImageUrl?:"") else (productInfoModel.product.productImageUrl?:"")).startsWith("http")
                    it.productSalePrice =
                        if (isSubs) productInfoModel.suggestion?.sellingPrice else productInfoModel.product.sellingPrice
                    it.qc = qc
                    it.rt = rt
                    it.subsId =
                        if (localDbUseCase.getSubsIdOfOrder() > 0) localDbUseCase.getSubsIdOfOrder()
                            .toString() else null

//                    (selectedMedicineDetails?.suggestion?.productImageUrl?:"").startsWith("http"),
                    /* if (productInfoModel.product.productCode != null) {
                         "61"
                     } else if (productInfoModel.suggestion?.productCode == null) {
                         "211"
                     } else if (!productInfoModel.suggestion?.productCode.equals("") && !productInfoModel.suggestion?.productCode.equals(
                             "null"
                         ) && productInfoModel.product.productCode != productInfoModel.suggestion?.productCode
                     ) {
                         "62"
                     } else "211"*/
                    it.subsProductDiscountPercentage = productInfoModel.suggestion?.discount
                    it.subsProductMrp = productInfoModel.suggestion?.mrp
                    it.subsProductSalePrice = productInfoModel.suggestion?.sellingPrice
                    it.subsSavings = if(productInfoModel.product.subsSavingPercentage.isNullOrEmpty()) null else(if(isSubs) productInfoModel.product.subsSavingPercentage?.replace("%", "")?.toDouble() else 0.0)
                    it.substituteAvailable = productInfoModel.product.subsFound
                    it.isChronic = productInfoModel.product.isChronic
                   /* it.freeDeliveryRequiredAmount =
                        SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*/
                    it.packSizeDifference = calculatePackSizeDiff(
                        productInfoModel.product.packSize,
                        productInfoModel.suggestion?.packSize
                    )
                    it.suggestionTermClicked =
                        if (suggestionTermClicked.isNullOrEmpty()) null else suggestionTermClicked
                    it.suggestionTermClickedPosition = suggestionTermClickedPosition
                    it.termSearched = if (termSearched.isNullOrEmpty()) null else termSearched
                    it.clickedSuggestionType =
                        if (clickedSuggestionType.isNullOrEmpty()) null else clickedSuggestionType
                },
                if (isSubs) {
                    false
                } else {
                    productInfoModel.product.subsFound && productInfoModel.product.productCode != productInfoModel.suggestion?.productCode
                }
            )
        } catch (e: Exception) {
            Log.d("qwerty", "${e.message}")
        }

    }

    suspend fun sendSubstituteItemAddedEvent(afSubsItemAdded: AFSubsItemAdded) {
        try {
            sdkEventUseCase.sendSubstituteItemAddedEvent(afSubsItemAdded)
        } catch (e: Exception) {
            Log.d("qwerty", "${e.message}")
        }

    }

    fun sendPaymentPendingSheetViewed(mxPaymentPendingViewed: MxPaymentPendingViewed) {
        sdkEventUseCase.sendPaymentPendingViewedEvent(mxPaymentPendingViewed)
    }

    suspend fun sendItemImpressionEvent(
        productInfoModel: ProductInfoModel,
        clickedOnPage: String?,
        pageSection: String?,
        resultPosition: Int?,
        sectionHeading: String?,
        sectionIndex: Int?,
        sectionRow: Int?,
        freeDeliveryRequiredAmount: Double?,
        suggestionTermClicked: String? = null,
        termSearched: String? = null
    ) {
        viewModelScope.launch(IO) {
            sdkEventUseCase.sendItemImpressionEvent(
                MxItemImpression().also {
                    it.clickedOnPage = clickedOnPage
                    it.freeDeliveryRequiredAmount = freeDeliveryRequiredAmount
                    it.isOtc = productInfoModel.product.isOtc ?: false
                    it.mrp = productInfoModel.product.mrp
                    it.orgMrp = productInfoModel.product.mrp
                    it.orgProductId = productInfoModel.product.productCode
                    it.orgProductName = productInfoModel.product.skuName
                    it.orgSalesPrice = productInfoModel.product.sellingPrice
                    it.pageSection = pageSection
                    it.productDiscountPercentage = productInfoModel.product.discount
                    it.productId = productInfoModel.product.productCode
                    it.productName = productInfoModel.product.skuName
                    it.resultPosition = resultPosition
                    it.salesPrice = productInfoModel.product.sellingPrice
                    it.sectionHeading = sectionHeading
                    it.sectionIndex = sectionIndex
                    it.sectionRow = sectionRow
                    it.subsId =
                        if (localDbUseCase.getSubsIdOfOrder() > 0) localDbUseCase.getSubsIdOfOrder() else null/*if (productInfoModel.product.productCode != null) {
                    61
                } else if (productInfoModel.suggestion?.productCode == null) {
                    211
                } else if (!productInfoModel.suggestion?.productCode.equals("") && !productInfoModel.suggestion?.productCode.equals(
                        "null"
                    ) && productInfoModel.product.productCode != productInfoModel.suggestion?.productCode
                ) {
                    62
                } else 211*/
                    it.subsMrp = productInfoModel.product.mrp
                    it.subsSalesPrice = productInfoModel.product.sellingPrice
                    it.whId = SharedPrefManager.getInstance().selectedWarehouseID
                    it.suggestionTermClicked = suggestionTermClicked
                    it.termSearched = termSearched

                }
            )
        }
    }

    open fun calculatePackSizeDiff(originalPack: String?, subsPack: String?): String? {
        if (originalPack.isNullOrEmpty() || originalPack == "null" || subsPack.isNullOrEmpty() || subsPack == "null") {
            return null
        }
        var orgPackSize = 0.0
        var subPackSize = 0.0
        try {
            orgPackSize = originalPack.toDouble()
            subPackSize = subsPack.toDouble()
            if (orgPackSize == 0.0 || subPackSize == 0.0) {
                return null
            }
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
            return null
        }
        val msg: String = if (orgPackSize == subPackSize) {
            "Same"
        } else if (orgPackSize > subPackSize) {
            "Original Higher"
        } else {
            "Original Lower"
        }
        return msg
    }


    @SuppressLint("SuspiciousIndentation")
    suspend fun sendItemOrderPlacedToMixPanel(
        array: JSONArray?,
        list: List<ProductInfoModel>
    ) {
        try {
            if (array == null) return


            var finalList: MutableList<MxItemAppOrderPlaced> = mutableListOf()
            if (array != null) {
                for (j in 0 until array!!.length()) {
                    var item = MxItemAppOrderPlaced()
                    val itemPlaced =
                        localDbUseCase.getItemAddedAttributes(array.getString(j) ?: "")
                    val itemDetails = getProductInfoDetails(list, array.getString(j) ?: "")
                    item.isReorder = SharedPrefManager.getInstance().isReOrder
                    if (itemPlaced != null) {
                        item.clickedOnPage = itemPlaced.clickedPage
                        item.sectionHeading = if(itemPlaced.sectionHeading.isNullOrBlank()) null else itemPlaced.sectionHeading
                        item.pageSection = if (itemPlaced.pageSection.isNullOrEmpty()) null else itemPlaced.pageSection

                        if (item.clickedOnPage != null && item.clickedOnPage == "search_result") {
                            item.sectionIndex = "0"
                        } else {
                            item.sectionIndex = (itemPlaced.sectionIndex + 1).toString()
                        }
                    }

                    if (itemDetails != null) {
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
                        /**
                         * 61 - Medicine has subs and cx opted for subs
                         * 62 - Medicine has subs and cx opted for org
                         * 211 -
                         * **/
                        item.subsId = if (itemDetails.product.cxAcceptedSubs) {
                            61
                        } else if (itemDetails.suggestion != null && !itemDetails.product.cxAcceptedSubs) {
                            62
                        } else {
                            211
                        }
                        item.productDiscountPercentage =
                            if (itemDetails.product.cxAcceptedSubs) itemDetails.product.subsSavingPercentage?.replace(
                                "%",
                                ""
                            ) else itemDetails.product.discount.toString()
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

    fun getProductInfoDetails(
        list: List<ProductInfoModel>,
        productCode: String
    ): ProductInfoModel? {
        var infoModel: ProductInfoModel? = null
        if (list.isNullOrEmpty()) return infoModel

        if (!list.isNullOrEmpty()) {
            for (i in list.indices) {
                var item = list[i]
                if (item.product.productCode == productCode) {
                    infoModel = item
                    break
                }
            }
        }
        return infoModel
    }

    //coupon removed event fired for offline coupon applied case
    fun callCouponRemovedEventForOfflineCouponCase(
        billDetailsData: BillDetailResponse.ResponseData? = null,
        clickedOnPag: String = "",
        coupon: CouponCodeResponse.Coupon? = null,
        orderId: Long
    ) {
        if (coupon != null) {

            val cal: Calendar = getCalendarDataBase(coupon?.expiryDateFromApi!!)!!

            //event data
            var clickedOnPage = clickedOnPag
            var couponDiscountAmountEventValue: Double = 0.0

            //var couponExpDate: Date? = cal.getTime()
             var couponExpDate: Date? = convertMillisToDate(coupon?.expiryDateFromApi!!) // made same as coupon applied case
            Log.e(
                "expirry_date:::::",
                coupon?.expiryDate.toString() + "::::::" + couponExpDate.toString()
            )

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


          /*  if (billDetailsData != null) {
                billDetailsData?.let { billDetailsData ->
                    couponDiscountAmountEventValue = billDetailsData.couponDiscountAmt ?: 0.0
                    discountAmountEventValue = billDetailsData.discount ?: 0.0
                }
            } else {*/

/*
                //calculate coupon discount amount
                var isAboveCouponDiscountAdded = false
                var totalSellingPrice = 0.0
                var totalSavingAmount = 0.0
                var totalProductDiscount = 0.0
                val baseDiscount = SharedPrefManager.getInstance().baseDiscount
                try {


                    viewModelScope.launch(Dispatchers.IO) {
                        val cartList = localDbUseCase.getAddedMedicines()

                        for (i in cartList.indices) {
                            val item = cartList[i]
                            //totalSellingPrice += (item.mrp - (item.mrp * (item.discount / 100))) * item.addedQty
                            totalSellingPrice += item.getSellingPrice() * item.addedQty

                            totalProductDiscount += (item.mrp * (item.discount / 100)) * item.addedQty

                            if (item.discount >= baseDiscount && item.discount < (baseDiscount + coupon.discountValue)
                                && totalSavingAmount <= coupon.maxDiscount!!
                            ) {
                                //totalSavingAmount += item.mrp * ((coupon.discountValue - item.discount) / 100) * item.addedQty
                                //SharedPrefManager.getInstance().getAlgoSpecificVariantId
                                totalSavingAmount += ((item.mrp * coupon.discountValue) / 100) * item.addedQty
                            }

                            if (item.discount > (baseDiscount + coupon.discountValue)) {
                                isAboveCouponDiscountAdded = true
                            }

                        }

                        if (totalSavingAmount >= coupon.maxDiscount!!) {
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
                            if (dynamicDiscountVariant == "B") {
                                totalSavingAmount += totalProductDiscount
                            }
                        }
                    }
                } catch (e: Exception) {
                }

                // couponDiscountAmountEventValue = Math.abs(totalSavingAmount)
*/

               /* val map = SharedPrefManager.getInstance().currentOrderAmountDetails
                couponDiscountAmountEventValue = removeExtraZeros((map[SharedPrefManager.PREF_COUPON_DISCOUNT_AMT_EVENT] ?: 0.0).toDouble())


                discountAmountEventValue =
                    removeExtraZeros(
                        (map[SharedPrefManager.PREF_DISCOUNT_EVENT]
                            ?: 0.0).toDouble()
                    )
            }*/


          //  couponDiscountAmountEventValue =SharedPrefManager.getInstance().couponModel?.savingAmount?.toDouble()?:0.0
            Log.d("Intent", "onCreate: setParameter call 2222:::"+SharedPrefManager.getInstance().couponDiscount.toDouble())
            couponDiscountAmountEventValue =  SharedPrefManager.getInstance().couponDiscount.toDouble()?:0.0

            discountAmountEventValue=_cartTotalMedDiscount.value?:0.0


            var mxCouponRemoved = MxCouponRemoved(
                clickedOnPage = clickedOnPage,
                couponDiscountAmount = couponDiscountAmountEventValue,//todo -need to manage values properly in offline case
                couponExpiryDate = couponExpDate,
                couponExpiryPeriod = couponExpiryPeriod,
                couponId = couponId,
                couponName = couponName,
                discountAmount = discountAmountEventValue,//todo -need to manage values properly in offline case
                urgencyTimeRemaining = if (coupon.showFtcCounter == true) urgencyTimeRemaining else null,
                couponSubtitle = couponSubTitle,
                whId = whIdEventValue
            )
Log.e("coupon_removed","offline::::"+mxCouponRemoved)
            sdkEventUseCase.sendCouponRemovedEvent(mxCouponRemoved)
        }
    }

    fun getCalendarDataBase(millis: Long): Calendar? {
        val cal = Calendar.getInstance()
        cal.timeInMillis = millis * 1000L
        cal.timeZone = TimeZone.getTimeZone("UTC")
        return cal
    }

    fun callEventApplyCouponClickedFromBaseVM() {
        viewModelScope.launch(Dispatchers.IO) {
            var orderIdEvent = SharedPrefManager.getInstance().incompleteOrderId
            var whId = SharedPrefManager.getInstance().selectedWarehouseID

            val cartTotalSellingPrice = localDbUseCase.getCartTotalSellingPrice()
            val cartTotalMrp = localDbUseCase.getCartTotalMrpPrice()

            var mixPanelData =
                MxApplyCouponClick(
                    cartTotalMrp,
                    orderIdEvent,
                    cartTotalSellingPrice,
                    whId
                )
            sdkEventUseCase.sendApplyCouponClickedEvent(mixPanelData)
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

    fun convertMillisToDateFormat(date: String?): String? {
        try {
            val inputDateFormat = SimpleDateFormat("dd-MM-yyyy")
            val inputDate = inputDateFormat.parse(date)

            val outputDateFormat = SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy")
            outputDateFormat.timeZone = TimeZone.getTimeZone("GMT+05:30")
            return outputDateFormat.format(inputDate)
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }
    
    fun getDeliveryDateDaysDifference(delDate: String): Int {
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
    }
    

    fun sendProceedToCartToFirebaseEvent() {
        sdkEventUseCase.sendProceedToCartToFirebaseEvent()
    }

    enum class DeepLinkTypes(val type: String?) {
        PAYMENT_LINK("payment_link"),
        DEFAULT(null),
    }
    fun getDeepLinkType(strDeepLink: String):DeepLinkTypes?{
        if (strDeepLink == "") return null
        var loginType = DeepLinkTypes.DEFAULT

        val splitParams: List<String> = strDeepLink.split("?")
        if (splitParams.size > 1) {
            val parametersId = splitParams[1]
            val queryParamsMap: MutableMap<String, String> = HashMap()
            val queryParameters =
                parametersId.split("&")
            for (queryParameter in queryParameters) {
                val queryParamKeyVal =
                    queryParameter.split("=")
                if (queryParamKeyVal.size >= 2) {
                    queryParamsMap[queryParamKeyVal[0]] = queryParamKeyVal[1]
                }
            }
            return when(queryParamsMap["loginType"]){
                "pay" -> DeepLinkTypes.PAYMENT_LINK
                else -> null
            }

        }



        return loginType
    }




}