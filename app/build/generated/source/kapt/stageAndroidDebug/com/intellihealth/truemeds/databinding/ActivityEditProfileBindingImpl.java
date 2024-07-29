package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityEditProfileBindingImpl extends ActivityEditProfileBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txtHeaderEditProfile, 8);
        sViewsWithIds.put(R.id.scrollView, 9);
        sViewsWithIds.put(R.id.edtMobileNumber, 10);
        sViewsWithIds.put(R.id.genderCl, 11);
        sViewsWithIds.put(R.id.txtGender, 12);
        sViewsWithIds.put(R.id.rvListHorizontal, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityEditProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityEditProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.intellihealth.salt.views.buttons.Button) bindings[6]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[4]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[3]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[1]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[2]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.widget.ProgressBar) bindings[7]
            , (com.intellihealth.salt.views.radiofield.RadioList) bindings[13]
            , (androidx.core.widget.NestedScrollView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[8]
            );
        this.btnSaveProfile.setTag(null);
        this.edtAge.setTag(null);
        this.edtEmail.setTag(null);
        this.edtFirstName.setTag(null);
        this.edtLastName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.selfGenderValidation.setTag(null);
        setRootTag(root);
        // listeners
        mCallback57 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelLastNameData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 2 :
                return onChangeViewModelAgeData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 3 :
                return onChangeViewModelShowGenderError((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelEmailData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 5 :
                return onChangeViewModelFirstNameData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 6 :
                return onChangeViewModelPatientExperimentEditProfile((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoaderValue(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoaderValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLastNameData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelLastNameData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAgeData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelAgeData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowGenderError(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowGenderError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmailData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelEmailData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFirstNameData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelFirstNameData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPatientExperimentEditProfile(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPatientExperimentEditProfile, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoaderValue = null;
        java.lang.Boolean viewModelShowGenderErrorGetValue = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelFirstNameDataGetValue = null;
        java.lang.String viewModelPatientExperimentEditProfileGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelLastNameData = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowGenderErrorGetValue = false;
        boolean viewModelPatientExperimentEditProfileEqualsJavaLangStringA = false;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelAgeData = null;
        int viewModelShowGenderErrorViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelEmailDataGetValue = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelAgeDataGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowGenderError = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelEmailData = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelLastNameDataGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelFirstNameData = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPatientExperimentEditProfile = null;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        int viewModelLoaderValueViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel viewModel = mViewModel;
        int viewModelPatientExperimentEditProfileEqualsJavaLangStringAViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loaderValue
                        viewModelLoaderValue = viewModel.getLoaderValue();
                    }
                    updateLiveDataRegistration(0, viewModelLoaderValue);


                    if (viewModelLoaderValue != null) {
                        // read viewModel.loaderValue.getValue()
                        viewModelLoaderValueGetValue = viewModelLoaderValue.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoaderValueGetValue);
                if((dirtyFlags & 0x181L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.lastNameData
                        viewModelLastNameData = viewModel.getLastNameData();
                    }
                    updateLiveDataRegistration(1, viewModelLastNameData);


                    if (viewModelLastNameData != null) {
                        // read viewModel.lastNameData.getValue()
                        viewModelLastNameDataGetValue = viewModelLastNameData.getValue();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ageData
                        viewModelAgeData = viewModel.getAgeData();
                    }
                    updateLiveDataRegistration(2, viewModelAgeData);


                    if (viewModelAgeData != null) {
                        // read viewModel.ageData.getValue()
                        viewModelAgeDataGetValue = viewModelAgeData.getValue();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showGenderError
                        viewModelShowGenderError = viewModel.getShowGenderError();
                    }
                    updateLiveDataRegistration(3, viewModelShowGenderError);


                    if (viewModelShowGenderError != null) {
                        // read viewModel.showGenderError.getValue()
                        viewModelShowGenderErrorGetValue = viewModelShowGenderError.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showGenderError.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowGenderErrorGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowGenderErrorGetValue);
                if((dirtyFlags & 0x188L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowGenderErrorGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showGenderError.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowGenderErrorViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowGenderErrorGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.emailData
                        viewModelEmailData = viewModel.getEmailData();
                    }
                    updateLiveDataRegistration(4, viewModelEmailData);


                    if (viewModelEmailData != null) {
                        // read viewModel.emailData.getValue()
                        viewModelEmailDataGetValue = viewModelEmailData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.firstNameData
                        viewModelFirstNameData = viewModel.getFirstNameData();
                    }
                    updateLiveDataRegistration(5, viewModelFirstNameData);


                    if (viewModelFirstNameData != null) {
                        // read viewModel.firstNameData.getValue()
                        viewModelFirstNameDataGetValue = viewModelFirstNameData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.patientExperimentEditProfile
                        viewModelPatientExperimentEditProfile = viewModel.getPatientExperimentEditProfile();
                    }
                    updateLiveDataRegistration(6, viewModelPatientExperimentEditProfile);


                    if (viewModelPatientExperimentEditProfile != null) {
                        // read viewModel.patientExperimentEditProfile.getValue()
                        viewModelPatientExperimentEditProfileGetValue = viewModelPatientExperimentEditProfile.getValue();
                    }


                    if (viewModelPatientExperimentEditProfileGetValue != null) {
                        // read viewModel.patientExperimentEditProfile.getValue().equals("A")
                        viewModelPatientExperimentEditProfileEqualsJavaLangStringA = viewModelPatientExperimentEditProfileGetValue.equals("A");
                    }
                if((dirtyFlags & 0x1c0L) != 0) {
                    if(viewModelPatientExperimentEditProfileEqualsJavaLangStringA) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.patientExperimentEditProfile.getValue().equals("A") ? View.GONE : View.VISIBLE
                    viewModelPatientExperimentEditProfileEqualsJavaLangStringAViewGONEViewVISIBLE = ((viewModelPatientExperimentEditProfileEqualsJavaLangStringA) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.btnSaveProfile.setOnClickListener(mCallback57);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtAge, viewModelAgeDataGetValue);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtEmail, viewModelEmailDataGetValue);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtFirstName, viewModelFirstNameDataGetValue);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            this.edtLastName.setVisibility(viewModelPatientExperimentEditProfileEqualsJavaLangStringAViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtLastName, viewModelLastNameDataGetValue);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelLoaderValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            this.selfGenderValidation.setVisibility(viewModelShowGenderErrorViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.onSaveButtonClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loaderValue
        flag 1 (0x2L): viewModel.lastNameData
        flag 2 (0x3L): viewModel.ageData
        flag 3 (0x4L): viewModel.showGenderError
        flag 4 (0x5L): viewModel.emailData
        flag 5 (0x6L): viewModel.firstNameData
        flag 6 (0x7L): viewModel.patientExperimentEditProfile
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showGenderError.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showGenderError.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.patientExperimentEditProfile.getValue().equals("A") ? View.GONE : View.VISIBLE
        flag 14 (0xfL): viewModel.patientExperimentEditProfile.getValue().equals("A") ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}