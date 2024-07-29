package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0002J\u0010\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020$H\u0002J\u0012\u0010+\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u001c\u0010.\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u00103\u001a\u00020$H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/CouponActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "applyCouponCallBack", "Lcom/intellihealth/truemeds/presentation/callbacks/CouponBottomSheetCallback;", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityCouponBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityCouponBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "couponCode", "", "getCouponCode", "()Ljava/lang/String;", "setCouponCode", "(Ljava/lang/String;)V", "currentCartValueD", "", "getCurrentCartValueD", "()D", "setCurrentCartValueD", "(D)V", "ftcViewModel", "Lcom/intellihealth/truemeds/mvvm/viewmodel/CountDownTimerViewModel;", "loader", "Landroid/app/Dialog;", "prescriptionCount", "", "getPrescriptionCount", "()I", "setPrescriptionCount", "(I)V", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "clickEvent", "", "extractIntentData", "getApiData", "initFtcCountDownTimer", "millis", "", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openApplyCouponValidationPopup", "couponResponse2", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "couponResponse", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "setupOnBackPresses", "app_stageAndroidDebug"})
public final class CouponActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.callbacks.CouponBottomSheetCallback applyCouponCallBack;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String couponCode = "";
    private double currentCartValueD = 0.0;
    private int prescriptionCount = 0;
    private com.intellihealth.truemeds.mvvm.viewmodel.CountDownTimerViewModel ftcViewModel;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog loader;
    
    public CouponActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityCouponBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCouponCode() {
        return null;
    }
    
    public final void setCouponCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getCurrentCartValueD() {
        return 0.0;
    }
    
    public final void setCurrentCartValueD(double p0) {
    }
    
    public final int getPrescriptionCount() {
        return 0;
    }
    
    public final void setPrescriptionCount(int p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getApiData() {
    }
    
    private final void initViews() {
    }
    
    private final void clickEvent() {
    }
    
    private final void initFtcCountDownTimer(long millis) {
    }
    
    private final void setupOnBackPresses() {
    }
    
    private final void openApplyCouponValidationPopup(com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponResponse2, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse couponResponse) {
    }
}