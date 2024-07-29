package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.databinding.SearchResultUpdatedUiItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel

class RecentSearchHistoryAdapter(var items: List<RecentMedicine>, var viewmodel: SearchViewModel) :
    RecyclerView.Adapter<RecentSearchHistoryAdapter.MedicineViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val binding: SearchResultUpdatedUiItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.search_result_updated_ui_item, parent, false
        )
        return MedicineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {
        holder.binding.item = items[position]
        holder.binding.viewmodel = viewmodel
        holder.binding.index = position
        ContextCompat.getDrawable(holder.binding.chipName.context,R.drawable.ic_recently_searched_result)
            ?.let { holder.binding.chipName.setIconLeft(it) }
        holder.binding.chipName.setOnClickListener {
            viewmodel.suggestion_term_clicked_position=position
            viewmodel.onClickRecentItem.postValue(items[position]) }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MedicineViewHolder(binding: SearchResultUpdatedUiItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: SearchResultUpdatedUiItemBinding

        init {
            this.binding = binding
        }
    }
}