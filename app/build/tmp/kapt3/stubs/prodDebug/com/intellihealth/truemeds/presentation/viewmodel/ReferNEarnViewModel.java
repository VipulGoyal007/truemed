package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010X\u001a\u00020YJ\u0006\u0010Z\u001a\u00020[J\u0010\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020^H\u0002J\u0016\u0010_\u001a\u00020Y2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010`\u001a\u00020\nJ\u0006\u0010a\u001a\u00020bJ\u000e\u0010c\u001a\u00020Y2\u0006\u0010\u0016\u001a\u00020\u0017J(\u0010d\u001a\u00020Y2\u0006\u0010e\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010f\u001a\u00020\u00172\u0006\u0010g\u001a\u00020\u0017J\u0006\u0010h\u001a\u00020YJ\u000e\u0010i\u001a\u00020Y2\u0006\u0010j\u001a\u00020\nR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\n0\n0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001e0\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001e0\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010 R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001e0\u001d8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010 R\u001f\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010\'0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0013R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0013R\u001a\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0019\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0013R\u001a\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001e0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0013R(\u0010<\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00170\u00170\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0013\"\u0004\b>\u0010\u0015R!\u0010?\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010@\u0018\u00010\'0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0013R\u001a\u0010B\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000eR(\u0010E\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\n0\n0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u0010\u0015R(\u0010H\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\n0\n0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0013\"\u0004\bJ\u0010\u0015R(\u0010K\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010L0L0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0013\"\u0004\bN\u0010\u0015R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u0013R\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010U\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00170\u00170\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0013\"\u0004\bW\u0010\u0015\u00a8\u0006k"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/ReferNEarnViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "walletUseCase", "Lcom/intellihealth/truemeds/domain/usecase/TmWalletUseCase;", "helpFaqTncUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HelpFaqTncUseCase;", "appContext", "Landroid/content/Context;", "(Lcom/intellihealth/truemeds/domain/usecase/TmWalletUseCase;Lcom/intellihealth/truemeds/domain/usecase/HelpFaqTncUseCase;Landroid/content/Context;)V", "alreadyRedeemed", "", "getAlreadyRedeemed", "()Z", "setAlreadyRedeemed", "(Z)V", "alreadyRedeemedLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "getAlreadyRedeemedLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setAlreadyRedeemedLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "customerId", "", "getCustomerId", "()Ljava/lang/String;", "setCustomerId", "(Ljava/lang/String;)V", "eventLaunchMyReferrals", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "getEventLaunchMyReferrals", "()Landroidx/lifecycle/LiveData;", "eventLaunchMyReferralsWithWallet", "getEventLaunchMyReferralsWithWallet", "eventReferFailed", "", "getEventReferFailed", "faqById", "", "Lcom/intellihealth/truemeds/data/model/helpfaqtnc/FaqCategoryResponse$Payload;", "getFaqById", "isRewardClicked", "setRewardClicked", "launchMyReferrals", "getLaunchMyReferrals", "launchMyReferralsWithWallet", "getLaunchMyReferralsWithWallet", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "redeemResponse", "Lcom/intellihealth/truemeds/data/model/walletandreferral/RedeemResponse;", "getRedeemResponse", "referFailed", "referFriendChooserTitle", "getReferFriendChooserTitle", "referralCode", "getReferralCode", "setReferralCode", "referralStatusList", "Lcom/intellihealth/truemeds/data/model/walletandreferral/ReferralStatusResponse$ResponseData;", "getReferralStatusList", "remindClick", "getRemindClick", "setRemindClick", "showLoader", "getShowLoader", "setShowLoader", "showView", "getShowView", "setShowView", "totalRewardsEarning", "", "getTotalRewardsEarning", "setTotalRewardsEarning", "walletCardData", "Lcom/intellihealth/salt/models/WalletBalanceModel;", "getWalletCardData", "walletInfoResponse", "Lcom/intellihealth/truemeds/data/model/walletandreferral/WalletInfoResponse;", "getWalletInfoResponse", "yetToPlaceOrderMessage", "getYetToPlaceOrderMessage", "setYetToPlaceOrderMessage", "clickListener", "", "getFaqCategory", "Lkotlinx/coroutines/Job;", "getFaqCategoryById", "categoryId", "", "getReferralStatus", "isNotified", "getReferralWorkingStep", "Lcom/intellihealth/salt/models/HeaderModel;", "getWalletInfo", "redeemReferralCode", "context", "mobileNumber", "referralId", "sendReferAFriendClickedEvent", "setEventReferralScreenViewed", "isBottomNav", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ReferNEarnViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.TmWalletUseCase walletUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase helpFaqTncUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> referFriendChooserTitle = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload>> faqById = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse.ResponseData>> referralStatusList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> walletCardData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse> walletInfoResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse> redeemResponse = null;
    private boolean remindClick = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String customerId;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> launchMyReferrals = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> totalRewardsEarning;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showLoader;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> yetToPlaceOrderMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> referralCode;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> alreadyRedeemedLiveData;
    private boolean alreadyRedeemed = false;
    private boolean isRewardClicked = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> launchMyReferralsWithWallet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> referFailed = null;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    
    @javax.inject.Inject()
    public ReferNEarnViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.TmWalletUseCase walletUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HelpFaqTncUseCase helpFaqTncUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getReferFriendChooserTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.helpfaqtnc.FaqCategoryResponse.Payload>> getFaqById() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.walletandreferral.ReferralStatusResponse.ResponseData>> getReferralStatusList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> getWalletCardData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse> getWalletInfoResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.walletandreferral.RedeemResponse> getRedeemResponse() {
        return null;
    }
    
    public final boolean getRemindClick() {
        return false;
    }
    
    public final void setRemindClick(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomerId() {
        return null;
    }
    
    public final void setCustomerId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getLaunchMyReferrals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getTotalRewardsEarning() {
        return null;
    }
    
    public final void setTotalRewardsEarning(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Double> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getEventLaunchMyReferrals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowLoader() {
        return null;
    }
    
    public final void setShowLoader(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowView() {
        return null;
    }
    
    public final void setShowView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getYetToPlaceOrderMessage() {
        return null;
    }
    
    public final void setYetToPlaceOrderMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getReferralCode() {
        return null;
    }
    
    public final void setReferralCode(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAlreadyRedeemedLiveData() {
        return null;
    }
    
    public final void setAlreadyRedeemedLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final boolean getAlreadyRedeemed() {
        return false;
    }
    
    public final void setAlreadyRedeemed(boolean p0) {
    }
    
    public final boolean isRewardClicked() {
        return false;
    }
    
    public final void setRewardClicked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getLaunchMyReferralsWithWallet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getEventLaunchMyReferralsWithWallet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventReferFailed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    public final void clickListener() {
    }
    
    /**
     * This API used to get the data which includes referral code, header message and wallet banners
     */
    public final void getWalletInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId) {
    }
    
    /**
     * This API will fetch the FAQ list by using the categoryId
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getFaqCategory() {
        return null;
    }
    
    /**
     * This will first fetch ID for the Refer And Earn and then call the next API to get further details
     */
    private final kotlinx.coroutines.Job getFaqCategoryById(int categoryId) {
        return null;
    }
    
    /**
     * This API will fetch the data related to referral list
     */
    public final void getReferralStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, boolean isNotified) {
    }
    
    /**
     * This API is used to to redeem the code from Refer And Earn screen
     */
    public final void redeemReferralCode(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobileNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String referralId) {
    }
    
    /**
     * This are the Referral Working Step's
     */
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.HeaderModel getReferralWorkingStep() {
        return null;
    }
    
    public final void setEventReferralScreenViewed(boolean isBottomNav) {
    }
    
    public final void sendReferAFriendClickedEvent() {
    }
}