package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ReminderItemBindingImpl extends ReminderItemBinding  {

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

    public ReminderItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ReminderItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.ReferralStage) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.referralReminder.setTag(null);
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
        if (BR.referralCallback == variableId) {
            setReferralCallback((com.intellihealth.salt.callbacks.ReferralStageCallback) variable);
        }
        else if (BR.referralStageData == variableId) {
            setReferralStageData((com.intellihealth.salt.models.ReferralStageModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReferralCallback(@Nullable com.intellihealth.salt.callbacks.ReferralStageCallback ReferralCallback) {
        this.mReferralCallback = ReferralCallback;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.referralCallback);
        super.requestRebind();
    }
    public void setReferralStageData(@Nullable com.intellihealth.salt.models.ReferralStageModel ReferralStageData) {
        this.mReferralStageData = ReferralStageData;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.referralStageData);
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
        com.intellihealth.salt.callbacks.ReferralStageCallback referralCallback = mReferralCallback;
        com.intellihealth.salt.models.ReferralStageModel referralStageData = mReferralStageData;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.referralReminder.setReferralStageData(referralStageData);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.referralReminder.setReferralStageCallback(referralCallback);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): referralCallback
        flag 1 (0x2L): referralStageData
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}