package com.intellihealth.truemeds.data.model.home

data class HomeDataModel(
    var bannerModel: BannerDataModel? = null,
    var reOrderrModel: ReOrderDataModel? = null,
    var actionCardModel: ActionCardDataModel? = null,
    var substituteInfoCardDataModel: SubstituteInfoCardDataModel? = null,
    var superCategoryModel: SuperCategoryDataModel? = null,
    var productCardModel: ProductCardDataModel? = null,
    var actionCardCallAndOrderModel: ActionCardDataModel? = null,
    var productCardStackedModel: ProductCardDataModel? = null,
    var patientAndMedicineListModel: PatientAndMedicineListModel? = null,
    var blogSectionModel: BlogSectionDataModel? = null,
    var testimonialSectionModel: TestimonialSectionDataModel? = null,
    var footerModel: FooterDataModel? = null,
)