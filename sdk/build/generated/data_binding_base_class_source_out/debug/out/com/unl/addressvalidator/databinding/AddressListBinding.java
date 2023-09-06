// Generated by view binder compiler. Do not edit!
package com.unl.addressvalidator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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

public final class AddressListBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final AppCompatTextView addressCount;

  @NonNull
  public final AppCompatEditText edtSearch;

  @NonNull
  public final RelativeLayout header;

  @NonNull
  public final AppCompatTextView headerTitle;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final RecyclerView rvAddress;

  private AddressListBinding(@NonNull RelativeLayout rootView,
      @NonNull AppCompatTextView addressCount, @NonNull AppCompatEditText edtSearch,
      @NonNull RelativeLayout header, @NonNull AppCompatTextView headerTitle,
      @NonNull AppCompatImageView ivClose, @NonNull LinearLayout linearLayout2,
      @NonNull RecyclerView rvAddress) {
    this.rootView = rootView;
    this.addressCount = addressCount;
    this.edtSearch = edtSearch;
    this.header = header;
    this.headerTitle = headerTitle;
    this.ivClose = ivClose;
    this.linearLayout2 = linearLayout2;
    this.rvAddress = rvAddress;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddressListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddressListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.address_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddressListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addressCount;
      AppCompatTextView addressCount = ViewBindings.findChildViewById(rootView, id);
      if (addressCount == null) {
        break missingId;
      }

      id = R.id.edtSearch;
      AppCompatEditText edtSearch = ViewBindings.findChildViewById(rootView, id);
      if (edtSearch == null) {
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

      id = R.id.rvAddress;
      RecyclerView rvAddress = ViewBindings.findChildViewById(rootView, id);
      if (rvAddress == null) {
        break missingId;
      }

      return new AddressListBinding((RelativeLayout) rootView, addressCount, edtSearch, header,
          headerTitle, ivClose, linearLayout2, rvAddress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
