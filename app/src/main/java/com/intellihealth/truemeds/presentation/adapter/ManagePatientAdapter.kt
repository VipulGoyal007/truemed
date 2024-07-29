package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.SearchResult
import com.intellihealth.truemeds.databinding.ManagePatientItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel
import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.salt.views.cards.AddressPatientCallback
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse

class ManagePatientAdapter() : RecyclerView.Adapter<ManagePatientAdapter.MyViewHolder>() {
    var items: MutableList<GetAllPatientResponse.Patient>? = null
    var viewmodel: ManagePatientViewModel? = null

    init {
        setHasStableIds(true)
    }

    constructor (items: MutableList<GetAllPatientResponse.Patient>?, viewmodel: ManagePatientViewModel?) : this() {
        this.viewmodel = viewmodel
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.manage_patient_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder.binding) {
            val itemSdk = items?.get(position)?.toAddressPatientDetailsCardModel(viewmodel)
            holder.bindView(itemSdk!!)

            addressCard.setCallback(object : AddressPatientCallback {
                override fun deleteClickedCallback(type: AddressPatientDetailsConstants) {
                    viewmodel!!.managePatientListItemClick(position, "delete")

                }

                override fun editClickedCallback(type: AddressPatientDetailsConstants) {
                    viewmodel!!.managePatientListItemClick(position, "edit")
                }

                override fun addressCardClick() {
                    viewmodel!!.managePatientListItemClick(position, "address")
                }

                override fun patientCardClick() {
                    viewmodel!!.managePatientListItemClick(position, "patient")
                }
            })

            viewModel = viewmodel
            itemPosition = position

        }
    }


    override fun getItemCount(): Int = items!!.size

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    class MyViewHolder(binding: ManagePatientItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: ManagePatientItemBinding

        init {
            this.binding = binding
        }
        fun bindView(item: AddressPatientDetailsCardModel) {
            binding.addressCard.setUpData(item)
        }

    }

}