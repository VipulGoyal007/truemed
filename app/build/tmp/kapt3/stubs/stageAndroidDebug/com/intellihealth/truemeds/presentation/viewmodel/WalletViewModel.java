package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u000eH\u0002J\u0006\u0010J\u001a\u00020HJ\u0006\u0010K\u001a\u00020HJ\u0006\u0010L\u001a\u00020HJ\u0012\u0010M\u001a\u00020\u001f2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J\u000e\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u001fJ\u001e\u0010Q\u001a\u00020O2\u0006\u0010P\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020\u001fJ*\u0010T\u001a\b\u0012\u0004\u0012\u0002010\t2\u001a\u0010U\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010F0Vj\n\u0012\u0006\u0012\u0004\u0018\u00010F`WH\u0002J\u0006\u0010X\u001a\u00020OJ\u000e\u0010Y\u001a\u00020O2\u0006\u0010Z\u001a\u00020[J\u0006\u0010\\\u001a\u00020OJ\u000e\u0010]\u001a\u00020O2\u0006\u0010Z\u001a\u00020[J\u0006\u0010^\u001a\u00020OJ\u000e\u0010_\u001a\u00020O2\u0006\u0010Z\u001a\u00020[J\u0016\u0010`\u001a\u00020O2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020[J\u0006\u0010a\u001a\u00020OJ\u0014\u0010b\u001a\u0004\u0018\u00010\u001f2\b\u0010c\u001a\u0004\u0018\u00010\u001fH\u0002R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u0017R\u0019\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\fR \u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\fR \u00103\u001a\b\u0012\u0004\u0012\u0002040\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u0017R \u00107\u001a\b\u0012\u0004\u0012\u0002040\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u0017R \u0010:\u001a\b\u0012\u0004\u0012\u0002040\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u0017R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\fR\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006d"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/WalletViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "walletUseCase", "Lcom/intellihealth/truemeds/domain/usecase/TmWalletUseCase;", "helpFaqTncUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HelpFaqTncUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/TmWalletUseCase;Lcom/intellihealth/truemeds/domain/usecase/HelpFaqTncUseCase;)V", "faqById", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse$Payload;", "getFaqById", "()Landroidx/lifecycle/MutableLiveData;", "getWalletTransactionsCount", "", "getGetWalletTransactionsCount", "()I", "setGetWalletTransactionsCount", "(I)V", "isRewardTransaction", "", "kotlin.jvm.PlatformType", "setRewardTransaction", "(Landroidx/lifecycle/MutableLiveData;)V", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "pageName", "", "getPageName", "()Ljava/lang/String;", "setPageName", "(Ljava/lang/String;)V", "selectedTimeIntervalFromBottomSheet", "getSelectedTimeIntervalFromBottomSheet", "setSelectedTimeIntervalFromBottomSheet", "shareCode", "getShareCode", "timeIntervalBottomSheetData", "", "Lcom/intellihealth/truemeds/data/model/wallet/TimeIntervalBottomSheetModel;", "getTimeIntervalBottomSheetData", "()Ljava/util/List;", "setTimeIntervalBottomSheetData", "(Ljava/util/List;)V", "transactionList", "Lcom/intellihealth/salt/models/TransactionLineItemModel;", "getTransactionList", "walletCardCreditData", "Lcom/intellihealth/salt/models/WalletBalanceModel;", "getWalletCardCreditData", "setWalletCardCreditData", "walletCardData", "getWalletCardData", "setWalletCardData", "walletCardRewardData", "getWalletCardRewardData", "setWalletCardRewardData", "walletInfoResponse", "Lcom/intellihealth/truemeds/data/model/walletandreferral/WalletInfoResponse;", "getWalletInfoResponse", "walletTransactionResponse", "Lcom/intellihealth/truemeds/data/model/walletandreferral/WalletTransactionInfoResponse;", "getWalletTransactionResponse", "getAmount", "", "item", "Lcom/intellihealth/truemeds/data/model/walletandreferral/LedgerItem;", "getFaqCategoryById", "Lkotlinx/coroutines/Job;", "categoryId", "getFaqCategoryCredit", "getFaqCategoryReward", "getFaqCategoryWallet", "getTransactionDescription", "getWalletInfo", "", "customerId", "getWalletTransactions", "fromDate", "toDate", "mapToTransactionModelList", "ledgerItem", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sendReferAFriendClickedEvent", "sendTmWalletBackFirebaseEvent", "firebaseEventModel", "Lcom/intellihealth/truemeds/presentation/analytics/model/firebase/FirebaseEventModel;", "sendTmWalletCreditTransactions", "sendTmWalletFaqFirebaseEvent", "sendTmWalletRewardTransactions", "sendTmWalletTermAndConditionFirebaseEvent", "sendTmWalletTransactionFirebaseEvent", "sendTmWalletViewed", "strDateTimeToDate", "strDateTime", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class WalletViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.TmWalletUseCase walletUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase helpFaqTncUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload>> faqById = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.TransactionLineItemModel>> transactionList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse> walletInfoResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse> walletTransactionResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> shareCode = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRewardTransaction;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> selectedTimeIntervalFromBottomSheet;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pageName = "WalletActivity";
    private int getWalletTransactionsCount = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> walletCardData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> walletCardRewardData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> walletCardCreditData;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel> timeIntervalBottomSheetData;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    
    @javax.inject.Inject()
    public WalletViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.TmWalletUseCase walletUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase helpFaqTncUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload>> getFaqById() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.TransactionLineItemModel>> getTransactionList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse> getWalletInfoResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.walletandreferral.WalletTransactionInfoResponse> getWalletTransactionResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getShareCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRewardTransaction() {
        return null;
    }
    
    public final void setRewardTransaction(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSelectedTimeIntervalFromBottomSheet() {
        return null;
    }
    
    public final void setSelectedTimeIntervalFromBottomSheet(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPageName() {
        return null;
    }
    
    public final void setPageName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getGetWalletTransactionsCount() {
        return 0;
    }
    
    public final void setGetWalletTransactionsCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> getWalletCardData() {
        return null;
    }
    
    public final void setWalletCardData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    /**
     * This API used to get the wallet info data
     */
    public final void getWalletInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId) {
    }
    
    /**
     * This API will fetch the FAQ list by using the categoryId - Wallet, Reward and Credit
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getFaqCategoryWallet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getFaqCategoryReward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getFaqCategoryCredit() {
        return null;
    }
    
    /**
     * This will first fetch ID for the Refer And Earn and then call the next API to get further details
     */
    private final kotlinx.coroutines.Job getFaqCategoryById(int categoryId) {
        return null;
    }
    
    /**
     * This API used to get the wallet transaction data as per the provided from date and to date
     */
    public final void getWalletTransactions(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String fromDate, @org.jetbrains.annotations.NotNull()
    java.lang.String toDate) {
    }
    
    private final java.util.List<com.intellihealth.salt.models.TransactionLineItemModel> mapToTransactionModelList(java.util.ArrayList<com.intellihealth.truemeds.data.model.walletandreferral.LedgerItem> ledgerItem) {
        return null;
    }
    
    private final java.lang.String strDateTimeToDate(java.lang.String strDateTime) {
        return null;
    }
    
    private final double getAmount(com.intellihealth.truemeds.data.model.walletandreferral.LedgerItem item) {
        return 0.0;
    }
    
    private final java.lang.String getTransactionDescription(com.intellihealth.truemeds.data.model.walletandreferral.LedgerItem item) {
        return null;
    }
    
    public final void sendReferAFriendClickedEvent() {
    }
    
    public final void sendTmWalletCreditTransactions() {
    }
    
    public final void sendTmWalletRewardTransactions() {
    }
    
    public final void sendTmWalletViewed() {
    }
    
    public final void sendTmWalletBackFirebaseEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
    }
    
    public final void sendTmWalletFaqFirebaseEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
    }
    
    public final void sendTmWalletTransactionFirebaseEvent(boolean isRewardTransaction, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
    }
    
    public final void sendTmWalletTermAndConditionFirebaseEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.firebase.FirebaseEventModel firebaseEventModel) {
    }
}