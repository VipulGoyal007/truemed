package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetApplyCouponBindingImpl extends BottomsheetApplyCouponBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 2);
        sViewsWithIds.put(R.id.imgLeft, 3);
        sViewsWithIds.put(R.id.tvHeader, 4);
        sViewsWithIds.put(R.id.tvTimerApplyCoupon, 5);
        sViewsWithIds.put(R.id.imageClose, 6);
        sViewsWithIds.put(R.id.cl_content, 7);
        sViewsWithIds.put(R.id.tvSubHeaderContent, 8);
        sViewsWithIds.put(R.id.cl_button, 9);
        sViewsWithIds.put(R.id.btnApplyCoupon, 10);
        sViewsWithIds.put(R.id.btnRemoveCoupon, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetApplyCouponBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private BottomsheetApplyCouponBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[10]
            , (com.intellihealth.salt.views.buttons.Button) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (com.intellihealth.salt.views.chip.Chip) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvHeaderApplyCoupon.setTag(null);
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
        if (BR.applyCouponData == variableId) {
            setApplyCouponData((com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setApplyCouponData(@Nullable com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon ApplyCouponData) {
        this.mApplyCouponData = ApplyCouponData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.applyCouponData);
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
        java.lang.String applyCouponDataTitle = null;
        com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon applyCouponData = mApplyCouponData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (applyCouponData != null) {
                    // read applyCouponData.title
                    applyCouponDataTitle = applyCouponData.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeaderApplyCoupon, applyCouponDataTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): applyCouponData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}