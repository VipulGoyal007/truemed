package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogCouponErrorBindingImpl extends DialogCouponErrorBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivClose, 3);
        sViewsWithIds.put(R.id.topCouponHeader, 4);
        sViewsWithIds.put(R.id.ivCouponSuccess, 5);
        sViewsWithIds.put(R.id.clMessage, 6);
        sViewsWithIds.put(R.id.tvDot, 7);
        sViewsWithIds.put(R.id.btnOk, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogCouponErrorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private DialogCouponErrorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCouponCodeSuccess.setTag(null);
        this.tvErrorMessage.setTag(null);
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
        if (BR.message == variableId) {
            setMessage((java.lang.String) variable);
        }
        else if (BR.cartValue == variableId) {
            setCartValue((java.lang.Integer) variable);
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

    public void setMessage(@Nullable java.lang.String Message) {
        this.mMessage = Message;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.message);
        super.requestRebind();
    }
    public void setCartValue(@Nullable java.lang.Integer CartValue) {
        this.mCartValue = CartValue;
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
        java.lang.String message = mMessage;
        java.lang.String couponCode = mCouponCode;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCouponCodeSuccess, couponCode);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvErrorMessage, message);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): message
        flag 1 (0x2L): cartValue
        flag 2 (0x3L): couponCode
        flag 3 (0x4L): callback
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}