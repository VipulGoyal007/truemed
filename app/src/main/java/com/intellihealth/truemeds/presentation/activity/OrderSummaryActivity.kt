package com.intellihealth.truemeds.presentation.activity


import android.animation.ObjectAnimator
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Rect
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.CarouselCallback
import com.intellihealth.salt.callbacks.CloseIconClickCallback
import com.intellihealth.salt.callbacks.CouponCallback
import com.intellihealth.salt.callbacks.PaymentContainerCallback
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.constants.CouponConstant
import com.intellihealth.salt.constants.CouponCtaConstant
import com.intellihealth.salt.constants.MobileSectionTypeConstants
import com.intellihealth.salt.constants.PaymentContainerConstants
import com.intellihealth.salt.models.ApplyCouponModel
import com.intellihealth.salt.models.BillDetailsModel
import com.intellihealth.salt.models.CouponModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.ProductCardSectionModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.utils.StartSnapHelper
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.payments.PaymentContainerType
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.DeleteCallback
import com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback
import com.intellihealth.truemeds.data.callback.ProductBottomSheetCallback
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpManager
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.data.utils.isSingleClick
import com.intellihealth.truemeds.databinding.ActivityOrderSummaryBinding
import com.intellihealth.truemeds.domain.enums.Coupon
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToDeliveryDetailsActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderStatusActivity
import com.intellihealth.truemeds.domain.navigation.navigateToProductDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.bottomsheet.CouponCodeOfferBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.DeleteImageBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.ReplaceBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.cart.RxPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.ordersummary.ItemNoLongerAvailableBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.CouponBottomSheetCallback
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.dialog.CouponApplySuccess
import com.intellihealth.truemeds.presentation.dialog.CouponErrorPopup
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.ClassNameConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.highlightView
import com.intellihealth.truemeds.presentation.utils.CommonFunc.runMeOnUiThread
import com.intellihealth.truemeds.presentation.utils.OnSingleClickListener
import com.intellihealth.truemeds.presentation.utils.RequestCodeConstants.PRESCRIPTION_UPLOAD_OK
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@AndroidEntryPoint
class OrderSummaryActivity : BaseActivity() {
    private val binding by viewBinding(ActivityOrderSummaryBinding::inflate)
    private val viewModel by lazy { ViewModelProvider(this)[CartViewModel::class.java] }
    private val couponViewModel by lazy { ViewModelProvider(this)[CouponViewModel::class.java] }
    private val ftcViewModel by lazy { ViewModelProvider(this)[CountDownTimerViewModel::class.java] }
    private lateinit var context: Context
    var prescriptionImageId: Long = 0
    private var editDeleteAddressBottomSheet = RemoveProductBottomSheet()
    private var deleteImageBottomSheet = DeleteImageBottomSheet()
    private lateinit var itemNoLongerAvailableBottomSheet: ItemNoLongerAvailableBottomSheet
    private var applyCouponCallBack: CouponBottomSheetCallback? = null
    private var orderId: Long = 0
    var currentCartValueD = 0.0
    var bottomSheet: UploadPrescriptionBottomSheet? = null
    lateinit var topDealProduct: com.intellihealth.truemeds.presentation.model.ProductInfoModel
    private var previousMap: HashMap<String, Int>? = null//HashMap<String, Int>()

    private var mLastClickTime = 0L
    val replaceBottomSheet = ReplaceBottomSheet().newInstance()
    private var mOTCItemLastClick = 0L
    private var mLastClickTimeForDeletBottomSheet = 0L

    private val REQUEST_CODE = 1
    private val REQUEST_CODE_PSP = 1
    var lastMinuteBuyViewed = false
    var reorderOtcClicked = false
    private var mLocationLastClickTimePaymentOffer = 0L

    override fun onResume() {
        super.onResume()
        viewModel.activePage = "SUMMARY"
        if (isNetworkAvailable(this)) {
            viewModel.viewModelScope.launch(Dispatchers.IO) {
                val currentMap = viewModel.getExistingCartMap()
                if (previousMap != currentMap) {
                    /*viewModel.getCartBillDetails(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        ClassNameConstants.ORDER_SUMMARY_ACTIVITY
                    )*/
                    viewModel.triggerSaveMeds(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        previousMap.isNullOrEmpty(),
                        "SUMMARY"
                    )

                    //getApiData()//onresume
                }
            }

        } else {
            showDialogBox(
                popUpType = PopUpType.INTERNET_FAILURE,
                object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        finish()
                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, isCancelable = false
            )
        }

        /*if (SharedPrefManager.getInstance().selectedPaymentMethod.isNotEmpty()) {
            viewModel.setUpPaymentContainer(
                SharedPrefManager.getInstance().selectedPaymentMethod,
                SharedPrefManager.getInstance().selectedPaymentMethodIconUrl
            )
        }*/
//        viewModel.setCouponData()
//        viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
//        SharedPrefManager.getInstance().addressId
//        SharedPrefManager.getInstance().patientId
        couponSavedData()
        if (resumeCount > 1)
            viewModel.viewModelScope.launch {
                viewModel.cartViewedTrigger = false
                viewModel.getCartBillDetails(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    ClassNameConstants.ORDER_SUMMARY_ACTIVITY
                )
            }

    }

