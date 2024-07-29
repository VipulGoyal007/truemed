package com.intellihealth.truemeds.presentation.bindingadapter

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.UploadPrescriptionDataModel
import com.intellihealth.truemeds.presentation.adapter.UploadPrescriptionAdapter
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel

@SuppressLint("NotifyDataSetChanged")
fun setUploadPrescriptionList(
    view: RecyclerView,
    list: List<UploadPrescriptionDataModel>?,
    viewModel: PrescriptionViewModel
) = view.adapter?.run {
    //notify
    if (this is UploadPrescriptionAdapter) {
        this.prescriptionList = list!!
        this.viewModel = viewModel
        this.notifyDataSetChanged()
    }
} ?: run {
    view.adapter = list?.let {
        UploadPrescriptionAdapter(it, viewModel)
    }
}