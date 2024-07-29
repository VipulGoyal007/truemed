package com.intellihealth.truemeds.presentation.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.views.cards.AddressPatientCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.reminder.ReminderListModel
import com.intellihealth.truemeds.databinding.AdapterReminderBinding
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel

class ReminderAdapter(
    var reminderViewModel: ReminderViewModel,
    var list: List<ReminderListModel.ReminderList> = ArrayList()
) : RecyclerView.Adapter<ReminderAdapter.ItemViewHolder>() {

    private lateinit var binding: AdapterReminderBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_reminder,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ItemViewHolder,
        @SuppressLint("RecyclerView") position: Int
    ) {
        Log.d("tarun", "$list")
        binding.addressCardData = list[position].toSdkObject()

        binding.reminder.setCallback(object : AddressPatientCallback {
            override fun deleteClickedCallback(type: AddressPatientDetailsConstants) {
                reminderViewModel.deleteReminder(list[position].id)
            }

            override fun editClickedCallback(type: AddressPatientDetailsConstants) {
                reminderViewModel.editReminder(list[position].toSdkObject(), position)
            }

            override fun addressCardClick() {
                Log.d("itemClickReminder", "" + list[position].id)
            }

            override fun patientCardClick() {

            }
        })
    }

    override fun getItemCount(): Int = list.size

    class ItemViewHolder(binding: AdapterReminderBinding) : RecyclerView.ViewHolder(binding.root) {
//        val binding: ReminderItemBinding
//        init { this.binding = binding }
    }
}
