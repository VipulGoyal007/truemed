package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import android.text.SpannableStringBuilder
import android.util.Base64
import android.util.Log
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.cashfree.pg.network.NetworkConnectivityUtil
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.FullWidthProductCardCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.constants.CouponConstant
import com.intellihealth.salt.constants.FWPCWarningConstants
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.constants.StepperConstants
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.PaymentCarouselModel
import com.intellihealth.salt.models.PaymentContainerModel
import com.intellihealth.salt.models.ProductCardSectionChipModel
import com.intellihealth.salt.utils.formatDecimal
import com.intellihealth.salt.views.payments.PaymentContainerType
import com.intellihealth.salt.views.section.ProductCardSection
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.clevertap.CtReorderClicked
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxApplyCouponClick
import com.intellihealth.truemeds.data.model.mixpanel.MxCartViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxOneClickSubstitutionPopupViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxPrescriptionUploadPageViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxSubstituteReplaceClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxSwitchBackClicked
import com.intellihealth.truemeds.data.model.mixpanel.MxUrgencyTimerStarted
import com.intellihealth.truemeds.data.model.mixpanel.MxViewBillClicked
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.CartBillDetails
import com.intellihealth.truemeds.data.model.orderflow.CartReplaceAll
import com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel
import com.intellihealth.truemeds.data.model.orderflow.CustomerOrderDetailsResponseData
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.model.orderflow.ReplaceAllBottomSheetModel
import com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse
import com.intellihealth.truemeds.data.model.ordersummary.AddressResponse
import com.intellihealth.truemeds.data.model.ordersummary.OTCResponse
import com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest
import com.intellihealth.truemeds.data.model.search.ProductList
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartReplaceStatus
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.MessageConstant
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.data.utils.progressStringToLimit
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.domain.enums.NetworkResponseType
import com.intellihealth.truemeds.domain.enums.PinCodeServiceability
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAppOrderPlaced
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOrderSummaryViewed
import com.intellihealth.truemeds.presentation.model.CartMedicineModel
import com.intellihealth.truemeds.presentation.model.Product
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.model.SearchResultElasticResponse
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.ClassNameConstants
import com.intellihealth.truemeds.presentation.utils.ClassNameConstants.CART_ACTIVITY
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.getApplicableCashHandlingCharger
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.CommonFunc.toAppProductModel
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.utils.roundOffDecimal
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.json.JSONArray
import java.util.Collections
import javax.inject.Inject


@HiltViewModel
open class CartViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val loginUseCase: LoginUseCase,
    private val userDataUseCase: ManagePatientUseCase,
    private val userUseCase: UserDataUseCase
    ) : PrescriptionViewModel(context, loginUseCase, userUseCase), LifecycleObserver {
    var activePage: String = "CART"
    val deleteProductEventListener: MutableLiveData<Event<Boolean>> = MutableLiveData()
    val isDelete: MutableLiveData<Event<Boolean>> = MutableLiveData()

    var topDealPosition = 0
    val isAnimationStarted = MutableLiveData<Boolean>(false)
    //val isDeleteCompleted: MutableLiveData<Event<Boolean>> = MutableLiveData()
//    var cartMedicineListResponse = listOf<ProductInfoModel>()
    var lastScrollPosition = 0
    var selectedMedicineProductCode = ""
    var selectedMedicineSwitchBackProductCode = ""
    var selectedMedicineProductQty = 0
    var cartMedItems = MutableLiveData(mutableListOf<CartMedicineModel>())
    var apiMedicineList = MutableLiveData(mutableListOf<ProductInfoModel>())
    var productList = MutableLiveData(mutableListOf<ProductInfoModel>())
    var productOgSkuName: ArrayList<String?> = ArrayList()
    var suggestionSkuName: ArrayList<String?> = ArrayList()
    var otcList = MutableLiveData<MutableList<ProductInfoModel>>(Collections.emptyList())
    var otcApiList = MutableLiveData<MutableList<ProductInfoModel>>(Collections.emptyList())
    var billAmount: Double = 0.0
    var billDetails = MutableLiveData<BillDetailsModel?>()
    var cartTotal: Double = 0.0
    private val openCouponBottomSheet = MutableLiveData<Event<CouponCodeResponse.Coupon>>()
    val eventOpenCouponBottomSheet: LiveData<Event<CouponCodeResponse.Coupon>> get() = openCouponBottomSheet
    var billResponseData = CartBillDetails()
    var replaceAllModel = ReplaceAllBottomSheetModel(
        0.0, 0.0, 0.0,
        0.0, listOf(), "", listOf()
    )
    var subsReplaceCount = 0
    var replaceSavings = MutableLiveData(0.0)
    var prescriptionUploadedCount2 = 0

    //    var loaderValue = MutableLiveData(false)
    private var taskSearchJob: Job? = null
    var launchOrderIsBeingPlaced = MutableLiveData(false)
    var launchOrderIsBeingPlacedCaseFailed = MutableLiveData(false)
    var launchOrderIsBeingPlacedForUnavailable = MutableLiveData(false)

    var showLoading = MutableLiveData(false)
    var addressId = MutableLiveData(0L)
    var patientId = MutableLiveData(0L)
    var patientAge = MutableLiveData(0)
    var patientGender = MutableLiveData("")
    var patientType = MutableLiveData("")
    var isFirstTimeCall = true
    var isDiscardApiCalled = false
    var savingPercentageWithSubs: Double? = null
    var reorder_button_click = ""
    var callReorderEvent = true

//    val isLoading = MutableLiveData(false)
//    val isLoadingForPatient = MutableLiveData(false)
//    val isLoadingForPrescriptions = MutableLiveData(false)
//    var patientDetails : List<DropDownDefaultModel>?= null

    val launchPDPage = MutableLiveData<Event<ProductInfoModel>>()
    val eventLaunchPDPage: LiveData<Event<ProductInfoModel>> get() = launchPDPage
    var orderID = ""
    var clickedOnPageCartModel = ""
    var section = ""
    var actionType: String = ""
//    val prescriptionList = MutableLiveData<List<String>>(emptyList())
//
//    val prescriptions = MutableLiveData<List<OrderRxInfo>>(emptyList())
//    var list = mutableListOf<String>()

    var drCallNeeded = MutableLiveData(false)
    var phCallNeeded = MutableLiveData(false)
    var outOfStockCount = 0
    var unserviceableItemCount = 0
    var notForSaleCount = 0
    var isLastMinuteBuyRestored = false
    var cartViewedTrigger = false
    var orderTypeId: Int? = null
    var orderSubsId: Int? = null


    //note:- Order summary variables

    var paymentMode = MutableLiveData(16)
    var freeDeliveryMessage = MutableLiveData("Yay! You get Free delivery on this order!")
    var isFreeDelivery = MutableLiveData(false)
    var itemsNotAvailable = MutableLiveData(false)
    var itemsNotAvailableCount = MutableLiveData(0)
    var undoPdIdList = mutableListOf<Long>()
    var selectedPaymentMethod = ""
    var selectedPaymentMethodId = -1L
    var selectedPaymentMethodIconUrl = ""
    var orderIsBeingPlacedView = MutableLiveData<Boolean>(false)
    var orderPlacedView = MutableLiveData<Boolean>(false)
    var setMainDataView = MutableLiveData<Boolean>(false)
    var paymentCarouselList = MutableLiveData<List<PaymentCarouselModel>>(Collections.emptyList())
    var paymentCarouselOgList: List<CouponCodeResponse.Coupon> = Collections.emptyList()
    var crossSellingProducts = listOf<ProductInfoModel>()
    var medList =
        MutableLiveData<MutableList<com.intellihealth.salt.models.ProductInfoModel>>(Collections.emptyList())
    var isAppliedCoupon = MutableLiveData(false)
    var isShowOtc = MutableLiveData(false)
    var couponCodeDataModel = MutableLiveData<CouponCodeDataModel>()
    var addMoreForCod = MutableLiveData(0.0)
    var addMoreForFreeDelivery = MutableLiveData(0.0)
    var restrictCod = MutableLiveData(false)
    var paymentRestrictedType = MutableLiveData(0)
    var cartCount = MutableLiveData(0)
    var visibleMedicineList = MutableLiveData<List<ProductList>>(Collections.emptyList())
    var prescriptionUploadedImgList = MutableLiveData<List<ProductList>>(Collections.emptyList())
    var productIds = listOf<String>()
    var productNames = listOf<String>()
    var rxRequired = false
    var totalOutOfStockCount: Int = 0
    var notDeliverableCount: Int = 0
    var isGenericAdded = false
    var isChronicAdded: Boolean? = null
    var isOtcAdded: Boolean? = null

    var patientName = MutableLiveData("")
    var pincode = MutableLiveData("")
    var address = MutableLiveData("")
    var deliveryDate = MutableLiveData("")
    var sellingPriceWithSubs = MutableLiveData(0.0)
    var isServiceable = MutableLiveData(PinCodeServiceability.SERVICEABLE)
    var paymentMethod = MutableLiveData("")
    var paymentModeSelected = MutableLiveData("")
    var payUsing = MutableLiveData("")
    var total = MutableLiveData("")
    var patientID = MutableLiveData("")
    var orderAddress = MutableLiveData("")
    var isOrderAddressServiceable = MutableLiveData(true)
    var mrpValue = MutableLiveData(0f)
    var orderDetailsData = MutableLiveData(CustomerOrderDetailsResponseData())
    var showReplacing = MutableLiveData(false)
    var selectedAddress: AddressResponse.ResponseData = AddressResponse.ResponseData()

    //note:- Order summary events
    private val showError = MutableLiveData<Event<ERRORS>>()
    val eventShowError: LiveData<Event<ERRORS>> get() = showError
    val showMessage = MutableLiveData<Event<MessageConstant>>()
    val eventMessage: LiveData<Event<MessageConstant>> get() = showMessage

    private val launchOrderStatus = MutableLiveData<Event<Boolean>>()
    val eventLaunchOrderStatus: LiveData<Event<Boolean>> get() = launchOrderStatus


    private val launchEmptyCart = MutableLiveData<Event<Boolean>>()
    val eventLaunchEmptyCart: LiveData<Event<Boolean>> get() = launchEmptyCart


    val launchReplaceBottomSheet = MutableLiveData<Event<Boolean>>()
    val eventLaunchReplaceBottomSheet: LiveData<Event<Boolean>> get() = launchReplaceBottomSheet

    private val closeReplaceBottomSheet = MutableLiveData<Event<Boolean>>()
    val eventCloseReplaceBottomSheet: LiveData<Event<Boolean>> get() = closeReplaceBottomSheet

    private val showReorderOtc = MutableLiveData<Event<Boolean>>()
    val eventShowReorderOtc: LiveData<Event<Boolean>> get() = showReorderOtc

    private val replaceWithSubsAnimation = MutableLiveData<Event<Any>>()
    val eventReplaceWithSubsAnimation: LiveData<Event<Any>> get() = replaceWithSubsAnimation

    private val undoReplaceAnimation = MutableLiveData<Event<Any>>()
    val eventUndoReplaceAnimation: LiveData<Event<Any>> get() = undoReplaceAnimation

    val openCouponPageFromDeepLink = MutableLiveData<Event<Any>>()
    val eventOpenCouponPageFromDeepLink: LiveData<Event<Any>> get() = openCouponPageFromDeepLink

    var isMedReplaced = false
    var isReplaceAllClicked = false
    val orgMedCount = MutableLiveData(0)
    var compareCardSavingPercentage = MutableLiveData(0.0)
    var savingsIfReplaceAll = MutableLiveData(0.0)
    var replacedMedicineCountIfReplaceAll = MutableLiveData(0)
    var savingsAfterReplaceAll = MutableLiveData(0.0)
    var replacedMedicineCount = MutableLiveData(0)
    var cartReplaceAll = MutableLiveData(
        CartReplaceAll(
            false,
            false,
            0.0,
            0,
            false,
            SharedPrefManager.getInstance().oneClickSubstitutionVariant,
            0.0
        )
    )
    var logoUrlList = listOf<String>()

    var addressCount = 0
    var patientsCount = 0
    var proceedButtonText = MutableLiveData("Proceed to checkout")
    var appliedCouponName: MutableLiveData<String?> = MutableLiveData()

    var selectedMedicineForReplace =
        MutableLiveData<com.intellihealth.salt.models.ProductInfoModel>()
    var selectedProductInfoReplace: ProductInfoModel? = null

    var searchedCouponList: MutableList<CouponCodeResponse.Coupon> = mutableListOf()
    var tempList: MutableLiveData<MutableList<CouponCodeResponse.Coupon>> =
        MutableLiveData(mutableListOf())

    private val openCouponPopup =
        MutableLiveData<Event<Pair<CouponCodeResponse.Coupon, CouponSaveRemoveResponse?>>>()
    val eventOpenCouponPopup: LiveData<Event<Pair<CouponCodeResponse.Coupon, CouponSaveRemoveResponse?>>> get() = openCouponPopup
    val openCouponFailed = MutableLiveData<Event<CouponCodeResponse.Coupon?>>()
    val eventOpenCouponFailed: LiveData<Event<CouponCodeResponse.Coupon?>> get() = openCouponFailed

    var showViewMoreViewLess = MutableLiveData(true)
    var isRemoveCase = false
    var productCodeForBottomSheet = ""
    lateinit var productForBottomSheet: ProductInfoModel
    var productCodeForBottomSheetIsSubs: Boolean = false
    var switchBackSkuNameForBottomSheetSubs: String = ""
    var discount = MutableLiveData(0.0)
    var mrp = MutableLiveData(0.0)
    var deliveryChargeMessage = MutableLiveData("")
    var showReplaceUndo = MutableLiveData(false)
    var eventProductForBottomSheet: ProductInfoModel? = null

    private val applyCouponFailed = MutableLiveData<Event<Any>>()
    val eventApplyCouponFailed: LiveData<Event<Any>> get() = applyCouponFailed


    private val removeCouponApi = MutableLiveData<Event<Any>>()
    val eventRemoveCouponApi: LiveData<Event<Any>> get() = removeCouponApi

    private val getReorderOtcApi = MutableLiveData<Event<Any>>()
    val eventGetReorderOtcApi: LiveData<Event<Any>> get() = getReorderOtcApi

    private val updateCoupon = MutableLiveData<Event<Any>>()
    val eventUpdateCoupon: LiveData<Event<Any>> get() = updateCoupon

    val showReplaceSavingPopUp = MutableLiveData<Event<Any>>()
    val eventShowReplaceSavingPopUp: LiveData<Event<Any>> get() = showReplaceSavingPopUp

    var listUnavailableItems = MutableLiveData(mutableListOf<ProductInfoModel>())
    private val launchPDPageForSub = MutableLiveData<Event<ProductInfoModel>>()
    val eventLaunchPDPageForSub: LiveData<Event<ProductInfoModel>> get() = launchPDPageForSub

    var isOtcDataRequested = false
    var isPDBottomsheetClosed = MutableLiveData(false)

    var showShimmerFooter = MutableLiveData<Boolean>(true)
    val showShimmerLiveDataFooter: LiveData<Boolean> get() = showShimmerFooter

    var showShimmerPayUsing = MutableLiveData<Boolean>(true)
    val showShimmerLiveDataPayUsing: LiveData<Boolean> get() = showShimmerPayUsing

    private val showReplaceItemWithSubsBS = MutableLiveData<Event<Boolean>>()
    val eventShowReplaceItemWithSubsBS: LiveData<Event<Boolean>> get() = showReplaceItemWithSubsBS

    //event parameters
    var mrpEventValue: Double = 0.0
    var salesPriceEventValue: Double = 0.0
    var billDetailsResponse: BillDetailResponse.ResponseData? = null
    var subsIdEventValue: Int = 0
    var clickedOnPageNameForCouponEvent: String = ""
    var clickedOnPageNameForCouponApplyEvent: String = ""
    var orderMedicineDetailsListData: MutableList<MedicineListDetailsSent> = mutableListOf()
    //var mxInternalErrorOccurred = MxInternalErrorOccurred()
    var subsFoundEventOrderSummary : String? = ""
    var subsReplaceTriggered = false

    var crossSellingPd = false

    var cappingLimitMessage = MutableLiveData<Event<String?>>()
    val eventCappingLimitMessage: LiveData<Event<String?>> get() = cappingLimitMessage

    init {
//        showReplaceUndo.value = SharedPrefManager.getInstance().autoReplaced
        list.add("add_more_prescription")
//        getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
    }


    private suspend fun getAddressData(page: String) : Boolean {
//        val addressData = cartUseCase.getAllAddress(SharedPrefManager.getInstance().loggedInUserId, SharedPrefManager.getInstance().incompleteOrderId)
        var addressAvailableForOrder = true
        val addressData = cartUseCase.getAllAddress(
            mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
            if (page == "CART") 0 else SharedPrefManager.getInstance().incompleteOrderId
        )
        
        if (addressData?.responseData != null) {
            addressAvailableForOrder = true
            val addressList = addressData!!.responseData!!
            if (addressData!!.responseData!!.isNotEmpty()) {
                if (SharedPrefManager.getInstance().isReOrder) {
                    /**
                     * this will be executed in reorder flow
                     * **/
                    if (addressList.size == 1) {
                        val item = addressList[0]
                        if ((item.active ?: false) == true) {
                            address.postValue(item.clubbedAddress)
                            paymentContainerModel.address = item.clubbedAddress ?: ""
                            paymentContainerModel.pinCode = item.pincode ?: ""
                            paymentContainerModel.addressType =
                                progressStringToLimit(item.addressType ?: "", 9)
                            SharedPrefManager.getInstance().addressType = item.addressType
                            SharedPrefManager.getInstance().address = item.clubbedAddress
                            SharedPrefManager.getInstance().pincode = item.pincode?.toInt() ?: 0
                            pincode.postValue(item.pincode)
                            stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                            if (item.pincode != null) {
                                fetchPinCode(item.pincode)
                            }
                            selectedAddress.addressType = item.addressType
                            selectedAddress.cityName = item.cityName
                            selectedAddress.stateName = item.stateName
                            selectedAddress.pincode = item.pincode
                        }
                    }
                } else {
                    /**
                     * this will be executed for normal order flow
                     * **/
                    var orderAddressUpdated = false
                    val selectedAddressId = SharedPrefManager.getInstance().addressId
                    if (selectedAddressId > 0) {
                        for (item in addressList) {
                            if (item.addressId == selectedAddressId) {
                                address.postValue(item.clubbedAddress)
                                paymentContainerModel.address = item.clubbedAddress ?: ""
                                paymentContainerModel.pinCode = item.pincode ?: ""
                                paymentContainerModel.addressType =
                                    progressStringToLimit(item.addressType ?: "", 9)
                                SharedPrefManager.getInstance().addressType = item.addressType
                                pincode.postValue(item.pincode)
                                stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                                if (item.pincode != null) {
                                    fetchPinCode(item.pincode)
                                }
                                selectedAddress.addressType = item.addressType
                                selectedAddress.cityName = item.cityName
                                selectedAddress.stateName = item.stateName
                                selectedAddress.pincode = item.pincode
                                orderAddressUpdated = true
                                break
                            } else {
                                /**
                                 * address not mapped for order
                                 * **/
                            }
                        }
                        /*if (!orderAddressUpdated) {
                            saveAddressId(SharedPrefManager.getInstance().loggedInUserId,
                                SharedPrefManager.getInstance().incompleteOrderId,
                                SharedPrefManager.getInstance().addressId)
                        }*/
                    } else {
                        /**
                         * No selected address found in session
                         * **/
                        addressCount = addressList.size
                        addressAvailableForOrder = false
                    }
                }
                
            } else {
                addressCount = 0
            }
        } else {
            addressAvailableForOrder = false
        }
        
        getPatientDetails(
            if (page == "CART") null else SharedPrefManager.getInstance().incompleteOrderId,
            SharedPrefManager.getInstance().loggedInUserId
        )

        return addressAvailableForOrder
    }

    private fun fetchPinCode(pinCode: String?) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = cartUseCase.checkPinCodeServiceability(mxInternalErrorOccurred, pinCode)
            if (response == null) {
                isServiceable.postValue(PinCodeServiceability.NOT_SERVICEABLE)
                isOrderAddressServiceable.postValue(false)
                paymentContainerModel.unserviceableMessage =
                    context.getString(R.string.txtUnServiceableAddress)
                stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
            } else if (response.statusCode == 400) {
                isServiceable.postValue(PinCodeServiceability.NOT_SERVICEABLE)
                isOrderAddressServiceable.postValue(false)
                paymentContainerModel.unserviceableMessage =
                    if (response.message.isNullOrEmpty()) context.getString(R.string.txtUnServiceableAddress)
                    else response.message.toString()
                stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
            } else {
                response.responseData.isServicable?.let {
                    if (it) {
                        isServiceable.postValue(PinCodeServiceability.SERVICEABLE)
                        isOrderAddressServiceable.postValue(true)
                        paymentContainerModel.unserviceableMessage = ""
                        stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                    } else {
                        isServiceable.postValue(PinCodeServiceability.NOT_SERVICEABLE)
                        isOrderAddressServiceable.postValue(false)
                        paymentContainerModel.unserviceableMessage =
                            context.getString(R.string.txtUnServiceableAddress)
                        stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                    }

                    SharedPrefManager.getInstance().also { sp ->
                        if ((response.responseData.pincodeData ?: Collections.emptyList()).isEmpty()) return@also
                        response.responseData.pincodeData?.get(0)?.let { pinData ->
                            pinData.pincode?.let { pc ->
                                sp.pincode = pc.toInt()
                            }
                            pinData.city?.let { pc ->
                                sp.selectedCity = pc
                            }
                            pinData.warehouseId?.let { pc ->
                                Log.e("warehouse_updated::","3333:::"+  pc.toString())
                                sp.selectedWarehouseID = pc.toString()
                            }
                        }
                    }

                }
            }

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
            return clickedOnPageNameForCouponEvent
        }

    }

    fun saveRemoveCouponCode(
        orderId: Long,
        offerId: String,
        className: String,
        clickedOnPage: String
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            var paymentTypeId =
                if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1) 17
                else SharedPrefManager.getInstance().lastSelectedPaymentModeId

            /*val response = async {
                couponUseCase.applyAndRemoveCouponCode(
                    orderId,
                    paymentTypeId.toString(),
                    offerId
                )
            }.await()*/

