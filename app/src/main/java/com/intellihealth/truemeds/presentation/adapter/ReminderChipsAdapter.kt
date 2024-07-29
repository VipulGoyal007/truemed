package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.constants.ChipConstant
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.ChipSelectionModel
import com.intellihealth.truemeds.databinding.AdapterChipsReminderItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel

class ReminderChipsAdapter(
    var viewModel: ReminderViewModel,
    var list: List<ChipSelectionModel>
) : RecyclerView.Adapter<ReminderChipsAdapter.ItemViewHolder>() {

    private lateinit var binding: AdapterChipsReminderItemBinding
    var selectedItemPosition: Int = -1
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReminderChipsAdapter.ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_chips_reminder_item,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        binding.chip.setChipTitle(list[position].chipName.name)
        holder.changeToSelect(if (selectedItemPosition == position) ChipConstant.Selected.value else ChipConstant.UnSelected.value)
    }

    override fun getItemCount(): Int = list.size

    inner class ItemViewHolder(private val binding: AdapterChipsReminderItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.chip.setOnClickListener { // Triggers click upwards to the adapter on click
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    notifyItemChanged(selectedItemPosition)
                    selectedItemPosition = adapterPosition
                    notifyItemChanged(selectedItemPosition)
                }
                viewModel.chipsAdapterPosition.value = selectedItemPosition
            }
        }

        fun changeToSelect(type: Int) {
            binding.chip.setChipType(type)
        }

    }
}
