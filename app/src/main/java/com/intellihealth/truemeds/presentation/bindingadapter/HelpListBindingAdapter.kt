package com.intellihealth.truemeds.presentation.bindingadapter

import android.util.Log
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.presentation.adapter.HelpAdapter
import com.intellihealth.truemeds.presentation.adapter.ManagePatientAdapter
import com.intellihealth.truemeds.presentation.adapter.PreviousSearchItemAdapter
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel
import com.intellihealth.salt.models.HelpCategoriesItemModel
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse

@BindingAdapter(value = ["setHelpList", "viewmodel"])
fun setHelpList(
    view: RecyclerView,
    list: MutableList<HelpCategoryResponse.CategoryList>,
    viewModel: HelpViewModel
) {
    view.adapter?.run {
        //notify
        if (this is HelpAdapter) {
            this.items = list
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = HelpAdapter(list, viewModel)
    }
}
