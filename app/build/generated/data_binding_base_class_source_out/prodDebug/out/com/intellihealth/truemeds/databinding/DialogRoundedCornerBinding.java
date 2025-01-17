// Generated by data binding compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.truemeds.R;
import com.intellihealth.truemeds.data.model.home.PopUpModel;
import com.intellihealth.truemeds.presentation.callbacks.PopUpDialogCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DialogRoundedCornerBinding extends ViewDataBinding {
  @NonNull
  public final Button btnAction;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final AppCompatImageView ivPopup;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvMessage;

  @NonNull
  public final TextView tvSpanMessage;

  @Bindable
  protected PopUpModel mModel;

  @Bindable
  protected PopUpDialogCallback mCallback;

  protected DialogRoundedCornerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnAction, AppCompatImageView ivClose, AppCompatImageView ivPopup, TextView tvHeader,
      TextView tvMessage, TextView tvSpanMessage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAction = btnAction;
    this.ivClose = ivClose;
    this.ivPopup = ivPopup;
    this.tvHeader = tvHeader;
    this.tvMessage = tvMessage;
    this.tvSpanMessage = tvSpanMessage;
  }

  public abstract void setModel(@Nullable PopUpModel model);

  @Nullable
  public PopUpModel getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable PopUpDialogCallback callback);

  @Nullable
  public PopUpDialogCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static DialogRoundedCornerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_rounded_corner, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DialogRoundedCornerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DialogRoundedCornerBinding>inflateInternal(inflater, R.layout.dialog_rounded_corner, root, attachToRoot, component);
  }

  @NonNull
  public static DialogRoundedCornerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.dialog_rounded_corner, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DialogRoundedCornerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DialogRoundedCornerBinding>inflateInternal(inflater, R.layout.dialog_rounded_corner, null, false, component);
  }

  public static DialogRoundedCornerBinding bind(@NonNull View view) {
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
  public static DialogRoundedCornerBinding bind(@NonNull View view, @Nullable Object component) {
    return (DialogRoundedCornerBinding)bind(component, view, R.layout.dialog_rounded_corner);
  }
}
