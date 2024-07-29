package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020[H\u0016J\b\u0010]\u001a\u00020[H\u0016J\b\u0010^\u001a\u00020[H\u0002J$\u0010_\u001a\u00020[2\u0006\u0010`\u001a\u00020/2\u0006\u0010a\u001a\u00020/2\n\b\u0001\u0010b\u001a\u0004\u0018\u00010cH\u0014J\u0012\u0010d\u001a\u00020[2\b\u0010e\u001a\u0004\u0018\u00010fH\u0014J\b\u0010g\u001a\u00020[H\u0014J\u0012\u0010h\u001a\u00020[2\b\u0010i\u001a\u0004\u0018\u00010cH\u0014J\b\u0010j\u001a\u00020[H\u0014J\b\u0010k\u001a\u00020[H\u0014J\u0010\u0010l\u001a\u00020[2\b\u0010m\u001a\u0004\u0018\u00010nJ\u001c\u0010o\u001a\u00020[2\b\u0010p\u001a\u0004\u0018\u00010n2\b\u0010m\u001a\u0004\u0018\u00010qH\u0002J\b\u0010r\u001a\u00020[H\u0016J\b\u0010s\u001a\u00020[H\u0016J\b\u0010t\u001a\u00020[H\u0002J\u0010\u0010u\u001a\u00020[2\u0006\u0010v\u001a\u00020*H\u0016J\b\u0010w\u001a\u00020[H\u0002J\b\u0010x\u001a\u00020yH\u0002J\u001a\u0010z\u001a\u00020[2\b\u0010{\u001a\u0004\u0018\u00010n2\u0006\u0010|\u001a\u00020\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b&\u0010\'R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0010\"\u0004\b<\u0010\u0012R\u001c\u0010=\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012R\u001a\u0010@\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010\u0012R\u001a\u0010C\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0010\"\u0004\bE\u0010\u0012R\u001a\u0010F\u001a\u00020GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010L\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0010\"\u0004\bN\u0010\u0012R\u001a\u0010O\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u00101\"\u0004\bQ\u00103R\u001a\u0010R\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0010\"\u0004\bT\u0010\u0012R\u001b\u0010U\u001a\u00020V8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bY\u0010\u001a\u001a\u0004\bW\u0010X\u00a8\u0006}"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/SearchResultActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivityWithLogin;", "()V", "applyCouponCallBack", "Lcom/intellihealth/truemeds/presentation/callbacks/ApplyCouponCallback;", "binding", "Lcom/intellihealth/truemeds/databinding/ActivitySearchResultBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivitySearchResultBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/login/LoginBottomSheet;", "clickedSuggestionType", "", "getClickedSuggestionType", "()Ljava/lang/String;", "setClickedSuggestionType", "(Ljava/lang/String;)V", "couponSavingPopUp", "Lcom/intellihealth/truemeds/presentation/dialog/CouponSavingPopUp;", "couponViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "getCouponViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "couponViewModel$delegate", "Lkotlin/Lazy;", "dialog", "Landroidx/fragment/app/DialogFragment;", "getDialog", "()Landroidx/fragment/app/DialogFragment;", "setDialog", "(Landroidx/fragment/app/DialogFragment;)V", "elasticSearchType", "getElasticSearchType", "setElasticSearchType", "ftcViewModel", "Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "getFtcViewModel", "()Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "ftcViewModel$delegate", "isMultiSearch", "", "()Z", "setMultiSearch", "(Z)V", "lastVisibleItemPosition", "", "getLastVisibleItemPosition", "()I", "setLastVisibleItemPosition", "(I)V", "orgSubCompareFragment", "Lcom/intellihealth/truemeds/presentation/bottomsheet/productdetail/OrgSubCompareBottomSheet;", "getOrgSubCompareFragment", "()Lcom/intellihealth/truemeds/presentation/bottomsheet/productdetail/OrgSubCompareBottomSheet;", "setOrgSubCompareFragment", "(Lcom/intellihealth/truemeds/presentation/bottomsheet/productdetail/OrgSubCompareBottomSheet;)V", "qcEvent", "getQcEvent", "setQcEvent", "rtEvent", "getRtEvent", "setRtEvent", "searchText", "getSearchText", "setSearchText", "searchType", "getSearchType", "setSearchType", "subCompareFragment", "Lcom/intellihealth/truemeds/presentation/bottomsheet/SubsBottomSheet;", "getSubCompareFragment", "()Lcom/intellihealth/truemeds/presentation/bottomsheet/SubsBottomSheet;", "setSubCompareFragment", "(Lcom/intellihealth/truemeds/presentation/bottomsheet/SubsBottomSheet;)V", "suggestion_term_clicked", "getSuggestion_term_clicked", "setSuggestion_term_clicked", "suggestion_term_clicked_position", "getSuggestion_term_clicked_position", "setSuggestion_term_clicked_position", "term_searched", "getTerm_searched", "setTerm_searched", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/SearchViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/SearchViewModel;", "viewModel$delegate", "closeLoginBottomSheet", "", "extractIntentData", "getTrueCallerUserDetails", "initializeData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onNewIntent", "intentReceived", "onPause", "onResume", "openApplyCouponBottomSheet", "couponResponse", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "openApplyCouponValidationPopup", "couponResponse2", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "openLoginBottomSheet", "sendLoginPageViewedEvent", "setEventListeners", "setIsTruecaller", "isTruecaller", "setListenerObserver", "setupApplyCouponData", "Lcom/intellihealth/truemeds/data/model/home/ApplyCouponBottomSheetModel;", "stickyNotificationWithCallBack", "couponResp", "time", "app_prodDebug"})
public final class SearchResultActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivityWithLogin {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy couponViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy ftcViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private int lastVisibleItemPosition = 0;
    private com.intellihealth.truemeds.presentation.dialog.CouponSavingPopUp couponSavingPopUp;
    public java.lang.String searchText;
    public java.lang.String searchType;
    public java.lang.String clickedSuggestionType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String qcEvent;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rtEvent;
    public java.lang.String term_searched;
    private int suggestion_term_clicked_position = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String suggestion_term_clicked;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String elasticSearchType;
    private boolean isMultiSearch = false;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.productdetail.OrgSubCompareBottomSheet orgSubCompareFragment;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.SubsBottomSheet subCompareFragment;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.callbacks.ApplyCouponCallback applyCouponCallBack;
    @org.jetbrains.annotations.Nullable()
    private androidx.fragment.app.DialogFragment dialog;
    private com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet bottomSheet;
    
    public SearchResultActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel getViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel getCouponViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel getFtcViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.databinding.ActivitySearchResultBinding getBinding() {
        return null;
    }
    
    public final int getLastVisibleItemPosition() {
        return 0;
    }
    
    public final void setLastVisibleItemPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchText() {
        return null;
    }
    
    public final void setSearchText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchType() {
        return null;
    }
    
    public final void setSearchType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedSuggestionType() {
        return null;
    }
    
    public final void setClickedSuggestionType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQcEvent() {
        return null;
    }
    
    public final void setQcEvent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRtEvent() {
        return null;
    }
    
    public final void setRtEvent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerm_searched() {
        return null;
    }
    
    public final void setTerm_searched(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getSuggestion_term_clicked_position() {
        return 0;
    }
    
    public final void setSuggestion_term_clicked_position(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuggestion_term_clicked() {
        return null;
    }
    
    public final void setSuggestion_term_clicked(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getElasticSearchType() {
        return null;
    }
    
    public final void setElasticSearchType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isMultiSearch() {
        return false;
    }
    
    public final void setMultiSearch(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.bottomsheet.productdetail.OrgSubCompareBottomSheet getOrgSubCompareFragment() {
        return null;
    }
    
    public final void setOrgSubCompareFragment(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.bottomsheet.productdetail.OrgSubCompareBottomSheet p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.bottomsheet.SubsBottomSheet getSubCompareFragment() {
        return null;
    }
    
    public final void setSubCompareFragment(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.bottomsheet.SubsBottomSheet p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.DialogFragment getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.DialogFragment p0) {
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
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.intellihealth.truemeds.data.model.home.ApplyCouponBottomSheetModel setupApplyCouponData() {
        return null;
    }
    
    private final void setEventListeners() {
    }
    
    private final void setListenerObserver() {
    }
    
    private final void initializeData() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @androidx.annotation.Nullable()
    @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void stickyNotificationWithCallBack(com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResp, java.lang.String time) {
    }
    
    public final void openApplyCouponBottomSheet(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse) {
    }
    
    private final void openApplyCouponValidationPopup(com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse2, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse couponResponse) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intentReceived) {
    }
}