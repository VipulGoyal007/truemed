package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/OtcCategoryViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "personalCareUseCase", "Lcom/intellihealth/truemeds/domain/usecase/PersonalCareUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/PersonalCareUseCase;)V", "bannerList", "", "Lcom/intellihealth/salt/models/BannerItemModel;", "getBannerList", "()Ljava/util/List;", "setBannerList", "(Ljava/util/List;)V", "cartData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/salt/models/CartModel;", "getCartData", "()Landroidx/lifecycle/MutableLiveData;", "setCartData", "(Landroidx/lifecycle/MutableLiveData;)V", "personalCareList", "Lcom/intellihealth/truemeds/data/model/home/PersonalCareCategoryModel;", "getPersonalCareList", "setPersonalCareList", "productList", "Lcom/intellihealth/salt/models/ProductInfoModel;", "getProductList", "setProductList", "topDeals", "getTopDeals", "setTopDeals", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class OtcCategoryViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.PersonalCareUseCase personalCareUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.PersonalCareCategoryModel> personalCareList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.salt.models.BannerItemModel> bannerList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.salt.models.ProductInfoModel> productList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.salt.models.ProductInfoModel> topDeals;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> cartData;
    
    @javax.inject.Inject()
    public OtcCategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.PersonalCareUseCase personalCareUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.PersonalCareCategoryModel> getPersonalCareList() {
        return null;
    }
    
    public final void setPersonalCareList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.PersonalCareCategoryModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.BannerItemModel> getBannerList() {
        return null;
    }
    
    public final void setBannerList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.BannerItemModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.ProductInfoModel> getProductList() {
        return null;
    }
    
    public final void setProductList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.salt.models.ProductInfoModel> getTopDeals() {
        return null;
    }
    
    public final void setTopDeals(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.ProductInfoModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> getCartData() {
        return null;
    }
    
    public final void setCartData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.CartModel> p0) {
    }
}