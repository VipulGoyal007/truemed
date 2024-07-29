package com.intellihealth.truemeds.presentation.adapter

import android.graphics.Rect
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.MainThread
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.ProductCardSectionChipModel
import com.intellihealth.salt.models.ProductCardSectionModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.views.section.ProductCardSection
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.DeleteCallback
import com.intellihealth.truemeds.data.model.home.ProductCardDataModel
import com.intellihealth.truemeds.databinding.AdapterProductCardItemBinding
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.bottomsheet.search.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.fragment.HomeFragment
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.ApiParameterConstants
import com.intellihealth.truemeds.presentation.utils.AppConstants.PRODUCT_SECTION_MAX_PAGE_COUNT
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ProductCardAdapter(
    private var productCardDataModel: ProductCardDataModel?,
    val homeViewModel: HomeViewModel,
    private val fragmentManager: FragmentManager?,
    private val crSellingClick : HomeFragment.CrossSellingClick
) : RecyclerView.Adapter<ProductCardAdapter.ItemViewHolder>() {
    private var previousListSize = 0
    private lateinit var binding: AdapterProductCardItemBinding
    val productList = arrayListOf<ProductInfoModel>()
    var isApiDataEmpty = false
    var pageIndex = 0
    var trendingSectionCallback: ProductCardSection.ProductCardSectionCallback? = null
    private var shimmerState = false
    private lateinit var viewHolder: ItemViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        previousListSize = 0
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_product_card_item,
            parent, false
        )
        val responseApi = ProductCardDataModel(
            id = 7,
            type = HomeSectionConstants.DEFAULT_PRODUCT_CARD,
            homeViewModel.trendingInCityResponse, null, null
        )

        setData(responseApi)
        getScrollPosition()
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//        holder.binding.productCardSection.visibility = View.VISIBLE
        /*holder.binding.productCardSection.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
        holder.binding.productCardSection.layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT*/
        holder.binding.productCardSection.setMaxPageSize(PRODUCT_SECTION_MAX_PAGE_COUNT)
        if(::viewHolder.isInitialized) {
            viewHolder = holder
        }
        manageShimmer()
    }

    override fun getItemCount(): Int = 1

    class ItemViewHolder(binding: AdapterProductCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterProductCardItemBinding

        init {
            this.binding = binding
        }
    }

    fun setDataAndNotify(responseApi: ProductCardDataModel?, isApiDataEmpty: Boolean = false) {
        if (this::binding.isInitialized) {
            setData(responseApi)
        }
    }

    @MainThread
    fun toggleShimmer(isShimmerVisible: Boolean){
        shimmerState = isShimmerVisible
        manageShimmer()
    }

    private fun setData(responseApi: ProductCardDataModel?) {
        try {
            this.productCardDataModel = responseApi
            this.isApiDataEmpty = isApiDataEmpty
            previousListSize = productList.size
            productList.clear()

            productCardDataModel?.productCardModel?.responseData?.TRENDING_IN_CITY?.let { list ->
                if (list.isEmpty()) return@let

                for (i in 0..<list.size) {
                    productList.add(list[i].toSdkObject())
                }
            }

            val dataModelStacked = ProductCardSectionModel(
                productCardHeader = "Popular items ✨",
                productCardSubtitle = "Items bought in your city",
                list = productList,
                minDiscountValue = SharedPrefManager.getInstance().minMedDiscountToBeHidden
        )

            trendingSectionCallback = object : ProductCardSection.ProductCardSectionCallback {
                override fun cartItemMinus(data: ProductInfoModel, pos: Int, qty: Int) {
                    val selectedList =
                        productCardDataModel?.productCardModel?.responseData?.TRENDING_IN_CITY
                    selectedList?.let {
                        if (selectedList.isNotEmpty() && pos < selectedList.size) {
                            if (qty == 0) {
                                homeViewModel.removeItemFromCart(selectedList[pos], false)
                            } else {
                                homeViewModel.updateQuantity(selectedList[pos], qty)
                                homeViewModel.viewModelScope.launch(IO) {
                                    // since updateQuantity having its own coroutine we need to hold the reload execution before updateQuantity function execution
                                    delay(2000)
                                    homeViewModel.reloadHomePageProductsForYourMedicineAndNewArrival()
                                }
                            }
                            productCardDataModel?.productCardModel?.responseData?.TRENDING_IN_CITY?.get(
                                pos
                            )?.product?.qty = qty
                        }
                    }
                }

                override fun cartItemPlus(data: ProductInfoModel, pos: Int, qty: Int) {
                    val selectedList =
                        productCardDataModel?.productCardModel?.responseData?.TRENDING_IN_CITY
                    selectedList?.let {
                        if (selectedList.isNotEmpty() && pos < selectedList.size) {
                            if (qty == 1) {
                                var itemAdded = MxItemAdded()
                                itemAdded.clickedOnPage = "homepage"
                                itemAdded.sectionIndex = pos + 1
                                itemAdded.pageSection = "tray"
                                itemAdded.sectionHeading = "trending_in_your_city"
                                var row = if((pos+1) % 2 == 0) 2 else 1
                                itemAdded.sectionRow = row
                                homeViewModel.addToCart(selectedList[pos], false, qty, itemAdded)
                            } else {
                                homeViewModel.updateQuantity(selectedList[pos], qty)
                            }
                            homeViewModel.viewModelScope.launch(IO) {
                                // since updateQuantity having its own coroutine we need to hold the reload execution before updateQuantity function execution
                                delay(2000)
                                homeViewModel.reloadHomePageProductsForYourMedicineAndNewArrival()
                            }
                        }
                        productCardDataModel?.productCardModel?.responseData?.TRENDING_IN_CITY?.get(
                            pos
                        )?.product?.qty = qty
                    }
                }

                override fun chipListItemClicked(position: Int, item: ProductCardSectionChipModel?) {
                }

                override fun deleteAlert(data: ProductInfoModel, pos: Int, qty: Int) {
                    val selectedList =
                        productCardDataModel?.productCardModel?.responseData?.TRENDING_IN_CITY
                    selectedList?.let {
                        if (selectedList.isNotEmpty() && pos < selectedList.size) {
                            val orgInfoModel = selectedList[pos]

                            val removeProductBottomSheet =
                                RemoveProductBottomSheet(object : DeleteCallback {
                                    override fun yesClick() {
                                        homeViewModel.removeItemFromCart(
                                            orgInfoModel,
                                            false,
                                            ApiParameterConstants.CONST_LIST_TRENDING
                                        )
                                        productCardDataModel?.productCardModel?.responseData?.TRENDING_IN_CITY?.get(
                                            pos
                                        )?.product?.qty = 0
                                    }

                                })
                            removeProductBottomSheet.isCancelable = true
                            if (!removeProductBottomSheet.isVisible && fragmentManager != null && isSingleClickParam())
                                removeProductBottomSheet.show(fragmentManager, "remove product")
                        }
                    }
                }

                override fun itemViewClick(productDetailModel: ProductInfoModel) {
                    homeViewModel.productCardStackedItemClicked(productDetailModel)
                }

                override fun lastScrollPosition(pos: Int) {
                    Log.d("qwerty_component","lastVisibleItemPosition trending : $pos")
                    homeViewModel.lastScrollPositionTrendingCity = pos

                }

                override fun reachedToLastItem() {
                    if (homeViewModel.hasMoreTrendingPages) {
                        pageIndex++
                        homeViewModel.viewModelScope.launch(Dispatchers.IO) {
                            homeViewModel.getHomepageOtcProducts(
                                ApiParameterConstants.CONST_LIST_TRENDING,
                                pageIndex
                            )
                        }
                    }
                    else {
                        binding.productCardSection.stopMedsLoading()
                    }
                }

                override fun reachedToLastStackedItem() {
                }

                override fun stepperError(data: ProductInfoModel, pos: Int, msg: String?) {
                }

                override fun viewAllClicked() {
                    homeViewModel.viewAllTrendingCityClick()
                    homeViewModel.crossSellingClick = crSellingClick
                }

                override fun viewAllStackedClicked() {
                }


            }
            manageShimmer()

            binding.productCardSection.setCallback(trendingSectionCallback!!)

            if (previousListSize == 0) {
                binding.productCardSection.setProductCardSectionData(dataModelStacked)
            } else {
                binding.productCardSection.reloadProductList(productList)
            }
        } catch (_: Exception) {
        }
    }

    private fun getScrollPosition() {
        binding.productCardSection.viewTreeObserver.addOnScrollChangedListener {
            val scrollBounds = Rect()
            binding.productCardSection.getHitRect(scrollBounds)
            if (binding.productCardSection.getLocalVisibleRect(scrollBounds)) {
                homeViewModel.trendingInYourCityView = true
            }
        }
    }

    private fun manageShimmer() {
        if (this::binding.isInitialized && this::viewHolder.isInitialized) {
            viewHolder.binding.productCardSection.showShimmer(shimmerState)
        }
    }
}