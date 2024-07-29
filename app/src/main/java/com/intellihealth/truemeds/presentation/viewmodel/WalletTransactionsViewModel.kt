package com.intellihealth.truemeds.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.intellihealth.salt.models.WalletBalanceModel
import com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel

class WalletTransactionsViewModel: BaseViewModel() {
    var walletCardRewardData: MutableLiveData<WalletBalanceModel> = MutableLiveData(
        WalletBalanceModel(
            "TM Reward balance: ",
            200.00,
            "Manage your Referral earnings and Rewards. Use TM Rewards to save on your next order."
        )
    )

    var walletCardCreditData: MutableLiveData<WalletBalanceModel> = MutableLiveData(
        WalletBalanceModel(
            "TM Credit balance: ",
            4800.00,
            "Manage your Refunds and  use them to quickly pay for your next order."
        )
    )

    var timeIntervalBottomSheetData: MutableList<TimeIntervalBottomSheetModel> = mutableListOf(
        TimeIntervalBottomSheetModel("Recent",false),
        TimeIntervalBottomSheetModel("Last 7 Days",true),
        TimeIntervalBottomSheetModel("Last Month",false),
        TimeIntervalBottomSheetModel("This Month",false),
        TimeIntervalBottomSheetModel("Custom Dates",false))

}