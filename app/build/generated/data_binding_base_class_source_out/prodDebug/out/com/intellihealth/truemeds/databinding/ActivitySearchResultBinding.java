// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.intellihealth.salt.views.Carts;
import com.intellihealth.salt.views.SearchBar;
import com.intellihealth.salt.views.StickyNonStickyNotification;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.cards.ActionCard;
import com.intellihealth.salt.views.chip.HeaderChip;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.coupon.CouponCodeResponse;
import com.intellihealth.truemeds.presentation.viewmodel.CouponViewModel;
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySearchResultBinding extends ViewDataBinding {
  @NonNull
  public final ActionCard actionPharmacist;

  @NonNull
  public final Carts cartView;

  @NonNull
  public final ConstraintLayout clNoResult;

  @NonNull
  public final ConstraintLayout clSearchNoResultInner;

  @NonNull
  public final HeaderChip headerChip;

  @NonNull
  public final AppCompatImageView ivSearchNoResult;

  @NonNull
  public final ProgressBar pbLoadMore;

  @NonNull
  public final StickyNonStickyNotification promoCard;

  @NonNull
  public final RecyclerView rvSearchResult;

  @NonNull
  public final SearchBar searchBar;

  @NonNull
  public final ShimmerFrameLayout shimmerViewContainer;

  @NonNull
  public final TextView tvResultMessage;

  @NonNull
  public final TextView tvSearchNoResultMessage;

  @Bindable
  protected SearchViewModel mViewmodel;

  @Bindable
  protected CouponViewModel mCouponViewModel;

  @Bindable
  protected FragmentManager mFragmentManager;

  @Bindable
  protected String mSearchText;

  @Bindable
  protected CouponCodeResponse.Coupon mApplyCouponData;

  @Bindable
  protected LifecycleOwner mLifeCycle;

  protected ActivitySearchResultBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ActionCard actionPharmacist, Carts cartView, ConstraintLayout clNoResult,
      ConstraintLayout clSearchNoResultInner, HeaderChip headerChip,
      AppCompatImageView ivSearchNoResult, ProgressBar pbLoadMore,
      StickyNonStickyNotification promoCard, RecyclerView rvSearchResult, SearchBar searchBar,
      ShimmerFrameLayout shimmerViewContainer, TextView tvResultMessage,
      TextView tvSearchNoResultMessage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionPharmacist = actionPharmacist;
    this.cartView = cartView;
    this.clNoResult = clNoResult;
    this.clSearchNoResultInner = clSearchNoResultInner;
    this.headerChip = headerChip;
    this.ivSearchNoResult = ivSearchNoResult;
    this.pbLoadMore = pbLoadMore;
    this.promoCard = promoCard;
    this.rvSearchResult = rvSearchResult;
    this.searchBar = searchBar;
    this.shimmerViewContainer = shimmerViewContainer;
    this.tvResultMessage = tvResultMessage;
    this.tvSearchNoResultMessage = tvSearchNoResultMessage;
  }

  public abstract void setViewmodel(@Nullable SearchViewModel viewmodel);

  @Nullable
  public SearchViewModel getViewmodel() {
    return mViewmodel;
  }

  public abstract void setCouponViewModel(@Nullable CouponViewModel couponViewModel);

  @Nullable
  public CouponViewModel getCouponViewModel() {
    return mCouponViewModel;
  }

  public abstract void setFragmentManager(@Nullable FragmentManager fragmentManager);

  @Nullable
  public FragmentManager getFragmentManager() {
    return mFragmentManager;
  }

  public abstract void setSearchText(@Nullable String searchText);

  @Nullable
  public String getSearchText() {
    return mSearchText;
  }

  public abstract void setApplyCouponData(@Nullable CouponCodeResponse.Coupon applyCouponData);

  @Nullable
  public CouponCodeResponse.Coupon getApplyCouponData() {
    return mApplyCouponData;
  }

  public abstract void setLifeCycle(@Nullable LifecycleOwner lifeCycle);

  @Nullable
  public LifecycleOwner getLifeCycle() {
    return mLifeCycle;
  }

  @NonNull
  public static ActivitySearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search_result, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchResultBinding>inflateInternal(inflater, R.layout.activity_search_result, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySearchResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search_result, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchResultBinding>inflateInternal(inflater, R.layout.activity_search_result, null, false, component);
  }

  public static ActivitySearchResultBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivitySearchResultBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySearchResultBinding)bind(component, view, R.layout.activity_search_result);
  }
}
