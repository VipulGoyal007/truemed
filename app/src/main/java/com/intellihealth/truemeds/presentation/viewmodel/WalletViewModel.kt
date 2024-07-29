package com.intellihealth.truemeds.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.intellihealth.salt.models.TransactionLineItemModel
import com.intellihealth.salt.models.WalletBalanceModel
import com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse
import com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred
import com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel
import com.intellihealth.truemeds.data.model.walletandreferral.LedgerItem
import com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse
import com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse
import com.intellihealth.truemeds.data.utils.removeExtraZerosWithValidation
import com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase
import com.intellihealth.truemeds.domain.usecase.TmWalletUseCase
import com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone
import javax.inject.Inject
import kotlin.math.roundToInt

@HiltViewModel
class WalletViewModel@Inject constructor(
    private val walletUseCase: TmWalletUseCase,
    private val helpFaqTncUseCase: HelpFaqTncUseCase
): BaseViewModel() {

//    var loaderValue = MutableLiveData(true)
    val faqById = MutableLiveData<List<FaqCategoryResponse.Payload>?>()
    val transactionList:MutableLiveData<List<TransactionLineItemModel>> = MutableLiveData<List<TransactionLineItemModel>>()
    val walletInfoResponse = MutableLiveData<WalletInfoResponse>()
    val walletTransactionResponse = MutableLiveData<WalletTransactionInfoResponse>()
    val shareCode = MutableLiveData<String?>("")
    var isRewardTransaction = MutableLiveData(false)
    var selectedTimeIntervalFromBottomSheet = MutableLiveData<String>("Recent")
    var pageName:String="WalletActivity"
    var getWalletTransactionsCount = 0

    var walletCardData: MutableLiveData<WalletBalanceModel> = MutableLiveData(
        WalletBalanceModel(
            "Wallet balance: ",
            0.00,
            "Manage your Referrals, Cashbacks and Refunds in one place and quickly pay for your next order."
        )
    )
    var walletCardRewardData: MutableLiveData<WalletBalanceModel> = MutableLiveData(
        WalletBalanceModel(
            "TM Reward balance: ",
            00.00,
            "Manage your Referral earnings and Rewards. Use TM Rewards to save on your next order."
        )
    )

    var walletCardCreditData: MutableLiveData<WalletBalanceModel> = MutableLiveData(
        WalletBalanceModel(
            "TM Credit balance: ",
            00.00,
            "Manage your Refunds and  use them to quickly pay for your next order."
        )
    )

    var timeIntervalBottomSheetData: MutableList<TimeIntervalBottomSheetModel> = mutableListOf(
        TimeIntervalBottomSheetModel("Recent",true),
        TimeIntervalBottomSheetModel("Last 7 Days",false),
        TimeIntervalBottomSheetModel("Last Month",false),
        TimeIntervalBottomSheetModel("This Month",false),
        TimeIntervalBottomSheetModel("Custom Dates",false)
    )
    var mxInternalErrorOccurred=MxInternalErrorOccurred()


    /**
     * This API used to get the wallet info data
     */
    fun getWalletInfo(customerId: String) {
        viewModelScope.launch(Dispatchers.IO) {
            var walletInfoResponseUse = walletUseCase.getWalletInfo(mxInternalErrorOccurred,customerId)
            walletInfoResponseUse?.let { walletInfoResponseUse ->
                walletInfoResponse.postValue(walletInfoResponseUse)
                walletInfoResponseUse.responseData?.let {
                    val numberFormat = CommonFunc.getNumberFormat()
                    var tmWalletAmount :Double = 0.00
                    it.tmWallet?.let { amount-> tmWalletAmount = (amount * 100.0).roundToInt() / 100.0 }
                    walletCardData.postValue(
                        WalletBalanceModel(
                            title = "Wallet balance: ",
                            amount = removeExtraZerosWithValidation(SharedPrefManager.getInstance().tmWallet.toDouble()).toDouble(),
                            "Manage your Referrals, Cashbacks and Refunds in one place and quickly pay for your next order."
                        )
                    )
                }
                walletInfoResponseUse.responseData?.shareText?.let {
                    //referFriendChooserTitle.postValue(walletInfoResponseUse.responseData.shareText)
                }

                loaderValue.postValue(false)

            }

        }
    }

    /**
     *This API will fetch the FAQ list by using the categoryId - Wallet, Reward and Credit
     */
    fun getFaqCategoryWallet() = viewModelScope.launch(Dispatchers.IO) {
        loaderValue.postValue(true)
        val response = helpFaqTncUseCase.getAllFAQCategory(mxInternalErrorOccurred)
        response?.let {
            it.payload?.let { respPayload ->
                if (respPayload.isNotEmpty()) {
                    for (faqCategoryPayloadItem in respPayload) {
                        if (faqCategoryPayloadItem?.name.equals(
                                "TM Wallet",
                                ignoreCase = true
                            )
                        ) {
                            getFaqCategoryById(faqCategoryPayloadItem?.id!!)
                            break
                        }
                    }
                }
            }
            loaderValue.postValue(false)
        }.run {
            loaderValue.postValue(false)
        }
    }
    fun getFaqCategoryReward() = viewModelScope.launch(Dispatchers.IO) {
        //loaderValue.postValue(true)
        val response = helpFaqTncUseCase.getAllFAQCategory(mxInternalErrorOccurred)
        response?.let {
            it.payload?.let { respPayload ->
                if (respPayload.isNotEmpty()) {
                    for (faqCategoryPayloadItem in respPayload) {
                        if (faqCategoryPayloadItem?.name.equals(
                                "TM Rewards",
                                ignoreCase = true
                            )
                        ) {
                            getFaqCategoryById(faqCategoryPayloadItem?.id!!)
                            break
                        }
                    }
                }
            }
        }.run {// loaderValue.postValue(false)
        }
    }
    fun getFaqCategoryCredit() = viewModelScope.launch(Dispatchers.IO) {
        //loaderValue.postValue(true)
        val response = helpFaqTncUseCase.getAllFAQCategory(mxInternalErrorOccurred)
        response?.let {
            it.payload?.let { respPayload ->
                if (respPayload.isNotEmpty()) {
                    for (faqCategoryPayloadItem in respPayload) {
                        if (faqCategoryPayloadItem?.name.equals(
                                "TM Credit",
                                ignoreCase = true
                            )
                        ) {
                            getFaqCategoryById(faqCategoryPayloadItem?.id!!)
                            break
                        }
                    }
                }
            }
        }.run { run { //loaderValue.postValue(false)
        } }
    }

    /**
     * This will first fetch ID for the Refer And Earn and then call the next API to get further details
     */
    private fun getFaqCategoryById(categoryId: Int) = viewModelScope.launch(Dispatchers.IO) {
        viewModelScope.launch(Dispatchers.IO) {
            val faqPayload = helpFaqTncUseCase.getCategoryById(mxInternalErrorOccurred,categoryId)
            faqById.postValue(faqPayload)
            if(pageName.equals("WalletActivity"))
            loaderValue.postValue(false)
        }
    }

    /**
     * This API used to get the wallet transaction data as per the provided from date and to date
     */
    fun getWalletTransactions(customerId: String, fromDate: String, toDate:String) {
        getWalletTransactionsCount++
        loaderValue.postValue(true)
        viewModelScope.launch(Dispatchers.IO) {
            var walletTransactionResponseUse = walletUseCase.getWalletTransactions(mxInternalErrorOccurred,customerId,fromDate,toDate)
            walletTransactionResponseUse?.let {
               // loaderValue.postValue(false)
                walletTransactionResponse.postValue(it)
                it.responseData?.let { responseData->
                    if(isRewardTransaction.value == true) {
                        responseData.tmCash?.let {
                            var tmRewardAmount :Double = 0.00
                            responseData.tmCash.let { amount-> tmRewardAmount = (amount.truemedsCash * 100.0).roundToInt() / 100.0 }
                            walletCardRewardData.postValue(
                                WalletBalanceModel(
                                    "TM Reward balance: ",
                                    tmRewardAmount,
                                    "Manage your Referral earnings and Rewards. Use TM Rewards to save on your next order."
                                )
                            )
                            responseData.tmCash.ledger.let { ledgerItemList->
                                ledgerItemList?.let {
                                    transactionList.postValue(mapToTransactionModelList(ledgerItemList))
                                }
                            }
                        }
                    }else{
                        responseData.tmCredit?.let { tmCreditData->
                            walletCardCreditData.postValue(
                                WalletBalanceModel(
                                    "TM Credit balance: ",
                                    (tmCreditData.truemedsCredit * 100.0).roundToInt() / 100.0,
                                    "Manage your Refunds and  use them to quickly pay for your next order."
                                )
                            )
                            tmCreditData.ledger.let { ledgerItemList->
                                ledgerItemList?.let {
                                    transactionList.postValue(mapToTransactionModelList(ledgerItemList))
                                }
                            }
                        }
                    }
                }
            }
            /*walletTransactionResponseUse?.let { walletTransactionsResponseUse ->
                walletTransactionResponse.postValue(walletTransactionsResponseUse)
                if(isRewardTransaction.value == true) {
                    walletTransactionResponseUse.tmCash?.let {
                        var tmRewardAmount :Double = 0.00
                        it.truemedsCash.let { amount-> tmRewardAmount = (amount * 100.0).roundToInt() / 100.0 }
                        walletCardRewardData.postValue(
                            WalletBalanceModel(
                                "TM Reward balance: ",
                                tmRewardAmount,
                                "Manage your Referral earnings and Rewards. Use TM Rewards to save on your next order."
                            )
                        )
                        it.ledger.let { ledgerItemList->
                            ledgerItemList?.let {
                                transactionList.postValue(mapToTransactionModelList(ledgerItemList))
                            }
                        }
                    }
                }else{
                    walletTransactionResponseUse.tmCredit?.let {
                        walletCardCreditData.postValue(
                            WalletBalanceModel(
                                "TM Credit balance: ",
                                (it.truemedsCredit * 100.0).roundToInt() / 100.0,
                                "Manage your Refunds and  use them to quickly pay for your next order."
                            )
                        )
                        it.ledger.let { ledgerItemList->
                            ledgerItemList?.let {
                                transactionList.postValue(mapToTransactionModelList(ledgerItemList))
                            }
                        }
                    }
                }
            }

             */
            if(walletTransactionResponseUse == null){
                loaderValue.postValue(false)
            }

        }
    }

    private fun mapToTransactionModelList(
        ledgerItem: ArrayList<LedgerItem?>
    ):List<TransactionLineItemModel> {

        var transactionLineItemList: ArrayList<TransactionLineItemModel> = ArrayList()
        ledgerItem.forEach {
            item->
            val transactionItem = TransactionLineItemModel(item?.transaction,item?.transactionDescription,getAmount(item),item?.orderId.toString(),strDateTimeToDate(item?.transactionDate))
            transactionLineItemList.add(transactionItem)
        }
        return transactionLineItemList
    }

    private fun strDateTimeToDate(strDateTime: String?): String? {
        return try {
            val unixSeconds = strDateTime
            // convert seconds to milliseconds
            val date = Date(unixSeconds) //unixSeconds*1000L
            // the format of your date
            val sdf = SimpleDateFormat("dd MMM yyyy")
            // give a timezone reference for formatting (see comment at the bottom)
            sdf.timeZone = TimeZone.getDefault() //java.util.TimeZone.getTimeZone("IST")//GMT-4
            sdf.format(date)
        }catch (e:Exception){
            ""
        }

    }

    private fun getAmount(item: LedgerItem?):Double {
        var formattedAmount = 0.0
        if (item != null) {
            when {
                item.earned > 0 -> {
                    formattedAmount = +item.earned
                }
                item.spent > 0 -> {
                    formattedAmount = -item.spent
                }
                else -> {
                    item.earned
                }
            }
        }
        return formattedAmount
    }

    private fun getTransactionDescription(item: LedgerItem?): String{
        var transactionDescription = ""
        transactionDescription = if(item?.orderId != null && item.orderId > 0){
            "Order ID: ${item.orderId}"
        }else{
            "From "
        }
        return transactionDescription
    }

    fun sendReferAFriendClickedEvent() {
        sdkEventUseCase.sendReferAFriendClickedEvent()
    }

    fun sendTmWalletCreditTransactions(){
        sdkEventUseCase.sendTmWalletCreditTransactions()
    }
    fun sendTmWalletRewardTransactions(){
        sdkEventUseCase.sendTmWalletRewardTransactions()
    }

    fun sendTmWalletViewed(){
        sdkEventUseCase.sendTmWalletViewed()
    }

    fun sendTmWalletBackFirebaseEvent(firebaseEventModel: FirebaseEventModel) {
        sdkEventUseCase.sendTmWalletBackFirebaseEvent(firebaseEventModel)
    }

    fun sendTmWalletFaqFirebaseEvent(firebaseEventModel: FirebaseEventModel) {
        sdkEventUseCase.sendTmWalletFaqFirebaseEvent(firebaseEventModel)
    }

    fun sendTmWalletTransactionFirebaseEvent(
        isRewardTransaction: Boolean,
        firebaseEventModel: FirebaseEventModel
    ) {
        sdkEventUseCase.sendTmWalletTransactionFirebaseEvent(isRewardTransaction, firebaseEventModel)
    }

    fun sendTmWalletTermAndConditionFirebaseEvent(firebaseEventModel: FirebaseEventModel){
        sdkEventUseCase.sendTmWalletTermAndConditionFirebaseEvent(firebaseEventModel)
    }

}