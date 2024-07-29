package com.intellihealth.truemeds.presentation.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.HeaderModel
import com.intellihealth.salt.models.WalletBalanceModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse
import com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.mixpanel.MxOfferSheetViewed
import com.intellihealth.truemeds.data.model.mixpanel.MxReferralScreenViewed
import com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse
import com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse
import com.intellihealth.truemeds.data.utils.isNetworkAvailable
import com.intellihealth.truemeds.domain.enums.ErrorType
import com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase
import com.intellihealth.truemeds.domain.usecase.TmWalletUseCase
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.events.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ReferNEarnViewModel @Inject constructor(
    private val walletUseCase: TmWalletUseCase,
    private val helpFaqTncUseCase: HelpFaqTncUseCase,
    @ApplicationContext
    private val appContext: Context
) : BaseViewModel() {

    //Mutable types
    val referFriendChooserTitle = MutableLiveData<String?>(null)
    val faqById = MutableLiveData<List<FaqCategoryResponse.Payload>?>()
    val referralStatusList = MutableLiveData<List<ReferralStatusResponse.ResponseData?>?>()
    val walletCardData = MutableLiveData<WalletBalanceModel>()
    val walletInfoResponse = MutableLiveData<WalletInfoResponse>()
    val redeemResponse = MutableLiveData<RedeemResponse?>()
    var remindClick = false
    var customerId: String? = null
    val launchMyReferrals = MutableLiveData<Event<Boolean>>()
    var totalRewardsEarning = MutableLiveData(0.0)
    val eventLaunchMyReferrals: LiveData<Event<Boolean>> get() = launchMyReferrals
    var showLoader = MutableLiveData(true)
    var showView = MutableLiveData(true)
    var yetToPlaceOrderMessage = MutableLiveData("")
    var referralCode = MutableLiveData("")
    var alreadyRedeemedLiveData = MutableLiveData(false)
    var alreadyRedeemed = false
    var isRewardClicked = false
    val launchMyReferralsWithWallet = MutableLiveData<Event<Boolean>>()
    val eventLaunchMyReferralsWithWallet: LiveData<Event<Boolean>> get() = launchMyReferralsWithWallet

    //todo on refer failed need to add this @ashish
    private val referFailed = MutableLiveData<Event<Any>>()
    val eventReferFailed: LiveData<Event<Any>> get() = referFailed
    var mxInternalErrorOccurred=MxInternalErrorOccurred()

    fun clickListener() {
        launchMyReferrals.postValue(Event(remindClick))
    }
    /**
     * create mutable objects for UI update
     * **/

    /**
     * API call
     * 1. wallet
     * 2. faq/category
     * 3. faq/id/category -> Pass category_id of Refer and Earn which is received from category API
     * 4. getReferralStatus
     * **/

    /**
     * This API used to get the data which includes referral code, header message and wallet banners
     */
    fun getWalletInfo(customerId: String) {
        viewModelScope.launch(Dispatchers.IO) {
            showLoader.postValue(true)
            showView.postValue(true)
            var walletInfoResponseUse = walletUseCase.getWalletInfo(mxInternalErrorOccurred,customerId)
            walletInfoResponseUse?.let { walletInfoResponseUse ->
                walletInfoResponse.postValue(walletInfoResponseUse)
                alreadyRedeemedLiveData.postValue(
                    walletInfoResponseUse.responseData?.alreadyRedeemed ?: false
                )
                alreadyRedeemed = walletInfoResponseUse.responseData?.alreadyRedeemed ?: false
                walletInfoResponseUse.responseData?.totalRewardsEarning?.let {
                    walletCardData.postValue(
                        WalletBalanceModel(
                            appContext.getString(R.string.tm_rewards),
                            walletInfoResponseUse.responseData.totalRewardsEarning,
                            walletInfoResponseUse.responseData.successfulReferralCountMessage,"tm_referral"
                        )
                    )
                    totalRewardsEarning.postValue(walletInfoResponseUse.responseData.totalRewardsEarning)
                    if (walletInfoResponseUse.responseData.yetToPlaceOrder != null){
                        yetToPlaceOrderMessage.postValue(walletInfoResponseUse.responseData.yetToPlaceOrder)
                    }
                    if ((walletInfoResponseUse.responseData.referralCode?.length ?: 0) > 4) {
                        referralCode.postValue(
                            walletInfoResponseUse.responseData.referralCode?.substring(
                                4
                            )
                        )
                    } else {
                        referralCode.postValue(walletInfoResponseUse.responseData.referralCode)
                    }
                }
                walletInfoResponseUse.responseData?.shareText?.let {
                    referFriendChooserTitle.postValue(walletInfoResponseUse.responseData.shareText)
                }

                loaderValue.postValue(false)

            }

        }
    }

    /**
     *This API will fetch the FAQ list by using the categoryId
     */
    fun getFaqCategory() = viewModelScope.launch(Dispatchers.IO) {
        val response = helpFaqTncUseCase.getAllFAQCategory(mxInternalErrorOccurred)
        response?.let {
            it.payload?.let { respPayload ->
                if (respPayload.isNotEmpty()) {
                    for (faqCategoryPayloadItem in respPayload) {
                        if (faqCategoryPayloadItem?.name.equals(
                                "Refer And Earn",
                                ignoreCase = true
                            )
                        ) {
                            getFaqCategoryById(faqCategoryPayloadItem?.id!!)
                            break
                        }
                    }
                }else{
                    showLoader.postValue(false)
                    showView.postValue(false)
                }
            }
        }
        showLoader.postValue(false)
        showView.postValue(false)
    }

    /**
     * This will first fetch ID for the Refer And Earn and then call the next API to get further details
     */
    private fun getFaqCategoryById(categoryId: Int) = viewModelScope.launch(Dispatchers.IO) {
        viewModelScope.launch(Dispatchers.IO) {
            val faqPayload = helpFaqTncUseCase.getCategoryById(mxInternalErrorOccurred,categoryId)
            faqById.postValue(faqPayload)
            showLoader.postValue(false)
            showView.postValue(false)
        }
    }

    /**
     * This API will fetch the data related to referral list
     */
    fun getReferralStatus(
        customerId: String,
        isNotified: Boolean
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            showLoader.postValue(true)
            showView.postValue(true)
            val response = walletUseCase.getReferralStatus(
                mxInternalErrorOccurred,customerId,
                isNotified
            )
            referralStatusList.postValue(response?.responseData)
            showLoader.postValue(false)
            showView.postValue(false)
        }
    }

    /**
     * This API is used to to redeem the code from Refer And Earn screen
     */
    fun redeemReferralCode(
        context: Context,
        customerId: String?,
        mobileNumber: String,
        referralId: String
    ) {
        if (isNetworkAvailable(context)) {
            viewModelScope.launch(Dispatchers.IO) {
                showLoader.postValue(true)
                showView.postValue(false)
                val redeemResponseUse = walletUseCase.redeemReferralCode(
                    mxInternalErrorOccurred,mobileNumber,
                    referralId
                )

                redeemResponse.postValue(redeemResponseUse)
                showLoader.postValue(false)
            }
        } else {
            openErrorDialog.postValue(Event(ErrorType.NO_NETWORK))
        }
    }


    /**
     * This are the Referral Working Step's
     */
    fun getReferralWorkingStep(): HeaderModel {
        return walletUseCase.getReferralWorkingStep()
    }

    fun setEventReferralScreenViewed(isBottomNav: Boolean){

        var whId= SharedPrefManager.getInstance().selectedWarehouseID

        var mixPanelData= MxReferralScreenViewed(isBottomNav,whId)


        sdkEventUseCase.sendReferralScreenViewedEvent(mixPanelData)
    }

    fun sendReferAFriendClickedEvent()
    {
        sdkEventUseCase.sendReferAFriendClickedEvent()
    }

}