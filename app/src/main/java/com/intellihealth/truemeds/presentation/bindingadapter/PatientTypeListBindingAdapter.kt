package com.intellihealth.truemeds.presentation.bindingadapter

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.presentation.adapter.PatientTypeAdapter
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel

@BindingAdapter("setPatientTypeList", "viewmodel")
fun setPatientTypeList(
        view: RecyclerView,
        list: MutableList<GetAllPatientResponse.Patient?>,
        viewModel: OrdersTabViewModel
) {
    view.adapter?.run {
        //notify
       // Log.e("adapter_list::11",list.toString())
        if (this is PatientTypeAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
      //  Log.e("adapter_list::22",list.toString())
        view.adapter = PatientTypeAdapter(list, viewModel)
    }
}


