package com.intellihealth.truemeds.presentation.adapter

import android.graphics.Rect
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.MainThread
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.intellihealth.salt.models.ProductCardSectionChipModel
import com.intellihealth.salt.models.ProductCardSectionModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.salt.views.Toast
import com.intellihealth.salt.views.section.ProductCardSection
import com.intellihealth.truemeds.R
import com.intellihealth.truemeds.data.callback.DeleteCallback
import com.intellihealth.truemeds.data.model.home.ProductCardDataModel
import com.intellihealth.truemeds.databinding.AdapterProductCardStackedItemBinding
import com.intellihealth.truemeds.domain.enums.ProductCardSectionType
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.bottomsheet.search.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.fragment.HomeFragment
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.ApiParameterConstants
import com.intellihealth.truemeds.presentation.utils.AppConstants.PRODUCT_SECTION_MAX_PAGE_COUNT
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.DateUtils
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Date

class ProductCardStackedAdapter(
    var productCardDataModel: ProductCardDataModel?,
    val homeViewModel: HomeViewModel,
    private val fragmentManager: FragmentManager?,
    private var crSellingClick : HomeFragment.CrossSellingClick

) : RecyclerView.Adapter<ProductCardStackedAdapter.ItemViewHolder>() {

    var previousListSize = 0
    private lateinit var binding: AdapterProductCardStackedItemBinding
    val newArrivalList = arrayListOf<ProductInfoModel>()
    var limitedOfferList = arrayListOf<ProductInfoModel>()
    var isApiDataEmpty = false
    var trendingSectionCallback: ProductCardSection.ProductCardSectionCallback? = null
    var pageIndex = 0
    var pageIndexStacked = 0
    private var shimmerState = false
    private lateinit var viewHolder: ItemViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        previousListSize = 0
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_product_card_stacked_item,
            parent, false
        )
        val responseApi = ProductCardDataModel(
            id = 8,
            type = HomeSectionConstants.STACKED_PRODUCT_CARD,
            null, homeViewModel.limitedTimeOfferResponse, homeViewModel.newArrivalResponse
        )
        setData(responseApi)
        getScrollPosition()
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        /*holder.binding.productCardStackedSection.visibility = View.VISIBLE
        holder.binding.productCardStackedSection.layoutParams.height =
            ViewGroup.LayoutParams.WRAP_CONTENT
        holder.binding.productCardStackedSection.layoutParams.width =
            ViewGroup.LayoutParams.MATCH_PARENT*/
        viewHolder = holder
        manageShimmer()

    }

    private fun getItemParentList(productCode: String): ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>? {
        val isInLimitedOffer = isContainsInLimitedOffer(limitedOfferList, productCode)
        var selectedList: ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel>? =
            null
        if (isInLimitedOffer) {
            selectedList =
                productCardDataModel?.productCardLimitedOfferModel?.responseData?.LIMITED_OFFER
        } else {
            selectedList =
                productCardDataModel?.productCardNewArrivalModel?.responseData?.NEW_ARRIVAL
        }
        return selectedList
    }

    override fun getItemCount(): Int = 1

    class ItemViewHolder(binding: AdapterProductCardStackedItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterProductCardStackedItemBinding

        init {
            this.binding = binding
        }
    }

    fun setDataAndNotify(responseApi: ProductCardDataModel?, isApiDataEmpty: Boolean = false, crSellingClick : HomeFragment.CrossSellingClick,
                         pageCount:Int=0) {
        if (this::binding.isInitialized) {
            setData(responseApi,pageCount)
            this.crSellingClick = crSellingClick
        }
    }

    private fun setData(responseApi: ProductCardDataModel?, pageCount:Int=0) {
        this.productCardDataModel = responseApi
        this.isApiDataEmpty = isApiDataEmpty
        previousListSize = limitedOfferList.size + newArrivalList.size
        limitedOfferList.clear()
        newArrivalList.clear()
        binding.productCardStackedSection.setMaxPageSize(PRODUCT_SECTION_MAX_PAGE_COUNT)
        productCardDataModel?.productCardLimitedOfferModel?.responseData?.LIMITED_OFFER?.let {
            if (!it.isNullOrEmpty()) {
               // limitedOfferList.clear()
                for (i in 0..<it.size) {
                    limitedOfferList.add(it[i].toSdkObject())
                }
            }
        }
        productCardDataModel?.productCardNewArrivalModel?.responseData?.NEW_ARRIVAL?.let {
            if (!it.isNullOrEmpty()) {
                for (i in 0..<it.size) {
                    newArrivalList.add(it[i].toSdkObject())
                }
            }
        }

        val dataModelStacked = ProductCardSectionModel(
            productCardHeader = "Deals you’ll love ❤\uFE0F",
            productCardSubtitle = "Buy now to get the best deals",
            // list = getProductCards().productCardModel?.list!!,
            list = limitedOfferList,
            productCardStackedHeader = "New on Truemeds \uD83D\uDE80",
            productCardStackedSubtitle = "Discover new wellness products",
            stackedList = newArrivalList,
            timerInMillis = DateUtils.convertEpochTimeStampToDateMillis(
                DateUtils.getEndOfDay(Date(System.currentTimeMillis())),
                System.currentTimeMillis()
            ),
            minDiscountValue = SharedPrefManager.getInstance().minMedDiscountToBeHidden
        )


        trendingSectionCallback = object : ProductCardSection.ProductCardSectionCallback {
            override fun cartItemMinus(data: ProductInfoModel, pos: Int, qty: Int) {
                var selectedList = getItemParentList(data.product.productCode)
                /*if (qty > 0) {
                    selectedList?.let {
                        selectedList =
                            homeViewModel.getUpdatedListFromDatabase(selectedList)
                        if (!selectedList.isNullOrEmpty() && pos < selectedList?.size!!) {
                            val orgInfoModel = selectedList!![pos] ?: null
                            orgInfoModel.let {
                                if (it != null) {
                                    homeViewModel.deleteProductItemFromDatabase(it, qty)
                                }
                            }
                        }
                    }
                }*/

                selectedList?.let {
                    if (selectedList.isNotEmpty() && pos < selectedList.size) {
                        if (qty == 0) {
                            homeViewModel.removeItemFromCart(selectedList[pos], false)
                        } else {
                            homeViewModel.updateQuantity(selectedList[pos], qty)
                            homeViewModel.viewModelScope.launch(Dispatchers.IO) {
                                // since updateQuantity having its own coroutine we need to hold the reload execution before updateQuantity function execution
                                delay(2000)
                                homeViewModel.reloadHomePageProductsForYourMedicineAndTrendingInCity()
                            }
                        }
                    }
                    alsoUpdateQuantityInMainList(position = pos, productInfoModel = selectedList[pos], qty = qty)
                }
            }

            override fun cartItemPlus(data: ProductInfoModel, pos: Int, qty: Int) {
                val selectedList = getItemParentList(data.product.productCode)
                /*selectedList?.let {
                    if (selectedList.isNotEmpty() && pos < selectedList.size) {
                        val orgInfoModel = selectedList[pos]
                        orgInfoModel.let {
                            homeViewModel.addProductItemFromDatabase(it, qty)
                        }
                    }
                }*/

                selectedList?.let {
                    if (selectedList.isNotEmpty() && pos < selectedList.size) {
                        if (qty == 1) {
                            var itemAdded = MxItemAdded()
                            itemAdded.clickedOnPage = "homepage"
                            itemAdded.sectionIndex = pos + 1
                            itemAdded.pageSection = "tray"




                            when (isContainsInLimitedOffer(limitedOfferList, data.product.productCode)) {
                                true ->  itemAdded.sectionHeading = "limited_offer"
                                false ->  itemAdded.sectionHeading = "new_arrivals"
                                else -> itemAdded.sectionHeading = "new_arrivals"
                            }
                            var row = if((pos+1) % 2 == 0) 2 else 1
                            itemAdded.sectionRow = row
                            homeViewModel.addToCart(selectedList[pos], false, qty, itemAdded)
                        } else {
                            homeViewModel.updateQuantity(selectedList[pos], qty)
                        }
                        alsoUpdateQuantityInMainList(position = pos, productInfoModel = selectedList[pos], qty = qty)
                        //homeViewModel.reloadHomePageProductsForYourMedicineAndTrendingInCity()
                        homeViewModel.viewModelScope.launch(Dispatchers.IO) {
                            // since updateQuantity having its own coroutine we need to hold the reload execution before updateQuantity function execution
                            delay(2000)
                            homeViewModel.reloadHomePageProductsForYourMedicineAndTrendingInCity()
                        }
                    }
                }

            }

            override fun chipListItemClicked(
                position: Int,
                item: ProductCardSectionChipModel?
            ) {
                Log.e("limited_item_click:::", "chipsItemClicked::" + position.toString())
            }

            override fun deleteAlert(data: ProductInfoModel, pos: Int, qty: Int) {

                val selectedList = getItemParentList(data.product.productCode)
                selectedList?.let {
                    if (selectedList.isNotEmpty() && pos < selectedList.size!!) {
                        val orgInfoModel = selectedList[pos]
                        /*homeViewModel.productCardStackedDeleteData.postValue(
                            HomeOtcDbAddDelete(
                                orgInfoModel,
                                pos,
                                isContainsInLimitedOffer(
                                    limitedOfferList,
                                    data.product.productCode
                                )
                            )
                        )*/

                        val removeProductBottomSheet =
                            RemoveProductBottomSheet(object : DeleteCallback {
                                override fun yesClick() {
                                    homeViewModel.removeItemFromCart(
                                        orgInfoModel,
                                        false,
                                        ApiParameterConstants.CONST_LIST_NEW_ARRIVALS
                                    )
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
                Log.d("qwerty_component","lastVisibleItemPosition limited offers : $pos")
                homeViewModel.lastScrollPositionLimitedOffers = pos
            }

            override fun lastScrollPosition2(pos: Int) {
                Log.d("qwerty_component","lastVisibleItemPosition new arrival : $pos")
                homeViewModel.lastScrollPositionNewArrivals = pos
            }

            override fun reachedToLastItem() {
                if (homeViewModel.hasMoreLimitedOfferPages) {
                    pageIndex++
                    homeViewModel.viewModelScope.launch(Dispatchers.IO) { homeViewModel.callBothStackedProductApi(pageIndex, productType = ProductCardSectionType.TOP) }
                }
                else {
                        binding.productCardStackedSection.stopMedsLoading()
                }
            }

            override fun reachedToLastStackedItem() {
                if (homeViewModel.hasMoreNewArrivalsPages) {
                    pageIndexStacked++
                    homeViewModel.viewModelScope.launch(Dispatchers.IO) { homeViewModel.callBothStackedProductApi(pageIndexStacked, productType = ProductCardSectionType.STACKED) }
                }
                else {
                    binding.productCardStackedSection.stopStackLoading()
                }
            }

            override fun stepperError(data: ProductInfoModel, pos: Int, msg: String?) {
            }

            override fun viewAllClicked() {
                homeViewModel.viewAllLimitedOfferlick()
                homeViewModel.crossSellingClick = crSellingClick
            }

            override fun viewAllStackedClicked() {
                homeViewModel.viewAllNewArrivalClick()
            }


        }

        if (trendingSectionCallback != null && ::binding.isInitialized)
            binding.productCardStackedSection.setCallback(trendingSectionCallback!!)

        if (previousListSize == 0) {
            binding.productCardStackedSection.setProductCardSectionData(dataModelStacked)
        } else {
            binding.productCardStackedSection.reloadProductList(limitedOfferList)
            binding.productCardStackedSection.reloadStackProductList(newArrivalList)
        }
        if(pageCount==0){
         //   homeViewModel.hasMoreLimitedOfferPages=true
         //   homeViewModel.hasMoreNewArrivalsPages=true
            Log.e("list_scrolled_to_start","::::yesss")
            binding.productCardStackedSection.setStackedListSmoothScrollToStart()}
        manageShimmer()
    }

    private fun alsoUpdateQuantityInMainList(
        position: Int,
        productInfoModel: com.intellihealth.truemeds.presentation.model.ProductInfoModel,
        qty: Int,
    ) {
        val isInLimitedOffer = isContainsInLimitedOffer(limitedOfferList, productInfoModel.product.productCode)
        if (isInLimitedOffer) {
            productCardDataModel?.productCardLimitedOfferModel?.responseData?.LIMITED_OFFER?.get(position)?.product?.qty = qty
        } else {
            productCardDataModel?.productCardNewArrivalModel?.responseData?.NEW_ARRIVAL?.get(position)?.product?.qty = qty
        }
    }

    private fun isContainsInLimitedOffer(
        list: List<ProductInfoModel?>,
        productCode: String?
    ): Boolean {
        for (model in list) {
            if (model?.product?.productCode.equals(productCode)) {
                return true
            }
        }
        return false
    }

    private fun getScrollPosition() {
        binding.productCardStackedSection.viewTreeObserver.addOnScrollChangedListener {
            val scrollBounds = Rect()
            binding.productCardStackedSection.getHitRect(scrollBounds)
            if (binding.productCardStackedSection.getLocalVisibleRect(scrollBounds)) {
                homeViewModel.newArrivalAndLimittedOfferView = true
            }
        }
    }

    @MainThread
    fun toggleShimmer(isShimmerVisible: Boolean){
        shimmerState = isShimmerVisible
        manageShimmer()
    }

    private fun manageShimmer() {
        if (this::binding.isInitialized && this::viewHolder.isInitialized) {
            Log.d("CardStackedSection", "binding isInitialized 1")
            viewHolder.binding.productCardStackedSection.showShimmer(shimmerState)
        }
    }
}