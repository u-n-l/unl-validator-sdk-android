// Generated by view binder compiler. Do not edit!
package com.unl.addressvalidator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.unl.addressvalidator.R;
import com.unl.map.sdk.views.UnlMapView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEntrancesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AddEntrancePopupBinding addEntrances;

  @NonNull
  public final AppCompatImageView backBtn;

  @NonNull
  public final RelativeLayout bottomDialog;

  @NonNull
  public final CardView cvPintHint;

  @NonNull
  public final RelativeLayout header;

  @NonNull
  public final AppCompatTextView headerTitle;

  @NonNull
  public final ImageView hidePinHint;

  @NonNull
  public final UnlMapView mapView;

  @NonNull
  public final AppCompatTextView pinHint;

  @NonNull
  public final ProgressBar progressBar;

  private ActivityEntrancesBinding(@NonNull ConstraintLayout rootView,
      @NonNull AddEntrancePopupBinding addEntrances, @NonNull AppCompatImageView backBtn,
      @NonNull RelativeLayout bottomDialog, @NonNull CardView cvPintHint,
      @NonNull RelativeLayout header, @NonNull AppCompatTextView headerTitle,
      @NonNull ImageView hidePinHint, @NonNull UnlMapView mapView,
      @NonNull AppCompatTextView pinHint, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.addEntrances = addEntrances;
    this.backBtn = backBtn;
    this.bottomDialog = bottomDialog;
    this.cvPintHint = cvPintHint;
    this.header = header;
    this.headerTitle = headerTitle;
    this.hidePinHint = hidePinHint;
    this.mapView = mapView;
    this.pinHint = pinHint;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEntrancesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEntrancesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_entrances, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEntrancesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addEntrances;
      View addEntrances = ViewBindings.findChildViewById(rootView, id);
      if (addEntrances == null) {
        break missingId;
      }
      AddEntrancePopupBinding binding_addEntrances = AddEntrancePopupBinding.bind(addEntrances);

      id = R.id.backBtn;
      AppCompatImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.bottomDialog;
      RelativeLayout bottomDialog = ViewBindings.findChildViewById(rootView, id);
      if (bottomDialog == null) {
        break missingId;
      }

      id = R.id.cvPintHint;
      CardView cvPintHint = ViewBindings.findChildViewById(rootView, id);
      if (cvPintHint == null) {
        break missingId;
      }

      id = R.id.header;
      RelativeLayout header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.headerTitle;
      AppCompatTextView headerTitle = ViewBindings.findChildViewById(rootView, id);
      if (headerTitle == null) {
        break missingId;
      }

      id = R.id.hidePinHint;
      ImageView hidePinHint = ViewBindings.findChildViewById(rootView, id);
      if (hidePinHint == null) {
        break missingId;
      }

      id = R.id.mapView;
      UnlMapView mapView = ViewBindings.findChildViewById(rootView, id);
      if (mapView == null) {
        break missingId;
      }

      id = R.id.pinHint;
      AppCompatTextView pinHint = ViewBindings.findChildViewById(rootView, id);
      if (pinHint == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      return new ActivityEntrancesBinding((ConstraintLayout) rootView, binding_addEntrances,
          backBtn, bottomDialog, cvPintHint, header, headerTitle, hidePinHint, mapView, pinHint,
          progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}