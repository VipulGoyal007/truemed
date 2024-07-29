package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdapterFooterItemBindingImpl extends AdapterFooterItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.footerItem, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdapterFooterItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private AdapterFooterItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.view.View) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            );
        this.affordableDynamicHeightView.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCartItemCount((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelIsActiveOrderClosed((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCartItemCount(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelCartItemCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsActiveOrderClosed(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsActiveOrderClosed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.lang.Boolean viewModelIsActiveOrderClosedGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelCartItemCount = null;
        com.intellihealth.truemeds.presentation.viewmodel.HomeViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsActiveOrderClosed = null;
        java.lang.Integer viewModelCartItemCountGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (viewModel != null) {
                    // read viewModel.cartItemCount
                    viewModelCartItemCount = viewModel.getCartItemCount();
                    // read viewModel.isActiveOrderClosed
                    viewModelIsActiveOrderClosed = viewModel.isActiveOrderClosed();
                }
                updateLiveDataRegistration(0, viewModelCartItemCount);
                updateLiveDataRegistration(1, viewModelIsActiveOrderClosed);

            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModelCartItemCount != null) {
                        // read viewModel.cartItemCount.getValue()
                        viewModelCartItemCountGetValue = viewModelCartItemCount.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModelIsActiveOrderClosed != null) {
                        // read viewModel.isActiveOrderClosed.getValue()
                        viewModelIsActiveOrderClosedGetValue = viewModelIsActiveOrderClosed.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HomeBindingAdapterKt.setFooterHeight(this.affordableDynamicHeightView, viewModel, viewModelCartItemCount, viewModelIsActiveOrderClosed);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.cartItemCount
        flag 1 (0x2L): viewModel.isActiveOrderClosed
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}