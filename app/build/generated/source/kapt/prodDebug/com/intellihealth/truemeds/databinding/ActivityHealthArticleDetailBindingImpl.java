package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHealthArticleDetailBindingImpl extends ActivityHealthArticleDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.healthArticleHeader, 7);
        sViewsWithIds.put(R.id.imgCover, 8);
        sViewsWithIds.put(R.id.wvContainer, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHealthArticleDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityHealthArticleDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (android.widget.ProgressBar) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[1]
            , (android.webkit.WebView) bindings[9]
            );
        this.chipRecyclerView.setTag(null);
        this.healthArticleList.setTag(null);
        this.imgShare.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.txtSubTitle.setTag(null);
        this.txtTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.chipData == variableId) {
            setChipData((java.util.List<java.lang.String>) variable);
        }
        else if (BR.healthArticlesViewModel == variableId) {
            setHealthArticlesViewModel((com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChipData(@Nullable java.util.List<java.lang.String> ChipData) {
        this.mChipData = ChipData;
    }
    public void setHealthArticlesViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel HealthArticlesViewModel) {
        this.mHealthArticlesViewModel = HealthArticlesViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.healthArticlesViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHealthArticlesViewModelHealthArticleBlogModel((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.home.BlogSectionDataModel>) object, fieldId);
            case 1 :
                return onChangeHealthArticlesViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeHealthArticlesViewModelAuthor((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeHealthArticlesViewModelTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHealthArticlesViewModelHealthArticleBlogModel(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.home.BlogSectionDataModel> HealthArticlesViewModelHealthArticleBlogModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHealthArticlesViewModelLoaderValue(androidx.lifecycle.MutableLiveData<java.lang.Boolean> HealthArticlesViewModelLoaderValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHealthArticlesViewModelAuthor(androidx.lifecycle.MutableLiveData<java.lang.String> HealthArticlesViewModelAuthor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHealthArticlesViewModelTitle(androidx.lifecycle.MutableLiveData<java.lang.String> HealthArticlesViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        com.intellihealth.truemeds.data.model.home.BlogSectionDataModel healthArticlesViewModelHealthArticleBlogModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.home.BlogSectionDataModel> healthArticlesViewModelHealthArticleBlogModel = null;
        java.lang.String healthArticlesViewModelTitleGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.HealthArticlesViewModel healthArticlesViewModel = mHealthArticlesViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> healthArticlesViewModelLoaderValue = null;
        java.lang.Boolean healthArticlesViewModelLoaderValueGetValue = null;
        int healthArticlesViewModelLoaderValueViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> healthArticlesViewModelAuthor = null;
        int healthArticlesViewModelLoaderValueViewVISIBLEViewGONE = 0;
        java.lang.String healthArticlesViewModelAuthorGetValue = null;
        java.util.List<com.intellihealth.salt.models.HealthArticleChipCategoryData> healthArticlesViewModelCategoryChipList = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> healthArticlesViewModelTitle = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxHealthArticlesViewModelLoaderValueGetValue = false;

        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (healthArticlesViewModel != null) {
                        // read healthArticlesViewModel.healthArticleBlogModel
                        healthArticlesViewModelHealthArticleBlogModel = healthArticlesViewModel.getHealthArticleBlogModel();
                    }
                    updateLiveDataRegistration(0, healthArticlesViewModelHealthArticleBlogModel);


                    if (healthArticlesViewModelHealthArticleBlogModel != null) {
                        // read healthArticlesViewModel.healthArticleBlogModel.getValue()
                        healthArticlesViewModelHealthArticleBlogModelGetValue = healthArticlesViewModelHealthArticleBlogModel.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (healthArticlesViewModel != null) {
                        // read healthArticlesViewModel.loaderValue
                        healthArticlesViewModelLoaderValue = healthArticlesViewModel.getLoaderValue();
                    }
                    updateLiveDataRegistration(1, healthArticlesViewModelLoaderValue);


                    if (healthArticlesViewModelLoaderValue != null) {
                        // read healthArticlesViewModel.loaderValue.getValue()
                        healthArticlesViewModelLoaderValueGetValue = healthArticlesViewModelLoaderValue.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(healthArticlesViewModel.loaderValue.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxHealthArticlesViewModelLoaderValueGetValue = androidx.databinding.ViewDataBinding.safeUnbox(healthArticlesViewModelLoaderValueGetValue);
                if((dirtyFlags & 0x62L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxHealthArticlesViewModelLoaderValueGetValue) {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(healthArticlesViewModel.loaderValue.getValue()) ? View.GONE : View.VISIBLE
                    healthArticlesViewModelLoaderValueViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxHealthArticlesViewModelLoaderValueGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(healthArticlesViewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                    healthArticlesViewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxHealthArticlesViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (healthArticlesViewModel != null) {
                        // read healthArticlesViewModel.author
                        healthArticlesViewModelAuthor = healthArticlesViewModel.getAuthor();
                    }
                    updateLiveDataRegistration(2, healthArticlesViewModelAuthor);


                    if (healthArticlesViewModelAuthor != null) {
                        // read healthArticlesViewModel.author.getValue()
                        healthArticlesViewModelAuthorGetValue = healthArticlesViewModelAuthor.getValue();
                    }
            }
            if ((dirtyFlags & 0x60L) != 0) {

                    if (healthArticlesViewModel != null) {
                        // read healthArticlesViewModel.categoryChipList
                        healthArticlesViewModelCategoryChipList = healthArticlesViewModel.getCategoryChipList();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (healthArticlesViewModel != null) {
                        // read healthArticlesViewModel.title
                        healthArticlesViewModelTitle = healthArticlesViewModel.getTitle();
                    }
                    updateLiveDataRegistration(3, healthArticlesViewModelTitle);


                    if (healthArticlesViewModelTitle != null) {
                        // read healthArticlesViewModel.title.getValue()
                        healthArticlesViewModelTitleGetValue = healthArticlesViewModelTitle.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HealthArticleChipCategoryBindingADapterKt.setHealthArticleChipCategoryList(this.chipRecyclerView, healthArticlesViewModelCategoryChipList, healthArticlesViewModel);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HealthArticleBindingAdapterKt.setHealthArticleSuggestionList(this.healthArticleList, healthArticlesViewModelHealthArticleBlogModelGetValue, healthArticlesViewModel);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.imgShare.setVisibility(healthArticlesViewModelLoaderValueViewGONEViewVISIBLE);
            this.progressBar.setVisibility(healthArticlesViewModelLoaderValueViewVISIBLEViewGONE);
            this.txtSubTitle.setVisibility(healthArticlesViewModelLoaderValueViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.HealthArticleBindingAdapterKt.setSubTitle(this.txtSubTitle, healthArticlesViewModelAuthorGetValue, healthArticlesViewModel);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTitle, healthArticlesViewModelTitleGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): healthArticlesViewModel.healthArticleBlogModel
        flag 1 (0x2L): healthArticlesViewModel.loaderValue
        flag 2 (0x3L): healthArticlesViewModel.author
        flag 3 (0x4L): healthArticlesViewModel.title
        flag 4 (0x5L): chipData
        flag 5 (0x6L): healthArticlesViewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(healthArticlesViewModel.loaderValue.getValue()) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(healthArticlesViewModel.loaderValue.getValue()) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(healthArticlesViewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(healthArticlesViewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}