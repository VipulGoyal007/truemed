package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogReplaceSavingsBindingImpl extends DialogReplaceSavingsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivClose, 2);
        sViewsWithIds.put(R.id.ivCouponSuccess, 3);
        sViewsWithIds.put(R.id.tvCouponCodeSuccess, 4);
        sViewsWithIds.put(R.id.tvSaving, 5);
        sViewsWithIds.put(R.id.btnOk, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogReplaceSavingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DialogReplaceSavingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCouponSuccessSavings.setTag(null);
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
        if (BR.saving == variableId) {
            setSaving((java.lang.Double) variable);
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
        java.lang.String stringValueOfSaving = null;
        double androidxDatabindingViewDataBindingSafeUnboxSaving = 0.0;
        java.lang.String javaLangStringSavedStringValueOfSaving = null;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(saving)
                androidxDatabindingViewDataBindingSafeUnboxSaving = androidx.databinding.ViewDataBinding.safeUnbox(saving);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(saving))
                stringValueOfSaving = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxSaving);


                // read ("Saved ₹ ") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(saving)))
                javaLangStringSavedStringValueOfSaving = ("Saved ₹ ") + (stringValueOfSaving);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCouponSuccessSavings, javaLangStringSavedStringValueOfSaving);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): saving
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}