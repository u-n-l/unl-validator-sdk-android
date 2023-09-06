package com.unl.addressvalidator.ui.landmark;

import java.lang.System;

/**
 * [LandmarkActivity] provide functionality to add Landmarks.
 * You can add landmark by search
 * You can select landmakr from default list
 * @constructor
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 j2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001jB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u00192\u0006\u0010A\u001a\u00020\u001dH\u0016J\b\u0010B\u001a\u00020?H\u0002J\b\u0010C\u001a\u00020?H\u0002J\b\u0010D\u001a\u00020?H\u0002J\b\u0010E\u001a\u00020?H\u0002J\u0006\u0010F\u001a\u00020?J\b\u0010G\u001a\u00020?H\u0002J\u0010\u0010H\u001a\u00020?2\u0006\u0010I\u001a\u00020#H\u0016J\"\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00192\b\u0010M\u001a\u0004\u0018\u00010NH\u0014J\u0012\u0010O\u001a\u00020?2\b\u0010P\u001a\u0004\u0018\u00010QH\u0014J\u000e\u0010R\u001a\u00020?2\u0006\u0010S\u001a\u00020\u0019J\u000e\u0010T\u001a\u00020?2\u0006\u0010U\u001a\u00020VJ\u0010\u0010W\u001a\u00020?2\u0006\u0010X\u001a\u00020YH\u0016J\u0006\u0010Z\u001a\u00020?J\b\u0010[\u001a\u00020?H\u0002J\u0016\u0010\\\u001a\u00020?2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`J\u0016\u0010a\u001a\u00020?2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`J\u001e\u0010b\u001a\u00020?2\u0016\u0010c\u001a\u0012\u0012\u0004\u0012\u00020d0\"j\b\u0012\u0004\u0012\u00020d`eJ\u0006\u0010f\u001a\u00020?J(\u0010g\u001a\u00020?2\u0006\u0010h\u001a\u00020\u00192\u0016\u0010i\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`eH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u00104R \u00105\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010%\"\u0004\b7\u0010\'R\u001a\u00108\u001a\u000209X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u00a8\u0006k"}, d2 = {"Lcom/unl/addressvalidator/ui/landmark/LandmarkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/unl/addressvalidator/ui/interfaces/LandmarkClickListner;", "Lcom/unl/addressvalidator/ui/interfaces/AddressImageClickListner;", "Lcom/unl/addressvalidator/ui/interfaces/SearchItemClickListner;", "()V", "adapter", "Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "getAdapter", "()Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "setAdapter", "(Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;)V", "bind", "Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;", "getBind", "()Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;", "setBind", "(Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;)V", "binding", "Lcom/unl/addressvalidator/databinding/ActivityLandmarkBinding;", "getBinding", "()Lcom/unl/addressvalidator/databinding/ActivityLandmarkBinding;", "setBinding", "(Lcom/unl/addressvalidator/databinding/ActivityLandmarkBinding;)V", "dataListSize", "", "getDataListSize", "()I", "isReplace", "", "()Z", "setReplace", "(Z)V", "landmarkDataList", "Ljava/util/ArrayList;", "Lcom/unl/addressvalidator/model/landmark/LandmarkDataList;", "getLandmarkDataList", "()Ljava/util/ArrayList;", "setLandmarkDataList", "(Ljava/util/ArrayList;)V", "landmarkImageList", "Lcom/unl/addressvalidator/ui/imagepicker/data/AddPicturesModel;", "getLandmarkImageList", "mapBoxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "getMapBoxMap", "()Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "setMapBoxMap", "(Lcom/mapbox/mapboxsdk/maps/MapboxMap;)V", "replaceIndex", "getReplaceIndex", "setReplaceIndex", "(I)V", "selectedLandmarkDataList", "getSelectedLandmarkDataList", "setSelectedLandmarkDataList", "viewModel", "Lcom/unl/addressvalidator/ui/landmark/LandmarkViewModel;", "getViewModel", "()Lcom/unl/addressvalidator/ui/landmark/LandmarkViewModel;", "setViewModel", "(Lcom/unl/addressvalidator/ui/landmark/LandmarkViewModel;)V", "addressImageClick", "", "index", "isReplaceImage", "callNearbyLandMark", "getAutocompleteResponse", "getNearbyLandmarkResponse", "getSearchAddressResponse", "initLandmarkList", "initiateViewModel", "landmarkItemClick", "landmarkModel", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openImagePicker", "imageLimit", "parseSearchResultJson", "rawData", "Lcom/google/gson/JsonObject;", "searchItemClick", "searchResultDTO", "Lcom/unl/addressvalidator/model/autocomplet/AutocompleteData;", "setMapData", "setSearchListView", "showLandmarkMarker", "latLng", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "address", "", "showMarker", "showNearbyLandmark", "landmarkList", "Lcom/unl/addressvalidator/model/reversegeocode/ReverseGeoCodeResponse;", "Lkotlin/collections/ArrayList;", "updateLandmark", "uploadLandmarkPic", "position", "resulttList", "Companion", "sdk_debug"})
public final class LandmarkActivity extends androidx.appcompat.app.AppCompatActivity implements com.unl.addressvalidator.ui.interfaces.LandmarkClickListner, com.unl.addressvalidator.ui.interfaces.AddressImageClickListner, com.unl.addressvalidator.ui.interfaces.SearchItemClickListner {
    @org.jetbrains.annotations.Nullable()
    private com.mapbox.mapboxsdk.maps.MapboxMap mapBoxMap;
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.databinding.ActivityLandmarkBinding binding;
    public com.unl.addressvalidator.ui.landmark.LandmarkViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> landmarkImageList = null;
    private final int dataListSize = 9;
    private int replaceIndex = 0;
    public com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> landmarkDataList;
    private boolean isReplace = false;
    public com.unl.addressvalidator.databinding.AddPicturesPopupBinding bind;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> selectedLandmarkDataList;
    @org.jetbrains.annotations.NotNull()
    public static final com.unl.addressvalidator.ui.landmark.LandmarkActivity.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.unl.addressvalidator.ui.landmark.LandmarkActivity landmarkActivity;
    
    public LandmarkActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mapbox.mapboxsdk.maps.MapboxMap getMapBoxMap() {
        return null;
    }
    
    public final void setMapBoxMap(@org.jetbrains.annotations.Nullable()
    com.mapbox.mapboxsdk.maps.MapboxMap p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.databinding.ActivityLandmarkBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.databinding.ActivityLandmarkBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.landmark.LandmarkViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.landmark.LandmarkViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> getLandmarkImageList() {
        return null;
    }
    
    public final int getDataListSize() {
        return 0;
    }
    
    public final int getReplaceIndex() {
        return 0;
    }
    
    public final void setReplaceIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> getLandmarkDataList() {
        return null;
    }
    
    public final void setLandmarkDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> p0) {
    }
    
    public final boolean isReplace() {
        return false;
    }
    
    public final void setReplace(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.databinding.AddPicturesPopupBinding getBind() {
        return null;
    }
    
    public final void setBind(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.databinding.AddPicturesPopupBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> getSelectedLandmarkDataList() {
        return null;
    }
    
    public final void setSelectedLandmarkDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setSearchListView() {
    }
    
    private final void initiateViewModel() {
    }
    
    public final void setMapData() {
    }
    
    public final void showMarker(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.geometry.LatLng latLng, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    private final void callNearbyLandMark() {
    }
    
    public final void showNearbyLandmark(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse> landmarkList) {
    }
    
    public final void initLandmarkList() {
    }
    
    public final void updateLandmark() {
    }
    
    private final void getNearbyLandmarkResponse() {
    }
    
    @java.lang.Override()
    public void landmarkItemClick(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.landmark.LandmarkDataList landmarkModel) {
    }
    
    @java.lang.Override()
    public void uploadLandmarkPic(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> resulttList) {
    }
    
    @java.lang.Override()
    public void addressImageClick(int index, boolean isReplaceImage) {
    }
    
    public final void openImagePicker(int imageLimit) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void getAutocompleteResponse() {
    }
    
    public final void showLandmarkMarker(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.geometry.LatLng latLng, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void searchItemClick(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.autocomplet.AutocompleteData searchResultDTO) {
    }
    
    private final void getSearchAddressResponse() {
    }
    
    public final void parseSearchResultJson(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject rawData) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/unl/addressvalidator/ui/landmark/LandmarkActivity$Companion;", "", "()V", "landmarkActivity", "Lcom/unl/addressvalidator/ui/landmark/LandmarkActivity;", "getLandmarkActivity", "()Lcom/unl/addressvalidator/ui/landmark/LandmarkActivity;", "setLandmarkActivity", "(Lcom/unl/addressvalidator/ui/landmark/LandmarkActivity;)V", "sdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.unl.addressvalidator.ui.landmark.LandmarkActivity getLandmarkActivity() {
            return null;
        }
        
        public final void setLandmarkActivity(@org.jetbrains.annotations.Nullable()
        com.unl.addressvalidator.ui.landmark.LandmarkActivity p0) {
        }
    }
}