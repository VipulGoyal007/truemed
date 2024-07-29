package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000205J\b\u00107\u001a\u000205H\u0016J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020\"H\u0002J\b\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u000205H\u0016J\u0010\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020\"H\u0002J\b\u0010>\u001a\u000205H\u0002J\u0018\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0006H\u0002J\"\u0010C\u001a\u0002052\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00122\b\u0010F\u001a\u0004\u0018\u00010GH\u0014J\u0012\u0010H\u001a\u0002052\b\u0010I\u001a\u0004\u0018\u00010JH\u0014J\b\u0010K\u001a\u000205H\u0014J-\u0010L\u001a\u0002052\u0006\u0010D\u001a\u00020\u00122\u000e\u0010M\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160N2\u0006\u0010O\u001a\u00020PH\u0016\u00a2\u0006\u0002\u0010QJ\b\u0010R\u001a\u000205H\u0014J\u0010\u0010S\u001a\u0002052\b\u0010T\u001a\u0004\u0018\u00010UJ\u001c\u0010V\u001a\u0002052\b\u0010W\u001a\u0004\u0018\u00010U2\b\u0010T\u001a\u0004\u0018\u00010XH\u0002J\b\u0010Y\u001a\u000205H\u0016J\u0012\u0010Z\u001a\u0002052\b\u0010[\u001a\u0004\u0018\u00010UH\u0002J\b\u0010\\\u001a\u000205H\u0016J\u0010\u0010]\u001a\u0002052\u0006\u0010^\u001a\u00020\"H\u0016J\b\u0010_\u001a\u000205H\u0002J\b\u0010`\u001a\u000205H\u0002J\u0010\u0010a\u001a\u0002052\u0006\u0010B\u001a\u00020 H\u0002J\b\u0010b\u001a\u000205H\u0002J\b\u0010c\u001a\u000205H\u0002J\b\u0010d\u001a\u000205H\u0002J\u0010\u0010e\u001a\u0002052\u0006\u0010B\u001a\u00020\u0006H\u0002J\b\u0010f\u001a\u000205H\u0002J\u001a\u0010g\u001a\u0002052\b\u0010h\u001a\u0004\u0018\u00010U2\u0006\u0010i\u001a\u00020\u0016H\u0002J\u0010\u0010j\u001a\u0002052\u0006\u0010k\u001a\u00020\u0012H\u0002J\u0010\u0010l\u001a\u0002052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006m"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/HomePageActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivityWithLogin;", "()V", "accountFragment", "Lcom/intellihealth/truemeds/presentation/fragment/AccountFragment;", "activeFragment", "Landroidx/fragment/app/Fragment;", "applyCouponCallBack", "Lcom/intellihealth/truemeds/presentation/callbacks/ApplyCouponCallback;", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityHomePageBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityHomePageBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/login/LoginBottomSheet;", "cartCount", "", "couponSavingPopUp", "Lcom/intellihealth/truemeds/presentation/dialog/CouponSavingPopUp;", "currentPromoCode", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "ftcViewModel", "Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "getFtcViewModel", "()Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "ftcViewModel$delegate", "Lkotlin/Lazy;", "homeFragment", "Lcom/intellihealth/truemeds/presentation/fragment/HomeFragment;", "isFromCancelOrder", "", "mLocationLastClickTime", "", "myOrdersFragment", "Lcom/intellihealth/truemeds/presentation/fragment/MyOrdersFragment;", "patientListMedicinesListCardStackedAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/PatientListMedicinesListAdapter;", "pendingPaymentOrderId", "referAndEarnFragment", "Lcom/intellihealth/truemeds/presentation/fragment/ReferAndEarnFragment;", "sellingPrice", "", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/HomeViewModel;)V", "checkFtcCouponDataLocally", "", "checkIsBottomNavigationRounded", "closeLoginBottomSheet", "endOrderTrackerAnimation", "isAnimationRequired", "extractIntentData", "getTrueCallerUserDetails", "initBottomNavigation", "recreateBottomNavFragment", "initView", "manageFragmentState", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "targetFragment", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "openApplyCouponBottomSheet", "couponResponse", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "openApplyCouponValidationPopup", "couponResponse2", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "openLoginBottomSheet", "processUrgencyCoupon", "it", "sendLoginPageViewedEvent", "setIsTruecaller", "isTruecaller", "setListener", "setObservers", "setOrderTrackingVisibility", "setViewCartVisibility", "setViewVisibility", "setupBackPressedAction", "showFragment", "startOrderTrackingAnimation", "stickyNotificationWithCallBack", "couponResp", "time", "updateNavigationBarState", "actionId", "updateSticky", "app_prodDebug"})
public final class HomePageActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivityWithLogin {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    public com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy ftcViewModel$delegate = null;
    private double sellingPrice = 0.0;
    private int pendingPaymentOrderId = 0;
    private int cartCount = 0;
    private long mLocationLastClickTime = 0L;
    private androidx.fragment.app.FragmentManager fragmentManager;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.callbacks.ApplyCouponCallback applyCouponCallBack;
    private androidx.fragment.app.Fragment activeFragment;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.PatientListMedicinesListAdapter patientListMedicinesListCardStackedAdapter;
    private com.intellihealth.truemeds.presentation.dialog.CouponSavingPopUp couponSavingPopUp;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentPromoCode = "";
    private boolean isFromCancelOrder = false;
    private com.intellihealth.truemeds.presentation.fragment.HomeFragment homeFragment;
    private com.intellihealth.truemeds.presentation.fragment.ReferAndEarnFragment referAndEarnFragment;
    private com.intellihealth.truemeds.presentation.fragment.MyOrdersFragment myOrdersFragment;
    private com.intellihealth.truemeds.presentation.fragment.AccountFragment accountFragment;
    private com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet bottomSheet;
    
    public HomePageActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityHomePageBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel p0) {
    }
    
    private final com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel getFtcViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void showFragment(androidx.fragment.app.Fragment targetFragment) {
    }
    
    private final void manageFragmentState(androidx.fragment.app.FragmentTransaction fragmentTransaction, androidx.fragment.app.Fragment targetFragment) {
    }
    
    private final void setViewVisibility() {
    }
    
    private final void setupBackPressedAction() {
    }
    
    private final void initBottomNavigation(boolean recreateBottomNavFragment) {
    }
    
    private final void setOrderTrackingVisibility(com.intellihealth.truemeds.presentation.fragment.HomeFragment targetFragment) {
    }
    
    private final void setObservers() {
    }
    
    public final void checkIsBottomNavigationRounded() {
    }
    
    private final void updateSticky(int cartCount) {
    }
    
    private final void updateNavigationBarState(int actionId) {
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
    
    private final void setListener() {
    }
    
    private final void processUrgencyCoupon(com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon it) {
    }
    
    public final void openApplyCouponBottomSheet(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse) {
    }
    
    private final void openApplyCouponValidationPopup(com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse2, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse couponResponse) {
    }
    
    private final void initView() {
    }
    
    private final void startOrderTrackingAnimation() {
    }
    
    private final void endOrderTrackerAnimation(boolean isAnimationRequired) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void setViewCartVisibility() {
    }
    
    public final void checkFtcCouponDataLocally() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void stickyNotificationWithCallBack(com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResp, java.lang.String time) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}