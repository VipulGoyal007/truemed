package com.intellihealth.truemeds.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010h\u001a\u00020iJ\u0006\u0010j\u001a\u00020iJ\u0006\u0010k\u001a\u00020iJ\u0012\u00109\u001a\u00020\u00182\b\u0010l\u001a\u0004\u0018\u00010\u000eH\u0002J\u000e\u0010m\u001a\u00020i2\u0006\u0010n\u001a\u00020oJ\u0006\u0010p\u001a\u00020iR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0010\"\u0004\b(\u0010\u0012R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0*8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000+0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012R \u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0010\"\u0004\b9\u0010\u0012R\u001a\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000+0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000+0*8F\u00a2\u0006\u0006\u001a\u0004\b;\u0010.R \u0010<\u001a\b\u0012\u0004\u0012\u00020=0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012R\u001a\u0010@\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR \u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0010\"\u0004\bF\u0010\u0012R \u0010G\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0010\"\u0004\bI\u0010\u0012R\u001a\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0+0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0+0*8F\u00a2\u0006\u0006\u001a\u0004\bL\u0010.R\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000+0*8F\u00a2\u0006\u0006\u001a\u0004\bN\u0010.R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010O\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0010\"\u0004\bQ\u0010\u0012R\u001a\u0010R\u001a\u00020SX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR \u0010X\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0010\"\u0004\bZ\u0010\u0012R\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00180\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u0010R \u0010]\u001a\b\u0012\u0004\u0012\u0002000\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0010\"\u0004\b_\u0010\u0012R\u001d\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0\r\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0010R\u001a\u0010b\u001a\u00020cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g\u00a8\u0006q"}, d2 = {"Lcom/intellihealth/truemeds/presentation/viewmodel/EditProfileDetailViewModel;", "Lcom/intellihealth/truemeds/presentation/viewmodel/BaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "dataUseCase", "Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;", "mixPanelEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/MixPanelEventUseCase;", "cleverTapEventUseCase", "Lcom/intellihealth/truemeds/domain/usecase/analytics/CleverTapEventUseCase;", "(Landroid/content/Context;Lcom/intellihealth/truemeds/domain/usecase/UserDataUseCase;Lcom/intellihealth/truemeds/domain/usecase/analytics/MixPanelEventUseCase;Lcom/intellihealth/truemeds/domain/usecase/analytics/CleverTapEventUseCase;)V", "age", "Landroidx/lifecycle/MutableLiveData;", "", "getAge", "()Landroidx/lifecycle/MutableLiveData;", "setAge", "(Landroidx/lifecycle/MutableLiveData;)V", "ageData", "Lcom/intellihealth/truemeds/data/model/errormessage/ErrorMessageData;", "getAgeData", "setAgeData", "apiType", "", "getApiType", "()I", "setApiType", "(I)V", "customerProfileDetails", "Lcom/intellihealth/truemeds/data/model/user/CustomerDetailsResponse$CustomerInfo;", "getCustomerProfileDetails", "()Lcom/intellihealth/truemeds/data/model/user/CustomerDetailsResponse$CustomerInfo;", "setCustomerProfileDetails", "(Lcom/intellihealth/truemeds/data/model/user/CustomerDetailsResponse$CustomerInfo;)V", "email", "getEmail", "setEmail", "emailData", "getEmailData", "setEmailData", "eventMessage", "Landroidx/lifecycle/LiveData;", "Lcom/intellihealth/truemeds/presentation/viewmodel/events/Event;", "Lcom/intellihealth/truemeds/data/utils/MESSAGES;", "getEventMessage", "()Landroidx/lifecycle/LiveData;", "finishActivityEvent", "", "firstName", "getFirstName", "setFirstName", "firstNameData", "getFirstNameData", "setFirstNameData", "gender", "getGender", "setGender", "getGenderEvent", "getGetGenderEvent", "headerType", "Lcom/intellihealth/salt/models/MobileSectionHeadersModel;", "getHeaderType", "setHeaderType", "isEditProfileClick", "()Z", "setEditProfileClick", "(Z)V", "lastName", "getLastName", "setLastName", "lastNameData", "getLastNameData", "setLastNameData", "loadCustomerDetails", "loadCustomerDetailsEvent", "getLoadCustomerDetailsEvent", "loginFinishActivityEvent", "getLoginFinishActivityEvent", "mobileNo", "getMobileNo", "setMobileNo", "mxInternalErrorOccurred", "Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "getMxInternalErrorOccurred", "()Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;", "setMxInternalErrorOccurred", "(Lcom/intellihealth/truemeds/data/model/mixpanel/MxInternalErrorOccurred;)V", "patientExperimentEditProfile", "getPatientExperimentEditProfile", "setPatientExperimentEditProfile", "requestFocus", "getRequestFocus", "showGenderError", "getShowGenderError", "setShowGenderError", "showMessage", "getShowMessage", "validator", "Lcom/intellihealth/truemeds/presentation/utils/Validator;", "getValidator", "()Lcom/intellihealth/truemeds/presentation/utils/Validator;", "setValidator", "(Lcom/intellihealth/truemeds/presentation/utils/Validator;)V", "getCustomerDetailsApi", "", "getPatientExperimentCategory", "onSaveButtonClicked", "value", "updateCustomerDetailsToDb", "response", "Lcom/intellihealth/truemeds/data/model/user/UpdateProfileResponse;", "updateProfile", "app_prodDebug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class EditProfileDetailViewModel extends com.intellihealth.truemeds.presentation.viewmodel.BaseViewModel implements androidx.lifecycle.DefaultLifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.UserDataUseCase dataUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.MixPanelEventUseCase mixPanelEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.intellihealth.truemeds.domain.usecase.analytics.CleverTapEventUseCase cleverTapEventUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> firstName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> lastName;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> email;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> age;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> mobileNo;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> gender;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.presentation.utils.Validator validator;
    private boolean isEditProfileClick = false;
    @org.jetbrains.annotations.Nullable()
    private com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse.CustomerInfo customerProfileDetails;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showGenderError;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> finishActivityEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse.CustomerInfo>> loadCustomerDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getGender = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> firstNameData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> lastNameData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> emailData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ageData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> headerType;
    private int apiType = 0;
    @org.jetbrains.annotations.NotNull()
    private com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred mxInternalErrorOccurred;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.utils.MESSAGES>> showMessage = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> patientExperimentEditProfile;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> requestFocus = null;
    
    @javax.inject.Inject()
    public EditProfileDetailViewModel(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.UserDataUseCase dataUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.MixPanelEventUseCase mixPanelEventUseCase, @org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.domain.usecase.analytics.CleverTapEventUseCase cleverTapEventUseCase) {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMobileNo() {
        return null;
    }
    
    public final void setMobileNo(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.presentation.utils.Validator getValidator() {
        return null;
    }
    
    public final void setValidator(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.presentation.utils.Validator p0) {
    }
    
    public final boolean isEditProfileClick() {
        return false;
    }
    
    public final void setEditProfileClick(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse.CustomerInfo getCustomerProfileDetails() {
        return null;
    }
    
    public final void setCustomerProfileDetails(@org.jetbrains.annotations.Nullable()
    com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse.CustomerInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowGenderError() {
        return null;
    }
    
    public final void setShowGenderError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getLoginFinishActivityEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<com.intellihealth.truemeds.data.model.user.CustomerDetailsResponse.CustomerInfo>> getLoadCustomerDetailsEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.viewmodel.events.Event<java.lang.Boolean>> getGetGenderEvent() {
        return null;
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
    public final androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> getEmailData() {
        return null;
    }
    
    public final void setEmailData(@org.jetbrains.annotations.NotNull()
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
    
    public final int getApiType() {
        return 0;
    }
    
    public final void setApiType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred getMxInternalErrorOccurred() {
        return null;
    }
    
    public final void setMxInternalErrorOccurred(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.mixpanel.MxInternalErrorOccurred p0) {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPatientExperimentEditProfile() {
        return null;
    }
    
    public final void setPatientExperimentEditProfile(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRequestFocus() {
        return null;
    }
    
    public final void getCustomerDetailsApi() {
    }
    
    public final void onSaveButtonClicked() {
    }
    
    private final int setGender(java.lang.String value) {
        return 0;
    }
    
    public final void updateProfile() {
    }
    
    public final void updateCustomerDetailsToDb(@org.jetbrains.annotations.NotNull()
    com.intellihealth.truemeds.data.model.user.UpdateProfileResponse response) {
    }
    
    public final void getPatientExperimentCategory() {
    }
}