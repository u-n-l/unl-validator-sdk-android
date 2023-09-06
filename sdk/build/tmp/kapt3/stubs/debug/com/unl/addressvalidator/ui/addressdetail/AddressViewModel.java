package com.unl.addressvalidator.ui.addressdetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/unl/addressvalidator/ui/addressdetail/AddressViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "addresslist", "Landroidx/lifecycle/LiveData;", "", "Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "getAddresslist", "()Landroidx/lifecycle/LiveData;", "setAddresslist", "(Landroidx/lifecycle/LiveData;)V", "getAddress", "", "database", "Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "sdk_debug"})
public final class AddressViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel>> addresslist;
    
    public AddressViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel>> getAddresslist() {
        return null;
    }
    
    public final void setAddresslist(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel>> p0) {
    }
    
    public final void getAddress(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.database.UnlAddressDatabase database) {
    }
}