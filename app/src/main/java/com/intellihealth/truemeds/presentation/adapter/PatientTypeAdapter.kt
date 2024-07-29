package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.constants.CheckFieldConstants
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.user.GetAllPatientResponse
import com.intellihealth.truemeds.databinding.PatientTypeItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel


class PatientTypeAdapter() : RecyclerView.Adapter<PatientTypeAdapter.MyViewHolder>() {




    var items: MutableList<GetAllPatientResponse.Patient?> = mutableListOf()
    var viewmodel: OrdersTabViewModel? = null


    constructor (items: MutableList<GetAllPatientResponse.Patient?>, viewmodel: OrdersTabViewModel?) : this() {
        this.viewmodel = viewmodel
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.patient_type_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder.binding) {
            //customRadioOrder.setCheckFieldLabelRightMaxLine(1)
            customRadioOrder.updateLabel(items!![position]?.patientName!!.trim())
            Log.e("semi_selected","::"+position.toString()+":::"+items!![position]?.isSelected)
            if(items!![position]?.isSelected==0)
                customRadioOrder.setState(CheckFieldConstants.STATE_UNSELECTED)
            else if(items!![position]?.isSelected==1)
                customRadioOrder.setState(CheckFieldConstants.STATE_SEMI_SELECTED)
            else
                customRadioOrder.setState(CheckFieldConstants.STATE_SELECTED)


            viewModel = viewmodel
            itemPosition = position

        }
    }


    override fun getItemCount(): Int = items!!.size


    class MyViewHolder(binding: PatientTypeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: PatientTypeItemBinding

        init {
            this.binding = binding
        }
    }
    public fun setUpdatedList(){}
}