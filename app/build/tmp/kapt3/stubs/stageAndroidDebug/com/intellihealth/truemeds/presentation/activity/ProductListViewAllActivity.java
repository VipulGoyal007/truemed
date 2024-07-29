package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020:H\u0002J\b\u0010<\u001a\u00020:H\u0016J\b\u0010=\u001a\u00020:H\u0016J\b\u0010>\u001a\u00020:H\u0002J\b\u0010?\u001a\u00020:H\u0002J\"\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\u0006\u0010F\u001a\u00020:J\u0012\u0010G\u001a\u00020:2\b\u0010H\u001a\u0004\u0018\u00010IH\u0015J\b\u0010J\u001a\u00020:H\u0014J\b\u0010K\u001a\u00020:H\u0014J\b\u0010L\u001a\u00020:H\u0014J\b\u0010M\u001a\u00020:H\u0016J\b\u0010N\u001a\u00020:H\u0016J\b\u0010O\u001a\u00020:H\u0002J\u0010\u0010P\u001a\u00020:2\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020:H\u0002J\b\u0010T\u001a\u00020:H\u0002J\b\u0010U\u001a\u00020:H\u0002J\u0018\u0010V\u001a\u00020:2\u0006\u0010W\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020RH\u0002J\b\u0010Y\u001a\u00020:H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b6\u00107\u00a8\u0006Z"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/ProductListViewAllActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivityWithLogin;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityProductListViewAllBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityProductListViewAllBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/login/LoginBottomSheet;", "cartViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "getCartViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CartViewModel;", "cartViewModel$delegate", "Lkotlin/Lazy;", "chipList", "Ljava/util/ArrayList;", "Lcom/intellihealth/salt/models/ProductCardSectionChipModel;", "Lkotlin/collections/ArrayList;", "getChipList", "()Ljava/util/ArrayList;", "setChipList", "(Ljava/util/ArrayList;)V", "chipsAdapter", "Lcom/intellihealth/salt/adapter/ProductCardChipsAdapter;", "clickedOnPage", "", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "context", "Landroid/content/Context;", "deleteBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/cart/RemoveProductBottomSheet;", "getDeleteBottomSheet", "()Lcom/intellihealth/truemeds/presentation/bottomsheet/cart/RemoveProductBottomSheet;", "heading", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "getHomeViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "homeViewModel$delegate", "listType", "productCardSectionCallback", "Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;", "getProductCardSectionCallback", "()Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;", "setProductCardSectionCallback", "(Lcom/intellihealth/salt/views/section/ProductCardSection$ProductCardSectionCallback;)V", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ProductListViewAllViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/ProductListViewAllViewModel;", "viewModel$delegate", "closeLoginBottomSheet", "", "dismiss", "extractIntentData", "getTrueCallerUserDetails", "handlingCallBack", "initView", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackSetResult", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "openLoginBottomSheet", "sendLoginPageViewedEvent", "setCallbacks", "setIsTruecaller", "isTruecaller", "", "setListener", "setLoadMore", "setObservers", "showConfirmationDialog", "productCode", "isSubs", "updateStatusBarColor", "app_stageAndroidDebug"})
public final class ProductListViewAllActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivityWithLogin {
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy homeViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String listType = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String heading = "";
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet deleteBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cartViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.adapter.ProductCardChipsAdapter chipsAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.salt.models.ProductCardSectionChipModel> chipList;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback productCardSectionCallback;
    private com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet bottomSheet;
    
    public ProductListViewAllActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityProductListViewAllBinding getBinding() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel getViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.bottomsheet.cart.RemoveProductBottomSheet getDeleteBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.CartViewModel getCartViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.salt.models.ProductCardSectionChipModel> getChipList() {
        return null;
    }
    
    public final void setChipList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.salt.models.ProductCardSectionChipModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback getProductCardSectionCallback() {
        return null;
    }
    
    public final void setProductCardSectionCallback(@org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.views.section.ProductCardSection.ProductCardSectionCallback p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    public void sendLoginPageViewedEvent() {
    }
    
    @java.lang.Override()
    public void setIsTruecaller(boolean isTruecaller) {
    }
    
    @java.lang.Override()
    public void getTrueCallerUserDetails() {
    }
    
    @java.lang.Override()
    public void openLoginBottomSheet() {
    }
    
    @java.lang.Override()
    public void closeLoginBottomSheet() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handlingCallBack() {
    }
    
    private final void setLoadMore() {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void updateStatusBarColor() {
    }
    
    private final void setCallbacks() {
    }
    
    private final void setObservers() {
    }
    
    private final void setListener() {
    }
    
    public final void onBackSetResult() {
    }
    
    private final void dismiss() {
    }
    
    private final void showConfirmationDialog(java.lang.String productCode, boolean isSubs) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}