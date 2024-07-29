package com.intellihealth.truemeds.domain.usecase

import android.annotation.SuppressLint
import android.content.Context
import android.util.Base64
import android.util.Log
import android.util.Patterns
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.intellihealth.truemeds.BuildConfig
import com.intellihealth.truemeds.data.model.home.ApiCoreResponse
import com.intellihealth.truemeds.data.model.home.SaveVariantInfoRequest
import com.intellihealth.truemeds.data.model.login.DefaultTokenResponse
import com.intellihealth.truemeds.data.model.login.InputValidationResult
import com.intellihealth.truemeds.data.model.login.LoginVerificationResponse
import com.intellihealth.truemeds.data.model.login.MobileOtpRequest
import com.intellihealth.truemeds.data.model.login.SendMobileOtpResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.repository.datasource.local.entity.CustomerDetails
import com.intellihealth.truemeds.data.utils.ERRORS
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.domain.enums.LoginStatus
import com.intellihealth.truemeds.domain.enums.UserCategoryEnum
import com.intellihealth.truemeds.domain.enums.UserCategoryServerEnum
import com.intellihealth.truemeds.domain.repository.LoginRepository
import com.intellihealth.truemeds.domain.usecase.analytics.SdkEventUseCase
import com.intellihealth.truemeds.presentation.model.ProcessUserLoginResult
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.DateFormats
import com.intellihealth.truemeds.presentation.utils.LoginUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


