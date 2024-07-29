package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityWalletTranasctionsBindingImpl extends ActivityWalletTranasctionsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mobileSectionHeaderWalletTransactions, 3);
        sViewsWithIds.put(R.id.progressBar, 4);
        sViewsWithIds.put(R.id.contentScroll, 5);
        sViewsWithIds.put(R.id.textEarnRewardHeader, 6);
        sViewsWithIds.put(R.id.textSelectedCustomDates, 7);
        sViewsWithIds.put(R.id.textViewRewardTransactions, 8);
        sViewsWithIds.put(R.id.cl_transaction_data, 9);
        sViewsWithIds.put(R.id.rvWalletTransaction, 10);
        sViewsWithIds.put(R.id.ic_no_records, 11);
        sViewsWithIds.put(R.id.textFAQHeaderTransactions, 12);
        sViewsWithIds.put(R.id.faqListWalletTransactions, 13);
        sViewsWithIds.put(R.id.textViewTermsAndConditionsTransactions, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityWalletTranasctionsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityWalletTranasctionsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.core.widget.NestedScrollView) bindings[5]
            , (com.intellihealth.salt.views.cards.Faq) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[3]
            , (android.widget.ProgressBar) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[8]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[14]
            , (com.intellihealth.salt.views.cards.WalletCard) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.walletTransactionCard.setTag(null);
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
        if (BR.isRewardTransaction == variableId) {
            setIsRewardTransaction((java.lang.Boolean) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.data.callback.TimeIntervalCallback) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsRewardTransaction(@Nullable java.lang.Boolean IsRewardTransaction) {
        this.mIsRewardTransaction = IsRewardTransaction;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.isRewardTransaction);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.intellihealth.truemeds.data.callback.TimeIntervalCallback Callback) {
        this.mCallback = Callback;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
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
                return onChangeViewModelWalletCardCreditData((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel>) object, fieldId);
            case 2 :
                return onChangeViewModelWalletCardRewardData((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel>) object, fieldId);
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
    private boolean onChangeViewModelWalletCardCreditData(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> ViewModelWalletCardCreditData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWalletCardRewardData(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> ViewModelWalletCardRewardData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.Boolean isRewardTransaction = mIsRewardTransaction;
        com.intellihealth.salt.models.WalletBalanceModel viewModelWalletCardRewardDataGetValue = null;
        com.intellihealth.salt.models.WalletBalanceModel viewModelWalletCardCreditDataGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsRewardTransaction = false;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> viewModelWalletCardCreditData = null;
        int viewModelLoaderValueBooleanTrueViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        boolean viewModelLoaderValueBooleanTrue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        com.intellihealth.truemeds.presentation.viewmodel.WalletViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> viewModelWalletCardRewardData = null;
        com.intellihealth.salt.models.WalletBalanceModel isRewardTransactionViewModelWalletCardRewardDataViewModelWalletCardCreditData = null;

        if ((dirtyFlags & 0x6eL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isRewardTransaction)
                androidxDatabindingViewDataBindingSafeUnboxIsRewardTransaction = androidx.databinding.ViewDataBinding.safeUnbox(isRewardTransaction);
            if((dirtyFlags & 0x6eL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsRewardTransaction) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
        }
        if ((dirtyFlags & 0x61L) != 0) {



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
            if((dirtyFlags & 0x61L) != 0) {
                if(viewModelLoaderValueBooleanTrue) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true ? View.VISIBLE : View.GONE
                viewModelLoaderValueBooleanTrueViewVISIBLEViewGONE = ((viewModelLoaderValueBooleanTrue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x600L) != 0) {


            if ((dirtyFlags & 0x200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.walletCardCreditData
                        viewModelWalletCardCreditData = viewModel.getWalletCardCreditData();
                    }
                    updateLiveDataRegistration(1, viewModelWalletCardCreditData);


                    if (viewModelWalletCardCreditData != null) {
                        // read viewModel.walletCardCreditData.getValue()
                        viewModelWalletCardCreditDataGetValue = viewModelWalletCardCreditData.getValue();
                    }
            }
            if ((dirtyFlags & 0x400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.walletCardRewardData
                        viewModelWalletCardRewardData = viewModel.getWalletCardRewardData();
                    }
                    updateLiveDataRegistration(2, viewModelWalletCardRewardData);


                    if (viewModelWalletCardRewardData != null) {
                        // read viewModel.walletCardRewardData.getValue()
                        viewModelWalletCardRewardDataGetValue = viewModelWalletCardRewardData.getValue();
                    }
            }
        }

        if ((dirtyFlags & 0x6eL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(isRewardTransaction) ? viewModel.walletCardRewardData.getValue() : viewModel.walletCardCreditData.getValue()
                isRewardTransactionViewModelWalletCardRewardDataViewModelWalletCardCreditData = ((androidxDatabindingViewDataBindingSafeUnboxIsRewardTransaction) ? (viewModelWalletCardRewardDataGetValue) : (viewModelWalletCardCreditDataGetValue));
        }
        // batch finished
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelLoaderValueBooleanTrueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6eL) != 0) {
            // api target 1

            this.walletTransactionCard.setWalletBalanceData(isRewardTransactionViewModelWalletCardRewardDataViewModelWalletCardCreditData);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loaderValue
        flag 1 (0x2L): viewModel.walletCardCreditData
        flag 2 (0x3L): viewModel.walletCardRewardData
        flag 3 (0x4L): isRewardTransaction
        flag 4 (0x5L): callback
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) == true ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(isRewardTransaction) ? viewModel.walletCardRewardData.getValue() : viewModel.walletCardCreditData.getValue()
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(isRewardTransaction) ? viewModel.walletCardRewardData.getValue() : viewModel.walletCardCreditData.getValue()
    flag mapping end*/
    //end
}