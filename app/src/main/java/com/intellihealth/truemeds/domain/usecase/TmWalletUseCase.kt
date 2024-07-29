package com.intellihealth.truemeds.domain.usecase

import android.content.Context
import androidx.core.content.ContextCompat
import com.intellihealth.salt.models.ChildItemModel
import com.intellihealth.salt.models.HeaderModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse
import com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse
import com.intellihealth.truemeds.data.utils.Resource
import com.intellihealth.truemeds.data.utils.ResponseData
import com.intellihealth.truemeds.domain.repository.TmWalletRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.ResponseBody
import javax.inject.Inject

class TmWalletUseCase @Inject constructor(
    private val walletRepository: TmWalletRepository,
    @ApplicationContext
    private val appContext: Context
) {
    suspend fun redeemReferralCode(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        mobile: String,
        referId: String
    ): RedeemResponse? {
        var response: RedeemResponse? = null
        when (val redeemResponse =
            walletRepository.redeemReferralCode(mxInternalErrorOccurred, mobile, referId)) {
            is Resource.Success -> {
//                todo when already claim backend returns 500
                try {
                    redeemResponse.let {

                        response = it.value?.body()!!
                    }
                } catch (e: Exception) {

                }
            }

            is Resource.Failure -> {
                redeemResponse.errorCode?.let {
                    redeemResponse.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            redeemResponse.errorCode,
                            resErrorBody, redeemResponse.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return response
    }


    suspend fun getReferralStatus(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        isNotified: Boolean
    ): ReferralStatusResponse? {
        var response: ReferralStatusResponse? = null
        when (val res = walletRepository.getReferralStatus(mxInternalErrorOccurred, customerId = customerId, isNotified)) {
            is Resource.Success -> {
                res.value?.let {
                    if (it.body() != null)
                        response = it.body()!!
                }
            }

            is Resource.Failure -> {
                res.errorCode?.let {
                    res.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            res.errorCode,
                            resErrorBody, res.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return response
    }

    suspend fun getWalletInfo(
        mxInternalErrorOccurred: MxInternalErrorOccurred,customerId: String): WalletInfoResponse? {
        var response: WalletInfoResponse? = null
        when (val res = walletRepository.getWallet(mxInternalErrorOccurred, customerId = customerId)) {
            is Resource.Success -> {
                res.value?.let {
                    response = it.body()
                }
            }

            is Resource.Failure -> {
                res.errorCode?.let {
                    res.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            res.errorCode,
                            resErrorBody, res.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return response
    }

    suspend fun getWalletTransactions(
        mxInternalErrorOccurred: MxInternalErrorOccurred,
        customerId: String,
        fromDate: String,
        toDate: String
    ): WalletTransactionInfoResponse? {
        var response: WalletTransactionInfoResponse? = null
        when (val res = walletRepository.getWalletInfo(
            mxInternalErrorOccurred,
            customerId = customerId,
            fromDate = fromDate,
            toDate = toDate
        )) {
            is Resource.Success -> {
                res.value?.let {
                    response = it.body()!!
                }
            }

            is Resource.Failure -> {
                res.errorCode?.let {
                    res.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            res.errorCode,
                            resErrorBody, res.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return response
    }

    /*suspend fun getWallet(customerId: String): WalletInfoResponse? {
        var response: WalletInfoResponse? = null
        when (val res = walletRepository.getWallet(customerId = customerId)) {
            is Resource.Success -> {
                res.value?.let {
                    response = it.body()!!
                }
            }

            is Resource.Failure -> {
                res.errorCode?.let {
                    res.errorBody?.let { resErrorBody ->
                        setErrorResponseBody(
                            res.errorCode,
                            resErrorBody, res.isNetworkError
                        )
                    }
                }
            }

            else -> {

            }
        }
        return response
    }*/

    private suspend fun setErrorResponseBody(
        errorCode: Int,
        errorBody: ResponseBody,
        isNetworkError: Boolean
    ): ResponseData {
        return ResponseData(errorCode, errorBody, isNetworkError)
    }

    fun getReferralWorkingStep(): HeaderModel {
        val childList = listOf<ChildItemModel>(
            ChildItemModel(
                childItemImageDrawable = ContextCompat.getDrawable(
                    appContext,
                    R.drawable.instruction_accordion_step_one
                ),
                childItemTitle = "Step 1",
                childItemSubTitle = "Invite your friends to join truemeds using your referral code",
            ),
            ChildItemModel(
                childItemImageDrawable = ContextCompat.getDrawable(
                    appContext,
                    R.drawable.instruction_accordion_step_two
                ),
                childItemTitle = "Step 2",
                childItemSubTitle = "They receive ₹200 in their TM rewards on successful registration",
            ),
            ChildItemModel(
                childItemImageDrawable = ContextCompat.getDrawable(
                    appContext,
                    R.drawable.instruction_accordion_step_three
                ),
                childItemTitle = "Step 3",
                childItemSubTitle = "You will earn ₹200 in your TM Rewards after their first order worth more than ₹500 is delivered",
            ),
        )

        return HeaderModel("How referral works", childList)
    }

}