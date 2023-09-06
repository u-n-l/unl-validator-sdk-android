package com.unl.addressvalidator.ui.entrances;

import java.lang.System;

/**
 * [EntrancesActivity] provide functionality to add Entrances.
 * You can add entrance details
 * You can select multiple Entrances with their picture
 * @constructor
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 _2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001_B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020?J\u0018\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020\u00182\u0006\u0010C\u001a\u00020+H\u0016J&\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020\u00182\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020!0\u001cj\b\u0012\u0004\u0012\u00020!`\"J(\u0010G\u001a\u00020=2\u0006\u0010E\u001a\u00020\u00182\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020!0\u001cj\b\u0012\u0004\u0012\u00020!`\"H\u0016J(\u0010I\u001a\u00020=2\u0006\u0010E\u001a\u00020\u00182\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020!0\u001cj\b\u0012\u0004\u0012\u00020!`\"H\u0016J(\u0010J\u001a\u00020=2\u0006\u0010E\u001a\u00020\u00182\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020!0\u001cj\b\u0012\u0004\u0012\u00020!`\"H\u0016J\"\u0010K\u001a\u00020=2\u0006\u0010L\u001a\u00020\u00182\u0006\u0010M\u001a\u00020\u00182\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\u0012\u0010P\u001a\u00020=2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0014J\u000e\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u00020\u0018J&\u0010U\u001a\u00020=2\u0006\u0010E\u001a\u00020\u00182\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020!0\u001cj\b\u0012\u0004\u0012\u00020!`\"J\u0006\u0010V\u001a\u00020=J\u0016\u0010W\u001a\u00020=2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[J\u0016\u0010\\\u001a\u00020=2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[J\u0006\u0010]\u001a\u00020=J\u0006\u0010^\u001a\u00020=R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\u001cj\b\u0012\u0004\u0012\u00020!`\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010%R*\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\'0\u001cj\b\u0012\u0004\u0012\u00020\'`\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010%R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001a\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u00108\u00a8\u0006`"}, d2 = {"Lcom/unl/addressvalidator/ui/entrances/EntrancesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/unl/addressvalidator/ui/interfaces/EntranceClickListner;", "Lcom/unl/addressvalidator/ui/interfaces/AddressImageClickListner;", "()V", "adapter", "Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "getAdapter", "()Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "setAdapter", "(Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;)V", "bind", "Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;", "getBind", "()Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;", "setBind", "(Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;)V", "binding", "Lcom/unl/addressvalidator/databinding/ActivityEntrancesBinding;", "getBinding", "()Lcom/unl/addressvalidator/databinding/ActivityEntrancesBinding;", "setBinding", "(Lcom/unl/addressvalidator/databinding/ActivityEntrancesBinding;)V", "dataListSize", "", "getDataListSize", "()I", "entranceImageList", "Ljava/util/ArrayList;", "Lcom/unl/addressvalidator/ui/imagepicker/data/AddPicturesModel;", "getEntranceImageList", "()Ljava/util/ArrayList;", "entranceList", "Lcom/example/roomdatabasewithmodelclassess/model/EntranceModel;", "Lkotlin/collections/ArrayList;", "getEntranceList", "setEntranceList", "(Ljava/util/ArrayList;)V", "entranceMarker", "Lcom/mapbox/mapboxsdk/annotations/Marker;", "getEntranceMarker", "setEntranceMarker", "isReplace", "", "()Z", "setReplace", "(Z)V", "mapBoxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "getMapBoxMap", "()Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "setMapBoxMap", "(Lcom/mapbox/mapboxsdk/maps/MapboxMap;)V", "moveCounter", "getMoveCounter", "setMoveCounter", "(I)V", "replaceIndex", "getReplaceIndex", "setReplaceIndex", "addEntrancePoint", "", "lattitude", "", "longitude", "addressImageClick", "index", "isReplaceImage", "editeEntrance", "position", "resulttList", "entranceDeleteClick", "entranceModel", "entranceEditClick", "entranceImageClick", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openImagePicker", "imageLimit", "removeEntrance", "setMapData", "showHomeMarker", "latLng", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "address", "", "showMarker", "updateButtonStatus", "updateEntrance", "Companion", "sdk_debug"})
public final class EntrancesActivity extends androidx.appcompat.app.AppCompatActivity implements com.unl.addressvalidator.ui.interfaces.EntranceClickListner, com.unl.addressvalidator.ui.interfaces.AddressImageClickListner {
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.databinding.ActivityEntrancesBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.mapbox.mapboxsdk.maps.MapboxMap mapBoxMap;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> entranceImageList = null;
    private int moveCounter = 0;
    private int replaceIndex = 0;
    public com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.mapbox.mapboxsdk.annotations.Marker> entranceMarker;
    private final int dataListSize = 9;
    private boolean isReplace = false;
    public com.unl.addressvalidator.databinding.AddPicturesPopupBinding bind;
    @org.jetbrains.annotations.NotNull()
    public static final com.unl.addressvalidator.ui.entrances.EntrancesActivity.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.unl.addressvalidator.ui.entrances.EntrancesActivity entranceActivity;
    
    public EntrancesActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.databinding.ActivityEntrancesBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.databinding.ActivityEntrancesBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mapbox.mapboxsdk.maps.MapboxMap getMapBoxMap() {
        return null;
    }
    
    public final void setMapBoxMap(@org.jetbrains.annotations.Nullable()
    com.mapbox.mapboxsdk.maps.MapboxMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> getEntranceImageList() {
        return null;
    }
    
    public final int getMoveCounter() {
        return 0;
    }
    
    public final void setMoveCounter(int p0) {
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
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> getEntranceList() {
        return null;
    }
    
    public final void setEntranceList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.mapbox.mapboxsdk.annotations.Marker> getEntranceMarker() {
        return null;
    }
    
    public final void setEntranceMarker(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.mapbox.mapboxsdk.annotations.Marker> p0) {
    }
    
    public final int getDataListSize() {
        return 0;
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void updateButtonStatus() {
    }
    
    public final void addEntrancePoint(double lattitude, double longitude) {
    }
    
    public final void setMapData() {
    }
    
    public final void showHomeMarker(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.geometry.LatLng latLng, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    public final void showMarker(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.geometry.LatLng latLng, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    @java.lang.Override()
    public void entranceEditClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel) {
    }
    
    @java.lang.Override()
    public void entranceDeleteClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel) {
    }
    
    @java.lang.Override()
    public void entranceImageClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel) {
    }
    
    public final void editeEntrance(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> resulttList) {
    }
    
    public final void removeEntrance(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> resulttList) {
    }
    
    @java.lang.Override()
    public void addressImageClick(int index, boolean isReplaceImage) {
    }
    
    public final void openImagePicker(int imageLimit) {
    }
    
    public final void updateEntrance() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/unl/addressvalidator/ui/entrances/EntrancesActivity$Companion;", "", "()V", "entranceActivity", "Lcom/unl/addressvalidator/ui/entrances/EntrancesActivity;", "getEntranceActivity", "()Lcom/unl/addressvalidator/ui/entrances/EntrancesActivity;", "setEntranceActivity", "(Lcom/unl/addressvalidator/ui/entrances/EntrancesActivity;)V", "sdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.unl.addressvalidator.ui.entrances.EntrancesActivity getEntranceActivity() {
            return null;
        }
        
        public final void setEntranceActivity(@org.jetbrains.annotations.Nullable()
        com.unl.addressvalidator.ui.entrances.EntrancesActivity p0) {
        }
    }
}