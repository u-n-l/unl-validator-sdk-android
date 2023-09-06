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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.unl.addressvalidator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddPicturesPopupBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatTextView addressType;

  @NonNull
  public final AppCompatTextView headerTitle;

  @NonNull
  public final AppCompatTextView removePicture;

  @NonNull
  public final RecyclerView rvAddPictures;

  @NonNull
  public final TextView tvAddPhotos;

  @NonNull
  public final TextView tvHomeLand1;

  @NonNull
  public final AppCompatTextView tvSave;

  @NonNull
  public final TextView tvSkip;

  private AddPicturesPopupBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatTextView addressType, @NonNull AppCompatTextView headerTitle,
      @NonNull AppCompatTextView removePicture, @NonNull RecyclerView rvAddPictures,
      @NonNull TextView tvAddPhotos, @NonNull TextView tvHomeLand1,
      @NonNull AppCompatTextView tvSave, @NonNull TextView tvSkip) {
    this.rootView = rootView;
    this.addressType = addressType;
    this.headerTitle = headerTitle;
    this.removePicture = removePicture;
    this.rvAddPictures = rvAddPictures;
    this.tvAddPhotos = tvAddPhotos;
    this.tvHomeLand1 = tvHomeLand1;
    this.tvSave = tvSave;
    this.tvSkip = tvSkip;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddPicturesPopupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddPicturesPopupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_pictures_popup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddPicturesPopupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addressType;
      AppCompatTextView addressType = ViewBindings.findChildViewById(rootView, id);
      if (addressType == null) {
        break missingId;
      }

      id = R.id.headerTitle;
      AppCompatTextView headerTitle = ViewBindings.findChildViewById(rootView, id);
      if (headerTitle == null) {
        break missingId;
      }

      id = R.id.removePicture;
      AppCompatTextView removePicture = ViewBindings.findChildViewById(rootView, id);
      if (removePicture == null) {
        break missingId;
      }

      id = R.id.rvAddPictures;
      RecyclerView rvAddPictures = ViewBindings.findChildViewById(rootView, id);
      if (rvAddPictures == null) {
        break missingId;
      }

      id = R.id.tvAddPhotos;
      TextView tvAddPhotos = ViewBindings.findChildViewById(rootView, id);
      if (tvAddPhotos == null) {
        break missingId;
      }

      id = R.id.tv_homeLand1;
      TextView tvHomeLand1 = ViewBindings.findChildViewById(rootView, id);
      if (tvHomeLand1 == null) {
        break missingId;
      }

      id = R.id.tvSave;
      AppCompatTextView tvSave = ViewBindings.findChildViewById(rootView, id);
      if (tvSave == null) {
        break missingId;
      }

      id = R.id.tvSkip;
      TextView tvSkip = ViewBindings.findChildViewById(rootView, id);
      if (tvSkip == null) {
        break missingId;
      }

      return new AddPicturesPopupBinding((RelativeLayout) rootView, addressType, headerTitle,
          removePicture, rvAddPictures, tvAddPhotos, tvHomeLand1, tvSave, tvSkip);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}