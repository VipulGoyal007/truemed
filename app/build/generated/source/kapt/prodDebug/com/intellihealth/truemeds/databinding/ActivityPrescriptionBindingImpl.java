package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPrescriptionBindingImpl extends ActivityPrescriptionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvHeader, 5);
        sViewsWithIds.put(R.id.tvSubHeader, 6);
        sViewsWithIds.put(R.id.view, 7);
        sViewsWithIds.put(R.id.tvNextStep, 8);
        sViewsWithIds.put(R.id.prescriptionCardCtl, 9);
        sViewsWithIds.put(R.id.prescriptionCardImg, 10);
        sViewsWithIds.put(R.id.prescriptionHeaderTv, 11);
        sViewsWithIds.put(R.id.prescriptionSubHeaderTv, 12);
        sViewsWithIds.put(R.id.tmChip3, 13);
        sViewsWithIds.put(R.id.bottomLine, 14);
        sViewsWithIds.put(R.id.btnCheckout, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPrescriptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityPrescriptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (com.intellihealth.salt.views.buttons.Button) bindings[15]
            , (com.intellihealth.salt.views.buttons.Button) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            );
        this.btnUpload.setTag(null);
        this.clCheckout.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mobileSectionHeadersDefaultWithoutFill.setTag(null);
        this.rvPrescription.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.prescriptionViewModel == variableId) {
            setPrescriptionViewModel((com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPrescriptionViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel PrescriptionViewModel) {
        this.mPrescriptionViewModel = PrescriptionViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.prescriptionViewModel);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePrescriptionViewModelPrescriptions((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>>) object, fieldId);
            case 1 :
                return onChangePrescriptionViewModelHeaderType((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePrescriptionViewModelPrescriptions(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> PrescriptionViewModelPrescriptions, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePrescriptionViewModelHeaderType(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> PrescriptionViewModelHeaderType, int fieldId) {
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
        int prescriptionViewModelPrescriptionsSize = 0;
        com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel prescriptionViewModel = mPrescriptionViewModel;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> prescriptionViewModelPrescriptions = null;
        java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> prescriptionViewModelPrescriptionsGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.MobileSectionHeadersModel> prescriptionViewModelHeaderType = null;
        com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback = mCallback;
        int prescriptionViewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE = 0;
        boolean prescriptionViewModelPrescriptionsSizeInt0 = false;
        com.intellihealth.salt.models.MobileSectionHeadersModel prescriptionViewModelHeaderTypeGetValue = null;
        int prescriptionViewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE = 0;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x1dL) != 0) {

                    if (prescriptionViewModel != null) {
                        // read prescriptionViewModel.prescriptions
                        prescriptionViewModelPrescriptions = prescriptionViewModel.getPrescriptions();
                    }
                    updateLiveDataRegistration(0, prescriptionViewModelPrescriptions);


                    if (prescriptionViewModelPrescriptions != null) {
                        // read prescriptionViewModel.prescriptions.getValue()
                        prescriptionViewModelPrescriptionsGetValue = prescriptionViewModelPrescriptions.getValue();
                    }

                if ((dirtyFlags & 0x15L) != 0) {

                        if (prescriptionViewModelPrescriptionsGetValue != null) {
                            // read prescriptionViewModel.prescriptions.getValue().size()
                            prescriptionViewModelPrescriptionsSize = prescriptionViewModelPrescriptionsGetValue.size();
                        }


                        // read prescriptionViewModel.prescriptions.getValue().size() > 0
                        prescriptionViewModelPrescriptionsSizeInt0 = (prescriptionViewModelPrescriptionsSize) > (0);
                    if((dirtyFlags & 0x15L) != 0) {
                        if(prescriptionViewModelPrescriptionsSizeInt0) {
                                dirtyFlags |= 0x40L;
                                dirtyFlags |= 0x100L;
                        }
                        else {
                                dirtyFlags |= 0x20L;
                                dirtyFlags |= 0x80L;
                        }
                    }


                        // read prescriptionViewModel.prescriptions.getValue().size() > 0 ? View.VISIBLE : View.GONE
                        prescriptionViewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE = ((prescriptionViewModelPrescriptionsSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read prescriptionViewModel.prescriptions.getValue().size() > 0 ? View.GONE : View.VISIBLE
                        prescriptionViewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE = ((prescriptionViewModelPrescriptionsSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x16L) != 0) {

                    if (prescriptionViewModel != null) {
                        // read prescriptionViewModel.headerType
                        prescriptionViewModelHeaderType = prescriptionViewModel.getHeaderType();
                    }
                    updateLiveDataRegistration(1, prescriptionViewModelHeaderType);


                    if (prescriptionViewModelHeaderType != null) {
                        // read prescriptionViewModel.headerType.getValue()
                        prescriptionViewModelHeaderTypeGetValue = prescriptionViewModelHeaderType.getValue();
                    }
            }
        }
        if ((dirtyFlags & 0x1dL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            this.btnUpload.setVisibility(prescriptionViewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE);
            this.clCheckout.setVisibility(prescriptionViewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE);
            this.rvPrescription.setVisibility(prescriptionViewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.mobileSectionHeadersDefaultWithoutFill.setUpMobileSectionHeadersData(prescriptionViewModelHeaderTypeGetValue);
        }
        if ((dirtyFlags & 0x1dL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setPrescriptionList(this.rvPrescription, prescriptionViewModelPrescriptionsGetValue, callback, true, true);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): prescriptionViewModel.prescriptions
        flag 1 (0x2L): prescriptionViewModel.headerType
        flag 2 (0x3L): prescriptionViewModel
        flag 3 (0x4L): callback
        flag 4 (0x5L): null
        flag 5 (0x6L): prescriptionViewModel.prescriptions.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 6 (0x7L): prescriptionViewModel.prescriptions.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 7 (0x8L): prescriptionViewModel.prescriptions.getValue().size() > 0 ? View.GONE : View.VISIBLE
        flag 8 (0x9L): prescriptionViewModel.prescriptions.getValue().size() > 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}