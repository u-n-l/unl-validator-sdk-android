package com.unl.addressvalidator.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000bH\u0017J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/unl/addressvalidator/ui/adapters/EntrancesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/unl/addressvalidator/ui/adapters/EntrancesAdapter$ViewHolder;", "resulttList", "Ljava/util/ArrayList;", "Lcom/example/roomdatabasewithmodelclassess/model/EntranceModel;", "Lkotlin/collections/ArrayList;", "itemClickListner", "Lcom/unl/addressvalidator/ui/interfaces/EntranceClickListner;", "(Ljava/util/ArrayList;Lcom/unl/addressvalidator/ui/interfaces/EntranceClickListner;)V", "selectedIndex", "", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "getItemCount", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "sdk_debug"})
public final class EntrancesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.unl.addressvalidator.ui.adapters.EntrancesAdapter.ViewHolder> {
    private final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> resulttList = null;
    private final com.unl.addressvalidator.ui.interfaces.EntranceClickListner itemClickListner = null;
    private int selectedIndex = -1;
    
    public EntrancesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> resulttList, @org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.interfaces.EntranceClickListner itemClickListner) {
        super();
    }
    
    public final int getSelectedIndex() {
        return 0;
    }
    
    public final void setSelectedIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.unl.addressvalidator.ui.adapters.EntrancesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.adapters.EntrancesAdapter.ViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/unl/addressvalidator/ui/adapters/EntrancesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "entrancePic", "Landroid/widget/ImageView;", "getEntrancePic", "()Landroid/widget/ImageView;", "imgCount", "Landroid/widget/TextView;", "getImgCount", "()Landroid/widget/TextView;", "ivDelete", "getIvDelete", "ivEdit", "getIvEdit", "tvEntranceID", "getTvEntranceID", "tvEntranceName", "getTvEntranceName", "sdk_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvEntranceName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvEntranceID = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivEdit = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView entrancePic = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivDelete = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView imgCount = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvEntranceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvEntranceID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvEdit() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getEntrancePic() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvDelete() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getImgCount() {
            return null;
        }
    }
}