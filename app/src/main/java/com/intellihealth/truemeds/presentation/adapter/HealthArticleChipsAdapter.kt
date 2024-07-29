package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.healtharticles.HealthArticleChipCategoryData
import com.intellihealth.truemeds.databinding.HealthArticleChipItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel

class HealthArticleChipsAdapter(
    var list: List<com.intellihealth.salt.models.HealthArticleChipCategoryData>,
    viewModel: HealthArticlesViewModel
) :  RecyclerView.Adapter<HealthArticleChipsAdapter.HealthArticlesCategoryMyViewHolder>() {
    lateinit var binding : HealthArticleChipItemBinding;
    var healthArticlesCategoryList: List<com.intellihealth.salt.models.HealthArticleChipCategoryData> = list
    var viewmodel: HealthArticlesViewModel? = viewModel

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HealthArticlesCategoryMyViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.health_article_chip_item, parent, false)
        return HealthArticlesCategoryMyViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: HealthArticlesCategoryMyViewHolder,
        position: Int
    ) {
        val current = healthArticlesCategoryList[position]
        current?.let {
            holder.bindingCategoryData(it.mapToHealthArticleAdapter())
        }
    }

    override fun getItemCount(): Int {
        return healthArticlesCategoryList.size
    }

    inner class HealthArticlesCategoryMyViewHolder(private val binding: HealthArticleChipItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindingCategoryData(data: HealthArticleChipCategoryData) = with(binding){
            /*categoryModel = data
            healthArticlesViewModel = viewModel*/
            binding.chipTitle.text = data.category
            binding.chipTitle.setOnClickListener{
                viewmodel?.isItemClick?.value = data
                viewmodel?.sendArticlesCategorySectionViewedEventToMixpanel("article_page",data.category?:"",data.id)
            }
        }
    }

}
fun com.intellihealth.salt.models.HealthArticleChipCategoryData.mapToHealthArticleAdapter(): HealthArticleChipCategoryData {
    return HealthArticleChipCategoryData(
        id = this.id,
        category = this.category,
    )

}

