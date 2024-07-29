package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001J\b\u0010\u0087\u0001\u001a\u00030\u0084\u0001J\u0012\u0010\u0088\u0001\u001a\u00030\u0084\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001J\u001d\u0010\u008b\u0001\u001a\u00030\u0084\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\t\b\u0002\u0010\u008c\u0001\u001a\u00020\"J\u0083\u0001\u0010\u008d\u0001\u001a\u00030\u008e\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010n2\t\u0010\u0090\u0001\u001a\u0004\u0018\u0001062!\u0010\u0091\u0001\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010n\u0018\u00010\u0092\u0001j\r\u0012\u0006\u0012\u0004\u0018\u00010n\u0018\u0001`\u0093\u00012\t\u0010\u0094\u0001\u001a\u0004\u0018\u0001062\u0007\u0010\u0095\u0001\u001a\u00020\"2\u0007\u0010\u0096\u0001\u001a\u00020\"2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000b2\u0007\u0010\u0098\u0001\u001a\u00020\"2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010n\u00a2\u0006\u0003\u0010\u009a\u0001J\u0012\u0010\u009b\u0001\u001a\u00030\u0084\u00012\b\u0010\u009c\u0001\u001a\u00030\u008a\u0001J\n\u0010\u009d\u0001\u001a\u00030\u0084\u0001H\u0014J\b\u0010\u009e\u0001\u001a\u00030\u0084\u0001J\u0011\u0010\u009f\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00a0\u0001\u001a\u00020\u000bJ\u0011\u0010\u00a1\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00a0\u0001\u001a\u00020\u000bJ\u0011\u0010\u00a2\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00a0\u0001\u001a\u00020\u000bJ\b\u0010\u00a3\u0001\u001a\u00030\u0084\u0001J\b\u0010\u00a4\u0001\u001a\u00030\u00a5\u0001J\b\u0010\u00a6\u0001\u001a\u00030\u0084\u0001J\u0011\u0010\u00a7\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00a0\u0001\u001a\u00020\u000bJ\u0011\u0010\u00a8\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00a9\u0001\u001a\u00020\u000bJ\b\u0010\u00aa\u0001\u001a\u00030\u0084\u0001J\u0011\u0010\u00ab\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00a0\u0001\u001a\u00020\u000bJ\b\u0010\u00ac\u0001\u001a\u00030\u0084\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010$\"\u0004\b(\u0010&R\u001a\u0010)\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0\u001d8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010 R(\u0010,\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\"0\"0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001a\u00103\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R \u00105\u001a\b\u0012\u0004\u0012\u0002060\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010\u000fR\u001a\u0010<\u001a\u00020=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001f\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010D0C0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u001a\u0010F\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\r\"\u0004\bH\u0010\u000fR\u001a\u0010I\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\r\"\u0004\bK\u0010\u000fR\u001a\u0010L\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\r\"\u0004\bN\u0010\u000fR\u001a\u0010O\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010T\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010SR(\u0010W\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010X0C0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010.\"\u0004\bZ\u00100R \u0010[\u001a\b\u0012\u0004\u0012\u0002060\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010.\"\u0004\b]\u00100R\u001a\u0010^\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010Q\"\u0004\b`\u0010SR(\u0010a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010b0C0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010.\"\u0004\bd\u00100R \u0010e\u001a\b\u0012\u0004\u0012\u00020\u000b0CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010j\u001a\u000206X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010Q\"\u0004\bl\u0010SR \u0010m\u001a\b\u0012\u0004\u0012\u00020n0CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010g\"\u0004\bp\u0010iR \u0010q\u001a\b\u0012\u0004\u0012\u00020\"0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010.\"\u0004\bs\u00100R\u001a\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010u\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010v0v0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010.R \u0010x\u001a\b\u0012\u0004\u0012\u00020\"0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010.\"\u0004\bz\u00100R \u0010{\u001a\b\u0012\u0004\u0012\u00020\"0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010.\"\u0004\b}\u00100R!\u0010~\u001a\b\u0012\u0004\u0012\u00020\"0\u001aX\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010.\"\u0005\b\u0080\u0001\u00100R\u0019\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u001d8F\u00a2\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010 \u00a8\u0006\u00ad\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/OrdersTabViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "homePageUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;", "managePatientUseCase", "Lcom/intellihealth/truemeds/domain/usecase/ManagePatientUseCase;", "reorderUseCase", "Lcom/intellihealth/truemeds/domain/usecase/ReorderUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;Lcom/intellihealth/truemeds/domain/usecase/ManagePatientUseCase;Lcom/intellihealth/truemeds/domain/usecase/ReorderUseCase;)V", "apiType", "", "getApiType", "()I", "setApiType", "(I)V", "billDetails", "Lcom/intellihealth/salt/models/BillDetailsModel;", "getBillDetails", "()Lcom/intellihealth/salt/models/BillDetailsModel;", "setBillDetails", "(Lcom/intellihealth/salt/models/BillDetailsModel;)V", "customerOrderPageCount", "getCustomerOrderPageCount", "setCustomerOrderPageCount", "errorType", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/truemeds/data/utils/ERRORS;", "eventShowError", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "getEventShowError", "()Landroidx/lifecycle/LiveData;", "hasMoreData", "", "getHasMoreData", "()Z", "setHasMoreData", "(Z)V", "isBottomSheetClickable", "setBottomSheetClickable", "isClearPreviousList", "setClearPreviousList", "isLoading", "isLoggedIn", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "setLoggedIn", "(Landroidx/lifecycle/MutableLiveData;)V", "isPatientListAllselected", "setPatientListAllselected", "isSentAllPatientIdToApi", "setSentAllPatientIdToApi", "listType", "", "getListType", "setListType", "maxPageCount", "getMaxPageCount", "setMaxPageCount", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "myOrdersList", "", "Lcom/intellihealth/truemeds/data/model/home/AllCustomersOrdersResponseModel$ResponseData$Orders;", "getMyOrdersList", "orderListCurrentItemClickedPos", "getOrderListCurrentItemClickedPos", "setOrderListCurrentItemClickedPos", "orderTypeActualSelectedPos", "getOrderTypeActualSelectedPos", "setOrderTypeActualSelectedPos", "orderTypePreviousPos", "getOrderTypePreviousPos", "setOrderTypePreviousPos", "orderTypeValue", "getOrderTypeValue", "()Ljava/lang/String;", "setOrderTypeValue", "(Ljava/lang/String;)V", "orderTypeValueDisplay", "getOrderTypeValueDisplay", "setOrderTypeValueDisplay", "ordersBottomSheetListTemp", "Lcom/intellihealth/truemeds/data/model/orderflow/OrderTypeResponse$OrderType;", "getOrdersBottomSheetListTemp", "setOrdersBottomSheetListTemp", "patientTypePullRefreshValue", "getPatientTypePullRefreshValue", "setPatientTypePullRefreshValue", "patientTypeValue", "getPatientTypeValue", "setPatientTypeValue", "patientsBottomSheetListTemp", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "getPatientsBottomSheetListTemp", "setPatientsBottomSheetListTemp", "patientsSelectedListTemp", "getPatientsSelectedListTemp", "()Ljava/util/List;", "setPatientsSelectedListTemp", "(Ljava/util/List;)V", "selectedOrderIdsSentToApi", "getSelectedOrderIdsSentToApi", "setSelectedOrderIdsSentToApi", "selectedPatientListSentToApi", "", "getSelectedPatientListSentToApi", "setSelectedPatientListSentToApi", "showDropDownPatient", "getShowDropDownPatient", "setShowDropDownPatient", "showError", "showMessage", "Lcom/intellihealth/truemeds/data/utils/OrderFragmentData;", "getShowMessage", "showMyOrdersListView", "getShowMyOrdersListView", "setShowMyOrdersListView", "showNoOrdersView", "getShowNoOrdersView", "setShowNoOrdersView", "showShimmer", "getShowShimmer", "setShowShimmer", "showShimmerLiveData", "getShowShimmerLiveData", "bottomSheetApplyClick", "", "view", "Landroid/view/View;", "bottomSheetClearClick", "getOrdersListingData", "context", "Landroid/content/Context;", "getPatientDetails", "isConsiderExistingPatientListSelected", "getReorder", "Lkotlinx/coroutines/Job;", "orderId", "customerId", "patientListDto", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "variant", "checkAutoConfirmEligibility", "newAlgo", "serialId", "reOrderMedCheck", "variantId", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZLjava/lang/Integer;ZLjava/lang/Long;)Lkotlinx/coroutines/Job;", "initViewModelData", "mContext", "onCleared", "orderListClick", "orderListItemButtonClick", "position", "orderListItemClick", "orderListItemMoreClick", "patientListClick", "reOrder", "Lcom/intellihealth/truemeds/data/model/orderflow/ReorderStatusData;", "searchForMedicinesButtonClick", "setCheckboxPatientClicked", "setHasLoadMore", "size", "setListData", "setRadioOrderClicked", "settingAllLogic", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class OrdersTabViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase managePatientUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.ReorderUseCase reorderUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.utils.ERRORS> errorType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoggedIn;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> showError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders>> myOrdersList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showNoOrdersView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showMyOrdersListView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showDropDownPatient;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmer;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> listType;
    private int orderTypePreviousPos = 0;
    private int orderTypeActualSelectedPos = 0;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse.OrderType>> ordersBottomSheetListTemp;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> patientsBottomSheetListTemp;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Integer> patientsSelectedListTemp;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String orderTypeValue = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String orderTypeValueDisplay = "All Orders";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String patientTypeValue = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientTypePullRefreshValue;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.utils.OrderFragmentData> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedOrderIdsSentToApi = "0";
    private int maxPageCount = 1;
    private int orderListCurrentItemClickedPos = -1;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.Long> selectedPatientListSentToApi;
    private int customerOrderPageCount = 1;
    private int apiType = 0;
    private boolean hasMoreData = true;
    private boolean isClearPreviousList = true;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.salt.models.BillDetailsModel billDetails;
    private boolean isBottomSheetClickable = true;
    private boolean isPatientListAllselected = true;
    private boolean isSentAllPatientIdToApi = true;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    
    @javax.inject.Inject()
    public OrdersTabViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.ManagePatientUseCase managePatientUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.ReorderUseCase reorderUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoggedIn() {
        return null;
    }
    
    public final void setLoggedIn(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> getEventShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.home.AllCustomersOrdersResponseModel.ResponseData.Orders>> getMyOrdersList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowNoOrdersView() {
        return null;
    }
    
    public final void setShowNoOrdersView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowMyOrdersListView() {
        return null;
    }
    
    public final void setShowMyOrdersListView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowDropDownPatient() {
        return null;
    }
    
    public final void setShowDropDownPatient(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmer() {
        return null;
    }
    
    public final void setShowShimmer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getListType() {
        return null;
    }
    
    public final void setListType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final int getOrderTypePreviousPos() {
        return 0;
    }
    
    public final void setOrderTypePreviousPos(int p0) {
    }
    
    public final int getOrderTypeActualSelectedPos() {
        return 0;
    }
    
    public final void setOrderTypeActualSelectedPos(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse.OrderType>> getOrdersBottomSheetListTemp() {
        return null;
    }
    
    public final void setOrdersBottomSheetListTemp(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderTypeResponse.OrderType>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> getPatientsBottomSheetListTemp() {
        return null;
    }
    
    public final void setPatientsBottomSheetListTemp(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getPatientsSelectedListTemp() {
        return null;
    }
    
    public final void setPatientsSelectedListTemp(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderTypeValue() {
        return null;
    }
    
    public final void setOrderTypeValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderTypeValueDisplay() {
        return null;
    }
    
    public final void setOrderTypeValueDisplay(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPatientTypeValue() {
        return null;
    }
    
    public final void setPatientTypeValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientTypePullRefreshValue() {
        return null;
    }
    
    public final void setPatientTypePullRefreshValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.utils.OrderFragmentData> getShowMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedOrderIdsSentToApi() {
        return null;
    }
    
    public final void setSelectedOrderIdsSentToApi(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getMaxPageCount() {
        return 0;
    }
    
    public final void setMaxPageCount(int p0) {
    }
    
    public final int getOrderListCurrentItemClickedPos() {
        return 0;
    }
    
    public final void setOrderListCurrentItemClickedPos(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getSelectedPatientListSentToApi() {
        return null;
    }
    
    public final void setSelectedPatientListSentToApi(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> p0) {
    }
    
    public final int getCustomerOrderPageCount() {
        return 0;
    }
    
    public final void setCustomerOrderPageCount(int p0) {
    }
    
    public final int getApiType() {
        return 0;
    }
    
    public final void setApiType(int p0) {
    }
    
    public final boolean getHasMoreData() {
        return false;
    }
    
    public final void setHasMoreData(boolean p0) {
    }
    
    public final boolean isClearPreviousList() {
        return false;
    }
    
    public final void setClearPreviousList(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.salt.models.BillDetailsModel getBillDetails() {
        return null;
    }
    
    public final void setBillDetails(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.models.BillDetailsModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final boolean isBottomSheetClickable() {
        return false;
    }
    
    public final void setBottomSheetClickable(boolean p0) {
    }
    
    public final boolean isPatientListAllselected() {
        return false;
    }
    
    public final void setPatientListAllselected(boolean p0) {
    }
    
    public final boolean isSentAllPatientIdToApi() {
        return false;
    }
    
    public final void setSentAllPatientIdToApi(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    public final void searchForMedicinesButtonClick() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.orderflow.ReorderStatusData reOrder() {
        return null;
    }
    
    public final void setRadioOrderClicked(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getReorder(@org.jetbrains.annotations.Nullable()
    java.lang.Long orderId, @org.jetbrains.annotations.Nullable()
    java.lang.String customerId, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Long> patientListDto, @org.jetbrains.annotations.Nullable()
    java.lang.String variant, boolean checkAutoConfirmEligibility, boolean newAlgo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer serialId, boolean reOrderMedCheck, @org.jetbrains.annotations.Nullable()
    java.lang.Long variantId) {
        return null;
    }
    
    public final void setCheckboxPatientClicked(int position) {
    }
    
    public final void settingAllLogic() {
    }
    
    public final void orderListClick() {
    }
    
    public final void patientListClick() {
    }
    
    public final void setListData() {
    }
    
    public final void orderListItemClick(int position) {
    }
    
    public final void orderListItemButtonClick(int position) {
    }
    
    public final void orderListItemMoreClick(int position) {
    }
    
    public final void bottomSheetClearClick() {
    }
    
    public final void bottomSheetApplyClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void getPatientDetails(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean isConsiderExistingPatientListSelected) {
    }
    
    public final void initViewModelData(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
    }
    
    public final void getOrdersListingData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void setHasLoadMore(int size) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}