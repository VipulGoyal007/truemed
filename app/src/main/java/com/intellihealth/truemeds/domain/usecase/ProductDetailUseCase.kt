package com.intellihealth.truemeds.domain.usecase

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.intellihealth.salt.callbacks.FullWidthProductCardCallback
import com.intellihealth.salt.callbacks.StepperCallback
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.truemeds.data.model.home.CompositionBSDataModel
import com.intellihealth.truemeds.di.mapper.ProductDetailToEntityMapper
import com.intellihealth.truemeds.domain.repository.OrderFlowRepository
import com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository
import com.intellihealth.truemeds.presentation.model.MedicineDetailsMain
import com.intellihealth.truemeds.presentation.model.ProductDetailCartModel
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import org.json.JSONObject
import javax.inject.Inject


class ProductDetailUseCase @Inject constructor(private val productDetailRepository: ProductListAndDetailsRepository,
    private val orderFlowRepository: OrderFlowRepository
) {

     val mapperToEntity = ProductDetailToEntityMapper()
    
    /*suspend fun getProductDetailData(query: String, elasticSearchType: String) : List<com.intellihealth.salt.models.ProductInfoModel>? {
        try {
            return when (val res =
                orderFlowRepository.getSearchResults("3", elasticSearchType, query, 20, 1, 4)) {
                is Resource.Success -> {
                    res.value?.body()?.responseData ?: listOf()
                }
                is Resource.Failure -> listOf()
                else -> listOf()
            }
            
        } catch (ex: Exception) {
            return listOf()
        }
    }
*/
    fun getCompositionList(compositionDetails:String): ArrayList<CompositionBSDataModel> {
        val compositionList: ArrayList<CompositionBSDataModel> = arrayListOf()
        val list= compositionDetails.split("+")
        for(i in list.indices){
            compositionList.add(CompositionBSDataModel(i, list[i]))
        }
        return compositionList
    }

    fun getOrgBottomSheet(model: ProductInfoModel): com.intellihealth.salt.models.ProductInfoModel {
        val orgModel = model.toSdkObject()
        orgModel.product.subsFound = false
        return orgModel
    }

    fun getSbsBottomSheet(model: ProductInfoModel): com.intellihealth.salt.models.ProductInfoModel {
        val subsModel = model.toSdkObject()
        with(subsModel) {
            subsModel.sameCompositionProduct = model.product.skuName ?: ""
            subsModel.suggestion?.subsSavingsPercentage = model.product.subsSavingPercentage
            subsModel.product.subsSavingsPercentage = model.product.subsSavingPercentage
            model.suggestion?.subsSavingPercentage = model.product.subsSavingPercentage
    
            model.product.subsSavingPercentage?.let {
                var discount = it.replace("%", "")
                model?.suggestion?.discount = discount.toDouble()
            }
            cardType = FullWidthProductCardConstants.COMPARE_N_CHOOSE
            model.suggestion?.let {
                product = it.toSdkObject()
            }
        }
       return subsModel
    }

    fun productCardAddClick(qty:Int){
        //Local DB add
    }


}

