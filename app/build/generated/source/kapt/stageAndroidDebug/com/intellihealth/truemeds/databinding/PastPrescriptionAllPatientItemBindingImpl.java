package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class PastPrescriptionAllPatientItemBindingImpl extends PastPrescriptionAllPatientItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public PastPrescriptionAllPatientItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private PastPrescriptionAllPatientItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvPrescription.setTag(null);
        this.tvHeader.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModell == variableId) {
            setViewModell((com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel) variable);
        }
        else if (BR.pastPrescriptionModel == variableId) {
            setPastPrescriptionModel((com.intellihealth.truemeds.data.model.prescription.PastPrescriptions) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModell(@Nullable com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel ViewModell) {
        this.mViewModell = ViewModell;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModell);
        super.requestRebind();
    }
    public void setPastPrescriptionModel(@Nullable com.intellihealth.truemeds.data.model.prescription.PastPrescriptions PastPrescriptionModel) {
        this.mPastPrescriptionModel = PastPrescriptionModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.pastPrescriptionModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.intellihealth.truemeds.presentation.viewmodel.PrescriptionViewModel viewModell = mViewModell;
        java.lang.String pastPrescriptionModelCreatedDate = null;
        java.util.List<com.intellihealth.truemeds.data.model.prescription.ActiveRx> pastPrescriptionModelActiveRxList = null;
        com.intellihealth.truemeds.data.model.prescription.PastPrescriptions pastPrescriptionModel = mPastPrescriptionModel;
        int pastPrescriptionModelParentIndex = 0;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (pastPrescriptionModel != null) {
                        // read pastPrescriptionModel.createdDate
                        pastPrescriptionModelCreatedDate = pastPrescriptionModel.getCreatedDate();
                    }
            }

                if (pastPrescriptionModel != null) {
                    // read pastPrescriptionModel.activeRxList
                    pastPrescriptionModelActiveRxList = pastPrescriptionModel.getActiveRxList();
                    // read pastPrescriptionModel.parentIndex
                    pastPrescriptionModelParentIndex = pastPrescriptionModel.getParentIndex();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.PastPrescriptionItemBindingKt.setPastPrescriptionDetailsList(this.rvPrescription, pastPrescriptionModelActiveRxList, pastPrescriptionModelParentIndex, viewModell);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, pastPrescriptionModelCreatedDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModell
        flag 1 (0x2L): pastPrescriptionModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}