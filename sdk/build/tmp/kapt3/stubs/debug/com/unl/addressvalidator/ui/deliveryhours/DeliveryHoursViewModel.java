package com.unl.addressvalidator.ui.deliveryhours;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0019\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/unl/addressvalidator/ui/deliveryhours/DeliveryHoursViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "imageUploadResponseData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/unl/addressvalidator/network/ApiCallBack;", "Lcom/example/roomdatabasewithmodelclassess/model/ImageUploadResponse;", "getImageUploadResponseData", "()Landroidx/lifecycle/MutableLiveData;", "handleImageUploadResponse", "response", "Lretrofit2/Response;", "insertAddress", "", "database", "Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "addressmodel", "Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "uploadImage", "Lkotlinx/coroutines/Job;", "file", "Lokhttp3/MultipartBody$Part;", "uploadImageWithPart", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_debug"})
public final class DeliveryHoursViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse>> imageUploadResponseData = null;
    
    public DeliveryHoursViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse>> getImageUploadResponseData() {
        return null;
    }
    
    public final void insertAddress(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.database.UnlAddressDatabase database, @org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.dbmodel.CreateAddressModel addressmodel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job uploadImage(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file) {
        return null;
    }
    
    private final java.lang.Object uploadImageWithPart(okhttp3.MultipartBody.Part file, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse> handleImageUploadResponse(retrofit2.Response<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse> response) {
        return null;
    }
}