package com.intellihealth.truemeds.presentation.fragment;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0017H\u0002J\u0012\u0010\'\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001fH\u0016J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u001fH\u0002R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/LoginMobileNumberFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "type", "", "_pageSection", "(Ljava/lang/String;Ljava/lang/String;)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentLoginMobileNumberBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/intellihealth/truemeds/databinding/FragmentLoginMobileNumberBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/FragmentViewBindingDelegate;", "enteredMobileNo", "firebaseEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEventUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEventUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "isFromBottomsheet", "", "pageSection", "sheetType", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/LoginViewModel;", "checkNumberStartsWith", "clipboardText", "disableLoadingView", "", "dialog", "Landroid/app/Dialog;", "enableLoadingView", "getOTPClicked", "initView", "isProgressLoaderVisible", "isShow", "onClick", "v", "Landroid/view/View;", "onPause", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "sendLoginPageViewedEvent", "setEventListener", "app_stageAndroidDebug"})
public final class LoginMobileNumberFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.FragmentViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String enteredMobileNo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sheetType = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pageSection = "";
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase;
    private boolean isFromBottomsheet = false;
    
    public LoginMobileNumberFragment() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.FragmentLoginMobileNumberBinding getBinding() {
        return null;
    }
    
    public LoginMobileNumberFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String _pageSection) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase getFirebaseEventUseCase() {
        return null;
    }
    
    public final void setFirebaseEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase p0) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void initView() {
    }
    
    private final void isProgressLoaderVisible(boolean isShow) {
    }
    
    private final void setEventListener() {
    }
    
    private final boolean checkNumberStartsWith(java.lang.String clipboardText) {
        return false;
    }
    
    private final void sendLoginPageViewedEvent() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void disableLoadingView(android.app.Dialog dialog) {
    }
    
    private final void enableLoadingView(android.app.Dialog dialog) {
    }
    
    private final void getOTPClicked() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
}