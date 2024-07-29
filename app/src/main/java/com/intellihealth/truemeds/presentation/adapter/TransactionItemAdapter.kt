package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.AdapterTransactionItemBinding
import com.intellihealth.salt.models.TransactionLineItemModel

class TransactionItemAdapter(private val list:List<TransactionLineItemModel>) :
    RecyclerView.Adapter<TransactionItemAdapter.TransactionItemViewHolder>() {

    private lateinit var binding: AdapterTransactionItemBinding
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TransactionItemViewHolder {
        binding= DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.adapter_transaction_item, parent,false)
        return TransactionItemViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: TransactionItemViewHolder,
        position: Int
    ) {
        with(holder.binding){
            this.transactionData= list[position]
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class TransactionItemViewHolder(binding:AdapterTransactionItemBinding): RecyclerView.ViewHolder(binding.root){
        val binding:AdapterTransactionItemBinding
        init {
            this.binding = binding
        }
    }

}