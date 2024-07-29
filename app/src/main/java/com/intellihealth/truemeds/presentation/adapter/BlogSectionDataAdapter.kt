package com.intellihealth.truemeds.presentation.adapter

import android.text.Html
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.MainThread
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.BlogSectionDataModel
import com.intellihealth.truemeds.databinding.AdapterBlogSectionItemBinding
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.salt.callbacks.BlogCardCallback
import com.intellihealth.salt.models.BlogCardModel
import com.intellihealth.truemeds.presentation.fragment.HomeFragment
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants


class BlogSectionDataAdapter(
    private var blogSectionDataModel: BlogSectionDataModel?,
    val homeViewModel: HomeViewModel,
    val showShimmer: Boolean,
    val context: HomeFragment,

    ) : RecyclerView.Adapter<BlogSectionDataAdapter.ItemViewHolder>() {

    private lateinit var binding: AdapterBlogSectionItemBinding
    private var previousListSize = 0
    private var shimmerState = false
    private lateinit var viewHolder: ItemViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        previousListSize = 0
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_blog_section_item,
            parent, false
        )
        binding.tmBlog.setCallBack(object : BlogCardCallback {
            override fun viewClickCallback(blogModel: BlogCardModel) {
                homeViewModel.blogCardViewClickCallback("card clicked", blogModel)
            }

            override fun readClickCallback(blogModel: BlogCardModel) {
                homeViewModel.blogCardArticleReadCallback("read clicked", blogModel)
            }

            override fun viewAllClickCallback() {
                homeViewModel.blogCardViewAllClick("view all clicked")
            }
        })

        var blogDataResponse = BlogSectionDataModel(
            id = 9,
            type = HomeSectionConstants.BLOG_SECTION_CARD,
            blogModel = homeViewModel.blogDataModel
        )

        setDataAndNotify(blogDataResponse, false)
        manageShimmer()
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //if (blogSectionDataModel?.blogModel != null) {
//            blogSectionDataModel!!.blogModel?.let {
//                binding.tmBlog.setCallBack(object : BlogCardCallback {
//                    override fun viewClickCallback(blogModel: BlogCardModel) {
//                        homeViewModel.blogCardViewClickCallback("card clicked", blogModel)
//                    }
//
//                    override fun readClickCallback(blogModel: BlogCardModel) {
//                        homeViewModel.blogCardArticleReadCallback("read clicked", blogModel)
//                    }
//
//                    override fun viewAllClickCallback() {
//                        homeViewModel.blogCardViewAllClick("view all clicked")
//                    }
//                })
//
//                //handle health article shimmer visibility
                homeViewModel.healthArticleShimmerState.observe(context){
                    binding.tmBlog.showShimmer(it)
                }
//
//            }


        //}

        viewHolder = holder
        manageShimmer()
    }

    override fun getItemCount(): Int = 1

    class ItemViewHolder(binding: AdapterBlogSectionItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterBlogSectionItemBinding

        init {
            this.binding = binding
        }
    }

    fun setDataAndNotify(responseApi: BlogSectionDataModel, isNotify: Boolean = true) {
        if (::binding.isInitialized) {
            this.blogSectionDataModel = responseApi
            blogSectionDataModel!!.blogModel?.let {
                binding.tmBlog.setUpData(it)
            }
            if (isNotify)
                notifyDataSetChanged()
        }
    }

    @MainThread
    fun toggleShimmer(isShimmerVisible: Boolean){
        shimmerState = isShimmerVisible
        manageShimmer()
    }

    private fun manageShimmer() {
        if (this::binding.isInitialized && this::viewHolder.isInitialized) {
            viewHolder.binding.tmBlog.showShimmer(shimmerState)
        }
    }
}