package com.unl.addressvalidator.ui.imagepicker.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u0006H\u0016J\u0006\u0010\u000e\u001a\u00020\u0006J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bJ\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0012H&J\u0014\u0010\u001a\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\u001c\u001a\u00020\u0012H&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/adapter/ImagesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/unl/addressvalidator/ui/imagepicker/adapter/ImagesAdapter$ImageViewHolder;", "context", "Landroid/content/Context;", "maxSelectionLimit", "", "list", "", "Lcom/unl/addressvalidator/ui/imagepicker/model/ImageModel;", "(Landroid/content/Context;ILjava/util/List;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "getItemCount", "getSelectedImageCount", "getSelectedUris", "Landroid/net/Uri;", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showMessageForMaxSelection", "updateList", "newList", "updateNextButton", "ImageViewHolder", "sdk_debug"})
public abstract class ImagesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.unl.addressvalidator.ui.imagepicker.adapter.ImagesAdapter.ImageViewHolder> {
    private final android.content.Context context = null;
    private final int maxSelectionLimit = 0;
    private final java.util.List<com.unl.addressvalidator.ui.imagepicker.model.ImageModel> list = null;
    private final android.view.LayoutInflater layoutInflater = null;
    
    public ImagesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int maxSelectionLimit, @org.jetbrains.annotations.NotNull()
    java.util.List<com.unl.addressvalidator.ui.imagepicker.model.ImageModel> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.unl.addressvalidator.ui.imagepicker.adapter.ImagesAdapter.ImageViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.imagepicker.adapter.ImagesAdapter.ImageViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public abstract void updateNextButton();
    
    public abstract void showMessageForMaxSelection();
    
    public final int getSelectedImageCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.net.Uri> getSelectedUris() {
        return null;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.unl.addressvalidator.ui.imagepicker.model.ImageModel> newList) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/adapter/ImagesAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/unl/addressvalidator/ui/imagepicker/adapter/ImagesAdapter;Landroid/view/View;)V", "binding", "Lcom/unl/addressvalidator/databinding/LayoutImageItemBinding;", "getBinding", "()Lcom/unl/addressvalidator/databinding/LayoutImageItemBinding;", "sdk_debug"})
    public final class ImageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.unl.addressvalidator.databinding.LayoutImageItemBinding binding = null;
        
        public ImageViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.unl.addressvalidator.databinding.LayoutImageItemBinding getBinding() {
            return null;
        }
    }
}