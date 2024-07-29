package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchTrendingUpdatedUiItemBindingImpl extends SearchTrendingUpdatedUiItemBinding  {

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

    public SearchTrendingUpdatedUiItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private SearchTrendingUpdatedUiItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.chip.Chip) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.chipName.setTag(null);
        this.mainChipLayout.setTag(null);
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
        if (BR.searchViewModel == variableId) {
            setSearchViewModel((com.intellihealth.salt.models.SearchSuggestionModel) variable);
        }
        else if (BR.item == variableId) {
            setItem((com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch) variable);
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

    public void setSearchViewModel(@Nullable com.intellihealth.salt.models.SearchSuggestionModel SearchViewModel) {
        this.mSearchViewModel = SearchViewModel;
    }
    public void setItem(@Nullable com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch Item) {
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
        java.lang.String itemName = null;
        com.intellihealth.truemeds.data.model.search.TrendingSearchResponse.TrendingSearch item = mItem;

        if ((dirtyFlags & 0x12L) != 0) {



                if (item != null) {
                    // read item.name
                    itemName = item.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.chipName.setChipTitle(itemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): searchViewModel
        flag 1 (0x2L): item
        flag 2 (0x3L): index
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}