package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.salt.views.cards.AddressPatientDetailsCard
import com.intellihealth.salt.views.radiofield.Radio
import com.intellihealth.truemeds.data.model.ChipSelectionModel
import com.intellihealth.truemeds.data.model.reminder.FrequencyListModel
import com.intellihealth.truemeds.data.model.reminder.ReminderListModel
import com.intellihealth.truemeds.presentation.adapter.ReminderAdapter
import com.intellihealth.truemeds.presentation.adapter.ReminderChipsAdapter
import com.intellihealth.truemeds.presentation.adapter.ReminderFrequencyAdapter
import com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel

@BindingAdapter("setReminderList", "reminderViewModel")
fun setUserNavList(
    view: RecyclerView,
    list: List<ReminderListModel.ReminderList>,
    viewModel: ReminderViewModel
) {
    view.adapter?.run {
        //notify
        if (this is ReminderAdapter) {
            this.list = list
            this.reminderViewModel = reminderViewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = ReminderAdapter(viewModel, list)
        view?.adapter?.notifyDataSetChanged()
    }

}


@BindingAdapter("reminderFrequency", "viewModel")
fun setReminderFrequency(
    view: RecyclerView,
    list: List<FrequencyListModel.FrequencyList>?,
    viewModel : ReminderViewModel?
) {
    view.adapter?.run {
        //notify
        if (this is ReminderFrequencyAdapter && viewModel != null) {
            this.list = list ?: emptyList()
            this.viewModel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
//        view.adapter = ReminderDropDownAdapter(list?: emptyList())
        if (viewModel != null) {
            val adapter = ReminderFrequencyAdapter(list ?: emptyList(), viewModel)
            view.adapter = adapter
        }
    }

}


@BindingAdapter("setRadioCheck")
fun setRadioCheck(
    view: Radio,
    selection:Boolean
) {
    view.setChecked(selection)

}


@BindingAdapter("setChipData", "reminderViewModell")
fun setChipData(
    view: RecyclerView,
    list: List<ChipSelectionModel>,
    viewModel: ReminderViewModel
) {
    view.adapter?.run {
        //notify
        if (this is ReminderChipsAdapter) {
            this.list = list
            this.viewModel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        val adapter = ReminderChipsAdapter(viewModel, list)
        view.adapter = adapter
    }

}


@BindingAdapter("setUpDataPatient")
fun setUpDataPatient(
    view: AddressPatientDetailsCard,
    data: AddressPatientDetailsCardModel?
) {
   view.setUpData(data)

}