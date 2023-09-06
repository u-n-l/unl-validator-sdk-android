package com.unl.addressvalidator.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rJ\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0006\u0010\u001a\u001a\u00020\u001bJN\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010$\u001a\u00020%Jl\u0010&\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\'\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u000f\u00a8\u0006*"}, d2 = {"Lcom/unl/addressvalidator/util/Utility;", "", "()V", "changeCameraPosition", "", "latlng", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "mapbox", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "configureMap", "mapView", "Lcom/unl/map/sdk/views/UnlMapView;", "context", "Landroid/content/Context;", "convert", "", "coord", "", "getImagePathFromUri", "contentURI", "Landroid/net/Uri;", "ct", "parseNearbyLandmarkJson", "Ljava/util/ArrayList;", "Lcom/unl/addressvalidator/model/reversegeocode/ReverseGeoCodeResponse;", "Lkotlin/collections/ArrayList;", "rawData", "Lcom/google/gson/JsonObject;", "returnFullAddress", "houseNo", "floorNo", "builingName", "street", "city", "state", "pincode", "returnRandomDigit", "", "returnUNLFullAddress", "builingNo", "neighbour", "countryCode", "sdk_debug"})
public final class Utility {
    @org.jetbrains.annotations.NotNull()
    public static final com.unl.addressvalidator.util.Utility INSTANCE = null;
    
    private Utility() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String returnFullAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String houseNo, @org.jetbrains.annotations.Nullable()
    java.lang.String floorNo, @org.jetbrains.annotations.Nullable()
    java.lang.String builingName, @org.jetbrains.annotations.Nullable()
    java.lang.String street, @org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String pincode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String returnUNLFullAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String houseNo, @org.jetbrains.annotations.Nullable()
    java.lang.String floorNo, @org.jetbrains.annotations.Nullable()
    java.lang.String builingNo, @org.jetbrains.annotations.Nullable()
    java.lang.String builingName, @org.jetbrains.annotations.Nullable()
    java.lang.String street, @org.jetbrains.annotations.Nullable()
    java.lang.String neighbour, @org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String pincode, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse> parseNearbyLandmarkJson(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject rawData) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImagePathFromUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri contentURI, @org.jetbrains.annotations.NotNull()
    android.content.Context ct) {
        return null;
    }
    
    public final void changeCameraPosition(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.geometry.LatLng latlng, @org.jetbrains.annotations.Nullable()
    com.mapbox.mapboxsdk.maps.MapboxMap mapbox) {
    }
    
    public final void configureMap(@org.jetbrains.annotations.NotNull()
    com.unl.map.sdk.views.UnlMapView mapView, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final long returnRandomDigit() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String convert(double coord) {
        return null;
    }
}