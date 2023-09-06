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

public final class EnableLocationPopupBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatTextView entranceDetails;

  @NonNull
  public final AppCompatTextView headerTitle;

  @NonNull
  public final AppCompatTextView tvSettings;

  @NonNull
  public final TextView tvSkip;

  private EnableLocationPopupBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatTextView entranceDetails, @NonNull AppCompatTextView headerTitle,
      @NonNull AppCompatTextView tvSettings, @NonNull TextView tvSkip) {
    this.rootView = rootView;
    this.entranceDetails = entranceDetails;
    this.headerTitle = headerTitle;
    this.tvSettings = tvSettings;
    this.tvSkip = tvSkip;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EnableLocationPopupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EnableLocationPopupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.enable_location_popup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EnableLocationPopupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.entranceDetails;
      AppCompatTextView entranceDetails = ViewBindings.findChildViewById(rootView, id);
      if (entranceDetails == null) {
        break missingId;
      }

      id = R.id.headerTitle;
      AppCompatTextView headerTitle = ViewBindings.findChildViewById(rootView, id);
      if (headerTitle == null) {
        break missingId;
      }

      id = R.id.tvSettings;
      AppCompatTextView tvSettings = ViewBindings.findChildViewById(rootView, id);
      if (tvSettings == null) {
        break missingId;
      }

      id = R.id.tvSkip;
      TextView tvSkip = ViewBindings.findChildViewById(rootView, id);
      if (tvSkip == null) {
        break missingId;
      }

      return new EnableLocationPopupBinding((RelativeLayout) rootView, entranceDetails, headerTitle,
          tvSettings, tvSkip);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
