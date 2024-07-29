package com.intellihealth.truemeds.presentation.activity

import android.graphics.Color
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.domain.enums.LoginFromScreen
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.BundleConstants.INITIATED_LOGIN_FROM_SCREEN
import com.truecaller.android.sdk.oAuth.CodeVerifierUtil.Companion.generateRandomCodeVerifier
import com.truecaller.android.sdk.oAuth.CodeVerifierUtil.Companion.getCodeChallenge
import com.truecaller.android.sdk.oAuth.TcOAuthCallback
import com.truecaller.android.sdk.oAuth.TcOAuthData
import com.truecaller.android.sdk.oAuth.TcOAuthError
import com.truecaller.android.sdk.oAuth.TcSdk
import com.truecaller.android.sdk.oAuth.TcSdkOptions
import java.math.BigInteger
import java.security.SecureRandom

abstract class BaseActivityWithLogin : BaseActivity() {
    var stateRequested: String = ""
    var codeVerifier: String = ""
    var authorizationCode: String = ""
    var pageSection = ""
    var login_clicked_on_page = "homepage"

    abstract fun setIsTruecaller(isTruecaller: Boolean)
    abstract fun sendLoginPageViewedEvent()

    abstract fun getTrueCallerUserDetails()

    abstract fun openLoginBottomSheet()
    abstract fun closeLoginBottomSheet()

    private val tcOAuthCallback: TcOAuthCallback = object : TcOAuthCallback {
        override fun onSuccess(tcOAuthData: TcOAuthData) {
            val stateReceived = tcOAuthData.state
            if (stateReceived == stateRequested) {
                authorizationCode = tcOAuthData.authorizationCode
                getTrueCallerUserDetails()
            }
        }

        override fun onFailure(tcOAuthError: TcOAuthError) {
            if (tcOAuthError is TcOAuthError.ApiError) {
                if (tcOAuthError.errorCode != 40304) { //invalid fingerprint
                    Toast.makeText(
                        this@BaseActivityWithLogin,
                        "Unexpected error! Try this instead",
                        Toast.LENGTH_LONG
                    ).show()
                }
                setIsTruecaller(false)
                openLoginBottomSheet()
            } else if (tcOAuthError is TcOAuthError.UserDeniedByPressingFooterError) {
                setIsTruecaller(false)
                openLoginBottomSheet()
            }
        }
    }

    fun initializationTrueCallerOAuth() {

        val tcSdkOptions = TcSdkOptions.Builder(this, tcOAuthCallback)
            .buttonColor(ContextCompat.getColor(this, R.color.tc_btn_color))
            .buttonTextColor(Color.WHITE)
            .loginTextPrefix(TcSdkOptions.LOGIN_TEXT_PREFIX_TO_GET_STARTED)
            .ctaText(TcSdkOptions.CTA_TEXT_CONTINUE)
            .buttonShapeOptions(TcSdkOptions.BUTTON_SHAPE_RECTANGLE)
            .consentTitleOption(TcSdkOptions.SDK_CONSENT_TITLE_LOG_IN)
            .footerType(TcSdkOptions.FOOTER_TYPE_ANOTHER_MOBILE_NO)
            .sdkOptions(TcSdkOptions.OPTION_VERIFY_ONLY_TC_USERS)
            .build()

        TcSdk.init(tcSdkOptions)

        //localization
        //val locale = Locale("hi") // change language to Hindi
        //TcSdk.getInstance().setLocale(locale)

        //check if trueCaller application is trueCaller installed
        val isUsable = TcSdk.getInstance().isOAuthFlowUsable
        if (isUsable) {
            closeLoginBottomSheet()
            setIsTruecaller(true)
            //stateRequested is for compare inside on success to prevent forgery attacks
            stateRequested = BigInteger(130, SecureRandom()).toString(32)
            TcSdk.getInstance().setOAuthState(stateRequested)

            //scope list > must be selected on the portal as well
            val scopes = arrayOf("profile", "phone", "openid")
            TcSdk.getInstance().setOAuthScopes(scopes)

            //codeVerifier used to generate the access token
            codeVerifier = generateRandomCodeVerifier()
            val codeChallenge = getCodeChallenge(codeVerifier)
            if (codeChallenge != null) {
                TcSdk.getInstance().setCodeChallenge(codeChallenge)
            }
            TcSdk.getInstance().getAuthorizationCode(this)
            setIsTruecaller(true)
            sendLoginPageViewedEvent()
        } else {
            setIsTruecaller(false)
            openLoginBottomSheet()
        }
    }

    fun verifyLoginAndRedirect(
        type: LoginFromScreen = LoginFromScreen.HOME,
        pageSection: String,
        function: () -> Unit
    ) {
        INITIATED_LOGIN_FROM_SCREEN = type
        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()) function.invoke()
        else {
            this.pageSection = pageSection
            this.login_clicked_on_page =
                if (type == LoginFromScreen.HOME) "homepage" else "account_page"
            initializationTrueCallerOAuth()
        }
    }
}