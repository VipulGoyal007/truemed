package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PastPrescriptionBottomsheetBindingImpl extends PastPrescriptionBottomsheetBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewDragHandle, 4);
        sViewsWithIds.put(R.id.tvHeader, 5);
        sViewsWithIds.put(R.id.imageClose, 6);
        sViewsWithIds.put(R.id.ivShadow, 7);
        sViewsWithIds.put(R.id.topCardCtl, 8);
        sViewsWithIds.put(R.id.mainCardCtl, 9);
        sViewsWithIds.put(R.id.topHeaderCtl, 10);
        sViewsWithIds.put(R.id.dropDownHeader, 11);
        sViewsWithIds.put(R.id.tvPatientNameHeader, 12);
        sViewsWithIds.put(R.id.rvAllPatientPastPrescription, 13);
        sViewsWithIds.put(R.id.dropDownDefault, 14);
        sViewsWithIds.put(R.id.bottomLine, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PastPrescriptionBottomsheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private PastPrescriptionBottomsheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.intellihealth.salt.views.dropdown.DropDownDefault) bindings[14]
            , (com.intellihealth.salt.views.dropdown.DropDownHeader) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.view.View) bindings[4]
            );
        this.clProgress.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.uploadBtn.setTag(null);
        this.uploadCtl.setTag(null);
        setRootTag(root);
        // listeners
        mCallback58 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.patientId == variableId) {
            setPatientId((java.lang.String) variable);
        }
        else if (BR.bottomSheetCloseCallBAck == variableId) {
            setBottomSheetCloseCallBAck((com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPatientId(@Nullable java.lang.String PatientId) {
        this.mPatientId = PatientId;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.patientId);
        super.requestRebind();
    }
    public void setBottomSheetCloseCallBAck(@Nullable com.intellihealth.truemeds.data.callback.BottomSheetCloseCallback BottomSheetCloseCallBAck) {
        this.mBottomSheetCloseCallBAck = BottomSheetCloseCallBAck;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoadingForPrescriptions((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsPastPrescriptionSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadingForPrescriptions(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoadingForPrescriptions, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsPastPrescriptionSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsPastPrescriptionSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingForPrescriptionsGetValue = false;
        int viewModelIsPastPrescriptionSelectedViewVISIBLEViewINVISIBLE = 0;
        java.lang.Boolean viewModelIsLoadingForPrescriptionsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoadingForPrescriptions = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsPastPrescriptionSelected = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsPastPrescriptionSelectedGetValue = false;
        java.lang.String patientId = mPatientId;
        int viewModelIsLoadingForPrescriptionsViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsPastPrescriptionSelectedGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x33L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadingForPrescriptions()
                        viewModelIsLoadingForPrescriptions = viewModel.isLoadingForPrescriptions();
                    }
                    updateLiveDataRegistration(0, viewModelIsLoadingForPrescriptions);


                    if (viewModelIsLoadingForPrescriptions != null) {
                        // read viewModel.isLoadingForPrescriptions().getValue()
                        viewModelIsLoadingForPrescriptionsGetValue = viewModelIsLoadingForPrescriptions.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingForPrescriptions().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingForPrescriptionsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingForPrescriptionsGetValue);
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingForPrescriptionsGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingForPrescriptions().getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingForPrescriptionsViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingForPrescriptionsGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isPastPrescriptionSelected
                        viewModelIsPastPrescriptionSelected = viewModel.isPastPrescriptionSelected();
                    }
                    updateLiveDataRegistration(1, viewModelIsPastPrescriptionSelected);


                    if (viewModelIsPastPrescriptionSelected != null) {
                        // read viewModel.isPastPrescriptionSelected.getValue()
                        viewModelIsPastPrescriptionSelectedGetValue = viewModelIsPastPrescriptionSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPastPrescriptionSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsPastPrescriptionSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsPastPrescriptionSelectedGetValue);
                if((dirtyFlags & 0x32L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsPastPrescriptionSelectedGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPastPrescriptionSelected.getValue()) ? View.VISIBLE : View.INVISIBLE
                    viewModelIsPastPrescriptionSelectedViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsPastPrescriptionSelectedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.clProgress.setVisibility(viewModelIsLoadingForPrescriptionsViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.uploadBtn.setOnClickListener(mCallback58);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.uploadCtl.setVisibility(viewModelIsPastPrescriptionSelectedViewVISIBLEViewINVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // patientId
        java.lang.String patientId = mPatientId;
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.uploadPastPrescriptionData(patientId);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoadingForPrescriptions()
        flag 1 (0x2L): viewModel.isPastPrescriptionSelected
        flag 2 (0x3L): patientId
        flag 3 (0x4L): bottomSheetCloseCallBAck
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPastPrescriptionSelected.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPastPrescriptionSelected.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingForPrescriptions().getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadingForPrescriptions().getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}