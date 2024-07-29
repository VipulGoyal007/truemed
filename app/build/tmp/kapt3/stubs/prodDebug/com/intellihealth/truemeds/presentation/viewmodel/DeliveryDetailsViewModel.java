package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001J\b\u0010\u0083\u0001\u001a\u00030\u0081\u0001J\u001c\u0010\u0084\u0001\u001a\u00030\u0081\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\n2\u0007\u0010\u0086\u0001\u001a\u00020\u0010J\u001c\u0010\u0087\u0001\u001a\u00030\u0081\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010M2\u0007\u0010\u0086\u0001\u001a\u00020\u0010J\u001c\u0010\u0089\u0001\u001a\u00030\u0081\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001b2\u0007\u0010\u008b\u0001\u001a\u00020CJ\u0011\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u008e\u0001\u001a\u00020CJ\u0007\u0010O\u001a\u00030\u0081\u0001J\b\u0010\u008f\u0001\u001a\u00030\u0081\u0001J\u001e\u0010\u0090\u0001\u001a\u00030\u0081\u00012\t\b\u0002\u0010\u0091\u0001\u001a\u00020\u00102\t\b\u0002\u0010\u0092\u0001\u001a\u00020\"J\u001c\u0010\u0093\u0001\u001a\u00030\u0081\u00012\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010M2\u0007\u0010\u0086\u0001\u001a\u00020\u0010J\b\u0010\u0094\u0001\u001a\u00030\u0081\u0001J \u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\n0L2\u000f\u0010\u0096\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0002J*\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020M0L2\u0019\u0010\u0096\u0001\u001a\u0014\u0012\u0004\u0012\u00020M0\u0098\u0001j\t\u0012\u0004\u0012\u00020M`\u0099\u0001H\u0002J%\u0010\u009a\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u009b\u0001\u001a\u00020C2\u0007\u0010\u009c\u0001\u001a\u00020\n2\u0007\u0010\u008e\u0001\u001a\u00020\u001bH\u0002J.\u0010\u009d\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u009b\u0001\u001a\u00020C2\u0007\u0010\u009e\u0001\u001a\u00020M2\u0007\u0010\u008e\u0001\u001a\u00020\u001b2\u0007\u0010\u009c\u0001\u001a\u00020\nH\u0002J\u0012\u0010\u009f\u0001\u001a\u00030\u0081\u00012\b\u0010\u00a0\u0001\u001a\u00030\u00a1\u0001J\u0011\u0010\u00a2\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00a3\u0001\u001a\u00020\u001bJ\b\u0010\u00a4\u0001\u001a\u00030\u0081\u0001J\b\u0010\u00a5\u0001\u001a\u00030\u0081\u0001J\n\u0010\u00a6\u0001\u001a\u00030\u0081\u0001H\u0002J\u0013\u0010\u00a7\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00a8\u0001\u001a\u00020\"H\u0002J,\u0010\u00a9\u0001\u001a\u00030\u0081\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001b2\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00ab\u00012\t\b\u0002\u0010\u008b\u0001\u001a\u00020CH\u0002R*\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\u00198F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001dR\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u00198F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001a0\u00198F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001dR \u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010+\u001a\b\u0012\u0004\u0012\u00020\"0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014R\u001a\u0010/\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001a\u00105\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00100\"\u0004\b6\u00102R \u00107\u001a\b\u0012\u0004\u0012\u00020\"0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000eR\u001a\u00109\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\u001a\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010<\u001a\u00020=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR\u0016\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010N\u001a\b\u0012\u0004\u0012\u00020\u001b0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\f\"\u0004\bP\u0010\u000eR*\u0010Q\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010M\u0018\u00010L0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR\u001a\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010U\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010Z\u001a\u0004\u0018\u00010MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010_\u001a\n `*\u0004\u0018\u00010\u001b0\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR \u0010e\u001a\b\u0012\u0004\u0012\u00020\"0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\f\"\u0004\bg\u0010\u000eR \u0010h\u001a\b\u0012\u0004\u0012\u00020\"0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\f\"\u0004\bj\u0010\u000eR \u0010k\u001a\b\u0012\u0004\u0012\u00020\"0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\f\"\u0004\bm\u0010\u000eR\u001a\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001a0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010p\u001a\b\u0012\u0004\u0012\u00020\"0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\f\"\u0004\br\u0010\u000eR \u0010s\u001a\b\u0012\u0004\u0012\u00020\"0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\f\"\u0004\bu\u0010\u000eR\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020\"0\u00198F\u00a2\u0006\u0006\u001a\u0004\bw\u0010\u001dR \u0010x\u001a\b\u0012\u0004\u0012\u00020\"0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010\f\"\u0004\bz\u0010\u000eR\u0017\u0010{\u001a\b\u0012\u0004\u0012\u00020\"0\u00198F\u00a2\u0006\u0006\u001a\u0004\b|\u0010\u001dR \u0010}\u001a\b\u0012\u0004\u0012\u00020\"0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\f\"\u0004\b\u007f\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00ac\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/DeliveryDetailsViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "userUseCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "homePageUseCase", "Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;Lcom/intellihealth/truemeds/domain/usecase/HomePageUseCase;)V", "addressList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "getAddressList", "()Landroidx/lifecycle/MutableLiveData;", "setAddressList", "(Landroidx/lifecycle/MutableLiveData;)V", "currentAddressSelectedPos", "", "getCurrentAddressSelectedPos", "()I", "setCurrentAddressSelectedPos", "(I)V", "currentPatientSelectedPos", "getCurrentPatientSelectedPos", "setCurrentPatientSelectedPos", "eventLaunchAddPatient", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "", "getEventLaunchAddPatient", "()Landroidx/lifecycle/LiveData;", "eventMessage", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventMessage", "eventProceedToCheckout", "", "getEventProceedToCheckout", "eventShowError", "Lcom/intellihealth/truemeds/data/utils/ERRORS;", "getEventShowError", "headerType", "Lcom/intellihealth/salt/models/MobileSectionHeadersModel;", "getHeaderType", "setHeaderType", "isExpanded", "setExpanded", "isExpandedListCaseItemPos", "setExpandedListCaseItemPos", "isExpandedListCaseItemUnchecked", "()Z", "setExpandedListCaseItemUnchecked", "(Z)V", "isFreshUser", "setFreshUser", "isHomeAddressAdded", "setHomeAddressAdded", "isLoadingView", "setLoadingView", "isOfficeAddressAdded", "setOfficeAddressAdded", "launchAddPatient", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "newlyCreatedAddressId", "", "getNewlyCreatedAddressId", "()J", "setNewlyCreatedAddressId", "(J)V", "newlyCreatedPatientId", "getNewlyCreatedPatientId", "setNewlyCreatedPatientId", "originalPatientList", "", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "patientExperiment", "getPatientExperiment", "setPatientExperiment", "patientsList", "getPatientsList", "setPatientsList", "proceedToCheckout", "selectedAddress", "getSelectedAddress", "()Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;", "setSelectedAddress", "(Lcom/intellihealth/truemeds/data/model/user/GetAllAddressResponse$ResponseObj;)V", "selectedPatient", "getSelectedPatient", "()Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "setSelectedPatient", "(Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;)V", "selectedWarehouseID", "kotlin.jvm.PlatformType", "getSelectedWarehouseID", "()Ljava/lang/String;", "setSelectedWarehouseID", "(Ljava/lang/String;)V", "showAddAddressView", "getShowAddAddressView", "setShowAddAddressView", "showAddPatientView", "getShowAddPatientView", "setShowAddPatientView", "showAddressListView", "getShowAddressListView", "setShowAddressListView", "showError", "showMessage", "showPatientListView", "getShowPatientListView", "setShowPatientListView", "showShimmerAddress", "getShowShimmerAddress", "setShowShimmerAddress", "showShimmerAddressLiveData", "getShowShimmerAddressLiveData", "showShimmerPatient", "getShowShimmerPatient", "setShowShimmerPatient", "showShimmerPatientLiveData", "getShowShimmerPatientLiveData", "showViewMoreViewLessPatientList", "getShowViewMoreViewLessPatientList", "setShowViewMoreViewLessPatientList", "addNewAddressButtonClick", "", "addNewPatientsButtonClick", "changeListStatus", "editAddress", "addressPatientDetailsCardModel", "position", "editPatient", "patientDetailsCardModel", "fetchPinCodeOnAddressSelection", "pinCode", "selectedAddressId", "getAddressListData", "Lkotlinx/coroutines/Job;", "customerId", "getPatientExperimentCategory", "getPatientList", "type", "isCallAddress", "patientBoxClicked", "proceedToCheckoutClick", "processAddressList", "list", "processPatientList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "saveAddressForOrder", "orderId", "address", "savePatientForOrder", "patient", "sendAddAddressClickedEvent", "mxAddAddressClicked", "Lcom/intellihealth/truemeds/presentation/analytics/model/mixpanel/MxAddAddressClicked;", "sendAddPatientClickedEvent", "clickedPage", "sendAddressChangedEvent", "sendDeliveryDetailViewedEvent", "sendPatientChangedToMixPanel", "updateListOnUI", "expanded", "updateSelectedAddressCard", "response", "Lcom/intellihealth/truemeds/data/model/home/PinCodeServiceabilityResponse;", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DeliveryDetailsViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.UserDataUseCase userUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isExpanded;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> headerType;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> originalPatientList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> patientsList;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> showError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> proceedToCheckout = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmerPatient;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showAddPatientView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showPatientListView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> addressList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showShimmerAddress;
    private int currentPatientSelectedPos = -1;
    private int currentAddressSelectedPos = -1;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showAddAddressView;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showAddressListView;
    private boolean isExpandedListCaseItemUnchecked = false;
    private int isExpandedListCaseItemPos = -1;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient selectedPatient;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj selectedAddress;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientExperiment;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> launchAddPatient = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showViewMoreViewLessPatientList;
    private boolean isHomeAddressAdded = false;
    private boolean isOfficeAddressAdded = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingView;
    private long newlyCreatedAddressId = -1L;
    private long newlyCreatedPatientId = -1L;
    private boolean isFreshUser = false;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    private java.lang.String selectedWarehouseID;
    
    @javax.inject.Inject()
    public DeliveryDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase userUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.HomePageUseCase homePageUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isExpanded() {
        return null;
    }
    
    public final void setExpanded(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> getHeaderType() {
        return null;
    }
    
    public final void setHeaderType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> getPatientsList() {
        return null;
    }
    
    public final void setPatientsList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> getEventShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getEventProceedToCheckout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmerPatient() {
        return null;
    }
    
    public final void setShowShimmerPatient(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerPatientLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowAddPatientView() {
        return null;
    }
    
    public final void setShowAddPatientView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowPatientListView() {
        return null;
    }
    
    public final void setShowPatientListView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> getAddressList() {
        return null;
    }
    
    public final void setAddressList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowShimmerAddress() {
        return null;
    }
    
    public final void setShowShimmerAddress(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowShimmerAddressLiveData() {
        return null;
    }
    
    public final int getCurrentPatientSelectedPos() {
        return 0;
    }
    
    public final void setCurrentPatientSelectedPos(int p0) {
    }
    
    public final int getCurrentAddressSelectedPos() {
        return 0;
    }
    
    public final void setCurrentAddressSelectedPos(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowAddAddressView() {
        return null;
    }
    
    public final void setShowAddAddressView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowAddressListView() {
        return null;
    }
    
    public final void setShowAddressListView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final boolean isExpandedListCaseItemUnchecked() {
        return false;
    }
    
    public final void setExpandedListCaseItemUnchecked(boolean p0) {
    }
    
    public final int isExpandedListCaseItemPos() {
        return 0;
    }
    
    public final void setExpandedListCaseItemPos(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient getSelectedPatient() {
        return null;
    }
    
    public final void setSelectedPatient(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj getSelectedAddress() {
        return null;
    }
    
    public final void setSelectedAddress(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientExperiment() {
        return null;
    }
    
    public final void setPatientExperiment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.String>> getEventLaunchAddPatient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowViewMoreViewLessPatientList() {
        return null;
    }
    
    public final void setShowViewMoreViewLessPatientList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final boolean isHomeAddressAdded() {
        return false;
    }
    
    public final void setHomeAddressAdded(boolean p0) {
    }
    
    public final boolean isOfficeAddressAdded() {
        return false;
    }
    
    public final void setOfficeAddressAdded(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadingView() {
        return null;
    }
    
    public final void setLoadingView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final long getNewlyCreatedAddressId() {
        return 0L;
    }
    
    public final void setNewlyCreatedAddressId(long p0) {
    }
    
    public final long getNewlyCreatedPatientId() {
        return 0L;
    }
    
    public final void setNewlyCreatedPatientId(long p0) {
    }
    
    public final boolean isFreshUser() {
        return false;
    }
    
    public final void setFreshUser(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    public final java.lang.String getSelectedWarehouseID() {
        return null;
    }
    
    public final void setSelectedWarehouseID(java.lang.String p0) {
    }
    
    public final void getPatientList(int type, boolean isCallAddress) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAddressListData(long customerId) {
        return null;
    }
    
    private final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> processAddressList(java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> list) {
        return null;
    }
    
    private final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> processPatientList(java.util.ArrayList<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> list) {
        return null;
    }
    
    public final void addNewPatientsButtonClick() {
    }
    
    public final void addNewAddressButtonClick() {
    }
    
    public final void proceedToCheckoutClick() {
    }
    
    public final void changeListStatus() {
    }
    
    private final void updateListOnUI(boolean expanded) {
    }
    
    public final void patientBoxClicked(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient patientDetailsCardModel, int position) {
    }
    
    private final void sendPatientChangedToMixPanel() {
    }
    
    public final void editAddress(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj addressPatientDetailsCardModel, int position) {
    }
    
    public final void editPatient(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient patientDetailsCardModel, int position) {
    }
    
    private final void savePatientForOrder(long orderId, com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient patient, java.lang.String customerId, com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj address) {
    }
    
    private final void saveAddressForOrder(long orderId, com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj address, java.lang.String customerId) {
    }
    
    public final void getPatientExperimentCategory() {
    }
    
    public final void getPatientExperiment() {
    }
    
    public final void fetchPinCodeOnAddressSelection(@org.jetbrains.annotations.Nullable()
    java.lang.String pinCode, long selectedAddressId) {
    }
    
    private final void updateSelectedAddressCard(java.lang.String pinCode, com.intellihealth.truemeds.data.model.home.PinCodeServiceabilityResponse response, long selectedAddressId) {
    }
    
    public final void sendAddAddressClickedEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.analytics.model.mixpanel.MxAddAddressClicked mxAddAddressClicked) {
    }
    
    public final void sendAddressChangedEvent() {
    }
    
    public final void sendAddPatientClickedEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String clickedPage) {
    }
    
    public final void sendDeliveryDetailViewedEvent() {
    }
}