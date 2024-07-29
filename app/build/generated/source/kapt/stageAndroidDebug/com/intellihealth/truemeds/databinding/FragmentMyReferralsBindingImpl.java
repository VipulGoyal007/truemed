package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyReferralsBindingImpl extends FragmentMyReferralsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.noReferralLayout, 3);
        sViewsWithIds.put(R.id.img, 4);
        sViewsWithIds.put(R.id.tvPlaeholder, 5);
        sViewsWithIds.put(R.id.tvReferAndFriend, 6);
        sViewsWithIds.put(R.id.referralListLayout, 7);
        sViewsWithIds.put(R.id.rvReminder, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.view.View mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyReferralsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentMyReferralsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.view.View) bindings[1];
        this.mboundView1.setTag(null);
        this.progressBar.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelShowView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelShowLoader((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowLoader(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowLoader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.Boolean viewModelShowViewGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoaderGetValue = false;
        int viewModelShowViewViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelShowLoaderGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowView = null;
        com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewGetValue = false;
        int viewModelShowLoaderViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowLoader = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showView
                        viewModelShowView = viewModel.getShowView();
                    }
                    updateLiveDataRegistration(0, viewModelShowView);


                    if (viewModelShowView != null) {
                        // read viewModel.showView.getValue()
                        viewModelShowViewGetValue = viewModelShowView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowViewGetValue);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewGetValue) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showLoader
                        viewModelShowLoader = viewModel.getShowLoader();
                    }
                    updateLiveDataRegistration(1, viewModelShowLoader);


                    if (viewModelShowLoader != null) {
                        // read viewModel.showLoader.getValue()
                        viewModelShowLoaderGetValue = viewModelShowLoader.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoader.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoaderGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowLoaderGetValue);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoaderGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoader.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowLoaderViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoaderGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelShowViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelShowLoaderViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showView
        flag 1 (0x2L): viewModel.showLoader
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showView.getValue()) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showView.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoader.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoader.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}