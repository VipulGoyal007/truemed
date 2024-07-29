package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010=\u001a\u00020>H\u0002J\u0006\u0010?\u001a\u00020>J\b\u0010@\u001a\u00020>H\u0002J\b\u0010A\u001a\u00020>H\u0016J\b\u0010B\u001a\u00020$H\u0002J\b\u0010C\u001a\u00020>H\u0002J\u0012\u0010D\u001a\u00020>2\b\u0010E\u001a\u0004\u0018\u00010FH\u0014J\b\u0010G\u001a\u00020>H\u0014J\b\u0010H\u001a\u00020>H\u0002J\u0006\u0010I\u001a\u00020>J\b\u0010J\u001a\u00020>H\u0002J\b\u0010K\u001a\u00020>H\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R\u000e\u0010*\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R\u001a\u0010.\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u00106\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010%\"\u0004\b8\u0010\'R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006L"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/OrderStatusActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "activityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityOrderStatusBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityOrderStatusBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/AddReminderBottomSheet;", "getBottomSheet", "()Lcom/intellihealth/truemeds/presentation/bottomsheet/AddReminderBottomSheet;", "bottomSheet$delegate", "Lkotlin/Lazy;", "coolDownSeconds", "", "delayMillis", "", "getDelayMillis", "()J", "firebaseEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEventUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEventUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "isAnotherActivityClik", "", "()Z", "setAnotherActivityClik", "(Z)V", "isReturnBack", "setReturnBack", "lastClickTime", "onFinishReCreateHomePage", "getOnFinishReCreateHomePage", "setOnFinishReCreateHomePage", "orderId", "getOrderId", "setOrderId", "(J)V", "productDetailViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ProductDetailViewModel;", "reminderViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;", "requestChangeToCod", "getRequestChangeToCod", "setRequestChangeToCod", "toolTip", "Lcom/intellihealth/salt/views/tooltip/DefaultExpandedTooltip;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/OrderStatusViewModel;", "allCallbackAndClick", "", "changedActionClicked", "eventListener", "extractIntentData", "isSingleClickHandle", "onBackPressAction", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "openPaymentPage", "ratingToPlayStore", "setData", "setStatusBarColor", "app_stageAndroidDebug"})
public final class OrderStatusActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.OrderStatusViewModel viewModel;
    private com.intellihealth.truemeds.presentation.viewmodel.ReminderViewModel reminderViewModel;
    private com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel productDetailViewModel;
    private long orderId = 0L;
    private boolean isReturnBack = false;
    private boolean onFinishReCreateHomePage = false;
    private long lastClickTime = 0L;
    private final int coolDownSeconds = 2;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.salt.views.tooltip.DefaultExpandedTooltip toolTip;
    private final long delayMillis = 4000L;
    private boolean isAnotherActivityClik = false;
    private boolean requestChangeToCod = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy bottomSheet$delegate = null;
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase;
    @org.jetbrains.annotations.NotNull()
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityLauncher;
    
    public OrderStatusActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityOrderStatusBinding getBinding() {
        return null;
    }
    
    public final long getOrderId() {
        return 0L;
    }
    
    public final void setOrderId(long p0) {
    }
    
    public final boolean isReturnBack() {
        return false;
    }
    
    public final void setReturnBack(boolean p0) {
    }
    
    public final boolean getOnFinishReCreateHomePage() {
        return false;
    }
    
    public final void setOnFinishReCreateHomePage(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getHandler() {
        return null;
    }
    
    public final long getDelayMillis() {
        return 0L;
    }
    
    public final boolean isAnotherActivityClik() {
        return false;
    }
    
    public final void setAnotherActivityClik(boolean p0) {
    }
    
    public final boolean getRequestChangeToCod() {
        return false;
    }
    
    public final void setRequestChangeToCod(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.bottomsheet.AddReminderBottomSheet getBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase getFirebaseEventUseCase() {
        return null;
    }
    
    public final void setFirebaseEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void eventListener() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void setStatusBarColor() {
    }
    
    private final void setData() {
    }
    
    private final void allCallbackAndClick() {
    }
    
    private final void onBackPressAction() {
    }
    
    private final void openPaymentPage() {
    }
    
    public final void changedActionClicked() {
    }
    
    public final void ratingToPlayStore() {
    }
    
    private final boolean isSingleClickHandle() {
        return false;
    }
}