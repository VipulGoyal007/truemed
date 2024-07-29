package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProductListViewAllItemBindingImpl extends ProductListViewAllItemBinding  {

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

    public ProductListViewAllItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ProductListViewAllItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.intellihealth.salt.views.cards.ProductCard) bindings[1]
            );
        this.constraitMain.setTag(null);
        this.productCardView.setTag(null);
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
        if (BR.itemPosition == variableId) {
            setItemPosition((java.lang.Integer) variable);
        }
        else if (BR.productCardCallback == variableId) {
            setProductCardCallback((com.intellihealth.salt.callbacks.ProductCardCallback) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel) variable);
        }
        else if (BR.data == variableId) {
            setData((com.intellihealth.salt.models.ProductInfoModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemPosition(@Nullable java.lang.Integer ItemPosition) {
        this.mItemPosition = ItemPosition;
    }
    public void setProductCardCallback(@Nullable com.intellihealth.salt.callbacks.ProductCardCallback ProductCardCallback) {
        this.mProductCardCallback = ProductCardCallback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.productCardCallback);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ProductListViewAllViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }
    public void setData(@Nullable com.intellihealth.salt.models.ProductInfoModel Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.data);
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
        com.intellihealth.salt.callbacks.ProductCardCallback productCardCallback = mProductCardCallback;
        com.intellihealth.salt.models.ProductInfoModel data = mData;

        if ((dirtyFlags & 0x12L) != 0) {
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.productCardView.setCrossSellingCallback(productCardCallback);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.productCardView.setCrossSellingData(data);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemPosition
        flag 1 (0x2L): productCardCallback
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): data
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}