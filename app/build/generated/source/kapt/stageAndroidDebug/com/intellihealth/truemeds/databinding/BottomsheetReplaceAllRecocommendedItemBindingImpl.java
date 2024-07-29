package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetReplaceAllRecocommendedItemBindingImpl extends BottomsheetReplaceAllRecocommendedItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clProduct, 9);
        sViewsWithIds.put(R.id.clSuggestion, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetReplaceAllRecocommendedItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private BottomsheetReplaceAllRecocommendedItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            );
        this.clRoot.setTag(null);
        this.ivProduct.setTag(null);
        this.ivSuggestion.setTag(null);
        this.tvProductManufacturer.setTag(null);
        this.tvProductName.setTag(null);
        this.tvProductUnits.setTag(null);
        this.tvSuggestionManufacturer.setTag(null);
        this.tvSuggestionName.setTag(null);
        this.tvSuggestionUnits.setTag(null);
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
        if (BR.productInfoModel == variableId) {
            setProductInfoModel((com.intellihealth.truemeds.presentation.model.ProductInfoModel) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.intellihealth.truemeds.presentation.viewmodel.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProductInfoModel(@Nullable com.intellihealth.truemeds.presentation.model.ProductInfoModel ProductInfoModel) {
        this.mProductInfoModel = ProductInfoModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.productInfoModel);
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
        java.lang.String productInfoModelProductDrugType = null;
        java.lang.String productInfoModelProductProductImageUrl = null;
        com.intellihealth.truemeds.presentation.model.Product productInfoModelProduct = null;
        java.lang.String productInfoModelSuggestionProductImageUrl = null;
        com.intellihealth.truemeds.presentation.model.Product productInfoModelSuggestion = null;
        java.lang.String productInfoModelSuggestionSkuName = null;
        java.lang.String productInfoModelProductPricePerUnitLabel = null;
        java.lang.String productInfoModelSuggestionManufacturerName = null;
        com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfoModel = mProductInfoModel;
        java.lang.String productInfoModelSuggestionDrugType = null;
        java.lang.String productInfoModelProductManufacturerName = null;
        java.lang.String productInfoModelSuggestionPricePerUnitLabel = null;
        java.lang.String productInfoModelProductSkuName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (productInfoModel != null) {
                    // read productInfoModel.product
                    productInfoModelProduct = productInfoModel.getProduct();
                    // read productInfoModel.suggestion
                    productInfoModelSuggestion = productInfoModel.getSuggestion();
                }


                if (productInfoModelProduct != null) {
                    // read productInfoModel.product.drugType
                    productInfoModelProductDrugType = productInfoModelProduct.getDrugType();
                    // read productInfoModel.product.productImageUrl
                    productInfoModelProductProductImageUrl = productInfoModelProduct.getProductImageUrl();
                    // read productInfoModel.product.pricePerUnitLabel
                    productInfoModelProductPricePerUnitLabel = productInfoModelProduct.getPricePerUnitLabel();
                    // read productInfoModel.product.manufacturerName
                    productInfoModelProductManufacturerName = productInfoModelProduct.getManufacturerName();
                    // read productInfoModel.product.skuName
                    productInfoModelProductSkuName = productInfoModelProduct.getSkuName();
                }
                if (productInfoModelSuggestion != null) {
                    // read productInfoModel.suggestion.productImageUrl
                    productInfoModelSuggestionProductImageUrl = productInfoModelSuggestion.getProductImageUrl();
                    // read productInfoModel.suggestion.skuName
                    productInfoModelSuggestionSkuName = productInfoModelSuggestion.getSkuName();
                    // read productInfoModel.suggestion.manufacturerName
                    productInfoModelSuggestionManufacturerName = productInfoModelSuggestion.getManufacturerName();
                    // read productInfoModel.suggestion.drugType
                    productInfoModelSuggestionDrugType = productInfoModelSuggestion.getDrugType();
                    // read productInfoModel.suggestion.pricePerUnitLabel
                    productInfoModelSuggestionPricePerUnitLabel = productInfoModelSuggestion.getPricePerUnitLabel();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.intellihealth.salt.adapter.MainBindingAdapterKt.imgUrlPlaceholderSupport(this.ivProduct, productInfoModelProductProductImageUrl, productInfoModelProductDrugType);
            com.intellihealth.salt.adapter.MainBindingAdapterKt.imgUrlPlaceholderSupport(this.ivSuggestion, productInfoModelSuggestionProductImageUrl, productInfoModelSuggestionDrugType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductManufacturer, productInfoModelProductManufacturerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductName, productInfoModelProductSkuName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductUnits, productInfoModelProductPricePerUnitLabel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSuggestionManufacturer, productInfoModelSuggestionManufacturerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSuggestionName, productInfoModelSuggestionSkuName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSuggestionUnits, productInfoModelSuggestionPricePerUnitLabel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): productInfoModel
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}