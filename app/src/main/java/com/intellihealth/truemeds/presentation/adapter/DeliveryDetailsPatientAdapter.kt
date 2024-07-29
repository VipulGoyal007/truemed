package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.intellihealth.salt.constants.AddressPatientDetailsConstants
import com.intellihealth.salt.models.AddressPatientDetailsCardModel
import com.intellihealth.salt.views.cards.AddressPatientCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.PatientClickCallback
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.databinding.DeliveryDetailsPatientItemBinding
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel

class DeliveryDetailsPatientAdapter() : RecyclerView.Adapter<DeliveryDetailsPatientAdapter.MyViewHolder>() {




    var items: MutableList<GetAllPatientResponse.Patient?>? = null
    var viewmodel: DeliveryDetailsViewModel? = null
    var callback: PatientClickCallback? = null


    constructor (items: MutableList<GetAllPatientResponse.Patient?>?, viewmodel: DeliveryDetailsViewModel?,
                 callback: PatientClickCallback) : this() {
        setHasStableIds(true)
        this.viewmodel = viewmodel
        this.items = items
        this.callback = callback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.delivery_details_patient_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val current = items?.get(position)
        current.let {
            it?.toDeliveryDetailsPatientDetailsCardModel(viewmodel)
                ?.let { it1 ->
                    holder.bindManagePatient(position, it1)
                    //below 1 line is commented for now bcoz patient id should only be selected on proceed to checkout button click
                   /* if (it1.isSelected) {
                        SharedPrefManager.getInstance().patientId = it.patientId
                    }*/
                }


            holder.binding.addressCard.setCallback(object : AddressPatientCallback {
                override fun addressCardClick() {

                }

                override fun deleteClickedCallback(type: AddressPatientDetailsConstants) {

                }

                override fun editClickedCallback(type: AddressPatientDetailsConstants) {
                    val addressJsonString = Gson().toJson(it)
//                    viewmodel!!.editPatient(it,position)
                    callback?.editClick(current!!)

                }

                override fun patientCardClick() {
                    viewmodel!!.patientBoxClicked(it,position)
                }

            })
        }
    }


    override fun getItemCount(): Int = items!!.size

    override fun getItemId(position: Int): Long {
        return items?.get(position)?.patientId!!.toLong()
    }

    class MyViewHolder(binding: DeliveryDetailsPatientItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: DeliveryDetailsPatientItemBinding

        init {
            this.binding = binding
        }
        fun bindManagePatient(itemPosition: Int, data: AddressPatientDetailsCardModel) =
            with(binding) {
                binding.addressCardData = data
            }
    }

}