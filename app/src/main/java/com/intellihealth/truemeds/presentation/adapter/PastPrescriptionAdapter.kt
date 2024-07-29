package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.truemeds.R

import com.intellihealth.truemeds.databinding.PastPrescriptionAllPatientItemBinding
import com.intellihealth.truemeds.presentation.callbacks.ReloadPastPrescriptions
import com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel

class PastPrescriptionAdapter(/*var prescriptionList: List<PastPrescriptions>,*/ var viewModel: PrescriptionViewModel?) : RecyclerView.Adapter<PastPrescriptionAdapter.MyViewHolder>(),
    ReloadPastPrescriptions {
    lateinit var binding : PastPrescriptionAllPatientItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.past_prescription_all_patient_item, parent, false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return viewModel?.pastPrescription?.value?.size?:0
    }
    init {
        setHasStableIds(true)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      //  holder.bind(viewModel)

       // holder.bind(viewModel,position)

        with(holder.binding) {

            pastPrescriptionModel= viewModel?.pastPrescription?.value?.get(position)
            Log.e("parent_index::",pastPrescriptionModel?.parentIndex.toString())
          viewModell=viewModel
        }
    }
    
    override fun getItemId(position: Int): Long {
        val list = viewModel?.pastPrescription?.value ?: listOf()
        return list[position].createdDate.hashCode().toLong()
    }
/*  inner class MyViewHolder(
      binding: PastPrescriptionAllPatientItemBinding) : RecyclerView.ViewHolder(binding.root) {
      fun bind( viewModel: PrescriptionViewModel,currentPosition: Int)  = with(binding) {
     // fun bind(item: PastPrescriptions?, viewModel: PrescriptionViewModel)  = with(binding) {

        //  pastPrescriptionModel = viewModel.pastPrescription.value?.sortedByDescending { it.createdDate }?.get(position)
          pastPrescriptionModel = viewModel.pastPrescription.value?.get(currentPosition)

          Log.e("past_prescription::","22222:::"+pastPrescriptionModel?.activeRxList?.toString())

//            pastPrescriptionModel.callback = this
          viewModell = viewModel

      }

  }*/


  class MyViewHolder(binding: PastPrescriptionAllPatientItemBinding) :
      RecyclerView.ViewHolder(binding.root) {
      val binding: PastPrescriptionAllPatientItemBinding

      init {
          this.binding = binding
      }
      }


  override fun onCheckBoxUpdated(parentIndex: Int, childIndex: Int) {
//        notifyItemChanged(parentIndex)
  }

  override fun getItemViewType(position: Int): Int {
      return super.getItemViewType(position)
  }
}