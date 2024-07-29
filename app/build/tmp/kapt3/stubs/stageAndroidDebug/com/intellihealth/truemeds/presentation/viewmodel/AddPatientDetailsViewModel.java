package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\nJ\u0006\u0010<\u001a\u000208J\u000e\u00100\u001a\u0002082\u0006\u0010=\u001a\u00020\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR(\u0010!\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u001a0\u001a0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b\'\u0010\u000eR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR \u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR \u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eR\u001a\u00101\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u0006>"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/AddPatientDetailsViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "dataUseCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "(Landroid/content/Context;Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;)V", "age", "Landroidx/lifecycle/MutableLiveData;", "", "getAge", "()Landroidx/lifecycle/MutableLiveData;", "setAge", "(Landroidx/lifecycle/MutableLiveData;)V", "ageData", "Lcom/intellihealth/truemeds/data/model/errormessage/ErrorMessageData;", "getAgeData", "setAgeData", "firstName", "getFirstName", "setFirstName", "firstNameData", "getFirstNameData", "setFirstNameData", "gender", "", "getGender", "setGender", "headerType", "Lcom/intellihealth/salt/models/MobileSectionHeadersModel;", "getHeaderType", "setHeaderType", "hideKeyboard", "kotlin.jvm.PlatformType", "getHideKeyboard", "setHideKeyboard", "lastName", "getLastName", "setLastName", "lastNameData", "getLastNameData", "setLastNameData", "patientExperiment", "getPatientExperiment", "setPatientExperiment", "radioType", "getRadioType", "setRadioType", "validator", "Lcom/intellihealth/truemeds/presentation/utils/Validator;", "getValidator", "()Lcom/intellihealth/truemeds/presentation/utils/Validator;", "setValidator", "(Lcom/intellihealth/truemeds/presentation/utils/Validator;)V", "addPatient", "", "checkNameExist", "", "namString", "onSaveButtonClicked", "type", "app_stageAndroidDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AddPatientDetailsViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.UserDataUseCase dataUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> firstName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientExperiment;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> lastName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> age;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> gender;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> radioType;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.utils.Validator validator;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> firstNameData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> lastNameData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ageData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> headerType;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideKeyboard;
    
    @javax.inject.Inject()
    public AddPatientDetailsViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase dataUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientExperiment() {
        return null;
    }
    
    public final void setPatientExperiment(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAge() {
        return null;
    }
    
    public final void setAge(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRadioType() {
        return null;
    }
    
    public final void setRadioType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.utils.Validator getValidator() {
        return null;
    }
    
    public final void setValidator(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.utils.Validator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getFirstNameData() {
        return null;
    }
    
    public final void setFirstNameData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getLastNameData() {
        return null;
    }
    
    public final void setLastNameData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getAgeData() {
        return null;
    }
    
    public final void setAgeData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> getHeaderType() {
        return null;
    }
    
    public final void setHeaderType(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideKeyboard() {
        return null;
    }
    
    public final void setHideKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void onSaveButtonClicked() {
    }
    
    public final void setRadioType(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void addPatient() {
    }
    
    public final int checkNameExist(@org.jetbrains.annotations.NotNull()
    java.lang.String namString) {
        return 0;
    }
}