package com.intellihealth.truemeds.data.model.home

import com.intellihealth.salt.models.BannerItemModel
import com.intellihealth.truemeds.presentation.utils.HomeSectionConstants

data class BannerDataModel(
    var id: Int = 1,
    var type: String = HomeSectionConstants.BANNER,
    var bannersList: List<BannerItemModel>? = null
)
