package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\u0018\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f` H\u0002J\u0018\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u000ej\b\u0012\u0004\u0012\u00020\u0011` H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\"\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0012\u0010+\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020\u0019H\u0016J\b\u0010/\u001a\u00020\u0019H\u0016J\b\u00100\u001a\u00020\u0019H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u0019H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u00065"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/SubstitutesActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivityWithLogin;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivitySubstitutesBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivitySubstitutesBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/login/LoginBottomSheet;", "context", "Landroid/content/Context;", "subsList", "Ljava/util/ArrayList;", "Lcom/intellihealth/truemeds/data/model/subs/SubsModel;", "subsMedList", "Lcom/intellihealth/truemeds/data/model/subs/SubsMedModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/SubstitutePageViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/SubstitutePageViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "clickListner", "", "closeLoginBottomSheet", "extractIntentData", "getMedTitle", "getSaveTitle", "getSpanableString", "getSubList", "Lkotlin/collections/ArrayList;", "getSubMedList", "getTrueCallerUserDetails", "getsafeSpanable", "gettvPlace", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openLoginBottomSheet", "sendLoginPageViewedEvent", "setDataObserver", "setIsTruecaller", "isTruecaller", "", "setListener", "app_prodDebug"})
public final class SubstitutesActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivityWithLogin {
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.data.model.subs.SubsModel> subsList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.data.model.subs.SubsMedModel> subsMedList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.intellihealth.truemeds.presentation.bottomsheet.login.LoginBottomSheet bottomSheet;
    
    public SubstitutesActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivitySubstitutesBinding getBinding() {
        return null;
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.SubstitutePageViewModel getViewModel() {
        return null;
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
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setDataObserver() {
    }
    
    private final void setListener() {
    }
    
    private final void clickListner() {
    }
    
    private final void gettvPlace() {
    }
    
    private final void getSaveTitle() {
    }
    
    private final void getMedTitle() {
    }
    
    private final void getsafeSpanable() {
    }
    
    private final void getSpanableString() {
    }
    
    private final java.util.ArrayList<com.intellihealth.truemeds.data.model.subs.SubsModel> getSubList() {
        return null;
    }
    
    private final java.util.ArrayList<com.intellihealth.truemeds.data.model.subs.SubsMedModel> getSubMedList() {
        return null;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
}