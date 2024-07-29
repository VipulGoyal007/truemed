package com.intellihealth.truemeds.di.mapper

import androidx.lifecycle.MutableLiveData
import com.intellihealth.salt.constants.FullWidthProductCardConstants
import com.intellihealth.salt.models.AuthorCardModel
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.salt.models.CompositionCardModel
import com.intellihealth.salt.models.FaqModel
import com.intellihealth.salt.models.MobileSectionHeadersModel
import com.intellihealth.salt.models.ProductCardSectionModel
import com.intellihealth.salt.models.ProductComparisonModel
import com.intellihealth.salt.models.RecommendedSubUpsellModel
import com.intellihealth.truemeds.data.model.home.WrittenReviewBy
import com.intellihealth.truemeds.presentation.model.MedicineDetailsMain
import com.intellihealth.truemeds.presentation.model.ProductInfoModel
import com.intellihealth.truemeds.presentation.pref.SharedPrefManager
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.text.NumberFormat
import java.util.Locale

class ProductDetailToEntityMapper {

    fun mapAuthorList(model: MedicineDetailsMain?): ArrayList<AuthorCardModel>? {
        if(model == null || model.writtenReviewBy.isEmpty()) return null
        val listBuildItems = arrayListOf<AuthorCardModel>()
        val list: List<WrittenReviewBy> = model.writtenReviewBy.sortedBy { it.sequence }
        if (list.isNotEmpty()) {
            list.forEach { eachItem ->
                listBuildItems.add(
                    eachItem.toAuthorCardModel()
                )
            }
        }
        return listBuildItems
    }

    fun mapToBannerData(
        model: ProductInfoModel?
    ): ArrayList<BannerItemModel>? {
        if(model?.product == null || model.product.productImageUrl.isNullOrEmpty() || (!model.product.productImageUrl.isNullOrEmpty() && !model.product.productImageUrl?.contains("http")!!)) return null
        val bannerSplit = model.product.productImageUrl?.split(",")?.toList()
        val bannerList = ArrayList<BannerItemModel>()
        for (i in bannerSplit?.indices!!) {
            bannerList.add(BannerItemModel(i, bannerSplit[i]))
        }
        return bannerList
    }


    fun mapToRecommendedModel(
        recommTitle: String,
        comparisonTitle: String,
        model: ProductInfoModel,
        isFromOrderStatus: Boolean
    ): RecommendedSubUpsellModel {
//        model.suggestion?.showStepper = !isFromOrderStatus
//        model.product.showStepper = !isFromOrderStatus
        val product = model.product.toSdkObject()
        val suggestion = model.suggestion?.toSdkObject()
        suggestion?.showStepper = !isFromOrderStatus
        product.showStepper = !isFromOrderStatus

        return RecommendedSubUpsellModel(
            recommendedCollapsible = true,
            headerTitle = recommTitle,
            headerLabel = "${model.product.subsSavingPercentage} Cheaper",
            productCardData = model.suggestion?.toSdkObject()?.let {
                com.intellihealth.salt.models.ProductInfoModel(
                    cardType = FullWidthProductCardConstants.COMPARE_N_CHOOSE,
                    isReplaced = model.isReplaced,
                    isOrgAddedToCart = model.isOrgAddedToCart,
                    isAutoReplaced = false,
                    isSubsAddedToCart = model.isSubsAddedToCart,
                    sameCompositionProduct = model.product.skuName ?: "",
                    product = product,
                    suggestion = suggestion!!
                )
            },
            productComparisonData = ProductComparisonModel(
                title = comparisonTitle,
                product = product,
                suggestion = suggestion!!,
                isCollapsible = false,
                isTitleAtStart = true,
                )
        )
    }

    fun mapToCompositionModel(
        compositionTitleTxt: String,
        compositionDescriptionTxt: String,
        compositionData: ProductInfoModel
    ): CompositionCardModel? {
        if(compositionData.product.composition.isNullOrEmpty()) return null
        return CompositionCardModel(
            compositionTitleTxt,
            compositionDescriptionTxt,
            compositionData.product.composition ?: "",
            "",
            ""
        )
    }

  fun mapToProductInfoModel(data: MedicineDetailsMain?): FaqModel? {
      if(data == null || data.productInfo.isEmpty()) return null
        val listDataHeader: MutableList<String> = ArrayList()
        val listDataChild: HashMap<String, List<String>> = HashMap()
        val listAnswer: MutableList<String> = ArrayList()
         val productInfoList= data.productInfo.sortedBy { it.sequence }
        for (i in productInfoList.indices) {
            listDataHeader.add(data.productInfo[i].header ?: "")
            listAnswer.add(data.productInfo[i].description ?: "")
        }

        listDataHeader.forEachIndexed { index, s ->
            listDataChild[s] = arrayListOf(listAnswer[index])
        }
        return FaqModel(listDataHeader, listDataChild)
    }

    fun mapDoubleStackModel(
        title: String,
        dataList: ArrayList<ProductInfoModel>
    ): ProductCardSectionModel? {
        if(dataList.isNullOrEmpty()) return null
        val listBuildItems = arrayListOf<com.intellihealth.salt.models.ProductInfoModel>()
        listBuildItems.clear()
        if (dataList.isNotEmpty()) {
            dataList.forEach { eachItem ->
                eachItem.toSdkObject().let { listBuildItems.add(it) }
            }
        }
        return ProductCardSectionModel(title, list = listBuildItems, viewAllVisibility=false, minDiscountValue = SharedPrefManager.getInstance().minMedDiscountToBeHidden)
    }


    fun mapToSubsViewComparison(
        title: String,
        model: ProductInfoModel
    ): ProductComparisonModel {
        return ProductComparisonModel(
            title = title,
            product = model.product.toSdkObject(),
            suggestion = model.suggestion?.toSdkObject()!!,
            isCollapsible = true
        )
    }


    fun mapToManufacturerDetailModel(title: String, subTitle: String): FaqModel? {
        if(subTitle.isNullOrEmpty()) return null
        val listDataHeader: MutableList<String> = ArrayList()
        val listDataChild: HashMap<String, List<String>> = HashMap()
        val listAnswer: MutableList<String> = ArrayList()


        listDataHeader.add(title ?: "")
        listAnswer.add(subTitle ?: "")


        listDataHeader.forEachIndexed { index, s ->
            listDataChild[s] = arrayListOf(listAnswer[index])
        }
        return FaqModel(listDataHeader, listDataChild)
    }

    fun mapToMobileSectionHeadersModel(
        model: ProductInfoModel?,
        isSubs: Boolean
    ): MobileSectionHeadersModel {
        val symbols = DecimalFormatSymbols(Locale.US)
        val nf: NumberFormat =  DecimalFormat("##.###", symbols)
        val formattedDiscount:String =
            if (isSubs) {
                if(model?.product?.subsSavingPercentage?.isNotEmpty() == true) model.product.subsSavingPercentage + " cheaper" else ""
            } else {
                if ((model?.product?.discount
                        ?: 0.0) > 0.0
                ) ("" + nf.format(model?.product?.discount) + " % off") else ""
            }
        return MobileSectionHeadersModel(
            model?.product?.skuName,
            if (model?.isOrgAddedToCart == true) null else model?.product?.sellingPrice.toString(),
            if (model?.isOrgAddedToCart == true) null else formattedDiscount,
            "Add",
            0,
            buttonIconLeft = null,
            availabilityStatusText = model?.product?.availabilityStatus ?: ""
        )
    }

}