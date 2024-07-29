package com.intellihealth.truemeds.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.callback.TimeIntervalCallback
import com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel
import com.intellihealth.truemeds.databinding.AdapterTimeIntervalItemDefaultBinding
import javax.inject.Inject

class TimeIntervalAdapter@Inject constructor(
    val selectedCustomDate: String,
    list: List<TimeIntervalBottomSheetModel>,
    val context: Context,
    val customDateCallback: TimeIntervalCallback,
) :
    RecyclerView.Adapter<TimeIntervalViewHolder>() {
    var items: List<TimeIntervalBottomSheetModel> = list

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TimeIntervalViewHolder = TimeIntervalViewHolder(
        AdapterTimeIntervalItemDefaultBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: TimeIntervalViewHolder, position: Int) {
        holder.apply {
            bind(items[position])
            if(items[position].isSelected){
                if(items[position].header == "Custom Dates"){
                    if(selectedCustomDate.isNotEmpty()) {
                        binding.tvRadioLabel.setBodyTextStyle(10)
                        binding.ivEditCustomDates.visibility = View.VISIBLE
                        binding.textSelectedCustomDates.visibility =View.VISIBLE
                        binding.textSelectedCustomDates.text = selectedCustomDate
                    }else{
                        binding.tvRadioLabel.setBodyTextStyle(8)
                        binding.textSelectedCustomDates.visibility =View.GONE
                        binding.ivEditCustomDates.visibility = View.GONE
                    }
                }else{
                    binding.tvRadioLabel.setBodyTextStyle(8)
                    binding.textSelectedCustomDates.visibility =View.GONE
                    binding.ivEditCustomDates.visibility = View.GONE
                }
            }else{
                binding.tvRadioLabel.setBodyTextStyle(8)
                binding.textSelectedCustomDates.visibility =View.GONE
                binding.ivEditCustomDates.visibility = View.GONE
            }
            binding.tvRadioLabel.text = items[position].header
            with(binding.radioHeader){
                setChecked(items[position].isSelected)
                setEnable(items[position].isSelected)
                setOnClickListener {
                    setChecked(true)
                    for (item: TimeIntervalBottomSheetModel in items){
                        item.isSelected = items.indexOf(item) == position
                        if(item.isSelected){
                            customDateCallback.selectedTimeIntervalCallback(item.header)
                        }
                    }
                    notifyDataSetChanged()
                }
            }
            with(binding.root){
                binding.radioHeader.setChecked(items[position].isSelected)
                setOnClickListener {
                    binding.radioHeader.setChecked(true)
                    for (item: TimeIntervalBottomSheetModel in items){
                        item.isSelected = items.indexOf(item) == position
                        if(item.isSelected){
                            customDateCallback.selectedTimeIntervalCallback(item.header)
                        }
                    }
                    notifyDataSetChanged()
                }
            }
            with(binding.ivEditCustomDates){
                setOnClickListener {
                    customDateCallback.onEditCustomDatesClicked()
                }
            }

        }
    }

    override fun getItemCount(): Int = items.size
}

class TimeIntervalViewHolder(val binding: AdapterTimeIntervalItemDefaultBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: TimeIntervalBottomSheetModel) {
        binding.timeIntervalData = item
    }
}