package com.intellihealth.truemeds.data.repository.datasourceimpl.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00aa\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0016Jd\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010 J:\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0$2\u0006\u0010\u001a\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010%J$\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\'J6\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010$2\u0006\u0010\u0015\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010,JF\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0010\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001032\u0006\u00104\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u00105J>\u00106\u001a\b\u0012\u0004\u0012\u0002070\b2\u0006\u00101\u001a\u0002002\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\b\u0010:\u001a\u0004\u0018\u00010\u000bH\u0096@\u00a2\u0006\u0002\u0010;J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\b2\b\u0010>\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0016J@\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\b2\u0010\u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010CJ$\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010FJ$\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u00101\u001a\u000200H\u0096@\u00a2\u0006\u0002\u0010IJ\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\b2\u0006\u0010\u001a\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u001e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010M\u001a\u0004\u0018\u00010NH\u0096@\u00a2\u0006\u0002\u0010OJ$\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010RJ$\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@\u00a2\u0006\u0002\u0010WJR\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\b2\u0006\u0010Z\u001a\u00020\u00052\u0006\u0010[\u001a\u00020\u00052\u0006\u0010\\\u001a\u0002002\u0006\u0010]\u001a\u00020\u00052\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u0005032\u0006\u0010_\u001a\u0002002\u0006\u0010:\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010`J*\u0010a\u001a\b\u0012\u0004\u0012\u00020.0\b2\u0006\u0010b\u001a\u00020\u00052\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000b0$H\u0096@\u00a2\u0006\u0002\u0010dJ\u001c\u0010e\u001a\b\u0012\u0004\u0012\u00020f0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010gJ\u001c\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010gJ\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020k0\b2\u0006\u0010l\u001a\u00020mH\u0096@\u00a2\u0006\u0002\u0010nJ&\u0010o\u001a\b\u0012\u0004\u0012\u00020p0\b2\u0006\u0010\u001a\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020r0\b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010gJ&\u0010q\u001a\b\u0012\u0004\u0012\u00020s0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0002\u0010tJ~\u0010u\u001a\b\u0012\u0004\u0012\u00020v0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u001e\u0010w\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010xj\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u0001`y2\b\u0010z\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010{\u001a\u00020\r2\b\u0010|\u001a\u0004\u0018\u0001002\u0006\u0010}\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u00010\u000bH\u0096@\u00a2\u0006\u0002\u0010~Jg\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020)0\b2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010$2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010{\u001a\u00020\r2\u0006\u0010|\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0003\u0010\u0080\u0001J6\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0003\u0010\u0084\u0001J+\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@\u00a2\u0006\u0003\u0010\u0087\u0001Jk\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020)0\b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0$2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010{\u001a\u00020\r2\b\u0010|\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0003\u0010\u008a\u0001J/\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0003\u0010\u008d\u0001J!\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\b2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010NH\u0096@\u00a2\u0006\u0002\u0010OJ0\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0003\u0010\u0092\u0001J=\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0007\u0010\u0094\u0001\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0003\u0010\u0095\u0001J)\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0007\u0010\u0097\u0001\u001a\u00020\rH\u0096@\u00a2\u0006\u0003\u0010\u0098\u0001J4\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0096@\u00a2\u0006\u0003\u0010\u0084\u0001J@\u0010\u009a\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u009b\u00010\b2\u0007\u0010\u009c\u0001\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\b\u0010:\u001a\u0004\u0018\u00010\u000bH\u0096@\u00a2\u0006\u0003\u0010\u009f\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00a0\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasourceimpl/remote/OrderFlowRemoteDataSourceImpl;", "Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderFlowRemoteDataSource;", "orderFlowApi", "Lcom/intellihealth/truemeds/data/api/OrderFlowApi;", "contentType", "", "(Lcom/intellihealth/truemeds/data/api/OrderFlowApi;Ljava/lang/String;)V", "calculateBillDetailsforApp", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "orderId", "", "paymentSelectionInfo", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePaymentMode", "Lokhttp3/ResponseBody;", "paymentModeId", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPincodeServiceability", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "pincode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmOrder", "paymentId", "offerId", "customerId", "paymentMethod", "paymentMethodId", "orderConfirmSrc", "sourceVersion", "checkAutoConfirmEligibility", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteImage", "edit", "images", "", "(JZLjava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardOrder", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editMedicine", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveMedsCreateEditOrderResponse;", "medicineDto", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineDto;", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAllOrdersOfCustomers", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel;", "page", "", "result", "statusIds", "", "patientIds", "(Ljava/lang/String;IILjava/util/Set;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCouponData", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse;", "offerType", "categoryType", "variantId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchIconMaster", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse;", "iconType", "fetchReOrderOTCProductV1", "Lcom/intellihealth/truemeds/data/model/ordersummary/OTCResponse;", "productCodes", "patientId", "(Ljava/util/Set;Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAddress", "Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse;", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOffers", "Lcom/intellihealth/truemeds/data/model/orderflow/AllOffersResponse;", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPrescriptionByCustomerId", "Lcom/intellihealth/truemeds/data/model/orderflow/AllPrescriptionByCustomerResponse;", "getClickPostReturnLink", "obj", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerOrderDetail", "Lcom/intellihealth/truemeds/data/model/ordersummary/CustomerOrderDetailResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerOrderDetails", "Lcom/intellihealth/truemeds/data/model/orderflow/GetCustomerOrderDetails;", "getDoctorDetails", "Lcom/intellihealth/truemeds/data/model/doctordetails/DoctorDetails;", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastMinuteResponse", "Lcom/intellihealth/truemeds/data/model/ordersummary/LastMinutePurchaseResponse;", "sessionToken", "warehouseId", "pageNumber", "type", "subType", "pageSize", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyOrders", "orderType", "patientList", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderMedicineDetails", "Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderMedicineDetails;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderRx", "Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderRxResponse;", "getOtcProductsForCategories", "Lcom/intellihealth/truemeds/presentation/model/OtcCategoriesForProductsResponse;", "request", "Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;", "(Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientAndPrescriptionDetails", "Lcom/intellihealth/truemeds/presentation/model/GetAllPrescriptionDataModel;", "getPatientDetails", "Lcom/intellihealth/truemeds/presentation/model/GetAllPatientModel;", "Lcom/intellihealth/truemeds/data/model/orderflow/GetPatientDetailsResponse;", "(Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reOrder", "Lcom/intellihealth/truemeds/data/model/home/ReorderResponse;", "patientListDto", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "variant", "newAlgo", "serialId", "reOrderMedCheck", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replaceMedicineForIncompleteOrder", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAddressForOrder", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveAddressForOrderResponse;", "addressId", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCouponCode", "couponCode", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMedsAndCreateOrder", "variantID", "(Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentAndCouponForOrder", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDoctorRating", "Lcom/intellihealth/truemeds/data/model/orderstatus/DoctorRating;", "ratingData", "setPaymentModeForAnOrder", "(Ljava/lang/Long;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPaymentSelectionMethod", "paymentMode", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPspViewedByCustomer", "isPspViewed", "(Ljava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePatientIdInSubOrder", "uploadImage", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRxImageForCustomerIdResponse;", "pinCode", "uploadImageModel", "Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_stageAndroidDebug"})
public final class OrderFlowRemoteDataSourceImpl implements com.intellihealth.truemeds.data.repository.datasource.remote.OrderFlowRemoteDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.data.api.OrderFlowApi orderFlowApi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String contentType = null;
    
    @javax.inject.Inject()
    public OrderFlowRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.api.OrderFlowApi orderFlowApi, @javax.inject.Named(value = "content_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveMedsAndCreateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medicineDto, @org.jetbrains.annotations.Nullable()
    java.lang.String offerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantID, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Long serialId, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object replaceMedicineForIncompleteOrder(long orderId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medicineDto, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, boolean checkAutoConfirmEligibility, boolean newAlgo, long serialId, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object editMedicine(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medicineDto, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOrderMedicineDetails(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetOrderMedicineDetails>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerOrderDetails(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetCustomerOrderDetails>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPatientDetails(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOrderRx(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setPaymentModeForAnOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, int paymentId, long offerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String pinCode, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest uploadImageModel, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveRxImageForCustomerIdResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllPrescriptionByCustomerId(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.AllPrescriptionByCustomerResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllOffers(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, int result, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.AllOffersResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object savePaymentAndCouponForOrder(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentId, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveCouponCode(@org.jetbrains.annotations.Nullable()
    java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object saveAddressForOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long addressId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveAddressForOrderResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updatePatientIdInSubOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchIconMaster(@org.jetbrains.annotations.Nullable()
    java.lang.String iconType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setPaymentSelectionMethod(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, long paymentMode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setPspViewedByCustomer(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, boolean isPspViewed, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object confirmOrder(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentId, @org.jetbrains.annotations.Nullable()
    java.lang.String offerId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String orderConfirmSrc, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceVersion, boolean checkAutoConfirmEligibility, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object discardOrder(long orderId, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getDoctorDetails(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.doctordetails.DoctorDetails>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object setDoctorRating(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject ratingData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.DoctorRating>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getClickPostReturnLink(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject obj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object changePaymentMode(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentModeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object calculateBillDetailsforApp(long orderId, boolean paymentSelectionInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchAllOrdersOfCustomers(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, int page, int result, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> statusIds, @org.jetbrains.annotations.NotNull()
    java.lang.String patientIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getMyOrders(@org.jetbrains.annotations.NotNull()
    java.lang.String orderType, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> patientList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object reOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Long> patientListDto, @org.jetbrains.annotations.Nullable()
    java.lang.String variant, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serialId, boolean reOrderMedCheck, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.ReorderResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchCouponData(int result, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    java.lang.String offerType, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.AddressResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCustomerOrderDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getLastMinuteResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, int pageNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, int pageSize, long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.LastMinutePurchaseResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getOtcProductsForCategories(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchReOrderOTCProductV1(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> productCodes, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, long patientId, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.OTCResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkPincodeServiceability(@org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteImage(long orderId, boolean edit, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> images, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPatientAndPrescriptionDetails(long customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getPatientDetails(long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.GetAllPatientModel>> $completion) {
        return null;
    }
}