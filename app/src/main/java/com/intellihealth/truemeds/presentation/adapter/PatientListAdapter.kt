package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.databinding.ResPatientItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel

class PatientListAdapter(var itemList: MutableList<GetAllPatientResponse.Patient>,
                         var viewModel: DeliveryDetailsViewModel) : RecyclerView.Adapter<PatientListAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PatientListAdapter.MyViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        val binding = ResPatientItemBinding.inflate(inflator,parent,false)
        return MyViewHolder(binding)
    }

    class MyViewHolder(var binding: ResPatientItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindView(item: AddressPatientDetailsCardModel) {
            binding.addressCard.setUpData(item)
        }
    }

    override fun onBindViewHolder(holder: PatientListAdapter.MyViewHolder, position: Int) {
       /* val itemSdk = itemList[position].toAddressPatientDetailsCardModel(viewModel)
        holder.bindView(itemSdk)
*/    }

    override fun getItemCount(): Int {
       return itemList.size
    }

}