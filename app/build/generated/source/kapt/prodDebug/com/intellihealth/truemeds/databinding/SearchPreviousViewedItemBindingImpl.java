package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchPreviousViewedItemBindingImpl extends SearchPreviousViewedItemBinding  {

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

    public SearchPreviousViewedItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private SearchPreviousViewedItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            );
        this.cardCrossSellingMedParent.setTag(null);
        this.ivMedicine.setTag(null);
        this.tvMedicine.setTag(null);
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
        if (BR.item == variableId) {
            setItem((com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine) variable);
        }
        else if (BR.index == variableId) {
            setIndex((java.lang.Integer) variable);
        }
        else if (BR.viewmodel == variableId) {
            setViewmodel((com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setIndex(@Nullable java.lang.Integer Index) {
        this.mIndex = Index;
    }
    public void setViewmodel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel Viewmodel) {
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
        java.lang.String itemDrugType = null;
        com.intellihealth.truemeds.data.repository.datasource.local.entity.RecentMedicine item = mItem;
        java.lang.String itemMedicineName = null;
        java.lang.String itemProductImage = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (item != null) {
                    // read item.drugType
                    itemDrugType = item.getDrugType();
                    // read item.medicineName
                    itemMedicineName = item.getMedicineName();
                    // read item.productImage
                    itemProductImage = item.getProductImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setBannerPlaceHolder(this.ivMedicine, itemDrugType);
            com.intellihealth.salt.utils.UtilsKt.setProductImage(this.ivMedicine, itemProductImage, itemDrugType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMedicine, itemMedicineName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): index
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}