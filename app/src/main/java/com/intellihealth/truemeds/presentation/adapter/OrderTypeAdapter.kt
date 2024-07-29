package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse
import com.intellihealth.truemeds.databinding.OrderTypeItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel


class OrderTypeAdapter() : RecyclerView.Adapter<OrderTypeAdapter.MyViewHolder>() {




    var items: MutableList<OrderTypeResponse.OrderType?> = mutableListOf()
    var viewmodel: OrdersTabViewModel? = null


    constructor (items: MutableList<OrderTypeResponse.OrderType?>, viewmodel: OrdersTabViewModel?) : this() {
        this.viewmodel = viewmodel
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.order_type_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder.binding) {
            //customRadioOrder.setRadioLabelRightMaxLine(1)
            customRadioOrder.updateLabel(items!![position]?.displayName!!.trim())
            customRadioOrder.updateChecked(items!![position]?.isSelected!!)

            viewModel = viewmodel
            itemPosition = position

        }
    }


    override fun getItemCount(): Int = items!!.size

    class MyViewHolder(binding: OrderTypeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: OrderTypeItemBinding

        init {
            this.binding = binding
        }
    }

}