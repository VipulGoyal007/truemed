package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOrderSummaryBindingImpl extends ActivityOrderSummaryBinding implements com.intellihealth.truemeds.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(67);
        sIncludes.setIncludes(2, 
            new String[] {"shimmer_order_summary"},
            new int[] {40},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_order_summary});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainLayout, 41);
        sViewsWithIds.put(R.id.cl_top_content, 42);
        sViewsWithIds.put(R.id.clFreeDelivery, 43);
        sViewsWithIds.put(R.id.ivViewMore, 44);
        sViewsWithIds.put(R.id.btnAddMedicine, 45);
        sViewsWithIds.put(R.id.tmDividerBottomAddMedicines, 46);
        sViewsWithIds.put(R.id.tvTextReorderSaving, 47);
        sViewsWithIds.put(R.id.clDoctorCall, 48);
        sViewsWithIds.put(R.id.prescriptionCardImg, 49);
        sViewsWithIds.put(R.id.prescriptionHeaderTv, 50);
        sViewsWithIds.put(R.id.Chip3, 51);
        sViewsWithIds.put(R.id.prescriptionSubHeaderTv, 52);
        sViewsWithIds.put(R.id.ivUpload, 53);
        sViewsWithIds.put(R.id.ivOpen, 54);
        sViewsWithIds.put(R.id.tvUpload, 55);
        sViewsWithIds.put(R.id.tvMessage, 56);
        sViewsWithIds.put(R.id.cl_get_more_discounts, 57);
        sViewsWithIds.put(R.id.tvGetMoreDiscounts, 58);
        sViewsWithIds.put(R.id.tmApplyCoupon, 59);
        sViewsWithIds.put(R.id.billDetailsMain, 60);
        sViewsWithIds.put(R.id.billDetails, 61);
        sViewsWithIds.put(R.id.viewSpace, 62);
        sViewsWithIds.put(R.id.lottieView, 63);
        sViewsWithIds.put(R.id.tvOrderPlaced, 64);
        sViewsWithIds.put(R.id.ivOrderIsBeingPlaced, 65);
        sViewsWithIds.put(R.id.progressBar, 66);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerOrderSummaryBinding mboundView2;
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView22;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView32;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView39;
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView4;
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityOrderSummaryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 67, sIncludes, sViewsWithIds));
    }
    private ActivityOrderSummaryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 19
            , (com.intellihealth.salt.views.TextView) bindings[51]
            , (com.intellihealth.salt.views.cards.BillDetails) bindings[61]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[60]
            , (com.intellihealth.salt.views.buttons.Button) bindings[45]
            , (com.intellihealth.salt.views.buttons.Button) bindings[27]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[11]
            , (com.google.android.material.card.MaterialCardView) bindings[31]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[48]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[43]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[57]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[19]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[38]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[37]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[42]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[21]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[54]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[65]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[53]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[44]
            , (com.airbnb.lottie.LottieAnimationView) bindings[63]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[41]
            , (androidx.core.widget.NestedScrollView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[30]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[49]
            , (com.intellihealth.salt.views.TextView) bindings[50]
            , (com.intellihealth.salt.views.TextView) bindings[52]
            , (com.intellihealth.salt.views.section.ProductCardSection) bindings[34]
            , (android.widget.ProgressBar) bindings[66]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[28]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[2]
            , (com.intellihealth.salt.views.cards.CouponCtaCards) bindings[59]
            , (com.intellihealth.salt.views.cards.Divider) bindings[12]
            , (com.intellihealth.salt.views.cards.Divider) bindings[46]
            , (com.intellihealth.salt.views.cards.Divider) bindings[29]
            , (com.intellihealth.salt.views.cards.Divider) bindings[16]
            , (com.intellihealth.salt.views.cards.Divider) bindings[17]
            , (com.intellihealth.salt.views.cards.PaymentOfferCarousel) bindings[33]
            , (com.intellihealth.salt.views.payments.StickyPaymentContainer) bindings[36]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[35]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[24]
            , (com.intellihealth.salt.views.TextView) bindings[58]
            , (com.intellihealth.salt.views.TextView) bindings[56]
            , (com.intellihealth.salt.views.TextView) bindings[64]
            , (com.intellihealth.salt.views.TextView) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[25]
            , (com.intellihealth.salt.views.TextView) bindings[26]
            , (com.intellihealth.salt.views.TextView) bindings[47]
            , (android.widget.TextView) bindings[23]
            , (com.intellihealth.salt.views.TextView) bindings[55]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (android.view.View) bindings[62]
            );
        this.btnAddToCartBlueVariant.setTag(null);
        this.btnViewMore.setTag(null);
        this.cardUpload.setTag(null);
        this.clAddMedicine.setTag(null);
        this.clItemsNoLongerAvailable.setTag(null);
        this.clOTCProducts.setTag(null);
        this.clOrderIsBeingPlacedView.setTag(null);
        this.clOrderPlacedView.setTag(null);
        this.clOtcCard.setTag(null);
        this.clViewMore.setTag(null);
        this.ivIcon.setTag(null);
        this.ivPrescriptionUploaded.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.intellihealth.truemeds.databinding.ShimmerOrderSummaryBinding) bindings[40];
        setContainedBinding(this.mboundView2);
        this.mboundView22 = (com.intellihealth.salt.views.TextView) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView32 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[32];
        this.mboundView32.setTag(null);
        this.mboundView39 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[39];
        this.mboundView39.setTag(null);
        this.mboundView4 = (com.intellihealth.salt.views.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (com.intellihealth.salt.views.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.nestedScrollView.setTag(null);
        this.prescriptionCardCtl.setTag(null);
        this.productCardSection.setTag(null);
        this.rvCart.setTag(null);
        this.rvOtcProducts.setTag(null);
        this.rvPrescription.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.tmDivider1.setTag(null);
        this.tmDividerBottomClOtcProducts.setTag(null);
        this.tmDividerTopAddMedicines.setTag(null);
        this.tmDividerTopAddPrescription.setTag(null);
        this.tmPaymentCarousel.setTag(null);
        this.tmStickyPaymentPlaceOrder.setTag(null);
        this.tmStickyPaymentPlaceOrderMain.setTag(null);
        this.tmTopHeader.setTag(null);
        this.tvCartCount.setTag(null);
        this.tvCrossMrp.setTag(null);
        this.tvPrescriptionUploaded.setTag(null);
        this.tvSellingPrice.setTag(null);
        this.tvSellingPriceDecimal.setTag(null);
        this.tvTitle.setTag(null);
        this.tvViewChanges.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 4);
        mCallback28 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 5);
        mCallback25 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 2);
        mCallback26 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 3);
        mCallback24 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 1);
        mCallback29 = new com.intellihealth.truemeds.generated.callback.OnClickListener(this, 6);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800000L;
                mDirtyFlags_1 = 0x0L;
        }
        mboundView2.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0 || mDirtyFlags_1 != 0) {
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
        if (BR.callback == variableId) {
            setCallback((com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback) variable);
        }
        else if (BR.fragmentManager == variableId) {
            setFragmentManager((androidx.fragment.app.FragmentManager) variable);
        }
        else if (BR.cardData == variableId) {
            setCardData((com.intellihealth.salt.models.BillDetailsModel) variable);
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
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }
    public void setFragmentManager(@Nullable androidx.fragment.app.FragmentManager FragmentManager) {
        this.mFragmentManager = FragmentManager;
        synchronized(this) {
            mDirtyFlags |= 0x100000L;
        }
        notifyPropertyChanged(BR.fragmentManager);
        super.requestRebind();
    }
    public void setCardData(@Nullable com.intellihealth.salt.models.BillDetailsModel CardData) {
        this.mCardData = CardData;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CartViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400000L;
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
                return onChangeViewModelOrderPlacedView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelStickyPaymentDataPlaceOrder((androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.PaymentContainerModel>) object, fieldId);
            case 2 :
                return onChangeViewModelLoaderValue((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelSetMainDataView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelOtcMedicineList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
            case 5 :
                return onChangeViewModelDrCallNeeded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelPrescriptions((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>>) object, fieldId);
            case 7 :
                return onChangeViewModelDeliveryChargeMessage((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelIsServiceable((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.domain.enums.PinCodeServiceability>) object, fieldId);
            case 9 :
                return onChangeViewModelPhCallNeeded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeViewModelOrderIsBeingPlacedView((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelOtcProductSelected((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel>) object, fieldId);
            case 12 :
                return onChangeViewModelProductList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
            case 13 :
                return onChangeViewModelItemsNotAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeViewModelPaymentCarouselList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.PaymentCarouselModel>>) object, fieldId);
            case 15 :
                return onChangeViewModelShowLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 16 :
                return onChangeViewModelFreeDeliveryMessage((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 17 :
                return onChangeViewModelApiMedicineList((androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>>) object, fieldId);
            case 18 :
                return onChangeViewModelItemsNotAvailableCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelOrderPlacedView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelOrderPlacedView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStickyPaymentDataPlaceOrder(androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.PaymentContainerModel> ViewModelStickyPaymentDataPlaceOrder, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoaderValue(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoaderValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSetMainDataView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSetMainDataView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOtcMedicineList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewModelOtcMedicineList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDrCallNeeded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDrCallNeeded, int fieldId) {
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
    private boolean onChangeViewModelDeliveryChargeMessage(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDeliveryChargeMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsServiceable(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.domain.enums.PinCodeServiceability> ViewModelIsServiceable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhCallNeeded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelPhCallNeeded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrderIsBeingPlacedView(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelOrderIsBeingPlacedView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOtcProductSelected(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> ViewModelOtcProductSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProductList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewModelProductList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelItemsNotAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelItemsNotAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPaymentCarouselList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.PaymentCarouselModel>> ViewModelPaymentCarouselList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFreeDeliveryMessage(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFreeDeliveryMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelApiMedicineList(androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> ViewModelApiMedicineList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelItemsNotAvailableCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelItemsNotAvailableCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        long dirtyFlags_1 = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
            dirtyFlags_1 = mDirtyFlags_1;
            mDirtyFlags_1 = 0;
        }
        com.intellihealth.truemeds.presentation.callbacks.ViewPrescriptionCallback callback = mCallback;
        boolean viewModelOtcMedicineListSizeInt0 = false;
        int viewModelOtcMedicineListSizeInt0ViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDrCallNeededGetValue = false;
        int viewModelOrderIsBeingPlacedViewBooleanTrueViewModelOrderPlacedViewViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelOrderPlacedView = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.salt.models.PaymentContainerModel> viewModelStickyPaymentDataPlaceOrder = null;
        boolean viewModelDrCallNeededViewModelPhCallNeededBooleanFalse = false;
        boolean viewModelProductListSizeInt0ViewModelPrescriptionsSizeInt0BooleanFalse = false;
        int viewModelLoaderValueViewVISIBLEViewGONE = 0;
        int viewModelApiMedicineListSizeInt0ViewVISIBLEViewGONE = 0;
        java.lang.String javaLangStringViewViewModelApiMedicineListSizeInt1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSetMainDataViewGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoaderValue = null;
        int viewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE = 0;
        int viewModelApiMedicineListSizeInt1 = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSetMainDataView = null;
        int viewModelProductListSizeInt0ViewVISIBLEViewGONE = 0;
        boolean viewModelProductListSizeInt0 = false;
        java.lang.String viewModelOtcProductSelectedProductDrugType = null;
        androidx.fragment.app.FragmentManager fragmentManager = mFragmentManager;
        int viewModelPaymentCarouselListSize = 0;
        java.lang.String viewModelOtcProductSelectedProductSkuName = null;
        java.lang.Boolean viewModelOrderIsBeingPlacedViewGetValue = null;
        int viewModelSetMainDataViewViewVISIBLEViewGONE = 0;
        java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo> viewModelPrescriptionsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewModelOtcMedicineList = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDrCallNeeded = null;
        boolean viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalse = false;
        java.lang.String javaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableWithCount = null;
        java.lang.String viewModelApiMedicineListSizeJavaLangStringItemInYourCart = null;
        java.lang.String viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewLessJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItems = null;
        java.lang.String viewModelFreeDeliveryMessageGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.data.model.orderflow.OrderRxInfo>> viewModelPrescriptions = null;
        boolean viewModelIsExpanded = false;
        java.lang.String javaLangStringViewModelItemsNotAvailableCount = null;
        int viewModelPrescriptionsSize = 0;
        java.lang.Boolean viewModelItemsNotAvailableGetValue = null;
        double viewModelOtcProductSelectedProductDiscount = 0.0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelPhCallNeededGetValue = false;
        java.lang.String viewModelApiMedicineListSizeJavaLangStringItemsInYourCart = null;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelProductListGetValue = null;
        java.lang.Boolean viewModelShowLoadingGetValue = null;
        int viewModelShowLoadingViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDeliveryChargeMessage = null;
        boolean viewModelApiMedicineListSizeInt0 = false;
        int viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalseViewINVISIBLEViewVISIBLE = 0;
        com.intellihealth.truemeds.domain.enums.PinCodeServiceability viewModelIsServiceableGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.domain.enums.PinCodeServiceability> viewModelIsServiceable = null;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelApiMedicineListGetValue = null;
        com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue = false;
        boolean viewModelOrderIsBeingPlacedViewBooleanTrueViewModelOrderPlacedView = false;
        com.intellihealth.truemeds.presentation.model.ProductInfoModel viewModelOtcProductSelectedGetValue = null;
        java.lang.String viewModelIsExpandedViewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewLessJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItemsViewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItemsJavaLangString = null;
        boolean viewModelPrescriptionsSizeInt0 = false;
        java.lang.String viewModelApiMedicineListSizeInt1ViewModelApiMedicineListSizeJavaLangStringItemsInYourCartViewModelApiMedicineListSizeInt1ViewModelApiMedicineListSizeJavaLangStringItemInYourCartViewModelApiMedicineListSizeJavaLangStringItemsInYourCart = null;
        boolean ViewModelProductListSizeInt01 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelPhCallNeeded = null;
        int viewModelItemsNotAvailableViewVISIBLEViewGONE = 0;
        int viewModelApiMedicineListSizeInt1ViewVISIBLEViewGONE = 0;
        int viewModelPrescriptionsSizeInt1ViewGONEViewVISIBLE = 0;
        boolean viewModelItemsNotAvailableCountInt1 = false;
        java.lang.String javaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableSingleCount = null;
        boolean ViewModelDrCallNeeded1 = false;
        int viewModelDrCallNeededViewModelPhCallNeededBooleanFalseViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelOrderIsBeingPlacedView = null;
        java.lang.Integer viewModelItemsNotAvailableCountGetValue = null;
        java.lang.String viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItemsJavaLangString = null;
        java.lang.Boolean viewModelSetMainDataViewGetValue = null;
        com.intellihealth.salt.models.PaymentContainerModel viewModelStickyPaymentDataPlaceOrderGetValue = null;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelOtcProductSelected = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = false;
        int viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalseViewVISIBLEViewGONE = 0;
        int viewModelOrderPlacedViewViewVISIBLEViewGONE = 0;
        java.util.List<com.intellihealth.salt.models.PaymentCarouselModel> viewModelPaymentCarouselListGetValue = null;
        java.lang.String javaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItems = null;
        int viewModelApiMedicineListSize = 0;
        java.lang.String stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableWithCount = null;
        double viewModelOtcProductSelectedProductMrp = 0.0;
        java.lang.String viewModelDeliveryChargeMessageGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewModelProductList = null;
        boolean viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelItemsNotAvailable = null;
        boolean ViewModelPhCallNeeded1 = false;
        int viewModelProductListSize = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableGetValue = false;
        boolean ViewModelApiMedicineListSizeInt11 = false;
        boolean ViewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalse1 = false;
        boolean viewModelApiMedicineListJavaLangObjectNull = false;
        int viewModelShowLoadingViewGONEViewVISIBLE = 0;
        java.lang.String viewModelItemsNotAvailableCountInt1StringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableWithCountStringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableSingleCount = null;
        boolean viewModelPaymentCarouselListSizeInt0 = false;
        java.lang.String javaLangStringViewModelItemsNotAvailableCountJavaLangString = null;
        java.lang.Boolean viewModelDrCallNeededGetValue = null;
        int viewModelOtcMedicineListSize = 0;
        java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelOtcMedicineListGetValue = null;
        boolean viewModelPrescriptionsSizeInt1 = false;
        boolean ViewModelApiMedicineListSizeInt12 = false;
        java.lang.String viewModelOtcProductSelectedProductProductImageUrl = null;
        com.intellihealth.truemeds.presentation.model.Product viewModelOtcProductSelectedProduct = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableCountGetValue = 0;
        java.lang.Boolean viewModelPhCallNeededGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue = false;
        int viewModelPaymentCarouselListSizeInt0ViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.salt.models.PaymentCarouselModel>> viewModelPaymentCarouselList = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowLoading = null;
        int viewModelProductListSizeInt0ViewModelPrescriptionsSizeInt0BooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFreeDeliveryMessage = null;
        int viewModelOrderIsBeingPlacedViewViewVISIBLEViewGONE = 0;
        java.lang.String viewModelApiMedicineListSizeInt1ViewModelApiMedicineListSizeJavaLangStringItemInYourCartViewModelApiMedicineListSizeJavaLangStringItemsInYourCart = null;
        androidx.lifecycle.MutableLiveData<java.util.List<com.intellihealth.truemeds.presentation.model.ProductInfoModel>> viewModelApiMedicineList = null;
        double viewModelOtcProductSelectedProductSellingPrice = 0.0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelItemsNotAvailableCount = null;
        java.lang.String stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableSingleCount = null;
        java.lang.Boolean viewModelLoaderValueGetValue = null;
        java.lang.Boolean viewModelOrderPlacedViewGetValue = null;

        if ((dirtyFlags & 0xc80040L) != 0) {
        }
        if ((dirtyFlags & 0xd01000L) != 0) {
        }
        if ((dirtyFlags & 0xdfffffL) != 0) {


            if ((dirtyFlags & 0xc00001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderPlacedView
                        viewModelOrderPlacedView = viewModel.getOrderPlacedView();
                    }
                    updateLiveDataRegistration(0, viewModelOrderPlacedView);


                    if (viewModelOrderPlacedView != null) {
                        // read viewModel.orderPlacedView.getValue()
                        viewModelOrderPlacedViewGetValue = viewModelOrderPlacedView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelOrderPlacedViewGetValue);
                if((dirtyFlags & 0xc00001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue) {
                            dirtyFlags_1 |= 0x20L;
                    }
                    else {
                            dirtyFlags_1 |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelOrderPlacedViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc00002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.stickyPaymentDataPlaceOrder
                        viewModelStickyPaymentDataPlaceOrder = viewModel.getStickyPaymentDataPlaceOrder();
                    }
                    updateLiveDataRegistration(1, viewModelStickyPaymentDataPlaceOrder);


                    if (viewModelStickyPaymentDataPlaceOrder != null) {
                        // read viewModel.stickyPaymentDataPlaceOrder.getValue()
                        viewModelStickyPaymentDataPlaceOrderGetValue = viewModelStickyPaymentDataPlaceOrder.getValue();
                    }
            }
            if ((dirtyFlags & 0xc00004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loaderValue
                        viewModelLoaderValue = viewModel.getLoaderValue();
                    }
                    updateLiveDataRegistration(2, viewModelLoaderValue);


                    if (viewModelLoaderValue != null) {
                        // read viewModel.loaderValue.getValue()
                        viewModelLoaderValueGetValue = viewModelLoaderValue.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoaderValueGetValue);
                if((dirtyFlags & 0xc00004L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoaderValueViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoaderValueGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc00008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.setMainDataView
                        viewModelSetMainDataView = viewModel.getSetMainDataView();
                    }
                    updateLiveDataRegistration(3, viewModelSetMainDataView);


                    if (viewModelSetMainDataView != null) {
                        // read viewModel.setMainDataView.getValue()
                        viewModelSetMainDataViewGetValue = viewModelSetMainDataView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.setMainDataView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSetMainDataViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSetMainDataViewGetValue);
                if((dirtyFlags & 0xc00008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelSetMainDataViewGetValue) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.setMainDataView.getValue()) ? View.VISIBLE : View.GONE
                    viewModelSetMainDataViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSetMainDataViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc00010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.otcMedicineList
                        viewModelOtcMedicineList = viewModel.getOtcMedicineList();
                    }
                    updateLiveDataRegistration(4, viewModelOtcMedicineList);


                    if (viewModelOtcMedicineList != null) {
                        // read viewModel.otcMedicineList.getValue()
                        viewModelOtcMedicineListGetValue = viewModelOtcMedicineList.getValue();
                    }


                    if (viewModelOtcMedicineListGetValue != null) {
                        // read viewModel.otcMedicineList.getValue().size()
                        viewModelOtcMedicineListSize = viewModelOtcMedicineListGetValue.size();
                    }


                    // read viewModel.otcMedicineList.getValue().size() == 0
                    viewModelOtcMedicineListSizeInt0 = (viewModelOtcMedicineListSize) == (0);
                if((dirtyFlags & 0xc00010L) != 0) {
                    if(viewModelOtcMedicineListSizeInt0) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read viewModel.otcMedicineList.getValue().size() == 0 ? View.GONE : View.VISIBLE
                    viewModelOtcMedicineListSizeInt0ViewGONEViewVISIBLE = ((viewModelOtcMedicineListSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc00220L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.drCallNeeded
                        viewModelDrCallNeeded = viewModel.getDrCallNeeded();
                    }
                    updateLiveDataRegistration(5, viewModelDrCallNeeded);


                    if (viewModelDrCallNeeded != null) {
                        // read viewModel.drCallNeeded.getValue()
                        viewModelDrCallNeededGetValue = viewModelDrCallNeeded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drCallNeeded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelDrCallNeededGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDrCallNeededGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drCallNeeded.getValue())
                    ViewModelDrCallNeeded1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelDrCallNeededGetValue;
                if((dirtyFlags & 0xc00220L) != 0) {
                    if(ViewModelDrCallNeeded1) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc81040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.prescriptions
                        viewModelPrescriptions = viewModel.getPrescriptions();
                    }
                    updateLiveDataRegistration(6, viewModelPrescriptions);


                    if (viewModelPrescriptions != null) {
                        // read viewModel.prescriptions.getValue()
                        viewModelPrescriptionsGetValue = viewModelPrescriptions.getValue();
                    }

                if ((dirtyFlags & 0xc80040L) != 0) {
                }
                if ((dirtyFlags & 0xc01040L) != 0) {

                        if (viewModelPrescriptionsGetValue != null) {
                            // read viewModel.prescriptions.getValue().size()
                            viewModelPrescriptionsSize = viewModelPrescriptionsGetValue.size();
                        }


                        // read viewModel.prescriptions.getValue().size() > 0
                        viewModelPrescriptionsSizeInt0 = (viewModelPrescriptionsSize) > (0);
                    if((dirtyFlags & 0xc00040L) != 0) {
                        if(viewModelPrescriptionsSizeInt0) {
                                dirtyFlags |= 0x2000000000L;
                        }
                        else {
                                dirtyFlags |= 0x1000000000L;
                        }
                    }
                    if((dirtyFlags & 0xc01040L) != 0) {
                        if(viewModelPrescriptionsSizeInt0) {
                                dirtyFlags |= 0x80000000000L;
                                dirtyFlags_1 |= 0x200L;
                        }
                        else {
                                dirtyFlags |= 0x40000000000L;
                                dirtyFlags_1 |= 0x100L;
                        }
                    }

                    if ((dirtyFlags & 0xc00040L) != 0) {

                            // read viewModel.prescriptions.getValue().size() > 0 ? View.VISIBLE : View.GONE
                            viewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE = ((viewModelPrescriptionsSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    }
                    if ((dirtyFlags & 0xc00040L) != 0) {

                            // read viewModel.prescriptions.getValue().size() > 1
                            viewModelPrescriptionsSizeInt1 = (viewModelPrescriptionsSize) > (1);
                        if((dirtyFlags & 0xc00040L) != 0) {
                            if(viewModelPrescriptionsSizeInt1) {
                                    dirtyFlags |= 0x2000000000000000L;
                            }
                            else {
                                    dirtyFlags |= 0x1000000000000000L;
                            }
                        }


                            // read viewModel.prescriptions.getValue().size() > 1 ? View.GONE : View.VISIBLE
                            viewModelPrescriptionsSizeInt1ViewGONEViewVISIBLE = ((viewModelPrescriptionsSizeInt1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    }
                }
            }
            if ((dirtyFlags & 0xc20000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isExpanded
                        viewModelIsExpanded = viewModel.isExpanded();
                        // read viewModel.apiMedicineList
                        viewModelApiMedicineList = viewModel.getApiMedicineList();
                    }
                    updateLiveDataRegistration(17, viewModelApiMedicineList);
                if((dirtyFlags & 0xc20000L) != 0) {
                    if(viewModelIsExpanded) {
                            dirtyFlags |= 0x20000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000000L;
                    }
                }


                    if (viewModelApiMedicineList != null) {
                        // read viewModel.apiMedicineList.getValue()
                        viewModelApiMedicineListGetValue = viewModelApiMedicineList.getValue();
                    }


                    if (viewModelApiMedicineListGetValue != null) {
                        // read viewModel.apiMedicineList.getValue().size()
                        viewModelApiMedicineListSize = viewModelApiMedicineListGetValue.size();
                    }


                    // read viewModel.apiMedicineList.getValue().size() == 0
                    viewModelApiMedicineListSizeInt0 = (viewModelApiMedicineListSize) == (0);
                    // read viewModel.apiMedicineList.getValue().size() > 1
                    ViewModelApiMedicineListSizeInt12 = (viewModelApiMedicineListSize) > (1);
                if((dirtyFlags & 0xc20000L) != 0) {
                    if(viewModelApiMedicineListSizeInt0) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }
                if((dirtyFlags & 0xc20000L) != 0) {
                    if(ViewModelApiMedicineListSizeInt12) {
                            dirtyFlags |= 0x80000000000000L;
                            dirtyFlags |= 0x800000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000000L;
                            dirtyFlags |= 0x400000000000000L;
                    }
                }


                    // read viewModel.apiMedicineList.getValue().size() == 0 ? View.VISIBLE : View.GONE
                    viewModelApiMedicineListSizeInt0ViewVISIBLEViewGONE = ((viewModelApiMedicineListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.apiMedicineList.getValue().size() > 1 ? View.VISIBLE : View.GONE
                    viewModelApiMedicineListSizeInt1ViewVISIBLEViewGONE = ((ViewModelApiMedicineListSizeInt12) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc00080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.deliveryChargeMessage
                        viewModelDeliveryChargeMessage = viewModel.getDeliveryChargeMessage();
                    }
                    updateLiveDataRegistration(7, viewModelDeliveryChargeMessage);


                    if (viewModelDeliveryChargeMessage != null) {
                        // read viewModel.deliveryChargeMessage.getValue()
                        viewModelDeliveryChargeMessageGetValue = viewModelDeliveryChargeMessage.getValue();
                    }
            }
            if ((dirtyFlags & 0xc00100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isServiceable
                        viewModelIsServiceable = viewModel.isServiceable();
                    }
                    updateLiveDataRegistration(8, viewModelIsServiceable);


                    if (viewModelIsServiceable != null) {
                        // read viewModel.isServiceable.getValue()
                        viewModelIsServiceableGetValue = viewModelIsServiceable.getValue();
                    }
            }
            if ((dirtyFlags & 0xc00401L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderIsBeingPlacedView
                        viewModelOrderIsBeingPlacedView = viewModel.getOrderIsBeingPlacedView();
                    }
                    updateLiveDataRegistration(10, viewModelOrderIsBeingPlacedView);


                    if (viewModelOrderIsBeingPlacedView != null) {
                        // read viewModel.orderIsBeingPlacedView.getValue()
                        viewModelOrderIsBeingPlacedViewGetValue = viewModelOrderIsBeingPlacedView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelOrderIsBeingPlacedViewGetValue);
                if((dirtyFlags & 0xc00401L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue) {
                            dirtyFlags |= 0x8000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000000L;
                    }
                }
                if((dirtyFlags & 0xc00400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue) {
                            dirtyFlags_1 |= 0x80000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x40000L;
                    }
                }

                if ((dirtyFlags & 0xc00400L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? View.VISIBLE : View.GONE
                        viewModelOrderIsBeingPlacedViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0xc00800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.otcProductSelected
                        viewModelOtcProductSelected = viewModel.getOtcProductSelected();
                    }
                    updateLiveDataRegistration(11, viewModelOtcProductSelected);


                    if (viewModelOtcProductSelected != null) {
                        // read viewModel.otcProductSelected.getValue()
                        viewModelOtcProductSelectedGetValue = viewModelOtcProductSelected.getValue();
                    }


                    if (viewModelOtcProductSelectedGetValue != null) {
                        // read viewModel.otcProductSelected.getValue().product
                        viewModelOtcProductSelectedProduct = viewModelOtcProductSelectedGetValue.getProduct();
                    }


                    if (viewModelOtcProductSelectedProduct != null) {
                        // read viewModel.otcProductSelected.getValue().product.drugType
                        viewModelOtcProductSelectedProductDrugType = viewModelOtcProductSelectedProduct.getDrugType();
                        // read viewModel.otcProductSelected.getValue().product.skuName
                        viewModelOtcProductSelectedProductSkuName = viewModelOtcProductSelectedProduct.getSkuName();
                        // read viewModel.otcProductSelected.getValue().product.discount
                        viewModelOtcProductSelectedProductDiscount = viewModelOtcProductSelectedProduct.getDiscount();
                        // read viewModel.otcProductSelected.getValue().product.mrp
                        viewModelOtcProductSelectedProductMrp = viewModelOtcProductSelectedProduct.getMrp();
                        // read viewModel.otcProductSelected.getValue().product.productImageUrl
                        viewModelOtcProductSelectedProductProductImageUrl = viewModelOtcProductSelectedProduct.getProductImageUrl();
                        // read viewModel.otcProductSelected.getValue().product.sellingPrice
                        viewModelOtcProductSelectedProductSellingPrice = viewModelOtcProductSelectedProduct.getSellingPrice();
                    }
            }
            if ((dirtyFlags & 0xd01040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.productList
                        viewModelProductList = viewModel.getProductList();
                    }
                    updateLiveDataRegistration(12, viewModelProductList);


                    if (viewModelProductList != null) {
                        // read viewModel.productList.getValue()
                        viewModelProductListGetValue = viewModelProductList.getValue();
                    }

                if ((dirtyFlags & 0xd01000L) != 0) {
                }
                if ((dirtyFlags & 0xc01040L) != 0) {

                        if (viewModelProductListGetValue != null) {
                            // read viewModel.productList.getValue().size()
                            viewModelProductListSize = viewModelProductListGetValue.size();
                        }


                        // read viewModel.productList.getValue().size() > 0
                        viewModelProductListSizeInt0 = (viewModelProductListSize) > (0);
                    if((dirtyFlags & 0xc01040L) != 0) {
                        if(viewModelProductListSizeInt0) {
                                dirtyFlags |= 0x80000000L;
                        }
                        else {
                                dirtyFlags |= 0x40000000L;
                        }
                    }
                    if((dirtyFlags & 0xc01000L) != 0) {
                        if(viewModelProductListSizeInt0) {
                                dirtyFlags |= 0x8000000000L;
                        }
                        else {
                                dirtyFlags |= 0x4000000000L;
                        }
                    }

                    if ((dirtyFlags & 0xc01000L) != 0) {

                            // read viewModel.productList.getValue().size() > 0 ? View.VISIBLE : View.GONE
                            viewModelProductListSizeInt0ViewVISIBLEViewGONE = ((viewModelProductListSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    }
                }
            }
            if ((dirtyFlags & 0xc02000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.itemsNotAvailable
                        viewModelItemsNotAvailable = viewModel.getItemsNotAvailable();
                    }
                    updateLiveDataRegistration(13, viewModelItemsNotAvailable);


                    if (viewModelItemsNotAvailable != null) {
                        // read viewModel.itemsNotAvailable.getValue()
                        viewModelItemsNotAvailableGetValue = viewModelItemsNotAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelItemsNotAvailableGetValue);
                if((dirtyFlags & 0xc02000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableGetValue) {
                            dirtyFlags |= 0x200000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailable.getValue()) ? View.VISIBLE : View.GONE
                    viewModelItemsNotAvailableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc04000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.paymentCarouselList
                        viewModelPaymentCarouselList = viewModel.getPaymentCarouselList();
                    }
                    updateLiveDataRegistration(14, viewModelPaymentCarouselList);


                    if (viewModelPaymentCarouselList != null) {
                        // read viewModel.paymentCarouselList.getValue()
                        viewModelPaymentCarouselListGetValue = viewModelPaymentCarouselList.getValue();
                    }


                    if (viewModelPaymentCarouselListGetValue != null) {
                        // read viewModel.paymentCarouselList.getValue().size()
                        viewModelPaymentCarouselListSize = viewModelPaymentCarouselListGetValue.size();
                    }


                    // read viewModel.paymentCarouselList.getValue().size() == 0
                    viewModelPaymentCarouselListSizeInt0 = (viewModelPaymentCarouselListSize) == (0);
                if((dirtyFlags & 0xc04000L) != 0) {
                    if(viewModelPaymentCarouselListSizeInt0) {
                            dirtyFlags_1 |= 0x8000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x4000L;
                    }
                }


                    // read viewModel.paymentCarouselList.getValue().size() == 0 ? View.GONE : View.VISIBLE
                    viewModelPaymentCarouselListSizeInt0ViewGONEViewVISIBLE = ((viewModelPaymentCarouselListSizeInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc08000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showLoading
                        viewModelShowLoading = viewModel.getShowLoading();
                    }
                    updateLiveDataRegistration(15, viewModelShowLoading);


                    if (viewModelShowLoading != null) {
                        // read viewModel.showLoading.getValue()
                        viewModelShowLoadingGetValue = viewModelShowLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowLoadingGetValue);
                if((dirtyFlags & 0xc08000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue) {
                            dirtyFlags |= 0x800000000000L;
                            dirtyFlags_1 |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400000000000L;
                            dirtyFlags_1 |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.GONE : View.VISIBLE
                    viewModelShowLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc10000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.freeDeliveryMessage
                        viewModelFreeDeliveryMessage = viewModel.getFreeDeliveryMessage();
                    }
                    updateLiveDataRegistration(16, viewModelFreeDeliveryMessage);


                    if (viewModelFreeDeliveryMessage != null) {
                        // read viewModel.freeDeliveryMessage.getValue()
                        viewModelFreeDeliveryMessageGetValue = viewModelFreeDeliveryMessage.getValue();
                    }
            }
            if ((dirtyFlags & 0xc40000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.itemsNotAvailableCount
                        viewModelItemsNotAvailableCount = viewModel.getItemsNotAvailableCount();
                    }
                    updateLiveDataRegistration(18, viewModelItemsNotAvailableCount);


                    if (viewModelItemsNotAvailableCount != null) {
                        // read viewModel.itemsNotAvailableCount.getValue()
                        viewModelItemsNotAvailableCountGetValue = viewModelItemsNotAvailableCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelItemsNotAvailableCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue()) > 1
                    viewModelItemsNotAvailableCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxViewModelItemsNotAvailableCountGetValue) > (1);
                if((dirtyFlags & 0xc40000L) != 0) {
                    if(viewModelItemsNotAvailableCountInt1) {
                            dirtyFlags_1 |= 0x2000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x1000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xc01040L) != 0) {

                // read viewModel.productList.getValue().size() > 0 ? viewModel.prescriptions.getValue().size() > 0 : false
                viewModelProductListSizeInt0ViewModelPrescriptionsSizeInt0BooleanFalse = ((viewModelProductListSizeInt0) ? (viewModelPrescriptionsSizeInt0) : (false));
                // read viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() > 0 : false
                viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalse = ((viewModelPrescriptionsSizeInt0) ? (viewModelProductListSizeInt0) : (false));
            if((dirtyFlags & 0xc01040L) != 0) {
                if(viewModelProductListSizeInt0ViewModelPrescriptionsSizeInt0BooleanFalse) {
                        dirtyFlags_1 |= 0x20000L;
                }
                else {
                        dirtyFlags_1 |= 0x10000L;
                }
            }
            if((dirtyFlags & 0xc01040L) != 0) {
                if(viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalse) {
                        dirtyFlags |= 0x2000000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000000L;
                }
            }


                // read viewModel.productList.getValue().size() > 0 ? viewModel.prescriptions.getValue().size() > 0 : false ? View.VISIBLE : View.GONE
                viewModelProductListSizeInt0ViewModelPrescriptionsSizeInt0BooleanFalseViewVISIBLEViewGONE = ((viewModelProductListSizeInt0ViewModelPrescriptionsSizeInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() > 0 : false ? View.INVISIBLE : View.VISIBLE
                viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalseViewINVISIBLEViewVISIBLE = ((viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalse) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags_1 & 0x3000L) != 0) {

                // read ("") + (viewModel.itemsNotAvailableCount.getValue())
                javaLangStringViewModelItemsNotAvailableCount = ("") + (viewModelItemsNotAvailableCountGetValue);


                // read (("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")
                javaLangStringViewModelItemsNotAvailableCountJavaLangString = (javaLangStringViewModelItemsNotAvailableCount) + (" ");

            if ((dirtyFlags_1 & 0x2000L) != 0) {

                    // read ((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count)
                    javaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableWithCount = (javaLangStringViewModelItemsNotAvailableCountJavaLangString) + (mboundView6.getResources().getString(R.string.items_are_no_longer_available_with_count));


                    // read String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count))
                    stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableWithCount = java.lang.String.format(javaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableWithCount);
            }
            if ((dirtyFlags_1 & 0x1000L) != 0) {

                    // read ((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count)
                    javaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableSingleCount = (javaLangStringViewModelItemsNotAvailableCountJavaLangString) + (mboundView6.getResources().getString(R.string.items_are_no_longer_available_single_count));


                    // read String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count))
                    stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableSingleCount = java.lang.String.format(javaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableSingleCount);
            }
        }
        if ((dirtyFlags & 0x34000020000000L) != 0) {


            if ((dirtyFlags & 0x4000000000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.orderPlacedView
                        viewModelOrderPlacedView = viewModel.getOrderPlacedView();
                    }
                    updateLiveDataRegistration(0, viewModelOrderPlacedView);


                    if (viewModelOrderPlacedView != null) {
                        // read viewModel.orderPlacedView.getValue()
                        viewModelOrderPlacedViewGetValue = viewModelOrderPlacedView.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelOrderPlacedViewGetValue);
                if((dirtyFlags & 0xc00001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue) {
                            dirtyFlags_1 |= 0x20L;
                    }
                    else {
                            dirtyFlags_1 |= 0x10L;
                    }
                }
            }
            if ((dirtyFlags & 0x20000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phCallNeeded
                        viewModelPhCallNeeded = viewModel.getPhCallNeeded();
                    }
                    updateLiveDataRegistration(9, viewModelPhCallNeeded);


                    if (viewModelPhCallNeeded != null) {
                        // read viewModel.phCallNeeded.getValue()
                        viewModelPhCallNeededGetValue = viewModelPhCallNeeded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.phCallNeeded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelPhCallNeededGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelPhCallNeededGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.phCallNeeded.getValue())
                    ViewModelPhCallNeeded1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelPhCallNeededGetValue;
            }
            if ((dirtyFlags & 0x30000000000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.apiMedicineList
                        viewModelApiMedicineList = viewModel.getApiMedicineList();
                    }
                    updateLiveDataRegistration(17, viewModelApiMedicineList);


                    if (viewModelApiMedicineList != null) {
                        // read viewModel.apiMedicineList.getValue()
                        viewModelApiMedicineListGetValue = viewModelApiMedicineList.getValue();
                    }


                    // read viewModel.apiMedicineList.getValue() != null
                    viewModelApiMedicineListJavaLangObjectNull = (viewModelApiMedicineListGetValue) != (null);
                if((dirtyFlags & 0x30000000000000L) != 0) {
                    if(viewModelApiMedicineListJavaLangObjectNull) {
                            dirtyFlags_1 |= 0x80L;
                    }
                    else {
                            dirtyFlags_1 |= 0x40L;
                    }
                }
            }
        }
        if ((dirtyFlags_1 & 0x200L) != 0) {

                // read viewModel.productList.getValue().size() == 0
                ViewModelProductListSizeInt01 = (viewModelProductListSize) == (0);
        }

        if ((dirtyFlags & 0xc00220L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drCallNeeded.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.phCallNeeded.getValue()) : false
                viewModelDrCallNeededViewModelPhCallNeededBooleanFalse = ((ViewModelDrCallNeeded1) ? (ViewModelPhCallNeeded1) : (false));
            if((dirtyFlags & 0xc00220L) != 0) {
                if(viewModelDrCallNeededViewModelPhCallNeededBooleanFalse) {
                        dirtyFlags |= 0x8000000000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drCallNeeded.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.phCallNeeded.getValue()) : false ? View.GONE : View.VISIBLE
                viewModelDrCallNeededViewModelPhCallNeededBooleanFalseViewGONEViewVISIBLE = ((viewModelDrCallNeededViewModelPhCallNeededBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0xc00401L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue())
                viewModelOrderIsBeingPlacedViewBooleanTrueViewModelOrderPlacedView = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOrderIsBeingPlacedViewGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelOrderPlacedViewGetValue));
            if((dirtyFlags & 0xc00401L) != 0) {
                if(viewModelOrderIsBeingPlacedViewBooleanTrueViewModelOrderPlacedView) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue()) ? View.GONE : View.VISIBLE
                viewModelOrderIsBeingPlacedViewBooleanTrueViewModelOrderPlacedViewViewGONEViewVISIBLE = ((viewModelOrderIsBeingPlacedViewBooleanTrueViewModelOrderPlacedView) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0xc01040L) != 0) {

                // read viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() == 0 : false
                ViewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalse1 = ((viewModelPrescriptionsSizeInt0) ? (ViewModelProductListSizeInt01) : (false));
            if((dirtyFlags & 0xc01040L) != 0) {
                if(ViewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalse1) {
                        dirtyFlags_1 |= 0x8L;
                }
                else {
                        dirtyFlags_1 |= 0x4L;
                }
            }


                // read viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
                viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalseViewVISIBLEViewGONE = ((ViewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xc40000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue()) > 1 ? String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count)) : String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count))
                viewModelItemsNotAvailableCountInt1StringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableWithCountStringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableSingleCount = ((viewModelItemsNotAvailableCountInt1) ? (stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableWithCount) : (stringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableSingleCount));
        }
        // batch finished

        if ((dirtyFlags_1 & 0x80L) != 0) {



                if (viewModel != null) {
                    // read viewModel.apiMedicineList
                    viewModelApiMedicineList = viewModel.getApiMedicineList();
                }
                updateLiveDataRegistration(17, viewModelApiMedicineList);


                if (viewModelApiMedicineList != null) {
                    // read viewModel.apiMedicineList.getValue()
                    viewModelApiMedicineListGetValue = viewModelApiMedicineList.getValue();
                }


                if (viewModelApiMedicineListGetValue != null) {
                    // read viewModel.apiMedicineList.getValue().size()
                    viewModelApiMedicineListSize = viewModelApiMedicineListGetValue.size();
                }


                // read viewModel.apiMedicineList.getValue().size() > 1
                ViewModelApiMedicineListSizeInt12 = (viewModelApiMedicineListSize) > (1);
            if((dirtyFlags & 0xc20000L) != 0) {
                if(ViewModelApiMedicineListSizeInt12) {
                        dirtyFlags |= 0x80000000000000L;
                        dirtyFlags |= 0x800000000000000L;
                }
                else {
                        dirtyFlags |= 0x40000000000000L;
                        dirtyFlags |= 0x400000000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x30000000000000L) != 0) {

                // read viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false
                viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalse = ((viewModelApiMedicineListJavaLangObjectNull) ? (ViewModelApiMedicineListSizeInt12) : (false));
            if((dirtyFlags & 0x20000000000000L) != 0) {
                if(viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalse) {
                        dirtyFlags |= 0x200000000000L;
                }
                else {
                        dirtyFlags |= 0x100000000000L;
                }
            }
            if((dirtyFlags & 0x10000000000000L) != 0) {
                if(viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalse) {
                        dirtyFlags_1 |= 0x2L;
                }
                else {
                        dirtyFlags_1 |= 0x1L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0xc0100000000000L) != 0 || (dirtyFlags_1 & 0x2L) != 0) {



                if (viewModel != null) {
                    // read viewModel.apiMedicineList
                    viewModelApiMedicineList = viewModel.getApiMedicineList();
                }
                updateLiveDataRegistration(17, viewModelApiMedicineList);


                if (viewModelApiMedicineList != null) {
                    // read viewModel.apiMedicineList.getValue()
                    viewModelApiMedicineListGetValue = viewModelApiMedicineList.getValue();
                }


                if (viewModelApiMedicineListGetValue != null) {
                    // read viewModel.apiMedicineList.getValue().size()
                    viewModelApiMedicineListSize = viewModelApiMedicineListGetValue.size();
                }

            if ((dirtyFlags & 0x100000000000L) != 0 || (dirtyFlags_1 & 0x2L) != 0) {

                    // read (viewModel.apiMedicineList.getValue().size()) - (1)
                    viewModelApiMedicineListSizeInt1 = (viewModelApiMedicineListSize) - (1);


                    // read ("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))
                    javaLangStringViewViewModelApiMedicineListSizeInt1 = ("View ") + (viewModelApiMedicineListSizeInt1);


                    // read (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items")
                    javaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItems = (javaLangStringViewViewModelApiMedicineListSizeInt1) + (" more items");
            }
            if ((dirtyFlags & 0x80000000000000L) != 0) {

                    // read (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart")
                    viewModelApiMedicineListSizeJavaLangStringItemsInYourCart = (viewModelApiMedicineListSize) + (" Items in your cart");
            }
            if ((dirtyFlags & 0x40000000000000L) != 0) {

                    // read viewModel.apiMedicineList.getValue().size() == 1
                    ViewModelApiMedicineListSizeInt11 = (viewModelApiMedicineListSize) == (1);
                if((dirtyFlags & 0x40000000000000L) != 0) {
                    if(ViewModelApiMedicineListSizeInt11) {
                            dirtyFlags_1 |= 0x200000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x100000L;
                    }
                }
            }
        }

        if ((dirtyFlags & 0x20000000000000L) != 0) {

                // read viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? "View less" : (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items")
                viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewLessJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItems = ((viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalse) ? ("View less") : (javaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItems));
        }
        if ((dirtyFlags & 0x10000000000000L) != 0) {

                // read viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items") : ""
                viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItemsJavaLangString = ((viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalse) ? (javaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItems) : (""));
        }

        if ((dirtyFlags & 0xc20000L) != 0) {

                // read viewModel.isExpanded ? viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? "View less" : (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items") : viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items") : ""
                viewModelIsExpandedViewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewLessJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItemsViewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItemsJavaLangString = ((viewModelIsExpanded) ? (viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewLessJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItems) : (viewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItemsJavaLangString));
        }
        // batch finished

        if ((dirtyFlags_1 & 0x200000L) != 0) {

                // read (viewModel.apiMedicineList.getValue().size()) + (" Item in your cart")
                viewModelApiMedicineListSizeJavaLangStringItemInYourCart = (viewModelApiMedicineListSize) + (" Item in your cart");
        }
        if ((dirtyFlags_1 & 0x100000L) != 0) {

                // read (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart")
                viewModelApiMedicineListSizeJavaLangStringItemsInYourCart = (viewModelApiMedicineListSize) + (" Items in your cart");
        }

        if ((dirtyFlags & 0x40000000000000L) != 0) {

                // read viewModel.apiMedicineList.getValue().size() == 1 ? (viewModel.apiMedicineList.getValue().size()) + (" Item in your cart") : (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart")
                viewModelApiMedicineListSizeInt1ViewModelApiMedicineListSizeJavaLangStringItemInYourCartViewModelApiMedicineListSizeJavaLangStringItemsInYourCart = ((ViewModelApiMedicineListSizeInt11) ? (viewModelApiMedicineListSizeJavaLangStringItemInYourCart) : (viewModelApiMedicineListSizeJavaLangStringItemsInYourCart));
        }

        if ((dirtyFlags & 0xc20000L) != 0) {

                // read viewModel.apiMedicineList.getValue().size() > 1 ? (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart") : viewModel.apiMedicineList.getValue().size() == 1 ? (viewModel.apiMedicineList.getValue().size()) + (" Item in your cart") : (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart")
                viewModelApiMedicineListSizeInt1ViewModelApiMedicineListSizeJavaLangStringItemsInYourCartViewModelApiMedicineListSizeInt1ViewModelApiMedicineListSizeJavaLangStringItemInYourCartViewModelApiMedicineListSizeJavaLangStringItemsInYourCart = ((ViewModelApiMedicineListSizeInt12) ? (viewModelApiMedicineListSizeJavaLangStringItemsInYourCart) : (viewModelApiMedicineListSizeInt1ViewModelApiMedicineListSizeJavaLangStringItemInYourCartViewModelApiMedicineListSizeJavaLangStringItemsInYourCart));
        }
        // batch finished
        if ((dirtyFlags & 0x800000L) != 0) {
            // api target 1

            this.btnAddToCartBlueVariant.setOnClickListener(mCallback28);
            this.btnViewMore.setOnClickListener(mCallback26);
            this.clOtcCard.setOnClickListener(mCallback27);
            this.clViewMore.setOnClickListener(mCallback25);
            this.mboundView32.setOnClickListener(mCallback29);
            this.tvViewChanges.setOnClickListener(mCallback24);
        }
        if ((dirtyFlags & 0xc20000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.btnViewMore, viewModelIsExpandedViewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewLessJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItemsViewModelApiMedicineListJavaLangObjectNullViewModelApiMedicineListSizeInt1BooleanFalseJavaLangStringViewViewModelApiMedicineListSizeInt1JavaLangStringMoreItemsJavaLangString);
            this.clAddMedicine.setVisibility(viewModelApiMedicineListSizeInt0ViewVISIBLEViewGONE);
            this.clViewMore.setVisibility(viewModelApiMedicineListSizeInt1ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCartCount, viewModelApiMedicineListSizeInt1ViewModelApiMedicineListSizeJavaLangStringItemsInYourCartViewModelApiMedicineListSizeInt1ViewModelApiMedicineListSizeJavaLangStringItemInYourCartViewModelApiMedicineListSizeJavaLangStringItemsInYourCart);
        }
        if ((dirtyFlags & 0xc00040L) != 0) {
            // api target 1

            this.cardUpload.setVisibility(viewModelPrescriptionsSizeInt1ViewGONEViewVISIBLE);
            this.ivPrescriptionUploaded.setVisibility(viewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE);
            this.rvPrescription.setVisibility(viewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE);
            this.tvPrescriptionUploaded.setVisibility(viewModelPrescriptionsSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc02000L) != 0) {
            // api target 1

            this.clItemsNoLongerAvailable.setVisibility(viewModelItemsNotAvailableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc00010L) != 0) {
            // api target 1

            this.clOTCProducts.setVisibility(viewModelOtcMedicineListSizeInt0ViewGONEViewVISIBLE);
            com.intellihealth.truemeds.presentation.bindingadapter.OrderSummaryBindingAdapterKt.setOtcList(this.rvOtcProducts, viewModelOtcMedicineListGetValue, viewModel);
            this.tmDividerBottomClOtcProducts.setVisibility(viewModelOtcMedicineListSizeInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc00400L) != 0) {
            // api target 1

            this.clOrderIsBeingPlacedView.setVisibility(viewModelOrderIsBeingPlacedViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc00001L) != 0) {
            // api target 1

            this.clOrderPlacedView.setVisibility(viewModelOrderPlacedViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc00800L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.OrderSummaryBindingAdapterKt.setImageUrlOtc(this.ivIcon, viewModelOtcProductSelectedProductSkuName, viewModelOtcProductSelectedProductProductImageUrl, viewModelOtcProductSelectedProductDrugType, viewModel);
            com.intellihealth.salt.adapter.MainBindingAdapterKt.setDiscountText(this.mboundView22, viewModelOtcProductSelectedProductDiscount);
            com.intellihealth.truemeds.presentation.bindingadapter.OrderSummaryBindingAdapterKt.setStrikeThroughPrice(this.tvCrossMrp, viewModelOtcProductSelectedProductMrp);
            com.intellihealth.salt.adapter.MainBindingAdapterKt.setSplitAmount(this.tvSellingPrice, viewModelOtcProductSelectedProductSellingPrice, 0);
            com.intellihealth.salt.adapter.MainBindingAdapterKt.setSplitAmount(this.tvSellingPriceDecimal, viewModelOtcProductSelectedProductSellingPrice, 1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, viewModelOtcProductSelectedProductSkuName);
        }
        if ((dirtyFlags & 0xc00004L) != 0) {
            // api target 1

            this.mboundView39.setVisibility(viewModelLoaderValueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc10000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelFreeDeliveryMessageGetValue);
        }
        if ((dirtyFlags & 0xc40000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelItemsNotAvailableCountInt1StringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableWithCountStringFormatJavaLangStringViewModelItemsNotAvailableCountJavaLangStringMboundView6AndroidStringItemsAreNoLongerAvailableSingleCount);
        }
        if ((dirtyFlags & 0xc08000L) != 0) {
            // api target 1

            this.nestedScrollView.setVisibility(viewModelShowLoadingViewGONEViewVISIBLE);
            this.shimmerViewContainer.setVisibility(viewModelShowLoadingViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.SearchResultBindingAdapterKt.startStopAnimation(this.shimmerViewContainer, androidxDatabindingViewDataBindingSafeUnboxViewModelShowLoadingGetValue);
        }
        if ((dirtyFlags & 0xc00220L) != 0) {
            // api target 1

            this.prescriptionCardCtl.setVisibility(viewModelDrCallNeededViewModelPhCallNeededBooleanFalseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc00080L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.OrderSummaryCartBindingAdapterKt.updateSubHeading(this.productCardSection, viewModelDeliveryChargeMessageGetValue);
        }
        if ((dirtyFlags & 0xc01000L) != 0) {
            // api target 1

            this.rvCart.setVisibility(viewModelProductListSizeInt0ViewVISIBLEViewGONE);
            this.tvCartCount.setVisibility(viewModelProductListSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xd01000L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.OrderSummaryCartBindingAdapterKt.setOrderSummaryCartList(this.rvCart, viewModelProductListGetValue, viewModel, fragmentManager);
        }
        if ((dirtyFlags & 0xc80040L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setPrescriptionList(this.rvPrescription, viewModelPrescriptionsGetValue, callback, true, false);
        }
        if ((dirtyFlags & 0xc01040L) != 0) {
            // api target 1

            this.tmDivider1.setVisibility(viewModelProductListSizeInt0ViewModelPrescriptionsSizeInt0BooleanFalseViewVISIBLEViewGONE);
            this.tmDividerTopAddMedicines.setVisibility(viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalseViewINVISIBLEViewVISIBLE);
            this.tmDividerTopAddPrescription.setVisibility(viewModelPrescriptionsSizeInt0ViewModelProductListSizeInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc04000L) != 0) {
            // api target 1

            this.tmPaymentCarousel.setVisibility(viewModelPaymentCarouselListSizeInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc00008L) != 0) {
            // api target 1

            this.tmStickyPaymentPlaceOrder.setVisibility(viewModelSetMainDataViewViewVISIBLEViewGONE);
            this.tmStickyPaymentPlaceOrderMain.setVisibility(viewModelSetMainDataViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc00100L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.OrderSummaryBindingAdapterKt.setStickyContainerServiceable(this.tmStickyPaymentPlaceOrder, viewModelIsServiceableGetValue);
        }
        if ((dirtyFlags & 0xc00002L) != 0) {
            // api target 1

            this.tmStickyPaymentPlaceOrder.setUpPaymentContainer(viewModelStickyPaymentDataPlaceOrderGetValue);
        }
        if ((dirtyFlags & 0xc00401L) != 0) {
            // api target 1

            this.tmTopHeader.setVisibility(viewModelOrderIsBeingPlacedViewBooleanTrueViewModelOrderPlacedViewViewGONEViewVISIBLE);
        }
        executeBindingsOn(mboundView2);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel.otcProductSelected
                androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelOtcProductSelected = null;
                // viewModel.otcProductSelected != null
                boolean viewModelOtcProductSelectedJavaLangObjectNull = false;
                // viewModel.otcProductSelected.getValue()
                com.intellihealth.truemeds.presentation.model.ProductInfoModel viewModelOtcProductSelectedGetValue = null;
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelOtcProductSelected = viewModel.getOtcProductSelected();

                    viewModelOtcProductSelectedJavaLangObjectNull = (viewModelOtcProductSelected) != (null);
                    if (viewModelOtcProductSelectedJavaLangObjectNull) {


                        viewModelOtcProductSelectedGetValue = viewModelOtcProductSelected.getValue();

                        viewModel.openPdBottomSheet(viewModelOtcProductSelectedGetValue);
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel.otcProductSelected
                androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelOtcProductSelected = null;
                // viewModel.otcProductSelected != null
                boolean viewModelOtcProductSelectedJavaLangObjectNull = false;
                // viewModel.otcProductSelected.getValue()
                com.intellihealth.truemeds.presentation.model.ProductInfoModel viewModelOtcProductSelectedGetValue = null;
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModelOtcProductSelected = viewModel.getOtcProductSelected();

                    viewModelOtcProductSelectedJavaLangObjectNull = (viewModelOtcProductSelected) != (null);
                    if (viewModelOtcProductSelectedJavaLangObjectNull) {


                        viewModelOtcProductSelectedGetValue = viewModelOtcProductSelected.getValue();


                        viewModel.onAddCrossSellingPd(viewModelOtcProductSelectedGetValue, 1);
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.viewMoreClick();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.viewMoreClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.viewChangesClick();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.intellihealth.truemeds.presentation.viewmodel.CartViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.uploadPrescriptionClick();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.orderPlacedView
        flag 1 (0x2L): viewModel.stickyPaymentDataPlaceOrder
        flag 2 (0x3L): viewModel.loaderValue
        flag 3 (0x4L): viewModel.setMainDataView
        flag 4 (0x5L): viewModel.otcMedicineList
        flag 5 (0x6L): viewModel.drCallNeeded
        flag 6 (0x7L): viewModel.prescriptions
        flag 7 (0x8L): viewModel.deliveryChargeMessage
        flag 8 (0x9L): viewModel.isServiceable
        flag 9 (0xaL): viewModel.phCallNeeded
        flag 10 (0xbL): viewModel.orderIsBeingPlacedView
        flag 11 (0xcL): viewModel.otcProductSelected
        flag 12 (0xdL): viewModel.productList
        flag 13 (0xeL): viewModel.itemsNotAvailable
        flag 14 (0xfL): viewModel.paymentCarouselList
        flag 15 (0x10L): viewModel.showLoading
        flag 16 (0x11L): viewModel.freeDeliveryMessage
        flag 17 (0x12L): viewModel.apiMedicineList
        flag 18 (0x13L): viewModel.itemsNotAvailableCount
        flag 19 (0x14L): callback
        flag 20 (0x15L): fragmentManager
        flag 21 (0x16L): cardData
        flag 22 (0x17L): viewModel
        flag 23 (0x18L): null
        flag 24 (0x19L): viewModel.otcMedicineList.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): viewModel.otcMedicineList.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue()) ? View.GONE : View.VISIBLE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue()) ? View.GONE : View.VISIBLE
        flag 28 (0x1dL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drCallNeeded.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.phCallNeeded.getValue()) : false
        flag 29 (0x1eL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drCallNeeded.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.phCallNeeded.getValue()) : false
        flag 30 (0x1fL): viewModel.productList.getValue().size() > 0 ? viewModel.prescriptions.getValue().size() > 0 : false
        flag 31 (0x20L): viewModel.productList.getValue().size() > 0 ? viewModel.prescriptions.getValue().size() > 0 : false
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loaderValue.getValue()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): viewModel.apiMedicineList.getValue().size() == 0 ? View.VISIBLE : View.GONE
        flag 35 (0x24L): viewModel.apiMedicineList.getValue().size() == 0 ? View.VISIBLE : View.GONE
        flag 36 (0x25L): viewModel.prescriptions.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 37 (0x26L): viewModel.prescriptions.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 38 (0x27L): viewModel.productList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 39 (0x28L): viewModel.productList.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.setMainDataView.getValue()) ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.setMainDataView.getValue()) ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() > 0 : false
        flag 43 (0x2cL): viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() > 0 : false
        flag 44 (0x2dL): viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? "View less" : (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items")
        flag 45 (0x2eL): viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? "View less" : (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items")
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 48 (0x31L): viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() > 0 : false ? View.INVISIBLE : View.VISIBLE
        flag 49 (0x32L): viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() > 0 : false ? View.INVISIBLE : View.VISIBLE
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue())
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue())
        flag 52 (0x35L): viewModel.isExpanded ? viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? "View less" : (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items") : viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items") : ""
        flag 53 (0x36L): viewModel.isExpanded ? viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? "View less" : (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items") : viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items") : ""
        flag 54 (0x37L): viewModel.apiMedicineList.getValue().size() > 1 ? (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart") : viewModel.apiMedicineList.getValue().size() == 1 ? (viewModel.apiMedicineList.getValue().size()) + (" Item in your cart") : (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart")
        flag 55 (0x38L): viewModel.apiMedicineList.getValue().size() > 1 ? (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart") : viewModel.apiMedicineList.getValue().size() == 1 ? (viewModel.apiMedicineList.getValue().size()) + (" Item in your cart") : (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart")
        flag 56 (0x39L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 57 (0x3aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 58 (0x3bL): viewModel.apiMedicineList.getValue().size() > 1 ? View.VISIBLE : View.GONE
        flag 59 (0x3cL): viewModel.apiMedicineList.getValue().size() > 1 ? View.VISIBLE : View.GONE
        flag 60 (0x3dL): viewModel.prescriptions.getValue().size() > 1 ? View.GONE : View.VISIBLE
        flag 61 (0x3eL): viewModel.prescriptions.getValue().size() > 1 ? View.GONE : View.VISIBLE
        flag 62 (0x3fL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drCallNeeded.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.phCallNeeded.getValue()) : false ? View.GONE : View.VISIBLE
        flag 63 (0x40L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.drCallNeeded.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.phCallNeeded.getValue()) : false ? View.GONE : View.VISIBLE
        flag 64 (0x41L): viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items") : ""
        flag 65 (0x42L): viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false ? (("View ") + ((viewModel.apiMedicineList.getValue().size()) - (1))) + (" more items") : ""
        flag 66 (0x43L): viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
        flag 67 (0x44L): viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
        flag 68 (0x45L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue()) ? View.VISIBLE : View.GONE
        flag 69 (0x46L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderPlacedView.getValue()) ? View.VISIBLE : View.GONE
        flag 70 (0x47L): viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false
        flag 71 (0x48L): viewModel.apiMedicineList.getValue() != null ? viewModel.apiMedicineList.getValue().size() > 1 : false
        flag 72 (0x49L): viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() == 0 : false
        flag 73 (0x4aL): viewModel.prescriptions.getValue().size() > 0 ? viewModel.productList.getValue().size() == 0 : false
        flag 74 (0x4bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 75 (0x4cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showLoading.getValue()) ? View.GONE : View.VISIBLE
        flag 76 (0x4dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue()) > 1 ? String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count)) : String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count))
        flag 77 (0x4eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.itemsNotAvailableCount.getValue()) > 1 ? String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_with_count)) : String.format(((("") + (viewModel.itemsNotAvailableCount.getValue())) + (" ")) + (@android:string/items_are_no_longer_available_single_count))
        flag 78 (0x4fL): viewModel.paymentCarouselList.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 79 (0x50L): viewModel.paymentCarouselList.getValue().size() == 0 ? View.GONE : View.VISIBLE
        flag 80 (0x51L): viewModel.productList.getValue().size() > 0 ? viewModel.prescriptions.getValue().size() > 0 : false ? View.VISIBLE : View.GONE
        flag 81 (0x52L): viewModel.productList.getValue().size() > 0 ? viewModel.prescriptions.getValue().size() > 0 : false ? View.VISIBLE : View.GONE
        flag 82 (0x53L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? View.VISIBLE : View.GONE
        flag 83 (0x54L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.orderIsBeingPlacedView.getValue()) ? View.VISIBLE : View.GONE
        flag 84 (0x55L): viewModel.apiMedicineList.getValue().size() == 1 ? (viewModel.apiMedicineList.getValue().size()) + (" Item in your cart") : (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart")
        flag 85 (0x56L): viewModel.apiMedicineList.getValue().size() == 1 ? (viewModel.apiMedicineList.getValue().size()) + (" Item in your cart") : (viewModel.apiMedicineList.getValue().size()) + (" Items in your cart")
    flag mapping end*/
    //end
}