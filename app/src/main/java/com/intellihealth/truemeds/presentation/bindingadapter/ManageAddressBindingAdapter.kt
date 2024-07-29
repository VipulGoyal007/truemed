package com.intellihealth.truemeds.presentation.bindingadapter

import android.annotation.SuppressLint
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.intellihealth.truemeds.data.model.SearchResult
import com.intellihealth.truemeds.presentation.adapter.ManageAddressAdapter
import com.intellihealth.truemeds.presentation.adapter.RecentSearchHistoryAdapter
import com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.salt.views.edittext.InputFieldLayout
import com.intellihealth.truemeds.data.model.user.GetAllAddressResponse
import java.util.Locale

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("setManageAddressList", "viewmodel")
fun setManageAddressList(
    view: RecyclerView,
    list: List<GetAllAddressResponse.ResponseObj?>?,
    viewModel: ManageAddressViewModel
) {
    view.adapter?.run {
        //notify
        if (this is ManageAddressAdapter) {
            this.manageAddressList = list!!
            this.viewModel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = list?.let { ManageAddressAdapter(it, viewModel) }
    }
}

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("setManageAddressInputFieldData")
fun setManageAddressInputFieldData(
    view: InputFieldLayout,
    data: String?
) {
    data?.let { view.setInputFieldData(it)
    view.requestFocus()
    view.requestFocus(0)}
}

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("setManageAddressChipOfficeData")
fun setManageAddressChipOfficeData(view: com.intellihealth.salt.views.chip.Chip, data: String?) {
    data?.let { view.setChipType(if (it.lowercase() == "office") 0 else 1)
        view.requestFocus()
        view.requestFocus(0)}
}

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("setManageAddressChipOtherData")
fun setManageAddressChipOtherData(view: com.intellihealth.salt.views.chip.Chip, data: String?) {
    data?.let { view.setChipType(if (it.lowercase() != "office" && it.lowercase() != "home" ) 0 else 1)
        view.requestFocus()
        view.requestFocus(0)}
}

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("setManageAddressChipHomeData")
fun setManageAddressChipHomeData(view: com.intellihealth.salt.views.chip.Chip, data: String?) {
    data?.let { view.setChipType(if (it.lowercase() == "home") 0 else 1)
        view.requestFocus()
        view.requestFocus(0)}
}