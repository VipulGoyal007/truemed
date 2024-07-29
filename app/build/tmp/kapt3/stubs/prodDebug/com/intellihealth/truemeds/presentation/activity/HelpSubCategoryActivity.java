package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/HelpSubCategoryActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityHelpSubcategoryBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityHelpSubcategoryBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "categoryName", "", "context", "Landroid/content/Context;", "helpBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/help/HelpBottomSheet;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/HelpViewModel;", "extractIntentData", "", "initView", "initializeBottomSheet", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "redirectToSubCategoryDetails", "setCallbacks", "setObservers", "app_prodDebug"})
public final class HelpSubCategoryActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.HelpViewModel viewModel;
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String categoryName = "";
    private com.intellihealth.truemeds.presentation.bottomsheet.help.HelpBottomSheet helpBottomSheet;
    
    public HelpSubCategoryActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityHelpSubcategoryBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void initView() {
    }
    
    private final void setCallbacks() {
    }
    
    private final void setObservers() {
    }
    
    private final void initializeBottomSheet() {
    }
    
    private final void redirectToSubCategoryDetails() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}