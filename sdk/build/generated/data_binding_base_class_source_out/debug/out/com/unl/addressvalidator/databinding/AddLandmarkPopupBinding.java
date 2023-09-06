// Generated by view binder compiler. Do not edit!
package com.unl.addressvalidator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.unl.addressvalidator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddLandmarkPopupBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final AppCompatEditText edtSearch;

  @NonNull
  public final AppCompatTextView headerTitle;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final RecyclerView rvLandmark;

  @NonNull
  public final RecyclerView rvSearchResult;

  @NonNull
  public final AppCompatTextView tvConfirm;

  @NonNull
  public final TextView tvSkip;

  private AddLandmarkPopupBinding(@NonNull RelativeLayout rootView,
      @NonNull LinearLayout bottomLayout, @NonNull AppCompatEditText edtSearch,
      @NonNull AppCompatTextView headerTitle, @NonNull AppCompatImageView ivClose,
      @NonNull LinearLayout linearLayout2, @NonNull RecyclerView rvLandmark,
      @NonNull RecyclerView rvSearchResult, @NonNull AppCompatTextView tvConfirm,
      @NonNull TextView tvSkip) {
    this.rootView = rootView;
    this.bottomLayout = bottomLayout;
    this.edtSearch = edtSearch;
    this.headerTitle = headerTitle;
    this.ivClose = ivClose;
    this.linearLayout2 = linearLayout2;
    this.rvLandmark = rvLandmark;
    this.rvSearchResult = rvSearchResult;
    this.tvConfirm = tvConfirm;
    this.tvSkip = tvSkip;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddLandmarkPopupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddLandmarkPopupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_landmark_popup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddLandmarkPopupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomLayout;
      LinearLayout bottomLayout = ViewBindings.findChildViewById(rootView, id);
      if (bottomLayout == null) {
        break missingId;
      }

      id = R.id.edtSearch;
      AppCompatEditText edtSearch = ViewBindings.findChildViewById(rootView, id);
      if (edtSearch == null) {
        break missingId;
      }

      id = R.id.headerTitle;
      AppCompatTextView headerTitle = ViewBindings.findChildViewById(rootView, id);
      if (headerTitle == null) {
        break missingId;
      }

      id = R.id.ivClose;
      AppCompatImageView ivClose = ViewBindings.findChildViewById(rootView, id);
      if (ivClose == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.rvLandmark;
      RecyclerView rvLandmark = ViewBindings.findChildViewById(rootView, id);
      if (rvLandmark == null) {
        break missingId;
      }

      id = R.id.rvSearchResult;
      RecyclerView rvSearchResult = ViewBindings.findChildViewById(rootView, id);
      if (rvSearchResult == null) {
        break missingId;
      }

      id = R.id.tvConfirm;
      AppCompatTextView tvConfirm = ViewBindings.findChildViewById(rootView, id);
      if (tvConfirm == null) {
        break missingId;
      }

      id = R.id.tvSkip;
      TextView tvSkip = ViewBindings.findChildViewById(rootView, id);
      if (tvSkip == null) {
        break missingId;
      }

      return new AddLandmarkPopupBinding((RelativeLayout) rootView, bottomLayout, edtSearch,
          headerTitle, ivClose, linearLayout2, rvLandmark, rvSearchResult, tvConfirm, tvSkip);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}