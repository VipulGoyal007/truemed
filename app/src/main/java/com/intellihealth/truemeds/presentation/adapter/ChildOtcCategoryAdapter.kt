package com.intellihealth.truemeds.presentation.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.intellihealth.truemeds.data.model.home.ChildCategoryModel
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel
import com.intellihealth.truemeds.databinding.CategoryShopItemBinding
import com.intellihealth.truemeds.domain.navigation.navigateToOtcCategoryActivity
import com.intellihealth.truemeds.presentation.activity.OtcCategoryActivity
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel

class ChildOtcCategoryAdapter(
    var categoryModelList: List<ChildCategoryModel>,
    var banners: List<SuperCategoryModel.BannersItem>,
    var viewModel: HomeViewModel,
    var superCategoryId: Int,
) : RecyclerView.Adapter<ChildOtcCategoryAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder =
        CategoryViewHolder(
            CategoryShopItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount() = if (categoryModelList.size > 6) 6 else categoryModelList.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) =
        categoryModelList[position].let { model ->
            holder.bindSuperCategory(model, position, viewModel)
            holder.itemView.setOnClickListener {
                viewModel.selectedSubCategory = position
                val categoryList = Gson().toJson(categoryModelList)
                val bannerList = Gson().toJson(banners)

                it.context.navigateToOtcCategoryActivity(
                    params = bundleOf(
                        BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "homepage",
                        BundleConstants.CATEGORY_ID to model.id,
                        BundleConstants.SUPER_CAT_ID to superCategoryId,
                        BundleConstants.POSITION to position + 1,
                        BundleConstants.CATEGORY_TYPE to model.type,
                        BundleConstants.CATEGORY_LIST to categoryList,
                        BundleConstants.TYPE to  model.name,
                        BundleConstants.OTC_BANNERS to  bannerList
                    )
                )
            }
        }

    inner class CategoryViewHolder(private val binding: CategoryShopItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindSuperCategory(
            listModel: ChildCategoryModel,
            itemPosition: Int,
            homeViewModel: HomeViewModel
        ) = with(binding) {
            item = listModel
            viewModel = homeViewModel
            position = itemPosition
        }
    }

}