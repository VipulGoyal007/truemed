package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdapterDoctorPrescriptionOrderSummaryBindingImpl extends AdapterDoctorPrescriptionOrderSummaryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdapterDoctorPrescriptionOrderSummaryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private AdapterDoctorPrescriptionOrderSummaryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.ivPrescription.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatImageView) bindings[2];
        this.mboundView2.setTag(null);
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
        if (BR.isCloseButtonShow == variableId) {
            setIsCloseButtonShow((java.lang.Boolean) variable);
        }
        else if (BR.url == variableId) {
            setUrl((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsCloseButtonShow(@Nullable java.lang.Boolean IsCloseButtonShow) {
        this.mIsCloseButtonShow = IsCloseButtonShow;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isCloseButtonShow);
        super.requestRebind();
    }
    public void setUrl(@Nullable java.lang.String Url) {
        this.mUrl = Url;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.url);
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
        java.lang.Boolean isCloseButtonShow = mIsCloseButtonShow;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsCloseButtonShow = false;
        java.lang.String url = mUrl;
        int isCloseButtonShowViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isCloseButtonShow)
                androidxDatabindingViewDataBindingSafeUnboxIsCloseButtonShow = androidx.databinding.ViewDataBinding.safeUnbox(isCloseButtonShow);
            if((dirtyFlags & 0x5L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsCloseButtonShow) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isCloseButtonShow) ? View.VISIBLE : View.GONE
                isCloseButtonShowViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsCloseButtonShow) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setUrl(this.ivPrescription, url, (android.graphics.drawable.Drawable)null, (boolean)false, (java.lang.String)null);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(isCloseButtonShowViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isCloseButtonShow
        flag 1 (0x2L): url
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isCloseButtonShow) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isCloseButtonShow) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}