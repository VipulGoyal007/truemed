package com.intellihealth.truemeds.presentation.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.animation.LayoutAnimationController
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel
import com.intellihealth.truemeds.databinding.SuperCategoryShopItemBinding
import com.intellihealth.truemeds.presentation.utils.CommonFunc.removeViewBg
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel


class SuperOtcCategoryAdapter(var item: List<SuperCategoryModel>, var viewModel: HomeViewModel) :
    RecyclerView.Adapter<SuperOtcCategoryAdapter.SuperCategoryViewHolder>() {
    private var viewModels: HomeViewModel? = null

    init {
        this.viewModels = viewModel
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperCategoryViewHolder =
        SuperCategoryViewHolder(
            SuperCategoryShopItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount() = if (item.isNotEmpty()) {
        Integer.MAX_VALUE
    } else {
        0
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(
        holder: SuperOtcCategoryAdapter.SuperCategoryViewHolder,
        position: Int
    ) {
        /*val lac = LayoutAnimationController(
            AnimationUtils.loadAnimation(
                holder.binding.clSuperMain.context, R.anim.slide_in_right
            )
        )*/



        try {
            holder.binding.viewModel = viewModel
            holder.binding.position = position
            //note:- infinite scroll
            holder.binding.item = item[position % item.size]

            if (item[position % item.size].selectedCategory == true) {
                viewModel.selectedSuperCategory.value = item[position % item.size].name
                viewModel.selectedSuperCategoryIndex.value = item[position % item.size].priority

            } else {
                removeViewBg(holder.binding.clSuperMain)
                removeViewBg(holder.binding.ivSuperImg)
            }



            holder.binding.clSuperMain.setOnClickListener {
                // viewModel.eventSuperCategoryClick.value = position % item.size
                item[position % item.size].selectedCategory= true
                viewModel.eventSuperCategoryClick.value = Pair(position % item.size,position)

                //            lac.order = LayoutAnimationController.ORDER_NORMAL
    //            lac.delay = 1f
    //            holder.binding.clSuperMain.layoutAnimation = lac
                //viewModel.sendCategoryAndSuperCategoryData()

            }
            if (position == 0){
                holder.binding.clSuperMain.background = holder.binding.clSuperMain.resources.getDrawable(R.drawable.background_top_rounded_blue)
            }
        } catch (_: Exception) {
        }


    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    inner class SuperCategoryViewHolder(val binding: SuperCategoryShopItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    class MyViewHolder(binding: SuperCategoryShopItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: SuperCategoryShopItemBinding

        init {
            this.binding = binding
        }
    }


}