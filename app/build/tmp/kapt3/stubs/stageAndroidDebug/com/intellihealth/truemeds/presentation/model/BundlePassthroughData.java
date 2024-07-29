package com.intellihealth.truemeds.presentation.model;

/**
 * Use this class to fetch intent attributes
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0003\b\u0080\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u00e5\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010\t\u0012\b\u0010%\u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\b\u0010\'\u001a\u0004\u0018\u00010\t\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010)\u001a\u0004\u0018\u00010\t\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010+J\u000b\u0010z\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u0010|\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\u000b\u0010}\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\"H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0012\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010TJ\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u00b4\u0003\u0010\u009c\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0003\u0010\u009d\u0001J\u0015\u0010\u009e\u0001\u001a\u00020\t2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u000eH\u00d6\u0001J\n\u0010\u00a1\u0001\u001a\u00020\u0004H\u00d6\u0001R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00107\"\u0004\b;\u00109R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00107\"\u0004\b=\u00109R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00107\"\u0004\b?\u00109R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00107\"\u0004\bA\u00109R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010F\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b\u000b\u0010-\"\u0004\bG\u0010/R\u001e\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b\f\u0010-\"\u0004\bH\u0010/R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b\n\u0010-\"\u0004\bI\u0010/R\u001e\u0010)\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b)\u0010-\"\u0004\bJ\u0010/R\u001e\u0010%\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b%\u0010-\"\u0004\bK\u0010/R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b\b\u0010-\"\u0004\bL\u0010/R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u00107\"\u0004\bR\u00109R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010W\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010\'\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\bX\u0010-\"\u0004\bY\u0010/R\u001e\u0010(\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010W\u001a\u0004\bZ\u0010T\"\u0004\b[\u0010VR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u00107\"\u0004\b]\u00109R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010F\u001a\u0004\b^\u0010C\"\u0004\b_\u0010ER\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u00107\"\u0004\ba\u00109R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010W\u001a\u0004\bb\u0010T\"\u0004\bc\u0010VR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u00107\"\u0004\be\u00109R\u001e\u0010&\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\bf\u0010-\"\u0004\bg\u0010/R\u001e\u0010#\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010F\u001a\u0004\bh\u0010C\"\u0004\bi\u0010ER\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\bj\u0010-\"\u0004\bk\u0010/R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010F\u001a\u0004\bl\u0010C\"\u0004\bm\u0010ER\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010F\u001a\u0004\bn\u0010C\"\u0004\bo\u0010ER\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010N\"\u0004\bq\u0010PR\u001e\u0010$\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\br\u0010-\"\u0004\bs\u0010/R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u00107\"\u0004\bu\u00109R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010F\u001a\u0004\bv\u0010C\"\u0004\bw\u0010ER\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u00107\"\u0004\by\u00109\u00a8\u0006\u00a2\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/model/BundlePassthroughData;", "", "()V", "clickedOnPage", "", "itemNames", "", "productIds", "isRxRequired", "", "isOtcAdded", "isChronicAdded", "isGenericAdded", "totalOutOfStockCount", "", "paymentUnsuccessful", "addCOD", "patientId", "", "patientType", "patientAge", "patientGender", "cityName", "stateName", "pinCode", "addressType", "currentOrderStatus", "currentOrderStatusId", "prescriptionUploadedCount", "trackPurchaseEvents", "lastSelectedPaymentMethod", "lastSelectedPaymentMethodId", "pageSection", "addMoreForCod", "", "paymentRestrictedType", "restrictCod", "isReorder", "payableAmountButtonText", "onlyPrescription", "orderId", "isPaymentSpecificCoupon", "appliedCouponCode", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAddCOD", "()Ljava/lang/Boolean;", "setAddCOD", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAddMoreForCod", "()Ljava/lang/Double;", "setAddMoreForCod", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "getAppliedCouponCode", "setAppliedCouponCode", "getCityName", "setCityName", "getClickedOnPage", "setClickedOnPage", "getCurrentOrderStatus", "setCurrentOrderStatus", "getCurrentOrderStatusId", "()Ljava/lang/Integer;", "setCurrentOrderStatusId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "setChronicAdded", "setGenericAdded", "setOtcAdded", "setPaymentSpecificCoupon", "setReorder", "setRxRequired", "getItemNames", "()Ljava/util/List;", "setItemNames", "(Ljava/util/List;)V", "getLastSelectedPaymentMethod", "setLastSelectedPaymentMethod", "getLastSelectedPaymentMethodId", "()Ljava/lang/Long;", "setLastSelectedPaymentMethodId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOnlyPrescription", "setOnlyPrescription", "getOrderId", "setOrderId", "getPageSection", "setPageSection", "getPatientAge", "setPatientAge", "getPatientGender", "setPatientGender", "getPatientId", "setPatientId", "getPatientType", "setPatientType", "getPayableAmountButtonText", "setPayableAmountButtonText", "getPaymentRestrictedType", "setPaymentRestrictedType", "getPaymentUnsuccessful", "setPaymentUnsuccessful", "getPinCode", "setPinCode", "getPrescriptionUploadedCount", "setPrescriptionUploadedCount", "getProductIds", "setProductIds", "getRestrictCod", "setRestrictCod", "getStateName", "setStateName", "getTotalOutOfStockCount", "setTotalOutOfStockCount", "getTrackPurchaseEvents", "setTrackPurchaseEvents", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/intellihealth/truemeds/presentation/model/BundlePassthroughData;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
public final class BundlePassthroughData {
    
    /**
     * common attributes which are used across the app
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String clickedOnPage;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> itemNames;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> productIds;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isRxRequired;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isOtcAdded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isChronicAdded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isGenericAdded;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer totalOutOfStockCount;
    
    /**
     * PSP attributes
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean paymentUnsuccessful;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean addCOD;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long patientId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String patientType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer patientAge;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String patientGender;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String cityName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String stateName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer pinCode;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String addressType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentOrderStatus;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer currentOrderStatusId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer prescriptionUploadedCount;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String trackPurchaseEvents;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastSelectedPaymentMethod;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long lastSelectedPaymentMethodId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pageSection;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double addMoreForCod;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer paymentRestrictedType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean restrictCod;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isReorder;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean payableAmountButtonText;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean onlyPrescription;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long orderId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isPaymentSpecificCoupon;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String appliedCouponCode;
    
    public BundlePassthroughData(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productIds, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isRxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isOtcAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isChronicAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isGenericAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalOutOfStockCount, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean paymentUnsuccessful, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean addCOD, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String patientGender, @org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.String stateName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pinCode, @org.jetbrains.annotations.Nullable()
    java.lang.String addressType, @org.jetbrains.annotations.Nullable()
    java.lang.String currentOrderStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Integer currentOrderStatusId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prescriptionUploadedCount, @org.jetbrains.annotations.Nullable()
    java.lang.String trackPurchaseEvents, @org.jetbrains.annotations.Nullable()
    java.lang.String lastSelectedPaymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastSelectedPaymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.Double addMoreForCod, @org.jetbrains.annotations.Nullable()
    java.lang.Integer paymentRestrictedType, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean restrictCod, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isReorder, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean payableAmountButtonText, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean onlyPrescription, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPaymentSpecificCoupon, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponCode) {
        super();
    }
    
    /**
     * common attributes which are used across the app
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    /**
     * common attributes which are used across the app
     */
    public final void setClickedOnPage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getItemNames() {
        return null;
    }
    
    public final void setItemNames(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getProductIds() {
        return null;
    }
    
    public final void setProductIds(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isRxRequired() {
        return null;
    }
    
    public final void setRxRequired(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isOtcAdded() {
        return null;
    }
    
    public final void setOtcAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isChronicAdded() {
        return null;
    }
    
    public final void setChronicAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isGenericAdded() {
        return null;
    }
    
    public final void setGenericAdded(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalOutOfStockCount() {
        return null;
    }
    
    public final void setTotalOutOfStockCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    /**
     * PSP attributes
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPaymentUnsuccessful() {
        return null;
    }
    
    /**
     * PSP attributes
     */
    public final void setPaymentUnsuccessful(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAddCOD() {
        return null;
    }
    
    public final void setAddCOD(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPatientId() {
        return null;
    }
    
    public final void setPatientId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientType() {
        return null;
    }
    
    public final void setPatientType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPatientAge() {
        return null;
    }
    
    public final void setPatientAge(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientGender() {
        return null;
    }
    
    public final void setPatientGender(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCityName() {
        return null;
    }
    
    public final void setCityName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStateName() {
        return null;
    }
    
    public final void setStateName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPinCode() {
        return null;
    }
    
    public final void setPinCode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressType() {
        return null;
    }
    
    public final void setAddressType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentOrderStatus() {
        return null;
    }
    
    public final void setCurrentOrderStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCurrentOrderStatusId() {
        return null;
    }
    
    public final void setCurrentOrderStatusId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrescriptionUploadedCount() {
        return null;
    }
    
    public final void setPrescriptionUploadedCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTrackPurchaseEvents() {
        return null;
    }
    
    public final void setTrackPurchaseEvents(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastSelectedPaymentMethod() {
        return null;
    }
    
    public final void setLastSelectedPaymentMethod(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastSelectedPaymentMethodId() {
        return null;
    }
    
    public final void setLastSelectedPaymentMethodId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPageSection() {
        return null;
    }
    
    public final void setPageSection(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getAddMoreForCod() {
        return null;
    }
    
    public final void setAddMoreForCod(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPaymentRestrictedType() {
        return null;
    }
    
    public final void setPaymentRestrictedType(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRestrictCod() {
        return null;
    }
    
    public final void setRestrictCod(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isReorder() {
        return null;
    }
    
    public final void setReorder(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getPayableAmountButtonText() {
        return null;
    }
    
    public final void setPayableAmountButtonText(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOnlyPrescription() {
        return null;
    }
    
    public final void setOnlyPrescription(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isPaymentSpecificCoupon() {
        return null;
    }
    
    public final void setPaymentSpecificCoupon(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppliedCouponCode() {
        return null;
    }
    
    public final void setAppliedCouponCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public BundlePassthroughData() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.model.BundlePassthroughData copy(@org.jetbrains.annotations.Nullable()
    java.lang.String clickedOnPage, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productIds, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isRxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isOtcAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isChronicAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isGenericAdded, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalOutOfStockCount, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean paymentUnsuccessful, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean addCOD, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String patientGender, @org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.String stateName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pinCode, @org.jetbrains.annotations.Nullable()
    java.lang.String addressType, @org.jetbrains.annotations.Nullable()
    java.lang.String currentOrderStatus, @org.jetbrains.annotations.Nullable()
    java.lang.Integer currentOrderStatusId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prescriptionUploadedCount, @org.jetbrains.annotations.Nullable()
    java.lang.String trackPurchaseEvents, @org.jetbrains.annotations.Nullable()
    java.lang.String lastSelectedPaymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastSelectedPaymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String pageSection, @org.jetbrains.annotations.Nullable()
    java.lang.Double addMoreForCod, @org.jetbrains.annotations.Nullable()
    java.lang.Integer paymentRestrictedType, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean restrictCod, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isReorder, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean payableAmountButtonText, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean onlyPrescription, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isPaymentSpecificCoupon, @org.jetbrains.annotations.Nullable()
    java.lang.String appliedCouponCode) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}