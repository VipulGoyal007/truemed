package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.constants.CheckFieldConstants
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.user.GetAllBrandsTypeResponse
import com.intellihealth.truemeds.databinding.BrandTypeItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel


class BrandsTypeAdapter() : RecyclerView.Adapter<BrandsTypeAdapter.MyViewHolder>() {




    var items: MutableList<GetAllBrandsTypeResponse.BrandType?> = mutableListOf()
    var viewmodel: MyOrderViewModel? = null


    constructor (items: MutableList<GetAllBrandsTypeResponse.BrandType?>, viewmodel: MyOrderViewModel?) : this() {
        this.viewmodel = viewmodel
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.brand_type_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder.binding) {
            customRadioOrder.updateLabel(items!![position]?.brandName!!)

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

    class MyViewHolder(binding: BrandTypeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: BrandTypeItemBinding

        init {
            this.binding = binding
        }
    }

}