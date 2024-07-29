package com.intellihealth.truemeds.presentation.adapter

import android.graphics.Rect
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
import com.intellihealth.truemeds.data.model.home.PatientAndMedicineListModel
import com.intellihealth.truemeds.databinding.AdapterPatientMedicinesChipsItemBinding
import com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded
import com.intellihealth.truemeds.presentation.bottomsheet.search.RemoveProductBottomSheet
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import com.intellihealth.truemeds.presentation.utils.ApiParameterConstants
import com.intellihealth.truemeds.presentation.utils.CommonFunc
import com.intellihealth.truemeds.presentation.utils.CommonFunc.isSingleClickParam
import com.intellihealth.truemeds.presentation.utils.CommonFunc.toSdkProductModelList
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants
import com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class PatientListMedicinesListAdapter(
    var productCardDataModel: PatientAndMedicineListModel?,
    val homeViewModel: HomeViewModel,
    private val fragmentManager: FragmentManager?
) : RecyclerView.Adapter<PatientListMedicinesListAdapter.ItemViewHolder>() {

    private var previousListSize = 0
    var pageIndex = 0

    //private lateinit var binding: AdapterPatientMedicinesChipsItemBinding
    val chipList = ArrayList<ProductCardSectionChipModel>()
    val productList = arrayListOf<ProductInfoModel>()
    //var productListUpdated: List<ProductInfoModel> = listOf()

    private lateinit var binding: AdapterPatientMedicinesChipsItemBinding
    var sectionCallback: ProductCardSection.ProductCardSectionCallback? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        previousListSize = 0
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.adapter_patient_medicines_chips_item,
            parent, false
        )
        getScrollPosition()
        var responseApi = PatientAndMedicineListModel(
            id = 11,
            type = HomeSectionConstants.PATIENTANDMEDICINELIST,
            patientMedicinesListModel = homeViewModel.responsePatientMedicinesList
        )
        setData(responseApi)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        /*if (::binding.isInitialized) {
            holder.binding.productCardStackedSection.visibility = View.VISIBLE
            binding.productCardStackedSection.layoutParams.height =
                ViewGroup.LayoutParams.WRAP_CONTENT
            binding.productCardStackedSection.layoutParams.width =
                ViewGroup.LayoutParams.MATCH_PARENT

        }*/

    }

    override fun getItemCount() = 1

    class ItemViewHolder(val binding: AdapterPatientMedicinesChipsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        //val binding: AdapterPatientMedicinesChipsItemBinding

        fun bind(list: ProductCardSectionModel) {
            Log.d("TAG", "bind: orderlost " + list.list.size)
            binding.productCardStackedSection.setProductCardSectionData(
                list
            )

        }

        fun setCallbacks(trendingSectionPatientMedicinesCallback: ProductCardSection.ProductCardSectionCallback) {
            binding.productCardStackedSection.setCallback(
                trendingSectionPatientMedicinesCallback
            )
        }

        /*fun setMoreProductList(list: ArrayList<ProductInfoModel>) {
            binding.productCardStackedSection.setMoreProductList(
                productData = list.toSdkProductModelList(),
                isLoadMore = true
            )
            //binding.productCardStackedSection.setUpdatedProductListData(list)
        }*/

        fun setMaxPageSize(recordCount: Int) {
            binding.productCardStackedSection.setMaxPageSize(recordCount)
        }
        /*init {
            this.binding = binding
        }

         */
    }

    /*fun setProductList(productList: List<ProductInfoModel>) {
        productListUpdated = productList
        Log.e(
            "responseMedicines::222", productListUpdated.toString()
        )
        notifyDataSetChanged()
    }*/

    fun setData(responseApi: PatientAndMedicineListModel) {
        if (::binding.isInitialized) {
            binding.productCardStackedSection.setMaxPageSize(responseApi.patientMedicinesListModel?.responseData?.recordCount ?: 5)
            binding.productCardStackedSection.showShimmer(false)

            binding.productCardStackedSection.removeLoadingMore()

            this.productCardDataModel = responseApi
            var isChipListCreated = false
            previousListSize = productList.size
            productList.clear()

            sectionCallback = object : ProductCardSection.ProductCardSectionCallback {
                override fun cartItemMinus(
                    data: com.intellihealth.salt.models.ProductInfoModel,
                    pos: Int,
                    qty: Int
                ) {
                    val selectedList =
                        productCardDataModel?.patientMedicinesListModel?.responseData?.productList
                    selectedList?.let {
                        if (selectedList.isNotEmpty() && pos < selectedList.size) {
                            if (qty == 0) {
                                homeViewModel.removeItemFromCart(selectedList[pos], false)
                            } else {
                                homeViewModel.updateQuantity(selectedList[pos], qty)
                                homeViewModel.viewModelScope.launch(IO) {
                                    // since updateQuantity having its own coroutine we need to hold the reload execution before updateQuantity function execution
                                    delay(2000)
                                    homeViewModel.reloadHomePageProductsForTrendingCityAndNewArrival()
                                }
                            }
                            productCardDataModel?.patientMedicinesListModel?.responseData?.productList?.get(pos)?.product?.qty = qty
                        }
                    }
                }

                override fun cartItemPlus(
                    data: com.intellihealth.salt.models.ProductInfoModel,
                    pos: Int,
                    qty: Int
                ) {
                    val selectedList =
                        productCardDataModel?.patientMedicinesListModel?.responseData?.productList
                    selectedList?.let {
                        if (selectedList.isNotEmpty() && pos < selectedList.size) {
                            if (qty == 1) {
                                var itemAdded = MxItemAdded()
                                itemAdded.clickedOnPage = "homepage"
                                itemAdded.sectionIndex = pos + 1
                                itemAdded.pageSection = "tray"
                                itemAdded.sectionHeading = "your_medicine"
                                var row = if((pos+1) % 2 == 0) 2 else 1
                                itemAdded.sectionRow = row
                                homeViewModel.addToCart(selectedList[pos], false, qty, itemAdded)
                            } else {
                                homeViewModel.updateQuantity(selectedList[pos], qty)
                            }
                            productCardDataModel?.patientMedicinesListModel?.responseData?.productList?.get(pos)?.product?.qty = qty
                            homeViewModel.viewModelScope.launch(IO) {
                                // since updateQuantity having its own coroutine we need to hold the reload execution before updateQuantity function execution
                                delay(2000)
                                homeViewModel.reloadHomePageProductsForTrendingCityAndNewArrival()
                            }
                        }
                    }
                }

                override fun chipListItemClicked(
                    position: Int,
                    item: ProductCardSectionChipModel?
                ) {

                    homeViewModel.yourMedicineSelectedPos=position
                    binding.productCardStackedSection.smoothScrollToStart()
                    homeViewModel.hasMoreYourMedicenePages=true
                    pageIndex=0
                    if ((productCardDataModel?.patientMedicinesListModel?.responseData?.patientDetails?.size
                            ?: 0) > 0
                    ) {
                        binding.productCardStackedSection.showShimmer(true)
                        homeViewModel.viewModelScope.launch(IO) {
                            homeViewModel.yourMedicinePatientId = if (position == 0) null else
                                productCardDataModel?.patientMedicinesListModel?.responseData?.patientDetails?.get(
                                    position - 1
                                )?.patientId.toString()

                          //  homeViewModel.myMedicinesCurrentPatientIdSelected=homeViewModel.yourMedicinePatientId
                            homeViewModel.callPatientListMedicineListApi(pageIndex)
                        }
                    }

                }

                override fun deleteAlert(
                    data: com.intellihealth.salt.models.ProductInfoModel,
                    pos: Int,
                    qty: Int
                ) {
                    val selectedList =
                        productCardDataModel?.patientMedicinesListModel?.responseData?.productList
                    selectedList?.let {
                        if (selectedList.isNotEmpty() && pos < selectedList.size) {
                            val orgInfoModel = selectedList[pos]

                            val removeProductBottomSheet =
                                RemoveProductBottomSheet(object : DeleteCallback {
                                    override fun yesClick() {
                                        homeViewModel.isMedicineRefreshRequired = true
                                        homeViewModel.removeItemFromCart(
                                            orgInfoModel,
                                            false,
                                            ApiParameterConstants.CONST_LIST_YOUR_MEDICINE
                                        )
                                        productCardDataModel?.patientMedicinesListModel?.responseData?.productList?.get(pos)?.product?.qty = 0
                                    }

                                })
                            removeProductBottomSheet.isCancelable = true
                            if (!removeProductBottomSheet.isVisible && fragmentManager != null && isSingleClickParam())
                                removeProductBottomSheet.show(fragmentManager, "remove product")
                        }
                    }
                }

                override fun itemViewClick(productDetailModel: com.intellihealth.salt.models.ProductInfoModel) {
                    homeViewModel.productCardStackedItemClicked(productDetailModel)
                }

                override fun lastScrollPosition(pos: Int) {
                    Log.d("qwerty_component","lastVisibleItemPosition your medicine : $pos")
                    homeViewModel.lastScrollPositionYourMedicine = pos
                }

                override fun reachedToLastItem() {
                    if (homeViewModel.hasMoreYourMedicenePages) {
                        pageIndex++
                        homeViewModel.viewModelScope.launch(IO) { homeViewModel.callPatientListMedicineListApi(pageIndex) }
                    }
                }

                override fun reachedToLastStackedItem() {
                }

                override fun stepperError(
                    data: com.intellihealth.salt.models.ProductInfoModel,
                    pos: Int,
                    msg: String?
                ) {
                }

                override fun viewAllClicked() {
                    homeViewModel.viewAllYourMedicinesClick()
                }

                override fun viewAllStackedClicked() {
                }


            }
            binding.productCardStackedSection.setCallback(sectionCallback!!)

            if (chipList.isEmpty()) {
                isChipListCreated = true
                if (!responseApi.patientMedicinesListModel?.responseData?.patientDetails.isNullOrEmpty() &&
                    responseApi.patientMedicinesListModel?.responseData?.patientDetails?.size!! > 1
                ) {
                    chipList.add(ProductCardSectionChipModel("All", 0))
                    for (i in 0..responseApi.patientMedicinesListModel?.responseData?.patientDetails?.size!! - 1) {
                        responseApi.patientMedicinesListModel?.responseData?.patientDetails!![i].let {
                            chipList.add(
                                ProductCardSectionChipModel(
                                    it.patientName,
                                    it.patientId
                                )
                            )
                        }
                    }
                }
            }

            responseApi.patientMedicinesListModel?.responseData?.productList?.let {list->
                for (i in 0..<list.size) {
                    productList.add(list[i].toSdkObject())
                }
            }

            val dataModelStacked = ProductCardSectionModel(
                productCardHeader = "My medicines \uD83D\uDC8A",
                productCardSubtitle = "Choose from your past purchases",
                list = responseApi.patientMedicinesListModel?.responseData?.productList?.toSdkProductModelList() ?: arrayListOf(),
                chipsList = chipList,
                viewAllVisibility = (responseApi.patientMedicinesListModel?.responseData?.productList?.size?:0) > 4,
                minDiscountValue = SharedPrefManager.getInstance().minMedDiscountToBeHidden
            )

            if (isChipListCreated && previousListSize == 0) {//!homeViewModel.isMedicineRefreshRequired
                binding.productCardStackedSection.setProductCardSectionData(dataModelStacked)
                homeViewModel.isMedicineRefreshRequired = false
            } else {
                binding.productCardStackedSection.reloadProductList(dataModelStacked.list)
            }
        }
    }
    private fun getScrollPosition() {
        binding.clRoot.viewTreeObserver.addOnScrollChangedListener {
            val scrollBounds = Rect()
            binding.clRoot.getHitRect(scrollBounds)
            if (binding.productCardStackedSection.getLocalVisibleRect(scrollBounds)) {
                homeViewModel.yourMedicineView = true
            }
        }
    }
}