package com.intellihealth.truemeds.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.salt.models.CartModel
import com.intellihealth.salt.models.ProductInfoModel
import com.intellihealth.truemeds.data.model.home.PersonalCareCategoryModel
import com.intellihealth.truemeds.domain.usecase.PersonalCareUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OtcCategoryViewModel @Inject constructor (
    private val personalCareUseCase: PersonalCareUseCase
) : BaseViewModel() {

    var personalCareList: List<PersonalCareCategoryModel> = mutableListOf()
    var bannerList: List<BannerItemModel> = mutableListOf()
    var productList: List<ProductInfoModel> = mutableListOf()
    var topDeals: List<ProductInfoModel> = mutableListOf()
    var cartData: MutableLiveData<CartModel> = MutableLiveData(
        CartModel(
            "View cart",
            4,
            500.34
        )
    )
    /*fun getPersonalCareData(){
        personalCareList = personalCareUseCase.getPersonalCareCategory()
        bannerList = personalCareUseCase.getBannerList()
    }

    fun getProductByCategory() {
        productList = personalCareUseCase.getProductByCategory()
    }

    fun getTopDealProductList() {
        topDeals = personalCareUseCase.getTopDealProducts()
    }*/
}