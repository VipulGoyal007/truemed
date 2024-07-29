package com.intellihealth.truemeds.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.HomeAdapterItemBinding

class HomePageAdapter(
    val context: Context,
    val list: ArrayList<String> = ArrayList()
) : RecyclerView.Adapter<HomePageAdapter.ItemViewHolder>() {

    private lateinit var binding: HomeAdapterItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.home_adapter_item,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
      holder.binding.txTextView.text = list[position]
    }

    override fun getItemCount(): Int = list.size

    class ItemViewHolder(binding: HomeAdapterItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: HomeAdapterItemBinding
        init { this.binding = binding }
    }
}