class LoginUseCase @Inject constructor(
    private val loginRepository: LoginRepository,
    private val sdkEventUseCase: SdkEventUseCase,
    private val localDbUseCase: LocalDbUseCase,
    private val userDataUseCase: UserDataUseCase,
    private val walletUseCase: TmWalletUseCase
) {
    /**
     * 1) Get TrueCaller token from trueCaller's api by passing authorizationCode
     * which trueCaller returns on successful login from trueCaller login bottom sheet
     * Get session token from our server. This require passing firebase id to service.
     * 2) If app is unable to get firebase id, then get firebase default token from our service,
     * else go to step 3 to generate session token.
     * 3) Get Session token
     * 4) Get User details from our service by passing trueCaller's token and session token which we generated in step 3
     * This will return null if user details not received from service
     */
    var userDetailsResponse: LoginVerificationResponse? = null

    @SuppressLint("SimpleDateFormat")
    suspend fun getTrueCallerUserDetails(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String,
        ipFirebaseId: String,
        aaId: String,
        context: Context,
        clickedOnPage: String,
        fillType: String
    ): LoginStatus {
        //var aaid: String
        var status = LoginStatus.NULL
        val firebaseId: String
        var userDetailsResponse: LoginVerificationResponse? = null

        //1) get tc token from trueCaller server
        val tcToken: String = getTrueCallerToken(
            mxInternalErrorOccurred,
            textAuthorizationCode, clientId, authorizationCode, codeVerifier
        )

        if (tcToken.isNotEmpty()) {
            firebaseId = ipFirebaseId

            //3) Get Session token
            val sessionToken = getSessionToken(mxInternalErrorOccurred, firebaseId)

            //4) Get User details from our service
            if (sessionToken.isNotEmpty()) {
                userDetailsResponse = verifyTrueCallerToken(
                    mxInternalErrorOccurred,
                    tcToken,
                    firebaseId,
                    aaId,
                    sessionToken
                )
            }

            //5) Process Response
            if (userDetailsResponse != null) {
                Log.d("TAG", "verifyMobileOtp: $userDetailsResponse")
                if (userDetailsResponse.message?.lowercase()
                        ?.contains("invalid")!! || userDetailsResponse.message?.lowercase()
                        .equals("somethings went wrong! please try again later !")
                ) {
                    status = LoginStatus.NULL
                } else {
                    status =
                        processUserToLogin(
                            context,
                            userDetailsResponse,
                            clickedOnPage,
                            "truecaller"
                        )

                    if (status == LoginStatus.SUCCESS) {
                        sdkEventUseCase.onUserLoginCleverTap()
                        //setup user variants
                        userDataUseCase.setVariantInfo(
                            getSessionToken(
                                mxInternalErrorOccurred,
                                SharedPrefManager.getInstance().fcm
                            ), mxInternalErrorOccurred
                        )
                        userDataUseCase.getCustomerCategoryDetails(MxInternalErrorOccurred())
                        updatePlatformVariantInfo(mxInternalErrorOccurred)

                        if ((SharedPrefManager.getInstance().referryId ?: "").isNotEmpty())
                            walletUseCase.redeemReferralCode(mxInternalErrorOccurred,
                                SharedPrefManager.getInstance().loggedInUserMobile,
                                SharedPrefManager.getInstance().referryId
                            )

                        val customerDeliveryChargeResponse =
                            userDataUseCase.getCustomerDeliveryCharge(
                                MxInternalErrorOccurred(), SharedPrefManager.getInstance().loggedInUserId.toLong()
                            )
                        if (customerDeliveryChargeResponse != null)
                            userDataUseCase.saveDeliveryChargeAndBaseDiscount(
                                customerDeliveryChargeResponse
                            )

                        withContext(Dispatchers.IO) {
                            addCustomerDetailData(userDetailsResponse.responseData)
                        }

                    }
                }
            }
        }

        return status
    }

    fun getUserDetailResponse(): LoginVerificationResponse {
        return userDetailsResponse ?: LoginVerificationResponse()
    }


    /**
     * Get TrueCaller token from trueCaller's api by passing authorizationCode
     * which trueCaller returns on successful login from trueCaller login bottom sheet
     */
    private suspend fun getTrueCallerToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        textAuthorizationCode: String,
        clientId: String,
        authorizationCode: String,
        codeVerifier: String
    ): String {
        return when (val res = loginRepository.getTrueCallerToken(
            mxInternalErrorOccurred,
            textAuthorizationCode,
            clientId,
            authorizationCode,
            codeVerifier
        )) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value?.body()?.access_token.toString() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                ""}
            is Resource.Failure -> ""
            else -> ""
        }
    }

    /**
     * If app is unable to get firebase id, then get firebase default token from our service
     */
    private suspend fun fetchDefaultToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred, base64Encoding: String
    ): DefaultTokenResponse? {
        return when (val res =
            loginRepository.fetchDefaultToken(mxInternalErrorOccurred, base64Encoding)) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }
    }

    /**
     * Get Session token
     */
    @SuppressLint("SimpleDateFormat")
    suspend fun getSessionToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred, ipFirebaseId: String
    ): String {
        var firebaseId = ipFirebaseId
        var defaultTokenResponse: DefaultTokenResponse? = null
        if (firebaseId == "") {
            //2) get firebase default token from our service
            val simpleDate = SimpleDateFormat(DateFormats.YYYY_MM_DD_HH_MM_SS)
            val stringForBase64 =
                "TM_ANDROID_V" + BuildConfig.VERSION_NAME + "-" + simpleDate.format(Date())

            Log.d("getSessionToken: ", stringForBase64)
            defaultTokenResponse = fetchDefaultToken(
                mxInternalErrorOccurred, Base64.encodeToString(
                    stringForBase64.toByteArray(),
                    Base64.DEFAULT or Base64.NO_WRAP
                )
            )

            firebaseId = defaultTokenResponse?.responseData?.token ?: ""
        }

        return when (val res =
            loginRepository.getSessionToken(mxInternalErrorOccurred, JsonObject().also { obj ->
                obj.addProperty("token", firebaseId)
                obj.addProperty("client", "TM_ANDROID_V" + BuildConfig.VERSION_NAME)
            })) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body()?.responseData?.token.toString() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                ""}
            is Resource.Failure -> ""
            else -> ""
        }
    }

    /**
     * send mobile otp
     * 1) If app is unable to get firebase id, then get firebase default token from our service,
     * 2) Get session token.
     * 3) Call API to generate OTP by passing Mobile Number and session token generated in step 2
     * **/
    suspend fun sendMobileOtp(
        mxInternalErrorOccurred: MxInternalErrorOccurred, ipFirebaseId: String, mobileNum: String
    ): SendMobileOtpResponse? {
        try {
            val firebaseId = ipFirebaseId

            //2) Get Session token
            val sessionToken = getSessionToken(mxInternalErrorOccurred, firebaseId)

            //3) Call API to generate OTP by passing Mobile Number and session token generated in step 2
            return when (val res =
                loginRepository.sendMobileOtp(
                    mxInternalErrorOccurred,
                    MobileOtpRequest(
                        mobileNum = mobileNum,
                        sessionToken = sessionToken
                    )
                )) {
                is Resource.Success -> {
                    if (res.value?.isSuccessful == true) {
                        res.value.body()
                    } else {
                        try {
                            val sendMobileOtpResponse = Gson().fromJson(
                                res.value?.errorBody()?.string(),
                                SendMobileOtpResponse::class.java
                            )
                            sendMobileOtpResponse.isSuccess = false

                            try {
                                mxInternalErrorOccurred.errorCode = res.value?.code()
                                mxInternalErrorOccurred.errorStatement = sendMobileOtpResponse.message
                                sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                            } catch (_: Exception) {
                            }

                            sendMobileOtpResponse
                        } catch (_: Exception) {
                            return SendMobileOtpResponse(
                                res.value?.message(),
                                "",
                                res.value?.code() ?: 0,
                                false,
                                null
                            )
                        }


                    }
                }

                is Resource.Failure -> null
                else -> null
            }
        } catch (e: Exception) {
            Log.e("Login", "Exception : " + e.message)
            return null
        }
    }


    /**
     * Get User details from our service by passing trueCaller's token and session token
     */
    private suspend fun verifyTrueCallerToken(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        tcToken: String, firebaseID: String,
        aaId: String,
        sessionToken: String
    ): LoginVerificationResponse? {
        return when (val res = loginRepository.verifyTrueCallerToken(
            mxInternalErrorOccurred, tcToken,
            firebaseID,
            SharedPrefManager.getInstance().isLoginSkipped,
            false,
            CommonFunc.getSourceVersionName(),
            aaId,
            sessionToken
        )) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }
    }


    /**
     * Below method is to check phone number validation
     * case 1: It is not empty
     * case 2: It should start with 6,7,8,9
     * case 3: It should be for exact 10 digits
     * **/
    fun checkPhoneNumber(phoneNumberStr: String): InputValidationResult {
        val inputValidationResult = InputValidationResult(true, ERRORS.NO_ERROR)
        return when {
            (phoneNumberStr.trim().isEmpty() || !checkPhoneNumberStartWithCorrectNo(phoneNumberStr)
                    || phoneNumberStr.trim().length < 10) -> {
                inputValidationResult.isValid = false
                inputValidationResult.errorMessage = ERRORS.INVALID_PHONE_NUMBER
                inputValidationResult
            }

            else -> inputValidationResult
        }
    }

    fun checkEmailId(emailIdAddress: String?): InputValidationResult {
        val inputValidationResult = InputValidationResult(true, ERRORS.NO_ERROR)
       return emailIdAddress?.let {
             when {
                (emailIdAddress.trim().isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(emailIdAddress).matches()) -> {
                    inputValidationResult.isValid = false
                    inputValidationResult.errorMessage = ERRORS.INVALID_EMAIL_ID
                    inputValidationResult
                }

                else -> inputValidationResult
            }
        }?: kotlin.run {
           inputValidationResult.isValid = false
           inputValidationResult.errorMessage = ERRORS.INVALID_EMAIL_ID
           inputValidationResult
        }
    }


    // Below method is used to check that phone number starts with 6,7,8,9  or not
    private fun checkPhoneNumberStartWithCorrectNo(phoneNumberStr: String): Boolean {
        var result = false
        val startWithPattern = "6789"

        for (element in startWithPattern) {
            if (phoneNumberStr.startsWith(element)) {
                result = true
                break
            }
        }
        return result
    }


    /**
     * Below method is to check otp validation
     * case 1: It is not empty
     * case 2: It should be for exact 4 digits
     * **/
    fun otpInputValidation(otpStr: String): InputValidationResult {
        val inputValidationResult = InputValidationResult(true, ERRORS.NO_ERROR)
        return when {
            (otpStr.trim().isEmpty()
                    || otpStr.trim().length < 3) -> {
                inputValidationResult.isValid = false
                inputValidationResult.errorMessage = ERRORS.INVALID_OTP
                inputValidationResult
            }

            else -> inputValidationResult
        }
    }

    /**
     * verify mobile otp
     * **/
    suspend fun verifyMobileOtp(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        mobileNo: String?,
        otp: String?,
        deviceKey: String?,
        isIos: Boolean?,
        aaid: String?,
        source: String?,
        context: Context,
        fillType: String,
        clickedOnPage: String
    ): ProcessUserLoginResult {
        var result = ProcessUserLoginResult(LoginStatus.NULL)
        val response = when (val res =
            loginRepository.verifyOtp(
                mxInternalErrorOccurred,
                mobileNo = mobileNo,
                otp = otp,
                deviceKey = deviceKey,
                isIos = isIos,
                aaid = aaid,
                source = source,
                SharedPrefManager.getInstance().isLoginSkipped
            )) {
            is Resource.Success -> if(res.value?.isSuccessful==true) res.value.body() else {
                try {
                    mxInternalErrorOccurred.errorCode = res.value?.code()
                    mxInternalErrorOccurred.errorStatement = Gson().fromJson(
                        res.value?.errorBody()?.string(),
                        ApiCoreResponse::class.java
                    ).message
                    sdkEventUseCase.sendInternalErrorOccurred(mxInternalErrorOccurred)
                } catch (_: Exception) {
                }
                null
            }
            is Resource.Failure -> null
            else -> null
        }
        if (response != null) {
            if (response.statusCode != 200) {
                result = ProcessUserLoginResult(LoginStatus.NULL, response.message ?: "")
            } else {
                if (response.statusValue == "BAD_REQUEST") {
                    result = ProcessUserLoginResult(LoginStatus.INVALID_OTP, response.message ?: "")
                } else {
                    //event integration for login or signupp
                    //val autoFillData="keyboard_typed"   // TODO - value will be "autofilled" or "keyboard_typed"
                    //sdkEventUseCase.sendSignUporLoginSuccessfulEvent(response,clickedOnPage,fillType)

                    var status = processUserToLogin(context, response, clickedOnPage, fillType)
                    result = ProcessUserLoginResult(status, response.message ?: "")
                    if (status == LoginStatus.SUCCESS) {
                        sdkEventUseCase.onUserLoginCleverTap()
                        //setup user variants
                        userDataUseCase.setVariantInfo(
                            getSessionToken(
                                mxInternalErrorOccurred,
                                SharedPrefManager.getInstance().fcm
                            ), mxInternalErrorOccurred
                        )
                        userDataUseCase.getCustomerCategoryDetails(MxInternalErrorOccurred())
                        updatePlatformVariantInfo(mxInternalErrorOccurred)

                        if ((SharedPrefManager.getInstance().referryId ?: "").isNotEmpty())
                            walletUseCase.redeemReferralCode(mxInternalErrorOccurred,
                                SharedPrefManager.getInstance().loggedInUserMobile,
                                SharedPrefManager.getInstance().referryId
                            )

                        val customerDeliveryChargeResponse =
                            userDataUseCase.getCustomerDeliveryCharge(
                                MxInternalErrorOccurred(), SharedPrefManager.getInstance().loggedInUserId.toLong()
                            )
                        if (customerDeliveryChargeResponse != null)
                            userDataUseCase.saveDeliveryChargeAndBaseDiscount(
                                customerDeliveryChargeResponse
                            )

                        withContext(Dispatchers.IO) {
                            addCustomerDetailData(response.responseData)
                        }
                    }
                }
            }
        }
        return result
    }

    private suspend fun updatePlatformVariantInfo(mxInternalErrorOccurred: MxInternalErrorOccurred) {
        val sessionToken = getSessionToken(
            mxInternalErrorOccurred,
            SharedPrefManager.getInstance().fcm
        ) // session token collection

        val experimentMappings: ArrayList<SaveVariantInfoRequest.ExperimentMapping> = arrayListOf()
        experimentMappings.add(SaveVariantInfoRequest.ExperimentMapping(UserCategoryServerEnum.GENERIC_CAP_DISCOUNT.apiCategoryType,
            localDbUseCase.getCustomerCategory(UserCategoryServerEnum.GENERIC_CAP_DISCOUNT.apiCategoryType)))
        val saveVariantInfoRequest = SaveVariantInfoRequest(
            sessionToken = sessionToken,
            experimentMapping = experimentMappings
        )
        userDataUseCase.updateVariantInfo(
            saveVariantInfoRequest,
            mxInternalErrorOccurred
        )
    }

    private suspend fun processUserToLogin(
        context: Context,
        userDetails: LoginVerificationResponse,
        clickedOnPage: String,
        fillType: String
    ): LoginStatus {
        sdkEventUseCase.sendSignUporLoginSuccessfulEvent(userDetails, clickedOnPage, fillType)
        return LoginUtil.processUserLoginDetails(context, userDetails)
    }

    /**
     * This method will initiate all SDK events for mobile number
     */
    /*fun mobileNumberScreenViewed(
        mxLoginPageViewed: MxLoginPageViewed,
        bundle: Bundle,
        afLoginPageViewed: AFLoginPageViewed
    ) {
        mixPanelEventUseCase.sendLoginPageViewed(mxLoginPageViewed)
        firebaseEventUseCase.registrationScreen(bundle)
        appsFlyerEventUseCase.sendLoginPageViewed(
            AppsFlyerEvent.convertJsonToHashmap(
                Gson().toJson(
                    afLoginPageViewed
                )
            )
        )
    }*/

    private suspend fun addCustomerDetailData(
        it: LoginVerificationResponse.ResponseData?
    ) {
        val customerDetails = CustomerDetails(
            it?.customerId!!.toLong(),
            it.mobileNo,
            it.emailAddress,
            "",
            it.customerName,
            "",
            "",
            0,
            ""
        )

        customerDetails.let { it1 -> localDbUseCase.addCustomerDetails(it1) }
    }

//    suspend fun isAutoReplace(medicineName: String): Int {
//        return localDbUseCase.isAutoReplace(medicineName)
//    }
//    suspend fun insertCartReplaceStatus(cartReplaceStatus: CartReplaceStatus) {
//        return localDbUseCase.insertCartReplaceStatus(cartReplaceStatus)
//    }
}