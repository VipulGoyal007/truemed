package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#H\u0002J\u0006\u0010$\u001a\u00020\u001eJ\u0006\u0010%\u001a\u00020\u000eJ\u0006\u0010&\u001a\u00020\u000eJ\u0012\u0010\'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0006\u0010*\u001a\u00020\u001eJ\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\u001eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00061"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/AddPatientActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityAddPatientBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityAddPatientBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "context", "Landroid/content/Context;", "editDeletePatientBottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/EditDeletePatientBottomSheet;", "fromDeliveryDelay", "", "isEditPatient", "isFirstTime", "isMySelf", "openOrderSummary", "patientExperimentValue", "", "patientJson", "redirectToCart", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ManagePatientViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/ManagePatientViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addEditTextChangeListener", "", "extractIntentData", "getBundleData", "getGender", "gender", "", "init", "isEmptyFieldsValue", "isFieldsValueChange", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openBottomSheet", "scrollToPosition", "view", "Landroid/view/View;", "setEventListener", "setInputDigits", "setupOnBackPresses", "app_prodDebug"})
public final class AddPatientActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String patientJson;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private android.content.Context context;
    private boolean isEditPatient = false;
    private boolean isMySelf = false;
    private boolean openOrderSummary = false;
    private boolean fromDeliveryDelay = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String patientExperimentValue = "";
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.bottomsheet.EditDeletePatientBottomSheet editDeletePatientBottomSheet;
    private boolean redirectToCart = false;
    private boolean isFirstTime = true;
    
    public AddPatientActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel getViewModel() {
        return null;
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityAddPatientBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    private final void scrollToPosition(android.view.View view) {
    }
    
    public final void init() {
    }
    
    private final void setInputDigits() {
    }
    
    private final void setupOnBackPresses() {
    }
    
    public final void openBottomSheet() {
    }
    
    public final boolean isEmptyFieldsValue() {
        return false;
    }
    
    public final boolean isFieldsValueChange() {
        return false;
    }
    
    private final java.lang.String getGender(int gender) {
        return null;
    }
    
    private final void setEventListener() {
    }
    
    private final void getBundleData() {
    }
    
    private final void addEditTextChangeListener() {
    }
}