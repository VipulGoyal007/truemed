package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetReplaceAllCompanyItemBinding

class ReplaceAllCompanyBottomSheetAdapter(
    var items: List<String>?,
) :
    RecyclerView.Adapter<ReplaceAllCompanyBottomSheetAdapter.MedicineViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val binding: BottomsheetReplaceAllCompanyItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.bottomsheet_replace_all_company_item, parent, false
        )
        return MedicineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {

        holder.binding.imgUrl = items?.get(position)

    }

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }

    inner class MedicineViewHolder(binding: BottomsheetReplaceAllCompanyItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: BottomsheetReplaceAllCompanyItemBinding

        init {
            this.binding = binding
        }
    }
}