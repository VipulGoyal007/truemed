// Generated by view binder compiler. Do not edit!
package com.intellihealth.truemeds.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.intellihealth.truemeds.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class CustomNotificationViewCollapsedBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView collapsedNotificationTitle;

  private CustomNotificationViewCollapsedBinding(@NonNull TextView rootView,
      @NonNull TextView collapsedNotificationTitle) {
    this.rootView = rootView;
    this.collapsedNotificationTitle = collapsedNotificationTitle;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomNotificationViewCollapsedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomNotificationViewCollapsedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_notification_view_collapsed, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomNotificationViewCollapsedBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView collapsedNotificationTitle = (TextView) rootView;

    return new CustomNotificationViewCollapsedBinding((TextView) rootView,
        collapsedNotificationTitle);
  }
}
