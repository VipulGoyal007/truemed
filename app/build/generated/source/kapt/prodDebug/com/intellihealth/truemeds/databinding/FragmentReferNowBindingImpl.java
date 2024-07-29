package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReferNowBindingImpl extends FragmentReferNowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scroll, 10);
        sViewsWithIds.put(R.id.im_background, 11);
        sViewsWithIds.put(R.id.ivRefer, 12);
        sViewsWithIds.put(R.id.view, 13);
        sViewsWithIds.put(R.id.divider, 14);
        sViewsWithIds.put(R.id.tvTitle, 15);
        sViewsWithIds.put(R.id.faq, 16);
        sViewsWithIds.put(R.id.btnViewMore, 17);
        sViewsWithIds.put(R.id.btTnc, 18);
    }
    // views
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView1;
    @NonNull
    private final android.view.View mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReferNowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentReferNowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[18]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.intellihealth.salt.views.cards.Divider) bindings[14]
            , (com.intellihealth.salt.views.edittext.InputFieldLayout) bindings[7]
            , (com.intellihealth.salt.views.cards.Faq) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (com.intellihealth.salt.views.cards.InstructionAccordionCard) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[12]
            , (android.widget.ProgressBar) bindings[9]
            , (com.intellihealth.salt.views.cards.ActionCard) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (com.intellihealth.salt.views.cards.ActionCard) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[15]
            , (android.view.View) bindings[13]
            , (com.intellihealth.salt.views.cards.WalletCard) bindings[5]
            );
        this.clMyReferNow.setTag(null);
        this.etClaimReward.setTag(null);
        this.instructionAccordion.setTag(null);
        this.mboundView1 = (com.intellihealth.salt.views.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView8 = (android.view.View) bindings[8];
        this.mboundView8.setTag(null);
        this.progressBar.setTag(null);
        this.referFriendActionCard.setTag(null);
        this.tmActionCartPrescription.setTag(null);
        this.tvClaimRewardHeader.setTag(null);
        this.walletCard.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        if (BR.model == variableId) {
            setModel((com.intellihealth.salt.models.InstructionAccordionModel) variable);
        }
        else if (BR.walletInfoResponse == variableId) {
            setWalletInfoResponse((com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.intellihealth.salt.models.InstructionAccordionModel Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setWalletInfoResponse(@Nullable com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse WalletInfoResponse) {
        this.mWalletInfoResponse = WalletInfoResponse;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.walletInfoResponse);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelYetToPlaceOrderMessage((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelTotalRewardsEarning((androidx.lifecycle.MutableLiveData<java.lang.Double>) object, fieldId);
            case 2 :
                return onChangeViewModelShowLoader((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelShowView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelAlreadyRedeemedLiveData((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelReferralCode((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelWalletCardData((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelYetToPlaceOrderMessage(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelYetToPlaceOrderMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTotalRewardsEarning(androidx.lifecycle.MutableLiveData<java.lang.Double> ViewModelTotalRewardsEarning, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowLoader(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowLoader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAlreadyRedeemedLiveData(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAlreadyRedeemedLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelReferralCode(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelReferralCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWalletCardData(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> ViewModelWalletCardData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        com.intellihealth.salt.models.InstructionAccordionModel model = mModel;
        java.lang.String viewModelYetToPlaceOrderMessageGetValue = null;
        double androidxDatabindingViewDataBindingSafeUnboxViewModelTotalRewardsEarningGetValue = 0.0;
        boolean walletInfoResponseResponseDataReferralLinkEqualsJavaLangString = false;
        java.lang.Boolean viewModelAlreadyRedeemedLiveDataGetValue = null;
        com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse.ResponseData walletInfoResponseResponseData = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelYetToPlaceOrderMessage = null;
        androidx.lifecycle.MutableLiveData<java.lang.Double> viewModelTotalRewardsEarning = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowLoader = null;
        java.lang.Boolean viewModelShowViewGetValue = null;
        int viewModelShowViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowView = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAlreadyRedeemedLiveData = null;
        int walletInfoResponseResponseDataReferralLinkEqualsJavaLangStringViewGONEViewVISIBLE = 0;
        int viewModelTotalRewardsEarningInt0ViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelReferralCode = null;
        boolean viewModelTotalRewardsEarningInt0 = false;
        int viewModelAlreadyRedeemedLiveDataViewGONEViewVISIBLE = 0;
        com.intellihealth.truemeds.data.model.walletandreferral.WalletInfoResponse walletInfoResponse = mWalletInfoResponse;
        java.lang.String viewModelYetToPlaceOrderMessageTrim = null;
        java.lang.Double viewModelTotalRewardsEarningGetValue = null;
        java.lang.String walletInfoResponseResponseDataReferNowHeaderMessage = null;
        boolean viewModelYetToPlaceOrderMessageJavaLangObjectNull = false;
        java.lang.Boolean viewModelShowLoaderGetValue = null;
        com.intellihealth.salt.models.WalletBalanceModel viewModelWalletCardDataGetValue = null;
        boolean viewModelYetToPlaceOrderMessageTrimEqualsJavaLangString = false;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.WalletBalanceModel> viewModelWalletCardData = null;
        int viewModelYetToPlaceOrderMessageJavaLangObjectNullBooleanTrueViewModelYetToPlaceOrderMessageTrimEqualsJavaLangStringViewGONEViewVISIBLE = 0;
        int viewModelShowLoaderViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoaderGetValue = false;
        java.lang.String walletInfoResponseResponseDataReferralLink = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAlreadyRedeemedLiveDataGetValue = false;
        boolean viewModelYetToPlaceOrderMessageJavaLangObjectNullBooleanTrueViewModelYetToPlaceOrderMessageTrimEqualsJavaLangString = false;
        java.lang.String viewModelReferralCodeGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.ReferNEarnViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewGetValue = false;

        if ((dirtyFlags & 0x480L) != 0) {
        }
        if ((dirtyFlags & 0x500L) != 0) {



                if (walletInfoResponse != null) {
                    // read walletInfoResponse.responseData
                    walletInfoResponseResponseData = walletInfoResponse.getResponseData();
                }


                if (walletInfoResponseResponseData != null) {
                    // read walletInfoResponse.responseData.referNowHeaderMessage
                    walletInfoResponseResponseDataReferNowHeaderMessage = walletInfoResponseResponseData.getReferNowHeaderMessage();
                    // read walletInfoResponse.responseData.referralLink
                    walletInfoResponseResponseDataReferralLink = walletInfoResponseResponseData.getReferralLink();
                }


                if (walletInfoResponseResponseDataReferralLink != null) {
                    // read walletInfoResponse.responseData.referralLink.equals("")
                    walletInfoResponseResponseDataReferralLinkEqualsJavaLangString = walletInfoResponseResponseDataReferralLink.equals("");
                }
            if((dirtyFlags & 0x500L) != 0) {
                if(walletInfoResponseResponseDataReferralLinkEqualsJavaLangString) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read walletInfoResponse.responseData.referralLink.equals("") ? View.GONE : View.VISIBLE
                walletInfoResponseResponseDataReferralLinkEqualsJavaLangStringViewGONEViewVISIBLE = ((walletInfoResponseResponseDataReferralLinkEqualsJavaLangString) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x67fL) != 0) {


            if ((dirtyFlags & 0x601L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.yetToPlaceOrderMessage
                        viewModelYetToPlaceOrderMessage = viewModel.getYetToPlaceOrderMessage();
                    }
                    updateLiveDataRegistration(0, viewModelYetToPlaceOrderMessage);


                    if (viewModelYetToPlaceOrderMessage != null) {
                        // read viewModel.yetToPlaceOrderMessage.getValue()
                        viewModelYetToPlaceOrderMessageGetValue = viewModelYetToPlaceOrderMessage.getValue();
                    }


                    // read viewModel.yetToPlaceOrderMessage.getValue() == null
                    viewModelYetToPlaceOrderMessageJavaLangObjectNull = (viewModelYetToPlaceOrderMessageGetValue) == (null);
                if((dirtyFlags & 0x601L) != 0) {
                    if(viewModelYetToPlaceOrderMessageJavaLangObjectNull) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }
            }
            if ((dirtyFlags & 0x602L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.totalRewardsEarning
                        viewModelTotalRewardsEarning = viewModel.getTotalRewardsEarning();
                    }
                    updateLiveDataRegistration(1, viewModelTotalRewardsEarning);


                    if (viewModelTotalRewardsEarning != null) {
                        // read viewModel.totalRewardsEarning.getValue()
                        viewModelTotalRewardsEarningGetValue = viewModelTotalRewardsEarning.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.totalRewardsEarning.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelTotalRewardsEarningGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelTotalRewardsEarningGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.totalRewardsEarning.getValue()) > 0
                    viewModelTotalRewardsEarningInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelTotalRewardsEarningGetValue) > (0);
                if((dirtyFlags & 0x602L) != 0) {
                    if(viewModelTotalRewardsEarningInt0) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.totalRewardsEarning.getValue()) > 0 ? View.VISIBLE : View.GONE
                    viewModelTotalRewardsEarningInt0ViewVISIBLEViewGONE = ((viewModelTotalRewardsEarningInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x604L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showLoader
                        viewModelShowLoader = viewModel.getShowLoader();
                    }
                    updateLiveDataRegistration(2, viewModelShowLoader);


                    if (viewModelShowLoader != null) {
                        // read viewModel.showLoader.getValue()
                        viewModelShowLoaderGetValue = viewModelShowLoader.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoader.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoaderGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowLoaderGetValue);
                if((dirtyFlags & 0x604L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoaderGetValue) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoader.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowLoaderViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoaderGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x608L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showView
                        viewModelShowView = viewModel.getShowView();
                    }
                    updateLiveDataRegistration(3, viewModelShowView);


                    if (viewModelShowView != null) {
                        // read viewModel.showView.getValue()
                        viewModelShowViewGetValue = viewModelShowView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowViewGetValue);
                if((dirtyFlags & 0x608L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewGetValue) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x610L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.alreadyRedeemedLiveData
                        viewModelAlreadyRedeemedLiveData = viewModel.getAlreadyRedeemedLiveData();
                    }
                    updateLiveDataRegistration(4, viewModelAlreadyRedeemedLiveData);


                    if (viewModelAlreadyRedeemedLiveData != null) {
                        // read viewModel.alreadyRedeemedLiveData.getValue()
                        viewModelAlreadyRedeemedLiveDataGetValue = viewModelAlreadyRedeemedLiveData.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.alreadyRedeemedLiveData.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAlreadyRedeemedLiveDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAlreadyRedeemedLiveDataGetValue);
                if((dirtyFlags & 0x610L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAlreadyRedeemedLiveDataGetValue) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.alreadyRedeemedLiveData.getValue()) ? View.GONE : View.VISIBLE
                    viewModelAlreadyRedeemedLiveDataViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAlreadyRedeemedLiveDataGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x620L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.referralCode
                        viewModelReferralCode = viewModel.getReferralCode();
                    }
                    updateLiveDataRegistration(5, viewModelReferralCode);


                    if (viewModelReferralCode != null) {
                        // read viewModel.referralCode.getValue()
                        viewModelReferralCodeGetValue = viewModelReferralCode.getValue();
                    }
            }
            if ((dirtyFlags & 0x640L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.walletCardData
                        viewModelWalletCardData = viewModel.getWalletCardData();
                    }
                    updateLiveDataRegistration(6, viewModelWalletCardData);


                    if (viewModelWalletCardData != null) {
                        // read viewModel.walletCardData.getValue()
                        viewModelWalletCardDataGetValue = viewModelWalletCardData.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x800000L) != 0) {

                if (viewModelYetToPlaceOrderMessageGetValue != null) {
                    // read viewModel.yetToPlaceOrderMessage.getValue().trim()
                    viewModelYetToPlaceOrderMessageTrim = viewModelYetToPlaceOrderMessageGetValue.trim();
                }


                if (viewModelYetToPlaceOrderMessageTrim != null) {
                    // read viewModel.yetToPlaceOrderMessage.getValue().trim().equals("")
                    viewModelYetToPlaceOrderMessageTrimEqualsJavaLangString = viewModelYetToPlaceOrderMessageTrim.equals("");
                }
        }

        if ((dirtyFlags & 0x601L) != 0) {

                // read viewModel.yetToPlaceOrderMessage.getValue() == null ? true : viewModel.yetToPlaceOrderMessage.getValue().trim().equals("")
                viewModelYetToPlaceOrderMessageJavaLangObjectNullBooleanTrueViewModelYetToPlaceOrderMessageTrimEqualsJavaLangString = ((viewModelYetToPlaceOrderMessageJavaLangObjectNull) ? (true) : (viewModelYetToPlaceOrderMessageTrimEqualsJavaLangString));
            if((dirtyFlags & 0x601L) != 0) {
                if(viewModelYetToPlaceOrderMessageJavaLangObjectNullBooleanTrueViewModelYetToPlaceOrderMessageTrimEqualsJavaLangString) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }


                // read viewModel.yetToPlaceOrderMessage.getValue() == null ? true : viewModel.yetToPlaceOrderMessage.getValue().trim().equals("") ? View.GONE : View.VISIBLE
                viewModelYetToPlaceOrderMessageJavaLangObjectNullBooleanTrueViewModelYetToPlaceOrderMessageTrimEqualsJavaLangStringViewGONEViewVISIBLE = ((viewModelYetToPlaceOrderMessageJavaLangObjectNullBooleanTrueViewModelYetToPlaceOrderMessageTrimEqualsJavaLangString) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            this.etClaimReward.setVisibility(viewModelAlreadyRedeemedLiveDataViewGONEViewVISIBLE);
            this.tvClaimRewardHeader.setVisibility(viewModelAlreadyRedeemedLiveDataViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x480L) != 0) {
            // api target 1

            this.instructionAccordion.setInstructionAccordionCardData(model);
        }
        if ((dirtyFlags & 0x500L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, walletInfoResponseResponseDataReferNowHeaderMessage);
            this.referFriendActionCard.setVisibility(walletInfoResponseResponseDataReferralLinkEqualsJavaLangStringViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x608L) != 0) {
            // api target 1

            this.mboundView8.setVisibility(viewModelShowViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelShowLoaderViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x620L) != 0) {
            // api target 1

            this.referFriendActionCard.setDescription(viewModelReferralCodeGetValue);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            this.tmActionCartPrescription.setVisibility(viewModelYetToPlaceOrderMessageJavaLangObjectNullBooleanTrueViewModelYetToPlaceOrderMessageTrimEqualsJavaLangStringViewGONEViewVISIBLE);
            this.tmActionCartPrescription.title(viewModelYetToPlaceOrderMessageGetValue);
        }
        if ((dirtyFlags & 0x602L) != 0) {
            // api target 1

            this.walletCard.setVisibility(viewModelTotalRewardsEarningInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x640L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.AccountMenuBindingAdapterKt.setWalletBalanceUIData(this.walletCard, viewModelWalletCardDataGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.yetToPlaceOrderMessage
        flag 1 (0x2L): viewModel.totalRewardsEarning
        flag 2 (0x3L): viewModel.showLoader
        flag 3 (0x4L): viewModel.showView
        flag 4 (0x5L): viewModel.alreadyRedeemedLiveData
        flag 5 (0x6L): viewModel.referralCode
        flag 6 (0x7L): viewModel.walletCardData
        flag 7 (0x8L): model
        flag 8 (0x9L): walletInfoResponse
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showView.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showView.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): walletInfoResponse.responseData.referralLink.equals("") ? View.GONE : View.VISIBLE
        flag 14 (0xfL): walletInfoResponse.responseData.referralLink.equals("") ? View.GONE : View.VISIBLE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.totalRewardsEarning.getValue()) > 0 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.totalRewardsEarning.getValue()) > 0 ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.alreadyRedeemedLiveData.getValue()) ? View.GONE : View.VISIBLE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.alreadyRedeemedLiveData.getValue()) ? View.GONE : View.VISIBLE
        flag 19 (0x14L): viewModel.yetToPlaceOrderMessage.getValue() == null ? true : viewModel.yetToPlaceOrderMessage.getValue().trim().equals("") ? View.GONE : View.VISIBLE
        flag 20 (0x15L): viewModel.yetToPlaceOrderMessage.getValue() == null ? true : viewModel.yetToPlaceOrderMessage.getValue().trim().equals("") ? View.GONE : View.VISIBLE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoader.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoader.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewModel.yetToPlaceOrderMessage.getValue() == null ? true : viewModel.yetToPlaceOrderMessage.getValue().trim().equals("")
        flag 24 (0x19L): viewModel.yetToPlaceOrderMessage.getValue() == null ? true : viewModel.yetToPlaceOrderMessage.getValue().trim().equals("")
    flag mapping end*/
    //end
}