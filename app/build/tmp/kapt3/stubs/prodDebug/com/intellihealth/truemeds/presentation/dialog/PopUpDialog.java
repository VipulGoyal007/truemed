package com.intellihealth.truemeds.presentation.dialog;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/intellihealth/truemeds/presentation/dialog/PopUpDialog;", "Landroidx/fragment/app/DialogFragment;", "model", "Lcom/intellihealth/truemeds/data/model/home/PopUpModel;", "callback", "Lcom/intellihealth/truemeds/presentation/callbacks/PopUpDialogCallback;", "(Lcom/intellihealth/truemeds/data/model/home/PopUpModel;Lcom/intellihealth/truemeds/presentation/callbacks/PopUpDialogCallback;)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/DialogRoundedCornerBinding;", "getTheme", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "", "setOutsideClickListener", "app_prodDebug"})
public final class PopUpDialog extends androidx.fragment.app.DialogFragment {
    private com.intellihealth.truemeds.databinding.DialogRoundedCornerBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.home.PopUpModel model;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback callback;
    
    public PopUpDialog() {
        super();
    }
    
    public PopUpDialog(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.home.PopUpModel model, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback callback) {
        super();
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setListener() {
    }
    
    private final void setOutsideClickListener() {
    }
}