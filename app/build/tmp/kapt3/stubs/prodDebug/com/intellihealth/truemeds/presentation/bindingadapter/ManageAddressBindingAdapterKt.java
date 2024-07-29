package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"setManageAddressChipHomeData", "", "view", "Lcom/intellihealth/salt/views/chip/Chip;", "data", "", "setManageAddressChipOfficeData", "setManageAddressChipOtherData", "setManageAddressInputFieldData", "Lcom/intellihealth/salt/views/edittext/InputFieldLayout;", "setManageAddressList", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/ManageAddressViewModel;", "app_prodDebug"})
public final class ManageAddressBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setManageAddressList", "viewmodel"})
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public static final void setManageAddressList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel viewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setManageAddressInputFieldData"})
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public static final void setManageAddressInputFieldData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.edittext.InputFieldLayout view, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setManageAddressChipOfficeData"})
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public static final void setManageAddressChipOfficeData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.chip.Chip view, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setManageAddressChipOtherData"})
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public static final void setManageAddressChipOtherData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.chip.Chip view, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setManageAddressChipHomeData"})
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public static final void setManageAddressChipHomeData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.chip.Chip view, @org.jetbrains.annotations.Nullable()
    java.lang.String data) {
    }
}