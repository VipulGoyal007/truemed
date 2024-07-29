package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HealthArticleBottomsheetBindingImpl extends HealthArticleBottomsheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewDragHandle, 2);
        sViewsWithIds.put(R.id.tvHeader, 3);
        sViewsWithIds.put(R.id.imageClose, 4);
        sViewsWithIds.put(R.id.ivShadow, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HealthArticleBottomsheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private HealthArticleBottomsheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (android.view.View) bindings[2]
            );
        this.healthArticleItemRv.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.healthArticlesViewModel == variableId) {
            setHealthArticlesViewModel((com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
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
            case 0 :
                return onChangeHealthArticlesViewModelGetHealthArticleFilterCategoryList((androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHealthArticlesViewModelGetHealthArticleFilterCategoryList(androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel>> HealthArticlesViewModelGetHealthArticleFilterCategoryList, int fieldId) {
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
        androidx.lifecycle.LiveData<java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel>> healthArticlesViewModelGetHealthArticleFilterCategoryList = null;
        java.util.List<com.intellihealth.truemeds.data.model.home.CategoryListModel> healthArticlesViewModelGetHealthArticleFilterCategoryListGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel healthArticlesViewModel = mHealthArticlesViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (healthArticlesViewModel != null) {
                    // read healthArticlesViewModel.getHealthArticleFilterCategoryList
                    healthArticlesViewModelGetHealthArticleFilterCategoryList = healthArticlesViewModel.getGetHealthArticleFilterCategoryList();
                }
                updateLiveDataRegistration(0, healthArticlesViewModelGetHealthArticleFilterCategoryList);


                if (healthArticlesViewModelGetHealthArticleFilterCategoryList != null) {
                    // read healthArticlesViewModel.getHealthArticleFilterCategoryList.getValue()
                    healthArticlesViewModelGetHealthArticleFilterCategoryListGetValue = healthArticlesViewModelGetHealthArticleFilterCategoryList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HealthArticleCategoryBindingAdapterKt.setHealthArticleCategoryList(this.healthArticleItemRv, healthArticlesViewModelGetHealthArticleFilterCategoryListGetValue, healthArticlesViewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): healthArticlesViewModel.getHealthArticleFilterCategoryList
        flag 1 (0x2L): healthArticlesViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}