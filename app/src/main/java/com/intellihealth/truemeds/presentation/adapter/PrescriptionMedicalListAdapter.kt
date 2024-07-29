package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.PrescriptionDetailsBinding
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel

class PrescriptionMedicalListAdapter(var medicineList: List<String>, var viewModel: PrescriptionViewModel) : RecyclerView.Adapter<PrescriptionMedicalListAdapter.MyViewHolder>(){
    lateinit var binding : PrescriptionDetailsBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.prescription_details, parent, false
        )
        return MyViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return medicineList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.myBinding.tvPrescription.text = medicineList[position]
//        holder.bind(medicineList[position], viewModel)
    }

    inner class MyViewHolder(
        binding: PrescriptionDetailsBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        var myBinding : PrescriptionDetailsBinding = binding
       /* fun bind(prescriptionDescription: String, viewModel: PrescriptionViewModel)  = with(binding) {
            binding.tvPrescription.text = prescriptionDescription

        }*/

    }
}