package com.intellihealth.truemeds.di.mapper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ(\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\u0004j\b\u0012\u0004\u0012\u00020\u000e`\u0006J$\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eJ \u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000eJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fJ\u0018\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\bJ&\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001cJ\u0016\u0010$\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000e\u00a8\u0006&"}, d2 = {"Lcom/intellihealth/truemeds/di/mapper/ProductDetailToEntityMapper;", "", "()V", "mapAuthorList", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/AuthorCardModel;", "Lkotlin/collections/ArrayList;", "model", "Lcom/intellihealth/truemeds/presentation/model/MedicineDetailsMain;", "mapDoubleStackModel", "Lcom/intellihealth/salt/models/ProductCardSectionModel;", "title", "", "dataList", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "mapToBannerData", "Lcom/intellihealth/salt/models/BannerItemModel;", "mapToCompositionModel", "Lcom/intellihealth/salt/models/CompositionCardModel;", "compositionTitleTxt", "compositionDescriptionTxt", "compositionData", "mapToManufacturerDetailModel", "Lcom/intellihealth/salt/models/FaqModel;", "subTitle", "mapToMobileSectionHeadersModel", "Lcom/intellihealth/salt/models/MobileSectionHeadersModel;", "isSubs", "", "mapToProductInfoModel", "data", "mapToRecommendedModel", "Lcom/intellihealth/salt/models/RecommendedSubUpsellModel;", "recommTitle", "comparisonTitle", "isFromOrderStatus", "mapToSubsViewComparison", "Lcom/intellihealth/salt/models/ProductComparisonModel;", "app_stageAndroidDebug"})
public final class ProductDetailToEntityMapper {
    
    public ProductDetailToEntityMapper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.intellihealth.salt.models.AuthorCardModel> mapAuthorList(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.MedicineDetailsMain model) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.intellihealth.salt.models.BannerItemModel> mapToBannerData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.RecommendedSubUpsellModel mapToRecommendedModel(@org.jetbrains.annotations.NotNull()
    java.lang.String recommTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String comparisonTitle, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel model, boolean isFromOrderStatus) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.CompositionCardModel mapToCompositionModel(@org.jetbrains.annotations.NotNull()
    java.lang.String compositionTitleTxt, @org.jetbrains.annotations.NotNull()
    java.lang.String compositionDescriptionTxt, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel compositionData) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.FaqModel mapToProductInfoModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.MedicineDetailsMain data) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.ProductCardSectionModel mapDoubleStackModel(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.presentation.model.ProductInfoModel> dataList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.ProductComparisonModel mapToSubsViewComparison(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel model) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.models.FaqModel mapToManufacturerDetailModel(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String subTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.MobileSectionHeadersModel mapToMobileSectionHeadersModel(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel model, boolean isSubs) {
        return null;
    }
}