package com.intellihealth.truemeds.presentation.activity

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.LinearLayout
import androidx.activity.OnBackPressedCallback
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.intellihealth.salt.callbacks.BannerCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.ActivityLoginBinding
import com.intellihealth.truemeds.domain.model.LoginBannerMetaData
import com.intellihealth.truemeds.domain.navigation.navigateToHomePageActivity
import com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase
import com.intellihealth.truemeds.presentation.adapter.LoginBannerAdapter
import com.intellihealth.truemeds.presentation.analytics.FirebaseEvent
import com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet
import com.intellihealth.truemeds.presentation.fragment.LoginMobileNumberFragment
import com.intellihealth.truemeds.presentation.fragment.LoginOtpFragment
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import com.truecaller.android.sdk.oAuth.TcSdk
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : BaseActivityWithLogin() {
    private val binding by viewBinding(ActivityLoginBinding::inflate)
    private lateinit var viewModel: LoginViewModel
    private lateinit var loginBannerAdapter: LoginBannerAdapter
    private lateinit var context: Context
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<LinearLayout>

    @Inject
    lateinit var firebaseEventUseCase: FirebaseEventUseCase

    private var loginBottomSheet: LoginBottomSheet = LoginBottomSheet("login", "")
    override fun sendLoginPageViewedEvent() {
    }

    override fun setIsTruecaller(isTruecaller: Boolean) {
        viewModel.isTruecaller = isTruecaller
    }

    override fun getTrueCallerUserDetails() {
        viewModel.getTrueCallerUserDetails(
            textAuthorizationCode = "authorization_code",
            clientId = resources.getString(R.string.truecaller_client_id),
            authorizationCode,
            codeVerifier,
            context
        )
    }

    override fun openLoginBottomSheet() {
        //not required here
    }

    override fun closeLoginBottomSheet() {
        if (loginBottomSheet.isVisible) {
            loginBottomSheet.dismiss()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        bottomSheetBehavior = BottomSheetBehavior.from(binding.bottomSheet)
        //Set view model as lifecycle observer of the activity
        lifecycle.addObserver(viewModel)
        context = this
        setUpData()
        setupOnBackPressed()
        setEventListener()
        setDataObserver()

        checkAndAskNotificationPermission()
        initializationTrueCallerOAuth()
        viewModel.updateFirebaseId(context)

        // Ensure the state is set after adding the callback to avoid missing the state change event
        binding.root.post {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

        // Disable dragging
        bottomSheetBehavior.isDraggable = false
    }

    override fun extractIntentData(){}

    // Function to set height of a view
    fun setViewHeight(view: View, height: Int) {
        val layoutParams = view.layoutParams
        layoutParams.height = height
        view.layoutParams = layoutParams
    }

    private fun setDataObserver() {
        val loader = Dialog(context)
        viewModel.isLoading.observe(this) {
            if (it) enableLoadingView(loader)
            else disableLoadingView(loader)
        }

        viewModel.tcObserver.observe(this) {
            navigateToHomePageActivity(uri = intent.data)
            finish()
        }
    }

    private fun setEventListener() {

        // To Observe the bottomSheet state
        bottomSheetBehavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback(){
            override fun onStateChanged(bottomSheet: View, newState: Int) {

                if (newState == BottomSheetBehavior.STATE_EXPANDED) {
                    val bottomSheetHeight = binding.bottomSheet.height

                    // calculate screen height
                    val displayMetrics = DisplayMetrics()
                    windowManager.defaultDisplay.getMetrics(displayMetrics)
                    val screenHeight = displayMetrics.heightPixels

                    val desiredBannerHeight = (screenHeight - bottomSheetHeight) + 90
                    setViewHeight(binding.topLoginBanner, desiredBannerHeight)
                }
            }

            override fun onSlide(bottomSheet: View, newState: Float) {}

        })


        /**
         * This Observer will listen the events and replace the page with OTP screen
         */
        viewModel.otpPageSwitchObserver.observe(this, EventObserver {
            if (!loginBottomSheet.isVisible) {
                replaceFragment(R.id.login_frame_layout, LoginOtpFragment())
            } else {
                viewModel.bottomSheetPageSwitch.postValue(1)
            }
            viewModel.currentPageName = "otp_page"
        })

        /**
         * This Observer will listen the events and go back to the Login screen
         */
        viewModel.loginPageSwitchObserver.observe(this, EventObserver {
            if (!loginBottomSheet.isVisible) {
                supportFragmentManager.popBackStackImmediate()
            } else {
                viewModel.bottomSheetPageSwitch.postValue(0)
            }
            viewModel.currentPageName = "login_page"
        })

        binding.skipButton.setOnClickListener {
            val view = this.currentFocus
            if (view != null) {
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }
            processSkipFlow()
        }

        viewModel.processSkipFlow.observe(this) {
            if (it)
                processSkipFlow()
        }
    }

    private fun processSkipFlow() {

        if (viewModel.clickedOnPage.equals("login_page")){
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_MOBILE_NO_SKIP,"Login")
        }else{
            firebaseEventUseCase.logFirebaseEvent(FirebaseEvent.FIREBASE_REGISTRATION_OTP_SKIP,"Login")
        }

        SharedPrefManager.getInstance().setIsLoginSkipped(true)
        viewModel.sendLoginSkippedEvent(viewModel.currentPageName, viewModel.isNewCustomer)
        navigateToHomePageActivity(uri = intent.data)
        finish()
    }

    private fun setupOnBackPressed() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                when (supportFragmentManager.backStackEntryCount) {
                    1 -> finish()

                    else -> supportFragmentManager.popBackStackImmediate()
                }
            }
        })
    }

    private fun setUpData() {
        addFragment(R.id.login_frame_layout, LoginMobileNumberFragment("login", ""))

        val loginBannerData = listOf(
            LoginBannerMetaData(
                bannerBackground = R.drawable.bg_banner_first,
                bannerImage = R.drawable.ic_login_banner_first
            ),
            LoginBannerMetaData(
                bannerBackground = R.drawable.bg_banner_second,
                bannerImage = R.drawable.ic_login_banner_second
            ),
            LoginBannerMetaData(
                bannerBackground = R.drawable.bg_banner_third,
                bannerImage = R.drawable.ic_login_banner_third
            )
        )

        //banner data
        setLoginBannerData(
            loginBannerData,
            object : BannerCallback {
                override fun getBannerClick(bannerPosition: Int) {

                }

                override fun getBannerPosition(position: Int) {
                    binding.loginBannerIndicator.setActivePage(position)
                }

                override fun getBannerSwipe() {

                }

            }, 3
        )

        with(binding.loginBannerIndicator) {
            setActivePage(0)
            setPageCount(loginBannerData.size)
            setViewPageIndicator()
        }
    }

    private fun setLoginBannerData(
        data: List<LoginBannerMetaData>,
        tmBannerCallback: BannerCallback?,
        swipeDelay: Int
    ) {
        loginBannerAdapter =
            LoginBannerAdapter(context, data, binding.loginVpBanner, swipeDelay * 1000.toLong())
        with(binding.loginVpBanner) {
            adapter = loginBannerAdapter
            setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {
                    tmBannerCallback?.getBannerSwipe()
                    loginBannerAdapter.updateCurrentPosition(position)
                    //updateStatusBarColor(position)
                }

                override fun onPageSelected(position: Int) {
                    tmBannerCallback?.getBannerPosition(position)
                }

                override fun onPageScrollStateChanged(state: Int) {}

            })
        }
    }

    private inline fun FragmentManager.doTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
        beginTransaction().func().commit()
    }

    private fun AppCompatActivity.addFragment(frameId: Int, fragment: Fragment) {
        supportFragmentManager.doTransaction {
            setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            ).add(frameId, fragment).addToBackStack(null)
        }
    }


    private fun AppCompatActivity.replaceFragment(frameId: Int, fragment: Fragment) {
        supportFragmentManager.doTransaction {
            setCustomAnimations(
                R.anim.slide_in,
                R.anim.fade_out,
                R.anim.fade_in,
                R.anim.slide_out
            ).replace(frameId, fragment).addToBackStack(null)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, @Nullable data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == TcSdk.SHARE_PROFILE_REQUEST_CODE) {
            try {
                TcSdk.getInstance().onActivityResultObtained(this, requestCode, resultCode, data)
            } catch (ignore: Exception) {
            }
        }
    }

    override fun notificationPermissionReceived() {
        super.notificationPermissionReceived()
        binding.loginFrameLayout.requestFocus()
        viewModel.notificationPermissionCallBack.postValue(Event(true))
        showKeyboard()
    }

    override fun onDestroy() {
        super.onDestroy()
        CommonFunc.freeMemory()
    }
}