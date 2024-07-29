package com.intellihealth.truemeds.presentation.activity

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.appsflyer.deeplink.DeepLinkListener
import com.appsflyer.deeplink.DeepLinkResult
import com.google.android.gms.tasks.Task
import com.google.android.play.core.appupdate.AppUpdateInfo
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.common.IntentSenderForResultStarter
import com.google.android.play.core.install.InstallStateUpdatedListener
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.UpdateAvailability
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.utils.PopUpType
import com.intellihealth.truemeds.databinding.ActivitySearchSuggestionBinding
import com.intellihealth.truemeds.databinding.ActivitySplashScreenBinding
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.domain.enums.LoginFromScreen
import com.intellihealth.truemeds.domain.navigation.navigateToHomePageActivity
import com.intellihealth.truemeds.domain.navigation.navigateToLoginActivity
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.RequestCodeConstants
import com.intellihealth.truemeds.presentation.utils.viewBinding
import com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.EventObserver
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch


@AndroidEntryPoint
class SplashScreen : BaseActivity() {
    private lateinit var context: Context
    private val binding by viewBinding(ActivitySplashScreenBinding::inflate)
    private lateinit var viewModel: SplashScreenViewModel
    private var defrreddDeepLinkUri:Uri?=null
    var deferred_deep_link_processed_flag = false

    //InAppUpdate
    private lateinit var appUpdateManager: AppUpdateManager
    private lateinit var appUpdateInfoTask: Task<AppUpdateInfo>
    private val installListener = InstallStateUpdatedListener { /*installState ->
        if (installState.installStatus() == InstallStatus.DOWNLOADING) {
            val bytesDownloaded = installState.bytesDownloaded()
            val totalBytesToDownload = installState.totalBytesToDownload()
        }*/
    }
    private var updateFlowResultLauncher: ActivityResultLauncher<IntentSenderRequest>? = null


