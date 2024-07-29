package com.intellihealth.truemeds.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/ProductDetailUseCase;", "", "productDetailRepository", "Lcom/intellihealth/truemeds/domain/repository/ProductListAndDetailsRepository;", "orderFlowRepository", "Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;", "(Lcom/intellihealth/truemeds/domain/repository/ProductListAndDetailsRepository;Lcom/intellihealth/truemeds/domain/repository/OrderFlowRepository;)V", "mapperToEntity", "Lcom/intellihealth/truemeds/di/mapper/ProductDetailToEntityMapper;", "getMapperToEntity", "()Lcom/intellihealth/truemeds/di/mapper/ProductDetailToEntityMapper;", "getCompositionList", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/home/CompositionBSDataModel;", "Lkotlin/collections/ArrayList;", "compositionDetails", "", "getOrgBottomSheet", "Lcom/intellihealth/salt/models/ProductInfoModel;", "model", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "getSbsBottomSheet", "productCardAddClick", "", "qty", "", "app_prodDebug"})
public final class ProductDetailUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository productDetailRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.di.mapper.ProductDetailToEntityMapper mapperToEntity = null;
    
    @javax.inject.Inject()
    public ProductDetailUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.ProductListAndDetailsRepository productDetailRepository, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.repository.OrderFlowRepository orderFlowRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.di.mapper.ProductDetailToEntityMapper getMapperToEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.truemeds.data.model.home.CompositionBSDataModel> getCompositionList(@org.jetbrains.annotations.NotNull()
    java.lang.String compositionDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.ProductInfoModel getOrgBottomSheet(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.ProductInfoModel getSbsBottomSheet(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel model) {
        return null;
    }
    
    public final void productCardAddClick(int qty) {
    }
}