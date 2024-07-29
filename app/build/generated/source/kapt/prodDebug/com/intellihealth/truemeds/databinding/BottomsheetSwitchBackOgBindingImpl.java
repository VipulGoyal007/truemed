package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetSwitchBackOgBindingImpl extends BottomsheetSwitchBackOgBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clMain, 15);
        sViewsWithIds.put(R.id.clTopHeader, 16);
        sViewsWithIds.put(R.id.ivCoin, 17);
        sViewsWithIds.put(R.id.ivClose, 18);
        sViewsWithIds.put(R.id.tvHeader, 19);
        sViewsWithIds.put(R.id.tvSubHeader, 20);
        sViewsWithIds.put(R.id.clBody, 21);
        sViewsWithIds.put(R.id.mcProduct, 22);
        sViewsWithIds.put(R.id.clProduct, 23);
        sViewsWithIds.put(R.id.mcSuggestion, 24);
        sViewsWithIds.put(R.id.clSuggestion, 25);
        sViewsWithIds.put(R.id.txtInCart, 26);
        sViewsWithIds.put(R.id.clSuggestionUnit, 27);
        sViewsWithIds.put(R.id.btnIntersect, 28);
        sViewsWithIds.put(R.id.btnOkay, 29);
        sViewsWithIds.put(R.id.btnSwitchBackOg, 30);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetSwitchBackOgBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private BottomsheetSwitchBackOgBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.Button) bindings[28]
            , (com.intellihealth.salt.views.buttons.Button) bindings[29]
            , (com.intellihealth.salt.views.buttons.Button) bindings[30]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[18]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (com.google.android.material.card.MaterialCardView) bindings[22]
            , (com.google.android.material.card.MaterialCardView) bindings[24]
            , (com.intellihealth.salt.views.TextView) bindings[19]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[20]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[14]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[26]
            );
        this.clRoot.setTag(null);
        this.ivProduct.setTag(null);
        this.ivSuggestion.setTag(null);
        this.tvProductManufacturer.setTag(null);
        this.tvProductName.setTag(null);
        this.tvProductPricePerUnits.setTag(null);
        this.tvProductQty.setTag(null);
        this.tvProductSellingPrice.setTag(null);
        this.tvProductUnit.setTag(null);
        this.tvSuggestionManufacturer.setTag(null);
        this.tvSuggestionName.setTag(null);
        this.tvSuggestionPricePerUnits.setTag(null);
        this.tvSuggestionQty.setTag(null);
        this.tvSuggestionSellingPrice.setTag(null);
        this.tvSuggestionUnit.setTag(null);
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
        if (BR.savingPercent == variableId) {
            setSavingPercent((java.lang.String) variable);
        }
        else if (BR.productInfoModel == variableId) {
            setProductInfoModel((com.intellihealth.truemeds.presentation.model.ProductInfoModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSavingPercent(@Nullable java.lang.String SavingPercent) {
        this.mSavingPercent = SavingPercent;
    }
    public void setProductInfoModel(@Nullable com.intellihealth.truemeds.presentation.model.ProductInfoModel ProductInfoModel) {
        this.mProductInfoModel = ProductInfoModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.productInfoModel);
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
        java.lang.String productInfoModelProductProductImageUrl = null;
        double productInfoModelProductSellingPrice = 0.0;
        com.intellihealth.truemeds.presentation.model.Product productInfoModelSuggestion = null;
        java.lang.String productInfoModelSuggestionSkuName = null;
        java.lang.Integer productInfoModelSuggestionQty = null;
        java.lang.String productInfoModelProductPricePerUnitLabel = null;
        java.lang.String javaLangStringQtyProductInfoModelSuggestionQty = null;
        com.intellihealth.truemeds.presentation.model.ProductInfoModel productInfoModel = mProductInfoModel;
        java.lang.String productInfoModelSuggestionDrugType = null;
        java.lang.String productInfoModelSuggestionPackForm = null;
        java.lang.String productInfoModelProductPackForm = null;
        java.lang.String productInfoModelProductDrugType = null;
        double productInfoModelSuggestionSellingPrice = 0.0;
        com.intellihealth.truemeds.presentation.model.Product productInfoModelProduct = null;
        java.lang.String productInfoModelSuggestionProductImageUrl = null;
        java.lang.String javaLangStringQtyProductInfoModelProductQty = null;
        java.lang.String productInfoModelSuggestionManufacturerName = null;
        java.lang.String productInfoModelProductSkuNameTrim = null;
        java.lang.String productInfoModelProductManufacturerName = null;
        java.lang.String productInfoModelSuggestionPricePerUnitLabel = null;
        java.lang.Integer productInfoModelProductQty = null;
        java.lang.String productInfoModelProductSkuName = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (productInfoModel != null) {
                    // read productInfoModel.suggestion
                    productInfoModelSuggestion = productInfoModel.getSuggestion();
                    // read productInfoModel.product
                    productInfoModelProduct = productInfoModel.getProduct();
                }


                if (productInfoModelSuggestion != null) {
                    // read productInfoModel.suggestion.skuName
                    productInfoModelSuggestionSkuName = productInfoModelSuggestion.getSkuName();
                    // read productInfoModel.suggestion.qty
                    productInfoModelSuggestionQty = productInfoModelSuggestion.getQty();
                    // read productInfoModel.suggestion.drugType
                    productInfoModelSuggestionDrugType = productInfoModelSuggestion.getDrugType();
                    // read productInfoModel.suggestion.packForm
                    productInfoModelSuggestionPackForm = productInfoModelSuggestion.getPackForm();
                    // read productInfoModel.suggestion.sellingPrice
                    productInfoModelSuggestionSellingPrice = productInfoModelSuggestion.getSellingPrice();
                    // read productInfoModel.suggestion.productImageUrl
                    productInfoModelSuggestionProductImageUrl = productInfoModelSuggestion.getProductImageUrl();
                    // read productInfoModel.suggestion.manufacturerName
                    productInfoModelSuggestionManufacturerName = productInfoModelSuggestion.getManufacturerName();
                    // read productInfoModel.suggestion.pricePerUnitLabel
                    productInfoModelSuggestionPricePerUnitLabel = productInfoModelSuggestion.getPricePerUnitLabel();
                }
                if (productInfoModelProduct != null) {
                    // read productInfoModel.product.productImageUrl
                    productInfoModelProductProductImageUrl = productInfoModelProduct.getProductImageUrl();
                    // read productInfoModel.product.sellingPrice
                    productInfoModelProductSellingPrice = productInfoModelProduct.getSellingPrice();
                    // read productInfoModel.product.pricePerUnitLabel
                    productInfoModelProductPricePerUnitLabel = productInfoModelProduct.getPricePerUnitLabel();
                    // read productInfoModel.product.packForm
                    productInfoModelProductPackForm = productInfoModelProduct.getPackForm();
                    // read productInfoModel.product.drugType
                    productInfoModelProductDrugType = productInfoModelProduct.getDrugType();
                    // read productInfoModel.product.manufacturerName
                    productInfoModelProductManufacturerName = productInfoModelProduct.getManufacturerName();
                    // read productInfoModel.product.qty
                    productInfoModelProductQty = productInfoModelProduct.getQty();
                    // read productInfoModel.product.skuName
                    productInfoModelProductSkuName = productInfoModelProduct.getSkuName();
                }


                // read ("Qty ") + (productInfoModel.suggestion.qty)
                javaLangStringQtyProductInfoModelSuggestionQty = ("Qty ") + (productInfoModelSuggestionQty);
                // read ("Qty ") + (productInfoModel.product.qty)
                javaLangStringQtyProductInfoModelProductQty = ("Qty ") + (productInfoModelProductQty);
                if (productInfoModelProductSkuName != null) {
                    // read productInfoModel.product.skuName.trim()
                    productInfoModelProductSkuNameTrim = productInfoModelProductSkuName.trim();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.intellihealth.salt.adapter.MainBindingAdapterKt.imgUrlPlaceholderSupport(this.ivProduct, productInfoModelProductProductImageUrl, productInfoModelProductDrugType);
            com.intellihealth.salt.adapter.MainBindingAdapterKt.imgUrlPlaceholderSupport(this.ivSuggestion, productInfoModelSuggestionProductImageUrl, productInfoModelSuggestionDrugType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductManufacturer, productInfoModelProductManufacturerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductName, productInfoModelProductSkuNameTrim);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductPricePerUnits, productInfoModelProductPricePerUnitLabel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductQty, javaLangStringQtyProductInfoModelProductQty);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setNumberFormatPriceInDoubleWithRupee(this.tvProductSellingPrice, productInfoModelProductSellingPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductUnit, productInfoModelProductPackForm);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSuggestionManufacturer, productInfoModelSuggestionManufacturerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSuggestionName, productInfoModelSuggestionSkuName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSuggestionPricePerUnits, productInfoModelSuggestionPricePerUnitLabel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSuggestionQty, javaLangStringQtyProductInfoModelSuggestionQty);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setNumberFormatPriceInDoubleWithRupee(this.tvSuggestionSellingPrice, productInfoModelSuggestionSellingPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSuggestionUnit, productInfoModelSuggestionPackForm);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): savingPercent
        flag 1 (0x2L): productInfoModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}