package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetDoctorFraudBindingImpl extends BottomsheetDoctorFraudBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivClose, 3);
        sViewsWithIds.put(R.id.ivTopImage, 4);
        sViewsWithIds.put(R.id.tvThankYou, 5);
        sViewsWithIds.put(R.id.tvHeader, 6);
        sViewsWithIds.put(R.id.tvNewBill, 7);
        sViewsWithIds.put(R.id.btnThankYou, 8);
        sViewsWithIds.put(R.id.btnDontOpt, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetDoctorFraudBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private BottomsheetDoctorFraudBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[9]
            , (com.intellihealth.salt.views.buttons.Button) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDiscount.setTag(null);
        this.tvSellingPrice.setTag(null);
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
        if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.presentation.callbacks.DoctorFraudCallback) variable);
        }
        else if (BR.sellingPrice == variableId) {
            setSellingPrice((java.lang.Double) variable);
        }
        else if (BR.view == variableId) {
            setView((android.view.View) variable);
        }
        else if (BR.discountPercentage == variableId) {
            setDiscountPercentage((java.lang.Double) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallback(@Nullable com.intellihealth.truemeds.presentation.callbacks.DoctorFraudCallback Callback) {
        this.mCallback = Callback;
    }
    public void setSellingPrice(@Nullable java.lang.Double SellingPrice) {
        this.mSellingPrice = SellingPrice;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.sellingPrice);
        super.requestRebind();
    }
    public void setView(@Nullable android.view.View View) {
        this.mView = View;
    }
    public void setDiscountPercentage(@Nullable java.lang.Double DiscountPercentage) {
        this.mDiscountPercentage = DiscountPercentage;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.discountPercentage);
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
        java.lang.String stringValueOfSellingPrice = null;
        java.lang.String javaLangStringStringValueOfDiscountPercentageJavaLangString = null;
        java.lang.String javaLangStringStringValueOfDiscountPercentage = null;
        java.lang.Double sellingPrice = mSellingPrice;
        java.lang.String javaLangStringStringValueOfSellingPrice = null;
        double androidxDatabindingViewDataBindingSafeUnboxSellingPrice = 0.0;
        double androidxDatabindingViewDataBindingSafeUnboxDiscountPercentage = 0.0;
        java.lang.String stringValueOfDiscountPercentage = null;
        java.lang.Double discountPercentage = mDiscountPercentage;

        if ((dirtyFlags & 0x12L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(sellingPrice)
                androidxDatabindingViewDataBindingSafeUnboxSellingPrice = androidx.databinding.ViewDataBinding.safeUnbox(sellingPrice);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(sellingPrice))
                stringValueOfSellingPrice = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxSellingPrice);


                // read ("₹") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(sellingPrice)))
                javaLangStringStringValueOfSellingPrice = ("₹") + (stringValueOfSellingPrice);
        }
        if ((dirtyFlags & 0x18L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(discountPercentage)
                androidxDatabindingViewDataBindingSafeUnboxDiscountPercentage = androidx.databinding.ViewDataBinding.safeUnbox(discountPercentage);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(discountPercentage))
                stringValueOfDiscountPercentage = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxDiscountPercentage);


                // read ("(-") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(discountPercentage)))
                javaLangStringStringValueOfDiscountPercentage = ("(-") + (stringValueOfDiscountPercentage);


                // read (("(-") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(discountPercentage)))) + (")")
                javaLangStringStringValueOfDiscountPercentageJavaLangString = (javaLangStringStringValueOfDiscountPercentage) + (")");
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDiscount, javaLangStringStringValueOfDiscountPercentageJavaLangString);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSellingPrice, javaLangStringStringValueOfSellingPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): callback
        flag 1 (0x2L): sellingPrice
        flag 2 (0x3L): view
        flag 3 (0x4L): discountPercentage
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}