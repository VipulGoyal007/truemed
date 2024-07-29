package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.BottomsheetReplaceAllRecocommendedItemBinding
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.viewmodel.CartViewModel

class ReplaceAllBottomSheetAdapter(
    var items: List<ProductInfoModel>,
    var viewmodel: CartViewModel,
) :
    RecyclerView.Adapter<ReplaceAllBottomSheetAdapter.MedicineViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedicineViewHolder {
        val binding: BottomsheetReplaceAllRecocommendedItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.bottomsheet_replace_all_recocommended_item, parent, false
        )
        return MedicineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MedicineViewHolder, position: Int) {

        var item = items[position]

        holder.binding.productInfoModel = item

        holder.binding.viewmodel = viewmodel
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MedicineViewHolder(binding: BottomsheetReplaceAllRecocommendedItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: BottomsheetReplaceAllRecocommendedItemBinding

        init {
            this.binding = binding
        }
    }
}