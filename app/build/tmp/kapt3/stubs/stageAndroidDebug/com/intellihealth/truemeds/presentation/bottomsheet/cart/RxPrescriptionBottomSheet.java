package com.intellihealth.truemeds.presentation.bottomsheet.cart;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/cart/RxPrescriptionBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "position", "", "prescriptionList", "", "Lcom/intellihealth/truemeds/data/model/orderflow/OrderRxInfo;", "(ILjava/util/List;)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetRxPrescriptionBinding;", "bottomSheetHeaderModel", "Lcom/intellihealth/salt/models/BottomsheetHeaderModel;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getPosition", "()I", "setPosition", "(I)V", "productImageViewPagerBSAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/ProductImageViewPagerBSAdapter;", "getTheme", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setListener", "", "setZoomViewPager", "app_stageAndroidDebug"})
public final class RxPrescriptionBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    private com.intellihealth.truemeds.databinding.BottomsheetRxPrescriptionBinding binding;
    private com.intellihealth.salt.models.BottomsheetHeaderModel bottomSheetHeaderModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.ProductImageViewPagerBSAdapter productImageViewPagerBSAdapter;
    private int position = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> prescriptionList;
    
    public RxPrescriptionBottomSheet() {
        super();
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    public RxPrescriptionBottomSheet(int position, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> prescriptionList) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setZoomViewPager() {
    }
    
    private final void setListener() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public int getTheme() {
        return 0;
    }
}