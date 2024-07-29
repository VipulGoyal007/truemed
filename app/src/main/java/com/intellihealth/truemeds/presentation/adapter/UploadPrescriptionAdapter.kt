package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.UploadPrescriptionDataModel
import com.intellihealth.truemeds.databinding.UploadPrescriptionItemLayBinding
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel

class UploadPrescriptionAdapter(var prescriptionList: List<UploadPrescriptionDataModel>, var viewModel: PrescriptionViewModel) : RecyclerView.Adapter<UploadPrescriptionAdapter.MyViewHolder>() {
    lateinit var binding : UploadPrescriptionItemLayBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.upload_prescription_item_lay, parent, false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return prescriptionList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    class MyViewHolder(itemView: UploadPrescriptionItemLayBinding) : RecyclerView.ViewHolder(itemView.root) {

    }
}