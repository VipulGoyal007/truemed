package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a(\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a7\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\u0010\u001a(\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a \u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0007\u00a8\u0006\u0018"}, d2 = {"loadImage", "", "view", "Landroid/view/View;", "imageUrl", "", "setMedicineList", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;", "setPastPrescriptionDetailsList", "Lcom/intellihealth/truemeds/data/model/prescription/ActiveRx;", "index", "", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;ILcom/intellihealth/truemeds/presentation/viewmodel/PrescriptionViewModel;)Lkotlin/Unit;", "setPastPrescriptionList", "Lcom/intellihealth/truemeds/data/model/prescription/PastPrescriptions;", "setPrescriptionList", "Lcom/intellihealth/salt/views/buttons/Button;", "expanded", "", "listSize", "app_prodDebug"})
public final class PastPrescriptionItemBindingKt {
    
    @androidx.databinding.BindingAdapter(value = {"setPastPrescriptionList", "viewModel"})
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public static final void setPastPrescriptionList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.prescription.PastPrescriptions> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setPastPrescriptionDetailsList", "parentIndex", "viewModel"})
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @org.jetbrains.annotations.Nullable()
    public static final kotlin.Unit setPastPrescriptionDetailsList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.prescription.ActiveRx> list, int index, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"setMedicineList", "viewModel"})
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public static final void setMedicineList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"rxImageUrl"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setPrescriptionList", "listSize"})
    public static final void setPrescriptionList(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.buttons.Button view, boolean expanded, int listSize) {
    }
}