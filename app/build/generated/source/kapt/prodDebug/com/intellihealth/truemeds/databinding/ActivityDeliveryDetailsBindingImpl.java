package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDeliveryDetailsBindingImpl extends ActivityDeliveryDetailsBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(27);
        sIncludes.setIncludes(5, 
            new String[] {"shimmer_manage_patient"},
            new int[] {20},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_manage_patient});
        sIncludes.setIncludes(15, 
            new String[] {"shimmer_manage_patient"},
            new int[] {21},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_manage_patient});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nestedScrollView, 22);
        sViewsWithIds.put(R.id.clPatient, 23);
        sViewsWithIds.put(R.id.clAddress, 24);
        sViewsWithIds.put(R.id.clFooter, 25);
        sViewsWithIds.put(R.id.clCheckout, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding mboundView15;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView19;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDeliveryDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityDeliveryDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 12
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (com.intellihealth.salt.views.buttons.Button) bindings[17]
            , (com.intellihealth.salt.views.buttons.Button) bindings[10]
            , (com.intellihealth.salt.views.buttons.Button) bindings[4]
            , (com.intellihealth.salt.views.buttons.Button) bindings[14]
            , (com.intellihealth.salt.views.buttons.Button) bindings[18]
            , (com.intellihealth.salt.views.buttons.Button) bindings[9]
            , (com.intellihealth.salt.views.buttons.Button) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[26]
            , (com.google.android.material.card.MaterialCardView) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.core.widget.NestedScrollView) bindings[22]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[15]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[5]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.DividerView) bindings[11]
            );
        this.addressListRecyclerview.setTag(null);
        this.btnAddNewAddress.setTag(null);
        this.btnAddNewPatient.setTag(null);
        this.btnAddPatient.setTag(null);
        this.btnAddress.setTag(null);
        this.btnCheckout.setTag(null);
        this.btnViewMore.setTag(null);
        this.btnViewMore1.setTag(null);
        this.clAddAddress.setTag(null);
        this.clAddPAtient.setTag(null);
        this.ivViewMore.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView15 = (com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding) bindings[21];
        setContainedBinding(this.mboundView15);
        this.mboundView19 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView5 = (com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding) bindings[20];
        setContainedBinding(this.mboundView5);
        this.patientListRecyclerview.setTag(null);
        this.shimmerViewContainerAddress.setTag(null);
        this.shimmerViewContainerPatient.setTag(null);
        this.txtDeliveryDetails.setTag(null);
        this.txtSelectAddress.setTag(null);
        this.txtSelectPatient.setTag(null);
        this.viewMoreDivider.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        mCallback32 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 3);
        mCallback31 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 2);
        mCallback37 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 8);
        mCallback35 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 6);
        mCallback36 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 7);
        mCallback33 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 4);
        mCallback34 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 5);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8000L;
        }
        mboundView5.invalidateAll();
        mboundView15.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView5.hasPendingBindings()) {
            return true;
        }
        if (mboundView15.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.addressCallback == variableId) {
            setAddressCallback((com.intellihealth.truemeds.data.callback.AddressClickCallback) variable);
        }
        else if (BR.patientCallback == variableId) {
            setPatientCallback((com.intellihealth.truemeds.data.callback.PatientClickCallback) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddressCallback(@Nullable com.intellihealth.truemeds.data.callback.AddressClickCallback AddressCallback) {
        this.mAddressCallback = AddressCallback;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.addressCallback);
        super.requestRebind();
    }
    public void setPatientCallback(@Nullable com.intellihealth.truemeds.data.callback.PatientClickCallback PatientCallback) {
        this.mPatientCallback = PatientCallback;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.patientCallback);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView5.setLifecycleOwner(lifecycleOwner);
        mboundView15.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPatientsList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>>) object, fieldId);
            case 1 :
                return onChangeViewModelShowAddressListView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelShowShimmerAddress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelShowAddPatientView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelShowPatientListView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelShowViewMoreViewLessPatientList((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelAddressList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>>) object, fieldId);
            case 7 :
                return onChangeViewModelShowShimmerPatient((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelIsLoadingView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeViewModelShowAddAddressView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeViewModelIsExpanded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelHeaderType((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPatientsList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> ViewModelPatientsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowAddressListView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowAddressListView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmerAddress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmerAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowAddPatientView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowAddPatientView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPatientListView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPatientListView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowViewMoreViewLessPatientList(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowViewMoreViewLessPatientList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAddressList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> ViewModelAddressList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmerPatient(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmerPatient, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoadingView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowAddAddressView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowAddAddressView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsExpanded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHeaderType(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> ViewModelHeaderType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
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
        int viewModelIsExpandedInt180Int0 = 0;
        boolean viewModelAddressListSizeInt0 = false;
        java.lang.Boolean viewModelIsLoadingViewGetValue = null;
        int viewModelAddressListSize = 0;
        int viewModelShowPatientListViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> viewModelPatientsList = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsExpandedGetValue = false;
        java.lang.String viewModelAddressListSizeInt0TxtSelectAddressAndroidStringSelectAddressTxtSelectAddressAndroidStringAddAddressDetails = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowAddressListView = null;
        java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> viewModelPatientsListGetValue = null;
        int viewModelShowAddPatientViewViewVISIBLEViewGONE = 0;
        java.lang.String viewModelPatientsListSizeInt0TxtSelectPatientAndroidStringSelectPatientTxtSelectPatientAndroidStringAddPersonalDetails = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowShimmerAddress = null;
        java.lang.Boolean viewModelShowAddPatientViewGetValue = null;
        java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj> viewModelAddressListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowAddPatientView = null;
        java.lang.String viewModelIsExpandedJavaLangStringViewLessJavaLangStringViewMore = null;
        int viewModelShowAddAddressViewViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPatientListViewGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewMoreViewLessPatientListGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPatientListView = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowViewMoreViewLessPatientList = null;
        com.intellihealth.truemeds.data.callback.AddressClickCallback addressCallback = mAddressCallback;
        int viewModelPatientsListSize = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddPatientViewGetValue = false;
        int viewModelShowShimmerAddressViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllAddressResponse.ResponseObj>> viewModelAddressList = null;
        int viewModelShowShimmerPatientViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowShimmerPatient = null;
        int viewModelIsLoadingViewViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingViewGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoadingView = null;
        java.lang.Boolean viewModelShowViewMoreViewLessPatientListGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerAddressGetValue = false;
        java.lang.Boolean viewModelIsExpandedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowAddAddressView = null;
        int viewModelShowViewMoreViewLessPatientListViewVISIBLEViewGONE = 0;
        int viewModelShowAddressListViewViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelShowAddressListViewGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddressListViewGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsExpanded = null;
        java.lang.Boolean viewModelShowShimmerPatientGetValue = null;
        com.intellihealth.truemeds.data.callback.PatientClickCallback patientCallback = mPatientCallback;
        int viewModelShowShimmerPatientViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerPatientGetValue = false;
        java.lang.Boolean viewModelShowAddAddressViewGetValue = null;
        java.lang.Boolean viewModelShowPatientListViewGetValue = null;
        java.lang.Boolean viewModelShowShimmerAddressGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddAddressViewGetValue = false;
        boolean viewModelPatientsListSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> viewModelHeaderType = null;
        com.intellihealth.salt.models.MobileSectionHeadersModel viewModelHeaderTypeGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel = mViewModel;
        int viewModelShowShimmerAddressViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0xd040L) != 0) {
        }
        if ((dirtyFlags & 0xe001L) != 0) {
        }
        if ((dirtyFlags & 0xffffL) != 0) {


            if ((dirtyFlags & 0xe001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.patientsList
                        viewModelPatientsList = viewModel.getPatientsList();
                    }
                    updateLiveDataRegistration(0, viewModelPatientsList);


                    if (viewModelPatientsList != null) {
                        // read viewModel.patientsList.getValue()
                        viewModelPatientsListGetValue = viewModelPatientsList.getValue();
                    }

                if ((dirtyFlags & 0xc001L) != 0) {

                        if (viewModelPatientsListGetValue != null) {
                            // read viewModel.patientsList.getValue().size
                            viewModelPatientsListSize = viewModelPatientsListGetValue.size();
                        }


                        // read viewModel.patientsList.getValue().size > 0
                        viewModelPatientsListSizeInt0 = (viewModelPatientsListSize) > (0);
                    if((dirtyFlags & 0xc001L) != 0) {
                        if(viewModelPatientsListSizeInt0) {
                                dirtyFlags |= 0x2000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000000L;
                        }
                    }


                        // read viewModel.patientsList.getValue().size > 0 ? @android:string/select_patient : @android:string/add_personal_details
                        viewModelPatientsListSizeInt0TxtSelectPatientAndroidStringSelectPatientTxtSelectPatientAndroidStringAddPersonalDetails = ((viewModelPatientsListSizeInt0) ? (txtSelectPatient.getResources().getString(R.string.select_patient)) : (txtSelectPatient.getResources().getString(R.string.add_personal_details)));
                }
            }
            if ((dirtyFlags & 0xc002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showAddressListView
                        viewModelShowAddressListView = viewModel.getShowAddressListView();
                    }
                    updateLiveDataRegistration(1, viewModelShowAddressListView);


                    if (viewModelShowAddressListView != null) {
                        // read viewModel.showAddressListView.getValue()
                        viewModelShowAddressListViewGetValue = viewModelShowAddressListView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddressListView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddressListViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowAddressListViewGetValue);
                if((dirtyFlags & 0xc002L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddressListViewGetValue) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddressListView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowAddressListViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddressListViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmerAddress
                        viewModelShowShimmerAddress = viewModel.getShowShimmerAddress();
                    }
                    updateLiveDataRegistration(2, viewModelShowShimmerAddress);


                    if (viewModelShowShimmerAddress != null) {
                        // read viewModel.showShimmerAddress.getValue()
                        viewModelShowShimmerAddressGetValue = viewModelShowShimmerAddress.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerAddress.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerAddressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerAddressGetValue);
                if((dirtyFlags & 0xc004L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerAddressGetValue) {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x40000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerAddress.getValue()) ? View.GONE : View.VISIBLE
                    viewModelShowShimmerAddressViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerAddressGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerAddress.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerAddressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerAddressGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showAddPatientView
                        viewModelShowAddPatientView = viewModel.getShowAddPatientView();
                    }
                    updateLiveDataRegistration(3, viewModelShowAddPatientView);


                    if (viewModelShowAddPatientView != null) {
                        // read viewModel.showAddPatientView.getValue()
                        viewModelShowAddPatientViewGetValue = viewModelShowAddPatientView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddPatientView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddPatientViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowAddPatientViewGetValue);
                if((dirtyFlags & 0xc008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddPatientViewGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddPatientView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowAddPatientViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddPatientViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPatientListView
                        viewModelShowPatientListView = viewModel.getShowPatientListView();
                    }
                    updateLiveDataRegistration(4, viewModelShowPatientListView);


                    if (viewModelShowPatientListView != null) {
                        // read viewModel.showPatientListView.getValue()
                        viewModelShowPatientListViewGetValue = viewModelShowPatientListView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPatientListView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPatientListViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPatientListViewGetValue);
                if((dirtyFlags & 0xc010L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPatientListViewGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPatientListView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowPatientListViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPatientListViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showViewMoreViewLessPatientList
                        viewModelShowViewMoreViewLessPatientList = viewModel.getShowViewMoreViewLessPatientList();
                    }
                    updateLiveDataRegistration(5, viewModelShowViewMoreViewLessPatientList);


                    if (viewModelShowViewMoreViewLessPatientList != null) {
                        // read viewModel.showViewMoreViewLessPatientList.getValue()
                        viewModelShowViewMoreViewLessPatientListGetValue = viewModelShowViewMoreViewLessPatientList.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showViewMoreViewLessPatientList.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewMoreViewLessPatientListGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowViewMoreViewLessPatientListGetValue);
                if((dirtyFlags & 0xc020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewMoreViewLessPatientListGetValue) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showViewMoreViewLessPatientList.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowViewMoreViewLessPatientListViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewMoreViewLessPatientListGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xd040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.addressList
                        viewModelAddressList = viewModel.getAddressList();
                    }
                    updateLiveDataRegistration(6, viewModelAddressList);


                    if (viewModelAddressList != null) {
                        // read viewModel.addressList.getValue()
                        viewModelAddressListGetValue = viewModelAddressList.getValue();
                    }

                if ((dirtyFlags & 0xc040L) != 0) {

                        if (viewModelAddressListGetValue != null) {
                            // read viewModel.addressList.getValue().size
                            viewModelAddressListSize = viewModelAddressListGetValue.size();
                        }


                        // read viewModel.addressList.getValue().size > 0
                        viewModelAddressListSizeInt0 = (viewModelAddressListSize) > (0);
                    if((dirtyFlags & 0xc040L) != 0) {
                        if(viewModelAddressListSizeInt0) {
                                dirtyFlags |= 0x200000L;
                        }
                        else {
                                dirtyFlags |= 0x100000L;
                        }
                    }


                        // read viewModel.addressList.getValue().size > 0 ? @android:string/select_address : @android:string/add_address_details
                        viewModelAddressListSizeInt0TxtSelectAddressAndroidStringSelectAddressTxtSelectAddressAndroidStringAddAddressDetails = ((viewModelAddressListSizeInt0) ? (txtSelectAddress.getResources().getString(R.string.select_address)) : (txtSelectAddress.getResources().getString(R.string.add_address_details)));
                }
            }
            if ((dirtyFlags & 0xc080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmerPatient
                        viewModelShowShimmerPatient = viewModel.getShowShimmerPatient();
                    }
                    updateLiveDataRegistration(7, viewModelShowShimmerPatient);


                    if (viewModelShowShimmerPatient != null) {
                        // read viewModel.showShimmerPatient.getValue()
                        viewModelShowShimmerPatientGetValue = viewModelShowShimmerPatient.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPatient.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerPatientGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerPatientGetValue);
                if((dirtyFlags & 0xc080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerPatientGetValue) {
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPatient.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerPatientViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerPatientGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPatient.getValue()) ? View.GONE : View.VISIBLE
                    viewModelShowShimmerPatientViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerPatientGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingView()
                        viewModelIsLoadingView = viewModel.isLoadingView();
                    }
                    updateLiveDataRegistration(8, viewModelIsLoadingView);


                    if (viewModelIsLoadingView != null) {
                        // read viewModel.isLoadingView().getValue()
                        viewModelIsLoadingViewGetValue = viewModelIsLoadingView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingView().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingViewGetValue);
                if((dirtyFlags & 0xc100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingViewGetValue) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingView().getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showAddAddressView
                        viewModelShowAddAddressView = viewModel.getShowAddAddressView();
                    }
                    updateLiveDataRegistration(9, viewModelShowAddAddressView);


                    if (viewModelShowAddAddressView != null) {
                        // read viewModel.showAddAddressView.getValue()
                        viewModelShowAddAddressViewGetValue = viewModelShowAddAddressView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddAddressView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddAddressViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowAddAddressViewGetValue);
                if((dirtyFlags & 0xc200L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddAddressViewGetValue) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddAddressView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowAddAddressViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddAddressViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isExpanded
                        viewModelIsExpanded = viewModel.isExpanded();
                    }
                    updateLiveDataRegistration(10, viewModelIsExpanded);


                    if (viewModelIsExpanded != null) {
                        // read viewModel.isExpanded.getValue()
                        viewModelIsExpandedGetValue = viewModelIsExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsExpandedGetValue);
                if((dirtyFlags & 0xc400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsExpandedGetValue) {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isExpanded.getValue()) ? 180 : 0
                    viewModelIsExpandedInt180Int0 = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsExpandedGetValue) ? (180) : (0));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isExpanded.getValue()) ? "View less" : "View More"
                    viewModelIsExpandedJavaLangStringViewLessJavaLangStringViewMore = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsExpandedGetValue) ? ("View less") : ("View More"));
            }
            if ((dirtyFlags & 0xc800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.headerType
                        viewModelHeaderType = viewModel.getHeaderType();
                    }
                    updateLiveDataRegistration(11, viewModelHeaderType);


                    if (viewModelHeaderType != null) {
                        // read viewModel.headerType.getValue()
                        viewModelHeaderTypeGetValue = viewModelHeaderType.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc002L) != 0) {
            // api target 1

            this.addressListRecyclerview.setVisibility(viewModelShowAddressListViewViewVISIBLEViewGONE);
            this.btnAddress.setVisibility(viewModelShowAddressListViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xd040L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.DeliveryDetailsBindingAdapterKt.setDeliveryDetailsAddressList(this.addressListRecyclerview, viewModelAddressListGetValue, viewModel, addressCallback);
        }
        if ((dirtyFlags & 0x8000L) != 0) {
            // api target 1

            this.btnAddNewAddress.setOnClickListener(mCallback36);
            this.btnAddNewPatient.setOnClickListener(mCallback34);
            this.btnAddPatient.setOnClickListener(mCallback30);
            this.btnAddress.setOnClickListener(mCallback35);
            this.btnCheckout.setOnClickListener(mCallback37);
            this.btnViewMore.setOnClickListener(mCallback33);
            this.btnViewMore1.setOnClickListener(mCallback31);
            this.ivViewMore.setOnClickListener(mCallback32);
        }
        if ((dirtyFlags & 0xc200L) != 0) {
            // api target 1

            this.btnAddNewAddress.setVisibility(viewModelShowAddAddressViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc008L) != 0) {
            // api target 1

            this.btnAddNewPatient.setVisibility(viewModelShowAddPatientViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc010L) != 0) {
            // api target 1

            this.btnAddPatient.setVisibility(viewModelShowPatientListViewViewVISIBLEViewGONE);
            this.patientListRecyclerview.setVisibility(viewModelShowPatientListViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc400L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.DeliveryDetailsBindingAdapterKt.setListStatus(this.btnViewMore, androidxDatabindingViewDataBindingSafeUnboxViewModelIsExpandedGetValue);
            this.btnViewMore1.setTitle(viewModelIsExpandedJavaLangStringViewLessJavaLangStringViewMore);
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.ivViewMore.setRotation(viewModelIsExpandedInt180Int0);
            }
        }
        if ((dirtyFlags & 0xc020L) != 0) {
            // api target 1

            this.btnViewMore1.setVisibility(viewModelShowViewMoreViewLessPatientListViewVISIBLEViewGONE);
            this.ivViewMore.setVisibility(viewModelShowViewMoreViewLessPatientListViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc004L) != 0) {
            // api target 1

            this.clAddAddress.setVisibility(viewModelShowShimmerAddressViewGONEViewVISIBLE);
            this.shimmerViewContainerAddress.setVisibility(viewModelShowShimmerAddressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc080L) != 0) {
            // api target 1

            this.clAddPAtient.setVisibility(viewModelShowShimmerPatientViewGONEViewVISIBLE);
            this.shimmerViewContainerPatient.setVisibility(viewModelShowShimmerPatientViewVISIBLEViewGONE);
            this.viewMoreDivider.setVisibility(viewModelShowShimmerPatientViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc100L) != 0) {
            // api target 1

            this.mboundView19.setVisibility(viewModelIsLoadingViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xe001L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.DeliveryDetailsBindingAdapterKt.setDeliveryDetailsPatientsList(this.patientListRecyclerview, viewModelPatientsListGetValue, viewModel, patientCallback);
        }
        if ((dirtyFlags & 0xc800L) != 0) {
            // api target 1

            this.txtDeliveryDetails.setUpMobileSectionHeadersData(viewModelHeaderTypeGetValue);
        }
        if ((dirtyFlags & 0xc040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSelectAddress, viewModelAddressListSizeInt0TxtSelectAddressAndroidStringSelectAddressTxtSelectAddressAndroidStringAddAddressDetails);
        }
        if ((dirtyFlags & 0xc001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSelectPatient, viewModelPatientsListSizeInt0TxtSelectPatientAndroidStringSelectPatientTxtSelectPatientAndroidStringAddPersonalDetails);
        }
        executeBindingsOn(mboundView5);
        executeBindingsOn(mboundView15);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.addNewPatientsButtonClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.changeListStatus();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.changeListStatus();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.proceedToCheckoutClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.addNewAddressButtonClick();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.addNewAddressButtonClick();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.changeListStatus();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.DeliveryDetailsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.addNewPatientsButtonClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.patientsList
        flag 1 (0x2L): viewModel.showAddressListView
        flag 2 (0x3L): viewModel.showShimmerAddress
        flag 3 (0x4L): viewModel.showAddPatientView
        flag 4 (0x5L): viewModel.showPatientListView
        flag 5 (0x6L): viewModel.showViewMoreViewLessPatientList
        flag 6 (0x7L): viewModel.addressList
        flag 7 (0x8L): viewModel.showShimmerPatient
        flag 8 (0x9L): viewModel.isLoadingView()
        flag 9 (0xaL): viewModel.showAddAddressView
        flag 10 (0xbL): viewModel.isExpanded
        flag 11 (0xcL): viewModel.headerType
        flag 12 (0xdL): addressCallback
        flag 13 (0xeL): patientCallback
        flag 14 (0xfL): viewModel
        flag 15 (0x10L): null
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isExpanded.getValue()) ? 180 : 0
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isExpanded.getValue()) ? 180 : 0
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPatientListView.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPatientListView.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.addressList.getValue().size > 0 ? @android:string/select_address : @android:string/add_address_details
        flag 21 (0x16L): viewModel.addressList.getValue().size > 0 ? @android:string/select_address : @android:string/add_address_details
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddPatientView.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddPatientView.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.patientsList.getValue().size > 0 ? @android:string/select_patient : @android:string/add_personal_details
        flag 25 (0x1aL): viewModel.patientsList.getValue().size > 0 ? @android:string/select_patient : @android:string/add_personal_details
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isExpanded.getValue()) ? "View less" : "View More"
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isExpanded.getValue()) ? "View less" : "View More"
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddAddressView.getValue()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddAddressView.getValue()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerAddress.getValue()) ? View.GONE : View.VISIBLE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerAddress.getValue()) ? View.GONE : View.VISIBLE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPatient.getValue()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPatient.getValue()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingView().getValue()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingView().getValue()) ? View.VISIBLE : View.GONE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showViewMoreViewLessPatientList.getValue()) ? View.VISIBLE : View.GONE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showViewMoreViewLessPatientList.getValue()) ? View.VISIBLE : View.GONE
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddressListView.getValue()) ? View.VISIBLE : View.GONE
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddressListView.getValue()) ? View.VISIBLE : View.GONE
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPatient.getValue()) ? View.GONE : View.VISIBLE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPatient.getValue()) ? View.GONE : View.VISIBLE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerAddress.getValue()) ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerAddress.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}