    private fun couponSavedData() {

        SharedPrefManager.getInstance().couponModel.also { coupon ->
            if (coupon == null) {
                binding.tmApplyCoupon.setUpData(
                    ApplyCouponModel(
                        "Apply Coupon",
                        ""
                    ), CouponModel(
                        CouponConstant.APPLY_COUPON, "", "", false, "", "", arrayListOf(),
                        "",
                        "",
                        "",
                        isFtcCoupon = false,
                        showFtcCounter = false,
                        timestamp = 0L,
                    )
                )
            } else {
                if (((coupon.expiryDate ?: 0).minus(coupon.currentDate ?: 0)) < 0) {
                    binding.tmApplyCoupon.setUpData(
                        ApplyCouponModel(
                            title = "${coupon.promoCode ?: ""} applied",
                            timer = ""
                        ), CouponModel(
                            CouponConstant.COUPON_APPLIED,
                            image_url = coupon.image ?: "",
                            couponCode = coupon.promoCode ?: "",
                            isCouponApplied = true,
                            applyLable = if (coupon.isCouponApplied) "Applied" else "Apply Coupon",
                            couponHeading = "FLAT ${coupon.discountValue}% off on first order",
                            couponSummary = arrayListOf(
                                "FLAT 25% off on first order FLAT ${coupon.discountValue}% off on first order FLAT 25% off on first order",
                                "Minimum order value ₹699"
                            ),
                            tncLable = "Terms and conditions",
                            expireSoonLable = "Expiring soon",
                            timer = "55:34",
                            isFtcCoupon = coupon.showFtcCounter ?: false,
                            showFtcCounter = coupon.showFtcCounter ?: false,
                            timestamp = coupon.expiryDate ?: 0L,
                        )
                    )
                } else {
                    if (SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime - System.currentTimeMillis() > 0L) {
                        viewModel.startTimer(
                            Coupon.ENDS_IN.prefix,
                            //endTimestamp = if (null == SharedPrefManager.getInstance().couponModel) 0L else SharedPrefManager.getInstance().couponModel?.expiryDate
                            endTimestamp = SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                                ?: 0L
                        ) { time ->
                            SharedPrefManager.getInstance().couponModel.let { coupon ->
                                coupon?.let {
                                    this.runMeOnUiThread {
                                        binding.tmApplyCoupon.setUpData(
                                            ApplyCouponModel(
                                                title = "${coupon.promoCode ?: ""} applied",
                                                timer = if (SharedPrefManager.getInstance().couponModel?.showFtcCounter == true && time != getString(
                                                        R.string.timer_ends_string
                                                    )
                                                ) time else ""
                                            ), CouponModel(
                                                CouponConstant.COUPON_APPLIED,
                                                image_url = coupon.image ?: "",
                                                couponCode = coupon.promoCode ?: "",
                                                isCouponApplied = true,
                                                applyLable = if (coupon.isCouponApplied) "Applied" else "Apply Coupon",
                                                couponHeading = "FLAT ${coupon.discountValue}% off on first order",
                                                couponSummary = arrayListOf(
                                                    "FLAT 25% off on first order FLAT ${coupon.discountValue}% off on first order FLAT 25% off on first order",
                                                    "Minimum order value ₹699"
                                                ),
                                                tncLable = "Terms and conditions",
                                                expireSoonLable = "Expiring soon",
                                                timer = "55:34",
                                                isFtcCoupon = coupon.showFtcCounter ?: false,
                                                showFtcCounter = coupon.showFtcCounter ?: false,
                                                timestamp = coupon.expiryDate ?: 0L,
                                                // timestamp = SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L,
                                            )
                                        )
                                    }
                                    if (time == getString(R.string.timer_ends_string)) {
                                        viewModel.stopCouponTimer()
                                    }
                                }
                            }
                        }
                    } else {
                        binding.tmApplyCoupon.setUpData(
                            ApplyCouponModel(
                                title = "${coupon.promoCode ?: ""} applied",
                                timer = ""
                            ), CouponModel(
                                CouponConstant.COUPON_APPLIED,
                                image_url = coupon.image ?: "",
                                couponCode = coupon.promoCode ?: "",
                                isCouponApplied = true,
                                applyLable = if (coupon.isCouponApplied) "Applied" else "Apply Coupon",
                                couponHeading = "FLAT ${coupon.discountValue}% off on first order",
                                couponSummary = arrayListOf(
                                    "FLAT 25% off on first order FLAT ${coupon.discountValue}% off on first order FLAT 25% off on first order",
                                    "Minimum order value ₹699"
                                ),
                                tncLable = "Terms and conditions",
                                expireSoonLable = "Expiring soon",
                                timer = "55:34",
                                isFtcCoupon = coupon.showFtcCounter ?: false,
                                showFtcCounter = coupon.showFtcCounter ?: false,
                                timestamp = coupon.expiryDate ?: 0L,
                            )
                        )
                    }
                }


                /*viewModel.appliedCouponName.postValue("${coupon.promoCode ?: ""} applied")
                viewModel.couponTimer.observe(this) {
                    binding.tmApplyCoupon.setUpData(
                        ApplyCouponModel(
                            title = "${coupon.promoCode ?: ""} applied",
                            timer = it
                        ), CouponModel(
                            CouponConstant.COUPON_APPLIED,
                            image_url = coupon.image ?: "",
                            couponCode = coupon.promoCode ?: "",
                            isCouponApplied = true,
                            applyLable = if (coupon.isCouponApplied == true) "Applied" else "Apply Coupon",
                            couponHeading = "FLAT ${coupon.discountValue}% off on first order",
                            couponSummary = arrayListOf(
                                "FLAT 25% off on first order FLAT ${coupon.discountValue}% off on first order FLAT 25% off on first order",
                                "Minimum order value ₹699"
                            ),
                            tncLable = "Terms and conditions",
                            expireSoonLable = "Expiring soon",
                            timer = "55:34",
                            isFtcCoupon = coupon.isFtcCoupon ?: false,
                            showFtcCounter = coupon.showFtcCounter ?: false,
                            timestamp = coupon.expiryDate ?: 0L,
                        )
                    )
                }*/
            }
        }

        if (SharedPrefManager.getInstance().couponModel == null) {
            viewModel.stopCouponTimer()
            binding.tmApplyCoupon.setUpData(
                ApplyCouponModel(
                    "Apply Coupon",
                    ""
                ), CouponModel(
                    CouponConstant.APPLY_COUPON, "", "", false, "", "", arrayListOf(),
                    "",
                    "",
                    "",
                    isFtcCoupon = false,
                    showFtcCounter = false,
                    timestamp = 0L,
                )
            )
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.activePage = "SUMMARY"
        binding.fragmentManager = supportFragmentManager
        //Set view model as lifecycle observer of the activity
//        lifecycle.addObserver(viewModel)
        context = this
        orderId = SharedPrefManager.getInstance().incompleteOrderId

        setupBackPressedAction()
        initView()


        extractIntentData()
        setCallbacks()
        setObservers()
        updateStatusBarColor()

        getApiData()
        setUpDoctorCard()

        initOtcRv()

        viewModel.eventSendFtcCounterStarted.observe(this) {
            if (it > 0L) viewModel.sendFtcCounterStarted(
                it
            )
        }
        getScrollPosition();


        viewModel.eventShowInternalServerError.observe(this) { message ->
            if (message.isNotEmpty()) {
                showDialogBox(PopUpType.API_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        finish()
                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, false, "Internal Server Error", message)
            }
        }

        viewModel.showShimmerLiveDataPayUsing.observe(this) {
            binding.tmStickyPaymentPlaceOrder.showPayUsingShimmer(it)
        }

        viewModel.showShimmerLiveDataFooter.observe(this) {
            if (!it) {
                viewModel.eventCappingLimitMessage.observe(this, EventObserver { message ->
                    message?.let {
                        if (!message.isNullOrBlank()) {
                            Toast().showCustomToastMessage(this@OrderSummaryActivity, "" + message)
                            viewModel.cappingLimitMessage.postValue(Event(""))
                        }
                    }
                })
            }
        }

    }

    override fun extractIntentData() {
        intent.extras?.let { bundle ->

            if (bundle.containsKey(BundleConstants.CURRENT_CART_VALUE)) {
                currentCartValueD = bundle.getDouble(BundleConstants.CURRENT_CART_VALUE, 0.0)
            }
            if (bundle.containsKey(BundleConstants.BUNDLE_KEY_PAGE_SECTION)) {
                viewModel.section =
                    bundle.getString(BundleConstants.BUNDLE_KEY_PAGE_SECTION) ?: "main"
            } else {
                viewModel.section = "main"
            }

            with(viewModel) {
                clickedOnPageCartModel =
                    bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
                clickedOnPage =
                    bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
                orderPreviousStage =
                    bundle.getString(BundleConstants.BUNDLE_KEY_ORDER_IS_DELIVERED_OR_CANCELLED)
                orderPageSection =
                    bundle.getString(BundleConstants.BUNDLE_KEY_ORDER_PAGE_SECTION).toString()
                reorder_button_click =
                    bundle.getString(BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED).toString()
            }
        }
    }

    private fun setDynamicHeightForViewSpace() {
        val vto: ViewTreeObserver = binding.tmStickyPaymentPlaceOrderMain.viewTreeObserver
        vto.addOnPreDrawListener {
            val height: Int = binding.tmStickyPaymentPlaceOrderMain.measuredHeight
            val width: Int = binding.tmStickyPaymentPlaceOrderMain.measuredWidth

            val otherView = binding.viewSpace
            val layoutParams = otherView.layoutParams
            layoutParams.height = height + 24 // Set the height to the value obtained
            otherView.layoutParams = layoutParams

            true
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_PSP) {
            viewModel.showShimmerPayUsing.postValue(true)
        }
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                val resultValue = data?.getBooleanExtra(BundleConstants.RELOAD_BILL_DETAILS, false)
                if (resultValue == true) {
                    viewModel.viewModelScope.launch(Dispatchers.IO) {
                        viewModel.getCartBillDetails(
                            SharedPrefManager.getInstance().incompleteOrderId,
                            ClassNameConstants.ORDER_SUMMARY_ACTIVITY
                        )
                    }
                }
            }
        }

    }

    private fun setUpDoctorCard() {
        viewModel.drCallNeeded.observe(this) {
            if (it) {
                binding.prescriptionCardCtl.visibility = View.VISIBLE
                Glide.with(binding.prescriptionCardImg).asGif()
                    .load(R.drawable.order_status_doctor_call_pending)
                    .into(binding.prescriptionCardImg)
                binding.prescriptionHeaderTv.text = "Doctor Consultation"
                binding.prescriptionSubHeaderTv.text =
                    "A qualified third party doctor will call you for a consultation"
            }
        }

        viewModel.phCallNeeded.observe(this) {
            if (it) {
                binding.prescriptionCardCtl.visibility = View.VISIBLE
                Glide.with(binding.prescriptionCardImg).asGif()
                    .load(R.drawable.pharmacist_doctor_call)
                    .into(binding.prescriptionCardImg)
                binding.prescriptionHeaderTv.text = "Pharmacist call"
                binding.prescriptionSubHeaderTv.text =
                    "Our pharmacist will call to confirm the medicines in your prescription"
            }
        }

    }

    private fun getApiData() {

        viewModel.loaderValue.postValue(true)
        val crossSellType: MutableSet<String> = HashSet()
        crossSellType.add("LAST_MINUTE_BUY")
        viewModel.getSessionToken(
            warehouseId = SharedPrefManager.getInstance().selectedWarehouseID,
            pageNumber = 0,
            type = "App",
            subType = crossSellType,
            pageSize = 30,
            variantId = SharedPrefManager.getInstance().algoSpecificVariantId
        )

        setUpLastMinuteBuy()
    }

    private fun initView() {
        binding.tmTopHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                headerText = getString(R.string.order_summary),
                cartCount = 0,
                buttonText = null,
                subHeaderText = null,
                subHeaderTextTwo = null,
                buttonIconRight = ContextCompat.getDrawable(
                    this,
                    R.drawable.ic_order_summary_search
                )
            )
        )

        //handle free delivery message
        viewModel.isFreeDelivery.observe(this) {
            if (it) {
                Log.i("isFreeDelivery", "" + it)
                if (viewModel.apiMedicineList.value?.size!! > 0) {
                    binding.clFreeDelivery.visibility = View.VISIBLE
                } else {
                    binding.clFreeDelivery.visibility = View.GONE
                }
            } else {
                binding.clFreeDelivery.visibility = View.GONE
            }
        }


        binding.tmTopHeader.setMobileSectionHeadersViewType(if (viewModel.productList.value?.size!! > 0) MobileSectionTypeConstants.TEXT_WITH_SEARCH else MobileSectionTypeConstants.DEFAULT_WITHOUT_FILL)

        binding.tmTopHeader.setSearchIconClickCallBack(object : SearchBarCallback {
            override fun onClearClick() {}

            override fun onIconClick() {
                viewModel.isOtcDataRequested = false
                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "order_summary",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags = listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )

            }

            override fun onViewClick() {}

        })

        binding.clAddMedicine.setOnClickListener {
            viewModel.isOtcDataRequested = false
            navigateToSearchSuggestionActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "order_summary",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                ),
                flags = listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )
        }

        binding.tmApplyCoupon.setCallback(object : CouponCallback {
            override fun viewClickCallback(viewType: CouponCtaConstant) {
                when (viewType) {
                    CouponCtaConstant.COUPON_LAYOUT, CouponCtaConstant.CTA_ARROW -> {
                        viewModel.stopCouponTimer()
                        viewModel.callEventApplyCouponClicked()

                        val gson = Gson()
                        val json = gson.toJson(viewModel.orderMedicineDetailsListData)

                        val gsonBillData = Gson()
                        val jsonBillData = gsonBillData.toJson(viewModel.billDetailsResponse)

                        val intent = Intent(this@OrderSummaryActivity, CouponActivity::class.java)
                            .putExtra(
                                BundleConstants.CURRENT_CART_VALUE,
                                viewModel.mrp.value!! - viewModel.discount.value!!
                            )
                            .putExtra(
                                BundleConstants.PRESCRIPTION_COUNT,
                                viewModel.prescriptions.value?.size
                            )
                            // .putExtra("billDetailData", viewModel.billDetailsResponse)
                            .putExtra("billDetailData", jsonBillData)
                            .putExtra(
                                BundleConstants.BUNDLE_KEY_SUBS_ID,
                                viewModel.subsIdEventValue
                            )
                            .putExtra("medicineListData", json)
                            .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "order_summary")
                            .putExtra(
                                "clickedOnPageNameForCouponEvent",
                                viewModel.clickedOnPageNameForCouponEvent
                            )
                            .putExtra(
                                "clickedOnPageNameForCouponApplyEvent",
                                viewModel.clickedOnPageNameForCouponApplyEvent
                            )

                        startActivityForResult(intent, REQUEST_CODE)
                    }

                    CouponCtaConstant.CTA_REMOVE -> {
                        viewModel.loaderValue.postValue(true)
                        SharedPrefManager.getInstance().selectedPaymentMethodIconUrl = ""
                        SharedPrefManager.getInstance().selectedPaymentMethod = ""
                        SharedPrefManager.getInstance().selectedPaymentMethodId = 0
                        viewModel.saveRemoveCouponCode(
                            SharedPrefManager.getInstance().incompleteOrderId,
                            "0", ClassNameConstants.CART_ACTIVITY, "order_summary"
                        )
                    }

                    else -> {

                    }
                }
            }

        })

        binding.tmPaymentCarousel.setItemOnClick(object : CarouselCallback {
            override fun viewClickCallback(position: Int) {
                if (!viewModel.paymentCarouselOgList[position].isCouponApplied) {
                    viewModel.callEventApplyCouponClicked()
                }

                val couponCodeOfferBottomSheet =
                    CouponCodeOfferBottomSheet(
                        viewModel.paymentCarouselOgList[position],
                        ftcViewModel,
                        applyCouponCallBack!!,
                        couponViewModel
                    )
                val lastRecordedData = isSingleClick(mLocationLastClickTimePaymentOffer)
                mLocationLastClickTimePaymentOffer = lastRecordedData.second
                couponCodeOfferBottomSheet.isCancelable = true
                if (!couponCodeOfferBottomSheet.isVisible && lastRecordedData.first) {
                    couponCodeOfferBottomSheet.show(
                        supportFragmentManager, "CouponCodeOfferBottomSheet"
                    )
                }
            }

        })

        Glide.with(context).asGif().load(R.drawable.order_being_placed_final)
            .into(binding.ivOrderIsBeingPlaced)

        setSavingSpectacularData()

        viewModel.paymentCarouselList.observe(this) {
            Log.d("TAG", "initView: ${Gson().toJson(it)}")
            binding.tmPaymentCarousel.setUpData(it)
            couponSavedData()
        }

        viewModel.stickyPaymentDataPlaceOrder.observe(this, Observer {
            if (SharedPrefManager.getInstance().newSelectedPinCode && !SharedPrefManager.getInstance().isReOrder) {
                it.address = ""
                it.deliveryDate = ""
                it.pinCode = ""
                it.addressType = ""
            }
            setDynamicHeightForViewSpace()
        })

        viewModel.deliveryChargeMessage.observe(this) {
            if (binding.productCardSection.isVisible && !it.isNullOrEmpty()) {
                binding.productCardSection.updateSubHeading(it)
            }
        }

        viewModel.medList.observe(this) {
            val data: ArrayList<ProductInfoModel> = arrayListOf()
            data.addAll(it)

            if (viewModel.isLastMinuteBuyRestored) {
                binding.productCardSection.reloadProductList(data)
                viewModel.isLastMinuteBuyRestored = false
            } else {
                binding.productCardSection.setProductCardSectionData(
                    ProductCardSectionModel(
                        productCardHeader = getString(R.string.last_minutes_buys),
                        productCardSubtitle = viewModel.deliveryChargeMessage.value,
                        list = data,
                        viewAllVisibility = false,
                        isDeleteItemOnAdded = false,
                        minDiscountValue = SharedPrefManager.getInstance().minMedDiscountToBeHidden,
                        isSmoothSnapToPosition = true
                    )
                )
            }
            binding.productCardSection.visibility =
                if (data.isNullOrEmpty()) View.GONE else View.VISIBLE

        }
        viewModel.appliedCouponName.observe(this) {
            binding.tmApplyCoupon.setUpData(
                ApplyCouponModel(
                    it,
                    ""
                ), CouponModel(
                    CouponConstant.COUPON_APPLIED,
                    "",
                    it ?: "",
                    true,
                    "",
                    "",
                    arrayListOf(),
                    "",
                    "",
                    "",
                    isFtcCoupon = false,
                    showFtcCounter = false,
                    timestamp = 0L,
                )
            )
        }

        applyCouponCallBack = object : CouponBottomSheetCallback {
            override fun applyCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
                if (SharedPrefManager.getInstance().prescriptionCount > 0 && (viewModel.mrp.value!! - viewModel.discount.value!!) <= 0.0) {
                    //only prescription case
                    couponViewModel.medicineListDataReceived.clear()
                    //couponViewModel.medicineListDataReceived=viewModel.orderMedicineDetailsListData
                    couponViewModel.applyCouponClick(
                        couponCodeResponse,
                        viewModel.clickedOnPageNameForCouponApplyEvent
                    )
                } else {
                    if ((viewModel.mrp.value!! - viewModel.discount.value!!) >= (couponCodeResponse?.minCartValue
                            ?: 0)
                    ) {
                        couponViewModel.medicineListDataReceived.clear()
                        //couponViewModel.medicineListDataReceived=viewModel.orderMedicineDetailsListData
                        couponViewModel.applyCouponClick(
                            couponCodeResponse,
                            viewModel.clickedOnPageNameForCouponApplyEvent
                        )
                    } else {
                        couponViewModel.openCouponFailed.postValue(Event(couponCodeResponse))
                    }
                }
            }

            override fun removeCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
                couponCodeResponse?.promoCode.let { promoCode ->
                    viewModel.loaderValue.postValue(true)
                    viewModel.saveRemoveCouponCode(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        "0", ClassNameConstants.CART_ACTIVITY, "order_summary"
                    )
                }
            }
        }

        viewModel.clickedOnPageNameForCouponEvent = "ordersummary"
        viewModel.clickedOnPageNameForCouponApplyEvent = "order_summary_page"
    }

    private fun setUpLastMinuteBuy() {


        /*val callback: TopDealCallback = object : TopDealCallback {
            override fun onProductSelected(product: ProductInfoModel, position: Int) {
                binding.productCardSection.onItemClick(position)
            }
        
        }*/
        binding.productCardSection.setCallback(viewModel.lastMinuteStepperCallback)
        viewModel.loaderValue.postValue(false)
    }

