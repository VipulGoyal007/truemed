package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.callback.TimeIntervalCallback
import com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel
import com.intellihealth.truemeds.presentation.adapter.TimeIntervalAdapter


@BindingAdapter("setViewTimeIntervalList","timeIntervalCallback")
fun setViewTimeIntervalList(
    selectedCustomDate:String,
    view: RecyclerView,
    list: List<TimeIntervalBottomSheetModel>,
    timeIntervalCallback : TimeIntervalCallback
) {
    view.adapter?.run {
        if (this is TimeIntervalAdapter) {
            this.items = list
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter =  TimeIntervalAdapter(selectedCustomDate,list, view.context, timeIntervalCallback)
    }
}