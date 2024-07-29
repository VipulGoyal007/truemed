package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.subs.SubsMedModel
import com.intellihealth.truemeds.databinding.SubsMedItemBinding

class SubsMedAdapter(val subMedList: List<SubsMedModel>) :
    RecyclerView.Adapter<SubsMedAdapter.ItemViewHolder>() {

    private lateinit var binding: SubsMedItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.subs_med_item,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int = subMedList.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        var model = subMedList[position]
        binding.imIcon.setImageResource(model.image)
        binding.tvTitle.text = model.title
    }

    class ItemViewHolder(binding: SubsMedItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: SubsMedItemBinding

        init {
            this.binding = binding
        }
    }
}