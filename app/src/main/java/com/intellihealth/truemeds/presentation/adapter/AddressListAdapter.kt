package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.truemeds.databinding.ResAddressBinding

import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel

class AddressListAdapter(
    var itemList: MutableList<AddressPatientDetailsCardModel>,
    var viewModel: DeliveryDetailsViewModel
) : RecyclerView.Adapter<AddressListAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        val binding = ResAddressBinding.inflate(inflator, parent, false)
        return MyViewHolder(binding)
    }

    class MyViewHolder(var binding: ResAddressBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindView(item: AddressPatientDetailsCardModel) {
            binding.addressCard.setUpData(item)
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemList[position]
        holder.bindView(item)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }


}