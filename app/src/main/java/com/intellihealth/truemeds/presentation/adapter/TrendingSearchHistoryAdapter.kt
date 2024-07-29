package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.search.TrendingSearchResponse
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.databinding.SearchResultUpdatedUiItemBinding
import com.intellihealth.truemeds.databinding.SearchTrendingUpdatedUiItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel

class TrendingSearchHistoryAdapter(var items: List<TrendingSearchResponse.TrendingSearch>, var viewmodel: SearchViewModel) :
    RecyclerView.Adapter<TrendingSearchHistoryAdapter.MedicineViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val binding: SearchTrendingUpdatedUiItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.search_trending_updated_ui_item, parent, false
        )
        return MedicineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {
        holder.binding.item = items[position]
        holder.binding.viewmodel = viewmodel
        holder.binding.index = position
        ContextCompat.getDrawable(holder.binding.chipName.context,R.drawable.ic_trending_up)
            ?.let { holder.binding.chipName.setIconLeft(it) }
        holder.binding.chipName.setOnClickListener { viewmodel.onClickTrendingItem.postValue(items[position]) }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MedicineViewHolder(binding: SearchTrendingUpdatedUiItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: SearchTrendingUpdatedUiItemBinding

        init {
            this.binding = binding
        }
    }
}