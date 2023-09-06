// Generated by view binder compiler. Do not edit!
package com.unl.addressvalidator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.unl.addressvalidator.R;
import com.unl.addressvalidator.customview.internal.CheckableImageButton;
import java.lang.NullPointerException;
import java.lang.Override;

public final class LibDesignTextInputEndIconBinding implements ViewBinding {
  @NonNull
  private final CheckableImageButton rootView;

  @NonNull
  public final CheckableImageButton textInputEndIcon;

  private LibDesignTextInputEndIconBinding(@NonNull CheckableImageButton rootView,
      @NonNull CheckableImageButton textInputEndIcon) {
    this.rootView = rootView;
    this.textInputEndIcon = textInputEndIcon;
  }

  @Override
  @NonNull
  public CheckableImageButton getRoot() {
    return rootView;
  }

  @NonNull
  public static LibDesignTextInputEndIconBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LibDesignTextInputEndIconBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.lib_design_text_input_end_icon, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LibDesignTextInputEndIconBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    CheckableImageButton textInputEndIcon = (CheckableImageButton) rootView;

    return new LibDesignTextInputEndIconBinding((CheckableImageButton) rootView, textInputEndIcon);
  }
}