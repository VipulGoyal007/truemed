package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.views.cards.ActionCardCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.ActionCardDataModel
import com.intellihealth.truemeds.databinding.AdapterCallorderActionCardItemBinding
import com.intellihealth.truemeds.databinding.AdapterPrescriptionActionCardItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel


class ActionCardAdapter(
    private var actionCardModel: ActionCardDataModel?,
    val homeViewModel: HomeViewModel
) :  RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val PRESCIPTION_TYPE = 0
    private val CALL_AND_ORDER_TYPE = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == PRESCIPTION_TYPE) {
            val binding: AdapterPrescriptionActionCardItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.adapter_prescription_action_card_item, parent, false
            )
            PrescriptionItemViewHolder(binding)
        } else if(viewType == CALL_AND_ORDER_TYPE) {
            val binding: AdapterCallorderActionCardItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.adapter_callorder_action_card_item, parent, false
            )
            CallAndOrderItemViewHolder(binding)
        } else {
            val binding: AdapterPrescriptionActionCardItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.adapter_prescription_action_card_item, parent, false
            )
            PrescriptionItemViewHolder(binding)
        }
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is PrescriptionItemViewHolder ->{

                holder.binding.tmPrescriptionActionCard.setCallback(object : ActionCardCallback {
                    override fun viewClickCallback(type: Int) {
                        homeViewModel.homeActionCardItemClick(type)
                    }

                    override fun viewCopyClick(type: Int) {
                        TODO("Not yet implemented")
                    }
                    /*override fun viewCopyClick(type: Int) {
                        TODO("Not yet implemented")
                    }


                    override fun viewCopyClick(type: Int) {
                    }*/

                })
            }
            is CallAndOrderItemViewHolder ->{

                holder.callOrderbinding.tmActionCardCall.setCallback(object : ActionCardCallback {
                    override fun viewClickCallback(type: Int) {
                        homeViewModel.homeActionCardItemClick(type)
                    }

                    override fun viewCopyClick(type: Int) {
                        TODO("Not yet implemented")
                    }
                    /*override fun viewCopyClick(type: Int) {
                        TODO("Not yet implemented")
                    }


                    override fun viewCopyClick(type: Int) {
                    }*/

                })
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (actionCardModel?.type) {
            "Prescription"-> PRESCIPTION_TYPE
            "Call and Order"-> CALL_AND_ORDER_TYPE
            else -> PRESCIPTION_TYPE
        }
    }
    override fun getItemCount(): Int = 1

    class PrescriptionItemViewHolder(binding: AdapterPrescriptionActionCardItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterPrescriptionActionCardItemBinding
        init { this.binding = binding }
    }
    class CallAndOrderItemViewHolder(binding: AdapterCallorderActionCardItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val callOrderbinding: AdapterCallorderActionCardItemBinding
        init { this.callOrderbinding = binding }
    }

    fun setData(responseApi: ActionCardDataModel) {
        this.actionCardModel = responseApi
        notifyDataSetChanged()
    }
}