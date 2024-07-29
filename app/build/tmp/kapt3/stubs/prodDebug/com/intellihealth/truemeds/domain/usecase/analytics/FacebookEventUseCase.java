package com.intellihealth.truemeds.domain.usecase.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/analytics/FacebookEventUseCase;", "", "facebookEvent", "Lcom/intellihealth/truemeds/presentation/analytics/FacebookEvent;", "(Lcom/intellihealth/truemeds/presentation/analytics/FacebookEvent;)V", "getNumberFormat", "Ljava/text/DecimalFormat;", "payableAmountForFbEvent", "", "value", "", "sendEvent", "", "eventName", "", "sendPurchaseEvent", "payableAmount", "app_prodDebug"})
public final class FacebookEventUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.analytics.FacebookEvent facebookEvent = null;
    
    @javax.inject.Inject()
    public FacebookEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.FacebookEvent facebookEvent) {
        super();
    }
    
    public final void sendEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String eventName) {
    }
    
    public final void sendPurchaseEvent(double payableAmount) {
    }
    
    private final java.text.DecimalFormat getNumberFormat() {
        return null;
    }
    
    private final int payableAmountForFbEvent(double value) {
        return 0;
    }
}