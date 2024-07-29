package com.intellihealth.truemeds.presentation.bottomsheet;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0017H\u0016J\b\u0010%\u001a\u00020#H\u0002J\u0012\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020,2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u00103\u001a\u00020#H\u0002J.\u00104\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00065"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/PaymentChangeSelectionBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetPaymentChangeSelectionBinding;", "clickedOnPage", "", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "couponCode", "getCouponCode", "setCouponCode", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "item", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "getItem", "()Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;", "setItem", "(Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse$ResponseData;)V", "position", "", "getPosition", "()I", "setPosition", "(I)V", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;", "getViewModel", "()Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;", "setViewModel", "(Lcom/intellihealth/truemeds/presentation/viewmodel/PaymentOptionsViewModel;)V", "closeBottomSheet", "", "getTheme", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setEventListeners", "setupData", "app_stageAndroidDebug"})
public final class PaymentChangeSelectionBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    public com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel;
    private com.intellihealth.truemeds.databinding.BottomsheetPaymentChangeSelectionBinding binding;
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    public com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData item;
    private int position = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String couponCode = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    
    public PaymentChangeSelectionBottomSheet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCouponCode() {
        return null;
    }
    
    public final void setCouponCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void setupData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData item, int position, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String couponCode, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Inflate the bottomsheet view
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * 1) Bind the viewmodel to the view inside initView()
     * 2) Setup event listeners
     */
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initView() {
    }
    
    /**
     * observe eventPaymentChange whenever change mode button is clicked,
     * observe eventPaymentChangeCloseBS whenever dont remove button is clicked and call dismiss to close the bottomsheet
     */
    private final void setEventListeners() {
    }
    
    /**
     * Set the style for bottomsheet
     */
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
    
    private final void closeBottomSheet() {
    }
}