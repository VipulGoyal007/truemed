package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetCompareAndUnderstandBindingImpl extends BottomsheetCompareAndUnderstandBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clHeader, 14);
        sViewsWithIds.put(R.id.imageClose, 15);
        sViewsWithIds.put(R.id.clBoby, 16);
        sViewsWithIds.put(R.id.clOGProductCard, 17);
        sViewsWithIds.put(R.id.clOGProduct, 18);
        sViewsWithIds.put(R.id.vOgProductName, 19);
        sViewsWithIds.put(R.id.vOgManufacture, 20);
        sViewsWithIds.put(R.id.tvOgApproval, 21);
        sViewsWithIds.put(R.id.vOgApproval, 22);
        sViewsWithIds.put(R.id.vOgProductContain, 23);
        sViewsWithIds.put(R.id.clOGProductCard2, 24);
        sViewsWithIds.put(R.id.clSubProduct, 25);
        sViewsWithIds.put(R.id.vSubProductName, 26);
        sViewsWithIds.put(R.id.vSubManufacture, 27);
        sViewsWithIds.put(R.id.tvSubApproval, 28);
        sViewsWithIds.put(R.id.vSubApproval, 29);
        sViewsWithIds.put(R.id.vSubProductContain, 30);
        sViewsWithIds.put(R.id.clSub, 31);
        sViewsWithIds.put(R.id.ivSubTag, 32);
        sViewsWithIds.put(R.id.tvSubTag, 33);
        sViewsWithIds.put(R.id.ivMatch, 34);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetCompareAndUnderstandBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private BottomsheetCompareAndUnderstandBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (com.google.android.material.card.MaterialCardView) bindings[17]
            , (com.google.android.material.card.MaterialCardView) bindings[24]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[31]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[34]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[32]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[21]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[28]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[33]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[29]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[30]
            , (android.view.View) bindings[26]
            );
        this.ivOg.setTag(null);
        this.ivSub.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvHeader.setTag(null);
        this.tvOgManufacturer.setTag(null);
        this.tvOgPriceMRP.setTag(null);
        this.tvOgPricePerUnit.setTag(null);
        this.tvOgProductContain.setTag(null);
        this.tvOgProductName.setTag(null);
        this.tvSubDiscount.setTag(null);
        this.tvSubManufacturer.setTag(null);
        this.tvSubPricePerUnit.setTag(null);
        this.tvSubProductContain.setTag(null);
        this.tvSubProductName.setTag(null);
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
        if (BR.productComparisonData == variableId) {
            setProductComparisonData((com.intellihealth.salt.models.ProductComparisonModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProductComparisonData(@Nullable com.intellihealth.salt.models.ProductComparisonModel ProductComparisonData) {
        this.mProductComparisonData = ProductComparisonData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.productComparisonData);
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
        java.lang.String productComparisonDataSuggestionComposition = null;
        java.lang.String productComparisonDataSuggestionProductImageUrl = null;
        java.lang.String productComparisonDataProductSubsSavingsPercentageJavaLangStringCheaper = null;
        java.lang.String productComparisonDataSuggestionPricePerUnitLabel = null;
        java.lang.String productComparisonDataSuggestionSkuName = null;
        java.lang.String productComparisonDataProductSubsSavingsPercentage = null;
        java.lang.String productComparisonDataProductManufacturerName = null;
        com.intellihealth.salt.models.ProductInfoModel.Product productComparisonDataProduct = null;
        java.lang.String productComparisonDataSuggestionManufacturerName = null;
        java.lang.String productComparisonDataProductComposition = null;
        com.intellihealth.salt.models.ProductComparisonModel productComparisonData = mProductComparisonData;
        com.intellihealth.salt.models.ProductInfoModel.Product productComparisonDataSuggestion = null;
        java.lang.String productComparisonDataProductSkuName = null;
        java.lang.String productComparisonDataTitle = null;
        java.lang.String productComparisonDataProductPricePerUnitLabel = null;
        java.lang.String productComparisonDataProductProductImageUrl = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (productComparisonData != null) {
                    // read productComparisonData.product
                    productComparisonDataProduct = productComparisonData.getProduct();
                    // read productComparisonData.suggestion
                    productComparisonDataSuggestion = productComparisonData.getSuggestion();
                    // read productComparisonData.title
                    productComparisonDataTitle = productComparisonData.getTitle();
                }


                if (productComparisonDataProduct != null) {
                    // read productComparisonData.product.subsSavingsPercentage
                    productComparisonDataProductSubsSavingsPercentage = productComparisonDataProduct.getSubsSavingsPercentage();
                    // read productComparisonData.product.manufacturerName
                    productComparisonDataProductManufacturerName = productComparisonDataProduct.getManufacturerName();
                    // read productComparisonData.product.composition
                    productComparisonDataProductComposition = productComparisonDataProduct.getComposition();
                    // read productComparisonData.product.skuName
                    productComparisonDataProductSkuName = productComparisonDataProduct.getSkuName();
                    // read productComparisonData.product.pricePerUnitLabel
                    productComparisonDataProductPricePerUnitLabel = productComparisonDataProduct.getPricePerUnitLabel();
                    // read productComparisonData.product.productImageUrl
                    productComparisonDataProductProductImageUrl = productComparisonDataProduct.getProductImageUrl();
                }
                if (productComparisonDataSuggestion != null) {
                    // read productComparisonData.suggestion.composition
                    productComparisonDataSuggestionComposition = productComparisonDataSuggestion.getComposition();
                    // read productComparisonData.suggestion.productImageUrl
                    productComparisonDataSuggestionProductImageUrl = productComparisonDataSuggestion.getProductImageUrl();
                    // read productComparisonData.suggestion.pricePerUnitLabel
                    productComparisonDataSuggestionPricePerUnitLabel = productComparisonDataSuggestion.getPricePerUnitLabel();
                    // read productComparisonData.suggestion.skuName
                    productComparisonDataSuggestionSkuName = productComparisonDataSuggestion.getSkuName();
                    // read productComparisonData.suggestion.manufacturerName
                    productComparisonDataSuggestionManufacturerName = productComparisonDataSuggestion.getManufacturerName();
                }


                // read (productComparisonData.product.subsSavingsPercentage) + (" cheaper")
                productComparisonDataProductSubsSavingsPercentageJavaLangStringCheaper = (productComparisonDataProductSubsSavingsPercentage) + (" cheaper");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.intellihealth.salt.adapter.MainBindingAdapterKt.setImageUrl(this.ivOg, productComparisonDataProductProductImageUrl);
            com.intellihealth.salt.adapter.MainBindingAdapterKt.setImageUrl(this.ivSub, productComparisonDataSuggestionProductImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, productComparisonDataTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOgManufacturer, productComparisonDataProductManufacturerName);
            com.intellihealth.truemeds.presentation.bindingadapter.CompareAndUnderstandBindingAdapterKt.setMRPValue(this.tvOgPriceMRP, productComparisonData);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOgPricePerUnit, productComparisonDataProductPricePerUnitLabel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOgProductContain, productComparisonDataProductComposition);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOgProductName, productComparisonDataProductSkuName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubDiscount, productComparisonDataProductSubsSavingsPercentageJavaLangStringCheaper);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubManufacturer, productComparisonDataSuggestionManufacturerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubPricePerUnit, productComparisonDataSuggestionPricePerUnitLabel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubProductContain, productComparisonDataSuggestionComposition);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubProductName, productComparisonDataSuggestionSkuName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): productComparisonData
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}