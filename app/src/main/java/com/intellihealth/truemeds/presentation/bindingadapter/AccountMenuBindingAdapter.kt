package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.WalletBalanceModel
import com.intellihealth.salt.views.cards.WalletCard
import com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel
import com.intellihealth.truemeds.presentation.adapter.AccountTabAdapter
import com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel


@BindingAdapter("setUserNavList", "homeViewModel")
fun setUserNavList(
    view: RecyclerView,
    list: List<AccountTabModel>,
    homeViewModel: AccountTabViewModel
) {
    view.adapter?.run {
        //notify
        if (this is AccountTabAdapter) {
            this.accountItem = list
            this.viewModel = homeViewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = AccountTabAdapter(list, homeViewModel)
    }

}


@BindingAdapter("setWalletBalanceUIData")
fun setWalletBalanceUIData(
    view: WalletCard,
    model: WalletBalanceModel?
) {
    model?.let {
        view.setWalletBalanceData(model)
    }

}
