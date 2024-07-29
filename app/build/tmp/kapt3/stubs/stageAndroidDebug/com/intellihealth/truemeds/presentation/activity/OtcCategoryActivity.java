package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001[B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u000208H\u0016J\b\u0010=\u001a\u000208H\u0016J\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0002J\u0012\u0010B\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010AH\u0002J\b\u0010C\u001a\u000208H\u0002J\"\u0010D\u001a\u0002082\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\b\u0010G\u001a\u0004\u0018\u00010HH\u0014J\u0012\u0010I\u001a\u0002082\b\u0010J\u001a\u0004\u0018\u00010KH\u0014J\b\u0010L\u001a\u000208H\u0014J\b\u0010M\u001a\u000208H\u0014J\b\u0010N\u001a\u000208H\u0016J\b\u0010O\u001a\u000208H\u0002J\b\u0010P\u001a\u000208H\u0016J\u0010\u0010Q\u001a\u0002082\u0006\u0010R\u001a\u00020?H\u0002J\u0010\u0010S\u001a\u0002082\u0006\u0010T\u001a\u00020?H\u0016J\b\u0010U\u001a\u000208H\u0002J\u0016\u0010V\u001a\u0002082\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0018\u0010W\u001a\u0002082\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020?H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050&\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050&\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u001b\u00101\u001a\u0002028FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104\u00a8\u0006\\"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/OtcCategoryActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivityWithLogin;", "Lcom/intellihealth/truemeds/presentation/bottomsheet/productdetail/ProductDetailBottomSheet$CrossSellingProductBSCallback;", "()V", "allSuperCategory", "", "banners", "", "Lcom/intellihealth/truemeds/data/model/home/SuperCategoryModel$BannersItem;", "getBanners", "()Ljava/util/List;", "setBanners", "(Ljava/util/List;)V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityOtcCategoryBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityOtcCategoryBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/login/LoginBottomSheet;", "catList", "Lcom/intellihealth/truemeds/data/model/home/ChildCategoryModel;", "getCatList", "setCatList", "childCategories", "", "context", "Landroid/content/Context;", "lastVisibleItemPositionForLaterTen", "lastVisibleItemPositionForTopSix", "loader", "Landroid/app/Dialog;", "mLocationLastClickTime", "", "mLocationLastClickTimeForFilter", "pdBottomsheetCallbackListener", "restTopSixSeenItemsSet", "", "getRestTopSixSeenItemsSet", "()Ljava/util/Set;", "topDealProduct", "Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "getTopDealProduct", "()Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;", "setTopDealProduct", "(Lcom/intellihealth/truemeds/presentation/model/ProductInfoModel;)V", "topSixSeenItemsSet", "getTopSixSeenItemsSet", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/MyOrderViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/MyOrderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "closeLoginBottomSheet", "", "dismissProductDetailBottomsheet", "productCode", "", "extractIntentData", "getTrueCallerUserDetails", "getVisibleView", "", "view", "Landroid/view/View;", "getVisibleViewIndexOnBasisOfHeight", "initUI", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "openLoginBottomSheet", "sendItemImpression", "sendLoginPageViewedEvent", "setBannerVisibility", "isVisible", "setIsTruecaller", "isTruecaller", "setListener", "setOTCBanner", "updateLastVisibleItemCount", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "isTopSix", "SpacesItemDecoration", "app_stageAndroidDebug"})
public final class OtcCategoryActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivityWithLogin implements com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet.CrossSellingProductBSCallback {
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private int allSuperCategory = 1;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> childCategories;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet.CrossSellingProductBSCallback pdBottomsheetCallbackListener;
    public com.intellihealth.truemeds.presentation.model.ProductInfoModel topDealProduct;
    private long mLocationLastClickTime = 0L;
    private long mLocationLastClickTimeForFilter = 0L;
    private int lastVisibleItemPositionForTopSix = 0;
    private int lastVisibleItemPositionForLaterTen = 0;
    private android.app.Dialog loader;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.Integer> topSixSeenItemsSet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.Integer> restTopSixSeenItemsSet = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> catList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> banners;
    private com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet bottomSheet;
    
    public OtcCategoryActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityOtcCategoryBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.MyOrderViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.ProductInfoModel getTopDealProduct() {
        return null;
    }
    
    public final void setTopDealProduct(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.ProductInfoModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Integer> getTopSixSeenItemsSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Integer> getRestTopSixSeenItemsSet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> getCatList() {
        return null;
    }
    
    public final void setCatList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.ChildCategoryModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> getBanners() {
        return null;
    }
    
    public final void setBanners(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> p0) {
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
    
    private final void sendItemImpression() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void initUI() {
    }
    
    private final void updateLastVisibleItemCount(androidx.recyclerview.widget.RecyclerView recyclerView, boolean isTopSix) {
    }
    
    private final void setOTCBanner(java.util.List<com.intellihealth.truemeds.data.model.home.SuperCategoryModel.BannersItem> banners) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void setListener() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void dismissProductDetailBottomsheet(@org.jetbrains.annotations.NotNull()
    java.lang.String productCode) {
    }
    
    private final int getVisibleViewIndexOnBasisOfHeight(android.view.View view) {
        return 0;
    }
    
    private final boolean getVisibleView(android.view.View view) {
        return false;
    }
    
    private final void setBannerVisibility(boolean isVisible) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/OtcCategoryActivity$SpacesItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "horizontalSpace", "", "verticalSpace", "(II)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "app_stageAndroidDebug"})
    public static final class SpacesItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
        private final int horizontalSpace = 0;
        private final int verticalSpace = 0;
        
        public SpacesItemDecoration(int horizontalSpace, int verticalSpace) {
            super();
        }
        
        @java.lang.Override()
        public void getItemOffsets(@org.jetbrains.annotations.NotNull()
        android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.State state) {
        }
    }
}