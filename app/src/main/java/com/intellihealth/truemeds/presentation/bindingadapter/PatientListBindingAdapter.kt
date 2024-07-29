package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.SearchResult
import com.intellihealth.truemeds.presentation.adapter.ManagePatientAdapter
import com.intellihealth.truemeds.presentation.adapter.PreviousSearchItemAdapter
import com.intellihealth.truemeds.presentation.adapter.RecentSearchHistoryAdapter
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse

@BindingAdapter("setAddPatientList", "viewmodel")
fun setAddPatientList(
    view: RecyclerView,
    list: MutableList<GetAllPatientResponse.Patient>,
    viewModel: ManagePatientViewModel
) {
    view.adapter?.run {
        //notify
        if (this is ManagePatientAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = ManagePatientAdapter(list, viewModel)
    }
}


