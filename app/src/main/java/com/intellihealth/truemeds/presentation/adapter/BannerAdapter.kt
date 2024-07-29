package com.intellihealth.truemeds.presentation.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.BannerCallback
import com.intellihealth.salt.callbacks.BannerClickCallback
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.mixpanel.MxHomePageBannerClick
import com.intellihealth.truemeds.databinding.AdapterBannerItemBinding
import com.intellihealth.truemeds.domain.model.mapToBannerList
import com.intellihealth.truemeds.domain.navigation.navigateToSearchSuggestionActivity
import com.intellihealth.truemeds.presentation.activity.BaseActivity
import com.intellihealth.truemeds.presentation.utils.BundleConstants
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import com.intellihealth.truemeds.presentation.viewmodel.events.Event

class BannerAdapter(
    var bannerList: List<BannerItemModel> = ArrayList(),
    val homeViewModel: HomeViewModel,
    val context: Context
) : RecyclerView.Adapter<BannerAdapter.ItemViewHolder>() {
    private var isBannerDataSet = false
    private lateinit var binding: AdapterBannerItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_banner_item,
            parent, false
        )
        setData(homeViewModel.bannerList.value?.mapToBannerList() ?: arrayListOf())
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        if (!isBannerDataSet && bannerList.isNotEmpty()) {
            holder.binding.tmBanner.setBannerData(bannerList,
                object : BannerCallback {
                    override fun getBannerSwipe() {}
                    override fun getBannerClick(bannerPosition: Int) {
                        val apiBannerObj = homeViewModel.bannerList.value?.get(position)
                        if (apiBannerObj != null) {
                            homeViewModel.sendHomePageBannerClickedEvent(
                                MxHomePageBannerClick(
                                    bannerIndex = bannerPosition + 1,
                                    imageName = homeViewModel.bannerList.value?.get(position)?.description
                                )
                            )
                        }
                    }

                    override fun getBannerPosition(position: Int) {
                        homeViewModel.currentBannerIndex = position
                        homeViewModel.addBannerImpression(
                            homeViewModel.bannerList.value!!,
                            position
                        )
                        holder.binding.pgIndicator.setActivePage(position)
                    }

                }, 5, object : BannerClickCallback {
                    override fun onBannerClick(position: Int) {
                        try {
                            val apiBannerObj = homeViewModel.bannerList.value?.get(position)
                            if (apiBannerObj != null) {
                                if (apiBannerObj.redirectTo == "search") {
                                    homeViewModel.srpPageSectionFromDeeplink =
                                        "homepage_banner_" + bannerList[position]
                                    if (!apiBannerObj.searchTerm.isNullOrEmpty()) {
                                        homeViewModel.openSearchProduct.postValue(
                                            Event(
                                                Pair(
                                                    apiBannerObj.searchTerm ?: "",
                                                    apiBannerObj.searchType ?:"original_company_nm"
                                                )
                                            )
                                        )
                                    } else {
                                      /*  context.startActivity(
                                            Intent(context, SearchSuggestionActivity::class.java)
                                                    .addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                                                .putExtra(
                                                    BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE,
                                                    "home_page"
                                                )
                                                .putExtra(
                                                    BundleConstants.BUNDLE_KEY_PAGE_SECTION,
                                                    "homepage_banner_" + bannerList[position]
                                                )
                                        )*/

                                        context.navigateToSearchSuggestionActivity(
                                            params = bundleOf(
                                                BundleConstants.BUNDLE_KEY_CLICKED_ON_PAGE to "home_page",
                                                BundleConstants.BUNDLE_KEY_PAGE_SECTION to "homepage_banner_" + bannerList[position]
                                            ),
                                            flags= listOf(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT)
                                        )
                                    }
                                }
                                homeViewModel.sendHomePageBannerClickedEvent(
                                    MxHomePageBannerClick(
                                        bannerIndex = position + 1,
                                        imageName = apiBannerObj.description ?: ""
                                    )
                                )
                            }
                        } catch (_: Exception) {
                        }

                    }
                }, true
            )
            isBannerDataSet = true
        }
    }

    override fun getItemCount(): Int = 1

    class ItemViewHolder(binding: AdapterBannerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterBannerItemBinding

        init {
            this.binding = binding
        }
    }

    fun setData(responseApi: List<BannerItemModel>) {
        isBannerDataSet = false
        this.bannerList = responseApi
    }

    fun setDataAndNotify(responseApi: List<BannerItemModel>) {
        setData(responseApi)
        notifyDataSetChanged()
    }
}