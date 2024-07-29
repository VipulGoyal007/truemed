package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0016\u0010\u000e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u000bR)\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b0\u00078F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\n0\n0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\""}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "homePageUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;)V", "eventOpenAccountTabItem", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "Lkotlin/Pair;", "", "", "getEventOpenAccountTabItem", "()Landroidx/lifecycle/LiveData;", "openAccountTabItem", "Landroidx/lifecycle/MutableLiveData;", "tmWalletData", "kotlin.jvm.PlatformType", "getTmWalletData", "()Landroidx/lifecycle/MutableLiveData;", "userNavMenuList", "", "Lcom/intellihealth/truemeds/data/model/bottomnav/AccountTabModel;", "getUserNavMenuList", "setUserNavMenuList", "(Landroidx/lifecycle/MutableLiveData;)V", "clearCustomerData", "", "createNavMenuList", "eventArticleSectionViewedEvent", "clickedOnPage", "logoutEvent", "item", "position", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AccountTabViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel>> userNavMenuList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<java.lang.String, java.lang.Integer>>> openAccountTabItem = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> tmWalletData = null;
    
    @javax.inject.Inject()
    public AccountTabViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel>> getUserNavMenuList() {
        return null;
    }
    
    public final void setUserNavMenuList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<java.lang.String, java.lang.Integer>>> getEventOpenAccountTabItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTmWalletData() {
        return null;
    }
    
    public final void createNavMenuList() {
    }
    
    public final void openAccountTabItem(@org.jetbrains.annotations.NotNull()
    java.lang.String item, int position) {
    }
    
    public final void clearCustomerData() {
    }
    
    public final void logoutEvent() {
    }
    
    public final void eventArticleSectionViewedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage) {
    }
}