// Generated by view binder compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.salt.views.buttons.Button;
import com.intellihealth.truemeds.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogWithSingleButtonBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnOk;

  @NonNull
  public final AppCompatImageView ivEmptyState;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvMessage;

  private DialogWithSingleButtonBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnOk,
      @NonNull AppCompatImageView ivEmptyState, @NonNull TextView tvHeader,
      @NonNull TextView tvMessage) {
    this.rootView = rootView;
    this.btnOk = btnOk;
    this.ivEmptyState = ivEmptyState;
    this.tvHeader = tvHeader;
    this.tvMessage = tvMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogWithSingleButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogWithSingleButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_with_single_button, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogWithSingleButtonBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnOk;
      Button btnOk = ViewBindings.findChildViewById(rootView, id);
      if (btnOk == null) {
        break missingId;
      }

      id = R.id.ivEmptyState;
      AppCompatImageView ivEmptyState = ViewBindings.findChildViewById(rootView, id);
      if (ivEmptyState == null) {
        break missingId;
      }

      id = R.id.tvHeader;
      TextView tvHeader = ViewBindings.findChildViewById(rootView, id);
      if (tvHeader == null) {
        break missingId;
      }

      id = R.id.tvMessage;
      TextView tvMessage = ViewBindings.findChildViewById(rootView, id);
      if (tvMessage == null) {
        break missingId;
      }

      return new DialogWithSingleButtonBinding((ConstraintLayout) rootView, btnOk, ivEmptyState,
          tvHeader, tvMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
