package com.intellihealth.truemeds.presentation.activity

import android.app.Dialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.animation.TranslateAnimation
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.transition.Slide
import androidx.transition.Transition
import androidx.transition.TransitionManager
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.CartsCallback
import com.intellihealth.salt.callbacks.OrderTrackingCallback
import com.intellihealth.salt.callbacks.StickyNotStickyNotificationCallback
import com.intellihealth.salt.constants.CartsConstants
import com.intellihealth.salt.models.NotificationButton
import com.intellihealth.salt.models.NotificationPosition
import com.intellihealth.salt.models.NotificationType
import com.intellihealth.salt.models.OrderTracking
import com.intellihealth.salt.models.OrderTrackingModel
import com.intellihealth.salt.models.StickyNonStickyNotificationModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxPaymentPendingViewed
import com.intellihealth.truemeds.data.utils.ApiEndpointConstants
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.data.utils.PopUpManager
import com.intellihealth.truemeds.data.utils.PopUpManager.showPopUp
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.data.utils.dpToPx
import com.intellihealth.truemeds.data.utils.hideKeyboard
import com.intellihealth.truemeds.data.utils.setBottomNavigationViewCorners
import com.intellihealth.truemeds.databinding.ActivityHomePageBinding
import com.intellihealth.truemeds.domain.enums.Coupon
import com.intellihealth.truemeds.domain.navigation.navigateToCartActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderStatusActivity
import com.intellihealth.truemeds.domain.navigation.navigateToOrderSummaryActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPaymentActivity
import com.intellihealth.truemeds.domain.navigation.navigateToPrescriptionActivity
import com.intellihealth.truemeds.mvvm.data.appsflyer.AFLoginPageViewed
import com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel
import com.intellihealth.truemeds.presentation.adapter.PatientListMedicinesListAdapter
import com.intellihealth.truemeds.presentation.bottomsheet.home.ApplyCouponBottomSheet
import com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet
import com.intellihealth.truemeds.presentation.callbacks.ApplyCouponCallback
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.dialog.CouponApplySuccess
import com.intellihealth.truemeds.presentation.dialog.CouponErrorPopup
import com.intellihealth.truemeds.presentation.dialog.CouponSavingPopUp
import com.intellihealth.truemeds.presentation.fragment.AccountFragment
import com.intellihealth.truemeds.presentation.fragment.HomeFragment
import com.intellihealth.truemeds.presentation.fragment.MyOrdersFragment
import com.intellihealth.truemeds.presentation.fragment.ReferAndEarnFragment
import com.intellihealth.truemeds.presentation.model.BottomSheetType
import com.intellihealth.truemeds.presentation.model.HomePageBottomSheetInfo
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.truecaller.android.sdk.oAuth.TcSdk
import com.userexperior.UserExperior
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@AndroidEntryPoint
class HomePageActivity : BaseActivityWithLogin() {

    private val binding by viewBinding(ActivityHomePageBinding::inflate)

    //     val viewModel: HomeViewModel by lazy { ViewModelProvider(this)[HomeViewModel::class.java] }
    lateinit var viewModel: HomeViewModel
    private val ftcViewModel: CountDownTimerViewModel by lazy { ViewModelProvider(this)[CountDownTimerViewModel::class.java] }
    private var sellingPrice = 0.0
    private var pendingPaymentOrderId = 0
    private var cartCount = 0
    private var mLocationLastClickTime = 0L

    private lateinit var fragmentManager: FragmentManager
    private var applyCouponCallBack: ApplyCouponCallback? = null
    private lateinit var activeFragment: Fragment
    private var patientListMedicinesListCardStackedAdapter: PatientListMedicinesListAdapter? = null
    private lateinit var couponSavingPopUp: CouponSavingPopUp
    private var currentPromoCode: String = ""
    private var isFromCancelOrder = false

