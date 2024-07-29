package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetReorderBindingImpl extends BottomsheetReorderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 4);
        sViewsWithIds.put(R.id.viewDragHandle, 5);
        sViewsWithIds.put(R.id.imgLeft, 6);
        sViewsWithIds.put(R.id.imageClose, 7);
        sViewsWithIds.put(R.id.clData, 8);
        sViewsWithIds.put(R.id.rvReorderMedicineList, 9);
        sViewsWithIds.put(R.id.tvReorder, 10);
        sViewsWithIds.put(R.id.progressBar, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetReorderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private BottomsheetReorderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (android.widget.ProgressBar) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.buttons.Button) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (android.view.View) bindings[5]
            );
        this.clProgressBar.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvHeader.setTag(null);
        this.tvSubHeader.setTag(null);
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
        if (BR.reorderData == variableId) {
            setReorderData((com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel) variable);
        }
        else if (BR.isLoading == variableId) {
            setIsLoading((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReorderData(@Nullable com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel ReorderData) {
        this.mReorderData = ReorderData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.reorderData);
        super.requestRebind();
    }
    public void setIsLoading(@Nullable java.lang.Boolean IsLoading) {
        this.mIsLoading = IsLoading;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isLoading);
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
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLoading = false;
        java.lang.String reorderDataHeader = null;
        com.intellihealth.truemeds.data.model.home.HomeReorderBottomSheetModel reorderData = mReorderData;
        int isLoadingViewVISIBLEViewINVISIBLE = 0;
        java.lang.Boolean isLoading = mIsLoading;
        java.lang.String reorderDataSubHeader = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (reorderData != null) {
                    // read reorderData.header
                    reorderDataHeader = reorderData.getHeader();
                    // read reorderData.subHeader
                    reorderDataSubHeader = reorderData.getSubHeader();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading)
                androidxDatabindingViewDataBindingSafeUnboxIsLoading = androidx.databinding.ViewDataBinding.safeUnbox(isLoading);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsLoading) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.INVISIBLE
                isLoadingViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsLoading) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.clProgressBar.setVisibility(isLoadingViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, reorderDataHeader);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubHeader, reorderDataSubHeader);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reorderData
        flag 1 (0x2L): isLoading
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.INVISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}