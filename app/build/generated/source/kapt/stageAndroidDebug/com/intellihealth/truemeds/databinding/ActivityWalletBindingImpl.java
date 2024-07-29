package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityWalletBindingImpl extends ActivityWalletBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mobileSectionHeaderWallet, 4);
        sViewsWithIds.put(R.id.cl_transaction_section, 5);
        sViewsWithIds.put(R.id.cl_reward_section, 6);
        sViewsWithIds.put(R.id.textReward, 7);
        sViewsWithIds.put(R.id.textRewardAmount, 8);
        sViewsWithIds.put(R.id.textViewRewardTransactions, 9);
        sViewsWithIds.put(R.id.cl_credit_section, 10);
        sViewsWithIds.put(R.id.textCredit, 11);
        sViewsWithIds.put(R.id.textCreditAmount, 12);
        sViewsWithIds.put(R.id.textViewCreditTransactions, 13);
        sViewsWithIds.put(R.id.textEarnRewardHeader, 14);
        sViewsWithIds.put(R.id.tmActionWalletCard, 15);
        sViewsWithIds.put(R.id.textFAQHeader, 16);
        sViewsWithIds.put(R.id.faqList, 17);
        sViewsWithIds.put(R.id.textViewTermsAndConditions, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityWalletBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityWalletBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[2]
            , (com.intellihealth.salt.views.cards.Faq) bindings[17]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[4]
            , (android.widget.ProgressBar) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            , (com.intellihealth.salt.views.TextView) bindings[14]
            , (com.intellihealth.salt.views.TextView) bindings[16]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[18]
            , (com.intellihealth.salt.views.cards.ActionCard) bindings[15]
            , (com.intellihealth.salt.views.cards.WalletCard) bindings[3]
            );
        this.contentScroll.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.walletCard.setTag(null);
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
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel ViewModel) {
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
                return onChangeViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelWalletCardData((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoaderValue(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoaderValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWalletCardData(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> ViewModelWalletCardData, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoaderValue = null;
        com.intellihealth.salt.models.WalletBalanceModel viewModelWalletCardDataGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> viewModelWalletCardData = null;
        int viewModelLoaderValueBooleanTrueViewGONEViewVISIBLE = 0;
        int viewModelLoaderValueBooleanTrueViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        boolean viewModelLoaderValueBooleanTrue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loaderValue
                        viewModelLoaderValue = viewModel.getLoaderValue();
                    }
                    updateLiveDataRegistration(0, viewModelLoaderValue);


                    if (viewModelLoaderValue != null) {
                        // read viewModel.loaderValue.getValue()
                        viewModelLoaderValueGetValue = viewModelLoaderValue.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoaderValueGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true
                    viewModelLoaderValueBooleanTrue = (androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) == (true);
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelLoaderValueBooleanTrue) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true ? View.GONE : View.VISIBLE
                    viewModelLoaderValueBooleanTrueViewGONEViewVISIBLE = ((viewModelLoaderValueBooleanTrue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true ? View.VISIBLE : View.GONE
                    viewModelLoaderValueBooleanTrueViewVISIBLEViewGONE = ((viewModelLoaderValueBooleanTrue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.walletCardData
                        viewModelWalletCardData = viewModel.getWalletCardData();
                    }
                    updateLiveDataRegistration(1, viewModelWalletCardData);


                    if (viewModelWalletCardData != null) {
                        // read viewModel.walletCardData.getValue()
                        viewModelWalletCardDataGetValue = viewModelWalletCardData.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.contentScroll.setVisibility(viewModelLoaderValueBooleanTrueViewGONEViewVISIBLE);
            this.progressBar.setVisibility(viewModelLoaderValueBooleanTrueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.walletCard.setWalletBalanceData(viewModelWalletCardDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loaderValue
        flag 1 (0x2L): viewModel.walletCardData
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true ? View.GONE : View.VISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}