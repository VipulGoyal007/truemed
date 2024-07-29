package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogCouponSavingBindingImpl extends DialogCouponSavingBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivClose, 5);
        sViewsWithIds.put(R.id.ivPopup, 6);
        sViewsWithIds.put(R.id.tvMessage, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogCouponSavingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private DialogCouponSavingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.chip.Chip) bindings[3]
            );
        this.btnAction.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCouponCode.setTag(null);
        this.tvHeader.setTag(null);
        this.tvTimer.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
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
        if (BR.timer == variableId) {
            setTimer((java.lang.String) variable);
        }
        else if (BR.saving == variableId) {
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

    public void setTimer(@Nullable java.lang.String Timer) {
        this.mTimer = Timer;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.timer);
        super.requestRebind();
    }
    public void setSaving(@Nullable java.lang.Double Saving) {
        this.mSaving = Saving;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.saving);
        super.requestRebind();
    }
    public void setCouponCode(@Nullable java.lang.String CouponCode) {
        this.mCouponCode = CouponCode;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.couponCode);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback Callback) {
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
        java.lang.String timer = mTimer;
        java.lang.Double saving = mSaving;
        java.lang.String couponCodeJavaLangStringApplied = null;
        java.lang.String stringValueOfSaving = null;
        double androidxDatabindingViewDataBindingSafeUnboxSaving = 0.0;
        java.lang.String couponCode = mCouponCode;
        java.lang.String javaLangStringStringValueOfSaving = null;
        com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback callback = mCallback;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x12L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(saving)
                androidxDatabindingViewDataBindingSafeUnboxSaving = androidx.databinding.ViewDataBinding.safeUnbox(saving);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(saving))
                stringValueOfSaving = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxSaving);


                // read ("₹ ") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(saving)))
                javaLangStringStringValueOfSaving = ("₹ ") + (stringValueOfSaving);
        }
        if ((dirtyFlags & 0x14L) != 0) {



                // read (couponCode) + (" applied")
                couponCodeJavaLangStringApplied = (couponCode) + (" applied");
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnAction.setOnClickListener(mCallback14);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCouponCode, couponCodeJavaLangStringApplied);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, javaLangStringStringValueOfSaving);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.tvTimer.setChipTitle(timer);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // callback
        com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback callback = mCallback;
        // callback != null
        boolean callbackJavaLangObjectNull = false;



        callbackJavaLangObjectNull = (callback) != (null);
        if (callbackJavaLangObjectNull) {


            callback.onActionButtonClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): timer
        flag 1 (0x2L): saving
        flag 2 (0x3L): couponCode
        flag 3 (0x4L): callback
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}