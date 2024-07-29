package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.AdapterFooterItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel

class FooterDataAdapter(val homeViewModel: HomeViewModel) : RecyclerView.Adapter<FooterDataAdapter.ItemViewHolder>() {

    private lateinit var binding: AdapterFooterItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_footer_item,
            parent, false
        )



        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        binding.viewModel = homeViewModel
    }

    override fun getItemCount(): Int = 1

    class ItemViewHolder(binding: AdapterFooterItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterFooterItemBinding
        init { this.binding = binding }
    }
}