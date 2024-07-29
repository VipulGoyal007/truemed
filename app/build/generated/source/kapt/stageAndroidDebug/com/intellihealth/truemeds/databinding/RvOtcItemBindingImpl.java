package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RvOtcItemBindingImpl extends RvOtcItemBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivBackground, 2);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RvOtcItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private RvOtcItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.ivIcon.setTag(null);
        this.root.setTag(null);
        setRootTag(root);
        // listeners
        mCallback65 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
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
        if (BR.item == variableId) {
            setItem((com.intellihealth.truemeds.presentation.model.ProductInfoModel) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.intellihealth.truemeds.presentation.model.ProductInfoModel Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CartViewModel ViewModel) {
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
        com.intellihealth.truemeds.presentation.model.ProductInfoModel item = mItem;
        com.intellihealth.truemeds.presentation.model.Product itemProduct = null;
        java.lang.Integer position = mPosition;
        java.lang.String itemProductSkuName = null;
        java.lang.String itemProductDrugType = null;
        java.lang.String itemProductProductImageUrl = null;
        com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.product
                    itemProduct = item.getProduct();
                }


                if (itemProduct != null) {
                    // read item.product.skuName
                    itemProductSkuName = itemProduct.getSkuName();
                    // read item.product.drugType
                    itemProductDrugType = itemProduct.getDrugType();
                    // read item.product.productImageUrl
                    itemProductProductImageUrl = itemProduct.getProductImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.OrderSummaryBindingAdapterKt.setImageUrl(this.ivIcon, itemProductSkuName, itemProductProductImageUrl, itemProductDrugType);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.root.setOnClickListener(mCallback65);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.intellihealth.truemeds.presentation.model.ProductInfoModel item = mItem;
        // position
        java.lang.Integer position = mPosition;
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModel.onItemClickOtc(item, position);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): position
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}