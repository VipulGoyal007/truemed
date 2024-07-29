package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0006\u0010]\u001a\u00020^J\u0013\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020\u0015J\u0010\u0010*\u001a\u00030\u008d\u00012\u0007\u0010\u0091\u0001\u001a\u00020+J\u0011\u0010\u0092\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0091\u0001\u001a\u00020+J\u001a\u0010.\u001a\u00030\u008d\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\fJ\u0013\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u00012\u0007\u0010\u0098\u0001\u001a\u00020+J\u0011\u0010\u0099\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u009a\u0001\u001a\u00020\fJ\b\u0010\u009b\u0001\u001a\u00030\u008d\u0001J\u0007\u0010l\u001a\u00030\u008d\u0001J\b\u0010\u009c\u0001\u001a\u00030\u008d\u0001J\u0007\u0010\u009d\u0001\u001a\u00020^J\b\u0010\u009e\u0001\u001a\u00030\u008d\u0001J\b\u0010\u009f\u0001\u001a\u00030\u008d\u0001J\b\u0010\u00a0\u0001\u001a\u00030\u008d\u0001J\u0010\u0010\u00a1\u0001\u001a\u00030\u008d\u00012\u0006\u0010]\u001a\u00020^J\b\u0010\u00a2\u0001\u001a\u00030\u008d\u0001J\b\u0010\u00a3\u0001\u001a\u00030\u008d\u0001J\u0007\u0010f\u001a\u00030\u008d\u0001J\b\u0010\u00a4\u0001\u001a\u00030\u008d\u0001R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R(\u0010\u0014\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00150\u00150\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0)0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0)0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000eR\u001a\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0)0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010%\"\u0004\b2\u0010\'R\u001a\u00103\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u00108\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010\u0010R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020+0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u000eR \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u000e\"\u0004\b?\u0010\u0010R \u0010@\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u000e\"\u0004\bB\u0010\u0010R \u0010C\u001a\b\u0012\u0004\u0012\u00020+0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u000e\"\u0004\bE\u0010\u0010R\u001d\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0)0G8F\u00a2\u0006\u0006\u001a\u0004\bH\u0010IR\u001d\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0)0G8F\u00a2\u0006\u0006\u001a\u0004\bK\u0010IR\u001d\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0)0G8F\u00a2\u0006\u0006\u001a\u0004\bM\u0010IR\u001d\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0)0G8F\u00a2\u0006\u0006\u001a\u0004\bP\u0010IR\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\t0G8F\u00a2\u0006\u0006\u001a\u0004\bR\u0010IR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\t0G8F\u00a2\u0006\u0006\u001a\u0004\bS\u0010IR \u0010T\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u000e\"\u0004\bV\u0010\u0010R\u001a\u0010W\u001a\u00020XX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020^X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR \u0010c\u001a\b\u0012\u0004\u0012\u00020d0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u000e\"\u0004\bf\u0010\u0010R&\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\u001c0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u000e\"\u0004\bj\u0010\u0010R,\u0010k\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\u001c0)0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u000e\"\u0004\bm\u0010\u0010R\u001a\u0010n\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010%\"\u0004\bp\u0010\'R\u001a\u0010q\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR&\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0\u001c0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u000e\"\u0004\by\u0010\u0010R\u0017\u0010z\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010\u000eR&\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0\u001c0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\u000e\"\u0004\b\u007f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\u000e\"\u0005\b\u0082\u0001\u0010\u0010R\u0016\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0085\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0)0\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u000eR#\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u000e\"\u0005\b\u0089\u0001\u0010\u0010R\u0019\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u000e\u00a8\u0006\u00a5\u0001"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/ReminderViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "reminderUseCase", "Lcom/intellihealth/truemeds/domain/usecase/ReminderUseCase;", "context", "Landroid/content/Context;", "(Lcom/intellihealth/truemeds/domain/usecase/ReminderUseCase;Landroid/content/Context;)V", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "addPatientId", "", "getAddPatientId", "()Landroidx/lifecycle/MutableLiveData;", "setAddPatientId", "(Landroidx/lifecycle/MutableLiveData;)V", "addReminderFromOrderStatusActivity", "getAddReminderFromOrderStatusActivity", "setAddReminderFromOrderStatusActivity", "addReminderTitle", "", "getAddReminderTitle", "setAddReminderTitle", "alertReminderNameValue", "getAlertReminderNameValue", "setAlertReminderNameValue", "chipData", "", "Lcom/intellihealth/truemeds/data/model/ChipSelectionModel;", "chipsAdapterPosition", "getChipsAdapterPosition", "setChipsAdapterPosition", "closeAddReminder", "getCloseAddReminder", "currentPage", "getCurrentPage", "()Ljava/lang/String;", "setCurrentPage", "(Ljava/lang/String;)V", "defaultNameDropDown", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "deleteReminder", "", "deleteReminderForOrderStatus", "getDeleteReminderForOrderStatus", "editReminder", "", "editReminderDateValue", "getEditReminderDateValue", "setEditReminderDateValue", "editReminderDateValueInMs", "getEditReminderDateValueInMs", "()J", "setEditReminderDateValueInMs", "(J)V", "editReminderFrequency", "getEditReminderFrequency", "setEditReminderFrequency", "editReminderId", "getEditReminderId", "editReminderNameValue", "getEditReminderNameValue", "setEditReminderNameValue", "editReminderOrderId", "getEditReminderOrderId", "setEditReminderOrderId", "editReminderPatientId", "getEditReminderPatientId", "setEditReminderPatientId", "eventDefaultNameDropDown", "Landroidx/lifecycle/LiveData;", "getEventDefaultNameDropDown", "()Landroidx/lifecycle/LiveData;", "eventDeleteReminder", "getEventDeleteReminder", "eventEditReminder", "getEventEditReminder", "eventMessage", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventMessage", "eventSpecialShatabdiToDismissPopup", "getEventSpecialShatabdiToDismissPopup", "isLoading", "listPositionForDelete", "getListPositionForDelete", "setListPositionForDelete", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "mxReminderSuccessfullySet", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderSuccessfullySet;", "getMxReminderSuccessfullySet", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderSuccessfullySet;", "setMxReminderSuccessfullySet", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxReminderSuccessfullySet;)V", "orderProcess", "Lcom/intellihealth/salt/models/OrderStatusCardModel;", "getOrderProcess", "setOrderProcess", "patientName", "Lcom/intellihealth/salt/models/DropDownDefaultModel;", "getPatientName", "setPatientName", "patientNameList", "getPatientNameList", "setPatientNameList", "previousReminderDateValue", "getPreviousReminderDateValue", "setPreviousReminderDateValue", "previousReminderFrequency", "getPreviousReminderFrequency", "()I", "setPreviousReminderFrequency", "(I)V", "reminderAdapterList", "Lcom/intellihealth/truemeds/data/model/reminder/ReminderListModel$ReminderList;", "getReminderAdapterList", "setReminderAdapterList", "reminderFrequency", "getReminderFrequency", "reminderFrequencyListData", "Lcom/intellihealth/truemeds/data/model/reminder/FrequencyListModel$FrequencyList;", "getReminderFrequencyListData", "setReminderFrequencyListData", "reminderdate", "getReminderdate", "setReminderdate", "requestModel", "Lcom/intellihealth/truemeds/data/model/orderreminder/ReminderRequestModel;", "showMessage", "getShowMessage", "showReminderPatientList", "getShowReminderPatientList", "setShowReminderPatientList", "specialShatabdiToDismissPopup", "getSpecialShatabdiToDismissPopup", "addReminder", "", "convertStringToDate", "Ljava/util/Date;", "date", "id", "deleteSetReminder", "addressPatientDetailsCardModel", "Lcom/intellihealth/salt/models/AddressPatientDetailsCardModel;", "position", "getCalendarData", "Ljava/util/Calendar;", "millis", "getFrequencyItem", "frequency", "getFrequencyList", "getReminderList", "mxReminderSuccessfullySetData", "sendReminderBottomSheetViewedEvent", "sendReminderDeletedEvent", "sendReminderEditClickedEvent", "sendReminderSuccessfullySetEvent", "sendReminderUpdatedClickedEvent", "setChipsData", "setReminder", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ReminderViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.ReminderUseCase reminderUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.ReminderListModel.ReminderList>> reminderAdapterList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showReminderPatientList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.DropDownDefaultModel>> patientName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.util.List<com.intellihealth.salt.models.DropDownDefaultModel>>> patientNameList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList>> reminderFrequencyListData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderStatusCardModel> orderProcess;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Long>> deleteReminder = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> specialShatabdiToDismissPopup = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> deleteReminderForOrderStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> closeAddReminder = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> editReminder = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> defaultNameDropDown = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.orderreminder.ReminderRequestModel> requestModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> editReminderId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> reminderFrequency = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> reminderdate;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> chipsAdapterPosition;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> listPositionForDelete;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String editReminderDateValue = "";
    private long editReminderDateValueInMs = 0L;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> editReminderNameValue;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> alertReminderNameValue;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> editReminderFrequency;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Long> editReminderPatientId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> editReminderOrderId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> addPatientId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> addReminderFromOrderStatusActivity;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> addReminderTitle;
    private int previousReminderFrequency = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String previousReminderDateValue = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.ChipSelectionModel>> chipData;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentPage = "";
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet;
    
    @javax.inject.Inject()
    public ReminderViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.ReminderUseCase reminderUseCase, @dagger.hilt.android.qualifiers.ApplicationContext()
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.ReminderListModel.ReminderList>> getReminderAdapterList() {
        return null;
    }
    
    public final void setReminderAdapterList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.ReminderListModel.ReminderList>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowReminderPatientList() {
        return null;
    }
    
    public final void setShowReminderPatientList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.DropDownDefaultModel>> getPatientName() {
        return null;
    }
    
    public final void setPatientName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.DropDownDefaultModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.util.List<com.intellihealth.salt.models.DropDownDefaultModel>>> getPatientNameList() {
        return null;
    }
    
    public final void setPatientNameList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.util.List<com.intellihealth.salt.models.DropDownDefaultModel>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList>> getReminderFrequencyListData() {
        return null;
    }
    
    public final void setReminderFrequencyListData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.reminder.FrequencyListModel.FrequencyList>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderStatusCardModel> getOrderProcess() {
        return null;
    }
    
    public final void setOrderProcess(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.OrderStatusCardModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getShowMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSpecialShatabdiToDismissPopup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDeleteReminderForOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCloseAddReminder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventSpecialShatabdiToDismissPopup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Long>> getEventDeleteReminder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getEventDefaultNameDropDown() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getEditReminderId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Object>> getEventEditReminder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getReminderFrequency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getReminderdate() {
        return null;
    }
    
    public final void setReminderdate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getChipsAdapterPosition() {
        return null;
    }
    
    public final void setChipsAdapterPosition(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getListPositionForDelete() {
        return null;
    }
    
    public final void setListPositionForDelete(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEditReminderDateValue() {
        return null;
    }
    
    public final void setEditReminderDateValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getEditReminderDateValueInMs() {
        return 0L;
    }
    
    public final void setEditReminderDateValueInMs(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEditReminderNameValue() {
        return null;
    }
    
    public final void setEditReminderNameValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAlertReminderNameValue() {
        return null;
    }
    
    public final void setAlertReminderNameValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getEditReminderFrequency() {
        return null;
    }
    
    public final void setEditReminderFrequency(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getEditReminderPatientId() {
        return null;
    }
    
    public final void setEditReminderPatientId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getEditReminderOrderId() {
        return null;
    }
    
    public final void setEditReminderOrderId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getAddPatientId() {
        return null;
    }
    
    public final void setAddPatientId(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAddReminderFromOrderStatusActivity() {
        return null;
    }
    
    public final void setAddReminderFromOrderStatusActivity(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAddReminderTitle() {
        return null;
    }
    
    public final void setAddReminderTitle(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final int getPreviousReminderFrequency() {
        return 0;
    }
    
    public final void setPreviousReminderFrequency(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPreviousReminderDateValue() {
        return null;
    }
    
    public final void setPreviousReminderDateValue(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentPage() {
        return null;
    }
    
    public final void setCurrentPage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet getMxReminderSuccessfullySet() {
        return null;
    }
    
    public final void setMxReminderSuccessfullySet(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet p0) {
    }
    
    public final void getReminderList() {
    }
    
    public final void setReminder() {
    }
    
    public final void addReminder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet) {
    }
    
    public final void getPatientNameList() {
    }
    
    public final void getFrequencyList() {
    }
    
    public final void setOrderProcess() {
    }
    
    public final void deleteReminder(long id) {
    }
    
    public final void editReminder(@org.jetbrains.annotations.NotNull()
    com.intellihealth.salt.models.AddressPatientDetailsCardModel addressPatientDetailsCardModel, int position) {
    }
    
    public final void deleteSetReminder(long id) {
    }
    
    public final void getFrequencyItem(int frequency) {
    }
    
    public final void setChipsData() {
    }
    
    public final void sendReminderBottomSheetViewedEvent() {
    }
    
    public final void sendReminderSuccessfullySetEvent(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySet) {
    }
    
    public final void sendReminderEditClickedEvent() {
    }
    
    public final void sendReminderUpdatedClickedEvent() {
    }
    
    public final void sendReminderDeletedEvent() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date convertStringToDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Calendar getCalendarData(long millis) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxReminderSuccessfullySet mxReminderSuccessfullySetData() {
        return null;
    }
}