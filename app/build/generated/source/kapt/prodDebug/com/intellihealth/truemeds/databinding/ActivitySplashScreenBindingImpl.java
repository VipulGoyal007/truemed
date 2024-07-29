package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySplashScreenBindingImpl extends ActivitySplashScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lottieView, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySplashScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivitySplashScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.airbnb.lottie.LottieAnimationView) bindings[2]
            , (android.widget.ProgressBar) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbSplashScreen.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSecondsRemainingForLoader((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSecondsRemainingForLoader(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelSecondsRemainingForLoader, int fieldId) {
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
        int androidxDatabindingViewDataBindingSafeUnboxViewModelSecondsRemainingForLoaderGetValue = 0;
        int viewModelSecondsRemainingForLoaderInt0ViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelSecondsRemainingForLoaderGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelSecondsRemainingForLoader = null;
        boolean viewModelSecondsRemainingForLoaderInt0 = false;
        com.intellihealth.truemeds.presentation.viewmodel.SplashScreenViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.secondsRemainingForLoader
                    viewModelSecondsRemainingForLoader = viewModel.getSecondsRemainingForLoader();
                }
                updateLiveDataRegistration(0, viewModelSecondsRemainingForLoader);


                if (viewModelSecondsRemainingForLoader != null) {
                    // read viewModel.secondsRemainingForLoader.getValue()
                    viewModelSecondsRemainingForLoaderGetValue = viewModelSecondsRemainingForLoader.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secondsRemainingForLoader.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelSecondsRemainingForLoaderGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSecondsRemainingForLoaderGetValue);


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secondsRemainingForLoader.getValue()) <= 0
                viewModelSecondsRemainingForLoaderInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelSecondsRemainingForLoaderGetValue) <= (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelSecondsRemainingForLoaderInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secondsRemainingForLoader.getValue()) <= 0 ? View.VISIBLE : View.GONE
                viewModelSecondsRemainingForLoaderInt0ViewVISIBLEViewGONE = ((viewModelSecondsRemainingForLoaderInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.pbSplashScreen.setVisibility(viewModelSecondsRemainingForLoaderInt0ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.secondsRemainingForLoader
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secondsRemainingForLoader.getValue()) <= 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secondsRemainingForLoader.getValue()) <= 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}