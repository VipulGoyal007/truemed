package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetRatingsBindingImpl extends BottomsheetRatingsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 2);
        sViewsWithIds.put(R.id.btnSkip, 3);
        sViewsWithIds.put(R.id.tvHeader, 4);
        sViewsWithIds.put(R.id.clRatingStar, 5);
        sViewsWithIds.put(R.id.ratingFeedback, 6);
        sViewsWithIds.put(R.id.clDetailedFeedback, 7);
        sViewsWithIds.put(R.id.tvFeedback, 8);
        sViewsWithIds.put(R.id.chipCustomer, 9);
        sViewsWithIds.put(R.id.chipDiscount, 10);
        sViewsWithIds.put(R.id.chipDeliveryTime, 11);
        sViewsWithIds.put(R.id.chipOrderExperience, 12);
        sViewsWithIds.put(R.id.chipMedicineQuality, 13);
        sViewsWithIds.put(R.id.tvFeedbackError, 14);
        sViewsWithIds.put(R.id.tmFeedbackInput, 15);
        sViewsWithIds.put(R.id.tmFeedbackInputError, 16);
        sViewsWithIds.put(R.id.btnSubmit, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetRatingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private BottomsheetRatingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[3]
            , (com.intellihealth.salt.views.buttons.Button) bindings[17]
            , (com.intellihealth.salt.views.chip.Chip) bindings[9]
            , (com.intellihealth.salt.views.chip.Chip) bindings[11]
            , (com.intellihealth.salt.views.chip.Chip) bindings[10]
            , (com.intellihealth.salt.views.chip.Chip) bindings[13]
            , (com.intellihealth.salt.views.chip.Chip) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[6]
            , (android.widget.EditText) bindings[15]
            , (com.intellihealth.salt.views.TextView) bindings[16]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[14]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvOrderID.setTag(null);
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
        if (BR.isRatingsClicked == variableId) {
            setIsRatingsClicked((java.lang.Boolean) variable);
        }
        else if (BR.orderID == variableId) {
            setOrderID((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsRatingsClicked(@Nullable java.lang.Boolean IsRatingsClicked) {
        this.mIsRatingsClicked = IsRatingsClicked;
    }
    public void setOrderID(@Nullable java.lang.String OrderID) {
        this.mOrderID = OrderID;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.orderID);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
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
        java.lang.String javaLangStringOrderIdOrderID = null;
        java.lang.String orderID = mOrderID;

        if ((dirtyFlags & 0xaL) != 0) {



                // read ("Order id #") + (orderID)
                javaLangStringOrderIdOrderID = ("Order id #") + (orderID);
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOrderID, javaLangStringOrderIdOrderID);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isRatingsClicked
        flag 1 (0x2L): orderID
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}