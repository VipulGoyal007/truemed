package com.intellihealth.truemeds.presentation.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.activity.OnBackPressedCallback
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.cashfree.pg.network.NetworkConnectivityUtil
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.BackArrowClickCallback
import com.intellihealth.salt.callbacks.CartIconClickCallback
import com.intellihealth.salt.callbacks.CloseIconClickCallback
import com.intellihealth.salt.callbacks.CouponCallback
import com.intellihealth.salt.callbacks.SearchBarCallback
import com.intellihealth.salt.constants.CouponConstant
import com.intellihealth.salt.constants.CouponCtaConstant
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.constants.MobileSectionTypeConstants
import com.intellihealth.salt.models.ApplyCouponModel
import com.intellihealth.salt.models.CouponModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.OrgSubCompareBottomSheetCallback
import com.intellihealth.truemeds.data.model.mixpanel.MxViewBillClicked
import com.intellihealth.truemeds.data.model.orderflow.MedicineDto
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpManager
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.databinding.ActivityCartBinding
import com.intellihealth.truemeds.databinding.AdapterCartItemBinding
import com.intellihealth.truemeds.domain.enums.AddressEdited
import com.intellihealth.truemeds.domain.enums.Coupon
import com.intellihealth.truemeds.domain.enums.ElasticSearchType
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.domain.enums.LoginFromScreen
import com.intellihealth.truemeds.domain.navigation.navigateToAddAddressActivity
import com.intellihealth.truemeds.domain.navigation.navigateToDeliveryDetailsActivity
import com.intellihealth.truemeds.domain.navigation.navigateToHomePageActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPrescriptionActivity
import com.intellihealth.truemeds.domain.navigation.navigateToProductDetailActivity
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.adapter.CartViewHolder
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked
import com.intellihealth.truemeds.presentation.bottomsheet.DeleteImageBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.ReplaceBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.ReplacingItemBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.UploadPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.ViewBillDetailsBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.cart.ReplaceAllBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.cart.RxPrescriptionBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.dialog.ReplaceAllSuccess
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.AnimationCallback
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.ClassNameConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.runMeOnUiThread
import com.intellihealth.truemeds.presentation.utils.animateFling
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class CartActivity : BaseActivity() {
    private val binding by viewBinding(ActivityCartBinding::inflate)
    private val viewModel by lazy { ViewModelProvider(this)[CartViewModel::class.java] }
    @Inject
    lateinit var firebaseEvent: FirebaseEventUseCase
    private var editDeleteAddressBottomSheet = RemoveProductBottomSheet()
    var replaceBottomSheet = ReplaceBottomSheet().newInstance()
    private var deleteImageBottomSheet = DeleteImageBottomSheet()
    var prescriptionImageId: Long = 0
    private val REQUEST_CODE = 1
    private var previousMap = HashMap<String, Int>()
    private var clickedOnPage = "Cart_Activity"

    private var replacingBottomSheet: ReplacingItemBottomSheet? = null
    private var actualReplaceCounter = 0
    private var replaceableCount = 0
    private var isStepThreeAnimationDone = false
    private var pincode = SharedPrefManager.getInstance().pincode


    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            if(bundle.containsKey(BundleConstants.DISCARD_API_CALLED)){
                viewModel.isDiscardApiCalled = bundle.getBoolean(BundleConstants.DISCARD_API_CALLED, false)
            }

            if(bundle.containsKey(BundleConstants.BUNDLE_KEY_PAGE_SECTION)){
                viewModel.section = bundle.getString(BundleConstants.BUNDLE_KEY_PAGE_SECTION).toString()
            }

            if(bundle.containsKey("actionType")){
                viewModel.actionType = bundle.getString("actionType").toString()
            }

            if(bundle.containsKey(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE)){
                viewModel.clickedOnPageCartModel = bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
                viewModel.clickedOnPage =bundle.getString(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE).toString()
            }
        }
    }
    private fun couponSavedData(isCouponRemoved: Boolean? = null) {
        if (isCouponRemoved == true) {
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
            }
        }

    }

    var bottomSheet: UploadPrescriptionBottomSheet? = null

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "cart onResume: ${viewModel.prescriptionList}")
        val prefPincode = SharedPrefManager.getInstance().pincode
        if(pincode == prefPincode) {
            viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
        }
        if (replaceBottomSheet != null && replaceBottomSheet.isVisible) {
            replaceBottomSheet.dismiss()
        }

        if (isNetworkAvailable(this)) {
            lifecycleScope.launch(Dispatchers.IO) {
                val currentMap = viewModel.getExistingCartMap() ?: HashMap<String, Int>()
                if (previousMap != currentMap || pincode != prefPincode) {
                    viewModel.triggerSaveMeds(
                        SharedPrefManager.getInstance().incompleteOrderId,
                        previousMap.isNullOrEmpty(),
                        "CART",
                        pincode != prefPincode
                    )
                    if (previousMap.size != currentMap.size || pincode != prefPincode) {
                        SharedPrefManager.getInstance().isUserSkippedReplace = false
                    }
                    pincode = prefPincode
                } else {
                    if (NetworkConnectivityUtil.isNetworkConnected(this@CartActivity)) {
                        viewModel.loaderValue.postValue(true)
                        viewModel.getCustomerOrderDetails(
                            SharedPrefManager.getInstance().incompleteOrderId,
                            SharedPrefManager.getInstance().loggedInUserId,
                            false,
                            if (viewModel.activePage.equals(
                                    "cart",
                                    true
                                )
                            ) ClassNameConstants.CART_ACTIVITY else ClassNameConstants.ORDER_SUMMARY_ACTIVITY,
                            false
                        )
                    } else {
                        viewModel.openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
                    }
                    /**
                     * trigger cart_viewed here
                     * **/
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
        couponSavedData()

        if (null != SharedPrefManager.getInstance().couponModel) {
            if (SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime - System.currentTimeMillis() > 0L) {
                viewModel.startTimer(
                    Coupon.ENDS_IN.prefix,
                    //endTimestamp = if (null == SharedPrefManager.getInstance().couponModel) 0L else SharedPrefManager.getInstance().couponModel.expiryDate
                    endTimestamp = if (null == SharedPrefManager.getInstance().couponModel) 0L else SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                        ?: 0L
                ) { time ->
                    SharedPrefManager.getInstance().couponModel.let { coupon ->
                        coupon?.let {
                            this.runMeOnUiThread {
                                Log.d("TAG", "cart_onResume:timer")
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
                        title = "${SharedPrefManager.getInstance().couponModel.promoCode ?: ""} applied",
                        timer = ""
                    ), CouponModel(
                        CouponConstant.COUPON_APPLIED,
                        image_url = SharedPrefManager.getInstance().couponModel.image ?: "",
                        couponCode = SharedPrefManager.getInstance().couponModel.promoCode ?: "",
                        isCouponApplied = true,
                        applyLable = if (SharedPrefManager.getInstance().couponModel.isCouponApplied) "Applied" else "Apply Coupon",
                        couponHeading = "FLAT ${SharedPrefManager.getInstance().couponModel.discountValue}% off on first order",
                        couponSummary = arrayListOf(
                            "FLAT 25% off on first order FLAT ${SharedPrefManager.getInstance().couponModel.discountValue}% off on first order FLAT 25% off on first order",
                            "Minimum order value ₹699"
                        ),
                        tncLable = "Terms and conditions",
                        expireSoonLable = "Expiring soon",
                        timer = "55:34",
                        isFtcCoupon = SharedPrefManager.getInstance().couponModel.showFtcCounter
                            ?: false,
                        showFtcCounter = SharedPrefManager.getInstance().couponModel.showFtcCounter
                            ?: false,
                        timestamp = SharedPrefManager.getInstance().couponModel.expiryDate ?: 0L,
                        // timestamp = SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L,
                    )
                )
            }
        }


        if (resumeCount > 1 && pincode == prefPincode) {
            lifecycleScope.launch(IO) {
                viewModel.getCartBillDetails(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    ClassNameConstants.CART_ACTIVITY,
                )
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.viewModel = viewModel
        viewModel.activePage = "CART"
        binding.lifecycleOwner = this
        binding.fragmentManager = supportFragmentManager

        initUI()
        setApiCall()
        setListener()
        updateStatusBarColor()
        setListenerObserver()
        setClickListeners()
        couponSavedData()

        if (null != SharedPrefManager.getInstance().couponModel) {
            if (((SharedPrefManager.getInstance().couponModel.expiryDate ?: 0).minus(
                    SharedPrefManager.getInstance().couponModel.currentDate ?: 0
                )) < 0
            ) {
                binding.tmApplyCoupon.setUpData(
                    ApplyCouponModel(
                        title = "${SharedPrefManager.getInstance().couponModel.promoCode ?: ""} applied",
                        timer = ""
                    ), CouponModel(
                        CouponConstant.COUPON_APPLIED,
                        image_url = SharedPrefManager.getInstance().couponModel.image ?: "",
                        couponCode = SharedPrefManager.getInstance().couponModel.promoCode ?: "",
                        isCouponApplied = true,
                        applyLable = if (SharedPrefManager.getInstance().couponModel.isCouponApplied) "Applied" else "Apply Coupon",
                        couponHeading = "FLAT ${SharedPrefManager.getInstance().couponModel.discountValue}% off on first order",
                        couponSummary = arrayListOf(
                            "FLAT 25% off on first order FLAT ${SharedPrefManager.getInstance().couponModel.discountValue}% off on first order FLAT 25% off on first order",
                            "Minimum order value ₹699"
                        ),
                        tncLable = "Terms and conditions",
                        expireSoonLable = "Expiring soon",
                        timer = "55:34",
                        showFtcCounter = SharedPrefManager.getInstance().couponModel.showFtcCounter
                            ?: false,
                        isFtcCoupon = SharedPrefManager.getInstance().couponModel.showFtcCounter
                            ?: false,
                        timestamp = SharedPrefManager.getInstance().couponModel.expiryDate ?: 0L,
                    )
                )
            } else {
                viewModel.startTimer(
                    Coupon.ENDS_IN.prefix,
                    //endTimestamp = if (null == SharedPrefManager.getInstance().couponModel) 0L else SharedPrefManager.getInstance().couponModel.expiryDate
                    endTimestamp = if (null == SharedPrefManager.getInstance().couponModel) 0L else SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                        ?: 0L
                ) { time ->
                    SharedPrefManager.getInstance().couponModel.let { coupon ->
                        coupon?.let {
                            this.runMeOnUiThread {
                                binding.tmApplyCoupon.setUpData(
                                    ApplyCouponModel(
                                        title = "${coupon.promoCode ?: ""} applied",
                                        timer = if (SharedPrefManager.getInstance().couponModel.showFtcCounter == true && time != getString(
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
                                        //timestamp = SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L,
                                    )
                                )
                            }
                            if (time == getString(R.string.timer_ends_string)) {
                                viewModel.stopCouponTimer()
                            }
                        }
                    }
                }
            }
        }

    }


    private fun setDynamicHeightForViewSpace() {
        val vto: ViewTreeObserver = binding.clUndo.viewTreeObserver
        vto.addOnPreDrawListener {
            val height: Int = binding.clUndo.measuredHeight
            val width: Int = binding.clUndo.measuredWidth

            val otherView = binding.viewSpace
            val layoutParams = otherView.layoutParams
            layoutParams.height = height // Set the height to the value obtained
            otherView.layoutParams = layoutParams

            true
        }
    }

    private fun setListener() {
        val searchCallback = object : SearchBarCallback {
            override fun onClearClick() {
                TODO("Not yet implemented")
            }

            override fun onIconClick() {
              /*  startActivity(
                    Intent(this@CartActivity, SearchSuggestionActivity::class.java)
                            .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "cart")
                        .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                )*/

               navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "cart",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }

            override fun onViewClick() {
            }

        }


        val backArrowClickCallback = object : BackArrowClickCallback {
            override fun onBackArrowClick() {
                firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_BACK,"")
                if (viewModel.isDiscardApiCalled) { // ASA-3249: || viewModel.productList.value?.size == 0
                    navigateToHomePageActivity()
                    BundleConstants.INITIATED_LOGIN_FROM_SCREEN = LoginFromScreen.HOME
                    finishAffinity()
                } else {
                    Log.e("is_discarded", "3333:::" + viewModel.isDiscardApiCalled)
                    finish()
                }
            }
        }
        val cartIconClickCallback = object : CartIconClickCallback {
            override fun onCartIconClick() {

            }

        }
        val prescriptionCallback = object : ViewPrescriptionCallback {
            override fun onDeleteImage(imageId: Long) {
                prescriptionImageId = imageId
                showConfirmationBottomSheet()
//                Toast().showCustomToastMessage(this@CartActivity, "onDeleteClicked")
            }

            override fun onViewPrescriptionClicked(position: Int, imageURL: String) {
                viewModel.prescriptions.value?.let {
                    if (it.size > 1) {
                        val bottomSheet = RxPrescriptionBottomSheet(
                            position - 1,
                            prescriptionList = viewModel.prescriptions.value!!
                        )
                        bottomSheet.isCancelable = true
                        if (!bottomSheet.isVisible)
                            if (isSingleClick())
                                bottomSheet.show(
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
        binding.btnViewBill.setOnClickListener {
            viewBillClick()
        }
        binding.tvSellingPriceDecimal.setOnClickListener {
            viewBillClick()
        }
        binding.tvSellingPrice.setOnClickListener {
            viewBillClick()
        }
        binding.callback = prescriptionCallback
        binding.cartHeader.setSearchIconClickCallBack(searchCallback)
        binding.cartHeader.setBackArrowClickCallback(backArrowClickCallback)
        binding.cartHeader.setCartIconClickCallBack(cartIconClickCallback)

        /**
         * This is temporary listener, remove once done
         */
        binding.btnAddAddress.setOnClickListener {
//            startActivity(Intent(this, OrderSummaryActivity::class.java))
//            return@setOnClickListener

            /*val data = viewModel.billResponseData
            val replaceAllBottomSheetModel = ReplaceAllBottomSheetModel(0.0,
                525.50,526.50,527.50,
                listOf(model,model,model,model,model,model,model), "sf", listOf("https://picsum.photos/63/14", "https://picsum.photos/63/14", "https://picsum.photos/63/14", "https://picsum.photos/63/14", "https://picsum.photos/63/14", "https://picsum.photos/63/14", "https://picsum.photos/63/14", "https://picsum.photos/63/14")
            )*/

            addAddressFlow()

        }
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_BACK,"")
                if (viewModel.isDiscardApiCalled) {  //ASA-3249: || viewModel.productList.value?.size == 0
                    navigateToHomePageActivity()
                    BundleConstants.INITIATED_LOGIN_FROM_SCREEN = LoginFromScreen.HOME
                    finishAffinity()
                } else {
                    finish()
                }
            }
        })
    }

    fun viewBillClick() {
        viewModel.billDetails.let {
            /*val bottomSheet = ViewCartBillBottomSheet(it.value!!)
            bottomSheet.isCancelable = true
            if (!bottomSheet.isVisible)
                if(isSingleClick())
                bottomSheet.show(supportFragmentManager, "bill_details")*/

            val bundle = Bundle()
            bundle.putString(
                BundleConstants.BUNDLE_TM_BILL_DETAILS_MODEL,
                Gson().toJson(viewModel.billDetails.value)
            )
            Log.i("bill details cart", "" + viewModel.billDetails.value)
            val viewBillDetailsBottomSheet = ViewBillDetailsBottomSheet().newInstance()
            viewBillDetailsBottomSheet.arguments = bundle
            viewBillDetailsBottomSheet.isCancelable = true
            if (!viewBillDetailsBottomSheet.isVisible)
                if (isSingleClick())
                    viewBillDetailsBottomSheet.show(
                        supportFragmentManager,
                        "ViewBillDetailsBottomSheet"
                    )
            viewModel.sendViewBillClickedEvent(MxViewBillClicked(clickedOnPage, it.value?.mxCouponAppliedAmount, it.value?.deliveryChargesValue, it.value?.discountValue, it.value?.estimatedPayableValue, it.value?.mrpValue, SharedPrefManager.getInstance().incompleteOrderId.toString(), it.value?.taxesAndChargesValue, viewModel.salesPriceEventValue,  it.value?.tmCreditValue, it.value?.tmRewardValue,
                null, if(viewModel.billDetailsResponse?.pspViewed == true) it.value?.cashHandlingInfoModel?.charge ?: 0.0 else null,
                cashHandlingChargeApplicable = if(viewModel.billDetailsResponse?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(viewModel.billDetailsResponse) else null))
        }
    }

    private fun addAddressFlow() {
        if (viewModel.proceedButtonTxt.value.toString() == "Add Address") {
            viewModel.sendAddAddressClickedEvent(
                MxAddAddressClicked(
                    "Cart",
                    SharedPrefManager.getInstance().selectedWarehouseID
                )
            )
            navigateToAddAddressActivity(
                params = bundleOf(
                    "addPatient" to true,
                    "addPatientFrom" to "cart",
                    "isFromCart" to true,
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to  AddressEdited.Cart.type,
                    BundleConstants.BUNDLE_KEY_REDIRECT_TO_CART to
                    ((viewModel.sellingPriceWithSubs.value ?: 0.0) > 0.0)
                )
            )
        } else if (viewModel.proceedButtonTxt.value.toString() == "Proceed to Checkout") {
//
            //if (!SharedPrefManager.getInstance().isUserSkippedReplace && viewModel.replaceAllModel.list.size > 1) {// to be taken from bill details selling price with subs
            if (!SharedPrefManager.getInstance().isUserSkippedReplace && (viewModel.sellingPriceWithSubs.value
                    ?: 0.0) > 0.0
            ) {
                viewModel.replaceAllModel.companyIconList = viewModel.logoUrlList
                viewModel.subsReplaceTriggered = false
                val bottomSheet = ReplaceAllBottomSheet(viewModel.replaceAllModel)
                bottomSheet.isCancelable = false
                if (!bottomSheet.isVisible)
                    if (isSingleClick())
                        bottomSheet.show(supportFragmentManager, "replace_view")
            } else {
                clearPrefrences()
                viewModel.showReplaceUndo.postValue(false)
                navigateToOrderSummaryActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "cart",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "main"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
                viewModel.sendProceedToCartToFirebaseEvent()
            }
        } else if (viewModel.proceedButtonTxt.value.toString() == "Add Delivery Details") {
            navigateToDeliveryDetailsActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to  AddressEdited.Cart.type,
                    BundleConstants.BUNDLE_KEY_ADDRESS_COUNT to  viewModel.addressCount,
                    BundleConstants.BUNDLE_KEY_PATIENT_COUNT to  viewModel.patientsCount,
                    BundleConstants.BUNDLE_KEY_REDIRECT_TO_CART to ((viewModel.sellingPriceWithSubs.value ?: 0.0) > 0.0)
                )
            )
        }

    }


    private fun initUI() {
        hideKeyboard(this@CartActivity)

       extractIntentData()
        viewModel.clickedOnPageNameForCouponEvent = "cartsummary"
        viewModel.clickedOnPageNameForCouponApplyEvent = "cart"


        binding.cartHeader.setUpMobileSectionHeadersData(
            MobileSectionHeadersModel(
                headerText = getString(R.string.cart),
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
        binding.cartHeader.setMobileSectionHeadersViewType(if (viewModel.productList.value?.size!! > 0) MobileSectionTypeConstants.TEXT_WITH_SEARCH else MobileSectionTypeConstants.DEFAULT_WITHOUT_FILL)

        binding.cartHeader.setSearchIconClickCallBack(object : SearchBarCallback {
            override fun onClearClick() {}

            override fun onIconClick() {
                firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_SEARCH,"")
               /* startActivity(
                    Intent(this@CartActivity, SearchSuggestionActivity::class.java)
                            .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                        .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "cart")
                        .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                )*/
                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "cart",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )

                //finish()
            }

            override fun onViewClick() {}

        })

        binding.cartHeader.setCloseIconClickCallback(object :
            CloseIconClickCallback {
            override fun onCloseIconClick() {
                if ((viewModel.productList.value == null || viewModel.productList.value!!.isEmpty()) &&
                    (viewModel.prescriptions.value == null || viewModel.prescriptions.value!!.isEmpty())
                ) {
                    finish()
                }
                firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_SEARCH,"")
              /*  startActivity(
                    Intent(
                        applicationContext,
                        SearchSuggestionActivity::class.java
                    ).putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "cart")
                        .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                            .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )*/

                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "cart",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )

                //finish()
            }
        })

        binding.tmSearchBar.setPlaceHolderText("Search for medicine")
        binding.tmSearchBar.setSearchEnable(false)
        binding.tmSearchBar.setStartIconAsSearch(true)

        updateStatusBarColor()

        val couponCallback = object : CouponCallback {
            override fun viewClickCallback(viewType: CouponCtaConstant) {
                when (viewType) {
                    CouponCtaConstant.COUPON_LAYOUT, CouponCtaConstant.CTA_ARROW -> {
                        viewModel.stopCouponTimer()
                        viewModel.callEventApplyCouponClicked()
                        firebaseEvent.cartApplyCoupon(
                            FirebaseEventModel(
                                mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                                customerId = SharedPrefManager.getInstance().loggedInUserId
                            )
                        )
                        val gson = Gson()
                        val json = gson.toJson(viewModel.orderMedicineDetailsListData)
                        Log.e("medicine_list:::",viewModel.orderMedicineDetailsListData.toString())

                        val gsonBillData = Gson()
                        val jsonBillData = gsonBillData.toJson(viewModel.billDetailsResponse)

                        val intent = Intent(this@CartActivity, CouponActivity::class.java)
                            .putExtra(
                                BundleConstants.CURRENT_CART_VALUE,
                                viewModel.mrp.value!! - viewModel.discount.value!!
                            )
                            //.putExtra("billDetailData", viewModel.billDetailsResponse)
                            .putExtra("billDetailData", jsonBillData)
                            .putExtra(BundleConstants.BUNDLE_KEY_SUBS_ID, viewModel.subsIdEventValue)
                            .putExtra("medicineListData", json)
                            .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "cart")
                            .putExtra("clickedOnPageNameForCouponEvent", viewModel.clickedOnPageNameForCouponEvent)
                            .putExtra("clickedOnPageNameForCouponApplyEvent", viewModel.clickedOnPageNameForCouponApplyEvent)

                        //  .putExtra("medicineListData", viewModel.orderMedicineDetailsListData)


                        /*navigateToCouponActivity(
                            params = bundleOf(
                                BundleConstants.CURRENT_CART_VALUE,
                                viewModel.mrp.value!! - viewModel.discount.value!!,
                                "billDetailData", jsonBillData,
                                BundleConstants.BUNDLE_KEY_SUBS_ID, viewModel.subsIdEventValue,
                                "medicineListData", json,
                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "cart",
                                "clickedOnPageNameForCouponEvent", viewModel.clickedOnPageNameForCouponEvent,
                                "clickedOnPageNameForCouponApplyEvent", viewModel.clickedOnPageNameForCouponApplyEvent
                            )
                        )*/

                        startActivityForResult(intent, REQUEST_CODE)
                    }

                    CouponCtaConstant.CTA_REMOVE -> {
                        viewModel.loaderValue.postValue(true)
                        viewModel.saveRemoveCouponCode(
                            SharedPrefManager.getInstance().incompleteOrderId,
                            "0", ClassNameConstants.CART_ACTIVITY, "cart"
                        )
                    }

                    else -> {

                    }
                }
            }


        }

        binding.tmApplyCoupon.setCallback(couponCallback)


//        viewModel.couponTimer.observe(this){
//            binding.tmApplyCoupon.setUpData(
//                ApplyCouponModel(
//                    title = "FIRST25 applied",
//                    timer = it
//                ), CouponModel(
//                    image_url = "https://picsum.photos/36/36",
//                    couponCode = "FIRST25",
//                    isCouponApplied = true,
//                    applyLable = "Apply",
//                    couponHeading = "FLAT 25% off on first order",
//                    couponSummary = arrayListOf("FLAT 25% off on first order FLAT 25% off on first order FLAT 25% off on first order","Minimum order value ₹699"),
//                    tncLable = "Terms and conditions",
//                    expireSoonLable = "Expiring soon",
//                    timer = "55:34"
//                )
//            )
//        }

        binding.tmSearchBar.setWatcher(object : TextWatcher {
            override fun beforeTextChanged(searchString: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(searchString: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(searchString: Editable?) {
            }

        })
        binding.tmSearchBar.setCallBack(object : SearchBarCallback {
            override fun onClearClick() {
                TODO("Not yet implemented")
            }

            override fun onIconClick() {
                launchSearchSuggestionPage()
                finish()
            }

            override fun onViewClick() {
                launchSearchSuggestionPage()
                finish()
            }
        })

        binding.cardUpload.setOnClickListener(View.OnClickListener {
            openUploadPrescriptionBottomSheet()
//            val intent = Intent(this, PrescriptionActivity::class.java)
//            startActivity(intent)
        })

        binding.clAddMedicine.setOnClickListener(View.OnClickListener {
            launchSearchSuggestionPage()
        })

    }


    private fun setClickListeners() {
        with(binding) {
            btnAddMedicine.setOnClickListener {
                /*startActivity(
                    Intent(this@CartActivity, SearchSuggestionActivity::class.java)
                        .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "cart")
                        .putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
                            .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )*/

                navigateToSearchSuggestionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "cart",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            }
        }

    }

    private fun showReplacingBottomSheet() {

        replacingBottomSheet = ReplacingItemBottomSheet()
        replacingBottomSheet?.let {
            it.isCancelable = false
            it.show(supportFragmentManager, "ReplacingBottomSheet")
        }
    }


    private fun setListenerObserver() {

        viewModel.eventShowReplaceItemWithSubsBS.observe(this, EventObserver {
            if (it) {
                showReplacingBottomSheet()
            } else {
                if (replacingBottomSheet != null && replacingBottomSheet!!.isVisible) {
                    replacingBottomSheet!!.dismiss()
                }
            }
        })

        viewModel.eventReplaceWithSubsAnimation.observe(this, EventObserver {
            CoroutineScope(Dispatchers.Main).launch { replaceMedicineAnimation() }
        })

        viewModel.eventUndoReplaceAnimation.observe(this, EventObserver {
            //switchBackAnimation(it as Int)
            CoroutineScope(Dispatchers.Main).launch { undoReplaceAnimation() }
        })

        //setting footer shimmer over here
        viewModel.showShimmerLiveDataFooter.observe(this) {
            if (it) {
                binding.shimmerViewFooter.startShimmerAnimation()
            } else {
                binding.shimmerViewFooter.stopShimmerAnimation()
                viewModel.eventCappingLimitMessage.observe(this, EventObserver { message ->
                    if (!message.isNullOrBlank()) {
                        Toast().showCustomToastMessage(this@CartActivity, "" + message)
                        viewModel.cappingLimitMessage = MutableLiveData<Event<String?>>()
                    }
                })
            }
        }
viewModel.showReplaceUndo.observe(this) {
            if (it) {
                setDynamicHeightForViewSpace()
            }
        }
        viewModel.productList.observe(this) {
            if (it.isNullOrEmpty()) {
                binding.cartHeader.setMobileSectionHeadersViewType(MobileSectionTypeConstants.DEFAULT_WITHOUT_FILL)
            } else {
                binding.cartHeader.setMobileSectionHeadersViewType(MobileSectionTypeConstants.TEXT_WITH_SEARCH)
            }
        }

        //this is setting observer for PastPrescriptionDetailsAdapter image item click to open full view
        viewModel.eventPastRXClicked.observe(
            this, EventObserver {

                Log.e("parent_pos", ":::222222")

                //below is totally new logic written to handle the image view click
                val arrOfStr = it.first.toString().split("_")
                var parentId = arrOfStr[0]
                var childId = arrOfStr[1]

                Log.e("parent_pos", parentId + ":::" + childId)

                var isCurrentItemFound = false
                var currentSelectedPos = 0


                var prescriptionList: ArrayList<OrderRxInfo> = arrayListOf()
                for (i in 0..viewModel.pastPrescription.value?.size!! - 1) {
                    viewModel.pastPrescription.value?.get(i).let {
                        for (j in 0..it?.activeRxList?.size!! - 1) {
                            it?.activeRxList?.get(j)?.let {
                                if (parentId.toInt() == i && childId.toInt() == j) {
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
                "0", ClassNameConstants.CART_ACTIVITY, "cart"
            )
        })

        viewModel.eventUpdateCoupon.observe(this, EventObserver {
            couponSavedData(true)
        })

        viewModel.eventShowReplaceSavingPopUp.observe(this, EventObserver {
            showReplaceAllSavings()
        })

        viewModel.proceedButtonTxt.observe(this, Observer {
            binding.btnAddAddress.setTitle(it)
        })



        viewModel.eventLaunchPDPage.observe(this, EventObserver {
            it?.let {
                /*val myIntent = Intent(this, ProductDetailActivity::class.java)
                myIntent.putExtra("isBottomSheetBehaviour", true) //Optional parameters
                myIntent.putExtra(BundleConstants.IS_SUBS, false)
                startActivity(myIntent)*/
            }
        })

        /*viewModel.eventLaunchEmptyCart.observe(this, EventObserver {
            it?.let {
                val intent = Intent(this, HomePageActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(intent)
                finish()
            }
        })*/

        viewModel.eventLaunchReplaceBottomSheet.observe(this, EventObserver {
            if (it != null && it) {
                var item = viewModel.selectedProductInfoReplace
                val bundle = Bundle()
                val model = Gson().toJson(item)
                bundle.putString(BundleConstants.PRODUCT_SUBS_DETAIL, model)
                bundle.putString(BundleConstants.PRODUCT_SUBS_TITLE, item?.product?.skuName)

                replaceBottomSheet = ReplaceBottomSheet().newInstance()

                replaceBottomSheet.isCancelable = false
                replaceBottomSheet.arguments = bundle

                replaceBottomSheet.setCallback(object :
                    OrgSubCompareBottomSheetCallback {
                    override fun closeClick(isReload: Boolean) {
                        Log.e("Replace", "Close event")
                        /*viewmodel.onReplaceSwitchSingleMedicine(items[position], true)*/
                    }

                    override fun openPDPageCart(
                        productCode: String?,
                        subs: Boolean?,
                        productInfoModel: ProductInfoModel
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
                            Intent(this@CartActivity, ProductDetailActivity::class.java)
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

        viewModel.eventCloseReplaceBottomSheet.observe(this, EventObserver {
            if (it != null && it) {
                if (replaceBottomSheet != null && replaceBottomSheet.isVisible) {
                    replaceBottomSheet.dismiss()
                }
            }
        })

        viewModel.deleteProductEventListener.observe(this, EventObserver {
            if (it != null && it) {
                editDeleteAddressBottomSheet.isCancelable = true
                if (!editDeleteAddressBottomSheet.isVisible)
                    if (isSingleClick()) {
                        editDeleteAddressBottomSheet.setBottomSheet(viewModel)
                        editDeleteAddressBottomSheet.show(
                            supportFragmentManager,
                            "Discard unsaved details?"
                        )
                    }
            } else {
                if (editDeleteAddressBottomSheet.isVisible) {
                    editDeleteAddressBottomSheet.dismiss()
                }
            }
        })

        viewModel.isDelete.observe(this, EventObserver {
            if (it != null && it) {
                val editList: List<MedicineDto> = viewModel.getEditOrderRequestData(
                    viewModel.selectedMedicineProductCode,
                    viewModel.selectedMedicineProductQty
                )
                viewModel.editMedicine(
                    SharedPrefManager.getInstance().incompleteOrderId,
                    editList,
                    true,
                    "CART",
                    viewModel.selectedMedicineSwitchBackProductCode
                )


            } else {
                if (editDeleteAddressBottomSheet.isVisible) {
                    editDeleteAddressBottomSheet.dismiss()
                }
            }
        })

        viewModel.eventLaunchPrescription.observe(this, EventObserver {
            firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_CART_PRESCRIPTION,"")

            navigateToPrescriptionActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "cart",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "main"
                )
            )

        })

        viewModel.eventLaunchOrderSummary.observe(this, EventObserver {
//            if (it) {
            clearPrefrences()

//                addAddressFlow()
            viewModel.showReplaceUndo.postValue(false)
            navigateToOrderSummaryActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "cart",
                    BundleConstants.BUNDLE_KEY_PAGE_SECTION to "main",
                    BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED to BundleConstants.BUNDLE_KEY_REORDER_BUTTON_CLICKED
                ),
                flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
            )
        })
        viewModel.appliedCouponName.observe(this) {
            Log.d("TAG", "setObservers: Applied_COUPON_SUCCESSFULLY")
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

        viewModel.eventMessage.observe(this, EventObserver {
            if(it==null) return@EventObserver
            when (it.messageEnum) {
                MESSAGES.UPLOAD_PRESCRIPTION_CLICK -> {
                    //Toast().showCustomToastMessage(context, "Upload prescription clicked")
                    openPrescriptionActivity()
                }

                MESSAGES.ITEM_REPLACED -> {
                    Toast().showCustomToastMessage(this, "Item replaced")
                }

                MESSAGES.UPLOAD_PRESCRIPTION_SUCCESSFULLY -> {
                    Log.d("TAG", "setObserver: ACTION_UPLOAD_PRESCRIPTION")
                    Toast().showCustomToastMessage(
                        this,
                        getString(R.string.txt_successfully_uploaded)
                    )

                    //                    setResult(RESULT_OK)
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
                    CommonFunc.showCustomToastMessage(this, it.displayMessage)
                }

                else -> {}
            }
        })
        viewModel.eventBaseMessage.observe(this, EventObserver {
            if(it==null) return@EventObserver
            when {
                it.equals(MESSAGES.REMOVED_COUPON_SUCCESSFULLY) -> {
                    Toast().showCustomToastMessage(this@CartActivity,
                        getString(R.string.auto_coupon_remove_message))
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
                }

            }
        })

        viewModel.eventMessageForPrescription.observe(this, EventObserver {
            if (it==null) return@EventObserver
            when {
                it.equals(MESSAGES.PAST_PRESCRIPTION_IMAGE_UPLOAD_SUCCESSFULLY) -> {
                    bottomSheet?.bottomSheet?.dismiss()
                    viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
                    Toast().showCustomToastMessage(
                        this,
                        getString(R.string.txt_successfully_uploaded)
                    )
                    Log.d("TAG", "setListenerObserver: PAST_PRESCRIPTION_IMAGE_UPLOAD_SUCCESSFULLY")
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
                    viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)
                    viewModel.evenSendPrescriptionRemovedEvent("Cart")
                }
            }
        })

        viewModel.eventOpenErrorDialog.observe(this, EventObserver {
            if (it.equals(ErrorType.NO_NETWORK)) {
                showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, true)
            }

        })

        viewModel.eventOpenCouponPageFromDeepLink.observe(this,EventObserver{
            viewModel.actionType=""
            val gson = Gson()
            val json = gson.toJson(viewModel.orderMedicineDetailsListData)
            val gsonBillData = Gson()
            val jsonBillData = gsonBillData.toJson(viewModel.billDetailsResponse)

            val intent = Intent(this@CartActivity, CouponActivity::class.java)
                .putExtra(
                    BundleConstants.CURRENT_CART_VALUE,
                    viewModel.mrp.value!! - viewModel.discount.value!!
                )
                .putExtra("billDetailData", jsonBillData)
                .putExtra(BundleConstants.BUNDLE_KEY_SUBS_ID, viewModel.subsIdEventValue)
                .putExtra("medicineListData", json)
                .putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "cart")
                .putExtra("clickedOnPageNameForCouponEvent", viewModel.clickedOnPageNameForCouponEvent)
                .putExtra("clickedOnPageNameForCouponApplyEvent", viewModel.clickedOnPageNameForCouponApplyEvent)
            startActivityForResult(intent, REQUEST_CODE)
        })

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

        viewModel.eventFinishActivity.observe(this) {
            finish()
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
        viewModel.isPDBottomsheetClosed.observe(this) {
            if (SharedPrefManager.getInstance().couponModel == null) {
                viewModel.stopCouponTimer()
            }
            couponSavedData()
        }

        viewModel.eventSendFtcCounterStarted.observe(this) { if (it > 0L) viewModel.sendFtcCounterStarted(it) }


    }

    fun clearPrefrences() {
//        SharedPrefManager.getInstance().selectedPaymentMethodId = -1
//        SharedPrefManager.getInstance().selectedPaymentMethod = ""
//        SharedPrefManager.getInstance().selectedPaymentMethodIconUrl = ""
    }

    private fun openPrescriptionActivity() {
        viewModel.isFirstTimeCall = false
//        val intent = Intent(this, PrescriptionActivity::class.java)
//        intent.putExtra("isFromCart", true)
//        activityLauncher.launch(intent)

     //   viewModel.callEventForPrescriptionUploadBottomSheetViewed("cart",SharedPrefManager.getInstance().incompleteOrderId.toString(),"main")
        openUploadPrescriptionBottomSheet()
    }

    private fun onCameraClick() {
        viewModel.setEventForUploadPrescriptionClicked("camera", "cart")
        verifyPermissionsAndProceed(arrayOf(android.Manifest.permission.CAMERA)) { isGranted ->
            if (isGranted) {
                firebaseEvent.logFirebaseEvent(FirebaseEvent.FIREBASE_ORDER_PRESCRIPTION_CAMERA,"")
                startCamera {
                    viewModel.uploadImage(it, 0, -1, true, false)
                }
            }
        }

    }

    private fun onGalleryClick() {
        viewModel.setEventForUploadPrescriptionClicked("gallery", "cart")
        pickImageFromGallery {
            viewModel.uploadImage(it, 0, -1, false, false)
        }
    }

    private fun launchSearchSuggestionPage() {
     /*   val intent = Intent(this, SearchSuggestionActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
        intent.putExtra(BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE, "cart")
        intent.putExtra(BundleConstants.BUNDLE_KEY_PAGE_SECTION, "search_bar")
        startActivity(intent)*/

        navigateToSearchSuggestionActivity(
            params = bundleOf(
                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "cart",
                BundleConstants.BUNDLE_KEY_PAGE_SECTION to "search_bar"
            ),
            flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
        )

//        finish()
    }

    private var activityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult? ->
        if (result?.resultCode == Activity.RESULT_OK) {
            viewModel.fetchCartDetails(false, "CART")
//            viewModel.getRxForOrder(SharedPrefManager.getInstance().incompleteOrderId, viewModel.apiMedicineList.value ?: 1)
            Log.d("TAG", "activity launcher: ${SharedPrefManager.getInstance().incompleteOrderId}")
        }
    }

    private fun showConfirmationBottomSheet() {
        if(deleteImageBottomSheet.isAdded || deleteImageBottomSheet.isVisible)
            return

        deleteImageBottomSheet.isCancelable = true
        if (!deleteImageBottomSheet.isVisible)
            deleteImageBottomSheet.setViewModel(viewModel)
        supportFragmentManager.let {
            if (isSingleClick())
                deleteImageBottomSheet.show(
                    it, "Delete_Prescription"
                )
        }
    }

    // Handle the result from the second activity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                val resultValue = data?.getBooleanExtra(BundleConstants.RELOAD_BILL_DETAILS, false)
                if (resultValue == true) {
                    viewModel.viewModelScope.launch(Dispatchers.IO) {
                        viewModel.getCartBillDetails(
                            SharedPrefManager.getInstance().incompleteOrderId,
                            ClassNameConstants.CART_ACTIVITY
                        )
                    }
                }
                couponSavedData()

                if (null != SharedPrefManager.getInstance().couponModel) {
                    viewModel.startTimer(
                        Coupon.ENDS_IN.prefix,
                        //endTimestamp = if (null == SharedPrefManager.getInstance().couponModel) 0L else SharedPrefManager.getInstance().couponModel.expiryDate
                        endTimestamp = if (null == SharedPrefManager.getInstance().couponModel) 0L else SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                            ?: 0L
                    ) { time ->
                        SharedPrefManager.getInstance().couponModel.let { coupon ->
                            coupon?.let {
                                this.runMeOnUiThread {
                                    binding.tmApplyCoupon.setUpData(
                                        ApplyCouponModel(
                                            title = "${coupon.promoCode ?: ""} applied",
                                            timer = if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel?.showFtcCounter == true && time != getString(
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
                }
            } else {
            }
        }

    }


    private var mLastClickTime = 0L
    private val MIN_DELAY_MS: Long = 500L
    private fun isSingleClick(): Boolean {
        val lastClickTime: Long = mLastClickTime
        val now = System.currentTimeMillis()
        this.mLastClickTime = now
        return now - lastClickTime >= MIN_DELAY_MS
    }

    override fun onPause() {
        super.onPause()
        viewModel.stopCouponTimer()
        viewModel.cartViewedTrigger = false
        viewModel.viewModelScope.launch(Dispatchers.IO) {
            previousMap = viewModel.getExistingCartMap()
        }
    }

    private fun openUploadPrescriptionBottomSheet() {
        if (isNetworkAvailable(this)) {
            viewModel.callEventForPrescriptionUploadBottomSheetViewed("cart",SharedPrefManager.getInstance().incompleteOrderId.toString(),"main")
            firebaseEvent.cartPrescription(
                FirebaseEventModel(
                    mobile = SharedPrefManager.getInstance().loggedInUserMobile,
                    customerId = SharedPrefManager.getInstance().loggedInUserId
                )
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
                    "cart"
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

    private fun setApiCall() {
        //get prescription images
        viewModel.getPrescriptionImages(SharedPrefManager.getInstance().incompleteOrderId)

        //get all patients data for past prescription patient list
        //this api call is not required here bcoz this api is already getting called on upload prescription bottom sheet
        /* Log.d("TAG", "setApiCallbefore ${SharedPrefManager.getInstance().loggedInUserAccessToken}")
         if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
             Log.d("TAG", "setApiCall: ${SharedPrefManager.getInstance().loggedInUserAccessToken}")
             Log.e("set_visibility::","0000::::yes")
             viewModel.getAllPatientDetails()
         }*/
    }


    /*private fun stickyNotificationForUndoReplaceWithCallBack() {
        val data = StickyNonStickyNotificationModel(
            message = "You saved Rs. 504.23",
            amount = 0.0,
            subTitle = "by choosing substitute",
            timer = "",
            buttonText = "Undo",
            drawableRight = null,
            drawableLeft = null,
            buttonIcon = null
        )
        val undoNotificationCallback = object : StickyNotStickyNotificationCallback {
                override fun onButtonClick(notificationType: StickyNonStickyNotificationModel) {
                    com.intellihealth.salt.views.Toast().showCustomToastMessage(
                        this@CartActivity,
                        "Undo clicked"
                    )
                }
                
                override fun onViewClick(notificationType: StickyNonStickyNotificationModel) {
                    com.intellihealth.salt.views.Toast().showCustomToastMessage(
                        this@CartActivity,
                        "Card clicked"
                    )
                }
                
            }
        
        binding.clUndo.setStickyNonStickyNotificationData(data)
        binding.clUndo.setNotificationCallback(
            undoNotificationCallback
        )
    }*/


    private fun showReplaceAllSavings() {
//        val savings = removeExtraZeros(viewModel.replaceAllModel.productSellingPrice - viewModel.replaceAllModel.suggestionSellingPrice)
        val savings = viewModel.cartReplaceAll.value?.totalReplaceSavings ?: 0.0
        viewModel.subsReplaceCount = viewModel.replaceAllModel.list.count()

        viewModel.replaceSavings.postValue(if (savings < 0) 0.0 else savings)
        val dialog = ReplaceAllSuccess(
            medCount = viewModel.cartReplaceAll.value?.substitutableMedCount ?: 0,
            saving = if (savings < 0) 0.0 else savings
        )
        dialog.isCancelable = false
        if (!dialog.isVisible) {
            dialog.show(this.supportFragmentManager, "ReplaceSavings")
        }
    }


    /**
     * Undo animation
     * **/
    private fun undoReplaceAnimation() {
        actualReplaceCounter = 0
        replaceableCount = viewModel.productList.value?.filter { it.isAutoReplaced }?.size ?: 0 //viewModel.undoPdIdList.size
        
        animateIndividualUndoReplace()
    }


    private fun animateIndividualUndoReplace() {
        actualReplaceCounter++
        binding.rvCart.post {
            var currentReplaceCounter = 0
            viewModel.productList.value?.forEachIndexed { index, _model ->
                if (_model.isAutoReplaced) {
                    currentReplaceCounter++
                    if (currentReplaceCounter == actualReplaceCounter) {
                        binding.rvCart.findViewHolderForAdapterPosition(index)?.let {
                            /*Handler(Looper.getMainLooper()).postDelayed({

                            }, 100)*/
                            val holder =
                                binding.rvCart.findViewHolderForAdapterPosition(index) as CartViewHolder
                            val hBinding = holder.binding
                            stepThreeAnimForUndo(
                                hBinding,
                                index,
                                currentReplaceCounter == replaceableCount
                            )

                            return@post
                        }
                    }
                }
            }
        }
    }

    private fun stepThreeAnimForUndo(
        hBinding: AdapterCartItemBinding,
        index: Int,
        isLastItem: Boolean,
    ) {
        val fadeAnim = AnimationUtils.loadAnimation(
            this@CartActivity, R.anim.fade_out_cart
        )


        fadeAnim.apply {
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                    stepFourAnimForUndo(hBinding, index, isLastItem)
                    animateIndividualUndoReplace()
                }

                override fun onAnimationEnd(animation: Animation?) {
//                    Log.d("qwerty", "stepThreeAnim : doOnEnd")
                    hBinding.clReplacedSubs.visibility = View.GONE
                    hBinding.clOriginal.visibility = View.VISIBLE
                }

                override fun onAnimationRepeat(animation: Animation?) {
                }
            })
        }
        hBinding.clReplacedSubs.startAnimation(fadeAnim)
    }

    fun stepFourAnimForUndo(hBinding: AdapterCartItemBinding, index: Int, isLastItem: Boolean) {
        val fadeAnim = AnimationUtils.loadAnimation(
            this@CartActivity, R.anim.slide_in_left_anim
        )

        fadeAnim.apply {
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                    hBinding.clOriginal.visibility = View.VISIBLE
                }

                override fun onAnimationEnd(animation: Animation?) {
//                    Log.d("qwerty", "stepFourAnim : doOnEnd")
                    //binding.rvMain.adapter?.notifyItemChanged(index)
                    //viewModel.enableOverlayCartList.value = false
                    isStepThreeAnimationDone = false
                    hBinding.clOriginal.animate().translationX(0f).translationY(0f).rotation(0f)
                    hBinding.clBlueBG.animate().translationX(0f).translationY(0f).rotation(0f)
                    hBinding.ivBgAnim.animate().translationX(0f).translationY(0f).rotation(0f)
                    hBinding.clReplacedSubs.animate().translationX(0f).translationY(0f).rotation(0f)

//                    viewModel.undoAllClicked = false
                    Handler(Looper.getMainLooper()).postDelayed({
                        viewModel.viewModelScope.launch(Dispatchers.IO) {
//                                viewModel.fetchCartDetails(false, "CART")
            
//                            viewModel.reloadCartList(viewModel.cartMedicineListResponse)
                            viewModel.loaderValue.postValue(false)
                            /*viewModel.getCartBillDetails(SharedPrefManager.getInstance().incompleteOrderId,
                                ClassNameConstants.CART_ACTIVITY)*/
                            viewModel.showReplaceUndo.postValue(false)
                        } }, 500)
                    if (isLastItem) {
                    
                    }/* else {
                        animateIndividualProductReplace()
                    }*/
                }

                override fun onAnimationRepeat(animation: Animation?) {
                }
            })
        }

        hBinding.clOriginal.startAnimation(fadeAnim)
    }



    /**
     * Replace all animation
     * **/
    private fun replaceMedicineAnimation() {
        actualReplaceCounter = 0
        replaceableCount = viewModel.cartReplaceAll.value?.substitutableMedCount ?: 0 //productList.value?.filter { it.isAutoReplaced }?.size ?: 0
        binding.contentScroll.scrollTo(0, 0);
        animateIndividualProductReplace()
    }

    override fun onDestroy() {
        super.onDestroy()
        CoroutineScope(Dispatchers.Main).cancel()
        CommonFunc.freeMemory()
    }

    private fun animateIndividualProductReplace() {
        actualReplaceCounter++
        binding.rvCart.post {
            var currentReplaceCounter = 0
            viewModel.productList.value?.forEachIndexed { index, _model ->
                var cxAcceptedSubs = _model.product.cxAcceptedSubs
                /*var subMedCountInCart = viewModel.getMedicineCount(_model.suggestion?.productCode ?: "")
                cxAcceptedSubs = subMedCountInCart > 0*/
                if (_model.isAvailableSubsAddedInCart) cxAcceptedSubs = true
                if (_model.product.subsFound && !cxAcceptedSubs && _model.cardType != FullWidthProductCardConstants.SUBS_ADDED) {
                    currentReplaceCounter++
                    if (currentReplaceCounter == actualReplaceCounter) {
                        //blocker to avoid click while
                        /*binding.clProgressBar.visibility = View.VISIBLE
                        binding.progressBar.visibility = View.GONE*/


                        binding.rvCart.findViewHolderForAdapterPosition(index)?.let {
                            /*Handler(Looper.getMainLooper()).postDelayed({

                            }, 100)*/
                            val holder =
                                binding.rvCart.findViewHolderForAdapterPosition(index) as CartViewHolder

                            holder.itemView.requestFocus()
                            val hBinding = holder.binding
                            stepOneAnimForReplace(
                                hBinding,
                                index,
                                currentReplaceCounter == replaceableCount
                            )

                            return@post
                        }
                    }
                }
            }
        }
    }

    //////////////////////////////////////////////////////////replacement animation
    private fun stepOneAnimForReplace(
        hBinding: AdapterCartItemBinding,
        index: Int,
        isLastItem: Boolean,
    ) {

        hBinding.clOriginal.visibility = View.VISIBLE
        hBinding.clBlueBG.visibility = View.GONE
        hBinding.clReplacedSubs.visibility = View.GONE

        hBinding.clOriginal.animateFling(500, 100, object : AnimationCallback {
            override fun doOnStart() {
                viewModel.isAnimationStarted.value = true

//                Log.d("qwerty", "stepOneAnim : doOnStart")
                stepTowAnimForReplace(hBinding, index, isLastItem)
            }

            override fun doOnEnd() {
//                Log.d("qwerty", "stepOneAnim : doOnEnd")
                hBinding.clOriginal.visibility = View.GONE
            }
        })


    }

    fun stepTowAnimForReplace(hBinding: AdapterCartItemBinding, index: Int, isLastItem: Boolean) {
        hBinding.clBlueBG.visibility = View.VISIBLE
        hBinding.clReplacedSubs.visibility = View.VISIBLE


        hBinding.ivBgAnim.animateFling(500, 100, object : AnimationCallback {
            override fun doOnStart() {
//                Log.d("qwerty", "stepTowAnim : doOnStart")
            }

            override fun doOnEnd() {
//                Log.d("qwerty", "stepTowAnim : doOnEnd")
                viewModel.isAnimationStarted.value = false


                /*hBinding.clReplacedSubs.visibility = View.VISIBLE
                hBinding.clBlueBG.visibility = View.GONE*/
                if (!isStepThreeAnimationDone) {
                    stepThreeAnimForReplace(hBinding, index, isLastItem)
                    stepFourAnimForReplace(hBinding, index, isLastItem)
                    //isStepThreeAnimationDone = true
                }

            }
        })
    }

    fun stepThreeAnimForReplace(
        hBinding: AdapterCartItemBinding,
        index: Int,
        isLastItem: Boolean,
    ) {
        val fadeAnim = AnimationUtils.loadAnimation(
            this@CartActivity, R.anim.fade_out_cart
        )


        fadeAnim.apply {
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                    animateIndividualProductReplace()
                }

                override fun onAnimationEnd(animation: Animation?) {
//                    Log.d("qwerty", "stepThreeAnim : doOnEnd")
                    hBinding.clBlueBG.visibility = View.GONE
                    //hBinding.clReplacedSubs.visibility = View.VISIBLE
                    //stepFourAnim(hBinding, index, isLastItem)
                }

                override fun onAnimationRepeat(animation: Animation?) {
                }
            })
        }
        hBinding.clBlueBG.startAnimation(fadeAnim)
    }

    fun stepFourAnimForReplace(hBinding: AdapterCartItemBinding, index: Int, isLastItem: Boolean) {
        val fadeAnim = AnimationUtils.loadAnimation(
            this@CartActivity, R.anim.move_top_to_bottom
        )

        fadeAnim.apply {
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                    hBinding.clReplacedSubs.visibility = View.VISIBLE
                }

                override fun onAnimationEnd(animation: Animation?) {
//                    Log.d("qwerty", "stepFourAnim : doOnEnd")
                    //binding.rvMain.adapter?.notifyItemChanged(index)
                    //viewModel.enableOverlayCartList.value = false
                    isStepThreeAnimationDone = false
                    hBinding.clOriginal.animate().translationX(0f).translationY(0f).rotation(0f)
                    hBinding.clBlueBG.animate().translationX(0f).translationY(0f).rotation(0f)
                    hBinding.ivBgAnim.animate().translationX(0f).translationY(0f).rotation(0f)
                    hBinding.clReplacedSubs.animate().translationX(0f).translationY(0f).rotation(0f)

//                    viewModel.replaceAllClicked = false
                    if (isLastItem) {
                        Handler(Looper.getMainLooper()).postDelayed(
                            {
                                //hide blocker
//                                binding.clProgressBar.visibility = View.GONE
//                                binding.progressBar.visibility = View.VISIBLE//so that next time on clProgressBar visible, progressBar is also visible


//                                viewModel.fetchCartDetails(false, "CART")
                                viewModel.isMedReplaced = true
                                viewModel.isReplaceAllClicked = false
                                viewModel.viewModelScope.launch(Dispatchers.IO) {
                                    
                                    viewModel.reloadCartList(viewModel.cartMedicineListResponse)
                                    viewModel.showReplaceUndo.postValue(true)
                                    viewModel.showReplaceSavingPopUp.postValue(Event(true))
                                    viewModel.getCartBillDetails(SharedPrefManager.getInstance().incompleteOrderId,
                                        ClassNameConstants.CART_ACTIVITY)

                                }
                                

                            /*
                                if (SharedPrefManager.getInstance().oneClickSubstitutionVariant == "B")
                                    showSuccessDialogForReplaceAll()*/
                            }, 50
                        )
                    }/* else {
                        animateIndividualProductReplace()
                    }*/
                }

                override fun onAnimationRepeat(animation: Animation?) {
                }
            })
        }

        hBinding.clReplacedSubs.startAnimation(fadeAnim)
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        //this code is added to refresh the activity
        finish()
        startActivity(intent)
    }
}