    override fun extractIntentData(){

    }
    /**
     * 1) Update SplashScreen image e.g. DEFAULT, CHRISTMAS
     * 2) Update Google AdId and FirebaseId
     * 3) Push CleverTap XiaomiRegistrationId
     * 4) Set event listener
     * 5) Get intent data (if any)
     * 6) Get Deeplink (if any)
     * 7) Check for in app update
     * 8) After taking action on InAppUpdate, api call to check whether the current app version is active or not
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[SplashScreenViewModel::class.java]
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        //Set viewmodel as lifecycle observer of the activity
        lifecycle.addObserver(viewModel)
        context = this
        updateFlowResultLauncher =
            registerForActivityResult(ActivityResultContracts.StartIntentSenderForResult()) { result ->
                if (result.resultCode == RESULT_CANCELED) {
                    viewModel.getMobileMaster(context)
                }
            }
        //1) Update SplashScreen image e.g. DEFAULT, CHRISTMAS
        viewModel.updateSplashScreenImage()
        with(binding.lottieView){
            setAnimation("splash_launch.json")
            repeatCount = 0 /*LottieDrawable.INFINITE*/
            playAnimation()
        }

        //2) Update Google AdId and FirebaseId
        viewModel.updateGoogleAdId(context)
        viewModel.updateFirebaseId(context)
        //3) Push CleverTap XiaomiRegistrationId
        //viewModel.cleverTapXiaomiRegistration(context)
        //4) Set event listener
        setEventListener()
        //5) Get intent data (if any)
        getIntentData()

        //6) Get SingularDeeplink (if any)
        //7) Check for app update on Google Play Store
        processInAppUpdate()
        viewModel.sendAppOpenedEvent(this)
        processAppsFlyerDeeplink()
        val deviceID = Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
        SharedPrefManager.getInstance().deviceID = deviceID
    }

    private fun processAppsFlyerDeeplink() {
        try {
            val appsflyer = AppsFlyerLib.getInstance()
            appsflyer.subscribeForDeepLink(DeepLinkListener { deepLinkResult ->
                when (deepLinkResult.status) {
                    DeepLinkResult.Status.FOUND -> {
                        //Log.d("deferredLink", "Deep link found");
                    }

                    DeepLinkResult.Status.NOT_FOUND -> {
                        //Log.d("deferredLink", "Deep link not found");
                        return@DeepLinkListener
                    }

                    else -> {
                        // dlStatus == DeepLinkResult.Status.ERROR
                        val dlError = deepLinkResult.error
                        //Log.d(LOG_TAG, "There was an error getting Deep Link data: " + dlError.toString());
                        return@DeepLinkListener
                    }
                }
                val deepLinkObj = deepLinkResult.deepLink
                // An example for using a generic getter
                val activityName: String? = deepLinkObj.deepLinkValue
                val dlData = deepLinkObj.clickEvent
                if (dlData.has("deep_link_sub2")) {
                    var referrerId: String? = ""
                    referrerId = deepLinkObj.getStringValue("deep_link_sub2")
                }
                defrreddDeepLinkUri=Uri.parse(deepLinkObj.deepLinkValue)
                //Log.d("deferredLink", "Deep link found"+defrreddDeepLinkUri)
                //goToActivity(activityName, deepLinkObj)
            })

            appsflyer.init(BuildConfig.APPS_FLYER_TOKEN, conversionListener, this)
            appsflyer.start(this)
        } catch (_: Exception) {
        }
    }

    private val conversionListener: AppsFlyerConversionListener =
            object : AppsFlyerConversionListener {
                override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
                    data?.let {
                        val status: Any? = data["af_status"]
                        if (status.toString() == "Non-organic") {
                            if (data["is_first_launch"] == true) {
                                Log.d("deferredLink", "First time launching")
                                if (deferred_deep_link_processed_flag) {
                                    //Log.d("deferredLink", "Deferred deep link was already processed by UDL. The DDL processing in GCD can be skipped.")
                                    deferred_deep_link_processed_flag = false
                                } else {
                                    deferred_deep_link_processed_flag = true
                                    val link: String = data["deep_link_value"].toString()
                                    defrreddDeepLinkUri=Uri.parse(link)

                                }
                            } else {
                                Log.d("deferredLink", "Conversion: Not First Launch")
                            }
                        } else {
                            Log.d("deferredLink", "Conversion: This is an organic install.")
                        }

                    } ?: run {
                        Log.d("deferredLink", "Conversion Failed: ")
                    }
                }

                override fun onConversionDataFail(errorMessage: String?) {
                    // Your implementation for onConversionDataFail
                    if (errorMessage != null) {
                        Log.d("deferredLink",errorMessage)
                    }
                }

                override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {
                    Log.d("deferredLink", "onAppOpenAttribution: This is fake call.")
                }

                override fun onAttributionFailure(errorMessage: String?) {
                    Log.d("deferredLink", "error onAttributionFailure : " + errorMessage)
                }
            }

    private fun setEventListener() {
        Log.d("SplashScreen","intent.data : ${intent.data}")
        viewModel.openLoginActivity.observe(this, EventObserver {
            navigateToLoginActivity(
                data = defrreddDeepLinkUri?:intent.data
            )
            finish()
        })

        viewModel.openHomePageActivity.observe(this, EventObserver {
            BundleConstants.INITIATED_LOGIN_FROM_SCREEN = LoginFromScreen.HOME
            navigateToHomePageActivity(
                params = bundleOf(
                    BundleConstants.BUNDLE_KEY_ORDER_ID to viewModel.intentOrderId,
                    BundleConstants.BUNDLE_KEY_DESTINATION_PAGE to viewModel.intentDestinationPage
                ),
                uri = defrreddDeepLinkUri?:intent.data
            )
            finishAffinity()
        })

        viewModel.eventOpenErrorDialog.observe(this, EventObserver {
            if (it != null && it.equals(ErrorType.NO_NETWORK)) {
                //CommonFunc.openErrorDialog(this, ErrorType.NO_NETWORK)
                showDialogBox(PopUpType.INTERNET_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        viewModel.getMobileMaster(this@SplashScreen)
                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, true)
            }

        })

        viewModel.goToPlayStore.observe(this) {
            if (it) {
                showDialogBox(PopUpType.APP_UPDATE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        goToPlayStore()
                    }

                    override fun onCloseButtonClicked() {
                    }
                }, false)
            }
        }

        viewModel.eventShowInternalServerError.observe(this) { message ->
            if (!message.isNullOrEmpty()) {
                showDialogBox(PopUpType.API_FAILURE, object : PopUpDialogCallback {
                    override fun onActionButtonClicked() {
                        viewModel.getMobileMaster(this@SplashScreen)
                    }

                    override fun onCloseButtonClicked() {
                        finish()
                    }
                }, false, "Internal Server Error", message)
            }
        }
    }

    fun goToPlayStore() {
        try {
            val uri = Uri.parse("market://details?id=" + this.packageName)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY or Intent.FLAG_ACTIVITY_NEW_DOCUMENT or Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://play.google.com/store/apps/details?id=" + this.packageName)
            )
            startActivity(intent)
        }
