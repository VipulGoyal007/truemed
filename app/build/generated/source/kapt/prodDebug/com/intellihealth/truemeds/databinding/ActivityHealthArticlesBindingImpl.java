package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHealthArticlesBindingImpl extends ActivityHealthArticlesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mobileSectionHeadersTextWithCTA, 2);
        sViewsWithIds.put(R.id.latestArticleHeading, 3);
        sViewsWithIds.put(R.id.progressBar, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHealthArticlesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityHealthArticlesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[2]
            , (android.widget.ProgressBar) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvArticles.setTag(null);
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
                return onChangeHealthArticlesViewModelHealthArticleList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHealthArticlesViewModelHealthArticleList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel>> HealthArticlesViewModelHealthArticleList, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel>> healthArticlesViewModelHealthArticleList = null;
        com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel healthArticlesViewModel = mHealthArticlesViewModel;
        java.util.List<com.intellihealth.truemeds.presentation.model.BlogCardModel> healthArticlesViewModelHealthArticleListGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (healthArticlesViewModel != null) {
                    // read healthArticlesViewModel.healthArticleList
                    healthArticlesViewModelHealthArticleList = healthArticlesViewModel.getHealthArticleList();
                }
                updateLiveDataRegistration(0, healthArticlesViewModelHealthArticleList);


                if (healthArticlesViewModelHealthArticleList != null) {
                    // read healthArticlesViewModel.healthArticleList.getValue()
                    healthArticlesViewModelHealthArticleListGetValue = healthArticlesViewModelHealthArticleList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HealthArticleCategoryBindingAdapterKt.setHealthArticleList(this.rvArticles, healthArticlesViewModelHealthArticleListGetValue, healthArticlesViewModel);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): healthArticlesViewModel.healthArticleList
        flag 1 (0x2L): healthArticlesViewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}