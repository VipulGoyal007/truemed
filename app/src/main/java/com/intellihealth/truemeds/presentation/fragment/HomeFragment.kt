package com.intellihealth.truemeds.presentation.fragment


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.appsflyer.AppsFlyerLib
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.ReorderCallback
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.models.ActionCardModel
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.SubstituteInfoCardModel
import com.intellihealth.salt.utils.toPx
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.tooltip.DefaultExpandedTooltipWithMargin
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.ChooseLocationCallback
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.home.ActionCardDataModel
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.home.ApplyCouponBottomSheetModel
import com.intellihealth.truemeds.data.model.home.BannerDataModel
import com.intellihealth.truemeds.data.model.home.BlogSectionDataModel
import com.intellihealth.truemeds.data.model.home.BottomSheetDefaultModel
import com.intellihealth.truemeds.data.model.home.FooterDataModel
import com.intellihealth.truemeds.data.model.home.HomeDataModel
import com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel
import com.intellihealth.truemeds.data.model.home.PopUpModel
import com.intellihealth.truemeds.data.model.home.ProductCardDataModel
import com.intellihealth.truemeds.data.model.home.SubstituteInfoCardDataModel
import com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse
import com.intellihealth.truemeds.data.model.orderflow.SaveRatingDetailsRequestDataModel
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpManager
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.checkPermissionsForContact
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.data.utils.isSingleClick
import com.intellihealth.truemeds.databinding.FragmentHomeBinding
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.enums.LoginFromScreen
import com.intellihealth.truemeds.domain.enums.OrderInState
import com.intellihealth.truemeds.domain.enums.ShimmersStates
import com.intellihealth.truemeds.domain.model.mapToBannerList
import com.intellihealth.truemeds.domain.model.mapToReorderModelList
import com.intellihealth.truemeds.domain.navigation.navigateToAddAddressActivity
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHealthArticleDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHealthArticlesActivity
import com.intellihealth.truemeds.domain.navigation.navigateToMyOrdersActivity
import com.intellihealth.truemeds.domain.navigation.navigateToNonActiveOrderStatusActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderStatusActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOtcCategoryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPatientReminderActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPrescriptionActivity
import com.intellihealth.truemeds.domain.navigation.navigateToProductDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToProductListViewAllActivity
import com.intellihealth.truemeds.domain.navigation.navigateToReferAndEarnActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchResultActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSubstitutesActivity
import com.intellihealth.truemeds.domain.navigation.navigateToVideoFaqActivity
import com.intellihealth.truemeds.domain.navigation.navigateToWalletActivity
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.activity.BaseActivity
import com.intellihealth.truemeds.presentation.activity.CartActivity
import com.intellihealth.truemeds.presentation.activity.HomePageActivity
import com.intellihealth.truemeds.presentation.activity.OrderSummaryActivity
import com.intellihealth.truemeds.presentation.activity.PaymentOptionActivity
import com.intellihealth.truemeds.presentation.activity.ProductDetailActivity
import com.intellihealth.truemeds.presentation.activity.SplashScreen
import com.intellihealth.truemeds.presentation.adapter.ActionCardAdapter
import com.intellihealth.truemeds.presentation.adapter.AlertAdapter
import com.intellihealth.truemeds.presentation.adapter.BannerAdapter
import com.intellihealth.truemeds.presentation.adapter.BlogSectionDataAdapter
import com.intellihealth.truemeds.presentation.adapter.FooterDataAdapter
import com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter
import com.intellihealth.truemeds.presentation.adapter.PatientListMedicinesListAdapter
import com.intellihealth.truemeds.presentation.adapter.ProductCardAdapter
import com.intellihealth.truemeds.presentation.adapter.ProductCardStackedAdapter
import com.intellihealth.truemeds.presentation.adapter.ReorderAdapter
import com.intellihealth.truemeds.presentation.adapter.SubstituteInfoCardAdapter
import com.intellihealth.truemeds.presentation.adapter.TestimonialSectionDataAdapter
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.CompareAndUnderstandSubstituteBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.DoctorCallBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.DoctorCallMissedBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.DoctorFraudBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.ErrorBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.LocationBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.PaymentPendingBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.PrivacyPolicyBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.RatingsBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.ReorderBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.SaveNumberBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.CouponBottomSheetCallback
import com.intellihealth.truemeds.presentation.callbacks.DoctorFraudCallback
import com.intellihealth.truemeds.presentation.callbacks.FeedbackCallback
import com.intellihealth.truemeds.presentation.callbacks.PaymentPendingCallback
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.callbacks.RatingSubmittedDialogCallback
import com.intellihealth.truemeds.presentation.dialog.PopUpDialog
import com.intellihealth.truemeds.presentation.dialog.RatingSubmittedPopUpDialog
import com.intellihealth.truemeds.presentation.model.BottomSheetType
import com.intellihealth.truemeds.presentation.model.HomeBanner
import com.intellihealth.truemeds.presentation.model.HomePageBottomSheetInfo
import com.intellihealth.truemeds.presentation.model.HomePaymentPendingResponse
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.ApiParameterConstants
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc.forEachUntil
import com.intellihealth.truemeds.presentation.utils.CommonFunc.mapToHealthArticle
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.util.Objects
import javax.inject.Inject


@AndroidEntryPoint
class HomeFragment() : Fragment(R.layout.fragment_home), ProductDetailBottomSheet.CrossSellingProductBSCallback {
    private lateinit var ftcViewModel: CountDownTimerViewModel

    constructor(ftcViewModel: CountDownTimerViewModel) : this() {
        this.ftcViewModel = ftcViewModel
    }

    private val binding : FragmentHomeBinding by viewBinding(FragmentHomeBinding::bind)
    var lastClickSubstitutesPageCTA = 0L

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase

    var isBannerVisible = true
    private var bannerAdapter: BannerAdapter? = null
    private var alertAdapter: AlertAdapter? = null
    private var actionCardAdapter: ActionCardAdapter? = null
    private var substituteInfoCardAdapter: SubstituteInfoCardAdapter? = null
    private var productCardAdapter: ProductCardAdapter? = null
    private var callOrderActionCardAdapter: ActionCardAdapter? = null
    private var productCardStackedAdapter: ProductCardStackedAdapter? = null
    private var patientListMedicinesListCardStackedAdapter: PatientListMedicinesListAdapter? = null
    private var blogSectionAdapter: BlogSectionDataAdapter? = null
    private var testimonialSectionAdapter: TestimonialSectionDataAdapter? = null
    private var footerAdapter: FooterDataAdapter? = null
    private var reorderAdapter: ReorderAdapter? = null
    private var homeOtcCategoryAdapter: HomeOtcCategoryAdapter? = null
    private val homeViewModel by lazy { ViewModelProvider(requireActivity())[HomeViewModel::class.java] }
    private var applyCouponCallBack: CouponBottomSheetCallback? = null
    private var mainAdapter: ConcatAdapter? = null
    private var locationBottomSheet: LocationBottomSheet? = null
    private val handler = Handler()
    val homeDataModel = HomeDataModel()
    val displayMetrics = DisplayMetrics()
    lateinit var reOrderCallback: ReorderCallback
    private var pdBottomsheetCallbackListener: ProductDetailBottomSheet.CrossSellingProductBSCallback? =
        null
    private var editDeleteAddressBottomSheet = RemoveProductBottomSheet()
    private val cartViewModel by lazy { ViewModelProvider(this)[CartViewModel::class.java] }
    private var productCodeToDelete = ""
    var posDeleteBSFromProductCardStacked: Int = 0
    private var isFromLimitedOffer: Boolean? = true
    private var otcProductToDeleteFromDB: ProductInfoModel? = null
    private var productSectionType: String? = ""
    var resultLauncher: ActivityResultLauncher<Intent>? = null
    lateinit var responseApi: ProductCardDataModel
    private var saveNumberBottomSheet: SaveNumberBottomSheet? = null
    private var ratingBottomSheet: RatingsBottomSheet? = null
    private lateinit var billDetailsModel: BillDetailsModel
    private lateinit var orderDetails: AllCustomersOrdersResponseModel.ResponseData.Orders
    private lateinit var paymentSelectionInfo: BillDetailResponse.ResponseData.PaymentSelectionInfo
    private var paymentPendingBottomSheet: PaymentPendingBottomSheet? = null
    private var paymentResponse: HomePaymentPendingResponse? = null
    private var fraudBottomSheet: DoctorFraudBottomSheet? = null
    private var reorderBottomSheet: ReorderBottomSheet? = null
    private var isCategoryImpressionSent = false
    var otcPosition = 0
    var trendingConcatPosition = 0
    var stackedConcatPosition = 0
    var healthArticlePosition = 0

    enum class CrossSellingClick {
        TRENDING_IN_YOUR_CITY, LIMITED_OFFER, NEW_ARRIVAL
    }

    companion object {
        const val MIN_DELAY_MS: Long = 1000L
        var isLocationBottomSheetOpened = false
    }

    //lateinit var  homeViewModel:HomeViewModel

    var lastVisibleItemPosition = 0
    override fun onPause() {
        super.onPause()

        if (lastVisibleItemPosition == 0) {
            val layoutManager = binding.rvHomePage.layoutManager as LinearLayoutManager
            val visibleItemCount =
                layoutManager.findLastVisibleItemPosition() + 1 // - layoutManager.findFirstVisibleItemPosition();
            lastVisibleItemPosition = visibleItemCount
        }
        if (homeViewModel.activeMenu.value == R.id.homeFragment) {
            try {
                homeViewModel.sendHomePageBannerImpressionEvent()
                val isAlertVisible: Boolean = homeViewModel.showImageAlert.value ?: false
                if (isAlertVisible) {
                    homeViewModel.sendSkinnyBannerImpressionToMixPanel()
                }
            } catch (_: Exception) {
            }

            lifecycleScope.launch {
                try {

//                val resultList :ArrayList<ProductInfoModel> = when (homeViewModel.crossSellingClick) {
//                        CrossSellingClick.TRENDING_IN_YOUR_CITY -> {
//                            lastScrollPosition = homeViewModel.lastScrollPositionTrendingCity
//                            homeViewModel.trendingInCityResponse?.responseData?.TRENDING_IN_CITY?: arrayListOf()
//                        }
//                        CrossSellingClick.LIMITED_OFFER -> {
//                            lastScrollPosition = homeViewModel.lastScrollPositionLimitedOffers
//                            homeViewModel.limitedTimeOfferResponse?.responseData?.LIMITED_OFFER?: arrayListOf()
//                        }
//                        CrossSellingClick.NEW_ARRIVAL -> {
//                            lastScrollPosition = homeViewModel.lastScrollPositionNewArrivals
//                            homeViewModel.newArrivalResponse?.responseData?.NEW_ARRIVAL ?: arrayListOf()
//                        }
//                }
                    if (homeViewModel.yourMedicineView) {
                        val resultListYourMedicine =
                            homeViewModel.responsePatientMedicinesList?.responseData?.productList
                                ?: arrayListOf()
                        for (i in 0..homeViewModel.lastScrollPositionYourMedicine) {
                            resultListYourMedicine[i].let { pim ->
                                homeViewModel.sendItemImpressionEvent(
                                    pim,
                                    "homepage",
                                    "tray",
                                    i + 1,
                                    "my_medicines",
                                    i + 1,
                                    /*if ((i + 1) % 2 == 0) 2 else*/
                                    1, /*SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*/ //as per rohit said
                                    0.0
                                )
                            }
                        }
                    }

                    if (homeViewModel.trendingInYourCityView) {
                        val resultListTrendingInCityResponse =
                            homeViewModel.trendingInCityResponse?.responseData?.TRENDING_IN_CITY
                                ?: arrayListOf()
                        for (i in 0..homeViewModel.lastScrollPositionTrendingCity) {
                            resultListTrendingInCityResponse[i].let { pim ->
                                homeViewModel.sendItemImpressionEvent(
                                    pim,
                                    "homepage",
                                    "tray",
                                    i + 1,
                                    "popular_items",
                                    i + 1,
                                    /*if ((i + 1) % 2 == 0) 2 else*/
                                    1, /*SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*///as per rohit said
                                    0.0
                                )
                            }
                        }
                    }

                    if (homeViewModel.newArrivalAndLimittedOfferView) {
                        val resultListLimitedOffers =
                            homeViewModel.limitedTimeOfferResponse?.responseData?.LIMITED_OFFER
                                ?: arrayListOf()
                        for (i in 0..homeViewModel.lastScrollPositionLimitedOffers) {
                            resultListLimitedOffers[i].let { pim ->
                                homeViewModel.sendItemImpressionEvent(
                                    pim,
                                    "homepage",
                                    "tray",
                                    i + 1,
                                    "deal_you_will_love",
                                    i + 1,
                                    /* if ((i + 1) % 2 == 0) 2 else */
                                    1, /*SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*///as per rohit said
                                    0.0
                                )
                            }
                        }

                        val resultListNewArrivals =
                            homeViewModel.newArrivalResponse?.responseData?.NEW_ARRIVAL
                                ?: arrayListOf()
                        for (i in 0..homeViewModel.lastScrollPositionNewArrivals) {
                            resultListNewArrivals[i].let { pim ->
                                homeViewModel.sendItemImpressionEvent(
                                    pim,
                                    "homepage",
                                    "tray",
                                    i + 1,
                                    "new_on_truemeds",
                                    i + 1,
                                    /*if ((i + 1) % 2 == 0) 2 else */
                                    1, /*SharedPrefManager.getInstance().deliveryOnAmount.toDouble()*///as per rohit said
                                    0.0
                                )
                            }
                        }
                    }
                } catch (e: Exception) {
                    Log.d("TAG", "onPause: ${e.printStackTrace()}")
                }
            }
        }
    }


//    @SuppressLint("HardwareIds") //comment this line because it throws null pointer exception here
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ftcViewModel = ViewModelProvider(this)[CountDownTimerViewModel::class.java]

