package com.intellihealth.truemeds.databinding;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BottomsheetCouponOfferBindingImpl extends BottomsheetCouponOfferBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewDragHandle, 15);
        sViewsWithIds.put(R.id.constraintLayout, 16);
        sViewsWithIds.put(R.id.imageInfoCircle, 17);
        sViewsWithIds.put(R.id.cl_coupon_offer_content, 18);
        sViewsWithIds.put(R.id.tvMinOrderValue, 19);
        sViewsWithIds.put(R.id.tvDiscountCashback, 20);
        sViewsWithIds.put(R.id.tvCouponExpiry, 21);
        sViewsWithIds.put(R.id.divider3, 22);
        sViewsWithIds.put(R.id.tvTermsAndConditionsLabel, 23);
        sViewsWithIds.put(R.id.nestedScrollview, 24);
        sViewsWithIds.put(R.id.imageClose, 25);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final com.intellihealth.salt.views.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BottomsheetCouponOfferBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private BottomsheetCouponOfferBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[13]
            , (com.intellihealth.salt.views.buttons.ButtonLite) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (android.view.View) bindings[22]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[25]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[17]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[24]
            , (com.intellihealth.salt.views.TextView) bindings[10]
            , (com.intellihealth.salt.views.TextView) bindings[21]
            , (com.intellihealth.salt.views.TextView) bindings[3]
            , (com.intellihealth.salt.views.TextView) bindings[6]
            , (com.intellihealth.salt.views.TextView) bindings[20]
            , (com.intellihealth.salt.views.TextView) bindings[8]
            , (com.intellihealth.salt.views.TextView) bindings[9]
            , (com.intellihealth.salt.views.TextView) bindings[2]
            , (com.intellihealth.salt.views.TextView) bindings[7]
            , (com.intellihealth.salt.views.TextView) bindings[19]
            , (com.intellihealth.salt.views.TextView) bindings[23]
            , (com.intellihealth.salt.views.cards.Divider) bindings[15]
            , (com.intellihealth.salt.views.StickyNonStickyNotification) bindings[12]
            );
        this.btnApplyCoupon.setTag(null);
        this.btnRemoveCoupon.setTag(null);
        this.clButton.setTag(null);
        this.clCouponInfo.setTag(null);
        this.imgLeft.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (com.intellihealth.salt.views.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.textTermsAndConditions.setTag(null);
        this.tvCouponHeader.setTag(null);
        this.tvCouponInfoDescription.setTag(null);
        this.tvDiscountCashbackValue.setTag(null);
        this.tvExpiryDays.setTag(null);
        this.tvHeader.setTag(null);
        this.tvMinCartValue.setTag(null);
        this.viewStickyNonStickyNotification.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.lifeCycle == variableId) {
            setLifeCycle((androidx.lifecycle.LifecycleOwner) variable);
        }
        else if (BR.expires == variableId) {
            setExpires((java.lang.Integer) variable);
        }
        else if (BR.applyCouponData == variableId) {
            setApplyCouponData((com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon) variable);
        }
        else if (BR.discount == variableId) {
            setDiscount((java.lang.String) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLifeCycle(@Nullable androidx.lifecycle.LifecycleOwner LifeCycle) {
        this.mLifeCycle = LifeCycle;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.lifeCycle);
        super.requestRebind();
    }
    public void setExpires(@Nullable java.lang.Integer Expires) {
        this.mExpires = Expires;
    }
    public void setApplyCouponData(@Nullable com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon ApplyCouponData) {
        this.mApplyCouponData = ApplyCouponData;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.applyCouponData);
        super.requestRebind();
    }
    public void setDiscount(@Nullable java.lang.String Discount) {
        this.mDiscount = Discount;
    }
    public void setViewModel(@Nullable com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.util.List<com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon.TermsAndCondition> applyCouponDataTermsAndConditions = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxApplyCouponDataCouponCodeRequired = false;
        java.lang.String applyCouponDataImage = null;
        java.lang.String applyCouponDataPromoCode = null;
        boolean applyCouponDataCouponCodeRequiredBooleanTrue = false;
        int applyCouponDataIsCouponAppliedBooleanTrueViewVISIBLEViewGONE = 0;
        java.lang.String applyCouponDataInfoPanel = null;
        int applyCouponDataInfoPanelJavaLangObjectNullViewGONEViewVISIBLE = 0;
        java.lang.String applyCouponDataExpiryDays = null;
        androidx.lifecycle.LifecycleOwner lifeCycle = mLifeCycle;
        java.lang.String applyCouponDataTitle = null;
        int applyCouponDataIsCouponAppliedBooleanTrueViewGONEViewVISIBLE = 0;
        java.lang.Boolean applyCouponDataCouponCodeRequired = null;
        java.lang.Integer applyCouponDataMinCartValue = null;
        com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse.Coupon applyCouponData = mApplyCouponData;
        boolean applyCouponDataIsCouponApplied = false;
        java.lang.String applyCouponDataDescription = null;
        java.lang.String javaLangStringApplyCouponDataMinCartValueIntValue = null;
        boolean applyCouponDataIsCouponAppliedBooleanTrue = false;
        java.lang.String applyCouponDataOfferTypeMsg = null;
        boolean applyCouponDataInfoPanelJavaLangObjectNull = false;
        int applyCouponDataMinCartValueIntValue = 0;
        int applyCouponDataCouponCodeRequiredBooleanTrueViewVISIBLEViewGONE = 0;
        com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x35L) != 0) {


            if ((dirtyFlags & 0x24L) != 0) {

                    if (applyCouponData != null) {
                        // read applyCouponData.termsAndConditions
                        applyCouponDataTermsAndConditions = applyCouponData.getTermsAndConditions();
                        // read applyCouponData.image
                        applyCouponDataImage = applyCouponData.getImage();
                        // read applyCouponData.promoCode
                        applyCouponDataPromoCode = applyCouponData.getPromoCode();
                        // read applyCouponData.infoPanel
                        applyCouponDataInfoPanel = applyCouponData.getInfoPanel();
                        // read applyCouponData.expiryDays
                        applyCouponDataExpiryDays = applyCouponData.getExpiryDays();
                        // read applyCouponData.title
                        applyCouponDataTitle = applyCouponData.getTitle();
                        // read applyCouponData.couponCodeRequired
                        applyCouponDataCouponCodeRequired = applyCouponData.getCouponCodeRequired();
                        // read applyCouponData.minCartValue
                        applyCouponDataMinCartValue = applyCouponData.getMinCartValue();
                        // read applyCouponData.isCouponApplied
                        applyCouponDataIsCouponApplied = applyCouponData.isCouponApplied();
                        // read applyCouponData.description
                        applyCouponDataDescription = applyCouponData.getDescription();
                        // read applyCouponData.offerTypeMsg
                        applyCouponDataOfferTypeMsg = applyCouponData.getOfferTypeMsg();
                    }


                    // read applyCouponData.infoPanel == null
                    applyCouponDataInfoPanelJavaLangObjectNull = (applyCouponDataInfoPanel) == (null);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(applyCouponData.couponCodeRequired)
                    androidxDatabindingViewDataBindingSafeUnboxApplyCouponDataCouponCodeRequired = androidx.databinding.ViewDataBinding.safeUnbox(applyCouponDataCouponCodeRequired);
                    // read applyCouponData.isCouponApplied == true
                    applyCouponDataIsCouponAppliedBooleanTrue = (applyCouponDataIsCouponApplied) == (true);
                if((dirtyFlags & 0x24L) != 0) {
                    if(applyCouponDataInfoPanelJavaLangObjectNull) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x24L) != 0) {
                    if(applyCouponDataIsCouponAppliedBooleanTrue) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x400L;
                    }
                }
                    if (applyCouponDataMinCartValue != null) {
                        // read applyCouponData.minCartValue.intValue()
                        applyCouponDataMinCartValueIntValue = applyCouponDataMinCartValue.intValue();
                    }


                    // read applyCouponData.infoPanel == null ? View.GONE : View.VISIBLE
                    applyCouponDataInfoPanelJavaLangObjectNullViewGONEViewVISIBLE = ((applyCouponDataInfoPanelJavaLangObjectNull) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(applyCouponData.couponCodeRequired) == true
                    applyCouponDataCouponCodeRequiredBooleanTrue = (androidxDatabindingViewDataBindingSafeUnboxApplyCouponDataCouponCodeRequired) == (true);
                    // read applyCouponData.isCouponApplied == true ? View.VISIBLE : View.GONE
                    applyCouponDataIsCouponAppliedBooleanTrueViewVISIBLEViewGONE = ((applyCouponDataIsCouponAppliedBooleanTrue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read applyCouponData.isCouponApplied == true ? View.GONE : View.VISIBLE
                    applyCouponDataIsCouponAppliedBooleanTrueViewGONEViewVISIBLE = ((applyCouponDataIsCouponAppliedBooleanTrue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read ("₹") + (applyCouponData.minCartValue.intValue())
                    javaLangStringApplyCouponDataMinCartValueIntValue = ("₹") + (applyCouponDataMinCartValueIntValue);
                if((dirtyFlags & 0x24L) != 0) {
                    if(applyCouponDataCouponCodeRequiredBooleanTrue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(applyCouponData.couponCodeRequired) == true ? View.VISIBLE : View.GONE
                    applyCouponDataCouponCodeRequiredBooleanTrueViewVISIBLEViewGONE = ((applyCouponDataCouponCodeRequiredBooleanTrue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.btnApplyCoupon.setVisibility(applyCouponDataIsCouponAppliedBooleanTrueViewGONEViewVISIBLE);
            this.btnRemoveCoupon.setVisibility(applyCouponDataIsCouponAppliedBooleanTrueViewVISIBLEViewGONE);
            this.clButton.setVisibility(applyCouponDataCouponCodeRequiredBooleanTrueViewVISIBLEViewGONE);
            this.clCouponInfo.setVisibility(applyCouponDataInfoPanelJavaLangObjectNullViewGONEViewVISIBLE);
            com.intellihealth.truemeds.presentation.bindingadapter.CartBindingAdapterKt.setUrl(this.imgLeft, applyCouponDataImage, (android.graphics.drawable.Drawable)null, (boolean)false, (java.lang.String)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, applyCouponDataDescription);
            com.intellihealth.truemeds.presentation.bindingadapter.CouponBindingAdapterKt.setTermsAndCondition(this.textTermsAndConditions, applyCouponDataTermsAndConditions);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCouponHeader, applyCouponDataTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCouponInfoDescription, applyCouponDataInfoPanel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDiscountCashbackValue, applyCouponDataOfferTypeMsg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvExpiryDays, applyCouponDataExpiryDays);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHeader, applyCouponDataPromoCode);
            this.tvHeader.setVisibility(applyCouponDataCouponCodeRequiredBooleanTrueViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMinCartValue, javaLangStringApplyCouponDataMinCartValueIntValue);
            this.viewStickyNonStickyNotification.setVisibility(applyCouponDataIsCouponAppliedBooleanTrueViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x35L) != 0) {
            // api target 1

            com.intellihealth.truemeds.presentation.bindingadapter.CouponBindingAdapterKt.setStickyData(this.viewStickyNonStickyNotification, viewModel, applyCouponData, lifeCycle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): lifeCycle
        flag 1 (0x2L): expires
        flag 2 (0x3L): applyCouponData
        flag 3 (0x4L): discount
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): applyCouponData.isCouponApplied == true ? View.VISIBLE : View.GONE
        flag 7 (0x8L): applyCouponData.isCouponApplied == true ? View.VISIBLE : View.GONE
        flag 8 (0x9L): applyCouponData.infoPanel == null ? View.GONE : View.VISIBLE
        flag 9 (0xaL): applyCouponData.infoPanel == null ? View.GONE : View.VISIBLE
        flag 10 (0xbL): applyCouponData.isCouponApplied == true ? View.GONE : View.VISIBLE
        flag 11 (0xcL): applyCouponData.isCouponApplied == true ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(applyCouponData.couponCodeRequired) == true ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(applyCouponData.couponCodeRequired) == true ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}