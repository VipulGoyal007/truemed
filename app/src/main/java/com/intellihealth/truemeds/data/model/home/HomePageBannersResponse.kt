package com.intellihealth.truemeds.data.model.home

import com.google.gson.annotations.SerializedName
import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.truemeds.domain.enums.Banner
import com.intellihealth.truemeds.presentation.model.HomeBanner


data class HomePageBannersResponse(
    var message: String? = "",
    var statusValue: String? = "",
    var statusCode: String? = "",
    var responseData: ResponseData? = null,
) {
    fun toSDKObject(page: Banner): List<BannerItemModel> {
        val bannerList = arrayListOf<BannerItemModel>()
        val type = if (page == Banner.HOME) responseData?.banners else responseData?.otc
        type?.mapIndexed { index, banner ->
            bannerList.add(
                BannerItemModel(
                    id = index,
                    imageUrl = banner.image ?: "",
                )
            )
        }
        return bannerList
    }

    data class ResponseData(
        var callDetails: String,
        var supportEmailId: String,
        @SerializedName("banners")
        val banners: List<HomeBanner.Banner>?,
        @SerializedName("generic")
        val generic: List<HomeBanner.Banner>?,
        @SerializedName("homeGeneric")
        val homeGeneric: List<HomeBanner.Banner>?,
        @SerializedName("upiInfoUrl")
        val upiInfoUrl: List<HomeBanner.Banner>?,
        @SerializedName("otc")
        val otc: List<HomeBanner.Banner>?,
        @SerializedName("alert")
        val alert: String? = null,
    )

}