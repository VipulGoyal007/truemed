package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPaymentOptionBindingImpl extends ActivityPaymentOptionBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(27);
        sIncludes.setIncludes(2, 
            new String[] {"shimmer_manage_patient"},
            new int[] {19},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_manage_patient});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clPayableDesc, 20);
        sViewsWithIds.put(R.id.tmViewBill, 21);
        sViewsWithIds.put(R.id.tvFaqLabel, 22);
        sViewsWithIds.put(R.id.faqList, 23);
        sViewsWithIds.put(R.id.lottieView, 24);
        sViewsWithIds.put(R.id.tvOrderPlaced, 25);
        sViewsWithIds.put(R.id.ivOrderIsBeingPlaced, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView11;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPaymentOptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityPaymentOptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (com.intellihealth.salt.views.buttons.Button) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[17]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (com.intellihealth.salt.views.cards.Faq) bindings[23]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[26]
            , (com.airbnb.lottie.LottieAnimationView) bindings[24]
            , (android.widget.ProgressBar) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            , (com.intellihealth.salt.views.StickyNonStickyNotification) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[21]
            , (com.intellihealth.salt.views.TextView) bindings[22]
            , (com.intellihealth.salt.views.TextView) bindings[25]
            , (android.view.View) bindings[14]
            );
        this.btnViewMoreOptions.setTag(null);
        this.clBillDetails.setTag(null);
        this.clFAQ.setTag(null);
        this.clOrderIsBeingPlacedView.setTag(null);
        this.clOrderPlacedView.setTag(null);
        this.clPayableInfo.setTag(null);
        this.imgInfoCircle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView11 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (com.intellihealth.truemeds.databinding.ShimmerManagePatientBinding) bindings[19];
        setContainedBinding(this.mboundView2);
        this.progressBar.setTag(null);
        this.recyclerViewPaymentOptions.setTag(null);
        this.scrollView.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.tmAmountToBePaidDesc.setTag(null);
        this.tmEstimatedPayableLabel.setTag(null);
        this.tmMobileSectionHeader.setTag(null);
        this.tmPayableAmount.setTag(null);
        this.tmStickyNotificationCouponApplied.setTag(null);
        this.viewHorizontal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 2);
        mCallback3 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
        }
        mboundView2.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView2.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.ftcCouponAppliedData == variableId) {
            setFtcCouponAppliedData((com.intellihealth.salt.models.StickyNonStickyNotificationModel) variable);
        }
        else if (BR.faqData == variableId) {
            setFaqData((com.intellihealth.salt.models.InstructionAccordionModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFtcCouponAppliedData(@Nullable com.intellihealth.salt.models.StickyNonStickyNotificationModel FtcCouponAppliedData) {
        this.mFtcCouponAppliedData = FtcCouponAppliedData;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.ftcCouponAppliedData);
        super.requestRebind();
    }
    public void setFaqData(@Nullable com.intellihealth.salt.models.InstructionAccordionModel FaqData) {
        this.mFaqData = FaqData;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView2.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelClickedOnPageMutableLiveData((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelOrderIsBeingPlacedView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelOrderPlacedView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelSetMainDataView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelShowShimmerPaymentMethodsLiveData((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelPaymentOptionsMutableLiveData((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>>) object, fieldId);
            case 7 :
                return onChangeViewModelViewOtherPaymentOptions((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelTotalPayableAmountMutableLiveData((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelPaymentOptionsVisibleMutableLiveData((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelClickedOnPageMutableLiveData(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelClickedOnPageMutableLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderIsBeingPlacedView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelOrderIsBeingPlacedView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderPlacedView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelOrderPlacedView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoaderValue(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoaderValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSetMainDataView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSetMainDataView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmerPaymentMethodsLiveData(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelShowShimmerPaymentMethodsLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPaymentOptionsMutableLiveData(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> ViewModelPaymentOptionsMutableLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelViewOtherPaymentOptions(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelViewOtherPaymentOptions, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTotalPayableAmountMutableLiveData(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTotalPayableAmountMutableLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPaymentOptionsVisibleMutableLiveData(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> ViewModelPaymentOptionsVisibleMutableLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        com.intellihealth.salt.models.StickyNonStickyNotificationModel ftcCouponAppliedData = mFtcCouponAppliedData;
        boolean viewModelOnlyPrescription = false;
        java.lang.String viewModelViewOtherPaymentOptionsGetValue = null;
        int viewModelPaymentOptionsMutableLiveDataSize = 0;
        boolean viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummary = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelClickedOnPageMutableLiveData = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerPaymentMethodsLiveDataGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelOrderIsBeingPlacedView = null;
        java.lang.Boolean viewModelSetMainDataViewGetValue = null;
        boolean viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorder = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelOrderPlacedView = null;
        int viewModelPayableAmountButtonTextViewGONEViewVISIBLE = 0;
        java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryViewModelPaymentOptionsMutableLiveDataViewModelIsPaymentSpecificCouponViewModelPaymentOptionsVisibleMutableLiveDataViewModelPaymentOptionsMutableLiveData = null;
        int viewModelLoaderValueViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        boolean viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePage = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSetMainDataViewGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoaderValue = null;
        int viewModelOrderPlacedViewViewVISIBLEViewGONE = 0;
        int viewModelOnlyPrescriptionViewGONEViewVISIBLE = 0;
        boolean viewModelIsPaymentSpecificCoupon = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSetMainDataView = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelShowShimmerPaymentMethodsLiveData = null;
        java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> viewModelIsPaymentSpecificCouponViewModelPaymentOptionsVisibleMutableLiveDataViewModelPaymentOptionsMutableLiveData = null;
        int viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorderViewGONEViewModelIsPaymentSpecificCouponViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> viewModelPaymentOptionsMutableLiveData = null;
        java.lang.Boolean viewModelOrderIsBeingPlacedViewGetValue = null;
        int viewModelSetMainDataViewViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelShowShimmerPaymentMethodsLiveDataGetValue = null;
        int viewModelPaymentOptionsMutableLiveDataSizeInt0ViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTotalPayableAmountMutableLiveDataGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelViewOtherPaymentOptions = null;
        boolean viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessful = false;
        int viewModelShowShimmerPaymentMethodsLiveDataViewVISIBLEViewGONE = 0;
        boolean viewModelPaymentOptionsMutableLiveDataSizeInt0 = false;
        int viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessfulViewGONEViewVISIBLE = 0;
        java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> viewModelPaymentOptionsMutableLiveDataGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue = false;
        boolean viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatus = false;
        java.lang.String viewModelOnlyPrescriptionTmEstimatedPayableLabelAndroidStringEstimatedPayablePostProcessingTmEstimatedPayableLabelAndroidStringEstimatedPayable = null;
        boolean viewModelPaymentUnsuccessful = false;
        boolean viewModelPayableAmountButtonText = false;
        java.lang.String viewModelClickedOnPageMutableLiveDataGetValue = null;
        int viewModelOrderIsBeingPlacedViewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTotalPayableAmountMutableLiveData = null;
        boolean viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorder = false;
        java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData> viewModelPaymentOptionsVisibleMutableLiveDataGetValue = null;
        boolean viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePage = false;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        int viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessfulViewINVISIBLEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.psp.PaymentMethodResponse.ResponseData>> viewModelPaymentOptionsVisibleMutableLiveData = null;
        int viewModelIsPaymentSpecificCouponViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelOrderPlacedViewGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue = false;

        if ((dirtyFlags & 0x2400L) != 0) {
        }
        if ((dirtyFlags & 0x33ffL) != 0) {


            if ((dirtyFlags & 0x3000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.onlyPrescription
                        viewModelOnlyPrescription = viewModel.getOnlyPrescription();
                        // read viewModel.payableAmountButtonText
                        viewModelPayableAmountButtonText = viewModel.getPayableAmountButtonText();
                    }
                if((dirtyFlags & 0x3000L) != 0) {
                    if(viewModelOnlyPrescription) {
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x10000000000L;
                    }
                }
                if((dirtyFlags & 0x3000L) != 0) {
                    if(viewModelPayableAmountButtonText) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewModel.onlyPrescription ? View.GONE : View.VISIBLE
                    viewModelOnlyPrescriptionViewGONEViewVISIBLE = ((viewModelOnlyPrescription) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read viewModel.onlyPrescription ? @android:string/estimated_payable_post_processing : @android:string/estimated_payable
                    viewModelOnlyPrescriptionTmEstimatedPayableLabelAndroidStringEstimatedPayablePostProcessingTmEstimatedPayableLabelAndroidStringEstimatedPayable = ((viewModelOnlyPrescription) ? (tmEstimatedPayableLabel.getResources().getString(R.string.estimated_payable_post_processing)) : (tmEstimatedPayableLabel.getResources().getString(R.string.estimated_payable)));
                    // read viewModel.payableAmountButtonText ? View.GONE : View.VISIBLE
                    viewModelPayableAmountButtonTextViewGONEViewVISIBLE = ((viewModelPayableAmountButtonText) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x3241L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.clickedOnPageMutableLiveData
                        viewModelClickedOnPageMutableLiveData = viewModel.getClickedOnPageMutableLiveData();
                    }
                    updateLiveDataRegistration(0, viewModelClickedOnPageMutableLiveData);


                    if (viewModelClickedOnPageMutableLiveData != null) {
                        // read viewModel.clickedOnPageMutableLiveData.getValue()
                        viewModelClickedOnPageMutableLiveDataGetValue = viewModelClickedOnPageMutableLiveData.getValue();
                    }


                    if (viewModelClickedOnPageMutableLiveDataGetValue != null) {
                        // read viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary")
                        viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummary = viewModelClickedOnPageMutableLiveDataGetValue.equals("OrderSummary");
                    }
                if((dirtyFlags & 0x3241L) != 0) {
                    if(viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummary) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x3001L) != 0) {
                    if(viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummary) {
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000000L;
                    }
                }
                if ((dirtyFlags & 0x3001L) != 0) {

                        if (viewModelClickedOnPageMutableLiveDataGetValue != null) {
                            // read viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus")
                            viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatus = viewModelClickedOnPageMutableLiveDataGetValue.equals("OrderStatus");
                        }
                    if((dirtyFlags & 0x3001L) != 0) {
                        if(viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatus) {
                                dirtyFlags |= 0x200000L;
                        }
                        else {
                                dirtyFlags |= 0x100000L;
                        }
                    }
                }
            }
            if ((dirtyFlags & 0x3002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderIsBeingPlacedView
                        viewModelOrderIsBeingPlacedView = viewModel.getOrderIsBeingPlacedView();
                    }
                    updateLiveDataRegistration(1, viewModelOrderIsBeingPlacedView);


                    if (viewModelOrderIsBeingPlacedView != null) {
                        // read viewModel.orderIsBeingPlacedView.getValue()
                        viewModelOrderIsBeingPlacedViewGetValue = viewModelOrderIsBeingPlacedView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelOrderIsBeingPlacedViewGetValue);
                if((dirtyFlags & 0x3002L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue) {
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelOrderIsBeingPlacedViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderPlacedView
                        viewModelOrderPlacedView = viewModel.getOrderPlacedView();
                    }
                    updateLiveDataRegistration(2, viewModelOrderPlacedView);


                    if (viewModelOrderPlacedView != null) {
                        // read viewModel.orderPlacedView.getValue()
                        viewModelOrderPlacedViewGetValue = viewModelOrderPlacedView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelOrderPlacedViewGetValue);
                if((dirtyFlags & 0x3004L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelOrderPlacedViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loaderValue
                        viewModelLoaderValue = viewModel.getLoaderValue();
                    }
                    updateLiveDataRegistration(3, viewModelLoaderValue);


                    if (viewModelLoaderValue != null) {
                        // read viewModel.loaderValue.getValue()
                        viewModelLoaderValueGetValue = viewModelLoaderValue.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoaderValueGetValue);
                if((dirtyFlags & 0x3008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.setMainDataView
                        viewModelSetMainDataView = viewModel.getSetMainDataView();
                    }
                    updateLiveDataRegistration(4, viewModelSetMainDataView);


                    if (viewModelSetMainDataView != null) {
                        // read viewModel.setMainDataView.getValue()
                        viewModelSetMainDataViewGetValue = viewModelSetMainDataView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.setMainDataView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSetMainDataViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSetMainDataViewGetValue);
                if((dirtyFlags & 0x3010L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelSetMainDataViewGetValue) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.setMainDataView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelSetMainDataViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSetMainDataViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmerPaymentMethodsLiveData
                        viewModelShowShimmerPaymentMethodsLiveData = viewModel.getShowShimmerPaymentMethodsLiveData();
                    }
                    updateLiveDataRegistration(5, viewModelShowShimmerPaymentMethodsLiveData);


                    if (viewModelShowShimmerPaymentMethodsLiveData != null) {
                        // read viewModel.showShimmerPaymentMethodsLiveData.getValue()
                        viewModelShowShimmerPaymentMethodsLiveDataGetValue = viewModelShowShimmerPaymentMethodsLiveData.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPaymentMethodsLiveData.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerPaymentMethodsLiveDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerPaymentMethodsLiveDataGetValue);
                if((dirtyFlags & 0x3020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerPaymentMethodsLiveDataGetValue) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPaymentMethodsLiveData.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerPaymentMethodsLiveDataViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerPaymentMethodsLiveDataGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.paymentOptionsMutableLiveData
                        viewModelPaymentOptionsMutableLiveData = viewModel.getPaymentOptionsMutableLiveData();
                    }
                    updateLiveDataRegistration(6, viewModelPaymentOptionsMutableLiveData);


                    if (viewModelPaymentOptionsMutableLiveData != null) {
                        // read viewModel.paymentOptionsMutableLiveData.getValue()
                        viewModelPaymentOptionsMutableLiveDataGetValue = viewModelPaymentOptionsMutableLiveData.getValue();
                    }


                    if (viewModelPaymentOptionsMutableLiveDataGetValue != null) {
                        // read viewModel.paymentOptionsMutableLiveData.getValue().size()
                        viewModelPaymentOptionsMutableLiveDataSize = viewModelPaymentOptionsMutableLiveDataGetValue.size();
                    }


                    // read viewModel.paymentOptionsMutableLiveData.getValue().size() > 0
                    viewModelPaymentOptionsMutableLiveDataSizeInt0 = (viewModelPaymentOptionsMutableLiveDataSize) > (0);
                if((dirtyFlags & 0x3040L) != 0) {
                    if(viewModelPaymentOptionsMutableLiveDataSizeInt0) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read viewModel.paymentOptionsMutableLiveData.getValue().size() > 0 ? View.VISIBLE : View.GONE
                    viewModelPaymentOptionsMutableLiveDataSizeInt0ViewVISIBLEViewGONE = ((viewModelPaymentOptionsMutableLiveDataSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.viewOtherPaymentOptions
                        viewModelViewOtherPaymentOptions = viewModel.getViewOtherPaymentOptions();
                    }
                    updateLiveDataRegistration(7, viewModelViewOtherPaymentOptions);


                    if (viewModelViewOtherPaymentOptions != null) {
                        // read viewModel.viewOtherPaymentOptions.getValue()
                        viewModelViewOtherPaymentOptionsGetValue = viewModelViewOtherPaymentOptions.getValue();
                    }
            }
            if ((dirtyFlags & 0x3100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.totalPayableAmountMutableLiveData
                        viewModelTotalPayableAmountMutableLiveData = viewModel.getTotalPayableAmountMutableLiveData();
                    }
                    updateLiveDataRegistration(8, viewModelTotalPayableAmountMutableLiveData);


                    if (viewModelTotalPayableAmountMutableLiveData != null) {
                        // read viewModel.totalPayableAmountMutableLiveData.getValue()
                        viewModelTotalPayableAmountMutableLiveDataGetValue = viewModelTotalPayableAmountMutableLiveData.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000000000L) != 0) {

                if (viewModelClickedOnPageMutableLiveDataGetValue != null) {
                    // read viewModel.clickedOnPageMutableLiveData.getValue().equals("Reorder")
                    viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorder = viewModelClickedOnPageMutableLiveDataGetValue.equals("Reorder");
                }
        }
        if ((dirtyFlags & 0x100000L) != 0) {

                if (viewModelClickedOnPageMutableLiveDataGetValue != null) {
                    // read viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage")
                    viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePage = viewModelClickedOnPageMutableLiveDataGetValue.equals("HomePage");
                }
        }
        if ((dirtyFlags & 0x30000L) != 0) {


            if ((dirtyFlags & 0x10000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isPaymentSpecificCoupon
                        viewModelIsPaymentSpecificCoupon = viewModel.isPaymentSpecificCoupon();
                    }
                if((dirtyFlags & 0x10000L) != 0) {
                    if(viewModelIsPaymentSpecificCoupon) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }
                if((dirtyFlags & 0x10000000L) != 0) {
                    if(viewModelIsPaymentSpecificCoupon) {
                            dirtyFlags |= 0x2000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x20000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.paymentOptionsMutableLiveData
                        viewModelPaymentOptionsMutableLiveData = viewModel.getPaymentOptionsMutableLiveData();
                    }
                    updateLiveDataRegistration(6, viewModelPaymentOptionsMutableLiveData);


                    if (viewModelPaymentOptionsMutableLiveData != null) {
                        // read viewModel.paymentOptionsMutableLiveData.getValue()
                        viewModelPaymentOptionsMutableLiveDataGetValue = viewModelPaymentOptionsMutableLiveData.getValue();
                    }
            }
        }

        if ((dirtyFlags & 0x3001L) != 0) {

                // read viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage")
                viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePage = ((viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatus) ? (true) : (viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePage));
                // read viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("Reorder")
                viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorder = ((viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummary) ? (true) : (viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorder));
            if((dirtyFlags & 0x3001L) != 0) {
                if(viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePage) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }
            if((dirtyFlags & 0x3001L) != 0) {
                if(viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorder) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isPaymentSpecificCoupon
                    viewModelIsPaymentSpecificCoupon = viewModel.isPaymentSpecificCoupon();
                }
            if((dirtyFlags & 0x10000L) != 0) {
                if(viewModelIsPaymentSpecificCoupon) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }
            if((dirtyFlags & 0x10000000L) != 0) {
                if(viewModelIsPaymentSpecificCoupon) {
                        dirtyFlags |= 0x2000000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000000L;
                }
            }


                // read viewModel.isPaymentSpecificCoupon ? View.VISIBLE : View.GONE
                viewModelIsPaymentSpecificCouponViewVISIBLEViewGONE = ((viewModelIsPaymentSpecificCoupon) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x400000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.paymentUnsuccessful
                    viewModelPaymentUnsuccessful = viewModel.getPaymentUnsuccessful();
                }
        }

        if ((dirtyFlags & 0x3001L) != 0) {

                // read viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("Reorder") ? View.GONE : viewModel.isPaymentSpecificCoupon ? View.VISIBLE : View.GONE
                viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorderViewGONEViewModelIsPaymentSpecificCouponViewVISIBLEViewGONE = ((viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorder) ? (android.view.View.GONE) : (viewModelIsPaymentSpecificCouponViewVISIBLEViewGONE));
                // read viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage") ? true : viewModel.paymentUnsuccessful
                viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessful = ((viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePage) ? (true) : (viewModelPaymentUnsuccessful));
            if((dirtyFlags & 0x3001L) != 0) {
                if(viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessful) {
                        dirtyFlags |= 0x8000000000L;
                        dirtyFlags |= 0x800000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000L;
                        dirtyFlags |= 0x400000000000L;
                }
            }


                // read viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage") ? true : viewModel.paymentUnsuccessful ? View.GONE : View.VISIBLE
                viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessfulViewGONEViewVISIBLE = ((viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessful) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage") ? true : viewModel.paymentUnsuccessful ? View.INVISIBLE : View.VISIBLE
                viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessfulViewINVISIBLEViewVISIBLE = ((viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessful) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x4000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.paymentOptionsMutableLiveData
                    viewModelPaymentOptionsMutableLiveData = viewModel.getPaymentOptionsMutableLiveData();
                }
                updateLiveDataRegistration(6, viewModelPaymentOptionsMutableLiveData);


                if (viewModelPaymentOptionsMutableLiveData != null) {
                    // read viewModel.paymentOptionsMutableLiveData.getValue()
                    viewModelPaymentOptionsMutableLiveDataGetValue = viewModelPaymentOptionsMutableLiveData.getValue();
                }
        }
        if ((dirtyFlags & 0x8000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.paymentOptionsVisibleMutableLiveData
                    viewModelPaymentOptionsVisibleMutableLiveData = viewModel.getPaymentOptionsVisibleMutableLiveData();
                }
                updateLiveDataRegistration(9, viewModelPaymentOptionsVisibleMutableLiveData);


                if (viewModelPaymentOptionsVisibleMutableLiveData != null) {
                    // read viewModel.paymentOptionsVisibleMutableLiveData.getValue()
                    viewModelPaymentOptionsVisibleMutableLiveDataGetValue = viewModelPaymentOptionsVisibleMutableLiveData.getValue();
                }
        }

        if ((dirtyFlags & 0x10000L) != 0) {

                // read viewModel.isPaymentSpecificCoupon ? viewModel.paymentOptionsVisibleMutableLiveData.getValue() : viewModel.paymentOptionsMutableLiveData.getValue()
                viewModelIsPaymentSpecificCouponViewModelPaymentOptionsVisibleMutableLiveDataViewModelPaymentOptionsMutableLiveData = ((viewModelIsPaymentSpecificCoupon) ? (viewModelPaymentOptionsVisibleMutableLiveDataGetValue) : (viewModelPaymentOptionsMutableLiveDataGetValue));
        }

        if ((dirtyFlags & 0x3241L) != 0) {

                // read viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary") ? viewModel.paymentOptionsMutableLiveData.getValue() : viewModel.isPaymentSpecificCoupon ? viewModel.paymentOptionsVisibleMutableLiveData.getValue() : viewModel.paymentOptionsMutableLiveData.getValue()
                viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryViewModelPaymentOptionsMutableLiveDataViewModelIsPaymentSpecificCouponViewModelPaymentOptionsVisibleMutableLiveDataViewModelPaymentOptionsMutableLiveData = ((viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummary) ? (viewModelPaymentOptionsMutableLiveDataGetValue) : (viewModelIsPaymentSpecificCouponViewModelPaymentOptionsVisibleMutableLiveDataViewModelPaymentOptionsMutableLiveData));
        }
        // batch finished
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.btnViewMoreOptions.setOnClickListener(mCallback4);
            this.clBillDetails.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 1

            this.btnViewMoreOptions.setVisibility(viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringReorderViewGONEViewModelIsPaymentSpecificCouponViewVISIBLEViewGONE);
            this.clFAQ.setVisibility(viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessfulViewGONEViewVISIBLE);
            this.viewHorizontal.setVisibility(viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderStatusBooleanTrueViewModelClickedOnPageMutableLiveDataEqualsJavaLangStringHomePageBooleanTrueViewModelPaymentUnsuccessfulViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            this.btnViewMoreOptions.setTitle(viewModelViewOtherPaymentOptionsGetValue);
        }
        if ((dirtyFlags & 0x3000L) != 0) {
            // api target 1

            this.clBillDetails.setVisibility(viewModelOnlyPrescriptionViewGONEViewVISIBLE);
            this.imgInfoCircle.setVisibility(viewModelOnlyPrescriptionViewGONEViewVISIBLE);
            this.tmAmountToBePaidDesc.setVisibility(viewModelPayableAmountButtonTextViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tmEstimatedPayableLabel, viewModelOnlyPrescriptionTmEstimatedPayableLabelAndroidStringEstimatedPayablePostProcessingTmEstimatedPayableLabelAndroidStringEstimatedPayable);
        }
        if ((dirtyFlags & 0x3002L) != 0) {
            // api target 1

            this.clOrderIsBeingPlacedView.setVisibility(viewModelOrderIsBeingPlacedViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 1

            this.clOrderPlacedView.setVisibility(viewModelOrderPlacedViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3010L) != 0) {
            // api target 1

            this.clPayableInfo.setVisibility(viewModelSetMainDataViewViewVISIBLEViewGONE);
            this.scrollView.setVisibility(viewModelSetMainDataViewViewVISIBLEViewGONE);
            this.tmMobileSectionHeader.setVisibility(viewModelSetMainDataViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3040L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(viewModelPaymentOptionsMutableLiveDataSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelLoaderValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3241L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.PaymentOptionsBindingAdapterKt.setPaymentOptions(this.recyclerViewPaymentOptions, viewModelClickedOnPageMutableLiveDataEqualsJavaLangStringOrderSummaryViewModelPaymentOptionsMutableLiveDataViewModelIsPaymentSpecificCouponViewModelPaymentOptionsVisibleMutableLiveDataViewModelPaymentOptionsMutableLiveData, viewModel);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            this.shimmerViewContainer.setVisibility(viewModelShowShimmerPaymentMethodsLiveDataViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tmPayableAmount, viewModelTotalPayableAmountMutableLiveDataGetValue);
        }
        if ((dirtyFlags & 0x2400L) != 0) {
            // api target 1

            this.tmStickyNotificationCouponApplied.setStickyNonStickyNotificationData(ftcCouponAppliedData);
        }
        executeBindingsOn(mboundView2);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onBtnViewMoreClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.PaymentOptionsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.openBillDetailsBottomSheetEvent();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.clickedOnPageMutableLiveData
        flag 1 (0x2L): viewModel.orderIsBeingPlacedView
        flag 2 (0x3L): viewModel.orderPlacedView
        flag 3 (0x4L): viewModel.loaderValue
        flag 4 (0x5L): viewModel.setMainDataView
        flag 5 (0x6L): viewModel.showShimmerPaymentMethodsLiveData
        flag 6 (0x7L): viewModel.paymentOptionsMutableLiveData
        flag 7 (0x8L): viewModel.viewOtherPaymentOptions
        flag 8 (0x9L): viewModel.totalPayableAmountMutableLiveData
        flag 9 (0xaL): viewModel.paymentOptionsVisibleMutableLiveData
        flag 10 (0xbL): ftcCouponAppliedData
        flag 11 (0xcL): faqData
        flag 12 (0xdL): viewModel
        flag 13 (0xeL): null
        flag 14 (0xfL): viewModel.payableAmountButtonText ? View.GONE : View.VISIBLE
        flag 15 (0x10L): viewModel.payableAmountButtonText ? View.GONE : View.VISIBLE
        flag 16 (0x11L): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary") ? viewModel.paymentOptionsMutableLiveData.getValue() : viewModel.isPaymentSpecificCoupon ? viewModel.paymentOptionsVisibleMutableLiveData.getValue() : viewModel.paymentOptionsMutableLiveData.getValue()
        flag 17 (0x12L): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary") ? viewModel.paymentOptionsMutableLiveData.getValue() : viewModel.isPaymentSpecificCoupon ? viewModel.paymentOptionsVisibleMutableLiveData.getValue() : viewModel.paymentOptionsMutableLiveData.getValue()
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage")
        flag 21 (0x16L): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage")
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.onlyPrescription ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): viewModel.onlyPrescription ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): viewModel.isPaymentSpecificCoupon ? viewModel.paymentOptionsVisibleMutableLiveData.getValue() : viewModel.paymentOptionsMutableLiveData.getValue()
        flag 27 (0x1cL): viewModel.isPaymentSpecificCoupon ? viewModel.paymentOptionsVisibleMutableLiveData.getValue() : viewModel.paymentOptionsMutableLiveData.getValue()
        flag 28 (0x1dL): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("Reorder") ? View.GONE : viewModel.isPaymentSpecificCoupon ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("Reorder") ? View.GONE : viewModel.isPaymentSpecificCoupon ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.setMainDataView.getValue()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.setMainDataView.getValue()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): viewModel.paymentOptionsMutableLiveData.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 33 (0x22L): viewModel.paymentOptionsMutableLiveData.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 34 (0x23L): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage") ? true : viewModel.paymentUnsuccessful
        flag 35 (0x24L): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage") ? true : viewModel.paymentUnsuccessful
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPaymentMethodsLiveData.getValue()) ? View.VISIBLE : View.GONE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerPaymentMethodsLiveData.getValue()) ? View.VISIBLE : View.GONE
        flag 38 (0x27L): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage") ? true : viewModel.paymentUnsuccessful ? View.GONE : View.VISIBLE
        flag 39 (0x28L): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage") ? true : viewModel.paymentUnsuccessful ? View.GONE : View.VISIBLE
        flag 40 (0x29L): viewModel.onlyPrescription ? @android:string/estimated_payable_post_processing : @android:string/estimated_payable
        flag 41 (0x2aL): viewModel.onlyPrescription ? @android:string/estimated_payable_post_processing : @android:string/estimated_payable
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("Reorder")
        flag 45 (0x2eL): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderSummary") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("Reorder")
        flag 46 (0x2fL): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage") ? true : viewModel.paymentUnsuccessful ? View.INVISIBLE : View.VISIBLE
        flag 47 (0x30L): viewModel.clickedOnPageMutableLiveData.getValue().equals("OrderStatus") ? true : viewModel.clickedOnPageMutableLiveData.getValue().equals("HomePage") ? true : viewModel.paymentUnsuccessful ? View.INVISIBLE : View.VISIBLE
        flag 48 (0x31L): viewModel.isPaymentSpecificCoupon ? View.VISIBLE : View.GONE
        flag 49 (0x32L): viewModel.isPaymentSpecificCoupon ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}