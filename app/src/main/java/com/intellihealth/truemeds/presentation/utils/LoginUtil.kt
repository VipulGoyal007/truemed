package com.intellihealth.truemeds.presentation.utils

import android.content.Context
import android.util.Log
import com.intellihealth.truemeds.data.model.login.LoginVerificationResponse
import com.intellihealth.truemeds.domain.enums.LoginStatus
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.BaseViewModelWithLogin
import kotlinx.coroutines.delay

object LoginUtil {

    /**
     * 1) If isNewCustomer flag is true then trigger SignUpSuccessful event
     * 2) Trigger login successful
     * 3) CleverTap onUserLogin api to update user profile info
     * 4) Set data in shared preference
     */
    suspend fun processUserLoginDetails(
        context: Context,
        it: LoginVerificationResponse
    ): LoginStatus {
        var loginStatus: LoginStatus
        try {

            if (it.responseData?.accessToken == null || it.responseData?.accessToken.equals("null")) {
                loginStatus = LoginStatus.NULL
                return loginStatus
            }


            val accessToken =
                it.responseData?.tokenType + " " + it.responseData?.accessToken

            //1) If isNewCustomer flag is true then trigger SignUpSuccessful event
            if (it.responseData?.isNewCustomer!!) {
                /*sendSignupSuccessfulEvent(
                    context,
                    it.customerId.toString(),
                    it.mobileNo.toString()
                )*/
            }

            /**
             * 2) Trigger login successful
             * send login event events
             * for sign up as well login event is triggered as part of requirement
             * **/
            /*sendLoginSuccessfulEvent(
                context,
                it.mobileNo?.toLong() ?: 0,
                it.customerId.toString()
            )*/

            //3) CleverTap onUserLogin api
            //AppController.getInstance().cleverTapEvent.onUserLoginCleverTap()


            if (it.responseData == null) {
                loginStatus = LoginStatus.NULL
            } else if (accessToken.equals("null", ignoreCase = true)) {
                loginStatus = LoginStatus.INVALID_ACCESS_TOKEN
            } else {
                /*4) set data in shared preference*/

                //for homepage bottom nav, to update data
                SharedPrefManager.getInstance().refreshOrder = true
                SharedPrefManager.getInstance().refreshCrossSelling = true

                //for dynamic discount variant assignment
                SharedPrefManager.getInstance()
                    .setIsLoginSkipped(it.responseData?.skippedLogin ?: false)
                SharedPrefManager.getInstance().setUserAccessToken(accessToken)
                SharedPrefManager.getInstance().setUserMobile(it.responseData?.mobileNo)
                //user info
                SharedPrefManager.getInstance().setUserId(it.responseData?.customerId)
                SharedPrefManager.getInstance().setUserMobile(it.responseData?.mobileNo)
                SharedPrefManager.getInstance().setUserEmail(it.responseData?.emailAddress)
                SharedPrefManager.getInstance().setUserName(it.responseData?.customerName)
                loginStatus = LoginStatus.SUCCESS
            }
        } catch (_: Exception) {
            loginStatus = LoginStatus.EXCEPTION_OCCURRED
        }
        delay(500)
        return loginStatus
    }
}