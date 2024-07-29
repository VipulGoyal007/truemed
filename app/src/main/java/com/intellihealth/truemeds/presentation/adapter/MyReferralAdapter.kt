package com.intellihealth.truemeds.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.ReferralStageCallback
import com.intellihealth.salt.models.ReferralStageModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.HomeAdapterItemBinding
import com.intellihealth.truemeds.databinding.ReminderItemBinding

class MyReferralAdapter(
    private val referralStageCallbackOuter: ReferralStageCallback?,
    private val list: ArrayList<ReferralStageModel> = ArrayList()
) : RecyclerView.Adapter<MyReferralAdapter.ItemViewHolder>() {

    private lateinit var binding: ReminderItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.reminder_item,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.referralStageData = list[position]
        holder.binding.referralCallback = referralStageCallbackOuter
    }

    override fun getItemCount(): Int = list.size

    class ItemViewHolder(var binding: ReminderItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        val binding: ReminderItemBinding
//        init { this.binding = binding }
    }
}