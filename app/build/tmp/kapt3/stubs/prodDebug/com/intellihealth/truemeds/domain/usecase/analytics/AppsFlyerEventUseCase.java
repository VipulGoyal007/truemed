package com.intellihealth.truemeds.domain.usecase.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u0006\u0010\n\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\f\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\r\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u0006\u0010\u0015\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u0006\u0010\u001a\u001a\u00020\u0006J\u001a\u0010\u001b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bJ\u001a\u0010\u001c\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/analytics/AppsFlyerEventUseCase;", "", "appsFlyerEvent", "Lcom/intellihealth/truemeds/presentation/analytics/AppsFlyerEvent;", "(Lcom/intellihealth/truemeds/presentation/analytics/AppsFlyerEvent;)V", "sendAppCancelOrder", "", "map", "", "", "sendAppOpen", "sendAppOrderPlaced", "sendCartViewed", "sendChronicItemAdded", "sendHomePageViewed", "sendItemAdded", "sendItemSearched", "sendLoginPageViewed", "sendLoginSuccessful", "sendOrderSummaryViewed", "sendPDPViewed", "sendReferAFriendClicked", "sendSRPViewed", "sendSearchViewed", "sendSignupSuccessful", "sendSubsItemAdded", "sendSubsLearnMore", "sendUserDetailsAddPatient", "sendUserDetailsAddressAdded", "app_prodDebug"})
public final class AppsFlyerEventUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent appsFlyerEvent = null;
    
    @javax.inject.Inject()
    public AppsFlyerEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.AppsFlyerEvent appsFlyerEvent) {
        super();
    }
    
    public final void sendAppOpen() {
    }
    
    public final void sendHomePageViewed(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendSubsLearnMore() {
    }
    
    public final void sendReferAFriendClicked() {
    }
    
    public final void sendLoginPageViewed(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendItemSearched(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendItemAdded(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendSubsItemAdded(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendSearchViewed(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendLoginSuccessful(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendSignupSuccessful(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendCartViewed(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendUserDetailsAddressAdded(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendUserDetailsAddPatient(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendSRPViewed(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendPDPViewed(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendOrderSummaryViewed(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendAppOrderPlaced(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendAppCancelOrder(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void sendChronicItemAdded(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
}