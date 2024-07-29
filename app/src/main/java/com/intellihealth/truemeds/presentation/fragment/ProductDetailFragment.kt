package com.intellihealth.truemeds.presentation.fragment


import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Rect
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import android.transition.TransitionManager
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.viewpager.widget.ViewPager
import com.cashfree.pg.network.NetworkConnectivityUtil
import com.clevertap.android.sdk.Utils.runOnUiThread
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.CartsCallback
import com.intellihealth.salt.callbacks.CompositionCallback
import com.intellihealth.salt.callbacks.FaqCallBack
import com.intellihealth.salt.callbacks.StickyNotStickyNotificationCallback
import com.intellihealth.salt.constants.CartsConstants
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.NotificationButton
import com.intellihealth.salt.models.NotificationPosition
import com.intellihealth.salt.models.NotificationType
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.section.RecommendedSubstituteCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.home.PopUpModel
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.FragmentProductDetailBinding
import com.intellihealth.truemeds.domain.enums.Coupon
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPrescriptionActivity
import com.intellihealth.truemeds.domain.navigation.navigateToProductDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.activity.ProductDetailActivity
import com.intellihealth.truemeds.presentation.adapter.BannerViewpagerAdapter
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FbSubsView
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpImageViewed
import com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.cart.ViewPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.home.ApplyCouponBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.CompositionDetailsBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.OrgSubCompareBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.ApplyCouponCallback
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.dialog.CouponApplySuccess
import com.intellihealth.truemeds.presentation.dialog.CouponErrorPopup
import com.intellihealth.truemeds.presentation.dialog.CouponSavingPopUp
import com.intellihealth.truemeds.presentation.dialog.PopUpDialog
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.toAppProductModel
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@AndroidEntryPoint
class ProductDetailFragment : Fragment(R.layout.fragment_product_detail), BannerViewpagerAdapter.BannerViewPagerClickCallback,
    ProductDetailBottomSheet.CrossSellingProductBSCallback {

    private val binding by viewBinding(FragmentProductDetailBinding::bind)
    private val viewModel by lazy {
        if (isBottomSheetBahaviour) {
            ViewModelProvider(this)[ProductDetailViewModel::class.java]
        } else {
            ViewModelProvider(requireActivity())[ProductDetailViewModel::class.java]
        }
    }
    private val cartViewModel by lazy { ViewModelProvider(this)[CartViewModel::class.java] }
    private val ftcViewModel: CountDownTimerViewModel by lazy { ViewModelProvider(this)[CountDownTimerViewModel::class.java] }


    //private var searchText = ""
    private var searchType = ""
    private var isBottomSheetBahaviour: Boolean = false
    private var isFromCrossSelling: Boolean = false
    private var isDivideMRPCrossSellingWithQty: Boolean = true
    private var productCode: String = ""
    var mViewPagerAdapter: BannerViewpagerAdapter? = null
    var isDeleteBSFromSuggestion: Boolean = false
    var isDeleteBSFromProduct: Boolean = false
    var isDeleteBSFromDoubleStack: Boolean = false
    var posDeleteBSFromDoubleStack: Int = 0
    private lateinit var couponSavingPopUp: CouponSavingPopUp
    private var applyCouponCallBack: ApplyCouponCallback? = null
    private var editDeleteAddressBottomSheet = RemoveProductBottomSheet()
    private var pdBottomsheetCallbackListener: ProductDetailBottomSheet.CrossSellingProductBSCallback? =
        null
    private var run1: Runnable? = null
    private var index: Int = 0
    private var resumeCount: Int = 0
    private val hand1: Handler = Handler()
    private val GET_DATA_INTERVAL: Long = 3000
    var productCodeToDelete = ""
    var isFromOTC = false
    var isFromSearch = false
    var tooltipList: MutableList<Pair<String, Int>> = mutableListOf()

    /**
     * Below variable is used when 'isSubs' true and to keep it's Original product information for Substitute Pdp page
     */
    private var orgProductOfSubs: ProductInfoModel? = null
    private var orgProductForThisPage: ProductInfoModel? = null
    private var eventOrgProductForThisPage: ProductInfoModel? = null
    private var switchBackSkuNameForSubs: String? = null // From OrderSummary
    private var pdInternalServerErrorCallback: InternalServerErrorCallback? = null
    private var lastClickTime: Long = 0
    private val coolDownSeconds = 2
    var dialog: DialogFragment? = null


    companion object {
        private const val MIN_DELAY_MS: Long = 500L
        fun getInstance(
            isSubs: Boolean,
            isBottomSheetBahaviour: Boolean = false,
            searchText: String = "",
            searchType: String = "",
            productCode: String = "",
            isFromCrossSelling: Boolean = false,
            orgProductOfSubs: String? = "",
            isFromOrderStatus: Boolean = false,
            isAlreadyAddedToCart: String? = null,
            orgProductForThisPage: String? = null,
            switchBackSkuNameForBottomSheetSubs: String? = null,
            isFromOTC: Boolean = false,
            isFromSearch: Boolean = false,
            isDivideMRPSellingWithQty: Boolean = true,
            item_qc: String? = null,
            item_rt: String? = null,
            term_searched: String? = null,
            suggestion_term_clicked: String? = null,
            suggestion_term_clicked_position: Int? = null,
            elastic_search_type: String? = null,
            clickedOnPage: String? = null,
            section: String? = null,
            sectionIndex: Int? = null,
            subsFoundEventOrderSummary: String? = "",
            crossSellingSectionHeadingEvent:String?="",
            eventOrgProductForThisPage: String? = null,
            sectionRow:Int?=0,
            clickedSuggestionType:String?= null,
            otcSuperCategoryName:String?=null,
            otcCategoryName:String?=null,
            otcSubCategoryName:String?=null,
            deepLinkActionType:String?=null
        ): ProductDetailFragment {
            val bundle = Bundle()

            bundle.putBoolean(BundleConstants.IS_PRODUCT_DETAIL_BS, isBottomSheetBahaviour)
            bundle.putString(BundleConstants.SEARCH_TEXT, searchText)
            bundle.putString(BundleConstants.SEARCH_TYPE, searchType)
            bundle.putString(BundleConstants.PRODUCT_CODE, productCode)
            bundle.putBoolean(BundleConstants.IS_FROM_CROSS_SELLING, isFromCrossSelling)
            bundle.putString(BundleConstants.ORG_PRODUCT_OF_SUBS, orgProductOfSubs)
            bundle.putBoolean(BundleConstants.IS_SUBS, isSubs)
            bundle.putBoolean(BundleConstants.IS_FROM_ORDER_STATUS, isFromOrderStatus)
            bundle.putBoolean(BundleConstants.IS_FROM_OTC, isFromOTC)
            /** To maintain "Added to cart" status*/
            bundle.putString(BundleConstants.IS_ORG_ADDED_TO_CART, isAlreadyAddedToCart)
            /** Coming from Order summary page - opens Pd bottomsheet- take earlier page medical info through below field and no api call to fetch medicine details*/
            bundle.putString(BundleConstants.ORG_PRODUCT_FOR_THIS_PAGE, orgProductForThisPage)
            bundle.putString(BundleConstants.EVENT_ORG_PRODUCT_FOR_THIS_PAGE, eventOrgProductForThisPage)
            bundle.putString(
                BundleConstants.SWITCH_BACK_SKUNAME_IS_SUBS,
                switchBackSkuNameForBottomSheetSubs
            )
            bundle.putBoolean(BundleConstants.IS_FROM_SEARCH, isFromSearch)
            bundle.putBoolean(
                BundleConstants.IS_DIVIDE_MRP_CROSSSELLING_WITH_QTY,
                isDivideMRPSellingWithQty
            )
            bundle.putString(BundleConstants.BUNDLE_KEY_ITEM_QC, item_qc)
            bundle.putString(BundleConstants.BUNDLE_KEY_ITEM_RT, item_rt)
            bundle.putString(BundleConstants.BUNDLE_KEY_TERM_SEARCHED, term_searched)
            bundle.putString(BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE, clickedSuggestionType)
            bundle.putString(
                BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED,
                suggestion_term_clicked
            )
            if (suggestion_term_clicked_position != null) {
                bundle.putInt(
                    BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION,
                    suggestion_term_clicked_position
                )
            }
            bundle.putString(BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE, elastic_search_type)
            bundle.putString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, clickedOnPage)
            bundle.putString(BundleConstants.BUNDLE_KEY_PAGE_SECTION, section)
            bundle.putString(BundleConstants.BUNDLE_KEY_SECTION_HEADING, crossSellingSectionHeadingEvent)
//            bundle.putInt(BundleConstants.POSITION, resultPosition)
            bundle.putString(
                BundleConstants.BUNDLE_KEY_EVENT_SUBS_FOUND_OS,
                subsFoundEventOrderSummary
            )
            if (sectionIndex != null) {
                bundle.putInt(BundleConstants.BUNDLE_KEY_SECTION_INDEX, sectionIndex)
            }
            if (sectionRow != null) {
                bundle.putInt(BundleConstants.BUNDLE_KEY_SECTION_ROW, sectionRow)
            }
            bundle.putString(BundleConstants.OTC_SUPER_CATEGORY_NAME, otcSuperCategoryName)
            bundle.putString(BundleConstants.OTC_CATEGORY_NAME, otcCategoryName)
            bundle.putString(BundleConstants.OTC_SUB_CATEGORY_NAME, otcSubCategoryName)
            bundle.putString(BundleConstants.ACTION_TYPE, deepLinkActionType)
            val fragment = ProductDetailFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    fun setIsTruecaller(isTruecaller: Boolean) {
        viewModel.isTruecaller = isTruecaller
    }

    fun getTrueCallerUserDetails(
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        context: Context
    ) {
        viewModel.currentPageNameForSignup = "product_detail_page"
        viewModel.getTrueCallerUserDetails(
            textAuthorizationCode,
            clientId,
            authorizationCode,
            codeVerifier,
            context
        )
    }

    fun sendLoginPageViewedEvent() {
        val mxLoginPageViewed = MxLoginPageViewed(
            "product_detail_page",
            "proceed_to_cart",
            viewModel.isTruecaller
        )
        val afLoginPageViewed = AFLoginPageViewed(viewModel.isTruecaller)
        viewModel.loginPageViewedEvent(mxLoginPageViewed, afLoginPageViewed)
    }

    override fun onPause() {
        super.onPause()
        lifecycleScope.launch {
            try {
                if(viewModel.customerAlsoBoughtViewed) {
                    for (i in 0..viewModel.lastScrollPosition) {
                        viewModel.doubleStackApiResponseData[i].let { pim ->
                            viewModel.sendItemImpressionEvent(
                                pim,
                                "product_detail_page",
                                "tray",
                                i + 1,
                                "customer_also_brought",
                                i + 1,
                                if ((i + 1) % 2 == 0) 2 else 1,
                                0.0
                            )
                        }
                    }
                }
            } catch (_: Exception) {
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pdBottomsheetCallbackListener = this
        /** set listener of Productdetail bottomsheet */
    }

    private fun getScrollPosition() {
        binding.nestedScrollView.viewTreeObserver.addOnScrollChangedListener {
            val scrollBounds = Rect()
            binding.nestedScrollView.getHitRect(scrollBounds)
            if (binding.doubleStackProductCard.getLocalVisibleRect(scrollBounds)) {
                viewModel.customerAlsoBoughtViewed = true
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            isBottomSheetBahaviour = it.getBoolean(BundleConstants.IS_PRODUCT_DETAIL_BS)
            viewModel.isSubs = it.getBoolean(BundleConstants.IS_SUBS)
            searchType = it.getString(BundleConstants.SEARCH_TYPE) ?: ""
            viewModel.crossSellingSectionHeader = it.getString(BundleConstants.BUNDLE_KEY_SECTION_HEADING)?:""
            //searchText = it.getString(BundleConstants.SEARCH_TEXT) ?: ""
            productCode = it.getString(BundleConstants.PRODUCT_CODE) ?: ""
            isFromCrossSelling = it.getBoolean(BundleConstants.IS_FROM_CROSS_SELLING, false)
            viewModel.isFromCrossSelling = it.getBoolean(BundleConstants.IS_FROM_CROSS_SELLING, false)
            isDivideMRPCrossSellingWithQty =
                it.getBoolean(BundleConstants.IS_DIVIDE_MRP_CROSSSELLING_WITH_QTY, true)

            //event integration parameters value set here

            viewModel.setMedicineListDataReceived()


            if (it.containsKey(BundleConstants.ORG_PRODUCT_OF_SUBS)) {
                orgProductOfSubs = Gson().fromJson(
                    it.getString(BundleConstants.ORG_PRODUCT_OF_SUBS),
                    ProductInfoModel::class.java
                )
            }
            if (it.containsKey(BundleConstants.ORG_PRODUCT_FOR_THIS_PAGE)) {
                orgProductForThisPage = Gson().fromJson(
                    it.getString(BundleConstants.ORG_PRODUCT_FOR_THIS_PAGE),
                    ProductInfoModel::class.java
                )
                if (isDivideMRPCrossSellingWithQty) {
                    var qty = (orgProductForThisPage?.product?.qty ?: 1)
                    qty = if (qty == 0) 1 else qty
                    orgProductForThisPage?.product?.sellingPrice =
                        orgProductForThisPage?.product?.sellingPrice!! / qty
                    orgProductForThisPage?.product?.mrp =
                        orgProductForThisPage?.product?.mrp!! / qty
                }
            }

            if (it.containsKey(BundleConstants.EVENT_ORG_PRODUCT_FOR_THIS_PAGE)) {
                eventOrgProductForThisPage = Gson().fromJson(
                    it.getString(BundleConstants.EVENT_ORG_PRODUCT_FOR_THIS_PAGE),
                    ProductInfoModel::class.java
                )
            }
            if (it.containsKey(BundleConstants.SWITCH_BACK_SKUNAME_IS_SUBS)) {
                switchBackSkuNameForSubs = it.getString(BundleConstants.SWITCH_BACK_SKUNAME_IS_SUBS)
            }
            viewModel.isFromOrderStatus.value = it.getBoolean(BundleConstants.IS_FROM_ORDER_STATUS)
            isFromOTC = it.getBoolean(BundleConstants.IS_FROM_OTC)
            isFromSearch = it.getBoolean(BundleConstants.IS_FROM_SEARCH)
            viewModel.deepLinkActionType = it.getString(BundleConstants.ACTION_TYPE)?:null
            viewModel.isAlreadyAddedToCartFromSearch =
                it.getString(BundleConstants.IS_ORG_ADDED_TO_CART)

            viewModel.item_qc = if(it.getString(BundleConstants.BUNDLE_KEY_ITEM_QC) != null) it.getString(BundleConstants.BUNDLE_KEY_ITEM_QC).toString() else null
            viewModel.item_rt = if(it.getString(BundleConstants.BUNDLE_KEY_ITEM_RT) != null) it.getString(BundleConstants.BUNDLE_KEY_ITEM_RT).toString() else null
            viewModel.term_searched =
                if(it.getString(BundleConstants.BUNDLE_KEY_TERM_SEARCHED) != null) it.getString(BundleConstants.BUNDLE_KEY_TERM_SEARCHED).toString() else null
            viewModel.suggestion_term_clicked =
                if(it.getString(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED) != null) it.getString(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED).toString() else null
            viewModel.suggestion_term_clicked_position =
                it.getInt(BundleConstants.BUNDLE_KEY_SUGGESTION_TERM_CLICKED_POSITION, 0)
            viewModel.elastic_search_type =
                if(it.getString(BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE) !=null) it.getString(BundleConstants.BUNDLE_KEY_ELASTIC_SEARCH_TYPE).toString() else null
            viewModel.clicked_suggsetion_type =
                if(it.getString(BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE) !=null) it.getString(BundleConstants.BUNDLE_KEY_CLICKED_SUGGESTION_TYPE).toString() else null
            viewModel.clickedOnPage =
                if(it.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE) != null) it.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString() else null
            val pageSection:String? = it.getString(BundleConstants.BUNDLE_KEY_PAGE_SECTION)?:null
            viewModel.section=if(!pageSection.isNullOrEmpty()) pageSection.toString() else null
            viewModel.sectionIndex = it.getInt(BundleConstants.BUNDLE_KEY_SECTION_INDEX)
            viewModel.sectionRow = it.getInt(BundleConstants.BUNDLE_KEY_SECTION_ROW)
            viewModel.otcSuperCategoryName =if(it.getString(BundleConstants.OTC_SUPER_CATEGORY_NAME) != null) it.getString(BundleConstants.OTC_SUPER_CATEGORY_NAME).toString() else null
            viewModel.otcSubCategoryName =if(it.getString(BundleConstants.OTC_SUB_CATEGORY_NAME) != null) it.getString(BundleConstants.OTC_SUB_CATEGORY_NAME).toString() else null
            viewModel.otcCategoryName =if(it.getString(BundleConstants.OTC_CATEGORY_NAME) != null) it.getString(BundleConstants.OTC_CATEGORY_NAME).toString() else null
        }
        binding.isBottomsheetBehaviour = isBottomSheetBahaviour
        binding.isSubs = viewModel.isSubs
        /*if (isBottomSheetBahaviour) {
            viewModel = ViewModelProvider(this)[ProductDetailViewModel::class.java]
        } else {
            viewModel = ViewModelProvider(requireActivity())[ProductDetailViewModel::class.java]
        }*/
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

//        viewModel.isSubs=isSubs?:false


        if (isAdded) viewModel.eventSendFtcCounterStarted.observe(viewLifecycleOwner) { if (it > 0L) viewModel.sendFtcCounterStarted(it) }
        getScrollPosition()
        viewModel.sendPDPViewedFirebaseEvent()
        handleViewVisibility()
        initData()
        addObservers()
        initClickListeners()
    }


    fun setInternalServerErrorCallback(mContext: InternalServerErrorCallback) {
        this.pdInternalServerErrorCallback = mContext
    }

    private fun initData() {
        if (NetworkConnectivityUtil.isNetworkConnected(activity)) {
            lifecycleScope.launch(IO) {
                if (orgProductForThisPage != null && isBottomSheetBahaviour) {
                    updateUIWithOrgProductForThis(orgProductForThisPage!!)
                } else {
                    viewModel.getProductDetailData(productCode, searchType, isBottomSheetBahaviour)
                }
                viewModel.getProductInfoAndWrittenReviewBy(productCode)
               // viewModel.getProductDetailCartData()

                if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty())
                    viewModel.getFtcCouponsData()

                if (!isBottomSheetBahaviour) {
                    viewModel.getCrossSellingDataForProductDetail(productCode)
                }
                viewModel.showShimmer.postValue(false)
            }
            setPDPheaders()
        } else {
            var dialog: PopUpDialog? = null
            val noInternet = PopUpModel(
                icon = R.drawable.ic_no_internet,
                header = getString(R.string.noInternetConnection),
                message = getString(R.string.noInternetMessage),
                buttonText = getString(R.string.try_again),
            )
            val callback = object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                    if (NetworkConnectivityUtil.isNetworkConnected(activity)) {
                        initData()
                        dialog?.dismiss()
                    } else {
                        initData()
                    }
                }

                override fun onCloseButtonClicked() {
                    activity?.finish()
                }
            }
            dialog = PopUpDialog(model = noInternet, callback = callback)
            dialog.isCancelable = true
            if (!dialog.isVisible)
                activity?.supportFragmentManager?.let { dialog.show(it, "ProductDetailActivity") }
        }

        if (isFromOTC)
            lifecycleScope.launch {
                delay(300)
                binding.btnSubsStepper.visibility = View.VISIBLE
            }
    }

    private fun handleViewVisibility() {
        initBottomSheetBehavior(isBottomSheetBahaviour)
        if (orgProductOfSubs != null) {
            orgProductOfSubs?.let {
                viewModel.orgProductForSubs = orgProductOfSubs
            }
        }
        if (!switchBackSkuNameForSubs.isNullOrEmpty()) {
            viewModel.fromOrderSummarySkuNameForSubs = switchBackSkuNameForSubs
        }
    }


    private fun setPDPheaders() {
        try {
            binding.nestedScrollView.viewTreeObserver
                .addOnScrollChangedListener {
                    val scrollBounds = Rect()
                    binding.nestedScrollView.getHitRect(scrollBounds);
                    if (binding.clStepper.getLocalVisibleRect(
                            scrollBounds
                        ) && (binding.btnSubsStepper.visibility == View.VISIBLE || binding.availabilityStatus.visibility == View.VISIBLE || binding.tvAlreadyAdded.visibility == View.VISIBLE)
                    ) {
                    }
                }
        } catch (e: Exception) {
        }



        setToolBarAnimation()


        /* Sticky header -Header,Search and Cart */
        setMedicineDetailHeader()

        /* Sticky header with Medicine Information */
        setMedicineInfoStickyHeader()
    }

    fun setToolBarAnimation() {

        val scrollBounds = Rect()
        binding.nestedScrollView.getHitRect(scrollBounds)
        binding.nestedScrollView.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v: NestedScrollView?, scrollX: Int, scrollY: Int, oldScrollX: Int, oldScrollY: Int ->
            var nestedBottom: Int = scrollY
            val rvCrossBottom: Int = binding.doubleStackProductCard.getBottom()
            val rvCrossTop: Int = binding.doubleStackProductCard.getTop()
            val rvCrossMiddle: Int = binding.doubleStackProductCard.getTop() + 250/*if (nestedBottom > rvCrossBottom) {
                    crossSellingViewed = true
                } else if (nestedBottom > rvCrossTop && nestedBottom < rvCrossBottom) {
                    crossSellingViewed = true
                }*/

            if (binding.clStepper.getLocalVisibleRect(scrollBounds) || binding.tvAlreadyAdded.getLocalVisibleRect(
                    scrollBounds
                )
            ) {
                if ((!binding.clStepper.getLocalVisibleRect(scrollBounds) || scrollBounds.height() < binding.clStepper.getHeight()) ||
                    (!binding.tvAlreadyAdded.getLocalVisibleRect(scrollBounds) || scrollBounds.height() < binding.tvAlreadyAdded.getHeight())
                ) {

                    //Log.i(TAG, "btnSubsStepper APPEAR PARTIALLY");
                    if (binding.pdpStickyHeader.getVisibility() === View.VISIBLE) {
                        val animSlideUp = AnimationUtils.loadAnimation(
                            activity, R.anim.slide_up
                        )
                        binding.pdpStickyHeader.startAnimation(animSlideUp)
                        binding.pdpStickyHeader.visibility = View.GONE
                       /* binding.viewLine.visibility = View.GONE
                        binding.viewLinePdp.visibility = View.VISIBLE*/
                        binding.pdpStickyHeader.isFocusable = false
                        binding.pdpStickyHeader.isClickable = false
                        ViewCompat.setTranslationZ(binding.pdpHeader, 12f)
                        ViewCompat.setTranslationZ(binding.pdpStickyHeader, 0f)
                        updateFtcLayoutConstraints(true)
                    }
                } else {
                    //Log.i(TAG, "BTN APPEAR FULLY!!!");
                    if (binding.pdpStickyHeader.getVisibility() === View.VISIBLE) {
                        val animSlideUp = AnimationUtils.loadAnimation(
                            activity, R.anim.slide_up
                        )
                        binding.pdpStickyHeader.startAnimation(animSlideUp)
                        binding.pdpStickyHeader.visibility = View.GONE
                        binding.pdpStickyHeader.isFocusable = false
                        binding.pdpStickyHeader.isClickable = false
                        /*binding.viewLine.visibility = View.GONE
                        binding.viewLinePdp.visibility = View.VISIBLE*/
                        ViewCompat.setTranslationZ(binding.pdpHeader, 12f)
                        ViewCompat.setTranslationZ(binding.pdpStickyHeader, 0f)
                        updateFtcLayoutConstraints(true)
                    }
                }
            } else {
                //Log.i(TAG, "No");
                /*if (elasticSearchMedicineModel.getOriginalMedicineSuppliedByTm()) {

                        }*/
//                if (binding.tvAlreadyAdded.visibility != View.VISIBLE) {

                if (binding.pdpStickyHeader.visibility === View.GONE) {
                    binding.pdpStickyHeader.visibility = View.VISIBLE
                    /*binding.viewLine.visibility = View.VISIBLE
                    binding.viewLinePdp.visibility = View.GONE*/
                    val animSlideDown = AnimationUtils.loadAnimation(
                        activity, R.anim.slide_down
                    )
                    binding.pdpStickyHeader.startAnimation(animSlideDown)
                    binding.pdpStickyHeader.isFocusable = true
                    binding.pdpStickyHeader.isClickable = true
                    ViewCompat.setTranslationZ(
                        binding.pdpHeader, dpToPixel(activity, 0f)
                    )
                    ViewCompat.setTranslationZ(
                        binding.pdpStickyHeader, dpToPixel(activity, 12f)
                    )
                    updateFtcLayoutConstraints(false)
                }
//                }
            }
        } as NestedScrollView.OnScrollChangeListener?)
    }


    private fun updateFtcLayoutConstraints(setToToolbar: Boolean) {
        val layout: ConstraintLayout = binding.mainLayout
        val setToolbar = ConstraintSet()
        setToolbar.clone(layout)
        // line below to make the connection.
        setToolbar.connect(
            R.id.applyCouponNotification,
            ConstraintSet.TOP,
            binding.pdpHeader.id,
            ConstraintSet.BOTTOM,
            0
        )
        val setProductInfoToolbar = ConstraintSet()
        setProductInfoToolbar.clone(layout)
        // line below to make the connection.
        setProductInfoToolbar.connect(
            R.id.applyCouponNotification,
            ConstraintSet.TOP,
            binding.pdpStickyHeader.getId(),
            ConstraintSet.BOTTOM,
            0
        )

        TransitionManager.beginDelayedTransition(layout)
        val constraint = if (setToToolbar) setToolbar else setProductInfoToolbar
        constraint.applyTo(layout)
    }

    private fun setMedicineInfoStickyHeader() {
        binding.pdpStickyHeader.setStepperCallback(/*viewModel.headerQuantityStepperCallback*/
            viewModel.pdBottomSheetQuantityStepperCallback
        )
        binding.pdpStickyHeader.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                (activity as ProductDetailActivity).closeActivity()
            }
        })
    }

    private fun setMedicineDetailHeader() {
        val pdpHeaderData =
            MobileSectionHeadersModel(
                if (viewModel.isSubs) getString(R.string.txt_substitute_details) else getString(R.string.txt_medicine_details),
                "",
                "",
                "",
                viewModel.cartItemCount.value
            )
        binding.pdpHeader.setUpMobileSectionHeadersData(pdpHeaderData)
        binding.viewLinePdp.visibility = View.VISIBLE
        binding.viewLine.visibility = View.GONE
        binding.pdpHeader.setSearchIconClickCallBack(viewModel.searchBarCallback)
        binding.pdpHeader.setCartIconClickCallBack(viewModel.cartIconClickCallback)
        binding.pdpHeader.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                (activity as ProductDetailActivity).closeActivity()
            }
        })
    }

    private suspend fun updateUIWithOrgProductForThis(orgProductForThisPage: ProductInfoModel) {
        orgProductForThisPage.let {
            var subsFoundForEvent = ""
            if (arguments != null && arguments?.containsKey(BundleConstants.BUNDLE_KEY_EVENT_SUBS_FOUND_OS) == true) {
                subsFoundForEvent =
                    arguments?.getString(BundleConstants.BUNDLE_KEY_EVENT_SUBS_FOUND_OS) ?: ""
            }
            viewModel.setMedicineDetailsInfoBannerComposition(
                it,
                isBottomSheetBahaviour,
                subsFoundForEvent, eventOrgProductForThisPage?:null
            )
            viewModel.showProductPage.postValue(true)
            //viewModel.showShimmer.postValue(false)
        }
    }

    fun dpToPixel(context: Context?, dp: Float): Float {
        return if (context != null) {
            val density = context.resources.displayMetrics.density
            val pixel = dp * density
            pixel.toFloat()
        } else {
            dp.toFloat()
        }
    }


    private fun initClickListeners() {
        /* val stickyNotStickyNotificationCallback = object : StickyNotStickyNotificationCallback {
             override fun onButtonClick(notificationData: StickyNonStickyNotificationModel) {
                 Toast().showCustomToastMessage(requireActivity(), notificationData.buttonText)
             }

             override fun onViewClick(notificationData: StickyNonStickyNotificationModel) {

             }

         }

         binding.applyCouponNotification.setNotificationCallback(stickyNotStickyNotificationCallback)

 */
        /* binding.btnPrimaryLarge.setOnSingleClickListener {
             Log.d("PDVM Header Search", "Cart icon add call back")
             if (viewModel.showPlusIconForAddButton.value == true) {
                 if (viewModel.productDetailLiveData.value?.suggestion != null) {
                     val bundle = Bundle()
                     val model = Gson().toJson(viewModel.productDetailLiveData.value)
                     bundle.putString(BundleConstants.PRODUCT_ORD_SUBS_DETAIL, model)
                     val orgSubCompareFragment = OrgSubCompareBottomSheet().newInstance()
                     orgSubCompareFragment.isCancelable = true
                     orgSubCompareFragment.arguments = bundle

                     orgSubCompareFragment.setCallback(object :
                         OrgSubCompareBottomSheetCallback {
                         override fun closeClick() {
                             // viewmodel.reloadSearchResultList(items)
                         }

                     })


                     if (!orgSubCompareFragment.isVisible && isSingleClick()) activity?.supportFragmentManager?.let { it1 ->
                         orgSubCompareFragment.show(
                             it1, "OrgSubsCompareBottomsheet"
                         )
                     }
                 }

             } else {
                 // viewModel.productDetailLiveData
                 // viewModel.addToCart()


             }


             //new code added for now


         }
 */

        binding.doubleStackProductCard.setCallback(viewModel.productCardSectionCallBack)

        binding.tmCarts.setCallback(object : CartsCallback {
            override fun viewClickCallback(viewType: CartsConstants) {
                when (viewType) {
                    CartsConstants.VIEW_CART -> {
                        //startActivity(Intent(activity, CartActivity::class.java))
                        viewModel.onViewCartClicked("view_cart")
                        viewModel.sendViewCartClickFirebaseEvent()
                    }

                    CartsConstants.VIEW_BILL -> Log.d("*** PDActivity", " View Bill clicked")
                    CartsConstants.PROCEED -> Log.d("*** PDActivity", " Cart Proceed clicked")
                }
            }

        })

        binding.tmRecommendedSubstituteUpsell.setCallback(object : RecommendedSubstituteCallback {
            override fun recommendedExpanded() {
                binding.clUserBoughtTooltip.visibility = View.GONE
                viewModel.pdPageSubView(FbSubsView(productSellingPrice = viewModel._productDetail.value?.suggestion?.sellingPrice, productMrp = viewModel._productDetail.value?.suggestion?.mrp))
                viewModel.subsPopup(FbSubsView(productSellingPrice = viewModel._productDetail.value?.suggestion?.sellingPrice, productMrp = viewModel._productDetail.value?.suggestion?.mrp))
                viewModel.substituteDropdownViewed(FirebaseEventModel(customerId = SharedPrefManager.getInstance().loggedInUserId, mobile = SharedPrefManager.getInstance().loggedInUserMobile, pageName = "PdPage", variantId = SharedPrefManager.getInstance().algoSpecificVariantId.toInt()))
                Log.d("TAG", "recommendedExpanded: ")
            }

            override fun recommendedCollapsed() {
                binding.clUserBoughtTooltip.visibility = View.VISIBLE
                viewModel.substituteDropdownClosed(FirebaseEventModel(customerId = SharedPrefManager.getInstance().loggedInUserId, mobile = SharedPrefManager.getInstance().loggedInUserMobile, pageName = "PdPage", variantId = SharedPrefManager.getInstance().algoSpecificVariantId.toInt()))
                Log.d("TAG", "recommendedCollapsed: ")
            }
        })

        binding.tmCompositionCard.setCallback(object : CompositionCallback {
            override fun cardClickCallback() {
                launchCompositionDetailsBottomsheet()
            }

            override fun viewClickCallback() {
                launchCompositionDetailsBottomsheet()
            }

        })

        binding.faqCategories.setEventListner(object : FaqCallBack {
            override fun viewClickCallback(position: Int) {
                if (viewModel.productInfoLiveData.value == null) return
                if (viewModel.productInfoLiveData.value?.listDataHeader.isNullOrEmpty()) return
                viewModel.sendMedicineDetailsViewedViewedEvent(
                    /*                    when (position) {
                                            0 -> "Introduction"
                                            1 -> "Medicine Activity"
                                            2 -> "Uses"
                                            3 -> "Directions for use"
                                            4 -> "Side effects"
                                            5 -> "Additional Information"
                                            else -> ""
                                        }*/
                    viewModel.productInfoLiveData.value!!.listDataHeader[position]
                )
            }
        })

        binding.manufacturerDetailsCategories.setEventListner(object : FaqCallBack {
            override fun viewClickCallback(position: Int) {
                binding.nestedScrollView.postDelayed({
                    binding.nestedScrollView.smoothScrollTo(
                        0,
                        binding.manufacturerDetailsCategories.bottom
                    )
                }, 50)
                viewModel.sendMedicineDetailsViewedViewedEvent("Manufacturer Details")

            }

        })
    }

    private fun launchCompositionDetailsBottomsheet() {
        val compositionDetailsBottomSheet = CompositionDetailsBottomSheet().newInstance(
            viewModel.getCompositionUILiveData.value?.molecules
        )
        compositionDetailsBottomSheet.isCancelable = true

        if (!compositionDetailsBottomSheet.isVisible && isSingleClick()) activity?.supportFragmentManager?.let {
            compositionDetailsBottomSheet.show(
                it, "CompositionBottomsheet"
            )
            viewModel.sendMedicineDetailsViewedViewedEvent("Composition")
        }
    }

    private fun addObservers() {

        applyCouponCallBack = object : ApplyCouponCallback {
            override fun applyCouponButtonClick() {
                Toast().showCustomToastMessage(requireActivity(), "apply coupon clicked ")
                activity?.supportFragmentManager?.let {
                    couponSavingPopUp.show(
                        it, "PurchaseConfirmationDialog.TAG"
                    )
                }
            }

            override fun applyCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
//                Toast().showCustomToastMessage(this@HomePageActivity, "apply coupon clicked with response ${Gson().toJson(couponCodeResponse)}")
                if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                    viewModel.setCartCount()
                    viewModel.applyCouponClick(couponCodeResponse)
                } else {
                    Log.e("currentPayableAmount","::::"+viewModel.cartModel.value?.amount)
                    viewModel.calculateSavingAmount(couponCodeResponse,viewModel.cartModel.value?.amount?:0.0)
                }
            }

            override fun removeCouponButtonClick() {
                Toast().showCustomToastMessage(requireActivity(), "remove coupon clicked ")
            }

            override fun removeCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
                couponCodeResponse?.offerId.let { offerID ->
                    Log.d("TAG", "removeCouponButtonClick: $offerID")
                    if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                        viewModel.removeCouponClick(couponCodeResponse)
                    } else {
                        viewModel.callCouponRemovedEventForOfflineCouponCase(viewModel.billDetailsData,"product_detail_page",couponCodeResponse,0)
                      //  viewModel.callCouponRemovedEventForOfflineCouponCase(null,"product_detail_page",couponCodeResponse,0)
                        SharedPrefManager.getInstance().offerId = "0"
                        SharedPrefManager.getInstance().couponModel = null
                        SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                        Log.d("Intent", "onCreate: setParameter call 14:::"+SharedPrefManager.getInstance().couponDiscount.toDouble())

                        SharedPrefManager.getInstance().setCouponDiscount(0f)
                        viewModel.setCartCount()
                        viewModel.stopCouponTimer()
                        stickyNotificationWithCallBack(couponCodeResponse, "")
                    }

