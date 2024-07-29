package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.orderstatus.ModificationItem
import com.intellihealth.truemeds.databinding.AdapterModificationItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel

class ModificationItemAdapter (list: List<ModificationItem>, viewModel: OrderStatusViewModel) : RecyclerView.Adapter<ViewHolder>() {
    var items: List<ModificationItem> = list
    var viewmodel: OrderStatusViewModel = viewModel

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        AdapterModificationItemBinding.inflate(
        LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item,position)
    }

    override fun getItemCount(): Int = items.size
}
class ViewHolder(val binding: AdapterModificationItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ModificationItem, position: Int) {
        binding.model= item
    }


}