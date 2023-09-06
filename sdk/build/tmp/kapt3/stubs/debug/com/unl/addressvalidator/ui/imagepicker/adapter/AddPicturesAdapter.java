package com.unl.addressvalidator.ui.imagepicker.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter$ViewHolder;", "dataList", "Ljava/util/ArrayList;", "Lcom/unl/addressvalidator/ui/imagepicker/data/AddPicturesModel;", "Lkotlin/collections/ArrayList;", "addressImageClickLlistner", "Lcom/unl/addressvalidator/ui/interfaces/AddressImageClickListner;", "(Ljava/util/ArrayList;Lcom/unl/addressvalidator/ui/interfaces/AddressImageClickListner;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "position", "getPosition", "setPosition", "removedIndex", "getRemovedIndex", "()Ljava/util/ArrayList;", "setRemovedIndex", "(Ljava/util/ArrayList;)V", "getItemCount", "onBindViewHolder", "", "holder", "index", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "sdk_debug"})
public final class AddPicturesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter.ViewHolder> {
    private final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> dataList = null;
    private final com.unl.addressvalidator.ui.interfaces.AddressImageClickListner addressImageClickLlistner = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> removedIndex;
    private int count = 0;
    private int position = 0;
    
    public AddPicturesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> dataList, @org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.interfaces.AddressImageClickListner addressImageClickLlistner) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> getRemovedIndex() {
        return null;
    }
    
    public final void setRemovedIndex(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter.ViewHolder holder, int index) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;Landroid/view/View;)V", "checkBox", "Landroid/widget/CheckBox;", "imageView", "Landroid/widget/ImageView;", "bind", "", "data", "Lcom/unl/addressvalidator/ui/imagepicker/data/AddPicturesModel;", "sdk_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imageView = null;
        private final android.widget.CheckBox checkBox = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel data) {
        }
    }
}