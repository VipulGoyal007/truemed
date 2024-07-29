package com.intellihealth.truemeds.presentation.activity;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002J\b\u0010-\u001a\u00020)H\u0002J\u0006\u0010.\u001a\u00020)J\u0010\u0010/\u001a\u00020)2\b\b\u0002\u00100\u001a\u000201J\b\u00102\u001a\u00020)H\u0016J\b\u00103\u001a\u00020)H\u0002J\u0012\u00104\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u00106\u001a\u00020)H\u0002J\b\u00107\u001a\u00020)H\u0002J\b\u00108\u001a\u00020)H\u0002J\b\u00109\u001a\u00020)H\u0002J\b\u0010:\u001a\u00020)H\u0002J\b\u0010;\u001a\u00020)H\u0002J\b\u0010<\u001a\u00020)H\u0002J\b\u0010=\u001a\u00020)H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/intellihealth/truemeds/presentation/activity/WalletTransactionsActivity;", "Lcom/intellihealth/truemeds/presentation/activity/BaseActivity;", "()V", "anim", "Landroid/os/Bundle;", "getAnim", "()Landroid/os/Bundle;", "setAnim", "(Landroid/os/Bundle;)V", "binding", "Lcom/intellihealth/truemeds/databinding/ActivityWalletTranasctionsBinding;", "getBinding", "()Lcom/intellihealth/truemeds/databinding/ActivityWalletTranasctionsBinding;", "binding$delegate", "Lcom/intellihealth/truemeds/presentation/utils/ActivityViewBindingDelegate;", "bottomSheet", "Lcom/intellihealth/truemeds/presentation/bottomsheet/wallet/ChooseTimeIntervalBottomSheet;", "firebaseEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "getFirebaseEventUseCase", "()Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;", "setFirebaseEventUseCase", "(Lcom/intellihealth/truemeds/domain/usecase/analytics/FirebaseEventUseCase;)V", "isFirstTimeDataLoaded", "", "isRewardTransaction", "selectedDateFromBottomSheet", "Ljava/util/Date;", "selectedDateToBottomSheet", "selectedTimeIntervalFromBottomSheet", "", "strFromDate", "strSelectedCustomDate", "getStrSelectedCustomDate", "()Ljava/lang/String;", "setStrSelectedCustomDate", "(Ljava/lang/String;)V", "strToDate", "viewModel", "Lcom/intellihealth/truemeds/presentation/viewmodel/WalletViewModel;", "addFaq", "", "faqlist", "", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse$Payload;", "backFirebaseEventCall", "callDateFilerFirebaseevent", "checkForNetworkAndDoApiCallings", "type", "", "extractIntentData", "initViewModelApi", "onCreate", "savedInstanceState", "setAndObserveData", "setupData", "setupOnBackPresses", "showCustomTransactionList", "showLastMonthTransactionList", "showLastSevenDaysTransactionList", "showRecentTransactionList", "showThisMonthTransactionList", "app_stageAndroidDebug"})
public final class WalletTransactionsActivity extends com.intellihealth.truemeds.presentation.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.utils.ActivityViewBindingDelegate binding$delegate = null;
    private com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel viewModel;
    private boolean isRewardTransaction = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedTimeIntervalFromBottomSheet = "Recent";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strFromDate = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strToDate = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strSelectedCustomDate = "";
    @org.jetbrains.annotations.Nullable()
    private java.util.Date selectedDateFromBottomSheet;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date selectedDateToBottomSheet;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.presentation.bottomsheet.wallet.ChooseTimeIntervalBottomSheet bottomSheet;
    private boolean isFirstTimeDataLoaded = false;
    @org.jetbrains.annotations.NotNull()
    private android.os.Bundle anim;
    @javax.inject.Inject()
    public com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase firebaseEventUseCase;
    
    public WalletTransactionsActivity() {
        super();
    }
    
    private final com.intellihealth.truemeds.databinding.ActivityWalletTranasctionsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrSelectedCustomDate() {
        return null;
    }
    
    public final void setStrSelectedCustomDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Bundle getAnim() {
        return null;
    }
    
    public final void setAnim(@org.jetbrains.annotations.NotNull()
    android.os.Bundle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase getFirebaseEventUseCase() {
        return null;
    }
    
    public final void setFirebaseEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.FirebaseEventUseCase p0) {
    }
    
    @java.lang.Override()
    public void extractIntentData() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupData() {
    }
    
    private final void backFirebaseEventCall() {
    }
    
    private final void initViewModelApi() {
    }
    
    private final void setAndObserveData() {
    }
    
    private final void addFaq(java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload> faqlist) {
    }
    
    private final void showLastSevenDaysTransactionList() {
    }
    
    private final void showRecentTransactionList() {
    }
    
    private final void showLastMonthTransactionList() {
    }
    
    private final void showThisMonthTransactionList() {
    }
    
    private final void showCustomTransactionList() {
    }
    
    public final void checkForNetworkAndDoApiCallings(int type) {
    }
    
    private final void setupOnBackPresses() {
    }
    
    public final void callDateFilerFirebaseevent() {
    }
}