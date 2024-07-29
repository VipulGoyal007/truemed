package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HealthArticleBottomsheetItemBindingImpl extends HealthArticleBottomsheetItemBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.forwardArrow, 2);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HealthArticleBottomsheetItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private HealthArticleBottomsheetItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.categoryItemTV.setTag(null);
        this.mainCardCtl.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
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
        if (BR.categoryModel == variableId) {
            setCategoryModel((com.intellihealth.truemeds.data.model.home.CategoryListModel) variable);
        }
        else if (BR.healthArticlesViewModel == variableId) {
            setHealthArticlesViewModel((com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCategoryModel(@Nullable com.intellihealth.truemeds.data.model.home.CategoryListModel CategoryModel) {
        this.mCategoryModel = CategoryModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.categoryModel);
        super.requestRebind();
    }
    public void setHealthArticlesViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel HealthArticlesViewModel) {
        this.mHealthArticlesViewModel = HealthArticlesViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.healthArticlesViewModel);
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
        java.lang.String categoryModelCategory = null;
        com.intellihealth.truemeds.data.model.home.CategoryListModel categoryModel = mCategoryModel;
        com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel healthArticlesViewModel = mHealthArticlesViewModel;

        if ((dirtyFlags & 0x5L) != 0) {



                if (categoryModel != null) {
                    // read categoryModel.category
                    categoryModelCategory = categoryModel.getCategory();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.categoryItemTV, categoryModelCategory);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mainCardCtl.setOnClickListener(mCallback67);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // categoryModel
        com.intellihealth.truemeds.data.model.home.CategoryListModel categoryModel = mCategoryModel;
        // healthArticlesViewModel
        com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel healthArticlesViewModel = mHealthArticlesViewModel;
        // healthArticlesViewModel != null
        boolean healthArticlesViewModelJavaLangObjectNull = false;



        healthArticlesViewModelJavaLangObjectNull = (healthArticlesViewModel) != (null);
        if (healthArticlesViewModelJavaLangObjectNull) {



            healthArticlesViewModel.getHealthArticlesCategoryDetails(categoryModel);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): categoryModel
        flag 1 (0x2L): healthArticlesViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}