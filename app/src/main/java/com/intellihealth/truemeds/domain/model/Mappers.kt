package com.intellihealth.truemeds.domain.model

import android.R.attr.name
import android.util.Log
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.salt.models.ReorderModel
import com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel
import com.intellihealth.truemeds.data.model.home.SuperCategoryModel
import com.intellihealth.truemeds.presentation.model.DeliveredOrders
import com.intellihealth.truemeds.presentation.model.HomeBanner
import org.json.JSONObject


fun List<SuperCategoryModel.BannersItem>.mapToOTCBanner(): List<BannerItemModel> {
    val bannerList: MutableList<BannerItemModel> = mutableListOf()
    with(this){
        if (this.isNotEmpty()) mapIndexed { index, banner ->
            bannerList.add(BannerItemModel(
                id = index,
                imageUrl = banner.image ?: "",
            ))
        } else bannerList
    }
    return bannerList
}

fun DeliveredOrders.mapToReorder(): List<ReorderModel> {
    val reorderList = arrayListOf<ReorderModel>()
    with(this){
        ordersList?.mapIndexed { index, orders ->

            reorderList.add(
                ReorderModel(
                    patientName = orders?.orderForPatientName,
                    date = orders?.date,
                    medicineList = getMedicineList(orders?.productNameList),
                )
            )
        }

    }
    return reorderList
}

fun getMedicineList(productNameList: List<DeliveredOrders.Orders.ProductName?>?): List<String> {
    val medicineList = arrayListOf<String>()
    productNameList?.map {
        medicineList.add(it?.quantity.toString() + " x " + it?.skuName)
    }
    return medicineList

}

fun List<HomeBanner.Banner>.mapToBannerList(): List<BannerItemModel> {
    val bannerList: MutableList<BannerItemModel> = mutableListOf()
    with(this){
        map { banner ->
            bannerList.add(BannerItemModel(
                id = banner.sequence,
                imageUrl = banner.image,
            ))
        }
    }
    return bannerList
}

fun List<AllCustomersOrdersResponseModel.ResponseData.Orders>.mapToReorderModelList(): ArrayList<ReorderModel> {
    val reOrderModelList: ArrayList<ReorderModel> = arrayListOf()
    with(this){

        //new code - in this code we are iterating the items one by one and performing the operation
        val iterator: Iterator<AllCustomersOrdersResponseModel.ResponseData.Orders> = this.iterator()
        while (iterator.hasNext()) {
            val reOrderModel = iterator.next()
            reOrderModelList.add(ReorderModel(
                patientName = reOrderModel.orderForPatientName,
                date = reOrderModel.date,
                savingText = reOrderModel.savingText,
                medicineList = getDeliverDetailsSkuList(reOrderModel.productNameList)))
        }

        //previous code - this code is generating crash issue at run time for many users
     /*   map {reOrderModel ->
            reOrderModelList.add(ReorderModel(
                patientName = reOrderModel.orderForPatientName,
                date = reOrderModel.date,
                savingText = reOrderModel.savingText,
                medicineList = getDeliverDetailsSkuList(reOrderModel.productNameList)))
        }*/
    }
    return reOrderModelList
}

fun getDeliverDetailsSkuList(productNameList: List<AllCustomersOrdersResponseModel.ResponseData.Orders.ProductName>): List<String>{
    val reOrderModelSkuList: ArrayList<String> = arrayListOf()
    Log.d("TAG", "getDeliverDetailsSkuList: $productNameList")
    productNameList.map {
        if(it.quantity > 0) {
            reOrderModelSkuList.add(it.quantity.toString() + " x " + it.skuName)
        }else {
            reOrderModelSkuList.add(it.skuName)
        }
    }
    Log.d("TAG", "getDeliverDetailsSkuList:reOrderModelSkuList= $reOrderModelSkuList")

    return reOrderModelSkuList
}
