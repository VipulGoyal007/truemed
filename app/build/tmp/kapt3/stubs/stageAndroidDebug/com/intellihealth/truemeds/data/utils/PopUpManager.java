package com.intellihealth.truemeds.data.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J:\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b\u00a8\u0006\u0012"}, d2 = {"Lcom/intellihealth/truemeds/data/utils/PopUpManager;", "", "()V", "prepareData", "Lcom/intellihealth/truemeds/data/model/home/PopUpModel;", "popUpType", "Lcom/intellihealth/truemeds/data/utils/PopUpType;", "header", "", "message", "showPopUp", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "callback", "Lcom/intellihealth/truemeds/presentation/callbacks/PopUpDialogCallback;", "isCancelable", "", "app_stageAndroidDebug"})
public final class PopUpManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.intellihealth.truemeds.data.utils.PopUpManager INSTANCE = null;
    
    private PopUpManager() {
        super();
    }
    
    public final void showPopUp(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.utils.PopUpType popUpType, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback callback, boolean isCancelable, @org.jetbrains.annotations.NotNull()
    java.lang.String header, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final com.intellihealth.truemeds.data.model.home.PopUpModel prepareData(com.intellihealth.truemeds.data.utils.PopUpType popUpType, java.lang.String header, java.lang.String message) {
        return null;
    }
}