//Log.e("coupon_model:::", SharedPrefManager.getInstance().couponModel.toString())

            val response = couponUseCase.applyAndRemoveCouponCode(
                mxInternalErrorOccurred, orderId,
                paymentTypeId.toString(),
                offerId,
                billDetailsResponse,
                couponEventPageName(offerId),
                SharedPrefManager.getInstance().couponModel, orderMedicineDetailsListData
            )


            if (response != null && response.message.equals(
                    BundleConstants.COUPON_REMOVED,
                    true
                )
            ) {
                SharedPrefManager.getInstance().couponModel = null
                SharedPrefManager.getInstance().offerId = "0"
                SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                getCartBillDetails(SharedPrefManager.getInstance().incompleteOrderId, className)
                showMessage.postValue(
                    Event(
                        MessageConstant(
                            MESSAGES.REMOVED_COUPON_SUCCESSFULLY,
                            response.responseData?.description?.get(0) ?: ""
                        )
                    )
                )
                loaderValue.postValue(false)
            } else {
                applyCouponFailed.postValue(Event(Any()))
            }
            /*if (response?.message == "Success") {
                if (offerId == "0") {

                    SharedPrefManager.getInstance().couponModel = null
                    SharedPrefManager.getInstance().offerId = "0"
                    SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)

                } else {
                    SharedPrefManager.getInstance().offerId = offerId
                }
            } else {
                SharedPrefManager.getInstance().couponModel = null
                SharedPrefManager.getInstance().offerId = "0"
                SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)

            }

             */
            //updateCoupon.postValue(Event(Any()))
            //setCouponData()

        }
    }

    private fun applyCoupon(
        orderId: Long,
        offerId: String,
        className: String
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            var paymentTypeId =
                if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1) 17
                else SharedPrefManager.getInstance().lastSelectedPaymentModeId

            val response = couponUseCase.applyAndRemoveCouponCode(
                mxInternalErrorOccurred,orderId,
                paymentTypeId.toString(),
                offerId,
                billDetailsResponse,
                couponEventPageName(offerId),
                SharedPrefManager.getInstance().couponModel, orderMedicineDetailsListData
            )

            if (response != null && response.message.equals(
                    BundleConstants.COUPON_REMOVED,
                    true
                )
            ) {
                getCartBillDetails(SharedPrefManager.getInstance().incompleteOrderId, className)
            } else {
                applyCouponFailed.postValue(Event(Any()))
            }
            loaderValue.postValue(false)
        }
    }

    fun getCustomerOrderDetail() = viewModelScope.launch(Dispatchers.IO) {
        val orderData = cartUseCase.getCustomerOrderDetail(
            mxInternalErrorOccurred,SharedPrefManager.getInstance().loggedInUserId,
            SharedPrefManager.getInstance().incompleteOrderId.toString()
        )
        orderData?.let {

            patientId.postValue(it.responseData.patientId)
            addressId.postValue(it.responseData.addressId)
        }
    }


    fun getSessionToken(
        warehouseId: String,
        pageNumber: Int,
        type: String,
        subType: Set<String>,
        pageSize: Int,
        variantId: Long
    ) {
        //var sessionToken = ""
        viewModelScope.launch(Dispatchers.IO) {
            /*val simpleDate = SimpleDateFormat(DateFormats.YYYY_MM_DD_HH_MM_SS)
            val stringForBase64 =
                CommonFunc.getSourceVersionName() + "-" + simpleDate.format(Date())
            val fcmToken = SharedPrefManager.getInstance().fcm
            if (fcmToken.equals("")) {
                val defaultToken = loginUseCase.fetchDefaultToken(mxInternalErrorOccurred,stringForBase64)
                sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred,defaultToken?.responseData?.token!!)
            } else {
                sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred,fcmToken)
            }*/
            val sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred, SharedPrefManager.getInstance().fcm)

            getCrossSellingRecommendedProducts(
                sessionToken,
                warehouseId,
                pageNumber,
                type,
                subType,
                pageSize,
                variantId
            )
        }
    }

    fun getCrossSellingRecommendedProducts(
        sessionToken: String,
        warehouseId: String,
        pageNumber: Int,
        type: String,
        subType: Set<String>,
        pageSize: Int,
        variantId: Long
    ) = viewModelScope.launch(Dispatchers.IO) {
        val crossSelling = cartUseCase.getCrossSellingRecommendedProducts(
            mxInternalErrorOccurred,sessionToken,
            warehouseId,
            pageNumber,
            type,
            subType,
            pageSize,
            variantId
        )
        crossSelling?.responseData?.LAST_MINUTE_BUY?.let {
            if (it.isEmpty()) {
                crossSellingProducts = Collections.emptyList()
                medList.postValue(Collections.emptyList())
            } else {
                var list = mutableListOf<com.intellihealth.salt.models.ProductInfoModel>()
                for (item in it) {
                    val qty = localDbUseCase.getAddedQtyOfAddedMedicine(item.product.productCode)
                    if (qty == 0) {
                        list.add(item.toSdkObject())
                    }
                }
                medList.postValue(list)
                crossSellingProducts = it
            }
        }
    }


    fun triggerSaveMeds(orderId: Long, initialLoad: Boolean, page: String, isPincodeChange: Boolean = false) {
        if (isNetworkAvailable(context)) {
            if (initialLoad) {
                showLoading.postValue(true)
            } else {
                loaderValue.postValue(true)
            }
            showShimmerFooter.postValue(true)
            viewModelScope.launch(Dispatchers.IO) {
                orderMedicineDetailsListData = mutableListOf()
                if (orderId > 0) {
//                fetchCartDetails(true, page)
                    if (cartMedicineListResponse.isNullOrEmpty() || isPincodeChange) {
                        val response =
                            orderFlowUseCase.getOrderMedicineDetails(mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId)

                        //setting mix pannel data here
                        orderMedicineDetailsListData.clear()
                        if (response.responseData != null && response?.responseData?.elasticProductDetails?.size!! > 0) {
                            for (i in 0..response.responseData?.elasticProductDetails?.size!! - 1) {
                                response.responseData?.elasticProductDetails?.get(i)?.product?.let {
                                    addMedicineToCartItemDetails(orderMedicineDetailsListData, MedicineListDetailsSent(
                                        it.productCode,
                                        it.skuName
                                    ))

                                }
                            }
                        }

                        if (response != null && response.statusCode == 200) {
                            logoUrlList = response.responseData?.logoUrlList ?: listOf()
                            cartMedicineListResponse = response.responseData?.elasticProductDetails ?: listOf()
                        }
                    }
                    val replaceList = getAddedMedicinesFromCart(false, false)

//                    val replaceList = getReplaceMedicineDtoList()

                    if (!isPincodeChange) {
                        val responseCode = replaceMedsForIncompleteOrder(
                            SharedPrefManager.getInstance().loggedInUserId,
                            SharedPrefManager.getInstance().incompleteOrderId,
                            replaceList,
                            SharedPrefManager.getInstance().offerId,
                            true,
                            true,
                            SharedPrefManager.getInstance().srcType,
                            SharedPrefManager.getInstance().algoSpecificVariantId
                        )


                        if (responseCode != null) {
                            if (!responseCode.responseData?.cappingLimitMessage.isNullOrEmpty()) {
                                cappingLimitMessage.postValue(Event(responseCode.responseData?.cappingLimitMessage))
                            }
                        }
                    }
                    fetchCartDetails(initialLoad, page)
                    /*if (responseCode == 200) {
                        fetchCartDetails(initialLoad, page)
                    } else {
                        fetchCartDetails(initialLoad, page)
                        showInternalServerError.postValue("Internal server error, please try again")
                    }*/
                } else {
                    val list = getAddedMedicinesFromCart(true, false)

                    if (list.isNotEmpty()) {
                        val responseCode = saveMedsAndCreateOrder(
                            SharedPrefManager.getInstance().loggedInUserId,
                            0,
                            list,
                            SharedPrefManager.getInstance().offerId,
                            SharedPrefManager.getInstance().algoSpecificVariantId,
                            true,
                            true,
                            SharedPrefManager.getInstance().srcType,
                            SharedPrefManager.getInstance().pincode.toString()
                        )
//Resource<Response<SaveMedsCreateEditOrderResponse>>?
                        if (responseCode != null) {
                            if (!responseCode.responseData?.cappingLimitMessage.isNullOrEmpty()){
                                cappingLimitMessage.postValue(Event(responseCode.responseData?.cappingLimitMessage))
                            }
                            if (SharedPrefManager.getInstance().couponModel != null) {
                                applyCoupon(
                                    orderId = SharedPrefManager.getInstance().incompleteOrderId,
                                    offerId = SharedPrefManager.getInstance().offerId,
                                    if (page.equals(
                                            "cart",
                                            true
                                        )
                                    ) ClassNameConstants.CART_ACTIVITY else ClassNameConstants.ORDER_SUMMARY_ACTIVITY
                                )
                                /*saveRemoveCouponCode(
                                    orderId = SharedPrefManager.getInstance().incompleteOrderId,
                                    offerId = SharedPrefManager.getInstance().offerId,
                                    if (page.equals(
                                            "cart",
                                            true
                                        )
                                    ) ClassNameConstants.CART_ACTIVITY else ClassNameConstants.ORDER_SUMMARY_ACTIVITY
                                )

                                 */
                            }
                            fetchCartDetails(initialLoad, page)
                        } else {
                            showInternalServerError.postValue("Internal server error, please try again")
                        }

                    } else {
                        fetchCartDetails(initialLoad, page)
                    }
                }


            }
        } else {
            openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
        }

    }

    private fun addMedicineToCartItemDetails(list: MutableList<MedicineListDetailsSent>, item: MedicineListDetailsSent) {
        if (list.isEmpty()) {
            list.add(item)
        } else {
            var isAdded = false
            for (i in list.indices) {
                val addedItem = list[i]
                if (addedItem.productCode == item.productCode) {
                    isAdded = true
                    break
                }
            }

            if (!isAdded) {
                list.add(item)
            }
        }
    }

    fun fetchCartDetails(initialLoad: Boolean, page: String) {
        if (isNetworkAvailable(context)) {
            if (SharedPrefManager.getInstance().incompleteOrderId == 0L) {
                showLoading.postValue(false)//todo comment this
                loaderValue.postValue(false)
                productList.postValue(Collections.emptyList())
                prescriptions.postValue(Collections.emptyList())
                medicineOgList.postValue(Collections.emptyList())

                return
            }
            if (!initialLoad) {
                loaderValue.postValue(true)
                showShimmerFooter.postValue(true)
            }
            getCustomerOrderDetails(
                SharedPrefManager.getInstance().incompleteOrderId,
                SharedPrefManager.getInstance().loggedInUserId,
                initialLoad,
                if (page.equals(
                        "cart",
                        true
                    )
                ) ClassNameConstants.CART_ACTIVITY else ClassNameConstants.ORDER_SUMMARY_ACTIVITY,
                true
            )
            if (initialLoad) {
//            getAddressData(page)
                if (!page.equals("CART", true))
                    setCouponData()
            }

            if (page == "SUMMARY") {
                viewModelScope.launch(Dispatchers.IO) {
                    getAddressData(page)
                }
            }
        } else {
            openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
        }
//        getMedicineOrderDetailsList(SharedPrefManager.getInstance().incompleteOrderId)
//        getRxForOrder(SharedPrefManager.getInstance().incompleteOrderId)
//        getCartBillDetails(SharedPrefManager.getInstance().incompleteOrderId)

//        getAddressData()
//        getPatientDetails(null, SharedPrefManager.getInstance().loggedInUserId)

//        calculateSubsSaving()

    }

    fun discardOrder() = viewModelScope.launch(Dispatchers.IO) {
        loaderValue.postValue(true)
        if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
            val response = orderFlowUseCase.discardOrder(
                mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId,
                SharedPrefManager.getInstance().loggedInUserId.toLong()
            )
            if (response == 200 || response == 201) {
                localDbUseCase.clearCart()
                showReplaceUndo.postValue(false)
                productList.postValue(Collections.emptyList())
                prescriptions.postValue(Collections.emptyList())
                isDiscardApiCalled = true
                SharedPrefManager.getInstance().autoReplaced = false
                SharedPrefManager.getInstance().isUserSkippedReplace = false
                SharedPrefManager.getInstance().offerId = "0"
                showLoading.postValue(false)
                loaderValue.postValue(false)
                launchEmptyCart.postValue(Event(true))
            }
        }
    }

    /*private fun getReplaceMedicineDtoList(): List<MedicineDto> = runBlocking(Dispatchers.IO) {
        return@runBlocking async {
            if (cartMedicineListResponse.isNullOrEmpty()) {
                val response = orderFlowUseCase.getOrderMedicineDetails(SharedPrefManager.getInstance().incompleteOrderId)
                if (response != null && response.statusCode == 200) {
                    cartMedicineListResponse = response.responseData ?: listOf()
                }
            }
            localDbUseCase.getReplaceMedicineDto(cartMedicineListResponse)
        }.await()
    }*/

    private suspend fun getAddedMedicinesFromCart(
        newOrder: Boolean,
        isReplaceAll: Boolean
    ): List<MedicineDto> =
        localDbUseCase.getCartMedicineDto(cartMedicineListResponse, newOrder, isReplaceAll)

    fun getEditOrderRequestData(productCode: String, qty: Int): List<MedicineDto> =
        runBlocking(Dispatchers.IO) {
            return@runBlocking async {
                if (cartMedicineListResponse.isNullOrEmpty()) {
                    val response =
                        orderFlowUseCase.getOrderMedicineDetails(mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId)

                    //setting mix pannel data here
                    orderMedicineDetailsListData.clear()
                    if (response.responseData != null && response?.responseData?.elasticProductDetails?.size!! > 0) {
                        for (i in 0..response.responseData?.elasticProductDetails?.size!! - 1) {
                            response.responseData?.elasticProductDetails?.get(i)?.product?.let {
                                addMedicineToCartItemDetails(orderMedicineDetailsListData, MedicineListDetailsSent(
                                    it.productCode,
                                    it.skuName
                                ))
                                /*orderMedicineDetailsListData.add(
                                    MedicineListDetailsSent(
                                        it.productCode,
                                        it.skuName
                                    )
                                )*/
                            }
                        }
                    }


                    if (response != null && response.statusCode == 200) {
                        logoUrlList = response.responseData?.logoUrlList ?: listOf()
                        cartMedicineListResponse = response.responseData?.elasticProductDetails ?: listOf()
                    }
                }
                localDbUseCase.getCartMedicineDtoFromProductCode(
                    cartMedicineListResponse,
                    productCode,
                    qty
                )
            }.await()
        }

    private fun getSubsMedList(): List<CartMedicine> = runBlocking(Dispatchers.IO) {
        return@runBlocking async {
            localDbUseCase.getSubsMedicineList()
        }.await()
    }

    private suspend fun saveMedsAndCreateOrder(
        loggedInUserId: String,
        orderId: Long,
        medsList: List<MedicineDto>,
        offerId: String,
        variantId: Long?,
        checkAutoConfirmEligibility: Boolean,
        newAlgo: Boolean,
        srcType: Long,
        pinCode: String
    ): SaveMedsCreateEditOrderResponse? = orderFlowUseCase.saveMedsAndCreateOrder(
        mxInternalErrorOccurred,loggedInUserId,
        orderId,
        medsList,
        offerId,
        variantId,
        checkAutoConfirmEligibility,
        newAlgo,
        srcType,
        pinCode
    )

    private suspend fun replaceMedsForIncompleteOrder(
        loggedInUserId: String, orderId: Long, medsList: List<MedicineDto>, offerId: String,
        checkAutoConfirmEligibility: Boolean, newAlgo: Boolean, srcType: Long, variantId: Long?
    ): SaveMedsCreateEditOrderResponse? = orderFlowUseCase.replaceMedicineForIncompleteOrder(
        mxInternalErrorOccurred,orderId,
        medsList,
        loggedInUserId,
        offerId,
        checkAutoConfirmEligibility,
        newAlgo,
        srcType,
        variantId
    )

