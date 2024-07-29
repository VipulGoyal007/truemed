package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetReorderItemBindingImpl extends BottomsheetReorderItemBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetReorderItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private BottomsheetReorderItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvItemText.setTag(null);
        this.tvPriceText.setTag(null);
        this.tvQtyText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setReorderData((com.intellihealth.salt.models.ProductInfoModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReorderData(@Nullable com.intellihealth.salt.models.ProductInfoModel ReorderData) {
        this.mReorderData = ReorderData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.reorderData);
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
        java.lang.Integer reorderDataProductQty = null;
        java.lang.String javaLangStringReorderDataProductQty = null;
        double reorderDataProductMrp = 0.0;
        com.intellihealth.salt.models.ProductInfoModel reorderData = mReorderData;
        java.lang.String reorderDataProductSkuName = null;
        com.intellihealth.salt.models.ProductInfoModel.Product reorderDataProduct = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (reorderData != null) {
                    // read reorderData.product
                    reorderDataProduct = reorderData.getProduct();
                }


                if (reorderDataProduct != null) {
                    // read reorderData.product.qty
                    reorderDataProductQty = reorderDataProduct.getQty();
                    // read reorderData.product.mrp
                    reorderDataProductMrp = reorderDataProduct.getMrp();
                    // read reorderData.product.skuName
                    reorderDataProductSkuName = reorderDataProduct.getSkuName();
                }


                // read ("") + (reorderData.product.qty)
                javaLangStringReorderDataProductQty = ("") + (reorderDataProductQty);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemText, reorderDataProductSkuName);
            com.intellihealth.truemeds.presentation.bindingadapter.HomeBindingAdapterKt.setMRPTwoDecimalFormat(this.tvPriceText, reorderDataProductMrp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvQtyText, javaLangStringReorderDataProductQty);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): reorderData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}