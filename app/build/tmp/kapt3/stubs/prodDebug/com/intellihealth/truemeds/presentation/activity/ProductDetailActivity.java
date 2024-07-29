package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010.\u001a\u00020/J\b\u00100\u001a\u00020/H\u0016J\b\u00101\u001a\u00020/H\u0016J\b\u00102\u001a\u00020/H\u0016J\b\u00103\u001a\u00020/H\u0002J\b\u00104\u001a\u00020/H\u0002J\"\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001f2\b\u00108\u001a\u0004\u0018\u000109H\u0014J\u0012\u0010:\u001a\u00020/2\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\b\u0010=\u001a\u00020/H\u0014J\b\u0010>\u001a\u00020/H\u0016J\b\u0010?\u001a\u00020/H\u0016J\u000e\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020\u0019J\u0010\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020\u0013H\u0016J\b\u0010D\u001a\u00020/H\u0002J\b\u0010E\u001a\u00020/H\u0016J\b\u0010F\u001a\u00020/H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010)R\u0012\u0010*\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010)R\u0010\u0010+\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010)R\u0010\u0010-\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/ProductDetailActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivityWithLogin;", "Lcom/intellihealth/truemeds/presentation/fragment/InternalServerErrorCallback;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityProductDetailBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityProductDetailBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/login/LoginBottomSheet;", "clickedOnPage", "", "clickedSuggestionType", "deepLinkActionType", "elastic_search_type", "isAlreadyAddedToCart", "isFromCrossSelling", "", "isFromSearch", "isSubs", "item_qc", "item_rt", "listener", "Lcom/intellihealth/truemeds/presentation/bottomsheet/productdetail/ProductDetailBottomSheet$CrossSellingProductBSCallback;", "orgProductOfSubs", "pdCode", "productDetailFragment", "Lcom/intellihealth/truemeds/presentation/fragment/ProductDetailFragment;", "resultPosition", "", "getResultPosition", "()I", "setResultPosition", "(I)V", "searchText", "searchType", "section", "sectionHeading", "sectionIndex", "Ljava/lang/Integer;", "sectionRow", "suggestion_term_clicked", "suggestion_term_clicked_position", "term_searched", "closeActivity", "", "closeLoginBottomSheet", "extractIntentData", "getTrueCallerUserDetails", "initArguments", "initView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openLoginBottomSheet", "sendLoginPageViewedEvent", "setHomeCrossSellingListener", "mListener", "setIsTruecaller", "isTruecaller", "showInternalServerError", "showInternalServerErrorDialogActivity", "showInternalServerErrorDialogBottomsheet", "app_prodDebug"})
public final class ProductDetailActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivityWithLogin implements com.intellihealth.truemeds.presentation.fragment.InternalServerErrorCallback {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private boolean isSubs = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchText = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchType = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pdCode = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String item_qc;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String item_rt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String term_searched;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestion_term_clicked;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String elastic_search_type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer suggestion_term_clicked_position;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.fragment.ProductDetailFragment productDetailFragment;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orgProductOfSubs;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sectionHeading;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String isAlreadyAddedToCart;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet.CrossSellingProductBSCallback listener;
    private boolean isFromCrossSelling = false;
    private boolean isFromSearch = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String section;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedSuggestionType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String deepLinkActionType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sectionIndex;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer sectionRow = 0;
    private int resultPosition = 0;
    private com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet bottomSheet;
    
    public ProductDetailActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityProductDetailBinding getBinding() {
        return null;
    }
    
    public final int getResultPosition() {
        return 0;
    }
    
    public final void setResultPosition(int p0) {
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
    
    public final void setHomeCrossSellingListener(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.bottomsheet.productdetail.ProductDetailBottomSheet.CrossSellingProductBSCallback mListener) {
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
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initArguments() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void initView() {
    }
    
    public final void closeActivity() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void showInternalServerError() {
    }
    
    @java.lang.Override()
    public void showInternalServerErrorDialogActivity() {
    }
    
    @java.lang.Override()
    public void showInternalServerErrorDialogBottomsheet() {
    }
}