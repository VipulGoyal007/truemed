package com.intellihealth.truemeds.presentation.viewmodel

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Build
import android.os.Environment
import android.text.Html
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerLib
import com.example.example.CustomerDeviceInfoRequest
import com.example.example.EventIdForCustomerRequest
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.intellihealth.salt.constants.InputFieldConstants
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.salt.models.BlogCardModel
import com.intellihealth.salt.models.BlogModel
import com.intellihealth.salt.models.OrderTrackingModel
import com.intellihealth.salt.models.ProductCardSectionModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData
import com.intellihealth.truemeds.data.model.helpfaqtnc.PrivacyPolicyAndTnCResponse
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel
import com.intellihealth.truemeds.data.model.home.CustomerHomeDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.CustomerMedicinesResponseModel
import com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse
import com.intellihealth.truemeds.data.model.home.RatingDetailsResponseModel
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel
import com.intellihealth.truemeds.data.model.home.fetchTruemedsContactResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxHomePageBannerClick
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxReferralScreenViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxStickyStripViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxUrgencyTimerStarted
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.CouponCodeDataModel
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent
import com.intellihealth.truemeds.data.model.orderflow.ReplaceAllBottomSheetModel
import com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel
import com.intellihealth.truemeds.data.model.orderstatus.OrderStatusNavModel
import com.intellihealth.truemeds.data.model.productlistanddetails.CrossSellingRecommendedProductResponse
import com.intellihealth.truemeds.data.model.productlistanddetails.HomeOtcDbAddDelete
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartItemSellingPrice
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CartMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.OrgSubsInfo
import com.intellihealth.truemeds.data.repository.datasource.local.entity.PatientNameEntity
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.data.repository.datasource.local.entity.ReorderAlternateSubs
import com.intellihealth.truemeds.data.repository.datasource.local.entity.TmContactVersion
import com.intellihealth.truemeds.data.repository.datasource.local.entity.getSellingPrice
import com.intellihealth.truemeds.data.utils.ContactManager
import com.intellihealth.truemeds.data.utils.HealthArticlesConstants
import com.intellihealth.truemeds.data.utils.HomeFragmentData
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.MessageConstant
import com.intellihealth.truemeds.data.utils.getJsonResponseFromRaw
import com.intellihealth.truemeds.data.utils.strDateTimeToDate
import com.intellihealth.truemeds.domain.enums.Banner
import com.intellihealth.truemeds.domain.enums.ProductCardSectionType
import com.intellihealth.truemeds.domain.enums.ShimmersStates
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.domain.usecase.HomePageUseCase
import com.intellihealth.truemeds.domain.usecase.LoginUseCase
import com.intellihealth.truemeds.domain.usecase.ProductListAndDetailsUseCase
import com.intellihealth.truemeds.domain.usecase.ReorderUseCase
import com.intellihealth.truemeds.domain.usecase.TmWalletUseCase
import com.intellihealth.truemeds.domain.usecase.UserDataUseCase
import com.intellihealth.truemeds.presentation.activity.ReferAndEarnActivity
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MXSuperCategorySectionImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCategoryImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxHomePageBannerImpression
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxHomePageViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxLocationSelected
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPageVisited
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPopupViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxReorderSheetViewed
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked
import com.intellihealth.truemeds.presentation.bottomsheet.home.PaymentPendingBottomSheet
import com.intellihealth.truemeds.presentation.fragment.HomeFragment
import com.intellihealth.truemeds.presentation.fragment.HomePageFeatureName
import com.intellihealth.truemeds.presentation.model.BottomSheetType
import com.intellihealth.truemeds.presentation.model.DoctorCallConfirmResponse
import com.intellihealth.truemeds.presentation.model.HomeBanner
import com.intellihealth.truemeds.presentation.model.HomePageBottomSheetInfo
import com.intellihealth.truemeds.presentation.model.HomePaymentPendingResponse
import com.intellihealth.truemeds.presentation.model.OtcDeepLink
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.ApiParameterConstants
import com.intellihealth.truemeds.presentation.utils.AppConstants.PRODUCT_SECTION_PER_PAGE_COUNT
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.DateFormats
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.truemeds.presentation.utils.SQLiteDBHelper
import com.intellihealth.truemeds.presentation.utils.getJsonResponseFromRawData
import com.intellihealth.truemeds.presentation.utils.jsonArray
import com.intellihealth.truemeds.presentation.utils.roundOffDecimal
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.internal.Contexts.getApplication
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.text.SimpleDateFormat
import java.util.Arrays
import java.util.Calendar
import java.util.Collections
import java.util.Date
import java.util.Locale
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import kotlin.math.abs
import kotlin.math.min


