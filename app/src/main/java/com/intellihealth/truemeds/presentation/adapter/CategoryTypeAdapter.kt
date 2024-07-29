package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel
import com.intellihealth.truemeds.databinding.CategoryTypeItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel


class CategoryTypeAdapter() : RecyclerView.Adapter<CategoryTypeAdapter.MyViewHolder>() {




    var items: MutableList<ChildCategoryModel?> = mutableListOf()
    var viewmodel: MyOrderViewModel? = null


    constructor (items: MutableList<ChildCategoryModel?>, viewmodel: MyOrderViewModel?) : this() {
        this.viewmodel = viewmodel
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.category_type_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder.binding) {
            items[position]?.name?.let { customRadioOrder.updateLabel(it) }
            items[position]?.selectedCategory?.let { customRadioOrder.updateChecked(it) }

            viewModel = viewmodel
            itemPosition = position

        }
    }


    override fun getItemCount(): Int = items.size

    class MyViewHolder(binding: CategoryTypeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: CategoryTypeItemBinding

        init {
            this.binding = binding
        }
    }

}