//    val callback: TopDealCallback = object : TopDealCallback {
//        override fun onProductSelected(product: ProductInfoModel, position: Int) {
//            binding.reorderSavingSpectacular.onItemClick(position)
//            topDealProduct = product.toAppProductModel()
//            viewModel.topDealPosition = position
//            binding.reorderSavingSpectacular.onItemClick(position)
//        }
//
//        override fun onProductSwipe(product: ProductInfoModel, position: Int) {
//            viewModel.otcList.value?.filter { it.product.qty == 0 }?.let {
//                topDealProduct = it[position]
//                viewModel.topDealPosition = position
//            }
//        }
//
//        override fun onViewProduct(product: ProductInfoModel, position: Int) {
//            //viewModel.showMessage.postValue(Event(MESSAGES.OPEN_PD_BOTTOM_SHEET_ORDER_SUMMARY))
//
//
//            val productDetailsBottomSheet =
//                ProductDetailBottomSheet(
//                    product.product.productCode ?: "",
//                    false,
//                    isFromCrossSelling = true,
//                    //listener = /*pdBottomsheetCallbackListener*/null
//                )
//            productDetailsBottomSheet.isCancelable = true
//            productDetailsBottomSheet.dataFromOrderStatus(
//                false,
//                product.toAppProductModel(),
//                isOTC = false
//            )
//
//
//            productDetailsBottomSheet.setCallback(object : ProductBottomSheetCallback {
//                override fun closeClick() {
//
//                    if (isNetworkAvailable(this@OrderSummaryActivity)) {
//                        viewModel.loaderValue.postValue(true)
//                        viewModel.viewModelScope.launch(Dispatchers.IO) {
//                            val currentMap = viewModel.getExistingCartMap()
//                            if (previousMap != currentMap) {
//
//                                if (viewModel.activePage == "SUMMARY") {
//
//                                    viewModel.viewModelScope.launch(Dispatchers.IO) {
//                                        viewModel.filterOtcList(null)
//                                    }
//                                }
//                                viewModel.triggerSaveMeds(
//                                    SharedPrefManager.getInstance().incompleteOrderId,
//                                    previousMap.isNullOrEmpty(),
//                                    "SUMMARY"
//                                )
//
//                                getApiData()
//                            } else {
//                                viewModel.loaderValue.postValue(false)
//                            }
//                        }
//
//                    }
//
//                    /*if (viewModel.activePage == "SUMMARY") {
//
//                        viewModel.viewModelScope.launch(Dispatchers.IO) {
//                            viewModel.filterOtcList(null)
//                        }
//                    }
//                    viewModel.triggerSaveMeds(
//                        SharedPrefManager.getInstance().incompleteOrderId,
//                        false,
//                        "SUMMARY"
//                    )*/
//
////                        val crossSellType: MutableSet<String> = HashSet()
////                        crossSellType.add("LAST_MINUTE_BUY")
////                        viewModel.getSessionToken(
////                            warehouseId = SharedPrefManager.getInstance().selectedWarehouseID,
////                            pageNumber = 0,
////                            type = "App",
////                            subType = crossSellType,
////                            pageSize = 5,
////                            variantId = SharedPrefManager.getInstance().algoSpecificVariantId
////                        )
//                }
//            })
//
//
//            val lastRecordedData =
//                isSingleClick(mOTCItemLastClick)
//            mOTCItemLastClick = lastRecordedData.second
//
//            viewModel.viewModelScope.launch(Dispatchers.IO) {
//                if (previousMap.isNullOrEmpty()) {
//                    previousMap = HashMap<String, Int>()
//                }
//                previousMap = viewModel.getExistingCartMap()
//                Log.d("","")
//            }
////
//            if (!productDetailsBottomSheet.isVisible && lastRecordedData.first) {
//                productDetailsBottomSheet.show(
//                    supportFragmentManager, "ProductDetailBottomsheet"
//                )
//            }
//
//
//        }
//
//    }


//    val stepperCallback: StepperCallback = object : StepperCallback {
//        override fun cartItemPlus(qty: Int) {
//            if (::topDealProduct.isInitialized) {
//
//                viewModel.otcList.value?.filter { it.product.qty == 0 }?.let { ftrList ->
//
//                    try {
//
//                        ftrList[viewModel.topDealPosition].product.qty = qty
//
//                        viewModel.addToCart(topDealProduct, false, qty)
//
//
//                        ftrList.toSdkProductModelList()
//                            .filter { it.product.qty == 0 }.let {
//                                if (it.isNotEmpty()) {
//                                    binding.reorderSavingSpectacular.visibility = View.VISIBLE
//                                    binding.reorderSavingSpectacular.setData(
//                                        it as ArrayList<ProductInfoModel>,
//                                        callback,
//                                        viewModel.topDealPosition
//                                    )
//                                } else {
//                                    binding.reorderSavingSpectacular.setEmptyData()
//                                    binding.reorderSavingSpectacular.visibility = View.GONE
//                                }
//                            }
//
//
//                        ftrList.filter { it.product.qty == 0 }.let {
//                            if (it.isNotEmpty()) {
//
//                                topDealProduct = it[viewModel.topDealPosition]
//
//                            }
//                        }
//
//                        viewModel.triggerSaveMeds(
//                            SharedPrefManager.getInstance().incompleteOrderId,
//                            false,
//                            "SUMMARY"
//                        )
//                    }catch (e:Exception){
//                        Log.d("qwerty ex","ex : ${e.message}")
//                    }
//                }
//
//
//            }
//
//        }
//
//        override fun cartItemMinus(qty: Int) {
////            if (qty == 0) {
////                viewModel.removeItemFromCart(topDealProduct, false)
////            } else {
////                viewModel.updateQuantity(topDealProduct, qty)
////            }
////            viewModel.otcList.value?.get(viewModel.topDealPosition)?.product?.qty = qty
////
////            viewModel.otcList.value?.toSdkProductModelList()
////                ?.filter { it.product.qty == 0 }?.let {
////                    if (it.isNotEmpty()) {
////                        binding.reorderSavingSpectacular.setData(
////                            it as ArrayList<ProductInfoModel>,
////                            callback,
////                            viewModel.topDealPosition
////                        )
////                        binding.reorderSavingSpectacular.visibility = View.VISIBLE
////                    }
////                }
//
//
//        }
//
//        override fun stepperError(msg: String?) {
//            //Toast().showCustomToastMessage(this@OrderSummaryActivity, "$msg")
//        }
//
//        override fun deleteAlert() {
////            val removeProductBottomSheet =
////                com.intellihealth.truemeds.presentation.bottomsheet.search.RemoveProductBottomSheet(
////                    object : DeleteCallback {
////                        override fun yesClick() {
////                            viewModel.removeItemFromCart(topDealProduct, false)
////                            val updatedDeals = viewModel.otcList.value.apply {
////                                this?.get(viewModel.topDealPosition)?.product?.qty = 0
////                            }
////
////                            updatedDeals?.toSdkProductModelList()
////                                ?.filter { it.product.qty == 0 }?.let {
////                                    if (it.isNotEmpty()) {
////                                        binding.reorderSavingSpectacular.setData(
////                                            it as ArrayList<ProductInfoModel>,
////                                            callback,
////                                            viewModel.topDealPosition
////                                        )
////
////                                        binding.reorderSavingSpectacular.visibility = View.VISIBLE
////                                    }
////                                }
////
////                        }
////
////                    })
////            removeProductBottomSheet.isCancelable = true
////            if (!removeProductBottomSheet.isVisible && supportFragmentManager != null)
////                removeProductBottomSheet.show(supportFragmentManager, "remove product")
//        }
//
//
//    }


    lateinit var otcLayoutManager: LinearLayoutManager
    var prevPos = -1

    private fun initOtcRv() {
        otcLayoutManager = binding.rvOtcProducts.layoutManager as LinearLayoutManager
        binding.rvOtcProducts.layoutManager = otcLayoutManager
        try {
            StartSnapHelper().attachToRecyclerView(binding.rvOtcProducts)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

        //note:- infinite scroll
        if (viewModel.otcMedicineList.value!!.size > 0) binding.rvOtcProducts.scrollToPosition(Int.MAX_VALUE / 2)
        binding.rvOtcProducts.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val pos = otcLayoutManager.findFirstCompletelyVisibleItemPosition()

                //note:- to prevent same position trigger again
                if (prevPos == pos) {
                    return
                }
                if (otcLayoutManager.findViewByPosition(pos) == null) return
                highlightReOrderOtcIndex(pos)
            }
        })
    }

    private fun setUpOTCData() {
//        binding.topDeals.setCallback(stepperCallback)
//        binding.topDeals.setData(viewModel.topDeals as ArrayList,callback,0)
//        val callback: TopDealCallback = object : TopDealCallback {
//            override fun onProductSelected(product: ProductInfoModel, position: Int) {
//                binding.topDeals.onItemClick(position)
//            }
//        }


//        binding.reorderSavingSpectacular.setCallback(stepperCallback)
//
//
//        //note :- data setting
//        viewModel.otcList.observe(this) {
//
//            //if ((viewModel.otcApiList.value ?: emptyList()).size >= 5)
//                if (it.isNotEmpty()) {
//                    binding.reorderSavingSpectacular.visibility = View.VISIBLE
//                    topDealProduct = it[viewModel.topDealPosition]
//                    //viewModel.topDealPosition = 0
//                    binding.reorderSavingSpectacular.setData(
//                        it.toSdkProductModelList()
//                            .filter { item -> item.product.qty == 0 } as ArrayList<ProductInfoModel>,
//                        callback,
//                        viewModel.topDealPosition
//                    )
//                    if (it.toSdkProductModelList().filter { item -> item.product.qty == 0 }.isEmpty())
//                        binding.reorderSavingSpectacular.visibility = View.GONE
//
//                } else {
//                    binding.reorderSavingSpectacular.visibility = View.GONE
//                }
//        }
//
//        viewModel.eventShowReorderOtc.observe(this, EventObserver {
//            if(it == true) binding.reorderSavingSpectacular.visibility = View.VISIBLE
//            else binding.reorderSavingSpectacular.visibility = View.GONE
//        })


        viewModel.getEventShowOTCList()
            .observe(this, EventObserver { `object` -> viewModel.setUpOtcList() })

        viewModel.getEventSmoothSnapToPosition().observe(this, EventObserver { `object` ->
            if (`object` != null) {
                if (!viewModel.otcMedicineList.value.isNullOrEmpty()) {
                    val listPosition: Int =
                        `object` as Int % viewModel.otcMedicineList.value!!
                            .size
                    viewModel.otcProductSelected.postValue(
                        viewModel.otcMedicineList.value!![listPosition]
                    )

                    if (viewModel.otcApiList.value!!
                            .size > 5
                    ) {
                        smoothSnapToPosition(binding.rvOtcProducts, `object`, -1)
                    }
                    highlightReOrderOtcIndex(`object`)
                }
            }
        })


    }

    private fun highlightReOrderOtcIndex(index: Int) {
        try {
            val listPosition: Int = index % viewModel.otcMedicineList.value!!.size
            scaleView(
                otcLayoutManager.findViewByPosition(index)!!.findViewById(R.id.ivIcon),
                1f,
                2.0f,
                true
            )
            highlightView(
                otcLayoutManager.findViewByPosition(index)!!.findViewById(R.id.ivBackground),
                getDrawable(R.drawable.bg_faint_blue_radius_60)!!
            )

            //note:- update card accordingly
            //note:- infinite scroll
            if (viewModel.otcMedicineList.value != null) {
                viewModel.otcProductSelectedIndex = listPosition
                viewModel.otcRefreshIndex = index
                if (!reorderOtcClicked) {
                    viewModel.otcProductSelected.postValue(viewModel.otcMedicineList.value!![listPosition])
                }
            }
            if (prevPos == -1) {
                prevPos = index
                return
            }


            for (i in Math.min(
                otcLayoutManager.findFirstVisibleItemPosition(),
                index - 1
            ) until otcLayoutManager.findLastVisibleItemPosition() + 2) {
                try {
                    if (i != index) if (otcLayoutManager.findViewByPosition(i)!!
                            .findViewById<View>(R.id.ivBackground).getBackground()
                            .getConstantState()
                        === resources.getDrawable(R.drawable.bg_faint_blue_radius_60).constantState
                    ) {
                        scaleView(
                            otcLayoutManager.findViewByPosition(i)!!.findViewById(R.id.ivIcon),
                            2.0f,
                            1f,
                            false
                        )
                        highlightView(
                            otcLayoutManager.findViewByPosition(i)!!
                                .findViewById(R.id.ivBackground),
                            getDrawable(R.drawable.bg_faint_white_radius_60)!!
                        )
                    }
                } catch (ignore: java.lang.Exception) {
                }
            }
            prevPos = index
            Handler(Looper.getMainLooper()).postDelayed({
                reorderOtcClicked = false
            }, 200)
        } catch (ex: java.lang.Exception) {
        }
    }

