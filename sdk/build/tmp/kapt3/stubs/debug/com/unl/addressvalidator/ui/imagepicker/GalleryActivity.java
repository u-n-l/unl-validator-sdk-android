package com.unl.addressvalidator.ui.imagepicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/GalleryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/unl/addressvalidator/databinding/ActivityGalleryBinding;", "imagesAdapter", "Lcom/unl/addressvalidator/ui/imagepicker/adapter/ImagesAdapter;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "maxSelectionLimit", "", "showAlbums", "", "fetchImagesFromDevice", "", "getImagesUri", "", "Lcom/unl/addressvalidator/ui/imagepicker/model/ImageModel;", "initParams", "initRecyclerView", "initToolbar", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setSelectedImageResult", "updateFAButtonAndTitle", "sdk_debug"})
public final class GalleryActivity extends androidx.appcompat.app.AppCompatActivity {
    private int maxSelectionLimit = 0;
    private boolean showAlbums = false;
    private androidx.recyclerview.widget.GridLayoutManager layoutManager;
    private com.unl.addressvalidator.databinding.ActivityGalleryBinding binding;
    private com.unl.addressvalidator.ui.imagepicker.adapter.ImagesAdapter imagesAdapter;
    
    public GalleryActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initToolbar() {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void setSelectedImageResult() {
    }
    
    private final void fetchImagesFromDevice() {
    }
    
    private final java.util.List<com.unl.addressvalidator.ui.imagepicker.model.ImageModel> getImagesUri() {
        return null;
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    private final void updateFAButtonAndTitle() {
    }
    
    private final void initParams() {
    }
}