package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TrendingSearchItemBindingImpl extends TrendingSearchItemBinding  {

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

    public TrendingSearchItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }
    private TrendingSearchItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatTextView) bindings[0]
            );
        this.text.setTag(null);
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
        if (BR.item == variableId) {
            setItem((com.intellihealth.truemeds.data.model.KeyValuePair) variable);
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

    public void setItem(@Nullable com.intellihealth.truemeds.data.model.KeyValuePair Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setIndex(@Nullable java.lang.Integer Index) {
        this.mIndex = Index;
    }
    public void setViewmodel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelSearchQuery((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelSearchQuery(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelSearchQuery, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.intellihealth.truemeds.data.model.KeyValuePair item = mItem;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelSearchQuery = null;
        java.lang.String itemStrVal = null;
        java.lang.String viewmodelSearchQueryGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x1bL) != 0) {



                if (item != null) {
                    // read item.strVal
                    itemStrVal = item.getStrVal();
                }
                if (viewmodel != null) {
                    // read viewmodel.searchQuery
                    viewmodelSearchQuery = viewmodel.getSearchQuery();
                }
                updateLiveDataRegistration(0, viewmodelSearchQuery);


                if (viewmodelSearchQuery != null) {
                    // read viewmodel.searchQuery.getValue()
                    viewmodelSearchQueryGetValue = viewmodelSearchQuery.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x1bL) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.SearchsuggestionBindingAdapterKt.setMedicineNameWithHighlight(this.text, itemStrVal, viewmodelSearchQueryGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.searchQuery
        flag 1 (0x2L): item
        flag 2 (0x3L): index
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}