package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse
import com.intellihealth.truemeds.databinding.HelpSubcategoryItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel


class HelpSubCategoryAdapter() : RecyclerView.Adapter<HelpSubCategoryAdapter.MyViewHolder>() {




    var items: MutableList<HelpCategoryResponse.CategoryList?> = mutableListOf()
    var viewmodel: HelpViewModel? = null


    constructor (items: MutableList<HelpCategoryResponse.CategoryList?>, viewmodel: HelpViewModel?) : this() {
        this.viewmodel = viewmodel
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.help_subcategory_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder.binding) {
            tvSubCategoryTitle.text=(items!![position]?.issues)


            viewModel = viewmodel
            itemPosition = position

        }
    }


    override fun getItemCount(): Int = items!!.size

    class MyViewHolder(binding: HelpSubcategoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: HelpSubcategoryItemBinding

        init {
            this.binding = binding
        }
    }

}