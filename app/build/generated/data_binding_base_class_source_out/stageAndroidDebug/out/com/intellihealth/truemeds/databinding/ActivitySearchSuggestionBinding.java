// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.intellihealth.salt.views.SearchBar;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.salt.views.buttons.ButtonLite;
import com.intellihealth.salt.views.cards.ActionCard;
import com.intellihealth.salt.views.chip.HeaderChip;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.search.SearchUIStateConstants;
import com.intellihealth.truemeds.presentation.viewmodel.SearchViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySearchSuggestionBinding extends ViewDataBinding {
  @NonNull
  public final ActionCard actionPharmacist;

  @NonNull
  public final ButtonLite btnClear;

  @NonNull
  public final Button btnSeeResult;

  @NonNull
  public final CardView cardBtn;

  @NonNull
  public final ConstraintLayout clData;

  @NonNull
  public final ConstraintLayout clDefault;

  @NonNull
  public final ConstraintLayout clMain;

  @NonNull
  public final ConstraintLayout clNoResult;

  @NonNull
  public final ConstraintLayout clPrevious;

  @NonNull
  public final ConstraintLayout clRecent;

  @NonNull
  public final ConstraintLayout clRoot;

  @NonNull
  public final ConstraintLayout clSearchNoResultInner;

  @NonNull
  public final ConstraintLayout clSearchSuggestion;

  @NonNull
  public final ConstraintLayout clSearching;

  @NonNull
  public final ConstraintLayout clTrending;

  @NonNull
  public final HeaderChip headerChip;

  @NonNull
  public final ImageView ivSearchIcon;

  @NonNull
  public final AppCompatImageView ivSearchMedicineHolder;

  @NonNull
  public final AppCompatImageView ivSearchNoResult;

  @NonNull
  public final NestedScrollView nsRoot;

  @NonNull
  public final RecyclerView rvPrevious;

  @NonNull
  public final RecyclerView rvRecent;

  @NonNull
  public final RecyclerView rvSearchSuggestion;

  @NonNull
  public final RecyclerView rvTrending;

  @NonNull
  public final SearchBar searchBar;

  @NonNull
  public final ShimmerFrameLayout shimmerViewContainer;

  @NonNull
  public final ShimmerFrameLayout shimmerViewContainerPatient;

  @NonNull
  public final TextView tvDidYouMean;

  @NonNull
  public final TextView tvPreviousLabel;

  @NonNull
  public final TextView tvRecentLabel;

  @NonNull
  public final TextView tvSearchMessage;

  @NonNull
  public final TextView tvSearchNoResultMessage;

  @NonNull
  public final TextView tvSreaching;

  @NonNull
  public final TextView tvTrendingLabel;

  @NonNull
  public final View vPrevious;

  @NonNull
  public final View vPreviousGap;

  @NonNull
  public final View vRecent;

  @NonNull
  public final View vRecentGap;

  @Bindable
  protected SearchViewModel mViewModel;

  @Bindable
  protected SearchUIStateConstants mSearchUIStateConstants;

  protected ActivitySearchSuggestionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ActionCard actionPharmacist, ButtonLite btnClear, Button btnSeeResult,
      CardView cardBtn, ConstraintLayout clData, ConstraintLayout clDefault,
      ConstraintLayout clMain, ConstraintLayout clNoResult, ConstraintLayout clPrevious,
      ConstraintLayout clRecent, ConstraintLayout clRoot, ConstraintLayout clSearchNoResultInner,
      ConstraintLayout clSearchSuggestion, ConstraintLayout clSearching,
      ConstraintLayout clTrending, HeaderChip headerChip, ImageView ivSearchIcon,
      AppCompatImageView ivSearchMedicineHolder, AppCompatImageView ivSearchNoResult,
      NestedScrollView nsRoot, RecyclerView rvPrevious, RecyclerView rvRecent,
      RecyclerView rvSearchSuggestion, RecyclerView rvTrending, SearchBar searchBar,
      ShimmerFrameLayout shimmerViewContainer, ShimmerFrameLayout shimmerViewContainerPatient,
      TextView tvDidYouMean, TextView tvPreviousLabel, TextView tvRecentLabel,
      TextView tvSearchMessage, TextView tvSearchNoResultMessage, TextView tvSreaching,
      TextView tvTrendingLabel, View vPrevious, View vPreviousGap, View vRecent, View vRecentGap) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionPharmacist = actionPharmacist;
    this.btnClear = btnClear;
    this.btnSeeResult = btnSeeResult;
    this.cardBtn = cardBtn;
    this.clData = clData;
    this.clDefault = clDefault;
    this.clMain = clMain;
    this.clNoResult = clNoResult;
    this.clPrevious = clPrevious;
    this.clRecent = clRecent;
    this.clRoot = clRoot;
    this.clSearchNoResultInner = clSearchNoResultInner;
    this.clSearchSuggestion = clSearchSuggestion;
    this.clSearching = clSearching;
    this.clTrending = clTrending;
    this.headerChip = headerChip;
    this.ivSearchIcon = ivSearchIcon;
    this.ivSearchMedicineHolder = ivSearchMedicineHolder;
    this.ivSearchNoResult = ivSearchNoResult;
    this.nsRoot = nsRoot;
    this.rvPrevious = rvPrevious;
    this.rvRecent = rvRecent;
    this.rvSearchSuggestion = rvSearchSuggestion;
    this.rvTrending = rvTrending;
    this.searchBar = searchBar;
    this.shimmerViewContainer = shimmerViewContainer;
    this.shimmerViewContainerPatient = shimmerViewContainerPatient;
    this.tvDidYouMean = tvDidYouMean;
    this.tvPreviousLabel = tvPreviousLabel;
    this.tvRecentLabel = tvRecentLabel;
    this.tvSearchMessage = tvSearchMessage;
    this.tvSearchNoResultMessage = tvSearchNoResultMessage;
    this.tvSreaching = tvSreaching;
    this.tvTrendingLabel = tvTrendingLabel;
    this.vPrevious = vPrevious;
    this.vPreviousGap = vPreviousGap;
    this.vRecent = vRecent;
    this.vRecentGap = vRecentGap;
  }

  public abstract void setViewModel(@Nullable SearchViewModel viewModel);

  @Nullable
  public SearchViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setSearchUIStateConstants(
      @Nullable SearchUIStateConstants searchUIStateConstants);

  @Nullable
  public SearchUIStateConstants getSearchUIStateConstants() {
    return mSearchUIStateConstants;
  }

  @NonNull
  public static ActivitySearchSuggestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search_suggestion, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchSuggestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchSuggestionBinding>inflateInternal(inflater, R.layout.activity_search_suggestion, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySearchSuggestionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_search_suggestion, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySearchSuggestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySearchSuggestionBinding>inflateInternal(inflater, R.layout.activity_search_suggestion, null, false, component);
  }

  public static ActivitySearchSuggestionBinding bind(@NonNull View view) {
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
  public static ActivitySearchSuggestionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivitySearchSuggestionBinding)bind(component, view, R.layout.activity_search_suggestion);
  }
}
