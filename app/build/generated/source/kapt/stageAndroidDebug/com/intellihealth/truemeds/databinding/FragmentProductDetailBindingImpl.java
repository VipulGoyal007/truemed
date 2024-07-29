package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailBindingImpl extends FragmentProductDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(54);
        sIncludes.setIncludes(35, 
            new String[] {"shimmer_medicine_details"},
            new int[] {36},
            new int[] {com.intellihealth.truemeds.R.layout.shimmer_medicine_details});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainLayout, 37);
        sViewsWithIds.put(R.id.pdpHeader, 38);
        sViewsWithIds.put(R.id.viewLinePdp, 39);
        sViewsWithIds.put(R.id.viewLine, 40);
        sViewsWithIds.put(R.id.scrollLayout, 41);
        sViewsWithIds.put(R.id.pdpBanner, 42);
        sViewsWithIds.put(R.id.pdpPgIndicator, 43);
        sViewsWithIds.put(R.id.pdpFirstFold, 44);
        sViewsWithIds.put(R.id.clStepper, 45);
        sViewsWithIds.put(R.id.ivBadge, 46);
        sViewsWithIds.put(R.id.clHeaderTitle, 47);
        sViewsWithIds.put(R.id.clTooltipLayout, 48);
        sViewsWithIds.put(R.id.llDescrip, 49);
        sViewsWithIds.put(R.id.imSubsUserBoughtWithPopup, 50);
        sViewsWithIds.put(R.id.tvSubsUserBoughtWithPopup, 51);
        sViewsWithIds.put(R.id.imgPolygonWithPopup, 52);
        sViewsWithIds.put(R.id.authorCardMainTitle, 53);
    }
    // views
    @Nullable
    private final com.intellihealth.truemeds.databinding.ShimmerMedicineDetailsBinding mboundView35;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 54, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 15
            , (com.intellihealth.salt.views.alert.Alert) bindings[20]
            , (com.intellihealth.salt.views.StickyNonStickyNotification) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[53]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[30]
            , (com.intellihealth.salt.views.TextView) bindings[19]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (com.intellihealth.salt.views.buttons.QuantityStepper) bindings[18]
            , (com.intellihealth.salt.views.TextView) bindings[22]
            , (com.intellihealth.salt.views.TextView) bindings[47]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[45]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[48]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[23]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.intellihealth.salt.views.section.ProductCardSection) bindings[32]
            , (com.intellihealth.salt.views.cards.Faq) bindings[28]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[50]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[52]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[46]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[49]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[37]
            , (com.intellihealth.salt.views.cards.Faq) bindings[33]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            , (androidx.viewpager.widget.ViewPager) bindings[42]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[44]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[38]
            , (com.intellihealth.salt.views.PageIndicator) bindings[43]
            , (com.intellihealth.salt.views.MobileSectionHeaders) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[31]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[41]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[35]
            , (com.intellihealth.salt.views.Carts) bindings[34]
            , (com.intellihealth.salt.views.cards.CompositionCard) bindings[25]
            , (com.intellihealth.salt.views.cards.Divider) bindings[27]
            , (com.intellihealth.salt.views.cards.Divider) bindings[29]
            , (com.intellihealth.salt.views.section.RecommendedSubstituteUpsell) bindings[24]
            , (com.intellihealth.salt.views.pdp.ViewComparison) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (com.intellihealth.salt.views.TextView) bindings[11]
            , (com.intellihealth.salt.views.TextView) bindings[5]
            , (com.intellihealth.salt.views.TextView) bindings[12]
            , (com.intellihealth.salt.views.TextView) bindings[13]
            , (com.intellihealth.salt.views.TextView) bindings[16]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[15]
            , (com.intellihealth.salt.views.TextView) bindings[14]
            , (com.intellihealth.salt.views.TextView) bindings[17]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[51]
            , (android.view.View) bindings[40]
            , (android.view.View) bindings[39]
            );
        this.alertMessage.setTag(null);
        this.applyCouponNotification.setTag(null);
        this.authorCardSection.setTag(null);
        this.availabilityStatus.setTag(null);
        this.bannerPlaceHolder.setTag(null);
        this.btnSubsStepper.setTag(null);
        this.clHeaderLabel.setTag(null);
        this.clSubsRecommended.setTag(null);
        this.clUserBoughtTooltip.setTag(null);
        this.coordinatorLayout.setTag(null);
        this.doubleStackProductCard.setTag(null);
        this.faqCategories.setTag(null);
        this.ivTitleAlreadyAdded.setTag(null);
        this.manufacturerDetailsCategories.setTag(null);
        this.mboundView35 = (com.intellihealth.truemeds.databinding.ShimmerMedicineDetailsBinding) bindings[36];
        setContainedBinding(this.mboundView35);
        this.medicineCompanyName.setTag(null);
        this.medicineName.setTag(null);
        this.nestedScrollView.setTag(null);
        this.pdpStickyHeader.setTag(null);
        this.rvAuthorCard.setTag(null);
        this.shimmerViewContainer.setTag(null);
        this.tmCarts.setTag(null);
        this.tmCompositionCard.setTag(null);
        this.tmDivider.setTag(null);
        this.tmDivider1.setTag(null);
        this.tmRecommendedSubstituteUpsell.setTag(null);
        this.tmViewComparison.setTag(null);
        this.toolbarLayout.setTag(null);
        this.tvAlreadyAdded.setTag(null);
        this.tvCheaperTag.setTag(null);
        this.tvMRPText.setTag(null);
        this.tvOrgMedMrp.setTag(null);
        this.tvOrgMedSellingPrice.setTag(null);
        this.tvOrgPricePerUnit.setTag(null);
        this.tvOrgRupeeSbl.setTag(null);
        this.tvPercentOff.setTag(null);
        this.tvPricePerUnit.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100000L;
                mDirtyFlags_1 = 0x0L;
        }
        mboundView35.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0 || mDirtyFlags_1 != 0) {
                return true;
            }
        }
        if (mboundView35.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.isSubsFound == variableId) {
            setIsSubsFound((java.lang.Boolean) variable);
        }
        else if (BR.list == variableId) {
            setList((java.util.List<com.intellihealth.salt.models.AuthorCardModel>) variable);
        }
        else if (BR.isBottomsheetBehaviour == variableId) {
            setIsBottomsheetBehaviour((java.lang.Boolean) variable);
        }
        else if (BR.isSubs == variableId) {
            setIsSubs((java.lang.Boolean) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsSubsFound(@Nullable java.lang.Boolean IsSubsFound) {
        this.mIsSubsFound = IsSubsFound;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.isSubsFound);
        super.requestRebind();
    }
    public void setList(@Nullable java.util.List<com.intellihealth.salt.models.AuthorCardModel> List) {
        this.mList = List;
    }
    public void setIsBottomsheetBehaviour(@Nullable java.lang.Boolean IsBottomsheetBehaviour) {
        this.mIsBottomsheetBehaviour = IsBottomsheetBehaviour;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.isBottomsheetBehaviour);
        super.requestRebind();
    }
    public void setIsSubs(@Nullable java.lang.Boolean IsSubs) {
        this.mIsSubs = IsSubs;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.isSubs);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView35.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetCompositionUILiveData((androidx.lifecycle.LiveData<com.intellihealth.salt.models.CompositionCardModel>) object, fieldId);
            case 1 :
                return onChangeViewModelGetDoubleStackSectionLiveData((androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductCardSectionModel>) object, fieldId);
            case 2 :
                return onChangeViewModelGetAuthorListLiveData((androidx.lifecycle.LiveData<java.util.ArrayList<com.intellihealth.salt.models.AuthorCardModel>>) object, fieldId);
            case 3 :
                return onChangeViewModelProductDetailLiveData((androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel>) object, fieldId);
            case 4 :
                return onChangeViewModelGetManufacturerDetailLiveData((androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel>) object, fieldId);
            case 5 :
                return onChangeViewModelIsFromOrderStatus((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelIsSubsViewComparisonLiveData((androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductComparisonModel>) object, fieldId);
            case 7 :
                return onChangeViewModelGetProductInfoLiveData((androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel>) object, fieldId);
            case 8 :
                return onChangeViewModelCartModel((androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel>) object, fieldId);
            case 9 :
                return onChangeViewModelShowProductPageLiveData((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeViewModelShowShimmer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelIsSubsViewComparisonLiveData1((androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductComparisonModel>) object, fieldId);
            case 12 :
                return onChangeViewModelCartItemCount((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 13 :
                return onChangeViewModelGetRecommendedLiveData((androidx.lifecycle.LiveData<com.intellihealth.salt.models.RecommendedSubUpsellModel>) object, fieldId);
            case 14 :
                return onChangeViewModelFtcCouponData((androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetCompositionUILiveData(androidx.lifecycle.LiveData<com.intellihealth.salt.models.CompositionCardModel> ViewModelGetCompositionUILiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetDoubleStackSectionLiveData(androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductCardSectionModel> ViewModelGetDoubleStackSectionLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetAuthorListLiveData(androidx.lifecycle.LiveData<java.util.ArrayList<com.intellihealth.salt.models.AuthorCardModel>> ViewModelGetAuthorListLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProductDetailLiveData(androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> ViewModelProductDetailLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetManufacturerDetailLiveData(androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel> ViewModelGetManufacturerDetailLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsFromOrderStatus(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsFromOrderStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsSubsViewComparisonLiveData(androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductComparisonModel> ViewModelIsSubsViewComparisonLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetProductInfoLiveData(androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel> ViewModelGetProductInfoLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartModel(androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> ViewModelCartModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowProductPageLiveData(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelShowProductPageLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowShimmer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsSubsViewComparisonLiveData1(androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductComparisonModel> ViewModelIsSubsViewComparisonLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCartItemCount(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelCartItemCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetRecommendedLiveData(androidx.lifecycle.LiveData<com.intellihealth.salt.models.RecommendedSubUpsellModel> ViewModelGetRecommendedLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFtcCouponData(androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> ViewModelFtcCouponData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
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
        boolean viewModelProductDetailLiveDataSuggestionJavaLangObjectNull = false;
        boolean viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNull = false;
        boolean isSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsSubsFound = false;
        boolean isBottomsheetBehaviourViewModelGetDoubleStackSectionLiveDataJavaLangObjectNullBooleanFalse = false;
        int viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00ViewGONEViewVISIBLE = 0;
        boolean viewModelShowProductPageLiveDataViewModelShowShimmerBooleanFalse = false;
        com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon viewModelFtcCouponDataGetValue = null;
        int viewModelGetCompositionUILiveDataJavaLangObjectNullViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.presentation.model.Product viewModelProductDetailLiveDataProduct = null;
        boolean viewModelCartItemCountInt0BooleanTrueIsBottomsheetBehaviour = false;
        boolean viewModelProductDetailLiveDataIsOrgAddedToCart = false;
        int isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalseViewGONEViewVISIBLE = 0;
        boolean isSubs = false;
        com.intellihealth.salt.models.CartModel viewModelCartModelGetValue = null;
        java.lang.Integer viewModelProductDetailLiveDataProductQty = null;
        com.intellihealth.salt.models.FaqModel viewModelGetManufacturerDetailLiveDataGetValue = null;
        boolean viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullBooleanTrueViewModelProductDetailLiveDataProductAvailabilityStatusIsEmpty = false;
        com.intellihealth.salt.callbacks.StepperCallback viewModelPdBottomSheetQuantityStepperCallback = null;
        int viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean viewModelCartItemCountInt0 = false;
        java.lang.Boolean isSubsFound = mIsSubsFound;
        int viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00ViewGONEIsSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalseViewGONEViewVISIBLE = 0;
        boolean viewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNull = false;
        java.lang.String viewModelProductDetailLiveDataProductOrgSubsSkuName = null;
        java.lang.String viewModelProductDetailLiveDataProductSubsSavingPercentage = null;
        java.util.ArrayList<com.intellihealth.salt.models.AuthorCardModel> viewModelGetAuthorListLiveDataGetValue = null;
        boolean viewModelProductDetailLiveDataProductAvailabilityMessageIsEmpty = false;
        java.lang.String viewModelProductDetailLiveDataProductAvailabilityMessage = null;
        boolean viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNullViewModelProductDetailLiveDataProductAvailabilityMessageIsEmptyBooleanFalse = false;
        java.lang.String viewModelProductDetailLiveDataProductAvailabilityStatus = null;
        boolean viewModelProductDetailLiveDataProductAvailabilityStatusIsEmpty = false;
        int viewModelFtcCouponDataJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String viewModelProductDetailLiveDataProductPackForm = null;
        int viewModelProductDetailLiveDataProductMaxCappedQty = 0;
        boolean viewModelShowShimmer = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsBottomsheetBehaviour = false;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.CompositionCardModel> viewModelGetCompositionUILiveData = null;
        java.lang.Integer viewModelCartItemCountGetValue = null;
        int isBottomsheetBehaviourIsSubsBooleanFalseViewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = 0;
        int isSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = 0;
        int isSubsViewVISIBLEViewGONE = 0;
        java.lang.String viewModelProductDetailLiveDataProductSkuName = null;
        com.intellihealth.salt.models.ProductComparisonModel viewModelIsSubsViewComparisonLiveDataGetValue = null;
        boolean isBottomsheetBehaviourIsSubsBooleanFalse = false;
        double viewModelProductDetailLiveDataProductMrp = 0.0;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductCardSectionModel> viewModelGetDoubleStackSectionLiveData = null;
        int isBottomsheetBehaviourViewModelGetDoubleStackSectionLiveDataJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.presentation.model.Product viewModelProductDetailLiveDataSuggestion = null;
        androidx.lifecycle.LiveData<java.util.ArrayList<com.intellihealth.salt.models.AuthorCardModel>> viewModelGetAuthorListLiveData = null;
        int viewModelGetManufacturerDetailLiveDataJavaLangObjectNullViewVISIBLEViewGONE = 0;
        int viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNullViewModelProductDetailLiveDataProductAvailabilityMessageIsEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull = false;
        int isSubsFoundViewVISIBLEViewGONE = 0;
        java.lang.Boolean isBottomsheetBehaviour = mIsBottomsheetBehaviour;
        int isBottomsheetBehaviourViewVISIBLEViewGONE = 0;
        boolean ViewModelProductDetailLiveDataProductAvailabilityMessageIsEmpty1 = false;
        boolean viewModelGetProductInfoLiveDataJavaLangObjectNull = false;
        int viewModelShowProductPageLiveDataViewModelShowShimmerBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<com.intellihealth.truemeds.presentation.model.ProductInfoModel> viewModelProductDetailLiveData = null;
        java.lang.Boolean viewModelShowShimmerGetValue = null;
        com.intellihealth.salt.models.CompositionCardModel viewModelGetCompositionUILiveDataGetValue = null;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel> viewModelGetManufacturerDetailLiveData = null;
        int viewModelShowShimmerViewVISIBLEViewGONE = 0;
        com.intellihealth.salt.models.RecommendedSubUpsellModel viewModelGetRecommendedLiveDataGetValue = null;
        boolean isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalse = false;
        boolean viewModelFtcCouponDataJavaLangObjectNull = false;
        int viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewModelProductDetailLiveDataIsOrgAddedToCartBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsFromOrderStatus = null;
        int viewModelGetProductInfoLiveDataJavaLangObjectNullViewVISIBLEViewGONE = 0;
        com.intellihealth.salt.models.ProductComparisonModel ViewModelIsSubsViewComparisonLiveDataGetValue1 = null;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductComparisonModel> viewModelIsSubsViewComparisonLiveData = null;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.FaqModel> viewModelGetProductInfoLiveData = null;
        int viewModelGetProductInfoLiveDataJavaLangObjectNullViewGONEViewVISIBLE = 0;
        com.intellihealth.truemeds.presentation.model.ProductInfoModel viewModelProductDetailLiveDataGetValue = null;
        float viewModelFtcCouponDataJavaLangObjectNullToolbarLayoutAndroidDimenD6ToolbarLayoutAndroidDimenD0 = 0f;
        int viewModelGetAuthorListLiveDataJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsFromOrderStatusGetValue = false;
        double viewModelProductDetailLiveDataProductSellingPrice = 0.0;
        boolean viewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNull = false;
        boolean viewModelGetCompositionUILiveDataJavaLangObjectNull = false;
        java.lang.Boolean IsSubs1 = mIsSubs;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.CartModel> viewModelCartModel = null;
        boolean viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewModelProductDetailLiveDataIsOrgAddedToCartBooleanFalse = false;
        int viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullBooleanTrueViewModelProductDetailLiveDataProductAvailabilityStatusIsEmptyIsSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalseViewVISIBLEViewGONEViewGONE = 0;
        boolean viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00 = false;
        com.intellihealth.salt.models.FaqModel viewModelGetProductInfoLiveDataGetValue = null;
        java.lang.Boolean viewModelIsFromOrderStatusGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelShowProductPageLiveData = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = false;
        boolean viewModelGetManufacturerDetailLiveDataJavaLangObjectNull = false;
        boolean ViewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull1 = false;
        int viewModelProductDetailLiveDataIsOrgAddedToCartViewGONEViewVISIBLE = 0;
        boolean viewModelGetDoubleStackSectionLiveDataJavaLangObjectNull = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowProductPageLiveDataGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowShimmer1 = null;
        com.intellihealth.salt.models.ProductCardSectionModel viewModelGetDoubleStackSectionLiveDataGetValue = null;
        boolean viewModelProductDetailLiveDataProductDiscountFloat00 = false;
        java.lang.Boolean viewModelShowProductPageLiveDataGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsSubs = false;
        int viewModelCartItemCountInt0BooleanTrueIsBottomsheetBehaviourViewGONEViewVISIBLE = 0;
        double viewModelProductDetailLiveDataProductDiscount = 0.0;
        java.lang.String viewModelProductDetailLiveDataProductPricePerUnitLabel = null;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.ProductComparisonModel> ViewModelIsSubsViewComparisonLiveData1 = null;
        java.lang.String viewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangStringCheaper = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelCartItemCount = null;
        com.intellihealth.salt.models.ProductInfoModel.Product viewModelIsSubsViewComparisonLiveDataSuggestion = null;
        boolean isBottomsheetBehaviourIsSubsBooleanFalseViewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNullBooleanFalse = false;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelCartItemCountGetValue = 0;
        boolean viewModelGetAuthorListLiveDataJavaLangObjectNull = false;
        androidx.lifecycle.LiveData<com.intellihealth.salt.models.RecommendedSubUpsellModel> viewModelGetRecommendedLiveData = null;
        java.lang.String viewModelProductDetailLiveDataProductManufacturerName = null;
        int isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.presentation.viewmodel.ProductDetailViewModel viewModel = mViewModel;
        java.lang.String viewModelProductDetailLiveDataProductProductImageUrl = null;
        boolean IsBottomsheetBehaviour1 = false;
        androidx.lifecycle.MutableLiveData<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon> viewModelFtcCouponData = null;

        if ((dirtyFlags & 0x108000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isSubsFound)
                androidxDatabindingViewDataBindingSafeUnboxIsSubsFound = androidx.databinding.ViewDataBinding.safeUnbox(isSubsFound);
            if((dirtyFlags & 0x108000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsSubsFound) {
                        dirtyFlags |= 0x1000000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isSubsFound) ? View.VISIBLE : View.GONE
                isSubsFoundViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsSubsFound) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1e080aL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour)
                androidxDatabindingViewDataBindingSafeUnboxIsBottomsheetBehaviour = androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour);

            if ((dirtyFlags & 0x1e0802L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour)
                    IsBottomsheetBehaviour1 = !androidxDatabindingViewDataBindingSafeUnboxIsBottomsheetBehaviour;
                if((dirtyFlags & 0x1a0002L) != 0) {
                    if(IsBottomsheetBehaviour1) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }
                if((dirtyFlags & 0x1e0800L) != 0) {
                    if(IsBottomsheetBehaviour1) {
                            dirtyFlags |= 0x10000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000000L;
                    }
                }
                if((dirtyFlags & 0x120000L) != 0) {
                    if(IsBottomsheetBehaviour1) {
                            dirtyFlags |= 0x4000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000000000L;
                    }
                }

                if ((dirtyFlags & 0x120000L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? View.VISIBLE : View.GONE
                        isBottomsheetBehaviourViewVISIBLEViewGONE = ((IsBottomsheetBehaviour1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
        }
        if ((dirtyFlags & 0x1e0008L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isSubs)
                androidxDatabindingViewDataBindingSafeUnboxIsSubs = androidx.databinding.ViewDataBinding.safeUnbox(IsSubs1);
            if((dirtyFlags & 0x140000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsSubs) {
                        dirtyFlags |= 0x4000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000000L;
                }
            }
            if((dirtyFlags & 0x80001c0008L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsSubs) {
                        dirtyFlags_1 |= 0x10L;
                }
                else {
                        dirtyFlags_1 |= 0x8L;
                }
            }

            if ((dirtyFlags & 0x140000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? View.VISIBLE : View.GONE
                    isSubsViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsSubs) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x1e77ffL) != 0) {


            if ((dirtyFlags & 0x180000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.pdBottomSheetQuantityStepperCallback
                        viewModelPdBottomSheetQuantityStepperCallback = viewModel.getPdBottomSheetQuantityStepperCallback();
                    }
            }
            if ((dirtyFlags & 0x180001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getCompositionUILiveData
                        viewModelGetCompositionUILiveData = viewModel.getGetCompositionUILiveData();
                    }
                    updateLiveDataRegistration(0, viewModelGetCompositionUILiveData);


                    if (viewModelGetCompositionUILiveData != null) {
                        // read viewModel.getCompositionUILiveData.getValue()
                        viewModelGetCompositionUILiveDataGetValue = viewModelGetCompositionUILiveData.getValue();
                    }


                    // read viewModel.getCompositionUILiveData.getValue() != null
                    viewModelGetCompositionUILiveDataJavaLangObjectNull = (viewModelGetCompositionUILiveDataGetValue) != (null);
                if((dirtyFlags & 0x180001L) != 0) {
                    if(viewModelGetCompositionUILiveDataJavaLangObjectNull) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }


                    // read viewModel.getCompositionUILiveData.getValue() != null ? View.VISIBLE : View.GONE
                    viewModelGetCompositionUILiveDataJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelGetCompositionUILiveDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x180002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getDoubleStackSectionLiveData
                        viewModelGetDoubleStackSectionLiveData = viewModel.getGetDoubleStackSectionLiveData();
                    }
                    updateLiveDataRegistration(1, viewModelGetDoubleStackSectionLiveData);


                    if (viewModelGetDoubleStackSectionLiveData != null) {
                        // read viewModel.getDoubleStackSectionLiveData.getValue()
                        viewModelGetDoubleStackSectionLiveDataGetValue = viewModelGetDoubleStackSectionLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x180004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getAuthorListLiveData
                        viewModelGetAuthorListLiveData = viewModel.getGetAuthorListLiveData();
                    }
                    updateLiveDataRegistration(2, viewModelGetAuthorListLiveData);


                    if (viewModelGetAuthorListLiveData != null) {
                        // read viewModel.getAuthorListLiveData.getValue()
                        viewModelGetAuthorListLiveDataGetValue = viewModelGetAuthorListLiveData.getValue();
                    }


                    // read viewModel.getAuthorListLiveData.getValue() != null
                    viewModelGetAuthorListLiveDataJavaLangObjectNull = (viewModelGetAuthorListLiveDataGetValue) != (null);
                if((dirtyFlags & 0x180004L) != 0) {
                    if(viewModelGetAuthorListLiveDataJavaLangObjectNull) {
                            dirtyFlags_1 |= 0x4000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000L;
                    }
                }


                    // read viewModel.getAuthorListLiveData.getValue() != null ? View.VISIBLE : View.GONE
                    viewModelGetAuthorListLiveDataJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelGetAuthorListLiveDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1e0028L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.productDetailLiveData
                        viewModelProductDetailLiveData = viewModel.getProductDetailLiveData();
                    }
                    updateLiveDataRegistration(3, viewModelProductDetailLiveData);


                    if (viewModelProductDetailLiveData != null) {
                        // read viewModel.productDetailLiveData.getValue()
                        viewModelProductDetailLiveDataGetValue = viewModelProductDetailLiveData.getValue();
                    }

                if ((dirtyFlags & 0x1c0008L) != 0) {

                        if (viewModelProductDetailLiveDataGetValue != null) {
                            // read viewModel.productDetailLiveData.getValue().product
                            viewModelProductDetailLiveDataProduct = viewModelProductDetailLiveDataGetValue.getProduct();
                            // read viewModel.productDetailLiveData.getValue().isOrgAddedToCart
                            viewModelProductDetailLiveDataIsOrgAddedToCart = viewModelProductDetailLiveDataGetValue.isOrgAddedToCart();
                        }
                    if((dirtyFlags & 0x1c0008L) != 0) {
                        if(viewModelProductDetailLiveDataIsOrgAddedToCart) {
                                dirtyFlags_1 |= 0x100000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x80000L;
                        }
                    }
                    if((dirtyFlags & 0x180008L) != 0) {
                        if(viewModelProductDetailLiveDataIsOrgAddedToCart) {
                                dirtyFlags_1 |= 0x400000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x200000L;
                        }
                    }

                    if ((dirtyFlags & 0x180008L) != 0) {

                            if (viewModelProductDetailLiveDataProduct != null) {
                                // read viewModel.productDetailLiveData.getValue().product.qty
                                viewModelProductDetailLiveDataProductQty = viewModelProductDetailLiveDataProduct.getQty();
                                // read viewModel.productDetailLiveData.getValue().product.orgSubsSkuName
                                viewModelProductDetailLiveDataProductOrgSubsSkuName = viewModelProductDetailLiveDataProduct.getOrgSubsSkuName();
                                // read viewModel.productDetailLiveData.getValue().product.subsSavingPercentage
                                viewModelProductDetailLiveDataProductSubsSavingPercentage = viewModelProductDetailLiveDataProduct.getSubsSavingPercentage();
                                // read viewModel.productDetailLiveData.getValue().product.availabilityMessage
                                viewModelProductDetailLiveDataProductAvailabilityMessage = viewModelProductDetailLiveDataProduct.getAvailabilityMessage();
                                // read viewModel.productDetailLiveData.getValue().product.packForm
                                viewModelProductDetailLiveDataProductPackForm = viewModelProductDetailLiveDataProduct.getPackForm();
                                // read viewModel.productDetailLiveData.getValue().product.maxCappedQty
                                viewModelProductDetailLiveDataProductMaxCappedQty = viewModelProductDetailLiveDataProduct.getMaxCappedQty();
                                // read viewModel.productDetailLiveData.getValue().product.skuName
                                viewModelProductDetailLiveDataProductSkuName = viewModelProductDetailLiveDataProduct.getSkuName();
                                // read viewModel.productDetailLiveData.getValue().product.mrp
                                viewModelProductDetailLiveDataProductMrp = viewModelProductDetailLiveDataProduct.getMrp();
                                // read viewModel.productDetailLiveData.getValue().product.sellingPrice
                                viewModelProductDetailLiveDataProductSellingPrice = viewModelProductDetailLiveDataProduct.getSellingPrice();
                                // read viewModel.productDetailLiveData.getValue().product.discount
                                viewModelProductDetailLiveDataProductDiscount = viewModelProductDetailLiveDataProduct.getDiscount();
                                // read viewModel.productDetailLiveData.getValue().product.pricePerUnitLabel
                                viewModelProductDetailLiveDataProductPricePerUnitLabel = viewModelProductDetailLiveDataProduct.getPricePerUnitLabel();
                                // read viewModel.productDetailLiveData.getValue().product.manufacturerName
                                viewModelProductDetailLiveDataProductManufacturerName = viewModelProductDetailLiveDataProduct.getManufacturerName();
                                // read viewModel.productDetailLiveData.getValue().product.productImageUrl
                                viewModelProductDetailLiveDataProductProductImageUrl = viewModelProductDetailLiveDataProduct.getProductImageUrl();
                            }
                            // read viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? View.GONE : View.VISIBLE
                            viewModelProductDetailLiveDataIsOrgAddedToCartViewGONEViewVISIBLE = ((viewModelProductDetailLiveDataIsOrgAddedToCart) ? (android.view.View.GONE) : (android.view.View.VISIBLE));


                            // read (viewModel.productDetailLiveData.getValue().product.subsSavingPercentage) + (" cheaper")
                            viewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangStringCheaper = (viewModelProductDetailLiveDataProductSubsSavingPercentage) + (" cheaper");
                            // read viewModel.productDetailLiveData.getValue().product.availabilityMessage != null
                            viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNull = (viewModelProductDetailLiveDataProductAvailabilityMessage) != (null);
                        if((dirtyFlags & 0x180008L) != 0) {
                            if(viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNull) {
                                    dirtyFlags |= 0x40000000000L;
                            }
                            else {
                                    dirtyFlags |= 0x20000000000L;
                            }
                        }
                    }

                        if (viewModelProductDetailLiveDataProduct != null) {
                            // read viewModel.productDetailLiveData.getValue().product.availabilityStatus
                            viewModelProductDetailLiveDataProductAvailabilityStatus = viewModelProductDetailLiveDataProduct.getAvailabilityStatus();
                        }

                    if ((dirtyFlags & 0x180008L) != 0) {

                            // read viewModel.productDetailLiveData.getValue().product.availabilityStatus != null
                            viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull = (viewModelProductDetailLiveDataProductAvailabilityStatus) != (null);
                        if((dirtyFlags & 0x180008L) != 0) {
                            if(viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull) {
                                    dirtyFlags |= 0x4000000000L;
                            }
                            else {
                                    dirtyFlags |= 0x2000000000L;
                            }
                        }


                            // read viewModel.productDetailLiveData.getValue().product.availabilityStatus != null ? View.VISIBLE : View.GONE
                            viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    }

                        // read viewModel.productDetailLiveData.getValue().product.availabilityStatus == null
                        ViewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull1 = (viewModelProductDetailLiveDataProductAvailabilityStatus) == (null);
                    if((dirtyFlags & 0x1c0008L) != 0) {
                        if(ViewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull1) {
                                dirtyFlags |= 0x1000000000L;
                        }
                        else {
                                dirtyFlags |= 0x800000000L;
                        }
                    }
                    if((dirtyFlags & 0x180008L) != 0) {
                        if(ViewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull1) {
                                dirtyFlags_1 |= 0x10000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x8000L;
                        }
                    }
                }
                if ((dirtyFlags & 0x1e0008L) != 0) {
                }
            }
            if ((dirtyFlags & 0x180010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getManufacturerDetailLiveData
                        viewModelGetManufacturerDetailLiveData = viewModel.getGetManufacturerDetailLiveData();
                    }
                    updateLiveDataRegistration(4, viewModelGetManufacturerDetailLiveData);


                    if (viewModelGetManufacturerDetailLiveData != null) {
                        // read viewModel.getManufacturerDetailLiveData.getValue()
                        viewModelGetManufacturerDetailLiveDataGetValue = viewModelGetManufacturerDetailLiveData.getValue();
                    }


                    // read viewModel.getManufacturerDetailLiveData.getValue() != null
                    viewModelGetManufacturerDetailLiveDataJavaLangObjectNull = (viewModelGetManufacturerDetailLiveDataGetValue) != (null);
                if((dirtyFlags & 0x180010L) != 0) {
                    if(viewModelGetManufacturerDetailLiveDataJavaLangObjectNull) {
                            dirtyFlags |= 0x100000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000000L;
                    }
                }


                    // read viewModel.getManufacturerDetailLiveData.getValue() != null ? View.VISIBLE : View.GONE
                    viewModelGetManufacturerDetailLiveDataJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelGetManufacturerDetailLiveDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x180028L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isFromOrderStatus()
                        viewModelIsFromOrderStatus = viewModel.isFromOrderStatus();
                    }
                    updateLiveDataRegistration(5, viewModelIsFromOrderStatus);


                    if (viewModelIsFromOrderStatus != null) {
                        // read viewModel.isFromOrderStatus().getValue()
                        viewModelIsFromOrderStatusGetValue = viewModelIsFromOrderStatus.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isFromOrderStatus().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsFromOrderStatusGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsFromOrderStatusGetValue);
            }
            if ((dirtyFlags & 0x180040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSubsViewComparisonLiveData
                        viewModelIsSubsViewComparisonLiveData = viewModel.isSubsViewComparisonLiveData();
                    }
                    updateLiveDataRegistration(6, viewModelIsSubsViewComparisonLiveData);


                    if (viewModelIsSubsViewComparisonLiveData != null) {
                        // read viewModel.isSubsViewComparisonLiveData.getValue()
                        ViewModelIsSubsViewComparisonLiveDataGetValue1 = viewModelIsSubsViewComparisonLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x180080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getProductInfoLiveData
                        viewModelGetProductInfoLiveData = viewModel.getGetProductInfoLiveData();
                    }
                    updateLiveDataRegistration(7, viewModelGetProductInfoLiveData);


                    if (viewModelGetProductInfoLiveData != null) {
                        // read viewModel.getProductInfoLiveData.getValue()
                        viewModelGetProductInfoLiveDataGetValue = viewModelGetProductInfoLiveData.getValue();
                    }


                    // read viewModel.getProductInfoLiveData.getValue() != null
                    viewModelGetProductInfoLiveDataJavaLangObjectNull = (viewModelGetProductInfoLiveDataGetValue) != (null);
                if((dirtyFlags & 0x180080L) != 0) {
                    if(viewModelGetProductInfoLiveDataJavaLangObjectNull) {
                            dirtyFlags_1 |= 0x100L;
                            dirtyFlags_1 |= 0x400L;
                    }
                    else {
                            dirtyFlags_1 |= 0x80L;
                            dirtyFlags_1 |= 0x200L;
                    }
                }


                    // read viewModel.getProductInfoLiveData.getValue() != null ? View.VISIBLE : View.GONE
                    viewModelGetProductInfoLiveDataJavaLangObjectNullViewVISIBLEViewGONE = ((viewModelGetProductInfoLiveDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.getProductInfoLiveData.getValue() != null ? View.GONE : View.VISIBLE
                    viewModelGetProductInfoLiveDataJavaLangObjectNullViewGONEViewVISIBLE = ((viewModelGetProductInfoLiveDataJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x180100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartModel
                        viewModelCartModel = viewModel.getCartModel();
                    }
                    updateLiveDataRegistration(8, viewModelCartModel);


                    if (viewModelCartModel != null) {
                        // read viewModel.cartModel.getValue()
                        viewModelCartModelGetValue = viewModelCartModel.getValue();
                    }
            }
            if ((dirtyFlags & 0x180600L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showProductPageLiveData
                        viewModelShowProductPageLiveData = viewModel.getShowProductPageLiveData();
                    }
                    updateLiveDataRegistration(9, viewModelShowProductPageLiveData);


                    if (viewModelShowProductPageLiveData != null) {
                        // read viewModel.showProductPageLiveData.getValue()
                        viewModelShowProductPageLiveDataGetValue = viewModelShowProductPageLiveData.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductPageLiveData.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowProductPageLiveDataGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowProductPageLiveDataGetValue);
                if((dirtyFlags & 0x180600L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowProductPageLiveDataGetValue) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x180400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmer
                        ViewModelShowShimmer1 = viewModel.getShowShimmer();
                    }
                    updateLiveDataRegistration(10, ViewModelShowShimmer1);


                    if (ViewModelShowShimmer1 != null) {
                        // read viewModel.showShimmer.getValue()
                        viewModelShowShimmerGetValue = ViewModelShowShimmer1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerGetValue);
                if((dirtyFlags & 0x180400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) {
                            dirtyFlags_1 |= 0x4L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowShimmerViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1a1000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cartItemCount
                        viewModelCartItemCount = viewModel.getCartItemCount();
                    }
                    updateLiveDataRegistration(12, viewModelCartItemCount);


                    if (viewModelCartItemCount != null) {
                        // read viewModel.cartItemCount.getValue()
                        viewModelCartItemCountGetValue = viewModelCartItemCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCartItemCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCartItemCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0
                    viewModelCartItemCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelCartItemCountGetValue) == (0);
                if((dirtyFlags & 0x1a1000L) != 0) {
                    if(viewModelCartItemCountInt0) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x182000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getRecommendedLiveData
                        viewModelGetRecommendedLiveData = viewModel.getGetRecommendedLiveData();
                    }
                    updateLiveDataRegistration(13, viewModelGetRecommendedLiveData);


                    if (viewModelGetRecommendedLiveData != null) {
                        // read viewModel.getRecommendedLiveData.getValue()
                        viewModelGetRecommendedLiveDataGetValue = viewModelGetRecommendedLiveData.getValue();
                    }
            }
            if ((dirtyFlags & 0x184000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ftcCouponData
                        viewModelFtcCouponData = viewModel.getFtcCouponData();
                    }
                    updateLiveDataRegistration(14, viewModelFtcCouponData);


                    if (viewModelFtcCouponData != null) {
                        // read viewModel.ftcCouponData.getValue()
                        viewModelFtcCouponDataGetValue = viewModelFtcCouponData.getValue();
                    }


                    // read viewModel.ftcCouponData.getValue() == null
                    viewModelFtcCouponDataJavaLangObjectNull = (viewModelFtcCouponDataGetValue) == (null);
                if((dirtyFlags & 0x184000L) != 0) {
                    if(viewModelFtcCouponDataJavaLangObjectNull) {
                            dirtyFlags |= 0x100000000000L;
                            dirtyFlags_1 |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000L;
                            dirtyFlags_1 |= 0x800L;
                    }
                }


                    // read viewModel.ftcCouponData.getValue() == null ? View.GONE : View.VISIBLE
                    viewModelFtcCouponDataJavaLangObjectNullViewGONEViewVISIBLE = ((viewModelFtcCouponDataJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read viewModel.ftcCouponData.getValue() == null ? @android:dimen/d6 : @android:dimen/d0
                    viewModelFtcCouponDataJavaLangObjectNullToolbarLayoutAndroidDimenD6ToolbarLayoutAndroidDimenD0 = ((viewModelFtcCouponDataJavaLangObjectNull) ? (toolbarLayout.getResources().getDimension(com.intellihealth.salt.R.dimen.d6)) : (toolbarLayout.getResources().getDimension(com.intellihealth.salt.R.dimen.d0)));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40000000000L) != 0) {

                if (viewModelProductDetailLiveDataProductAvailabilityMessage != null) {
                    // read viewModel.productDetailLiveData.getValue().product.availabilityMessage.isEmpty()
                    viewModelProductDetailLiveDataProductAvailabilityMessageIsEmpty = viewModelProductDetailLiveDataProductAvailabilityMessage.isEmpty();
                }


                // read !viewModel.productDetailLiveData.getValue().product.availabilityMessage.isEmpty()
                ViewModelProductDetailLiveDataProductAvailabilityMessageIsEmpty1 = !viewModelProductDetailLiveDataProductAvailabilityMessageIsEmpty;
        }
        if ((dirtyFlags & 0x800000000L) != 0) {

                if (viewModelProductDetailLiveDataProductAvailabilityStatus != null) {
                    // read viewModel.productDetailLiveData.getValue().product.availabilityStatus.isEmpty()
                    viewModelProductDetailLiveDataProductAvailabilityStatusIsEmpty = viewModelProductDetailLiveDataProductAvailabilityStatus.isEmpty();
                }
        }
        if ((dirtyFlags & 0x80000000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour)
                androidxDatabindingViewDataBindingSafeUnboxIsBottomsheetBehaviour = androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour);
        }
        if ((dirtyFlags & 0x10000000000000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isSubs)
                androidxDatabindingViewDataBindingSafeUnboxIsSubs = androidx.databinding.ViewDataBinding.safeUnbox(IsSubs1);
            if((dirtyFlags & 0x140000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsSubs) {
                        dirtyFlags |= 0x4000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000000L;
                }
            }
            if((dirtyFlags & 0x80001c0008L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsSubs) {
                        dirtyFlags_1 |= 0x10L;
                }
                else {
                        dirtyFlags_1 |= 0x8L;
                }
            }
        }
        if ((dirtyFlags & 0x180008L) != 0) {

                // read viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? viewModel.productDetailLiveData.getValue().isOrgAddedToCart : false
                viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewModelProductDetailLiveDataIsOrgAddedToCartBooleanFalse = ((ViewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull1) ? (viewModelProductDetailLiveDataIsOrgAddedToCart) : (false));
            if((dirtyFlags & 0x180008L) != 0) {
                if(viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewModelProductDetailLiveDataIsOrgAddedToCartBooleanFalse) {
                        dirtyFlags_1 |= 0x40L;
                }
                else {
                        dirtyFlags_1 |= 0x20L;
                }
            }


                // read viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? viewModel.productDetailLiveData.getValue().isOrgAddedToCart : false ? View.VISIBLE : View.GONE
                viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewModelProductDetailLiveDataIsOrgAddedToCartBooleanFalseViewVISIBLEViewGONE = ((viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewModelProductDetailLiveDataIsOrgAddedToCartBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x11000000L) != 0 || (dirtyFlags_1 & 0x80000L) != 0) {


            if ((dirtyFlags & 0x1000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getDoubleStackSectionLiveData
                        viewModelGetDoubleStackSectionLiveData = viewModel.getGetDoubleStackSectionLiveData();
                    }
                    updateLiveDataRegistration(1, viewModelGetDoubleStackSectionLiveData);


                    if (viewModelGetDoubleStackSectionLiveData != null) {
                        // read viewModel.getDoubleStackSectionLiveData.getValue()
                        viewModelGetDoubleStackSectionLiveDataGetValue = viewModelGetDoubleStackSectionLiveData.getValue();
                    }


                    // read viewModel.getDoubleStackSectionLiveData.getValue() != null
                    viewModelGetDoubleStackSectionLiveDataJavaLangObjectNull = (viewModelGetDoubleStackSectionLiveDataGetValue) != (null);
            }
            if ((dirtyFlags_1 & 0x80000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.productDetailLiveData
                        viewModelProductDetailLiveData = viewModel.getProductDetailLiveData();
                    }
                    updateLiveDataRegistration(3, viewModelProductDetailLiveData);


                    if (viewModelProductDetailLiveData != null) {
                        // read viewModel.productDetailLiveData.getValue()
                        viewModelProductDetailLiveDataGetValue = viewModelProductDetailLiveData.getValue();
                    }


                    if (viewModelProductDetailLiveDataGetValue != null) {
                        // read viewModel.productDetailLiveData.getValue().product
                        viewModelProductDetailLiveDataProduct = viewModelProductDetailLiveDataGetValue.getProduct();
                    }


                    if (viewModelProductDetailLiveDataProduct != null) {
                        // read viewModel.productDetailLiveData.getValue().product.discount
                        viewModelProductDetailLiveDataProductDiscount = viewModelProductDetailLiveDataProduct.getDiscount();
                    }


                    // read viewModel.productDetailLiveData.getValue().product.discount == 0.0
                    viewModelProductDetailLiveDataProductDiscountFloat00 = (viewModelProductDetailLiveDataProductDiscount) == (0.0);
            }
            if ((dirtyFlags & 0x10000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showShimmer
                        ViewModelShowShimmer1 = viewModel.getShowShimmer();
                    }
                    updateLiveDataRegistration(10, ViewModelShowShimmer1);


                    if (ViewModelShowShimmer1 != null) {
                        // read viewModel.showShimmer.getValue()
                        viewModelShowShimmerGetValue = ViewModelShowShimmer1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowShimmerGetValue);
                if((dirtyFlags & 0x180400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue) {
                            dirtyFlags_1 |= 0x4L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue())
                    viewModelShowShimmer = !androidxDatabindingViewDataBindingSafeUnboxViewModelShowShimmerGetValue;
            }
        }

        if ((dirtyFlags & 0x1a0002L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? viewModel.getDoubleStackSectionLiveData.getValue() != null : false
                isBottomsheetBehaviourViewModelGetDoubleStackSectionLiveDataJavaLangObjectNullBooleanFalse = ((IsBottomsheetBehaviour1) ? (viewModelGetDoubleStackSectionLiveDataJavaLangObjectNull) : (false));
            if((dirtyFlags & 0x1a0002L) != 0) {
                if(isBottomsheetBehaviourViewModelGetDoubleStackSectionLiveDataJavaLangObjectNullBooleanFalse) {
                        dirtyFlags |= 0x40000000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? viewModel.getDoubleStackSectionLiveData.getValue() != null : false ? View.VISIBLE : View.GONE
                isBottomsheetBehaviourViewModelGetDoubleStackSectionLiveDataJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = ((isBottomsheetBehaviourViewModelGetDoubleStackSectionLiveDataJavaLangObjectNullBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x180600L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductPageLiveData.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) : false
                viewModelShowProductPageLiveDataViewModelShowShimmerBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowProductPageLiveDataGetValue) ? (viewModelShowShimmer) : (false));
            if((dirtyFlags & 0x180600L) != 0) {
                if(viewModelShowProductPageLiveDataViewModelShowShimmerBooleanFalse) {
                        dirtyFlags_1 |= 0x1L;
                }
                else {
                        dirtyFlags |= 0x8000000000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductPageLiveData.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelShowProductPageLiveDataViewModelShowShimmerBooleanFalseViewVISIBLEViewGONE = ((viewModelShowProductPageLiveDataViewModelShowShimmerBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1a1000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour)
                viewModelCartItemCountInt0BooleanTrueIsBottomsheetBehaviour = ((viewModelCartItemCountInt0) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxIsBottomsheetBehaviour));
            if((dirtyFlags & 0x1a1000L) != 0) {
                if(viewModelCartItemCountInt0BooleanTrueIsBottomsheetBehaviour) {
                        dirtyFlags_1 |= 0x1000000L;
                }
                else {
                        dirtyFlags_1 |= 0x800000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? View.GONE : View.VISIBLE
                viewModelCartItemCountInt0BooleanTrueIsBottomsheetBehaviourViewGONEViewVISIBLE = ((viewModelCartItemCountInt0BooleanTrueIsBottomsheetBehaviour) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x1c0008L) != 0) {

                // read viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? true : viewModel.productDetailLiveData.getValue().product.availabilityStatus.isEmpty()
                viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullBooleanTrueViewModelProductDetailLiveDataProductAvailabilityStatusIsEmpty = ((ViewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNull1) ? (true) : (viewModelProductDetailLiveDataProductAvailabilityStatusIsEmpty));
                // read viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? true : viewModel.productDetailLiveData.getValue().product.discount == 0.0
                viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00 = ((viewModelProductDetailLiveDataIsOrgAddedToCart) ? (true) : (viewModelProductDetailLiveDataProductDiscountFloat00));
            if((dirtyFlags & 0x1c0008L) != 0) {
                if(viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullBooleanTrueViewModelProductDetailLiveDataProductAvailabilityStatusIsEmpty) {
                        dirtyFlags_1 |= 0x40000L;
                }
                else {
                        dirtyFlags_1 |= 0x20000L;
                }
            }
            if((dirtyFlags & 0x180008L) != 0) {
                if(viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }
            if((dirtyFlags & 0x1c0008L) != 0) {
                if(viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00) {
                        dirtyFlags |= 0x10000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000L;
                }
            }

            if ((dirtyFlags & 0x180008L) != 0) {

                    // read viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? true : viewModel.productDetailLiveData.getValue().product.discount == 0.0 ? View.GONE : View.VISIBLE
                    viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00ViewGONEViewVISIBLE = ((viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0x180008L) != 0) {

                // read viewModel.productDetailLiveData.getValue().product.availabilityMessage != null ? !viewModel.productDetailLiveData.getValue().product.availabilityMessage.isEmpty() : false
                viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNullViewModelProductDetailLiveDataProductAvailabilityMessageIsEmptyBooleanFalse = ((viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNull) ? (ViewModelProductDetailLiveDataProductAvailabilityMessageIsEmpty1) : (false));
            if((dirtyFlags & 0x180008L) != 0) {
                if(viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNullViewModelProductDetailLiveDataProductAvailabilityMessageIsEmptyBooleanFalse) {
                        dirtyFlags |= 0x400000000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000000L;
                }
            }


                // read viewModel.productDetailLiveData.getValue().product.availabilityMessage != null ? !viewModel.productDetailLiveData.getValue().product.availabilityMessage.isEmpty() : false ? View.VISIBLE : View.GONE
                viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNullViewModelProductDetailLiveDataProductAvailabilityMessageIsEmptyBooleanFalseViewVISIBLEViewGONE = ((viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNullViewModelProductDetailLiveDataProductAvailabilityMessageIsEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1e0800L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? androidx.databinding.ViewDataBinding.safeUnbox(isSubs) : false
                isBottomsheetBehaviourIsSubsBooleanFalse = ((IsBottomsheetBehaviour1) ? (androidxDatabindingViewDataBindingSafeUnboxIsSubs) : (false));
            if((dirtyFlags & 0x1e0800L) != 0) {
                if(isBottomsheetBehaviourIsSubsBooleanFalse) {
                        dirtyFlags_1 |= 0x4000000L;
                }
                else {
                        dirtyFlags_1 |= 0x2000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags_1 & 0x40000L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(isSubs)
                isSubs = !androidxDatabindingViewDataBindingSafeUnboxIsSubs;
            if((dirtyFlags_1 & 0x40000L) != 0) {
                if(isSubs) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }
        }
        if ((dirtyFlags_1 & 0x4000010L) != 0) {


            if ((dirtyFlags_1 & 0x10L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.productDetailLiveData
                        viewModelProductDetailLiveData = viewModel.getProductDetailLiveData();
                    }
                    updateLiveDataRegistration(3, viewModelProductDetailLiveData);


                    if (viewModelProductDetailLiveData != null) {
                        // read viewModel.productDetailLiveData.getValue()
                        viewModelProductDetailLiveDataGetValue = viewModelProductDetailLiveData.getValue();
                    }


                    if (viewModelProductDetailLiveDataGetValue != null) {
                        // read viewModel.productDetailLiveData.getValue().product
                        viewModelProductDetailLiveDataProduct = viewModelProductDetailLiveDataGetValue.getProduct();
                    }


                    if (viewModelProductDetailLiveDataProduct != null) {
                        // read viewModel.productDetailLiveData.getValue().product.subsSavingPercentage
                        viewModelProductDetailLiveDataProductSubsSavingPercentage = viewModelProductDetailLiveDataProduct.getSubsSavingPercentage();
                    }


                    // read viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null
                    viewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNull = (viewModelProductDetailLiveDataProductSubsSavingPercentage) != (null);
            }
            if ((dirtyFlags_1 & 0x4000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSubsViewComparisonLiveData()
                        ViewModelIsSubsViewComparisonLiveData1 = viewModel.isSubsViewComparisonLiveData();
                    }
                    updateLiveDataRegistration(11, ViewModelIsSubsViewComparisonLiveData1);


                    if (ViewModelIsSubsViewComparisonLiveData1 != null) {
                        // read viewModel.isSubsViewComparisonLiveData().getValue()
                        viewModelIsSubsViewComparisonLiveDataGetValue = ViewModelIsSubsViewComparisonLiveData1.getValue();
                    }


                    if (viewModelIsSubsViewComparisonLiveDataGetValue != null) {
                        // read viewModel.isSubsViewComparisonLiveData().getValue().suggestion
                        viewModelIsSubsViewComparisonLiveDataSuggestion = viewModelIsSubsViewComparisonLiveDataGetValue.getSuggestion();
                    }


                    // read viewModel.isSubsViewComparisonLiveData().getValue().suggestion != null
                    viewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNull = (viewModelIsSubsViewComparisonLiveDataSuggestion) != (null);
            }
        }

        if ((dirtyFlags & 0x80001c0008L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false
                isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxIsSubs) ? (viewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNull) : (false));
            if((dirtyFlags & 0x8000000000L) != 0) {
                if(isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalse) {
                        dirtyFlags |= 0x400000000L;
                }
                else {
                        dirtyFlags |= 0x200000000L;
                }
            }
            if((dirtyFlags & 0x1c0008L) != 0) {
                if(isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalse) {
                        dirtyFlags_1 |= 0x10000000L;
                }
                else {
                        dirtyFlags_1 |= 0x8000000L;
                }
            }

            if ((dirtyFlags & 0x8000000000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false ? View.GONE : View.VISIBLE
                    isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalseViewGONEViewVISIBLE = ((isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1c0008L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false ? View.VISIBLE : View.GONE
                    isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = ((isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x1e0800L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? androidx.databinding.ViewDataBinding.safeUnbox(isSubs) : false ? viewModel.isSubsViewComparisonLiveData().getValue().suggestion != null : false
                isBottomsheetBehaviourIsSubsBooleanFalseViewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNullBooleanFalse = ((isBottomsheetBehaviourIsSubsBooleanFalse) ? (viewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNull) : (false));
            if((dirtyFlags & 0x1e0800L) != 0) {
                if(isBottomsheetBehaviourIsSubsBooleanFalseViewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNullBooleanFalse) {
                        dirtyFlags |= 0x400000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? androidx.databinding.ViewDataBinding.safeUnbox(isSubs) : false ? viewModel.isSubsViewComparisonLiveData().getValue().suggestion != null : false ? View.VISIBLE : View.GONE
                isBottomsheetBehaviourIsSubsBooleanFalseViewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = ((isBottomsheetBehaviourIsSubsBooleanFalseViewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNullBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x1c0008L) != 0) {

                // read viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? true : viewModel.productDetailLiveData.getValue().product.discount == 0.0 ? View.GONE : androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false ? View.GONE : View.VISIBLE
                viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00ViewGONEIsSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalseViewGONEViewVISIBLE = ((viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00) ? (android.view.View.GONE) : (isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalseViewGONEViewVISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x400000L) != 0) {



                if (viewModel != null) {
                    // read viewModel.productDetailLiveData
                    viewModelProductDetailLiveData = viewModel.getProductDetailLiveData();
                }
                updateLiveDataRegistration(3, viewModelProductDetailLiveData);


                if (viewModelProductDetailLiveData != null) {
                    // read viewModel.productDetailLiveData.getValue()
                    viewModelProductDetailLiveDataGetValue = viewModelProductDetailLiveData.getValue();
                }


                if (viewModelProductDetailLiveDataGetValue != null) {
                    // read viewModel.productDetailLiveData.getValue().suggestion
                    viewModelProductDetailLiveDataSuggestion = viewModelProductDetailLiveDataGetValue.getSuggestion();
                }


                // read viewModel.productDetailLiveData.getValue().suggestion != null
                viewModelProductDetailLiveDataSuggestionJavaLangObjectNull = (viewModelProductDetailLiveDataSuggestion) != (null);
        }

        if ((dirtyFlags_1 & 0x40000L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().suggestion != null : false
                isSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalse = ((isSubs) ? (viewModelProductDetailLiveDataSuggestionJavaLangObjectNull) : (false));
            if((dirtyFlags_1 & 0x40000L) != 0) {
                if(isSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalse) {
                        dirtyFlags |= 0x1000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().suggestion != null : false ? View.VISIBLE : View.GONE
                isSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE = ((isSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x1c0008L) != 0) {

                // read viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? true : viewModel.productDetailLiveData.getValue().product.availabilityStatus.isEmpty() ? !androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().suggestion != null : false ? View.VISIBLE : View.GONE : View.GONE
                viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullBooleanTrueViewModelProductDetailLiveDataProductAvailabilityStatusIsEmptyIsSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalseViewVISIBLEViewGONEViewGONE = ((viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullBooleanTrueViewModelProductDetailLiveDataProductAvailabilityStatusIsEmpty) ? (isSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x180008L) != 0) {
            // api target 1

            this.alertMessage.setAlertMessage(viewModelProductDetailLiveDataProductAvailabilityMessage);
            this.alertMessage.setVisibility(viewModelProductDetailLiveDataProductAvailabilityMessageJavaLangObjectNullViewModelProductDetailLiveDataProductAvailabilityMessageIsEmptyBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.availabilityStatus, viewModelProductDetailLiveDataProductAvailabilityStatus);
            this.availabilityStatus.setVisibility(viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setBannerPlaceHolder(this.bannerPlaceHolder, viewModelProductDetailLiveDataProductProductImageUrl);
            this.btnSubsStepper.setMaxQty(viewModelProductDetailLiveDataProductMaxCappedQty);
            this.btnSubsStepper.setQty(viewModelProductDetailLiveDataProductQty);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.clHeaderLabel, viewModelProductDetailLiveDataProductOrgSubsSkuName);
            this.ivTitleAlreadyAdded.setVisibility(viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewModelProductDetailLiveDataIsOrgAddedToCartBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.medicineCompanyName, viewModelProductDetailLiveDataProductManufacturerName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.medicineName, viewModelProductDetailLiveDataProductSkuName);
            this.tvAlreadyAdded.setVisibility(viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullViewModelProductDetailLiveDataIsOrgAddedToCartBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCheaperTag, viewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangStringCheaper);
            this.tvMRPText.setVisibility(viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00ViewGONEViewVISIBLE);
            this.tvOrgMedMrp.setVisibility(viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00ViewGONEViewVISIBLE);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setStrikeThroughPrices(this.tvOrgMedMrp, viewModelProductDetailLiveDataProductMrp);
            this.tvOrgMedSellingPrice.setVisibility(viewModelProductDetailLiveDataIsOrgAddedToCartViewGONEViewVISIBLE);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setNumberFormatPriceInDouble(this.tvOrgMedSellingPrice, viewModelProductDetailLiveDataProductSellingPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOrgPricePerUnit, viewModelProductDetailLiveDataProductPackForm);
            this.tvOrgRupeeSbl.setVisibility(viewModelProductDetailLiveDataIsOrgAddedToCartViewGONEViewVISIBLE);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setDiscountValue(this.tvPercentOff, viewModelProductDetailLiveDataProductDiscount);
            this.tvPricePerUnit.setVisibility(viewModelProductDetailLiveDataIsOrgAddedToCartViewGONEViewVISIBLE);
            this.tvPricePerUnit.setText(viewModelProductDetailLiveDataProductPricePerUnitLabel);
        }
        if ((dirtyFlags & 0x184000L) != 0) {
            // api target 1

            this.applyCouponNotification.setVisibility(viewModelFtcCouponDataJavaLangObjectNullViewGONEViewVISIBLE);
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.toolbarLayout.setTranslationZ(viewModelFtcCouponDataJavaLangObjectNullToolbarLayoutAndroidDimenD6ToolbarLayoutAndroidDimenD0);
            }
        }
        if ((dirtyFlags & 0x180004L) != 0) {
            // api target 1

            this.authorCardSection.setVisibility(viewModelGetAuthorListLiveDataJavaLangObjectNullViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setAuthorList(this.rvAuthorCard, viewModelGetAuthorListLiveDataGetValue);
        }
        if ((dirtyFlags & 0x180000L) != 0) {
            // api target 1

            this.btnSubsStepper.setStepperCallback(viewModelPdBottomSheetQuantityStepperCallback);
        }
        if ((dirtyFlags & 0x1e0008L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.handleAddPlusIconMedicineDetails(this.btnSubsStepper, androidxDatabindingViewDataBindingSafeUnboxIsSubs, androidxDatabindingViewDataBindingSafeUnboxIsBottomsheetBehaviour, viewModelProductDetailLiveDataGetValue);
        }
        if ((dirtyFlags & 0x180028L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.handleMedicinDetailsStepperVisibility(this.btnSubsStepper, viewModelProductDetailLiveDataGetValue, androidxDatabindingViewDataBindingSafeUnboxViewModelIsFromOrderStatusGetValue);
        }
        if ((dirtyFlags & 0x140000L) != 0) {
            // api target 1

            this.clSubsRecommended.setVisibility(isSubsViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1c0008L) != 0) {
            // api target 1

            this.clUserBoughtTooltip.setVisibility(viewModelProductDetailLiveDataProductAvailabilityStatusJavaLangObjectNullBooleanTrueViewModelProductDetailLiveDataProductAvailabilityStatusIsEmptyIsSubsViewModelProductDetailLiveDataSuggestionJavaLangObjectNullBooleanFalseViewVISIBLEViewGONEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.handleAddPlusIcon(this.pdpStickyHeader, androidxDatabindingViewDataBindingSafeUnboxIsSubs, viewModelProductDetailLiveDataGetValue);
            this.tvCheaperTag.setVisibility(isSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
            this.tvPercentOff.setVisibility(viewModelProductDetailLiveDataIsOrgAddedToCartBooleanTrueViewModelProductDetailLiveDataProductDiscountFloat00ViewGONEIsSubsViewModelProductDetailLiveDataProductSubsSavingPercentageJavaLangObjectNullBooleanFalseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1a0002L) != 0) {
            // api target 1

            this.doubleStackProductCard.setVisibility(isBottomsheetBehaviourViewModelGetDoubleStackSectionLiveDataJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180002L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setDoubleStackData(this.doubleStackProductCard, viewModelGetDoubleStackSectionLiveDataGetValue);
        }
        if ((dirtyFlags & 0x180080L) != 0) {
            // api target 1

            this.faqCategories.setVisibility(viewModelGetProductInfoLiveDataJavaLangObjectNullViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setProductInfoData(this.faqCategories, viewModelGetProductInfoLiveDataGetValue);
            this.tmDivider.setVisibility(viewModelGetProductInfoLiveDataJavaLangObjectNullViewGONEViewVISIBLE);
            this.tmDivider1.setVisibility(viewModelGetProductInfoLiveDataJavaLangObjectNullViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180010L) != 0) {
            // api target 1

            this.manufacturerDetailsCategories.setVisibility(viewModelGetManufacturerDetailLiveDataJavaLangObjectNullViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setProductInfoData(this.manufacturerDetailsCategories, viewModelGetManufacturerDetailLiveDataGetValue);
        }
        if ((dirtyFlags & 0x180600L) != 0) {
            // api target 1

            this.nestedScrollView.setVisibility(viewModelShowProductPageLiveDataViewModelShowShimmerBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180400L) != 0) {
            // api target 1

            this.shimmerViewContainer.setVisibility(viewModelShowShimmerViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1a1000L) != 0) {
            // api target 1

            this.tmCarts.setVisibility(viewModelCartItemCountInt0BooleanTrueIsBottomsheetBehaviourViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x180100L) != 0) {
            // api target 1

            this.tmCarts.setUpCartData(viewModelCartModelGetValue);
        }
        if ((dirtyFlags & 0x180001L) != 0) {
            // api target 1

            this.tmCompositionCard.setVisibility(viewModelGetCompositionUILiveDataJavaLangObjectNullViewVISIBLEViewGONE);
            com.intellihealth.truemeds.presentation.bindingadapter.ProductDetailBindingAdapterKt.setCompositionData(this.tmCompositionCard, viewModelGetCompositionUILiveDataGetValue);
        }
        if ((dirtyFlags & 0x108000L) != 0) {
            // api target 1

            this.tmRecommendedSubstituteUpsell.setVisibility(isSubsFoundViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x182000L) != 0) {
            // api target 1

            this.tmRecommendedSubstituteUpsell.setRecommSubstitueUpsellData(viewModelGetRecommendedLiveDataGetValue);
        }
        if ((dirtyFlags & 0x1e0800L) != 0) {
            // api target 1

            this.tmViewComparison.setVisibility(isBottomsheetBehaviourIsSubsBooleanFalseViewModelIsSubsViewComparisonLiveDataSuggestionJavaLangObjectNullBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180040L) != 0) {
            // api target 1

            this.tmViewComparison.setProductComparison(ViewModelIsSubsViewComparisonLiveDataGetValue1);
        }
        if ((dirtyFlags & 0x120000L) != 0) {
            // api target 1

            this.toolbarLayout.setVisibility(isBottomsheetBehaviourViewVISIBLEViewGONE);
        }
        executeBindingsOn(mboundView35);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getCompositionUILiveData
        flag 1 (0x2L): viewModel.getDoubleStackSectionLiveData
        flag 2 (0x3L): viewModel.getAuthorListLiveData
        flag 3 (0x4L): viewModel.productDetailLiveData
        flag 4 (0x5L): viewModel.getManufacturerDetailLiveData
        flag 5 (0x6L): viewModel.isFromOrderStatus()
        flag 6 (0x7L): viewModel.isSubsViewComparisonLiveData
        flag 7 (0x8L): viewModel.getProductInfoLiveData
        flag 8 (0x9L): viewModel.cartModel
        flag 9 (0xaL): viewModel.showProductPageLiveData
        flag 10 (0xbL): viewModel.showShimmer
        flag 11 (0xcL): viewModel.isSubsViewComparisonLiveData()
        flag 12 (0xdL): viewModel.cartItemCount
        flag 13 (0xeL): viewModel.getRecommendedLiveData
        flag 14 (0xfL): viewModel.ftcCouponData
        flag 15 (0x10L): isSubsFound
        flag 16 (0x11L): list
        flag 17 (0x12L): isBottomsheetBehaviour
        flag 18 (0x13L): isSubs
        flag 19 (0x14L): viewModel
        flag 20 (0x15L): null
        flag 21 (0x16L): !androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().suggestion != null : false
        flag 22 (0x17L): !androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().suggestion != null : false
        flag 23 (0x18L): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? viewModel.getDoubleStackSectionLiveData.getValue() != null : false
        flag 24 (0x19L): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? viewModel.getDoubleStackSectionLiveData.getValue() != null : false
        flag 25 (0x1aL): viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? true : viewModel.productDetailLiveData.getValue().product.discount == 0.0 ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? true : viewModel.productDetailLiveData.getValue().product.discount == 0.0 ? View.GONE : View.VISIBLE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductPageLiveData.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) : false
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductPageLiveData.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) : false
        flag 29 (0x1eL): viewModel.getCompositionUILiveData.getValue() != null ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): viewModel.getCompositionUILiveData.getValue() != null ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour)
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour)
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false ? View.GONE : View.VISIBLE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false ? View.GONE : View.VISIBLE
        flag 35 (0x24L): viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? true : viewModel.productDetailLiveData.getValue().product.availabilityStatus.isEmpty()
        flag 36 (0x25L): viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? true : viewModel.productDetailLiveData.getValue().product.availabilityStatus.isEmpty()
        flag 37 (0x26L): viewModel.productDetailLiveData.getValue().product.availabilityStatus != null ? View.VISIBLE : View.GONE
        flag 38 (0x27L): viewModel.productDetailLiveData.getValue().product.availabilityStatus != null ? View.VISIBLE : View.GONE
        flag 39 (0x28L): viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? true : viewModel.productDetailLiveData.getValue().product.discount == 0.0 ? View.GONE : androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false ? View.GONE : View.VISIBLE
        flag 40 (0x29L): viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? true : viewModel.productDetailLiveData.getValue().product.discount == 0.0 ? View.GONE : androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false ? View.GONE : View.VISIBLE
        flag 41 (0x2aL): viewModel.productDetailLiveData.getValue().product.availabilityMessage != null ? !viewModel.productDetailLiveData.getValue().product.availabilityMessage.isEmpty() : false
        flag 42 (0x2bL): viewModel.productDetailLiveData.getValue().product.availabilityMessage != null ? !viewModel.productDetailLiveData.getValue().product.availabilityMessage.isEmpty() : false
        flag 43 (0x2cL): viewModel.ftcCouponData.getValue() == null ? View.GONE : View.VISIBLE
        flag 44 (0x2dL): viewModel.ftcCouponData.getValue() == null ? View.GONE : View.VISIBLE
        flag 45 (0x2eL): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? androidx.databinding.ViewDataBinding.safeUnbox(isSubs) : false ? viewModel.isSubsViewComparisonLiveData().getValue().suggestion != null : false ? View.VISIBLE : View.GONE
        flag 46 (0x2fL): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? androidx.databinding.ViewDataBinding.safeUnbox(isSubs) : false ? viewModel.isSubsViewComparisonLiveData().getValue().suggestion != null : false ? View.VISIBLE : View.GONE
        flag 47 (0x30L): !androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().suggestion != null : false ? View.VISIBLE : View.GONE
        flag 48 (0x31L): !androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().suggestion != null : false ? View.VISIBLE : View.GONE
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? View.VISIBLE : View.GONE
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? View.VISIBLE : View.GONE
        flag 51 (0x34L): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? androidx.databinding.ViewDataBinding.safeUnbox(isSubs) : false
        flag 52 (0x35L): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? androidx.databinding.ViewDataBinding.safeUnbox(isSubs) : false
        flag 53 (0x36L): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? viewModel.getDoubleStackSectionLiveData.getValue() != null : false ? View.VISIBLE : View.GONE
        flag 54 (0x37L): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? viewModel.getDoubleStackSectionLiveData.getValue() != null : false ? View.VISIBLE : View.GONE
        flag 55 (0x38L): viewModel.getManufacturerDetailLiveData.getValue() != null ? View.VISIBLE : View.GONE
        flag 56 (0x39L): viewModel.getManufacturerDetailLiveData.getValue() != null ? View.VISIBLE : View.GONE
        flag 57 (0x3aL): viewModel.productDetailLiveData.getValue().product.availabilityMessage != null ? !viewModel.productDetailLiveData.getValue().product.availabilityMessage.isEmpty() : false ? View.VISIBLE : View.GONE
        flag 58 (0x3bL): viewModel.productDetailLiveData.getValue().product.availabilityMessage != null ? !viewModel.productDetailLiveData.getValue().product.availabilityMessage.isEmpty() : false ? View.VISIBLE : View.GONE
        flag 59 (0x3cL): androidx.databinding.ViewDataBinding.safeUnbox(isSubsFound) ? View.VISIBLE : View.GONE
        flag 60 (0x3dL): androidx.databinding.ViewDataBinding.safeUnbox(isSubsFound) ? View.VISIBLE : View.GONE
        flag 61 (0x3eL): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? View.VISIBLE : View.GONE
        flag 62 (0x3fL): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? View.VISIBLE : View.GONE
        flag 63 (0x40L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductPageLiveData.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) : false ? View.VISIBLE : View.GONE
        flag 64 (0x41L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProductPageLiveData.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) : false ? View.VISIBLE : View.GONE
        flag 65 (0x42L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 66 (0x43L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showShimmer.getValue()) ? View.VISIBLE : View.GONE
        flag 67 (0x44L): androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false
        flag 68 (0x45L): androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false
        flag 69 (0x46L): viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? viewModel.productDetailLiveData.getValue().isOrgAddedToCart : false ? View.VISIBLE : View.GONE
        flag 70 (0x47L): viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? viewModel.productDetailLiveData.getValue().isOrgAddedToCart : false ? View.VISIBLE : View.GONE
        flag 71 (0x48L): viewModel.getProductInfoLiveData.getValue() != null ? View.VISIBLE : View.GONE
        flag 72 (0x49L): viewModel.getProductInfoLiveData.getValue() != null ? View.VISIBLE : View.GONE
        flag 73 (0x4aL): viewModel.getProductInfoLiveData.getValue() != null ? View.GONE : View.VISIBLE
        flag 74 (0x4bL): viewModel.getProductInfoLiveData.getValue() != null ? View.GONE : View.VISIBLE
        flag 75 (0x4cL): viewModel.ftcCouponData.getValue() == null ? @android:dimen/d6 : @android:dimen/d0
        flag 76 (0x4dL): viewModel.ftcCouponData.getValue() == null ? @android:dimen/d6 : @android:dimen/d0
        flag 77 (0x4eL): viewModel.getAuthorListLiveData.getValue() != null ? View.VISIBLE : View.GONE
        flag 78 (0x4fL): viewModel.getAuthorListLiveData.getValue() != null ? View.VISIBLE : View.GONE
        flag 79 (0x50L): viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? viewModel.productDetailLiveData.getValue().isOrgAddedToCart : false
        flag 80 (0x51L): viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? viewModel.productDetailLiveData.getValue().isOrgAddedToCart : false
        flag 81 (0x52L): viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? true : viewModel.productDetailLiveData.getValue().product.availabilityStatus.isEmpty() ? !androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().suggestion != null : false ? View.VISIBLE : View.GONE : View.GONE
        flag 82 (0x53L): viewModel.productDetailLiveData.getValue().product.availabilityStatus == null ? true : viewModel.productDetailLiveData.getValue().product.availabilityStatus.isEmpty() ? !androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().suggestion != null : false ? View.VISIBLE : View.GONE : View.GONE
        flag 83 (0x54L): viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? true : viewModel.productDetailLiveData.getValue().product.discount == 0.0
        flag 84 (0x55L): viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? true : viewModel.productDetailLiveData.getValue().product.discount == 0.0
        flag 85 (0x56L): viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? View.GONE : View.VISIBLE
        flag 86 (0x57L): viewModel.productDetailLiveData.getValue().isOrgAddedToCart ? View.GONE : View.VISIBLE
        flag 87 (0x58L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? View.GONE : View.VISIBLE
        flag 88 (0x59L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.cartItemCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? View.GONE : View.VISIBLE
        flag 89 (0x5aL): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? androidx.databinding.ViewDataBinding.safeUnbox(isSubs) : false ? viewModel.isSubsViewComparisonLiveData().getValue().suggestion != null : false
        flag 90 (0x5bL): !androidx.databinding.ViewDataBinding.safeUnbox(isBottomsheetBehaviour) ? androidx.databinding.ViewDataBinding.safeUnbox(isSubs) : false ? viewModel.isSubsViewComparisonLiveData().getValue().suggestion != null : false
        flag 91 (0x5cL): androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false ? View.VISIBLE : View.GONE
        flag 92 (0x5dL): androidx.databinding.ViewDataBinding.safeUnbox(isSubs) ? viewModel.productDetailLiveData.getValue().product.subsSavingPercentage != null : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}