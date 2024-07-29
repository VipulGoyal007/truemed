package com.intellihealth.truemeds.presentation.bindingadapter

import android.annotation.SuppressLint
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.data.model.healtharticles.HealthArticleChipCategoryData
import com.intellihealth.truemeds.presentation.adapter.HealthArticleChipsAdapter
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel

@SuppressLint("NotifyDataSetChanged")
@BindingAdapter("setHealthArticleChipCategoryList","healthArticlesViewModel")
fun setHealthArticleChipCategoryList(
    view: RecyclerView,
    list: List<com.intellihealth.salt.models.HealthArticleChipCategoryData>,
    viewModel: HealthArticlesViewModel)
{
    view.adapter?.run {
        //notify
        if (this is HealthArticleChipsAdapter) {
            this.healthArticlesCategoryList = list;
            this.viewmodel = viewModel;
            this.notifyDataSetChanged()
        }
    } ?: run {
        view.adapter = HealthArticleChipsAdapter(list,viewModel)
    }
}