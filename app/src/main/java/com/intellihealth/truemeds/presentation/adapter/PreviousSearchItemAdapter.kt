package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine
import com.intellihealth.truemeds.databinding.SearchPreviousViewedItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel

class PreviousSearchItemAdapter(var items: List<RecentMedicine>, var viewmodel: SearchViewModel) :
    RecyclerView.Adapter<PreviousSearchItemAdapter.MedicineViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val binding: SearchPreviousViewedItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.search_previous_viewed_item, parent, false
        )
        return MedicineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {
        holder.binding.item = items[position]
        holder.binding.viewmodel = viewmodel
        holder.binding.index = position
        holder.binding.cardCrossSellingMedParent.setOnClickListener { viewmodel.onClickPreviousItem.postValue(items[position]) }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MedicineViewHolder(binding: SearchPreviousViewedItemBinding) :
        RecyclerView.ViewHolder(binding.getRoot()) {
        var binding: SearchPreviousViewedItemBinding

        init {
            this.binding = binding
        }
    }
}