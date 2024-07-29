package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdapterViewPrescriptionBindingImpl extends AdapterViewPrescriptionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardRoot, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdapterViewPrescriptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private AdapterViewPrescriptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.ivPrescription.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.url == variableId) {
            setUrl((java.lang.String) variable);
        }
        else if (BR.isFromPDPage == variableId) {
            setIsFromPDPage((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.title);
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
    public void setIsFromPDPage(@Nullable java.lang.Boolean IsFromPDPage) {
        this.mIsFromPDPage = IsFromPDPage;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.isFromPDPage);
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
        java.lang.String title = mTitle;
        java.lang.String url = mUrl;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsFromPDPage = false;
        java.lang.Boolean isFromPDPage = mIsFromPDPage;

        if ((dirtyFlags & 0xfL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isFromPDPage)
                androidxDatabindingViewDataBindingSafeUnboxIsFromPDPage = androidx.databinding.ViewDataBinding.safeUnbox(isFromPDPage);
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setUrl(this.ivPrescription, url, (android.graphics.drawable.Drawable)null, androidxDatabindingViewDataBindingSafeUnboxIsFromPDPage, title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): title
        flag 1 (0x2L): url
        flag 2 (0x3L): isFromPDPage
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}