//    fun isReOrderOtcAdded(productCode: String?): Boolean {
//        var exists = false
//        for (obj in viewModel.lstClickedCrossSelling) {
//            if (obj.get_source().getOriginal_product_code().equals(productCode)) {
//                exists = true
//                break
//            }
//        }
//        return exists
//    }

    fun smoothSnapToPosition(
        rv: RecyclerView,
        position: Int,
        snapMode: Int = LinearSmoothScroller.SNAP_TO_START
    ) {
        val smoothScroller = object : LinearSmoothScroller(rv.context) {
            override fun getVerticalSnapPreference(): Int = snapMode
            override fun getHorizontalSnapPreference(): Int = snapMode
        }
        smoothScroller.targetPosition = position
        rv.layoutManager?.startSmoothScroll(smoothScroller)
    }

    fun scaleView(v: View, startScale: Float, endScale: Float, withAnimation: Boolean) {
        val anim: Animation = ScaleAnimation(
            startScale, endScale,
            startScale, endScale,
            Animation.RELATIVE_TO_SELF, .5f,
            Animation.RELATIVE_TO_SELF, 0.8f
        )
        anim.fillAfter = true
        anim.duration = if (withAnimation) 200 else 0
        v.startAnimation(anim)
    }


    private fun setCallbacks() {
        binding.tmTopHeader.setBackArrowClickCallback(object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                finish()
            }
        })

        binding.tmTopHeader.setCloseIconClickCallback(object :
            CloseIconClickCallback {
            override fun onCloseIconClick() {
                viewModel.isOtcDataRequested = false
                /* startActivity(
                     Intent(
                         applicationContext,
                         SearchSuggestionActivity::class.java
                     ).putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "order_summary")
                         .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                             .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                 )*/

                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "order_summary",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags = listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )

                //finish()
            }
        })
        val prescriptionCallback = object : ViewPrescriptionCallback {
            override fun onDeleteImage(imageId: Long) {
                prescriptionImageId = imageId
                showConfirmationBottomSheet()
            }

            override fun onViewPrescriptionClicked(position: Int, imageURL: String) {
                viewModel.prescriptions.value?.let {
                    if (it.size > 1) {
                        val bottomSheet = RxPrescriptionBottomSheet(
                            position - 1,
                            prescriptionList = viewModel.prescriptions.value!!
                        )
                        bottomSheet.isCancelable = true
                        if (!bottomSheet.isVisible) bottomSheet.show(
                            supportFragmentManager,
                            "ViewPrescriptionBottomSheet"
                        )
                    }
                }
            }

            override fun onAddMoreClicked() {
                openPrescriptionActivity()
            }

        }
        binding.callback = prescriptionCallback

        //on scroll tooltip is dismiss
        binding.nestedScrollView.viewTreeObserver
            .addOnScrollChangedListener(ViewTreeObserver.OnScrollChangedListener {
                binding.billDetails.dismissTooltips()
//                val scrollY: Int = rootScrollView.getScrollY() // For ScrollView
//                val scrollX: Int = rootScrollView.getScrollX() // For HorizontalScrollView
                // DO SOMETHING WITH THE SCROLL COORDINATES
            })
    }

    private fun setObservers() {

        //binding.customCheckBox.setEnable(false)
        //binding.customCheckBox.setState(CheckFieldConstants.STATE_SELECTED)


        //this is setting observer for PastPrescriptionDetailsAdapter image item click to open full view
        //    PrescriptionViewModel.pastRXClicked.observe(
        viewModel.eventPastRXClicked.observe(
            this, EventObserver {
                if (it == null) return@EventObserver

                //below is totally new logic written to handle the image view click
                val arrOfStr = it.first?.toString()?.split("_")
                var parentId = arrOfStr?.getOrNull(0)
                var childId = arrOfStr?.getOrNull(1)

                var isCurrentItemFound = false
                var currentSelectedPos = 0

                var prescriptionList: ArrayList<OrderRxInfo> = arrayListOf()
                for (i in 0..viewModel.pastPrescription.value?.size!! - 1) {
                    viewModel.pastPrescription.value?.get(i).let {
                        for (j in 0..it?.activeRxList?.size!! - 1) {
                            it?.activeRxList?.get(j)?.let {
                                if ((parentId?.toInt() == i) && (childId?.toInt() == j)) {
                                    isCurrentItemFound = true
                                } else if (!isCurrentItemFound) {
                                    currentSelectedPos = currentSelectedPos + 1
                                }
                                prescriptionList.add(OrderRxInfo(0, it.imageUrl, it.imageId))
                            }
                        }
                    }
                }

                val bottomSheet = RxPrescriptionBottomSheet(
                    // childId.toInt(),
                    currentSelectedPos,
                    // prescriptionList =  viewModel.pastPrescription.value?.get(parentId.toInt())?.activeRxList!!.map { OrderRxInfo(0, it.imageUrl, it.imageId) }
                    prescriptionList = prescriptionList.toList()
                )

                bottomSheet.isCancelable = true
                if (!bottomSheet.isVisible) bottomSheet.show(
                    supportFragmentManager,
                    "ViewPrescriptionBottomSheet"
                )

            }
        )


        viewModel.eventRemoveCouponApi.observe(this, EventObserver {
            viewModel.saveRemoveCouponCode(
                SharedPrefManager.getInstance().incompleteOrderId,
                "0", ClassNameConstants.ORDER_SUMMARY_ACTIVITY, "order_summary"
            )
        })

        viewModel.eventGetReorderOtcApi.observe(this, EventObserver {

            if (SharedPrefManager.getInstance().isReOrder) {
                viewModel.fetchReOrderOTCProductV1(
                    SharedPrefManager.getInstance().loggedInUserId,
                    SharedPrefManager.getInstance().patientId,
                    SharedPrefManager.getInstance().incompleteOrderId
                )
                setUpOTCData()
            } else {
                viewModel.showLoading.postValue(false)
                viewModel.loaderValue.postValue(false)
            }
        })

        viewModel.eventCloseReplaceBottomSheet.observe(this, EventObserver {
            if (it) {
                if (replaceBottomSheet != null && replaceBottomSheet.isVisible) {
                    replaceBottomSheet.dismiss()
                }
            }
        })

        //handling substitude available click observer
        viewModel.eventLaunchReplaceBottomSheet.observe(this, EventObserver {
            if (it == null) return@EventObserver
            if (it) {
                var item = viewModel.selectedMedicineForReplace.value
                val bundle = Bundle()
                val model = Gson().toJson(item)
                bundle.putString(BundleConstants.PRODUCT_SUBS_DETAIL, model)
                bundle.putString(BundleConstants.PRODUCT_SUBS_TITLE, item?.product?.skuName)
                bundle.putString(
                    BundleConstants.SUBS_SAVING_PERCENTAGE,
                    item?.product?.subsSavingsPercentage
                )
                replaceBottomSheet.isCancelable = false
                replaceBottomSheet.arguments = bundle

                /*replaceBottomSheet.setCallback(object :
                    OrgSubCompareBottomSheetCallback {
                    override fun closeClick(isReload: Boolean) {
                        Log.e("Replace", "Close event")
                        *//*viewmodel.onReplaceSwitchSingleMedicine(items[position], true)*//*
                    }
                })*/

                replaceBottomSheet.setCallback(object :
                    OrgSubCompareBottomSheetCallback {
                    override fun closeClick(isReload: Boolean) {
                        Log.e("Replace", "Close event")
                        /*viewmodel.onReplaceSwitchSingleMedicine(items[position], true)*/
                    }

                    override fun openPDPageCart(
                        productCode: String?,
                        subs: Boolean?,
                        productInfoModel: com.intellihealth.truemeds.presentation.model.ProductInfoModel
                    ) {
                        if (replaceBottomSheet.isVisible)
                            replaceBottomSheet.dismiss()
                        var isOrgAdded: String? = "false"
                        if (productInfoModel.isOrgAddedToCart || productInfoModel.isSubsAddedToCart) {
                            isOrgAdded = "true"
                        }

                        val productInfoGson =
                            Gson().toJson(productInfoModel)//Gson().toJson(productInfo)
                       /* startActivity(
                            Intent(this@OrderSummaryActivity, ProductDetailActivity::class.java)
                                .putExtra(BundleConstants.PRODUCT_CODE, productCode)
                                .putExtra(BundleConstants.IS_SUBS, subs)
                                .putExtra(BundleConstants.ORG_PRODUCT_OF_SUBS, productInfoGson)
                                .putExtra(BundleConstants.IS_ORG_ADDED_TO_CART, isOrgAdded)
                                .putExtra(
                                    BundleConstants.SEARCH_TYPE,
                                    ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                                )
                        )*/

                        navigateToProductDetailActivity(
                            params = bundleOf(
                                BundleConstants.PRODUCT_CODE to productCode,
                                BundleConstants.IS_SUBS to subs,
                                BundleConstants.ORG_PRODUCT_OF_SUBS to productInfoGson,
                                BundleConstants.IS_ORG_ADDED_TO_CART to isOrgAdded,
                                BundleConstants.SEARCH_TYPE to ElasticSearchType.FETCH_PRODUCT_DETAILS.toString()
                            )
                        )

                    }
                })



                if (!replaceBottomSheet.isVisible)
                    supportFragmentManager?.let {
                        replaceBottomSheet.show(
                            supportFragmentManager,
                            "COMPARE_AND_UNDERSTAND"
                        )
                    }
            }
        })


        viewModel.eventUpdateCoupon.observe(this, EventObserver {
            couponSavedData()
        })
        /*viewModel.apiMedicineList.observe(this, Observer {
            if ((viewModel.apiMedicineList.value?.size ?: 0) == 2)
                binding.btnViewMore.setTitle("View 1 more item")
            else
                binding.btnViewMore.setTitle("View " + viewModel.apiMedicineList.value!!.size.minus(1) + " more items")
        })*/

        viewModel.eventMessage.observe(this, EventObserver {
            if (it != null)
                when (it.messageEnum) {
                    MESSAGES.VIEW_CHANGES_CLICK -> {
                        initializeBottomSheet()
                        itemNoLongerAvailableBottomSheet.isCancelable = true

                        itemNoLongerAvailableBottomSheet.setCallback(object :
                            ProductBottomSheetCallback {
                            override fun closeClick() {
                                viewModel.triggerSaveMeds(
                                    SharedPrefManager.getInstance().incompleteOrderId,
                                    false,
                                    "SUMMARY"
                                )
                                val crossSellType: MutableSet<String> = HashSet()
                                crossSellType.add("LAST_MINUTE_BUY")
                                viewModel.getSessionToken(
                                    warehouseId = SharedPrefManager.getInstance().selectedWarehouseID,
                                    pageNumber = 0,
                                    type = "App",
                                    subType = crossSellType,
                                    pageSize = 30,
                                    variantId = SharedPrefManager.getInstance().algoSpecificVariantId
                                )
                                //                            viewModel.fetchCartDetails(false, "SUMMARY")
                            }
                        })
                        if (!itemNoLongerAvailableBottomSheet.isVisible) {
                            itemNoLongerAvailableBottomSheet.show(
                                supportFragmentManager,
                                "SearchReOrderBottomsheet"
                            )

                        }

                    }

                    MESSAGES.SHOW_MEDS_UNAVAILABLE -> {
                        CommonFunc.showCustomToastMessage(
                            this,
                            "Added medicine are not deliverable at your location"
                        )
                    }

                    MESSAGES.SHOW_MEDS_OUT_OF_STOCK -> {
                        CommonFunc.showCustomToastMessage(
                            this,
                            "Added medicine are currently out of stock"
                        )
                    }

                    MESSAGES.SHOW_MEDS_NOT_SUPPLIED -> {
                        CommonFunc.showCustomToastMessage(
                            this,
                            "Added medicine are not for sale"
                        )
                    }

                    MESSAGES.OPEN_PD_BOTTOM_SHEET_ORDER_SUMMARY -> {
                        val eventOrgProduct = viewModel.eventProductForBottomSheet
                        var sectionHeading: String? = ""
                        if (!viewModel.productForBottomSheet.sectionHeading.isNullOrEmpty()) {
                            if (viewModel.productForBottomSheet.sectionHeading?.toLowerCase()
                                    ?.contains("trending") == true
                            ) {
                                sectionHeading = "trending_in_city"
                            } else if (viewModel.productForBottomSheet.sectionHeading?.toLowerCase()
                                    ?.contains("limited") == true
                            ) {
                                sectionHeading = "limited_offer"
                            } else if (viewModel.productForBottomSheet.sectionHeading?.toLowerCase()
                                    ?.contains("arrival") == true
                            ) {
                                sectionHeading = "new_arrivals"
                            } else if (viewModel.productForBottomSheet.sectionHeading?.toLowerCase()
                                    ?.contains("minute") == true
                            ) {
                                sectionHeading = "last_minute_buy"
                            } else {
                                sectionHeading =
                                    viewModel.productForBottomSheet.sectionHeading ?: null
                            }
                        }
                        val productDetailsBottomSheet =
                            ProductDetailBottomSheet(
                                productCode = viewModel.productCodeForBottomSheet,
                                isSubs = viewModel.productCodeForBottomSheetIsSubs,
                                switchBackSkuNameForBottomSheetSubs = viewModel.switchBackSkuNameForBottomSheetSubs,
                                clickedOnPage = "Order Summary",
                                pageSection = "main",
                                subsFoundEventOrderSummary = viewModel.subsFoundEventOrderSummary
                                    ?: "",
                                crossSellingHeading = sectionHeading,
                                crossSellingItemClickPos = viewModel?.productForBottomSheet?.crossSellingItemClickPosition,
                                isBottomSheetBehaviour = false,
                                isHideToolbar = true,
                                isHideCart = true
                            )
                        productDetailsBottomSheet.isCancelable = true
                        productDetailsBottomSheet.dataFromOrderStatus(
                            false,
                            viewModel.productForBottomSheet,
                            isOTC = false, eventOrgProduct
                        )

                        productDetailsBottomSheet.setCallback(object : ProductBottomSheetCallback {
                            override fun closeClick() {

                                if (isNetworkAvailable(this@OrderSummaryActivity)) {
                                    viewModel.loaderValue.postValue(true)
                                    viewModel.isLastMinuteBuyRestored = true
                                    viewModel.viewModelScope.launch(Dispatchers.IO) {
                                        val currentMap = viewModel.getExistingCartMap()
                                        if (previousMap != currentMap) {
//                                            viewModel.loaderValue.postValue(true)
                                            viewModel.triggerSaveMeds(
                                                SharedPrefManager.getInstance().incompleteOrderId,
                                                false,
                                                "SUMMARY"
                                            )
//                                            val crossSellType: MutableSet<String> = HashSet()
//                                            crossSellType.add("LAST_MINUTE_BUY")
//                                            viewModel.getSessionToken(
//                                                warehouseId = SharedPrefManager.getInstance().selectedWarehouseID,
//                                                pageNumber = 0,
//                                                type = "App",
//                                                subType = crossSellType,
//                                                pageSize = 30,
//                                                variantId = SharedPrefManager.getInstance().algoSpecificVariantId
//                                            )
//                                            if (viewModel.activePage == "SUMMARY") {
//                                                viewModel.viewModelScope.launch(Dispatchers.IO) {
//                                                    viewModel.updateCrossSellingList(
//                                                        viewModel.crossSellingProducts,
//                                                        viewModel.productCodeForBottomSheet ?: ""
//                                                    )
//                                                }
//                                            }
//
//                                            getApiData()//pd  bottomsheet close
                                            viewModel.updateLastMinuteBuyQty()

                                        } else {
                                            viewModel.loaderValue.postValue(false)
                                        }
                                    }
                                    viewModel.isPDBottomsheetClosed.postValue(true)

                                }


                            }
                        })

                        viewModel.viewModelScope.launch(Dispatchers.IO) {
                            if (previousMap.isNullOrEmpty()) {
                                previousMap = HashMap<String, Int>()
                            }
                            previousMap = viewModel.getExistingCartMap()

                        }

                        if (!productDetailsBottomSheet.isVisible) {
                            productDetailsBottomSheet.show(
                                supportFragmentManager, "ProductDetailBottomsheet"
                            )
                        }
                    }

                    MESSAGES.ADD_MORE_PRESCRIPTION_CLICK -> {
                        openPrescriptionActivity()
                    }

                    MESSAGES.UPLOAD_PRESCRIPTION_CLICK -> {
                        //Toast().showCustomToastMessage(context, "Upload prescription clicked")
                        openPrescriptionActivity()
                    }

                    MESSAGES.UPLOAD_PRESCRIPTION_SUCCESSFULLY -> {
                        Log.d("TAG", "setObserver: ACTION_UPLOAD_PRESCRIPTION")
                        Toast().showCustomToastMessage(
                            this,
                            getString(R.string.txt_successfully_uploaded)
                        )
                        //                    setResult(RESULT_OK)
                    }

                    MESSAGES.APPLY_COUPON_CLICK -> {

                        with(SharedPrefManager.getInstance()) {
                            if (couponCode == null || incompleteOrderId == 0L) return@with
                            //for remove send offer id 0
                            viewModel.saveRemoveCouponCode(
                                incompleteOrderId,
                                SharedPrefManager.getInstance().offerId,
                                ClassNameConstants.ORDER_SUMMARY_ACTIVITY, "order_summary"
                            )
                            Toast().showCustomToastMessage(context, "Apply coupon clicked")
                        }

                    }

                    MESSAGES.VIEW_MORE_CLICK -> {
                        if (viewModel.isExpanded) {

                            viewModel.isExpanded = false
                            //binding.btnViewMore.setTitle(context.getString(R.string.view_more))
                            if ((viewModel.apiMedicineList.value?.size ?: 0) == 2)
                                binding.btnViewMore.text = "View 1 more item"
                            else
                                binding.btnViewMore.text =
                                    "View " + viewModel.apiMedicineList.value!!.size.minus(
                                        1
                                    ) + " more items"

                            binding.ivViewMore.rotation = 0f

                        } else if (!viewModel.isExpanded) {
                            viewModel.isExpanded = true
                            //binding.btnViewMore.setTitle(context.getString(R.string.view_less))
                            binding.btnViewMore.text = context.getString(R.string.view_less)
                            binding.ivViewMore.rotation = 180f

                        }

                    }

                    MESSAGES.REMOVED_COUPON_SUCCESSFULLY -> {
                        viewModel.stopCouponTimer()
                        Log.d("TAG", "setObservers: REMOVED_COUPON_SUCCESSFULLY")
                        binding.tmApplyCoupon.setUpData(
                            ApplyCouponModel(
                                "Apply Coupon",
                                ""
                            ), CouponModel(
                                CouponConstant.APPLY_COUPON, "", "", false, "", "", arrayListOf(),
                                "",
                                "",
                                "",
                                isFtcCoupon = false,
                                showFtcCounter = false,
                                timestamp = 0L,
                            )
                        )

                        if (SharedPrefManager.getInstance().couponModel != null) {
                            viewModel.paymentCarouselOgList.forEach { item ->
                                item.isCouponApplied =
                                    item.promoCode == SharedPrefManager.getInstance().couponModel.promoCode
                            }
                        } else {
                            viewModel.paymentCarouselOgList.forEach { item ->
                                item.isCouponApplied = false
                            }
                        }
                        viewModel.paymentCarouselList.postValue(
                            viewModel.convertToPaymentCarousel(
                                viewModel.paymentCarouselOgList
                            )
                        )

                        couponSavedData()
                        CommonFunc.showCustomToastMessage(
                            this@OrderSummaryActivity,
                            it.displayMessage
                        )
                    }

                    else -> {}
                }
        })

        viewModel.eventBaseMessage.observe(this, EventObserver {
            if (it == null) return@EventObserver
            when {
                it.equals(MESSAGES.REMOVED_COUPON_SUCCESSFULLY) -> {
                    Toast().showCustomToastMessage(
                        this@OrderSummaryActivity,
                        getString(R.string.auto_coupon_remove_message)
                    )
                    viewModel.stopCouponTimer()
                    Log.d("TAG", "setObservers: REMOVED_COUPON_SUCCESSFULLY")
                    binding.tmApplyCoupon.setUpData(
                        ApplyCouponModel(
                            "Apply Coupon",
                            ""
                        ), CouponModel(
                            CouponConstant.APPLY_COUPON, "", "", false, "", "", arrayListOf(),
                            "",
                            "",
                            "",
                            isFtcCoupon = false,
                            showFtcCounter = false,
                            timestamp = 0L,
                        )
                    )
                    SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime = 0L

                    /*if (SharedPrefManager.getInstance().couponModel != null) {
                        viewModel.paymentCarouselOgList.forEach { item ->
                            item.isCouponApplied =
                                item.promoCode == SharedPrefManager.getInstance().couponModel.promoCode
                        }
                    }
                    viewModel.paymentCarouselList.postValue(
                        viewModel.convertToPaymentCarousel(
                            viewModel.paymentCarouselOgList
                        )
                    )

                     */

                    couponSavedData()
                }

            }
        })

        viewModel.eventMessageForPrescription.observe(this, EventObserver {
            if (it == null) return@EventObserver
            when {
                it.equals(MESSAGES.PAST_PRESCRIPTION_IMAGE_UPLOAD_SUCCESSFULLY) -> {
                    bottomSheet?.bottomSheet?.dismiss()
                    viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
                    com.intellihealth.salt.views.Toast().showCustomToastMessage(
                        this,
                        getString(R.string.txt_successfully_uploaded)
                    )
                }

                it.equals(MESSAGES.DELETE_PRESCRIPTION_CLICK) -> {
                    viewModel.deletePrescription(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        false,
                        listOf(prescriptionImageId),
                        SharedPrefManager.getInstance().loggedInUserId.toString()
                    )
                }

                it.equals(MESSAGES.DELETE_PRESCRIPTION_SUCCESSFULLY) -> {
//                    viewModel.fetchCartDetails(false, "SUMMARY")
                    viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
                    viewModel.evenSendPrescriptionRemovedEvent("Order Summary")
                }

                it.equals(MESSAGES.EMPTY_PRESCRIPTION_LIST) -> {
//                    viewModel.fetchCartDetails(false, "SUMMARY")
                    if (viewModel.apiMedicineList.value.isNullOrEmpty()) {
                        navigateToCartActivity(
                            params = bundleOf(
                                BundleConstants.DISCARD_API_CALLED to true
                            ),
                            flags = listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        )
                        finish()
                    }
                }
            }
        })

        viewModel.eventShowError.observe(this, EventObserver {
            if (it.equals(MESSAGES.SHOW_MEDS_UNAVAILABLE)) {
                CommonFunc.showCustomToastMessage(
                    this,
                    "Added medicine are not deliverable at your location"
                )
            }
        })


        /**
         * Just to call when Reorder Cross selling clicked
         * **/
        viewModel.eventLaunchPDPage.observe(this, EventObserver {
            it?.let {
                val productDetailsBottomSheet =
                    ProductDetailBottomSheet(
                        productCode = it.product.productCode,
                        isSubs = false,
                        switchBackSkuNameForBottomSheetSubs = it.product.switchBackProductCode
                            ?: "",
                        clickedOnPage = "Order Summary",
                        pageSection = "main",
                        isHideToolbar = true
                    )
                productDetailsBottomSheet.isCancelable = true
                productDetailsBottomSheet.dataFromOrderStatus(
                    false,
                    it,
                    isOTC = true
                )

                viewModel.viewModelScope.launch(Dispatchers.IO) {
                    if (previousMap.isNullOrEmpty()) {
                        previousMap = HashMap<String, Int>()
                    }
                    previousMap = viewModel.getExistingCartMap()
                }

                productDetailsBottomSheet.setCallback(object : ProductBottomSheetCallback {
                    override fun closeClick() {

                        if (isNetworkAvailable(this@OrderSummaryActivity)) {
                            viewModel.loaderValue.postValue(true)
                            viewModel.viewModelScope.launch(Dispatchers.IO) {
                                val currentMap = viewModel.getExistingCartMap()
                                if (previousMap != currentMap) {

                                    viewModel.onAddCrossSellingPd(it, 1)
                                    /*val crossSellType: MutableSet<String> = HashSet()
                                    crossSellType.add("LAST_MINUTE_BUY")
                                    viewModel.getSessionToken(
                                        warehouseId = SharedPrefManager.getInstance().selectedWarehouseID,
                                        pageNumber = 0,
                                        type = "App",
                                        subType = crossSellType,
                                        pageSize = 5,
                                        variantId = SharedPrefManager.getInstance().algoSpecificVariantId
                                    )
                                    if (viewModel.activePage == "SUMMARY") {
                                        viewModel.viewModelScope.launch(Dispatchers.IO) {
                                            viewModel.updateCrossSellingList(
                                                viewModel.crossSellingProducts,
                                                viewModel.productCodeForBottomSheet ?: ""
                                            )
                                        }
                                    }*/
//                                    viewModel.eventShowOTCList.postValue(Event(Any()))
                                    getApiData()//pd bottomsheet close


                                } else {
                                    viewModel.loaderValue.postValue(false)
                                }
                            }

                        }

                    }
                })

                if (!productDetailsBottomSheet.isVisible) {
                    productDetailsBottomSheet.show(
                        supportFragmentManager, "ProductDetailBottomsheet"
                    )
                }

            }
        })

        viewModel.deleteProductEventListener.observe(this, EventObserver {
            if (it == null) return@EventObserver
            try {
                if (it) {
                    editDeleteAddressBottomSheet.isCancelable = true
                    val lastRecordedData = isSingleClick(mLastClickTimeForDeletBottomSheet)
                    mLastClickTimeForDeletBottomSheet = lastRecordedData.second
                    if (!editDeleteAddressBottomSheet.isVisible && !editDeleteAddressBottomSheet.isAdded && lastRecordedData.first) {
                        editDeleteAddressBottomSheet.setBottomSheet(viewModel)
                        editDeleteAddressBottomSheet.show(
                            supportFragmentManager, "Discard unsaved details?"
                        )
                    }
                } else {
                    viewModel.isFirstTimeCall = false
                    if (editDeleteAddressBottomSheet.isVisible) {
                        editDeleteAddressBottomSheet.dismiss()
                    }
                }
            } catch (_: Exception) {
            }
        })

        viewModel.isDelete.observe(this, EventObserver {
            if (it != null) if (it) {

                viewModel.isLastMinuteBuyRestored = true
                val editList: List<MedicineDto> = viewModel.getEditOrderRequestData(
                    viewModel.selectedMedicineProductCode,
                    viewModel.selectedMedicineProductQty
                )
                viewModel.editMedicine(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    editList,
                    true,
                    "SUMMARY",
                    viewModel.selectedMedicineSwitchBackProductCode
                )
                viewModel.updateLastMinuteBuyQty()

            } else {
                if (editDeleteAddressBottomSheet.isVisible) {
                    editDeleteAddressBottomSheet.dismiss()
                }
            }
        })


        /*   viewModel.isDeleteCompleted.observe(this, EventObserver {

               if (it) {
                   Log.e("item_deleted::::","yessss:::"+it.toString()+":::"+viewModel.selectedMedicineProductCode)
                   viewModel.deleteMedicineFromCart(viewModel.selectedMedicineProductCode, false)

                  // viewModel.isDeleteCompleted.value=Event(false)
               }
           })*/

        viewModel.loaderValue.observe(this) {
            if (it) {
                window.setFlags(
                    WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                    WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
                )
            } else {
                window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            }
        }
        viewModel.launchOrderIsBeingPlaced.observe(this) {
            if (it) {
                // viewModel.setMainDataView.value = false
                //  viewModel.orderPlacedView.value = false
                viewModel.orderIsBeingPlacedView.value = true
            }
        }
        viewModel.launchOrderIsBeingPlacedCaseFailed.observe(this) {
            if (it) {
                viewModel.orderIsBeingPlacedView.value = false
                // viewModel.setMainDataView.value = true
                // viewModel.orderPlacedView.value = true
            }
        }
        viewModel.launchOrderIsBeingPlacedForUnavailable.observe(this) {
            if (it) {
                callPSPActivity()
            }
        }

        viewModel.eventLaunchOrderStatus.observe(this, EventObserver {
            it?.let {
                /* viewModel.setMainDataView.value = false
                 viewModel.orderPlacedView.value = false
                 viewModel.orderIsBeingPlacedView.value = true
                 */
                viewModel.setMainDataView.value = false
                viewModel.orderIsBeingPlacedView.value = false

                lifecycleScope.launch {
                    viewModel.orderIsBeingPlacedView.value = false
                    viewModel.orderPlacedView.value = true


                    with(binding.lottieView) {
                        setAnimation("orderplacedsuccessfully.json")
                        repeatCount = 0
                        playAnimation()
                    }


                    delay(1400)

                    var distanceToTop: Float =
                        -300f// Negative value to move upwards - default value
                    if (binding.lottieView.getY() > 0) {
                        distanceToTop =
                            -binding.lottieView.getY() // Negative value to move upwards - caculated
                    }
                    Log.e("negative_dis::", ":::::" + distanceToTop)


                    ObjectAnimator.ofFloat(binding.tvOrderPlaced, "translationY", distanceToTop)
                        .apply {
                            duration = 900
                            binding.tvOrderPlaced.visibility = View.VISIBLE
                            start()
                        }

                    delay(3000)
                    navigateToOrderStatusActivity(
                        params = bundleOf(
                            "onFinishReCreateHomePage" to true,
                            BundleConstants.ORDER_ID to orderId,
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "order_summary",
                        ),
                        isFlagAdded = true
                    )

                    finishAffinity()
                }
            }
        })
        couponViewModel.eventOpenCouponPopup.observe(this, EventObserver {
            if (it.second?.message.equals("Success")) {

                viewModel.viewModelScope.launch(Dispatchers.IO) {
                    viewModel.getCartBillDetails(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        ClassNameConstants.ORDER_SUMMARY_ACTIVITY
                    )
                }

                if (it.second?.responseData?.isOfferApplied == true) {
                    var dialog: DialogFragment? = null
                    val callback = object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            /* viewModel.viewModelScope.launch(Dispatchers.IO) {
                                 viewModel.getCartBillDetails(
                                     SharedPrefManager.getInstance().incompleteOrderId,
                                     ClassNameConstants.ORDER_SUMMARY_ACTIVITY
                                 ) // todo this api needs to call outside not on success popup action clicked
                             }*/

                            /*if (it.first.paymentMethods != null && SharedPrefManager.getInstance().selectedPaymentMethod.isNotEmpty()) {
                                viewModel.setUpPaymentContainer(
                                    SharedPrefManager.getInstance().selectedPaymentMethod,
                                    SharedPrefManager.getInstance().selectedPaymentMethodIconUrl
                                )
                            }*/
                            dialog?.dismiss()
                            /*val resultIntent = Intent()
                        resultIntent.putExtra(BundleConstants.RELOAD_BILL_DETAILS, true)
                        setResult(Activity.RESULT_OK, resultIntent)
                        finish()

                         */


                        }

                        override fun onCloseButtonClicked() {
                        }

                    }
                    /**
                     * This pop up is used to show savings on coupon
                     */
                    dialog = CouponApplySuccess(
                        couponCode = it.first.promoCode ?: "",
                        saving = it.second?.responseData?.couponDiscount ?: 0.0,
                        callback = callback,
                        expiryTime = it.first.expiryDate ?: 0L,
                        isFtcCounterEnabled = it.first.showFtcCounter == true,
                        description = it.second?.responseData?.description?.joinToString(separator = "\n"),
                        //description = it.second?.responseData?.description,
                        tnc = it.second?.responseData?.tnc,
                        ftcViewModel,
                        currentPaymentIconType = couponViewModel.currentPaymentIconType
                    )
                    dialog.isCancelable = true
                    if (!dialog.isVisible) {
                        dialog.show(this.supportFragmentManager, "CouponApplySuccess")
                    }
                    /**
                     * After coupon applied success updating payment carousel and coupon cta
                     */
                    viewModel.paymentCarouselOgList.forEach { item ->
                        item.isCouponApplied = item.promoCode == it.first.promoCode
                    }
                    viewModel.paymentCarouselList.postValue(
                        viewModel.convertToPaymentCarousel(
                            viewModel.paymentCarouselOgList
                        )
                    )
                    couponSavedData()
                } else {
                    openApplyCouponValidationPopup(it.first, it.second)
                }

            } else {
                CommonFunc.openErrorDialog(this@OrderSummaryActivity, it.second?.message ?: "")
            }


        })


        couponViewModel.eventOpenCouponFailed.observe(this, EventObserver {
            var dialogFailed: DialogFragment? = null
            val callback = object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                    dialogFailed?.dismiss()
                }

                override fun onCloseButtonClicked() {
                }
            }

            /**
             * This pop up is used to show error on coupon
             */
            dialogFailed = CouponErrorPopup(
                couponCode = it?.promoCode ?: "",
                cartValue = it?.minCartValue ?: 0,
                message = getString(R.string.couponErrorMsg_without_dot) + (it?.minCartValue
                    ?: 0.0) + getString(
                    R.string.couponErrorMsgAvailable
                ),
                callback = callback,
            )
            dialogFailed.isCancelable = true
            if (!dialogFailed.isVisible) {
                dialogFailed.show(this.supportFragmentManager, "CouponErrorPopup")
            }
        })

        viewModel.eventLaunchEmptyCart.observe(this, EventObserver {
            it?.let {
                //this line is added to false is reorder case
                navigateToCartActivity(
                    params = bundleOf(
                        BundleConstants.DISCARD_API_CALLED to true
                    ),
                    flags = listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
                finish()
            }
        })
        /*
                viewModel.eventOpenCouponBottomSheet.observe(this, EventObserver {
                    val paymentCarouselBottomSheet =
                        PaymentCarouselBottomSheet(it[paymentCarouselBottomSheet], ftcViewModel, applyCouponCallBack!!, viewModel)
                    couponCodeOfferBottomSheet.isCancelable = true
                    if (!couponCodeOfferBottomSheet.isVisible) {
                        couponCodeOfferBottomSheet.show(
                            this.supportFragmentManager, "CouponCodeOfferBottomSheet"
                        )
                    }


                })
        */

        viewModel.billDetails.observe(this) {
            it?.let {
                if (it.mrpValue != null && (it.mrpValue ?: 0.0) > 0.0) {
                    binding.billDetails.setUpBillDetailsData(it, 0)
                } else {
                    val pharmacistPaymentModeOffData = BillDetailsModel(
                        billDetailsTitle = "Bill Details",
                        postProcessingMsg = "Total amount will be calculated post processing",
                        creditRewardMsg = if (viewModel.prescriptions.value?.isNotEmpty() == true && (viewModel.productList.value == null || viewModel.productList.value?.isEmpty() == true) && SharedPrefManager.getInstance().tmWallet.toDouble() > 0) "Please note: TM Reward & Credit will be auto applied once the order has been processed." else null
                    )
                    binding.billDetails.setUpBillDetailsData(pharmacistPaymentModeOffData, 1)
                }
            }
            if (it == null) {
                val pharmacistPaymentModeOffData = BillDetailsModel(
                    billDetailsTitle = "Bill Details",
                    postProcessingMsg = "Total amount will be calculated post processing"
                )
                binding.billDetails.setUpBillDetailsData(pharmacistPaymentModeOffData, 1)
            }
        }
        viewModel.eventApplyCouponFailed.observe(this, EventObserver {
            PopUpManager.showPopUp(
                fragmentManager = supportFragmentManager,
                popUpType = PopUpType.COUPON_FAILED,
                object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {}
                    override fun onCloseButtonClicked() {}
                }, false
            )
        })
        viewModel.isPDBottomsheetClosed.observe(this@OrderSummaryActivity) {
            if (SharedPrefManager.getInstance().couponModel == null) {
                viewModel.stopCouponTimer()
                binding.tmApplyCoupon.setUpData(
                    ApplyCouponModel(
                        "Apply Coupon",
                        ""
                    ), CouponModel(
                        CouponConstant.APPLY_COUPON, "", "", false, "", "", arrayListOf(),
                        "",
                        "",
                        "",
                        isFtcCoupon = false,
                        showFtcCounter = false,
                        timestamp = 0L,
                    )
                )
            }
        }
    }

    private fun initializeBottomSheet() {
        itemNoLongerAvailableBottomSheet = ItemNoLongerAvailableBottomSheet()
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
                this@OrderSummaryActivity.supportFragmentManager,
                "CouponNotApplied"
            )
        }

    }

    private fun setSavingSpectacularData() {

//        binding.tmStickyPaymentPlaceOrder.setOnSingleClickListener {  }

        binding.tmStickyPaymentPlaceOrder.setCallback(object : PaymentContainerCallback {
            override fun viewClickCallback(viewType: PaymentContainerConstants) {
                when (viewType) {
                    PaymentContainerConstants.CHANGE -> {
                        navigateToDeliveryDetailsActivity(
                            params = bundleOf(
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to viewModel.clickedOnPage
                            ),
                            activityLauncher = activityLauncher
                        )
                    }

                    PaymentContainerConstants.PAY -> {
                        val (valid, message) = viewModel.processValidationForPSP()
                        if (!valid) {
                            Toast().showCustomToastMessage(context, message)
                            return
                        }

                        if (viewModel.paymentContainerModel.paymentContainerType == PaymentContainerType.SELECT_PAYMENT || viewModel.paymentContainerModel.paymentContainerType == PaymentContainerType.RX_SELECT_PAYMENT) {
                            if (viewModel.itemsNotAvailable.value == true) {
                                showConfirmationUnavailableMedicine(BundleConstants.OS_SELECT_PAYMENT_MODE_FLOW)
                            } else {
                                callPSPActivity()
                            }
                        } else {
                            if (viewModel.itemsNotAvailable.value == true) {
                                showConfirmationUnavailableMedicine(BundleConstants.OS_PLACE_ORDER_FLOW)
                            } else {
                                viewModel.confirmOrder()
                            }
                        }

                    }

                    PaymentContainerConstants.PLACE_ORDER -> {
                        val lastClickTime: Long = mLastClickTime
                        val now = System.currentTimeMillis()
                        mLastClickTime = now
                        if (now - lastClickTime < OnSingleClickListener.MIN_DELAY_MS) {
                            return
                        } else {
                            // Register the click
                            val (valid, message) = viewModel.processValidationForPSP()
                            if (!valid) {
                                Toast().showCustomToastMessage(context, message)
                                return
                            }

                            if (viewModel.paymentContainerModel.paymentContainerType == PaymentContainerType.SELECT_PAYMENT || viewModel.paymentContainerModel.paymentContainerType == PaymentContainerType.RX_SELECT_PAYMENT) {
                                callPSPActivity()
                            } else {
                                viewModel.confirmOrder()
                            }
                        }

//                        Toast().showCustomToastMessage(context, "Place order click")
                        //val intent = Intent(this@OrderSummaryActivity, PaymentOptionActivity::class.java)
                        //  startActivity(intent)
                    }

                    PaymentContainerConstants.PAY_USING -> {

                        // The below code is used to process the validation before going to PSP screen
                        // Check patientId, addressId, if address is serviceable/deliverable

                        val (valid, message) = viewModel.processValidationForPSP()
                        if (!valid) {
                            Toast().showCustomToastMessage(context, message)
                            return
                        }
                        //callPSPActivity()
                        if (viewModel.itemsNotAvailable.value == true) {
                            showConfirmationUnavailableMedicine(BundleConstants.OS_SELECT_PAYMENT_MODE_FLOW)
                        } else {
                            callPSPActivity()
                        }
                    }
                }
            }


        })

    }

    private fun showConfirmationUnavailableMedicine(type: String) {
        val removeUnavailableProductBottomSheet =
            com.intellihealth.truemeds.presentation.bottomsheet.search.RemoveUnavailableProductBottomSheet(
                object : DeleteCallback {
                    override fun yesClick() {
                        when (type) {
                            BundleConstants.OS_PLACE_ORDER_FLOW -> {
                                viewModel.confirmOrder()
                            }

                            else -> {
                                viewModel.confirmOrder(false)
                            }
                        }
                    }
                })
        removeUnavailableProductBottomSheet.isCancelable = true
        if (!removeUnavailableProductBottomSheet.isVisible && fragmentManager != null && CommonFunc.isSingleClickParam())
            removeUnavailableProductBottomSheet.show(this.supportFragmentManager, "remove product")
    }

    /*    fun launchOrderIsBeingPlacedView()
        {
            viewModel.setMainDataView.value = false
            viewModel.orderPlacedView.value = false
            viewModel.orderIsBeingPlacedView.value = true
        }

    fun launchOrderIsBeingPlacedViewDismissed()
    {
        viewModel.orderIsBeingPlacedView.value = false
        viewModel.setMainDataView.value = true
        viewModel.orderPlacedView.value = true

    }*/

    fun callPSPActivity() {
        var productIds = ArrayList<String>(0)
        var productNames: ArrayList<String> = ArrayList<String>(0)
        if (viewModel.orderMedicineDetailsListData.size > 0) {
            for (i in 0..<viewModel.orderMedicineDetailsListData.size) {
                productNames.add(viewModel.orderMedicineDetailsListData[i].skuName ?: "")
                productIds.add(viewModel.orderMedicineDetailsListData[i].productCode ?: "")
            }
        }
        //collect data for psp
        var isValid = viewModel.checkIfOrderIsValid()
        if (!isValid) {
            val cartList = viewModel.apiMedicineList.value ?: mutableListOf()
            /*0000- Pay using - club all below conditions and launch bottomsheet here */
            if (viewModel.outOfStockCount == cartList.size) {
                /*CommonFunc.showCustomToastMessage(
                    this,
                    "Added medicine are currently out of stock"
                )*/
                viewModel.discardOrder()
            } else if (viewModel.notForSaleCount == cartList.size) {
                /* CommonFunc.showCustomToastMessage(
                     this,
                     "Added medicine are not for sale"
                 )*/
                viewModel.discardOrder()
            } else if (viewModel.notDeliverableCount == cartList.size) {
                /* CommonFunc.showCustomToastMessage(
                     this,
                     "Added medicine are not deliverable at your location"
                 )*/
                viewModel.discardOrder()
            } else {
                /* CommonFunc.showCustomToastMessage(
                     this,
                     "Added medicine are not deliverable at your location"
                 )*/
                viewModel.discardOrder()
            }

            return
        } else {
            val billDetailsModel = viewModel.billDetails.value


            if (billDetailsModel == null) {
                Log.i("TAG", "proceedToPaymentSelectionPage: bill detail null")
                return
            }


            var isPaymentSpecificCoupon = false
            if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.paymentMethods != null
                && SharedPrefManager.getInstance().couponModel.paymentMethods?.get(0)?.iconType!!.isNotEmpty()
            ) {
                isPaymentSpecificCoupon = true
            }

            val pspIntent = Intent(this@OrderSummaryActivity, PaymentOptionActivity::class.java)
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD,
                viewModel.selectedPaymentMethod
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_LAST_SELECTED_PAYMENT_METHOD_ID,
                viewModel.selectedPaymentMethodId
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_COUPON_APPLIED_NAME,
                if (viewModel.isAppliedCoupon.value!! && viewModel.couponCodeDataModel.value != null) viewModel.couponCodeDataModel.value
                    ?.coupon_code else ""
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_PATIENT_ID,
                SharedPrefManager.getInstance().patientId
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_ADD_MORE_FOR_COD,
                viewModel.addMoreForCod.value
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_RESTRICT_COD,
                viewModel.restrictCod.value
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_BILL_DETAIL,
                Gson().toJson(viewModel.billDetails.value)
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,
                BundleConstants.ORDER_SUMMARY
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_ORDER_PAGE_SECTION,
                viewModel.orderPageSection
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_ORDER_IS_DELIVERED_OR_CANCELLED,
                viewModel.orderPreviousStage ?: ""
            )

            pspIntent.putExtra(BundleConstants.BUNDLE_KEY_INCLUDE_COD, true)
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_PAYMENT_RESTRICTED_TYPE,
                viewModel.paymentRestrictedType.value
            )
            pspIntent.putExtra(BundleConstants.BUNDLE_KEY_PAYABLE_AMOUNT_TEXT, false)
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_ONLY_PRESCRIPTION,
                viewModel.productList.value!!.isEmpty()
                        && viewModel.prescriptions.value!!.isNotEmpty()
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_ONLY_PRESCRIPTION_UPLOADED_COUNT,
                viewModel.prescriptions.value!!.size
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_ORDER_ID,
                orderId.toString()
            )
            if (viewModel.selectedPaymentMethod.isNullOrEmpty()) {
                pspIntent.putExtra(
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION,
                    BundleConstants.SELECT_PAYMENT_MODE
                )
            } else {
                pspIntent.putExtra(
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION,
                    BundleConstants.PAY_USING
                )
            }
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_IS_REORDER,
                SharedPrefManager.getInstance().isReOrder
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_PATIENT_TYPE,
                viewModel.patientType.value
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_PATIENT_AGE, viewModel.patientAge.value.toString()
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_PATIENT_GENDER, viewModel.patientGender.value

            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_SHIPPING_CITY,
                SharedPrefManager.getInstance().selectedCity
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_SHIPPING_STATE,
                viewModel.selectedAddress.stateName
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_SHIPPING_PINCODE,
                SharedPrefManager.getInstance().pincode
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_ADDRESS_TYPE,
                SharedPrefManager.getInstance().addressType
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_NO_OF_ITEMS,
                productIds.size
            )
            pspIntent.putExtra(BundleConstants.BUNDLE_KEY_ITEM_NAMES, productNames)
            pspIntent.putExtra(BundleConstants.BUNDLE_KEY_PRODUCT_IDS, productIds)
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_RX_REQUIRED,
                viewModel.rxRequired
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_CURRENT_ORDER_STATUS,
                CommonFunc.getStatusNameFromId(49)
            )
            pspIntent.putExtra(BundleConstants.BUNDLE_KEY_CURRENT_ORDER_STATUS_ID, 49)
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_IS_PAYMENT_SPECIFIC_COUPON,
                isPaymentSpecificCoupon
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_TOTAL_OUT_OF_STOCK_COUNT,
                viewModel.totalOutOfStockCount
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_TRACK_PURCHASE_EVENTS,
                "Ordersummary_Confirmorder"
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_IS_CHRONIC_ADDED,
                viewModel.isChronicAdded
            )
            pspIntent.putExtra(BundleConstants.BUNDLE_KEY_IS_OTC_ADDED, viewModel.isOtcAdded)
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_IS_GENERIC_ADDED,
                viewModel.isGenericAdded
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_SELLING_PRICE,
                viewModel.salesPriceEventValue
            )
            pspIntent.putExtra(
                BundleConstants.BUNDLE_KEY_SUBS_ID,
                viewModel.orderSubsId
            )
            pspIntent.putExtra(
                "ORDER_TYPE_ID",
                viewModel.orderTypeId
            )
            // TODO for mixpanel
            /*pspIntent.putExtra(
            BundleConstants.BUNDLE_KEY_ITEM_ADDED,
            Gson().toJson(viewModel.mxItemsPlaced)
        )*/


            try {
                val gson = Gson()
                val json = gson.toJson(viewModel.apiMedicineList.value!!)
                pspIntent.putExtra(BundleConstants.BUNDLE_KEY_ADDED_CART, json)

                val jsonList = gson.toJson(viewModel.cartMedicineListResponse)
                pspIntent.putExtra(BundleConstants.BUNDLE_KEY_ADDED_CART_RESPONSE, jsonList)

                val jsonPrescription = gson.toJson(viewModel.prescriptions.value)
                pspIntent.putExtra(BundleConstants.BUNDLE_KEY_ADDED_RX, jsonPrescription)

            } catch (ex: Exception) {

            }

            startActivityForResult(pspIntent, REQUEST_CODE_PSP)
        }
    }

    private fun showConfirmationBottomSheet() {
        if (deleteImageBottomSheet.isAdded || deleteImageBottomSheet.isVisible)
            return

        deleteImageBottomSheet.isCancelable = true
        if (!deleteImageBottomSheet.isVisible)
            deleteImageBottomSheet.setViewModel(viewModel)
        supportFragmentManager.let {
            deleteImageBottomSheet.show(
                it, "Delete_Prescription"
            )
        }
    }

    private fun openPrescriptionActivity() {

        openUploadPrescriptionBottomSheet()
//        val intent = Intent(this, PrescriptionActivity::class.java)
//        intent.putExtra("isFromCart", false)
//        activityLauncher.launch(intent)
    }

    private var activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        //here we will handle discard case
        if (result?.resultCode == 2) {
            Log.e("discarded", "yes_order_summary")
            viewModel.discardOrder()
        } else if (result?.resultCode == Activity.RESULT_OK) {
            viewModel.fetchCartDetails(false, "SUMMARY")
            Log.d("TAG", "activity launcher: ${SharedPrefManager.getInstance().incompleteOrderId}")
        } else if (result?.resultCode == PRESCRIPTION_UPLOAD_OK) {
            viewModel.fetchCartDetails(false, "SUMMARY")
            Log.d("TAG", "activity launcher: ${SharedPrefManager.getInstance().incompleteOrderId}")
        }
    }

    private var orderSummaryActivityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        //here we will handle discard case

        viewModel.showShimmerPayUsing.postValue(true)

        if (result?.resultCode == REQUEST_CODE) {
            if (result.resultCode == RESULT_OK) {
                val resultValue = result.data?.getBooleanExtra(BundleConstants.RELOAD_BILL_DETAILS, false)
                if (resultValue == true) {
                    viewModel.viewModelScope.launch(Dispatchers.IO) {
                        viewModel.getCartBillDetails(
                            SharedPrefManager.getInstance().incompleteOrderId,
                            ClassNameConstants.ORDER_SUMMARY_ACTIVITY
                        )
                    }
                }
            }
        }
    }

    private fun openUploadPrescriptionBottomSheet() {
        if (isNetworkAvailable(this)) {
            viewModel.callEventForPrescriptionUploadBottomSheetViewed(
                "order_summary",
                SharedPrefManager.getInstance().incompleteOrderId.toString(),
                "main"
            )

            //this code is added to unselect all previous selected items
            viewModel.pastPrescription.value?.forEach { it ->
                it.activeRxList.forEach { activeRx ->

                    activeRx.selected = false

                }
            }

            viewModel.currentSelectedPrescriptionList.clear()
            viewModel.showDoNotHavePrescription.postValue(true)
            viewModel.showMedicineList.postValue(true)
            bottomSheet =
                UploadPrescriptionBottomSheet(
                    { onCameraClick() },
                    { onGalleryClick() },
                    viewModel,
                    "summary"
                )
            bottomSheet!!.isCancelable = true
            if (!bottomSheet!!.isVisible && CommonFunc.isSingleClickParam(1000))
                bottomSheet!!.show(
                    supportFragmentManager, "UploadPrescriptionBottomSheet"
                )
        } else {
            showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                    // checkForNetworkAndDoApiCallings(type)
                }

                override fun onCloseButtonClicked() {
                }
            }, true)
        }
    }

    private fun onCameraClick() {
        viewModel.setEventForUploadPrescriptionClicked("camera", "summary")
        verifyPermissionsAndProceed(arrayOf(android.Manifest.permission.CAMERA)) { isGranted ->
            if (isGranted) {
                startCamera {
                    viewModel.uploadImage(it, 0, -1, true, true)
                }
            }
        }

    }

    private fun onGalleryClick() {
        viewModel.setEventForUploadPrescriptionClicked("gallery", "summary")
        pickImageFromGallery {
            viewModel.uploadImage(it, 0, -1, false, true)
        }
    }

    private fun setApiCall() {
        //get all patients data for past prescription patient list
        Log.d("TAG", "setApiCallbefore ${SharedPrefManager.getInstance().loggedInUserAccessToken}")
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
            Log.d("TAG", "setApiCall: ${SharedPrefManager.getInstance().loggedInUserAccessToken}")
            viewModel.getAllPatientDetails()
        }
    }

    override fun onPause() {
        super.onPause()
        viewModel.stopCouponTimer()
        viewModel.cartViewedTrigger = false
        viewModel.viewModelScope.launch(Dispatchers.IO) {
            if (previousMap.isNullOrEmpty()) {
                previousMap = HashMap<String, Int>()
            }
            previousMap = viewModel.getExistingCartMap()
            Log.d("", "")
        }

        //todo testing pending here
        lifecycleScope.launch {
            try {
                if (lastMinuteBuyViewed) {
                    for (i in 0..viewModel.lastScrollPosition) {
                        viewModel.crossSellingProducts[i].let { pim ->
                            viewModel.sendItemImpressionEvent(
                                pim,
                                "order_summary",
                                "tray",
                                i + 1,
                                "last_minute_buy",
                                i + 1,
                                1,
                                /* viewModel.addMoreForFreeDelivery.value*/
                                SharedPrefManager.getInstance().deliveryOnAmount.toDouble()
                            )
                        }
                    }
                }
            } catch (e: Exception) {
                Log.d("TAG", "onPause: ${e.printStackTrace()}")
            }
        }

    }

    private fun getScrollPosition() {
        binding.nestedScrollView.viewTreeObserver.addOnScrollChangedListener {
            val scrollBounds = Rect()
            binding.nestedScrollView.getHitRect(scrollBounds)
            if (binding.productCardSection.getLocalVisibleRect(scrollBounds)) {
                lastMinuteBuyViewed = true
            }
        }
    }

    private fun setupBackPressedAction() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (viewModel.loaderValue.value == false && viewModel.orderIsBeingPlacedView.value == false && viewModel.orderPlacedView.value == false)
                    finish()
            }
        })
    }

    /*override fun onPause() {
        super.onPause()
        viewModel.viewModelScope.launch(Dispatchers.IO) {
            previousMap = viewModel.getExistingCartMap()
        }
    }*/
    override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        //this code is added to refresh the activity
        finish()
        startActivity(intent)
    }
}