package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/WalletTransactionsViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "()V", "timeIntervalBottomSheetData", "", "Lcom/intellihealth/truemeds/data/model/wallet/TimeIntervalBottomSheetModel;", "getTimeIntervalBottomSheetData", "()Ljava/util/List;", "setTimeIntervalBottomSheetData", "(Ljava/util/List;)V", "walletCardCreditData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/salt/models/WalletBalanceModel;", "getWalletCardCreditData", "()Landroidx/lifecycle/MutableLiveData;", "setWalletCardCreditData", "(Landroidx/lifecycle/MutableLiveData;)V", "walletCardRewardData", "getWalletCardRewardData", "setWalletCardRewardData", "app_prodDebug"})
public final class WalletTransactionsViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> walletCardRewardData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> walletCardCreditData;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel> timeIntervalBottomSheetData;
    
    public WalletTransactionsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> getWalletCardRewardData() {
        return null;
    }
    
    public final void setWalletCardRewardData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> getWalletCardCreditData() {
        return null;
    }
    
    public final void setWalletCardCreditData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel> getTimeIntervalBottomSheetData() {
        return null;
    }
    
    public final void setTimeIntervalBottomSheetData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel> p0) {
    }
}