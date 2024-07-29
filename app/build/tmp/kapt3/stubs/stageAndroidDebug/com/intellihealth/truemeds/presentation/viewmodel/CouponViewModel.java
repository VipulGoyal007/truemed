package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001d\u0010\u00b6\u0001\u001a\u00030\u00b7\u00012\t\u0010\u00b8\u0001\u001a\u0004\u0018\u0001002\b\b\u0002\u0010#\u001a\u00020\u001bJ\b\u0010\u00b9\u0001\u001a\u00030\u00b7\u0001J\u001b\u0010\u00ba\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00bb\u0001\u001a\u00020g2\b\u0010\u00bc\u0001\u001a\u00030\u0089\u0001J\u0012\u0010\u00bd\u0001\u001a\u00020\u001b2\t\b\u0002\u0010\u00bc\u0001\u001a\u00020\u001bJ\u0011\u0010\u0092\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00be\u0001\u001a\u000200J\u0011\u0010\u00bf\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00b8\u0001\u001a\u000200J\u001a\u0010\u00c0\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00c1\u0001\u001a\u00020\u001b2\u0007\u0010\u00c2\u0001\u001a\u00020\u0011J\u0011\u0010\u00c3\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00c1\u0001\u001a\u00020\u001bJ\u0011\u0010\u00c4\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00c5\u0001\u001a\u00020>J\u0013\u0010\u00c6\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u00c7\u0001\u001a\u00020>H\u0016J\b\u0010\u00c8\u0001\u001a\u00030\u00b7\u0001J\u0013\u0010\u00c9\u0001\u001a\u00030\u00b7\u00012\t\u0010\u00ca\u0001\u001a\u0004\u0018\u000100R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001a\u0010&\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001d\"\u0004\b(\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R&\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u00105\u001a\b\u0012\u0004\u0012\u0002000/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010\u001fR(\u0010=\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010>0>0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00102\"\u0004\bA\u00104R\u001a\u0010B\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010+\"\u0004\bD\u0010-R\u001a\u0010E\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010+\"\u0004\bG\u0010-R \u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u00102\"\u0004\bK\u00104R\u001a\u0010L\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010+\"\u0004\bN\u0010-R\u001d\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0P8F\u00a2\u0006\u0006\u001a\u0004\bQ\u0010RR\u001d\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\b0P8F\u00a2\u0006\u0006\u001a\u0004\bU\u0010RR\u001d\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0P8F\u00a2\u0006\u0006\u001a\u0004\bW\u0010RR\u001f\u0010X\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000\b0P8F\u00a2\u0006\u0006\u001a\u0004\bY\u0010RR+\u0010Z\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000200\u0012\u0006\u0012\u0004\u0018\u00010\\0[0\b0P8F\u00a2\u0006\u0006\u001a\u0004\b]\u0010RR\u001d\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0P8F\u00a2\u0006\u0006\u001a\u0004\b_\u0010RR(\u0010`\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010>0>0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u00102\"\u0004\bb\u00104R \u0010c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u00102\"\u0004\be\u00104R \u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u00102\"\u0004\bi\u00104R&\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u00102\"\u0004\bl\u00104R\u001a\u0010m\u001a\u00020gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001f\u0010q\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010g0g0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u00102R*\u0010r\u001a\u0012\u0012\u0004\u0012\u00020\u001b0sj\b\u0012\u0004\u0012\u00020\u001b`tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR*\u0010y\u001a\u0012\u0012\u0004\u0012\u00020z0sj\b\u0012\u0004\u0012\u00020z`tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010v\"\u0004\b|\u0010xR\u001a\u0010}\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010+\"\u0004\b\u007f\u0010-R \u0010\u0080\u0001\u001a\u00030\u0081\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R!\u0010\u0086\u0001\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010g0g0\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u00102R \u0010\u0088\u0001\u001a\u00030\u0089\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R&\u0010\u008e\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u00102\"\u0005\b\u0091\u0001\u00104R\u001b\u0010\u0092\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0093\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000\b0\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u00102R)\u0010\u0095\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000200\u0012\u0006\u0012\u0004\u0018\u00010\\0[0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0096\u0001\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u001d\"\u0005\b\u0098\u0001\u0010\u001fR\u001d\u0010\u0099\u0001\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010+\"\u0005\b\u009b\u0001\u0010-R-\u0010\u009c\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001b0sj\b\u0012\u0004\u0012\u00020\u001b`tX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010v\"\u0005\b\u009e\u0001\u0010xR#\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u0002000/X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u00107\"\u0005\b\u00a1\u0001\u00109R!\u0010\u00a2\u0001\u001a\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010g0g0\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a3\u0001\u00102R\u001b\u0010\u00a4\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u00a5\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\b0\u0007\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a6\u0001\u00102R \u0010\u00a7\u0001\u001a\u00030\u0089\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a8\u0001\u0010\u008b\u0001\"\u0006\b\u00a9\u0001\u0010\u008d\u0001R)\u0010\u00aa\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ab\u0001\u00102\"\u0005\b\u00ac\u0001\u00104R\u001d\u0010\u00ad\u0001\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ae\u0001\u0010+\"\u0005\b\u00af\u0001\u0010-R\u001d\u0010\u00b0\u0001\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b1\u0001\u0010+\"\u0005\b\u00b2\u0001\u0010-R\u001d\u0010\u00b3\u0001\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b4\u0001\u0010\u001d\"\u0005\b\u00b5\u0001\u0010\u001f\u00a8\u0006\u00cb\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/CouponViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applyCouponFailed", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "billDetailsData", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "getBillDetailsData", "()Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;", "setBillDetailsData", "(Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse$ResponseData;)V", "cashHandlingCharge", "", "getCashHandlingCharge", "()Ljava/lang/Double;", "setCashHandlingCharge", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "cashHandlingChargeApplicable", "getCashHandlingChargeApplicable", "setCashHandlingChargeApplicable", "clickedOnPage", "", "getClickedOnPage", "()Ljava/lang/String;", "setClickedOnPage", "(Ljava/lang/String;)V", "clickedOnPageFromIntent", "getClickedOnPageFromIntent", "setClickedOnPageFromIntent", "clickedOnPageNameForCouponApplyEvent", "getClickedOnPageNameForCouponApplyEvent", "setClickedOnPageNameForCouponApplyEvent", "clickedOnPageNameForCouponEvent", "getClickedOnPageNameForCouponEvent", "setClickedOnPageNameForCouponEvent", "couponDiscountAmountEventValue", "getCouponDiscountAmountEventValue", "()D", "setCouponDiscountAmountEventValue", "(D)V", "couponList", "", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse$Coupon;", "getCouponList", "()Landroidx/lifecycle/MutableLiveData;", "setCouponList", "(Landroidx/lifecycle/MutableLiveData;)V", "couponListResponse", "getCouponListResponse", "()Ljava/util/List;", "setCouponListResponse", "(Ljava/util/List;)V", "currentPaymentIconType", "getCurrentPaymentIconType", "setCurrentPaymentIconType", "currentServerFtcTime", "", "kotlin.jvm.PlatformType", "getCurrentServerFtcTime", "setCurrentServerFtcTime", "deliveryChargeAmountEventValue", "getDeliveryChargeAmountEventValue", "setDeliveryChargeAmountEventValue", "discountAmountEventValue", "getDiscountAmountEventValue", "setDiscountAmountEventValue", "errorMsgHelper", "Lcom/intellihealth/truemeds/data/model/errormessage/ErrorMessageData;", "getErrorMsgHelper", "setErrorMsgHelper", "estimatedPayableAmountEventValue", "getEstimatedPayableAmountEventValue", "setEstimatedPayableAmountEventValue", "eventApplyCouponFailed", "Landroidx/lifecycle/LiveData;", "getEventApplyCouponFailed", "()Landroidx/lifecycle/LiveData;", "eventMessage", "Lcom/intellihealth/truemeds/data/utils/MessageConstant;", "getEventMessage", "eventOpenCouponBottomSheet", "getEventOpenCouponBottomSheet", "eventOpenCouponFailed", "getEventOpenCouponFailed", "eventOpenCouponPopup", "Lkotlin/Pair;", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "getEventOpenCouponPopup", "eventShowError", "getEventShowError", "expiryServerFtcTime", "getExpiryServerFtcTime", "setExpiryServerFtcTime", "ftcCounterTime", "getFtcCounterTime", "setFtcCounterTime", "hasRxOrder", "", "getHasRxOrder", "setHasRxOrder", "initCountDownTimerTriggerEvent", "getInitCountDownTimerTriggerEvent", "setInitCountDownTimerTriggerEvent", "isCouponRemoved", "()Z", "setCouponRemoved", "(Z)V", "isLoadingEnabled", "itemNamesEventValue", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemNamesEventValue", "()Ljava/util/ArrayList;", "setItemNamesEventValue", "(Ljava/util/ArrayList;)V", "medicineListDataReceived", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineListDetailsSent;", "getMedicineListDataReceived", "setMedicineListDataReceived", "mrpTotalAmountEventValue", "getMrpTotalAmountEventValue", "setMrpTotalAmountEventValue", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "noCouponFound", "getNoCouponFound", "noOfItemEventValue", "", "getNoOfItemEventValue", "()I", "setNoOfItemEventValue", "(I)V", "notificationData", "Lcom/intellihealth/salt/models/StickyNonStickyNotificationModel;", "getNotificationData", "setNotificationData", "openCouponBottomSheet", "openCouponFailed", "getOpenCouponFailed", "openCouponPopup", "orderIdEventValue", "getOrderIdEventValue", "setOrderIdEventValue", "packagingChargesAmountEventValue", "getPackagingChargesAmountEventValue", "setPackagingChargesAmountEventValue", "productsIdsEventValue", "getProductsIdsEventValue", "setProductsIdsEventValue", "searchedCouponList", "getSearchedCouponList", "setSearchedCouponList", "setTextFieldEmpty", "getSetTextFieldEmpty", "showError", "showMessage", "getShowMessage", "subsIdEventValue", "getSubsIdEventValue", "setSubsIdEventValue", "tempList", "getTempList", "setTempList", "tmCreditAmountEventValue", "getTmCreditAmountEventValue", "setTmCreditAmountEventValue", "tmRewardAmountEventValue", "getTmRewardAmountEventValue", "setTmRewardAmountEventValue", "whIdEventValue", "getWhIdEventValue", "setWhIdEventValue", "applyCouponClick", "", "coupon", "callEventForCouponListOpened", "changeCouponButtonState", "isApplied", "offerId", "couponEventPageName", "couponCodeResponse", "removeCoupon", "searchApplyClicked", "couponCode", "currentCartValue", "searchApplyCouponClick", "sendFtcCounterStarted", "timestamp", "setCountDownTimerTrigger", "millis", "setCouponData", "setEventOfferSheetViewed", "applyCouponBottomSheetModel", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public class CouponViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> couponList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> searchedCouponList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> couponListResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> tempList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse>>> openCouponPopup = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> openCouponFailed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> applyCouponFailed = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> notificationData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> openCouponBottomSheet = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> showError = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> ftcCounterTime;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> currentServerFtcTime;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> expiryServerFtcTime;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> errorMsgHelper;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Long>> initCountDownTimerTriggerEvent;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> setTextFieldEmpty = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> noCouponFound = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> hasRxOrder;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentPaymentIconType = "";
    private boolean isCouponRemoved = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPage = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPageFromIntent = "";
    private double couponDiscountAmountEventValue = 0.0;
    private double deliveryChargeAmountEventValue = 0.0;
    private double discountAmountEventValue = 0.0;
    private double estimatedPayableAmountEventValue = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> itemNamesEventValue;
    private double mrpTotalAmountEventValue = 0.0;
    private int noOfItemEventValue = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String orderIdEventValue = "";
    private double packagingChargesAmountEventValue = 0.0;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> productsIdsEventValue;
    private int subsIdEventValue = 0;
    private double tmCreditAmountEventValue = 0.0;
    private double tmRewardAmountEventValue = 0.0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingCharge;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cashHandlingChargeApplicable;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String whIdEventValue = "";
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData billDetailsData;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> medicineListDataReceived;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPageNameForCouponEvent = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clickedOnPageNameForCouponApplyEvent = "";
    
    @javax.inject.Inject()
    public CouponViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> getCouponList() {
        return null;
    }
    
    public final void setCouponList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> getSearchedCouponList() {
        return null;
    }
    
    public final void setSearchedCouponList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> getCouponListResponse() {
        return null;
    }
    
    public final void setCouponListResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> getTempList() {
        return null;
    }
    
    public final void setTempList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<kotlin.Pair<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon, com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse>>> getEventOpenCouponPopup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> getOpenCouponFailed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> getEventOpenCouponFailed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventApplyCouponFailed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> getNotificationData() {
        return null;
    }
    
    public final void setNotificationData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.StickyNonStickyNotificationModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>> getEventOpenCouponBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFtcCounterTime() {
        return null;
    }
    
    public final void setFtcCounterTime(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getCurrentServerFtcTime() {
        return null;
    }
    
    public final void setCurrentServerFtcTime(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getExpiryServerFtcTime() {
        return null;
    }
    
    public final void setExpiryServerFtcTime(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getErrorMsgHelper() {
        return null;
    }
    
    public final void setErrorMsgHelper(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Long>> getInitCountDownTimerTriggerEvent() {
        return null;
    }
    
    public final void setInitCountDownTimerTriggerEvent(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Long>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSetTextFieldEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNoCouponFound() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHasRxOrder() {
        return null;
    }
    
    public final void setHasRxOrder(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentPaymentIconType() {
        return null;
    }
    
    public final void setCurrentPaymentIconType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isCouponRemoved() {
        return false;
    }
    
    public final void setCouponRemoved(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> getShowMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MessageConstant>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPage() {
        return null;
    }
    
    public final void setClickedOnPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPageFromIntent() {
        return null;
    }
    
    public final void setClickedOnPageFromIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getCouponDiscountAmountEventValue() {
        return 0.0;
    }
    
    public final void setCouponDiscountAmountEventValue(double p0) {
    }
    
    public final double getDeliveryChargeAmountEventValue() {
        return 0.0;
    }
    
    public final void setDeliveryChargeAmountEventValue(double p0) {
    }
    
    public final double getDiscountAmountEventValue() {
        return 0.0;
    }
    
    public final void setDiscountAmountEventValue(double p0) {
    }
    
    public final double getEstimatedPayableAmountEventValue() {
        return 0.0;
    }
    
    public final void setEstimatedPayableAmountEventValue(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getItemNamesEventValue() {
        return null;
    }
    
    public final void setItemNamesEventValue(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final double getMrpTotalAmountEventValue() {
        return 0.0;
    }
    
    public final void setMrpTotalAmountEventValue(double p0) {
    }
    
    public final int getNoOfItemEventValue() {
        return 0;
    }
    
    public final void setNoOfItemEventValue(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderIdEventValue() {
        return null;
    }
    
    public final void setOrderIdEventValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getPackagingChargesAmountEventValue() {
        return 0.0;
    }
    
    public final void setPackagingChargesAmountEventValue(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getProductsIdsEventValue() {
        return null;
    }
    
    public final void setProductsIdsEventValue(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final int getSubsIdEventValue() {
        return 0;
    }
    
    public final void setSubsIdEventValue(int p0) {
    }
    
    public final double getTmCreditAmountEventValue() {
        return 0.0;
    }
    
    public final void setTmCreditAmountEventValue(double p0) {
    }
    
    public final double getTmRewardAmountEventValue() {
        return 0.0;
    }
    
    public final void setTmRewardAmountEventValue(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingCharge() {
        return null;
    }
    
    public final void setCashHandlingCharge(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCashHandlingChargeApplicable() {
        return null;
    }
    
    public final void setCashHandlingChargeApplicable(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWhIdEventValue() {
        return null;
    }
    
    public final void setWhIdEventValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData getBillDetailsData() {
        return null;
    }
    
    public final void setBillDetailsData(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse.ResponseData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> getMedicineListDataReceived() {
        return null;
    }
    
    public final void setMedicineListDataReceived(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.intellihealth.truemeds.data.model.orderflow.MedicineListDetailsSent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPageNameForCouponEvent() {
        return null;
    }
    
    public final void setClickedOnPageNameForCouponEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickedOnPageNameForCouponApplyEvent() {
        return null;
    }
    
    public final void setClickedOnPageNameForCouponApplyEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void setCouponData() {
    }
    
    public final void callEventForCouponListOpened() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String couponEventPageName(@org.jetbrains.annotations.NotNull()
    java.lang.String offerId) {
        return null;
    }
    
    public final void applyCouponClick(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon coupon, @org.jetbrains.annotations.NotNull()
    java.lang.String clickedOnPageNameForCouponApplyEvent) {
    }
    
    public final void removeCoupon(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon coupon) {
    }
    
    public final void searchApplyCouponClick(@org.jetbrains.annotations.NotNull()
    java.lang.String couponCode) {
    }
    
    public final void searchApplyClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String couponCode, double currentCartValue) {
    }
    
    public final void openCouponBottomSheet(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon couponCodeResponse) {
    }
    
    public final void changeCouponButtonState(boolean isApplied, int offerId) {
    }
    
    public void setCountDownTimerTrigger(long millis) {
    }
    
    public final void setEventOfferSheetViewed(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon applyCouponBottomSheetModel) {
    }
    
    public final void sendFtcCounterStarted(long timestamp) {
    }
}