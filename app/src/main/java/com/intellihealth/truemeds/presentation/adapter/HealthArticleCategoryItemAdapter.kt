package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.databinding.HealthArticleBottomsheetItemBinding
import com.intellihealth.truemeds.data.model.home.CategoryListModel
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel

class HealthArticleCategoryItemAdapter(list: List<CategoryListModel>, var viewModel: HealthArticlesViewModel) :  RecyclerView.Adapter<HealthArticleCategoryItemAdapter.HealthArticlesCategoryMyViewHolder>() {
    lateinit var binding : HealthArticleBottomsheetItemBinding;
    var healthArticlesCategoryList: List<CategoryListModel> = list

    override fun onBindViewHolder(
        holder: HealthArticlesCategoryMyViewHolder,
        position: Int
    ) {
        val current = healthArticlesCategoryList[position]
        current.let {
            holder.bindingCategoryData(position, it, viewModel)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HealthArticlesCategoryMyViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.health_article_bottomsheet_item, parent, false)
        return HealthArticlesCategoryMyViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return healthArticlesCategoryList.size
    }

    inner class HealthArticlesCategoryMyViewHolder(private val binding: HealthArticleBottomsheetItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindingCategoryData(/*itemPosition: Int,*/ position: Int,
                                data: CategoryListModel,
                                viewModel: HealthArticlesViewModel
        ) = with(binding){
            categoryModel = data
            healthArticlesViewModel = viewModel
        }

    }

}