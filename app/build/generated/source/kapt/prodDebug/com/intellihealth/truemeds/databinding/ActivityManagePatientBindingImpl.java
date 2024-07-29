package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityManagePatientBindingImpl extends ActivityManagePatientBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(1, 
            new String[] {"shimmer_manage_patient"},
            new int[] {6},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_manage_patient});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tmTopHeader, 7);
        sViewsWithIds.put(R.id.ivNoPatientYet, 8);
        sViewsWithIds.put(R.id.progressBar, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityManagePatientBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityManagePatientBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (com.intellihealth.salt.views.buttons.Button) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (android.widget.ProgressBar) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[1]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[7]
            );
        this.btnAddNewPatients.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding) bindings[6];
        setContainedBinding(this.mboundView1);
        this.mboundView5 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.rlNoPatientView.setTag(null);
        this.rvPatientList.setTag(null);
        this.shimmerViewContainer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback40 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        mboundView1.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView1.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelShowShimmer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelShowPatientListView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelPatientsList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>>) object, fieldId);
            case 4 :
                return onChangeViewModelShowAddPatientView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeViewModelShowShimmer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPatientListView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPatientListView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPatientsList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> ViewModelPatientsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowAddPatientView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowAddPatientView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = false;
        java.lang.Boolean viewModelShowShimmerGetValue = null;
        java.lang.Boolean viewModelShowPatientListViewGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPatientListViewGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowShimmer = null;
        int viewModelShowShimmerViewVISIBLEViewGONE = 0;
        int viewModelShowPatientListViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPatientListView = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient>> viewModelPatientsList = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddPatientViewGetValue = false;
        java.util.List<com.intellihealth.truemeds.data.model.user.GetAllPatientResponse.Patient> viewModelPatientsListGetValue = null;
        int viewModelShowAddPatientViewViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelShowAddPatientViewGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowAddPatientView = null;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        int viewModelLoaderValueViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

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
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmer
                        viewModelShowShimmer = viewModel.getShowShimmer();
                    }
                    updateLiveDataRegistration(1, viewModelShowShimmer);


                    if (viewModelShowShimmer != null) {
                        // read viewModel.showShimmer.getValue()
                        viewModelShowShimmerGetValue = viewModelShowShimmer.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerGetValue);
                if((dirtyFlags & 0x62L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPatientListView
                        viewModelShowPatientListView = viewModel.getShowPatientListView();
                    }
                    updateLiveDataRegistration(2, viewModelShowPatientListView);


                    if (viewModelShowPatientListView != null) {
                        // read viewModel.showPatientListView.getValue()
                        viewModelShowPatientListViewGetValue = viewModelShowPatientListView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPatientListView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPatientListViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPatientListViewGetValue);
                if((dirtyFlags & 0x64L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPatientListViewGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPatientListView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowPatientListViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPatientListViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.patientsList
                        viewModelPatientsList = viewModel.getPatientsList();
                    }
                    updateLiveDataRegistration(3, viewModelPatientsList);


                    if (viewModelPatientsList != null) {
                        // read viewModel.patientsList.getValue()
                        viewModelPatientsListGetValue = viewModelPatientsList.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showAddPatientView
                        viewModelShowAddPatientView = viewModel.getShowAddPatientView();
                    }
                    updateLiveDataRegistration(4, viewModelShowAddPatientView);


                    if (viewModelShowAddPatientView != null) {
                        // read viewModel.showAddPatientView.getValue()
                        viewModelShowAddPatientViewGetValue = viewModelShowAddPatientView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddPatientView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddPatientViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowAddPatientViewGetValue);
                if((dirtyFlags & 0x70L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddPatientViewGetValue) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddPatientView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowAddPatientViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowAddPatientViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.btnAddNewPatients.setOnClickListener(mCallback40);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelLoaderValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.rlNoPatientView.setVisibility(viewModelShowAddPatientViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.rvPatientList.setVisibility(viewModelShowPatientListViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.PatientListBindingAdapterKt.setAddPatientList(this.rvPatientList, viewModelPatientsListGetValue, viewModel);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.shimmerViewContainer.setVisibility(viewModelShowShimmerViewVISIBLEViewGONE);
        }
        executeBindingsOn(mboundView1);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.ManagePatientViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.addNewPatientsButtonClick();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loaderValue
        flag 1 (0x2L): viewModel.showShimmer
        flag 2 (0x3L): viewModel.showPatientListView
        flag 3 (0x4L): viewModel.patientsList
        flag 4 (0x5L): viewModel.showAddPatientView
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPatientListView.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPatientListView.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddPatientView.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showAddPatientView.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}