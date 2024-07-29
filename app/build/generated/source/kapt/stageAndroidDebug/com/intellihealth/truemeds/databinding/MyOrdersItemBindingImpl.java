package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MyOrdersItemBindingImpl extends MyOrdersItemBinding  {

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

    public MyOrdersItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private MyOrdersItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.intellihealth.salt.views.cards.OrderStatusCards) bindings[1]
            );
        this.constraitMain.setTag(null);
        this.orderStatusCard.setTag(null);
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
        if (BR.orderStatusCardsCallback == variableId) {
            setOrderStatusCardsCallback((com.intellihealth.salt.callbacks.OrderStatusCardsCallback) variable);
        }
        else if (BR.orderStatusCardsModel == variableId) {
            setOrderStatusCardsModel((com.intellihealth.salt.models.TmOrderStatusCardModel) variable);
        }
        else if (BR.itemPosition == variableId) {
            setItemPosition((java.lang.Integer) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOrderStatusCardsCallback(@Nullable com.intellihealth.salt.callbacks.OrderStatusCardsCallback OrderStatusCardsCallback) {
        this.mOrderStatusCardsCallback = OrderStatusCardsCallback;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.orderStatusCardsCallback);
        super.requestRebind();
    }
    public void setOrderStatusCardsModel(@Nullable com.intellihealth.salt.models.TmOrderStatusCardModel OrderStatusCardsModel) {
        this.mOrderStatusCardsModel = OrderStatusCardsModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.orderStatusCardsModel);
        super.requestRebind();
    }
    public void setItemPosition(@Nullable java.lang.Integer ItemPosition) {
        this.mItemPosition = ItemPosition;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.OrdersTabViewModel ViewModel) {
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
        com.intellihealth.salt.callbacks.OrderStatusCardsCallback orderStatusCardsCallback = mOrderStatusCardsCallback;
        com.intellihealth.salt.models.TmOrderStatusCardModel orderStatusCardsModel = mOrderStatusCardsModel;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x12L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.orderStatusCard.setOrderStatusData(orderStatusCardsModel);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.orderStatusCard.setOrderStatusCallback(orderStatusCardsCallback);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): orderStatusCardsCallback
        flag 1 (0x2L): orderStatusCardsModel
        flag 2 (0x3L): itemPosition
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}