@HiltViewModel
open class HomeViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val homePageUseCase: HomePageUseCase,
    private val loginUseCase: LoginUseCase,
    //private val localDbUseCase: LocalDbUseCase,
    private val userDataUseCase: UserDataUseCase,
    //private val orderFlowUseCase: OrderFlowUseCase,
    //private val couponUseCase: CouponUseCase,
    private val reorderUseCase: ReorderUseCase,
    private val tmWalletUseCase: TmWalletUseCase,
    private val productListAndDetailsUseCase: ProductListAndDetailsUseCase
) : BaseViewModelWithLogin(
    loginUseCase
), DefaultLifecycleObserver {
    var userDataReceived = false;
    var resumeCount = 0
    var deviceId = ""
    var appsFlyerSdkId = ""
    var currentBannerIndex = 0
    var shouldProcessDeeplink = MutableLiveData(false)
    var featureList = MutableLiveData<List<HomePageFeatureName>>()

    var totalSavingsTillDate = MutableLiveData("")

    var prevDeliveredOrderId: Long = 0L
    var prevDeliveredPatientId: Long? = 0L
    var bottomSheetDoctorCallOrderId: String = ""

    //  var isDoctorCallScheduleToday: Boolean = false
    var doctorCallMsgBottomSheet: String = ""

    var bottomSheetDoctorCallTimerValue: String = "0"
    var bottomSheetDeliveryDate: String = ""
    var callMeButtonText: String = "Call me"
    var isDefaultPinCode = false
    var isShowPaymentPendingPopup = true
    var lastScrollPositionTrendingCity = 2
    var lastScrollPositionLimitedOffers = 2
    var lastScrollPositionNewArrivals = 2
    var lastScrollPositionYourMedicine = 2
    var yourMedicineView = false
    var trendingInYourCityView = false
    var newArrivalAndLimittedOfferView = false
    var crossSellingClick = HomeFragment.CrossSellingClick.TRENDING_IN_YOUR_CITY
    var isRoundedCornerBottomSheet =  MutableLiveData<Boolean>(false)


    private var _bannerList: MutableLiveData<List<HomeBanner.Banner>> =
        MutableLiveData<List<HomeBanner.Banner>>()
    val bannerList: LiveData<List<HomeBanner.Banner>> get() = _bannerList

    private var _homeGenericList: MutableLiveData<List<HomeBanner.Banner>> =
        MutableLiveData<List<HomeBanner.Banner>>(emptyList())
    val homeGenericList: LiveData<List<HomeBanner.Banner>> get() = _homeGenericList

    private var _alertUrl = MutableLiveData<String>(null)
    val alertUrl: LiveData<String?> get() = _alertUrl

    private var _referralData = MutableLiveData<CustomerHomeDetailsResponseModel.ResponseData?>()
    val referralData: LiveData<CustomerHomeDetailsResponseModel.ResponseData?> get() = _referralData

    private var _callDetails = MutableLiveData<String>(null)
    val callDetails: LiveData<String?> get() = _callDetails

    val substituteViewExampleClick = MutableLiveData(false)
    val substituteCardImageClick = MutableLiveData(false)
    val timerValue = MutableLiveData("")

    private val launchUploadRx = MutableLiveData<Event<Any>>()
    val eventLaunchUploadRx: LiveData<Event<Any>> get() = launchUploadRx
    val urgencyCouponData: CouponCodeResponse.Coupon? = null

    var ftcCouponResponse: List<CouponCodeResponse.Coupon>? = null

    val eventLaunchRatingBottomSheet: LiveData<Event<Any>> get() = launchRatingBottomSheet

    private val launchRatingBottomSheet = MutableLiveData<Event<Any>>()

    val eventShowRatingSubmittedPopup: LiveData<Event<Any>> get() = launchShowRatingSubmittedPopup

    private val launchShowRatingSubmittedPopup = MutableLiveData<Event<Any>>()

    /*var couponList: MutableLiveData<MutableList<CouponCodeResponse.Coupon>> =
        MutableLiveData(mutableListOf())
    var searchedCouponList: MutableList<CouponCodeResponse.Coupon> = mutableListOf()
    var tempList: MutableLiveData<MutableList<CouponCodeResponse.Coupon>> =
        MutableLiveData(mutableListOf())*/
    private val launchLearnMore = MutableLiveData<Event<Any>>()
    val eventLaunchLearnMore: LiveData<Event<Any>> get() = launchLearnMore

    //var totalSavingTillDate: String = ""


    var isActiveOrderClosed = MutableLiveData(false)
    var activeBottomNav: MutableLiveData<String> = MutableLiveData()
    var activeMenu = MutableLiveData(R.id.homeFragment)
    var ratingBottomSheetId: String = "0"


    // var apiCalledCount=0
    private val applyCouponFailed = MutableLiveData<Event<Any>>()
    val eventApplyCouponFailed: LiveData<Event<Any>> get() = applyCouponFailed
    private val openCouponPopup =
        MutableLiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponSaveRemoveResponse?>>>()
    private val openCouponPopupOffline =
        MutableLiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponResponse>>>()
    val eventOpenCouponPopupOffline: LiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponResponse>>> =
        openCouponPopupOffline
    val eventOpenCouponPopup: LiveData<Event<Pair<CouponCodeResponse.Coupon?, CouponSaveRemoveResponse?>>> get() = openCouponPopup
    private val _notificationDetailData = MutableLiveData<CouponCodeDataModel?>()
    val notificationDetailData: LiveData<CouponCodeDataModel?> = _notificationDetailData

    private val showMessage = MutableLiveData<Event<MessageConstant>>()
    val eventMessage: LiveData<Event<MessageConstant>> get() = showMessage

    // private val showMessageLocationBottomSheet = MutableLiveData<Event<MESSAGES>>()
    // val eventMessageLocationBottomSheet: LiveData<Event<MESSAGES>> get() = showMessageLocationBottomSheet

    val showMessageFragment = MutableLiveData(HomeFragmentData(MESSAGES.NO_MESSAGE))
    val showMessageCatrgoryList = MutableLiveData(HomeFragmentData(MESSAGES.NO_MESSAGE))
    val showMessageBlogListFragment = MutableLiveData(HomeFragmentData(MESSAGES.NO_MESSAGE))
    val showMessageProductListFragment = MutableLiveData(HomeFragmentData(MESSAGES.NO_MESSAGE))
    val showMessageNewArrivalList = MutableLiveData(HomeFragmentData(MESSAGES.NO_MESSAGE))
    val showMessageYourMedicine = MutableLiveData(HomeFragmentData(MESSAGES.NO_MESSAGE))
    val showMessageLimitedOfferList = MutableLiveData(HomeFragmentData(MESSAGES.NO_MESSAGE))
    val showMessageTrendingInYourCity = MutableLiveData(HomeFragmentData(MESSAGES.NO_MESSAGE))

    var ratingBottomSheetCommentData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var pincodeData: MutableLiveData<ErrorMessageData> =
        MutableLiveData(ErrorMessageData("", InputFieldConstants.STATE_DEFAULT))

    var selectedCategory = -1
    var selectedSubCategory = -1

    var pincodeSelectedMethod = ""
    var previousChipSelectedPos: Int = 0
    var pageCount: Int = 0
    var customerOrderPageCount = 1
    var customerOrderTotalPageCount = 0
    var reOrderPosition = 0
    var resultValue: Int = 5
    var yourMedicinePatientId: String? = null
    var yourMedicineSelectedPos: Int = 0
    var isFirstTimeApiCall: Boolean = true
    var isLoadMoreCase: Boolean = false
    var showAcceptPpTncResult = MutableLiveData<Boolean>(false)
    var isFirstTimeReOrderApiCall: Boolean = true
    var sellingPrice: Double? = null
    var currentOrderStatus: Int? = 0
    var currentOrderState: String? = null

    // var showShimmerMedicinesList : Boolean=false
    var showShimmerMedicinesList = MutableLiveData<Boolean>(false)
    val showShimmerMedicinesListLiveData: LiveData<Boolean> get() = showShimmerMedicinesList

    /*
        var responsePatientMedicinesList: CustomerMedicinesResponseModel? = null
    */
    var yourMedicinePatientList: List<CustomerMedicinesResponseModel.ResponseData.PatientDetail> =
        emptyList()

    val addressList =
        MutableLiveData<List<GetAllAddressResponse.ResponseObj?>?>(Collections.emptyList())
    val getAddressList: LiveData<List<GetAllAddressResponse.ResponseObj?>?> get() = addressList
    var selectedAddressId: Long = SharedPrefManager.getInstance().addressId
    var isLoadingView: MutableLiveData<Boolean> = MutableLiveData(false)
    val isLoadingDeliveryDetailBottomSheetView = MutableLiveData(false)
    private val fetchAllOrdersOfCustomersMutableLiveData: MutableLiveData<AllCustomersOrdersResponseModel?> =
        MutableLiveData()
    val fetchAllOrdersOfCustomers: LiveData<AllCustomersOrdersResponseModel?> =
        fetchAllOrdersOfCustomersMutableLiveData

    var setReorderData = MutableLiveData(true)
    var fetchAllOrdersOfCustomerList: MutableList<AllCustomersOrdersResponseModel.ResponseData.Orders?> =
        ArrayList()
    var activeOrdersMutableLiveData: MutableLiveData<List<OrderTrackingModel>> = MutableLiveData()
    var activeAllOrdersMutableLiveData: MutableLiveData<AllCustomersOrdersResponseModel?> =
        MutableLiveData()
    var newBillAmount: MutableLiveData<Double> = MutableLiveData()
    var orderId: MutableLiveData<Long> = MutableLiveData()
    var drCallConfirmCount: MutableLiveData<Int> = MutableLiveData()
    var drCallConfirmEventMutableLiveData = MutableLiveData<DoctorCallConfirmResponse>()
    val drCallConfirmEventLiveData: LiveData<DoctorCallConfirmResponse> get() = drCallConfirmEventMutableLiveData

    var selectedCity = MutableLiveData("Select")
    val getSelectedCity: LiveData<String> get() = selectedCity
    var optionReasonType = MutableLiveData("")

    //var paymentMethodDetailsData = MutableLiveData<Event<HomePaymentPendingResponse>>()
    var paymentMethodDetailsData = MutableLiveData<List<HomePaymentPendingResponse>>()
    var editMedicineApiSuccess = MutableLiveData(false)

    //these parameters are used in health articles section api calling
    private var categoryName = ""
    private var sourceUrl = ""
    private var aname = ""
    var uriDeeplink: String = ""
    var intentData: MutableLiveData<Intent> = MutableLiveData(Intent())

    var ratingDetailsList: MutableList<RatingDetailsResponseModel.ResponseData.RatingDetail> =
        mutableListOf()


    // var categoryListModels = arrayListOf<com.intellihealth.truemeds.presentation.model.BlogCardModel?>()
    //var responseBlogList : BlogModel?=null
    var blogs = arrayListOf<BlogCardModel>()
    var blogDataModel: BlogModel = BlogModel(
        heading = "Health Articles",
        description = "Read about health tips and guidance",
        blogCardModel = blogs
    )

    //setting product list regarding parameters
    var trendingInCityResponse: CrossSellingRecommendedProductResponse? = null
    var newArrivalResponse: CrossSellingRecommendedProductResponse? = null
    var limitedTimeOfferResponse: CrossSellingRecommendedProductResponse? = null
    var responsePatientMedicinesList: CustomerMedicinesResponseModel? = null
    var sessionToken = ""
    lateinit var productCardDataModel: ProductCardSectionModel
    var isDrCallMissedBsShown = false
    var isRatingBsShown = false
    var isLocationBsShown = false
    var isPP_TnCPopupShown = false
    var isPP_Bottomsheet_Visible = false
    var isTnc_Bottomsheet_Visible = false
    var acceptedPP = false
    var acceptedTnC = false
    var tncApiCalled = false
    var healthArticleData = MutableLiveData<BlogCardModel>()
    private var privacyTncResponseM =
        MutableLiveData<Event<List<PrivacyPolicyAndTnCResponse.Legal>>>()
    val privacyTncResponse: LiveData<Event<List<PrivacyPolicyAndTnCResponse.Legal>>> get() = privacyTncResponseM
    var showPpTncLoader = MutableLiveData(false)

    //var isCallAndOrderClicked = MutableLiveData(false)
    var isCallAndOrderClicked = MutableLiveData<Boolean>(false)
    private var _showShimmerHome = MutableLiveData(true)
    val showShimmerHome: LiveData<Boolean> get() = _showShimmerHome

    var showBlockerVw20 = MutableLiveData<Boolean>(true)


    /*var showHomePage = MutableLiveData<Boolean>(false)
    val showHomeLiveData: LiveData<Boolean> get() = showHomePage*/

    private val _productCardStackedClick =
        MutableLiveData<ProductInfoModel>()
    val productCardStackedClick: LiveData<ProductInfoModel> =
        _productCardStackedClick

    val productCardStackedDeleteData = MutableLiveData<HomeOtcDbAddDelete>()


    //save number bottom sheet parameters
    var showLoadingOnSaveContact = MutableLiveData(false)
    var saveContactMap = HashMap<String, List<String>>()
    var dismissBottomSheetAfterSaveContact = MutableLiveData(false)
    var isContactPermissionGranted = MutableLiveData(false)
    var contactSavedTriggered = false

    var previousWarehouseIdSent = SharedPrefManager.getInstance().selectedWarehouseID
    var replaceAllModel = ReplaceAllBottomSheetModel(
        0.0, 0.0, 0.0,
        0.0, listOf(), "", listOf()
    )
    var showSaveContactBottomSheet = MutableLiveData<Boolean>(false)
    var showPaymentPendingBottomSheet = MutableLiveData<Boolean>(false)

    //deep link event
    private val pastDeliverOrder: ArrayList<AllCustomersOrdersResponseModel?> = ArrayList()
    private val openReferAndEarnActivityForDeepLink = MutableLiveData<Event<Any>>()
    val eventOpenReferAndEarnActivityForDeepLink: MutableLiveData<Event<Any>> get() = openReferAndEarnActivityForDeepLink

    private val cartClick = MutableLiveData<Event<Any>>()
    val eventCartClick: MutableLiveData<Event<Any>> get() = cartClick

    private val searchSuggestionClick = MutableLiveData<Event<Any>>()
    val eventSearchSuggestionClick: MutableLiveData<Event<Any>> get() = searchSuggestionClick

    private val openPdPage = MutableLiveData<Event<Pair<String, String>>>()

    val eventOpenPdPage: MutableLiveData<Event<Pair<String, String>>> get() = openPdPage

    private val openHealthArticle = MutableLiveData<Event<Pair<String, Boolean>>>()

    val eventOpenHealthArticle: MutableLiveData<Event<Pair<String, Boolean>>> get() = openHealthArticle

    val openSearchProduct = MutableLiveData<Event<Pair<String, String>>>()

    val eventOpenSearchProduct: MutableLiveData<Event<Pair<String, String>>> get() = openSearchProduct

    private val openReminderActivity = MutableLiveData<Event<Any>>()
    val eventOpenReminderActivity: MutableLiveData<Event<Any>> get() = openReminderActivity

    private val openMyOrderActivity = MutableLiveData<Event<Any>>()
    val eventOpenMyOrderActivity: MutableLiveData<Event<Any>> get() = openMyOrderActivity

    private val openAccountPage = MutableLiveData<Event<Any>>()
    val eventOpenAccountPage: MutableLiveData<Event<Any>> get() = openAccountPage

    /*private val openCartActivity = MutableLiveData<Event<Any>>()
    val eventOpenCartActivity: MutableLiveData<Event<Any>> get() = openCartActivity*/

    private val openOrderStatusPage = MutableLiveData<Event<OrderStatusNavModel>>()
    val eventOpenOrderStatusPage: MutableLiveData<Event<OrderStatusNavModel>> get() = openOrderStatusPage


    private val showHomeScreenOtcCategories = MutableLiveData<Event<Any>>()
    val eventShowHomeScreenOtcCategories: MutableLiveData<Event<Any>> get() = showHomeScreenOtcCategories
    var ftcCouponData: MutableLiveData<CouponCodeResponse.Coupon?> = MutableLiveData(null)

    private val openOtcScreen = MutableLiveData<OtcDeepLink?>()
    val eventOpenOtcScreen: MutableLiveData<OtcDeepLink?> get() = openOtcScreen
    val homePaymentPendingResponseList = ArrayList<HomePaymentPendingResponse>()

    private val startSplashScreenEvent = MutableLiveData<Event<Unit>>()
    var isHomeAddressAdded = false
    var isOfficeAddressAdded = false


    val startSplashScreen: LiveData<Event<Unit>>
        get() = startSplashScreenEvent
    var otcBanners = MutableLiveData<List<SuperCategoryModel.BannersItem>>(emptyList())

    val openCouponFailed = MutableLiveData<Event<CouponCodeResponse.Coupon?>>()
    val eventOpenCouponFailed: LiveData<Event<CouponCodeResponse.Coupon?>> get() = openCouponFailed
    var hasMoreTrendingPages = true
    var trendingList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
        arrayListOf()
    var hasMoreYourMedicenePages = true
    var yourMedicineList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
        arrayListOf()
    var hasMoreLimitedOfferPages = true
    var limitedOfferList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
        arrayListOf()
    var hasMoreNewArrivalsPages = true
    var newArrivalsList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
        arrayListOf()
    var chipList =
        java.util.ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData>()
    var reorderResponseCustomerOrdersList: AllCustomersOrdersResponseModel? = null

    var mxLastBannerClicked = -1
    var lastBannerImageUrl: String? = null
    var showImageAlert = MutableLiveData(false)
    // var myMedicinesCurrentPatientIdSelected: String? = null

    var db: SQLiteDatabase? = null

    //event data
    var clickedOnPage = "homepage" //todo need to set value from entire project
    var billDetailsData: BillDetailResponse.ResponseData? = null
    var medicineListDataReceived: ArrayList<MedicineListDetailsSent> = arrayListOf()
    var sectionHeading = ""
    var sectionIndex = 0
    var mxInternalErrorOccurred = MxInternalErrorOccurred()
    var pageSection = "main"
    var srpPageSectionFromDeeplink = ""

    var stackedListCurrentPageCount: Int = 0
    val activeProductShimmerState: MutableLiveData<ShimmersStates<Boolean>> = MutableLiveData()
    val activeStackedProductShimmerState = MutableLiveData(true)
    val healthArticleShimmerState = MutableLiveData(true)

    open fun getAppSqliteDatabase(): SQLiteDatabase? {
        if (db == null) {
            db = getApplication(context).openOrCreateDatabase("TM", Context.MODE_PRIVATE, null)
        }
        return db
    }


    companion object {
        val postLoginAction = MutableLiveData(false)
        val reloadMyOrders = MutableLiveData(false)
        var tmWallet = MutableLiveData(0.0)
    }

    private fun getTrendingSearches() {
        viewModelScope.launch(IO) {
            val data = orderFlowUseCase.getTrendingSearches(
                mxInternalErrorOccurred,
                warehouseId = SharedPrefManager.getInstance().selectedWarehouseID,
                sessionToken = loginUseCase.getSessionToken(
                    mxInternalErrorOccurred,
                    SharedPrefManager.getInstance().fcm
                ),
                0,
                10
            )
            SharedPrefManager.getInstance().trendingSearch = Gson().toJson(data)
        }
    }

    fun setEventReferralScreenViewed(isBottomNav: Boolean) {
        var whId = SharedPrefManager.getInstance().selectedWarehouseID
        var mixPanelData = MxReferralScreenViewed(isBottomNav, whId)
        sdkEventUseCase.sendReferralScreenViewedEvent(mixPanelData)
    }

    /**
     * Get banners for home page
     * **/
    suspend fun getBannersForHomePage() {
        val subType: MutableSet<String> = HashSet()
        subType.add("BANNERS")
        subType.add("ALERT")
        subType.add("HOME_GENERIC")
        subType.add("UPI_INFO_URL")

        val homePageBannersResponse =
            homePageUseCase.getBannersForHomePage(
                mxInternalErrorOccurred,
                "app",
                subType,
                Banner.HOME
            )
        homePageBannersResponse?.let { bannerResponse ->
            _bannerList.postValue(bannerResponse.responseData?.banners ?: listOf())
            _homeGenericList.postValue(bannerResponse.responseData?.homeGeneric ?: listOf())
            _alertUrl.postValue(bannerResponse.responseData?.alert ?: "")
            SharedPrefManager.getInstance().customerCareNumber =
                bannerResponse.responseData?.callDetails ?: "08069808861"
            SharedPrefManager.getInstance().supportEmailId =
                bannerResponse.responseData?.supportEmailId ?: "support@truemeds.in"
            _callDetails.postValue(bannerResponse.responseData?.callDetails ?: "08069808861")

            if (bannerResponse.responseData?.alert != null && !bannerResponse.responseData?.alert
                    .equals("") && !bannerResponse.responseData?.alert.equals("null")
            ) {
                showImageAlert.postValue(true)
            } else {
                showImageAlert.postValue(false)
            }
//            _showShimmerHome.postValue(false)
            showBlockerVw20.postValue(false)

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
        variantId: Long?,
        clickedOnPage: String?,
        section: String?
    ) = viewModelScope.launch(IO) {
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
            SharedPrefManager.getInstance().setIsReOder(true)
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
                SharedPrefManager.getInstance().newSelectedPinCode = false
                pageSection = section ?: "reorder_sheet"
                getMedicineOrderDetailsList(mxInternalErrorOccurred, it, true)
                setMedicineListDataReceived()
//                loaderValue.postValue(false)
            }
        }
    }

    fun setMedicineListDataReceived() {
        viewModelScope.launch(IO) {
            try {
                medicineListDataReceived.clear()
                val productIdsList = localDbUseCase.getAddedMedProductCode()
                val productNamesList = localDbUseCase.getAddedMedNames()
                for (i in 0..productIdsList.size!! - 1) {
                    medicineListDataReceived.add(
                        MedicineListDetailsSent(
                            productIdsList[i],
                            productNamesList[i]
                        )
                    )

                }
            } catch (_: Exception) {
            }
        }
    }


    @SuppressLint("SimpleDateFormat")
    fun fetchOtcProduct() {
        var sessionToken = ""
        viewModelScope.launch(IO) {
            val simpleDate = SimpleDateFormat(DateFormats.YYYY_MM_DD_HH_MM_SS)
            val stringForBase64 =
                CommonFunc.getSourceVersionName() + "-" + simpleDate.format(Date())
            val fcmToken = SharedPrefManager.getInstance().fcm
            sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred, fcmToken)
            /*if (fcmToken.equals("")) {
                val defaultToken = loginUseCase.fetchDefaultToken(stringForBase64)
                if(!defaultToken?.responseData?.token.isNullOrEmpty())
                sessionToken = loginUseCase.getSessionToken(defaultToken?.responseData?.token!!)
            } else {
                sessionToken = loginUseCase.getSessionToken(fcmToken)
            }*/

            val crossSellTrendingCity: MutableSet<String> = HashSet()
            crossSellTrendingCity.add("TRENDING_IN_CITY")
        }
    }

    /****
     *  set FTC coupon notification data
     */
    fun getFtcCouponData() {
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty())
            viewModelScope.launch(IO) {
    
                var categoryType = "NFTC_DynamicDiscount"
                val genericDiscountVariantId = localDbUseCase.getCustomerCategoryId(UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType)
                if (genericDiscountVariantId > 0) {
                    categoryType = UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType
                }
                couponUseCase.fetchAllOffers(
                    mxInternalErrorOccurred, 100,
                    SharedPrefManager.getInstance().pincode.toString(),
                    "URGENCY_COUPON",
                    if (SharedPrefManager.getInstance().isFtc) "FTC_Coupon_Urgency" else categoryType,//UserCategoryEnum.GENERIC_CAP_DISCOUNT.apiCategoryType,
                    if (SharedPrefManager.getInstance().algoSpecificVariantId == null || SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId
                )?.let {
                    ftcCouponResponse = it.responseData
                    if (SharedPrefManager.getInstance().couponModel == null) {
                        if (it.responseData.isNotEmpty()) {
                            ftcCouponData.postValue(it.responseData.first())
                        } else {
                            ftcCouponData.postValue(null)
                        }
                    } else {
                        SharedPrefManager.getInstance().couponModel.also { savedModel ->
                            if (savedModel.showFtcCounter == true && it.responseData.isNotEmpty() && it.responseData.first().promoCode == savedModel.promoCode) {
                                ftcCouponData.postValue(savedModel)
                            } else if (it.responseData.isNotEmpty()) ftcCouponData.postValue(it.responseData.first())
                            else ftcCouponData.postValue(null)
                        }
                    }
                }
            }
    }

    private fun filterByFtcCounterValue(responseData: List<CouponCodeResponse.Coupon>): List<CouponCodeResponse.Coupon> {
        return responseData.filter { it.showFtcCounter == true }
    }

    fun homeBannerItemClick(position: Int, bannerItemModel: BannerItemModel) {
        Log.d("*** HomePage", " Banner " + position + " : " + bannerItemModel.id)
        lastBannerImageUrl = bannerItemModel.imageUrl
        mxLastBannerClicked = position
    }

    fun homeActionCardItemClick(type: Int) {
        when (type) {
            //Prescription
            0 -> {
                launchUploadRx.postValue(Event<Any>(""))
            }
            //CallAndOrder
            1 -> {
                isCallAndOrderClicked.postValue(true)
                Log.d("*** Action Card", "CallAndOrder Click ")
            }
            //Pharmacist
            2 -> {
                Log.d("*** Action Card", "Pharmacist Click ")
            }
            //ModifyOrder
            3 -> {
                Log.d("*** Action Card", "ModifyOrder Click ")
            }
            //ChangeAddress
            4 -> {
                Log.d("*** Action Card", "ChangeAddress Click ")
            }
            //CartPrescription
            5 -> {
                Log.d("*** Action Card", "CartPrescription Click ")
            }
            //TMWallet
            6 -> {
                Log.d("*** Action Card", "TMWallet Click ")
            }
            //ReferralCode
            7 -> {
                Log.d("*** Action Card", "ReferralCode Click ")
            }
        }
    }

    fun productCardSectionViewAllClicked(sectionName: String) {
        Log.d("*** Product Card", "sectionName : " + sectionName)
    }

    fun productCardStackedSectionViewAllClicked(sectionName: String) {
        Log.d("*** ProductCard Stacked", "sectionName : " + sectionName)
    }

    fun productCardCartItemPlus(data: ProductInfoModel?, pos: Int, qty: Int) {
        Log.d(
            "*** Product Card",
            data?.product?.skuName + " : " + "cartItemPlus: pos = $pos | qty = $qty"
        )
    }

    fun productCardCartItemMinus(data: ProductInfoModel?, pos: Int, qty: Int) {
        Log.d(
            "*** Product Card",
            data?.product?.skuName + " : " + " cartItemPlus: pos = $pos | qty = $qty"
        )
    }

    fun productCardStepperError(data: ProductInfoModel?, pos: Int, msg: String) {
        Log.d("*** Product Card", "stepperError : pos = $pos | msg = $msg")
    }

    fun substituteInfoCardLearnMore(msg: String) {
        Log.d("*** SubstituteInfo Card", msg)
        launchLearnMore.postValue(Event<Any>(""))
    }

    fun substituteInfoCardViewExample(msg: String) {
        Log.d("*** SubstituteInfo Card", msg)
        substituteViewExampleClick.postValue(true)
    }

    fun substituteInfoCardImageClicked(msg: String) {
        substituteCardImageClick.postValue(true)
    }

    fun blogCardViewClickCallback(msg: String, blogModel: BlogCardModel) {
        healthArticleData.postValue(blogModel)
        showMessageBlogListFragment.postValue(HomeFragmentData(MESSAGES.REDIRECT_TO_HEALTH_DETAIL_ARTICLE))
    }

    fun blogCardViewAllClick(msg: String) {
        showMessageBlogListFragment.postValue(HomeFragmentData(MESSAGES.REDIRECT_TO_HEALTH_ARTICLE))
    }

    fun blogCardArticleReadCallback(msg: String, blogModel: BlogCardModel) {
        healthArticleData.postValue(blogModel)
        showMessageBlogListFragment.postValue(HomeFragmentData(MESSAGES.REDIRECT_TO_HEALTH_DETAIL_ARTICLE))
    }

    /*****************************************************
     * Updated functions according to new DTO start here *
     *****************************************************/


    var bottomSheetTrigger: MutableLiveData<HomePageBottomSheetInfo>? =
        MutableLiveData(HomePageBottomSheetInfo(BottomSheetType.EMPTY, 0))
    var selectedSuperCategory = MutableLiveData("")
    var selectedSuperCategoryIndex = MutableLiveData(0)
    val eventSuperCategoryClick = MutableLiveData<Pair<Int, Int>>()
    val superCategoryList = MutableLiveData<List<SuperCategoryModel>>(emptyList())
    val bottomSheetPriority = mutableListOf(HomePageBottomSheetInfo(BottomSheetType.EMPTY, 0))
    val isAllBottomSheetCollected = MutableLiveData(false)
    var isMedicineRefreshRequired = false
    var isBottomSheetSkippedDueToHomeSwitch = false
    var isPaymentPendingToShow = false

    /**
     * This is used to get Testimonials list
     */
    fun getTestimonials() = homePageUseCase.getTestimonials()

    /**
     * This is used to get Re-order data
     */
    //fun getDeliveredOrders() = homePageUseCase.getDeliveredOrders()

    /**
     * This function is used to get Delivered orders
     * **/
    suspend fun getAllCustomerOrdersForDeliverDetails() {

        val response = homePageUseCase.getAllCustomerOrders(
            mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
            customerOrderPageCount,
            5,
            setOf("Delivered Orders"),
            //setOf()
            ""
        )
        if (response != null) {
            Log.d("TAG", "fetchAllOrdersOfCustomers: " + response)
            getTotalCustomerOrderPageCount(response)
            SharedPrefManager.getInstance().deliveredOrderCount =
                response.responseData?.recordsCount ?: 0

            if (response?.responseData?.ordersList.isNullOrEmpty() || response?.responseData?.ordersList?.size == 0)
                setReorderData.postValue(false)


            //  var existingOrdersList = fetchAllOrdersOfCustomersMutableLiveData.value?.responseData?.ordersList
            //  existingOrdersList?.addAll(response?.responseData?.ordersList!!)

            if (reorderResponseCustomerOrdersList == null)
                reorderResponseCustomerOrdersList = response
            else
                reorderResponseCustomerOrdersList?.responseData?.ordersList?.addAll(response?.responseData?.ordersList!!)


            // fetchAllOrdersOfCustomersMutableLiveData.postValue(tempResponseCustomerOrdersList)

            //only new response is posted on every api call bcoz sdk only needs next items previous items are mantained automatically by SDK
            fetchAllOrdersOfCustomersMutableLiveData.postValue(response)
            pastDeliverOrder.add(response)
        }
    }

    /**
     * This function is used to get Active orders
     * **/
    suspend fun getAllCustomerActiveOrders() {
        var count = 0
        var paymentPendingCount = 0
        var paymentOrderId: Long = 0
        var orderListItem: AllCustomersOrdersResponseModel.ResponseData.Orders? = null
        val list = arrayListOf<OrderTrackingModel>()
        if (homePaymentPendingResponseList.isNotEmpty()) {
            homePaymentPendingResponseList.clear()
        }
        val response = homePageUseCase.getAllCustomerOrders(
            mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
            customerOrderPageCount,
            10,
            setOf("Active Orders"),
            // setOf()
            ""
        )
        var tempPaymentPendingCount = 0
        if (response != null) {
            if (response.responseData?.ordersList?.isNotEmpty()!!) {

                //Sorting the list on basis of orderID
                Collections.sort(
                    response.responseData.ordersList,
                    Comparator { o1: AllCustomersOrdersResponseModel.ResponseData.Orders, o2: AllCustomersOrdersResponseModel.ResponseData.Orders ->
                        o2.orderId.compareTo(o1.orderId)
                    }
                )
                response.responseData.ordersList.let {
                    it.forEach {
                        /*if (it.doctorCallConfirm) {
                            count++
                            //orderId.postValue(it.orderId)
                            //newBillAmount.postValue(it.paymentValue)
                            //drCallConfirmCount.postValue(count)
                            drCallConfirmEventMutableLiveData.postValue(
                                DoctorCallConfirmResponse(
                                    it.orderId,
                                    it.paymentValue, count, it.discount
                                )
                            )
                        }*/

                        if (it.paymentPending) {
                            paymentPendingCount++
                            paymentOrderId = it.orderId
                            orderListItem = it

                            getBillDetails(paymentOrderId, orderListItem!!, paymentPendingCount)
                        }
                        list.add(
                            it.toSdkActiveOrderList(context)
                        )
                        //this code is added to calculate all payment pending counts
                        if (it.paymentPending) {
                            tempPaymentPendingCount = tempPaymentPendingCount + 1
                        }
                    }
                }
                if (tempPaymentPendingCount > 1)
                    isShowPaymentPendingPopup = false
                else
                    isShowPaymentPendingPopup = true


                //if (paymentPendingCount == 1) {

                //}
                Log.e("list_item_active:::", list.toString())

                // sdadadadsds
                activeOrdersMutableLiveData.postValue(list)
                showDeliveryDelayBottomSheet(response)

                Log.d("Intent", "onCreate: processDeepLinkingAndNotificationCall ")
            }
            activeOrdersMutableLiveData.postValue(list)
//            shouldProcessDeeplink.postValue(true)
        }
    }

    fun getAllOrder() {
        viewModelScope.launch(IO) {
            val response = homePageUseCase.getAllCustomerOrders(
                mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
                0,
                1,
                setOf("All orders"),
                // setOf()
                ""
            )

            if (response != null) {

                if (response.responseData?.ordersList?.isNotEmpty()!!) {
                    SharedPrefManager.getInstance().activeOrderCount =
                        response.responseData.recordsCount
                }

            }
        }
    }

    /***
     *  setting MixPanel SDK event for sticky_strip_viewed
     */
    fun urgencyStickyViewedEvent(couponResponse: CouponCodeResponse.Coupon) {
        val mxStickyStripViewed = MxStickyStripViewed(
            clickedOnPage = "homepage",
            couponId = couponResponse.offerId.toString(),
            couponName = couponResponse.promoCode,
            couponSubtitle = couponResponse.description,
            isCouponApplied = SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode == couponResponse.promoCode,
            urgencyTimeRemaining = if (couponResponse.showFtcCounter == true) {
                DateUtils.convertMillisToSeconds(
                    DateUtils.convertEpochTimeStampToDateMillis(
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime,
                        System.currentTimeMillis()
                    )
                )
            } else {
                null
            }
        )
        sdkEventUseCase.sendFtcStickyStripViewedEvent(mxStickyStripViewed)
    }

    /***
     *  setting MixPanel SDK event for sticky_strip_clicked
     */
    fun urgencyStickyClickedEvent(couponResponse: CouponCodeResponse.Coupon?) {
        val mxStickyStripViewed = MxStickyStripViewed(
            clickedOnPage = "homepage",
            couponId = couponResponse?.offerId.toString(),
            couponName = couponResponse?.promoCode,
            couponSubtitle = couponResponse?.description,
            isCouponApplied = SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode == couponResponse?.promoCode,
            urgencyTimeRemaining = if (couponResponse?.showFtcCounter == true) {
                DateUtils.convertMillisToSeconds(
                    DateUtils.convertEpochTimeStampToDateMillis(
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime,
                        System.currentTimeMillis()
                    )
                )
            } else {
                null
            }
        )
        sdkEventUseCase.sendFtcStickyStripClickedEvent(mxStickyStripViewed)
    }


    private suspend fun getBillDetails(
        orderId: Long,
        orderListItem: AllCustomersOrdersResponseModel.ResponseData.Orders,
        paymentPendingCount: Int
    ) {
        loaderValue.postValue(true)
        viewModelScope.launch(IO) {
            val response =
                orderFlowUseCase.calculateBillDetailsforApp(mxInternalErrorOccurred, orderId, true)
            if (response != null) {
                billDetailsData = response.responseData
                mrpEventValueFromBaseVM = billDetailsData?.mrp ?: 0.0
                salesPriceEventValueFromBaseVM = billDetailsData?.sellingPrice ?: 0.0

                loaderValue.postValue(false)
                if (response.responseData == null) return@launch

                var strikePackagingCharge = 0.0
                response.responseData.packagingCharge?.let {
                    strikePackagingCharge = 3 * it
                }
                sellingPrice = response.responseData.sellingPrice
                currentOrderStatus = response.responseData.currentOrderStatus
                currentOrderState = response.responseData.currentOrderState
                val billData = CommonFunc.convertToBillDetails(
                    response.responseData,
                    "",
                    totalPayable = response.responseData.payableAmt.toString(),
                    gst = context.getString(R.string.gst),
                    sellerPackagingCharge = context.getString(R.string.seller_packaging_charges),
                    "",
                    "",
                    strikePackagingCharge
                )


                homePaymentPendingResponseList.add(
                    HomePaymentPendingResponse(
                        billData,
                        orderListItem,
                        response.responseData.paymentSelectionInfo,
                        paymentPendingCount,
                        response.responseData.cashHandlingInfo,
                        response.responseData
                    )
                )
//                Log.d("qwerty", "Bill Details : ${Gson().toJson(billData)}")
//                Log.d("homePaymentList", "" + homePaymentPendingResponseList)
//                Log.d("homePaymentListsize", "" + homePaymentPendingResponseList.size)
                paymentMethodDetailsData.postValue(
                    homePaymentPendingResponseList
                )

                /*paymentMethodDetailsData.postValue(
                    Event(
                        HomePaymentPendingResponse(
                            billData,
                            orderListItem,
                            response.responseData.paymentSelectionInfo,
                            paymentPendingCount
                        )
                    )
                )*/

            }
        }
    }


    private suspend fun showDeliveryDelayBottomSheet(response: AllCustomersOrdersResponseModel) {
        if (response.responseData?.ordersList?.isNotEmpty()!!) {
            if (response.responseData.ordersList[0].doctorCallMissed && !response.responseData.ordersList[0].callbackRequested) {
                bottomSheetDoctorCallOrderId =
                    response.responseData.ordersList[0].orderId.toString()
                bottomSheetDeliveryDate = response.responseData.ordersList[0].deliveryDate

                callMeButtonText = response.responseData.ordersList[0].homepageActionButtonText

                if (response.responseData.ordersList[0].drCallbackValidMillis.toString()
                        .isNullOrEmpty()
                )
                    bottomSheetDoctorCallTimerValue = "0"
                else
                    bottomSheetDoctorCallTimerValue =
                        response.responseData.ordersList[0].drCallbackValidMillis.toString()


                //  bottomSheetDoctorCallTimerValue = "10009444"

                val currentTime = SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().time)
                val hours =
                    SimpleDateFormat("HH:mm:ss", Locale.US).format(Calendar.getInstance().time)
                        .split(":")[0]
                val minutes =
                    SimpleDateFormat("HH:mm:ss", Locale.US).format(Calendar.getInstance().time)
                        .split(":")[1]
                val seconds =
                    SimpleDateFormat("HH:mm:ss", Locale.US).format(Calendar.getInstance().time)
                        .split(":")[2]

                if (hours.toDouble() >= HomeSectionConstants.CURRENT_HOUR_1_PM && hours.toDouble() <= HomeSectionConstants.CURRENT_HOUR_11_PM && (if (hours.toDouble() == HomeSectionConstants.CURRENT_HOUR_11_PM) (minutes.toDouble() == 0.0 && seconds.toDouble() == 0.0) else true && isShowPaymentPendingPopup)) {
                    val model = homePageUseCase.getBottomSheetData(
                        BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER,
                        null
                    )
                    bottomSheetPriority.add(model)
//                    bottomSheetTrigger.postValue(
//                        model
//                    )
                } else if (hours.toDouble() <= HomeSectionConstants.CURRENT_HOUR_11_PM && hours.toDouble() >= HomeSectionConstants.CURRENT_HOUR_9_AM && (if (hours.toDouble() == HomeSectionConstants.CURRENT_HOUR_9_AM) (minutes.toDouble() == 0.0 && seconds.toDouble() == 0.0) else true && isShowPaymentPendingPopup)) {
                    val model = homePageUseCase.getBottomSheetData(
                        BottomSheetType.DOCTOR_CALL_MISSED_CALL_BACK,
                        null
                    )
//                    bottomSheetTrigger.postValue(
//                        model
//                    )
                    bottomSheetPriority.add(model)

                } else if (hours.toDouble() >= HomeSectionConstants.CURRENT_HOUR_9_AM && hours.toDouble() <= HomeSectionConstants.CURRENT_HOUR_1_PM && (if (hours.toDouble() == HomeSectionConstants.CURRENT_HOUR_1_PM) (minutes.toDouble() == 0.0 && seconds.toDouble() == 0.0) else true && isShowPaymentPendingPopup)) {
                    val model = homePageUseCase.getBottomSheetData(
                        BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW,
                        null
                    )
//                    bottomSheetTrigger.postValue(
//                        model
//                    )
                    bottomSheetPriority.add(model)

                } else {
                    val model = homePageUseCase.getBottomSheetData(
                        BottomSheetType.DOCTOR_CALL_MISSED_CALL_BACK,
                        null
                    )
                    bottomSheetPriority.add(model)
                }
            }
        }

    }

    fun savePopUpReasonsActiveOrders(buttonType: String, orderId: Long) {
        viewModelScope.launch(IO) {
            val reasonId = localDbUseCase.getSubOptReasonId(buttonType)
            val response = homePageUseCase.savePopUpReasons(
                mxInternalErrorOccurred, orderId,
                reasonId.toLong(), ApiParameterConstants.SUBS_OPT_REASONS
            )
            if (response != null) {
                optionReasonType.postValue(buttonType)
            }
        }
    }

    private fun getTotalCustomerOrderPageCount(response: AllCustomersOrdersResponseModel) {
        customerOrderTotalPageCount = response.responseData?.pageCount!!
    }

    /**
     * This is used to get user saved address list
     */
    fun getSavedAddressesList(customerId: Long) = viewModelScope.launch(IO) {
        val savedAddressList = userDataUseCase.getAllAddresses(mxInternalErrorOccurred, customerId)
        /***
         * Check last selected address ID in the API result address list to show last selected address id
         */

        //below code is added manage home and office selection condition on AddAddressActivity.kt
        isOfficeAddressAdded = false
        isHomeAddressAdded = false

        savedAddressList?.forEach { address ->
/*            if (address?.addressId == SharedPrefManager.getInstance().addressId) {
                address?.selected = true
            }*/
            if (address?.pincode == SharedPrefManager.getInstance().pincode.toString() &&
                address?.addressId == SharedPrefManager.getInstance().addressId
            ) {
                address.selected = true
                pincodeSelectedMethod = "existing_address"
            }

            //below code is added manage home and office selection condition on AddAddressActivity.kt
            if (address?.addressType.equals("office", true))
                isOfficeAddressAdded = true
            else if (address?.addressType.equals("home", true))
                isHomeAddressAdded = true
        }


        addressList.postValue(savedAddressList?.sortedBy { it?.selected != true })

        when {
            !savedAddressList.isNullOrEmpty() -> {
                isLoadingView.postValue(false)
            }

            else -> {
                isLoadingView.postValue(false)
            }
        }
    }

    /**
     * This is used to open bottom sheet using type
     */
    fun displayBottomSheet(bottomSheetType: BottomSheetType, header: String = "") {
        viewModelScope.launch {
            /*if (reOrderPosition < (fetchAllOrdersOfCustomers.value?.responseData?.ordersList?.size
                    ?: 0)
            ) {
                fetchAllOrdersOfCustomers.value?.responseData?.ordersList?.get(reOrderPosition)
                    ?.let {
                        bottomSheetTrigger.postValue(
                            homePageUseCase.getBottomSheetData(
                                reorder,
                                it
                            )
                        )
                    }
            }

             */

            if (reOrderPosition < (fetchAllOrdersOfCustomerList.size)) {
                Log.e("case1::", "::yes")
                fetchAllOrdersOfCustomerList[reOrderPosition]
                    ?.let {
                        val model = homePageUseCase.getBottomSheetData(
                            bottomSheetType,
                            it
                        )
//                        bottomSheetTrigger.postValue(
//                            model
//                        )
                        bottomSheetPriority.add(model)
                    }
            } else {
                Log.e("case2::", "::yes")
                val model = homePageUseCase.getBottomSheetData(
                    bottomSheetType,
                    null,
                    header
                )
//                bottomSheetTrigger.postValue(
//                    model
//                )
                bottomSheetPriority.add(model)


            }
        }
    }

    /**
     * To get OTC category list, invoke this
     */
    private suspend fun getSuperCategoryList() {
        val sessionToken = loginUseCase.getSessionToken(
            mxInternalErrorOccurred,
            SharedPrefManager.getInstance().fcm
        )
        /*val simpleDate = SimpleDateFormat(DateFormats.YYYY_MM_DD_HH_MM_SS)
        val stringForBase64 =
            CommonFunc.getSourceVersionName() + "-" + simpleDate.format(Date())
        val fcmToken = SharedPrefManager.getInstance().fcm
        if (fcmToken.equals("")) {
            val defaultToken =
                loginUseCase.fetchDefaultToken(mxInternalErrorOccurred, stringForBase64)
            if (!defaultToken?.responseData?.token.isNullOrEmpty())
                sessionToken = loginUseCase.getSessionToken(
                    mxInternalErrorOccurred,
                    defaultToken?.responseData?.token!!
                )
        } else {
            sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred, fcmToken)
        }*/
        val homePageResponse = homePageUseCase.getSuperCategoryList(
            mxInternalErrorOccurred, sessionToken,
            SharedPrefManager.getInstance().selectedWarehouseID
        )

        if (homePageResponse?.categories.isNullOrEmpty()) {
            showMessageCatrgoryList.postValue(HomeFragmentData(MESSAGES.HOME_PAGE_OTC_RESPONSE_FAILED))
        } else {
            superCategoryList.postValue(homePageResponse?.categories ?: emptyList())
            showMessageCatrgoryList.postValue(HomeFragmentData(MESSAGES.HOME_PAGE_OTC_RESPONSE))
            processDeepLinkingForOtc(homePageResponse?.categories)
        }
    }

    /*fun getFeatureList(): List<HomePageFeatureName> {
        return homePageUseCase.getFeatureList(SharedPrefManager.getInstance().isFtc)
    }*/


    //performing submit rating api calling here
    fun performSubmitRating(saveRatingDetailsRequestDataModel: SaveRatingDetailsRequestDataModel?) {
        viewModelScope.launch(IO) {
            performSubmitRatingApiCall(saveRatingDetailsRequestDataModel)
        }
    }

    suspend fun performSubmitRatingApiCall(saveRatingDetailsRequestDataModel: SaveRatingDetailsRequestDataModel?) {
        val response = homePageUseCase.saveRatingDetails(
            mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
            ratingBottomSheetId.toLong(),
            saveRatingDetailsRequestDataModel
        )
        response?.let {
            Log.e("submitRatingDetails::", "rating_data::" + response.toString())
            launchShowRatingSubmittedPopup.postValue(Event(Any()))

        }
    }

    //performing get rating api calling here
    private suspend fun getRatingDetails() {
        val response = homePageUseCase.getRatingDetails(mxInternalErrorOccurred)
        response?.let {
            Log.e("getRatingDetails::", "rating_data::" + it.responseData.ratingDetails.toString())
            ratingDetailsList.addAll(it.responseData.ratingDetails)

            launchRatingBottomSheetDialog()
        }
    }

    /**
     * To get Customer and Order details for Home, invoke this
     */
    private suspend fun getCustomerDetailsForHome(): Boolean {
        val response = userDataUseCase.getCustomerAndOrderDetailsForHome(
            mxInternalErrorOccurred,
            SharedPrefManager.getInstance().loggedInUserId.toLong()
        )

        if (response == null) {
            //sendHomePageViewedEvent()
            return false
        } else {
            response.let {

                //remove this code once functionality developed
                /* Log.e("rating_home","yes")
                     ratingBottomSheetId="2"
                     getRatingDetails()*/

                SharedPrefManager.getInstance().accountTmCredit =
                    (it.responseData?.tmCredit ?: 0f).toFloat()
                userDataReceived = true
                it.responseData?.customerDetails?.mobileNo?.let { mobileNumber ->
                    customerMobile.postValue(
                        mobileNumber
                    )
                }

                it.responseData?.orderIdForRating?.let { rating ->
                    // call rating bottomsheet here
                    Log.e("rating_home", "yes")
                    if (!rating.isNullOrEmpty() && rating.toInt() > 0) {
                        ratingBottomSheetId = rating
                        getRatingDetails()
                    }

                }

                it.responseData?.incompleteOrderId?.let { orderId ->
                    if (orderId == 0L && SharedPrefManager.getInstance().incompleteOrderId > 0) {
                        localDbUseCase.clearCart()
                    }
                    SharedPrefManager.getInstance().incompleteOrderId = orderId
                    /*if (orderId > 0) {
                        getMedicineOrderDetailsList(orderId, false)*/
                    /*setMedicineListDataReceived()
                }*/
                }
                it.responseData?.prescriptionCount?.let { count ->
                    SharedPrefManager.getInstance().prescriptionCount = count
                }
                it.responseData?.isFtc?.let { ftc ->
                    SharedPrefManager.getInstance().isFtc = ftc
                }
                it.responseData?.totalSavingsTillDate?.let { savings ->
                    totalSavingsTillDate.postValue("\u20B9 $savings")
                    SharedPrefManager.getInstance().totalSavingTillDate = savings
                }
                it.responseData?.tmWallet?.let { wallet ->
                    SharedPrefManager.getInstance().tmWallet = wallet.toString()
                    tmWallet.postValue(roundOffDecimal(wallet))

                }
                it.responseData?.prevDeliveredOrderId?.let { orderId ->
                    prevDeliveredOrderId = orderId
                }
                it.responseData?.prevDeliveredPatientId?.let { patientId ->
                    prevDeliveredPatientId = patientId
                }

                if (SharedPrefManager.getInstance().addressId <= 0L) {
                    it.responseData?.prevDeliveredAddressId?.let { addressId ->
                        SharedPrefManager.getInstance().addressId = addressId
                    }
                } /*else{
                    if(it.responseData?.prevDeliveredAddressId == null){
                        SharedPrefManager.getInstance().addressId = 0L
                        SharedPrefManager.getInstance().address = ""
                        SharedPrefManager.getInstance().addressType = ""
                    }
                }*/

                /* if(it.responseData?.prevDeliveredAddressId == null) {
                     SharedPrefManager.getInstance().addressId = 0L
                     SharedPrefManager.getInstance().address = ""
                     SharedPrefManager.getInstance().addressType = ""
                 }
 */
                /*   if (SharedPrefManager.getInstance().addressId > 0L) {
                       if(it.responseData?.prevDeliveredAddressId == null){
                           SharedPrefManager.getInstance().addressId = 0L
                           SharedPrefManager.getInstance().address = ""
                           SharedPrefManager.getInstance().addressType = ""
                       }
                   }*/

                if (SharedPrefManager.getInstance().patientId <= 0L) {
                    it.responseData?.prevDeliveredPatientId?.let { patientId ->
                        SharedPrefManager.getInstance().patientId = patientId
                    }
                }

                it.responseData?.referralData?.let { referralData ->
                    //call get rating api
                    if (referralData.referralAmount != null && referralData.referralAmount!! > 0) _referralData.postValue(
                        it.responseData
                    )
                }

                userDataUseCase.setupUserCategory(
                    mxInternalErrorOccurred, it.responseData?.customerDetails?.categoryList,
                    (it.responseData?.prevDeliveredAddressId ?: 0) > 0
                )

                acceptedPP = it.responseData?.acceptedPP ?: true
                acceptedTnC = it.responseData?.acceptedTnC ?: true
                if (!isPP_TnCPopupShown) {
                    if (!acceptedPP) {
                        showMessage.postValue(Event(MessageConstant(MESSAGES.SHOW_ACCEPT_POLICY_POPUP)))
                    } else if (!acceptedTnC) {
                        showMessage.postValue(Event(MessageConstant(MESSAGES.SHOW_ACCEPT_TERM_CONDITION)))
                    }
                    isPP_TnCPopupShown = true
                }
                setCartCount()


            }
            if (activeMenu.value == R.id.homeFragment) {
                sendHomePageViewedEvent()
            }
            return true
        }


    }


    private fun addMedicinesToCart(
        cartMedicine: CartMedicine,
        orgSubsInfo: OrgSubsInfo?,
        isSubs: Boolean
    ) = viewModelScope.launch(IO) {
        val count =
            async { localDbUseCase.getAddedQtyOfAddedMedicine(cartMedicine.medicineId) }.await()
        if (count == 0) {
            localDbUseCase.addToCart(cartMedicine, orgSubsInfo, isSubs)
        } else {
            localDbUseCase.updateMedicineQuantity(cartMedicine.medicineId, cartMedicine.addedQty)
        }
    }

    private fun callSaveAaIDApi() {
        viewModelScope.launch(IO) {
            //Api calling 1
            var aaid = ""
            if (SharedPrefManager.getInstance().googleAdId != null) {
                aaid = SharedPrefManager.getInstance().googleAdId
            }
            userDataUseCase.saveAaIdAndFcm(
                mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId?.toLong(),
                aaid, SharedPrefManager.getInstance().getFcm()
            )


        }
    }

    private fun callCustomerDeviceInfo(deviceID: String = "") {
        viewModelScope.launch(IO) {

            val internetIpResponse = userDataUseCase.getInternetIp() ?: ""


            //Api calling 2
            val customerId: String = SharedPrefManager.getInstance().loggedInUserId
            val fcm: String = SharedPrefManager.getInstance().fcm
            val appInstanceId: String = SharedPrefManager.getInstance().firebaseAppInstanceId


            val manufacturerName = Build.MANUFACTURER
            val deviceModel = Build.MODEL
            val osVersion = Build.VERSION.RELEASE
            val appVersion = BuildConfig.VERSION_NAME
            val googleAdId: String = SharedPrefManager.getInstance().getGoogleAdId() ?: ""
            val source = "APP"

            val requestData = CustomerDeviceInfoRequest(
                customerId, googleAdId, fcm, deviceID, manufacturerName,
                deviceModel, osVersion, appVersion, source, internetIpResponse, appInstanceId
            )

            userDataUseCase.setCustomerDeviceInfo(mxInternalErrorOccurred, requestData)

        }
    }

    private fun callEventIDForCustomerApi(sdkId: String = "") {
        viewModelScope.launch(IO) {

            var aaid = ""
            if (SharedPrefManager.getInstance().getGoogleAdId() != null) {
                aaid = SharedPrefManager.getInstance().getGoogleAdId()
            }

            val source = "APP"


            //Api calling 3
            val sdkVersion = AppsFlyerLib.getInstance().sdkVersion
            val requestData2 =
                EventIdForCustomerRequest(
                    aaid,
                    sdkVersion,
                    sdkId,
                    SharedPrefManager.getInstance().loggedInUserId,
                    "TM_ANDROID_V" + BuildConfig.VERSION_NAME,
                    source
                )

            Log.e("json_object::", requestData2.toString())

            userDataUseCase.setEventIdForCustomer(mxInternalErrorOccurred, listOf(requestData2))
            //showBottomSheetByPriority()

        }
    }

    suspend fun callPatientListMedicineListApi(pageIndex: Int = 0) {
        if (hasMoreYourMedicenePages) {
            responsePatientMedicinesList = homePageUseCase.fetchMedicineDetailsOfPatient(
                mxInternalErrorOccurred, SharedPrefManager.getInstance().loggedInUserId,
                pageIndex,
                PRODUCT_SECTION_PER_PAGE_COUNT,
                yourMedicinePatientId
            )
        }
        if (responsePatientMedicinesList != null) {
            if (yourMedicinePatientList.isEmpty()) {
                yourMedicinePatientList =
                    responsePatientMedicinesList?.responseData?.patientDetails ?: emptyList()
            } else {
                responsePatientMedicinesList?.responseData?.patientDetails = yourMedicinePatientList
            }
        }
        Log.e("responseMedicines::111", responsePatientMedicinesList.toString())

//        if (responsePatientMedicinesList != null) {
//            updateQtyForYourMedicine()
//        }
        if (pageIndex == 0) {
            yourMedicineList = (responsePatientMedicinesList?.responseData?.productList
                ?: arrayListOf()) as ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>
        } else {
            yourMedicineList.addAll(
                responsePatientMedicinesList?.responseData?.productList ?: emptyList()
            )
        }

        if (responsePatientMedicinesList != null && responsePatientMedicinesList!!.responseData != null && !responsePatientMedicinesList?.responseData?.productList.isNullOrEmpty() && hasMoreYourMedicenePages) {
            responsePatientMedicinesList?.responseData?.productList = yourMedicineList
            updateQtyForYourMedicineResponse()
        } else if (responsePatientMedicinesList?.responseData?.productList.isNullOrEmpty()) {
            hasMoreYourMedicenePages = false
            if (pageIndex == 0) {
                showMessageYourMedicine.postValue(HomeFragmentData(MESSAGES.PATIENT_LIST_MEDICINE_LIST_RESPONSE_FAILED))
            }
        } else {
            showMessageYourMedicine.postValue(HomeFragmentData(MESSAGES.PATIENT_LIST_MEDICINE_LIST_RESPONSE_FAILED))
        }
    }

    private fun callHealthArticlesListApi(userAgent: String, urlParam: String) {
        viewModelScope.launch(IO) {
            healthArticleShimmerState.postValue(true)
//            delay(9000)
            val data = homePageUseCase.getHealthArticlesResult(
                mxInternalErrorOccurred,
                userAgent,
                urlParam
            )
            data?.let {
                val jsonObject = getJsonResponseFromRaw(data)
                if (jsonObject == null) {
                    showMessageBlogListFragment.postValue(HomeFragmentData(MESSAGES.BLOG_LIST_RESPONSE_FAILED))
                    return@let
                } else if (jsonObject.has("array")) {

                    val array = jsonObject.getJSONArray("array")
                    var rend: String? = null
                    var slug: String? = null
                    var author: String? = null
                    var createdOn: String? = null
                    var id: String? = null
                    val date1: Date? = null
                    //var wp_id: String? = null
                    var date: Date


                    val listSize = if (array.length() >= 5) 5 else array.length()
                    for (i in 0 until listSize) {
                        val jsonObject1 = array.getJSONObject(i)
                        if (jsonObject1.has("title")) {
                            val titleObject = jsonObject1.getJSONObject("title")
                            rend = titleObject.getString("rendered")
                            slug = jsonObject1.getString("slug")
                            val createddate = jsonObject1.getString("date")
                            val createdOnN = createddate.substring(0, createddate.length - 9)
                            val date2: Date = strDateTimeToDate(createdOnN)!!
                            val formatter5 = SimpleDateFormat("dd MMM yyyy")
                            createdOn = formatter5.format(date2)
                            id = jsonObject1.getString("id")
                            val list: JSONObject =
                                jsonObject1.getJSONObject("yoast_head_json").getJSONObject("schema")
                                    .getJSONArray("@graph")[0] as JSONObject
//                            val gson = GsonBuilder().create()
////                            chipList = gson.fromJson<ArrayList<String>>(
//                                list.getJSONArray("articleSection").toString(), object :
//    //                                TypeToken<ArrayList<String>>() {}.type
//                            )
                        }
                        if (jsonObject1.has("_embedded")) {
                            val embeddedObjec = jsonObject1.getJSONObject("_embedded")
                            val arrayAuthor = embeddedObjec.getJSONArray("author")
                            val athoritem = arrayAuthor.getJSONObject(0)
                            author = athoritem.getString("name")
                            if (embeddedObjec.has("wp:featuredmedia")) {
                                val featuremedia = embeddedObjec.getJSONArray("wp:featuredmedia")
                                val jsomedia = featuremedia.getJSONObject(0)
                                sourceUrl = jsomedia.getString("source_url")
                            }
                            if (embeddedObjec.has("wp:term")) {
                                val jsonArray = embeddedObjec.getJSONArray("wp:term")
                                val wparray = jsonArray.getJSONArray(0)
                                val wparray_lent = wparray.length()
                                chipList =
                                    java.util.ArrayList<com.intellihealth.salt.models.HealthArticleChipCategoryData>()
                                for (k in 0 until wparray_lent) {
                                    val wptermobject = wparray.getJSONObject(k)
                                    if (k == 0)
                                    // Convert the HTML content to plain text
                                        categoryName =
                                            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                                                Html.fromHtml(
                                                    wptermobject.getString("name"),
                                                    Html.FROM_HTML_MODE_LEGACY
                                                ).toString()
                                            } else {
                                                Html.fromHtml(wptermobject.getString("name"))
                                                    .toString()
                                            }
                                    chipList.add(
                                        com.intellihealth.salt.models.HealthArticleChipCategoryData(
                                            wptermobject.getString("id"),
                                            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                                                Html.fromHtml(
                                                    wptermobject.getString("name"),
                                                    Html.FROM_HTML_MODE_LEGACY
                                                ).toString()
                                            } else {
                                                Html.fromHtml(wptermobject.getString("name"))
                                                    .toString()
                                            }
                                        )
                                    )
                                    //wp_id = wptermobject.getString("id")

                                    /*if (aname.equals(wp_id) || aname === "2") {
//                                        tvCateHeadline.setText("Showing $category_name Articles")
                                    }*/
                                }
                            }


                            blogs.add(
                                BlogCardModel(
                                    date = createdOn ?: "",
                                    chipTitle = categoryName ?: "",
                                    title = rend ?: "",
                                    imgUrl = sourceUrl,
                                    writtenBy = author ?: "",
                                    slug = slug,
                                    chipList = chipList,
                                )
                            )
                        }

                    }
                    blogDataModel = BlogModel(
                        heading = "Health Articles",
                        description = "Read about health tips and guidance",
                        blogCardModel = blogs
                    )

                    if (blogs.isNullOrEmpty()) {
                        showMessageBlogListFragment.postValue(HomeFragmentData(MESSAGES.BLOG_LIST_RESPONSE_FAILED))
                        healthArticleShimmerState.postValue(false)
                    } else {
                        showMessageBlogListFragment.postValue(HomeFragmentData(MESSAGES.BLOG_LIST_RESPONSE))
                        healthArticleShimmerState.postValue(false)
                    }
                }
            }
        }
    }

    fun callBothStackedProductApi(
        pageIndex: Int = 0,
        productType: ProductCardSectionType = ProductCardSectionType.BOTH
    ) {
        var warehouseId = SharedPrefManager.getInstance().selectedWarehouseID
        /*if (!warehouseId.isNullOrEmpty())
            warehouseId = SharedPrefManager.getInstance().selectedWarehouseID*/
        val type = "App"
        val variantId: Long = SharedPrefManager.getInstance().algoSpecificVariantId

        viewModelScope.launch(IO) {
            val fcmToken = SharedPrefManager.getInstance().fcm
            sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred, fcmToken)



            try {
                when (productType) {
                    ProductCardSectionType.TOP -> {
                        Log.e("api_called::::", "::::case1")
                        if (pageIndex == 0) {
                            activeProductShimmerState.postValue(ShimmersStates.LimitedOffer(true))
//                            delay(11000)
                            hasMoreLimitedOfferPages = true
                        }
                        if (hasMoreLimitedOfferPages) {
                            limitedTimeOfferResponse = async {
                                getLimitedOffers(warehouseId, pageIndex, type, variantId)
                            }.await()
                        }

                        if (pageIndex == 0) {
                            limitedOfferList =
                                (limitedTimeOfferResponse?.responseData?.LIMITED_OFFER
                                    ?: arrayListOf()) as ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>
                        } else {
                            limitedOfferList.addAll(
                                limitedTimeOfferResponse?.responseData?.LIMITED_OFFER ?: emptyList()
                            )
                        }

                        if (limitedTimeOfferResponse != null && limitedTimeOfferResponse!!.responseData != null && !limitedTimeOfferResponse?.responseData?.LIMITED_OFFER.isNullOrEmpty() && hasMoreLimitedOfferPages) {
                            limitedTimeOfferResponse?.responseData?.LIMITED_OFFER = limitedOfferList
                        } else if (limitedTimeOfferResponse?.responseData?.LIMITED_OFFER.isNullOrEmpty()) {
                            limitedTimeOfferResponse?.responseData?.LIMITED_OFFER = limitedOfferList
                            hasMoreLimitedOfferPages = false
                        }
                        updateQtyForNewArrivalStackResponse(productType, pageIndex)
                    }

                    ProductCardSectionType.STACKED -> {
                        Log.e("api_called::::", "::::case2")
                        if (pageIndex == 0) {
                            hasMoreNewArrivalsPages = true
                            activeProductShimmerState.postValue(ShimmersStates.NewArrival(true))
//                            delay(7000)
                        }

                        if (hasMoreNewArrivalsPages) {
                            newArrivalResponse = async {
                                getNewArrivals(warehouseId, pageIndex, type, variantId)
                            }.await()
                        }

                        if (pageIndex == 0) {
                            newArrivalsList = (newArrivalResponse?.responseData?.NEW_ARRIVAL
                                ?: arrayListOf()) as ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>
                        } else {
                            newArrivalsList.addAll(
                                newArrivalResponse?.responseData?.NEW_ARRIVAL ?: emptyList()
                            )
                        }

                        if (newArrivalResponse != null && newArrivalResponse!!.responseData != null && !newArrivalResponse?.responseData?.NEW_ARRIVAL.isNullOrEmpty() && hasMoreNewArrivalsPages) {
                            newArrivalResponse?.responseData?.NEW_ARRIVAL = newArrivalsList
                        } else if (newArrivalResponse?.responseData?.NEW_ARRIVAL.isNullOrEmpty()) {
                            newArrivalResponse?.responseData?.NEW_ARRIVAL = newArrivalsList
                            hasMoreNewArrivalsPages = false
                        }

                        updateQtyForNewArrivalStackResponse(productType, pageIndex)
                    }

                    ProductCardSectionType.BOTH -> {
                        Log.e("api_called::::", "::::case3")
                        if (pageIndex == 0) {
                            hasMoreLimitedOfferPages = true
                            hasMoreNewArrivalsPages = true
                            if (activeStackedProductShimmerState.value == false) activeStackedProductShimmerState.postValue(
                                true
                            )
//                            delay(15000)
                        }

                        val call1 = async {
                            getLimitedOffers(warehouseId, pageIndex, type, variantId)
                        }
                        val call2 = async {
                            getNewArrivals(warehouseId, pageIndex, type, variantId)
                        }

                        limitedTimeOfferResponse = call1.await()
                        newArrivalResponse = call2.await()
                        if (pageIndex == 0) {
                            limitedOfferList =
                                (limitedTimeOfferResponse?.responseData?.LIMITED_OFFER
                                    ?: arrayListOf()) as ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>
                            newArrivalsList = (newArrivalResponse?.responseData?.NEW_ARRIVAL
                                ?: arrayListOf()) as ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>
                        }
                        updateQtyForNewArrivalStackResponse(productType, pageIndex)
                    }
                }
            } catch (ex: Exception) {
                ex.printStackTrace()
            }


        }
    }

    private suspend fun getLimitedOffers(
        warehouseId: String,
        pageIndex: Int,
        type: String,
        variantId: Long
    ) = productListAndDetailsUseCase.getCrossSellingRecommendedProducts(
        mxInternalErrorOccurred, warehouseId,
        sessionToken,
        pageIndex,
        type,
        setOf(ApiParameterConstants.CONST_LIST_LIMITED_TIME_OFFER),
        PRODUCT_SECTION_PER_PAGE_COUNT,
        variantId
    )

    private suspend fun getNewArrivals(
        warehouseId: String,
        pageIndex: Int,
        type: String,
        variantId: Long
    ) = productListAndDetailsUseCase.getCrossSellingRecommendedProducts(
        mxInternalErrorOccurred, warehouseId,
        sessionToken,
        pageIndex,
        type,
        setOf(ApiParameterConstants.CONST_LIST_NEW_ARRIVALS),
        PRODUCT_SECTION_PER_PAGE_COUNT,
        variantId
    )

    fun getHomepageOtcProducts(subType: String, pageIndex: Int) {
        viewModelScope.launch(IO) {
            if (pageIndex == 0) {
                activeProductShimmerState.postValue(ShimmersStates.Trending(true))
//                delay(15000)
            }
            val fcmToken = SharedPrefManager.getInstance().fcm
            sessionToken = loginUseCase.getSessionToken(mxInternalErrorOccurred, fcmToken)


            var warehouseId = SharedPrefManager.getInstance().selectedWarehouseID
            /*if (!SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty())
                warehouseId = SharedPrefManager.getInstance().selectedWarehouseID*/
            val type = "App"
            val variantId: Long = SharedPrefManager.getInstance().algoSpecificVariantId



            when (subType) {
                ApiParameterConstants.CONST_LIST_TRENDING -> {
                    if (hasMoreTrendingPages) {
                        trendingInCityResponse =
                            productListAndDetailsUseCase.getCrossSellingRecommendedProducts(
                                mxInternalErrorOccurred, warehouseId,
                                sessionToken,
                                pageIndex,
                                type,
                                setOf(ApiParameterConstants.CONST_LIST_TRENDING),
                                PRODUCT_SECTION_PER_PAGE_COUNT,
                                if (variantId == -1L) null else variantId
                            )
                    }

                    if (pageIndex == 0) {
                        trendingList =
                            trendingInCityResponse?.responseData?.TRENDING_IN_CITY ?: arrayListOf()
                    } else {
                        trendingList.addAll(
                            trendingInCityResponse?.responseData?.TRENDING_IN_CITY ?: emptyList()
                        )
                    }
                    if (trendingInCityResponse != null && trendingInCityResponse!!.responseData != null && !trendingInCityResponse?.responseData?.TRENDING_IN_CITY.isNullOrEmpty() && hasMoreTrendingPages) {
                        trendingInCityResponse?.responseData?.TRENDING_IN_CITY = trendingList
                        updateQtyForTrendingInCityResponse()
                    } else if (pageIndex == 0 && trendingInCityResponse?.responseData?.TRENDING_IN_CITY.isNullOrEmpty()) {
                        showMessageTrendingInYourCity.postValue(HomeFragmentData(MESSAGES.TRENDING_IN_YOUR_CITY_LIST_RESPONSE_FAILED))
                    } else if (trendingInCityResponse?.responseData?.TRENDING_IN_CITY.isNullOrEmpty()) {
                        hasMoreTrendingPages = false
                        trendingInCityResponse?.responseData?.TRENDING_IN_CITY = trendingList
                        updateQtyForTrendingInCityResponse()
                    }
                }
            }
        }
    }


    /*fun callReorderFromPastOrdersApi() {
        viewModelScope.launch {

            val responseOrdersList = homePageUseCase.getAllCustomerOrders(
                mxInternalErrorOccurred,
                SharedPrefManager.getInstance().loggedInUserId,
                0,
                10,
                setOf("1"),
                ""
            )
            Log.e("responseOrders::111", responseOrdersList.toString())

            //  showMessageFragment.postValue(HomeFragmentData(MESSAGES.PATIENT_LIST_MEDICINE_LIST_RESPONSE))


        }
    }*/

    fun fetchPinCode(pinCode: String?, locationClicked: Boolean) {
        viewModelScope.launch(IO) {
            val response =
                homePageUseCase.checkPinCodeServiceability(mxInternalErrorOccurred, pinCode)

            updateData(pinCode, response)
            if (locationClicked) {
                sendUseLocationClickedEvent(
                    MxUseLocationClicked(
                        addressLine2 = "",
                        city = response?.responseData?.pincodeData?.get(0)?.city ?: "",
                        clickedOnPage = "homepage",
                        pincode = pinCode,
                        pincodeFetched = true,
                        pincodeFetchedResponse = "success",
                        serviceable = response?.responseData?.isServicable ?: false,
                        state = response?.responseData?.pincodeData?.get(0)?.state ?: "",
                        order_id = if (SharedPrefManager.getInstance().incompleteOrderId > 0) SharedPrefManager.getInstance().incompleteOrderId.toString() else null
                    )
                )
            }
        }
    }

    fun fetchPinCodeOnAddressSelection(pinCode: String?, selectedAddressId: Long) {
        viewModelScope.launch(IO) {
            val response =
                homePageUseCase.checkPinCodeServiceability(mxInternalErrorOccurred, pinCode)
            updateSelectedAddressCard(pinCode, response, selectedAddressId)
        }
    }

    private fun updateData(pincode: String?, response: PinCodeServiceabilityResponse?) {
        if (response == null) {
            isLoadingView.postValue(false)
            pincodeData.postValue(
                ErrorMessageData(
                    context.getString(R.string.do_not_deliver_location),
                    InputFieldConstants.STATE_ERROR
                )
            )
        } else if (response.statusCode == 400) {
            isLoadingView.postValue(false)
            pincodeData.postValue(
                ErrorMessageData(
                    response.message.toString(),
                    InputFieldConstants.STATE_ERROR
                )
            )
        } else if (response.responseData.isServicable == false) {
            isLoadingView.postValue(false)
            pincodeData.postValue(
                ErrorMessageData(
                    context.getString(R.string.pincode_unservicable),
                    InputFieldConstants.STATE_WARNING
                )
            )
        } else {
            if (!isDefaultPinCode) pincodeData.postValue(
                ErrorMessageData(
                    context.getString(R.string.we_deliver_to_this_location),
                    InputFieldConstants.STATE_SUCCESS
                )
            )
            updateSelectedAddressCard(pincode, response)

        }
    }

    private fun updateSelectedAddressCard(
        pinCode: String?,
        response: PinCodeServiceabilityResponse?,
        selectedAddressId: Long = 0
    ) {
        isLoadingView.postValue(false)

        val addresses = getAddressList.value ?: listOf()
        if (response != null) {

            if (response.responseData.isServicable == true) {
                if (selectedAddressId > 0) {
                    SharedPrefManager.getInstance().addressId = selectedAddressId
                    SharedPrefManager.getInstance().selectedCity =
                        response.responseData.pincodeData?.get(0)?.city
                    SharedPrefManager.getInstance().selectedState =
                        response.responseData.pincodeData?.get(0)?.state
//                    SharedPrefManager.getInstance().addressType = response.responseData.pincodeData
                }
                sendLocationSelectedToMixPanel(
                    "Home",
                    pincodeSelectedMethod,
                    pinCode?.let { Integer.parseInt(it) },
                    response.responseData.pincodeData?.get(0)?.city,
                    response.responseData.pincodeData?.get(0)?.state
                )

                selectedCity.postValue(response.responseData.pincodeData?.get(0)?.city ?: "Select")
                SharedPrefManager.getInstance().selectedCity =
                    response.responseData.pincodeData?.get(0)?.city
                SharedPrefManager.getInstance().selectedState =
                    response.responseData.pincodeData?.get(0)?.state

                SharedPrefManager.getInstance().pincode = pinCode?.toIntOrNull() ?: 0
                SharedPrefManager.getInstance().selectedWarehouseID =
                    response.responseData.pincodeData?.get(0)?.warehouseId.toString()

                if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                    viewModelScope.launch(IO) {
                        orderFlowUseCase.saveAddressForOrder(
                            mxInternalErrorOccurred,
                            orderId = SharedPrefManager.getInstance().incompleteOrderId,
                            addressId = SharedPrefManager.getInstance().addressId,
                            loggedInUserId = SharedPrefManager.getInstance().loggedInUserId
                        )
                    }
                }

                //calling trending list, new arrival and limiter offer api again
                val newWarehouseId =
                    response.responseData.pincodeData?.get(0)?.warehouseId.toString()
                Log.e(
                    "warehouse_id_new::::",
                    ":::::" + previousWarehouseIdSent + ":::" + newWarehouseId
                )
                if (!newWarehouseId.isNullOrEmpty() &&
                    (previousWarehouseIdSent.isNullOrEmpty() ||
                            (!previousWarehouseIdSent.equals(newWarehouseId, true)))
                ) {
                    Log.e("warehouse_id_new::::", ":::::yessss")
                    previousWarehouseIdSent = newWarehouseId
                    getHomepageOtcProducts(ApiParameterConstants.CONST_LIST_TRENDING, 0)
                    callBothStackedProductApi()
                }


                /**
                 * if the selected address is servicable then only dismiss the bottom sheet
                 */
                showMessageFragment.postValue(HomeFragmentData(MESSAGES.DISMISS_LOCATION_BOTTOM_SHEET))
            }


            for (address in addresses) {
                if (response.responseData.pincodeData == null) {
                    if (pinCode == address?.pincode) {
                        address?.selected = true
                        address?.isServicable = false
                    } else {
                        address?.selected = false
                        address?.isServicable = true
                    }
                } else {
                    if (address?.pincode == response.responseData.pincodeData!![0]?.pincode) {
                        address?.isServicable = response.responseData.isServicable

                        /***
                         * If the selected address id isServiceable then only store selected addressID, pincode and selected city locally
                         */
                        if (address?.isServicable == true) {
                            address.selected = true
                            address.isServicable = true
                            //SharedPrefManager.getInstance().addressId = address.addressId
                            response.responseData.pincodeData!![0]?.let { pinData ->
                                SharedPrefManager.getInstance().selectedWarehouseID =
                                    pinData.warehouseId.toString()
                                SharedPrefManager.getInstance().coldChainDeliverable =
                                    pinData.isColdChainDeliverable ?: true
                            }

                            SharedPrefManager.getInstance().addressType = address.addressType
                            SharedPrefManager.getInstance().address = address.clubbedAddress
                            SharedPrefManager.getInstance().newSelectedPinCode = false

                            SharedPrefManager.getInstance().selectedCity =
                                response.responseData.pincodeData?.get(0)?.city
                            SharedPrefManager.getInstance().selectedState =
                                response.responseData.pincodeData?.get(0)?.state


                            SharedPrefManager.getInstance().pincode = pinCode?.toIntOrNull() ?: 0
                            //                        SharedPrefManager.getInstance().lastSelectedAddressID = address.addressId
                            //                        SharedPrefManager.getInstance().addressId = SharedPrefManager.getInstance().lastSelectedAddressID
                            //                        SharedPrefManager.getInstance().lastSelectedAddressID = SharedPrefManager.getInstance().addressId


                            address.pincode?.let { pin ->
                                SharedPrefManager.getInstance().pincode = pin.toInt()
                            }
                            address.cityName?.let { city ->
                                SharedPrefManager.getInstance().selectedCity = city
                                selectedCity.postValue(city)
                            }
                            address.stateName?.let { state ->
                                SharedPrefManager.getInstance().selectedState = state

                            }

                        } else {
                            address?.selected = true
                            address?.isServicable = false
                            //SharedPrefManager.getInstance().addressId =  SharedPrefManager.getInstance().lastSelectedAddressID
                        }
                        break
                    } else {
                        address?.isServicable = response.responseData.isServicable
                        address?.selected = false
                        if (!SharedPrefManager.getInstance().isReOrder) {
                            SharedPrefManager.getInstance().newSelectedPinCode = true
                            SharedPrefManager.getInstance().pincode = pinCode?.toInt() ?: 0
//                            SharedPrefManager.getInstance().addressId = -1//pinCode?.toInt() ?: 0
                        }
                    }

                }

            }
            val data = getAddressList.value
            data?.let {
                addressList.postValue(it)
            }
        } else {
            val data = getAddressList.value
            data?.let {
                for (address in it) {
                    if (address?.addressId == selectedAddressId) {
                        address.isServicable = false
                        address.selected = true
                        break
                    }
                }
                addressList.postValue(addresses)
            }
        }
    }

    private fun sendLocationSelectedToMixPanel(
        clickedOnPage: String,
        source: String,
        pincode: Int?,
        city: String?,
        state: String?
    ) {

        val mxLocationSelected = MxLocationSelected()

        if (clickedOnPage.isNotEmpty()) {
            mxLocationSelected.clickedOnPage = clickedOnPage
        }
        if (source.isNotEmpty()) {
            mxLocationSelected.selectionMethod = source
        }
        if ((pincode ?: 0) > 0) {
            mxLocationSelected.pincodeCollected = pincode
        }
        if ((state ?: "").isNotEmpty()) {
            mxLocationSelected.state = state
        }
        if ((city ?: "").isNotEmpty()) {
            mxLocationSelected.city = city
        }

        sdkEventUseCase.sendLocationSelectedEvent(
            mxLocationSelected
        )
    }


    fun dbMigrationToRooms() {
        viewModelScope.launch(IO) {
            var isDbMigrationCompleted = true
            //DB Migration
            if (isDbMigrationCompleted && getAppSqliteDatabase() != null) {

                var orgMedInserted = false
                var subsMedInserted = false
                var reorderMedInserted = false

                val subsList: List<OrgSubsInfo> =
                    SQLiteDBHelper.getOrgSubsRecords(getAppSqliteDatabase()!!) ?: listOf()
                val orgList: List<CartMedicine> =
                    SQLiteDBHelper.getAddedMedsRecords(getAppSqliteDatabase()!!) ?: listOf()
                val reorderList: List<ReorderAlternateSubs> =
                    SQLiteDBHelper.getReorderAlternateRecords(getAppSqliteDatabase()!!) ?: listOf()
                val searchList: List<RecentMedicine> =
                    SQLiteDBHelper.getRecentlySearchedMedicine(getAppSqliteDatabase()) ?: listOf()

                if (!orgList.isNullOrEmpty()) {
                    for (medicine in orgList) {
                        try {
                            orderFlowUseCase.addMedicineToCart(medicine, null, false, null)
                            orgMedInserted = true
                        } catch (ex: java.lang.Exception) {
                            orgMedInserted = false
                            break
                        }
                    }
                } else {
                    orgMedInserted = true
                }

                if (!subsList.isNullOrEmpty()) {
                    for (medicine in subsList) {
                        subsMedInserted = try {
                            localDbUseCase.addSubsInfo(medicine)
                            true
                        } catch (ex: java.lang.Exception) {
                            false
                        }
                    }
                } else {
                    subsMedInserted = true
                }

                if (!reorderList.isNullOrEmpty()) {
                    for (medicine in reorderList) {
                        reorderMedInserted = try {
//                            localDbUseCase.inserR(medicine)
//                            appDao.insertReorderAltSubs(medicine)
                            true
                        } catch (ex: java.lang.Exception) {
                            false
                        }
                    }
                } else {
                    reorderMedInserted = true
                }

                if (!searchList.isNullOrEmpty()) {
                    for (search in searchList) {
                        try {
                            localDbUseCase.addRecentlySearchMed(search)
//                            appDao.insertRecentlySearch(search)
                        } catch (ex: java.lang.Exception) {
                            ex.message
                        }
                    }
                }

                if (subsMedInserted && orgMedInserted && reorderMedInserted) {
                    SharedPrefManager.getInstance().isDBMigrationCompleted = true
                    SQLiteDBHelper.clearAddedMeds(getAppSqliteDatabase()!!)
                    SQLiteDBHelper.clearAddedSubOrg(getAppSqliteDatabase()!!)
                    SQLiteDBHelper.clearReorderAlternateSubs(getAppSqliteDatabase()!!)

                    SQLiteDBHelper.clearDocConfirmationSubsOptions(getAppSqliteDatabase()!!)
                    SQLiteDBHelper.clearProductImage(getAppSqliteDatabase()!!)
                    SQLiteDBHelper.clearRecentlySearched(getAppSqliteDatabase()!!)
                    SQLiteDBHelper.clearSearchCategory(getAppSqliteDatabase()!!)


                    try {
                        getAppSqliteDatabase()!!.close()
                        val data = Environment.getDataDirectory()
                        val currentDBPath = "/data/com.intellihealth.truemeds/databases/" + "TM"
                        val currentDB = File(data, currentDBPath)
                        val deleted = SQLiteDatabase.deleteDatabase(currentDB)
                        Log.d("qwerty", "deleted : $deleted")
                    } catch (e: java.lang.Exception) {
                        Log.d("qwerty", "e" + e.message)
                    }

                }

                onCreateApiCalls()
            } else {
                SharedPrefManager.getInstance().isDBMigrationCompleted = false
                onCreateApiCalls()
            }
        }
    }

    fun updateDBSchema() {
        viewModelScope.launch(IO) {
            updateSellingPrice()
        }
    }

    private fun updateSellingPrice() = runBlocking {
        val list = localDbUseCase.getAddedMedicines()
        for (item in list) {
            localDbUseCase.insertCartSellingPrice(
                CartItemSellingPrice(
                    item.medicineId,
                    item.getSellingPrice()
                )
            )
        }
    }


    fun applyCouponClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
        _isLoading.postValue(true)
        viewModelScope.launch(IO) {
//            if (SharedPrefManager.getInstance().couponModel == null) getBillDetailApi(couponCodeResponse)
            Log.d(
                "TAG",
                "applyCouponClick:  cartAmount = ${cartSellingPrice.value} coupon model ${SharedPrefManager.getInstance().couponModel}"
            )

            /**
             * TODO
             * **/
            if (_medicineTotalSellingPrice.value!! >= couponCodeResponse?.minCartValue!!) {
                SharedPrefManager.getInstance().offerId = couponCodeResponse?.offerId.toString()

                val replaceList = getAddedMedicinesFromCart(false, false)

                val responseCode = orderFlowUseCase.replaceMedicineForIncompleteOrder(
                    mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId,
                    replaceList,
                    SharedPrefManager.getInstance().loggedInUserId,
                    SharedPrefManager.getInstance().offerId,
                    true,
                    true,
                    SharedPrefManager.getInstance().srcType,
                    SharedPrefManager.getInstance().algoSpecificVariantId,
                )

                responseCode?.let {
                    if (it.statusCode == 200) {
                        SharedPrefManager.getInstance().autoReplaced = true
                        getMedicineOrderDetailsList(
                            mxInternalErrorOccurred,
                            SharedPrefManager.getInstance().incompleteOrderId,
                            false
                        )
                    }
                }
            }


            var couponSaveRemoveResponse: CouponSaveRemoveResponse? = null
            Log.d("TAG", "applyCouponClick:  cartAmount = ${cartSellingPrice.value}")
            if (_medicineTotalSellingPrice.value!! >= couponCodeResponse.minCartValue!! || (SharedPrefManager.getInstance().prescriptionCount > 0 && medicineTotalSellingPrice.value == 0.0)) {
                couponSaveRemoveResponse = couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId,
                    getPaymentMode().toString(), couponCodeResponse.offerId.toString(),
                    billDetailsData, clickedOnPage, couponCodeResponse, medicineListDataReceived
                )
            }
