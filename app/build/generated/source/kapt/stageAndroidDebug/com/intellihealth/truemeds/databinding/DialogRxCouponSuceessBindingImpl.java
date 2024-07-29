package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogRxCouponSuceessBindingImpl extends DialogRxCouponSuceessBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivClose, 3);
        sViewsWithIds.put(R.id.ivCouponSuccess, 4);
        sViewsWithIds.put(R.id.tvSaving, 5);
        sViewsWithIds.put(R.id.tvTimer, 6);
        sViewsWithIds.put(R.id.btnOk, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogRxCouponSuceessBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private DialogRxCouponSuceessBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.chip.Chip) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCouponCodeSuccess.setTag(null);
        this.tvCouponSuccessSavings.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.saving == variableId) {
            setSaving((java.lang.Double) variable);
        }
        else if (BR.couponCode == variableId) {
            setCouponCode((java.lang.String) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSaving(@Nullable java.lang.Double Saving) {
        this.mSaving = Saving;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.saving);
        super.requestRebind();
    }
    public void setCouponCode(@Nullable java.lang.String CouponCode) {
        this.mCouponCode = CouponCode;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.couponCode);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback Callback) {
        this.mCallback = Callback;
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
        java.lang.Double saving = mSaving;
        java.lang.String couponCodeJavaLangStringApplied = null;
        java.lang.String stringValueOfSaving = null;
        double androidxDatabindingViewDataBindingSafeUnboxSaving = 0.0;
        java.lang.String couponCode = mCouponCode;
        java.lang.String javaLangStringStringValueOfSaving = null;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(saving)
                androidxDatabindingViewDataBindingSafeUnboxSaving = androidx.databinding.ViewDataBinding.safeUnbox(saving);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(saving))
                stringValueOfSaving = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxSaving);


                // read ("₹ ") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(saving)))
                javaLangStringStringValueOfSaving = ("₹ ") + (stringValueOfSaving);
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read (couponCode) + (" applied")
                couponCodeJavaLangStringApplied = (couponCode) + (" applied");
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCouponCodeSuccess, couponCodeJavaLangStringApplied);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCouponSuccessSavings, javaLangStringStringValueOfSaving);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): saving
        flag 1 (0x2L): couponCode
        flag 2 (0x3L): callback
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}