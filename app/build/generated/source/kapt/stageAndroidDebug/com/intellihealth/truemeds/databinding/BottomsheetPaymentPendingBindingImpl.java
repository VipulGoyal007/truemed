package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetPaymentPendingBindingImpl extends BottomsheetPaymentPendingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 2);
        sViewsWithIds.put(R.id.viewDragHandle, 3);
        sViewsWithIds.put(R.id.imgLeft, 4);
        sViewsWithIds.put(R.id.tvHeader, 5);
        sViewsWithIds.put(R.id.tvSubHeader, 6);
        sViewsWithIds.put(R.id.imageClose, 7);
        sViewsWithIds.put(R.id.iv_upi_logo, 8);
        sViewsWithIds.put(R.id.tvPayUsingPayment, 9);
        sViewsWithIds.put(R.id.tvUPIPayment, 10);
        sViewsWithIds.put(R.id.tvChange, 11);
        sViewsWithIds.put(R.id.tmDivider, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetPaymentPendingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private BottomsheetPaymentPendingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.intellihealth.salt.views.RoundedImageView) bindings[8]
            , (com.intellihealth.salt.views.cards.Divider) bindings[12]
            , (com.intellihealth.salt.views.buttons.Button) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.buttons.Button) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (android.view.View) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvPay.setTag(null);
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
        if (BR.sellingPrice == variableId) {
            setSellingPrice((java.lang.Double) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.presentation.callbacks.PaymentPendingCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSellingPrice(@Nullable java.lang.Double SellingPrice) {
        this.mSellingPrice = SellingPrice;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.sellingPrice);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.intellihealth.truemeds.presentation.callbacks.PaymentPendingCallback Callback) {
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
        java.lang.String stringValueOfSellingPrice = null;
        java.lang.Double sellingPrice = mSellingPrice;
        double androidxDatabindingViewDataBindingSafeUnboxSellingPrice = 0.0;
        java.lang.String javaLangStringPayStringValueOfSellingPrice = null;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(sellingPrice)
                androidxDatabindingViewDataBindingSafeUnboxSellingPrice = androidx.databinding.ViewDataBinding.safeUnbox(sellingPrice);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(sellingPrice))
                stringValueOfSellingPrice = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxSellingPrice);


                // read ("Pay ₹") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(sellingPrice)))
                javaLangStringPayStringValueOfSellingPrice = ("Pay ₹") + (stringValueOfSellingPrice);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.tvPay.setTitle(javaLangStringPayStringValueOfSellingPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sellingPrice
        flag 1 (0x2L): callback
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}