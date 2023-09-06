// Generated by view binder compiler. Do not edit!
package com.unl.addressvalidator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.unl.addressvalidator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EditLocationPopupBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatTextView headerTitle;

  @NonNull
  public final TextView tvKeep;

  @NonNull
  public final AppCompatTextView tvUpdate;

  private EditLocationPopupBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatTextView headerTitle, @NonNull TextView tvKeep,
      @NonNull AppCompatTextView tvUpdate) {
    this.rootView = rootView;
    this.headerTitle = headerTitle;
    this.tvKeep = tvKeep;
    this.tvUpdate = tvUpdate;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EditLocationPopupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EditLocationPopupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.edit_location_popup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EditLocationPopupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.headerTitle;
      AppCompatTextView headerTitle = ViewBindings.findChildViewById(rootView, id);
      if (headerTitle == null) {
        break missingId;
      }

      id = R.id.tvKeep;
      TextView tvKeep = ViewBindings.findChildViewById(rootView, id);
      if (tvKeep == null) {
        break missingId;
      }

      id = R.id.tvUpdate;
      AppCompatTextView tvUpdate = ViewBindings.findChildViewById(rootView, id);
      if (tvUpdate == null) {
        break missingId;
      }

      return new EditLocationPopupBinding((RelativeLayout) rootView, headerTitle, tvKeep, tvUpdate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
