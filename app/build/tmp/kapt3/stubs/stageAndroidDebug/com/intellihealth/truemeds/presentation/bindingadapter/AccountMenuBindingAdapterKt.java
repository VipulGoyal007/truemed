package com.intellihealth.truemeds.presentation.bindingadapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u001a\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u00a8\u0006\r"}, d2 = {"setUserNavList", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/intellihealth/truemeds/data/model/bottomnav/AccountTabModel;", "homeViewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/AccountTabViewModel;", "setWalletBalanceUIData", "Lcom/intellihealth/salt/views/cards/WalletCard;", "model", "Lcom/intellihealth/salt/models/WalletBalanceModel;", "app_stageAndroidDebug"})
public final class AccountMenuBindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"setUserNavList", "homeViewModel"})
    public static final void setUserNavList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.bottomnav.AccountTabModel> list, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.viewmodel.AccountTabViewModel homeViewModel) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setWalletBalanceUIData"})
    public static final void setWalletBalanceUIData(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.views.cards.WalletCard view, @org.jetbrains.annotations.Nullable()
    com.intellihealth.salt.models.WalletBalanceModel model) {
    }
}