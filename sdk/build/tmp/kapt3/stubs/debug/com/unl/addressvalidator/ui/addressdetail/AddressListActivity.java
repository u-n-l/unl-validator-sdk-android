package com.unl.addressvalidator.ui.addressdetail;

import java.lang.System;

/**
 * [AddressListActivity] provide functionality to show your address
 * You can see the details of each address
 * @constructor
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u001dJ\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001fJ\u0014\u0010#\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0$J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u001dH\u0016J\u0012\u0010\'\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"Lcom/unl/addressvalidator/ui/addressdetail/AddressListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/unl/addressvalidator/ui/interfaces/AddressItemClickListner;", "()V", "binding", "Lcom/unl/addressvalidator/databinding/ActivityAddressListBinding;", "getBinding", "()Lcom/unl/addressvalidator/databinding/ActivityAddressListBinding;", "setBinding", "(Lcom/unl/addressvalidator/databinding/ActivityAddressListBinding;)V", "database", "Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "getDatabase", "()Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "setDatabase", "(Lcom/unl/addressvalidator/database/UnlAddressDatabase;)V", "deliveryHoursAdapter", "Lcom/unl/addressvalidator/ui/adapters/DeliveryHoursAdapter;", "getDeliveryHoursAdapter", "()Lcom/unl/addressvalidator/ui/adapters/DeliveryHoursAdapter;", "setDeliveryHoursAdapter", "(Lcom/unl/addressvalidator/ui/adapters/DeliveryHoursAdapter;)V", "viewModel", "Lcom/unl/addressvalidator/ui/addressdetail/AddressViewModel;", "getViewModel", "()Lcom/unl/addressvalidator/ui/addressdetail/AddressViewModel;", "setViewModel", "(Lcom/unl/addressvalidator/ui/addressdetail/AddressViewModel;)V", "addressItemClick", "", "createAddressModel", "Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "getAddressCreated", "initAddressDetails", "addresses", "initAddressList", "", "initiateViewModel", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sdk_debug"})
public final class AddressListActivity extends androidx.appcompat.app.AppCompatActivity implements com.unl.addressvalidator.ui.interfaces.AddressItemClickListner {
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.databinding.ActivityAddressListBinding binding;
    public com.unl.addressvalidator.ui.addressdetail.AddressViewModel viewModel;
    public com.unl.addressvalidator.database.UnlAddressDatabase database;
    public com.unl.addressvalidator.ui.adapters.DeliveryHoursAdapter deliveryHoursAdapter;
    
    public AddressListActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.databinding.ActivityAddressListBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.databinding.ActivityAddressListBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.addressdetail.AddressViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.addressdetail.AddressViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.database.UnlAddressDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.database.UnlAddressDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.adapters.DeliveryHoursAdapter getDeliveryHoursAdapter() {
        return null;
    }
    
    public final void setDeliveryHoursAdapter(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.adapters.DeliveryHoursAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initiateViewModel() {
    }
    
    public final void getAddressCreated() {
    }
    
    public final void initAddressList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel> addresses) {
    }
    
    public final void initAddressDetails(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.dbmodel.CreateAddressModel addresses) {
    }
    
    @java.lang.Override()
    public void addressItemClick(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.dbmodel.CreateAddressModel createAddressModel) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
}