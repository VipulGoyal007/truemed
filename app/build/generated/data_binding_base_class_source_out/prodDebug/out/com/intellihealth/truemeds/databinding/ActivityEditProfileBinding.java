// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.MobileSectionHeaders;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.salt.views.edittext.InputFieldLayout;
import com.intellihealth.salt.views.radiofield.RadioList;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.EditProfileDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityEditProfileBinding extends ViewDataBinding {
  @NonNull
  public final Button btnSaveProfile;

  @NonNull
  public final InputFieldLayout edtAge;

  @NonNull
  public final InputFieldLayout edtEmail;

  @NonNull
  public final InputFieldLayout edtFirstName;

  @NonNull
  public final InputFieldLayout edtLastName;

  @NonNull
  public final InputFieldLayout edtMobileNumber;

  @NonNull
  public final ConstraintLayout genderCl;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RadioList rvListHorizontal;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final TextView selfGenderValidation;

  @NonNull
  public final TextView txtGender;

  @NonNull
  public final MobileSectionHeaders txtHeaderEditProfile;

  @Bindable
  protected EditProfileDetailViewModel mViewModel;

  protected ActivityEditProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnSaveProfile, InputFieldLayout edtAge, InputFieldLayout edtEmail,
      InputFieldLayout edtFirstName, InputFieldLayout edtLastName, InputFieldLayout edtMobileNumber,
      ConstraintLayout genderCl, ProgressBar progressBar, RadioList rvListHorizontal,
      NestedScrollView scrollView, TextView selfGenderValidation, TextView txtGender,
      MobileSectionHeaders txtHeaderEditProfile) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSaveProfile = btnSaveProfile;
    this.edtAge = edtAge;
    this.edtEmail = edtEmail;
    this.edtFirstName = edtFirstName;
    this.edtLastName = edtLastName;
    this.edtMobileNumber = edtMobileNumber;
    this.genderCl = genderCl;
    this.progressBar = progressBar;
    this.rvListHorizontal = rvListHorizontal;
    this.scrollView = scrollView;
    this.selfGenderValidation = selfGenderValidation;
    this.txtGender = txtGender;
    this.txtHeaderEditProfile = txtHeaderEditProfile;
  }

  public abstract void setViewModel(@Nullable EditProfileDetailViewModel viewModel);

  @Nullable
  public EditProfileDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityEditProfileBinding>inflateInternal(inflater, R.layout.activity_edit_profile, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_edit_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityEditProfileBinding>inflateInternal(inflater, R.layout.activity_edit_profile, null, false, component);
  }

  public static ActivityEditProfileBinding bind(@NonNull View view) {
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
  public static ActivityEditProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityEditProfileBinding)bind(component, view, R.layout.activity_edit_profile);
  }
}
