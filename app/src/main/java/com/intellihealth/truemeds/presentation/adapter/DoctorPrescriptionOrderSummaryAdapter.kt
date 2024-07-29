package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.AdapterAddmorePrescriptionOrderSummaryBinding
import com.intellihealth.truemeds.databinding.AdapterDoctorPrescriptionOrderSummaryBinding
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback
import com.intellihealth.truemeds.presentation.viewmodel.OrderSummaryViewModel

class DoctorPrescriptionOrderSummaryAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    var items: List<String> = listOf()
    var viewmodel: OrderSummaryViewModel? = null
    var callback: ViewPrescriptionCallback? =null
    var isCloseButtonShow: Boolean = false

    constructor (items: List<String>, callback: ViewPrescriptionCallback, viewmodel: OrderSummaryViewModel,isCloseButtonShow: Boolean) : this() {
        this.viewmodel = viewmodel
        this.callback =callback
        this.isCloseButtonShow = isCloseButtonShow
        this.items = items
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ):  RecyclerView.ViewHolder  {
        return when (viewType) {
            ADD_MORE_PRESCRIPTION -> {
                val binding: AdapterAddmorePrescriptionOrderSummaryBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.adapter_addmore_prescription_order_summary,
                    parent, false
                )
                AddMorePrescriptionViewHolder(binding)
            }

            else -> {
                val binding: AdapterDoctorPrescriptionOrderSummaryBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.adapter_doctor_prescription_order_summary,
                    parent, false
                )
                ViewUploadedPrescriptionViewHolder(binding)
            }


        }
        /*    DoctorPrescriptionOrderSummaryViewHolder(
            AdapterDoctorPrescriptionOrderSummaryBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )*/
    }

    override fun onBindViewHolder(holder:  RecyclerView.ViewHolder, position: Int) {
        try {
            when (holder) {
                is AddMorePrescriptionViewHolder -> {

                    with(holder.binding) {
                        viewModel = viewmodel
                    }
                    holder.apply {
                        itemView.setOnClickListener {
                            callback?.onAddMoreClicked()
                        }
                    }
                }

                is ViewUploadedPrescriptionViewHolder -> {

                    holder.apply {
                        bind(items[position])
                        itemView.setOnClickListener {
                            callback?.onViewPrescriptionClicked(position, items[position])
                        }
                        binding.isCloseButtonShow = isCloseButtonShow
                    }
                }


            }
        } catch (e: Exception) {
            e.printStackTrace()
        }



    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        if (position == 0) {
            // This is where we'll show add prescription view.
            return ADD_MORE_PRESCRIPTION
        } else {
            return SHOW_UPLOADED_PRESCRIPTION
        }
        return super.getItemViewType(position)
    }

    companion object {
        private const val ADD_MORE_PRESCRIPTION = 1
        private const val SHOW_UPLOADED_PRESCRIPTION = 2
    }


/*    class DoctorPrescriptionOrderSummaryViewHolder(val binding: AdapterDoctorPrescriptionOrderSummaryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: String) {
            binding.url = item
        }}*/


        class AddMorePrescriptionViewHolder(binding: AdapterAddmorePrescriptionOrderSummaryBinding) :
            RecyclerView.ViewHolder(binding.root) {
            val binding: AdapterAddmorePrescriptionOrderSummaryBinding

            init {
                this.binding = binding
            }
        }

        class ViewUploadedPrescriptionViewHolder(binding: AdapterDoctorPrescriptionOrderSummaryBinding) :
            RecyclerView.ViewHolder(binding.root) {
            val binding: AdapterDoctorPrescriptionOrderSummaryBinding

            init {
                this.binding = binding
            }
            fun bind(item: String) {
                binding.url = item
            }
        }


}

