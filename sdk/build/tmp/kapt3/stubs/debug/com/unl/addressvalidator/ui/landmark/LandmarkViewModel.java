package com.unl.addressvalidator.ui.landmark;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J#\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0006J\u0019\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!H\u0002J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!H\u0002J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!H\u0002J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060!H\u0002J\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\'J\u0019\u0010(\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/unl/addressvalidator/ui/landmark/LandmarkViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "addressJson", "Landroidx/lifecycle/MutableLiveData;", "Lcom/unl/addressvalidator/network/ApiCallBack;", "Lcom/google/gson/JsonObject;", "getAddressJson", "()Landroidx/lifecycle/MutableLiveData;", "autoCompleteData", "Lcom/unl/addressvalidator/model/autocomplet/AutocompleteResponse;", "getAutoCompleteData", "imageUploadResponseData", "Lcom/example/roomdatabasewithmodelclassess/model/ImageUploadResponse;", "getImageUploadResponseData", "nearbyLandmark", "getNearbyLandmark", "getAddressFromItemID", "", "itemId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressFromItemId", "Lkotlinx/coroutines/Job;", "getAutocompleteData", "text", "location", "getAutocompleteResult", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNearbyLandmarks", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAddressFromItemIDResponse", "response", "Lretrofit2/Response;", "handleAutocompleteResponse", "handleImageUploadResponse", "handleNearbyLandmarkResponse", "uploadImage", "file", "Lokhttp3/MultipartBody$Part;", "uploadImageWithPart", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_debug"})
public final class LandmarkViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject>> nearbyLandmark = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse>> imageUploadResponseData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.autocomplet.AutocompleteResponse>> autoCompleteData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject>> addressJson = null;
    
    public LandmarkViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject>> getNearbyLandmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse>> getImageUploadResponseData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.autocomplet.AutocompleteResponse>> getAutoCompleteData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject>> getAddressJson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAddressFromItemId(@org.jetbrains.annotations.NotNull()
    java.lang.String itemId) {
        return null;
    }
    
    private final java.lang.Object getAddressFromItemID(java.lang.String itemId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAutocompleteData(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    com.google.gson.JsonObject location) {
        return null;
    }
    
    private final java.lang.Object getAutocompleteResult(java.lang.String text, com.google.gson.JsonObject location, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getNearbyLandmark(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject location) {
        return null;
    }
    
    private final java.lang.Object getNearbyLandmarks(com.google.gson.JsonObject location, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject> handleNearbyLandmarkResponse(retrofit2.Response<com.google.gson.JsonObject> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job uploadImage(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file) {
        return null;
    }
    
    private final java.lang.Object uploadImageWithPart(okhttp3.MultipartBody.Part file, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject> handleAddressFromItemIDResponse(retrofit2.Response<com.google.gson.JsonObject> response) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse> handleImageUploadResponse(retrofit2.Response<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse> response) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.autocomplet.AutocompleteResponse> handleAutocompleteResponse(retrofit2.Response<com.unl.addressvalidator.model.autocomplet.AutocompleteResponse> response) {
        return null;
    }
}