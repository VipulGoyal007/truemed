package com.intellihealth.truemeds.presentation.fragment;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0018\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020\u0011H\u0016J\b\u0010(\u001a\u00020\u001fH\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\u001a\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006."}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/AccountFragment;", "Landroidx/fragment/app/Fragment;", "()V", "anim", "Landroid/os/Bundle;", "getAnim", "()Landroid/os/Bundle;", "setAnim", "(Landroid/os/Bundle;)V", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentAccountBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/intellihealth/truemeds/databinding/FragmentAccountBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/FragmentViewBindingDelegate;", "isEditProfileClicked", "", "logoutBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/logout/LogoutBottomSheet;", "mLastClickTime", "", "managePatientViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ManagePatientViewModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "clickListener", "", "initView", "launchActivity", "activityName", "", "position", "", "onHiddenChanged", "hidden", "onResume", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "app_prodDebug"})
public final class AccountFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.FragmentViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.bottomsheet.logout.LogoutBottomSheet logoutBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private android.os.Bundle anim;
    private com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel managePatientViewModel;
    private long mLastClickTime = 0L;
    private boolean isEditProfileClicked = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public AccountFragment() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.FragmentAccountBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Bundle getAnim() {
        return null;
    }
    
    public final void setAnim(@org.jetbrains.annotations.NotNull()
    android.os.Bundle p0) {
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel getViewModel() {
        return null;
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void clickListener() {
    }
    
    private final void launchActivity(java.lang.String activityName, int position) {
    }
    
    @java.lang.Override()
    public void onHiddenChanged(boolean hidden) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}