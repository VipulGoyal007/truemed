package com.intellihealth.truemeds.domain.usecase.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\tJ\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001032\u0006\u00104\u001a\u00020\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/analytics/CleverTapEventUseCase;", "", "cleverTapEvent", "Lcom/intellihealth/truemeds/presentation/analytics/CleverTapEvent;", "(Lcom/intellihealth/truemeds/presentation/analytics/CleverTapEvent;)V", "onUserLoginCleverTap", "", "pushFcmRegistrationId", "fcmId", "", "register", "", "pushProfileCleverTap", "sendAppOrderPlacedEventToCleverTap", "ctAppOrderPlaced", "Lcom/intellihealth/truemeds/data/model/clevertap/CtAppOrderPlaced;", "sendCartViewedEventToCleverTap", "ctCartViewed", "Lcom/intellihealth/truemeds/data/model/clevertap/CtCartViewed;", "sendItemAddedEventToClevertap", "ctItemAdded", "Lcom/intellihealth/truemeds/data/model/clevertap/CtItemAdded;", "sendItemSearchedEventToClevertap", "ctItemSearched", "Lcom/intellihealth/truemeds/data/model/clevertap/CtItemSearched;", "sendLoggedOutEventToClevertap", "customerId", "", "sendLoginSuccessFullEventToClevertap", "isNewUser", "sendOrderCancelledEventToCleverTap", "ctOrderCancelled", "Lcom/intellihealth/truemeds/data/model/clevertap/CtAppOrderCancelled;", "sendOrderStatusViewedEventToCleverTap", "ctOrderStatusViewed", "Lcom/intellihealth/truemeds/data/model/clevertap/CtOrderStatusViewed;", "sendPatientAddedEventToCleverTap", "ctPatientAdded", "Lcom/intellihealth/truemeds/presentation/analytics/model/clevertap/CtPatientAdded;", "sendPdpViewedEventToCleverTap", "ctPdpViewed", "Lcom/intellihealth/truemeds/data/model/clevertap/CtPdpViewed;", "sendReorderClickedEventToCleverTap", "ctReorderClicked", "Lcom/intellihealth/truemeds/data/model/clevertap/CtReorderClicked;", "sendSRPViewedEventToClevertap", "ctSrpViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/clevertap/CtSrpViewed;", "sendSearchViewedEventToClevertap", "clickedOnPage", "toHashMap", "", "obj", "app_prodDebug"})
public final class CleverTapEventUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.analytics.CleverTapEvent cleverTapEvent = null;
    
    @javax.inject.Inject()
    public CleverTapEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.CleverTapEvent cleverTapEvent) {
        super();
    }
    
    public final void sendLoginSuccessFullEventToClevertap(boolean isNewUser) {
    }
    
    public final void sendLoggedOutEventToClevertap(int customerId) {
    }
    
    public final void sendSearchViewedEventToClevertap(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage) {
    }
    
    public final void sendItemSearchedEventToClevertap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.clevertap.CtItemSearched ctItemSearched) {
    }
    
    public final void sendSRPViewedEventToClevertap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.clevertap.CtSrpViewed ctSrpViewed) {
    }
    
    public final void sendItemAddedEventToClevertap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.clevertap.CtItemAdded ctItemAdded) {
    }
    
    public final void sendPdpViewedEventToCleverTap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.clevertap.CtPdpViewed ctPdpViewed) {
    }
    
    public final void sendCartViewedEventToCleverTap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.clevertap.CtCartViewed ctCartViewed) {
    }
    
    public final void sendAppOrderPlacedEventToCleverTap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.clevertap.CtAppOrderPlaced ctAppOrderPlaced) {
    }
    
    public final void sendOrderStatusViewedEventToCleverTap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.clevertap.CtOrderStatusViewed ctOrderStatusViewed) {
    }
    
    public final void sendOrderCancelledEventToCleverTap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.clevertap.CtAppOrderCancelled ctOrderCancelled) {
    }
    
    public final void sendReorderClickedEventToCleverTap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.clevertap.CtReorderClicked ctReorderClicked) {
    }
    
    public final void pushFcmRegistrationId(@org.jetbrains.annotations.NotNull()
    java.lang.String fcmId, boolean register) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> toHashMap(@org.jetbrains.annotations.NotNull()
    java.lang.Object obj) {
        return null;
    }
    
    public final void pushProfileCleverTap() {
    }
    
    public final void onUserLoginCleverTap() {
    }
    
    public final void sendPatientAddedEventToCleverTap(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.clevertap.CtPatientAdded ctPatientAdded) {
    }
}