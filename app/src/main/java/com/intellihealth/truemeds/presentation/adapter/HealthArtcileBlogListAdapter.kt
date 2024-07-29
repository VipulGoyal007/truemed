package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.BlogCardCallback
import com.intellihealth.salt.models.BlogCardModel
import com.intellihealth.salt.models.BlogModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.BlogSectionDataModel
import com.intellihealth.truemeds.databinding.AdapterBlogSectionItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel


class HealthArtcileBlogListAdapter (
    var blogSectionDataModel: BlogSectionDataModel?,
    var homeViewModel: HealthArticlesViewModel
) : RecyclerView.Adapter<HealthArtcileBlogListAdapter.ItemViewHolder>() {

    private lateinit var binding: AdapterBlogSectionItemBinding
    private val userModalArrayList: List<BlogModel> = listOf(blogSectionDataModel?.blogModel!!)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_blog_section_item,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        if (blogSectionDataModel?.blogModel != null) {
            blogSectionDataModel!!.blogModel?.let {
                binding.tmBlog.setCallBack(object : BlogCardCallback {

                    override fun readClickCallback(blogModel: BlogCardModel) {
                        homeViewModel.healthArticleClick(blogModel)
                    }

                    override fun viewAllClickCallback() {
                        TODO("Not yet implemented")
                    }

                    override fun viewClickCallback(blogModel: BlogCardModel) {
                        homeViewModel.healthArticleClick(blogModel)
                    }
                })

                binding.tmBlog.hideViewAllCta(false)
                binding.tmBlog.setUpData(
                    it
                )
            }


        }
    }

    override fun getItemCount(): Int = userModalArrayList.size

    class ItemViewHolder(binding: AdapterBlogSectionItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterBlogSectionItemBinding
        init { this.binding = binding }
    }
}