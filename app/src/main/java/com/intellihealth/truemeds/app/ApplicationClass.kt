package com.intellihealth.truemeds.app

/*import io.embrace.android.embracesdk.Embrace
import io.embrace.android.embracesdk.EmbraceSamples*/
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.multidex.MultiDexApplication
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.appsflyer.deeplink.DeepLink
import com.appsflyer.deeplink.DeepLinkListener
import com.appsflyer.deeplink.DeepLinkResult
import com.clevertap.android.sdk.ActivityLifecycleCallback
import com.google.firebase.FirebaseApp
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.presentation.activity.SplashScreen
import com.intellihealth.truemeds.presentation.analytics.MixPanelEvent
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import dagger.hilt.android.HiltAndroidApp
import java.util.Locale
import java.util.Objects

@HiltAndroidApp
class ApplicationClass : MultiDexApplication() {

    //lateinit var applicationComponent: ApplicationComponent
    private var mixPanelEvent: MixPanelEvent? = null

    override fun onCreate() {
        //AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        //This api of cleverTap need to call before super.onCreate() of application class
        ActivityLifecycleCallback.register(this)
        //This needs to be added before CleverTapAPI instance creation.
        //CleverTapAPI.enableXiaomiPushOn(PushConstants.XIAOMI_MIUI_DEVICES)

        super.onCreate()

        mInstance = this
        //MixPanel Init
        mixPanelEvent = MixPanelEvent.getInstance(this)


        SharedPrefManager.initialize(applicationContext)
        FirebaseApp.initializeApp(this)

        processAppsFlyerDeeplink()
        //Embrace.getInstance().start(this)
        //EmbraceSamples.verifyIntegration() // temporarily add this to verify the integration
    }


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    private fun processAppsFlyerDeeplink() {
        try {
            val appsflyer = AppsFlyerLib.getInstance()
            appsflyer.subscribeForDeepLink(DeepLinkListener { deepLinkResult ->
                when (deepLinkResult.status) {
                    DeepLinkResult.Status.FOUND -> {
                        //Log.d(LOG_TAG, "Deep link found");
                    }

                    DeepLinkResult.Status.NOT_FOUND -> {
                        //Log.d(LOG_TAG, "Deep link not found");
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
                goToActivity(activityName, deepLinkObj)
            })

            appsflyer.init(BuildConfig.APPS_FLYER_TOKEN, conversionListener, this)
            appsflyer.start(this)
        } catch (_: Exception) {
        }
    }

    private fun goToActivity(activityName: String?, dlData: DeepLink?) {
        try {
            val className = activityName!!.substring(0, 1)
                .uppercase(Locale.getDefault()) + activityName.substring(1)
            val targetClass: Class<*> =
                SplashScreen::class.java

            val intent = Intent(applicationContext, targetClass)
            if (dlData != null) {
                val myUri = Uri.parse(dlData.deepLinkValue)
                intent.data = myUri
            }
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        } catch (_: Exception) {
        }
    }

    private val conversionListener: AppsFlyerConversionListener =
        object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(conversionData: Map<String, Any>) {
                val status = Objects.requireNonNull(conversionData["af_status"]).toString()
                if (status == "Non-organic") {
                    //Log.d(LOG_TAG,"Conversion: This is a non-organic install.");
                } else {
                    //Log.d(LOG_TAG,"Conversion: This is an organic install.");
                }
            }

            override fun onConversionDataFail(errorMessage: String) {}

            override fun onAppOpenAttribution(attributionData: Map<String, String>) {}

            override fun onAttributionFailure(errorMessage: String) {}
        }

    // below code is added to show SaveContactBottomSheet on Home Fragment
    companion object {
        private lateinit var mInstance: ApplicationClass

        @Synchronized
        fun getInstance(): ApplicationClass {
            return mInstance
        }
    }

    fun getMixPanelEvent(): MixPanelEvent? {
        return mixPanelEvent
    }
}