//                    viewModel.setOfferIdForOrderId(offerID)
//                    viewModel.changeCouponButtonState(true, offerID)
                }
            }
        }
        viewModel.ftcCouponData.observe(viewLifecycleOwner) {
            if (it == null) {
                binding.applyCouponNotification.visibility = View.GONE
            }
            it?.let {
                Log.d("TAG", "setListener: maxDis = ${it.maxDiscount} ")
                if (SharedPrefManager.getInstance()?.couponModel?.showFtcCounter != null && SharedPrefManager.getInstance()?.couponModel?.showFtcCounter == true && SharedPrefManager.getInstance()?.couponModel?.promoCode == it.promoCode) {
                    if (SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime - System.currentTimeMillis() > 0L) {

                        viewModel.startTimer(
                            Coupon.ENDS_IN.prefix,
                            SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L
                        ) { time ->
                            if (time != getString(R.string.timer_ends_string)) {
                                runOnUiThread {
                                    stickyNotificationWithCallBack(it, time)
                                }
                            } else {
                                viewModel.stopCouponTimer()
                                runOnUiThread {
                                    stickyNotificationWithCallBack(it, "")
                                }
                            }
                        }
                    } else {
                        viewModel.stopCouponTimer()
                        stickyNotificationWithCallBack(it, "")
                    }

                } else {
                    viewModel.stopCouponTimer()
                    stickyNotificationWithCallBack(it, "")
                }
                viewModel.urgencyStickyViewedEvent(it)
            }
        }
        viewModel.eventOpenCouponPopup.observe(viewLifecycleOwner, EventObserver {
            if( SharedPrefManager.getInstance().incompleteOrderId>0) {
                viewModel.viewModelScope.launch(Dispatchers.IO) {
                    viewModel.calculateBillDetailsAfterCouponApplied(
                        SharedPrefManager.getInstance().incompleteOrderId)
                }}


            try {
                if (it.second?.message.equals("Success")) {
                    if (it.second?.responseData?.isOfferApplied == true) {
                        //SharedPrefManager.getInstance().offerId = it.first.offerId.toString()
                        SharedPrefManager.getInstance().couponModel = it.first
                        Log.d("Intent", "onCreate: setParameter call 17:::"+SharedPrefManager.getInstance().couponDiscount.toDouble())

                        /*SharedPrefManager.getInstance()
                                .setCouponDiscount(it.second?.responseData?.couponDiscount?.toFloat() ?: 0f)*/
                        viewModel.setCartCount()
                        if (it.first?.expiryDate!! > 0 && it.first?.showFtcCounter!!) {
                            Log.i("expiryDate", "" + it.first?.currentDate!!.toLong())
                            //SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime = it.first.currentDate!!.toLong()
                            SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                                    System.currentTimeMillis()
                            Log.d("CouponExpiryTime", "" + System.currentTimeMillis())
                            it.first?.expiryDate =
                                    SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                            Log.i("expiryDate", "" + it.first?.expiryDate)

                        }
                        if (SharedPrefManager.getInstance().couponModel.showFtcCounter != null && SharedPrefManager.getInstance()?.couponModel?.showFtcCounter == true) {
                            if (it.first?.expiryDate!! - System.currentTimeMillis() > 0L) {

                                viewModel.startTimer(
                                        Coupon.ENDS_IN.prefix,
                                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L
                                ) { time ->
                                    runOnUiThread {
                                        stickyNotificationWithCallBack(it.first, time)
                                    }
                                }
                            } else {
                                viewModel.stopCouponTimer()
                                stickyNotificationWithCallBack(it.first, "")
                            }

                        } else {
                            viewModel.stopCouponTimer()
                            stickyNotificationWithCallBack(it.first, "")
                        }

                        val callback = object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {
                                dialog?.dismiss()
                            }

                            override fun onCloseButtonClicked() {
                            }
                        }
                        /**
                         * This pop up is used to show savings on coupon
                         */

                        dialog = CouponApplySuccess(
                                couponCode = it.first?.promoCode ?: "",
                                saving = it.second?.responseData?.couponDiscount ?: 0.0,
                                callback = callback,
                                expiryTime = it.first?.expiryDate ?: 0L,
                                isFtcCounterEnabled = it.first?.showFtcCounter == true,
                                description = it.second?.responseData?.description?.joinToString(separator = "\n"),
                                //description = it.second?.responseData?.description,
                                tnc = it.second?.responseData?.tnc,
                                ftcViewModel
                        )
                        (dialog as CouponApplySuccess).isCancelable = true
                        if (!(dialog as CouponApplySuccess).isVisible) {
                            activity?.supportFragmentManager?.let { it1 ->
                                dialog?.show(
                                        it1,
                                        "CouponApplySuccess"
                                )
                            }
                        }
                    } else {
                        openApplyCouponValidationPopup(it.first, it.second)
                    }

                }
                else {
                    val callback = object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            dialog?.dismiss()
                        }

                        override fun onCloseButtonClicked() {
                        }
                    }

                    /**
                     * This pop up is used to show error on coupon
                     */
//                SharedPrefManager.getInstance().offerId = "0"
//                SharedPrefManager.getInstance().couponModel = null
                    dialog = CouponErrorPopup(
                            couponCode = it.first?.promoCode ?: "",
                            cartValue = it.first?.minCartValue ?: 0,
                            message = getString(R.string.couponErrorMsg_without_dot) + (it.first?.minCartValue
                                    ?: 0.0) + getString(
                                    R.string.couponErrorMsgAvailable
                            ),
                            callback = callback,
                    )
                    (dialog as CouponErrorPopup).isCancelable = true
                    if (!(dialog as CouponErrorPopup).isVisible) {
                        activity?.supportFragmentManager?.let { it1 ->
                            dialog?.show(
                                    it1,
                                    "CouponApplySuccess"
                            )
                        }
                    }


                }
            }catch (_:Exception){}
        })

        viewModel.eventOpenCouponPopupOffline.observe(viewLifecycleOwner, EventObserver {
            var dialog: DialogFragment? = null
            try{
                if (it.second.isSuccess) {
                    viewModel.stopCouponTimer()
                    SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                        System.currentTimeMillis()
                    SharedPrefManager.getInstance().offerId = it.first?.offerId.toString()
                    SharedPrefManager.getInstance().couponModel = it.first

                    SharedPrefManager.getInstance().couponDiscount = it.second.couponAppliedAmt.toFloat()
                    viewModel.setCartCount()
                    if (SharedPrefManager.getInstance().couponModel.showFtcCounter != null && SharedPrefManager.getInstance()?.couponModel?.showFtcCounter == true) {

                        if (SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime - System.currentTimeMillis() > 0L) {
                            viewModel.startTimer(
                                Coupon.ENDS_IN.prefix,
                                SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L
                            ) { time ->
                                runOnUiThread {
                                    stickyNotificationWithCallBack(it.first, time)
                                }
                            }
                        } else {
                            viewModel.stopCouponTimer()
                            stickyNotificationWithCallBack(it.first, "")
                        }

                    } else {
                        viewModel.stopCouponTimer()
                        stickyNotificationWithCallBack(it.first, "")
                    }
                    val callback = object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            dialog?.dismiss()
                        }

                        override fun onCloseButtonClicked() {
                        }
                    }
                    /**
                     * This pop up is used to show savings on coupon
                     */
                    /**
                     * This pop up is used to show savings on coupon
                     */
                    SharedPrefManager.getInstance().offerId = it.first?.offerId.toString()
                    SharedPrefManager.getInstance().couponModel = it.first
                    if (it.first?.expiryDate!! > 0 && it.first?.showFtcCounter!!) {
                        Log.i("expiryDate", "" + it.first?.currentDate!!.toLong())
                        //SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime = it.first.currentDate!!.toLong()
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                            System.currentTimeMillis()
                        it.first?.expiryDate =
                            SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                        Log.i("expiryDate", "" + it.first?.expiryDate)

                    }
                    dialog = CouponApplySuccess(
                        couponCode = it.first?.promoCode ?: "",
                        saving = it.second?.savingAmount ?: 0.0,
                        callback = callback,
                        expiryTime = it.first?.expiryDate ?: 0L,
                        isFtcCounterEnabled = it.first?.showFtcCounter == true,
                        description = null,
                        tnc = null,
                        ftcViewModel
                    )
                    dialog?.isCancelable = true
                    if (!dialog?.isVisible!!) {
                        activity?.supportFragmentManager?.let { it1 ->
                            dialog?.show(
                                it1,
                                "CouponApplySuccess"
                            )
                        }
                    }

                }
                else {
                    val callback = object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            dialog?.dismiss()
                        }

                        override fun onCloseButtonClicked() {
                        }
                    }

                    /**
                     * This pop up is used to show error on coupon
                     */

                    /**
                     * This pop up is used to show error on coupon
                     */
