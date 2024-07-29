// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.intellihealth.salt.views.MobileSectionHeaders;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.ButtonLite;
import com.intellihealth.salt.views.cards.Divider;
import com.intellihealth.truemeds.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySubstitutesBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView appCompatImageView2;

  @NonNull
  public final ConstraintLayout clMoneyLayout;

  @NonNull
  public final Divider divider;

  @NonNull
  public final AppCompatImageView ivBottomLine;

  @NonNull
  public final AppCompatImageView ivHeaderImage;

  @NonNull
  public final Divider medDivider;

  @NonNull
  public final MobileSectionHeaders msHeader;

  @NonNull
  public final RecyclerView rvMedList;

  @NonNull
  public final RecyclerView rvSubsList;

  @NonNull
  public final ButtonLite startOrderingNow;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvMedTitle;

  @NonNull
  public final TextView tvPlace;

  @NonNull
  public final TextView tvPlaceorder;

  @NonNull
  public final TextView tvSaveMore;

  @NonNull
  public final TextView tvSubstituteSafe;

  protected ActivitySubstitutesBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView appCompatImageView2, ConstraintLayout clMoneyLayout, Divider divider,
      AppCompatImageView ivBottomLine, AppCompatImageView ivHeaderImage, Divider medDivider,
      MobileSectionHeaders msHeader, RecyclerView rvMedList, RecyclerView rvSubsList,
      ButtonLite startOrderingNow, TextView tvDescription, TextView tvMedTitle, TextView tvPlace,
      TextView tvPlaceorder, TextView tvSaveMore, TextView tvSubstituteSafe) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatImageView2 = appCompatImageView2;
    this.clMoneyLayout = clMoneyLayout;
    this.divider = divider;
    this.ivBottomLine = ivBottomLine;
    this.ivHeaderImage = ivHeaderImage;
    this.medDivider = medDivider;
    this.msHeader = msHeader;
    this.rvMedList = rvMedList;
    this.rvSubsList = rvSubsList;
    this.startOrderingNow = startOrderingNow;
    this.tvDescription = tvDescription;
    this.tvMedTitle = tvMedTitle;
    this.tvPlace = tvPlace;
    this.tvPlaceorder = tvPlaceorder;
    this.tvSaveMore = tvSaveMore;
    this.tvSubstituteSafe = tvSubstituteSafe;
  }

  @NonNull
  public static ActivitySubstitutesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_substitutes, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySubstitutesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySubstitutesBinding>inflateInternal(inflater, R.layout.activity_substitutes, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySubstitutesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_substitutes, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySubstitutesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySubstitutesBinding>inflateInternal(inflater, R.layout.activity_substitutes, null, false, component);
  }

  public static ActivitySubstitutesBinding bind(@NonNull View view) {
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
  public static ActivitySubstitutesBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySubstitutesBinding)bind(component, view, R.layout.activity_substitutes);
  }
}