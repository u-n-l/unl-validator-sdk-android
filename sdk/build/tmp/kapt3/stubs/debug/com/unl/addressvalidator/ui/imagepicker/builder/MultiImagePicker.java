package com.unl.addressvalidator.ui.imagepicker.builder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/builder/MultiImagePicker;", "", "()V", "Builder", "Companion", "Result", "sdk_debug"})
public final class MultiImagePicker {
    @org.jetbrains.annotations.NotNull()
    public static final com.unl.addressvalidator.ui.imagepicker.builder.MultiImagePicker.Companion Companion = null;
    public static final int REQUEST_PICK_MULTI_IMAGES = 369;
    
    public MultiImagePicker() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nJ\u0012\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\fH\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/builder/MultiImagePicker$Builder;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "()V", "maxSelectionLimit", "", "showAlbums", "", "useActivity", "open", "", "setSelectionLimit", "maxLimit", "showAlbum", "show", "sdk_debug"})
    public static final class Builder {
        private android.app.Activity activity;
        private androidx.fragment.app.Fragment fragment;
        private boolean useActivity = true;
        private boolean showAlbums = false;
        private int maxSelectionLimit = 1;
        
        private Builder() {
            super();
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            super();
        }
        
        public Builder(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            super();
        }
        
        /**
         * If you will not provide or will provide more than 30, it will set max limit to 30
         */
        @org.jetbrains.annotations.NotNull()
        public final com.unl.addressvalidator.ui.imagepicker.builder.MultiImagePicker.Builder setSelectionLimit(int maxLimit) {
            return null;
        }
        
        /**
         * This functionality is in progress so true/false will not work, and default is false
         */
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.VisibleForTesting()
        public final com.unl.addressvalidator.ui.imagepicker.builder.MultiImagePicker.Builder showAlbum(boolean show) {
            return null;
        }
        
        public final void open() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0006j\b\u0012\u0004\u0012\u00020\n`\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/builder/MultiImagePicker$Result;", "", "data", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "getImageList", "Ljava/util/ArrayList;", "Landroid/net/Uri;", "Lkotlin/collections/ArrayList;", "getImageListAsAbsolutePath", "", "context", "Landroid/content/Context;", "isSuccess", "", "sdk_debug"})
    public static final class Result {
        private final android.content.Intent data = null;
        
        public Result(@org.jetbrains.annotations.Nullable()
        android.content.Intent data) {
            super();
        }
        
        public final boolean isSuccess() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<android.net.Uri> getImageList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.String> getImageListAsAbsolutePath(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/builder/MultiImagePicker$Companion;", "", "()V", "REQUEST_PICK_MULTI_IMAGES", "", "with", "Lcom/unl/addressvalidator/ui/imagepicker/builder/MultiImagePicker$Builder;", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "sdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.unl.addressvalidator.ui.imagepicker.builder.MultiImagePicker.Builder with(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.unl.addressvalidator.ui.imagepicker.builder.MultiImagePicker.Builder with(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            return null;
        }
    }
}