//                SharedPrefManager.getInstance().offerId = "0"
//                SharedPrefManager.getInstance().couponModel = null
                    dialog = CouponErrorPopup(
                        couponCode = it.first?.promoCode ?: "",
                        cartValue = it.first?.minCartValue ?: 0,
                        message = it.second.message,
                        callback = callback,
                    )
                    dialog?.isCancelable = true
                    if (!dialog?.isVisible!!) {
                        activity?.supportFragmentManager?.let { it1 ->
                            dialog?.show(
                                it1,
                                "CouponApplySuccess"
                            )
                        }
                    }


                }
            }catch (_:Exception){

            }

        })
        //binding.nestedScrollView.visibility = View.VISIBLE
        viewModel.eventShowError.observe(viewLifecycleOwner, EventObserver { it ->
            if (it != null && it.equals(ERRORS.NO_PRODUCT_DETAIL_FOUND)) {
                pdInternalServerErrorCallback?.let { internalServerCallback ->
                    if (!isBottomSheetBahaviour) {
                        internalServerCallback.showInternalServerErrorDialogActivity()
                    } else {
                        internalServerCallback.showInternalServerErrorDialogBottomsheet()
                    }
                }
            }
        })

        viewModel.showShimmerLiveData.observe(viewLifecycleOwner) {
            if (it) {
                binding.shimmerViewContainer.startShimmerAnimation()
            } else {
                binding.shimmerViewContainer.stopShimmerAnimation()
            }
        }

        viewModel.eventBaseMessage.observe(viewLifecycleOwner, EventObserver {
            if(it==null)return@EventObserver
            when {
                it.equals(MESSAGES.REMOVED_COUPON_SUCCESSFULLY) -> {
                    viewModel.stopCouponTimer()
                    Log.d("TAG", "setObservers: REMOVED_COUPON_SUCCESSFULLY")
                    viewModel.ftcCouponResponse?.let {
                        stickyNotificationWithCallBack(
                            it.first(),
                            ""
                        )
                    }
                    Log.d("Intent", "onCreate: setParameter call 19:::"+SharedPrefManager.getInstance().couponDiscount.toDouble())

                    SharedPrefManager.getInstance().setCouponDiscount(0f)
                    viewModel.setCartCount()
                }
            }
        })

        viewModel.productDetailLiveData.observe(viewLifecycleOwner) {
            it?.let {
                if (!viewModel.isSubs && !isBottomSheetBahaviour) {
                    if (it.suggestion == null) {
                        binding.tmRecommendedSubstituteUpsell.visibility = View.GONE
                        binding.clUserBoughtTooltip.visibility = View.GONE
                    } else {
                        binding.tmRecommendedSubstituteUpsell.visibility = View.VISIBLE
                        binding.clUserBoughtTooltip.visibility = View.VISIBLE
                        if((it.suggestion?.qty?:0) > 0){
                            lifecycleScope.launch {
                                delay(100)
                                binding.tmRecommendedSubstituteUpsell.initialExpandedState()
                            }
                        }
                    }
                }
                if (it.suggestion == null /*&& !it.isOrgAddedToCart*/) {
//                    binding.btnPrimaryLarge.visibility = View.GONE
                    //  binding.btnSubsStepper.visibility = View.VISIBLE
                    binding.pdpStickyHeader.updateStepperQuantity(0)
                }

                if (it.product.availabilityStatus == null) {
                    val qty = it.product.qty ?: 0
                    if (qty > 0 /*&& !it.isOrgAddedToCart*/) {
//                        binding.btnPrimaryLarge.visibility = View.GONE
                        //                    binding.btnSubsStepper.visibility = View.VISIBLE
                        binding.pdpStickyHeader.updateMaxCapQuantity(it.product.maxCappedQty ?: 1)
                        binding.pdpStickyHeader.updateStepperQuantity(qty)
                    }
                } else {
//                    binding.btnPrimaryLarge.visibility = View.GONE
                    //                   binding.btnSubsStepper.visibility = View.GONE
                    binding.pdpStickyHeader.updateAvailabilityStatus(
                        it.product.availabilityStatus,
                        ContextCompat.getColor(requireActivity(), R.color.error_msg_color)
                    )
                }

                setUserToolTip(it.suggestion?.customerAlsoBoughtMsg ?: "", it.product.skuName ?: "")

                /**
                 *  In below scenarios, "Recommended Section" should be hided
                 *  1. isSubs (from intent)
                 *  2. isSubsFound (from api - true) ,
                 *  2.a) suggestion = null
                 *  2.b) original product code and suggestion product code is same
                 */

                var updatedIsSubsFound = it.product.subsFound
                if (viewModel.isSubs || (it.product.subsFound && (it.suggestion == null || (it.product.productCode == it.suggestion?.productCode)))) {
                    updatedIsSubsFound = false
                }
                binding.isSubsFound = updatedIsSubsFound
                viewModel.setCartCount()
            }
        }

        viewModel.getBannerLiveData.observe(viewLifecycleOwner) { bannerList ->

            if (!bannerList.isNullOrEmpty()) {
                binding.bannerPlaceHolder.visibility = View.GONE
                binding.pdpBanner.visibility = View.VISIBLE
                binding.pdpPgIndicator.visibility = View.VISIBLE
                if (isAdded){
                    mViewPagerAdapter = BannerViewpagerAdapter(requireActivity(), bannerList, this,
                        viewModel.productDetailLiveData.value?.product?.drugType)
                }

                binding.pdpBanner.adapter = mViewPagerAdapter
                with(binding.pdpPgIndicator) {
                    setActivePage(0)
                    setPageCount(bannerList.size)
                    setViewPageIndicator()
                }
                binding.pdpBanner.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                    override fun onPageScrolled(
                        position: Int,
                        positionOffset: Float,
                        positionOffsetPixels: Int
                    ) {

                    }

                    override fun onPageSelected(position: Int) {
                        binding.pdpPgIndicator.setActivePage(position)
                    }

                    override fun onPageScrollStateChanged(state: Int) {}

                })
            } else {
                binding.bannerPlaceHolder.visibility = View.VISIBLE
                binding.pdpBanner.visibility = View.GONE
                binding.pdpPgIndicator.visibility = View.GONE
            }

        }

        viewModel.launchOrgSubsBottomSheet.observe(viewLifecycleOwner) { it ->
            if (it) {
                if (viewModel.showPlusIconForAddButton.value == true) {
                    val bundle = Bundle()
                    val model = Gson().toJson(viewModel.productDetailLiveData.value)
                    bundle.putString(BundleConstants.PRODUCT_ORD_SUBS_DETAIL, model)
                    bundle.putString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "pd")
                    val orgSubCompareFragment = OrgSubCompareBottomSheet().newInstance()
                    orgSubCompareFragment.isCancelable = true
                    orgSubCompareFragment.arguments = bundle
                    orgSubCompareFragment.setCallback(object :
                        OrgSubCompareBottomSheetCallback {
                        override fun closeClick(isReload: Boolean) {
                            // viewmodel.reloadSearchResultList(items)
                        }

                    })

                    if (!orgSubCompareFragment.isVisible && isSingleClick()) activity?.supportFragmentManager?.let { it1 ->
                        orgSubCompareFragment.show(
                            it1, "OrgSubsCompareBottomsheet"
                        )
                    }
                    viewModel.pdPageSubView(FbSubsView(productSellingPrice = viewModel._productDetail.value?.suggestion?.sellingPrice, productMrp = viewModel._productDetail.value?.suggestion?.mrp))
                    viewModel.subsPopup(FbSubsView(productSellingPrice = viewModel._productDetail.value?.suggestion?.sellingPrice, productMrp = viewModel._productDetail.value?.suggestion?.mrp))
                } else {
                    // viewModel.productDetailLiveData
                    // viewModel.addToCart()
                }
            }
        }

        viewModel.eventOpenOrderSummaryActivity.observe(viewLifecycleOwner,
            EventObserver {
                navigateToOrderSummaryActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "search_result",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            })

        viewModel.eventOpenPrescriptionActivity.observe(viewLifecycleOwner,
            EventObserver {
                navigateToPrescriptionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "product_detail_page",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "toolbar_cart"
                    ),
                    isFlagAdded = true
                )
            })

        //event to launch CartActivity
        viewModel.eventOpenCartActivity.observe(viewLifecycleOwner,
            EventObserver {
                navigateToCartActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "product_detail_page",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            })


        viewModel.eventMessage.observe(viewLifecycleOwner, EventObserver {
            if(it!=null){
            if (it.messageEnum == MESSAGES.CART_ACTIVITY_LAUNCH) {
                if (isSingleClick()) {
                    navigateToCartActivity(
                        params = bundleOf(
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "product_detail_page",
                            BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                        ),
                        flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                    )
                    resetRecommendedSectionCollapseState()
                }
            } else if (it.messageEnum == MESSAGES.ORDER_SUMMARY_ACTIVITY_LAUNCH) {
                if (isSingleClick()) {
                    navigateToOrderSummaryActivity(  flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
                    resetRecommendedSectionCollapseState()
                }
            } else if (it.messageEnum == MESSAGES.SEARCH_SUGGESTION_LAUNCH) {
                if (isSingleClick()) {

                  //  val intent = Intent(activity, SearchSuggestionActivity::class.java)
                    if (isFromSearch) {
                       
                        /*intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        intent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "product_detail_page")
                        intent.putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                        startActivity(intent)*/

                        navigateToSearchSuggestionActivity(
                            params = bundleOf(
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "product_detail_page",
                                BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar",
                            ),
                            flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        )


                        //  activity?.finish()
                    } else {
                        navigateToSearchSuggestionActivity(
                            params = bundleOf(
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "product_detail_page",
                                BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar",
                            ),
                            flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        )


                        /*intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        intent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "product_detail_page")
                        intent.putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                        startActivity(intent)*/
                    }
                    resetRecommendedSectionCollapseState()
                }
            } else if (it.messageEnum == MESSAGES.PRODUCT_DETAIL_ACTIVITY_LAUNCH) {
                if (isSingleClick()) {
                    val model = Gson().toJson(viewModel.productDetailLiveData.value)

                   /* val myIntent = Intent(activity, ProductDetailActivity::class.java)
                    myIntent.putExtra(BundleConstants.IS_SUBS, true)
                    myIntent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "pdp")
                    myIntent.putExtra(
                        BundleConstants.PRODUCT_CODE,
                        viewModel.productDetailLiveData.value?.suggestion?.productCode
                    )

                    myIntent.putExtra(BundleConstants.ORG_PRODUCT_OF_SUBS, model)
                    myIntent.putExtra(
                        BundleConstants.SEARCH_TYPE,
                        ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                    )
                    startActivity(myIntent)*/

//                    resetRecommendedSectionCollapseState()

                    navigateToProductDetailActivity(
                        params = bundleOf(
                            BundleConstants.IS_SUBS to true,
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "pdp",
                            BundleConstants.PRODUCT_CODE to viewModel.productDetailLiveData.value?.suggestion?.productCode,
                            BundleConstants.ORG_PRODUCT_OF_SUBS to model,
                            BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                        )
                    )

                }
            } else if (it.messageEnum == MESSAGES.ORG_SUBS_BOTTOMSHEET_LAUNCH) {
                val bundle = Bundle()
                val model = Gson().toJson(viewModel.productDetailLiveData.value)
                bundle.putString(BundleConstants.PRODUCT_ORD_SUBS_DETAIL, model)
                bundle.putString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "pd")
                val orgSubCompareFragment = OrgSubCompareBottomSheet().newInstance()
                orgSubCompareFragment.setUpEventData(viewModel.suggestion_term_clicked_position, viewModel.suggestion_term_clicked, viewModel.term_searched, viewModel.clicked_suggsetion_type)
                orgSubCompareFragment.isCancelable = true
                orgSubCompareFragment.arguments = bundle

                orgSubCompareFragment.setCallback(object : OrgSubCompareBottomSheetCallback {
                    override fun closeClick(isReload: Boolean) {
                        // viewmodel.reloadSearchResultList(items)
                    }
                    override fun openPDPage(productCode: String?, subs: Boolean?) {
                        super.openPDPage(productCode, subs)
                        if (subs == true) {
                            /*if (orgSubCompareFragment.isVisible) {
                                orgSubCompareFragment.dismiss()
                            }*/
                            val productInfoGson =
                                Gson().toJson(viewModel.productDetailLiveData.value)
                          /*  startActivity(
                                Intent(activity, ProductDetailActivity::class.java)
                                    .putExtra(BundleConstants.PRODUCT_CODE, productCode)
                                    .putExtra(BundleConstants.IS_SUBS, true)
                                    .putExtra(BundleConstants.ORG_PRODUCT_OF_SUBS, productInfoGson)
                                    .putExtra(
                                        BundleConstants.SEARCH_TYPE,
                                        ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                                    )
                                    .putExtra(BundleConstants.IS_FROM_SEARCH, true)
                            )*/

                            navigateToProductDetailActivity(
                                params = bundleOf(
                                    BundleConstants.PRODUCT_CODE to productCode,
                                    BundleConstants.IS_SUBS to true,
                                    BundleConstants.ORG_PRODUCT_OF_SUBS to productInfoGson,
                                    BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString(),
                                    BundleConstants.IS_FROM_SEARCH to true
                                )
                            )
                        }
                    }
                })
                if (!orgSubCompareFragment.isVisible && isSingleClick()) activity?.supportFragmentManager?.let { it1 ->
                    orgSubCompareFragment.show(
                        it1, "OrgSubsCompareBottomsheet"
                    )
                }
                resetRecommendedSectionCollapseState()
                viewModel.pdPageSubView(FbSubsView(productSellingPrice = viewModel._productDetail.value?.suggestion?.sellingPrice, productMrp = viewModel._productDetail.value?.suggestion?.mrp))
                viewModel.subsPopup(FbSubsView(productSellingPrice = viewModel._productDetail.value?.suggestion?.sellingPrice, productMrp = viewModel._productDetail.value?.suggestion?.mrp))
            } else if (it.messageEnum == MESSAGES.REMOVED_COUPON_SUCCESSFULLY) {
                viewModel.stopCouponTimer()
                stickyNotificationWithCallBack(viewModel.ftcCouponData.value!!, "")
                Log.d("TAG", "setObservers: REMOVED_COUPON_SUCCESSFULLY")
                CommonFunc.showCustomToastMessage(requireActivity(), it.displayMessage)
            } else if (it.messageEnum == MESSAGES.SHOW_TOAST_MESSAGE) {
                CommonFunc.showCustomToastMessage(requireActivity(), getString(R.string.item_added))
            }}
        })

        viewModel.crosssellingClick.observe(viewLifecycleOwner, EventObserver {
            if(it != null) {
                val productDetailsBottomSheet =
                    ProductDetailBottomSheet(
                        it.product.productCode ?: "",
                        false,
                        isFromCrossSelling = true,
                        listener = pdBottomsheetCallbackListener, isMRPSellingDivideByQty = false,
                        clickedOnPage = "product_detail_page",
                        pageSection = "customers_also_bought",

                    )
                productDetailsBottomSheet.isCancelable = true
                productDetailsBottomSheet.dataFromOrderStatus(
                    false,
                    it.toAppProductModel(),
                    isOTC = false
                )

                if (!productDetailsBottomSheet.isVisible && isSingleClickHandle()) {
                    activity?.supportFragmentManager?.let { it1 ->
                        productDetailsBottomSheet.show(
                            it1, "ProductDetailBottomsheet"
                        )
                        lastClickTime = SystemClock.elapsedRealtime()
                    }
                }
            }
        })


