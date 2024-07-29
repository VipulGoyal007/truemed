package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\'\u001a\u00020(J\u000e\u0010$\u001a\u00020(2\u0006\u0010)\u001a\u00020\"R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\"\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/AddPatientViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "userDataUseCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "(Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;)V", "errorType", "Landroidx/lifecycle/MutableLiveData;", "Lcom/intellihealth/truemeds/data/utils/ERRORS;", "eventMessage", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventMessage", "()Landroidx/lifecycle/LiveData;", "eventShowError", "getEventShowError", "patientListResponse", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse;", "getPatientListResponse", "()Landroidx/lifecycle/MutableLiveData;", "setPatientListResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "patientsList", "", "Lcom/intellihealth/salt/models/AddressPatientDetailsCardModel;", "getPatientsList", "patientsListApiResponse", "Lcom/intellihealth/truemeds/data/model/user/GetAllPatientResponse$Patient;", "getPatientsListApiResponse", "()Ljava/util/List;", "setPatientsListApiResponse", "(Ljava/util/List;)V", "radioType", "", "getRadioType", "setRadioType", "showError", "showMessage", "saveButtonClick", "", "type", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AddPatientViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.utils.ERRORS> errorType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse> patientListResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> showError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.AddressPatientDetailsCardModel>> patientsList = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> patientsListApiResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> radioType;
    
    @javax.inject.Inject()
    public AddPatientViewModel(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase userDataUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse> getPatientListResponse() {
        return null;
    }
    
    public final void setPatientListResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.ERRORS>> getEventShowError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.AddressPatientDetailsCardModel>> getPatientsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> getPatientsListApiResponse() {
        return null;
    }
    
    public final void setPatientsListApiResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> getEventMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRadioType() {
        return null;
    }
    
    public final void setRadioType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void saveButtonClick() {
    }
    
    public final void setRadioType(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
}