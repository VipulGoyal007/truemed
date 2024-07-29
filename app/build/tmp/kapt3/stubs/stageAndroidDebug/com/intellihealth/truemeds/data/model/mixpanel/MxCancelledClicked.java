package com.intellihealth.truemeds.data.model.mixpanel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0003\b\u0085\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\u0012\b\u0002\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010t\u001a\u00020\u0005H\u00c6\u0003J\u0013\u0010u\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010w\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u000b\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010y\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u0010\u0010z\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u000b\u0010{\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\t\u0010~\u001a\u00020\u0005H\u00c6\u0003J\u0013\u0010\u007f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0010H\u00c6\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010]J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00100J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010JJ\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00100J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00100J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0090\u0003\u0010\u0092\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0012\b\u0002\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0093\u0001J\u0015\u0010\u0094\u0001\u001a\u00020\u00052\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0013H\u00d6\u0001J\n\u0010\u0097\u0001\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010(\"\u0004\b5\u0010*R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b6\u00100\"\u0004\b7\u00102R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b8\u00100\"\u0004\b9\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b:\u00100\"\u0004\b;\u00102R\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\b<\u00100\"\u0004\b=\u00102R \u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010(\"\u0004\b?\u0010*R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010(\"\u0004\bA\u0010*R\u001e\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010,\"\u0004\bB\u0010.R(\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\bG\u00100\"\u0004\bH\u00102R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR \u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010(\"\u0004\bO\u0010*R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bP\u0010J\"\u0004\bQ\u0010LR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bR\u0010J\"\u0004\bS\u0010LR \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010(\"\u0004\bU\u0010*R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010(\"\u0004\bW\u0010*R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bX\u0010J\"\u0004\bY\u0010LR(\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010D\"\u0004\b[\u0010FR\"\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010`\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00103\u001a\u0004\ba\u00100\"\u0004\bb\u00102R \u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010(\"\u0004\bd\u0010*R \u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010(\"\u0004\bf\u0010*R \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010(\"\u0004\bh\u0010*R \u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010(\"\u0004\bj\u0010*R \u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010(\"\u0004\bl\u0010*R\"\u0010!\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bm\u0010J\"\u0004\bn\u0010LR\"\u0010\"\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bo\u0010J\"\u0004\bp\u0010LR \u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010(\"\u0004\br\u0010*\u00a8\u0006\u0098\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/model/mixpanel/MxCancelledClicked;", "", "addressType", "", "couponApplied", "", "couponDiscountAmount", "", "currentOrderState", "deliveryChargeAmount", "deliveryDays", "discountAmount", "estimatedPayableAmount", "gender", "isReorder", "itemNames", "", "mrpTotalAmount", "noOfItems", "", "orderId", "packagingChargeAmount", "patientAge", "patientType", "paymentMethod", "prescriptionUploadedCount", "productsIds", "rxRequired", "savingsAmount", "shippingCity", "shippingPincode", "shippingState", "subsId", "tmCreditAmount", "tmRewardAmount", "whId", "firstPageCancelReason", "secondPageCancelReason", "(Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "getCouponApplied", "()Z", "setCouponApplied", "(Z)V", "getCouponDiscountAmount", "()Ljava/lang/Double;", "setCouponDiscountAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCurrentOrderState", "setCurrentOrderState", "getDeliveryChargeAmount", "setDeliveryChargeAmount", "getDeliveryDays", "setDeliveryDays", "getDiscountAmount", "setDiscountAmount", "getEstimatedPayableAmount", "setEstimatedPayableAmount", "getFirstPageCancelReason", "setFirstPageCancelReason", "getGender", "setGender", "setReorder", "getItemNames", "()Ljava/util/List;", "setItemNames", "(Ljava/util/List;)V", "getMrpTotalAmount", "setMrpTotalAmount", "getNoOfItems", "()Ljava/lang/Integer;", "setNoOfItems", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOrderId", "setOrderId", "getPackagingChargeAmount", "setPackagingChargeAmount", "getPatientAge", "setPatientAge", "getPatientType", "setPatientType", "getPaymentMethod", "setPaymentMethod", "getPrescriptionUploadedCount", "setPrescriptionUploadedCount", "getProductsIds", "setProductsIds", "getRxRequired", "()Ljava/lang/Boolean;", "setRxRequired", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSavingsAmount", "setSavingsAmount", "getSecondPageCancelReason", "setSecondPageCancelReason", "getShippingCity", "setShippingCity", "getShippingPincode", "setShippingPincode", "getShippingState", "setShippingState", "getSubsId", "setSubsId", "getTmCreditAmount", "setTmCreditAmount", "getTmRewardAmount", "setTmRewardAmount", "getWhId", "setWhId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/intellihealth/truemeds/data/model/mixpanel/MxCancelledClicked;", "equals", "other", "hashCode", "toString", "app_stageAndroidDebug"})
public final class MxCancelledClicked {
    @com.google.gson.annotations.SerializedName(value = "address_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String addressType;
    @com.google.gson.annotations.SerializedName(value = "coupon_applied")
    private boolean couponApplied;
    @com.google.gson.annotations.SerializedName(value = "coupon_discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double couponDiscountAmount;
    @com.google.gson.annotations.SerializedName(value = "current_order_state")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentOrderState;
    @com.google.gson.annotations.SerializedName(value = "delivery_charge_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double deliveryChargeAmount;
    @com.google.gson.annotations.SerializedName(value = "delivery_days")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double deliveryDays;
    @com.google.gson.annotations.SerializedName(value = "discount_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double discountAmount;
    @com.google.gson.annotations.SerializedName(value = "estimated_payable_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double estimatedPayableAmount;
    @com.google.gson.annotations.SerializedName(value = "gender")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String gender;
    @com.google.gson.annotations.SerializedName(value = "is_reorder")
    private boolean isReorder;
    @com.google.gson.annotations.SerializedName(value = "item_names")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> itemNames;
    @com.google.gson.annotations.SerializedName(value = "mrp_total_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double mrpTotalAmount;
    @com.google.gson.annotations.SerializedName(value = "no_of_items")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer noOfItems;
    @com.google.gson.annotations.SerializedName(value = "order_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String orderId;
    @com.google.gson.annotations.SerializedName(value = "packaging_charge_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer packagingChargeAmount;
    @com.google.gson.annotations.SerializedName(value = "patient_age")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer patientAge;
    @com.google.gson.annotations.SerializedName(value = "patient_type")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String patientType;
    @com.google.gson.annotations.SerializedName(value = "payment_method")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String paymentMethod;
    @com.google.gson.annotations.SerializedName(value = "prescription_uploaded_count")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer prescriptionUploadedCount;
    @com.google.gson.annotations.SerializedName(value = "products_ids")
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> productsIds;
    @com.google.gson.annotations.SerializedName(value = "rx_required")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean rxRequired;
    @com.google.gson.annotations.SerializedName(value = "savings_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double savingsAmount;
    @com.google.gson.annotations.SerializedName(value = "shipping_city")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shippingCity;
    @com.google.gson.annotations.SerializedName(value = "shipping_pincode")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shippingPincode;
    @com.google.gson.annotations.SerializedName(value = "shipping_state")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String shippingState;
    @com.google.gson.annotations.SerializedName(value = "subs_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String subsId;
    @com.google.gson.annotations.SerializedName(value = "tm_credit_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer tmCreditAmount;
    @com.google.gson.annotations.SerializedName(value = "tm_reward_amount")
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer tmRewardAmount;
    @com.google.gson.annotations.SerializedName(value = "wh_id")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String whId;
    @com.google.gson.annotations.SerializedName(value = "first_page_cancel_reason")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String firstPageCancelReason;
    @com.google.gson.annotations.SerializedName(value = "second_page_cancel_reason")
    @org.jetbrains.annotations.Nullable()
    private java.lang.String secondPageCancelReason;
    
    public MxCancelledClicked(@org.jetbrains.annotations.Nullable()
    java.lang.String addressType, boolean couponApplied, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String currentOrderState, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryDays, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double estimatedPayableAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, boolean isReorder, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrpTotalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfItems, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer packagingChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String patientType, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prescriptionUploadedCount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productsIds, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Double savingsAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingCity, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingPincode, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingState, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String firstPageCancelReason, @org.jetbrains.annotations.Nullable()
    java.lang.String secondPageCancelReason) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressType() {
        return null;
    }
    
    public final void setAddressType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getCouponApplied() {
        return false;
    }
    
    public final void setCouponApplied(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCouponDiscountAmount() {
        return null;
    }
    
    public final void setCouponDiscountAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentOrderState() {
        return null;
    }
    
    public final void setCurrentOrderState(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDeliveryChargeAmount() {
        return null;
    }
    
    public final void setDeliveryChargeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDeliveryDays() {
        return null;
    }
    
    public final void setDeliveryDays(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDiscountAmount() {
        return null;
    }
    
    public final void setDiscountAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getEstimatedPayableAmount() {
        return null;
    }
    
    public final void setEstimatedPayableAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isReorder() {
        return false;
    }
    
    public final void setReorder(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getItemNames() {
        return null;
    }
    
    public final void setItemNames(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMrpTotalAmount() {
        return null;
    }
    
    public final void setMrpTotalAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getNoOfItems() {
        return null;
    }
    
    public final void setNoOfItems(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    public final void setOrderId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPackagingChargeAmount() {
        return null;
    }
    
    public final void setPackagingChargeAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPatientAge() {
        return null;
    }
    
    public final void setPatientAge(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPatientType() {
        return null;
    }
    
    public final void setPatientType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrescriptionUploadedCount() {
        return null;
    }
    
    public final void setPrescriptionUploadedCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getProductsIds() {
        return null;
    }
    
    public final void setProductsIds(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRxRequired() {
        return null;
    }
    
    public final void setRxRequired(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSavingsAmount() {
        return null;
    }
    
    public final void setSavingsAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShippingCity() {
        return null;
    }
    
    public final void setShippingCity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShippingPincode() {
        return null;
    }
    
    public final void setShippingPincode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShippingState() {
        return null;
    }
    
    public final void setShippingState(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubsId() {
        return null;
    }
    
    public final void setSubsId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTmCreditAmount() {
        return null;
    }
    
    public final void setTmCreditAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTmRewardAmount() {
        return null;
    }
    
    public final void setTmRewardAmount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWhId() {
        return null;
    }
    
    public final void setWhId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstPageCancelReason() {
        return null;
    }
    
    public final void setFirstPageCancelReason(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecondPageCancelReason() {
        return null;
    }
    
    public final void setSecondPageCancelReason(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public MxCancelledClicked() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component12() {
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
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component19() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxCancelledClicked copy(@org.jetbrains.annotations.Nullable()
    java.lang.String addressType, boolean couponApplied, @org.jetbrains.annotations.Nullable()
    java.lang.Double couponDiscountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String currentOrderState, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double deliveryDays, @org.jetbrains.annotations.Nullable()
    java.lang.Double discountAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Double estimatedPayableAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, boolean isReorder, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> itemNames, @org.jetbrains.annotations.Nullable()
    java.lang.Double mrpTotalAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer noOfItems, @org.jetbrains.annotations.Nullable()
    java.lang.String orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer packagingChargeAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer patientAge, @org.jetbrains.annotations.Nullable()
    java.lang.String patientType, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prescriptionUploadedCount, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> productsIds, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean rxRequired, @org.jetbrains.annotations.Nullable()
    java.lang.Double savingsAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingCity, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingPincode, @org.jetbrains.annotations.Nullable()
    java.lang.String shippingState, @org.jetbrains.annotations.Nullable()
    java.lang.String subsId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmCreditAmount, @org.jetbrains.annotations.Nullable()
    java.lang.Integer tmRewardAmount, @org.jetbrains.annotations.Nullable()
    java.lang.String whId, @org.jetbrains.annotations.Nullable()
    java.lang.String firstPageCancelReason, @org.jetbrains.annotations.Nullable()
    java.lang.String secondPageCancelReason) {
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