//        viewModel.crosssellingClick.observe(viewLifecycleOwner) { it ->
//            val productDetailsBottomSheet =
//                ProductDetailBottomSheet(
//                    it.product.productCode ?: "",
//                    false,
//                    isFromCrossSelling = true,
//                    listener = pdBottomsheetCallbackListener, isMRPSellingDivideByQty = false,
//                    clickedOnPage = "product_detail_page",
//                    pageSection = "customers_also_bought"
//                )
//            productDetailsBottomSheet.isCancelable = true
//            productDetailsBottomSheet.dataFromOrderStatus(
//                false,
//                it.toAppProductModel(),
//                isOTC = true
//            )
//
//            if (!productDetailsBottomSheet.isVisible && isSingleClickHandle()) {
//                activity?.supportFragmentManager?.let { it1 ->
//                    productDetailsBottomSheet.show(
//                        it1, "ProductDetailBottomsheet"
//                    )
//                    lastClickTime = SystemClock.elapsedRealtime()
//                }
//            }
//        }

        /* viewModel.cartItemCount.observe(requireActivity(), Observer {
             setMedicineDetailHeader()
             handleBottomCartVisibility(it)
             binding.pdpHeader.updateHeaderChipCount(it.toString())
             binding.tmCarts.updateTotalItemsInCartCount(it, viewModel.cartTotal)
         })
 */
        viewModel.cartModel.observe(viewLifecycleOwner) {
            binding.pdpHeader.updateHeaderChipCount((it?.count ?: 0))
            binding.tmCarts.updateTotalItemsInCartCount(
                it?.count ?: 0,
                it?.amount ?: 0.0,
                SharedPrefManager.getInstance().prescriptionCount
            )
        }

        viewModel.pdpStickyHeader.observe(viewLifecycleOwner) {
            binding.pdpStickyHeader.setUpMobileSectionHeadersData(it)
            binding.pdpStickyHeader.updateMaxCapQuantity(
                viewModel.productDetailLiveData.value?.product?.maxCappedQty ?: 1
            )
            if (viewModel.productDetailLiveData.value?.isOrgAddedToCart == true) {
                binding.pdpStickyHeader.handleVisibilityOfQuantityStepper(isShowStepper = false)
            }
        }

        viewModel.recommenededUpdatedCount.observe(viewLifecycleOwner) {
            binding.tmRecommendedSubstituteUpsell.updateOrgQuantity(it)
        }

        viewModel.getRecommendedLiveData.observe(viewLifecycleOwner) {
            it?.let {
                if (!viewModel.productDetailLiveData.value?.product?.availabilityStatus.isNullOrEmpty()) {
                    lifecycleScope.launch {
                        delay(100)
                        binding.tmRecommendedSubstituteUpsell.initialExpandedState()
                    }
                }
            }

        }

        /*
                viewModel.notificationDetailData.observe(requireActivity(), Observer {
                    if (it != null && !it.coupon_code_title.isNullOrEmpty()) {
                        val model = StickyNonStickyNotificationModel(
                            message = it.coupon_code_title,
                            amount = 0.0,
                            subTitle = "",
                            timer = "",
                            buttonText = "",
                            drawableRight = ContextCompat.getDrawable(
                                requireActivity(),
                                com.intellihealth.salt.R.drawable.ic_chevron_right_white
                            ),
                            drawableLeft = ContextCompat.getDrawable(
                                requireActivity(),
                                com.intellihealth.salt.R.drawable.percentage
                            ),
                            buttonIcon = ContextCompat.getDrawable(
                                requireActivity(),
                                com.intellihealth.salt.R.drawable.icon_refresh
                            )
                        )
                        binding.applyCouponNotification.setStickyNonStickyNotificationData(model)
                        binding.applyCouponNotification.visibility = View.VISIBLE
                    } else {
                        binding.applyCouponNotification.visibility = View.GONE
                    }
                })
        */

        viewModel.orgCount.observe(viewLifecycleOwner, Observer { it ->

            /* Linking of Org count -with header/medicine details/Compare and choose -Org card
            *  If Stepper qty-
            *  a) > 0 :
            *  a.1) > 1, Modified qty will get reflect/updated in all 3 places
            *  a.2) = 1 and user changes it to 0 further ie.to delete , and if from PD page-notifyDeleteCallback-true callback will open 'remove'  bottomsheet
            *  b) qty = 0, stepper will get replaced with 'Add' plus button  */
            if (it.qty > 0) {
//                binding.btnPrimaryLarge.visibility = View.GONE
                //              binding.btnSubsStepper.visibility = View.VISIBLE
                binding.btnSubsStepper.setQty(it.qty)
                binding.pdpStickyHeader.updateStepperQuantity(it.qty)

                if (it.qty == 1 && it.notifyDeleteCallback == true) {
                    isDeleteBSFromProduct = true
                    isDeleteBSFromDoubleStack = false
                    isDeleteBSFromSuggestion = false
                    viewModel.productDetailLiveData.value?.product?.productCode?.let {
                        showConfirmationDialog(
                            it, isSubs = false
                        )
                    }
                }

            } else {
//                binding.btnPrimaryLarge.visibility = View.VISIBLE
                //           binding.btnSubsStepper.visibility = View.GONE
                binding.btnSubsStepper.setQty(0)
                binding.pdpStickyHeader.updateStepperQuantity(0)
            }
            viewModel.setCartCount()
        })


        viewModel.deleteProductEventListener.observe(viewLifecycleOwner, EventObserver {
            if (it != null && it) {
                editDeleteAddressBottomSheet.isCancelable = true
                if (!editDeleteAddressBottomSheet.isVisible)
                    if (isSingleClick()) {
                        showConfirmationDialog("", false)
                        /*editDeleteAddressBottomSheet.setBottomSheet(viewModel)
                        editDeleteAddressBottomSheet.show(supportFragmentManager, "Discard unsaved details?")*/
                    }
            } else {
                if (editDeleteAddressBottomSheet.isVisible) {
                    editDeleteAddressBottomSheet.dismiss()
                }
            }
        })

        cartViewModel.isDelete.observe(viewLifecycleOwner, EventObserver {
            if (it != null && it) {
                if (!isDeleteBSFromDoubleStack && (isDeleteBSFromSuggestion || viewModel.isSubs)) {
                    productCodeToDelete =
                        viewModel.productDetailLiveData.value?.suggestion?.productCode ?: ""
                        viewModel.sendPdPageDeleteEvent(productCodeToDelete,viewModel.productDetailLiveData.value?.suggestion?.skuName)
                } else if (!isDeleteBSFromDoubleStack && isDeleteBSFromProduct) {
                    productCodeToDelete =
                        viewModel.productDetailLiveData.value?.product?.productCode ?: ""
                    viewModel.sendPdPageDeleteEvent(productCodeToDelete,viewModel.productDetailLiveData.value?.product?.skuName)
                }

                if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                    val editList: List<MedicineDto> = viewModel.getEditOrderRequestData(
                        productCodeToDelete,
                        0
                    )
                    //Log.d("***"," productCode :" + productCode+ " : " + editList[0].toString())

                    if (!editList.isNullOrEmpty()) {
                        if (editList.get(0).productDetailsId == null || editList.get(0).productDetailsId == 0L) {
                            deleteProductOrSuggestionFromDatabase()
                            dismissProductDetailBottomsheet(productCodeToDelete)
                        } else {
                            viewModel.editMedicine(
                                SharedPrefManager.getInstance().incompleteOrderId,
                                editList,
                                true,
                                cartViewModel.activePage,
                                isDeleteBSFromSuggestion
                            )
                            if (isDeleteBSFromSuggestion) binding.tmRecommendedSubstituteUpsell.updateOrgQuantity(
                                0
                            )
                            if (!isDeleteBSFromSuggestion) {
                                binding.btnSubsStepper.setQty(0)
                                binding.pdpStickyHeader.updateStepperQuantity(0)
                            }
                        }
                    } else {
                        deleteProductOrSuggestionFromDatabase()
                        dismissProductDetailBottomsheet(productCodeToDelete)
                    }
                } else {
                    deleteProductOrSuggestionFromDatabase()
                    dismissProductDetailBottomsheet(productCodeToDelete)
                }
            } else {
                if (editDeleteAddressBottomSheet.isVisible) {
                    editDeleteAddressBottomSheet.dismiss()
                }
            }
        })

        /* Linking of Subs count -with recommended sub/Compare and choose -Subs card
             *  If Stepper qty-
             *  a) > 0 :
             *  a.1) > 1, Modified qty will get reflect/updated in above 2 places
             *  a.2) = 1 and user changes it to 0 further ie.to delete , and if from PD page-notifyDeleteCallback-true callback will open 'remove'  bottomsheet
             *  b) qty = 0, stepper will updated to 0  */

        viewModel.subsCount.observe(viewLifecycleOwner, Observer { it ->
            viewModel.setCartCount()
            if (it.notifyDeleteCallback == true) {
                binding.tmRecommendedSubstituteUpsell.updateOrgQuantity(it.qty)
                viewModel.productDetailLiveData.value?.suggestion?.productCode?.let {
                    isDeleteBSFromSuggestion = true
                    isDeleteBSFromDoubleStack = false
                    isDeleteBSFromProduct = false
                    showConfirmationDialog(
                        it, isSubs = false
                    )
                }
            } else {
                viewModel.setCartCount()
                binding.tmRecommendedSubstituteUpsell.updateOrgQuantity(it.qty)
            }

        })

        viewModel.editMedicineApiSuccess.observe(viewLifecycleOwner, Observer { it ->
            if (it) {
                deleteProductOrSuggestionFromDatabase()
            }
        })

        viewModel.doubleStackDeleteData.observe(viewLifecycleOwner, Observer { pos ->
            productCodeToDelete =
                viewModel.getDoubleStackListLiveData.value?.get(pos)?.product?.productCode ?: ""
            if (productCodeToDelete != null) {
                showConfirmationDialog(
                    productCodeToDelete, isSubs = false
                )
                isDeleteBSFromDoubleStack = true
                isDeleteBSFromProduct = false
                isDeleteBSFromSuggestion = false
                posDeleteBSFromDoubleStack = pos
            }
        })

        /* viewModel.eventMessage.observe(requireActivity(), EventObserver {
             if(it.equals(MESSAGES.REMOVED_COUPON_SUCCESSFULLY)){
                 stickyNotificationWithCallBack(HomeViewModel.ftcCouponData.value!!, "")
                 Log.d("TAG", "setObservers: REMOVED_COUPON_SUCCESSFULLY")
             }
         })*/

        viewModel.eventInitiateLogin.observe(
            viewLifecycleOwner,
            EventObserver {
                if(it==null) return@EventObserver
                (activity as ProductDetailActivity).pageSection = it.toString()
                (activity as ProductDetailActivity).initializationTrueCallerOAuth()
            })

        val loader = Dialog(requireActivity())
        viewModel.isLoading.observe(viewLifecycleOwner) {
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }


    }

    private fun resetRecommendedSectionCollapseState() {
        lifecycleScope.launch {
            delay(100)
            binding.tmRecommendedSubstituteUpsell.resetSectionWithCollpasedState()
        }
    }

    private fun deleteProductOrSuggestionFromDatabase() {
        if (isDeleteBSFromSuggestion) {
            /* If remove suggestion - delete its entry from Database & update in recommended */
            viewModel.productDetailLiveData.value?.let { it1 ->
                viewModel.removeItemFromCart(it1, true)
            }
            binding.tmRecommendedSubstituteUpsell.updateOrgQuantity(0)
            //viewModel.setCartCount()
        } else if (isDeleteBSFromDoubleStack) {
            val doubleStackData =
                viewModel.getDoubleStackListLiveData.value?.get(posDeleteBSFromDoubleStack)
            if (doubleStackData != null) {
                viewModel.removeItemFromCart(doubleStackData, false)
            }
            viewModel.preapareDataForDoubleStack()
            //viewModel.setCartCount()
            if (editDeleteAddressBottomSheet.isVisible) {
                editDeleteAddressBottomSheet.dismiss()
            }
        } else if (isDeleteBSFromProduct) {
            /* If remove product - delete its entry from Database and update stepper-header to 0, Add+ btn visible */
            viewModel.productDetailLiveData.value?.let { it1 ->

                /* viewModel.deleteProductFromCart(
                     it1, false
                 )*/
                viewModel.removeItemFromCart(it1, false)
                if (it1.suggestion == null || viewModel.isSubs || isBottomSheetBahaviour) {
//                    binding.btnPrimaryLarge.visibility = View.GONE
                    //                   binding.btnSubsStepper.visibility = View.VISIBLE
                    binding.btnSubsStepper.setQty(0)
                    binding.pdpStickyHeader.updateStepperQuantity(0)
                } else {
//                    binding.btnPrimaryLarge.visibility = View.VISIBLE
                    //                  binding.btnSubsStepper.visibility = View.GONE
                    binding.btnSubsStepper.setQty(0)
                    binding.pdpStickyHeader.updateStepperQuantity(0)
                }

            }
        }
        //  viewModel.setCartCount()
        if (editDeleteAddressBottomSheet.isVisible) {
            editDeleteAddressBottomSheet.dismiss()
        }
    }

    private fun initBottomSheetBehavior(isBottomSheetBehavior: Boolean) {
        /* 1st condition : isSubs and full page , 2nd condition - cross selling bottomsheet*/
        if ((viewModel.isSubs && !isBottomSheetBahaviour) || isBottomSheetBahaviour) {
//            binding.btnPrimaryLarge.visibility = View.GONE
            //         binding.btnSubsStepper.visibility = View.VISIBLE
        }

        // Expanded by default
        if (!isBottomSheetBehavior) {
            binding.mainLayout.setBackgroundColor(resources.getColor(R.color.white))
        }
        if (isBottomSheetBahaviour) {
            val paddingDp: Int = 50
            val density: Float? = context?.resources?.displayMetrics?.density
            val paddingPixel: Int = (paddingDp * density!!).toInt()
            binding.scrollLayout.setPadding(0, 0, 0, paddingPixel)
        }
    }


    override fun onBannerClick(position: Int, bannerList: ArrayList<BannerItemModel>) {
        if (bannerList.isNotEmpty()) {
            val bannerImagesList = ArrayList<String>()
            for (i in bannerList.indices) {
                bannerImagesList.add(bannerList[i].imageUrl)
            }
            val bottomSheet = ViewPrescriptionBottomSheet(
                position,
                bannerImagesList,
                viewModel.productDetailLiveData.value?.product?.skuName.toString(), isFromPDPage = true
            )
            bottomSheet.isCancelable = true
            if (!bottomSheet.isVisible && isSingleClick()) {
                if (!bottomSheet.isVisible)
                    activity?.supportFragmentManager?.let {
                        bottomSheet.show(
                            it,
                            "ViewPrescriptionBottomSheet"
                        )
                    }
            }
            viewModel.sendPdpImageViewedEvent(
                MxPdpImageViewed(
                    bannerImagesList.size,
                    viewModel.productDetailLiveData.value?.product?.productCode,
                    viewModel.productDetailLiveData.value?.product?.skuName,
                    SharedPrefManager.getInstance().selectedWarehouseID
                )
            )
        }

    }


    private fun showConfirmationDialog(productCode: String, isSubs: Boolean) {

        editDeleteAddressBottomSheet.isCancelable = true
        if (!editDeleteAddressBottomSheet.isVisible && isSingleClick()) {
            editDeleteAddressBottomSheet.setBottomSheet(cartViewModel)
            activity?.supportFragmentManager?.let {
                editDeleteAddressBottomSheet.show(
                    it, "Discard unsaved details?"
                )
            }
        }
    }

    override fun dismissProductDetailBottomsheet(productCode: String) {
        if (productCode.isEmpty()) return
        if (viewModel.getDoubleStackSectionLiveData != null) {
            val updatedList = viewModel.updateCrossSellingRecommendedProducts(productCode)
            if (updatedList != null) {
                binding.doubleStackProductCard.reloadProductList(updatedList)
            }
        }

        viewModel.setCartCount()

    }

    private var mLastClickTime = 0L
    private fun isSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        this@ProductDetailFragment.mLastClickTime = now
        return now - lastClickTime >= MIN_DELAY_MS
    }

    private fun setUserToolTip(customerAlsoBought: String, composition: String) {

        tooltipList.clear()
        if (!customerAlsoBought.isNullOrEmpty()) {
            tooltipList.add(Pair(customerAlsoBought, R.drawable.icon_tooltip_social))
        }
        if (!composition.isNullOrEmpty()) {
            tooltipList.add(
                Pair(
                    "Has same composition as " + composition,
                    R.drawable.icon_tooltip_composition
                )
            )
        }
        tooltipList.add(Pair("Trusted by doctors", R.drawable.icon_tooltip_trustedby))
        /*  userToolTipList.add("FDA approved medicine")*/

        setUpUpdatingViews(
            binding.tvSubsUserBoughtWithPopup,
            binding.imSubsUserBoughtWithPopup,
            400
        )
    }


    private fun setUpUpdatingViews(tv: AppCompatTextView, iv: AppCompatImageView, count: Int) {
        var subsTakenCount = 0
        try {
            subsTakenCount = count
            subsTakenCount = subsTakenCount / 100
            if (subsTakenCount > 9990) subsTakenCount =
                9990 //restricting value to 999000 so that this field doesn't expand in second row
            if (subsTakenCount > 0) {
                subsTakenCount = subsTakenCount * 100
            }
        } catch (e: Exception) {
            e.printStackTrace()
            subsTakenCount = 0
        }
        /* textfirst = arrayOf<String>(
             "$subsTakenCount+ users bought this instead",
             "Has same composition as " + if (originalMedicineName == null) elasticSearchMedicineModel.getOriginalMedicineName() else originalMedicineName,
             "FDA Approved medicine ",
             "Trusted by doctors"
         )*/
        val finalSubsTakenCount = subsTakenCount
        run1 = Runnable {
            if (index >= tooltipList.size) {
                index = 0
            }
            if (index === 0) {
                if (finalSubsTakenCount <= 0) {
                    index++
                }
            }

            if (index < tooltipList.size) {
                val p = tooltipList[index]
                tv.text = p.first
                iv.setImageResource(p.second)
            }

            index++
            slideToTop(tv)
            slideToTop(iv)
            run1?.let {
                hand1.postDelayed(it, GET_DATA_INTERVAL)
                slideToTop(tv)
                slideToTop(iv)
            }

        }
        run1?.run()
    }


    fun slideToTop(view: View) {
        val animate = TranslateAnimation(0f, 0f, view.height.toFloat(), 0f)
        animate.duration = 500
        animate.fillAfter = true
        view.startAnimation(animate)
        view.visibility = View.VISIBLE
    }

    override fun onResume() {
        super.onResume()
        if (dialog != null)
            dialog?.dismiss()

        resumeCount++

        //if (!isBottomSheetBahaviour) { // coroutine on Main
            viewModel.productDetailLiveData.value?.let { productDetail ->
                productDetail.suggestion?.productCode?.let {
                    viewModel.getSuggestionRecommendedDBCount(
                        it
                    )
                }
                lifecycleScope.launch(IO) {
                    val count = viewModel.getMedicineCount(productDetail.product?.productCode ?: "")
                    lifecycleScope.launch(Dispatchers.Main) {
                        binding.btnSubsStepper.setQty(count)
                        binding.pdpStickyHeader.updateStepperQuantity(count)
                    }
                }
            }
        //}
        viewModel.setCartCount()

        if (resumeCount > 1 && SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()){
            viewModel.getFtcCouponsData()
            viewModel.productDetailLiveData.value?.let { viewModel.sendPdpViewedEvent(it,false, "") }
        }
    }

    fun openApplyCouponBottomSheet(couponResponse: CouponCodeResponse.Coupon?) {
        if (applyCouponCallBack != null) {
            viewModel.stopCouponTimer()
            val applyCouponBottomSheet =
                ApplyCouponBottomSheet(couponResponse, applyCouponCallBack!!)
            applyCouponBottomSheet.isCancelable = true
            if (!applyCouponBottomSheet.isVisible) {
                applyCouponBottomSheet.show(
                    parentFragmentManager, "CouponCodeOfferBottomSheet"
                )
            }
        }
    }

    private fun openApplyCouponValidationPopup(
        couponResponse2: CouponCodeResponse.Coupon?,
        couponResponse: CouponSaveRemoveResponse?
    ) {
        /**
         * Display Best offer already applied case
         */
        var dialogValidations: DialogFragment? = null
        val callback = object : PopUpDialogCallback {
            override fun onActionButtonClicked() {
                dialogValidations?.dismiss()
            }

            override fun onCloseButtonClicked() {

            }
        }
        dialogValidations = CouponErrorPopup(
            couponCode = couponResponse2?.promoCode ?: "",
            cartValue = 0,
            message = couponResponse?.responseData?.description?.get(0) ?: "",
            callback = callback,
        )
        dialogValidations.isCancelable = true
        if (!dialogValidations.isVisible) {
            dialogValidations.show(
                requireActivity().supportFragmentManager,
                "CouponNotApplied"
            )
        }

    }

    private fun stickyNotificationWithCallBack(
        couponResp: CouponCodeResponse.Coupon?,
        time: String
    ) {
        /*if ((couponResp.offerId ?: 0) > 0)
            binding.applyCouponNotification.visibility = View.VISIBLE
        else
            binding.applyCouponNotification.visibility = View.GONE

         */
        var message = ""
        message = if (SharedPrefManager.getInstance().couponModel == null) couponResp?.title ?: ""
        else if (SharedPrefManager.getInstance().couponModel.promoCode == (couponResp?.promoCode?:"")) SharedPrefManager.getInstance().couponModel.promoCode + " applied" else couponResp?.title
            ?: ""
        val data = StickyNonStickyNotificationModel(
            message = message,
            amount = couponResp?.maxDiscount ?: 0.0,
            subTitle = "",
            timer = if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel?.showFtcCounter == true && time != getString(
                    R.string.timer_ends_string
                )
            ) time else "",
            buttonText = "Apply",
            drawableRight = if (SharedPrefManager.getInstance().couponModel == null) {
                ContextCompat.getDrawable(
                    requireContext(),
                    com.intellihealth.salt.R.drawable.ic_chevron_right_white
                )
            } else if (SharedPrefManager.getInstance().couponModel.promoCode != (couponResp?.promoCode?:"")) {
                ContextCompat.getDrawable(
                    requireContext(),
                    com.intellihealth.salt.R.drawable.ic_chevron_right_white
                )
            } else {
                ContextCompat.getDrawable(
                    requireContext(),
                    com.intellihealth.salt.R.drawable.ic_right_arrow
                )
            },
            drawableLeft = if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode == (couponResp?.promoCode?:"")) ContextCompat.getDrawable(
                requireContext(),
                R.drawable.ic_purple_tick
            ) else ContextCompat.getDrawable(
                requireContext(),
                com.intellihealth.salt.R.drawable.percentage
            ),
            buttonIcon = null
        )
        val ftcNotificationCallback =
            object : StickyNotStickyNotificationCallback {
                override fun onButtonClick(notificationType: StickyNonStickyNotificationModel) {
                    Toast().showCustomToastMessage(
                        requireActivity(),
                        notificationType.buttonText
                    )
                }

                override fun onViewClick(notificationType: StickyNonStickyNotificationModel) {
                 //   viewModel.callEventApplyCouponClickedFromBaseVM()
                    if (CommonFunc.isSingleClickParam(500)) {
                        openApplyCouponBottomSheet(couponResp)
                        viewModel.urgencyStickyClickedEvent(couponResp)
                    }                }

            }

        binding.applyCouponNotification.setStickyNonStickyNotificationData(data)
        binding.applyCouponNotification.setNotificationCallback(
            ftcNotificationCallback
        )
        if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode == (couponResp?.promoCode?:"")) {
            binding.applyCouponNotification.setStickyUI(
                type = NotificationType.COUPON_APPLIED.type,
                position = NotificationPosition.TOP.position,
                isButtonVisible = NotificationButton.DISABLED.status
            )
        } else {
            viewModel.stopCouponTimer()
            binding.applyCouponNotification.setStickyUI(
                type = NotificationType.APPLY_COUPON.type,
                position = NotificationPosition.TOP.position,
                isButtonVisible = NotificationButton.DISABLED.status
            )
        }
        binding.applyCouponNotification.visibility = View.VISIBLE
    }

    //    override fun onPause() {
//        super.onPause()
//        viewModel.stopCouponTimer()
//    }
    fun disableLoadingView(dialog: Dialog) {
        dialog.dismiss()
    }

    fun enableLoadingView(dialog: Dialog) {
        if (dialog != null) {
            dialog.setContentView(R.layout.dialog_progressbar)
            dialog.setCancelable(false)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.window?.setDimAmount(0f)
            dialog.show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        index = 0
        hand1.removeCallbacksAndMessages(null)
        run1 = null
    }

    private fun isSingleClickHandle(): Boolean {
        val currentTime = SystemClock.elapsedRealtime()
        return currentTime - lastClickTime > coolDownSeconds * 1000
    }

}

interface InternalServerErrorCallback {
    fun showInternalServerErrorDialogActivity()
    fun showInternalServerErrorDialogBottomsheet()
}