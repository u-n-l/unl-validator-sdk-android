package com.unl.addressvalidator.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nH\u0017J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/unl/addressvalidator/ui/adapters/AddressListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/unl/addressvalidator/ui/adapters/AddressListAdapter$ViewHolder;", "resulttList", "", "Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "itemClickListner", "Lcom/unl/addressvalidator/ui/interfaces/AddressItemClickListner;", "(Ljava/util/List;Lcom/unl/addressvalidator/ui/interfaces/AddressItemClickListner;)V", "selectedIndex", "", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "getItemCount", "onBindViewHolder", "", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "sdk_debug"})
public final class AddressListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.unl.addressvalidator.ui.adapters.AddressListAdapter.ViewHolder> {
    private final java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel> resulttList = null;
    private final com.unl.addressvalidator.ui.interfaces.AddressItemClickListner itemClickListner = null;
    private int selectedIndex = -1;
    
    public AddressListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel> resulttList, @org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.interfaces.AddressItemClickListner itemClickListner) {
        super();
    }
    
    public final int getSelectedIndex() {
        return 0;
    }
    
    public final void setSelectedIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.unl.addressvalidator.ui.adapters.AddressListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.adapters.AddressListAdapter.ViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/unl/addressvalidator/ui/adapters/AddressListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "addressPic", "Landroid/widget/ImageView;", "getAddressPic", "()Landroid/widget/ImageView;", "imgCount", "Landroid/widget/TextView;", "getImgCount", "()Landroid/widget/TextView;", "ivAdressType", "getIvAdressType", "llMain", "Landroid/widget/LinearLayout;", "getLlMain", "()Landroid/widget/LinearLayout;", "tvAddress", "getTvAddress", "tvAddressDetails", "getTvAddressDetails", "sdk_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvAddressDetails = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.LinearLayout llMain = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivAdressType = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView addressPic = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView imgCount = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvAddress = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAddressDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlMain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvAdressType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getAddressPic() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getImgCount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAddress() {
            return null;
        }
    }
}