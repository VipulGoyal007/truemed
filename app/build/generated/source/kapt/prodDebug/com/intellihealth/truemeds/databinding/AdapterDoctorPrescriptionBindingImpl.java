package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdapterDoctorPrescriptionBindingImpl extends AdapterDoctorPrescriptionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdapterDoctorPrescriptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private AdapterDoctorPrescriptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.clMain.setTag(null);
        this.ivClose.setTag(null);
        this.ivPrescription.setTag(null);
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
        if (BR.url == variableId) {
            setUrl((java.lang.String) variable);
        }
        else if (BR.isCloseButtonShow == variableId) {
            setIsCloseButtonShow((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUrl(@Nullable java.lang.String Url) {
        this.mUrl = Url;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.url);
        super.requestRebind();
    }
    public void setIsCloseButtonShow(@Nullable java.lang.Boolean IsCloseButtonShow) {
        this.mIsCloseButtonShow = IsCloseButtonShow;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isCloseButtonShow);
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
        java.lang.String url = mUrl;
        int isCloseButtonShowViewVISIBLEViewGONE = 0;
        java.lang.Boolean isCloseButtonShow = mIsCloseButtonShow;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsCloseButtonShow = false;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isCloseButtonShow)
                androidxDatabindingViewDataBindingSafeUnboxIsCloseButtonShow = androidx.databinding.ViewDataBinding.safeUnbox(isCloseButtonShow);
            if((dirtyFlags & 0x6L) != 0) {
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
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.ivClose.setVisibility(isCloseButtonShowViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setUrl(this.ivPrescription, url, (android.graphics.drawable.Drawable)null, (boolean)false, (java.lang.String)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): url
        flag 1 (0x2L): isCloseButtonShow
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isCloseButtonShow) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isCloseButtonShow) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}