//                SharedPrefManager.getInstance().setCouponModel()
            openCouponPopup.postValue(Event(Pair(couponCodeResponse, couponSaveRemoveResponse)))
            /*if (SharedPrefManager.getInstance().couponModel == null) {
//                couponCodeResponse.isCouponApplied = true
                var couponSaveRemoveResponse: CouponSaveRemoveResponse? = null
                Log.d("TAG", "applyCouponClick:  cartAmount = ${cartSellingPrice.value}")
                if (cartSellingPrice.value!! >= couponCodeResponse.minCartValue!! || SharedPrefManager.getInstance().prescriptionCount > 0) {
                    couponSaveRemoveResponse = couponUseCase.applyAndRemoveCouponCode(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        getPaymentMode().toString(), couponCodeResponse.offerId.toString()
                    )
                }
//                SharedPrefManager.getInstance().setCouponModel()
                openCouponPopup.postValue(Event(Pair(couponCodeResponse, couponSaveRemoveResponse)))

            } else {
//                couponCodeResponse.isCouponApplied = false
                val couponSaveRemoveResponse = async {
                    couponUseCase.applyAndRemoveCouponCode(
                        SharedPrefManager.getInstance().incompleteOrderId,
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
                    showMessage.postValue(Event(MESSAGES.REMOVED_COUPON_SUCCESSFULLY))
                } else {
                    applyCouponFailed.postValue(Event(Any()))
                }
            }

             */
            _isLoading.postValue(false)
        }

    }

    fun removeCouponClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
        _isLoading.postValue(true)
        viewModelScope.launch(IO) {
//            if (SharedPrefManager.getInstance().couponModel == null) getBillDetailApi(couponCodeResponse)
            Log.d(
                "TAG",
                "applyCouponClick:  cartAmount = ${cartSellingPrice.value} coupon model ${SharedPrefManager.getInstance().couponModel}"
            )
            val couponSaveRemoveResponse = async {
                couponUseCase.applyAndRemoveCouponCode(
                    mxInternalErrorOccurred, SharedPrefManager.getInstance().incompleteOrderId,
                    getPaymentMode().toString(), "0",
                    billDetailsData, clickedOnPage, couponCodeResponse, medicineListDataReceived
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
                Log.d(
                    "Intent",
                    "onCreate: setParameter call 7777:::" + SharedPrefManager.getInstance().couponDiscount.toDouble()
                )

                SharedPrefManager.getInstance().setCouponDiscount(0f)
                setCartCount()
                showMessage.postValue(
                    Event(
                        MessageConstant(
                            MESSAGES.REMOVED_COUPON_SUCCESSFULLY,
                            couponSaveRemoveResponse.responseData?.description?.get(0) ?: ""
                        )
                    )
                )
            } else {
                applyCouponFailed.postValue(Event(Any()))
            }
            _isLoading.postValue(false)
        }

    }

    private suspend fun getAddedMedicinesFromCart(
        newOrder: Boolean,
        isReplaceAll: Boolean
    ): List<MedicineDto> =
        localDbUseCase.getCartMedicineDto(cartMedicineListResponse, newOrder, isReplaceAll)

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

    fun showLoader() {
        _isLoading.postValue(true)
    }

    fun hideLoader() {
        _isLoading.postValue(false)
    }

    fun getActiveOrderCallMeBack() {
//        showLoader()
        isLoadingDeliveryDetailBottomSheetView.postValue(true)
        viewModelScope.launch(IO) {

            var response = homePageUseCase.increaseDigitizedOrderRank(
                // activeAllOrdersMutableLiveData.value?.responseData?.ordersList?.get(0)?.orderId?.toLong(), // this line is commented bcoz order id is not coming here
                mxInternalErrorOccurred, bottomSheetDoctorCallOrderId.toLong(),
                ""
            )
            isLoadingDeliveryDetailBottomSheetView.postValue(false)
            if (response != null) {
                getAllCustomerActiveOrders()
                //update this parameter value latervon when api response comes properly
                // fow now it is static
                doctorCallMsgBottomSheet = response?.responseData?.doctorCallMsg ?: ""

                displayBottomSheet(BottomSheetType.DOCTOR_WILL_CALL)
                Log.e("case4::", "::yes")
                // bottomSheetTrigger.postValue(model)
                isAllBottomSheetCollected.postValue(true)



                Log.d("TAG", "getActiveOrderCallMeBack: $response")
            }
        }
    }


    fun viewAllTrendingCityClick() {
        showMessageProductListFragment.postValue(HomeFragmentData(MESSAGES.VIEW_ALL_TRENDING_CITY_CLICK))
    }

    fun viewAllYourMedicinesClick() {
        showMessageProductListFragment.postValue(HomeFragmentData(MESSAGES.VIEW_ALL_YOUR_MEDICINES_CLICK))
    }

    fun viewAllLimitedOfferlick() {
        showMessageProductListFragment.postValue(HomeFragmentData(MESSAGES.VIEW_ALL_LIMITED_OFFER_CLICK))
    }

    fun viewAllNewArrivalClick() {
        showMessageProductListFragment.postValue(HomeFragmentData(MESSAGES.VIEW_ALL_NEW_ARRIVAL_CLICK))
    }


    //var loaderValue = MutableLiveData<Boolean>()

    fun getPrivacyPolicyDescription() {
        viewModelScope.launch(IO) {
            showPpTncLoader.postValue(true)
            val res = homePageUseCase.getPP(mxInternalErrorOccurred)
            res?.responseData?.Legals?.let { response ->
                if (response.isNotEmpty()) {
                    showPpTncLoader.postValue(false)
                    privacyTncResponseM.postValue(Event(response))
                }
            }
        }
    }

    fun getTermsConditionDescription() {
        viewModelScope.launch(IO) {
            showPpTncLoader.postValue(true)
            val res = homePageUseCase.getTNC(mxInternalErrorOccurred, true)
            res?.responseData?.Legals?.let { response ->
                if (response.isNotEmpty()) {
                    showPpTncLoader.postValue(false)
                    privacyTncResponseM.postValue(Event(response))
                }
            }
        }
    }

    fun acceptPpAndTnc(customerId: String, type: String) {
        viewModelScope.launch(IO) {
            val res = homePageUseCase.acceptPpAndTnc(mxInternalErrorOccurred, customerId, type)
            Log.d("TAG", "acceptPpAndTnc: $customerId = $type res = ${res?.string()}")
            if (res != null) {
                showAcceptPpTncResult.postValue(true)
                /*withContext(Main){
                    successPpTncCondition = true
                }*/
            }
        }
    }

    /*fun setCartCount() = viewModelScope.launch(IO) {
        val count = async { localDbUseCase.getCartCount() }.await()
        cartItemCount.postValue(count)
    }*/

    fun onCreateApiCalls() {
        _showShimmerHome.postValue(true)
        bottomSheetPriority.clear()
        viewModelScope.launch(IO) {
            getTrendingSearches()
            userDataUseCase.setVariantInfo(
                loginUseCase.getSessionToken(
                    mxInternalErrorOccurred,
                    SharedPrefManager.getInstance().fcm
                ), mxInternalErrorOccurred
            )
            if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                /*withContext(IO) {
                    getCustomerDetailsForHome()
                    //getFtcCouponData()
                    if (SharedPrefManager.getInstance().incompleteOrderId > 0)
                        getMedicineOrderDetailsList(SharedPrefManager.getInstance().incompleteOrderId, false)

                }*/

                getCustomerDetailsForHome()
                //getFtcCouponData()
                if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                    getMedicineOrderDetailsList(
                        mxInternalErrorOccurred,
                        SharedPrefManager.getInstance().incompleteOrderId,
                        false
                    )
                    setMedicineListDataReceived()
                }

                sdkEventUseCase.sendSuperEventToMixpanel()
            }
            featureList.postValue(
                homePageUseCase.getFeatureList(
                    SharedPrefManager.getInstance().isFtc,
                    prevDeliveredOrderId > 0L
                )
            )


            /*val apiCalls = async {
                var userDataReceived = false
                if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                    withContext(IO) {
                        userDataReceived = getCustomerDetailsForHome()
                        getFtcCouponData()

                    }
                }
                featureList.postValue(homePageUseCase.getFeatureList(SharedPrefManager.getInstance().isFtc))

                *//*getBannersForHomePage()
                getSuperCategoryList()
                getTrendingSearches()
                callHealthArticlesListApi(
                    HealthArticlesConstants.USER_AGENT,
                    "${HealthArticlesConstants.URL_PARAMETERS}1"
                )

                //here we are calling trending in your city list api and setting data and setting observer
                if (!SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty()) {
                    getHomepageOtcProducts(ApiParameterConstants.CONST_LIST_TRENDING,0)
                    callBothStackedProductApi()
                }

                if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                    if (userDataReceived) {
                        getAllCustomerOrdersForDeliverDetails().runInSeries(this)
                        callPatientListMedicineListApi().runInSeries(this)
                        getAllCustomerActiveOrders().runInSeries(this)
                        checkApiCallForNameValidationList().runInSeries(this)
                        callSaveAaIDApi().runInSeries(this)
                        callCustomerDeviceInfo(deviceId).runInSeries(this)
                        callEventIDForCustomerApi(appsFlyerSdkId).runInSeries(this)
                    } else {
                        startSplashScreenEvent.postValue(Event(Unit))
                    }

                    _showShimmerHome.postValue(false)
                    showBlockerVw20.postValue(false)
                } else {
                    _showShimmerHome.postValue(false)
                    showBlockerVw20.postValue(false)
                    showBottomSheetByPriority()
                }*//*
            }
            apiCalls.await()*/


            /*displayBottomSheet(BottomSheetType.PAYMENT_PENDING)
            displayBottomSheet(BottomSheetType.PRIVACY_POLICY)
            displayBottomSheet(BottomSheetType.CHOOSE_LOCATION)
            displayBottomSheet(BottomSheetType.SAVE_CONTACT)
            displayBottomSheet(BottomSheetType.RATING)
            displayBottomSheet(BottomSheetType.TERMS_AND_CONDITION)
            displayBottomSheet(BottomSheetType.DOCTOR_CALL_MISSED_CALL_BACK)*/
        }

    }

    fun callApiAfterFeatureList() {
        callHealthArticlesListApi(
            HealthArticlesConstants.USER_AGENT,
            "${HealthArticlesConstants.URL_PARAMETERS}1"
        )

        viewModelScope.launch(IO) {
            val apiCalls = async {

                getBannersForHomePage()
                getSuperCategoryList()
                shouldProcessDeeplink.postValue(true)

                //here we are calling trending in your city list api and setting data and setting observer
                if (!SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty()) {
                    getHomepageOtcProducts(ApiParameterConstants.CONST_LIST_TRENDING, 0)
                    callBothStackedProductApi()
                }

                if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                    if (userDataReceived) {
                        getAllCustomerOrdersForDeliverDetails().runInSeries(this)
                        callPatientListMedicineListApi().runInSeries(this)
                        getAllCustomerActiveOrders().runInSeries(this)
                        /*checkApiCallForNameValidationList().runInSeries(this)
                        callSaveAaIDApi().runInSeries(this)
                        callCustomerDeviceInfo(deviceId).runInSeries(this)
                        callEventIDForCustomerApi(appsFlyerSdkId).runInSeries(this)*/
                    } else {
                        startSplashScreenEvent.postValue(Event(Unit))
                    }

//                    _showShimmerHome.postValue(false)
//                    showBlockerVw20.postValue(false)
                } else {
                    if (activeMenu.value == R.id.homeFragment) {
                        sendHomePageViewedEvent()
                    }
//                    _showShimmerHome.postValue(false)
//                    showBlockerVw20.postValue(false)
                }

                delay(1000)
                _showShimmerHome.postValue(false)
                showBlockerVw20.postValue(false)
            }
            apiCalls.await()

            if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                checkApiCallForNameValidationList()
                callSaveAaIDApi()
                callCustomerDeviceInfo(deviceId)
                callEventIDForCustomerApi(appsFlyerSdkId)
            }
            /*else {
                showBottomSheetByPriority()
            }*/
            //this should call for all users after core aoi cals
            showBottomSheetByPriority()

            /*displayBottomSheet(BottomSheetType.PAYMENT_PENDING)
            displayBottomSheet(BottomSheetType.PRIVACY_POLICY)
            displayBottomSheet(BottomSheetType.CHOOSE_LOCATION)
            displayBottomSheet(BottomSheetType.SAVE_CONTACT)
            displayBottomSheet(BottomSheetType.RATING)
            displayBottomSheet(BottomSheetType.TERMS_AND_CONDITION)
            displayBottomSheet(BottomSheetType.DOCTOR_CALL_MISSED_CALL_BACK)*/
        }
    }

    fun onResumeApiCalls() {
//        resumeCount++
        if (resumeCount > 1) {
            sdkEventUseCase.pushProfileCleverTap()
            //added below code here earlier it was managed in resumeCount >2 condition
//            if (activeMenu.value == R.id.homeFragment)
//                getFtcCouponData()
        }

        viewModelScope.launch(IO) {
            if (resumeCount > 2 && SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                if (resumeCount > 2)
                    getCustomerDetailsForHome()

                getAllCustomerActiveOrders()
            } else {
                if (resumeCount > 2 && activeMenu.value == R.id.homeFragment)
                    sendHomePageViewedEvent()
            }
        }
        /*if (SharedPrefManager.getInstance().loggedInUserAccessToken != null && SharedPrefManager.getInstance().loggedInUserAccessToken.length > 50 && SharedPrefManager.getInstance().loggedInUserId != null) {
            sendHomePageViewedEvent()
        } else {}*/
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        viewModelScope.launch(IO) { setCartCount() }

    }

    fun deleteProductItemFromDatabase(
        productModel: com.intellihealth.truemeds.presentation.model.ProductInfoModel,
        qty: Int
    ) = viewModelScope.launch(IO) {
        if (qty == 0) {
            orderFlowUseCase.deleteMedicineFromCart(
                productModel.product.productCode ?: "",
                false
            )
        } else {
            orderFlowUseCase.updateCartMedicineCount(
                productModel.product.productCode ?: "",
                qty
            )
        }
        setCartCount()
    }


    /*fun deleteProductItemFromDatabase(
        productModel: com.intellihealth.truemeds.presentation.model.ProductInfoModel,
        qty: Int
    ) {
        if (qty == 0) {
            viewModelScope.launch(IO) {
                orderFlowUseCase.deleteMedicineFromCart(
                    productModel.product.productCode ?: "",
                    false
                )
            }
            setCartCount()
        } else {
            viewModelScope.launch(IO) {
                orderFlowUseCase.updateCartMedicineCount(
                    productModel.product.productCode ?: "",
                    qty
                )
            }
            setCartCount()
        }

    }*/


    fun addProductItemFromDatabase(
        productModel: com.intellihealth.truemeds.presentation.model.ProductInfoModel,
        qty: Int
    ) {
        viewModelScope.launch(IO) {
            if (qty == 1) {
                val orgCartItem = productModel.productAsCartItem(false, 1)
                orderFlowUseCase.addMedicineToCart(orgCartItem, null, false, null)
            } else {
                orderFlowUseCase.updateCartMedicineCount(productModel.product.productCode, qty)
            }
            setCartCount()
        }
    }

    /*fun addProductItemFromDatabase(
        productModel: com.intellihealth.truemeds.presentation.model.ProductInfoModel,
        qty: Int
    ) {
        if (qty == 1) {
            val orgCartItem = productModel.productAsCartItem(false, 1)
            viewModelScope.launch(IO) {
                orderFlowUseCase.addMedicineToCart(orgCartItem, null, false)
            }
            setCartCount()
        } else {
            viewModelScope.launch(IO) {
                orderFlowUseCase.updateCartMedicineCount(productModel.product.productCode, qty)
            }
            setCartCount()
        }

    }*/

    fun productCardStackedItemClicked(model: ProductInfoModel) {
        _productCardStackedClick.postValue(model)
    }

    /*fun getMedicineCount(productCode: String): Int = runBlocking {
        return@runBlocking async {
            localDbUseCase.getAddedQtyOfAddedMedicine(productCode)
        }.await()
    }*/

    suspend fun getMedicineCount(productCode: String): Int =
        localDbUseCase.getAddedQtyOfAddedMedicine(productCode)

    fun getUpdatedListFromDatabase(list: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>?): ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>? {
        viewModelScope.launch(IO) {
            list?.let {
                for (i in it.indices) {
                    it[i].product.qty = getMedicineCount(it[i].product.productCode)
                }
            }
        }
        return list
    }

    fun getEditOrderRequestData(productCode: String, qty: Int): List<MedicineDto> =
        runBlocking(IO) {
            return@runBlocking async {
                localDbUseCase.getCartMedicineDtoFromProductCode(
                    cartMedicineListResponse,
                    productCode,
                    qty
                )
            }.await()
        }

    fun editMedicine(
        orderId: Long,
        list: List<MedicineDto>,
        removeMed: Boolean,
        page: String = ""
    ) {
        viewModelScope.launch(IO) {
            if (list.isEmpty()) return@launch
            val apiResponse = orderFlowUseCase.editMedicine(mxInternalErrorOccurred, orderId, list)
            if (apiResponse != null) {
                editMedicineApiSuccess.postValue(true)

            } else {
                editMedicineApiSuccess.postValue(false)
            }

        }
    }


    suspend fun deleteProductFromCart(
        it: com.intellihealth.truemeds.presentation.model.ProductInfoModel,
        isSubs: Boolean
    ) {
        localDbUseCase.removeItemFromCart(it.product.productCode, isSubs)
    }


    // save number bottom sheet logic implementation
    fun fetchTruemedsContact() {
        viewModelScope.launch(IO) {
            var response = homePageUseCase.fetchTruemedsContactByName(mxInternalErrorOccurred, "")
            Log.e("responseDataNumBotSht::", response.toString())


            if (response != null) {
                //appDao.clearSaveContact();
                saveContactMap.clear()
                val jsonObject: JSONObject = getJsonResponseFromRawData(response) ?: return@launch

                val arrayResponse: JSONArray = jsonArray(jsonObject, "array") ?: return@launch

                val contactResponse: Array<fetchTruemedsContactResponse> =
                    Gson().fromJson<Array<fetchTruemedsContactResponse>>(
                        arrayResponse.toString(),
                        Array<fetchTruemedsContactResponse>::class.java
                    )
                val contactList: List<fetchTruemedsContactResponse> =
                    Arrays.asList(*contactResponse)
                val contactEntityList: MutableList<TmContactVersion> =
                    java.util.ArrayList<TmContactVersion>()
                var version = 1.0

                for (i in contactList.indices) {
                    var contactName: String
                    version = contactList[i].version
                    contactName = contactList[i].contactName
                    // Log.e("contact_list:::::",":::::"+i+"::::"+version+":::"+contactName)

                    val contact = TmContactVersion(null, contactName, version)
                    contactEntityList.add(contact)
                    saveContactMap.put(contactName, contactList[i].contactNumber)
                }

                writeSavedContactsInsidePhoneBook()
                localDbUseCase.insertTmContactDetails(contactEntityList)

                //3rd Api Call: Save Data
                saveContactMappingApiCall(version)
                dismissBottomSheetAfterSaveContact.postValue(true)

            }


        }

    }

    private fun saveContactMappingApiCall(activeVersion: Double) {
        viewModelScope.launch(IO) {
            var response = homePageUseCase.saveContactMappingInfo(
                mxInternalErrorOccurred, "" + activeVersion
            )
            Log.e("responseDataContMap::", response.toString())

        }
    }

    fun writeSavedContactsInsidePhoneBook() {
        if (!saveContactMap.isNullOrEmpty() && saveContactMap.size > 0) {

            try {
                for ((contactName, numbersList) in saveContactMap) {

                    val contactId: String = ContactManager.saveContact(
                        context,
                        contactName
                    ) ?: ""
                    try {
                        ContactManager.addPhoneNumbersToContact(
                            context,
                            contactId,
                            numbersList
                        )

                        if (!contactSavedTriggered) {
                            sdkEventUseCase.sendContactBottomSheetSaved()
                            contactSavedTriggered = true
                        }
                    } catch (_: Exception) {
                    }
                }
            } catch (_: Exception) {

            }
        }
    }

    fun launchRatingBottomSheetDialog() {
        if (!isRatingBsShown) {
            displayBottomSheet(BottomSheetType.RATING)
            isRatingBsShown = true
        }
//        launchRatingBottomSheet.postValue(Event(Any()))
    }


    fun setOfferIdForOrderId(offerId: Long) {
        val paymentId = orderFlowUseCase.setPaymentMode()
        viewModelScope.launch(IO) {
            if (offerId > 0) orderFlowUseCase.setOfferIdForOrder(
                mxInternalErrorOccurred, orderId.value?.toLong()!!,
                paymentId,
                offerId
            )
            /*if (result) {
//                getOrderDetails()
            }*/

            SharedPrefManager.getInstance().couponModel = null
            SharedPrefManager.getInstance().offerId = "0"
        }
    }


    fun updateCrossSellingRecommendedProducts(
        productCode: String, list: List<ProductInfoModel>
    ): List<ProductInfoModel> {
        viewModelScope.launch(IO) {
            list.let {
                for (i in it.indices) {
                    it[i].product.qty =
                        getMedicineCount(it[i].product.productCode)
                    Log.d("*** HomeVM ", it[i].product.skuName + " : " + it[i].product.qty)
                }
            }
        }
        return list

    }

    fun calculateSavingAmount(
        couponCodeResponse: CouponCodeResponse.Coupon?,
        currentPayableAmount: Double
    ) {
        _isLoading.postValue(true)
//setting medicine list data when coupon is applied offline
        setMedicineListDataReceived()
        viewModelScope.launch(IO) {
            openCouponPopupOffline.postValue(
                Event(
                    Pair(
                        couponCodeResponse,
                        orderFlowUseCase.calculateSavingAmount(
                            couponCodeResponse,
                            "homepage",
                            medicineListDataReceived,
                            billDetailsData,
                            currentPayableAmount
                        )
                    )
                )
            )
            _isLoading.postValue(false)
        }
    }

    private fun checkApiCallForNameValidationList() {
        viewModelScope.launch(IO) {
            var differenceInDays: Long = 0
            val differenceInMillis: Long =
                abs(System.currentTimeMillis() - localDbUseCase.getLastDateForNameValidation())
            differenceInDays = TimeUnit.DAYS.convert(differenceInMillis, TimeUnit.MILLISECONDS)
            if (differenceInDays > 7) {
                getNameValidationList()
            }
        }
    }

    private suspend fun getNameValidationList() {
        val typeList: ArrayList<String> = ArrayList()
        typeList.add("PATIENT NAME")
        val nameValidationResponse =
            userDataUseCase.getNameValidationList(mxInternalErrorOccurred, typeList)
        val patientEntities: MutableList<PatientNameEntity> = ArrayList()
        try {
            nameValidationResponse?.responseData?.patientName?.let {
                for (element in it) {
                    val stringEntity = PatientNameEntity(
                        null,
                        element,
                        System.currentTimeMillis()
                    )
                    patientEntities.add(stringEntity)
                }
            }
            localDbUseCase.insertPatientNameEntity(patientEntities)
        } catch (e: JSONException) {
            throw RuntimeException(e)
        }
    }


    fun updateQtyForTrendingInCityResponse() {
        viewModelScope.launch(IO) {
            try {
                val updatedList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
                    arrayListOf()
                trendingInCityResponse?.responseData?.TRENDING_IN_CITY?.forEach {
                    it.product.qty = getMedicineCount(it.product.productCode ?: "")
                    updatedList.add(it)
                }
                trendingInCityResponse?.responseData?.TRENDING_IN_CITY = updatedList

                if (trendingInCityResponse?.responseData?.TRENDING_IN_CITY.isNullOrEmpty()) {
                    showMessageTrendingInYourCity.postValue(HomeFragmentData(MESSAGES.TRENDING_IN_YOUR_CITY_LIST_RESPONSE_FAILED))
                } else {
                    showMessageTrendingInYourCity.postValue(HomeFragmentData(MESSAGES.TRENDING_IN_YOUR_CITY_LIST_RESPONSE))
                    activeProductShimmerState.postValue(ShimmersStates.Trending(false))
                }
            } catch (_: Exception) {
            }
        }

    }

    fun updateQtyForNewArrivalStackResponse(
        productType: ProductCardSectionType = ProductCardSectionType.BOTH,
        pageIndex: Int = 0
    ) {
        stackedListCurrentPageCount = pageIndex
        viewModelScope.launch(IO) {
            try {
                when (productType) {
                    ProductCardSectionType.TOP -> {
                        val updatedLimitedOfferList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
                            arrayListOf()
                        limitedTimeOfferResponse?.responseData?.LIMITED_OFFER?.forEach {
                            it.product.qty = getMedicineCount(it.product.productCode ?: "")
                            updatedLimitedOfferList.add(it)
                        }
                        limitedTimeOfferResponse?.responseData?.LIMITED_OFFER =
                            updatedLimitedOfferList

                        if (limitedTimeOfferResponse?.responseData?.LIMITED_OFFER.isNullOrEmpty() && pageIndex == 0) {
                            showMessageNewArrivalList.postValue(HomeFragmentData(MESSAGES.LIMITED_OFFER_NEW_ARRIVAL_LIST_RESPONSE_FAILED))
                        } else {
                            showMessageNewArrivalList.postValue(HomeFragmentData(MESSAGES.LIMITED_OFFER_LIST_RESPONSE))
                            activeProductShimmerState.postValue(ShimmersStates.LimitedOffer(false))
                        }
                    }

                    ProductCardSectionType.STACKED -> {
                        val updatedNewArrivalList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
                            arrayListOf()
                        newArrivalResponse?.responseData?.NEW_ARRIVAL?.forEach {
                            it.product.qty = getMedicineCount(it.product.productCode ?: "")
                            updatedNewArrivalList.add(it)
                        }

                        newArrivalResponse?.responseData?.NEW_ARRIVAL = updatedNewArrivalList

                        if (newArrivalResponse?.responseData?.NEW_ARRIVAL.isNullOrEmpty() && pageIndex == 0) {
                            showMessageNewArrivalList.postValue(HomeFragmentData(MESSAGES.LIMITED_OFFER_NEW_ARRIVAL_LIST_RESPONSE_FAILED))
                        } else {
                            showMessageNewArrivalList.postValue(HomeFragmentData(MESSAGES.NEW_ARRIVALS_LIST_RESPONSE))
                            activeProductShimmerState.postValue(ShimmersStates.NewArrival(false))
                        }

                    }

                    ProductCardSectionType.BOTH -> {
                        val updatedLimitedOfferList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
                            arrayListOf()
                        limitedTimeOfferResponse?.responseData?.LIMITED_OFFER?.forEach {
                            it.product.qty = getMedicineCount(it.product.productCode ?: "")
                            updatedLimitedOfferList.add(it)
                        }
                        limitedTimeOfferResponse?.responseData?.LIMITED_OFFER =
                            updatedLimitedOfferList

                        val updatedNewArrivalList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
                            arrayListOf()
                        newArrivalResponse?.responseData?.NEW_ARRIVAL?.forEach {
                            it.product.qty = getMedicineCount(it.product.productCode ?: "")
                            updatedNewArrivalList.add(it)
                        }

                        newArrivalResponse?.responseData?.NEW_ARRIVAL = updatedNewArrivalList

                        if (limitedTimeOfferResponse?.responseData?.LIMITED_OFFER.isNullOrEmpty() && newArrivalResponse?.responseData?.NEW_ARRIVAL.isNullOrEmpty() && pageIndex == 0) {
                            showMessageNewArrivalList.postValue(HomeFragmentData(MESSAGES.LIMITED_OFFER_NEW_ARRIVAL_LIST_RESPONSE_FAILED))
                        } else {
                            showMessageNewArrivalList.postValue(HomeFragmentData(MESSAGES.NEW_ARRIVALS_LIST_RESPONSE))
                            showMessageNewArrivalList.postValue(HomeFragmentData(MESSAGES.LIMITED_OFFER_LIST_RESPONSE))
                            activeStackedProductShimmerState.postValue(false)
                        }
                    }
                }
            } catch (_: Exception) {
            }
        }
    }

    fun updateQtyForYourMedicineResponse() {
        viewModelScope.launch(IO) {
            try {
                val updatedYourMedicineList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> =
                    arrayListOf()
                responsePatientMedicinesList?.responseData?.productList?.forEach {
                    it.product.qty = getMedicineCount(it.product.productCode ?: "")
                    updatedYourMedicineList.add(it)
                }
                responsePatientMedicinesList?.responseData?.productList = updatedYourMedicineList

                if (responsePatientMedicinesList?.responseData?.productList.isNullOrEmpty()) {
                    showMessageYourMedicine.postValue(HomeFragmentData(MESSAGES.PATIENT_LIST_MEDICINE_LIST_RESPONSE_FAILED))
                } else {
                    showMessageYourMedicine.postValue(HomeFragmentData(MESSAGES.PATIENT_LIST_MEDICINE_LIST_RESPONSE))
                }
            } catch (_: Exception) {
            }
        }
    }

    fun processDeepLinkingAndNotification() {
        viewModelScope.launch {
            if (!uriDeeplink.equals("")) {
                processDeepLinkingUsingMap(uriDeeplink)
                Log.d(
                    "Intent",
                    "onCreate: processDeepLinkingAndNotificationCallUri " + uriDeeplink
                )
            } else {
                processNotification()
            }
        }
        uriDeeplink = ""
        shouldProcessDeeplink.postValue(false)
    }

    fun processDeepLinkingUsingMap(uriDeeplinkTest: String) {
//        String testingDeepUrl = "truemeds://tm.sng.link/Bd108t/8kp4/l77f?pcid=TM-TACR1-038797&pcn=_pdp&action_type=og_subs_bs&referrer=singular_click_id%3De6e28f05-b7d7-42d0-a564-973f267fc1e2";
//            String testingDeepUrl = "truemeds://tm.sng.link/Bd108t/8kp4/l77f?pcid=1&pcn=_rne&referrer=singular_click_id%3De6e28f05-b7d7-42d0-a564-973f267fc1e2";
//        var searchLink =
//            "truemeds://tm.sng.link/Bd108t/8kp4/l77f?pcn=_srch&pcid=Mankind&srchType=original_company_nm&_forward_params=1 "
//        var searchLink =
//            "truemedsapp://gxer?pcn=_pdp&pcid=TM-TACR1-038773"
        val splitParams: List<String> = uriDeeplinkTest.split("?")
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
            val pcn = queryParamsMap["pcn"]
            val pcid = queryParamsMap["pcid"]
            val dl = queryParamsMap["_dl"]
            val p = queryParamsMap["_p"]
            val srchType = queryParamsMap["srchType"]
            val action_type = queryParamsMap["action_type"]
            val orderId = queryParamsMap["orderId"]
            val loginType = queryParamsMap["loginType"]
            if (!dl.isNullOrEmpty()) {
                //refer & earn deep linking
                deepLinkForAutoClaim(dl)
            } else if (!p.isNullOrEmpty()) {
                //todo which api for modification
//                   deepLinkForOrderModification(p)
//                deepLinkObserver.openActivityForDeepLink(DeepLinkEvents.OpenReferAndEarn(dl))
            } else if (!pcid.isNullOrEmpty() && !pcn.isNullOrEmpty()) {
                if (pcn == "_rne") {
                    deepLinkForAutoClaim("")
                } else if (pcn == "_inor") {
                    //incomplete order
                    deepLinkForIncompleteOrder(pcid);
                } else if (pcn == "_reor") {
                    //reorder
                    //todo reorder
                    deepLinkForReorder(pcid)
                } else if (pcn == "_pdp") {
                    deepLinkForPdPageAndSubBottomSheet(action_type, pcid)
                } else if (pcn == "_artclslg") {
                    deepLinkArticle(pcid, true)
                } else if (pcn == "_artclcat") {
                    deepLinkArticle(pcid, false);
                } else if (pcn == "_srch") {
                    var searchTypeKey = ""
                    if (!srchType.isNullOrEmpty()) {
                        searchTypeKey = srchType;
                    }
                    deepLinkSearch(pcid.replace("+", " "), searchTypeKey);
                } else if (pcn == "_reminder") {
                    openReminderActivity.postValue(Event(Any()))
                } else if (pcn == "orders") {
                    openMyOrderActivity.postValue(Event(Any()))
                } else if (pcn == "account") {
                    openAccountPage.postValue(Event(Any()))
                } else if (pcn == "cart") {
                    openCartActivity.postValue(Event(action_type))
                } else if (pcn == "active_os") {
                    //openOrderStatusPage.postValue(Event(OrderStatusNavModel(pcid,"active_order")))
                    callOrderDetails(pcid)
                }
            }

            if (loginType == "pay") {
                if (!orderId.isNullOrEmpty() && orderId != "0")
                    callOrderDetails(orderId)
            }
        }
    }

    fun callOrderDetails(orderId: String) = viewModelScope.launch {
        orderFlowUseCase.getOrderDetails(
            MxInternalErrorOccurred(),
            orderId.toLong(),
            SharedPrefManager.getInstance().loggedInUserId
        ).let {
            when {//
                it == null -> {
                    loaderValue.postValue(false)
                    return@launch
                }

                it.statusCode == 200 -> openOrderStatusPage.postValue(
                    Event(
                        OrderStatusNavModel(
                            orderId,
                            it.responseData?.orderInState
                        )
                    )
                )

                else -> {
                    loaderValue.postValue(false)
                    return@launch
                }
            }
        }
    }

    open fun deepLinkSearch(query: String, type: String) {
        openSearchProduct.postValue(Event(Pair(query, type)))
    }

    private fun deepLinkForPdPageAndSubBottomSheet(action_type: String?, pcid: String) {
        if (!action_type.isNullOrEmpty()) {
            openPdPage.postValue(Event(Pair(pcid, action_type)))
        } else {
            openPdPage.postValue(Event(Pair(pcid, "none")))
        }
    }

    private fun processNotification() {
        try {
            val iData = intentData.value
            if (iData != null && iData.hasExtra(BundleConstants.BUNDLE_KEY_DESTINATION_PAGE)) {
                val redirectTo = iData.getStringExtra(BundleConstants.BUNDLE_KEY_DESTINATION_PAGE)
                if (redirectTo.isNullOrEmpty()) {
                    return
                }
                val orderId = iData.getStringExtra(BundleConstants.BUNDLE_KEY_ORDER_ID)

                //Redirect to OrderStatus/IncompleteOrderStatus page.
                if (redirectTo.equals(
                        "OrderStatus",
                        ignoreCase = true
                    ) && !orderId.isNullOrEmpty()
                ) {
//                    getOrderDetailsAndOpenOrderStatus(orderId, false)
                }
            }
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    private fun deepLinkForAutoClaim(dl: String) {
        val intent = Intent(context, ReferAndEarnActivity::class.java)
        intent.putExtra("hasOrder", setReorderData.value)
        intent.putExtra("autoClaimCode", dl)
        openReferAndEarnActivityForDeepLink.postValue(Event(intent))
    }

    open fun deepLinkArticle(pcid: String, isArticle: Boolean) {
        openHealthArticle.postValue(Event(Pair(pcid, isArticle)))
    }

    private fun deepLinkForIncompleteOrder(pcid: String) {
        viewModelScope.launch(IO) {
            val rowCount: Int = localDbUseCase.getCartCount()
            if (rowCount == 0) {
                SharedPrefManager.getInstance().resetCurrentOrderAmount()
            }
            if (rowCount > 0) {
                if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()
                    && SharedPrefManager.getInstance().loggedInUserId.isNotEmpty()
                ) {
                    cartClick.postValue(Event(Any()))
                }
            } else {
                //fallback 1 -> Search; 0 -> Home
                if (pcid == "1") {
                    searchSuggestionClick.postValue(Event(Any()))
                }
            }
        }

    }

    private fun processDeepLinkingForOtc(categories: List<SuperCategoryModel>?) {
        try {
//            todo this is added for testing
//            uriDeeplink =
//                "truemedsapp://gxer?pcn=_otc&supcat=2&cat=137&subcat=115&brand=actis&_forward_params=1";
            val splitParams =
                uriDeeplink.toString().split("?")
            if (splitParams.size > 1) {
                val parametersId = splitParams[1]
                val queryParameters =
                    parametersId.split("&")
                for (i in queryParameters.indices) {
                    val queryParameter = queryParameters[i]
                    val queryParamKeyVal =
                        queryParameter.split("=")
                    if (queryParamKeyVal.size >= 2) {
                        val key = queryParamKeyVal[0]
                        val `val` = queryParamKeyVal[1]
                        when (key) {
                            "pcn" -> {
                                val taskToPerformOtc = queryParameters[i]
                                val taskToPerformValOtc = taskToPerformOtc.split("=".toRegex())
                                    .dropLastWhile { it.isEmpty() }
                                    .toTypedArray()
                                val taskToPerformValueOtc = taskToPerformValOtc[1]
                                when (taskToPerformValueOtc) {
                                    "_hp" -> showHomeScreenOtcCategories.postValue(
                                        Event("")
                                    )

                                    "_otc" -> {
                                        val taskToPerformParam1 = queryParameters[i + 1]
                                        val taskToPerformParam2 = queryParameters[i + 2]
                                        val taskToPerformParam3 = queryParameters[i + 3]
                                        val taskToPerformParam4 = queryParameters[i + 4]
                                        val superCategoryVal =
                                            taskToPerformParam1.split("=")
                                        val categoryVal = taskToPerformParam2.split("=")
                                        val subCategoryVal =
                                            taskToPerformParam3.split("=")
                                        val brandsVal =
                                            taskToPerformParam4.split("=").toMutableList()
                                        var brandsList: List<String>? = null
                                        if (brandsVal[1].contains("%20")) {
                                            brandsVal[1] = brandsVal[1].replace("%20", " ")
                                        }
                                        if (brandsVal[1].contains("%28")) {
                                            brandsVal[1] =
                                                brandsVal[1].replace("%28", "(")
                                        }
                                        if (brandsVal[1].contains("%29")) {
                                            brandsVal[1] =
                                                brandsVal[1].replace("%29", ")")
                                        }
                                        if (brandsVal[1].contains("empty")) {
                                            brandsVal[1] =
                                                brandsVal[1].replace("empty", "")
                                        }
                                        brandsList = brandsVal[1].split("\\s*,\\s*")
                                        deepLinkGoToOtcScreen(
                                            superCategoryVal[1].toInt(),
                                            categoryVal[1].toInt(),
                                            subCategoryVal[1].toInt(),
                                            brandsList,
                                            categories
                                        )

                                    }
                                }

                            }

                            "pcid" -> {
                                val taskToPerform = queryParameters[i + 1]
                                val taskToPerformVal = taskToPerform.split("=")
                                when (taskToPerformVal[1]) {
                                }
                            }
                        }
                    }
                }
            }

        } catch (ignore: java.lang.Exception) {
        }
    }

    open fun deepLinkGoToOtcScreen(
        superCategoryId: Int,
        categoryId: Int,
        subCategoryId: Int,
        brandsList: List<String>,
        categories: List<SuperCategoryModel>?
    ) {
        try {
            if (categories != null && categories.size > 0) {
                if (superCategoryId > 0 && categoryId <= 0 && subCategoryId <= 0) {
                    for (i in categories.indices) {
                        if (categories[i].id == superCategoryId) {
                            val model = OtcDeepLink(
                                subCategoryId = subCategoryId,
                                categoryId = categoryId,
                                superCategoryId = superCategoryId,
                                brandsList = brandsList,
                                superCategoryName = categories[i].name,
                                position = i,
                                categoryType = categories[i].type
                            )
                            openOtcScreen.postValue(model)
                        }
                    }

                } else if (superCategoryId > 0 && categoryId > 0 && subCategoryId <= 0) {
                    val categoryId2 =
                        categories.firstOrNull { it.id == superCategoryId }?.categoryLevel2List
                    val categoryL2 = categoryId2?.firstOrNull { it.id == categoryId }
                    val categoryL2Pos = categories.indexOfFirst { it.id == subCategoryId }
                    val model = OtcDeepLink(
                        subCategoryId = subCategoryId,
                        categoryId = categoryId,
                        superCategoryId = superCategoryId,
                        brandsList = brandsList,
                        superCategoryName = categoryL2?.name,
                        position = categoryL2Pos,
                        categoryType = categoryL2?.type
                    )
                    openOtcScreen.postValue(model)

                } else if (superCategoryId > 0 && categoryId > 0 && subCategoryId > 0) {
                    val categoryId3 =
                        categories.firstOrNull { it.id == superCategoryId }?.categoryLevel2List?.firstOrNull { it.id == categoryId }?.categoryLevel3List?.firstOrNull { it.id == subCategoryId }
                    val categoryL3Pos =
                        categories.firstOrNull { it.id == superCategoryId }?.categoryLevel2List?.indexOfFirst { it.id == categoryId }
                    val model = OtcDeepLink(
                        subCategoryId = subCategoryId,
                        categoryId = categoryId,
                        superCategoryId = superCategoryId,
                        brandsList = brandsList,
                        superCategoryName = categoryId3?.name,
                        position = categoryL3Pos,
                        categoryType = categoryId3?.type
                    )
                    openOtcScreen.postValue(model)
                }
            }
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    fun deleteLocalDB() {
        viewModelScope.launch(IO) {
            homePageUseCase.logout()
        }
    }

    private fun deepLinkForReorder(pcid: String) {
        viewModelScope.launch(IO) {
            val models: List<CartMedicine> = localDbUseCase.getAddedMedicines()
            if (SharedPrefManager.getInstance().loggedInUserAccessToken != null && !SharedPrefManager.getInstance().loggedInUserAccessToken.equals(
                    ""
                ) && SharedPrefManager.getInstance().loggedInUserId != null
            ) {
                if (models.isEmpty()) {
                    if (pastDeliverOrder.size > 0) {
                        redirectToReorder(prevDeliveredOrderId, prevDeliveredPatientId)
                    } else {
                        if (pcid == "1") {
                            searchSuggestionClick.postValue(Event(Any()))
                        }
                    }
                } else {
                    cartClick.postValue(Event(Any()))
                }
            } else {
                cartClick.postValue(Event(Any()))
            }
        }
    }


    private fun redirectToReorder(prevDeliveredOrderId: Long?, prevDeliveredPatientId: Long?) {
        viewModelScope.launch(IO) {
            val patientArray = arrayListOf<Long?>()
            prevDeliveredPatientId.let { pId ->
                patientArray.add(pId)
            }
            getReorder(
                prevDeliveredOrderId,
                SharedPrefManager.getInstance().loggedInUserId,
                patientArray,
                "A",
                true,
                true,
                SharedPrefManager.getInstance().srcType.toInt(),
                true,
                if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId,
                "homepage",
                "reorder"
            )
        }
    }

    fun getReferralStatus(
        customerId: String,
        isNotified: Boolean
    ) {
        viewModelScope.launch(IO) {
            tmWalletUseCase.getReferralStatus(
                mxInternalErrorOccurred, customerId,
                isNotified
            )
        }
    }

    private fun showBottomSheetByPriority() {
        /**
         * Invoke this when all API gets executed and ready to show the bottom sheet by priority
         */
        viewModelScope.launch { delay(2000) }
        isAllBottomSheetCollected.postValue(true)
    }

    fun resetPreviousAndShowThisBottomSheet(bottomSheetType: BottomSheetType, header: String = "") {
        bottomSheetPriority.clear()
        viewModelScope.launch {
            displayBottomSheet(bottomSheetType, header)
            isAllBottomSheetCollected.postValue(true)
        }
    }

    fun prepareBottomSheet(sheetType: BottomSheetType): HomePageBottomSheetInfo =
        homePageUseCase.getBottomSheetData(sheetType, null)

    fun reloadHomePageProductsForYourMedicineAndNewArrival() {
        updateQtyForNewArrivalStackResponse()
        updateQtyForYourMedicineResponse()
    }

    fun reloadHomePageProductsForYourMedicineAndTrendingInCity() {
        updateQtyForTrendingInCityResponse()
        updateQtyForYourMedicineResponse()
    }

    fun reloadHomePageProductsForTrendingCityAndNewArrival() {
        updateQtyForNewArrivalStackResponse()
        updateQtyForTrendingInCityResponse()
    }

    fun sendHomePageViewedEvent() {
        sdkEventUseCase.sendHomePageViewedEvent(
            MxHomePageViewed(
                discountVariantId = if (SharedPrefManager.getInstance().algoSpecificVariantId > 0) SharedPrefManager.getInstance().algoSpecificVariantId else null,
                whId = if (SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty()) null else SharedPrefManager.getInstance().selectedWarehouseID
            )
        )
    }

    var viewedBannerList: ArrayList<HomeBanner.Banner> = ArrayList()
    fun sendHomePageBannerImpressionEvent() {
        try {
            for (item in viewedBannerList.filter { it.position >= 0 }) {
                sdkEventUseCase.sendHomePageBannerImpressionEvent(
                    MxHomePageBannerImpression(
                        item.sequence + 1,
                        item.description
                    )
                )
            }
        } catch (_: Exception) {
        }
    }

    fun sendHomePageBannerClickedEvent(bannerClicked: MxHomePageBannerClick) {
        sdkEventUseCase.sendHomePageBannerClickedEvent(bannerClicked)
    }

    fun sendSkinnyBannerImpressionToMixPanel() {
        val alertUrl: String = alertUrl.value ?: ""
        if (alertUrl != "" && !alertUrl.equals("null", ignoreCase = true)) {
            sdkEventUseCase.sendSkinnyBannerImpressionToMixPanel()

        }
    }

    fun sendPaymentPopupViewedEvent(
        orderId: Long,
        reorder: Boolean?,
        paymentPendingBottomSheet: PaymentPendingBottomSheet
    ) {
        var ctaType = ""
        var appliedCouponType: String? = null

        ctaType = if (!paymentPendingBottomSheet?.model?.paymentType.isNullOrEmpty()) {
            "mode_selected"
        } else {
            "select_payment_mode"
        }
        if (!billDetailsData?.couponCode.isNullOrEmpty()) {
            appliedCouponType =
                if (billDetailsData?.paymentSelectionInfo?.paymentSpecificCouponApplied == true) {
                    "payment_mode_specific"
                } else {
                    "generic"
                }
        }
        if (homePaymentPendingResponseList.isEmpty()) return
        val billDetails = homePaymentPendingResponseList[0].billDetailsModel
        val mxPspViewed = MxPaymentPopupViewed()
        mxPspViewed.ctaType = ctaType
        mxPspViewed.currentOrderStatus = currentOrderState
        mxPspViewed.discountAmount = billDetails?.discountValue
        mxPspViewed.estimatedPayableAmount = billDetails?.estimatedPayableValue
        mxPspViewed.isReorder = reorder ?: false
        mxPspViewed.mrpTotalAmount = billDetails?.mrpValue
        mxPspViewed.orderId = orderId.toString()
        mxPspViewed.packagingChargeAmount = billDetails?.taxesAndChargesValue
        mxPspViewed.paymentMode = paymentPendingBottomSheet?.model?.paymentType ?: "UPI"
//            homePaymentPendingResponseList[0].paymentSelectionInfo?.paymentMethod
        mxPspViewed.salesPrice = billDetails?.sellingPrice
        mxPspViewed.whId = SharedPrefManager.getInstance().selectedWarehouseID
        mxPspViewed.appliedCouponName = billDetails?.couponName
        mxPspViewed.appliedCouponType = appliedCouponType
        mxPspViewed.couponDiscountAmount = billDetailsData?.couponDiscountAmt
        mxPspViewed.tmCreditAmount = billDetailsData?.tmCredit
        mxPspViewed.tmRewardAmount = billDetailsData?.tmCash
        mxPspViewed.deliveryChargeAmount = if ((billDetailsData?.deliveryCharge
                ?: 0.0) > 0.0
        ) billDetailsData?.deliveryCharge else null
        mxPspViewed.cashHandlingCharge = if (billDetailsData?.pspViewed == true) billDetailsData?.cashHandlingInfo?.charge else null
        mxPspViewed.cashHandlingChargeApplicable=
            if (billDetailsData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsData) else null
        sdkEventUseCase.sendPaymentPopupViewedEvent(mxPspViewed)
    }

    fun sendDoctorConfirmationCardViewedEvent() =
        sdkEventUseCase.sendDoctorConfirmationCardViewedEvent()

    fun sendLocationBottomSheetViewedEvent() {
        sdkEventUseCase.sendLocationBottomSheetViewedEvent()
    }

    fun sendContactBottomSheetSavedClicked() {
        sdkEventUseCase.sendContactBottomSheetSavedClicked()

    }

    fun sendContactBottomSheetViewed() {
        sdkEventUseCase.sendContactBottomSheetViewed()

    }

    fun eventArticleSectionViewedEvent(clickedOnPage: String) {
        sdkEventUseCase.sendArticleSectionViewedEvent(clickedOnPage)
    }


    fun sendPaymentPageVisitedEventToMixpanel(
        clickedOnPage: String?,
        pageSection: String?,
        reorder: Boolean?,
    ) = sdkEventUseCase.sendPaymentPageVisitedEvent(MxPaymentPageVisited().also {
        it.clickedOnPage = clickedOnPage
        it.currentOrderStatus = currentOrderState
        it.discountAmount = billDetailsData?.discount
        it.estimatedPayableAmount = billDetailsData?.payableAmt.toString()
        it.isReorder = reorder ?: false/*SharedPrefManager.getInstance().isReOrder*/
        it.mrpTotalAmount = billDetailsData?.mrp
        it.orderId = billDetailsData?.orderId.toString()
        it.packagingChargeAmount = billDetailsData?.packagingCharge
        it.pageSection = pageSection
        it.paymentMode = billDetailsData?.paymentSelectionInfo?.paymentMethod
        it.salesPrice = billDetailsData?.sellingPrice
        it.tmRewardAmount = billDetailsData?.tmCash
        it.tmCreditAmount = billDetailsData?.tmCredit
        it.couponDiscountAmount = billDetailsData?.couponDiscountAmt
        it.deliveryChargeAmount = billDetailsData?.deliveryCharge
        it.whId = SharedPrefManager.getInstance().selectedWarehouseID
        it.cashHandlingCharge= if (billDetailsData?.pspViewed == true) billDetailsData?.cashHandlingInfo?.charge ?: 0.0 else null
        it.cashHandlingChargeApplicable = if (billDetailsData?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(billDetailsData) else null

    })

    fun calculateBillDetailsPaymentPendingOrder(orderId: Long) = viewModelScope.launch {
        orderFlowUseCase.calculateBillDetailsforApp(mxInternalErrorOccurred, orderId, true)
            .let { bill ->
                if (bill != null) {
                    currentOrderStatus = bill.responseData.currentOrderStatus
    
                    mrpEventValueFromBaseVM = bill.responseData?.mrp ?: 0.0
                    salesPriceEventValueFromBaseVM = bill.responseData?.sellingPrice ?: 0.0

                    bottomSheetPriority.add(prepareBottomSheet(BottomSheetType.PAYMENT_PENDING))
                }
            }
    }

    fun calculateBillDetailsAfterCouponApplied(orderId: Long) = viewModelScope.launch {
        orderFlowUseCase.calculateBillDetailsforApp(mxInternalErrorOccurred, orderId, true)
            .let { bill ->
                if (bill != null) {
                    billDetailsData = bill.responseData
                    bill?.responseData?.let {

                        Log.e("card_dataaaa::::", "2222:::" + bill?.responseData!!.toString())
//                        SharedPrefManager.getInstance().isPspViewed = response.responseData.pspViewed
                        SharedPrefManager.getInstance().accountTmCredit =
                            (it.tmCredit ?: 0f).toFloat()
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
                        SharedPrefManager.getInstance().setCouponDiscount(
                            it.couponAppliedAmt?.toFloat() ?: 0f
                        )
                        setCartCount()
                    }
                }
            }
    }

    fun addBannerImpression(list: List<HomeBanner.Banner>, index: Int) {
        try {
            if (list != null && list.size > 0) {
                list[index].position = index
                if (!isBannerImpressionAdded(viewedBannerList, list[index])) {
                    val banner = list[index]
                    banner.sequence = index
                    viewedBannerList.add(banner)
                }
            }
        } catch (ignore: java.lang.Exception) {
        }
    }

    private fun isBannerImpressionAdded(
        list: List<HomeBanner.Banner>,
        item: HomeBanner.Banner
    ): Boolean {
        var isAdded = false
        if (list.isNotEmpty()) {
            for (model in list) {
                if (model.image === item.image) {
                    isAdded = true
                    break
                }
            }
        }
        return isAdded
    }

    fun sendSubsLearnMoreClickedEvent() {
        sdkEventUseCase.sendSubsLearnMoreClickedEvent()
    }

    fun sendCategoryAndSuperCategoryData() {
        sendCategoryImpression()
        sendSuperCategorySectionImpression()
    }

    fun sendCategoryImpression() {
        if (selectedCategory < 0) return
        if (superCategoryList.value.isNullOrEmpty()) return
        superCategoryList.value?.get(selectedCategory).let { superCategory ->
            superCategory?.categoryLevel2List?.forEachIndexed { index, category ->
                if (index > 5) return@forEachIndexed
                val mxCategoryImpression = MxCategoryImpression().also {
                    it.clickedOnPage = "homepage"
                    it.superCategoryName = superCategory.name ?: ""
                    it.categoryName = category.name ?: ""
                    it.categoryIndex = selectedCategory
                    it.subTitleText = category.subsTitle
                }
                sdkEventUseCase.sendCategoryImpression(mxCategoryImpression)
            }
        }
    }

    private fun sendSuperCategorySectionImpression() {
        //if (!octCategoryVisible) return
        if (selectedCategory < 0) return
        val superCategory = superCategoryList.value?.get(selectedCategory)
        val categoryList: ArrayList<ChildCategoryModel> = arrayListOf()
        for (i in superCategory?.categoryLevel2List?.indices!!) {
            if (i < 6) {
                categoryList.add(superCategory.categoryLevel2List[i])
            } else {
                break
            }
        }
//        superCategory?.categoryLevel2List?.forEach {

//        }

        val gson = GsonBuilder().create()
        val myCustomArray = gson.toJsonTree(categoryList.map { it.name }).asJsonArray

        val mxSuperCategorySectionImpression = MXSuperCategorySectionImpression().also {
            it.clickedOnPage = "homepage"
            it.glanceTime = null
            it.superCategoryName = superCategory?.name ?: ""
            it.categoryList = myCustomArray
            it.categoryCount = min(categoryList.size, 6)
            it.superCategoryIndex = selectedCategory
            it.pageSection = "otc"
        }
        sdkEventUseCase.sendSuperCategorySectionImpression(mxSuperCategorySectionImpression)
    }


    fun sendReorderSheetViewedEvent(mxReorderSheetViewed: MxReorderSheetViewed) {
        sdkEventUseCase.sendReorderSheetViewedEvent(mxReorderSheetViewed)
    }

    fun sendFtcCounterStarted(timestamp: Long) {
        val mxUrgencyTimerStarted = MxUrgencyTimerStarted(
            DateUtils.convertMillisToSeconds(
                DateUtils.convertEpochTimeStampToDateMillis(
                    timestamp,
                    System.currentTimeMillis()
                )
            )
        )
        sdkEventUseCase.sendFtcTimerStartedEvent(mxUrgencyTimerStarted)
    }

    fun sendCallToOrderToFacebookEvent() {
        sdkEventUseCase.sendCallToOrderToFacebookEvent()
    }

    fun sendLocationClickToFirebaseEvent(firebaseEventModel: FirebaseEventModel) {
        sdkEventUseCase.sendocationClickToFirebaseEvent(firebaseEventModel)
    }

    fun sendNavClickToFirebaseEvent(nav: String) {
        sdkEventUseCase.sendNavClickToFirebaseEvent(nav)
    }

    fun sendUseLocationClickedEvent(mxModel: MxUseLocationClicked) {
        sdkEventUseCase.sendUseLocationClickedEvent(mxModel)
    }
}

fun Unit.runInSeries(coroutineScope: CoroutineScope) {
    coroutineScope.launch {
        withContext(IO) {
            this@runInSeries
        }
    }
}



