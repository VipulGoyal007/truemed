package com.intellihealth.truemeds.presentation.bottomsheet.cart;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u0005\u00a2\u0006\u0002\u0010\u000bJ\b\u0010#\u001a\u00020\u0003H\u0016J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010.\u001a\u00020/H\u0002J\b\u00100\u001a\u00020/H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u00061"}, d2 = {"Lcom/intellihealth/truemeds/presentation/bottomsheet/cart/ViewPrescriptionBottomSheet;", "Lcom/intellihealth/salt/views/bottomsheet/BottomSheet;", "position", "", "prescriptionList", "", "", "title", "isFromPDPage", "", "(ILjava/util/List;Ljava/lang/String;Z)V", "()V", "binding", "Lcom/intellihealth/truemeds/databinding/BottomsheetViewPrescriptionBinding;", "bottomSheetHeaderModel", "Lcom/intellihealth/salt/models/BottomsheetHeaderModel;", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "()Z", "setFromPDPage", "(Z)V", "getPosition", "()I", "setPosition", "(I)V", "getPrescriptionList", "()Ljava/util/List;", "setPrescriptionList", "(Ljava/util/List;)V", "productImageViewPagerBSAdapter", "Lcom/intellihealth/truemeds/presentation/adapter/ProductImageViewPagerBSAdapter;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getTheme", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setListener", "", "setZoomViewPager", "app_stageAndroidDebug"})
public final class ViewPrescriptionBottomSheet extends com.intellihealth.salt.views.bottomsheet.BottomSheet {
    private com.google.android.material.bottomsheet.BottomSheetDialog dialog;
    private com.intellihealth.truemeds.databinding.BottomsheetViewPrescriptionBinding binding;
    private com.intellihealth.salt.models.BottomsheetHeaderModel bottomSheetHeaderModel;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.adapter.ProductImageViewPagerBSAdapter productImageViewPagerBSAdapter;
    private int position = 0;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> prescriptionList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title = "";
    private boolean isFromPDPage = false;
    
    public ViewPrescriptionBottomSheet() {
        super();
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPrescriptionList() {
        return null;
    }
    
    public final void setPrescriptionList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isFromPDPage() {
        return false;
    }
    
    public final void setFromPDPage(boolean p0) {
    }
    
    public ViewPrescriptionBottomSheet(int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> prescriptionList, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean isFromPDPage) {
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