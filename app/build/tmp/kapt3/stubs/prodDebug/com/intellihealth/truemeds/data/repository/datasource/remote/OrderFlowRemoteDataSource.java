package com.intellihealth.truemeds.data.repository.datasource.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a2\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u00a6@\u00a2\u0006\u0002\u0010\u0012Jd\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\u001cJ:\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060 2\u0006\u0010\u0016\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010!J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010#J6\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010 2\u0006\u0010\u0011\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010(JF\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0010\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010/2\u0006\u00100\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u00101J>\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u00107J\u001e\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00032\b\u0010:\u001a\u0004\u0018\u00010\rH\u00a6@\u00a2\u0006\u0002\u0010\u0012J@\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\u0010\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010/2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010?J$\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00032\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010BJ$\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00032\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u00a6@\u00a2\u0006\u0002\u0010EJ\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00032\u0006\u0010\u0016\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\u0010I\u001a\u0004\u0018\u00010JH\u00a6@\u00a2\u0006\u0002\u0010KJ$\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010NJ$\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010SJR\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u00032\u0006\u0010V\u001a\u00020\r2\u0006\u0010W\u001a\u00020\r2\u0006\u0010X\u001a\u00020,2\u0006\u0010Y\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0/2\u0006\u0010[\u001a\u00020,2\u0006\u00106\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\\J*\u0010]\u001a\b\u0012\u0004\u0012\u00020*0\u00032\u0006\u0010^\u001a\u00020\r2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00060 H\u00a6@\u00a2\u0006\u0002\u0010`J\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010cJ\u001c\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010cJ\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u00032\u0006\u0010h\u001a\u00020iH\u00a6@\u00a2\u0006\u0002\u0010jJ&\u0010k\u001a\b\u0012\u0004\u0012\u00020l0\u00032\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010\rH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020n0\u00032\u0006\u0010\u0016\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010cJ&\u0010m\u001a\b\u0012\u0004\u0012\u00020o0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010pJ~\u0010q\u001a\b\u0012\u0004\u0012\u00020r0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\u001e\u0010s\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010tj\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`u2\b\u0010v\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010w\u001a\u00020\b2\b\u0010x\u001a\u0004\u0018\u00010,2\u0006\u0010y\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010zJf\u0010{\u001a\b\u0012\u0004\u0012\u00020%0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010 2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010w\u001a\u00020\b2\u0006\u0010x\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010|J3\u0010}\u001a\b\u0012\u0004\u0012\u00020~0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u007f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u00a6@\u00a2\u0006\u0003\u0010\u0080\u0001J+\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0003\u0010\u0083\u0001Jk\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00032\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0 2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010w\u001a\u00020\b2\b\u0010x\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\rH\u00a6@\u00a2\u0006\u0003\u0010\u0086\u0001J/\u0010\u0087\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u00a6@\u00a2\u0006\u0003\u0010\u0089\u0001J!\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010\u00032\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010JH\u00a6@\u00a2\u0006\u0002\u0010KJ0\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0003\u0010\u008e\u0001J=\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0007\u0010\u0090\u0001\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0003\u0010\u0091\u0001J)\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0007\u0010\u0093\u0001\u001a\u00020\bH\u00a6@\u00a2\u0006\u0003\u0010\u0094\u0001J4\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u00a6@\u00a2\u0006\u0003\u0010\u0080\u0001J@\u0010\u0096\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0097\u00010\u00032\u0007\u0010\u0098\u0001\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\b\u00106\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0003\u0010\u009b\u0001\u00a8\u0006\u009c\u0001"}, d2 = {"Lcom/intellihealth/truemeds/data/repository/datasource/remote/OrderFlowRemoteDataSource;", "", "calculateBillDetailsforApp", "Lretrofit2/Response;", "Lcom/intellihealth/truemeds/data/model/orderflow/BillDetailResponse;", "orderId", "", "paymentSelectionInfo", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePaymentMode", "Lokhttp3/ResponseBody;", "paymentModeId", "", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPincodeServiceability", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "pincode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmOrder", "paymentId", "offerId", "customerId", "paymentMethod", "paymentMethodId", "orderConfirmSrc", "sourceVersion", "checkAutoConfirmEligibility", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteImage", "edit", "images", "", "(JZLjava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "discardOrder", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editMedicine", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveMedsCreateEditOrderResponse;", "medicineDto", "Lcom/intellihealth/truemeds/data/model/orderflow/MedicineDto;", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAllOrdersOfCustomers", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel;", "page", "", "result", "statusIds", "", "patientIds", "(Ljava/lang/String;IILjava/util/Set;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCouponData", "Lcom/intellihealth/truemeds/data/model/coupon/CouponCodeResponse;", "offerType", "categoryType", "variantId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchIconMaster", "Lcom/intellihealth/truemeds/data/model/psp/PaymentMethodResponse;", "iconType", "fetchReOrderOTCProductV1", "Lcom/intellihealth/truemeds/data/model/ordersummary/OTCResponse;", "productCodes", "patientId", "(Ljava/util/Set;Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAddress", "Lcom/intellihealth/truemeds/data/model/ordersummary/AddressResponse;", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOffers", "Lcom/intellihealth/truemeds/data/model/orderflow/AllOffersResponse;", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPrescriptionByCustomerId", "Lcom/intellihealth/truemeds/data/model/orderflow/AllPrescriptionByCustomerResponse;", "getClickPostReturnLink", "obj", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerOrderDetail", "Lcom/intellihealth/truemeds/data/model/ordersummary/CustomerOrderDetailResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerOrderDetails", "Lcom/intellihealth/truemeds/data/model/orderflow/GetCustomerOrderDetails;", "getDoctorDetails", "Lcom/intellihealth/truemeds/data/model/doctordetails/DoctorDetails;", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastMinuteResponse", "Lcom/intellihealth/truemeds/data/model/ordersummary/LastMinutePurchaseResponse;", "sessionToken", "warehouseId", "pageNumber", "type", "subType", "pageSize", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyOrders", "orderType", "patientList", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderMedicineDetails", "Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderMedicineDetails;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrderRx", "Lcom/intellihealth/truemeds/data/model/orderflow/GetOrderRxResponse;", "getOtcProductsForCategories", "Lcom/intellihealth/truemeds/presentation/model/OtcCategoriesForProductsResponse;", "request", "Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;", "(Lcom/intellihealth/truemeds/presentation/model/OtcProductsForCategoriesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPatientAndPrescriptionDetails", "Lcom/intellihealth/truemeds/presentation/model/GetAllPrescriptionDataModel;", "getPatientDetails", "Lcom/intellihealth/truemeds/presentation/model/GetAllPatientModel;", "Lcom/intellihealth/truemeds/data/model/orderflow/GetPatientDetailsResponse;", "(Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reOrder", "Lcom/intellihealth/truemeds/data/model/home/ReorderResponse;", "patientListDto", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "variant", "newAlgo", "serialId", "reOrderMedCheck", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replaceMedicineForIncompleteOrder", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/String;ZZJLjava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAddressForOrder", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveAddressForOrderResponse;", "addressId", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCouponCode", "couponCode", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMedsAndCreateOrder", "variantID", "(Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentAndCouponForOrder", "Lcom/intellihealth/truemeds/data/model/coupon/CouponSaveRemoveResponse;", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDoctorRating", "Lcom/intellihealth/truemeds/data/model/orderstatus/DoctorRating;", "ratingData", "setPaymentModeForAnOrder", "(Ljava/lang/Long;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPaymentSelectionMethod", "paymentMode", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPspViewedByCustomer", "isPspViewed", "(Ljava/lang/Long;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePatientIdInSubOrder", "uploadImage", "Lcom/intellihealth/truemeds/data/model/orderflow/SaveRxImageForCustomerIdResponse;", "pinCode", "uploadImageModel", "Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellihealth/truemeds/data/model/prescription/ImageUploadRequest;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface OrderFlowRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveMedsAndCreateOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medicineDto, @org.jetbrains.annotations.Nullable()
    java.lang.String offerId, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantID, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Long serialId, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object replaceMedicineForIncompleteOrder(long orderId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medicineDto, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, boolean checkAutoConfirmEligibility, boolean newAlgo, long serialId, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editMedicine(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.intellihealth.truemeds.data.model.orderflow.MedicineDto> medicineDto, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveMedsCreateEditOrderResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderMedicineDetails(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetOrderMedicineDetails>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCustomerOrderDetails(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetCustomerOrderDetails>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientDetails(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetPatientDetailsResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderRx(long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.GetOrderRxResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setPaymentModeForAnOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, int paymentId, long offerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object uploadImage(@org.jetbrains.annotations.NotNull()
    java.lang.String pinCode, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.prescription.ImageUploadRequest uploadImageModel, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveRxImageForCustomerIdResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllPrescriptionByCustomerId(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.AllPrescriptionByCustomerResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllOffers(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, int result, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.AllOffersResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object savePaymentAndCouponForOrder(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentId, @org.jetbrains.annotations.NotNull()
    java.lang.String offerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.coupon.CouponSaveRemoveResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCouponCode(@org.jetbrains.annotations.Nullable()
    java.lang.String couponCode, @org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveAddressForOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long addressId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.SaveAddressForOrderResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePatientIdInSubOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long patientId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchIconMaster(@org.jetbrains.annotations.Nullable()
    java.lang.String iconType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setPaymentSelectionMethod(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, long paymentMode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setPspViewedByCustomer(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, boolean isPspViewed, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object confirmOrder(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentId, @org.jetbrains.annotations.Nullable()
    java.lang.String offerId, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable()
    java.lang.Long paymentMethodId, @org.jetbrains.annotations.Nullable()
    java.lang.String orderConfirmSrc, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceVersion, boolean checkAutoConfirmEligibility, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object discardOrder(long orderId, long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDoctorDetails(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.doctordetails.DoctorDetails>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setDoctorRating(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject ratingData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderstatus.DoctorRating>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getClickPostReturnLink(@org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject obj, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object changePaymentMode(long orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentModeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchAllOrdersOfCustomers(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, int page, int result, @org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> statusIds, @org.jetbrains.annotations.NotNull()
    java.lang.String patientIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMyOrders(@org.jetbrains.annotations.NotNull()
    java.lang.String orderType, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> patientList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object reOrder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Long> patientListDto, @org.jetbrains.annotations.Nullable()
    java.lang.String variant, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serialId, boolean reOrderMedCheck, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.ReorderResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object calculateBillDetailsforApp(long orderId, boolean paymentSelectionInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.orderflow.BillDetailResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchCouponData(int result, @org.jetbrains.annotations.NotNull()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    java.lang.String offerType, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryType, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.AddressResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCustomerOrderDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.CustomerOrderDetailResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLastMinuteResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionToken, @org.jetbrains.annotations.NotNull()
    java.lang.String warehouseId, int pageNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> subType, int pageSize, long variantId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.LastMinutePurchaseResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOtcProductsForCategories(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.model.OtcProductsForCategoriesRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.OtcCategoriesForProductsResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object fetchReOrderOTCProductV1(@org.jetbrains.annotations.Nullable()
    java.util.Set<java.lang.String> productCodes, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, long patientId, long orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.ordersummary.OTCResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object checkPincodeServiceability(@org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteImage(long orderId, boolean edit, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> images, @org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientAndPrescriptionDetails(long customerId, @org.jetbrains.annotations.Nullable()
    java.lang.String patientId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.GetAllPrescriptionDataModel>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPatientDetails(long customerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.intellihealth.truemeds.presentation.model.GetAllPatientModel>> $completion);
}