package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddPatientBindingImpl extends ActivityAddPatientBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tmTopHeader, 23);
        sViewsWithIds.put(R.id.contentScroll, 24);
        sViewsWithIds.put(R.id.cl_myself_section, 25);
        sViewsWithIds.put(R.id.tvSelectGenderMySelf, 26);
        sViewsWithIds.put(R.id.llRadioGenderMySelf, 27);
        sViewsWithIds.put(R.id.chipLayout, 28);
        sViewsWithIds.put(R.id.txtOrdering, 29);
        sViewsWithIds.put(R.id.chipMyself, 30);
        sViewsWithIds.put(R.id.chipSomeoneElse, 31);
        sViewsWithIds.put(R.id.headerPatientDetails, 32);
        sViewsWithIds.put(R.id.tvSelectGender, 33);
        sViewsWithIds.put(R.id.llRadioGender, 34);
        sViewsWithIds.put(R.id.cl_patient_info, 35);
        sViewsWithIds.put(R.id.imgInfo, 36);
        sViewsWithIds.put(R.id.txtPrescription, 37);
        sViewsWithIds.put(R.id.ivBottomLine, 38);
        sViewsWithIds.put(R.id.progressBar, 39);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView22;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAddPatientBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 40, sIncludes, sViewsWithIds));
    }
    private ActivityAddPatientBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 17
            , (com.intellihealth.salt.views.buttons.Button) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[28]
            , (com.intellihealth.salt.views.chip.Chip) bindings[30]
            , (com.intellihealth.salt.views.chip.Chip) bindings[31]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[35]
            , (androidx.core.widget.NestedScrollView) bindings[24]
            , (com.intellihealth.salt.views.radiofield.RadioFieldLayout) bindings[18]
            , (com.intellihealth.salt.views.radiofield.RadioFieldLayout) bindings[8]
            , (com.intellihealth.salt.views.radiofield.RadioFieldLayout) bindings[17]
            , (com.intellihealth.salt.views.radiofield.RadioFieldLayout) bindings[7]
            , (com.intellihealth.salt.views.radiofield.RadioFieldLayout) bindings[19]
            , (com.intellihealth.salt.views.radiofield.RadioFieldLayout) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[32]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[36]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[38]
            , (android.widget.RadioGroup) bindings[34]
            , (android.widget.RadioGroup) bindings[27]
            , (com.intellihealth.salt.views.TextView) bindings[20]
            , (android.widget.ProgressBar) bindings[39]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[23]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[16]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[5]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[6]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[14]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[1]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[15]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[33]
            , (com.intellihealth.salt.views.TextView) bindings[26]
            , (com.intellihealth.salt.views.TextView) bindings[29]
            , (com.intellihealth.salt.views.TextView) bindings[37]
            );
        this.btnSave.setTag(null);
        this.clAddPatientView.setTag(null);
        this.clFirstNameBlocker.setTag(null);
        this.clLastNameBlocker.setTag(null);
        this.customRadioFemale.setTag(null);
        this.customRadioFemaleMySelf.setTag(null);
        this.customRadioMale.setTag(null);
        this.customRadioMaleMySelf.setTag(null);
        this.customRadioOther.setTag(null);
        this.customRadioOtherMySelf.setTag(null);
        this.ivAlmostDone.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView22 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[22];
        this.mboundView22.setTag(null);
        this.patientGenderValidation.setTag(null);
        this.selfGenderValidation.setTag(null);
        this.someonelseLayout.setTag(null);
        this.tvInputAge.setTag(null);
        this.tvInputAgeMySelf.setTag(null);
        this.tvInputEmailIdMySelf.setTag(null);
        this.tvInputFirstName.setTag(null);
        this.tvInputFirstNameMySelf.setTag(null);
        this.tvInputLastName.setTag(null);
        this.tvInputLastNameMySelf.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 5);
        mCallback8 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 4);
        mCallback7 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 3);
        mCallback6 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        mCallback10 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 6);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000L;
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
        if (BR.comingFromAccountFragment == variableId) {
            setComingFromAccountFragment((java.lang.Boolean) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setComingFromAccountFragment(@Nullable java.lang.Boolean ComingFromAccountFragment) {
        this.mComingFromAccountFragment = ComingFromAccountFragment;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.comingFromAccountFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGender((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelYourFirstNameData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 2 :
                return onChangeViewModelPatientExperiment((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelYourAgeData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 4 :
                return onChangeViewModelIsSomeOneElse((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelRadioType((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelYourEmailData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 8 :
                return onChangeViewModelYourGender((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeViewModelSomeOneElseRadioType((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelGenderValidationStr((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeViewModelFirstNameData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 12 :
                return onChangeViewModelIsMySelf((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeViewModelDisableLastName((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeViewModelDisableFirstName((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 15 :
                return onChangeViewModelPatientAgeData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 16 :
                return onChangeViewModelYourLastNameData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGender(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelGender, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelYourFirstNameData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelYourFirstNameData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPatientExperiment(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPatientExperiment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelYourAgeData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelYourAgeData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsSomeOneElse(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsSomeOneElse, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRadioType(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelRadioType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoaderValue(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoaderValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelYourEmailData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelYourEmailData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelYourGender(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelYourGender, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSomeOneElseRadioType(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSomeOneElseRadioType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGenderValidationStr(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelGenderValidationStr, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFirstNameData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelFirstNameData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsMySelf(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsMySelf, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisableLastName(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDisableLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisableFirstName(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDisableFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPatientAgeData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelPatientAgeData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelYourLastNameData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ViewModelYourLastNameData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
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
        java.lang.Boolean viewModelDisableLastNameGetValue = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelYourEmailDataGetValue = null;
        java.lang.Boolean viewModelIsMySelfGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelGender = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelYourFirstNameData = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelYourAgeDataGetValue = null;
        java.lang.Boolean viewModelYourGenderGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPatientExperiment = null;
        java.lang.String viewModelPatientExperimentGetValue = null;
        boolean viewModelIsFreshUserBooleanTrue = false;
        int viewModelIsMySelfBooleanTrueViewModelIsFreshUserViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelYourAgeData = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsSomeOneElse = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelRadioType = null;
        boolean viewModelIsSomeOneElseBooleanTrue = false;
        java.lang.String viewModelSomeOneElseRadioTypeGetValue = null;
        int viewModelDisableFirstNameViewVISIBLEViewGONE = 0;
        int viewModelLoaderValueViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelGenderGetValue = false;
        int viewModelYourGenderBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoaderValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelYourEmailData = null;
        int viewModelPatientExperimentEqualsJavaLangStringAViewGONEViewVISIBLE = 0;
        java.lang.Boolean viewModelIsSomeOneElseGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelYourGender = null;
        java.lang.String viewModelGenderValidationStrGetValue = null;
        boolean viewModelRadioTypeEqualsJavaLangStringFemale = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSomeOneElseRadioType = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelYourFirstNameDataGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDisableFirstNameGetValue = false;
        boolean viewModelYourGenderBooleanFalse = false;
        java.lang.String comingFromAccountFragmentBtnSaveAndroidStringSaveBtnSaveAndroidStringSaveAndContinue = null;
        boolean viewModelGenderBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxComingFromAccountFragment = false;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelFirstNameDataGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelYourGenderGetValue = false;
        java.lang.Boolean viewModelGenderGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelGenderValidationStr = null;
        boolean viewModelSomeOneElseRadioTypeEqualsJavaLangStringOther = false;
        int viewModelIsSomeOneElseBooleanTrueViewVISIBLEViewGONE = 0;
        boolean viewModelSomeOneElseRadioTypeEqualsJavaLangStringFemale = false;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelFirstNameData = null;
        int viewModelGenderBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsMySelf = null;
        boolean viewModelIsMySelfBooleanTrueViewModelIsFreshUser = false;
        boolean viewModelRadioTypeEqualsJavaLangStringMale = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSomeOneElseGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDisableLastNameGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDisableLastName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDisableFirstName = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelPatientAgeData = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelYourLastNameDataGetValue = null;
        boolean viewModelIsFreshUser = false;
        java.lang.Boolean comingFromAccountFragment = mComingFromAccountFragment;
        boolean viewModelRadioTypeEqualsJavaLangStringOther = false;
        int viewModelDisableLastNameViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData viewModelPatientAgeDataGetValue = null;
        java.lang.Boolean viewModelDisableFirstNameGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> viewModelYourLastNameData = null;
        boolean viewModelPatientExperimentEqualsJavaLangStringA = false;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        int viewModelIsFreshUserBooleanTrueViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsMySelfGetValue = false;
        java.lang.String viewModelRadioTypeGetValue = null;
        boolean viewModelSomeOneElseRadioTypeEqualsJavaLangStringMale = false;

        if ((dirtyFlags & 0xa0000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment)
                androidxDatabindingViewDataBindingSafeUnboxComingFromAccountFragment = androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment);
            if((dirtyFlags & 0xa0000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxComingFromAccountFragment) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment) ? @android:string/save : @android:string/save_and_continue
                comingFromAccountFragmentBtnSaveAndroidStringSaveBtnSaveAndroidStringSaveAndContinue = ((androidxDatabindingViewDataBindingSafeUnboxComingFromAccountFragment) ? (btnSave.getResources().getString(R.string.save)) : (btnSave.getResources().getString(R.string.save_and_continue)));
        }
        if ((dirtyFlags & 0xdffffL) != 0) {


            if ((dirtyFlags & 0xc0001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.gender
                        viewModelGender = viewModel.getGender();
                    }
                    updateLiveDataRegistration(0, viewModelGender);


                    if (viewModelGender != null) {
                        // read viewModel.gender.getValue()
                        viewModelGenderGetValue = viewModelGender.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.gender.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelGenderGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelGenderGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.gender.getValue()) == false
                    viewModelGenderBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxViewModelGenderGetValue) == (false);
                if((dirtyFlags & 0xc0001L) != 0) {
                    if(viewModelGenderBooleanFalse) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.gender.getValue()) == false ? View.VISIBLE : View.GONE
                    viewModelGenderBooleanFalseViewVISIBLEViewGONE = ((viewModelGenderBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.yourFirstNameData
                        viewModelYourFirstNameData = viewModel.getYourFirstNameData();
                    }
                    updateLiveDataRegistration(1, viewModelYourFirstNameData);


                    if (viewModelYourFirstNameData != null) {
                        // read viewModel.yourFirstNameData.getValue()
                        viewModelYourFirstNameDataGetValue = viewModelYourFirstNameData.getValue();
                    }
            }
            if ((dirtyFlags & 0xc0004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.patientExperiment
                        viewModelPatientExperiment = viewModel.getPatientExperiment();
                    }
                    updateLiveDataRegistration(2, viewModelPatientExperiment);


                    if (viewModelPatientExperiment != null) {
                        // read viewModel.patientExperiment.getValue()
                        viewModelPatientExperimentGetValue = viewModelPatientExperiment.getValue();
                    }


                    if (viewModelPatientExperimentGetValue != null) {
                        // read viewModel.patientExperiment.getValue().equals("A")
                        viewModelPatientExperimentEqualsJavaLangStringA = viewModelPatientExperimentGetValue.equals("A");
                    }
                if((dirtyFlags & 0xc0004L) != 0) {
                    if(viewModelPatientExperimentEqualsJavaLangStringA) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read viewModel.patientExperiment.getValue().equals("A") ? View.GONE : View.VISIBLE
                    viewModelPatientExperimentEqualsJavaLangStringAViewGONEViewVISIBLE = ((viewModelPatientExperimentEqualsJavaLangStringA) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc0008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.yourAgeData
                        viewModelYourAgeData = viewModel.getYourAgeData();
                    }
                    updateLiveDataRegistration(3, viewModelYourAgeData);


                    if (viewModelYourAgeData != null) {
                        // read viewModel.yourAgeData.getValue()
                        viewModelYourAgeDataGetValue = viewModelYourAgeData.getValue();
                    }
            }
            if ((dirtyFlags & 0xc0010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSomeOneElse
                        viewModelIsSomeOneElse = viewModel.isSomeOneElse();
                    }
                    updateLiveDataRegistration(4, viewModelIsSomeOneElse);


                    if (viewModelIsSomeOneElse != null) {
                        // read viewModel.isSomeOneElse.getValue()
                        viewModelIsSomeOneElseGetValue = viewModelIsSomeOneElse.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSomeOneElse.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsSomeOneElseGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsSomeOneElseGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSomeOneElse.getValue()) == true
                    viewModelIsSomeOneElseBooleanTrue = (androidxDatabindingViewDataBindingSafeUnboxViewModelIsSomeOneElseGetValue) == (true);
                if((dirtyFlags & 0xc0010L) != 0) {
                    if(viewModelIsSomeOneElseBooleanTrue) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSomeOneElse.getValue()) == true ? View.VISIBLE : View.GONE
                    viewModelIsSomeOneElseBooleanTrueViewVISIBLEViewGONE = ((viewModelIsSomeOneElseBooleanTrue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.radioType
                        viewModelRadioType = viewModel.getRadioType();
                    }
                    updateLiveDataRegistration(5, viewModelRadioType);


                    if (viewModelRadioType != null) {
                        // read viewModel.radioType.getValue()
                        viewModelRadioTypeGetValue = viewModelRadioType.getValue();
                    }


                    if (viewModelRadioTypeGetValue != null) {
                        // read viewModel.radioType.getValue().equals("female")
                        viewModelRadioTypeEqualsJavaLangStringFemale = viewModelRadioTypeGetValue.equals("female");
                        // read viewModel.radioType.getValue().equals("male")
                        viewModelRadioTypeEqualsJavaLangStringMale = viewModelRadioTypeGetValue.equals("male");
                        // read viewModel.radioType.getValue().equals("other")
                        viewModelRadioTypeEqualsJavaLangStringOther = viewModelRadioTypeGetValue.equals("other");
                    }
            }
            if ((dirtyFlags & 0xc0040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loaderValue
                        viewModelLoaderValue = viewModel.getLoaderValue();
                    }
                    updateLiveDataRegistration(6, viewModelLoaderValue);


                    if (viewModelLoaderValue != null) {
                        // read viewModel.loaderValue.getValue()
                        viewModelLoaderValueGetValue = viewModelLoaderValue.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoaderValueGetValue);
                if((dirtyFlags & 0xc0040L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.yourEmailData
                        viewModelYourEmailData = viewModel.getYourEmailData();
                    }
                    updateLiveDataRegistration(7, viewModelYourEmailData);


                    if (viewModelYourEmailData != null) {
                        // read viewModel.yourEmailData.getValue()
                        viewModelYourEmailDataGetValue = viewModelYourEmailData.getValue();
                    }
            }
            if ((dirtyFlags & 0xc0100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.yourGender
                        viewModelYourGender = viewModel.getYourGender();
                    }
                    updateLiveDataRegistration(8, viewModelYourGender);


                    if (viewModelYourGender != null) {
                        // read viewModel.yourGender.getValue()
                        viewModelYourGenderGetValue = viewModelYourGender.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.yourGender.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelYourGenderGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelYourGenderGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.yourGender.getValue()) == false
                    viewModelYourGenderBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxViewModelYourGenderGetValue) == (false);
                if((dirtyFlags & 0xc0100L) != 0) {
                    if(viewModelYourGenderBooleanFalse) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.yourGender.getValue()) == false ? View.VISIBLE : View.GONE
                    viewModelYourGenderBooleanFalseViewVISIBLEViewGONE = ((viewModelYourGenderBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.someOneElseRadioType
                        viewModelSomeOneElseRadioType = viewModel.getSomeOneElseRadioType();
                    }
                    updateLiveDataRegistration(9, viewModelSomeOneElseRadioType);


                    if (viewModelSomeOneElseRadioType != null) {
                        // read viewModel.someOneElseRadioType.getValue()
                        viewModelSomeOneElseRadioTypeGetValue = viewModelSomeOneElseRadioType.getValue();
                    }


                    if (viewModelSomeOneElseRadioTypeGetValue != null) {
                        // read viewModel.someOneElseRadioType.getValue().equals("other")
                        viewModelSomeOneElseRadioTypeEqualsJavaLangStringOther = viewModelSomeOneElseRadioTypeGetValue.equals("other");
                        // read viewModel.someOneElseRadioType.getValue().equals("female")
                        viewModelSomeOneElseRadioTypeEqualsJavaLangStringFemale = viewModelSomeOneElseRadioTypeGetValue.equals("female");
                        // read viewModel.someOneElseRadioType.getValue().equals("male")
                        viewModelSomeOneElseRadioTypeEqualsJavaLangStringMale = viewModelSomeOneElseRadioTypeGetValue.equals("male");
                    }
            }
            if ((dirtyFlags & 0xc0400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.genderValidationStr
                        viewModelGenderValidationStr = viewModel.getGenderValidationStr();
                    }
                    updateLiveDataRegistration(10, viewModelGenderValidationStr);


                    if (viewModelGenderValidationStr != null) {
                        // read viewModel.genderValidationStr.getValue()
                        viewModelGenderValidationStrGetValue = viewModelGenderValidationStr.getValue();
                    }
            }
            if ((dirtyFlags & 0xc0800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.firstNameData
                        viewModelFirstNameData = viewModel.getFirstNameData();
                    }
                    updateLiveDataRegistration(11, viewModelFirstNameData);


                    if (viewModelFirstNameData != null) {
                        // read viewModel.firstNameData.getValue()
                        viewModelFirstNameDataGetValue = viewModelFirstNameData.getValue();
                    }
            }
            if ((dirtyFlags & 0xc1000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel._isMySelf
                        viewModelIsMySelf = viewModel.get_isMySelf();
                    }
                    updateLiveDataRegistration(12, viewModelIsMySelf);


                    if (viewModelIsMySelf != null) {
                        // read viewModel._isMySelf.getValue()
                        viewModelIsMySelfGetValue = viewModelIsMySelf.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel._isMySelf.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsMySelfGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsMySelfGetValue);
                if((dirtyFlags & 0xc1000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsMySelfGetValue) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc2000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.disableLastName
                        viewModelDisableLastName = viewModel.getDisableLastName();
                    }
                    updateLiveDataRegistration(13, viewModelDisableLastName);


                    if (viewModelDisableLastName != null) {
                        // read viewModel.disableLastName.getValue()
                        viewModelDisableLastNameGetValue = viewModelDisableLastName.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.disableLastName.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelDisableLastNameGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDisableLastNameGetValue);
                if((dirtyFlags & 0xc2000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelDisableLastNameGetValue) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.disableLastName.getValue()) ? View.VISIBLE : View.GONE
                    viewModelDisableLastNameViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelDisableLastNameGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc4000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.disableFirstName
                        viewModelDisableFirstName = viewModel.getDisableFirstName();
                    }
                    updateLiveDataRegistration(14, viewModelDisableFirstName);


                    if (viewModelDisableFirstName != null) {
                        // read viewModel.disableFirstName.getValue()
                        viewModelDisableFirstNameGetValue = viewModelDisableFirstName.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.disableFirstName.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelDisableFirstNameGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDisableFirstNameGetValue);
                if((dirtyFlags & 0xc4000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelDisableFirstNameGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.disableFirstName.getValue()) ? View.VISIBLE : View.GONE
                    viewModelDisableFirstNameViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelDisableFirstNameGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc8000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.patientAgeData
                        viewModelPatientAgeData = viewModel.getPatientAgeData();
                    }
                    updateLiveDataRegistration(15, viewModelPatientAgeData);


                    if (viewModelPatientAgeData != null) {
                        // read viewModel.patientAgeData.getValue()
                        viewModelPatientAgeDataGetValue = viewModelPatientAgeData.getValue();
                    }
            }
            if ((dirtyFlags & 0xc0000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel._isFreshUser
                        viewModelIsFreshUser = viewModel.get_isFreshUser();
                    }


                    // read viewModel._isFreshUser == true
                    viewModelIsFreshUserBooleanTrue = (viewModelIsFreshUser) == (true);
                if((dirtyFlags & 0xc0000L) != 0) {
                    if(viewModelIsFreshUserBooleanTrue) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read viewModel._isFreshUser == true ? View.VISIBLE : View.GONE
                    viewModelIsFreshUserBooleanTrueViewVISIBLEViewGONE = ((viewModelIsFreshUserBooleanTrue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xd0000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.yourLastNameData
                        viewModelYourLastNameData = viewModel.getYourLastNameData();
                    }
                    updateLiveDataRegistration(16, viewModelYourLastNameData);


                    if (viewModelYourLastNameData != null) {
                        // read viewModel.yourLastNameData.getValue()
                        viewModelYourLastNameDataGetValue = viewModelYourLastNameData.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel._isFreshUser
                    viewModelIsFreshUser = viewModel.get_isFreshUser();
                }
        }

        if ((dirtyFlags & 0xc1000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel._isMySelf.getValue()) ? true : viewModel._isFreshUser
                viewModelIsMySelfBooleanTrueViewModelIsFreshUser = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsMySelfGetValue) ? (true) : (viewModelIsFreshUser));
            if((dirtyFlags & 0xc1000L) != 0) {
                if(viewModelIsMySelfBooleanTrueViewModelIsFreshUser) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel._isMySelf.getValue()) ? true : viewModel._isFreshUser ? View.VISIBLE : View.GONE
                viewModelIsMySelfBooleanTrueViewModelIsFreshUserViewVISIBLEViewGONE = ((viewModelIsMySelfBooleanTrueViewModelIsFreshUser) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xa0000L) != 0) {
            // api target 1

            this.btnSave.setTitle(comingFromAccountFragmentBtnSaveAndroidStringSaveBtnSaveAndroidStringSaveAndContinue);
        }
        if ((dirtyFlags & 0xc0000L) != 0) {
            // api target 1

            this.clAddPatientView.setVisibility(viewModelIsFreshUserBooleanTrueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc4000L) != 0) {
            // api target 1

            this.clFirstNameBlocker.setVisibility(viewModelDisableFirstNameViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc2000L) != 0) {
            // api target 1

            this.clLastNameBlocker.setVisibility(viewModelDisableLastNameViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0200L) != 0) {
            // api target 1

            this.customRadioFemale.setChecked(viewModelSomeOneElseRadioTypeEqualsJavaLangStringFemale);
            this.customRadioMale.setChecked(viewModelSomeOneElseRadioTypeEqualsJavaLangStringMale);
            this.customRadioOther.setChecked(viewModelSomeOneElseRadioTypeEqualsJavaLangStringOther);
        }
        if ((dirtyFlags & 0x80000L) != 0) {
            // api target 1

            this.customRadioFemale.setOnClickListener(mCallback9);
            this.customRadioFemaleMySelf.setOnClickListener(mCallback6);
            this.customRadioMale.setOnClickListener(mCallback8);
            this.customRadioMaleMySelf.setOnClickListener(mCallback5);
            this.customRadioOther.setOnClickListener(mCallback10);
            this.customRadioOtherMySelf.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0xc0020L) != 0) {
            // api target 1

            this.customRadioFemaleMySelf.setChecked(viewModelRadioTypeEqualsJavaLangStringFemale);
            this.customRadioMaleMySelf.setChecked(viewModelRadioTypeEqualsJavaLangStringMale);
            this.customRadioOtherMySelf.setChecked(viewModelRadioTypeEqualsJavaLangStringOther);
        }
        if ((dirtyFlags & 0xc0010L) != 0) {
            // api target 1

            this.ivAlmostDone.setVisibility(viewModelIsSomeOneElseBooleanTrueViewVISIBLEViewGONE);
            this.someonelseLayout.setVisibility(viewModelIsSomeOneElseBooleanTrueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0040L) != 0) {
            // api target 1

            this.mboundView22.setVisibility(viewModelLoaderValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0001L) != 0) {
            // api target 1

            this.patientGenderValidation.setVisibility(viewModelGenderBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.selfGenderValidation, viewModelGenderValidationStrGetValue);
        }
        if ((dirtyFlags & 0xc0100L) != 0) {
            // api target 1

            this.selfGenderValidation.setVisibility(viewModelYourGenderBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc8000L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.tvInputAge, viewModelPatientAgeDataGetValue);
        }
        if ((dirtyFlags & 0xc0008L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.tvInputAgeMySelf, viewModelYourAgeDataGetValue);
        }
        if ((dirtyFlags & 0xc0080L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.tvInputEmailIdMySelf, viewModelYourEmailDataGetValue);
        }
        if ((dirtyFlags & 0xc1000L) != 0) {
            // api target 1

            this.tvInputEmailIdMySelf.setVisibility(viewModelIsMySelfBooleanTrueViewModelIsFreshUserViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0800L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.tvInputFirstName, viewModelFirstNameDataGetValue);
        }
        if ((dirtyFlags & 0xc0002L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.tvInputFirstNameMySelf, viewModelYourFirstNameDataGetValue);
        }
        if ((dirtyFlags & 0xc0004L) != 0) {
            // api target 1

            this.tvInputLastName.setVisibility(viewModelPatientExperimentEqualsJavaLangStringAViewGONEViewVISIBLE);
            this.tvInputLastNameMySelf.setVisibility(viewModelPatientExperimentEqualsJavaLangStringAViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xd0000L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.tvInputLastNameMySelf, viewModelYourLastNameDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSomeOneElseRadioType("female");
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSomeOneElseRadioType("male");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setRadioType("other");
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setRadioType("female");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setRadioType("male");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.setSomeOneElseRadioType("other");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.gender
        flag 1 (0x2L): viewModel.yourFirstNameData
        flag 2 (0x3L): viewModel.patientExperiment
        flag 3 (0x4L): viewModel.yourAgeData
        flag 4 (0x5L): viewModel.isSomeOneElse
        flag 5 (0x6L): viewModel.radioType
        flag 6 (0x7L): viewModel.loaderValue
        flag 7 (0x8L): viewModel.yourEmailData
        flag 8 (0x9L): viewModel.yourGender
        flag 9 (0xaL): viewModel.someOneElseRadioType
        flag 10 (0xbL): viewModel.genderValidationStr
        flag 11 (0xcL): viewModel.firstNameData
        flag 12 (0xdL): viewModel._isMySelf
        flag 13 (0xeL): viewModel.disableLastName
        flag 14 (0xfL): viewModel.disableFirstName
        flag 15 (0x10L): viewModel.patientAgeData
        flag 16 (0x11L): viewModel.yourLastNameData
        flag 17 (0x12L): comingFromAccountFragment
        flag 18 (0x13L): viewModel
        flag 19 (0x14L): null
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel._isMySelf.getValue()) ? true : viewModel._isFreshUser ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel._isMySelf.getValue()) ? true : viewModel._isFreshUser ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.disableFirstName.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.disableFirstName.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.yourGender.getValue()) == false ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.yourGender.getValue()) == false ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): viewModel.patientExperiment.getValue().equals("A") ? View.GONE : View.VISIBLE
        flag 29 (0x1eL): viewModel.patientExperiment.getValue().equals("A") ? View.GONE : View.VISIBLE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment) ? @android:string/save : @android:string/save_and_continue
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment) ? @android:string/save : @android:string/save_and_continue
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSomeOneElse.getValue()) == true ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSomeOneElse.getValue()) == true ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.gender.getValue()) == false ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.gender.getValue()) == false ? View.VISIBLE : View.GONE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel._isMySelf.getValue()) ? true : viewModel._isFreshUser
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel._isMySelf.getValue()) ? true : viewModel._isFreshUser
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.disableLastName.getValue()) ? View.VISIBLE : View.GONE
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.disableLastName.getValue()) ? View.VISIBLE : View.GONE
        flag 40 (0x29L): viewModel._isFreshUser == true ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): viewModel._isFreshUser == true ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}