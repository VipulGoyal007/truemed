package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdapterTimeIntervalItemDefaultBindingImpl extends AdapterTimeIntervalItemDefaultBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.radio, 1);
        sViewsWithIds.put(R.id.radioHeader, 2);
        sViewsWithIds.put(R.id.tvRadioLabel, 3);
        sViewsWithIds.put(R.id.textSelectedCustomDates, 4);
        sViewsWithIds.put(R.id.ivEditCustomDates, 5);
        sViewsWithIds.put(R.id.divider_timer_interval, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdapterTimeIntervalItemDefaultBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private AdapterTimeIntervalItemDefaultBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.cards.Divider) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.intellihealth.salt.views.radiofield.RadioFieldLayout) bindings[1]
            , (com.intellihealth.salt.views.radiofield.Radio) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.timeIntervalData == variableId) {
            setTimeIntervalData((com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTimeIntervalData(@Nullable com.intellihealth.truemeds.data.model.wallet.TimeIntervalBottomSheetModel TimeIntervalData) {
        this.mTimeIntervalData = TimeIntervalData;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): timeIntervalData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}