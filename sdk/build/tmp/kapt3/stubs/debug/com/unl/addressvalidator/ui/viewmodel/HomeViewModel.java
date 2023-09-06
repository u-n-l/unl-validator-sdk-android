package com.unl.addressvalidator.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0019\u0010&\u001a\u00020#2\u0006\u0010 \u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0019\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020*J\u0019\u0010-\u001a\u00020#2\u0006\u0010 \u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0016\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0006J!\u00100\u001a\u00020#2\u0006\u0010/\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u000e\u0010\u0018\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006J\u0019\u00102\u001a\u00020#2\u0006\u0010 \u001a\u00020\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0002J\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001205H\u0002J\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001505H\u0002J\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0002J\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a05H\u0002J\u0016\u0010:\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010;\u001a\u00020\fJ\u000e\u0010<\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020>J\u0019\u0010?\u001a\u00020#2\u0006\u0010=\u001a\u00020>H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\bR\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lcom/unl/addressvalidator/ui/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "addressJson", "Landroidx/lifecycle/MutableLiveData;", "Lcom/unl/addressvalidator/network/ApiCallBack;", "Lcom/google/gson/JsonObject;", "getAddressJson", "()Landroidx/lifecycle/MutableLiveData;", "addresslist", "Landroidx/lifecycle/LiveData;", "", "Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "getAddresslist", "()Landroidx/lifecycle/LiveData;", "setAddresslist", "(Landroidx/lifecycle/LiveData;)V", "autoCompleteData", "Lcom/unl/addressvalidator/model/autocomplet/AutocompleteResponse;", "getAutoCompleteData", "imageUploadResponseData", "Lcom/example/roomdatabasewithmodelclassess/model/ImageUploadResponse;", "getImageUploadResponseData", "nearbyLandmark", "getNearbyLandmark", "reverseGeocodeData", "Lcom/unl/addressvalidator/model/reversegeocode/ReverseGeoCodeResponse;", "getReverseGeocodeData", "reverseGeocodeDataCurrentLocation", "getReverseGeocodeDataCurrentLocation", "getAddfromCurrentLocation", "Lkotlinx/coroutines/Job;", "location", "getAddfromLocation", "getAddress", "", "database", "Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "getAddressFromCurrentLocation", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressFromItemID", "itemId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressFromItemId", "getAddressFromLocation", "getAutocompleteData", "text", "getAutocompleteResult", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNearbyLandmarks", "handleAddressFromItemIDResponse", "response", "Lretrofit2/Response;", "handleAutocompleteResponse", "handleImageUploadResponse", "handleNearbyLandmarkResponse", "handleReverseGeoCOdeResponse", "insertAddress", "addressmodel", "uploadImage", "file", "Lokhttp3/MultipartBody$Part;", "uploadImageWithPart", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse>> imageUploadResponseData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject>> addressJson = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.autocomplet.AutocompleteResponse>> autoCompleteData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse>> reverseGeocodeData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse>> reverseGeocodeDataCurrentLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject>> nearbyLandmark = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel>> addresslist;
    
    public HomeViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse>> getImageUploadResponseData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject>> getAddressJson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.autocomplet.AutocompleteResponse>> getAutoCompleteData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse>> getReverseGeocodeData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse>> getReverseGeocodeDataCurrentLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject>> getNearbyLandmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel>> getAddresslist() {
        return null;
    }
    
    public final void setAddresslist(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAutocompleteData(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject location) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAddressFromItemId(@org.jetbrains.annotations.NotNull()
    java.lang.String itemId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAddfromLocation(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject location) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAddfromCurrentLocation(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject location) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getNearbyLandmark(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject location) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job uploadImage(@org.jetbrains.annotations.NotNull()
    okhttp3.MultipartBody.Part file) {
        return null;
    }
    
    public final void insertAddress(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.database.UnlAddressDatabase database, @org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.dbmodel.CreateAddressModel addressmodel) {
    }
    
    public final void getAddress(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.database.UnlAddressDatabase database) {
    }
    
    private final java.lang.Object getAutocompleteResult(java.lang.String text, com.google.gson.JsonObject location, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getAddressFromItemID(java.lang.String itemId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getAddressFromLocation(com.google.gson.JsonObject location, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getAddressFromCurrentLocation(com.google.gson.JsonObject location, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getNearbyLandmarks(com.google.gson.JsonObject location, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object uploadImageWithPart(okhttp3.MultipartBody.Part file, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse> handleReverseGeoCOdeResponse(retrofit2.Response<com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse> response) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.unl.addressvalidator.model.autocomplet.AutocompleteResponse> handleAutocompleteResponse(retrofit2.Response<com.unl.addressvalidator.model.autocomplet.AutocompleteResponse> response) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject> handleAddressFromItemIDResponse(retrofit2.Response<com.google.gson.JsonObject> response) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.google.gson.JsonObject> handleNearbyLandmarkResponse(retrofit2.Response<com.google.gson.JsonObject> response) {
        return null;
    }
    
    private final com.unl.addressvalidator.network.ApiCallBack<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse> handleImageUploadResponse(retrofit2.Response<com.example.roomdatabasewithmodelclassess.model.ImageUploadResponse> response) {
        return null;
    }
}