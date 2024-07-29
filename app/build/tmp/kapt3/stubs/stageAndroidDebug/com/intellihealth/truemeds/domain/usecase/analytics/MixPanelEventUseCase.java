package com.intellihealth.truemeds.domain.usecase.analytics;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0094\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020\u0006J\u000e\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u00020\u0006J\u0006\u0010;\u001a\u00020\u0006J\u0006\u0010<\u001a\u00020\u0006J\u000e\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020?J\u000e\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020BJ\u000e\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EJ\u0006\u0010F\u001a\u00020\u0006J\u0006\u0010G\u001a\u00020\u0006J\u000e\u0010H\u001a\u00020\u00062\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u00020MJ\u000e\u0010N\u001a\u00020\u00062\u0006\u0010O\u001a\u00020PJ\u000e\u0010Q\u001a\u00020\u00062\u0006\u0010R\u001a\u00020SJ\u000e\u0010T\u001a\u00020\u00062\u0006\u0010U\u001a\u00020VJ\u0006\u0010W\u001a\u00020\u0006J\u000e\u0010X\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020ZJ\u000e\u0010[\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020]J\u000e\u0010^\u001a\u00020\u00062\u0006\u0010_\u001a\u00020`J\u000e\u0010a\u001a\u00020\u00062\u0006\u0010b\u001a\u00020cJ\u000e\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020fJ\u000e\u0010g\u001a\u00020\u00062\u0006\u0010h\u001a\u00020iJ\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020mJ\u000e\u0010n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020oJ\u000e\u0010p\u001a\u00020\u00062\u0006\u0010q\u001a\u00020rJ\u000e\u0010s\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\bJ\u000e\u0010u\u001a\u00020\u00062\u0006\u0010v\u001a\u00020wJ\u000e\u0010x\u001a\u00020\u00062\u0006\u0010y\u001a\u00020zJ\u000e\u0010{\u001a\u00020\u00062\u0006\u0010|\u001a\u00020}J\u000e\u0010~\u001a\u00020\u00062\u0006\u0010|\u001a\u00020}J\u0010\u0010\u007f\u001a\u00020\u00062\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020\u00062\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010O\u001a\u00020PJ\u000f\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010O\u001a\u00020PJ\u0011\u0010\u0087\u0001\u001a\u00020\u00062\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u00062\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u00062\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u00062\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u00062\b\u0010\u0094\u0001\u001a\u00030\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u00062\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001J\u0007\u0010\u0099\u0001\u001a\u00020\u0006J\u0011\u0010\u009a\u0001\u001a\u00020\u00062\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u00062\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001J\u0011\u0010\u00a0\u0001\u001a\u00020\u00062\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u0001J\u0011\u0010\u00a3\u0001\u001a\u00020\u00062\b\u0010\u00a4\u0001\u001a\u00030\u00a5\u0001J\u0011\u0010\u00a6\u0001\u001a\u00020\u00062\b\u0010\u00a7\u0001\u001a\u00030\u00a8\u0001J\u0011\u0010\u00a9\u0001\u001a\u00020\u00062\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001J\u0011\u0010\u00aa\u0001\u001a\u00020\u00062\b\u0010\u00ab\u0001\u001a\u00030\u009f\u0001J\u0011\u0010\u00ac\u0001\u001a\u00020\u00062\b\u0010\u00ad\u0001\u001a\u00030\u00ae\u0001J\u0011\u0010\u00af\u0001\u001a\u00020\u00062\b\u0010\u00b0\u0001\u001a\u00030\u00b1\u0001J\u0010\u0010\u00b2\u0001\u001a\u00020\u00062\u0007\u0010\u00b3\u0001\u001a\u00020oJ\u0011\u0010\u00b4\u0001\u001a\u00020\u00062\b\u0010\u00b5\u0001\u001a\u00030\u00b6\u0001J\u000f\u0010\u00b7\u0001\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bJ\u0011\u0010\u00b8\u0001\u001a\u00020\u00062\b\u0010\u00b9\u0001\u001a\u00030\u00ba\u0001J\u0007\u0010\u00bb\u0001\u001a\u00020\u0006J\u0011\u0010\u00bc\u0001\u001a\u00020\u00062\b\u0010\u00bd\u0001\u001a\u00030\u00be\u0001J\u0011\u0010\u00bf\u0001\u001a\u00020\u00062\b\u0010\u00c0\u0001\u001a\u00030\u00c1\u0001J\u0011\u0010\u00c2\u0001\u001a\u00020\u00062\b\u0010\u00c3\u0001\u001a\u00030\u00c4\u0001J\u0011\u0010\u00c5\u0001\u001a\u00020\u00062\b\u0010\u00c6\u0001\u001a\u00030\u00c7\u0001J\u0011\u0010\u00c8\u0001\u001a\u00020\u00062\b\u0010\u00c9\u0001\u001a\u00030\u00ca\u0001J\u0011\u0010\u00cb\u0001\u001a\u00020\u00062\b\u0010\u00cc\u0001\u001a\u00030\u00cd\u0001J\u0011\u0010\u00ce\u0001\u001a\u00020\u00062\b\u0010\u00cf\u0001\u001a\u00030\u00d0\u0001J\u0011\u0010\u00d1\u0001\u001a\u00020\u00062\b\u0010\u00d2\u0001\u001a\u00030\u00d3\u0001J\u0011\u0010\u00d4\u0001\u001a\u00020\u00062\b\u0010\u00d2\u0001\u001a\u00030\u00d3\u0001J\u0011\u0010\u00d5\u0001\u001a\u00020\u00062\b\u0010\u00d6\u0001\u001a\u00030\u00d7\u0001J\u0011\u0010\u00d8\u0001\u001a\u00020\u00062\b\u0010\u00d9\u0001\u001a\u00030\u00da\u0001J\u0011\u0010\u00db\u0001\u001a\u00020\u00062\b\u0010\u00dc\u0001\u001a\u00030\u00dd\u0001J\u0011\u0010\u00de\u0001\u001a\u00020\u00062\b\u0010\u00df\u0001\u001a\u00030\u00e0\u0001J\u000f\u0010\u00e1\u0001\u001a\u00020\u00062\u0006\u0010O\u001a\u00020PJ\u000f\u0010\u00e2\u0001\u001a\u00020\u00062\u0006\u0010v\u001a\u00020wJ\u0011\u0010\u00e3\u0001\u001a\u00020\u00062\b\u0010\u00e4\u0001\u001a\u00030\u00e5\u0001J\u0011\u0010\u00e6\u0001\u001a\u00020\u00062\b\u0010\u00e4\u0001\u001a\u00030\u00e5\u0001J\u0011\u0010\u00e7\u0001\u001a\u00020\u00062\b\u0010\u00e8\u0001\u001a\u00030\u00e9\u0001J\u0011\u0010\u00ea\u0001\u001a\u00020\u00062\b\u0010\u00eb\u0001\u001a\u00030\u00ec\u0001J\u0011\u0010\u00ed\u0001\u001a\u00020\u00062\b\u0010\u00eb\u0001\u001a\u00030\u00ec\u0001J\u001a\u0010\u00ee\u0001\u001a\u00020\u00062\b\u0010\u00ef\u0001\u001a\u00030\u00f0\u00012\u0007\u0010\u00f1\u0001\u001a\u00020\bJ\u0011\u0010\u00f2\u0001\u001a\u00020\u00062\b\u0010\u00f3\u0001\u001a\u00030\u00f4\u0001J\u0011\u0010\u00f5\u0001\u001a\u00020\u00062\b\u0010\u00f6\u0001\u001a\u00030\u00f7\u0001J\u0007\u0010\u00f8\u0001\u001a\u00020\u0006J\u0011\u0010\u00f9\u0001\u001a\u00020\u00062\b\u0010\u00fa\u0001\u001a\u00030\u00fb\u0001J\u000f\u0010\u00fc\u0001\u001a\u00020\u00062\u0006\u0010O\u001a\u00020PJ\u0010\u0010\u00fd\u0001\u001a\u00020\u00062\u0007\u0010\r\u001a\u00030\u00fe\u0001J\u0011\u0010\u00ff\u0001\u001a\u00020\u00062\b\u0010\u0080\u0002\u001a\u00030\u0081\u0002J\u0011\u0010\u0082\u0002\u001a\u00020\u00062\b\u0010\u0083\u0002\u001a\u00030\u0084\u0002J\u0011\u0010\u0085\u0002\u001a\u00020\u00062\b\u0010\u0086\u0002\u001a\u00030\u0087\u0002J\u0011\u0010\u0088\u0002\u001a\u00020\u00062\b\u0010\u0086\u0002\u001a\u00030\u0087\u0002J\u0011\u0010\u0089\u0002\u001a\u00020\u00062\b\u0010\u008a\u0002\u001a\u00030\u008b\u0002J\u0011\u0010\u008c\u0002\u001a\u00020\u00062\b\u0010\u008a\u0002\u001a\u00030\u008b\u0002J\u0011\u0010\u008d\u0002\u001a\u00020\u00062\b\u0010\u008e\u0002\u001a\u00030\u008f\u0002J\u0011\u0010\u0090\u0002\u001a\u00020\u00062\b\u0010\u0091\u0002\u001a\u00030\u0092\u0002J\u0011\u0010\u0093\u0002\u001a\u00020\u00062\b\u0010\u0086\u0002\u001a\u00030\u0087\u0002J\u0011\u0010\u0094\u0002\u001a\u00020\u00062\b\u0010\u0095\u0002\u001a\u00030\u0096\u0002J\u0011\u0010\u0097\u0002\u001a\u00020\u00062\b\u0010\u0098\u0002\u001a\u00030\u0099\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u009a\u0002"}, d2 = {"Lcom/intellihealth/truemeds/domain/usecase/analytics/MixPanelEventUseCase;", "", "mixPanelEvent", "Lcom/intellihealth/truemeds/presentation/analytics/MixPanelEvent;", "(Lcom/intellihealth/truemeds/presentation/analytics/MixPanelEvent;)V", "customerIdentity", "", "customerId", "", "sendAddAddressClickedEvent", "mxAddAddressClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxAddAddressClicked;", "sendAddAlternateNumberEvent", "orderId", "sendAddPatientClickedEvent", "clickedPage", "sendAddressAddedEvent", "mxAddressAdded", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAddressAdded;", "sendAddressChangedEvent", "sendAddressEditedEvent", "mxAddressEdited", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAddressEdited;", "sendAlternateContactSavedEvent", "mxAlternateContactSaved", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAlternateContactSaved;", "sendAppOpenEvent", "mxAppOpen", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAppOpen;", "sendAppOrderPlacedEvent", "mxAppOrderPlaced", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxAppOrderPlaced;", "sendApplyCouponClickedEvent", "mxApplyCouponClick", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxApplyCouponClick;", "sendArticleSectionViewedEvent", "sendArticleSharedEvent", "mxArticleShared", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxArticleShared;", "sendArticleViewedEvent", "mxArticleViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxArticleViewed;", "sendArticlesCategorySectionViewedEvent", "mxArticlesCategorySectionViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxArticlesCategorySectionViewed;", "sendBannerClicked", "mxBannerClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxBannerClicked;", "sendCallPharmacistClickedEvent", "sendCartViewedEvent", "mxCartViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxCartViewed;", "sendCategoryImpression", "mxCategoryImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxCategoryImpression;", "sendChangeToCodClickedEvent", "mxChangeToCodClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxChangeToCodClicked;", "sendContactBottomSheetSaved", "sendContactBottomSheetSavedClicked", "sendContactBottomSheetViewed", "sendCouponAppliedEvent", "mxCouponApplied", "Lcom/intellihealth/truemeds/mvvm/data/mixpanel/MxCouponApplied;", "sendCouponListOpenedEvent", "mxCouponListOpened", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxCouponListOpened;", "sendCouponRemovedEvent", "mxCouponRemoved", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxCouponRemoved;", "sendDeliveryDetailViewedEvent", "sendDoctorConfirmationCardViewedEvent", "sendExperimentStartedEvent", "mxExperimentStarted", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxExperimentStarted;", "sendFilterClicked", "mxFilterClicked", "Lcom/intellihealth/truemeds/mvvm/data/mixpanel/MXFilterClicked;", "sendFirstCancelPageViewedEvent", "mxAppOrderCancelled", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxAppOrderCancelled;", "sendHomePageBannerClickedEvent", "mxHomePageBannerClick", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxHomePageBannerClick;", "sendHomePageBannerImpressionEvent", "mxHomePageBannerImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxHomePageBannerImpression;", "sendHomePageSkinnyBannerImpressionEvent", "sendHomePageViewedEvent", "mxHomePageViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxHomePageViewed;", "sendInternalErrorOccurred", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "sendItemAddedEvent", "baseItemAdded", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAdded;", "sendItemAppOrderPlacedEvent", "mxItemAppOrderPlaced", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemAppOrderPlaced;", "sendItemImpressionEvent", "mxItemImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxItemImpression;", "sendItemSearchedEvent", "mxItemSearched", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxItemSearched;", "sendLocationBottomSheetViewedEvent", "sendLocationSelectedEvent", "mxLocationSelected", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxLocationSelected;", "sendLoggedOutEvent", "", "sendLoginPageViewed", "mxLoginPageViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxLoginPageViewed;", "sendLoginSkippedEvent", "clickedOnPage", "sendLoginSuccessfulEvent", "mxLoginSuccess", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxLoginSuccess;", "sendMedicineDetailsViewedViewedEvent", "mxPdpMedicineDetailsViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPdpMedicineDetailsViewed;", "sendNotificationClickedEvent", "mxNotificationClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxNotificationClicked;", "sendNotificationReceivedEvent", "sendOfferSheetViewedEvent", "mxOfferSheetViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxOfferSheetViewed;", "sendOneClickSubstitutionPopupViewedEvent", "mxOneClickSubstitutionPopupViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxOneClickSubstitutionPopupViewed;", "sendOrderCancelledClickEvent", "sendOrderDetailsCancelOrderEvent", "sendOrderStatusViewedEvent", "mxOrderStatusViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxOrderStatusViewed;", "sendOrderSummaryViewedEvent", "mxOrderSummaryViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxOrderSummaryViewed;", "sendOtcProductListPageViewed", "mxOtcProductListPageViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxOtcProductListPageViewed;", "sendOtpClickedEvent", "mxOtpClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxOtpClicked;", "sendOtpTypedEvent", "mxOtpTyped", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxOtpTyped;", "sendPatientAddedEvent", "mxPatientAdded", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPatientAdded;", "sendPatientChangedEvent", "sendPatientDetailsEditedImpression", "mXPatientDetailsEditedImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MXPatientDetailsEditedImpression;", "sendPaymentFailedEvent", "mxPaymentSuccessAndFailed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPaymentSuccessAndFailed;", "sendPaymentPageVisitedEvent", "mxPaymentPageVisited", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPaymentPageVisited;", "sendPaymentPendingViewedEvent", "mxPaymentPendingViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxPaymentPendingViewed;", "sendPaymentPopupViewedEvent", "mxPaymentPopupViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPaymentPopupViewed;", "sendPaymentSuccessfulEvent", "sendPaymentUnSuccessfulEvent", "mxPaymentFailed", "sendPdpImageViewedEvent", "mxPdpImageViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPdpImageViewed;", "sendPdpViewedEvent", "mxPdpViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPdpViewed;", "sendPinCodeUnserviceableEvent", "pincode", "sendPrescriptionClickedEvent", "mxUploadPrescriptionClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxUploadPrescriptionClicked;", "sendPrescriptionRemovedEvent", "sendPrescriptionUploadPageViewEvent", "mxPrescriptionUploadPageViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxPrescriptionUploadPageViewed;", "sendPrescriptionUploadedEvent", "sendProductListPageViewedEvent", "mxProductListPageViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxProductListPageViewed;", "sendProfileDetailsAddedEventToMixpanel", "mxProfileDetailsAdded", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxProfileDetailsAdded;", "sendProfileDetailsEditedEventToMixpanel", "mxProfileDetailsEdited", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxProfileDetailsEdited;", "sendPspViewedEvent", "mxPspViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxPspViewed;", "sendReferralScreenViewedEvent", "mxReferralScreenViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReferralScreenViewed;", "sendReminderBottomSheetViewedEvent", "mxReminderBottomSheetViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderBottomSheetViewed;", "sendReminderDeletedEvent", "mxReminderDeleted", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderDeleted;", "sendReminderEditClickedEvent", "mxReminderSuccessfullySet", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderSuccessfullySet;", "sendReminderSuccessfullySetEvent", "sendReminderUpdatedClickedEvent", "mxReminderUpdate", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderUpdate;", "sendReorderSheetEvent", "mxReorderSheetViewed", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxReorderSheetViewed;", "sendSearchSuggestionImpressionEvent", "mxEventSuggestionImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxSearchSuggestionImpression;", "sendSearchViewedEvent", "mxSearchViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSearchViewed;", "sendSecondCancelPageViewedEvent", "sendSignUpSuccessfulEvent", "sendSrpAddSubsBottomSheetViewedEvent", "mxSrpAddSubBottomSheetViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSrpAddSubBottomSheetViewed;", "sendSrpViewSubsBottomSheetViewedEvent", "sendSrpViewedEvent", "mxSrpViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSrpViewed;", "sendStickyStripClickedEvent", "mxStickyStripViewed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxStickyStripViewed;", "sendStickyStripViewedEvent", "sendSubsVideoPlayedEvent", "mxCommonProperty", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxCommonProperty;", "source", "sendSubstituteReplaceClickedEvent", "mxSubstituteReplaceClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSubstituteReplaceClicked;", "sendSuperCategorySectionImpression", "mXSuperCategorySectionImpression", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MXSuperCategorySectionImpression;", "sendSuperEventToMixpanel", "sendSwitchBackClickedEvent", "mxSwitchBackClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxSwitchBackClicked;", "sendThirdCancelPageViewedEvent", "sendUndoClickedEvent", "", "sendUrgencyTimerStartedEvent", "mxUrgencyTimerStarted", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxUrgencyTimerStarted;", "sendUseLocationClickedEvent", "mxUseLocationClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxUseLocationClicked;", "sendVideoCompletedEvent", "mxVideoContinued", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxVideoContinued;", "sendVideoContinuedEvent", "sendVideoFloaterClickedEvent", "mxVideoFloaterClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxVideoFloaterClicked;", "sendVideoFloaterImpressionEvent", "sendVideoPausedEvent", "mxVideoPaused", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxVideoPaused;", "sendVideoPlayedEvent", "mxVideoPlayed", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxVideoPlayed;", "sendVideoPlayerClosedEvent", "sendViewBillClickedEvent", "mxViewBillClicked", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxViewBillClicked;", "sendViewDetailsClickedEvent", "mxViewDetailsClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxViewDetailsClicked;", "app_stageAndroidDebug"})
public final class MixPanelEventUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.presentation.analytics.MixPanelEvent mixPanelEvent = null;
    
    @javax.inject.Inject()
    public MixPanelEventUseCase(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.MixPanelEvent mixPanelEvent) {
        super();
    }
    
    public final void sendExperimentStartedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxExperimentStarted mxExperimentStarted) {
    }
    
    public final void customerIdentity(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId) {
    }
    
    public final void sendLoginSkippedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPage) {
    }
    
    public final void sendLoginSuccessfulEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxLoginSuccess mxLoginSuccess) {
    }
    
    public final void sendSignUpSuccessfulEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxLoginSuccess mxLoginSuccess) {
    }
    
    /**
     * This method will initiate all SDK events for mobile number
     */
    public final void sendLoginPageViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxLoginPageViewed mxLoginPageViewed) {
    }
    
    public final void sendOtpTypedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtpTyped mxOtpTyped) {
    }
    
    public final void sendOtpClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxOtpClicked mxOtpClicked) {
    }
    
    public final void sendHomePageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxHomePageViewed mxHomePageViewed) {
    }
    
    public final void sendHomePageBannerImpressionEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxHomePageBannerImpression mxHomePageBannerImpression) {
    }
    
    public final void sendHomePageBannerClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxHomePageBannerClick mxHomePageBannerClick) {
    }
    
    public final void sendBannerClicked(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxBannerClicked mxBannerClicked) {
    }
    
    public final void sendHomePageSkinnyBannerImpressionEvent() {
    }
    
    public final void sendAddressAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAddressAdded mxAddressAdded) {
    }
    
    public final void sendDeliveryDetailViewedEvent() {
    }
    
    public final void sendPatientAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPatientAdded mxPatientAdded) {
    }
    
    public final void sendAddAddressClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked mxAddAddressClicked) {
    }
    
    public final void sendAddPatientClickedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedPage) {
    }
    
    public final void sendPrescriptionClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxUploadPrescriptionClicked mxUploadPrescriptionClicked) {
    }
    
    public final void sendPrescriptionUploadPageViewEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxPrescriptionUploadPageViewed mxPrescriptionUploadPageViewed) {
    }
    
    public final void sendCartViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxCartViewed mxCartViewed) {
    }
    
    public final void sendApplyCouponClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxApplyCouponClick mxApplyCouponClick) {
    }
    
    public final void sendSubsVideoPlayedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCommonProperty mxCommonProperty, @org.jetbrains.annotations.NotNull()
    java.lang.String source) {
    }
    
    public final void sendItemAddedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAdded baseItemAdded) {
    }
    
    public final void sendSearchViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSearchViewed mxSearchViewed) {
    }
    
    public final void sendItemSearchedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxItemSearched mxItemSearched) {
    }
    
    public final void sendCallPharmacistClickedEvent() {
    }
    
    public final void sendSrpViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSrpViewed mxSrpViewed) {
    }
    
    public final void sendSrpAddSubsBottomSheetViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSrpAddSubBottomSheetViewed mxSrpAddSubBottomSheetViewed) {
    }
    
    public final void sendSrpViewSubsBottomSheetViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSrpAddSubBottomSheetViewed mxSrpAddSubBottomSheetViewed) {
    }
    
    public final void sendOrderCancelledClickEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled mxAppOrderCancelled) {
    }
    
    public final void sendReminderBottomSheetViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderBottomSheetViewed mxReminderBottomSheetViewed) {
    }
    
    public final void sendReminderSuccessfullySetEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet) {
    }
    
    public final void sendReminderEditClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet) {
    }
    
    public final void sendReminderUpdatedClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderUpdate mxReminderUpdate) {
    }
    
    public final void sendReminderDeletedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderDeleted mxReminderDeleted) {
    }
    
    public final void sendOrderDetailsCancelOrderEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled mxAppOrderCancelled) {
    }
    
    public final void sendFirstCancelPageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled mxAppOrderCancelled) {
    }
    
    public final void sendSecondCancelPageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled mxAppOrderCancelled) {
    }
    
    public final void sendThirdCancelPageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAppOrderCancelled mxAppOrderCancelled) {
    }
    
    public final void sendPrescriptionRemovedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedPage) {
    }
    
    public final void sendPrescriptionUploadedEvent() {
    }
    
    public final void sendAppOpenEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAppOpen mxAppOpen) {
    }
    
    public final void sendLocationBottomSheetViewedEvent() {
    }
    
    public final void sendPdpViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpViewed mxPdpViewed) {
    }
    
    public final void sendMedicineDetailsViewedViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpMedicineDetailsViewed mxPdpMedicineDetailsViewed) {
    }
    
    public final void sendPdpImageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPdpImageViewed mxPdpImageViewed) {
    }
    
    public final void sendLocationSelectedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxLocationSelected mxLocationSelected) {
    }
    
    public final void sendPinCodeUnserviceableEvent(int pincode) {
    }
    
    public final void sendReferralScreenViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReferralScreenViewed mxReferralScreenViewed) {
    }
    
    public final void sendLoggedOutEvent(int customerId) {
    }
    
    public final void sendOrderSummaryViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOrderSummaryViewed mxOrderSummaryViewed) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendAppOrderPlacedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAppOrderPlaced mxAppOrderPlaced) {
        return null;
    }
    
    public final void sendPspViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPspViewed mxPspViewed) {
    }
    
    public final void sendPaymentPopupViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPopupViewed mxPaymentPopupViewed) {
    }
    
    public final void sendPaymentUnSuccessfulEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentSuccessAndFailed mxPaymentFailed) {
    }
    
    public final void sendAddressChangedEvent() {
    }
    
    public final void sendAddressEditedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAddressEdited mxAddressEdited) {
    }
    
    public final void sendPatientChangedEvent() {
    }
    
    public final void sendArticleSectionViewedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedPage) {
    }
    
    public final void sendArticleViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxArticleViewed mxArticleViewed) {
    }
    
    public final void sendArticlesCategorySectionViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxArticlesCategorySectionViewed mxArticlesCategorySectionViewed) {
    }
    
    public final void sendArticleSharedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxArticleShared mxArticleShared) {
    }
    
    public final void sendVideoFloaterClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxVideoFloaterClicked mxVideoFloaterClicked) {
    }
    
    public final void sendVideoFloaterImpressionEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxVideoFloaterClicked mxVideoFloaterClicked) {
    }
    
    public final void sendDoctorConfirmationCardViewedEvent() {
    }
    
    public final void sendPaymentPageVisitedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentPageVisited mxPaymentPageVisited) {
    }
    
    public final void sendPaymentPendingViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxPaymentPendingViewed mxPaymentPendingViewed) {
    }
    
    public final void sendChangeToCodClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxChangeToCodClicked mxChangeToCodClicked) {
    }
    
    public final void sendPaymentFailedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentSuccessAndFailed mxPaymentSuccessAndFailed) {
    }
    
    public final void sendPaymentSuccessfulEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxPaymentSuccessAndFailed mxPaymentSuccessAndFailed) {
    }
    
    public final void sendOfferSheetViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxOfferSheetViewed mxOfferSheetViewed) {
    }
    
    public final void sendCouponListOpenedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxCouponListOpened mxCouponListOpened) {
    }
    
    public final void sendCouponAppliedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.data.mixpanel.MxCouponApplied mxCouponApplied) {
    }
    
    public final void sendCouponRemovedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxCouponRemoved mxCouponRemoved) {
    }
    
    public final void sendOrderStatusViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxOrderStatusViewed mxOrderStatusViewed) {
    }
    
    public final void sendAddAlternateNumberEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId) {
    }
    
    public final void sendAlternateContactSavedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxAlternateContactSaved mxAlternateContactSaved) {
    }
    
    public final void sendSubstituteReplaceClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSubstituteReplaceClicked mxSubstituteReplaceClicked) {
    }
    
    public final void sendUndoClickedEvent(long orderId) {
    }
    
    public final void sendSwitchBackClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxSwitchBackClicked mxSwitchBackClicked) {
    }
    
    public final void sendOneClickSubstitutionPopupViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxOneClickSubstitutionPopupViewed mxOneClickSubstitutionPopupViewed) {
    }
    
    public final void sendItemImpressionEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemImpression mxItemImpression) {
    }
    
    public final void sendSearchSuggestionImpressionEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxSearchSuggestionImpression mxEventSuggestionImpression) {
    }
    
    public final void sendViewBillClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxViewBillClicked mxViewBillClicked) {
    }
    
    public final void sendVideoPlayedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxVideoPlayed mxVideoPlayed) {
    }
    
    public final void sendVideoContinuedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoContinued mxVideoContinued) {
    }
    
    public final void sendVideoCompletedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoContinued mxVideoContinued) {
    }
    
    public final void sendVideoPlayerClosedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoContinued mxVideoContinued) {
    }
    
    public final void sendVideoPausedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxVideoPaused mxVideoPaused) {
    }
    
    public final void sendNotificationReceivedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxNotificationClicked mxNotificationClicked) {
    }
    
    public final void sendNotificationClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxNotificationClicked mxNotificationClicked) {
    }
    
    public final void sendUrgencyTimerStartedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxUrgencyTimerStarted mxUrgencyTimerStarted) {
    }
    
    public final void sendStickyStripViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxStickyStripViewed mxStickyStripViewed) {
    }
    
    public final void sendStickyStripClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxStickyStripViewed mxStickyStripViewed) {
    }
    
    public final void sendProductListPageViewedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxProductListPageViewed mxProductListPageViewed) {
    }
    
    public final void sendItemAppOrderPlacedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxItemAppOrderPlaced mxItemAppOrderPlaced) {
    }
    
    public final void sendUseLocationClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxUseLocationClicked mxUseLocationClicked) {
    }
    
    public final void sendReorderSheetEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxReorderSheetViewed mxReorderSheetViewed) {
    }
    
    public final void sendContactBottomSheetSaved() {
    }
    
    public final void sendContactBottomSheetViewed() {
    }
    
    public final void sendContactBottomSheetSavedClicked() {
    }
    
    public final void sendFilterClicked(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.mvvm.data.mixpanel.MXFilterClicked mxFilterClicked) {
    }
    
    public final void sendCategoryImpression(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxCategoryImpression mxCategoryImpression) {
    }
    
    public final void sendSuperCategorySectionImpression(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MXSuperCategorySectionImpression mXSuperCategorySectionImpression) {
    }
    
    public final void sendOtcProductListPageViewed(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxOtcProductListPageViewed mxOtcProductListPageViewed) {
    }
    
    public final void sendPatientDetailsEditedImpression(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MXPatientDetailsEditedImpression mXPatientDetailsEditedImpression) {
    }
    
    public final void sendInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred) {
    }
    
    public final void sendSuperEventToMixpanel() {
    }
    
    public final void sendViewDetailsClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxViewDetailsClicked mxViewDetailsClicked) {
    }
    
    public final void sendProfileDetailsAddedEventToMixpanel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxProfileDetailsAdded mxProfileDetailsAdded) {
    }
    
    public final void sendProfileDetailsEditedEventToMixpanel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxProfileDetailsEdited mxProfileDetailsEdited) {
    }
}