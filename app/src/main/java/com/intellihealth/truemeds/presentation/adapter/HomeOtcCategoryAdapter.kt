package com.intellihealth.truemeds.presentation.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.os.bundleOf
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.intellihealth.salt.utils.StartSnapHelper
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel
import com.intellihealth.truemeds.databinding.AdapterSuperCategoryBinding
import com.intellihealth.truemeds.domain.navigation.navigateToOtcCategoryActivity
import com.intellihealth.truemeds.presentation.activity.OtcCategoryActivity
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc.changeBackgroundView
import com.intellihealth.truemeds.presentation.utils.CommonFunc.removeViewBg
import com.intellihealth.truemeds.presentation.utils.CommonFunc.smoothSnapToPosition
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel

class HomeOtcCategoryAdapter(
    var list: List<SuperCategoryModel> = emptyList(),
    var homeViewModel: HomeViewModel,
    var viewLifecycleOwner: LifecycleOwner
) : RecyclerView.Adapter<HomeOtcCategoryAdapter.ViewHolder>() {
    var prevPos = -1
    var selectedCategory = 1
    private var isSameCellClicked:Boolean= false

    companion object {
        var superCategoryImage: String? = ""
        var superCategoryName: String? = ""
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        AdapterSuperCategoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {

            binding.superCategoryList = list
            if (list.isNotEmpty()) {
                binding.categoryLevel2List = list[0].categoryLevel2List
                binding.position = 0
            }else{
                binding.categoryLevel2List = emptyList()
            }
            binding.position = selectedCategory
            binding.viewModel = homeViewModel
            if (list.isNotEmpty()) {
                binding.btnViewAll.setOnClickListener {
                    val categoryList = Gson().toJson(list[selectedCategory].categoryLevel2List)
                    val bannerList = Gson().toJson(list[selectedCategory].banners)
                    it.context.navigateToOtcCategoryActivity(
                        params = bundleOf(
                            BundleConstants.CATEGORY_ID to list[selectedCategory].id,
                            BundleConstants.POSITION to 0,
                            BundleConstants.CATEGORY_TYPE to list[selectedCategory].type,
                            BundleConstants.CATEGORY_LIST to categoryList,
                            BundleConstants.TYPE to "All",
                            BundleConstants.SUPER_CAT_ID to list[selectedCategory].id,
                            BundleConstants.OTC_BANNERS to  bannerList,
                            BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to  "homepage"
                        )
                    )
                }
        }
            homeViewModel.eventSuperCategoryClick.observe(viewLifecycleOwner) { index ->
                if(list.isNotEmpty()) {
                    isSameCellClicked = binding.position == index.first
                    binding.position = index.first
                    selectedCategory = index.first

                    homeViewModel.selectedCategory = index.first
                    binding.categoryLevel2List = list[index.first].categoryLevel2List
                    superCategoryImage = list[index.first].image ?: ""
                    list[index.first].name?.let {
                        binding.superCategory = "View all $it products"
                        superCategoryName = it
                    }
                    binding.rvSuperCategory.smoothSnapToPosition(index.second, -1)
                    if(!isSameCellClicked) {
                        val anim = AnimationUtils.loadAnimation(
                            binding.rvCategory.context,
                            R.anim.slide_in_right
                        )
                        binding.rvCategory.startAnimation(anim)
                    }
                }
            }

            initCategoryRecycler(binding, binding.llCategory)

        }
    }

    private fun initCategoryRecycler(
        binding: AdapterSuperCategoryBinding,
        container: ConstraintLayout
    ) {
        val otcLayoutManager = binding.rvSuperCategory.layoutManager as LinearLayoutManager
        binding.rvSuperCategory.layoutManager = otcLayoutManager
        try {
            StartSnapHelper().attachToRecyclerView(binding.rvSuperCategory)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        binding.rvSuperCategory.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                var pos = -1
                var listPosition = -1
                try {
                    pos = otcLayoutManager.findFirstCompletelyVisibleItemPosition()
                    listPosition = pos % list.size
                    binding.position = listPosition
                    selectedCategory = listPosition
                    homeViewModel.selectedCategory = listPosition
                    binding.categoryLevel2List = list[listPosition].categoryLevel2List
                    superCategoryImage = list[listPosition].image ?: ""

                    list[listPosition].name?.let {
                        binding.superCategory = "View all $it products"
                        superCategoryName = it
                    }

                    changeBackgroundView(
                        recyclerView.context,
                        listPosition,
                        otcLayoutManager.findViewByPosition(pos)!!.findViewById(R.id.clSuperMain),
                        recyclerView.context.getDrawable(R.drawable.background_top_rounded_blue)!!
                    )
                    changeBackgroundView(
                        recyclerView.context,
                        listPosition,
                        container,
                        recyclerView.context.getDrawable(R.drawable.background_rounded_blue_corner_12)!!
                    )

                    //note:- to prevent same position trigger again
                    if (prevPos == pos) {
                        return
                    }
                    if (otcLayoutManager.findViewByPosition(pos) == null) return


                } catch (_: Exception) {
                }

                //note:- update card accordingly
                //note:- infinite scroll
                if (prevPos == -1) {
                    prevPos = pos
                    return
                }
                homeViewModel.sendCategoryAndSuperCategoryData()
                for (i in otcLayoutManager.findFirstVisibleItemPosition()
                    .coerceAtMost(pos - 1) until otcLayoutManager.findLastVisibleItemPosition() + 2) {
                    try {
                        if (i != pos) {
                            if (otcLayoutManager.findViewByPosition(i)!!
                                    .findViewById<View>(R.id.clSuperMain).background.constantState === recyclerView.context.resources.getDrawable(
                                    R.drawable.background_top_rounded_blue
                                ).constantState
                            ) {
                                removeViewBg(
                                    otcLayoutManager.findViewByPosition(i)!!
                                        .findViewById(R.id.clSuperMain)
                                )
                                removeViewBg(
                                    otcLayoutManager.findViewByPosition(i)!!
                                        .findViewById(R.id.ivSuperImg)
                                )
                            }
                        }
                    } catch (ignore: java.lang.Exception) {
                        ignore.message
                    }
                }
                prevPos = pos

            }

        })
    }

    fun setData(responseApi: List<SuperCategoryModel>) {
        this.list = emptyList()
        this.list = responseApi
        Log.e(
            "SuperCategoryModel::222", this.list.toString()
        )
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: AdapterSuperCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}