//    private fun savePatientId(loggedInUserId: String, orderId: Long, patientId: Long) =
//        viewModelScope.launch(Dispatchers.IO) {
//            async {
//                orderFlowUseCase.tagPatientIdWithOrder(orderId, patientId, loggedInUserId)
//            }.await()
//        }
//
//    private fun saveAddressId(loggedInUserId: String, orderId: Long, addressId: Long) =
//        viewModelScope.launch(Dispatchers.IO) {
//            async {
//                orderFlowUseCase.saveAddressForOrder(orderId, addressId, loggedInUserId)
//            }.await()
//        }

    fun openPDBottomSheetFromOrderSummary(
        item: ProductInfoModel,
        productCode: String,
        isSubs: Boolean = false,
        switchBackSkuName: String? = "",
        eventItem:ProductInfoModel?=null
    ) {
        productCodeForBottomSheet = productCode
        productForBottomSheet = item
        productCodeForBottomSheetIsSubs = isSubs
        switchBackSkuNameForBottomSheetSubs = switchBackSkuName ?: ""
        if (eventItem != null) {
            this.eventProductForBottomSheet=eventItem
            showMessage.postValue(Event(MessageConstant(MESSAGES.OPEN_PD_BOTTOM_SHEET_ORDER_SUMMARY)))
        }
        //showMessage.postValue(Event(MessageConstant(MESSAGES.OPEN_PD_BOTTOM_SHEET_ORDER_SUMMARY)))
    }

    fun editMedicine(
        orderId: Long,
        list: List<MedicineDto>,
        removeMed: Boolean,
        page: String = "",
        switchBackCode: String
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            loaderValue.postValue(true)

            if (list.isEmpty()) return@launch
            var orderDiscarded = false
            val apiResponse = orderFlowUseCase.editMedicine(mxInternalErrorOccurred,orderId, list)
            if (apiResponse != null) {
                    if (!apiResponse.responseData?.cappingLimitMessage.isNullOrEmpty()){
                        cappingLimitMessage.postValue(Event(apiResponse.responseData?.cappingLimitMessage))
                    }
                if (removeMed) {
                    isRemoveCase = true
                    localDbUseCase.deleteCartReplaceStatus(list[0].productCode ?: "")
                    if (list[0].cxAcceptedSubs == true) {
                        /*val subsCode = async { localDbUseCase.getSubsProductCodeAfterDelete(list[0].productCode ?: "") }.await()
                        async { localDbUseCase.removeItemFromCart(subsCode, true) }.await()*/

                        /**
                         * fetch switch back product code from
                         * **/
                        val subsCode =
                            localDbUseCase.getSubsProductCodeAfterDelete(list[0].productCode ?: "")
//                        deleteMedicineFromCart(subsCode ?: "", true)
                        async { localDbUseCase.removeItemFromCart(subsCode ?: "", true) }.await()
//                        async { localDbUseCase.removeOrgSubsMapping(switchBackCode) }.await()
                        Log.e("Cart Subs code", switchBackCode)

                        showReplaceUndo.postValue(false)
                    } else {
                        async {
                            localDbUseCase.removeItemFromCart(
                                list[0].productCode ?: "",
                                false
                            )
                        }.await()
                    }
                    Log.e("Cart Org code", list[0].productCode ?: "")
                    localDbUseCase.removeCrossSellingProductUsingId(list[0].productCode ?: "")
                    //removeOCT(list[0].productCode)

                    //deleteOTCLocalDb(list[0].productCode)
                    eventShowOTCList.postValue(Event(Any()))

                    if (activePage == "SUMMARY") {
                        // deleteMedicineFromCart(selectedMedicineProductCode, false)
                        Log.i("updateCrossSellingList", "" + crossSellingProducts.size)
                        updateCrossSellingList(crossSellingProducts, list[0].productCode ?: "")
                        //updateLastMinuteBuyQty(list[0].productCode?:"",list[0].quantity?:0)

                        if (cartMedicineListResponse.size == 1) {
                            if (prescriptions.value!!.isEmpty()) {
                                //discard order
                                orderDiscarded = true
                                discardOrder()
                                //added now
                                // launchotcList.value.filter {  }OrderSummary.postValue(Event(true))
                            }
                        }

                    } else {
                        if (cartMedicineListResponse.isEmpty()) {
                            if (prescriptions.value!!.isEmpty()) {
                                //discard order
                                orderDiscarded = true
                                discardOrder()
                                //added now
                                // launchOrderSummary.postValue(Event(true))
                            } else {
                                //go to order summary
                                if (((addressIdRx ?: 0) > 0L && (patientIdRx
                                        ?: 0) > 0L && patientsCountRx > 0 && addressCountRx > 0)
                                ) {
                                    launchOrderSummary.postValue(Event(Any()))
                                } else {
                                    launchPrescription.postValue(Event(Any()))
                                }
                                finishActivity.postValue(Event(Any()))
                            }
                        }

                    }


                } else {
                    localDbUseCase.updateMedicineQuantity(
                        list[0].productCode ?: "",
                        list[0].quantity ?: 1
                    )
//                    localDbUseCase.updateOrgAvailable(list[0].productCode ?: "", true)
                    localDbUseCase.updateProductDetailsId(
                        list[0].productCode ?: "",
                        list[0].productDetailsId ?: 0
                    )
                }
//                loaderValue.postValue(false)
                isDelete.postValue(Event(false))
                deleteProductEventListener.postValue(Event(false))

                if (activePage == "CART") {
                    if (apiMedicineList.value!!.size >= 1 || prescriptions.value!!.isNotEmpty()) {
                        if (!orderDiscarded) {
                            fetchCartDetails(false, page)
                        }
                    }
                } else {
                    if (apiMedicineList.value!!.size >= 1 || prescriptions.value!!.isNotEmpty()) {
                        if (!orderDiscarded) {
                            fetchCartDetails(false, page)
                        }
                    }

                }

            } else {
                loaderValue.postValue(false)
                isDelete.postValue(Event(false))
                deleteProductEventListener.postValue(Event(false))
            }

        }
    }

    private fun removeOCT(productCode: String?) {
        otcList.value?.find { it.product.productCode == productCode }?.product?.qty = 0
    }


    private fun getMedicineOrderDetailsList(orderId: Long, className: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val medicineDetails = orderFlowUseCase.getOrderMedicineDetails(mxInternalErrorOccurred,orderId)
            //async { orderFlowUseCase.getOrderMedicineDetails(orderId) }.await()

            //setting mix pannel data here
            orderMedicineDetailsListData.clear()
            if (medicineDetails.responseData != null && medicineDetails?.responseData?.elasticProductDetails?.size!! > 0) {
                for (i in 0..medicineDetails.responseData?.elasticProductDetails?.size!! - 1) {
                    medicineDetails.responseData?.elasticProductDetails?.get(i)?.product?.let {
                        addMedicineToCartItemDetails(orderMedicineDetailsListData, MedicineListDetailsSent(
                            it.productCode,
                            it.skuName
                        ))
                        /*orderMedicineDetailsListData.add(
                            MedicineListDetailsSent(
                                it.productCode,
                                it.skuName
                            )
                        )*/
                    }
                }
            }

            medicineDetails.let {
                if (it.statusCode == 200) {
                    logoUrlList = medicineDetails.responseData?.logoUrlList ?: listOf()
                    cartMedicineListResponse = it.responseData?.elasticProductDetails ?: listOf()

//                    insertDataIntoCart(cartMedicineListResponse)
                    val list = it.responseData?.elasticProductDetails ?: listOf()
                    var isSuccess = true
                    if (activePage == "CART" && !isReplaceAllClicked) {
                        isSuccess = reloadCartList(cartMedicineListResponse)
                    } else {
                        isSuccess = reloadCartList(cartMedicineListResponse)
                    }

                    //getCartBillDetails(SharedPrefManager.getInstance().incompleteOrderId, className)

                    getRxForOrder(SharedPrefManager.getInstance().incompleteOrderId, list.size)

                    getCartBillDetails(SharedPrefManager.getInstance().incompleteOrderId, className)
                    if (!isSuccess) {
                        showInternalServerError.postValue(medicineDetails.message?:"Internal server error, please try again")
                    }
                    if (activePage == "SUMMARY" && SharedPrefManager.getInstance().isReOrder) {
                        eventShowOTCList.postValue(Event(Any()))
                    }
                    showLoading.postValue(false)
                    loaderValue.postValue(false)
                    setMainDataView.postValue(true)

                } else {
                    showInternalServerError.postValue(medicineDetails.message?:"Internal server error, please try again")
                }

            } /*else {
                showLoading.postValue(false)
                productList.postValue(Collections.emptyList())
            }*/
        }
    }


    /*fun getSwitchBackProductInfo(productCode: String) : ProductInfoModel {
        viewModelScope.launch(Dispatchers.IO) {
            val list = getProductDetails(productCode) ?: listOf()
            if (!list.isNullOrEmpty()) {
                return@launch
            }
        }
    }*/


    /*fun getMedicineCount(productCode: String): Int = runBlocking {
        return@runBlocking async {
            localDbUseCase.getAddedQtyOfAddedMedicine(productCode)
        }.await()
    }*/

    /*fun getMedicineCountForCartPage(productCode: String, switchBackCode: String): Int = runBlocking {
        return@runBlocking async {
            localDbUseCase.getAddedQtyOfAddedMedicineBySwitchBackCode(productCode, switchBackCode)
        }.await()
    }*/

    private fun checkAlreadyAddedAsSubs(orgProductCode: String, subsProductCode: String): Boolean =
        runBlocking {
            return@runBlocking async {
                localDbUseCase.checkAlreadyAddedAsSubs(orgProductCode, subsProductCode, false)
            }.await()
        }

    private fun checkAlreadyAddedSubsAsOrg(productCode: String): Boolean = runBlocking {
        return@runBlocking async {
            localDbUseCase.checkAlreadyAddedSubsAsOrg(productCode)
        }.await()
    }

    private fun checkProductAsReplaceInReorder(productCode: String): Boolean = runBlocking {
        return@runBlocking async {
            localDbUseCase.productAsReplaceInReorder(productCode)
        }.await()
    }

    private fun checkProductReplacedInReorder(productCode: String): Boolean = runBlocking {
        return@runBlocking async {
            localDbUseCase.productReplacedInReorder(productCode)
        }.await()
    }

    /*fun getProductDetails(
        productCode: String
    ): List<ProductInfoModel>? = runBlocking {
        loaderValue.postValue(true)
        return@runBlocking async {
            orderFlowUseCase.getSearchResults(
                productCode,
                ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                1
            )
        }.await()
    }*/

    suspend fun getProductDetails(
        productCode: String
    ): SearchResultElasticResponse? {
        loaderValue.postValue(true)
        return orderFlowUseCase.getSearchResults(
            mxInternalErrorOccurred,productCode,
            ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
            1
        )
    }

    fun updateCartMedicineQty(productCode: String, qty: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            orderFlowUseCase.updateCartMedicineCount(productCode, qty)
//            insertDataIntoCart(cartMedicineListResponse)
            reloadCartList(cartMedicineListResponse)
        }
    }

    fun deleteMedicineFromCart(productCode: String, isSubs: Boolean) {
        viewModelScope.launch(Dispatchers.IO) {
            Log.e("removeMediciImpl:::", "aaaa:::" + productCode)
            orderFlowUseCase.deleteMedicineFromCart(productCode, isSubs)
//            insertDataIntoCart(cartMedicineListResponse)
            reloadCartList(apiMedicineList.value!!)
        }
    }

    private suspend fun insertDataIntoCart(list: List<ProductInfoModel>) {

        for (item in list) {
            addMedicinesToCart(
                item.productAsCartItem(false, item.product.qty ?: 1),
                null,
                false
            )

            localDbUseCase.updateOrgAvailable(
                item.product.productCode,
                item.product.availabilityStatus.isNullOrEmpty()
            )

            localDbUseCase.updateProductDetailsId(
                item.product.productCode,
                item.product.productDetailsId ?: 0
            )

            localDbUseCase.updatePrevOrderId(
                item.product.productCode,
                item.product.prevOrderId ?: 0
            )

            localDbUseCase.updatePrevProductDetailsId(
                item.product.productCode,
                item.product.prevOrgProductId ?: 0
            )
        }

        if (SharedPrefManager.getInstance().isReOrder) {
            addSubsMedicineToDB(list)
        }

    }

    suspend fun reloadCartList(list: List<ProductInfoModel>): Boolean {
        var isSuccess = true
        try {
            val resultList = mutableListOf<ProductInfoModel>()
            var sortResultList = mutableListOf<ProductInfoModel>()
            var cartMedicineList = mutableListOf<CartMedicineModel>()
            var unavailableItems = mutableListOf<ProductInfoModel>()

            listUnavailableItems.postValue(mutableListOf())
            if (isFirstTimeCall) isExpanded = false

            outOfStockCount = 0
            notDeliverableCount = 0
            notForSaleCount = 0
//            insertDataIntoCart(list)
            removeMedsWhichAreNotInAPI()

            var cxAcceptedCount = 0
            for (item in list) {
                if (item.product.isOtc) {
                    isOtcAdded = true
                }

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

                addMedicinesToCart(
                    item.productAsCartItem(true, item.product.qty ?: 1),
                    null,
                    false
                )


                localDbUseCase.updateOrgAvailable(
                    item.product.productCode,
                    item.product.availabilityStatus.isNullOrEmpty()
                )

                localDbUseCase.updateProductDetailsId(
                    item.product.productCode,
                    item.product.productDetailsId ?: 0
                )

                localDbUseCase.updatePrevOrderId(
                    item.product.productCode,
                    item.product.prevOrderId ?: 0
                )

                localDbUseCase.updatePrevProductDetailsId(
                    item.product.productCode,
                    item.product.prevOrgProductId ?: 0
                )

                if (item.product.subsFound && item.suggestion != null) {
                    localDbUseCase.updateSubsMedProductCode(
                        item.product.productCode,
                        item.suggestion?.productCode ?: ""
                    )
                }
                item.suggestion?.productCode?.let {
                    item.isSubsAddedToCart = false /*item.suggestion?.let { subsMed ->
                            checkAlreadyAddedAsSubs(
                                subsMed.productCode,
                                it
                            )
                        } ?: false*/
                    item.suggestion?.let { subs ->
//                        val flag = localDbUseCase.checkAlreadyAddedSubsAsOrg(subs.productCode)
//                        subs.qty = localDbUseCase.getAddedQtyOfAddedMedicine(subs.productCode)
                    }

                }

                if (item.product.cxAcceptedSubs) {
                    item.cardType = FullWidthProductCardConstants.CART
                } else {
                    if (item.suggestion != null) {
                        if ((item.suggestion?.qty ?: 0) > 0) {
                            item.cardType = FullWidthProductCardConstants.SUBS_ADDED
                        } else {
                            item.product.subsFound = true
                            item.cardType = FullWidthProductCardConstants.SEARCH
                        }
                    }
                }


                item.product.showRemove = !item.product.availabilityStatus.isNullOrEmpty()
                item.showRemoveButton = !item.product.availabilityStatus.isNullOrEmpty()

                if (item.product.coldStorage && !SharedPrefManager.getInstance().coldChainDeliverable) {
                    item.product.showRemove = true
                    item.product.availabilityStatusWarning =
                        FWPCWarningConstants.WARNING_MODERATE
                    item.product.availabilityStatus = "Delivery Unavailable"
                }

                if (activePage == "CART") {
                    item.isOrgAddedToCart = false
                    item.isReplaced = false//!item.product.switchBackProductCode.isNullOrEmpty()
//                    item.isAutoReplaced =
//                        item.product.cxAcceptedSubs && SharedPrefManager.getInstance().autoReplaced   //item.product.cxAcceptedSubs//SharedPrefManager.getInstance().autoReplaced

                    if (item.product.cxAcceptedSubs) {
                        item.isAutoReplaced =
                            localDbUseCase.isAutoReplace(
                                item.product.switchBackProductCode ?: ""
                            ) > 0
                    }
                    if (item.product.cxAcceptedSubs && item.product.productCode == item.product.switchBackProductCode) {
                        item.isAutoReplaced = false
                    }

                    if (item.cardType == FullWidthProductCardConstants.SUBS_ADDED) {
                        item.isAutoReplaced = false
                    }
                } else {
//                    item.showRemoveButton = !item.product.availabilityStatus.isNullOrEmpty()
                    item.product.showRemoved = false
                    item.isOrgAddedToCart = false
                    item.isReplaced = false
                    item.isAutoReplaced = false
//                    item.product.switchBackProductCode = null
                    val prevOrderId = localDbUseCase.getPrevOrderId(item.product.productCode)
                    if (SharedPrefManager.getInstance().isReOrder) {
                        if (prevOrderId > 0) {
                            /**
                             * This is reorder med and do not show switchback option to this med
                             * **/
                        } else {
                            /**
                             * This is not reorder med i.e added into cart via Search
                             * **/
                            if (item.product.subsFound && item.product.productCode != item.suggestion?.productCode) {
                                item.product.subsFound = true
                                item.cardType = FullWidthProductCardConstants.SEARCH

                            }

                            if (item.product.cxAcceptedSubs) {
                                val swQty = localDbUseCase.getAddedQtyOfAddedMedicine(
                                    item.product.switchBackProductCode ?: ""
                                )
                                if (swQty > 0) item.product.prevOrderId = 1
                            }


                        }
//                        item.product.switchBackProductCode = null
//                        item.isAutoReplaced = true
                    } else {
//                        item.product.switchBackProductCode = null
                        item.product.subsFound = false
                        item.product.prevOrderId = 1
                    }
                    item.product.pricePerUnitLabel = null

                }

                if (!item.product.availabilityStatus.isNullOrEmpty()) {
                    //remove this item
                    item.showRemoveButton = true
                    item.product.showRemove = true
                    item.product.showRemoved = false
                    if (SharedPrefManager.getInstance().isReOrder) {
//                        item.product.subsFound = true
                        item.cardType = FullWidthProductCardConstants.SEARCH
                    } else {
                        if (activePage == "SUMMARY")
                            item.product.subsFound = false
                    }
                    unavailableItems.add(item)
                    if (!item.product.isAvailable) {
                        outOfStockCount += 1
                    }
                    if (item.product.coldStorage && !SharedPrefManager.getInstance().coldChainDeliverable) {
                        unserviceableItemCount += 1
                    }
                    if (!item.product.suppliedByTm) {
                        notForSaleCount += 1
                    }

                }
                /*item.isReplaced = localDbUseCase.productReplacedInReorder(item.product.productCode)
            item.isAutoReplaced = localDbUseCase.productAsReplaceInReorder(item.product.productCode)*/

                /*updateProductDetailsId(
                item.product.productCode,
                item.product.productDetailsId ?: 0
            )*/

                if (item.product.productCode == item.suggestion?.productCode) {
                    item.product.subsFound = false
                }


                if (item.product.qty!! > 0) {
                    var subMedCountInCart = getMedicineCount(item.suggestion?.productCode ?: "")
                    item.isAvailableSubsAddedInCart = subMedCountInCart > 0
                    resultList.add(item)


//                    reorderProductCodes.add(item.product.productCode)
                } else {
                    localDbUseCase.removeItemFromCart(item.product.productCode, false)
                }


                if (item.product.cxAcceptedSubs) cxAcceptedCount++



            }



            //sort list to display withSubsMed first


            sortResultList.addAll(resultList)
            /*localDbUseCase.fetchCartMedicines().let { sequence ->
                sortResultList.clear()
                resultList.forEach { apiList ->
                    if (sequence.indexOf( if (apiList.product.cxAcceptedSubs) apiList.product.switchBackProductCode else apiList.product.productCode) >= 0) {
                        sortResultList.add(apiList.apply {
                            if (this.product.cxAcceptedSubs) {
                                this.sequenceNo = 1000//sequence.indexOf(apiList.product.switchBackProductCode) + 1
                            } else {
                                this.sequenceNo = sequence.indexOf(apiList.product.productCode) + 1
                            }
                        })
                    } else {
                        sortResultList.add(apiList.apply {
                            this.sequenceNo = 1000
                        })
                    }
                }
            }
            sortResultList.sortBy { it.sequenceNo }*/

            
            /*sortResultList.forEach { sortItem ->
                if (sortItem.product.cxAcceptedSubs) {
                    this.
                }
            }*/
            
            
            apiMedicineList.postValue(sortResultList)
            if (listUnavailableItems.value.isNullOrEmpty()) {
                listUnavailableItems.postValue(unavailableItems)
            }

            if (activePage == "CART") {
                var outPutList = processCartList(resultList)
                productList.postValue(outPutList)

                var animateList = prepareAnimationList(resultList) ?: mutableListOf<CartMedicineModel>()
                cartMedItems.postValue(animateList)
            } else {

                sortResultList.filter { !it.product.availabilityStatus.isNullOrEmpty() }.let {

                    itemsNotAvailable.postValue(it.isNotEmpty())
                    itemsNotAvailableCount.postValue(it.size)
                }

                productList.postValue(sortResultList)
            }

            if (activePage != "CART") {
                /**
                 * Summary page
                 * **/

                if (isFirstTimeCall) {
                    isFirstTimeCall = false
                    if (sortResultList.size > 0) {
                        productList.postValue(sortResultList.subList(0, 1))
                    }

                } else {
                    if (isExpanded)
                        productList.postValue(sortResultList)
                    else {
                        /*if (isRemoveCase) {
                        isRemoveCase = false
                        productList.postValue(resultList)
                    } else*/
                        if (sortResultList.size > 1)
                            productList.postValue(sortResultList.subList(0, 1))
                    }
                }
            }

            addSubsMedicineToDB(cartMedicineListResponse)
            if (!isOtcDataRequested) {
                isOtcDataRequested = true
                if (SharedPrefManager.getInstance().isReOrder) {
                    //addSubsMedicineToDB(cartMedicineListResponse)
                    getReorderOtcApi.postValue(Event(Any()))
                }
            }

            SharedPrefManager.getInstance().cxAcceptedCount = cxAcceptedCount

        } catch (ex: Exception) {
            ex.printStackTrace()
            Log.e("MSG", ex.message.toString())
            Log.e("MSG", ex.localizedMessage)
            isSuccess = false
        }
        setCartCount()
        return isSuccess
    }

    @OptIn(ExperimentalCoroutinesApi::class)
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
                orderDetailsData.postValue(it.responseData)
                subsIdEventValue = it.responseData?.subsId ?: 0
                rxRequired = it.responseData?.rxRequired ?: false
                addressCountRx = it.responseData?.addedAddressCount ?: 0
                patientsCountRx = it.responseData?.addedPatientCount ?: 0
                val edd = it.responseData?.edd ?: ""
                SharedPrefManager.getInstance().edd = edd
                val isReorder = it.responseData?.orderReorder ?: false
                
                drCallNeeded.postValue(it.responseData?.drCallRequired)
                phCallNeeded.postValue(if (it.responseData?.drCallRequired == true) false else it.responseData?.pharmacistCallRequired)

                orderTypeId = it.responseData?.orderTypeId
                orderSubsId = it.responseData?.subsId
                isChronicAdded = it.responseData?.chronic
                isGenericAdded = it.responseData?.isGeneric ?: false

                if (initialLoad) {
                    /** methods are called in async scope because if you remove async it wont work as variables are not getting values */
                    if (addressCountRx == 1 && patientsCountRx == 1) {
                        val patient = async {
                            userUseCase.getAllPatients(
                                mxInternalErrorOccurred, true,
                                SharedPrefManager.getInstance().loggedInUserId.toLong()

                            )
                        }
                        patient.await()

                        val address = async {
                            userUseCase.getAllAddresses(
                                mxInternalErrorOccurred,
                                customerId.toLong()
                            )
                        }
                        address.await()

                        addressIdRx = address.getCompleted()?.first()?.addressId ?: 0
                        patientIdRx = patient.getCompleted()?.PatientList?.first()?.patientId ?: 0
                        SharedPrefManager.getInstance().patientId = patientIdRx
                        SharedPrefManager.getInstance().addressId = addressIdRx

                        savePatientId(
                            SharedPrefManager.getInstance().loggedInUserId,
                            orderId,
                            patientIdRx
                        )

                        val res: Int? = saveAddressId(
                            SharedPrefManager.getInstance().loggedInUserId,
                            orderId,
                            addressIdRx
                        )
                        if(res == 0) {
                            SharedPrefManager.getInstance().address =
                                address.getCompleted()?.first()?.clubbedAddress
                            SharedPrefManager.getInstance().selectedCity =
                                address.getCompleted()?.first()?.cityName
                            SharedPrefManager.getInstance().selectedState =
                                address.getCompleted()?.first()?.stateName

                            SharedPrefManager.getInstance().addressType =
                                address.getCompleted()?.first()?.addressType
                            SharedPrefManager.getInstance().pincode =
                                address.getCompleted()?.first()?.pincode?.toInt() ?: "400079".toInt()
                            SharedPrefManager.getInstance().addressId =
                                address.getCompleted()?.first()?.addressId
                            SharedPrefManager.getInstance().newSelectedPinCode = false
                        }
                    } else if (patientsCountRx == 1) {
                        async { autoSelectPatient(orderId) }.await()
                    } else if (addressCountRx == 1) {
                        async { autoSelectAddress(customerId, orderId) }.await()
                    }

                    if (!SharedPrefManager.getInstance().newSelectedPinCode && it.responseData?.addressId == SharedPrefManager.getInstance().addressId) {
                        /**
                         * Selected and Received address id matched
                         * **/

                    } else if(!isReorder){
                        /**
                         * Selected and Received address id mis matched
                         * **/
                        if (!SharedPrefManager.getInstance().newSelectedPinCode && SharedPrefManager.getInstance().addressId > 0) {
                            val saveAddressStatus = saveAddressId(
                                SharedPrefManager.getInstance().loggedInUserId,
                                orderId,
                                SharedPrefManager.getInstance().addressId
                            )
                            if (saveAddressStatus != NetworkResponseType.SUCCESS.ordinal) {
                                isServiceable.postValue(PinCodeServiceability.NOT_SERVICEABLE)
                                paymentContainerModel.address = SharedPrefManager.getInstance().address
                                paymentContainerModel.pinCode = SharedPrefManager.getInstance().pincode.toString()
                                paymentContainerModel.addressType = progressStringToLimit(SharedPrefManager.getInstance().addressType ?: "", 9)
                                SharedPrefManager.getInstance().addressType = ""
                                pincode.postValue("")
                                isOrderAddressServiceable.postValue(false)
                                paymentContainerModel.unserviceableMessage =
                                    context.getString(R.string.txtUnServiceableAddress)
                                stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                            }
                        } else {
                            paymentContainerModel.deliveryByLabel = ""
                            paymentContainerModel.deliveryDate = ""
                            paymentContainerModel.addressType = ""
                            paymentContainerModel.changeButtonLabel = "Add Address"

                            stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                            /**
                             * Add Address button should be displayed
                             * **/

                        }
                    }


                    if (it.responseData?.patientId == SharedPrefManager.getInstance().patientId) {
                        /**
                         * Selected and Received patient id matched
                         * **/

                    } else {
                        /**
                         * Selected and Received patient id mis matched
                         * **/
                        if (!isReorder && SharedPrefManager.getInstance().patientId > 0) {
                            savePatientId(
                                SharedPrefManager.getInstance().loggedInUserId,
                                orderId,
                                SharedPrefManager.getInstance().patientId
                            )
                        } else {
                            /**
                             * Add delivery details button should be displayed
                             * **/
                        }
                        //todo reorder cross selling not visible

                    }
                }

                val allAddress = cartUseCase.getAllAddress(
                    mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
                    SharedPrefManager.getInstance().incompleteOrderId
                )


                allAddress?.let { item ->
                    if(!item.responseData.isNullOrEmpty()){
                        with(item.responseData[0]){
                            this@CartViewModel.address.postValue(clubbedAddress)
                            this@CartViewModel.paymentContainerModel.address = clubbedAddress ?: ""
                            this@CartViewModel.paymentContainerModel.pinCode = pincode ?: ""
                            this@CartViewModel.paymentContainerModel.addressType = progressStringToLimit(addressType ?: "", 9)
                            SharedPrefManager.getInstance().addressType = addressType
                            this@CartViewModel.pincode.postValue(pincode)
                            this@CartViewModel.paymentContainerModel.changeButtonLabel = "Change"
                            this@CartViewModel.paymentContainerModel.deliveryByLabel = "Delivery by "
                            this@CartViewModel.stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                            if (pincode != null) {
                                fetchPinCode(pincode)
                            }
                            this@CartViewModel.selectedAddress.addressType = addressType
                            this@CartViewModel.selectedAddress.cityName = cityName
                            this@CartViewModel.selectedAddress.stateName = stateName
                            this@CartViewModel.selectedAddress.pincode = pincode
                        }
                    }
                }




                val patientDetails = orderFlowUseCase.getOrderPatientDetails(
                    mxInternalErrorOccurred,
                    SharedPrefManager.getInstance().incompleteOrderId,
                    SharedPrefManager.getInstance().loggedInUserId
                )

                patientDetails?.let { item ->
                    if(item.responseData?.isNotEmpty() == true){
                        with(item.responseData!![0]){
                            this@CartViewModel.patientName.postValue(patientName)
                            SharedPrefManager.getInstance().patientName = patientName ?: ""
                            this@CartViewModel.patientId.postValue(patientId ?: 0)
                            this@CartViewModel.patientAge.postValue(age)
                            this@CartViewModel.patientGender.postValue(gender)
                            this@CartViewModel.patientType.postValue(relationName)
                            this@CartViewModel.paymentContainerModel.patientName =
                                progressStringToLimit(patientName.toString(), 18)
                            this@CartViewModel.stickyPaymentDataPlaceOrder.postValue(this@CartViewModel.paymentContainerModel)
                        }
                    }
                }






                patientId.postValue(it.responseData?.patientId ?: 0)
                addressId.postValue(it.responseData?.addressId ?: 0)
                addressIdRx = it.responseData?.addressId ?: addressIdRx
                patientIdRx = it.responseData?.patientId ?: patientIdRx

                if ((it.responseData?.patientId ?: 0) == 0L &&
                    SharedPrefManager.getInstance().patientId > 0L
                ) {
                    patientIdRx = SharedPrefManager.getInstance().patientId

//                    savePatientId(
//                        SharedPrefManager.getInstance().loggedInUserId,
//                        orderId,
//                        patientIdRx
//                    )
                }
                if ((it.responseData?.addressId ?: 0) == 0L &&
                    SharedPrefManager.getInstance().addressId > 0L
                ) {

                    addressIdRx = SharedPrefManager.getInstance().addressId

//                    saveAddressId(
//                        SharedPrefManager.getInstance().loggedInUserId,
//                        orderId,
//                        addressIdRx
//                    )
                }

                /**
                 * If the order type is Reorder the assign the selected patient and address to that order
                 *
                 * **/

                
                SharedPrefManager.getInstance().setIsReOder(isReorder)//
                // SharedPrefManager.getInstance().setIsReOder(true)
                if (isReorder) {
                    SharedPrefManager.getInstance().patientId = it.responseData?.patientId ?: patientIdRx
                    SharedPrefManager.getInstance().addressId = it.responseData?.addressId ?: addressIdRx
                    val addressAvailable = getAddressData("SUMMARY")
                    if (addressAvailable) {
                        /**
                         * Address available for this reorder
                         * **/
                        patientId.postValue(it.responseData?.patientId ?: 0)
                        addressId.postValue(it.responseData?.addressId ?: 0)

                        //in case of single address and patient
                        if (initialLoad) {
                            if (if(addressCountRx == 1) addressIdRx > 0 else it.responseData?.addressId != null) {

                            } else {
                                /**
                                 * If API returns null response
                                 * **/
                                SharedPrefManager.getInstance().addressType = ""
                                SharedPrefManager.getInstance().edd = ""
            
                                paymentContainerModel.deliveryByLabel = ""
                                paymentContainerModel.deliveryDate = ""
                                paymentContainerModel.addressType = ""
                                paymentContainerModel.changeButtonLabel = "Add Address"
            
                                stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                            }
                        }
                    } else {
                        /**
                         * address deleted for this reorder
                         * **/
                        if(addressCountRx == 1){
                            async { autoSelectAddress(customerId, orderId) }.await()

                            this@CartViewModel.address.postValue(SharedPrefManager.getInstance().address)
                            this@CartViewModel.paymentContainerModel.address =  SharedPrefManager.getInstance().address ?: ""
                            this@CartViewModel.paymentContainerModel.pinCode = SharedPrefManager.getInstance().pincode.toString() ?: ""
                            this@CartViewModel.paymentContainerModel.addressType = progressStringToLimit( SharedPrefManager.getInstance().addressType ?: "", 9)
                            SharedPrefManager.getInstance().addressType =  SharedPrefManager.getInstance().addressType
                            this@CartViewModel.pincode.postValue(SharedPrefManager.getInstance().pincode.toString())
                            this@CartViewModel.paymentContainerModel.changeButtonLabel = "Change"
                            this@CartViewModel.paymentContainerModel.deliveryByLabel = "Delivery by "
                            this@CartViewModel.stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                        } else {
                            SharedPrefManager.getInstance().addressId = -1
                            SharedPrefManager.getInstance().addressType = ""
                            SharedPrefManager.getInstance().edd = ""

                            paymentContainerModel.deliveryByLabel = ""
                            paymentContainerModel.deliveryDate = ""
                            paymentContainerModel.addressType = ""
                            paymentContainerModel.changeButtonLabel = "Add Address"

                            stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                        }
                    }

                    /**
                     * Reorder block ends
                     * **/


                }

                if (callFetchMeds) {
                    getMedicineOrderDetailsList(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        className
                    )
                } else {
                    loaderValue.postValue(false)
                }
                updateProceedButtonText()
            }
        }
    }

    private suspend fun getRxForOrder(orderId: Long, medicineCount: Int) {
        if (orderId > 0) {
            //viewModelScope.launch(Dispatchers.IO) {
            val response = orderFlowUseCase.getOrderRx(mxInternalErrorOccurred,orderId)//async {  }.await()
            response?.let {
                if (!response.responseData.rxReqProductList.isNullOrEmpty()) {
                    medicineOgList.postValue(response.responseData.rxReqProductList)
                    Log.d("TAG", "getPrescriptionImages: ${medicineOgList.value}")
                }

                val listTemp = it.responseData?.rxList ?: listOf()
                prescriptionUploadedCount2=response.responseData?.rxList?.size?:0

                if (listTemp.isNotEmpty()) {
                    var finalList = mutableListOf<OrderRxInfo>()
                    finalList.add(
                        OrderRxInfo(
                            SharedPrefManager.getInstance().incompleteOrderId,
                            null,
                            null
                        )
                    )
                    finalList.addAll(listTemp)


                    // added below 2 lines to clear previous list
                    if (!isFirstTimeCall) {
                        prescriptionList.postValue(emptyList())
                        list.clear()
                        list.add("add_more_prescription")

                        // finalList?.map {
                        listTemp?.map { orderRxInfo ->
                            orderID = orderRxInfo.orderId.toString()
                            list.add(orderRxInfo.imageUrl ?: "")
                        }

                        prescriptionList.postValue(list.toList())
                        isFirstTimeCall = false
                    }


                    /*if(cartItemCount.value == 0 && finalList.size == 0) {
                        SharedPrefManager.getInstance().couponModel?.let {
                            removeCoupon()
                        }
                    }*/

                    prescriptions.postValue(finalList.toList())
                    SharedPrefManager.getInstance().prescriptionCount = listTemp.size
                    loaderValue.postValue(false)
                    if (response.responseData.rxReqProductList.isNotEmpty()) {
                        medicineOgList.postValue(response.responseData.rxReqProductList)
                    }
                } else {


                    /* if(!isFirstTimeCall) {
                    prescriptionList.postValue(emptyList())
                    list.clear()
                    list.add("add_more_prescription")

                    prescriptionList.postValue(list)
                    isFirstTimeCall=true
                }*/


                    prescriptions.postValue(emptyList())
//                        medicineOgList.postValue(emptyList())
                    loaderValue.postValue(false)
                }
                if (cartMedicineListResponse.isEmpty() && listTemp.isNotEmpty()) {
                    if (((addressIdRx ?: 0) > 0L && (patientIdRx
                            ?: 0) > 0L && patientsCountRx > 0 && addressCountRx > 0)
                    ) {
                        launchOrderSummary.postValue(Event(Any()))
                    } else {
                        launchPrescription.postValue(Event(Any()))
                    }
                    finishActivity.postValue(Event(Any()))
                } else if (cartMedicineListResponse.isEmpty() && listTemp.isNullOrEmpty()) {
                    discardOrder()
                }
            }
            //}
        }
    }

    fun getPatientDetails(orderId: Long?, customerId: String) {//
        viewModelScope.launch(Dispatchers.IO) {
            val response =
                async { orderFlowUseCase.getOrderPatientDetails(mxInternalErrorOccurred,orderId, customerId) }.await()
            response?.let {
                if (it.responseData?.isEmpty() == true) {
                    patientsCount = 0
                } else {
                    if (it.responseData != null) {
                        val selectedPatientId = it.responseData?.get(0)?.patientId
                            ?: 0L /* TODO SharedPrefManager.getInstance().patientId = -1*/
                        if (selectedPatientId > 0) {

                            for (item in it.responseData!!) {
                                if (item.patientId == selectedPatientId) {
                                    patientName.postValue(item.patientName)
                                    SharedPrefManager.getInstance().patientName = item.patientName ?: ""
                                    patientId.postValue(item.patientId ?: 0)
                                    patientAge.postValue(item.age)
                                    patientGender.postValue(item.gender)
                                    patientType.postValue(item.relationName)
                                    paymentContainerModel.patientName =
                                        progressStringToLimit(item.patientName.toString(), 18)
                                    stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                                    break
                                }
                            }

                        } else {
                            /**
                             * No selected patient found in session
                             * **/
                            patientsCount = it.responseData!!.size
                        }
                    }
                }
            }

        }
    }

    fun setUpPaymentContainer(
        lastPaymentMethod: String, lastPaymentMethodId: Long,
        lastPaymentMethodIconUrl: String
    ) {
        if (lastPaymentMethod.isNullOrEmpty()) {
//                    || lastPaymentMethod.equals("COD") ||
//                    lastPaymentMethod.equals("Cash on delivery"))) {

            paymentContainerModel.btnTitle = "Select payment mode"
            if (productList.value?.size!! > 0) {
                paymentContainerModel.paymentContainerType = PaymentContainerType.SELECT_PAYMENT
//                    } else if (prescriptions.value?.size!! > 0) {
            } else {
                paymentContainerModel.paymentContainerType = PaymentContainerType.RX_SELECT_PAYMENT
            }
//                    paymentContainerModel.payUsingLabel = "Pay Using"

        } else {
            paymentContainerModel.btnTitle = "Place Order"
            paymentContainerModel.paymentMode = lastPaymentMethod
            paymentContainerModel.paymentMethodIconUrl = lastPaymentMethodIconUrl
            if (productList.value?.size!! > 0) {
                paymentContainerModel.paymentContainerType = PaymentContainerType.PLACE_ORDER
//                    } else if (prescriptions.value?.size!! > 0) {
            } else {
                paymentContainerModel.paymentContainerType = PaymentContainerType.RX_PLACE_ORDER
            }

            //if (!SharedPrefManager.getInstance().selectedPaymentMethod.isNullOrEmpty()) {
            selectedPaymentMethod =
                lastPaymentMethod
            selectedPaymentMethodId = lastPaymentMethodId
            selectedPaymentMethodIconUrl =
                lastPaymentMethodIconUrl
            if (selectedPaymentMethod == "Cash on delivery") {
                SharedPrefManager.getInstance().setPaymentSelectedMode(-1)
            }
            //}


        }

        stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
    }

    suspend fun getCartBillDetails(orderId: Long, className: String) {
        showShimmerFooter.postValue(true)
        orderFlowUseCase.calculateBillDetailsforApp(mxInternalErrorOccurred,orderId, true).let { bill ->


                try {
                if (bill != null) {
                    if (bill.responseData == null) {
                        billDetails.postValue(null)
                        return@let
                    }
                    billDetailsResponse = bill.responseData
                    mrpEventValue = bill.responseData.mrp ?: 0.0
                    salesPriceEventValue = bill.responseData.sellingPrice ?: 0.0
                    mrpEventValueFromBaseVM = bill.responseData.mrp ?: 0.0
                    salesPriceEventValueFromBaseVM = bill.responseData.sellingPrice ?: 0.0

//                    SharedPrefManager.getInstance().isPspViewed = bill.responseData.pspViewed

                    if (!medList.value.isNullOrEmpty())
                        addMoreForFreeDelivery.postValue(bill.responseData.addMoreForFreeDelivery)

                    //if only prescriptions is there then do not remove coupon against minCartValue
                    if (!((SharedPrefManager.getInstance().prescriptionCount > 0) && bill.responseData.mrp == 0.0)) {
                        //note:- if min coupon value is greater then selling price remove coupon
                        SharedPrefManager.getInstance().couponModel?.minCartValue?.let {
                            if ((bill.responseData.sellingPrice
                                    ?: 0.0) < (it) || bill.responseData.couponCode == null
                            ) {
                                Log.e("removeCouponApi", it.toString())
                                removeCouponApi.postValue(Event(Any()))
                            }
                        }
                    }
                    SharedPrefManager.getInstance().accountTmCredit =(bill.responseData.tmCredit?:0f).toFloat()
                    SharedPrefManager.getInstance().setCurrentOrderAmountDetails(
                        (bill.responseData.tmCash ?: 0.0).toFloat(),
                        (bill.responseData.tmCredit ?: 0.0).toFloat(),
                        (bill.responseData.deliveryCharge ?: 0.0).toFloat(),
                        // (it.couponDiscountAmt ?: 0.0).toFloat(),
                        (bill.responseData.couponAppliedAmt ?: 0.0).toFloat(),
                        (bill.responseData.packagingCharge ?: 0.0).toFloat(),
                        (bill.responseData.payableAmt ?: 0.0).toFloat(),
                        (bill.responseData.couponDiscountAmt ?: 0.0).toFloat(),
                        (bill.responseData.discount ?: 0.0).toFloat(),
                        (bill.responseData.mrp ?: 0.0).toFloat()
    
                    )
    
                    
                    var strikePackagingCharge = 0.0
                    bill.responseData.packagingCharge?.let {
                        strikePackagingCharge = 3 * it
                    }
                    val saveOrderMsg = bill.responseData.savingsText ?: ""

                    /*                  if(bill.responseData.savingValue!= null && bill.responseData.savingValue!! > 50){
                                            saveOrderMsg = "You have already saved ₹${bill.responseData.savingValue} on your order!"
                                        } else{
                                            saveOrderMsg = ""
                                        }*/
                    val billData: BillDetailsModel = convertToBillDetails(
                        bill.responseData,
                        "Bill Details",
                        totalPayable = bill.responseData.payableAmt.toString(),
                        gst = context.getString(R.string.gst),
                        sellerPackagingCharge = context.getString(R.string.seller_packaging_charges),
                        "₹" + bill.responseData.savingValue.toString(),
                        saveOrderMsg,
                        strikePackagingCharge,
                        if (activePage == "CART") className else ClassNameConstants.ORDER_SUMMARY_ACTIVITY
                    )
                    Log.d("qwerty", "Bill Details : ${Gson().toJson(billData)}")


                    billDetails.postValue(billData)

                    bill.responseData.mrp?.let { mrp.postValue(it) }
                    bill.responseData.discount?.let { discount.postValue(it) }
                    deliveryChargeMessage.postValue(billData.deliveryChargeMessage)

                    //this code is commented from here bcoz it is already managed somewhere else
                    /*  if (!bill.responseData.couponCode.isNullOrEmpty()) {
                          appliedCouponName.postValue(bill.responseData.couponCode + " applied")
                      }*/

                    bill.responseData.deliveryCharge?.let { isFreeDelivery.postValue(it == 0.0) }

                    paymentContainerModel.deliveryDate =
                        SharedPrefManager.getInstance().edd ?: ""
                    /*if (SharedPrefManager.getInstance().addressId > 0) {
                        paymentContainerModel.deliveryDate =
                            SharedPrefManager.getInstance().edd ?: ""
                    } else {
                        paymentContainerModel.deliveryDate = ""
                    }*/
                    deliveryDate.postValue(paymentContainerModel.deliveryDate)

                    sellingPriceWithSubs.postValue(bill.responseData.sellingPriceWithSubs)
                    paymentMethod.postValue(
                        bill.responseData.paymentSelectionInfo?.paymentMethod ?: ""
                    )

                    if(!SharedPrefManager.getInstance().selectedPaymentMethod.isNullOrEmpty()
                        && SharedPrefManager.getInstance().selectedPaymentMethod=="Cash on delivery"
                        && bill.responseData.restrictedPaymentType == null){
                        selectedPaymentMethod = SharedPrefManager.getInstance().selectedPaymentMethod
                        selectedPaymentMethodId = SharedPrefManager.getInstance().selectedPaymentMethodId
                        selectedPaymentMethodIconUrl = SharedPrefManager.getInstance().selectedPaymentMethodIconUrl

                    } else {
                        if (bill.responseData.paymentSelectionInfo?.paymentMethod.isNullOrEmpty()) {
                            selectedPaymentMethod =
                                bill.responseData.paymentSelectionInfo?.lastPaymentMethod ?: ""
                        } else {
                            selectedPaymentMethod =
                                bill.responseData.paymentSelectionInfo?.paymentMethod ?: ""
                        }

                        Log.i("selectedPaymentMethod", selectedPaymentMethod)

                        if (bill.responseData.paymentSelectionInfo?.paymentMethodId != null) {
                            selectedPaymentMethodId =
                                bill.responseData.paymentSelectionInfo?.paymentMethodId?.toLong()
                                    ?: 0L
                        } else {
                            selectedPaymentMethodId =
                                bill.responseData.paymentSelectionInfo?.lastPaymentMethodId?.toLong()
                                    ?: 0L
                        }

                        Log.i("selectedPaymentMethodId", "" + selectedPaymentMethodId)

                        if (bill.responseData.paymentSelectionInfo?.paymentMethodIconUrl.isNullOrEmpty()) {
                            selectedPaymentMethodIconUrl =
                                bill.responseData.paymentSelectionInfo?.lastPaymentMethodIconUrl
                                    ?: ""
                        } else {
                            selectedPaymentMethodIconUrl =
                                bill.responseData.paymentSelectionInfo?.paymentMethodIconUrl ?: ""
                        }

                        Log.i("selectedPaymentUrl", selectedPaymentMethodIconUrl)
                    }




                    if (SharedPrefManager.getInstance().selectedPaymentMethodId == -1L) {
                        SharedPrefManager.getInstance().selectedPaymentMethod =
                            selectedPaymentMethod
                        SharedPrefManager.getInstance().selectedPaymentMethodId =
                            selectedPaymentMethodId
                        SharedPrefManager.getInstance().selectedPaymentMethodIconUrl =
                            selectedPaymentMethodIconUrl
                    }
                    Log.i("::selectedMethod", selectedPaymentMethod)
                    Log.i("::selectedMethodId", "" + selectedPaymentMethodId)
                    paymentModeSelected.postValue(bill.responseData.paymentMode.toString())
                    paymentContainerModel.paymentMode =
                        bill.responseData.paymentSelectionInfo?.lastPaymentMethod
                            ?: ""

                    if (bill.responseData.paymentMode.toString() == "Online") {
                        SharedPrefManager.getInstance().setPaymentSelectedMode(16)
                    } else if (!bill.responseData.paymentSelectionInfo?.lastPaymentMethod.isNullOrEmpty()) {
                        SharedPrefManager.getInstance().setPaymentSelectedMode(16)
                    } else {
                        SharedPrefManager.getInstance().setPaymentSelectedMode(17)
                    }

                    paymentContainerModel.payableAmount = bill.responseData.payableAmt ?: 0.0
                    paymentContainerModel.paymentMode = bill.responseData.paymentSelectionInfo?.lastPaymentMethod ?: ""

                    /*if (SharedPrefManager.getInstance().selectedPaymentMethod.isNullOrEmpty()) {
                        if (bill.responseData.paymentSelectionInfo?.paymentMethod != null &&
                            bill.responseData.paymentSelectionInfo?.paymentMethod.isNullOrEmpty()
                        )
                            SharedPrefManager.getInstance()
                                .setSelectedPaymentMethod(bill.responseData.paymentSelectionInfo?.paymentMethod!!)


                        if (bill.responseData.paymentSelectionInfo?.paymentMethodIconUrl != null &&
                            bill.responseData.paymentSelectionInfo?.paymentMethodIconUrl.isNullOrEmpty()
                        )
                            SharedPrefManager.getInstance().selectedPaymentMethodIconUrl =
                                bill.responseData.paymentSelectionInfo?.paymentMethodIconUrl!!
                        if (bill.responseData.paymentSelectionInfo?.paymentMethodId != null)
                            SharedPrefManager.getInstance().selectedPaymentMethodId =
                                bill.responseData.paymentSelectionInfo?.paymentMethodId!!.toLong()

                    }
                    if (SharedPrefManager.getInstance().selectedPaymentMethod.isNotEmpty()) {
                        setUpPaymentContainer(
                            SharedPrefManager.getInstance().selectedPaymentMethod,
                            SharedPrefManager.getInstance().selectedPaymentMethodIconUrl
                        )
                    } else*/
                    if (SharedPrefManager.getInstance().couponModel != null &&
                        SharedPrefManager.getInstance().couponModel.paymentMethods != null
                    ) {
                        val couponModel = SharedPrefManager.getInstance().couponModel
                        setUpPaymentContainer(
                            couponModel.paymentMethods!![0].iconType,
                            couponModel.paymentMethods!![0].paymentMethodId,
                            couponModel.paymentMethods!![0].iconPath
                        )
                    } else {


                        setUpPaymentContainer(
                            selectedPaymentMethod,
                            selectedPaymentMethodId,
                            selectedPaymentMethodIconUrl
                        )
                    }

//                if(bill.responseData.paymentSelectionInfo?.paymentSpecificCouponApplied != null)
//                    SharedPrefManager.getInstance().setIsPaymentSpecificCouponApplied(bill.responseData.paymentSelectionInfo?.paymentSpecificCouponApplied)

                    if (bill.responseData.restrictedPaymentType != null && bill.responseData.restrictedPaymentType == 16) {
                        restrictCod.postValue(true)
                        addMoreForCod.postValue(bill.responseData.addMoreForCod)
                        if (bill.responseData.addMoreForCod <= 0) {
                            restrictCod.postValue(true)
                        }

                        if (SharedPrefManager.getInstance().selectedPaymentMethod == "Cash on delivery") {
                            SharedPrefManager.getInstance().setPaymentSelectedMode(-1)
                            SharedPrefManager.getInstance().selectedPaymentMethod = ""
                            SharedPrefManager.getInstance().selectedPaymentMethodId = -1L
                            SharedPrefManager.getInstance().selectedPaymentMethodIconUrl = ""
                        }
                    } else {

                        restrictCod.postValue(false)
                        addMoreForCod.postValue(0.0)
                    }

//                paymentContainerModel.deliveryDate = "19th Test 2024"


                    payUsing.postValue("Pay using")
                    if (!bill.responseData.payableAmt.toString().isNullOrEmpty()) {
                        total.postValue(
                            if (bill.responseData.payableAmt.toString()
                                    .split(".")[1].length == 1
                            ) bill.responseData.payableAmt.toString() + "0" else bill.responseData.payableAmt.toString()
                        )
                    }

                    var replaceableMedList = mutableListOf<ProductInfoModel>()
                    for (item in cartMedicineListResponse) {
                        if (!item.product.cxAcceptedSubs && item.suggestion != null && !item.product.cxKeepOriginal) {
                            val addedQty =
                                localDbUseCase.getAddedQtyOfAddedMedicine(item.suggestion?.productCode!!)
                            if (addedQty == 0) {
                                replaceableMedList.add(item)
                            }
                        }
                    }

                    /*showLoading.postValue(false)
                    loaderValue.postValue(false)*/

                    replaceAllModel = ReplaceAllBottomSheetModel(
                        bill.responseData.mrp ?: 0.0,
                        bill.responseData.payableAmt ?: 0.0,
                        bill.responseData.payableAmt ?: 0.0,
                        bill.responseData.sellingPriceWithSubs ?: 0.0,
                        replaceableMedList.toList(),
                        "${bill.responseData.savingPercentageWithSubs ?: 0.0}%",
                        logoUrlList
                    )
                    savingPercentageWithSubs = bill.responseData.savingPercentageWithSubs

                    stickyPaymentDataPlaceOrder.postValue(paymentContainerModel)
                    /*try {
                        val json = Gson().toJson(bill.responseData)
                        billResponseData = Gson().fromJson(json.toString(), CartBillDetails::class.java)
                    } catch (ex: java.lang.Exception) {

                    }*/
    

                    if (SharedPrefManager.getInstance().autoReplaced && showReplaceUndo.value == true && !subsReplaceTriggered) {
                        getOgSubSkuName()
                        sdkEventUseCase.sendSubstituteReplaceClickedEvent(
                            MxSubstituteReplaceClicked(
                                formatDecimal(bill?.responseData?.couponAppliedAmt ?: 0.0).toDouble(),
                                bill?.responseData?.deliveryCharge,
                                bill?.responseData?.discount,
                                bill?.responseData?.payableAmt,
                                false,
                                true,
                                productOgSkuName,
                                bill?.responseData?.mrp,
                                bill?.responseData?.orderId.toString(),
                                bill?.responseData?.packagingCharge,
                                formatDecimal(cartReplaceAll.value?.totalReplaceSavings ?: 0.0).toDouble(),
                                formatDecimal(cartReplaceAll.value?.totalReplaceSavings ?: 0.0).toDouble(),
                                subsReplaceCount,
                                subsReplaceCount,
                                productOgSkuName,
                                suggestionSkuName,
                                bill?.responseData?.tmCredit,
                                bill?.responseData?.tmCash,
                                cashHandlingCharge =  if(bill.responseData.pspViewed) bill.responseData.cashHandlingInfo?.charge else null,
                                cashHandlingChargeApplicable = if(bill.responseData.pspViewed) getApplicableCashHandlingCharger(bill.responseData) else null
                            )
                        )
                        subsReplaceTriggered = true
                    }

                    calculateSubsSaving()
                    
                    if (!cartViewedTrigger) {
                        eventPageViewed()
                    }
//                    delay(500)
                    showShimmerFooter.postValue(false)
                    showShimmerPayUsing.postValue(false)

                    if (actionType == "coupon_page") {
                        openCouponPageFromDeepLink.postValue(Event(Any()))
                    }

                } else {
//                    delay(500)
                    showShimmerFooter.postValue(false)
                    showShimmerPayUsing.postValue(false)

                }
            } catch (e: Exception) {
//                delay(500)
                    showShimmerFooter.postValue(false)
                    showShimmerPayUsing.postValue(false)

                }


            if (callReorderEvent && reorder_button_click == BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED) {
                sdkEventUseCase.sendReorderClickedEventToCleverTap(CtReorderClicked(clickedOnPage, bill?.responseData?.mrp,
                    bill?.responseData?.discount, bill?.responseData?.couponDiscountAmt, bill?.responseData?.tmCredit,
                    bill?.responseData?.tmCash.toString(), bill?.responseData?.payableAmt, bill?.responseData?.savingValue))
                callReorderEvent = false;
            }

        }
    }


    /*fun uploadImage(byteArray: ByteArray, uploadedPrescriptionId: Int, prevOrderId: Int) {
        loaderValue.postValue(true)
        viewModelScope.launch {
            val request = ImageUploadRequest(fileName = "IMG${System.currentTimeMillis()}")
            if (uploadedPrescriptionId != -1) {
                if (uploadedPrescriptionId == 0) {
                    val imgString =
                        "data:image/jpeg;base64," + Base64.encodeToString(byteArray, Base64.NO_WRAP)
                    request.image = imgString
                } else {
                    request.imageId = uploadedPrescriptionId.toString()

                    if (prevOrderId.toLong() != -1L) {
                        request.prevOrderId = prevOrderId.toString()
                    }
                }
                request.orderId = orderID
            }
            val response = orderFlowUseCase.uploadImage(
                SharedPrefManager.getInstance().incompleteOrderId,
                SharedPrefManager.getInstance().loggedInUserId,
                request,
                true
            )
            Log.d("TAG", "uploadImage: $response")
            loaderValue.postValue(false)
            response?.ImageUrl?.let {
                SharedPrefManager.getInstance().incompleteOrderId = response.OrderId
                list.add(it)
                prescriptionList.postValue(list)
                getRxForOrder(SharedPrefManager.getInstance().incompleteOrderId, 2)
            }
        }

    }
*/
    /*
        fun getPrescriptionImages(orderId: Long) = viewModelScope.launch {
    //        loaderValue.postValue(true)
            val response = orderFlowUseCase.getPrescriptionImages(orderId)
            response?.responseData?.map {
                orderID = it.orderId.toString()
                list.add(it.imageUrl)
                prescriptionList.postValue(list)
            }
            loaderValue.postValue(false)
        }
    */


    private fun addMedicinesToCart(
        cartMedicine: CartMedicine,
        orgSubsInfo: OrgSubsInfo?,
        isSubs: Boolean
    ) = viewModelScope.launch(Dispatchers.IO) {
        val count = async { getMedicineCount(cartMedicine.medicineId) }.await()
        if (count == 0) {
            async { localDbUseCase.addToCart(cartMedicine, orgSubsInfo, isSubs) }.await()
        } else {
            async {
                localDbUseCase.updateMedicineQuantity(
                    cartMedicine.medicineId,
                    cartMedicine.addedQty
                )
            }.await()
        }
    }


    private fun updateProductDetailsId(productCode: String, productDetailsId: Long) =
        viewModelScope.launch(Dispatchers.IO) {
            localDbUseCase.updateProductDetailsId(productCode, productDetailsId)
        }

    //////order summary

    //note:- view more logic
    var isExpanded: Boolean = false
    fun viewMoreClick() {
        if (isExpanded) {
            productList.postValue(apiMedicineList.value?.subList(0, 1))
        } else {
            productList.postValue(apiMedicineList.value)
        }
        showMessage.postValue(Event(MessageConstant(MESSAGES.VIEW_MORE_CLICK)))
    }

    fun uploadPrescriptionClick() {
        showMessage.postValue(Event(MessageConstant(MESSAGES.UPLOAD_PRESCRIPTION_CLICK)))
    }

    fun applyCouponClick() {
        showMessage.postValue(Event(MessageConstant(MESSAGES.APPLY_COUPON_CLICK)))
    }

    fun viewChangesClick() {
        showMessage.postValue(Event(MessageConstant(MESSAGES.VIEW_CHANGES_CLICK)))
    }

    fun addMorePrescriptionClick() {
        showMessage.postValue(Event(MessageConstant(MESSAGES.ADD_MORE_PRESCRIPTION_CLICK)))
    }

    fun confirmOrder(confirmOrder:Boolean= true) = viewModelScope.launch(Dispatchers.IO) {
        val isValid = checkIfOrderIsValid()
        Log.i("Testing", selectedPaymentMethod)
        Log.i("Testing", "" + selectedPaymentMethodId)
        Log.i("Testing", "" + SharedPrefManager.getInstance().lastSelectedPaymentModeId)
        if (isValid) {
            if (confirmOrder) {
                launchOrderIsBeingPlaced.postValue(true)
            } else {
                loaderValue.postValue(true)
            }
            val response = async {
                orderFlowUseCase.placeOrder(
                    mxInternalErrorOccurred,apiMedicineList.value!!,
                    cartMedicineListResponse,
                    prescriptions.value!!,
                    SharedPrefManager.getInstance().lastSelectedPaymentModeId,
                    if (selectedPaymentMethod.isNullOrEmpty()) SharedPrefManager.getInstance().selectedPaymentMethod else selectedPaymentMethod,
                    if (selectedPaymentMethodId <= 0L) SharedPrefManager.getInstance().selectedPaymentMethodId else selectedPaymentMethodId,
                    selectedPaymentMethodIconUrl, confirmOrder
                )
            }.await()
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
                //  loaderValue.postValue(false)
                localDbUseCase.clearCart()
                SharedPrefManager.getInstance().incompleteOrderId = 0
                SharedPrefManager.getInstance().offerId = "0"
                SharedPrefManager.getInstance().couponModel = null
                SharedPrefManager.getInstance().isContactSheetClosed = false
//                SharedPrefManager.getInstance().isPspViewed = false
                launchOrderStatus.postValue(Event(response.code == 200))
            } else if (response.code == 100) {
                fetchCartDetails(false,"SUMMARY")
                loaderValue.postValue(false)
                launchOrderIsBeingPlacedForUnavailable.postValue(true)
            } else {
                //  loaderValue.postValue(false)
                launchOrderIsBeingPlacedCaseFailed.postValue(true)
                showInternalServerError.postValue(
                    response.message ?: "Internal server error, please try again"
                )//
            }

        } else {
            //show toast
            val cartList = apiMedicineList.value ?: mutableListOf()
            if (outOfStockCount == cartList.size) {
                discardOrder()
               // showMessage.postValue(Event(MessageConstant(MESSAGES.SHOW_MEDS_OUT_OF_STOCK)))
            } else if (notForSaleCount == cartList.size) {
                discardOrder()
                //showMessage.postValue(Event(MessageConstant(MESSAGES.SHOW_MEDS_NOT_SUPPLIED)))
            } else if (notDeliverableCount == cartList.size) {
                discardOrder()
                //showMessage.postValue(Event(MessageConstant(MESSAGES.SHOW_MEDS_UNAVAILABLE)))
            } else {
                discardOrder()
              //  showMessage.postValue(Event(MessageConstant(MESSAGES.SHOW_MEDS_UNAVAILABLE)))
            }
        }
