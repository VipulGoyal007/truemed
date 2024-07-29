package com.intellihealth.truemeds.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.callbacks.BannerCallback
import com.intellihealth.salt.callbacks.BannerClickCallback
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel
import com.intellihealth.truemeds.databinding.AdapterBannerItemBinding
import com.intellihealth.truemeds.domain.model.mapToOTCBanner
import com.intellihealth.truemeds.presentation.adapter.HomeOtcCategoryAdapter.Companion.superCategoryName
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxBannerClicked
import com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel

class PersonalCareBannerAdapter(
    private val bannerList: List<SuperCategoryModel.BannersItem> = ArrayList(),
    private val viewModel: MyOrderViewModel,
) : RecyclerView.Adapter<PersonalCareBannerAdapter.ItemViewHolder>() {

    var items: List<SuperCategoryModel.BannersItem> = bannerList
    private lateinit var binding: AdapterBannerItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_banner_item,
            parent, false
        )
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.tmBanner.setBannerData(items.mapToOTCBanner(),
            object : BannerCallback {
                override fun getBannerSwipe() {}
                override fun getBannerClick(bannerPosition: Int) {

                }

                override fun getBannerPosition(position: Int) {
                    binding.pgIndicator.setActivePage(position)
                }

            }, 5, object : BannerClickCallback {
                override fun onBannerClick(position: Int) {
                    // pcn=_otc&supcat=2&cat=0&subcat=0&brand=ZANDU&_forward_params=1
                    val param = items[position].redirectUrl?.split("&")
                    val superCategoryId = param?.get(1)?.split("=")?.get(1)
                    val categoryId = param?.get(2)?.split("=")?.get(1)
                    val subCategoryId = param?.get(3)?.split("=")?.get(1)
                    val brandName = param?.get(4)?.split("=")?.get(1)
                    var brand = if (!brandName.isNullOrEmpty()) arrayListOf(param[4].split("=")[1]) else arrayListOf()
                    viewModel.isOTCBannerClicked = true
                    viewModel.getOtcProductsByCategory(
                        page = 0,
                        categoryID = superCategoryId?.toInt() ?: 1,
                        type = "LEVEL1",
                        collectionId = superCategoryId?.toInt() ?: 1,
                        isBrandOnly = false,
                        brands = brand,
                        bannerClickedFilterName = brandName
                    )
                    viewModel.appliedFilterCount.value = if (brand.isNotEmpty()) 1 else 0
                    viewModel.updateSelectedBrands(brand)
                        viewModel.sendHomePageBannerClickedEvent(
                            MxBannerClicked(
                                "product_list_page",
                                superCategoryName,
                                items[position].header,
                                items[position].image
                            )
                        )

                }

            })
    }

    override fun getItemCount(): Int = 1

    class ItemViewHolder(binding: AdapterBannerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterBannerItemBinding

        init {
            this.binding = binding
        }
    }
}