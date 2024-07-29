package com.intellihealth.truemeds.presentation.bindingadapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SimpleItemAnimator
import com.bumptech.glide.Glide
import com.intellihealth.salt.views.TextView
import com.intellihealth.salt.views.buttons.Button
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.prescription.ActiveRx
import com.intellihealth.truemeds.data.model.prescription.PastPrescriptions
import com.intellihealth.truemeds.presentation.adapter.PastPrescriptionAdapter
import com.intellihealth.truemeds.presentation.adapter.PastPrescriptionDetailsAdapter
import com.intellihealth.truemeds.presentation.adapter.PrescriptionMedicalListAdapter
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("setPastPrescriptionList", "viewModel")
fun setPastPrescriptionList(
    view: RecyclerView,
    list: List<PastPrescriptions>?,
    viewModel: PrescriptionViewModel
) = view.adapter?.run {
    //notify
    if (this is PastPrescriptionAdapter) {
//        this.prescriptionList = list!!
        this.viewModel = viewModel
        this.notifyDataSetChanged()
    }
} ?: run {
    view.adapter = list?.let {
        PastPrescriptionAdapter(viewModel)
    }

}

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter(value = ["setPastPrescriptionDetailsList", "parentIndex", "viewModel"])
fun setPastPrescriptionDetailsList(
    view: RecyclerView,
    list: List<ActiveRx>?,
    index: Int,
    viewModel: PrescriptionViewModel
) = view.adapter?.run {
    //notify
    if (this is PastPrescriptionDetailsAdapter) {
//        this.setHasStableIds(true)
        this.parentIndex = index
        this.prescriptionDetailList = list!!
        this.viewModel = viewModel
        view.smoothScrollToPosition(0)
        this.notifyDataSetChanged()
    }
} ?: run {
    list?.let {
        val adapter =  PastPrescriptionDetailsAdapter(index, it, viewModel)
        adapter.setHasStableIds(true)
        view.setHasFixedSize(true)
        (view?.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
        view.adapter = adapter
    }


 /*   view.adapter = list?.let {
        PastPrescriptionDetailsAdapter(index, it, viewModel)
    }*/

}

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("setMedicineList", "viewModel")
fun setMedicineList(
    view: RecyclerView,
    list: List<String>?,
    viewModel: PrescriptionViewModel
) = view.adapter?.run {
    //notify
    if (this is PrescriptionMedicalListAdapter) {
        this.medicineList = list!!
        this.viewModel = viewModel
        this.notifyDataSetChanged()
    }
} ?: run {
    view.adapter = list?.let {
        PrescriptionMedicalListAdapter(it, viewModel)
    }

}

@BindingAdapter("rxImageUrl")
fun loadImage(view: View, imageUrl: String?) {
    val image: ImageView = view as ImageView
    Glide.with(image.context)
        .load(imageUrl)
        .into(image)
}


/*@BindingAdapter("createdDate")
@SuppressLint("SimpleDateFormat")
fun convertLongToTime(time: Long): String {
    val date = Date(time)
    val format = SimpleDateFormat("yyyy.MM.dd HH:mm")
    return format.format(date)
}*/

@BindingAdapter("setPrescriptionList", "listSize")
fun setPrescriptionList(
    view: Button,
    expanded: Boolean,
    listSize: Int
) {
    view?.run {
        Log.d("TAG", "setPrescriptionList: $listSize")
        if (expanded) {
            this.setTitle("Show less")
            this.setButtonDrawableRight(resources.getDrawable(R.drawable.up_arrow))
        } else {
            this.setTitle("${listSize-2} more")
            this.setButtonDrawableRight(resources.getDrawable(R.drawable.down_arrow))
        }
    }
}