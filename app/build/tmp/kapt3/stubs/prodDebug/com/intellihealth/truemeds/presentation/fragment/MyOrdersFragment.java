package com.intellihealth.truemeds.presentation.fragment;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0006\u0010\u001d\u001a\u00020\u0019J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u0019H\u0002J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0006\u0010)\u001a\u00020\u0019J\b\u0010*\u001a\u00020\u0019H\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/intellihealth/truemeds/presentation/fragment/MyOrdersFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/FragmentOrdersBinding;", "kotlin.jvm.PlatformType", "getBinding", "()Lcom/intellihealth/truemeds/databinding/FragmentOrdersBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/FragmentViewBindingDelegate;", "context", "Landroid/content/Context;", "lastClickApplyCTA", "", "getLastClickApplyCTA", "()J", "setLastClickApplyCTA", "(J)V", "mLastClickTime", "mLocationLastClickTime", "myOrdersBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/myorder/MyOrderBottomSheet;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/OrdersTabViewModel;", "disableLoadingView", "", "dialog", "Landroid/app/Dialog;", "enableLoadingView", "initView", "initializeBottomSheet", "isSingleClick", "", "onHiddenChanged", "hidden", "onSwipeRefresh", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setObservers", "setupMobileSectionHeader", "app_prodDebug"})
public final class MyOrdersFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.FragmentViewBindingDelegate binding$delegate = null;
    private android.content.Context context;
    private com.intellihealth.truemeds.presentation.bottomsheet.myorder.MyOrderBottomSheet myOrdersBottomSheet;
    private com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel viewModel;
    private long lastClickApplyCTA = 0L;
    private long mLastClickTime = 0L;
    private long mLocationLastClickTime = 0L;
    
    public MyOrdersFragment() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.FragmentOrdersBinding getBinding() {
        return null;
    }
    
    public final long getLastClickApplyCTA() {
        return 0L;
    }
    
    public final void setLastClickApplyCTA(long p0) {
    }
    
    private final boolean isSingleClick() {
        return false;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onHiddenChanged(boolean hidden) {
    }
    
    public final void initView() {
    }
    
    private final void onSwipeRefresh() {
    }
    
    public final void setObservers() {
    }
    
    private final void initializeBottomSheet() {
    }
    
    public final void disableLoadingView(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog) {
    }
    
    public final void enableLoadingView(@org.jetbrains.annotations.Nullable()
    android.app.Dialog dialog) {
    }
    
    private final void setupMobileSectionHeader() {
    }
}