package com.intellihealth.truemeds.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.SearchItemClickCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.cancelorder.CancelReasonResponse
import com.intellihealth.truemeds.data.utils.MESSAGES
import com.intellihealth.truemeds.databinding.CancelOrderItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.CancelOrderViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class CancelOrderReasonAdapter(
    var cancelOrderReasonList: List<CancelReasonResponse.Reason?>?,
    var viewModel: CancelOrderViewModel
) : RecyclerView.Adapter<CancelOrderReasonAdapter.MyViewHolder>() {
    lateinit var binding: CancelOrderItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.cancel_order_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentObj = cancelOrderReasonList?.get(position)
        currentObj.let {
            holder.setBindingData(currentObj)
            it?.reasonId?.let {
                    it1 -> setClickListener(it1,currentObj)

            }
        }
    }

    private fun setClickListener(reasonId: Int, currentObj: CancelReasonResponse.Reason?) {
        val callback = object : SearchItemClickCallback {
            override fun onSearchItemClick() {

            }
        }
        binding.clTitleLayout.setOnClickListener(View.OnClickListener {
            viewModel.reasonId = reasonId.toString()
            viewModel.firstPageCancelReason=currentObj?.value.toString()
            viewModel.showMessage.postValue(Event(MESSAGES.CANCEL_ORDER_REASON_CLICK))
            Log.d("TAG", "onSearchItemClick: $reasonId")
        })
//        binding.searchSuggestion.searchCallback(callback)


    }

    override fun getItemCount(): Int {
        return cancelOrderReasonList?.size!!
    }

    inner class MyViewHolder(itemView: CancelOrderItemBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        fun setBindingData(currentObj: CancelReasonResponse.Reason?) {
            binding.model = currentObj
        }
    }

}