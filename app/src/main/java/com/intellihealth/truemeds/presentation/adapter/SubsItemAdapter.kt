package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.subs.SubsModel
import com.intellihealth.truemeds.databinding.SubsItemBinding

class SubsItemAdapter(val subList: List<SubsModel>) :
    RecyclerView.Adapter<SubsItemAdapter.ItemViewHolder>() {

    private lateinit var binding: SubsItemBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.subs_item,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val model = subList[position]
        binding.imIcon.setImageResource(model.image)
        binding.tvTitle.text = model.title
        binding.tvDescription.text = model.description

    }

    override fun getItemCount(): Int = subList.size

    class ItemViewHolder(binding: SubsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: SubsItemBinding

        init {
            this.binding = binding
        }
    }
}