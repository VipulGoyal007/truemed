// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.intellihealth.salt.models.OtpCardModel;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.ButtonLite;
import com.intellihealth.salt.views.cards.OtpCard;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.presentation.viewmodel.LoginViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginOtpBinding extends ViewDataBinding {
  @NonNull
  public final FlexboxLayout flexboxLoginTermsConditions;

  @NonNull
  public final OtpCard loginOTPView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView tvSigning;

  @NonNull
  public final ButtonLite tvTermsConditions;

  @Bindable
  protected LoginViewModel mViewModel;

  @Bindable
  protected OtpCardModel mOtpCardData;

  protected FragmentLoginOtpBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FlexboxLayout flexboxLoginTermsConditions, OtpCard loginOTPView, ProgressBar progressBar,
      TextView tvSigning, ButtonLite tvTermsConditions) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flexboxLoginTermsConditions = flexboxLoginTermsConditions;
    this.loginOTPView = loginOTPView;
    this.progressBar = progressBar;
    this.tvSigning = tvSigning;
    this.tvTermsConditions = tvTermsConditions;
  }

  public abstract void setViewModel(@Nullable LoginViewModel viewModel);

  @Nullable
  public LoginViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setOtpCardData(@Nullable OtpCardModel otpCardData);

  @Nullable
  public OtpCardModel getOtpCardData() {
    return mOtpCardData;
  }

  @NonNull
  public static FragmentLoginOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login_otp, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginOtpBinding>inflateInternal(inflater, R.layout.fragment_login_otp, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginOtpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login_otp, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginOtpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginOtpBinding>inflateInternal(inflater, R.layout.fragment_login_otp, null, false, component);
  }

  public static FragmentLoginOtpBinding bind(@NonNull View view) {
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
  public static FragmentLoginOtpBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginOtpBinding)bind(component, view, R.layout.fragment_login_otp);
  }
}