package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddAddressBindingImpl extends ActivityAddAddressBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.contentScroll, 16);
        sViewsWithIds.put(R.id.topLayout, 17);
        sViewsWithIds.put(R.id.txtPinLabel, 18);
        sViewsWithIds.put(R.id.topLayout2, 19);
        sViewsWithIds.put(R.id.txtSaveAs, 20);
        sViewsWithIds.put(R.id.bottomLayout, 21);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAddAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityAddAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (com.intellihealth.salt.views.buttons.Button) bindings[4]
            , (com.intellihealth.salt.views.buttons.Button) bindings[15]
            , (com.intellihealth.salt.views.chip.Chip) bindings[10]
            , (com.intellihealth.salt.views.chip.Chip) bindings[11]
            , (com.intellihealth.salt.views.chip.Chip) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[16]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[5]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[6]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[8]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[7]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[2]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[9]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[19]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[18]
            , (com.intellihealth.salt.views.TextView) bindings[20]
            );
        this.btnCurrentLocation.setTag(null);
        this.btnSave.setTag(null);
        this.chipHome.setTag(null);
        this.chipOffice.setTag(null);
        this.chipOther.setTag(null);
        this.edtAddress.setTag(null);
        this.edtAddress2.setTag(null);
        this.edtCity.setTag(null);
        this.edtLandmark.setTag(null);
        this.edtPinCode.setTag(null);
        this.edtState.setTag(null);
        this.etOther.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtChipErrorMsg.setTag(null);
        this.txtHeader.setTag(null);
        this.txtPinErrorMsg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback60 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
        if (BR.model == variableId) {
            setModel((com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj) variable);
        }
        else if (BR.manageAddressModel == variableId) {
            setManageAddressModel((com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel) variable);
        }
        else if (BR.comingFromAccountFragment == variableId) {
            setComingFromAccountFragment((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setManageAddressModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel ManageAddressModel) {
        this.mManageAddressModel = ManageAddressModel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.manageAddressModel);
        super.requestRebind();
    }
    public void setComingFromAccountFragment(@Nullable java.lang.Boolean ComingFromAccountFragment) {
        this.mComingFromAccountFragment = ComingFromAccountFragment;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.comingFromAccountFragment);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeManageAddressModelChipData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 1 :
                return onChangeManageAddressModelOtherError((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 2 :
                return onChangeManageAddressModelAddress2Data((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 3 :
                return onChangeManageAddressModelLandMarkData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 4 :
                return onChangeManageAddressModelHeaderType((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel>) object, fieldId);
            case 5 :
                return onChangeManageAddressModelPincodeData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 6 :
                return onChangeManageAddressModelCityData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 7 :
                return onChangeManageAddressModelStateData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
            case 8 :
                return onChangeManageAddressModelAddressData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeManageAddressModelChipData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ManageAddressModelChipData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressModelOtherError(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ManageAddressModelOtherError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressModelAddress2Data(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ManageAddressModelAddress2Data, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressModelLandMarkData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ManageAddressModelLandMarkData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressModelHeaderType(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> ManageAddressModelHeaderType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressModelPincodeData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ManageAddressModelPincodeData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressModelCityData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ManageAddressModelCityData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressModelStateData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ManageAddressModelStateData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeManageAddressModelAddressData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> ManageAddressModelAddressData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj model = mModel;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> manageAddressModelChipData = null;
        java.lang.String modelAddressline1 = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData manageAddressModelCityDataGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxComingFromAccountFragment = false;
        com.intellihealth.salt.constants.InputFieldConstants manageAddressModelChipDataErrorStatus = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> manageAddressModelOtherError = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData manageAddressModelLandMarkDataGetValue = null;
        com.intellihealth.salt.models.MobileSectionHeadersModel manageAddressModelHeaderTypeGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> manageAddressModelAddress2Data = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData manageAddressModelAddress2DataGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> manageAddressModelLandMarkData = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData manageAddressModelOtherErrorGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> manageAddressModelHeaderType = null;
        java.lang.String modelLandmark = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> manageAddressModelPincodeData = null;
        int manageAddressModelChipDataErrorStatusInputFieldConstantsSTATEERRORViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> manageAddressModelCityData = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData manageAddressModelStateDataGetValue = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData manageAddressModelChipDataGetValue = null;
        java.lang.String modelAddressline2 = null;
        com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel manageAddressModel = mManageAddressModel;
        java.lang.Boolean comingFromAccountFragment = mComingFromAccountFragment;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData manageAddressModelPincodeDataGetValue = null;
        java.lang.String modelPincode = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> manageAddressModelStateData = null;
        java.lang.String modelAddressType = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData> manageAddressModelAddressData = null;
        com.intellihealth.truemeds.data.model.errormessage.ErrorMessageData manageAddressModelAddressDataGetValue = null;
        boolean manageAddressModelChipDataErrorStatusInputFieldConstantsSTATEERROR = false;
        java.lang.String comingFromAccountFragmentBtnSaveAndroidStringSaveBtnSaveAndroidStringSaveAndContinue = null;

        if ((dirtyFlags & 0x1200L) != 0) {



                if (model != null) {
                    // read model.addressline1
                    modelAddressline1 = model.getAddressline1();
                    // read model.landmark
                    modelLandmark = model.getLandmark();
                    // read model.addressline2
                    modelAddressline2 = model.getAddressline2();
                    // read model.pincode
                    modelPincode = model.getPincode();
                    // read model.addressType
                    modelAddressType = model.getAddressType();
                }
        }
        if ((dirtyFlags & 0x15ffL) != 0) {


            if ((dirtyFlags & 0x1401L) != 0) {

                    if (manageAddressModel != null) {
                        // read manageAddressModel.chipData
                        manageAddressModelChipData = manageAddressModel.getChipData();
                    }
                    updateLiveDataRegistration(0, manageAddressModelChipData);


                    if (manageAddressModelChipData != null) {
                        // read manageAddressModel.chipData.getValue()
                        manageAddressModelChipDataGetValue = manageAddressModelChipData.getValue();
                    }


                    if (manageAddressModelChipDataGetValue != null) {
                        // read manageAddressModel.chipData.getValue().errorStatus
                        manageAddressModelChipDataErrorStatus = manageAddressModelChipDataGetValue.getErrorStatus();
                    }


                    // read manageAddressModel.chipData.getValue().errorStatus == InputFieldConstants.STATE_ERROR
                    manageAddressModelChipDataErrorStatusInputFieldConstantsSTATEERROR = (manageAddressModelChipDataErrorStatus) == (com.intellihealth.salt.constants.InputFieldConstants.STATE_ERROR);
                if((dirtyFlags & 0x1401L) != 0) {
                    if(manageAddressModelChipDataErrorStatusInputFieldConstantsSTATEERROR) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read manageAddressModel.chipData.getValue().errorStatus == InputFieldConstants.STATE_ERROR ? View.VISIBLE : View.GONE
                    manageAddressModelChipDataErrorStatusInputFieldConstantsSTATEERRORViewVISIBLEViewGONE = ((manageAddressModelChipDataErrorStatusInputFieldConstantsSTATEERROR) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1402L) != 0) {

                    if (manageAddressModel != null) {
                        // read manageAddressModel.otherError
                        manageAddressModelOtherError = manageAddressModel.getOtherError();
                    }
                    updateLiveDataRegistration(1, manageAddressModelOtherError);


                    if (manageAddressModelOtherError != null) {
                        // read manageAddressModel.otherError.getValue()
                        manageAddressModelOtherErrorGetValue = manageAddressModelOtherError.getValue();
                    }
            }
            if ((dirtyFlags & 0x1404L) != 0) {

                    if (manageAddressModel != null) {
                        // read manageAddressModel.address2Data
                        manageAddressModelAddress2Data = manageAddressModel.getAddress2Data();
                    }
                    updateLiveDataRegistration(2, manageAddressModelAddress2Data);


                    if (manageAddressModelAddress2Data != null) {
                        // read manageAddressModel.address2Data.getValue()
                        manageAddressModelAddress2DataGetValue = manageAddressModelAddress2Data.getValue();
                    }
            }
            if ((dirtyFlags & 0x1408L) != 0) {

                    if (manageAddressModel != null) {
                        // read manageAddressModel.landMarkData
                        manageAddressModelLandMarkData = manageAddressModel.getLandMarkData();
                    }
                    updateLiveDataRegistration(3, manageAddressModelLandMarkData);


                    if (manageAddressModelLandMarkData != null) {
                        // read manageAddressModel.landMarkData.getValue()
                        manageAddressModelLandMarkDataGetValue = manageAddressModelLandMarkData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1410L) != 0) {

                    if (manageAddressModel != null) {
                        // read manageAddressModel.headerType
                        manageAddressModelHeaderType = manageAddressModel.getHeaderType();
                    }
                    updateLiveDataRegistration(4, manageAddressModelHeaderType);


                    if (manageAddressModelHeaderType != null) {
                        // read manageAddressModel.headerType.getValue()
                        manageAddressModelHeaderTypeGetValue = manageAddressModelHeaderType.getValue();
                    }
            }
            if ((dirtyFlags & 0x1420L) != 0) {

                    if (manageAddressModel != null) {
                        // read manageAddressModel.pincodeData
                        manageAddressModelPincodeData = manageAddressModel.getPincodeData();
                    }
                    updateLiveDataRegistration(5, manageAddressModelPincodeData);


                    if (manageAddressModelPincodeData != null) {
                        // read manageAddressModel.pincodeData.getValue()
                        manageAddressModelPincodeDataGetValue = manageAddressModelPincodeData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1440L) != 0) {

                    if (manageAddressModel != null) {
                        // read manageAddressModel.cityData
                        manageAddressModelCityData = manageAddressModel.getCityData();
                    }
                    updateLiveDataRegistration(6, manageAddressModelCityData);


                    if (manageAddressModelCityData != null) {
                        // read manageAddressModel.cityData.getValue()
                        manageAddressModelCityDataGetValue = manageAddressModelCityData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1480L) != 0) {

                    if (manageAddressModel != null) {
                        // read manageAddressModel.stateData
                        manageAddressModelStateData = manageAddressModel.getStateData();
                    }
                    updateLiveDataRegistration(7, manageAddressModelStateData);


                    if (manageAddressModelStateData != null) {
                        // read manageAddressModel.stateData.getValue()
                        manageAddressModelStateDataGetValue = manageAddressModelStateData.getValue();
                    }
            }
            if ((dirtyFlags & 0x1500L) != 0) {

                    if (manageAddressModel != null) {
                        // read manageAddressModel.addressData
                        manageAddressModelAddressData = manageAddressModel.getAddressData();
                    }
                    updateLiveDataRegistration(8, manageAddressModelAddressData);


                    if (manageAddressModelAddressData != null) {
                        // read manageAddressModel.addressData.getValue()
                        manageAddressModelAddressDataGetValue = manageAddressModelAddressData.getValue();
                    }
            }
        }
        if ((dirtyFlags & 0x1800L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment)
                androidxDatabindingViewDataBindingSafeUnboxComingFromAccountFragment = androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment);
            if((dirtyFlags & 0x1800L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxComingFromAccountFragment) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment) ? @android:string/save : @android:string/save_and_continue
                comingFromAccountFragmentBtnSaveAndroidStringSaveBtnSaveAndroidStringSaveAndContinue = ((androidxDatabindingViewDataBindingSafeUnboxComingFromAccountFragment) ? (btnSave.getResources().getString(R.string.save)) : (btnSave.getResources().getString(R.string.save_and_continue)));
        }
        // batch finished
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            this.btnCurrentLocation.setOnClickListener(mCallback60);
        }
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            this.btnSave.setTitle(comingFromAccountFragmentBtnSaveAndroidStringSaveBtnSaveAndroidStringSaveAndContinue);
        }
        if ((dirtyFlags & 0x1200L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ManageAddressBindingAdapterKt.setManageAddressChipHomeData(this.chipHome, modelAddressType);
            com.intellihealth.truemeds.presentation.bindingadapter.ManageAddressBindingAdapterKt.setManageAddressChipOfficeData(this.chipOffice, modelAddressType);
            com.intellihealth.truemeds.presentation.bindingadapter.ManageAddressBindingAdapterKt.setManageAddressChipOtherData(this.chipOther, modelAddressType);
            com.intellihealth.truemeds.presentation.bindingadapter.ManageAddressBindingAdapterKt.setManageAddressInputFieldData(this.edtAddress, modelAddressline1);
            com.intellihealth.truemeds.presentation.bindingadapter.ManageAddressBindingAdapterKt.setManageAddressInputFieldData(this.edtAddress2, modelAddressline2);
            com.intellihealth.truemeds.presentation.bindingadapter.ManageAddressBindingAdapterKt.setManageAddressInputFieldData(this.edtLandmark, modelLandmark);
            com.intellihealth.truemeds.presentation.bindingadapter.ManageAddressBindingAdapterKt.setManageAddressInputFieldData(this.edtPinCode, modelPincode);
        }
        if ((dirtyFlags & 0x1500L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtAddress, manageAddressModelAddressDataGetValue);
        }
        if ((dirtyFlags & 0x1404L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtAddress2, manageAddressModelAddress2DataGetValue);
        }
        if ((dirtyFlags & 0x1440L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtCity, manageAddressModelCityDataGetValue);
        }
        if ((dirtyFlags & 0x1408L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtLandmark, manageAddressModelLandMarkDataGetValue);
        }
        if ((dirtyFlags & 0x1480L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.edtState, manageAddressModelStateDataGetValue);
        }
        if ((dirtyFlags & 0x1402L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setErrorMessage(this.etOther, manageAddressModelOtherErrorGetValue);
        }
        if ((dirtyFlags & 0x1401L) != 0) {
            // api target 1

            this.txtChipErrorMsg.setVisibility(manageAddressModelChipDataErrorStatusInputFieldConstantsSTATEERRORViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setChipErrorMessage(this.txtChipErrorMsg, manageAddressModelChipDataGetValue);
        }
        if ((dirtyFlags & 0x1410L) != 0) {
            // api target 1

            this.txtHeader.setUpMobileSectionHeadersData(manageAddressModelHeaderTypeGetValue);
        }
        if ((dirtyFlags & 0x1420L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ErrorMessageBindingAdapterKt.setPinErrorMessage(this.txtPinErrorMsg, manageAddressModelPincodeDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // manageAddressModel
        com.intellihealth.truemeds.presentation.viewmodel.ManageAddressViewModel manageAddressModel = mManageAddressModel;
        // manageAddressModel != null
        boolean manageAddressModelJavaLangObjectNull = false;



        manageAddressModelJavaLangObjectNull = (manageAddressModel) != (null);
        if (manageAddressModelJavaLangObjectNull) {


            manageAddressModel.onSelectLocationClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): manageAddressModel.chipData
        flag 1 (0x2L): manageAddressModel.otherError
        flag 2 (0x3L): manageAddressModel.address2Data
        flag 3 (0x4L): manageAddressModel.landMarkData
        flag 4 (0x5L): manageAddressModel.headerType
        flag 5 (0x6L): manageAddressModel.pincodeData
        flag 6 (0x7L): manageAddressModel.cityData
        flag 7 (0x8L): manageAddressModel.stateData
        flag 8 (0x9L): manageAddressModel.addressData
        flag 9 (0xaL): model
        flag 10 (0xbL): manageAddressModel
        flag 11 (0xcL): comingFromAccountFragment
        flag 12 (0xdL): null
        flag 13 (0xeL): manageAddressModel.chipData.getValue().errorStatus == InputFieldConstants.STATE_ERROR ? View.VISIBLE : View.GONE
        flag 14 (0xfL): manageAddressModel.chipData.getValue().errorStatus == InputFieldConstants.STATE_ERROR ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment) ? @android:string/save : @android:string/save_and_continue
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(comingFromAccountFragment) ? @android:string/save : @android:string/save_and_continue
    flag mapping end*/
    //end
}