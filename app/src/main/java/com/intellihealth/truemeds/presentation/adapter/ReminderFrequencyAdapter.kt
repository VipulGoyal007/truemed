package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.reminder.FrequencyListModel
import com.intellihealth.truemeds.databinding.AdapterReminderTimeItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale


class ReminderFrequencyAdapter(
    var list: List<FrequencyListModel.FrequencyList>?,
    var viewModel: ReminderViewModel
) : RecyclerView.Adapter<ReminderFrequencyAdapter.ItemRadioViewHolder>() {

    private var selectedItemPosition: Int = 0//RecyclerView.NO_POSITION
    private lateinit var binding: AdapterReminderTimeItemBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemRadioViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_reminder_time_item,
            parent, false
        )
        return ItemRadioViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemRadioViewHolder, position: Int) {

//        var size = list!!.size - 1

        holder.bind(list!![position], position)
    }


    override fun getItemCount(): Int = list!!.size


    inner class ItemRadioViewHolder(private val binding: AdapterReminderTimeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: FrequencyListModel.FrequencyList, position: Int) {
            binding.reminderItem = model
            if (list!!.size - 1  == position){
                binding.divider.visibility = View.GONE
            }else{
                binding.divider.visibility = View.VISIBLE
            }
            binding.radio.updateLabel(model.frequencyText!!)
            binding.radio.setChecked(model.isSelected)

            itemView.setOnClickListener {

                if (!list.isNullOrEmpty()) {
                    if (selectedItemPosition != RecyclerView.NO_POSITION) {
                        list!![selectedItemPosition].isSelected = false
                        binding.radio.setChecked(list!![selectedItemPosition].isSelected)

                        notifyItemChanged(selectedItemPosition)
                    }

                    selectedItemPosition = position
                    model.isSelected = true

                    binding.radio.setChecked(model.isSelected)
                    notifyItemChanged(position)
                    viewModel.getFrequencyItem(model.frequency!!)

                    list!![position].nextReminderDate = calculateNextNDays(getCurrentDate(), list!![position].frequency!!.toInt())
                    list!![position].showReminderDate = calculateNextNShowDays(getCurrentDate(), list!![position].frequency!!.toInt())

                    viewModel.editReminderDateValue = calculateNextNDays(getCurrentDate(), list!![position].frequency!!.toInt())

                    viewModel.editReminderFrequency.postValue(list!![position].frequency)
                }
            }

        }
    }

    fun calculateNextNDays(currentDate: String, numberOfDays: Int): String {
        val dateFormat = SimpleDateFormat("dd-MM-yyyy")
        val calendar = Calendar.getInstance()

        // Parse the current date
        val date = dateFormat.parse(currentDate)
        calendar.time = date

        // Add the specified number of days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays)

        // Format the result
        return dateFormat.format(calendar.time)
    }

    fun calculateNextNShowDays(currentDate: String, numberOfDays: Int): String {
      //  return currentDate

        val dateFormat = SimpleDateFormat("dd-MM-yyyy")
        val shownDateFormat = SimpleDateFormat("dd MMMM yyyy")
        val calendar = Calendar.getInstance()

        // Parse the current date
        val date = dateFormat.parse(currentDate)
        calendar.time = date

        // Add the specified number of days
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays)

        // Format the result
        return shownDateFormat.format(calendar.time)
    }


    fun getCurrentDate(): String {
        val calendar = Calendar.getInstance()
        val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        return dateFormat.format(calendar.time)
    }



}