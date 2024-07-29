package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.HelpCategoryItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel
import com.intellihealth.salt.models.HelpCategoriesItemModel
import com.intellihealth.salt.views.HelpCategories
import com.intellihealth.truemeds.data.model.helpfaqtnc.HelpCategoryResponse


class HelpAdapter() : RecyclerView.Adapter<HelpAdapter.MyViewHolder>() {
    var items: MutableList<HelpCategoryResponse.CategoryList>? = null
    var viewmodel: HelpViewModel? = null

    constructor (
        items: MutableList<HelpCategoryResponse.CategoryList>?,
        viewmodel: HelpViewModel?
    ) : this() {
        this.viewmodel = viewmodel
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.help_category_item,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(holder.binding) {
            var currObj = items!![position]
            var helpCategory = HelpCategoriesItemModel(
                currObj.categoryName!!,
                currObj.description ?: "",
                currObj.categoryId.toString(),
                currObj.icon ?: ""
            )
            helpCategoryCard.setHelpCategoriesData(helpCategory)

            if (currObj.isFilterApplied) {
                holder.binding.category = currObj
                holder.binding.clFilter.visibility = View.VISIBLE
                holder.binding.tvSubCategoryTitle.text = currObj.issues

                holder.binding.helpCategoryCard.visibility = View.GONE
                holder.binding.dividerHelpCategoryCard.visibility = View.GONE
            } else {
                holder.binding.clFilter.visibility = View.GONE
                holder.binding.helpCategoryCard.visibility = View.VISIBLE
                holder.binding.dividerHelpCategoryCard.visibility = View.VISIBLE
            }

            helpCategoryCard.setCallback(object : HelpCategories.TmHelpCategoryItemCallback {
                override fun getHelpCategoryItemCallBack() {
                    viewmodel!!.helpListItemClick(position)
                }
            })

            viewModel = viewmodel
            itemPosition = position

        }
    }


    override fun getItemCount(): Int = items!!.size

    class MyViewHolder(binding: HelpCategoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: HelpCategoryItemBinding

        init {
            this.binding = binding
        }
    }

}