package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AdapterCartItemBindingImpl extends AdapterCartItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clBlueBG, 6);
        sViewsWithIds.put(R.id.ivBgAnim, 7);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AdapterCartItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private AdapterCartItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.intellihealth.salt.views.cards.FullWidthProductCard) bindings[5]
            , (com.intellihealth.salt.views.cards.FullWidthProductCard) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.clOriginal.setTag(null);
        this.clReplacedSubs.setTag(null);
        this.fullWidthProductCard.setTag(null);
        this.fullWidthProductCardReplaced.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvBgAmountDiff.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.savings == variableId) {
            setSavings((java.lang.Double) variable);
        }
        else if (BR.index == variableId) {
            setIndex((java.lang.Integer) variable);
        }
        else if (BR.productInfoModel == variableId) {
            setProductInfoModel((com.intellihealth.salt.models.ProductInfoModel) variable);
        }
        else if (BR.productInfoModelReplaced == variableId) {
            setProductInfoModelReplaced((com.intellihealth.salt.models.ProductInfoModel) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.intellihealth.truemeds.presentation.viewmodel.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSavings(@Nullable java.lang.Double Savings) {
        this.mSavings = Savings;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.savings);
        super.requestRebind();
    }
    public void setIndex(@Nullable java.lang.Integer Index) {
        this.mIndex = Index;
    }
    public void setProductInfoModel(@Nullable com.intellihealth.salt.models.ProductInfoModel ProductInfoModel) {
        this.mProductInfoModel = ProductInfoModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.productInfoModel);
        super.requestRebind();
    }
    public void setProductInfoModelReplaced(@Nullable com.intellihealth.salt.models.ProductInfoModel ProductInfoModelReplaced) {
        this.mProductInfoModelReplaced = ProductInfoModelReplaced;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.productInfoModelReplaced);
        super.requestRebind();
    }
    public void setViewmodel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CartViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
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
        java.lang.String javaLangStringSavings = null;
        int productInfoModelReplacedViewVISIBLEViewGONE = 0;
        boolean productInfoModelReplaced = false;
        boolean ProductInfoModelReplaced1 = false;
        int ProductInfoModelReplacedViewVISIBLEViewGONE1 = 0;
        java.lang.Double savings = mSavings;
        com.intellihealth.salt.models.ProductInfoModel productInfoModel = mProductInfoModel;
        com.intellihealth.salt.models.ProductInfoModel ProductInfoModelReplaced2 = mProductInfoModelReplaced;
        java.lang.String javaLangStringSavingsJavaLangStringSaved = null;

        if ((dirtyFlags & 0x21L) != 0) {



                // read ("₹") + (savings)
                javaLangStringSavings = ("₹") + (savings);


                // read (("₹") + (savings)) + (" Saved!")
                javaLangStringSavingsJavaLangStringSaved = (javaLangStringSavings) + (" Saved!");
        }
        if ((dirtyFlags & 0x2cL) != 0) {


            if ((dirtyFlags & 0x24L) != 0) {

                    if (productInfoModel != null) {
                        // read productInfoModel.replaced
                        productInfoModelReplaced = productInfoModel.isReplaced();
                    }
                if((dirtyFlags & 0x24L) != 0) {
                    if(productInfoModelReplaced) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read !productInfoModel.replaced
                    ProductInfoModelReplaced1 = !productInfoModelReplaced;
                    // read productInfoModel.replaced ? View.VISIBLE : View.GONE
                    ProductInfoModelReplacedViewVISIBLEViewGONE1 = ((productInfoModelReplaced) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if((dirtyFlags & 0x24L) != 0) {
                    if(ProductInfoModelReplaced1) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read !productInfoModel.replaced ? View.VISIBLE : View.GONE
                    productInfoModelReplacedViewVISIBLEViewGONE = ((ProductInfoModelReplaced1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.clOriginal.setVisibility(productInfoModelReplacedViewVISIBLEViewGONE);
            this.clReplacedSubs.setVisibility(ProductInfoModelReplacedViewVISIBLEViewGONE1);
            this.fullWidthProductCard.setCrossSellingData(productInfoModel);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setDataReplaceFullwidthCard(this.fullWidthProductCardReplaced, ProductInfoModelReplaced2, productInfoModel);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvBgAmountDiff, javaLangStringSavingsJavaLangStringSaved);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): savings
        flag 1 (0x2L): index
        flag 2 (0x3L): productInfoModel
        flag 3 (0x4L): productInfoModelReplaced
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): null
        flag 6 (0x7L): !productInfoModel.replaced ? View.VISIBLE : View.GONE
        flag 7 (0x8L): !productInfoModel.replaced ? View.VISIBLE : View.GONE
        flag 8 (0x9L): productInfoModel.replaced ? View.VISIBLE : View.GONE
        flag 9 (0xaL): productInfoModel.replaced ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}