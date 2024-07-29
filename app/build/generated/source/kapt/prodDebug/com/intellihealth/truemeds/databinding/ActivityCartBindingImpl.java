package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCartBindingImpl extends ActivityCartBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(44);
        sIncludes.setIncludes(1, 
            new String[] {"shimmer_order_summary"},
            new int[] {25},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_order_summary});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cartHeader, 26);
        sViewsWithIds.put(R.id.clAddMedicine, 27);
        sViewsWithIds.put(R.id.btnAddMedicine, 28);
        sViewsWithIds.put(R.id.tmDivider2, 29);
        sViewsWithIds.put(R.id.clUpload, 30);
        sViewsWithIds.put(R.id.ivUpload, 31);
        sViewsWithIds.put(R.id.ivOpen, 32);
        sViewsWithIds.put(R.id.tvUpload, 33);
        sViewsWithIds.put(R.id.tvMessage, 34);
        sViewsWithIds.put(R.id.tmApplyCoupon, 35);
        sViewsWithIds.put(R.id.tmSearchBar, 36);
        sViewsWithIds.put(R.id.promoCard, 37);
        sViewsWithIds.put(R.id.imgSave, 38);
        sViewsWithIds.put(R.id.clFooter, 39);
        sViewsWithIds.put(R.id.ivTube1, 40);
        sViewsWithIds.put(R.id.ivTube2, 41);
        sViewsWithIds.put(R.id.btnAddAddress, 42);
        sViewsWithIds.put(R.id.progressBar, 43);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerOrderSummaryBinding mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView19;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView24;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 44, sIncludes, sViewsWithIds));
    }
    private ActivityCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (com.intellihealth.salt.views.buttons.Button) bindings[42]
            , (com.intellihealth.salt.views.buttons.Button) bindings[28]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[17]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[27]
            , (com.google.android.material.card.MaterialCardView) bindings[39]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[30]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (androidx.core.widget.NestedScrollView) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[38]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[32]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[40]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[41]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[31]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.ProgressBar) bindings[43]
            , (com.intellihealth.salt.views.StickyNonStickyNotification) bindings[37]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[1]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[23]
            , (com.intellihealth.salt.views.cards.CouponCtaCards) bindings[35]
            , (com.intellihealth.salt.views.cards.Divider) bindings[7]
            , (com.intellihealth.salt.views.cards.Divider) bindings[29]
            , (com.intellihealth.salt.views.SearchBar) bindings[36]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[4]
            , (com.intellihealth.salt.views.TextView) bindings[34]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[20]
            , (com.intellihealth.salt.views.TextView) bindings[21]
            , (com.intellihealth.salt.views.TextView) bindings[33]
            , (com.intellihealth.salt.views.TextView) bindings[18]
            , (android.view.View) bindings[14]
            );
        this.btnUndo.setTag(null);
        this.btnViewBill.setTag(null);
        this.cardUpload.setTag(null);
        this.clRxPrescription.setTag(null);
        this.clUndo.setTag(null);
        this.clWithData.setTag(null);
        this.clWithoutData.setTag(null);
        this.contentScroll.setTag(null);
        this.ivPrescriptionUploaded.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.intellihealth.truemeds.databinding.ShimmerOrderSummaryBinding) bindings[25];
        setContainedBinding(this.mboundView1);
        this.mboundView19 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView24 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[24];
        this.mboundView24.setTag(null);
        this.prescriptionCtl.setTag(null);
        this.rvCart.setTag(null);
        this.rvPrescription.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.shimmerViewFooter.setTag(null);
        this.tmDivider.setTag(null);
        this.tvCartCount.setTag(null);
        this.tvFreeDelivery.setTag(null);
        this.tvPrescriptionUploaded.setTag(null);
        this.tvSellingPrice.setTag(null);
        this.tvSellingPriceDecimal.setTag(null);
        this.tvYouSaved.setTag(null);
        this.viewSpace.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4000L;
        }
        mboundView1.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView1.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback) variable);
        }
        else if (BR.fragmentManager == variableId) {
            setFragmentManager((androidx.fragment.app.FragmentManager) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.CartViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallback(@Nullable com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setFragmentManager(@Nullable androidx.fragment.app.FragmentManager FragmentManager) {
        this.mFragmentManager = FragmentManager;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.fragmentManager);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CartViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView1.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelReplaceSavings((androidx.lifecycle.MutableLiveData<java.lang.Double>) object, fieldId);
            case 1 :
                return onChangeViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelCartMedItems((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.CartMedicineModel>>) object, fieldId);
            case 3 :
                return onChangeViewModelShowShimmerFooter((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelProductList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
            case 5 :
                return onChangeViewModelShowReplaceUndo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelPrescriptions((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>>) object, fieldId);
            case 7 :
                return onChangeViewModelBillDetails((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BillDetailsModel>) object, fieldId);
            case 8 :
                return onChangeViewModelShowLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeViewModelCartItemCount((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 10 :
                return onChangeViewModelTotal((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelReplaceSavings(androidx.lifecycle.MutableLiveData<java.lang.Double> ViewModelReplaceSavings, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoaderValue(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoaderValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartMedItems(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.CartMedicineModel>> ViewModelCartMedItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmerFooter(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmerFooter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProductList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewModelProductList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowReplaceUndo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowReplaceUndo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPrescriptions(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> ViewModelPrescriptions, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBillDetails(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BillDetailsModel> ViewModelBillDetails, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartItemCount(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelCartItemCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTotal(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        boolean viewModelPrescriptionsSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Double> viewModelReplaceSavings = null;
        boolean viewModelProductListSizeInt0 = false;
        int viewModelBillDetailsJavaLangObjectNullViewModelBillDetailsDeliveryChargesValueInt0BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String stringValueOfViewModelBillAmount = null;
        java.lang.Boolean viewModelShowReplaceUndoGetValue = null;
        int viewModelPrescriptionsSizeInt1ViewGONEViewVISIBLE = 0;
        com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback = mCallback;
        java.lang.Double viewModelBillDetailsDeliveryChargesValue = null;
        boolean viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1 = false;
        java.lang.String viewModelBillAmountFloat00JavaLangStringJavaLangStringStringValueOfViewModelBillAmountSplit0 = null;
        java.lang.String viewModelCartItemCountJavaLangStringItemsInYourCart = null;
        java.lang.String javaLangStringStringValueOfViewModelBillAmountSplit0 = null;
        int viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1ViewModelShowLoadingBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTotalToString = null;
        int viewModelLoaderValueViewVISIBLEViewGONE = 0;
        boolean viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt0 = false;
        boolean viewModelBillDetailsJavaLangObjectNullViewModelBillDetailsDeliveryChargesValueInt0BooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoaderValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue = false;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.CartMedicineModel>> viewModelCartMedItems = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowShimmerFooter = null;
        java.lang.String stringValueOfViewModelBillAmountSplit0 = null;
        java.lang.Integer viewModelCartItemCountGetValue = null;
        int viewModelProductListSizeInt0ViewVISIBLEViewGONE = 0;
        double viewModelBillAmount = 0.0;
        boolean ViewModelProductListSizeInt01 = false;
        int viewModelShowLoadingViewModelShowReplaceUndoBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewModelProductList = null;
        java.lang.Boolean viewModelShowShimmerFooterGetValue = null;
        androidx.fragment.app.FragmentManager fragmentManager = mFragmentManager;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowReplaceUndo = null;
        int viewModelProductListSize = 0;
        java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> viewModelPrescriptionsGetValue = null;
        java.lang.String[] stringValueOfViewModelBillAmountSplitJavaLangString = null;
        double androidxDatabindingViewDataBindingSafeUnboxViewModelBillDetailsDeliveryChargesValue = 0.0;
        int viewModelShowShimmerFooterViewGONEViewVISIBLE = 0;
        boolean viewModelShowLoadingViewModelProductListSizeInt0BooleanFalse = false;
        int viewModelShowReplaceUndoViewVISIBLEViewGONE = 0;
        int viewModelShowLoadingViewGONEViewVISIBLE = 0;
        boolean viewModelShowLoadingViewModelShowReplaceUndoBooleanFalse = false;
        boolean viewModelCartItemCountInt1 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowReplaceUndoGetValue = false;
        int viewModelShowLoadingViewModelProductListSizeInt0BooleanFalseViewModelPrescriptionsSizeInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelPrescriptionsSizeInt1 = false;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> viewModelPrescriptions = null;
        int viewModelPrescriptionsSize = 0;
        int viewModelShowShimmerFooterViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTotalGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.BillDetailsModel> viewModelBillDetails = null;
        boolean viewModelBillDetailsJavaLangObjectNull = false;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelProductListGetValue = null;
        boolean viewModelBillDetailsDeliveryChargesValueInt0 = false;
        java.lang.Boolean viewModelShowLoadingGetValue = null;
        java.lang.Double viewModelReplaceSavingsGetValue = null;
        int viewModelShowLoadingViewVISIBLEViewGONE = 0;
        java.lang.String viewModelCartItemCountJavaLangStringItemInYourCart = null;
        int viewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowLoading = null;
        boolean viewModelBillAmountFloat00 = false;
        java.lang.String viewModelCartItemCountInt1ViewModelCartItemCountJavaLangStringItemInYourCartViewModelCartItemCountJavaLangStringItemsInYourCart = null;
        boolean ViewModelShowLoading1 = false;
        com.intellihealth.salt.models.BillDetailsModel viewModelBillDetailsGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelCartItemCount = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelCartItemCountGetValue = 0;
        boolean viewModelShowLoadingViewModelProductListSizeInt0BooleanFalseViewModelPrescriptionsSizeInt0BooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerFooterGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTotal = null;
        boolean viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1ViewModelShowLoadingBooleanFalse = false;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        java.util.List<com.intellihealth.truemeds.presentation.model.CartMedicineModel> viewModelCartMedItemsGetValue = null;
        boolean ViewModelPrescriptionsSizeInt01 = false;
        com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
        int viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x6840L) != 0) {
        }
        if ((dirtyFlags & 0x7004L) != 0) {
        }
        if ((dirtyFlags & 0x7fffL) != 0) {


            if ((dirtyFlags & 0x6001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.replaceSavings
                        viewModelReplaceSavings = viewModel.getReplaceSavings();
                    }
                    updateLiveDataRegistration(0, viewModelReplaceSavings);


                    if (viewModelReplaceSavings != null) {
                        // read viewModel.replaceSavings.getValue()
                        viewModelReplaceSavingsGetValue = viewModelReplaceSavings.getValue();
                    }
            }
            if ((dirtyFlags & 0x6002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loaderValue
                        viewModelLoaderValue = viewModel.getLoaderValue();
                    }
                    updateLiveDataRegistration(1, viewModelLoaderValue);


                    if (viewModelLoaderValue != null) {
                        // read viewModel.loaderValue.getValue()
                        viewModelLoaderValueGetValue = viewModelLoaderValue.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoaderValueGetValue);
                if((dirtyFlags & 0x6002L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x7004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartMedItems
                        viewModelCartMedItems = viewModel.getCartMedItems();
                    }
                    updateLiveDataRegistration(2, viewModelCartMedItems);


                    if (viewModelCartMedItems != null) {
                        // read viewModel.cartMedItems.getValue()
                        viewModelCartMedItemsGetValue = viewModelCartMedItems.getValue();
                    }
            }
            if ((dirtyFlags & 0x6008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmerFooter
                        viewModelShowShimmerFooter = viewModel.getShowShimmerFooter();
                    }
                    updateLiveDataRegistration(3, viewModelShowShimmerFooter);


                    if (viewModelShowShimmerFooter != null) {
                        // read viewModel.showShimmerFooter.getValue()
                        viewModelShowShimmerFooterGetValue = viewModelShowShimmerFooter.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerFooter.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerFooterGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerFooterGetValue);
                if((dirtyFlags & 0x6008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerFooterGetValue) {
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                            dirtyFlags |= 0x800000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerFooter.getValue()) ? View.GONE : View.VISIBLE
                    viewModelShowShimmerFooterViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerFooterGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerFooter.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerFooterViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerFooterGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x6000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.billAmount
                        viewModelBillAmount = viewModel.getBillAmount();
                    }


                    // read viewModel.billAmount <= 0.0
                    viewModelBillAmountFloat00 = (viewModelBillAmount) <= (0.0);
                if((dirtyFlags & 0x6000L) != 0) {
                    if(viewModelBillAmountFloat00) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
            }
            if ((dirtyFlags & 0x6150L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.productList
                        viewModelProductList = viewModel.getProductList();
                    }
                    updateLiveDataRegistration(4, viewModelProductList);


                    if (viewModelProductList != null) {
                        // read viewModel.productList.getValue()
                        viewModelProductListGetValue = viewModelProductList.getValue();
                    }


                    if (viewModelProductListGetValue != null) {
                        // read viewModel.productList.getValue().size()
                        viewModelProductListSize = viewModelProductListGetValue.size();
                    }


                    // read viewModel.productList.getValue().size() > 0
                    ViewModelProductListSizeInt01 = (viewModelProductListSize) > (0);
                if((dirtyFlags & 0x6150L) != 0) {
                    if(ViewModelProductListSizeInt01) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x6050L) != 0) {
                    if(ViewModelProductListSizeInt01) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
                if((dirtyFlags & 0x6010L) != 0) {
                    if(ViewModelProductListSizeInt01) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }

                if ((dirtyFlags & 0x6010L) != 0) {

                        // read viewModel.productList.getValue().size() > 0 ? View.VISIBLE : View.GONE
                        viewModelProductListSizeInt0ViewVISIBLEViewGONE = ((ViewModelProductListSizeInt01) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x6020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showReplaceUndo
                        viewModelShowReplaceUndo = viewModel.getShowReplaceUndo();
                    }
                    updateLiveDataRegistration(5, viewModelShowReplaceUndo);


                    if (viewModelShowReplaceUndo != null) {
                        // read viewModel.showReplaceUndo.getValue()
                        viewModelShowReplaceUndoGetValue = viewModelShowReplaceUndo.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowReplaceUndoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowReplaceUndoGetValue);
                if((dirtyFlags & 0x6020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowReplaceUndoGetValue) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowReplaceUndoViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowReplaceUndoGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x6840L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.prescriptions
                        viewModelPrescriptions = viewModel.getPrescriptions();
                    }
                    updateLiveDataRegistration(6, viewModelPrescriptions);


                    if (viewModelPrescriptions != null) {
                        // read viewModel.prescriptions.getValue()
                        viewModelPrescriptionsGetValue = viewModelPrescriptions.getValue();
                    }

                if ((dirtyFlags & 0x6040L) != 0) {

                        if (viewModelPrescriptionsGetValue != null) {
                            // read viewModel.prescriptions.getValue().size()
                            viewModelPrescriptionsSize = viewModelPrescriptionsGetValue.size();
                        }


                        // read viewModel.prescriptions.getValue().size() > 1
                        viewModelPrescriptionsSizeInt1 = (viewModelPrescriptionsSize) > (1);
                        // read viewModel.prescriptions.getValue().size() == 0
                        ViewModelPrescriptionsSizeInt01 = (viewModelPrescriptionsSize) == (0);
                    if((dirtyFlags & 0x6040L) != 0) {
                        if(viewModelPrescriptionsSizeInt1) {
                                dirtyFlags |= 0x40000L;
                        }
                        else {
                                dirtyFlags |= 0x20000L;
                        }
                    }
                    if((dirtyFlags & 0x6040L) != 0) {
                        if(ViewModelPrescriptionsSizeInt01) {
                                dirtyFlags |= 0x10000000000000L;
                        }
                        else {
                                dirtyFlags |= 0x8000000000000L;
                        }
                    }


                        // read viewModel.prescriptions.getValue().size() > 1 ? View.GONE : View.VISIBLE
                        viewModelPrescriptionsSizeInt1ViewGONEViewVISIBLE = ((viewModelPrescriptionsSizeInt1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read viewModel.prescriptions.getValue().size() == 0 ? View.GONE : View.VISIBLE
                        viewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE = ((ViewModelPrescriptionsSizeInt01) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x6080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.billDetails
                        viewModelBillDetails = viewModel.getBillDetails();
                    }
                    updateLiveDataRegistration(7, viewModelBillDetails);


                    if (viewModelBillDetails != null) {
                        // read viewModel.billDetails.getValue()
                        viewModelBillDetailsGetValue = viewModelBillDetails.getValue();
                    }


                    // read viewModel.billDetails.getValue() != null
                    viewModelBillDetailsJavaLangObjectNull = (viewModelBillDetailsGetValue) != (null);
                if((dirtyFlags & 0x6080L) != 0) {
                    if(viewModelBillDetailsJavaLangObjectNull) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x6170L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showLoading
                        viewModelShowLoading = viewModel.getShowLoading();
                    }
                    updateLiveDataRegistration(8, viewModelShowLoading);


                    if (viewModelShowLoading != null) {
                        // read viewModel.showLoading.getValue()
                        viewModelShowLoadingGetValue = viewModelShowLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowLoadingGetValue);
                if((dirtyFlags & 0x6100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue) {
                            dirtyFlags |= 0x40000000000L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000L;
                            dirtyFlags |= 0x2000000000000L;
                    }
                }

                if ((dirtyFlags & 0x6100L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.GONE : View.VISIBLE
                        viewModelShowLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.VISIBLE : View.GONE
                        viewModelShowLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue())
                    ViewModelShowLoading1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue;
                if((dirtyFlags & 0x6150L) != 0) {
                    if(ViewModelShowLoading1) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }
                if((dirtyFlags & 0x6120L) != 0) {
                    if(ViewModelShowLoading1) {
                            dirtyFlags |= 0x100000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x6200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartItemCount
                        viewModelCartItemCount = viewModel.getCartItemCount();
                    }
                    updateLiveDataRegistration(9, viewModelCartItemCount);


                    if (viewModelCartItemCount != null) {
                        // read viewModel.cartItemCount.getValue()
                        viewModelCartItemCountGetValue = viewModelCartItemCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCartItemCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCartItemCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) <= 1
                    viewModelCartItemCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxViewModelCartItemCountGetValue) <= (1);
                if((dirtyFlags & 0x6200L) != 0) {
                    if(viewModelCartItemCountInt1) {
                            dirtyFlags |= 0x40000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x6400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.total
                        viewModelTotal = viewModel.getTotal();
                    }
                    updateLiveDataRegistration(10, viewModelTotal);


                    if (viewModelTotal != null) {
                        // read viewModel.total.getValue()
                        viewModelTotalGetValue = viewModelTotal.getValue();
                    }


                    if (viewModelTotalGetValue != null) {
                        // read viewModel.total.getValue().toString()
                        viewModelTotalToString = viewModelTotalGetValue.toString();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000000000L) != 0) {

                // read viewModel.productList.getValue().size() == 0
                viewModelProductListSizeInt0 = (viewModelProductListSize) == (0);
        }
        if ((dirtyFlags & 0x200000L) != 0) {

                // read String.valueOf(viewModel.billAmount)
                stringValueOfViewModelBillAmount = java.lang.String.valueOf(viewModelBillAmount);


                if (stringValueOfViewModelBillAmount != null) {
                    // read String.valueOf(viewModel.billAmount).split("\\.")
                    stringValueOfViewModelBillAmountSplitJavaLangString = stringValueOfViewModelBillAmount.split("\\.");
                }


                if (stringValueOfViewModelBillAmountSplitJavaLangString != null) {
                    // read String.valueOf(viewModel.billAmount).split("\\.")[0]
                    stringValueOfViewModelBillAmountSplit0 = getFromArray(stringValueOfViewModelBillAmountSplitJavaLangString, 0);
                }


                // read ("₹ ") + (String.valueOf(viewModel.billAmount).split("\\.")[0])
                javaLangStringStringValueOfViewModelBillAmountSplit0 = ("₹ ") + (stringValueOfViewModelBillAmountSplit0);
        }
        if ((dirtyFlags & 0x40000000L) != 0) {

                if (viewModelBillDetailsGetValue != null) {
                    // read viewModel.billDetails.getValue().deliveryChargesValue
                    viewModelBillDetailsDeliveryChargesValue = viewModelBillDetailsGetValue.getDeliveryChargesValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.billDetails.getValue().deliveryChargesValue)
                androidxDatabindingViewDataBindingSafeUnboxViewModelBillDetailsDeliveryChargesValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelBillDetailsDeliveryChargesValue);


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.billDetails.getValue().deliveryChargesValue) == 0
                viewModelBillDetailsDeliveryChargesValueInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelBillDetailsDeliveryChargesValue) == (0);
        }
        if ((dirtyFlags & 0x20000000000000L) != 0) {

                // read (viewModel.cartItemCount.getValue()) + (" Items in your cart")
                viewModelCartItemCountJavaLangStringItemsInYourCart = (viewModelCartItemCountGetValue) + (" Items in your cart");
        }
        if ((dirtyFlags & 0x100000000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.showReplaceUndo
                    viewModelShowReplaceUndo = viewModel.getShowReplaceUndo();
                }
                updateLiveDataRegistration(5, viewModelShowReplaceUndo);


                if (viewModelShowReplaceUndo != null) {
                    // read viewModel.showReplaceUndo.getValue()
                    viewModelShowReplaceUndoGetValue = viewModelShowReplaceUndo.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelShowReplaceUndoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowReplaceUndoGetValue);
            if((dirtyFlags & 0x6020L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowReplaceUndoGetValue) {
                        dirtyFlags |= 0x10000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x8080000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.prescriptions
                    viewModelPrescriptions = viewModel.getPrescriptions();
                }
                updateLiveDataRegistration(6, viewModelPrescriptions);


                if (viewModelPrescriptions != null) {
                    // read viewModel.prescriptions.getValue()
                    viewModelPrescriptionsGetValue = viewModelPrescriptions.getValue();
                }


                if (viewModelPrescriptionsGetValue != null) {
                    // read viewModel.prescriptions.getValue().size()
                    viewModelPrescriptionsSize = viewModelPrescriptionsGetValue.size();
                }

            if ((dirtyFlags & 0x8000000L) != 0) {

                    // read viewModel.prescriptions.getValue().size() > 0
                    viewModelPrescriptionsSizeInt0 = (viewModelPrescriptionsSize) > (0);
            }
            if ((dirtyFlags & 0x80000L) != 0) {

                    // read viewModel.prescriptions.getValue().size() > 1
                    viewModelPrescriptionsSizeInt1 = (viewModelPrescriptionsSize) > (1);
                if((dirtyFlags & 0x6040L) != 0) {
                    if(viewModelPrescriptionsSizeInt1) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x40000000000000L) != 0) {

                // read (viewModel.cartItemCount.getValue()) + (" Item in your cart")
                viewModelCartItemCountJavaLangStringItemInYourCart = (viewModelCartItemCountGetValue) + (" Item in your cart");
        }

        if ((dirtyFlags & 0x6150L) != 0) {

                // read viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 1
                viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1 = ((ViewModelProductListSizeInt01) ? (true) : (viewModelPrescriptionsSizeInt1));
                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? viewModel.productList.getValue().size() == 0 : false
                viewModelShowLoadingViewModelProductListSizeInt0BooleanFalse = ((ViewModelShowLoading1) ? (viewModelProductListSizeInt0) : (false));
            if((dirtyFlags & 0x6150L) != 0) {
                if(viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1) {
                        dirtyFlags |= 0x400000000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000000L;
                }
            }
            if((dirtyFlags & 0x6150L) != 0) {
                if(viewModelShowLoadingViewModelProductListSizeInt0BooleanFalse) {
                        dirtyFlags |= 0x100000000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x6000L) != 0) {

                // read viewModel.billAmount <= 0.0 ? "" : ("₹ ") + (String.valueOf(viewModel.billAmount).split("\\.")[0])
                viewModelBillAmountFloat00JavaLangStringJavaLangStringStringValueOfViewModelBillAmountSplit0 = ((viewModelBillAmountFloat00) ? ("") : (javaLangStringStringValueOfViewModelBillAmountSplit0));
        }
        if ((dirtyFlags & 0x6050L) != 0) {

                // read viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 0
                viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt0 = ((ViewModelProductListSizeInt01) ? (true) : (viewModelPrescriptionsSizeInt0));
            if((dirtyFlags & 0x6050L) != 0) {
                if(viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt0) {
                        dirtyFlags |= 0x1000000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000000000L;
                }
            }


                // read viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 0 ? View.VISIBLE : View.GONE
                viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE = ((viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6080L) != 0) {

                // read viewModel.billDetails.getValue() != null ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.billDetails.getValue().deliveryChargesValue) == 0 : false
                viewModelBillDetailsJavaLangObjectNullViewModelBillDetailsDeliveryChargesValueInt0BooleanFalse = ((viewModelBillDetailsJavaLangObjectNull) ? (viewModelBillDetailsDeliveryChargesValueInt0) : (false));
            if((dirtyFlags & 0x6080L) != 0) {
                if(viewModelBillDetailsJavaLangObjectNullViewModelBillDetailsDeliveryChargesValueInt0BooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read viewModel.billDetails.getValue() != null ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.billDetails.getValue().deliveryChargesValue) == 0 : false ? View.VISIBLE : View.GONE
                viewModelBillDetailsJavaLangObjectNullViewModelBillDetailsDeliveryChargesValueInt0BooleanFalseViewVISIBLEViewGONE = ((viewModelBillDetailsJavaLangObjectNullViewModelBillDetailsDeliveryChargesValueInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6120L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue()) : false
                viewModelShowLoadingViewModelShowReplaceUndoBooleanFalse = ((ViewModelShowLoading1) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelShowReplaceUndoGetValue) : (false));
            if((dirtyFlags & 0x6120L) != 0) {
                if(viewModelShowLoadingViewModelShowReplaceUndoBooleanFalse) {
                        dirtyFlags |= 0x400000000L;
                }
                else {
                        dirtyFlags |= 0x200000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelShowLoadingViewModelShowReplaceUndoBooleanFalseViewVISIBLEViewGONE = ((viewModelShowLoadingViewModelShowReplaceUndoBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6200L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) <= 1 ? (viewModel.cartItemCount.getValue()) + (" Item in your cart") : (viewModel.cartItemCount.getValue()) + (" Items in your cart")
                viewModelCartItemCountInt1ViewModelCartItemCountJavaLangStringItemInYourCartViewModelCartItemCountJavaLangStringItemsInYourCart = ((viewModelCartItemCountInt1) ? (viewModelCartItemCountJavaLangStringItemInYourCart) : (viewModelCartItemCountJavaLangStringItemsInYourCart));
        }
        // batch finished

        if ((dirtyFlags & 0x100000000000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.prescriptions
                    viewModelPrescriptions = viewModel.getPrescriptions();
                }
                updateLiveDataRegistration(6, viewModelPrescriptions);


                if (viewModelPrescriptions != null) {
                    // read viewModel.prescriptions.getValue()
                    viewModelPrescriptionsGetValue = viewModelPrescriptions.getValue();
                }


                if (viewModelPrescriptionsGetValue != null) {
                    // read viewModel.prescriptions.getValue().size()
                    viewModelPrescriptionsSize = viewModelPrescriptionsGetValue.size();
                }


                // read viewModel.prescriptions.getValue().size() == 0
                ViewModelPrescriptionsSizeInt01 = (viewModelPrescriptionsSize) == (0);
            if((dirtyFlags & 0x6040L) != 0) {
                if(ViewModelPrescriptionsSizeInt01) {
                        dirtyFlags |= 0x10000000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x6150L) != 0) {

                // read viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 1 ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) : false
                viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1ViewModelShowLoadingBooleanFalse = ((viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1) ? (ViewModelShowLoading1) : (false));
            if((dirtyFlags & 0x6150L) != 0) {
                if(viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1ViewModelShowLoadingBooleanFalse) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 1 ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1ViewModelShowLoadingBooleanFalseViewVISIBLEViewGONE = ((viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1ViewModelShowLoadingBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x6150L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? viewModel.productList.getValue().size() == 0 : false ? viewModel.prescriptions.getValue().size() == 0 : false
                viewModelShowLoadingViewModelProductListSizeInt0BooleanFalseViewModelPrescriptionsSizeInt0BooleanFalse = ((viewModelShowLoadingViewModelProductListSizeInt0BooleanFalse) ? (ViewModelPrescriptionsSizeInt01) : (false));
            if((dirtyFlags & 0x6150L) != 0) {
                if(viewModelShowLoadingViewModelProductListSizeInt0BooleanFalseViewModelPrescriptionsSizeInt0BooleanFalse) {
                        dirtyFlags |= 0x400000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? viewModel.productList.getValue().size() == 0 : false ? viewModel.prescriptions.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
                viewModelShowLoadingViewModelProductListSizeInt0BooleanFalseViewModelPrescriptionsSizeInt0BooleanFalseViewVISIBLEViewGONE = ((viewModelShowLoadingViewModelProductListSizeInt0BooleanFalseViewModelPrescriptionsSizeInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4000L) != 0) {
            // api target 1

            this.btnUndo.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0x6008L) != 0) {
            // api target 1

            this.btnViewBill.setVisibility(viewModelShowShimmerFooterViewGONEViewVISIBLE);
            this.shimmerViewFooter.setVisibility(viewModelShowShimmerFooterViewVISIBLEViewGONE);
            this.tvSellingPrice.setVisibility(viewModelShowShimmerFooterViewGONEViewVISIBLE);
            this.tvSellingPriceDecimal.setVisibility(viewModelShowShimmerFooterViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6040L) != 0) {
            // api target 1

            this.cardUpload.setVisibility(viewModelPrescriptionsSizeInt1ViewGONEViewVISIBLE);
            this.ivPrescriptionUploaded.setVisibility(viewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE);
            this.prescriptionCtl.setVisibility(viewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE);
            this.tvPrescriptionUploaded.setVisibility(viewModelPrescriptionsSizeInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6050L) != 0) {
            // api target 1

            this.clRxPrescription.setVisibility(viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE);
            this.clWithData.setVisibility(viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6120L) != 0) {
            // api target 1

            this.clUndo.setVisibility(viewModelShowLoadingViewModelShowReplaceUndoBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6150L) != 0) {
            // api target 1

            this.clWithoutData.setVisibility(viewModelShowLoadingViewModelProductListSizeInt0BooleanFalseViewModelPrescriptionsSizeInt0BooleanFalseViewVISIBLEViewGONE);
            this.mboundView19.setVisibility(viewModelProductListSizeInt0BooleanTrueViewModelPrescriptionsSizeInt1ViewModelShowLoadingBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6100L) != 0) {
            // api target 1

            this.contentScroll.setVisibility(viewModelShowLoadingViewGONEViewVISIBLE);
            this.shimmerViewContainer.setVisibility(viewModelShowLoadingViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.SearchResultBindingAdapterKt.startStopAnimation(this.shimmerViewContainer, androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue);
        }
        if ((dirtyFlags & 0x6002L) != 0) {
            // api target 1

            this.mboundView24.setVisibility(viewModelLoaderValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6010L) != 0) {
            // api target 1

            this.rvCart.setVisibility(viewModelProductListSizeInt0ViewVISIBLEViewGONE);
            this.tmDivider.setVisibility(viewModelProductListSizeInt0ViewVISIBLEViewGONE);
            this.tvCartCount.setVisibility(viewModelProductListSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x7004L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setCartList(this.rvCart, viewModelCartMedItemsGetValue, viewModel, fragmentManager);
        }
        if ((dirtyFlags & 0x6840L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setPrescriptionList(this.rvPrescription, viewModelPrescriptionsGetValue, callback, true, false);
        }
        if ((dirtyFlags & 0x6200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCartCount, viewModelCartItemCountInt1ViewModelCartItemCountJavaLangStringItemInYourCartViewModelCartItemCountJavaLangStringItemsInYourCart);
        }
        if ((dirtyFlags & 0x6080L) != 0) {
            // api target 1

            this.tvFreeDelivery.setVisibility(viewModelBillDetailsJavaLangObjectNullViewModelBillDetailsDeliveryChargesValueInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSellingPrice, viewModelBillAmountFloat00JavaLangStringJavaLangStringStringValueOfViewModelBillAmountSplit0);
        }
        if ((dirtyFlags & 0x6400L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setNumberFormatPriceRupeeSymbolTxt(this.tvSellingPriceDecimal, viewModelTotalToString);
        }
        if ((dirtyFlags & 0x6001L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setNudgeSavingAmount(this.tvYouSaved, viewModelReplaceSavingsGetValue);
        }
        if ((dirtyFlags & 0x6020L) != 0) {
            // api target 1

            this.viewSpace.setVisibility(viewModelShowReplaceUndoViewVISIBLEViewGONE);
        }
        executeBindingsOn(mboundView1);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel.onUndoReplaceClicked()
        kotlinx.coroutines.Job viewModelOnUndoReplaceClicked = null;
        // viewModel
        com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModelOnUndoReplaceClicked = viewModel.onUndoReplaceClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.replaceSavings
        flag 1 (0x2L): viewModel.loaderValue
        flag 2 (0x3L): viewModel.cartMedItems
        flag 3 (0x4L): viewModel.showShimmerFooter
        flag 4 (0x5L): viewModel.productList
        flag 5 (0x6L): viewModel.showReplaceUndo
        flag 6 (0x7L): viewModel.prescriptions
        flag 7 (0x8L): viewModel.billDetails
        flag 8 (0x9L): viewModel.showLoading
        flag 9 (0xaL): viewModel.cartItemCount
        flag 10 (0xbL): viewModel.total
        flag 11 (0xcL): callback
        flag 12 (0xdL): fragmentManager
        flag 13 (0xeL): viewModel
        flag 14 (0xfL): null
        flag 15 (0x10L): viewModel.billDetails.getValue() != null ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.billDetails.getValue().deliveryChargesValue) == 0 : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.billDetails.getValue() != null ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.billDetails.getValue().deliveryChargesValue) == 0 : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.prescriptions.getValue().size() > 1 ? View.GONE : View.VISIBLE
        flag 18 (0x13L): viewModel.prescriptions.getValue().size() > 1 ? View.GONE : View.VISIBLE
        flag 19 (0x14L): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 1
        flag 20 (0x15L): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 1
        flag 21 (0x16L): viewModel.billAmount <= 0.0 ? "" : ("₹ ") + (String.valueOf(viewModel.billAmount).split("\\.")[0])
        flag 22 (0x17L): viewModel.billAmount <= 0.0 ? "" : ("₹ ") + (String.valueOf(viewModel.billAmount).split("\\.")[0])
        flag 23 (0x18L): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 1 ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 1 ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) : false ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 0
        flag 28 (0x1dL): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 0
        flag 29 (0x1eL): viewModel.billDetails.getValue() != null ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.billDetails.getValue().deliveryChargesValue) == 0 : false
        flag 30 (0x1fL): viewModel.billDetails.getValue() != null ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.billDetails.getValue().deliveryChargesValue) == 0 : false
        flag 31 (0x20L): viewModel.productList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 32 (0x21L): viewModel.productList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 33 (0x22L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue()) : false ? View.VISIBLE : View.GONE
        flag 34 (0x23L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue()) : false ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerFooter.getValue()) ? View.GONE : View.VISIBLE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerFooter.getValue()) ? View.GONE : View.VISIBLE
        flag 37 (0x26L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? viewModel.productList.getValue().size() == 0 : false
        flag 38 (0x27L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? viewModel.productList.getValue().size() == 0 : false
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue()) ? View.VISIBLE : View.GONE
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue()) ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 43 (0x2cL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue()) : false
        flag 44 (0x2dL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showReplaceUndo.getValue()) : false
        flag 45 (0x2eL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? viewModel.productList.getValue().size() == 0 : false ? viewModel.prescriptions.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
        flag 46 (0x2fL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? viewModel.productList.getValue().size() == 0 : false ? viewModel.prescriptions.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerFooter.getValue()) ? View.VISIBLE : View.GONE
        flag 48 (0x31L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmerFooter.getValue()) ? View.VISIBLE : View.GONE
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 51 (0x34L): viewModel.prescriptions.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 52 (0x35L): viewModel.prescriptions.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 53 (0x36L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) <= 1 ? (viewModel.cartItemCount.getValue()) + (" Item in your cart") : (viewModel.cartItemCount.getValue()) + (" Items in your cart")
        flag 54 (0x37L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) <= 1 ? (viewModel.cartItemCount.getValue()) + (" Item in your cart") : (viewModel.cartItemCount.getValue()) + (" Items in your cart")
        flag 55 (0x38L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? viewModel.productList.getValue().size() == 0 : false ? viewModel.prescriptions.getValue().size() == 0 : false
        flag 56 (0x39L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? viewModel.productList.getValue().size() == 0 : false ? viewModel.prescriptions.getValue().size() == 0 : false
        flag 57 (0x3aL): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 1 ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) : false
        flag 58 (0x3bL): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 1 ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) : false
        flag 59 (0x3cL): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 60 (0x3dL): viewModel.productList.getValue().size() > 0 ? true : viewModel.prescriptions.getValue().size() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}