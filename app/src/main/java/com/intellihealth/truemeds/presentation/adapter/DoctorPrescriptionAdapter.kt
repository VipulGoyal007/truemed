package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo
import com.intellihealth.truemeds.data.utils.isSingleClick
import com.intellihealth.truemeds.databinding.AdapterAddmorePrescriptionOrderSummaryBinding
import com.intellihealth.truemeds.databinding.AdapterDoctorPrescriptionBinding
import com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback

class DoctorPrescriptionAdapter(list: List<OrderRxInfo>,
                                val callback: ViewPrescriptionCallback, private val isCloseButtonShow: Boolean, private val isUpload: Boolean) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var items: List<OrderRxInfo> = list
    private val ADD_MORE_PRESCRIPTION = 1
    private val SHOW_UPLOADED_PRESCRIPTION = 2
    var lastClickSubstitutesPageCTA = 0L

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder = when (viewType) {
        ADD_MORE_PRESCRIPTION -> {
            AddMoreViewHolder(
                AdapterAddmorePrescriptionOrderSummaryBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }

        else -> {
            DoctorPrescriptionViewHolder(
                AdapterDoctorPrescriptionBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            when (holder) {
                is AddMoreViewHolder -> {
                    holder.apply {
                        binding.isUpload = isUpload
                        Log.d("TAG", "onBindViewHolder: $items")
                        binding.tvAddMorePrescription.setBodyTextStyle( if(isUpload) 14 else  10)
                        itemView.setOnClickListener {
                            callback.onAddMoreClicked()
                        }
                    }
                }
                is DoctorPrescriptionViewHolder -> {
                    holder.apply {
                        bind(items[position])
                        Log.d("TAG", "onBindViewHolder: $items")
                        binding.ivPrescription.setOnClickListener {
                            callback.onViewPrescriptionClicked(position, items[position].imageUrl ?: "")
                        }

                        binding.ivClose.setOnClickListener{
                            val lastRecordedData = isSingleClick(lastClickSubstitutesPageCTA)
                            lastClickSubstitutesPageCTA = lastRecordedData.second
                            if (lastRecordedData.first) {
                                callback.onDeleteImage(items[position].imageId!!)
                            }
                        }
                        binding.isCloseButtonShow = isCloseButtonShow
                    }

                }
            }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int) = if (isCloseButtonShow) {
        if (position == 0) ADD_MORE_PRESCRIPTION else SHOW_UPLOADED_PRESCRIPTION
    } else {
        SHOW_UPLOADED_PRESCRIPTION
    }
}

class DoctorPrescriptionViewHolder(val binding: AdapterDoctorPrescriptionBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: OrderRxInfo) {
        binding.url = item.imageUrl
    }
}
class AddMoreViewHolder(val binding: AdapterAddmorePrescriptionOrderSummaryBinding) :
    RecyclerView.ViewHolder(binding.root)