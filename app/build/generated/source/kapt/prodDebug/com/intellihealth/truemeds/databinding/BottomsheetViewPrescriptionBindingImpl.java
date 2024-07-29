package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetViewPrescriptionBindingImpl extends BottomsheetViewPrescriptionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.helpTopHeader, 3);
        sViewsWithIds.put(R.id.ivClose, 4);
        sViewsWithIds.put(R.id.ivPrescription, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetViewPrescriptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private BottomsheetViewPrescriptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (com.intellihealth.truemeds.presentation.viewpager.PdpZoomImageViewPager) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvPrescription.setTag(null);
        this.tvHeader.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.url == variableId) {
            setUrl((java.lang.String) variable);
        }
        else if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback) variable);
        }
        else if (BR.isFromPDPage == variableId) {
            setIsFromPDPage((java.lang.Boolean) variable);
        }
        else if (BR.list == variableId) {
            setList((java.util.List<java.lang.String>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setUrl(@Nullable java.lang.String Url) {
        this.mUrl = Url;
    }
    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setIsFromPDPage(@Nullable java.lang.Boolean IsFromPDPage) {
        this.mIsFromPDPage = IsFromPDPage;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.isFromPDPage);
        super.requestRebind();
    }
    public void setList(@Nullable java.util.List<java.lang.String> List) {
        this.mList = List;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.list);
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
        java.lang.Integer position = mPosition;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsFromPDPage = false;
        java.lang.String title = mTitle;
        int androidxDatabindingViewDataBindingSafeUnboxPosition = 0;
        com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback = mCallback;
        java.lang.Boolean isFromPDPage = mIsFromPDPage;
        java.util.List<java.lang.String> list = mList;

        if ((dirtyFlags & 0x7dL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(position)
                androidxDatabindingViewDataBindingSafeUnboxPosition = androidx.databinding.ViewDataBinding.safeUnbox(position);
                // read androidx.databinding.ViewDataBinding.safeUnbox(isFromPDPage)
                androidxDatabindingViewDataBindingSafeUnboxIsFromPDPage = androidx.databinding.ViewDataBinding.safeUnbox(isFromPDPage);
        }
        // batch finished
        if ((dirtyFlags & 0x7dL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setViewPrescriptionList(this.rvPrescription, list, callback, androidxDatabindingViewDataBindingSafeUnboxPosition, androidxDatabindingViewDataBindingSafeUnboxIsFromPDPage, title);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, title);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): position
        flag 1 (0x2L): url
        flag 2 (0x3L): title
        flag 3 (0x4L): callback
        flag 4 (0x5L): isFromPDPage
        flag 5 (0x6L): list
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}