        //homeViewModel = (activity as HomePageActivity).viewModel
        binding.viewmodel = homeViewModel
        lifecycle.addObserver(homeViewModel)

        homeViewModel.deviceId =
            Settings.Secure.getString(requireActivity().contentResolver, Settings.Secure.ANDROID_ID)
        homeViewModel.appsFlyerSdkId =
        AppsFlyerLib.getInstance().getAppsFlyerUID(requireActivity()) ?: ""
        pdBottomsheetCallbackListener = this
        initView()

        homeViewModel.getAddressList.observe(viewLifecycleOwner) {
            locationBottomSheet?.isCancelable = !homeViewModel.getAddressList.value.isNullOrEmpty()
        }

        homeViewModel.startSplashScreen.observe(viewLifecycleOwner) {
            PopUpManager.showPopUp(
                parentFragmentManager,
                PopUpType.SESSION_EXPIRED,
                object :
                    PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        SharedPrefManager.getInstance().clearPrefs()
                        homeViewModel.deleteLocalDB()
                        val intent = Intent(activity, SplashScreen::class.java)
                        startActivity(intent)
                        requireActivity().finishAffinity()

                    }

                    override fun onCloseButtonClicked() {

                    }
                },
                false
            )

        }


        if (!SharedPrefManager.getInstance().isDBMigrationCompleted) {
            homeViewModel.dbMigrationToRooms()
        } else {
            homeViewModel.onCreateApiCalls()
        }
        setScrollListener()
    }


    private fun initView() {
        setListener()
        lifecycleScope.launch {
            createDataForHomePage()
            setupDataInRecyclerView()
        }

        if (SharedPrefManager.getInstance().selectedCity.isNotEmpty()) {
            homeViewModel.selectedCity.postValue(SharedPrefManager.getInstance().selectedCity)
        } else {
            homeViewModel.selectedCity.postValue(getString(R.string.default_select))
        }
        observeBottomSheet()

        //binding.tmCartHeaderChip.setCartCount("4")
        //homeViewModel.getCustomerActiveOrderType()
        //setupAdapter()
        homeViewModel.updateDBSchema()
        //setObserversFragment()
        //setObserversBlogSectionFragment()


        applyCouponCallBack = object : CouponBottomSheetCallback {
            override fun applyCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
                homeViewModel.applyCouponClick(couponCodeResponse)
            }

            override fun removeCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
                couponCodeResponse?.offerId.let { offerID ->
                    //viewModel.changeCouponButtonState(true, offerID)
                }
            }


        }
        //Need to call offer API here
        //applyCouponBottomSheet = ApplyCouponBottomSheet(setupApplyCouponData(), applyCouponCallBack!!)

        binding.tmSearchBar.setPlaceHolderText("Search for medicines")
        binding.tmSearchBar.setSearchEnable(false)
        binding.tmSearchBar.setStartIconAsSearch(true)

        setDataObserver()
        //todo place this api call accordingly
    }

    private fun setListener() {
        homeViewModel.featureList.observe(viewLifecycleOwner) {
            setupFeatureList(it)
            /*if (!SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty()) {
                homeViewModel.callBothStackedProductApi()
            }*/

            homeViewModel.isLocationBsShown = false
            homeViewModel.callApiAfterFeatureList()
            setNestedScrollListener()
            (requireActivity() as? HomePageActivity)?.checkIsBottomNavigationRounded()
        }
        homeViewModel.getSelectedCity.observe(viewLifecycleOwner) {
            if (it.isNullOrEmpty()) {
                binding.city = "Select"
            } else {
                binding.city = it
            }
        }

        binding.tmSearchBar.setCallBack(object : SearchBarCallback {
            override fun onClearClick() {

            }

            override fun onIconClick() {
               /* val intent = Intent(activity, SearchSuggestionActivity::class.java)
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "home_page")
                    .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                startActivity(intent)*/

                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "home_page",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }

            override fun onViewClick() {
                /*val intent = Intent(activity, SearchSuggestionActivity::class.java)
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "home_page")
                    .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                startActivity(intent)*/

                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "home_page",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }

        })

        binding.tvSelectedCity.setOnClickListener {
            if (isNetworkAvailable(requireContext())) {
                //homeViewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.CHOOSE_LOCATION)
                openLocationBottomSheet()
            } else {
                (activity as BaseActivity).showDialogBox(
                    popUpType = PopUpType.INTERNET_FAILURE,
                    object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {}
                        override fun onCloseButtonClicked() {
                        }
                    }, true
                )

            }
        }

        binding.tmCartHeaderChip.setOnClickListener {
            /*(activity as HomePageActivity).verifyLoginAndRedirect {
                openCartActivity()
            }*/
            homeViewModel.onViewCartClicked("toolbar_cart")
        }

        binding.tmWalletHeaderChip.setOnClickListener {
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_WALLET_TOP_BAR, "")
            homeViewModel.onWalletClicked()
            /*(activity as HomePageActivity).verifyLoginAndRedirect {
                startActivity(Intent(context, WalletActivity::class.java))
            }*/
        }




        homeViewModel.eventLaunchRatingBottomSheet.observe(requireActivity(), EventObserver {
            if (!homeViewModel.isRatingBsShown) {
                homeViewModel.displayBottomSheet(BottomSheetType.RATING)
                homeViewModel.isRatingBsShown = true
            }
        })

        homeViewModel.eventShowRatingSubmittedPopup.observe(requireActivity(), EventObserver {
            showRatingSubmittedPopup()
        })

        homeViewModel.eventLaunchUploadRx.observe(viewLifecycleOwner, EventObserver {
            navigateToPrescriptionActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "main"
                ),
                isFlagAdded = true
            )
            firebaseEventUseCase.logFirebaseEvent(
                FirebaseEvent.FIREBASE_HOMEPAGE_UPLOAD_PRESCRIPTION,
                "Home"
            )
        })

        homeViewModel.eventLaunchLearnMore.observe(viewLifecycleOwner, EventObserver {
            val lastRecordedData = isSingleClick(lastClickSubstitutesPageCTA)
            lastClickSubstitutesPageCTA = lastRecordedData.second
            if (lastRecordedData.first) {
               // startActivity(Intent(context, SubstitutesActivity::class.java))
                navigateToSubstitutesActivity()

            }
            homeViewModel.sendSubsLearnMoreClickedEvent()
        })
        homeViewModel.eventLaunchOrderSummary.observe(viewLifecycleOwner, EventObserver {
            homeViewModel.loaderValue.postValue(false)
            navigateToOrderSummaryActivity(
                params = bundleOf(
                    "isOrderSummary" to true,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to homeViewModel.pageSection,
                    BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED to
                            BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED
                ),
                flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )
        })

        homeViewModel.eventLaunchSearch.observe(viewLifecycleOwner, EventObserver {
            /*startActivity(
                Intent(context, SearchSuggestionActivity::class.java)
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "home_page")
                    .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                        .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )*/

            navigateToSearchSuggestionActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "home_page",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                ),
                flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )

        })

        homeViewModel.eventOpenReferAndEarnActivityForDeepLink.observe(
            viewLifecycleOwner,
            EventObserver {
                if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()
                    && SharedPrefManager.getInstance().loggedInUserId.isNotEmpty()
                ) {
                    val intentDeeplink = it as Intent
                   /* val intent = Intent(requireContext(), ReferAndEarnActivity::class.java)
                    intent.putExtra("hasOrder", homeViewModel.setReorderData.value)
                    intent.putExtra("autoClaimCode", intentDeeplink.getStringExtra("autoClaimCode"))
                    startActivity(intent)*/

                    navigateToReferAndEarnActivity(
                        params = bundleOf(
                            "hasOrder" to homeViewModel.setReorderData.value,
                            "autoClaimCode" to intentDeeplink.getStringExtra("autoClaimCode"),
                         ),

                    )
                }
            })

        homeViewModel.eventCartClick.observe(viewLifecycleOwner, EventObserver {
            navigateToCartActivity(
                params = bundleOf(
                    "actionType" to it.toString(),
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage"
                ),
                flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )
        })

        homeViewModel.eventSearchSuggestionClick.observe(viewLifecycleOwner, EventObserver {
            openSearchSuggestionActivity(it.toString())
        })

        homeViewModel.eventOpenPdPage.observe(
            requireActivity(),
            EventObserver {
                it?.let { openPdPage(it.first, it.second) }
            })

        homeViewModel.eventOpenHealthArticle.observe(
            requireActivity(),
            EventObserver {
                it?.let { openHealthArticleActivity(it.first, it.second) }
            })

        homeViewModel.eventOpenSearchProduct.observe(
            requireActivity(),
            EventObserver {
                it?.let { openSearchActivity(it.first, it.second) }
            })

        homeViewModel.eventOpenReminderActivity.observe(
            requireActivity(),
            EventObserver {
                openReminderActivity()
            })
        homeViewModel.eventOpenMyOrderActivity.observe(
            requireActivity(),
            EventObserver {
                openMyOrdersActivity()
            })

        homeViewModel.eventOpenOrderStatusPage.observe(
            requireActivity(),
            EventObserver {
                openOrderStatusActivity(it.orderId,it.orderType)
            })

        homeViewModel.eventOpenOtcScreen.observe(
            requireActivity(),
        ) {
            var position=0
            if(it?.position!! >=0) {
                position = it.position!!
            }
            val categoryList = Gson().toJson(homeViewModel.superCategoryList.value?.get(position)?.categoryLevel2List)
            navigateToOtcCategoryActivity(
                params = bundleOf(
                    BundleConstants.CATEGORY_ID to it.subCategoryId,
                    BundleConstants.POSITION to position+1,
                    BundleConstants.CATEGORY_TYPE to it.categoryType,
                    BundleConstants.CATEGORY_LIST to categoryList,
                    BundleConstants.TYPE to it.superCategoryName,
                    BundleConstants.SUPER_CAT_ID to it.categoryId,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to  "homepage"
                )
            )
        }

        homeViewModel.eventOpenWalletActivity.observe(viewLifecycleOwner) {
            navigateToWalletActivity()
        }

        homeViewModel.activeProductShimmerState.observe(viewLifecycleOwner){
            when(it){
                is ShimmersStates.NewArrival -> productCardStackedAdapter?.toggleShimmer(it.state)
                is ShimmersStates.Trending -> productCardAdapter?.toggleShimmer(it.state)
                is ShimmersStates.LimitedOffer -> productCardStackedAdapter?.toggleShimmer(it.state)
                else -> {}
            }
        }
        homeViewModel.activeStackedProductShimmerState.observe(viewLifecycleOwner){
            productCardStackedAdapter?.toggleShimmer(it)
        }

        homeViewModel.healthArticleShimmerState.observe(viewLifecycleOwner){
            blogSectionAdapter?.toggleShimmer(it)
        }


    }

    private var octCategoryVisible = false
    private fun setupDataInRecyclerView() {
        val layoutManager = LinearLayoutManager(activity)
        binding.rvHomePage.layoutManager = layoutManager
//todo QA-4219
//        binding.contentScroll.viewTreeObserver.addOnScrollChangedListener {
//            val lastVisibleItemPosition = layoutManager.findLastVisibleItemPosition()
//            if (lastVisibleItemPosition > if(SharedPrefManager.getInstance().isFtc) 3 else 2) {
//                if (!octCategoryVisible) {
//                    homeViewModel.sendCategoryAndSuperCategoryData()
//                    octCategoryVisible = true
//                }
//            }
//        }


        //below callback is also required other wise app is crashing in some cases on reorder list click
        reOrderCallback = object : ReorderCallback {
            override fun getMoreClickPosition(position: Int) {

            }

            override fun getReorderItemPosition(position: Int) {
                if (homeViewModel.activeMenu.value == R.id.homeFragment) {
                    homeViewModel.reOrderPosition = position
                    homeViewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.REORDER)
                }
            }

            override fun getReorderPosition(position: Int) {
                homeViewModel.reOrderPosition = position

                //below line commented for now as this list only contains 5 items
                //  homeViewModel.fetchAllOrdersOfCustomers.value?.responseData?.let {

                //below line is added as the reorderResponseCustomerOrdersList contains entire data of reorder list
                homeViewModel.reorderResponseCustomerOrdersList?.responseData?.let {
                    if (isSingleClick()) {
                        homeViewModel.loaderValue.postValue(true)
                        val data = it.ordersList[position]
                        var patientArray = arrayListOf<Long?>()
                        data.mxEvents.patientId?.let { pId ->
                            patientArray.add(pId)
                        }
                        homeViewModel.getReorder(
                            data.orderId,//
                            SharedPrefManager.getInstance().loggedInUserId,
                            patientArray,//
                            "A",
                            true,
                            true,
                            SharedPrefManager.getInstance().srcType.toInt(),
                            true,
                            if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId,
                            "homepage",
                            "reorder_sheet"
                        )
                    }
                }

            }

        }


        setMainListAdapter()

    }

    private fun setMainListAdapter() {
//        val lac = LayoutAnimationController(
//            AnimationUtils.loadAnimation(
//                binding.rvHomePage.context, R.anim.item_animation_fall_down
//            )
//        )

        val config = ConcatAdapter.Config.Builder()
            .setStableIdMode(ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS).build()
        mainAdapter = ConcatAdapter(config)
//        lac.order = LayoutAnimationController.ORDER_NORMAL
//        lac.delay = 1f
//        binding.rvHomePage.layoutAnimation = lac
        binding.rvHomePage.adapter = mainAdapter
    }

    private fun setScrollListener() {
        binding.rvHomePage.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                val linearLayoutManager = recyclerView.layoutManager as LinearLayoutManager?
                val visibleItemPosition =
                    linearLayoutManager!!.findLastCompletelyVisibleItemPosition()
                val firstVisibleItemPosition =
                    linearLayoutManager.findFirstCompletelyVisibleItemPosition()

                Log.e("SCROLL", "DOWN")
                /* viewModel.captureCategoryImpressionPosition(
                     firstVisibleItemPosition,
                     visibleItemPosition
                 )*/
            }
        })

    }

    private fun setupFeatureList(homepageFeatureList: List<HomePageFeatureName>) {
        //val homepageFeatureList = homeViewModel.getFeatureList()
        if ((mainAdapter?.adapters?.size ?: 0) > 0)
            setMainListAdapter()

        val sortedList = homepageFeatureList.sortedBy { it.sequence }
        for (i in sortedList.indices) {
            when (sortedList[i].featureName) {
                //Banner
                HomeSectionConstants.BANNER -> {
                    //setupBannerAdapter
                    bannerAdapter =
                        BannerAdapter(
                            arrayListOf(),
                            homeViewModel, requireContext()
                        )
                    bannerAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(bannerAdapter as BannerAdapter)
                }

                //Alert
                HomeSectionConstants.ALERT -> {
                    alertAdapter = AlertAdapter("", homeViewModel)
                    alertAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(alertAdapter as AlertAdapter)
                }

                //ReOrder
                HomeSectionConstants.REORDER -> {
                    //setupreorderAdapter
                    reOrderCallback = object : ReorderCallback {
                        override fun getMoreClickPosition(position: Int) {
                            if (homeViewModel.activeMenu.value == R.id.homeFragment) {
                                homeViewModel.reOrderPosition = position
                                homeViewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.REORDER)
                            }

                        }

                        override fun getReorderItemPosition(position: Int) {
                            if (homeViewModel.activeMenu.value == R.id.homeFragment) {
                                homeViewModel.reOrderPosition = position
                                homeViewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.REORDER)
                            }
                        }

                        override fun getReorderPosition(position: Int) {
                            try {
                                if (isSingleClick()) {
                                    homeViewModel.loaderValue.postValue(true)
                                    homeViewModel.reOrderPosition = position
                                    //below line commented bcoz this list only contains 5 items
                                    // homeViewModel.fetchAllOrdersOfCustomers.value?.responseData?.let {

                                    //below line is added as the reorderResponseCustomerOrdersList contains entire data of reorder list
                                    homeViewModel.reorderResponseCustomerOrdersList?.responseData?.let {
                                        try {
                                            val data = it.ordersList[position]
                                            val patientArray = arrayListOf<Long?>()
                                            data.mxEvents.patientId?.let { pId ->
                                                patientArray.add(pId)
                                            }
                                            homeViewModel.getReorder(
                                                data.orderId,//
                                                SharedPrefManager.getInstance().loggedInUserId,
                                                patientArray,//
                                                "",
                                                true,
                                                true,
                                                SharedPrefManager.getInstance().srcType.toInt(),
                                                true,
                                                if (SharedPrefManager.getInstance().algoSpecificVariantId < 0) null else SharedPrefManager.getInstance().algoSpecificVariantId,
                                                "homepage",
                                                "reorder_sheet"
                                            )
                                        } catch (_: Exception) {
                                        }
                                        //homeViewModel.loaderValue.postValue(false)
                                    }
                                }
                            } catch (_: Exception) {
                            }
                        }

                    }

                    val displayMetrics = DisplayMetrics()
                    requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)


                    reorderAdapter =
                        ReorderAdapter(
                            // AllCustomersOrdersResponseModel.ResponseData(emptyList(), 0, 0),
                            AllCustomersOrdersResponseModel.ResponseData(arrayListOf(), 0, 0),
                            reOrderCallback,
                            displayMetrics.widthPixels - 16.toPx,
                            homeViewModel
                        )
                    reorderAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(reorderAdapter as ReorderAdapter)
                }

                //OTC_Category
                HomeSectionConstants.OTC_CATEGORY -> {
                    //here we are calling category list
                    homeOtcCategoryAdapter =
                        HomeOtcCategoryAdapter(
                            homeViewModel.superCategoryList.value!!,
                            homeViewModel,
                            viewLifecycleOwner
                        )
                    otcPosition = i

                    homeOtcCategoryAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(homeOtcCategoryAdapter as HomeOtcCategoryAdapter)
                }

                //YourMedicine(PatientMedicine)
                HomeSectionConstants.PATIENTANDMEDICINELIST -> {
                    //here we are calling patient list and medicine list api and setting data and setting observer
                    var responseApi = PatientAndMedicineListModel(
                        id = 11,
                        type = HomeSectionConstants.PATIENTANDMEDICINELIST,
                        patientMedicinesListModel = homeViewModel.responsePatientMedicinesList
                    )
                    patientListMedicinesListCardStackedAdapter =
                        PatientListMedicinesListAdapter(
                            responseApi,
                            homeViewModel,
                            activity?.supportFragmentManager
                        )
                    patientListMedicinesListCardStackedAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(patientListMedicinesListCardStackedAdapter as PatientListMedicinesListAdapter)
                }

                //subs
                HomeSectionConstants.SUBS -> {
                    //setupsubstituteInfo
                    substituteInfoCardAdapter = SubstituteInfoCardAdapter(
                        homeDataModel.substituteInfoCardDataModel?.substituteInfoCardModel,
                        homeViewModel
                    )
                    substituteInfoCardAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(substituteInfoCardAdapter as SubstituteInfoCardAdapter)
                }

                //Trending in city
                HomeSectionConstants.DEFAULT_PRODUCT_CARD -> {
                    //setting Trending in your city list adapter
                    var trendinginyourCityApi = ProductCardDataModel(
                        id = 7,
                        type = HomeSectionConstants.DEFAULT_PRODUCT_CARD,
                        homeViewModel.trendingInCityResponse, null, null
                    )
                    homeViewModel.crossSellingClick = CrossSellingClick.TRENDING_IN_YOUR_CITY
                    productCardAdapter = ProductCardAdapter(
                        trendinginyourCityApi,
                        homeViewModel, activity?.supportFragmentManager,
                        homeViewModel.crossSellingClick
                    )
                    trendingConcatPosition = i
                    productCardAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(productCardAdapter as ProductCardAdapter)
                }

                //call to order
                HomeSectionConstants.CALL_TO_ORDER -> {
                    //setupCallOrderACtionAdapter
                    callOrderActionCardAdapter = ActionCardAdapter(
                        homeDataModel.actionCardCallAndOrderModel,
                        homeViewModel
                    )
                    callOrderActionCardAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(callOrderActionCardAdapter as ActionCardAdapter)
                }

                //prescription
                HomeSectionConstants.PRESCRIPTION -> {
                    //setupCallOrderACtionAdapter
                    callOrderActionCardAdapter = ActionCardAdapter(
                        homeDataModel.actionCardModel,
                        homeViewModel
                    )
                    callOrderActionCardAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(callOrderActionCardAdapter as ActionCardAdapter)
                }

                //limited period offer
                HomeSectionConstants.STACKED_PRODUCT_CARD -> {
                    /* new arrivals list Data setting **/
                    var prdoductListApi = ProductCardDataModel(
                        id = 8,
                        type = HomeSectionConstants.STACKED_PRODUCT_CARD,
                        null,
                        homeViewModel.limitedTimeOfferResponse,
                        homeViewModel.newArrivalResponse
                    )

                    homeViewModel.crossSellingClick = CrossSellingClick.TRENDING_IN_YOUR_CITY

                    //setting new arrivals list adapter
                    productCardStackedAdapter =
                        ProductCardStackedAdapter(
                            prdoductListApi,
                            homeViewModel,
                            activity?.supportFragmentManager,
                            homeViewModel.crossSellingClick
                        )
                    stackedConcatPosition = i
                    productCardStackedAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(productCardStackedAdapter as ProductCardStackedAdapter)
                }

                // Health article
                HomeSectionConstants.BLOG_SECTION_CARD -> {
                    //setup blogcard data
                    var blogDataResponse = BlogSectionDataModel(
                        id = 9,
                        type = HomeSectionConstants.BLOG_SECTION_CARD,
                        blogModel = homeViewModel.blogDataModel
                    )
                    blogSectionAdapter = homeViewModel.healthArticleShimmerState.value?.let {
                        BlogSectionDataAdapter(blogDataResponse, homeViewModel, it, this)
                    }
                    blogSectionAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(blogSectionAdapter as BlogSectionDataAdapter)
                    healthArticlePosition = i
                }

                //testimonial
                HomeSectionConstants.TESTIMONIAL_SECTION_CARD -> {
                    //setuptestimonialSectionAdapter
                    testimonialSectionAdapter =
                        TestimonialSectionDataAdapter(homeDataModel.testimonialSectionModel)
                    testimonialSectionAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(testimonialSectionAdapter as TestimonialSectionDataAdapter)
                }

                //footer
                HomeSectionConstants.FOOTER_SECTION -> {
                    //setupfooterAdapter
                    footerAdapter = FooterDataAdapter(homeViewModel)
                    footerAdapter?.setHasStableIds(true)
                    mainAdapter?.addAdapter(footerAdapter as FooterDataAdapter)
                }

                /*data.actionCardModel?.type -> {
                    //setupActionCardAdapter
                    actionCardAdapter =
                        ActionCardAdapter(homeDataModel.actionCardModel, homeViewModel)
                    mainAdapter?.addAdapter(actionCardAdapter as ActionCardAdapter)
                }*/
            }
        }


    }

    /*    private fun openHomePageBottomSheets() {
            */
    /**
     * code to open apply coupon bottom sheet
     *//*
        applyCouponBottomSheet?.isCancelable = true
        applyCouponBottomSheet?.openBottomSheet(false, 35, 6)
        if (applyCouponBottomSheet?.isVisible == false)
            applyCouponBottomSheet?.show(
                requireActivity().supportFragmentManager, "ApplyCouponBottomSheet"
            )
    }*/

    private fun createDataForHomePage(): HomeDataModel {
        /** Banner list adapter **/
        homeDataModel.bannerModel =
            BannerDataModel(type = HomeSectionConstants.BANNER)


        /** Action Card Data as model **/
        homeDataModel.actionCardModel =
            ActionCardDataModel(
                type = HomeSectionConstants.PRESCRIPTION,
                actionCardModel = ActionCardModel(
                    title = "Have a Prescription?",
                    description = "Upload a prescription and we will deliver your medicines",
                    imgUrl = "",
                    buttonText = "Upload", cardType = 0
                )
            )

        /** Substitute Info Card Data **/
        homeDataModel.substituteInfoCardDataModel =
            SubstituteInfoCardDataModel(
                substituteInfoCardModel = SubstituteInfoCardModel(
                    "Substitutes",
                    " are the smarter choice",
                    "",
                    "Learn More",
                    "View example",
                    "to compare and understand"
                )
            )

        /** Product Card Section **/
        //homeDataModel.productCardModel = homeViewModel.getProductCards()

        /** Action Card Data **/
        homeDataModel.actionCardCallAndOrderModel =
            ActionCardDataModel(type = HomeSectionConstants.CALL_TO_ORDER)

        /** Product Card Stacked Data **/
        //homeDataModel.productCardStackedModel = homeViewModel.getStackedProductCards()

        /** Blog list data **/
        //homeDataModel.blogSectionModel = homeViewModel.getBlogData()

        /** Testimonial Adapter **/
        homeDataModel.testimonialSectionModel = homeViewModel.getTestimonials()

        /** Home screen footer UI **/
        homeDataModel.footerModel = FooterDataModel(type = HomeSectionConstants.FOOTER_SECTION)

        return homeDataModel
    }

    private fun setDataObserver() {
        homeViewModel.bannerList.observe(viewLifecycleOwner) {
            if (it.isNullOrEmpty()) {
                mainAdapter?.removeAdapter(bannerAdapter!!)
            } else {
                bannerAdapter?.setDataAndNotify(
                    homeViewModel.bannerList.value?.mapToBannerList() ?: arrayListOf()
                )
                homeViewModel.addBannerImpression(homeViewModel.bannerList.value!!, 0)
            }
        }

        homeViewModel.alertUrl.observe(viewLifecycleOwner) {
            if (it != null) {
                Log.d("TAG", "setDataObserver: alertUrl $it")
                if (it.isEmpty() == true) {
                    alertAdapter?.let { mainAdapter?.removeAdapter(alertAdapter!!) }
                } else {
                    alertAdapter?.setImageUrl(it)
                }
            }
        }

        homeViewModel.homeGenericList.observe(viewLifecycleOwner) {
            if (it.isNotEmpty() && it[0].image?.isNotEmpty() == true) {
                val substituteInfoCardModel = SubstituteInfoCardDataModel(
                    substituteInfoCardModel = SubstituteInfoCardModel(
                        "Substitutes",
                        " are the smarter choice",
                        it[0].image,
                        "Learn More",
                        "View example",
                        "for better understanding"
                    )
                )
                substituteInfoCardAdapter?.setData(substituteInfoCardModel.substituteInfoCardModel!!)
            }
        }

        homeViewModel.fetchAllOrdersOfCustomers.observe(viewLifecycleOwner) {
            if (homeViewModel.setReorderData.value!!) {
                it?.responseData?.ordersList?.mapToReorderModelList()
                    ?.let { it1 ->
                        reorderAdapter?.setData(it1)
                    }
                it?.responseData?.ordersList?.let { orderList ->

                    homeViewModel.fetchAllOrdersOfCustomerList.addAll(orderList)
                }
            } else if (!homeViewModel.setReorderData.value!!) {
                reorderAdapter?.let { mainAdapter?.removeAdapter(reorderAdapter!!) }
            }
        }

        //observe medicine patient list
        homeViewModel.showMessageFragment.observe(viewLifecycleOwner) {

            if (it.type.equals(MESSAGES.DISMISS_LOCATION_BOTTOM_SHEET)) {
                if (locationBottomSheet?.isVisible == true) {
                    locationBottomSheet?.dismiss()
                    isLocationBottomSheetOpened = false
                }
            }

            binding.tmSearchBar.setPlaceHolderText("Search for medicines")
            binding.tmSearchBar.setSearchEnable(false)
            binding.tmSearchBar.setStartIconAsSearch(true)
        }

        //observe categories
        homeViewModel.showMessageCatrgoryList.observe(viewLifecycleOwner) {
            /** OTC Categories **/
            if (it.type == (MESSAGES.HOME_PAGE_OTC_RESPONSE)) {
                /*if (otcCategoryAdapter == null) {
                    otcCategoryAdapter =
                        OtcCategoryAdapter(
                            homeViewModel.superCategoryList.value!!,
                            homeViewModel,
                            viewLifecycleOwner
                        )
                    mainAdapter?.addAdapter(otcCategoryAdapter as OtcCategoryAdapter)
                }*/
                if (homeViewModel.superCategoryList.value!!.isNotEmpty()) {
                    homeOtcCategoryAdapter?.setData(homeViewModel.superCategoryList.value!!)
//                    homeViewModel.selectedCategory = 0
//                    homeViewModel.sendCategoryAndSuperCategoryData()
                } else mainAdapter?.removeAdapter(homeOtcCategoryAdapter!!)
            } else if (it.type == MESSAGES.HOME_PAGE_OTC_RESPONSE_FAILED) {
                mainAdapter?.removeAdapter(homeOtcCategoryAdapter!!)
            }
        }

        //observe HealthArticleList
        homeViewModel.showMessageBlogListFragment.observe(viewLifecycleOwner) {
            if (it.type.equals(MESSAGES.BLOG_LIST_RESPONSE)) {
                /* Blog Card Data setting **/
                var blogDataResponse = BlogSectionDataModel(
                    id = 9,
                    type = HomeSectionConstants.BLOG_SECTION_CARD,
                    blogModel = homeViewModel.blogDataModel
                )
                blogSectionAdapter?.setDataAndNotify(blogDataResponse)

            } else if (it.type.equals(MESSAGES.BLOG_LIST_RESPONSE_FAILED)) {
                mainAdapter?.removeAdapter(blogSectionAdapter!!)
            } else if (it.type.equals(MESSAGES.REDIRECT_TO_HEALTH_ARTICLE)) {
                navigateToHealthArticlesActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage"
                    )
                )
                homeViewModel.eventArticleSectionViewedEvent("homepage")
            } else if (it.type.equals(MESSAGES.REDIRECT_TO_HEALTH_DETAIL_ARTICLE)) {
                navigateToHealthArticleDetailActivity(
                    params = bundleOf(
                        "slug" to homeViewModel.healthArticleData.value?.slug,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        "categoryChipList" to homeViewModel.healthArticleData.value?.chipList?.mapToHealthArticle()
                    )
                )
            }
        }

        homeViewModel.showMessageTrendingInYourCity.observe(viewLifecycleOwner) {
            if (it.type == MESSAGES.TRENDING_IN_YOUR_CITY_LIST_RESPONSE) {
                val responseApi = ProductCardDataModel(
                    id = 7,
                    type = HomeSectionConstants.DEFAULT_PRODUCT_CARD,
                    homeViewModel.trendingInCityResponse, null, null
                )
                productCardAdapter?.setDataAndNotify(responseApi, false)

            } else if (it.type == MESSAGES.TRENDING_IN_YOUR_CITY_LIST_RESPONSE_FAILED) {
                if (productCardAdapter != null)
                    mainAdapter?.removeAdapter(productCardAdapter!!)
            }
        }

        homeViewModel.showMessageNewArrivalList.observe(viewLifecycleOwner) {
            if ((it.type == MESSAGES.NEW_ARRIVALS_LIST_RESPONSE) || (it.type == MESSAGES.LIMITED_OFFER_LIST_RESPONSE)) {
                val responseApi = ProductCardDataModel(
                    id = 8,
                    type = HomeSectionConstants.STACKED_PRODUCT_CARD,
                    //  null, homeViewModel.limitedTimeOfferResponse, homeViewModel.newArrivalResponse
                    null, homeViewModel.limitedTimeOfferResponse, homeViewModel.newArrivalResponse
                )
                homeViewModel.crossSellingClick = CrossSellingClick.LIMITED_OFFER
                productCardStackedAdapter?.setDataAndNotify(
                    responseApi,
                    false,
                    homeViewModel.crossSellingClick,
                    homeViewModel.stackedListCurrentPageCount
                )

            } else if (it.type == MESSAGES.LIMITED_OFFER_NEW_ARRIVAL_LIST_RESPONSE_FAILED) {
                //productCardStackedAdapter?.setDataAndNotify(null, true)
                if (productCardStackedAdapter != null)
                    mainAdapter?.removeAdapter(productCardStackedAdapter!!)
            }
        }

        homeViewModel.showMessageYourMedicine.observe(viewLifecycleOwner) {
            if (it.type == MESSAGES.PATIENT_LIST_MEDICINE_LIST_RESPONSE) {
                if ((!homeViewModel.responsePatientMedicinesList?.responseData?.productList.isNullOrEmpty())
                    || (patientListMedicinesListCardStackedAdapter != null)
                ) {
                    val responseApi = PatientAndMedicineListModel(
                        id = 11,
                        type = HomeSectionConstants.PATIENTANDMEDICINELIST,
                        patientMedicinesListModel = homeViewModel.responsePatientMedicinesList
                    )
                    if ((homeViewModel.responsePatientMedicinesList?.responseData?.productList?.size
                            ?: 0) > 0
                    ) {
                        patientListMedicinesListCardStackedAdapter?.setData(responseApi)
                    } else if (patientListMedicinesListCardStackedAdapter != null) {
                        mainAdapter?.removeAdapter(patientListMedicinesListCardStackedAdapter!!)
                    }
                }
            } else if (it.type == MESSAGES.PATIENT_LIST_MEDICINE_LIST_RESPONSE_FAILED) {
                if (patientListMedicinesListCardStackedAdapter != null && homeViewModel.responsePatientMedicinesList?.responseData?.productList.isNullOrEmpty()
                    && homeViewModel.responsePatientMedicinesList?.responseData?.patientDetails.isNullOrEmpty()
                ) {
                    mainAdapter?.removeAdapter(patientListMedicinesListCardStackedAdapter!!)
                } else if (patientListMedicinesListCardStackedAdapter != null && (homeViewModel.responsePatientMedicinesList?.responseData?.productList.isNullOrEmpty()
                            || homeViewModel.responsePatientMedicinesList?.responseData?.productList?.size == 0)
                ) {

                } else {

                }

            }
        }


        homeViewModel.showMessageProductListFragment.observe(viewLifecycleOwner) {
            if (it.type.equals(MESSAGES.VIEW_ALL_TRENDING_CITY_CLICK)) {
              /*  val intent = Intent(requireActivity(), ProductListViewAllActivity::class.java)
                intent.putExtra("type", ApiParameterConstants.CONST_LIST_TRENDING)
                intent.putExtra("heading", "Popular items")
                intent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "trending_in_your_city")
                startActivity(intent)*/

                navigateToProductListViewAllActivity(
                    params = bundleOf(
                        "type" to ApiParameterConstants.CONST_LIST_TRENDING,
                        "heading" to "Popular items",
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "trending_in_your_city"
                    )
                )

                homeViewModel.sectionHeading = "trending_in_city"
                //resultLauncher?.launch(intent)
            } else if (it.type.equals(MESSAGES.VIEW_ALL_LIMITED_OFFER_CLICK)) {
                /*val intent = Intent(requireActivity(), ProductListViewAllActivity::class.java)
                intent.putExtra("type", ApiParameterConstants.CONST_LIST_LIMITED_TIME_OFFER)
                intent.putExtra("heading", "Deals you’ll love")
                intent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "limited_offer")
                startActivity(intent)*/

                navigateToProductListViewAllActivity(
                    params = bundleOf(
                        "type" to ApiParameterConstants.CONST_LIST_LIMITED_TIME_OFFER,
                        "heading" to "Deals you’ll love",
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "limited_offer"
                    )
                )
                homeViewModel.sectionHeading = "limited_offer"
                //resultLauncher?.launch(intent)
            } else if (it.type.equals(MESSAGES.VIEW_ALL_NEW_ARRIVAL_CLICK)) {
              /*  val intent = Intent(requireActivity(), ProductListViewAllActivity::class.java)
                intent.putExtra("type", ApiParameterConstants.CONST_LIST_NEW_ARRIVALS)
                intent.putExtra("heading", "New on Truemeds")
                intent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "new_arrivals")
                startActivity(intent)*/

                navigateToProductListViewAllActivity(
                    params = bundleOf(
                        "type" to ApiParameterConstants.CONST_LIST_NEW_ARRIVALS,
                        "heading" to "New on Truemeds",
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "new_arrivals"
                    )
                )
                homeViewModel.sectionHeading = "new_arrivals"
                //resultLauncher?.launch(intent)
            }
            else if (it.type.equals(MESSAGES.VIEW_ALL_YOUR_MEDICINES_CLICK)) {
                val gson = Gson()
                val jsonPatientList = gson.toJson(homeViewModel.yourMedicinePatientList)

               /* val intent = Intent(requireActivity(), ProductListViewAllActivity::class.java)
                intent.putExtra("type", ApiParameterConstants.CONST_LIST_YOUR_MEDICINE)
                intent.putExtra("heading", "My medicines")
                intent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "your_medicines")
                intent.putExtra(BundleConstants.BUNDLE_PATIENT_ID, homeViewModel.yourMedicinePatientId)
                intent.putExtra(BundleConstants.BUNDLE_YOUR_MEDICINES_PATIENT_LIST, jsonPatientList)
                intent.putExtra(BundleConstants.BUNDLE_YOUR_MEDICINES_SELECTED_POS, homeViewModel.yourMedicineSelectedPos)
                startActivity(intent)*/

                navigateToProductListViewAllActivity(
                    params = bundleOf(
                        "type" to ApiParameterConstants.CONST_LIST_YOUR_MEDICINE,
                        "heading" to "My medicines",
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "your_medicines",
                        BundleConstants.BUNDLE_PATIENT_ID to homeViewModel.yourMedicinePatientId,
                        BundleConstants.BUNDLE_YOUR_MEDICINES_PATIENT_LIST to jsonPatientList,
                        BundleConstants.BUNDLE_YOUR_MEDICINES_SELECTED_POS to homeViewModel.yourMedicineSelectedPos
                    )
                )

                homeViewModel.sectionHeading = "your_medicines"
                //resultLauncher?.launch(intent)
            }
        }

        homeViewModel.productCardStackedClick.observe(viewLifecycleOwner) {
            if (isSingleClick()) {
                ProductDetailActivity().setHomeCrossSellingListener(this)
               /* val intent = Intent(activity, ProductDetailActivity::class.java)
                    .putExtra(BundleConstants.PRODUCT_CODE, it.product.productCode ?: "")
                    .putExtra(BundleConstants.IS_SUBS, false)
                    .putExtra(BundleConstants.IS_FROM_CROSS_SELLING, true)
                    .putExtra(BundleConstants.IS_PRODUCT_DETAIL_BS, false)
                    .putExtra(BundleConstants.IS_HIDE_TOOLBAR, false)
                    .putExtra(BundleConstants.IS_HIDE_CART, false)
                    .putExtra(
                        BundleConstants.SEARCH_TYPE,
                        ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                    )
                    .putExtra(BundleConstants.BUNDLE_KEY_SECTION_HEADING, it.sectionHeading)
                    .putExtra(BundleConstants.BUNDLE_KEY_SECTION_INDEX, it.itemClickPosition)
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "homepage")
                    .putExtra(BundleConstants.BUNDLE_KEY_SECTION_ROW, 1)
                startActivity(intent)*/

                navigateToProductDetailActivity(
                    params = bundleOf(
                        BundleConstants.PRODUCT_CODE to it.product.productCode,
                        BundleConstants.IS_SUBS to false,
                        BundleConstants.IS_FROM_CROSS_SELLING to true,
                        BundleConstants.IS_PRODUCT_DETAIL_BS to false,
                        BundleConstants.IS_HIDE_TOOLBAR to false,
                        BundleConstants.IS_HIDE_CART to false,
                        BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                        BundleConstants.BUNDLE_KEY_SECTION_HEADING to it.sectionHeading,
                        BundleConstants.BUNDLE_KEY_SECTION_INDEX to it.itemClickPosition,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        BundleConstants.BUNDLE_KEY_SECTION_ROW to 1)
                )

            }
        }

        homeViewModel.showShimmerHome.observe(viewLifecycleOwner) {
            if (it) {
                binding.clShimmer.visibility = View.VISIBLE
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
                binding.clShimmer.visibility = View.GONE
                if (!checkPermissionsForContact(requireContext())
                    && !SharedPrefManager.getInstance().isContactSheetClosed
                    && ((homeViewModel.activeOrdersMutableLiveData.value?.size ?: 0) > 0)
                ) {
//                    showSaveContactBottomSheet()
                    homeViewModel.bottomSheetPriority.add(
                        HomePageBottomSheetInfo(
                            type = BottomSheetType.SAVE_CONTACT,
                            priority = 10
                        )
                    )
//                    homeViewModel.displayBottomSheet(BottomSheetType.SAVE_CONTACT)
                } else if (checkPermissionsForContact(requireActivity())) {
                    homeViewModel.fetchTruemedsContact()
                }
                if (SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty()) {
                    if (!homeViewModel.isLocationBsShown) {
//                        openLocationBottomSheet()
                        homeViewModel.displayBottomSheet(BottomSheetType.CHOOSE_LOCATION)
                        homeViewModel.isLocationBsShown = true
                    }
                }

            }
        }

        HomeViewModel.tmWallet.observe(viewLifecycleOwner) {
            if (HomeViewModel.tmWallet.value!!.toDouble() > 0.0) {
                binding.tmWalletHeaderChip.setHeaderChipText(
                    "\u20B9 ${it.toInt()}"
                )
            } else {
                binding.tmWalletHeaderChip.setHeaderChipText("")
            }
        }
        homeViewModel.cartItemCount.observe(viewLifecycleOwner) {
            if (it > 0)
                binding.tmCartHeaderChip.setCartCount(it)
            else {
                binding.tmCartHeaderChip.setCartCount(0)
                binding.tmCartHeaderChip.setPrescription(SharedPrefManager.getInstance().prescriptionCount)
            }
        }

        homeViewModel.productCardStackedDeleteData.observe(viewLifecycleOwner) { homeOtcDbAddDeleteModel ->
            if (homeOtcDbAddDeleteModel.item != null) {
                otcProductToDeleteFromDB = homeOtcDbAddDeleteModel.item
                productCodeToDelete = homeOtcDbAddDeleteModel.item!!.product.productCode
                productSectionType = homeOtcDbAddDeleteModel.type
            }

            posDeleteBSFromProductCardStacked = homeOtcDbAddDeleteModel.pos
            isFromLimitedOffer = homeOtcDbAddDeleteModel.isFromLimitedOffer ?: true
            showConfirmationDialog(
                productCodeToDelete, isSubs = false
            )

        }

        homeViewModel.reloadDataAfterDelete.observe(viewLifecycleOwner) {
            if (!it.isNullOrEmpty()) {
                homeViewModel.updateQtyForTrendingInCityResponse()
                homeViewModel.updateQtyForNewArrivalStackResponse()
                homeViewModel.updateQtyForYourMedicineResponse()
                /* if (it == ApiParameterConstants.CONST_LIST_TRENDING) {
                             homeViewModel.updateQtyForTrendingInCityResponse()
                         } else if (it == ApiParameterConstants.CONST_LIST_NEW_ARRIVALS) {
                             homeViewModel.updateQtyForNewArrivalStackResponse()
                         } else if (it == ApiParameterConstants.CONST_LIST_YOUR_MEDICINE) {
                             homeViewModel.updateQtyForYourMedicineResponse()
                         }*/
//            homeViewModel.reloadHomePageProducts()
            }
        }

        cartViewModel.isDelete.observe(viewLifecycleOwner, EventObserver {
            if (it) {
                if (homeViewModel.productCardStackedDeleteData.value?.item != null) {
                    homeViewModel.removeItemFromCart(
                        homeViewModel.productCardStackedDeleteData.value!!.item!!,
                        false
                    )
                }
            } else {
                if (editDeleteAddressBottomSheet != null && editDeleteAddressBottomSheet.isVisible) {
                    editDeleteAddressBottomSheet.dismiss()
                }
            }

            /*lifecycleScope.launch(IO) {
                if (it) {
                    if (SharedPrefManager.getInstance().incompleteOrderId > 0) {

                        val editList: List<MedicineDto> = homeViewModel.getEditOrderRequestData(
                            productCodeToDelete,
                            0
                        )
                        //Log.d("***"," productCode :" + productCode+ " : " + editList[0].toString())

                        if (!editList.isNullOrEmpty()) {
                            if (editList.get(0).productDetailsId == null || editList.get(0).productDetailsId == 0L) {
                                deleteProductFromDatabase()
                            } else {
                                homeViewModel.editMedicine(
                                    SharedPrefManager.getInstance().incompleteOrderId,
                                    editList,
                                    true,
                                    "CART"
                                )
                                deleteProductFromDatabase()
                            }
                        } else {
                            deleteProductFromDatabase()
                        }
                    } else {
                        deleteProductFromDatabase()
                    }
                } else {
                    if (editDeleteAddressBottomSheet.isVisible) {
                        editDeleteAddressBottomSheet.dismiss()
                    }
                }
            }*/

        })


        homeViewModel.referralData.observe(viewLifecycleOwner) { referralData ->
            var dialog: PopUpDialog? = null
            dialog?.setCancelable(false)
            val rewardSuccess = PopUpModel(
                icon = R.drawable.ic_reward,
                header = getString(R.string.you_have_been_rewarded),
                message = "You got ₹${referralData?.referralData?.referralAmount} for your referral.",
                buttonText = getString(R.string.check_rewards),
            )
            val callback = object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                   // startActivity(Intent(context, ReferAndEarnActivity::class.java))

                    navigateToReferAndEarnActivity()

                    dialog?.dismiss()
                }

                override fun onCloseButtonClicked() {
                    dialog?.dismiss()
                }
            }
            dialog = PopUpDialog(model = rewardSuccess, callback = callback)
            if (!dialog.isVisible && homeViewModel.activeMenu.value == R.id.homeFragment)
                activity?.supportFragmentManager?.let {
                    homeViewModel.getReferralStatus(
                        SharedPrefManager.getInstance().loggedInUserId.toString(),
                        true
                    )
                    dialog.show(it, "RewardSuccess")
                }
        }


    }

    private fun getIsChildVisibleInConcatAdapter(position: Int, layoutManager: LinearLayoutManager): Boolean {
        val firstVisiblePosition = layoutManager.findFirstVisibleItemPosition()
        val lastVisiblePosition = layoutManager.findLastVisibleItemPosition() + 1
        return position in firstVisiblePosition..lastVisiblePosition
    }

    fun showRatingSubmittedPopup() {
        var dialog: RatingSubmittedPopUpDialog? = null
        dialog?.setCancelable(false)

        val callback = object : RatingSubmittedDialogCallback {
            override fun onCloseButtonClicked() {
                dialog?.dismiss()
            }
        }
        dialog = RatingSubmittedPopUpDialog(callback = callback)
        if (!dialog.isVisible && homeViewModel.activeMenu.value == R.id.homeFragment)
            activity?.supportFragmentManager?.let {

                dialog.show(it, "RewardSuccess")
            }
    }

    private fun showRatingsBottomSheet() {
        val ratingBottomSheetCallback = object : FeedbackCallback {
            override fun onFeedbackSubmitted(
                ratings: Float,
                feedbackCategory: String?,
                userInput: String?,
                ratingName: String?,
                ratingReasonHeader: String?,
                ratingReasonsList: List<SaveRatingDetailsRequestDataModel.RatingReasonDataModel?>?
            ) {

                Log.e(
                    "feedback_data::",
                    "2222::" + ratings.toString() + "::" + feedbackCategory + ":::" + userInput
                )
                //    showRatingSubmittedPopup()

                var requestData = SaveRatingDetailsRequestDataModel(
                    ratings.toInt(),
                    ratingName,
                    ratingReasonHeader,
                    userInput,
                    ratingReasonsList
                )
                homeViewModel.performSubmitRating(requestData)

            }


        }

        ratingBottomSheet = RatingsBottomSheet(
            homeViewModel.ratingBottomSheetId,
            ratingBottomSheetCallback,
            homeViewModel.ratingDetailsList
        )
        ratingBottomSheet?.isCancelable = true

        ratingBottomSheet?.show(
            activity?.supportFragmentManager!!,
            "RatingBottomSheet"
        )


    }


    private fun showSaveContactBottomSheet() {
        saveNumberBottomSheet = SaveNumberBottomSheet(homeViewModel)
        saveNumberBottomSheet?.isCancelable = true
        if (homeViewModel.showSaveContactBottomSheet.value == false) {
            saveNumberBottomSheet?.show(
                activity?.supportFragmentManager!!,
                "SaveContactBottomSheet"
            )
            homeViewModel.showSaveContactBottomSheet.value = true
        }
        //code commented for now
        try {
            homeViewModel.sendContactBottomSheetViewed()
        } catch (ex: java.lang.Exception) {
            ex.printStackTrace()
        }
    }


    private fun setupApplyCouponData(): ApplyCouponBottomSheetModel {
        return ApplyCouponBottomSheetModel(
            "First 25",
            "Get flat 25% off on first order",
            "Valid for your first order only \n Minimum order value ₹999 \n " +
                    " Minimum order value ₹999 ",
            "Apply Coupon",
            "Ends in 20m:05s",
            false,
            "",
            "",
            "",
            "",
            null
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mainAdapter = null
        bannerAdapter = null
        reorderAdapter = null
        actionCardAdapter = null
        substituteInfoCardAdapter = null
        productCardAdapter = null
        callOrderActionCardAdapter = null
        productCardStackedAdapter = null
        blogSectionAdapter = null
        testimonialSectionAdapter = null
        footerAdapter = null
        homeOtcCategoryAdapter = null
        isLocationBottomSheetOpened = false
    }

    private fun observeBottomSheet() {
        val doctorFraudCallback = object : DoctorFraudCallback {
            override fun onPositiveActionClicked() {
                homeViewModel.savePopUpReasonsActiveOrders(
                    "Yes",
                    SharedPrefManager.getInstance().incompleteOrderId
                )
            }

            override fun onNegativeActionClicked() {
                homeViewModel.savePopUpReasonsActiveOrders(
                    "No",
                    SharedPrefManager.getInstance().incompleteOrderId
                )
            }

            override fun onClosedActionClicked() {
                homeViewModel.savePopUpReasonsActiveOrders(
                    "Closed",
                    SharedPrefManager.getInstance().incompleteOrderId
                )
            }
        }

        val paymentPendingCallback = object : PaymentPendingCallback {
            override fun onPositiveActionClicked(model: BottomSheetDefaultModel?) {
                //below code added bcoz the user need to be redirected to OrderStatusActivity on Pay now button click
                navigateToOrderStatusActivity(
                    params = bundleOf(
                        BundleConstants.ORDER_ID to model?.orderId,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "order status"
                    )
                )
            }

            override fun onClosedActionClicked() {
                if (paymentPendingBottomSheet != null && paymentPendingBottomSheet?.isVisible == true) {
                    paymentPendingBottomSheet?.dismiss()
                }
            }

            override fun onChangedActionClicked(model: BottomSheetDefaultModel?) {
                try {
                    val arrayPrdNames: Array<String>? = null
                    val arrayPrdCodes: Array<String>? = null
                    if (orderDetails.productNameList.isNotEmpty()) {
                        orderDetails.productNameList.forEachIndexed { index, productName ->
                            arrayPrdNames?.set(index, productName.skuName)
                        }
                    }

                    if (orderDetails.mxEvents.productCodes!!.isNotEmpty()) {
                        orderDetails.mxEvents.productCodes!!.forEachIndexed { index, productCode ->
                            arrayPrdCodes?.set(index, productCode)
                        }
                    }
                    val intent =
                        Intent(requireActivity(), PaymentOptionActivity::class.java).apply {
                            putExtra(
                                BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD,
                                paymentSelectionInfo.paymentMethod
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID,
                                paymentSelectionInfo.paymentMethodId!!.toLong()
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,
                                BundleConstants.HOMEPAGE
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_PATIENT_ID,
                                orderDetails.mxEvents.patientId?.toInt()
                            )
                            putExtra(BundleConstants.BUNDLE_KEY_INCLUDE_COD, false)
                            putExtra(
                                BundleConstants.BUNDLE_KEY_BILL_DETAILS,
                                Gson().toJson(billDetailsModel)
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_ORDER_ID,
                                orderDetails.orderId.toString()
                            )
                            putExtra(BundleConstants.BUNDLE_KEY_PAYABLE_AMOUNT_TEXT, true)
                            putExtra(
                                BundleConstants.BUNDLE_KEY_COUPON_APPLIED_NAME,
                                billDetailsModel.couponName
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_IS_PAYMENT_SPECIFIC_COUPON,
                                paymentSelectionInfo.paymentSpecificCouponApplied
                            )
                            putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "payment_popup")
                            putExtra(
                                BundleConstants.BUNDLE_KEY_NO_OF_ITEMS,
                                orderDetails.productNameList.size
                            )
                            putExtra(BundleConstants.BUNDLE_KEY_ITEM_NAMES, arrayPrdNames)
                            putExtra(
                                BundleConstants.BUNDLE_KEY_CURRENT_ORDER_STATUS,
                                orderDetails.statuses[0].statusName
                            )
                            //TODO("data is pending from API")
                            putExtra(
                                BundleConstants.BUNDLE_KEY_IS_REORDER,
                                orderDetails.mxEvents.reorder
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_PATIENT_TYPE,
                                orderDetails.mxEvents.patientType
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_PATIENT_AGE,
                                orderDetails.mxEvents.patientAge
                            )
                            putExtra(BundleConstants.BUNDLE_KEY_PATIENT_GENDER, "")
                            putExtra(
                                BundleConstants.BUNDLE_KEY_SHIPPING_CITY,
                                orderDetails.mxEvents.shippingCity
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_SHIPPING_STATE,
                                orderDetails.mxEvents.shippingState
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_SHIPPING_PINCODE,
                                orderDetails.mxEvents.shippingPincode?.toInt()
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_ADDRESS_TYPE,
                                orderDetails.mxEvents.addressType
                            )
                            putExtra(BundleConstants.BUNDLE_KEY_PRODUCT_IDS, arrayPrdCodes)
                            putExtra(
                                BundleConstants.BUNDLE_KEY_RX_REQUIRED,
                                orderDetails.mxEvents.rxRequired
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_CURRENT_ORDER_STATUS_ID,
                                orderDetails.mxEvents.statusId?.toInt()
                            )
                            putExtra(
                                BundleConstants.BUNDLE_KEY_SELLING_PRICE,
                                homeViewModel.sellingPrice
                            )
                        }
                    startActivity(intent)
                } catch (_: Exception) {
                }
            }
        }
        val callMeBackCallback = object : PopUpDialogCallback {
            override fun onActionButtonClicked() {
                homeViewModel.getActiveOrderCallMeBack()
            }

            override fun onCloseButtonClicked() {
            }

        }

        homeViewModel.eventCloseReorderBottomSheet.observe(viewLifecycleOwner, EventObserver {
            if (reorderBottomSheet != null && reorderBottomSheet!!.isVisible) {
                reorderBottomSheet!!.dismiss()
            }
        })

        homeViewModel.bottomSheetTrigger?.observe(viewLifecycleOwner) {

            if (homeViewModel.isAllBottomSheetCollected.value == true) {
                when (it.type) {
                    BottomSheetType.EMPTY -> {}
                    BottomSheetType.REORDER -> {
                        if (isSingleClick()) {
                            reorderBottomSheet =
                                it.reOrder?.let { sheet ->
                                    ReorderBottomSheet(
                                        sheet,
                                        homeViewModel
                                    )
                                }
                            reorderBottomSheet?.isCancelable = true
                            reorderBottomSheet?.openBottomSheet(true, 90, 3)
                            if (reorderBottomSheet?.isVisible == false) {

                                reorderBottomSheet?.show(
                                    requireActivity().supportFragmentManager,
                                    "REORDER"
                                )
                            }
                        }
                    }

                    BottomSheetType.COMPARE_AND_UNDERSTAND -> {
                        val bottomSheet = it.compareAndUnderstand?.let { sheet ->
                            CompareAndUnderstandSubstituteBottomSheet(sheet)
                        }
                        bottomSheet?.isCancelable = true
                        if (bottomSheet?.isVisible == false) bottomSheet.show(
                            requireActivity().supportFragmentManager,
                            "COMPARE_AND_UNDERSTAND"
                        )
                    }

                    BottomSheetType.TERMS_AND_CONDITION -> {
                        if (!homeViewModel.isTnc_Bottomsheet_Visible) {
                            homeViewModel.isTnc_Bottomsheet_Visible = true
                            val bottomSheet =
                                it.termsAndCondition?.let { sheet -> PrivacyPolicyBottomSheet(sheet) }
                            bottomSheet?.isCancelable = false
                            bottomSheet?.openBottomSheet(false, 90, 3)
                            if (bottomSheet?.isVisible == false) bottomSheet.show(
                                requireActivity().supportFragmentManager,
                                "Terms And Conditions"
                            )
                        }
                    }

                    BottomSheetType.PAYMENT_PENDING -> {
                        paymentResponse?.let { payment ->
                            showPendingPaymentDialog(
                                payment,
                                paymentPendingCallback
                            )
                        }
                    }

                    BottomSheetType.PRIVACY_POLICY -> {
                        if (!homeViewModel.isPP_Bottomsheet_Visible) {
                            Log.d("homeFragment", "observeBottomSheet: PRIVACY_POLICY")
                            homeViewModel.isPP_Bottomsheet_Visible = true
                            val bottomSheet =
                                it.privacyPolicy?.let { sheet -> PrivacyPolicyBottomSheet(sheet) }
                            bottomSheet?.isCancelable = false
                            bottomSheet?.openBottomSheet(false, 90, 3)
                            if (bottomSheet?.isVisible == false && !bottomSheet.isAdded) bottomSheet.show(
                                requireActivity().supportFragmentManager,
                                "PRIVACY_POLICY"
                            )
                        }
                    }

                    BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW -> {
                        if (!homeViewModel.isDrCallMissedBsShown) {
                            it.doctorCallMissed?.time =
                                homeViewModel.activeAllOrdersMutableLiveData.value?.responseData?.ordersList?.get(
                                    0
                                )?.drCallbackValidMillis.toString()
                            val bottomSheet = it.doctorCallMissed?.let { sheet ->
                                DoctorCallMissedBottomSheet(
                                    sheet,
                                    callMeBackCallback,
                                    ftcViewModel
                                )
                            }
                            bottomSheet?.isCancelable = true
                            if (bottomSheet?.isVisible == false) bottomSheet.show(
                                requireActivity().supportFragmentManager,
                                "DOCTOR_CALL_MISSED_CALL_NOW"
                            )
                            homeViewModel.isDrCallMissedBsShown = true
                        }
                    }

                    BottomSheetType.DOCTOR_WILL_CALL -> {
                        Log.d("TAG", "observeBottomSheet: ${it.doctorCallMissed}")
                        var headerMsg = homeViewModel.doctorCallMsgBottomSheet

                        //if (abs(homeViewModel.activeAllOrdersMutableLiveData.value?.responseData?.ordersList?.get(0)?.drCallbackValidMillis!!) > 0)
                        /*   if (homeViewModel.isDoctorCallScheduleToday)
                               headerMsg =
                                   getString(R.string.our_doctor_will_call_you_within_20_mins_to_confirm_the_order) else headerMsg =
                               getString(R.string.our_doctor_will_call_you_on_priority_tomorrow_morning)*/

                        it.doctorCall?.header = headerMsg
                        val bottomSheet =
                            it.doctorCall?.let { sheet -> DoctorCallBottomSheet(sheet) }
                        bottomSheet?.isCancelable = true
                        if (bottomSheet?.isVisible == false) {
                            bottomSheet.show(
                                requireActivity().supportFragmentManager,
                                "DOCTOR_WILL_CALL"
                            )
                            homeViewModel.sendDoctorConfirmationCardViewedEvent()

                        }
                        homeViewModel.isAllBottomSheetCollected.postValue(false)
                        // homeViewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.DOCTOR_WILL_CALL,headerMsg)
                    }

                    BottomSheetType.DOCTOR_CALL_MISSED_CALL_BACK -> {
                        if (!homeViewModel.isDrCallMissedBsShown) {
                            val bottomSheet = it.doctorCallMissed?.let { sheet ->
                                DoctorCallMissedBottomSheet(
                                    sheet,
                                    callMeBackCallback,
                                    ftcViewModel
                                )
                            }
                            bottomSheet?.isCancelable = true
                            if (bottomSheet?.isVisible == false) bottomSheet.show(
                                requireActivity().supportFragmentManager,
                                "DOCTOR_CALL_MISSED_CALL_BACK"
                            )
                            homeViewModel.isDrCallMissedBsShown = true
                        }
                    }

                    /*BottomSheetType.DOCTOR_FRAUD -> {
                        val bottomSheet = it.doctorFraud?.let { sheet ->
                            DoctorFraudBottomSheet(
                                doctorFraudCallback,
                                sheet
                            )
                        }
                        bottomSheet?.isCancelable = true
                        if (bottomSheet?.isVisible == false) bottomSheet.show(
                            requireActivity().supportFragmentManager,
                            "DOCTOR_FRAUD"
                        )
                    }*/

                    BottomSheetType.SORRY_FOR_INCONVENIENCE -> {
                        val bottomSheet = it.error?.let { sheet -> ErrorBottomSheet(sheet) }
                        bottomSheet?.isCancelable = true
                        if (bottomSheet?.isVisible == false) bottomSheet.show(
                            requireActivity().supportFragmentManager,
                            "SORRY_FOR_INCONVENIENCE"
                        )
                    }

                    BottomSheetType.CHOOSE_LOCATION -> {
                        if (homeViewModel.activeMenu.value == R.id.homeFragment) {
                            openLocationBottomSheet()
                        } else if (SharedPrefManager.getInstance().selectedWarehouseID.isNullOrEmpty()) {
                            homeViewModel.isBottomSheetSkippedDueToHomeSwitch = true
                            homeViewModel.bottomSheetPriority.add(
                                HomePageBottomSheetInfo(
                                    type = BottomSheetType.CHOOSE_LOCATION,
                                    priority = 3
                                )
                            )
                        }
                    }

                    BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER -> {
                        if (!homeViewModel.isDrCallMissedBsShown) {
                            val bottomSheet = it.doctorCallMissed?.let { sheet ->
                                DoctorCallMissedBottomSheet(
                                    sheet,
                                    callMeBackCallback,
                                    ftcViewModel
                                )
                            }
                            bottomSheet?.isCancelable = true
                            if (bottomSheet?.isVisible == false) bottomSheet.show(
                                requireActivity().supportFragmentManager,
                                "DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER"
                            )

                            homeViewModel.isDrCallMissedBsShown = true
                        }
                    }

                    BottomSheetType.RATING -> {
                        if (!homeViewModel.ratingBottomSheetId.isNullOrEmpty()) {
                            if (SharedPrefManager.getInstance().ratingOrderIdSkipFlag != homeViewModel.ratingBottomSheetId.toLong()) {
                                showRatingsBottomSheet()
                            }
                        }
                    }

                    BottomSheetType.SAVE_CONTACT -> {
                        if (homeViewModel.activeMenu.value == R.id.homeFragment) {
                            showSaveContactBottomSheet()
                        } else if (!homeViewModel.isPaymentPendingToShow) {
                            homeViewModel.isBottomSheetSkippedDueToHomeSwitch = true
                            homeViewModel.bottomSheetPriority.add(
                                HomePageBottomSheetInfo(
                                    type = BottomSheetType.SAVE_CONTACT,
                                    priority = 10
                                )
                            )
                        }
                    }
                }
            }
        }
        homeViewModel.isAllBottomSheetCollected.observe(viewLifecycleOwner) { isReadyToGo ->
            if (homeViewModel.activeMenu.value == R.id.homeFragment) {
                val sorted = homeViewModel.bottomSheetPriority.sortedBy { by -> by.priority }
                if (isReadyToGo && !homeViewModel.bottomSheetPriority.isNullOrEmpty()) {
                    homeViewModel.bottomSheetTrigger?.postValue(sorted.first())
                    homeViewModel.bottomSheetPriority.minByOrNull { by -> by.priority }?.isBottomSheetDisplayed =
                        true
                    homeViewModel.isBottomSheetSkippedDueToHomeSwitch = false
                }
            } else {
                homeViewModel.isBottomSheetSkippedDueToHomeSwitch = true
            }
        }
        homeViewModel.substituteViewExampleClick.observe(viewLifecycleOwner) {
            if (it && homeViewModel.activeMenu.value == R.id.homeFragment && isSingleClick()) {
                homeViewModel.prepareBottomSheet(BottomSheetType.COMPARE_AND_UNDERSTAND).compareAndUnderstand?.let { bsData ->
                    val bottomSheetFragment = CompareAndUnderstandSubstituteBottomSheet(bsData)
                    firebaseEventUseCase.logFirebaseEvent(
                        FirebaseEvent.FIREBASE_HOMEPAGE_EXAMPLE,
                        "Home"
                    )
                    bottomSheetFragment.show(
                        activity?.supportFragmentManager!!,
                        bottomSheetFragment.tag
                    )
                }
            }
        }
        homeViewModel.substituteCardImageClick.observe(viewLifecycleOwner) {
            if (it) {
                if (Objects.requireNonNull(homeViewModel.homeGenericList.value)
                        ?.isNotEmpty() == true
                ) {
                    navigateToVideoFaqActivity(
                        params = bundleOf(
                            "video_url" to homeViewModel.homeGenericList.value?.get(0)?.image,
                            "source" to "home_page"
                        ),
                    )

                }
//                startActivity(Intent(requireActivity(), VideoFaqActivity::class.java))
                homeViewModel.substituteCardImageClick.postValue(false)
            }
        }

        homeViewModel.isCallAndOrderClicked.observe(viewLifecycleOwner) {
            it?.let {
                if (it) {
                    try {
                        val u = Uri.parse("tel:" + homeViewModel.callDetails.value)
                        val i = Intent(Intent.ACTION_DIAL, u)
                        startActivity(i)
                        homeViewModel.sendCallToOrderToFacebookEvent()
                        firebaseEventUseCase.homePageCallToOrder(
                            FirebaseEventModel(
                                mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                                customerId = SharedPrefManager.getInstance().loggedInUserId,
                                callUsNumber = homeViewModel.callDetails.value
                            )

                        )
                    } catch (_: Exception) {
                        Toast().showCustomToastMessage(requireActivity(), "An error occurred")
                    }
                }
            }

        }

        homeViewModel.paymentMethodDetailsData.observe(viewLifecycleOwner) { response ->
            response?.let {
                if (response.isNotEmpty()) {
                    if (response.size == 1 && homeViewModel.isShowPaymentPendingPopup) {
                        //to be added after bill details
                        /*homeViewModel.bottomSheetPriority.add(
                            homeViewModel.prepareBottomSheet(
                                BottomSheetType.PAYMENT_PENDING
                            )
                        )*/
                        billDetailsModel = response[0].billDetailsModel!!
                        orderDetails = response[0].activeOrderItem!!
                        if (response[0].paymentSelectionInfo != null)
                            paymentSelectionInfo = response[0].paymentSelectionInfo!!
                        paymentResponse = response[0]
                        response[0].activeOrderItem?.orderId?.let {
                            homeViewModel.calculateBillDetailsPaymentPendingOrder(it)
                        }
                    }
                }
            }
        }

        /*homeViewModel.drCallConfirmEventLiveData.observe(viewLifecycleOwner, Observer {
            if (it.count == 1) {

                var doctorFraud = BottomSheetDefaultModel(
                    discountPercentage = it.discount,
                    sellingPrice = it.paymentValue
                )
                fraudBottomSheet = DoctorFraudBottomSheet(
                    doctorFraudCallback,
                    doctorFraud,
                )
                fraudBottomSheet!!.show(
                    requireActivity().supportFragmentManager,
                    "FraudBottomSheet"
                )
            }
        })*/

        homeViewModel.optionReasonType.observe(viewLifecycleOwner, Observer {
//            fraudBottomSheet?.dismiss()
            if (it.equals("No") && homeViewModel.activeMenu.value == R.id.homeFragment) {
                homeViewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.SORRY_FOR_INCONVENIENCE)
            }
        })
    }

    private fun showPendingPaymentDialog(
        result: HomePaymentPendingResponse,
        paymentPendingCallback: PaymentPendingCallback
    ) {
        val paymentPending = BottomSheetDefaultModel(
            paymentTypeLogoUrl = result.paymentSelectionInfo?.paymentMethodIconUrl ?: "",
            paymentType = result.paymentSelectionInfo?.paymentMethod ?: "UPI",
            paymentMethodID = result.paymentSelectionInfo?.paymentMethodId?.toLong() ?: -1L,
            sellingPrice = result.billDetailsModel?.estimatedPayableValue!!,
            orderId = result.activeOrderItem?.orderId ?: 0,
            isReorder = result.activeOrderItem?.mxEvents?.reorder ?: false
        )

        paymentPendingBottomSheet = PaymentPendingBottomSheet(
            paymentPendingCallback,
            paymentPending,
        )
        if (homeViewModel.activeMenu.value == R.id.homeFragment) {
            homeViewModel.isPaymentPendingToShow = false
            paymentPendingBottomSheet?.let {
                if (!paymentPendingBottomSheet!!.isVisible) {
                    if (homeViewModel.showPaymentPendingBottomSheet.value == false) {
                        homeViewModel.sendPaymentPopupViewedEvent(
                            paymentPending.orderId,
                            result.activeOrderItem?.mxEvents?.reorder,
                            paymentPendingBottomSheet!!
                        )
                        paymentPendingBottomSheet!!.show(
                            requireActivity().supportFragmentManager,
                            "PaymentPendingBottomSheet"
                        )
                        homeViewModel.showPaymentPendingBottomSheet.value = true
                    }
                }
            }
        } else {
            homeViewModel.isPaymentPendingToShow = true
        }


    }

    private fun openLocationBottomSheet() {
        val locationCallback = object : ChooseLocationCallback {
            override fun locationClicked(
                selectedLocation: String,
                selectedAddressId: Long,
                selectedAddressPinCode: String
            ) {
                homeViewModel.isLoadingView.postValue(true)
                homeViewModel.fetchPinCodeOnAddressSelection(
                    selectedAddressPinCode,
                    selectedAddressId
                )
                firebaseEventUseCase.logFirebaseEvent(
                    FirebaseEvent.FIREBASE_LOCATION_CHOOSE_LOCATION,
                    ""
                )
            }

            override fun editAddressClicked(getAllAddressResponse: GetAllAddressResponse.ResponseObj?) {
                if (locationBottomSheet?.isVisible == true) {
                    locationBottomSheet?.dismiss()
                }

                navigateToAddAddressActivity(
                    params = bundleOf(
                        "editList" to Gson().toJson(getAllAddressResponse).toString(),
                        "isEditClick" to true,
                        "isHomeAddressAdded" to homeViewModel.isHomeAddressAdded,
                        "isOfficeAddressAdded" to homeViewModel.isOfficeAddressAdded,
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                    )
                )
            }

            override fun dismissToolTip(toolTip: DefaultExpandedTooltipWithMargin?) {
                handler.postDelayed({
                    toolTip?.dismiss()
                }, 2000)
            }

        }

        locationBottomSheet = LocationBottomSheet(locationCallback)
        locationBottomSheet?.isCancelable = !homeViewModel.getAddressList.value.isNullOrEmpty()
        locationBottomSheet?.setUpHomeViewModel(homeViewModel)
        val lastRecordedData =
            com.intellihealth.truemeds.data.utils.isSingleClick(mLocationLastClickTime)
        mLocationLastClickTime = lastRecordedData.second
        if (isSingleClick() && locationBottomSheet?.isVisible == false) {
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_HOMEPAGE_LOCATION, "Home")
            locationBottomSheet?.show(
                requireActivity().supportFragmentManager,
                "CHOOSE_LOCATION"
            )
            isLocationBottomSheetOpened = true
        }
        homeViewModel.sendLocationBottomSheetViewedEvent()
    }

    fun getCurrentGPSLocation() {
        locationBottomSheet?.getCurrentGPSLocation()
        Log.d("TAG", "getCurrentGPSLocation: called")
    }

    fun checkLocationEnablePopup() {
        locationBottomSheet?.checkLocationEnablePopup()
        Log.d("TAG", "getCurrentGPSLocation: called")
    }

    fun checkLocationPermission() {
        locationBottomSheet?.checkLocationPermission()
        Log.d("TAG", "getCurrentGPSLocation: called")
    }

    override fun onResume() {
        super.onResume()
        homeViewModel.viewedBannerList = ArrayList()
        val list: List<HomeBanner.Banner>? = homeViewModel.bannerList.value
        if (!list.isNullOrEmpty()) {
            if (isBannerVisible)
                homeViewModel.addBannerImpression(list, homeViewModel.currentBannerIndex)
        }
        if (homeViewModel.resumeCount > 1) {
            //homeViewModel.isMedicineRefreshRequired = true
            if ((homeViewModel.featureList.value?.size
                    ?: 0) > 0 && homeViewModel.showShimmerHome.value == false && homeViewModel.activeStackedProductShimmerState.value == false /** `homeViewModel.activeStackedProductShimmerState.value == false` This condition added, because if data is not received from api and user invoke onResume then adapter was getting removed */
            ) {
                homeViewModel.updateQtyForTrendingInCityResponse()
                homeViewModel.updateQtyForNewArrivalStackResponse(pageIndex = homeViewModel.stackedListCurrentPageCount)
                homeViewModel.updateQtyForYourMedicineResponse()
            }
        }
        binding.city =
            if (SharedPrefManager.getInstance().selectedCity.isNullOrEmpty()) "Select" else SharedPrefManager.getInstance().selectedCity
    }

    private var mLastClickTime = 0L
    private var mLocationLastClickTime = 0L

    private fun isSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        this@HomeFragment.mLastClickTime = now
        return now - lastClickTime >= HomeFragment.MIN_DELAY_MS
    }


    override fun dismissProductDetailBottomsheet(productCode: String) {
        if (productCode.isEmpty()) return

        /*if (homeViewModel.limitedTimeOfferResponse != null) {
            val updatedLimitedOfferStackedList =
                homeViewModel.getUpdatedListFromDatabase(homeViewModel.limitedTimeOfferResponse?.responseData?.LIMITED_OFFER)
            homeViewModel.limitedTimeOfferResponse?.responseData?.LIMITED_OFFER =
                updatedLimitedOfferStackedList
            val productCardModel = ProductCardDataModel(
                id = 8,
                type = HomeSectionConstants.STACKED_PRODUCT_CARD,
                null, homeViewModel.limitedTimeOfferResponse, homeViewModel.newArrivalResponse
            )
            if (productCardModel != null) {
                productCardStackedAdapter?.setData(productCardModel)
            }
            lifecycleScope.launch(IO) { homeViewModel.setCartCount() }

        }*/
        homeViewModel.setCartCount()
        homeViewModel.updateQtyForTrendingInCityResponse()
        homeViewModel.updateQtyForNewArrivalStackResponse()
        homeViewModel.updateQtyForYourMedicineResponse()
    }

    private fun showConfirmationDialog(productCode: String, isSubs: Boolean) {
        editDeleteAddressBottomSheet.isCancelable = true
        if (!editDeleteAddressBottomSheet.isVisible)
            editDeleteAddressBottomSheet.setBottomSheet(cartViewModel)
        activity?.supportFragmentManager?.let {
            editDeleteAddressBottomSheet.show(
                it, "Discard unsaved details?"
            )
        }
    }

    /*override fun openActivityForDeepLink(events: DeepLinkEvents) {
        when (events) {
            is DeepLinkEvents.OpenAutoClaimReferAndEarn -> openReferAndEarnActivity(
                events.code,
                true
            )

            is DeepLinkEvents.OpenReferAndEarn -> openReferAndEarnActivity("", false)
            is DeepLinkEvents.SearchClick -> openSearchSuggestionActivity("")
            is DeepLinkEvents.CartClick -> openCartActivity()
            is DeepLinkEvents.OpenPdPage -> openPdPage(events.actionType, events.pdId)
            is DeepLinkEvents.OpenHealthArticle -> openHealthArticleActivity(
                events.slug,
                events.isArticle
            )

            is DeepLinkEvents.OpenSearchActivity -> openSearchActivity(
                events.query,
                events.searchType
            )

            is DeepLinkEvents.OpenReminder -> openReminderActivity()
            is DeepLinkEvents.OpenMyOrders -> openMyOrdersActivity()
            is DeepLinkEvents.CartClickWithAction -> openCartPage(events.actionType)
            is DeepLinkEvents.OpenOrderStatus -> openOrderStatusActivity(events.orderId)


            else -> {}
        }

    }*/

    private fun openPdPage(pdId: String?,actionType: String?) {
        try {
            if (activity != null) {
             /*   val intent = Intent(activity, ProductDetailActivity::class.java)
                    .putExtra(
                        BundleConstants.BUNDLE_KEY_ORDER_ID,
                        SharedPrefManager.getInstance().incompleteOrderId
                    )
                    .putExtra(BundleConstants.PRODUCT_CODE, pdId)
                    .putExtra("originalMedicineName", "")
                    .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "deep_link")
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "homepage")
                    .putExtra(BundleConstants.SEARCH_TYPE,"FETCH_PRODUCT_DETAILS")
                    .putExtra("isOpenedFromCrossSellingSection", false)
                    .putExtra(BundleConstants.ACTION_TYPE, actionType)
                startActivity(intent)*/

                navigateToProductDetailActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId,
                        BundleConstants.PRODUCT_CODE to pdId,
                        "originalMedicineName" to "",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "deep_link",
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        BundleConstants.SEARCH_TYPE to "FETCH_PRODUCT_DETAILS",
                        "isOpenedFromCrossSellingSection" to false,
                        BundleConstants.ACTION_TYPE to actionType)
                )

            }
        } catch (_: Exception) {

        }
    }


    private fun openOrderStatusActivity(orderId: String?,orderType:String?) {

        homeViewModel.loaderValue.value = false

        if (orderType==null) return
        when (orderType) {
            OrderInState.ACTIVE  -> navigateToOrderStatusActivity(
                params = bundleOf(
                    BundleConstants.ORDER_ID to orderId?.toLong(),
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "order status"
                )
            )
            OrderInState.NON_ACTIVE -> navigateToNonActiveOrderStatusActivity(
                params = bundleOf(
                    BundleConstants.ORDER_ID to orderId?.toLong(),
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage"
                )
            )
        }
    }

    private fun openHealthArticleActivity(slug: String?, isArticle: Boolean) {
        try {
            if (activity != null) {
               if (isArticle) {
                   navigateToHealthArticleDetailActivity(
                       params = bundleOf(
                           BundleConstants.BUNDLE_KEY_SLUG to slug,
                           BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                           "categoryChipList" to homeViewModel.healthArticleData.value?.chipList?.let { it1 -> ArrayList(it1) }
                       )
                   )
                } else {
                   navigateToHealthArticlesActivity(
                       params = bundleOf(
                           BundleConstants.BUNDLE_KEY_SLUG to slug,
                           BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                           "categoryChipList" to homeViewModel.healthArticleData.value?.chipList?.let { it1 -> ArrayList(it1) }
                       )
                   )
                }
            }
        } catch (_: Exception) {
        }
    }


    private fun openSearchSuggestionActivity(query: String) {
//        todo deep link bundle on search sugg
        try {
            if (activity != null) {
              /*  val intent = Intent(activity, SearchSuggestionActivity::class.java)
                    .putExtra(BundleConstants.BUNDLE_KEY_DEEP_LINK_SEARCH_QUERY, query)
                    .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "home_page")
                    .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search")
                .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                startActivity(intent)*/

                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "home_page",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search",
                        BundleConstants.BUNDLE_KEY_DEEP_LINK_SEARCH_QUERY to query
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )

            }
        } catch (_: Exception) {
        }
    }

    private fun openCartPage(actionType: String?) {
        val intent = Intent(activity, CartActivity::class.java)
            .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            .putExtra("actionType", actionType);
        startActivity(intent)
    }

    private fun openReminderActivity() {
        (activity as HomePageActivity).verifyLoginAndRedirect(LoginFromScreen.HOME, "reminder") {
            navigateToPatientReminderActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "home_page"
                )
            )
        }
    }

    private fun openMyOrdersActivity() {
        (activity as HomePageActivity).verifyLoginAndRedirect(LoginFromScreen.HOME, "my_order") {
            HomeViewModel.reloadMyOrders.postValue(true)
            navigateToMyOrdersActivity()
        }
    }

    private fun openSearchActivity(query: String, type: String) {
        try {
            if (query.isEmpty()) return
            if (type.isEmpty()) {
                openSearchSuggestionActivity(query)
            } else {
                if(context!=null) {
                 /*   val intent = Intent(context, SearchResultActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                    intent.putExtra(BundleConstants.SEARCH_TEXT, query)
                        .putExtra(
                            BundleConstants.SEARCH_TYPE,
                            type
                        )//intent.putExtra("med_query", query).putExtra("elasticSearchType", type)
                        .putExtra("term_searched", "").putExtra("suggestion_term_clicked", "")
                        .putExtra("suggestion_term_clicked_position", 0)
                        .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "home_page")
                        .putExtra("isFromRecentlySearched", false)
                        .putExtra("isFromBanner",true)
                    if (homeViewModel.srpPageSectionFromDeeplink.isNotEmpty()) {
                        intent.putExtra(
                            BundleConstants.BUNDLE_KEY_PAGE_SECTION,
                            homeViewModel.srpPageSectionFromDeeplink
                        )
                    }

                    startActivity(intent)*/


                    navigateToSearchResultActivity(
                        params = bundleOf(
                            BundleConstants.SEARCH_TEXT to query,
                            BundleConstants.SEARCH_TYPE to type,
                            "term_searched" to "",
                            "suggestion_term_clicked" to "",
                            "suggestion_term_clicked_position" to 0,
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "home_page",
                            "isFromRecentlySearched" to false,
                            "isFromBanner" to true,
                            if (homeViewModel.srpPageSectionFromDeeplink.isNotEmpty()) {
                                BundleConstants.BUNDLE_KEY_PAGE_SECTION to homeViewModel.srpPageSectionFromDeeplink
                            } else  BundleConstants.BUNDLE_KEY_PAGE_SECTION to null  // need to check
                        ),
                        flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                    )

                }
            }
        }catch (_:Exception){
        }

    }

    private fun openCartActivity() {
        if (homeViewModel.cartItemCount.value!! > 0) {
            startActivity(Intent(activity, CartActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
        } else if (homeViewModel.cartItemCount.value!! == 0 &&
            SharedPrefManager.getInstance().prescriptionCount > 0
        ) {
            startActivity(Intent(activity, OrderSummaryActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
        } else {
            startActivity(Intent(activity, CartActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
        }
    }


    /*private fun reloadNewArrivalStack() {
        if (homeViewModel.trendingInCityResponse != null && homeViewModel.trendingInCityResponse!!.responseData != null)
            lifecycleScope.launch(IO) {
                homeViewModel.updateQtyForNewArrivalStackResponse()
            }
    }*/

    /**
     * This is used to pop the bottom sheet from the stack and display if previously not shown
     */
    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        if (!hidden) {
            val sorted = homeViewModel.bottomSheetPriority.sortedBy { by -> by.priority }
            sorted.forEachUntil { model ->
                val shouldBreak = !model.isBottomSheetDisplayed
                if (shouldBreak) {
                    homeViewModel.bottomSheetTrigger?.postValue(model)
                    homeViewModel.bottomSheetPriority[homeViewModel.bottomSheetPriority.indexOf(
                        model
                    )].isBottomSheetDisplayed = true
                }
                shouldBreak
            }
        }
    }

    private fun setNestedScrollListener() {
        binding.rvHomePage.addOnScrollListener(object :
            RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (recyclerView.adapter != null) {
                    val layoutManager = recyclerView.layoutManager as LinearLayoutManager?
                    val firstVisiblePosition = layoutManager!!.findFirstVisibleItemPosition()
                    val lastVisiblePosition = layoutManager.findLastCompletelyVisibleItemPosition()
                    val view = layoutManager.findViewByPosition(lastVisiblePosition)

                    if (firstVisiblePosition == otcPosition &&
                        !homeViewModel.superCategoryList.value.isNullOrEmpty() &&
                        !isCategoryImpressionSent
                    ) {
//                        println("lastVisiblePosition = $lastVisiblePosition otcPosition = $otcPosition")
                        homeViewModel.selectedCategory = 0
                        homeViewModel.sendCategoryAndSuperCategoryData()
                        isCategoryImpressionSent = true
                    }

                    if (getIsChildVisibleInConcatAdapter(healthArticlePosition,layoutManager)){
                        blogSectionAdapter?.toggleShimmer(homeViewModel.healthArticleShimmerState.value ?: false)
                    }
                    if (getIsChildVisibleInConcatAdapter(stackedConcatPosition,layoutManager)){
                        productCardStackedAdapter?.toggleShimmer(homeViewModel.activeStackedProductShimmerState.value ?: false)
                    }
                }
            }
        })
        /*binding.contentScroll.getViewTreeObserver().addOnScrollChangedListener {
            if (binding.rvHomePage.adapter != null) {
                val layoutManager = binding.rvHomePage.layoutManager as LinearLayoutManager?
                val lastVisiblePosition = layoutManager!!.findLastVisibleItemPosition()
                val view = layoutManager.findViewByPosition(lastVisiblePosition)
                if(view?.findViewById<TextView>(R.id.tvTextShopByCategories)!=null && !isCategoryImpressionSent)
                {
                    homeViewModel.sendCategoryImpression()
                    isCategoryImpressionSent = true
                }
            }
        }*/
        /*binding.contentScroll.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
            if (scrollY > oldScrollY) {
                if (binding.rvHomePage.adapter != null) {
                    val layoutManager = binding.rvHomePage.layoutManager as LinearLayoutManager?
                    val lastVisiblePosition = layoutManager!!.findLastVisibleItemPosition()
                    val view = layoutManager.findViewByPosition(lastVisiblePosition)
                    if(view?.findViewById<TextView>(R.id.tvTextShopByCategories)!=null && !isCategoryImpressionSent)
                    {
                        homeViewModel.sendCategoryImpression()
                        isCategoryImpressionSent = true
                    }
                }
            }
            *//*if (scrollY < oldScrollY) {
                Log.i(TAG, "Scroll UP")
            }
            if (scrollY == 0) {
                Log.i(TAG, "TOP SCROLL")
            }
            if (scrollY == v.measuredHeight - v.getChildAt(0).measuredHeight) {
                Log.i(TAG, "BOTTOM SCROLL")
            }*//*
        })*/
    }
}

data class HomePageFeatureName(val featureId: Int, val featureName: String, val sequence: Int)