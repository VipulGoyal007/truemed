package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel
import com.intellihealth.truemeds.databinding.ItemTabAccountBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel

class AccountTabAdapter(
    var accountItem: List<AccountTabModel?>,
    var viewModel: AccountTabViewModel

) : RecyclerView.Adapter<AccountTabAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding: ItemTabAccountBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_tab_account,
            parent, false
        )

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return accountItem.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modelItem = accountItem[position]
        holder.binding.viewModel = viewModel

        if (SharedPrefManager.getInstance().loggedInUserAccessToken.isNotEmpty()
            && modelItem?.showWalletAmount == true
            && !viewModel.tmWalletData.value.isNullOrBlank()
        ) {
            holder.binding.tvWalletAmt.visibility = View.VISIBLE
           // holder.binding.tvWalletAmt.text = roundOffDecimal(SharedPrefManager.getInstance().tmWallet)
            holder.binding.tvWalletAmt.text = "₹ ${viewModel.tmWalletData.value}"
        } else {
            holder.binding.tvWalletAmt.visibility = View.GONE
        }

        holder.binding.tvTitle.text = modelItem?.menuName
        holder.binding.icon.background = modelItem?.drawable

        holder.binding.clAccountTabLayout.setOnClickListener {

            viewModel.openAccountTabItem(modelItem?.menuName!!, position)
        }
    }

    class ViewHolder(binding: ItemTabAccountBinding) : RecyclerView.ViewHolder(binding.root) {

        val binding: ItemTabAccountBinding

        init {
            this.binding = binding
        }

    }
}