package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.user.GetAllSubCategoryTypeResponse
import com.intellihealth.truemeds.databinding.SubCategoryCategoryTypeItemBinding
import com.intellihealth.truemeds.databinding.SubCategoryTypeItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel


class SubCategoryTypeAdapter() :  RecyclerView.Adapter<RecyclerView.ViewHolder>(){




    var items: MutableList<GetAllSubCategoryTypeResponse.SubCategoryType?> = mutableListOf()
    var viewmodel: MyOrderViewModel? = null


    constructor (items: MutableList<GetAllSubCategoryTypeResponse.SubCategoryType?>, viewmodel: MyOrderViewModel?) : this() {
        this.viewmodel = viewmodel
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  RecyclerView.ViewHolder {
        return when (viewType) {
            CATEGORY_VIEW -> {
                val binding: SubCategoryCategoryTypeItemBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.sub_category_category_type_item,
                    parent, false
                )
                CategoryViewHolder(binding)
            }

            else -> {
                val binding: SubCategoryTypeItemBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    R.layout.sub_category_type_item,
                    parent, false
                )
                SubCategoryViewHolder(binding)
            }


        }
    }

    override fun getItemViewType(position: Int): Int {
        if (items!![position]?.subCategoryId.isNullOrEmpty()) {
            // This is where we'll add the category.
            return CATEGORY_VIEW
        } else {
            // This is where we'll add sub category.
            return SUBCATEGORY_VIEW
        }
        return super.getItemViewType(position)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        try {
            when (holder) {
                is CategoryViewHolder -> {

                    with(holder.binding) {
                   tvCategory.text=  items!![position]?.categoryName!!
                        viewModel = viewmodel
                        itemPosition = position
                }}

                is SubCategoryViewHolder -> {

                    with(holder.binding) {
                   customRadioOrder.updateLabel(items!![position]?.subCategoryName!!)
                  customRadioOrder.updateChecked(items!![position]?.isSelected!!)
                        viewModel = viewmodel
                        itemPosition = position
                }}


            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }


    override fun getItemCount(): Int = items!!.size


    class CategoryViewHolder(binding: SubCategoryCategoryTypeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: SubCategoryCategoryTypeItemBinding

        init {
            this.binding = binding
        }
    }

    class SubCategoryViewHolder(binding: SubCategoryTypeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: SubCategoryTypeItemBinding

        init {
            this.binding = binding
        }
    }


    companion object {
        private const val CATEGORY_VIEW = 1
        private const val SUBCATEGORY_VIEW = 2
    }
}