    // Define fragments for Bottom Navigation Bar
    private lateinit var homeFragment: HomeFragment
    private lateinit var referAndEarnFragment: ReferAndEarnFragment
    private lateinit var myOrdersFragment: MyOrdersFragment
    private lateinit var accountFragment: AccountFragment
    private lateinit var bottomSheet: LoginBottomSheet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        HomeViewModel.reloadMyOrders.value = false
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty())
            viewModel.getAllOrder()

        extractIntentData()
        setupParameters(viewModel, intent)
        setupBackPressedAction()
        updateStatusBarColor()

        // Initialize fragments for bottom navigation bar
        homeFragment = HomeFragment(ftcViewModel)
        referAndEarnFragment = ReferAndEarnFragment()
        myOrdersFragment = MyOrdersFragment()
        accountFragment = AccountFragment()

        // Set the initial fragment
        activeFragment = homeFragment
        viewModel.activeMenu.value = R.id.homeFragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.containerFragment, activeFragment)
            commit()
        }

        initBottomNavigation(recreateBottomNavFragment = false)
        initView()
        setViewVisibility()
        setObservers()
        checkAndAskNotificationPermission()
        updateHomePageStatusBarColor()
        viewModel.updateFirebaseId(this)

        if (!UserExperior.isRecording()) {
            UserExperior.startRecording(applicationContext, BuildConfig.userExperiorSDKKey)
        }

    }

    override fun extractIntentData(){
        intent.extras?.let { bundle ->
            if (bundle.containsKey(BundleConstants.IS_FROM_CANCEL_ORDER)) {
                isFromCancelOrder = bundle.getBoolean(BundleConstants.IS_FROM_CANCEL_ORDER, false)
            }
        }
    }

    private fun showFragment(targetFragment: Fragment) {
        if (targetFragment != activeFragment) {
            supportFragmentManager.beginTransaction().apply {
                if (!targetFragment.isAdded) {

                    // Determine whether to add the fragment based on login status and fragment type
                    val shouldAddFragment = (
                            (targetFragment !is ReferAndEarnFragment && targetFragment !is MyOrdersFragment) &&
                                    SharedPrefManager.getInstance().loggedInUserAccessToken.isNullOrEmpty()
                            )

                    if (shouldAddFragment) {
                        add(R.id.containerFragment, targetFragment)
                        manageFragmentState(this, targetFragment)
                    } else if (!SharedPrefManager.getInstance().loggedInUserAccessToken.isNullOrEmpty()) {
                        add(R.id.containerFragment, targetFragment)
                        manageFragmentState(this, targetFragment)
                    }

                } else {
                    manageFragmentState(this, targetFragment)
                }
            }
        }
    }

    private fun manageFragmentState(
        fragmentTransaction: FragmentTransaction,
        targetFragment: Fragment
    ) = with(fragmentTransaction) {
        // Hide the current active fragment and show the target fragment
        hide(activeFragment)
        show(targetFragment)
        // Commit the transaction and update the activeFragment reference
        commit()
        activeFragment = targetFragment
    }


    private fun setViewVisibility() {
        if (viewModel.isActiveOrderClosed.value == true) {
            binding.orderTracking.visibility = View.GONE
        } else {
            if (viewModel.showShimmerHome.value == false && viewModel.activeMenu.value == R.id.homeFragment) {
                binding.orderTracking.visibility = View.VISIBLE
                binding.bottomNavigationView.setBackgroundResource(R.drawable.white_square)
            } else {
                binding.orderTracking.visibility = View.GONE
            }
        }
        /*binding.orderTracking.visibility = if (viewModel.isActiveOrderClosed.value == true) {
            View.GONE
        } else {
            View.VISIBLE
        }

         */
    }

    private fun setupBackPressedAction() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (viewModel.activeMenu.value == R.id.homeFragment) {
                    finish()
                } else {
                    //switchToHomeFragment()
                    binding.bottomNavigationView.selectedItemId = R.id.homeFragment
                }
            }
        })
    }

    private fun initBottomNavigation(
        recreateBottomNavFragment: Boolean
    ) {
        if (recreateBottomNavFragment) {
            viewModel.onCreateApiCalls()
        }
    }

    private fun setOrderTrackingVisibility(targetFragment: HomeFragment) {
        if (viewModel.isActiveOrderClosed.value == true || viewModel.showShimmerHome.value == true) {
            binding.orderTracking.visibility = View.GONE
        } else {
            if (viewModel.showShimmerHome.value == false && viewModel.activeMenu.value == R.id.homeFragment) {
                binding.orderTracking.visibility = View.VISIBLE
                binding.bottomNavigationView.setBackgroundResource(R.drawable.white_square)
            } else {
                binding.orderTracking.visibility = View.GONE
            }
        }
        /*binding.orderTracking.visibility = if (viewModel.isActiveOrderClosed.value == true) {
            View.GONE
        } else {
            View.VISIBLE
        }
         */
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty())
            viewModel.getFtcCouponData()
        if (targetFragment != activeFragment)
            startOrderTrackingAnimation()
    }

    private fun setObservers() {
        viewModel.eventMessage.observe(this, EventObserver {
            if (it != null) {
                if (it.messageEnum == MESSAGES.SHOW_ACCEPT_POLICY_POPUP) {
                    Log.e("observer::", "::observer1")
                    showPopUp(
                        fragmentManager = supportFragmentManager,
                        popUpType = PopUpType.PRIVACY_POLICY,
                        object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {
                                if (!viewModel.acceptedPP) {
                                    viewModel.resetPreviousAndShowThisBottomSheet(
                                        BottomSheetType.PRIVACY_POLICY,
                                        "Privacy policy  updated!"
                                    )
                                } else if (!viewModel.acceptedTnC) {
                                    viewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.TERMS_AND_CONDITION)
                                }
                                //                            android.widget.Toast.makeText(this@HomePageActivity, "onActionButtonClicked: of terms and condition ", android.widget.Toast.LENGTH_LONG).show()
                            }

                            override fun onCloseButtonClicked() {
                            }
                        }, false
                    )

                } else if (it.messageEnum == MESSAGES.SHOW_ACCEPT_TERM_CONDITION) {
                    Log.e("observer::", "::observer1")
                    showPopUp(
                        fragmentManager = supportFragmentManager,
                        popUpType = PopUpType.TERMS_CONDITIONS,
                        object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {
                                if (!viewModel.acceptedPP) {
                                    viewModel.resetPreviousAndShowThisBottomSheet(
                                        BottomSheetType.PRIVACY_POLICY,
                                        "Privacy policy  updated!"
                                    )
                                } else if (!viewModel.acceptedTnC) {
                                    viewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.TERMS_AND_CONDITION)
                                }
                                //                            android.widget.Toast.makeText(this@HomePageActivity, "onActionButtonClicked: of terms and condition ", android.widget.Toast.LENGTH_LONG).show()
                            }

                            override fun onCloseButtonClicked() {
                            }
                        }, false
                    )

                } else if (it.messageEnum == MESSAGES.SHOW_REFERRAL_POPUP) {
                    Log.e("observer::", "::observer2")
                    showPopUp(
                        fragmentManager = supportFragmentManager,
                        popUpType = PopUpType.TERMS_CONDITIONS,
                        object : PopUpDialogCallback {
                            override fun onActionButtonClicked() {}
                            override fun onCloseButtonClicked() {
                            }
                        }, true
                    )
                } else if (it.messageEnum == MESSAGES.REMOVED_COUPON_SUCCESSFULLY) {
                    viewModel.stopCouponTimer()
                    stickyNotificationWithCallBack(viewModel.ftcCouponData.value!!, "")
                    CommonFunc.showCustomToastMessage(this, it.displayMessage)
                }
            }

        })
        viewModel.showShimmerHome.observe(this) {
            if (!it) {
                setViewCartVisibility()
                setOrderTrackingVisibility(homeFragment)
                processUrgencyCoupon(viewModel.ftcCouponData.value)
            }else{
                // add the rounded corner to the bottom navigation bar
                setBottomNavigationViewCorners(binding.bottomNavigationView)
            }
        }
        viewModel.activeOrdersMutableLiveData.observe(this) {
            setViewCartVisibility()
        }

        viewModel.isActiveOrderClosed.observe(this) {
            setViewCartVisibility()
        }

        viewModel.cartItemCount.observe(this) {
            setViewCartVisibility()
            cartCount = it
            updateSticky(it)
        }

        viewModel.activeMenu.observe(this) {
            setViewCartVisibility()
        }

        viewModel.cartModel.observe(this) {
            if (it != null)
                binding.tmCarts.updateTotalItemsInCartCount(
                    it.count ?: 0,
                    it.amount,
                    SharedPrefManager.getInstance().prescriptionCount
                )
        }

        HomeViewModel.postLoginAction.observe(this) {
            if (it) {
                viewModel.bottomSheetTrigger = null
                viewModel.bottomSheetTrigger =
                    MutableLiveData(HomePageBottomSheetInfo(BottomSheetType.EMPTY, 0))
                initBottomNavigation(recreateBottomNavFragment = true)
            }
        }

        viewModel.shouldProcessDeeplink.observe(this) {
            if (it) {
                viewModel.processDeepLinkingAndNotification()
            }
        }

        viewModel.eventOpenAccountPage.observe(this) {
            viewModel.activeMenu.value = R.id.accountFragment
            binding.bottomNavigationView.selectedItemId = R.id.accountFragment
            showFragment(accountFragment)
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

        val loader = Dialog(this)
        viewModel.isLoading.observe(this) {
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }


        Handler().postDelayed({
            viewModel.showBlockerVw20.postValue(true)
        }, 20 * 1000)

        viewModel.cartItemCount.observe(this) {
            setViewCartVisibility()
            cartCount = it
            updateSticky(it)
        }

        viewModel.eventSendFtcCounterStarted.observe(this) {
            if (it > 0L) viewModel.sendFtcCounterStarted(
                it
            )
        }
    }

    fun checkIsBottomNavigationRounded(){
        val isCartVisible = viewModel.cartItemCount.value!! != 0 || SharedPrefManager.getInstance().prescriptionCount != 0
        val isOrderTrackerVisible = viewModel.isActiveOrderClosed.value == true

        if (isCartVisible && !isOrderTrackerVisible){
            viewModel.isRoundedCornerBottomSheet.value = false
        }else if (isCartVisible){
            viewModel.isRoundedCornerBottomSheet.value = true
        }else if (!isOrderTrackerVisible){
            viewModel.isRoundedCornerBottomSheet.value = false
        }else{
            viewModel.isRoundedCornerBottomSheet.value = true
        }
    }

    private fun updateSticky(cartCount: Int) {
        if (cartCount > 0) {
            if (SharedPrefManager.getInstance().couponModel != null && !SharedPrefManager.getInstance().couponModel.promoCode.isNullOrEmpty() && SharedPrefManager.getInstance().couponModel.promoCode == currentPromoCode) {

            } else {
                binding.ftcCouponNotification.setStickyUI(
                    type = NotificationType.APPLY_COUPON.type,
                    position = NotificationPosition.BOTTOM.position,
                    isButtonVisible = NotificationButton.DISABLED.status
                )
            }
        } else {
            if (SharedPrefManager.getInstance().couponModel == null) {
                if (SharedPrefManager.getInstance().prescriptionCount > 0) {
                    binding.ftcCouponNotification.setStickyUI(
                        type = NotificationType.APPLY_COUPON.type,
                        position = NotificationPosition.BOTTOM.position,
                        isButtonVisible = NotificationButton.DISABLED.status
                    )
                } else {
                    binding.ftcCouponNotification.setStickyUI(
                        type = NotificationType.APPLY_COUPON.type,
                        position = NotificationPosition.BOTTOM.position,
                        isButtonVisible = NotificationButton.ENABLED.status
                    )
                }
            } else {
                if (SharedPrefManager.getInstance().couponModel != null && !SharedPrefManager.getInstance().couponModel.promoCode.isNullOrEmpty() && SharedPrefManager.getInstance().couponModel.promoCode == currentPromoCode) {

                } else {
                    binding.ftcCouponNotification.setStickyUI(
                        type = NotificationType.APPLY_COUPON.type,
                        position = NotificationPosition.BOTTOM.position,
                        isButtonVisible = NotificationButton.DISABLED.status
                    )
                }
            }
        }
    }

    private fun updateNavigationBarState(actionId: Int) {
        lifecycleScope.launch {
            delay(200)
            binding.bottomNavigationView.menu.findItem(actionId).isChecked = true
        }
    }

    override fun sendLoginPageViewedEvent() {
        //BaseViewModelWithLogin.isBaseUserLoggedIn = true
        val mxLoginPageViewed = MxLoginPageViewed(
            login_clicked_on_page,
            pageSection,
            viewModel.isTruecaller
        )
        val afLoginPageViewed = AFLoginPageViewed(viewModel.isTruecaller)
        viewModel.loginPageViewedEvent(mxLoginPageViewed, afLoginPageViewed)
    }

    override fun setIsTruecaller(isTruecaller: Boolean) {
        viewModel.isTruecaller = isTruecaller
    }

    override fun getTrueCallerUserDetails() {
        viewModel.currentPageNameForSignup = login_clicked_on_page
        viewModel.getTrueCallerUserDetails(
            textAuthorizationCode = "authorization_code",
            clientId = resources.getString(R.string.truecaller_client_id),
            authorizationCode,
            codeVerifier,
            this@HomePageActivity
        )
    }

    override fun openLoginBottomSheet() {

        bottomSheet = LoginBottomSheet(login_clicked_on_page, pageSection)
        bottomSheet.isCancelable = false

        val lastRecordedData =
            com.intellihealth.truemeds.data.utils.isSingleClick(mLocationLastClickTime)
        mLocationLastClickTime = lastRecordedData.second
        if (!bottomSheet.isVisible && lastRecordedData.first) {
            bottomSheet.show(
                supportFragmentManager, "LoginBottomSheet"
            )
        }
        login_clicked_on_page = "homepage"
    }

    override fun closeLoginBottomSheet() {
        if (this::bottomSheet.isInitialized && bottomSheet.isVisible) {
            bottomSheet.dismiss()
        }
    }

    private fun setListener() {

        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            hideKeyboard(this@HomePageActivity)
            when (menuItem.itemId) {
                R.id.homeFragment -> {
                    login_clicked_on_page = "homepage"
                    showFragment(homeFragment)

                    if (viewModel.activeMenu.value != R.id.homeFragment)
                        viewModel.sendHomePageViewedEvent()

                    viewModel.activeMenu.value = R.id.homeFragment
                    if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                        lifecycleScope.launch(IO) {
                            viewModel.getAllCustomerActiveOrders()
                        }
                    }
                    setOrderTrackingVisibility(homeFragment)

                    viewModel.sendNavClickToFirebaseEvent("home_nav")
                }
                R.id.referEarnFragment -> {
                    showFragment(referAndEarnFragment)

                    endOrderTrackerAnimation(false)
                    if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                        viewModel.activeMenu.value = R.id.referEarnFragment
                        viewModel.setEventReferralScreenViewed(true)
                        viewModel.sendNavClickToFirebaseEvent("nav_refer_and_earn")
                    } else {
                        pageSection = "nav_refer_and_earn"
                        initializationTrueCallerOAuth()
                        updateNavigationBarState(viewModel.activeMenu.value!!)
                    }
                    binding.ftcCouponNotification.visibility = View.GONE

                }
                R.id.ordersFragment -> {
                    showFragment(myOrdersFragment)

                    endOrderTrackerAnimation(false)
                    if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) {
                        viewModel.activeMenu.value = R.id.ordersFragment
                        if (HomeViewModel.reloadMyOrders.value == false)
                            HomeViewModel.reloadMyOrders.postValue(true)
                        viewModel.sendNavClickToFirebaseEvent("nav_orders")
                    } else {
                        pageSection = "nav_orders"
                        initializationTrueCallerOAuth()
                        updateNavigationBarState(viewModel.activeMenu.value!!)
                    }
                    binding.ftcCouponNotification.visibility = View.GONE
                }
                R.id.accountFragment -> {
                    showFragment(accountFragment)

                    endOrderTrackerAnimation(false)
                    viewModel.activeMenu.value = R.id.accountFragment
                    binding.ftcCouponNotification.visibility = View.GONE
                    viewModel.sendNavClickToFirebaseEvent("nav_account")
                }
            }
            true
        }

        binding.tmCarts.setCallback(object : CartsCallback {
            override fun viewClickCallback(viewType: CartsConstants) {
                when (viewType) {
                    CartsConstants.VIEW_CART -> {
                        viewModel.onViewCartClicked("view_cart")
                    }

                    CartsConstants.VIEW_BILL -> {}
                    CartsConstants.PROCEED -> {}
                }
            }

        })


        val orderTrackingCallback = object : OrderTrackingCallback {
            override fun onScrolled(position: Int, orderTrackingModel: OrderTrackingModel) {
                try {
                    if (orderTrackingModel.orderType == OrderTracking.PAY_NOW) {
                        var estimatePayAmount: Double? = 0.0
                        var cashHandlingCharge: Double? = 0.0
                        var cashHandlingChargeApplicable: Double? = 0.0
                        for (index in viewModel.homePaymentPendingResponseList.indices) {
                            if (viewModel.homePaymentPendingResponseList[index].billDetailsModel?.orderId == orderTrackingModel.orderId) {
                                estimatePayAmount =
                                    viewModel.homePaymentPendingResponseList[index].billDetailsModel?.estimatedPayableValue
                                cashHandlingCharge = if(viewModel.homePaymentPendingResponseList[index].billDetailsResponse?.pspViewed == true) viewModel.homePaymentPendingResponseList[index].billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null
                                cashHandlingChargeApplicable = if(viewModel.homePaymentPendingResponseList[index].billDetailsResponse?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(viewModel.homePaymentPendingResponseList[index].billDetailsResponse) else null //if (viewModel.homePaymentPendingResponseList[index].billDetailsModel?.pspViewed == true) viewModel.homePaymentPendingResponseList[index].billDetailsModel?.cashHandlingInfoModel?.charge ?: 0.0 else null
                            }
                        }
                        viewModel.sendPaymentPendingSheetViewed(
                            MxPaymentPendingViewed(
                                clickedOnPage = "homepage",
                                estimatedPayableAmount = estimatePayAmount,
                                orderId = orderTrackingModel.orderId.toString(),
                                cashHandlingCharge = cashHandlingCharge,
                                cashHandlingChargeApplicable = cashHandlingChargeApplicable
                            )
                        )
                    }
                } catch (_: Exception) {
                }
            }

            override fun onTrackClick(orderTrackingModel: OrderTrackingModel) {

                /*  if (orderTrackingModel.orderType.type == "Call me" && orderTrackingModel.timerInMillis > 0) {
                      viewModel.displayBottomSheet(BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW)
                  } else if (orderTrackingModel.orderType.type == "Call me") {
                      viewModel.displayBottomSheet(BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER)
                  }
                  */

                if (orderTrackingModel.orderType.type == "Call me") {
                    // viewModel.displayBottomSheet(BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER)
                    //do api call from here and open doctor call popup
                    viewModel.bottomSheetDoctorCallOrderId = orderTrackingModel.orderId.toString()
                    viewModel.getActiveOrderCallMeBack()

                } else if (orderTrackingModel.orderType.type == "Call me back") {
                    viewModel.resetPreviousAndShowThisBottomSheet(BottomSheetType.DOCTOR_CALL_MISSED_CALL_BACK)
                } else if (orderTrackingModel.orderType.type == "Pay now") {
                    //viewModel.displayBottomSheet(BottomSheetType.PAYMENT_PENDING)
                    viewModel.paymentMethodDetailsData.value?.let {
                        if (it.isNotEmpty()) {
                            it.forEachIndexed { index, homePaymentPendingResponse ->
                                try {
                                    if (orderTrackingModel.orderId == homePaymentPendingResponse.billDetailsModel?.orderId) {
                                       /* startActivity(
                                            Intent(
                                                this@HomePageActivity,
                                                PaymentActivity::class.java
                                            )
                                                .putExtra(
                                                    "orderId",
                                                    homePaymentPendingResponse.billDetailsModel?.orderId
                                                )
                                                .putExtra(
                                                    "paymentMethod",
                                                    CommonFunc.getPaymentMethodForCashfree(
                                                        homePaymentPendingResponse.paymentSelectionInfo?.paymentMethod
                                                    )
                                                )
                                                .putExtra(
                                                    "paymentMethodId",
                                                    homePaymentPendingResponse.paymentSelectionInfo?.paymentMethodId?.toLong()
                                                        ?: 0
                                                )
                                                .putExtra(
                                                    BundleConstants.BUNDLE_KEY_BILL_DETAILS,
                                                    Gson().toJson(homePaymentPendingResponse.billDetailsModel)
                                                )
                                                .putExtra(
                                                    BundleConstants.BUNDLE_KEY_IS_REORDER,
                                                    homePaymentPendingResponse.activeOrderItem?.mxEvents?.reorder
                                                )
                                                .putExtra(
                                                    "estimatedPayableValue",
                                                    homePaymentPendingResponse.billDetailsModel?.estimatedPayableValue
                                                ).putExtra(
                                                    BundleConstants.CURRENT_ORDER_STATUS,
                                                    "payment pending"
                                                )


                                        )*/

                                        navigateToPaymentActivity(
                                            params = bundleOf(
                                                "orderId" to   homePaymentPendingResponse.billDetailsModel?.orderId,
                                                "paymentMethod" to CommonFunc.getPaymentMethodForCashfree(homePaymentPendingResponse.paymentSelectionInfo?.paymentMethod),
                                                "paymentMethodId" to (homePaymentPendingResponse.paymentSelectionInfo?.paymentMethodId?.toLong() ?: 0),
                                                BundleConstants.BUNDLE_KEY_BILL_DETAILS to Gson().toJson(homePaymentPendingResponse.billDetailsModel),
                                                BundleConstants.BUNDLE_KEY_IS_REORDER to homePaymentPendingResponse.activeOrderItem?.mxEvents?.reorder,
                                                "estimatedPayableValue" to homePaymentPendingResponse.billDetailsModel?.estimatedPayableValue,
                                                BundleConstants.CURRENT_ORDER_STATUS to "payment pending"
                                            ),
                                            )


                                        viewModel.sendPaymentPageVisitedEventToMixpanel(
                                            "homepage",
                                            "payment_popup",
                                            orderTrackingModel.isReorder
                                        )
                                    }
                                } catch (_: Exception) {
                                }
                            }
                        }
                    }
                } else if (orderTrackingModel.orderType.type == "Track") {
                    navigateToOrderStatusActivity(
                        params = bundleOf(
                            BundleConstants.ORDER_ID to orderTrackingModel.orderId,
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage" ,
                            BundleConstants.BUNDLE_KEY_PAGE_SECTION to "order status"
                        ))
                }
            }

            override fun onCloseClick() {
                if (isSingleClickParam()) {
                    viewModel.isActiveOrderClosed.value = true
                    endOrderTrackerAnimation(true)
                    viewModel.setCartCount()
                    setViewCartVisibility()
                    setBottomNavigationViewCorners(binding.bottomNavigationView)
                }
            }

        }
        binding.orderTracking.setOrderTrackingCallback(orderTrackingCallback)
        /*viewModel.baseLoginSuccessResponse.observe(this) {
            if (it && viewModel.isOTPVerified) {
                SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()
            }
        }*/
        val callMeBackCallback = object : PopUpDialogCallback {
            override fun onActionButtonClicked() {
                //TODO call api
                //Toast().showCustomToastMessage(this@HomePageActivity, "Calling..")
            }

            override fun onCloseButtonClicked() {
                //TODO("Not yet implemented")
            }

        }

        //code commented from here as this observer is already present in Home Fragment
        /*viewModel.bottomSheetTrigger.observe(this) {
          when (it.type) {
              BottomSheetType.EMPTY -> {}
              BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW -> {
                  val bottomSheet = it.doctorCallMissed?.let { sheet ->
                      DoctorCallMissedBottomSheet(
                          sheet,
                          callMeBackCallback,
                          ftcViewModel
                      )
                  }
                  bottomSheet?.isCancelable = true
                  if (bottomSheet?.isVisible == false) bottomSheet.show(
                      supportFragmentManager,
                      "DOCTOR_CALL_MISSED_CALL_NOW"
                  )
              }

              BottomSheetType.DOCTOR_CALL_MISSED_CALL_BACK -> {
                  val bottomSheet = it.doctorCallMissed?.let { sheet ->
                      DoctorCallMissedBottomSheet(
                          sheet,
                          callMeBackCallback,
                          ftcViewModel
                      )
                  }
                  bottomSheet?.isCancelable = true
                  if (bottomSheet?.isVisible == false) bottomSheet.show(
                      supportFragmentManager,
                      "DOCTOR_CALL_MISSED_CALL_BACK"
                  )
              }

              /* BottomSheetType.PAYMENT_PENDING -> {
                   val bottomSheet =
                       it.paymentPending?.let { sheet -> PaymentPendingBottomSheet(paymentPendingCallback,sheet)
                       }
                   bottomSheet?.isCancelable = true
                   bottomSheet?.openBottomSheet(false, 90, 6)
                   if (bottomSheet?.isVisible == false)
                       bottomSheet.show(supportFragmentManager, "PAYMENT_PENDING")
               }*/

              BottomSheetType.DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER -> {
                  val bottomSheet = it.doctorCallMissed?.let { sheet ->
                      DoctorCallMissedBottomSheet(
                          sheet,
                          callMeBackCallback, ftcViewModel
                      )
                  }
                  bottomSheet?.isCancelable = true
                  if (bottomSheet?.isVisible == false) bottomSheet.show(
                      supportFragmentManager,
                      "DOCTOR_CALL_MISSED_CALL_NOW_WITHOUT_TIMER"
                  )
              }

              else -> {}
          }
        }*/
        val callback = object : PopUpDialogCallback {

            override fun onActionButtonClicked() {
                couponSavingPopUp.dismiss()
            }

            override fun onCloseButtonClicked() {
                //do nothing
            }
        }

        couponSavingPopUp = CouponSavingPopUp("", 0.0, "", callback)

        applyCouponCallBack = object : ApplyCouponCallback {
            override fun applyCouponButtonClick() {
                Toast().showCustomToastMessage(this@HomePageActivity, "apply coupon clicked ")
                couponSavingPopUp.show(
                    supportFragmentManager, "PurchaseConfirmationDialog.TAG"
                )
            }

            override fun applyCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
//                Toast().showCustomToastMessage(this@HomePageActivity, "apply coupon clicked with response ${Gson().toJson(couponCodeResponse)}")
                if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                    viewModel.setCartCount()
                    if (SharedPrefManager.getInstance().prescriptionCount > 0 && (viewModel.cartModel.value?.amount
                            ?: 0.0) <= 0.0
                    ) {
                        //only prescription case
                        viewModel.applyCouponClick(couponCodeResponse)
                    } else {
                        //if ((viewModel.cartModel.value?.amount?: 0.0) >= (couponCodeResponse.minCartValue?: 0)) {
                        if ((viewModel._medicineTotalSellingPrice.value
                                ?: 0.0) >= (couponCodeResponse?.minCartValue ?: 0)
                        ) {
                            viewModel.applyCouponClick(couponCodeResponse)
                        } else {
                            viewModel.openCouponFailed.postValue(Event(couponCodeResponse))
                        }
                    }
                    //viewModel.applyCouponClick(couponCodeResponse)
                } else {
                    Log.e("currentPayableAmount", "::::" + viewModel.cartModel.value?.amount)
                    viewModel.calculateSavingAmount(
                        couponCodeResponse,
                        viewModel.cartModel.value?.amount ?: 0.0
                    )
                }
            }

            override fun removeCouponButtonClick() {
                Toast().showCustomToastMessage(this@HomePageActivity, "remove coupon clicked ")
            }

            override fun removeCouponButtonClick(couponCodeResponse: CouponCodeResponse.Coupon?) {
                couponCodeResponse?.offerId.let { offerID ->
                    Log.d("TAG", "removeCouponButtonClick: $offerID")
                    if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                        viewModel.removeCouponClick(couponCodeResponse)
                    } else {
                        viewModel.callCouponRemovedEventForOfflineCouponCase(
                            viewModel.billDetailsData,
                            "homepage",
                            couponCodeResponse,
                            0
                        )
                        SharedPrefManager.getInstance().offerId = "0"
                        SharedPrefManager.getInstance().couponModel = null
                        SharedPrefManager.getInstance().setFtcVariantCCouponExpiryTimeRestart(0)
                        SharedPrefManager.getInstance().setCouponDiscount(0f)
                        viewModel.setCartCount()
                        viewModel.stopCouponTimer()
                        stickyNotificationWithCallBack(couponCodeResponse, "")
                    }

                }
            }
        }
        viewModel.ftcCouponData.observe(this@HomePageActivity) {
            processUrgencyCoupon(it)
        }
        viewModel.eventOpenCouponPopup.observe(this, EventObserver {

            it?.let {
                var dialog: DialogFragment? = null
                if (it.second?.message.equals("Success")) {
                    if (it.second?.responseData?.isOfferApplied == true) {
                        SharedPrefManager.getInstance().couponModel = it.first

                        if (SharedPrefManager.getInstance().incompleteOrderId > 0) {
                            viewModel.calculateBillDetailsAfterCouponApplied(SharedPrefManager.getInstance().incompleteOrderId)
                        } else {
                            SharedPrefManager.getInstance().setCouponDiscount(
                                it.second?.responseData?.couponDiscount?.toFloat() ?: 0f
                            )
                            viewModel.setCartCount()
                        }

                        if (it.first?.expiryDate!! > 0 && it.first?.showFtcCounter!!) {
                            SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                                System.currentTimeMillis()
                            it.first?.expiryDate =
                                SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                        }
                        if (SharedPrefManager.getInstance().couponModel.showFtcCounter != null && SharedPrefManager.getInstance()?.couponModel?.showFtcCounter == true) {
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
                            description = it.second?.responseData?.description?.joinToString(
                                separator = "\n"
                            ),
                            //description = it.second?.responseData?.description,
                            tnc = it.second?.responseData?.tnc,
                            ftcViewModel
                        )
                        dialog.isCancelable = true
                        if (!dialog.isVisible) {
                            dialog.show(
                                this@HomePageActivity.supportFragmentManager,
                                "CouponApplySuccess"
                            )
                        }
                    } else {
                        openApplyCouponValidationPopup(it.first, it.second)

                    }

                } else {
                    val callback = object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            dialog?.dismiss()
                        }

                        override fun onCloseButtonClicked() {
                            TODO("Not yet implemented")
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
                    dialog.isCancelable = true
                    if (!dialog.isVisible) {
                        dialog.show(
                            this@HomePageActivity.supportFragmentManager,
                            "CouponApplySuccess"
                        )
                    }


                }
            }

        })

        viewModel.eventOpenCouponPopupOffline.observe(this, EventObserver {
            it?.let {

                var dialog: DialogFragment? = null
                if (it.second.isSuccess) {
                    viewModel.stopCouponTimer()
                    SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                        System.currentTimeMillis()
                    SharedPrefManager.getInstance().offerId = it.first?.offerId.toString()
                    SharedPrefManager.getInstance().couponModel = it.first

                    SharedPrefManager.getInstance().couponDiscount =
                        it.second.couponAppliedAmt.toFloat()

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
                            //TODO("Not yet implemented")
                        }
                    }
                    /**
                     * This pop up is used to show savings on coupon
                     */
                    /**
                     * This pop up is used to show savings on coupon
                     */
                    if (it.first?.expiryDate!! > 0 && it.first?.showFtcCounter!!) {
                        //SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime = it.first.currentDate!!.toLong()
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime =
                            System.currentTimeMillis()
                        it.first?.expiryDate =
                            SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime
                        Log.i("expiryDate", "" + it.first?.expiryDate)
                        Log.i("expiryDate", "" + it.first?.currentDate!!.toLong())
                    }
                    SharedPrefManager.getInstance().offerId = it.first?.offerId.toString()
                    SharedPrefManager.getInstance().couponModel = it.first
                    dialog = CouponApplySuccess(
                        couponCode = it.first?.promoCode ?: "",
                        saving = it.second.savingAmount ?: 0.0,
                        callback = callback,
                        expiryTime = it.first?.expiryDate ?: 0L,
                        isFtcCounterEnabled = it.first?.showFtcCounter == true,
                        description = null,
                        tnc = null,
                        ftcViewModel
                    )
                    dialog?.isCancelable = true
                    if (!dialog?.isVisible!!) {
                        dialog?.show(
                            this@HomePageActivity.supportFragmentManager,
                            "CouponApplySuccess"
                        )
                    }

                } else {
                    val callback = object : PopUpDialogCallback {
                        override fun onActionButtonClicked() {
                            dialog?.dismiss()
                        }

                        override fun onCloseButtonClicked() {
                            //TODO("Not yet implemented")
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
                        dialog?.show(
                            this@HomePageActivity.supportFragmentManager,
                            "CouponApplySuccess"
                        )
                    }


                }
            }

        })


        //event to initiate login
        viewModel.eventInitiateLogin.observe(
            this,
            EventObserver {
                pageSection = it?.toString() ?: ""
                initializationTrueCallerOAuth()
            })

        viewModel.eventOpenOrderSummaryActivity.observe(this,
            EventObserver {
                navigateToOrderSummaryActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart"
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )
            })

        viewModel.eventOpenPrescriptionActivity.observe(this,
            EventObserver {
                navigateToPrescriptionActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "main"
                    ),
                    true
                )
            })

        //event to launch CartActivity
        viewModel.eventOpenCartActivity.observe(this,
            EventObserver {
                navigateToCartActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_ORDER_ID to SharedPrefManager.getInstance().incompleteOrderId.toString(),
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        BundleConstants.BUNDLE_KEY_PAGE_SECTION to "view_cart",
                        "actionType" to it.toString()
                    ),
                    flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                )

            })

        viewModel.eventOpenCouponFailed.observe(this, EventObserver {
            var dialogFailed: DialogFragment? = null
            val callback = object : PopUpDialogCallback {
                override fun onActionButtonClicked() {
                    dialogFailed?.dismiss()
                }

                override fun onCloseButtonClicked() {
                    dialogFailed?.dismiss()
                }
            }

            /**
             * This pop up is used to show error on coupon
             */
            dialogFailed = CouponErrorPopup(
                couponCode = it?.promoCode ?: "",
                cartValue = it?.minCartValue ?: 0,
                message = getString(R.string.couponErrorMsg_without_dot) + (it?.minCartValue
                    ?: 0) + getString(
                    R.string.couponErrorMsgAvailable
                ),
                callback = callback,
            )
            dialogFailed.isCancelable = true
            if (!dialogFailed.isVisible) {
                dialogFailed.show(this.supportFragmentManager, "CouponErrorPopup")
            }
        })
        viewModel.eventBaseMessage.observe(this, EventObserver {
            if(it==null) return@EventObserver
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
                    SharedPrefManager.getInstance().setCouponDiscount(0f)
                    viewModel.setCartCount()
                }
            }
        })
    }

    private fun processUrgencyCoupon(it: CouponCodeResponse.Coupon?) {
        if (viewModel.showShimmerHome.value == false) {
            if (it == null) {
                binding.ftcCouponNotification.visibility = View.GONE
            }
            it?.let {
                Log.i(
                    "FTC_Home",
                    SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime.toString()
                )
                if (SharedPrefManager.getInstance()?.couponModel?.showFtcCounter != null && SharedPrefManager.getInstance()?.couponModel?.showFtcCounter == true && SharedPrefManager.getInstance()?.couponModel?.promoCode == it.promoCode) {
                    if (SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime - System.currentTimeMillis() > 0L) {
                        viewModel.stopCouponTimer()
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
    }

    fun openApplyCouponBottomSheet(couponResponse: CouponCodeResponse.Coupon?) {
        if (applyCouponCallBack != null) {
            val applyCouponBottomSheet =
                ApplyCouponBottomSheet(couponResponse, applyCouponCallBack!!)
            applyCouponBottomSheet.isCancelable = true
            if (!applyCouponBottomSheet.isVisible) {
                applyCouponBottomSheet.show(
                    this@HomePageActivity.supportFragmentManager, "CouponCodeOfferBottomSheet"
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
                this@HomePageActivity.supportFragmentManager,
                "CouponNotApplied"
            )
        }

    }

    private fun initView() {
        supportActionBar?.hide()
        viewModel.activeOrdersMutableLiveData.observe(this, Observer {
            binding.orderTracking.setOrderTrackingData(it)

            if (it.size == 1 && (it.firstOrNull()?.title
                    ?: "") == "Payment Pending" && (it.firstOrNull()?.btnTitle ?: "") == "Pay now"
            ) {
                if (viewModel.homePaymentPendingResponseList.size > 0) {
                    val estimatePayAmount =
                        viewModel.homePaymentPendingResponseList[0].billDetailsModel?.estimatedPayableValue
                    val cashHandlingCharge = if(viewModel.homePaymentPendingResponseList[0].billDetailsResponse?.pspViewed == true) viewModel.homePaymentPendingResponseList[0].billDetailsResponse?.cashHandlingInfo?.charge ?: 0.0 else null
                    val cashHandlingChargeApplicable = if(viewModel.homePaymentPendingResponseList[0].billDetailsResponse?.pspViewed == true) CommonFunc.getApplicableCashHandlingCharger(viewModel.homePaymentPendingResponseList[0].billDetailsResponse) else null //if (viewModel.homePaymentPendingResponseList[index].billDetailsModel?.pspViewed == true) viewModel.homePaymentPendingResponseList[index].billDetailsModel?.cashHandlingInfoModel?.charge ?: 0.0 else null
                    val orderId =
                        viewModel.homePaymentPendingResponseList[0].billDetailsModel?.orderId
                    viewModel.sendPaymentPendingSheetViewed(
                        MxPaymentPendingViewed(
                            clickedOnPage = "homepage",
                            estimatedPayableAmount = estimatePayAmount,
                            orderId = orderId.toString(),
                            cashHandlingCharge=cashHandlingCharge,
                            cashHandlingChargeApplicable=cashHandlingChargeApplicable
                        )
                    )
                }
            }
        })
        if (isFromCancelOrder && isCancelled) {
            isCancelled = false
            Toast().showCustomToastMessage(this, "Order cancelled successfully")
        }


        viewModel.isRoundedCornerBottomSheet.observe(this@HomePageActivity){
            if(it){
                // add the rounded corner to the bottom navigation bar
                setBottomNavigationViewCorners(binding.bottomNavigationView,radius =  18.dpToPx(this@HomePageActivity).toFloat())
            }else{
                // remove the rounded corner from bottom navigation bar
                setBottomNavigationViewCorners(binding.bottomNavigationView,radius =  0.dpToPx(this@HomePageActivity).toFloat())
            }
        }
        setListener()
    }

    private fun startOrderTrackingAnimation() {
        if (binding.orderTracking.visibility == View.VISIBLE) {
            val animate = TranslateAnimation(0f, 0f, binding.orderTracking.height.toFloat(), 0f)
            animate.duration = 200
            animate.fillAfter = true
            binding.orderTracking.startAnimation(animate)
        }
    }

    private fun endOrderTrackerAnimation(isAnimationRequired: Boolean) {
        binding.orderTracking.visibility = View.GONE
        if (isAnimationRequired) {
            val animate = TranslateAnimation(0f, 0f, 0f, binding.orderTracking.height.toFloat())
            animate.duration = 200
            binding.orderTracking.startAnimation(animate)
        } else {
            binding.orderTracking.clearAnimation()
        }
    }

    /*  private fun initFtcCountDownTimer(millis: Long) {
    if (ftcViewModel.getCountDownTimerInstance() == null) {
        ftcViewModel.ftcTimeRemainingString.observe(this, Observer<String> { str: String ->
            if (str != "") {
    //                    viewModel.ftcCounterTime.postValue(str)
            }
        })
        ftcViewModel.start(millis)
    }

    }*/

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            HomeSectionConstants.REQUEST_CHECK_SETTINGS -> when (resultCode) {
                RESULT_OK -> {
                    lifecycleScope.launch {
                        delay(1000)
                        (homeFragment as? HomeFragment)?.getCurrentGPSLocation()
                    }
                    //   android.widget.Toast.makeText(this, "Location enabled by user!", android.widget.Toast.LENGTH_LONG).show()
                }

                RESULT_CANCELED -> {
//                    (homeFragment as? HomeFragment)?.checkLocationEnablePopup()
                    //    android.widget.Toast.makeText(this, "Location not enabled, user cancelled.", android.widget.Toast.LENGTH_LONG).show()

                }
            }

            TcSdk.SHARE_PROFILE_REQUEST_CODE -> {
                TcSdk.getInstance().onActivityResultObtained(this, requestCode, resultCode, data)
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        try {
            when (requestCode) {
                HomeSectionConstants.LOCATION_PERMISSIONS_REQUEST -> {
                    if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        (homeFragment as? HomeFragment)?.checkLocationEnablePopup()
                        //   android.widget.Toast.makeText(this, "Location permission request by user onRequestPermissionsResult!", android.widget.Toast.LENGTH_LONG).show()
                    } else {
                        (homeFragment as? HomeFragment)?.checkLocationPermission()
                        /*android.widget.Toast.makeText(
                            this,
                            "Location denied by user !",
                            android.widget.Toast.LENGTH_LONG
                        ).show()*/
                    }
                }

                ApiEndpointConstants.MY_PERMISSIONS_REQUEST_CONTACT -> {
                    if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        viewModel.isContactPermissionGranted.postValue(true)
                    } else {
                        if (requestCode == ApiEndpointConstants.MY_PERMISSIONS_REQUEST_CONTACT) {
                            viewModel.dismissBottomSheetAfterSaveContact.postValue(true)
                        }
                    }
                }

            }
        } catch (_: Exception) {
        }

    }

    private fun setViewCartVisibility() {
        val transition: Transition = Slide(Gravity.BOTTOM)
        transition.duration = 200
        transition.addTarget(binding.tmCarts)
        TransitionManager.beginDelayedTransition((binding.tmCarts.parent as ViewGroup), transition)
        if (viewModel.showShimmerHome.value == true || viewModel.activeMenu.value != R.id.homeFragment
            || (viewModel.cartItemCount.value!! == 0 && SharedPrefManager.getInstance().prescriptionCount == 0)

        ) {
            binding.tmCarts.visibility = View.GONE
        } else {
            binding.tmCarts.visibility = View.VISIBLE
        }
    }

    fun checkFtcCouponDataLocally() {

        SharedPrefManager.getInstance().couponModel?.let {
            if (it.showFtcCounter != null && it.showFtcCounter == true) {
                binding.ftcCouponNotification.visibility = View.VISIBLE
                if (SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime - System.currentTimeMillis() > 0L) {
                    viewModel.startTimer(
                        Coupon.ENDS_IN.prefix,
                        SharedPrefManager.getInstance().ftcVariantCCouponExpiryTime ?: 0L
                    ) { time ->
                        runOnUiThread {
                            stickyNotificationWithCallBack(it, time)
                        }
                    }
                } else {
                    viewModel.stopCouponTimer()
                    stickyNotificationWithCallBack(it, "")
                }

            } else if (SharedPrefManager.getInstance().couponModel != null) {
                if (SharedPrefManager.getInstance().couponModel.showFtcCounter == true) {
                    binding.ftcCouponNotification.visibility = View.VISIBLE
                    viewModel.stopCouponTimer()
                    stickyNotificationWithCallBack(it, "")
                } else {
                    binding.ftcCouponNotification.visibility = View.GONE
                }
            } else {
                binding.ftcCouponNotification.visibility = View.GONE
            }

        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.resumeCount++
        if (resumeCount > 1 && viewModel.activeMenu.value == R.id.homeFragment)
            viewModel.getFtcCouponData()

        if (resumeCount > 2)
            viewModel.onResumeApiCalls()
    }

    private fun stickyNotificationWithCallBack(
        couponResp: CouponCodeResponse.Coupon?,
        time: String
    ) {
        Log.d("TAG", "stickyNotificationWithCallBack: time $time")
        Log.d("TAG", "stickyNotificationWithCallBack PROMO CODE: time $couponResp.promoCode")
        //  Log.e("Intent", "onCreate: setParameter call 300000:::"+SharedPrefManager.getInstance().couponDiscount.toDouble().toString())

        var message = ""
        currentPromoCode = couponResp?.promoCode ?: ""
        message = if (SharedPrefManager.getInstance().couponModel == null) couponResp?.title ?: ""
        else if (SharedPrefManager.getInstance().couponModel.promoCode == (couponResp?.promoCode
                ?: "")
        ) SharedPrefManager.getInstance().couponModel.promoCode + " applied" else couponResp?.title
            ?: ""
        val data = StickyNonStickyNotificationModel(
            message = message,
            amount = couponResp?.maxDiscount ?: 0.0,
            subTitle = "",
            timer = if (SharedPrefManager.getInstance().couponModel?.showFtcCounter == true && time != getString(
                    R.string.timer_ends_string
                )
            ) time else "",
            buttonText = "Apply",
            drawableRight = if (SharedPrefManager.getInstance().couponModel == null) ContextCompat.getDrawable(
                this@HomePageActivity,
                com.intellihealth.salt.R.drawable.ic_chevron_right_white
            ) else if (SharedPrefManager.getInstance().couponModel.promoCode !=
                (couponResp?.promoCode ?: "")
            ) ContextCompat.getDrawable(
                this@HomePageActivity,
                com.intellihealth.salt.R.drawable.ic_chevron_right_white
            ) else ContextCompat.getDrawable(
                this@HomePageActivity,
                com.intellihealth.salt.R.drawable.ic_right_arrow
            ),
            drawableLeft = if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode ==
                (couponResp?.promoCode ?: "")
            ) ContextCompat.getDrawable(
                this@HomePageActivity,
                R.drawable.ic_purple_tick
            ) else ContextCompat.getDrawable(
                this@HomePageActivity,
                com.intellihealth.salt.R.drawable.percentage
            ),
            buttonIcon = null
        )
        val ftcNotificationCallback =
            object : StickyNotStickyNotificationCallback {
                override fun onButtonClick(notificationType: StickyNonStickyNotificationModel) {
                    applyCouponCallBack?.applyCouponButtonClick(couponResp)
                }

                override fun onViewClick(notificationType: StickyNonStickyNotificationModel) {
                    //        viewModel.callEventApplyCouponClickedFromBaseVM()
                    if (isSingleClickParam(500)) {
                        openApplyCouponBottomSheet(couponResp)
                        /***
                         *  setting MixPanel SDK event for sticky_strip_clicked
                         */
                        viewModel.urgencyStickyClickedEvent(couponResp)
                    }
                }

            }
        if (SharedPrefManager.getInstance().couponModel != null && SharedPrefManager.getInstance().couponModel.promoCode == (couponResp?.promoCode
                ?: "")
        ) {
            binding.ftcCouponNotification.setStickyUI(
                type = NotificationType.APPLY_COUPON.type,
                position = NotificationPosition.BOTTOM.position,
                isButtonVisible = NotificationButton.DISABLED.status
            )
            binding.ftcCouponNotification.setStickyUI(
                type = NotificationType.COUPON_APPLIED.type,
                position = NotificationPosition.BOTTOM.position,
                isButtonVisible = NotificationButton.DISABLED.status
            )
        } else {
            viewModel.stopCouponTimer()
            binding.ftcCouponNotification.setStickyUI(
                type = NotificationType.APPLY_COUPON.type,
                position = NotificationPosition.BOTTOM.position,
                isButtonVisible = NotificationButton.DISABLED.status
            )
            updateSticky(cartCount)
        }
        binding.ftcCouponNotification.setStickyNonStickyNotificationData(data)
        binding.ftcCouponNotification.setNotificationCallback(
            ftcNotificationCallback
        )
        if (viewModel.activeMenu.value == R.id.homeFragment) {
            binding.ftcCouponNotification.visibility = View.VISIBLE
        } else {
            binding.ftcCouponNotification.visibility = View.GONE
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        HomeViewModel.reloadMyOrders.value = false
        HomeViewModel.postLoginAction.value = false
        HomeViewModel.tmWallet.value = 0.0
    }
}

private fun FragmentManager.addFragmentToExistingStack(fragment: Fragment, tag: String) {
    this.beginTransaction()
//.setCustomAnimations(R.anim.enter, R.anim.exit)
        .add(R.id.containerFragment, fragment, tag).hide(fragment).commit()
}

private fun setupParameters(viewModel: HomeViewModel, receivedIntent: Intent?) {
    try {
        SharedPrefManager.getInstance().refreshOrder = false
        val data: Uri? = receivedIntent?.data
        if (data != null) {
            // Handle the deep link data here
            viewModel.uriDeeplink = data.toString()
            viewModel.intentData.postValue(receivedIntent)
        }
    } catch (ignore: Exception) {
    }

}
