package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetDoctorCallBindingImpl extends BottomsheetDoctorCallBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageClose, 3);
        sViewsWithIds.put(R.id.imageDoctorCall, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetDoctorCallBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private BottomsheetDoctorCallBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvHeaderDoctorCall.setTag(null);
        this.tvSubHeaderDoctorCall.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.doctorCallData == variableId) {
            setDoctorCallData((com.intellihealth.truemeds.data.model.home.DoctorCallBottomSheetModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDoctorCallData(@Nullable com.intellihealth.truemeds.data.model.home.DoctorCallBottomSheetModel DoctorCallData) {
        this.mDoctorCallData = DoctorCallData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.doctorCallData);
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
        java.lang.String doctorCallDataHeader = null;
        java.lang.String doctorCallDataSubHeader = null;
        com.intellihealth.truemeds.data.model.home.DoctorCallBottomSheetModel doctorCallData = mDoctorCallData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (doctorCallData != null) {
                    // read doctorCallData.header
                    doctorCallDataHeader = doctorCallData.getHeader();
                    // read doctorCallData.subHeader
                    doctorCallDataSubHeader = doctorCallData.getSubHeader();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeaderDoctorCall, doctorCallDataHeader);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubHeaderDoctorCall, doctorCallDataSubHeader);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): doctorCallData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}