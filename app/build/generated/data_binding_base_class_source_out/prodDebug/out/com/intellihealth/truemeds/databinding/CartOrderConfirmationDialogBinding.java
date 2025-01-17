// Generated by view binder compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.intellihealth.salt.views.TextView;
import com.intellihealth.truemeds.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CartOrderConfirmationDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView tvCartConfirmationMsg;

  @NonNull
  public final TextView tvNo;

  @NonNull
  public final TextView tvYes;

  private CartOrderConfirmationDialogBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView tvCartConfirmationMsg, @NonNull TextView tvNo, @NonNull TextView tvYes) {
    this.rootView = rootView;
    this.tvCartConfirmationMsg = tvCartConfirmationMsg;
    this.tvNo = tvNo;
    this.tvYes = tvYes;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CartOrderConfirmationDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CartOrderConfirmationDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cart_order_confirmation_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CartOrderConfirmationDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvCartConfirmationMsg;
      TextView tvCartConfirmationMsg = ViewBindings.findChildViewById(rootView, id);
      if (tvCartConfirmationMsg == null) {
        break missingId;
      }

      id = R.id.tvNo;
      TextView tvNo = ViewBindings.findChildViewById(rootView, id);
      if (tvNo == null) {
        break missingId;
      }

      id = R.id.tvYes;
      TextView tvYes = ViewBindings.findChildViewById(rootView, id);
      if (tvYes == null) {
        break missingId;
      }

      return new CartOrderConfirmationDialogBinding((ConstraintLayout) rootView,
          tvCartConfirmationMsg, tvNo, tvYes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