//        finish()
    }

    private fun getIntentData() {
        intent?.let {
            viewModel.intentDestinationPage =
                it.getStringExtra(BundleConstants.BUNDLE_KEY_DESTINATION_PAGE) ?: ""
            viewModel.intentOrderId = it.getStringExtra(BundleConstants.BUNDLE_KEY_ORDER_ID) ?: ""
        }
    }

    private fun processInAppUpdate() {
        lifecycleScope.launch(IO) {
            try {
                appUpdateManager = AppUpdateManagerFactory.create(context)
                appUpdateInfoTask = appUpdateManager.appUpdateInfo
                appUpdateInfoTask.addOnSuccessListener { appUpdateInfo ->
                    var callMobileMasterApi = false
                    if (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE
                        || appUpdateInfo.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS
                    ) {
                        val intentSenderForResultStarter =
                            IntentSenderForResultStarter { intent, _, fillInIntent, flagsMask, flagsValues, _, _ ->
                                val request = IntentSenderRequest.Builder(intent)
                                    .setFillInIntent(fillInIntent)
                                    .setFlags(flagsValues, flagsMask)
                                    .build()

                                updateFlowResultLauncher?.launch(request)
                            }

                        when {
                            appUpdateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE) -> {
                                appUpdateManager.startUpdateFlowForResult(
                                    appUpdateInfo,
                                    AppUpdateType.IMMEDIATE,
                                    intentSenderForResultStarter,
                                    RequestCodeConstants.APP_UPDATE_REQUEST_CODE
                                )
                            }

                            appUpdateInfo.isUpdateTypeAllowed(AppUpdateType.FLEXIBLE) -> {
                                appUpdateManager.registerListener(installListener)
                                appUpdateManager.startUpdateFlowForResult(
                                    appUpdateInfo,
                                    AppUpdateType.FLEXIBLE,
                                    intentSenderForResultStarter,
                                    RequestCodeConstants.APP_UPDATE_REQUEST_CODE
                                )
                            }

                            else -> {
                                callMobileMasterApi = true
                            }
                        }
                    } else {
                        callMobileMasterApi = true
                    }
                    //8) After taking action on InAppUpdate,
                    // api call to check whether the current app version is active or not
                    if (callMobileMasterApi)
                        viewModel.getMobileMaster(context)
                }.addOnFailureListener {
                    viewModel.getMobileMaster(context)
                }
            } catch (_: Exception) {
                viewModel.getMobileMaster(context)
            }
        }
    }

    override fun onStop() {
        super.onStop()
        if (this::appUpdateManager.isInitialized)
            appUpdateManager.unregisterListener(installListener)
    }


}