//        loaderValue.postValue(false)
    }
    /*fun confirmOrder() {
        viewModelScope.launch(Dispatchers.IO) {
            loaderValue.postValue(true)

            
            val itemsUnavailable = itemsNotAvailable.value ?: false

            if (itemsUnavailable) {
                val cartList = apiMedicineList.value
                if (!cartList.isNullOrEmpty()) {
                    for (cartItem in cartList) {

                        if (!cartItem.product.availabilityStatus.isNullOrEmpty()) {
                            val list = getEditOrderRequestData(cartItem.product.productCode, 0)
    
                            editMedicine(
                                SharedPrefManager.getInstance().incompleteOrderId,
                                list,
                                true,
                                activePage,
                                cartItem.product.switchBackProductCode ?: ""
                            )
                        }
                    }

                    val replaceList = getAddedMedicinesFromCart(false, false)
                    val responseCode = replaceMedsForIncompleteOrder(
                        SharedPrefManager.getInstance().loggedInUserId,
                        SharedPrefManager.getInstance().incompleteOrderId,
                        replaceList,
                        SharedPrefManager.getInstance().offerId,
                        true,
                        true,
                        SharedPrefManager.getInstance().srcType,
                        SharedPrefManager.getInstance().algoSpecificVariantId
                    )

                    if (responseCode == 200) {
                        placeOrder()
                    } else {
                        loaderValue.postValue(false)
                        showInternalServerError.postValue("Internal server error, please try again")
                    }
                }
            } else {
                placeOrder()
            }
        }
    }*/

    /*private fun placeOrder() = viewModelScope.launch(Dispatchers.IO) {
        val response = orderFlowUseCase.confirmOrder(
            SharedPrefManager.getInstance().incompleteOrderId,
            paymentMode.value!!,
            SharedPrefManager.getInstance().loggedInUserId,
            if (selectedPaymentMethod.isNullOrEmpty()) SharedPrefManager.getInstance().selectedPaymentMethod else selectedPaymentMethod,
            if (selectedPaymentMethodId <= 0L) SharedPrefManager.getInstance().selectedPaymentMethodId else selectedPaymentMethodId,
            BundleConstants.ORDER_SUMMARY,
            selectedPaymentMethodIconUrl
        )
        if (response) {
            async {
                localDbUseCase.clearCart()
                SharedPrefManager.getInstance().offerId = "0"
                SharedPrefManager.getInstance().isContactSheetClosed = false
            }.await()
            loaderValue.postValue(false)
            launchOrderStatus.postValue(Event(response))
        }
    }*/

    /*fun getCartProductList() {
        val response = cartUseCase.getCartProducts()
        productList.value?.addAll(response)
    }*/

    val paymentContainerModel: PaymentContainerModel = PaymentContainerModel(
        "",
        "Pay using",
        "",
        "",
        0.0,
        "",
        SpannableStringBuilder(""),
        paymentContainerType = PaymentContainerType.PLACE_ORDER,
        btnTitle = "Place Order",
        addressType = SharedPrefManager.getInstance().addressType,
        patientName = SharedPrefManager.getInstance().patientName,
        deliveryByLabel = "Delivery by "
    )

    var stickyPaymentDataPlaceOrder: MutableLiveData<PaymentContainerModel> =
        MutableLiveData(paymentContainerModel)

    /*
        var stickyPaymentDataPlaceOrder: MutableLiveData<PaymentContainerModel> = MutableLiveData(
            //todo let it accept all null values
            PaymentContainerModel(
                "",
                "Pay using",
                "UPI",
                "",
                100.0,
                "",
                SpannableStringBuilder(""),
                "Delivery to",
                "Test",
                "address",
                "Home",
                SharedPrefManager.getInstance().pincode.toString(),
                "Delivery by",
                "18th-19 Feb 2024",
                "Place order",
                paymentContainerType = PaymentContainerType.PLACE_ORDER
            )
        )
    */

    private suspend fun calculateSubsSaving() {
        try {
            val cartList = cartMedicineListResponse
            var totalSavings = 0.0
            var subsSavingPercentage = 0.0
            val subAvailableMedicines = getSubsMedList()
//            orgMedCount.postValue(subAvailableMedicines.size)

           /* Locale.setDefault(Locale("en", "US"))
            val df = NumberFormat.getInstance()
            df.maximumFractionDigits = 2*/

            var orgMrp = 0.0
            var orgSalePrice = 0.0
            var subSale = 0.0
            var subSaleForOrgAvailable = 0.0
            for (model in cartList) {
                totalSavings = totalSavings.plus(calculatePerMedicinePrice(model))

                /*if (model.medicineId != model.subsMedProductCode) {
                    val orgSelling = df.format(model.mrp).toDouble()
                    val orgPack = model.originalPackSize
                    val orgSellingPerTab = df.format(orgSelling / orgPack).toDouble()
                    val subSellingPrice = model.subsSellingPrice
//                        df.format((model.subsSellingPrice / model.subsRecommendedQty)).toDouble()
                    val subPack = model.substitutePackSize
                    val subPricePerTab = df.format(subSellingPrice / subPack).toDouble()
                    val discountPerTab = df.format(orgSellingPerTab - subPricePerTab).toDouble()
                    val qty = model.addedQty
                    val savingPerMedicine = discountPerTab * (qty * orgPack)
//                    totalSavings.plus(savingPerMedicine)
                    totalSavings = totalSavings.plus(savingPerMedicine)

//                    subsSavingPercentage += model.savingIfSubsTaken.replace("%", "").toDouble()

                    subSale += model.subsSellingPrice / model.subsRecommendedQty
                    if (model.orgAvailable) {
                        orgMrp += model.mrp
                        orgSalePrice += (model.mrp - ((model.mrp * model.discount) * 0.01))
                        subSaleForOrgAvailable += model.subsSellingPrice / model.subsRecommendedQty
                    }
                }*/
            }

            val model = cartReplaceAll.value!!
            if (isMedReplaced) {
                model.showYaySavings = true
                model.showReplaceAll = false
            } else {
                model.showYaySavings = false
                model.showReplaceAll = subAvailableMedicines.size > 1
                model.totalSaved = 0.0
            }
            model.totalReplaceSavings = roundOffDecimal(totalSavings)
            model.substitutableMedCount = subAvailableMedicines.size
            model.loading = false
            model.variant = SharedPrefManager.getInstance().oneClickSubstitutionVariant
            cartReplaceAll.postValue(model)
        } catch (ignore: Exception) {
            ignore.printStackTrace()
        }
    }

    private suspend fun calculatePerMedicinePrice(model: ProductInfoModel) : Double {
        var savingPerMedicine: Double = 0.0
        if (model.suggestion != null) {
            if (model.product.productCode != model.suggestion!!.productCode) {
                val addedQty = localDbUseCase.getAddedQtyOfAddedMedicine(model.product.productCode)
                if (addedQty == 0) return 0.0
                val orgMedMrp = model.product.mrp / addedQty
                var orgPackSize: Double =
                    model.product.packSize?.toDouble() ?: 10.0 //?: localDbUseCase.get

                val orgPricePerTab = orgMedMrp / orgPackSize

                val subsPrice = model.suggestion!!.sellingPrice
                var subsPackSize: Double = model.suggestion!!.packSize?.toDouble() ?: 10.0
                val subPricePerTab = subsPrice / subsPackSize

                val discountPerTab = orgPricePerTab - subPricePerTab
                savingPerMedicine = discountPerTab * (addedQty * orgPackSize)
            }
        }
        return roundOffDecimal(savingPerMedicine)
    }

    /**
     * Replace all medicine section
     * **/
    /*private suspend fun calculateSubsSaving() {
        try {

            var totalSavings = 0.0
            var subsSavingPercentage = 0.0
            val subAvailableMedicines = getSubsMedList()
            orgMedCount.postValue(subAvailableMedicines.size)

           /* Locale.setDefault(Locale("en", "US"))
            val df = NumberFormat.getInstance()
            df.maximumFractionDigits = 2*/

            var orgMrp = 0.0
            var orgSalePrice = 0.0
            var subSale = 0.0
            var subSaleForOrgAvailable = 0.0
            for (model in subAvailableMedicines) {
                if (model.medicineId != model.subsMedProductCode) {
                    val orgSelling = roundOffDecimal(model.mrp)
                    val orgPack = model.originalPackSize
                    val orgSellingPerTab = df.format(orgSelling / orgPack).toDouble()
                    val subSellingPrice = model.subsSellingPrice
//                        df.format((model.subsSellingPrice / model.subsRecommendedQty)).toDouble()
                    val subPack = model.substitutePackSize
                    val subPricePerTab =roundOffDecimal(subSellingPrice / subPack)
                    val discountPerTab = roundOffDecimal(orgSellingPerTab - subPricePerTab)
                    val qty = model.addedQty
                    val savingPerMedicine = discountPerTab * (qty * orgPack)
//                    totalSavings.plus(savingPerMedicine)
                    totalSavings = totalSavings.plus(savingPerMedicine)

//                    subsSavingPercentage += model.savingIfSubsTaken.replace("%", "").toDouble()

                    subSale += model.subsSellingPrice / model.subsRecommendedQty
                    if (model.orgAvailable) {
                        orgMrp += model.mrp
                        orgSalePrice += (model.mrp - ((model.mrp * model.discount) * 0.01))
                        subSaleForOrgAvailable += model.subsSellingPrice / model.subsRecommendedQty
                    }
                }
            }

            if (subAvailableMedicines.size > 1) {//ORG meds
                savingsAfterReplaceAll.postValue(0.0)
                replacedMedicineCount.postValue(0)
              //  df.maximumFractionDigits = 1


                var savingPercentageForCompareBottomSheet: Double =
                    ((orgMrp - subSaleForOrgAvailable) * 100) / orgSalePrice
                savingPercentageForCompareBottomSheet =
                    if (savingPercentageForCompareBottomSheet > 95) 95.0 else savingPercentageForCompareBottomSheet

                if (savingPercentageForCompareBottomSheet < 0)
                    savingPercentageForCompareBottomSheet = 51.0

                compareCardSavingPercentage.postValue(savingPercentageForCompareBottomSheet)
                //((orgMrp - subSaleForOrgAvailable) * 100) / orgSalePrice

                savingsIfReplaceAll.postValue(roundOffDecimal(totalSavings))
                replacedMedicineCountIfReplaceAll.postValue(subAvailableMedicines.size)

                *//* if (SharedPrefManager.getInstance().oneClickSubstitutionVariant.equals("A")) {
                     showBottomStickySavings.value = true
                     setUndoIcon.value = Event("0")
                 } else {
                     showBottomStickySavings.value = false
                 }*//*
            } else {
                compareCardSavingPercentage.postValue(0.0)
                savingsIfReplaceAll.postValue(0.0)
                replacedMedicineCountIfReplaceAll.postValue(0)

                *//*if (savingsAfterReplaceAll.value!! > 0.0
                    && SharedPrefManager.getInstance().oneClickSubstitutionVariant.equals("B")
                ) {
                    showBottomStickySavings.value = true
                    setUndoIcon.value = Event("1")
                } else {
                    showBottomStickySavings.value = false
                    setUndoIcon.value = Event("0")
                }*//*
            }

            val model = cartReplaceAll.value!!
            if (isMedReplaced) {
                model.showYaySavings = true
                model.showReplaceAll = false
            } else {
                model.showYaySavings = false
                model.showReplaceAll = subAvailableMedicines.size > 1
                model.totalSaved = 0.0
            }
            model.totalReplaceSavings = roundOffDecimal(totalSavings)
            model.substitutableMedCount = subAvailableMedicines.size
            model.loading = false
            model.variant = SharedPrefManager.getInstance().oneClickSubstitutionVariant
            cartReplaceAll.postValue(model)
        } catch (ignore: Exception) {
            ignore.printStackTrace()
        }
    }*/

    fun onUndoReplaceClicked() = viewModelScope.launch(Dispatchers.IO) {
        if (NetworkConnectivityUtil.isNetworkConnected(context)) {
            loaderValue.postValue(true)
            var finalList = mutableListOf<MedicineDto>()

            isReplaceAllClicked = false
            val cartMedList = getAddedMedicinesFromCart(false, false)
            
            
            for (item in cartMedList) {
                if (undoPdIdList.contains(item.productDetailsId)) {
                    item.cxAcceptedSubs = false


                    var switchBackQty = localDbUseCase.getSwitchBackCount(item.productCode ?: "")
                    if (switchBackQty == 0) {
                        switchBackQty = 1
                    }

                    item.medicineQty = switchBackQty
                    item.quantity = switchBackQty
                }
                //getCXAcceptStatus(cartMedicineListResponse, item.productDetailsId ?: -1)//!(item.isKeepOrg ?: true)


                val isAdded = isAlreadyAdded(finalList, item.productDetailsId ?: -1)
                if (!isAdded) {
                    finalList.add(item)
                }
                
            }
    
            if (!cartMedicineListResponse.isNullOrEmpty()) {
                for (cartMedItem in cartMedicineListResponse) {
                    val switchBackOrgMedCode = cartMedItem.product.switchBackProductCode
                    
                    val multipleOrgMeds = fetchOrgMedsFromDBWhooseSubsWereSame(cartMedItem.product.productCode)
                    if (!multipleOrgMeds.isNullOrEmpty()) {
                        if (multipleOrgMeds.size > 1) {
                            /**
                             * 2 or more ORG medicines having same subs
                             * **/
                            for (multipleOrg in multipleOrgMeds) {
                                if (multipleOrg.medicineId != switchBackOrgMedCode) {
                                    var medicineDto = MedicineDto()
                                    
                                    medicineDto.cxAcceptedSubs = false
                                    medicineDto.medicineName = multipleOrg.medicineName
                                    medicineDto.productCode = multipleOrg.medicineId
                                    medicineDto.isKeepOrg = false
                                    medicineDto.cxOrgAdded = false
                                    medicineDto.quantity = multipleOrg.addedQty
                                    medicineDto.medicineQty = multipleOrg.addedQty
    
                                    /**
                                     * not in use
                                     * **/
                                    medicineDto.isCrossSellingProduct = false
                                    
                                    finalList.add(medicineDto)
                                }
                            }
                        }
                    }
                }
            }


            val responseCode = replaceMedsForIncompleteOrder(
                SharedPrefManager.getInstance().loggedInUserId,
                SharedPrefManager.getInstance().incompleteOrderId,
                finalList,
                SharedPrefManager.getInstance().offerId,
                true,
                true,
                SharedPrefManager.getInstance().srcType,
                SharedPrefManager.getInstance().algoSpecificVariantId,
            )
            if (responseCode != null)
                if (!responseCode.responseData?.cappingLimitMessage.isNullOrEmpty()){
                    cappingLimitMessage.postValue(Event(responseCode.responseData?.cappingLimitMessage))
                }

            for (item in cartMedList) {
                // TODO need to add switch back
                val subsCode = localDbUseCase.getSubsProductCodeAfterDelete(item.productCode ?: "")
                localDbUseCase.removeItemFromCart(subsCode ?: "", true)
                /*val pdId = localDbUseCase.getProductDetailsId(item.productCode ?: "")
                if (undoPdIdList.contains(pdId)) {*/


                /*localDbUseCase.removeItemFromCart(item.suggestion?.productCode ?: "", true)
            SharedPrefManager.getInstance().autoReplaced = false
            val orgSubsInfo = item.productAsCartItem(false, 1)
            addMedicinesToCart(orgSubsInfo, null, false)*/
            }

            responseCode?.let {
                if (it.statusCode == 200) {
                    SharedPrefManager.getInstance().autoReplaced = false
                    /*showReplaceUndo.postValue(false)
                    fetchCartDetails(false, "CART")*/

                    val response =
                        orderFlowUseCase.getOrderMedicineDetails(mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId)
                    if (response != null && response.statusCode == 200) {
                        logoUrlList = response.responseData?.logoUrlList ?: listOf()
                        cartMedicineListResponse = response.responseData?.elasticProductDetails ?: listOf()
                        var outPutList = processCartList(cartMedicineListResponse.toMutableList())
//                        productList.postValue(outPutList)

                        var animateList = prepareAnimationList(cartMedicineListResponse.toMutableList()) ?: mutableListOf<CartMedicineModel>()
                        cartMedItems.postValue(animateList)
                        /*if (isReplaceAllClicked)*/
                        getCartBillDetails(SharedPrefManager.getInstance().incompleteOrderId,
                            ClassNameConstants.CART_ACTIVITY)
                        localDbUseCase.deleteCartReplaceStatus()
                        loaderValue.postValue(false)
                        showReplaceUndo.postValue(false)
                        undoReplaceAnimation.postValue( Event(Any()) )
                        reloadCartList(cartMedicineListResponse)
                    }
                }
            }
        } else {

        }
        sdkEventUseCase.sendUndoClickedEvent(SharedPrefManager.getInstance().incompleteOrderId)
    }

    fun getCXAcceptStatus(list: List<ProductInfoModel>, pdId: Long) : Boolean{
        var cxAccepted = false
        for (item in list) {
            if (item.product.productDetailsId == pdId) {
                if (item.product.cxAcceptedSubs && !item.product.cxKeepOriginal) {
                    cxAccepted = false
                }
            }
        }

        return cxAccepted
    }

    fun onReplaceAllClicked() = viewModelScope.launch(Dispatchers.IO) {
        showReplaceItemWithSubsBS.postValue(Event(true))
        var finalList = mutableListOf<MedicineDto>()
        undoPdIdList = mutableListOf<Long>()

        /**
         * execute this method to check is 2 or more org meds having same substitute
         * **/
        checkIfMedicinesHavingSameSubs()

        val cartMedList = getAddedMedicinesFromCart(false, true)


        val replaceMedList = replaceAllModel.list

//        if (SharedPrefManager.getInstance().oneClickSubstitutionVariant.equals("B"))

        isReplaceAllClicked = true
        localDbUseCase.deleteCartReplaceStatus()
        /*for (item in replaceMedList) {
            var qty = getNearestQtyForReplaceMeds(item.product)
            if (qty > item.product.maxCappedQty) {
                qty = item.product.maxCappedQty
            }
            val medsDto =
                localDbUseCase.getCartMedicineDtoFromProductCode(
                    cartMedicineListResponse,
                    item.product.productCode,
                    qty
                )
            medsDto[0].cxAcceptedSubs = true
            medsDto[0].medicineQty = qty
            medsDto[0].quantity = qty
            finalList.add(medsDto[0])
        }
*/
        for (item in cartMedList) {

            val indexOfReplace = isExistInList(item.productCode ?: "", replaceMedList)
            if (indexOfReplace != -1 ) {
                var qty = getNearestQtyForReplaceMeds(replaceMedList[indexOfReplace].product)
                /*val maxCappedQty = replaceMedList[indexOfReplace].suggestion?.maxCappedQty ?: replaceMedList[indexOfReplace].product.maxCappedQty
                if (qty > maxCappedQty) {
                    qty = maxCappedQty  //replaceMedList[indexOfReplace].suggestion!!.maxCappedQty
                }*/

                item.medicineQty = qty
                item.quantity = qty
                item.cxAcceptedSubs = true
                /**
                 * This condition will check for availability of Original medicine and is ut is available then only consider for undo
                 * **/
                if (replaceMedList[indexOfReplace].product.availabilityStatus.isNullOrEmpty()) {
                    undoPdIdList.add(item.productDetailsId ?: -1)
                }
            }


            finalList.add(item)

            /*val isAdded = isAlreadyAdded(finalList, item.productCode ?: "")
            if (!isAdded) {
                finalList.add(item)
            }*/
        }

        calculateSubsSaving()
        val responseCode = replaceMedsForIncompleteOrder(
            SharedPrefManager.getInstance().loggedInUserId,
            SharedPrefManager.getInstance().incompleteOrderId,
            finalList,
            SharedPrefManager.getInstance().offerId,
            true,
            true,
            SharedPrefManager.getInstance().srcType,
            SharedPrefManager.getInstance().algoSpecificVariantId,
        )

        if (responseCode != null)
            if (!responseCode.responseData?.cappingLimitMessage.isNullOrEmpty()){
                cappingLimitMessage.postValue(Event(responseCode.responseData?.cappingLimitMessage))
            }


        if (responseCode != null) {
            if (responseCode.statusCode == 200) {

                for (item in replaceMedList) {
                    var qty = getNearestQtyForReplaceMeds(item.product)
                    if (qty > item.product.maxCappedQty) {
                        qty = item.product.maxCappedQty
                    }
                    val orgQty = localDbUseCase.getAddedQtyOfAddedMedicine(item.product.productCode)
                    val cartItem = item.suggestionAsCartItem(true, qty)
                    val orgSubsInfo = item.getOrgSubsInfo(true, orgQty)
                    localDbUseCase.insertCartReplaceStatus(
                        CartReplaceStatus(
                            null,
                            medicineId = item.product.productCode,
                            isAutoReplace = true
                        )
                    )
                    localDbUseCase.removeItemFromCart(item.product.productCode, false)
                    addMedicinesToCart(cartItem, orgSubsInfo, true)
                }


                showReplaceItemWithSubsBS.postValue(Event(false))
                SharedPrefManager.getInstance().autoReplaced = true

                // TODO need to set after animation
                val response =
                    orderFlowUseCase.getOrderMedicineDetails(mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId)
                if (response != null && response.statusCode == 200) {
                    logoUrlList = response.responseData?.logoUrlList ?: listOf()
                    cartMedicineListResponse = response.responseData?.elasticProductDetails ?: listOf()
                    if (isReplaceAllClicked) replaceWithSubsAnimation.postValue(Event(Any()))
                }
            }
        }
    }

    private suspend fun checkIfMedicinesHavingSameSubs() {
        /**
         * Steps to execute
         * 1. Fetch all items from AddedMedsTable12
         * 2. start 1st for loop to iterate in list
         * 3. start 2nd iterate through same list (Nested)
         * 4. At top level list fetch 1 item and store ogProductCode in a variable
         * 5. In 2nd loop fetch and store ogProductCode in a variable
         * 5. If both orgProductCode does not matches then check subsCode of both the indexes
         * 6. If both the codes matches then remove that item from AddedMeds12 table ans insert it into AddedOrgSubsInfo
         * 7. Keep repeating for other indices as well
         * **/

        val addedMedsList = localDbUseCase.getAddedMedicines()
        if (addedMedsList.isNotEmpty()) {
            for (i in addedMedsList.indices) {

                val mOgProductCode = addedMedsList[i].medicineId
                val mSubsProductCode = addedMedsList[i].subsMedProductCode

                if (!mSubsProductCode.isNullOrEmpty()) {
                    val duplicateCount =
                        localDbUseCase.getCountOfDuplicateSubsFound(mSubsProductCode!!)
                    if (duplicateCount > 1) {
                        val duplicateSubsAvailableMedicines =
                            localDbUseCase.getMedicineListWIthSameSubs(mSubsProductCode!!)

                        val temp = localDbUseCase.getAddedQtyOfAddedMedicine(mSubsProductCode)
                        if (temp > 0) {
                            return
                        }
                        if (!duplicateSubsAvailableMedicines.isNullOrEmpty() && duplicateSubsAvailableMedicines.size > 1) {
                            for (item in duplicateSubsAvailableMedicines) {
                                val ogProductCode = item.medicineId
                                if (mOgProductCode != ogProductCode) {
                                    /**
                                     * remove item from cart and insert into addedSubsOrgInfo
                                     * **/
                                    val editList = getEditOrderRequestData(item.medicineId, 0)
                                    val success = orderFlowUseCase.editMedicine(mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId,
                                        editList)
                                    Log.e("Remove from cart", ogProductCode + "   " + item.medicineName)
                                    if (success != null) {
                                        if (!success.responseData?.cappingLimitMessage.isNullOrEmpty()){
                                            cappingLimitMessage.postValue(Event(success.responseData?.cappingLimitMessage))
                                        }
                                        localDbUseCase.insertOrgSubFromCart(ogProductCode)
                                        localDbUseCase.removeItemFromCart(ogProductCode, false)
                                    }
                                }
                            }
                        }
                    }

                }
                /*for (j in addedMedsList.indices) {

                    val nOgProductCode = addedMedsList[j].medicineId

                    if (mOgProductCode != nOgProductCode && addedMedsList[i].subsMedProductCode == addedMedsList[j].subsMedProductCode) {
                        //inserting to AddedOrgSubsInfo
                        //delete from AddedMeds12
                        *//**
                         * Fire edit medicine API here and in response delete item from cart and add same item in OrgSubsInfo
                         * **//*
                        //inserting to AddedOrgSubsInfo
                        localDbUseCase.insertOrgSubFromCart(addedMedsList[j].subsMedProductCode?:"")

                        val list = getEditOrderRequestData(
                            addedMedsList[j].medicineId ?: "",
                            0
                        )
                        editMedicine(SharedPrefManager.getInstance().incompleteOrderId,
                            list,
                            true,
                            "CART",
                            "")
                    }
                }*/
            }
        }
    }




    fun onReplaceSwitchSingleMedicine(item: ProductInfoModel?, isReplaced: Boolean) =
        viewModelScope.launch(Dispatchers.IO) {
            var finalList = mutableListOf<MedicineDto>()

            val cartMedList = getAddedMedicinesFromCart(false, false)

            isReplaceAllClicked = false
            if(item==null)return@launch
            localDbUseCase.deleteCartReplaceStatus(item.product.productCode)
            var qty = if (isReplaced) {
                var replaceQty = getNearestQtyForReplaceMeds(item.product)
                if (replaceQty > item.product.maxCappedQty) {
                    replaceQty = item.product.maxCappedQty
                }
//                replaceQty
                1
            } else {
                var switchBackQty =
                    localDbUseCase.getSwitchBackCount(item.suggestion?.switchBackProductCode ?: "")
                if (switchBackQty == 0) {
                    switchBackQty = 1
                }
                switchBackQty
            }

            val medsDto =
                localDbUseCase.getCartMedicineDtoFromProductCode(
                    cartMedicineListResponse,
                    if (isReplaced) item.product.productCode else item.suggestion?.productCode
                        ?: "", qty
                )
            if (!medsDto.isNullOrEmpty()) {
                medsDto[0].cxAcceptedSubs = isReplaced
                medsDto[0].medicineQty = qty
                medsDto[0].quantity = qty
                finalList.add(medsDto[0])
            }

            for (item in cartMedList) {
                val isAdded = isAlreadyAdded(finalList, item.productDetailsId ?: -1)
                if (!isAdded) {
                    finalList.add(item)
                }
            }


            val responseCode = replaceMedsForIncompleteOrder(
                SharedPrefManager.getInstance().loggedInUserId,
                SharedPrefManager.getInstance().incompleteOrderId,
                finalList,
                SharedPrefManager.getInstance().offerId,
                true,
                true,
                SharedPrefManager.getInstance().srcType,
                SharedPrefManager.getInstance().algoSpecificVariantId,
            )
            if (responseCode != null)
                if (!responseCode.responseData?.cappingLimitMessage.isNullOrEmpty()){
                    cappingLimitMessage.postValue(Event(responseCode.responseData?.cappingLimitMessage))
                }

            if (isReplaced) {
                var qty = getNearestQtyForReplaceMeds(item.product)
                if (qty > item.product.maxCappedQty) {
                    qty = item.product.maxCappedQty
                }
                val orgQty = localDbUseCase.getAddedQtyOfAddedMedicine(item.product.productCode)
                val cartItem = item.suggestionAsCartItem(false, qty)
                val orgSubsInfo = item.getOrgSubsInfo(false, orgQty)
                localDbUseCase.insertCartReplaceStatus(
                    CartReplaceStatus(
                        null,
                        medicineId = item.product.productCode,
                        isAutoReplace = true
                    )
                )
                localDbUseCase.removeItemFromCart(item.product.productCode, false)
                addMedicinesToCart(cartItem, orgSubsInfo, true)
            } else {

                var switchBackQty =
                    localDbUseCase.getSwitchBackCount(item.suggestion?.switchBackProductCode ?: "")
                if (switchBackQty == 0) {
                    switchBackQty = 1
                }


                SharedPrefManager.getInstance().autoReplaced = false
                showReplaceUndo.postValue(false)
                val orgSubsInfo = item.productAsCartItem(false, switchBackQty)
                localDbUseCase.deleteCartReplaceStatus(item.suggestion?.switchBackProductCode ?: "")
                localDbUseCase.removeItemFromCart(item.suggestion?.productCode ?: "", true)
                addMedicinesToCart(orgSubsInfo, null, false)
            }

            responseCode?.let {
                if (it.statusCode == 200) {
                    fetchCartDetails(false, "CART")
                }
            }


            if (activePage == "SUMMARY" && SharedPrefManager.getInstance().isReOrder) {
                filterOtcList(null)
            }
        }


    fun isAlreadyAdded(list: MutableList<MedicineDto>, prodictDetailsId: Long): Boolean {
        var isAdded = false
        for (item in list) {
            if (item.productDetailsId == prodictDetailsId) {
                isAdded = true
                break
            }
        }
        return isAdded
    }

    private fun isExistInList(productCode: String, list: List<ProductInfoModel>): Int {
        var index = -1
        for (i in list.indices) {
            val item = list[i]
            if (item.product.productCode == productCode) {
                index = i
                break
            }
        }
        return index
    }

    fun onContinueClicked() {
        SharedPrefManager.getInstance().isUserSkippedReplace = true
        launchOrderSummary.postValue(Event(Any()))
    }

    //for coupon

    var couponList: MutableLiveData<MutableList<CouponCodeResponse.Coupon>> =
        MutableLiveData(mutableListOf())

    fun setCouponData() = viewModelScope.launch(Dispatchers.IO) {
        //todo review result value
        val customerCategory = if (SharedPrefManager.getInstance().isFtc) {
            "FTC_Coupon_Urgency"
        } else {
            val genericDiscountVariantId = localDbUseCase.getCustomerCategoryId(UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType)
            if (genericDiscountVariantId > 0) {
                UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType
            } else {
                "NFTC_DynamicDiscount"
            }
//            UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType
        }
        couponUseCase.fetchAllOffers(
            mxInternalErrorOccurred,100,
            SharedPrefManager.getInstance().pincode.toString(),
            "PAYMENT_OFFER",
            customerCategory,
            if (SharedPrefManager.getInstance().algoSpecificVariantId == null || SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId,
        )?.let {
            /*if (SharedPrefManager.getInstance().couponModel != null) {
                it.responseData.forEach { item ->
                    item.isCouponApplied =
                        item.promoCode == SharedPrefManager.getInstance().couponModel.promoCode
                }
            }*/
            if (SharedPrefManager.getInstance().couponModel != null) {
                it.responseData.forEach { item ->
                    if (SharedPrefManager.getInstance().couponModel == null && SharedPrefManager.getInstance().couponModel.promoCode == null) {
                        item.isCouponApplied = false
                    } else
                        item.isCouponApplied =
                            item.promoCode == SharedPrefManager.getInstance().couponModel.promoCode

                    item.expiryDateFromApi=item.expiryDate
                }
            }
            paymentCarouselOgList = it.responseData.filter { item ->
                item.offersVisible == true
            }
            paymentCarouselList.postValue(convertToPaymentCarousel(it.responseData.filter { item ->
                item.offersVisible == true
            }))


        }
    }


    fun convertToPaymentCarousel(coupons: List<CouponCodeResponse.Coupon>): List<PaymentCarouselModel> =
        coupons.map { PaymentCarouselModel(it.description, it.image) }


    private fun convertToOtcProduct(otcList: OTCResponse): List<com.intellihealth.salt.models.ProductInfoModel> {
        if (otcList.responseData?.reOrderCrossSellingProduct != null) {
            return otcList.responseData?.reOrderCrossSellingProduct!!.map {
                with(it.product) {
                    com.intellihealth.salt.models.ProductInfoModel(
                        product = com.intellihealth.salt.models.ProductInfoModel.Product(
                            productCode = this.productCode,
                            skuName = this.skuName ?: "",
                            availabilityStatus = this.availabilityStatus,
                            isAvailable = this.isAvailable ?: true,
                            suppliedByTm = this.suppliedByTm ?: true,
                            manufacturerName = this.manufacturerName ?: "",
                            maxCappedQty = this.maxCappedQty,
                            mrp = this.mrp ?: 0.0,
                            sellingPrice = this.sellingPrice ?: 0.0,
                            discount = this.discount ?: 0.0,
                            packSize = this.packSize ?: "",
                            unit = this.unit ?: "",
                            packForm = this.packForm ?: "",
                            pricePerUnitLabel = this.pricePerUnitLabel ?: "",
                            productImageUrl = this.productImageUrl ?: "",
                            qty = this.qty ?: 0,
                            composition = this.composition ?: "",
                            subsSavingsPercentage = this.subsSavingPercentage ?: "",
                            cxAcceptedSubs = this.cxAcceptedSubs ?: false,
                            switchBackSkuName = this.switchBackSkuName ?: "",
                            switchBackProductCode = this.switchBackProductCode ?: "",
                            switchBackImageUrl = this.switchBackImageUrl ?: "",
                            preSubsSkuName = this.preSubsSkuName ?: "",
                            preSubsProductCode = this.preSubsProductCode ?: "",
                            usersAlsoBoughtMessage = "Users Also Bought +" + this.usersAlsoBoughtCount,
                            subsFound = this.subsFound ?: false,
                            callback = null,
                            productCallback = null,
                            stepperType = StepperConstants.REGULAR
                        ),
                        suggestion = null

                    )

                }
            }

        }
        return emptyList()
    }


    //todo
    private fun convertToBillDetails(
        billModel: BillDetailResponse.ResponseData,
        billDetailsTitle: String?,
        totalPayable: String,
        gst: String,
        sellerPackagingCharge: String,
        saveOrderPrice: String,
        savedOrderMessage: String?,
        strikePackagingCharge: Double,
        className: String
    ): BillDetailsModel = BillDetailsModel(
        billDetailsTitle = if (className == CART_ACTIVITY) "" else billDetailsTitle,
        savedOrderMessage = if (className == CART_ACTIVITY) "" else savedOrderMessage,
        savedOrderPrice = if (className == CART_ACTIVITY) "" else saveOrderPrice,
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
        paymentModeValue = if (className == CART_ACTIVITY) SharedPrefManager.getInstance().selectedPaymentMethod else "",
        isTooltipForDeliveryCharges = !billModel.deliveryChargeTooltipMessage.isNullOrEmpty(),
        //tooltipDeliveryChargeValue = "Add items worth ₹" + billModel.addMoreForFreeDelivery + " more to get free delivery",
        tooltipDeliveryChargeValue = billModel.deliveryChargeTooltipMessage,
        tooltipEstimatedPayableValue = context.getString(R.string.tooltip_estimated_payable_message),
        isTooltipForEstimatedPayable = true,
        isTooltipForTaxesCharges = billModel.packagingCharge!! > 0,
        tooltipTaxesChargesHeaderLeft = gst, //context.getString(R.string.gst)
        tooltipTaxesChargesBodyLeft = sellerPackagingCharge, //context.getString(R.string.seller_packaging_charges),
        tooltipTaxesChargesBodyRight = "₹" + formatDecimal(billModel.packagingCharge!!),
        tooltipTaxesChargesBodyRightStroked = "₹${formatDecimal(strikePackagingCharge)}",
        tooltipTaxesChargesHeaderRight = "Included in MRP",
        isFreeDelivery = (billModel.deliveryCharge == 0.0),
        deliveryChargeMessage = billModel.deliveryChargeMessage,
        sellingPrice = billModel.sellingPrice,
        mxCouponAppliedAmount = billModel.couponAppliedAmt ?: 0.0,
        cashHandlingInfoModel = billModel.cashHandlingInfo,//if (activePage == "SUMMARY") billModel.cashHandlingInfo else null,
        footerList = footerList
    )


    /*
        private fun updateProceedButtonText() {
            var addressId = SharedPrefManager.getInstance().addressId
            var patientId = SharedPrefManager.getInstance().patientId
            var title = "Add Address"
            if ((addressId ?: 0) > 0L && (patientId
                    ?: 0) > 0L && patientsCount > 0 && addressCount > 0
            ) {
                title = "Proceed to Checkout"
            } else if (patientsCount > 0 || addressCount > 0) {
                title = if ((patientId ?: 0) > 0L) {
                    "Proceed to Checkout"
                } else {
                    "Add Delivery Details"
                }
            }
            proceedButtonText.postValue(title)
        }
    */

    /*    fun deletePrescription(orderId: Long, edit: Boolean, images: List<Long>, customerId: String) {
            viewModelScope.launch {
                Log.d("TAG", "deletePrescription: $orderId =  $edit =  $images =  $customerId}")
                loaderValue.postValue(true)
                var response = orderFlowUseCase.deletePrescription(orderId, edit, images, customerId)
                if (response != null) {
                    showMessage.postValue(Event(MESSAGES.DELETE_PRESCRIPTION_SUCCESSFULLY))
                    //  getRxForOrder(SharedPrefManager.getInstance().incompleteOrderId, apiMedicineList.value!!.size)
                }
            }

        }*/


    val lastMinuteStepperCallback: ProductCardSection.ProductCardSectionCallback =
        object : ProductCardSection.ProductCardSectionCallback {
            override fun cartItemMinus(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                qty: Int
            ) {
                val crossSellingList = crossSellingProducts//medList.value

                try {
                    if (!crossSellingList.isNullOrEmpty() && pos < crossSellingList.size) {
                        val index = getIndexOfSelectedItem(crossSellingList, data.product.productCode)
                        val orgInfoModel = crossSellingList[index]
                        orgInfoModel?.let {
                            isFirstTimeCall = false
                            //if (qty == 1) {
                            viewModelScope.launch(Dispatchers.IO) {

                                val list = getEditOrderRequestData(it.product.productCode, qty)
                                val result1 = async { editMedicine(SharedPrefManager.getInstance().incompleteOrderId, list, true, activePage, it.product.switchBackProductCode ?: "") }
                                val result3 = async { updateCrossSellingList(crossSellingList, it.product.productCode ?: "") }
                                awaitAll(result1, result3)
                            }

                            //}
                        }
                    }
                } catch (ex: Exception) {
                    ex.printStackTrace()
                }
            }

            override fun cartItemPlus(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                qty: Int
            ) {
                val crossSellingList = crossSellingProducts//medList.value

                try {
                    if (!crossSellingList.isNullOrEmpty() && pos < crossSellingList.size) {
                        val index = getIndexOfSelectedItem(crossSellingList, data.product.productCode)
                        val orgInfoModel = crossSellingList[index]
                        orgInfoModel?.let {
                            isFirstTimeCall = false

                            viewModelScope.launch(Dispatchers.IO) {
                                if (qty == 1) {
                                    val orgCartItem = it.productAsCartItem(false, 1)
                                    var itemAdded = MxItemAdded()
                                    itemAdded.clickedOnPage = "order_summary"
                                    itemAdded.sectionIndex = pos + 1
                                    itemAdded.pageSection = "tray"
                                    itemAdded.sectionHeading = "last_minute_buy"
                                    itemAdded.freeDeliveryRequiredAmount =
                                        SharedPrefManager.getInstance().deliveryOnAmount.toDouble()
                                    var row = if ((pos + 1) % 2 == 0) 2 else 1
                                    itemAdded.sectionRow = row
                                    orderFlowUseCase.addMedicineToCart(
                                        orgCartItem,
                                        null,
                                        false,
                                        itemAdded
                                    )
                                    val index = getIndexOfSelectedItem(
                                        crossSellingList,
                                        it.product.productCode
                                    )
                                    val item = crossSellingList[index]
                                    sendItemAddedEvent(item, null, null, itemAdded, false)
                                    localDbUseCase.insertCrossSellingProduct(it.product.productCode)
                                    triggerSaveMeds(SharedPrefManager.getInstance().incompleteOrderId, false, "SUMMARY")
                                    updateCrossSellingList(crossSellingList, it.product.productCode ?: "")//

                                } else {
                                    val list = getEditOrderRequestData(it.product.productCode, qty)
                                    val result1 = async { editMedicine(SharedPrefManager.getInstance().incompleteOrderId, list, true, activePage, it.product.switchBackProductCode ?: "") }
                                    val result3 = async { updateCrossSellingList(crossSellingList, it.product.productCode ?: "") }
                                    awaitAll(result1, result3)
                                }
                            }


                        }
                    }
                } catch (ex: Exception) {
                    ex.printStackTrace()
                }

            }

            override fun chipListItemClicked(position: Int, item: ProductCardSectionChipModel?) {

            }

            override fun deleteAlert(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                qty: Int
            ) {
                val crossSellingList = crossSellingProducts//medList.value

                try {
                    if (!crossSellingList.isNullOrEmpty() && pos < crossSellingList.size) {
                        val index = getIndexOfSelectedItem(crossSellingList, data.product.productCode)
                        val orgInfoModel = crossSellingList[index]
                        orgInfoModel.let {
                            isFirstTimeCall = false
                            selectedMedicineProductCode = data.product.productCode
                            selectedMedicineProductQty = 0
                            deleteProductEventListener.postValue(Event(true))

                            /*viewModelScope.launch(Dispatchers.IO) {
                                val list = getEditOrderRequestData(it.product.productCode, 0)
                                val result1 = async { editMedicine(SharedPrefManager.getInstance().incompleteOrderId, list, true, activePage, it.product.switchBackProductCode ?: "") }
                                val result2 = async { triggerSaveMeds(SharedPrefManager.getInstance().incompleteOrderId, false, "SUMMARY") }
                                val result3 = async { updateCrossSellingList(crossSellingList, it.product.productCode ?: "") }
                                awaitAll(result1, result3, result2)
                            }*/
                        }
                    }
                } catch (ex: Exception) {
                    ex.printStackTrace()
                }
            }

            override fun itemViewClick(productDetailModel: com.intellihealth.salt.models.ProductInfoModel) {
                if (isSingleClickParam()) {
                    Log.e("item_clicked::", "chipsItemClicked222")
                    productCodeForBottomSheet = productDetailModel.product.productCode
                    productForBottomSheet = productDetailModel.toAppProductModel()
                    showMessage.postValue(Event(MessageConstant(MESSAGES.OPEN_PD_BOTTOM_SHEET_ORDER_SUMMARY)))
                }
            }

            override fun lastScrollPosition(pos: Int) {
                lastScrollPosition = pos
            }

            override fun reachedToLastItem() {

            }

            override fun reachedToLastStackedItem() {
            }

            override fun stepperError(
                data: com.intellihealth.salt.models.ProductInfoModel,
                pos: Int,
                msg: String?
            ) {

            }

            override fun viewAllClicked() {

            }

            override fun viewAllStackedClicked() {

            }


        }

    fun addTopDealsProductToServer(otcProduct: Product) {

        otcProduct.let {
            if (it.qty == 1) {
                val orgCartItem = it.productAsCartItem(false, 1)
                viewModelScope.launch(Dispatchers.IO) {
                    async {
                        var itemAdded = MxItemAdded()
                        itemAdded.clickedOnPage = "order_summary"
                        itemAdded.sectionIndex = 1
                        itemAdded.pageSection = "tray"
                        itemAdded.sectionHeading = "reorder_cross_selling"
                        itemAdded.sectionRow = 0
                        orderFlowUseCase.addMedicineToCart(
                            orgCartItem,
                            null,
                            false,
                            itemAdded
                        )

//                        sendItemAddedEvent(productModel, null, null, itemAdded)
                    }.await()
                    //localDbUseCase.insertCrossSellingProduct(it.productCode)//todo
//                        var tempList = otcList.value
//                        tempList.remove(otcProduct)//?.remove(otcProduct)
//                        otcList.postValue(tempList ?: mutableListOf())
                    triggerSaveMeds(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        false,
                        "SUMMARY"
                    )
                }

                //todo for minus
            } /*else if (it.qty == 0) {

                } else {
                    //do nothing
                }*/
        }

    }

    fun getIndexOfSelectedItem(crossSellingList: List<ProductInfoModel>, productCode: String): Int {
        var selectedIndex = 0
        for (index in crossSellingList.indices) {
            val item = crossSellingList[index]
            if (item.product.productCode == productCode) {
                selectedIndex = index
            }
        }
        return selectedIndex
    }

    suspend fun updateCrossSellingList(
        crossSellingList: List<ProductInfoModel>,
        productCode: String
    ) {
//        if (crossSellingList != null && crossSellingList.isNotEmpty()) {
//            var tempList: MutableList<com.intellihealth.salt.models.ProductInfoModel> =
//                mutableListOf()
//            for (item in crossSellingList) {
////                    val qty = localDbUseCase.getAddedQtyOfAddedMedicine(item.product.productCode)
////                    if (qty == 0) {
//                //not added
//                tempList.add(item.toSdkObject())
////                    } else {
////                        //item added to cart
////                    }
//            }
//            medList.postValue(tempList)
//
//            /*val index = getIndexOfSelectedItem(crossSellingList, productCode)
//            val item = crossSellingList[index]
//            if(medList.value?.size!! <= 0) {
//                val list = mutableListOf<com.intellihealth.salt.models.ProductInfoModel>()
//                list.add(item.toSdkObject())
//                medList.postValue(list)
//            }
//            Log.i("updateCrossSellingList",""+medList.value?.size)
//            var tempList = medList.value ?: mutableListOf()
//            if (tempList != null && tempList.isNotEmpty()) {
//                tempList.add(item.toSdkObject())
//                medList.postValue(tempList)
//            }*/
//        }
    }

    fun processValidationForPSP(): Pair<Boolean, String> {
        val paymentTypeId = SharedPrefManager.getInstance().getLastSelectedPaymentModeId(0)
        val (isValid, message) = orderFlowUseCase.processValidationForPsp(
            patientId.value.toString(),
            patientName.value?:"", orderAddress.value?:"",
            isOrderAddressServiceable.value?:true, (billDetails.value?.mrpValue?:0).toFloat(),
            prescriptions.value?: emptyList(),
            totalOutOfStockCount, notDeliverableCount
        )
        return Pair(isValid, message)
    }

    fun getSbsBottomSheet(model: ProductInfoModel): com.intellihealth.salt.models.ProductInfoModel {
        val subsModel = model.toSdkObject()
        with(subsModel) {
            subsModel.sameCompositionProduct = model.product.skuName ?: ""
            subsModel.suggestion?.subsSavingsPercentage = model.product.subsSavingPercentage
            subsModel.product.subsSavingsPercentage = model.product.subsSavingPercentage
            model.suggestion?.subsSavingPercentage = model.product.subsSavingPercentage

            model.product.subsSavingPercentage?.let {
                var discount = it.replace("%", "")
                model?.suggestion?.discount = discount.toDouble()
            }
            cardType = FullWidthProductCardConstants.COMPARE_N_CHOOSE
            model.suggestion?.let {
                product = it.toSdkObject()
            }
        }
        return subsModel
    }

    fun getSubsBottomSheet(model: ProductInfoModel) {

        selectedMedicineForReplace =
            MutableLiveData<com.intellihealth.salt.models.ProductInfoModel>()

//        sbsBottomSheet = MutableLiveData<com.intellihealth.salt.models.ProductInfoModel?>()
        val productSubs = getSbsBottomSheet(model)
//        val productSubs = model.toSdkObject()
        with(productSubs) {
//            this.product = model.suggestion?.toSdkObject()!!
            model.product.subsSavingPercentage?.let {
                var discount = it.replace("%", "")
                this.product.discount = discount.toDouble()
            }

        }


//        val productSubs = productDetailUseCase.getSbsBottomSheet(model)
        productSubs.let {
            it.product.callback = replaceNChooseCallBack
            it.product.productCallback = replaceNChooseProductCallBack
        }
        viewModelScope.launch(Dispatchers.IO) {
            productSubs.isReplaced = true
            productSubs.isSubsAddedToCart =
                localDbUseCase.getAddedQtyOfAddedMedicine(productSubs.product.productCode) > 0
            /* model.isSubsAddedToCart = checkAlreadyAddedAsSubs(
                item.product.productCode,
                item.suggestion?.productCode ?: ""
            )*/

            selectedMedicineForReplace.postValue(productSubs)
        }


    }

    fun getReplaceableItem(model: com.intellihealth.salt.models.ProductInfoModel) {
        selectedMedicineForReplace =
            MutableLiveData<com.intellihealth.salt.models.ProductInfoModel>()
        viewModelScope.launch(Dispatchers.IO) {
            var product = com.intellihealth.salt.models.ProductInfoModel()
            model.suggestion?.let {
                product.product = it
                product.isSubsAddedToCart =
                    async { localDbUseCase.getReplaceMedAddedInCart(it.productCode) }.await()
            }

            product.sameCompositionProduct = model.product.skuName
            product?.let {
                it.product.callback = replaceNChooseCallBack
                it.product.productCallback = replaceNChooseProductCallBack
            }
            selectedMedicineForReplace.postValue(product)
        }
    }


    private var replaceNChooseProductCallBack = object : FullWidthProductCardCallback {
        override fun removeButtonClick(productCode: String) {
            /**
             * call replace med API here
             *
             * **/
            loaderValue.postValue(true)
            val productInfo = getProductInfoModelFromList(productCode)
            productInfo?.let { onReplaceSwitchSingleMedicine(productInfo, true) }
            closeReplaceBottomSheet.postValue(Event(true))
            showMessage.postValue(Event(MessageConstant(MESSAGES.ITEM_REPLACED)))

        }

        override fun switchBackOrg(productCode: String, switchBackAvailability: Boolean) {
            Log.d(" PDVM cnc subs card", "$productCode")
        }

        override fun substituteCheck(productCode: String) {
            Log.d(" PDVM cnc subs card", "$productCode")
        }

        override fun productClick(productCode: String) {
            launchPDPageForSub.postValue(Event(selectedProductInfoReplace))
        }
    }

    private val replaceNChooseCallBack = object : StepperCallback {
        override fun cartItemMinus(qty: Int) {
            //TODO("Not yet implemented")
        }

        override fun cartItemPlus(qty: Int) {
            //TODO("Not yet implemented")
        }

        override fun stepperError(msg: String?) {
            //TODO("Not yet implemented")
        }

    }

    private fun getProductInfoModelFromList(subsProductCode: String): ProductInfoModel? {
        var returnItem: ProductInfoModel? = null
        val list = productList.value ?: mutableListOf()
        for (i in list.indices) {
            val item = list[i]
            item.suggestion?.let {
                if (subsProductCode == it.productCode) {
                    returnItem = item
                }
            }
        }
        return returnItem
    }

    fun openCouponBottomSheet(couponCodeResponse: CouponCodeResponse.Coupon) {
        openCouponBottomSheet.value = Event(couponCodeResponse)
    }

    fun applyCouponClick(coupon: CouponCodeResponse.Coupon) {
        viewModelScope.launch(Dispatchers.IO) {
            if (isNetworkAvailable(context)) {
                /*var paymentTypeId = if (SharedPrefManager.getInstance().lastSelectedPaymentModeId == -1)
                    PaymentMode.ONLINE.ordinal.toLong()
                else
                    SharedPrefManager.getInstance().lastSelectedPaymentModeId;*/

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
                        paymentMethodId.toString(), coupon.offerId.toString(),
                        billDetailsResponse,   couponEventPageName(coupon.offerId.toString()), coupon, orderMedicineDetailsListData
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
                        if (couponSaveRemoveResponse.responseData?.isOfferApplied == true) {
                            coupon.paymentMethods?.let {

                                selectedPaymentMethod = coupon.paymentMethods!![0].iconType
                                selectedPaymentMethodId = coupon.paymentMethods!![0].paymentMethodId
                                selectedPaymentMethodIconUrl = coupon.paymentMethods!![0].iconPath

                                SharedPrefManager.getInstance().selectedPaymentMethodId =
                                    coupon.paymentMethods!![0].paymentMethodId
                                SharedPrefManager.getInstance().selectedPaymentMethod =
                                    coupon.paymentMethods!![0].iconType
                                SharedPrefManager.getInstance().selectedPaymentMethodIconUrl =
                                    coupon.paymentMethods!![0].iconPath
                            }
                            SharedPrefManager.getInstance().offerId = coupon.offerId.toString()
                            SharedPrefManager.getInstance().couponModel = coupon
                        }

                        openCouponPopup.postValue(Event(Pair(coupon, couponSaveRemoveResponse)))
                    } else applyCouponFailed.postValue(Event(Any()))
                } else applyCouponFailed.postValue(Event(Any()))

            } else {
                openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
            }
        }

    }

    fun removeCoupon() {
        viewModelScope.launch(Dispatchers.IO) {
            if (isNetworkAvailable(context)) {
                val couponSaveRemoveResponse = couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred,SharedPrefManager.getInstance().incompleteOrderId,
                    "16"/*todo*/,
                    "0",
                    billDetailsResponse,
                    couponEventPageName("0"),
                    SharedPrefManager.getInstance().couponModel,
                    orderMedicineDetailsListData
                )
                couponSaveRemoveResponse?.responseData?.let {
                    if (couponSaveRemoveResponse.message == context.getString(R.string.coupon_removed)) {
                        SharedPrefManager.getInstance().couponModel = null
                        SharedPrefManager.getInstance().offerId = "0"
                        SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                        getCartBillDetails(
                            SharedPrefManager.getInstance().incompleteOrderId,
                            CART_ACTIVITY
                        )
                    }

                }
            } else {
                openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
            }
        }
    }

    fun changeCouponButtonState(isApplied: Boolean, offerId: Int) {
        if (isApplied) {
            paymentCarouselOgList.forEach {
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
            /* tempList.value?.forEach {
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
             }*/
        } else {
            paymentCarouselOgList.forEach {
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
            /* tempList.value?.forEach {
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
             }*/
        }
        val data = paymentCarouselOgList
        data?.let {
            paymentCarouselOgList = it
        }
    }

    private suspend fun prepareAnimationList(cartList: MutableList<ProductInfoModel>) : MutableList<CartMedicineModel> {
        var cartMedicineList = mutableListOf<CartMedicineModel>()
        /*Locale.setDefault(Locale("en", "US"))
        val df = NumberFormat.getInstance()
        df.maximumFractionDigits = 2*/
        for (item in cartList) {
            item.isReplaced = isReplaceAllClicked
            var cartItem = CartMedicineModel(
                item,
                null,
                isReplaceAllClicked,
                calculatePerMedicinePrice(item),
                2
            )

            /*var subsInfoModel = item
            if (item.product.subsFound) {
                subsInfoModel.product = item.suggestion!!
                if (item.suggestion!!.qty ?: 0 == 0) {
                    subsInfoModel.suggestion = null
                }
            }*/
            if (item.product.subsFound && item.suggestion != null) {
                /**
                 * medicine has substitute available
                 * **/
                if (item.cardType == FullWidthProductCardConstants.SUBS_ADDED) {
                    /**
                     * medicine substitute available and added to cart (both added via ORG-SUBS mapping)
                     * **/
                    cartItem.subsMedicineModel = item
                    cartItem.sequence = 3
                } else {
                    /**
                     * medicine substitute available but not added to cart
                     * **/
                    var orgProductForReplace = item.suggestion!!
                    orgProductForReplace.switchBackProductCode = item.product.productCode
                    orgProductForReplace.switchBackSkuName = item.product.skuName
                    orgProductForReplace.replacedSavingPercentage = item.product.replacedSavingPercentage
                    if (orgProductForReplace.qty!! > orgProductForReplace.maxCappedQty) {
                        orgProductForReplace.qty = orgProductForReplace.maxCappedQty
                    }


                    var subsMed = item.suggestion!!
//                    orgProductForReplace.qty = item.product.recommendedQty ?: 1
                    cartItem.subsMedicineModel = ProductInfoModel(
                        item.cardType,
                        item.isReplaced,
                        item.isDisplayAddIcon,
                        item.isOrgAddedToCart,
                        true,
                        item.isSubsAddedToCart,
                        item.subsAddedAsOrg,
                        item.showRemoveButton,
                        subsMed,
                        null
                    )
                    cartItem.sequence = 1
                }
            }
            
            cartMedicineList.add(cartItem)
            cartMedicineList.sortBy { it.sequence }
        }
        return cartMedicineList
    }

    private fun processCartList(cartList: MutableList<ProductInfoModel>): MutableList<ProductInfoModel> {
        try {
            var list = mutableListOf<CartMedicineModel>()
            if (cartList != null) {
                var removeItems = mutableListOf<String>()
                for (i in cartList.indices) {
//                    var cartMedicineModel = CartMedicineModel()
                    val item = cartList[i]

                    if (item.product.cxAcceptedSubs && item.product.switchBackProductCode != null) {
                        /**
                         * cx added medicine as substitute
                         * **/
                        val index = getOrgMedicineIndexFromCartList(
                            cartList,
                            item.product.switchBackProductCode!!
                        )
                        if (index != null && index != -1) {
                            cartList[index].suggestion = item.product
                            cartList[index].suggestion?.qty = item.product.qty
                            cartList[index].product.subsFound = true
                            cartList[index].cardType = FullWidthProductCardConstants.SUBS_ADDED
//                            cartList[index].sequenceNo = 2
                            /**
                             * this is added to stop animation of cell is OG and SUBS both are added
                             * **/
                            cartList[index].isAutoReplaced = false
                            removeItems.add(item.product.productCode) //subs med product code
                        }
                    } else {
                    
                    }
//                item.product.switchBackProductCode
                }

                for (productCode in removeItems) {
                    val index = getIndexOfSelectedProduct(cartList, productCode)
                    cartList.removeAt(index)
                }
            }


        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    
        provideSequenceToCart(cartList)
        return cartList
    }
    
    private fun provideSequenceToCart(cartList: MutableList<ProductInfoModel>) : MutableList<ProductInfoModel> {
        if (!cartList.isNullOrEmpty()) {
            for (item in cartList) {
                item.sequenceNo = 2
                if (item.product.subsFound && item.suggestion != null) {
                    /**
                     * medicine has substitute available
                     * **/
                    if (item.cardType == FullWidthProductCardConstants.SUBS_ADDED) {
                        item.sequenceNo = 3
                    } else {
                        /**
                         * medicine substitute available but not added to cart
                         * **/
                        item.sequenceNo = 1
                    }
                } else if (item.product.cxAcceptedSubs && item.product.switchBackProductCode != null) {
                    item.sequenceNo = 3
                }
            }
        }
        cartList.sortBy { it.sequenceNo }
        return cartList
    }

    /*private fun processCartList(cartList: MutableList<ProductInfoModel>, animationList: MutableList<CartMedicineModel>): MutableList<ProductInfoModel> {
        try {
            var list = mutableListOf<CartMedicineModel>()
            if (cartList != null) {
                var removeItems = mutableListOf<String>()
                for (i in cartList.indices) {
//                    var cartMedicineModel = CartMedicineModel()
                    val item = cartList[i]


                    if (item.product.cxAcceptedSubs && item.product.switchBackProductCode != null) {
                        val index = getOrgMedicineIndexFromCartList(
                            cartList,
                            item.product.switchBackProductCode!!
                        )
                        if (index != null && index != -1) {
                            cartList[index].suggestion = item.product
                            cartList[index].suggestion?.qty = item.product.qty
                            cartList[index].product.subsFound = true
                            cartList[index].cardType = FullWidthProductCardConstants.SUBS_ADDED
                            removeItems.add(item.product.productCode) //subs med product code
                        }
                    }
//                item.product.switchBackProductCode
                }

                for (productCode in removeItems) {
                    val index = getIndexOfSelectedProduct(cartList, productCode)
                    cartList.removeAt(index)
                }
            }


        } catch (ex: Exception) {
            ex.printStackTrace()
        }

        return cartList
    }
*/
    private fun getIndexOfSelectedProduct(
        cartList: MutableList<ProductInfoModel>,
        productCode: String
    ): Int {
        var index = -1
        if (cartList != null && cartList.size > 0) {
            for (i in cartList.indices) {
                if (cartList[i].product.productCode == productCode) {
                    index = i
                    break
                }
            }
        }
        return index
    }

    private fun getOrgMedicineIndexFromCartList(
        cartList: MutableList<ProductInfoModel>,
        switchBackCode: String
    ): Int? {
        var index = -1
        if (cartList == null) {
            return null
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

    fun uploadImage(
        byteArray: ByteArray,
        uploadedPrescriptionId: Int,
        prevOrderId: Long,
        isFromCamera: Boolean,
        isFromSummary: Boolean
    ) {
        if (isNetworkAvailable(context)) {
            _isLoading.postValue(true)
            viewModelScope.launch {
                val request = ImageUploadRequest(fileName = "IMG${System.currentTimeMillis()}")
                if (uploadedPrescriptionId != -1) {
                    if (uploadedPrescriptionId == 0) {
                        val imgString =
                            "data:image/jpeg;base64," + Base64.encodeToString(
                                byteArray,
                                Base64.NO_WRAP
                            )
                        request.image = imgString
                    } else {
                        request.imageId = uploadedPrescriptionId.toString()

                        if (prevOrderId != -1L) {
                            request.prevOrderId = prevOrderId.toString()
                        }
                    }
                    request.orderId =
                        if (SharedPrefManager.getInstance().incompleteOrderId > 0) SharedPrefManager.getInstance().incompleteOrderId.toString() else null
                }
                val response = async(Dispatchers.IO) {
                    orderFlowUseCase.uploadImage(
                        mxInternalErrorOccurred,SharedPrefManager.getInstance().pincode.toString(),
                        SharedPrefManager.getInstance().loggedInUserId,
                        request,
                        if (SharedPrefManager.getInstance().algoSpecificVariantId > 0) SharedPrefManager.getInstance().algoSpecificVariantId else null
                    )
                }.await()
                Log.d("TAG", "uploadImage: = $response")
                _isLoading.postValue(false)
                response?.responseData?.imageUrl?.let {
                    SharedPrefManager.getInstance().incompleteOrderId =
                        response.responseData.orderId.toLong()
                    Log.d(
                        "TAG",
                        "uploadImage: order id ${response.responseData.orderId.toLong()} share ${SharedPrefManager.getInstance().incompleteOrderId}"
                    )
                    fetchCartDetails(false, if (isFromSummary) "SUMMARY" else "CART")
                    getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
                    list.add(it)
                    prescriptionList.postValue(list)
                    showMessage.postValue(Event(MessageConstant(MESSAGES.UPLOAD_PRESCRIPTION_SUCCESSFULLY)))
                }
            }
        } else {
            showMessage.postValue(Event(MessageConstant(MESSAGES.NO_NETWORK)))
        }
    }


    /*
        fun getAllPatientDetails() {
            viewModelScope.launch {
                isLoadingForPatient.postValue(true)
                val list = orderFlowUseCase.getPrescriptionsDetails(SharedPrefManager.getInstance().loggedInUserId.toLong(), null)
                Log.d("TAG", "getAllPatientDetails: ${Gson().toJson(list)}")
                isLoadingForPatient.postValue(false)
                val dropDownDefaultModelList = list?.responseData?.patientList?.map { it ->
                    Log.d("TAG", "getPastPrescriptionsList: ${it.patientId}, ${it.patientName} (${it.rxCount})")
                    val patientName = "${it.patientName} (${it.rxCount})"
                    DropDownDefaultModel(it.patientId.toInt(), patientName, false)
                }
                Log.d("TAG", "getPastPrescriptionsList: $list and drop down list = ${Gson().toJson(dropDownDefaultModelList)} time ${System.currentTimeMillis()}")

                patientDetails = dropDownDefaultModelList
            }

        }
    */

    suspend fun getExistingCartMap() = localDbUseCase.getExistingCartMap()


    fun checkIfOrderIsValid(): Boolean {
        val cartList = apiMedicineList.value ?: mutableListOf()
        val prescriptionList = prescriptions.value
        if (cartList.isNullOrEmpty() && prescriptionList.isNullOrEmpty()) {
            //show toast
            showMessage.postValue(Event(MessageConstant(MESSAGES.SHOW_MEDS_UNAVAILABLE)))
            return false
        }
        else {
            //at least one is present from cart and prescription
            return !(itemsNotAvailableCount.value == cartList.size && prescriptionList.isNullOrEmpty())
        }
    }

    /* private fun getSwitchBackQty(productCode: String) : Int {
         var switchBackQty = localDbUseCase.getSwitchBackCount(productCode)
         if (switchBackQty == 0) {
             switchBackQty = 1
         }
         return switchBackQty
     }*/

    private fun getNearestQtyForReplaceMeds(product: Product): Int {
        if (product == null) return 1
        var recommendedMedCount = product.recommendedQty ?: 1
        if (recommendedMedCount == 0) recommendedMedCount = 1
        return recommendedMedCount
//        return (product.qty ?: 1) * recommendedMedCount
    }

    suspend fun getSwitchBackProductQty(productCode: String): Int {
        return localDbUseCase.getSwitchBackCount(productCode)
    }


    private suspend fun containsInCartList(
        remoteList: List<ProductInfoModel>,
        productCode: String
    ): Boolean {
        var exists = false
        for (item in remoteList) {
            val remoteMedCode = item.product.productCode
            if (remoteMedCode == productCode) {
                exists = true
//                localDbUseCase.removeItemFromCart(item, false)
            }
        }
        return exists
    }


    //otc 6.7 code
    var otcProductSelectedIndex: Int = -1

    var otcMedicineList = MutableLiveData<MutableList<ProductInfoModel>>(Collections.emptyList())

    var otcRefreshIndex = 0

    private val eventSmoothSnapToPosition = MutableLiveData<Event<Any>>()
    fun getEventSmoothSnapToPosition(): MutableLiveData<Event<Any>> = eventSmoothSnapToPosition
    var otcProductSelected: MutableLiveData<ProductInfoModel> = MutableLiveData<ProductInfoModel>()
    var showOtcProducts = MutableLiveData(false)

    private val eventShowOTCList = MutableLiveData<Event<Any>>()
    open fun getEventShowOTCList(): MutableLiveData<Event<Any>> = eventShowOTCList

    fun onItemClickOtc(medicineListDataModel: ProductInfoModel, position: Int) {
        otcProductSelectedIndex = position
        eventSmoothSnapToPosition.postValue(Event(position))
        otcProductSelected.postValue(medicineListDataModel)
    }


    suspend fun filterOtcList(productInfoModels: MutableList<ProductInfoModel>?) {
        viewModelScope.launch(Dispatchers.IO) {

            val tempList: ArrayList<ProductInfoModel> = arrayListOf()
            for (item in productInfoModels ?: otcApiList.value as MutableList<ProductInfoModel>) {
//                val qty = async { localDbUseCase.getAddedQtyOfAddedMedicine(item.product.productCode) }.await()
                val qty = localDbUseCase.getAddedQtyOfAddedMedicine(item.product.productCode)
                if (qty == 0) tempList.add(item/*.also { it.product.qty = 0 }*/)
            }
            otcMedicineList.postValue(tempList)
        }
    }

    private fun deleteOTCLocalDb(productCode: String?) {//apilist = 10
        try {
            if (productCode == null) return
            val filteredList = otcApiList.value?.filter { it.product.productCode == productCode }

            val temp = otcMedicineList.value

            if (!filteredList.isNullOrEmpty()) temp?.add(
                filteredList.first().also { it.product.qty = 0 })
            temp?.let {
                otcMedicineList.postValue(it)
            }
            viewModelScope.launch(Dispatchers.IO) {
                filterOtcList(null)
            }
        } catch (_: Exception) {
        }
    }

    fun fetchReOrderOTCProductV1(
        customerId: String?,
        patientId: Long,
        orderId: Long
    ) = viewModelScope.launch(Dispatchers.IO) {

        val productCodes: MutableSet<String> = HashSet()
        with(localDbUseCase.getAddedMedicines()
            .filter {
                it.prevOrderId > 0L
            } ?: emptyList()) {

            this.forEach {
                it.medicineId.let { pCode ->
                    productCodes.add(pCode)
                }
            }

            cartUseCase.fetchReOrderOTCProductV1(mxInternalErrorOccurred,productCodes, customerId, patientId, orderId)
                .let { apiData ->
                    showLoading.postValue(false)
                    loaderValue.postValue(false)
                    if (apiData?.responseData == null) {
                        isShowOtc.postValue(false)
                    } else {
                        isShowOtc.postValue(true)

                        if (apiData.responseData != null) {
                            if ((apiData.responseData?.reOrderCrossSellingProduct
                                    ?: emptyList()).isNotEmpty()
                            ) {
                                showReorderOtc.postValue(
                                    Event(
                                        (apiData.responseData?.reOrderCrossSellingProduct
                                            ?: emptyList()).size >= 5
                                    )
                                )
                                otcApiList.postValue(apiData.responseData?.reOrderCrossSellingProduct as MutableList<ProductInfoModel>?)
                                filterOtcList(apiData.responseData?.reOrderCrossSellingProduct as MutableList<ProductInfoModel>?)
                            } else showReorderOtc.postValue(Event(false))
                        } else showReorderOtc.postValue(Event(false))
                    }
                }
        }

    }

    fun onAddCrossSellingPd(topDealProduct: ProductInfoModel, qty: Int) {
        viewModelScope.launch(Dispatchers.IO) {

            /*val result1 = viewModelScope.async { add(topDealProduct.productAsCartItem(false, 1), null, false) }
            val result2 = viewModelScope.async { triggerSaveMeds(SharedPrefManager.getInstance().incompleteOrderId, false, "SUMMARY") }
            awaitAll(result1, result2)*/
            var itemAdded = MxItemAdded()
            itemAdded.clickedOnPage = "order_summary"
            itemAdded.sectionIndex = 1
            itemAdded.pageSection = "tray"
            itemAdded.sectionHeading = "reorder_cross_selling"
            itemAdded.sectionRow = 0
            itemAdded.freeDeliveryRequiredAmount = 0.0

            orderFlowUseCase.addMedicineToCart(
                topDealProduct.productAsCartItem(false, 1),
                null,
                false,
                itemAdded
            )
            sendItemAddedEvent(topDealProduct, null, null, itemAdded, false)
            triggerSaveMeds(SharedPrefManager.getInstance().incompleteOrderId, false, "SUMMARY")
            eventShowOTCList.postValue(Event(Any()))
        }
    }

    open fun refreshCardData(index: Int) {
        try {
            /*if (index < 0 || index > otcMedicineList.getValue().size()) {
                index = 0;
            }*/
            if (otcMedicineList.value == null) return
            if (otcMedicineList.value!!.isNotEmpty()) {
                val dataIndex = index % otcMedicineList.value!!.size
                otcProductSelectedIndex = 0
                otcProductSelected.postValue(otcMedicineList.value!![dataIndex]) //index
                eventSmoothSnapToPosition.postValue(Event(index))
            }
            Log.d("qwerty_topDeals", "index : ${index}")
        } catch (ex: java.lang.Exception) {
        }
    }


    open fun setUpOtcList() = viewModelScope.launch(Dispatchers.IO) {

        //note:- if item present in db do not add to rv
        val otcMedicineListTemp: MutableList<ProductInfoModel> =
            java.util.ArrayList<ProductInfoModel>()
        val dbData: List<CartMedicine> = localDbUseCase.getAddedMedicines()
//        val result = async { appDao.getCartCountFromRecentlySearch(medicineName) }.await()
//        awaitAll(result)

        if (otcApiList.value == null) return@launch
        for (i in otcApiList.value!!.indices) {
            //note:- if product in list do not add
            if (!checkProductInList(dbData, otcApiList.value!![i].product.productCode)) {
                otcMedicineListTemp.add(otcApiList.value!![i])
            }
        }
        if (otcMedicineListTemp.size == 0) {
            showOtcProducts.postValue(false)
            otcMedicineList.postValue(mutableListOf())
        } else {
            otcMedicineList.postValue(otcMedicineListTemp)
            showOtcProducts.postValue(true)
        }

        //get index of otcProductSelected
        /*int otcIndex = -1;
        if (otcProductSelected.getValue() != null) {
            for (int i = 0; i < otcApiList.getValue().size(); i++) {
                if (otcApiList.getValue().get(i).get_source().getOriginal_product_code().equals(otcProductSelected.getValue().get_source().getOriginal_product_code())) {
                    otcIndex = i;
                    break;
                }
            }
            if (otcIndex > -1) {
                otcProductSelectedIndex = otcIndex;
            }
        }*/refreshCardData(otcRefreshIndex) //otcProductSelectedIndex
    }

    open fun checkProductInList(list: List<CartMedicine>, productCode: String): Boolean {
        var match = false
        for (element in list) if (element.medicineId
                .equals(productCode)
        ) {
            match = true
            break
        }
        return match
    }

    fun openPdBottomSheet(productInfoModel: ProductInfoModel) {
        if (isSingleClickParam())
            launchPDPage.postValue(Event(productInfoModel))
    }

    fun sendAddAddressClickedEvent(mxAddAddressClicked: MxAddAddressClicked) {
        sdkEventUseCase.sendAddAddressClickedEvent(mxAddAddressClicked)
    }

    fun callEventApplyCouponClicked() {

        var orderIdEvent = SharedPrefManager.getInstance().incompleteOrderId
        var whId = SharedPrefManager.getInstance().selectedWarehouseID

        var mixPanelData =
            MxApplyCouponClick(mrpEventValue, orderIdEvent, salesPriceEventValue, whId)
        sdkEventUseCase.sendApplyCouponClickedEvent(mixPanelData)

    }

    fun callEventForPrescriptionUploadBottomSheetViewed(clickedOnPage:String,orderIdEvent:String,pageSection:String ) {
        var mixPanelData= MxPrescriptionUploadPageViewed(
            clickedOnPage=clickedOnPage,
            orderId=orderIdEvent,
            pageSection=pageSection,
            prescriptionUploadedCount=prescriptionUploadedCount2)
        sdkEventUseCase.sendPrescriptionUploadPageViewedEvent(mixPanelData)
    }
    suspend fun eventPageViewed() = viewModelScope.launch(Dispatchers.IO){

        val prevOrderId = localDbUseCase.getPrevOrderIdItemCount()
        cartViewedTrigger = true
        val numberFormat = CommonFunc.getNumberFormat()
        productNames = localDbUseCase.getAddedMedNames()

        Log.d("qwerty","productNames :: ${Gson().toJson(productNames)}")

        productIds = localDbUseCase.getAddedMedProductCode()
        /*for (i in 0..orderMedicineDetailsListData.size - 1) {
            productNames.add(orderMedicineDetailsListData[i].skuName ?: "")
            productIds.add(orderMedicineDetailsListData[i].productCode ?: "")
        }*/
        var urgencyTimeRemaining = 0L
        if (SharedPrefManager.getInstance().isFtc) {
            urgencyTimeRemaining =
                if (SharedPrefManager.getInstance().ftcCouponUrgencyVariant == "A") {
                    0
                } else {
                    SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                }
        }


        val ctaType = if ((billDetailsResponse?.paymentSelectionInfo?.paymentMethod?:"").isNotEmpty()) "mode_selected" else "select_payment_mode"
//        val ctaType = if ((billDetailsResponse?.paymentMethod?:"").isNotEmpty()) "mode_selected" else "select_payment_mode"

        var codDefaulterType:String? = null
        if ((billDetailsResponse?.restrictedPaymentType ?: 0) > 0) {
            codDefaulterType = if (billDetailsResponse?.addMoreForCod?.toInt() != 0) {
                "order_value_restriction";
            } else {
                "complete_restriction";
            }
        }


        var cartItemList = productList.value
        var substitutableMeds = mutableListOf<String>()
        var substituteMeds = mutableListOf<String>()
        if (!cartItemList.isNullOrEmpty()) {
            for (cartItem in cartItemList) {

                if (cartItem.cardType != FullWidthProductCardConstants.SUBS_ADDED) {
                    if (cartItem.product.subsFound && cartItem.suggestion != null && !cartItem.product.cxAcceptedSubs) {
                        if (cartItem.product.productCode != cartItem.suggestion!!.productCode) {
                            substitutableMeds.add(cartItem.product.skuName ?: "")
                            substituteMeds.add(cartItem.suggestion!!.skuName!!)
                        }
                    }
                }
            }
        }
    
       /* eventDeliveryDate = orderDetail.getDeliveryDate()
        val deliveryDays: Int = getDeliveryDateDaysDifference(eventDeliveryDate)*/
        val mxCartViewed = MxCartViewed(
            clickedOnPage = clickedOnPageCartModel,
            pageSection = section,
            appliedCouponName = billDetailsResponse?.couponCode,
            couponApplied = !billDetailsResponse?.couponCodeForEvent.isNullOrEmpty(),
            couponDiscountAmount = billDetailsResponse?.couponAppliedAmt,
            deliveryChargeAmount = billDetailsResponse?.deliveryCharge,
            discountAmount = billDetailsResponse?.discount,
            estimatedPayableAmount = billDetailsResponse?.payableAmt,
            isReplaceAllVisible = cartReplaceAll.value?.showReplaceAll ?: false,
            itemNames = productNames,
            mrpTotalAmount = billDetailsResponse?.mrp,
            noOfItem = productIds.size,
            orderId = SharedPrefManager.getInstance().incompleteOrderId.toString(),
            packagingChargeAmount = billDetailsResponse?.packagingCharge,
            prescriptionUploadedCount = prescriptionList.value?.size,
            productsIds = productIds,
            replaceAllTotalPossibleSavings = cartReplaceAll.value?.totalReplaceSavings ?: 0.0,
            replaceableItemsCount = cartReplaceAll.value?.substitutableMedCount ?: 0,
            rxRequired = orderDetailsData.value?.rxRequired?:false,
            salesPrice = billDetailsResponse?.sellingPrice,
            subsId = if(localDbUseCase.getSubsIdOfOrder() > 0) localDbUseCase.getSubsIdOfOrder().toString() else null,
            substitutableItemsList = if (substitutableMeds.isEmpty()) null else substitutableMeds,
            substituteItemsList = substituteMeds,//empty object is required in event if there's no substitutable_items //if (substituteMeds.isEmpty()) null else substituteMeds,
            tmCreditAmount = billDetailsResponse?.tmCredit,
            tmRewardAmount = billDetailsResponse?.tmCash,
            urgencyTimeRemaining = urgencyTimeRemaining,
            is_reorder = orderDetailsData.value?.reorder?: false,
            type_of_reorder = if (orderDetailsData.value?.reorder == true) "full" else if (prevOrderId > 0) "partial" else null ,
            total_discount_amount = billDetailsResponse?.discount.toString(),
            isChronic = isChronicAdded,
            cashHandlingCharge =  if(billDetailsResponse?.pspViewed == true) billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null,
            cashHandlingChargeApplicable = if(billDetailsResponse?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse) else null

        )
        
        val mxOrderSummaryViewed = MxOrderSummaryViewed(
            addressType = selectedAddress.addressType,
            clickedOnPage = clickedOnPageCartModel,
            codOrderValueDifference = billDetailsResponse?.addMoreForCod,
            couponApplied = !billDetailsResponse?.couponCodeForEvent.isNullOrEmpty(),
            couponDiscountAmount = billDetailsResponse?.couponAppliedAmt,
            ctaType = ctaType,
            deliveryChargeAmount = billDetailsResponse?.deliveryCharge,
            deliveryDays = orderDetailsData.value?.deliveryDays ?: 0,//backend
            discountAmount = billDetailsResponse?.discount,
            discountVariantId = SharedPrefManager.getInstance().algoSpecificVariantId,
            estimatedPayableAmount = billDetailsResponse?.payableAmt,
            gender = patientGender.value,
            isCodDefaulter = (billDetailsResponse?.restrictedPaymentType ?: 0) > 2,
            isOfferAvailable = false,
            isReorder = orderDetailsData.value?.reorder ?: false,
            itemNames = productNames,
            mrp = billDetailsResponse?.mrp,
            noOfItem = productNames.size,
            orderId = SharedPrefManager.getInstance().incompleteOrderId.toString(),
            outOfStockNo = outOfStockCount.toDouble(),
            packagingChargeAmount = billDetailsResponse?.packagingCharge,
            pageSection = section,
            patientAge = patientAge.value,
            patientType = patientType.value,
            paymentMethod = billDetailsResponse?.paymentMode,
            paymentMode = billDetailsResponse?.paymentSelectionInfo?.paymentMethod,
            prescriptionUploadedCount = prescriptionUploadedCount2,// prescriptionList.value?.size,
            productsIds = productIds,
            rxRequired = orderDetailsData.value?.rxRequired?:false,
            salesPrice = billDetailsResponse?.sellingPrice,
            shippingCity = selectedAddress.cityName,
            shippingPincode = selectedAddress.pincode?.toInt(),
            shippingState = selectedAddress.stateName,
            subsId = if (productIds.isNullOrEmpty()) {
                null
            } else {
                if(localDbUseCase.getSubsIdOfOrder() > 0) localDbUseCase.getSubsIdOfOrder().toString() else null
            },
            tmCreditAmount = billDetailsResponse?.tmCredit,
            tmRewardAmount = billDetailsResponse?.tmCash,
            codDefaulterType=codDefaulterType,
            isChronicAdded = isChronicAdded,
            typeOfReorder = if(orderDetailsData.value?.reorder==true) "full" else if(prevOrderId>0) "partial" else null,
            urgencyTimeRemaining = DateUtils.convertMillisToSeconds(
                DateUtils.convertEpochTimeStampToDateMillis(
                    SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime,
                    System.currentTimeMillis()
                )
            ),
            appliedCouponName = billDetailsResponse?.couponCode,
            cashHandlingCharge =  if(billDetailsResponse?.pspViewed == true) billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null,
            cashHandlingChargeApplicable = if(billDetailsResponse?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse) else null
        )

        if (activePage == "CART") {
            sdkEventUseCase.sendCartViewedEvent(mxCartViewed)
            cartViewedTrigger = true
        } else {
            sdkEventUseCase.sendOrderSummaryViewedEvent(mxOrderSummaryViewed)
        }
    }

    fun sendViewBillClickedEvent(mxViewBillClicked: MxViewBillClicked) {
        sdkEventUseCase.sendViewBillClickedEvent(mxViewBillClicked)
    }

    fun sendOneClickSubstitutionPopupViewedEvent(mxOneClickSubstitutionPopupViewed: MxOneClickSubstitutionPopupViewed) {
        sdkEventUseCase.sendOneClickSubstitutionPopupViewedEvent(mxOneClickSubstitutionPopupViewed)
    }

    fun sendSwitchBackClickedEvent(mxSwitchBackClicked: MxSwitchBackClicked) {
        sdkEventUseCase.sendSwitchBackClickedEvent(mxSwitchBackClicked)
    }


    //todo
//    fun sendItemOrderPlacedToMixPanel(
//        array: JSONArray?,
//        list: List<MxItemAppOrderPlaced>?
//    ) {
//        try {
//            if (list == null) return
//            val finalList: MutableList<MxItemAppOrderPlaced> = java.util.ArrayList<MxItemAppOrderPlaced>()
//            if (list != null && list.size > 0 && array != null) {
//                for (i in list.indices) {
//                    val item: MxItemAppOrderPlaced = list[i]
//                    val productCode: String = item.productId?:""
//                    for (j in 0 until array.length()) {
//                        if (productCode.equals(array.getString(j), ignoreCase = true)) {
//                            val appDao: TruemedsDao = AppController.getInstance().getAppDao()
//                            val itemAddedAttributes: ItemAddedEventAttributes =
//                                appDao.getItemAddedAttributes(if (item.productId == null) "" else item.productId)
//                            if (itemAddedAttributes != null) {
//                                if (itemAddedAttributes.getClickedPage() == null) {
//                                    item.clickedOnPage = ("")
//                                } else {
//                                    item.clickedOnPage = (itemAddedAttributes.getClickedPage())
//                                }
//                                var sectionHeading: String? =
//                                    itemAddedAttributes.getSectionHeading()
//                                if (sectionHeading != null && sectionHeading == "") sectionHeading =
//                                    null
//                                item.sectionHeading = (sectionHeading)
//                                item.pageSection = (itemAddedAttributes.getPageSection())
//                                if (itemAddedAttributes.getClickedPage() != null && itemAddedAttributes.getClickedPage()
//                                        .equals("search_result")
//                                ) {
//                                    item.sectionIndex = ("0")
//                                } else {
//                                    item.sectionIndex = (
//                                        java.lang.String.valueOf(
//                                            itemAddedAttributes.getSectionIndex()
//                                        )
//                                    )
//                                }
//                            }
//                            finalList.add(item)
//                            break
//                        }
//                    }
//                }
//            }
//            for (item in finalList) {
//                val json = JSONObject(Gson().toJson(item))
//                AppController.getInstance().getMixPanelEvent()
//                    .sendMixPanelEvent(MixPanelEvent.MIX_EVENT_ITEM_APP_ORDER_PLACED, json)
//                Log.e("Order Summary", "end of item_order_placed")
//            }
//        } catch (ex: java.lang.Exception) {
//            ex.printStackTrace()
//            Log.e("Order Summary", "exception of item_order_placed")
//        }
//    }

    suspend fun placeOrderMP() {
        try {
    
            val addedItems = localDbUseCase.getAddedMedProductCode()
            val addedItemNames = localDbUseCase.getAddedMedNames()
            
            val jArrOrgIds = ArrayList<String?>()
            val jArrSubsIds = ArrayList<String?>()
            val jArrOrgName = ArrayList<String?>()
            
            if (productList.value != null) {
                for (i in (productList.value ?: Collections.emptyList()).indices) {
                    val model1: ProductInfoModel = productList.value!![i]
                    jArrSubsIds.add(model1.suggestion?.productCode)
                    /*jArrOrgIds.add(model1.product.productCode)
                    jArrOrgName.add(model1.product.skuName)*/
                }

            }
    
            if (addedItems.isNotEmpty()) {
                for (i in addedItems.indices) {
                    jArrOrgIds.add(addedItems[i])
                }
            }
            if (addedItemNames.isNotEmpty()) {
                for (i in addedItemNames.indices) {
                    jArrOrgName.add(addedItemNames[i])
                }
            }
    
            
            /*val productIdArray = JSONArray()
            if (!addedItems.isNullOrEmpty()) {
                for (i in addedItems.indices) {
                    jArrOrgIds.add(addedItems[i])
                    productIdArray.put(addedItems[i])
                }
            }

            sendItemOrderPlacedToMixPanel(productIdArray, listOf())*/
            val isAddedCrossSelling: Boolean = localDbUseCase.getAddedCrossSellingProductCount() > 0
            val isTmContactSaved: Boolean = localDbUseCase.getSavedContactsCount() > 0
            val trayDetails: List<String> = localDbUseCase.getTrayDetailsOfItemAddedAttributes()
            val expList: List<String> = localDbUseCase.getAllCustomerCategory()

            val customerDetails: CustomerDetails = localDbUseCase.getCustomerDetails(SharedPrefManager.getInstance().loggedInUserMobile)
            //val subsCount = localDbUseCase.getOrgCountFromSubsMed()

            val cxAcceptedSubsCount = cartMedicineListResponse.filter { it.product.cxAcceptedSubs }


            sdkEventUseCase.sendAppOrderPlacedEvent(
                MxAppOrderPlaced(
                    addressType = SharedPrefManager.getInstance().addressType,
                    appliedCouponName = SharedPrefManager.getInstance().couponModel?.promoCode,
                    clickedOnPage = clickedOnPageCartModel,
                    codOrdervalueDifference = addMoreForCod.value,
                    couponApplied = SharedPrefManager.getInstance().couponModel != null,
                    couponDiscountAmount = if(billDetails.value?.mxCouponAppliedAmount != null) billDetails.value?.mxCouponAppliedAmount else null,
                    crossSellingTraysUsed = removeDuplicates(trayDetails).toString(),
                    deliveryChargeAmount = billDetails.value?.deliveryChargesValue,
                    deliveryDays = orderDetailsData.value?.deliveryDays ?: 0,
                    discountAmount = billDetails.value?.discountValue,
                    discountVariantId = SharedPrefManager.getInstance().algoSpecificVariantId,
                    estimatedPayableAmount = billDetails.value?.estimatedPayableValue,
                    experimentList = expList.toString(),
                    gender = patientGender.value?:"",
                    isChronic = isChronicAdded ?: false,
                    isCodDefaulter = ((paymentRestrictedType.value) ?: 0) > 0,
                    isCrossSellingItemPresent = isAddedCrossSelling,
                    isGeneric = isGenericAdded,
                    isOtc = isOtcAdded ?: false,
                    isReorder = SharedPrefManager.getInstance().isReOrder,
                    isTmContactSaved = isTmContactSaved,
                    itemNames = jArrOrgName,
                    mrp = billDetails.value?.mrpValue,
                    noOfItem = cartItemCount.value,
                    orderId = SharedPrefManager.getInstance().incompleteOrderId.toString(),
                    outOfStockNo = outOfStockCount,
                    packagingChargeAmount = billDetails.value?.taxesAndChargesValue,
                    /*(SharedPrefManager.getInstance().currentUserAge ?: "0").ifEmpty { "0.0" }.toDouble()*/
                    patientAge = patientAge.value?.toInt(),
                    patientType = if(patientType.value.equals("OTHER", true)) "someone_else" else patientType.value,
                    paymentMethod = if(!paymentModeSelected.value.isNullOrEmpty()) paymentModeSelected.value else null,
                    prescriptionUploadedCount = prescriptionUploadedCount2,
                    productsIds = if (jArrOrgIds.isNullOrEmpty()) null else jArrOrgIds,
                    rxRequired = rxRequired,
                    salesPrice = billDetails.value?.sellingPrice,//(mrp.value!! * (billDetails.value?.discountValue!! * 0.01)),
                    shippingCity = SharedPrefManager.getInstance().selectedCity,
                    shippingPincode = SharedPrefManager.getInstance().pincode,
                    shippingState = SharedPrefManager.getInstance().selectedState,
                    /*subsIdEventValue.toString()?:""*/
                    subsId = if(addedItemNames.size==0) null else if(localDbUseCase.getSubsIdOfOrder() > 0) localDbUseCase.getSubsIdOfOrder().toString() else null,
                    tmCreditAmount = billDetails.value?.tmCreditValue,
                    tmRewardAmount = billDetails.value?.tmRewardValue,
                    whId = SharedPrefManager.getInstance().selectedWarehouseID,
                    cxAcceptedSubsCount = cxAcceptedSubsCount.size,
                    previousStage = if (SharedPrefManager.getInstance().isReOrder && !orderPreviousStage.isNullOrEmpty()) orderPreviousStage else null,
                    pageSection = if (orderPageSection == "null") "main" else orderPageSection ?: "main",
                    urgencyTimeRemaining = if (SharedPrefManager.getInstance().isFtc) SharedPrefManager.getInstance().ftcCouponExpiryTime else BundleConstants.MX_FTC_COUNTDOWN_TIME_IN_SEC,
                    reorderCrossSelling = isAddedCrossSelling,
                    reorderType = if (SharedPrefManager.getInstance().isReOrder) "full" else null,
                    reorderPatientName = if(SharedPrefManager.getInstance().isReOrder) SharedPrefManager.getInstance().patientName else null,
                    cashHandlingCharge = if(billDetailsResponse?.pspViewed == true) billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null,
                    cashHandlingChargeApplicable = if(billDetailsResponse?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsResponse) else null
                )
            )
        } catch (ex: Exception) {
            ex.message
        }
    }

    open fun removeDuplicates(listWithDuplicates: List<String>?): List<String>? {
        val uniqueSet: Set<String> = java.util.HashSet(listWithDuplicates)
        return java.util.ArrayList(uniqueSet)
    }

    private fun getOgSubSkuName() {
        productList.value.let { it ->
            if (it != null) {
                for (item in it) {
                    productOgSkuName.add(item.product.switchBackSkuName)
                    suggestionSkuName.add(item.product.skuName)
                    Log.d("TAG", "getOgSubSkuName: $item")
                }
            }
        }
    }
    fun sendFtcCounterStarted(timestamp: Long) {
        val mxUrgencyTimerStarted = MxUrgencyTimerStarted(
            DateUtils.convertMillisToSeconds(DateUtils.convertEpochTimeStampToDateMillis(timestamp, System.currentTimeMillis())))
        sdkEventUseCase.sendFtcTimerStartedEvent(mxUrgencyTimerStarted)
    }

    fun sendProductDetailFirebaseEvent(productCode: String?, skuName: String?) {
        firebaseEvent.cartPdPage(FirebaseEventModel(mobile = SharedPrefManager.getInstance().loggedInUserMobile,
            customerId = SharedPrefManager.getInstance().loggedInUserId, productCode = productCode, productName = skuName
        ))
    }


    suspend fun fetchOrgMedsFromDBWhooseSubsWereSame(subsMedProductCode: String) : List<OrgSubsInfo> {
        return localDbUseCase.fetchOrgMedsFromDBWhooseSubsWereSame(subsMedProductCode)
    }

    fun updateLastMinuteBuyQty(pCode: String, qty: Int) {
        isLastMinuteBuyRestored = true
        medList.value?.find { it.product.productCode == pCode }?.let{
            it.product.qty = qty
        }
        medList.postValue(medList.value)
    }
    fun updateLastMinuteBuyQty() = viewModelScope.launch(IO) {
        delay(1500)
        isLastMinuteBuyRestored = true
        val updatedYourMedicineList: ArrayList<com.intellihealth.salt.models.ProductInfoModel> = arrayListOf()
        (medList.value?: emptyList()).forEach {
            val count = async { getMedicineCount(it.product.productCode) }.await()
            it.product.qty = count
            updatedYourMedicineList.add(it)
        }
        medList.postValue(updatedYourMedicineList)

    }
    
    suspend fun getMedicineCount(productCode: String) = localDbUseCase.getAddedQtyOfAddedMedicine(productCode)
    
}