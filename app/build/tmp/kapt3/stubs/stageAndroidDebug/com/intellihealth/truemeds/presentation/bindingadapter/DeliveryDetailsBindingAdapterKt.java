package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a0\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007\u001a2\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0010H\u0007\u001a\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007\u00a8\u0006\u0019"}, d2 = {"setAddressList", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/salt/models/AddressPatientDetailsCardModel;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "setDeliveryDetailsAddressList", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "callback", "Lcom/intellihealth/truemeds/data/callback/AddressClickCallback;", "setDeliveryDetailsPatientsList", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "Lcom/intellihealth/truemeds/data/callback/PatientClickCallback;", "setListStatus", "Lcom/intellihealth/salt/views/buttons/Button;", "expanded", "", "setPatientLabel", "Lcom/intellihealth/salt/views/edittext/InputFieldLayout;", "experiment", "", "app_stageAndroidDebug"})
public final class DeliveryDetailsBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setDeliveryDetailsPatientsList", "viewmodel", "callback"})
    public static final void setDeliveryDetailsPatientsList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.PatientClickCallback callback) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setAddressList", "viewmodel"})
    public static final void setAddressList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.salt.models.AddressPatientDetailsCardModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setDeliveryDetailsAddressList", "viewmodel", "callback"})
    public static final void setDeliveryDetailsAddressList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.callback.AddressClickCallback callback) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setListStatus"})
    public static final void setListStatus(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.buttons.Button view, boolean expanded) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setPatientLabel"})
    public static final void setPatientLabel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.edittext.InputFieldLayout view, @org.jetbrains.annotations.NotNull()
    java.lang.String experiment) {
    }
}