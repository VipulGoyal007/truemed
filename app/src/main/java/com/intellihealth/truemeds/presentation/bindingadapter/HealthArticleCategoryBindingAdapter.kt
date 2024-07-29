package com.intellihealth.truemeds.presentation.bindingadapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.home.CategoryListModel
import com.intellihealth.truemeds.presentation.adapter.HealthArticleAdapter
import com.intellihealth.truemeds.presentation.adapter.HealthArticleCategoryItemAdapter
import com.intellihealth.truemeds.presentation.model.BlogCardModel
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel

@BindingAdapter("setHealthArticleList", "healthArticlesViewModel")
fun setHealthArticleList(
    view: RecyclerView,
    list: List<BlogCardModel?>?,
    viewModel: HealthArticlesViewModel
) {
    view.adapter?.run {
        //notify
        if (this is HealthArticleAdapter) {
            this.itemList = list!!
            this.viewmodel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = list?.let {
            HealthArticleAdapter(it, viewModel)
        }
    }
}

@BindingAdapter("setHealthArticleCategoryList", "healthArticlesCategoryViewModel")
fun setHealthArticleCategoryList(
    view: RecyclerView,
    list: List<CategoryListModel>?,
    viewModel: HealthArticlesViewModel
) {
    view.adapter?.run {
        //notify
        if (this is HealthArticleCategoryItemAdapter) {
            this.healthArticlesCategoryList = list!!
            this.viewModel = viewModel
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = list?.let {
            HealthArticleCategoryItemAdapter(it, viewModel)
        }
        view.setHasFixedSize(true)
    }
}