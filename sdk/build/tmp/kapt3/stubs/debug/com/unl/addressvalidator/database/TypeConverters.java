package com.unl.addressvalidator.database;

import java.lang.System;

@androidx.room.TypeConverters()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J&\u0010\t\u001a\u0004\u0018\u00010\u00062\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\rH\u0007J&\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\rH\u0007J&\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\rH\u0007J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J&\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\rH\u0007J\u0012\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0007J&\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0007J&\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0007J&\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\r2\b\u0010 \u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010!\u001a\u0004\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0007J&\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\r2\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/unl/addressvalidator/database/TypeConverters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "fromAddressModel", "", "addressModel", "Lcom/example/roomdatabasewithmodelclassess/model/AddressModel;", "fromEntranceModel", "entranceModel", "Ljava/util/ArrayList;", "Lcom/example/roomdatabasewithmodelclassess/model/EntranceModel;", "Lkotlin/collections/ArrayList;", "fromImages", "imageArray", "fromLandmarkModel", "landmarkModel", "Lcom/example/roomdatabasewithmodelclassess/model/LandmarkModel;", "fromLocationModel", "locationModel", "Lcom/example/roomdatabasewithmodelclassess/model/LocationModel;", "fromOpeningHoursSpecificationModel", "openingHoursModel", "Lcom/example/roomdatabasewithmodelclassess/model/OpeningHoursSpecificationModel;", "toAddressModel", "addressModelJson", "toEntranceModel", "entranceModelJson", "toImages", "imageList", "toLandmarkModel", "landmarkModelJson", "toLocationModel", "locationModelJson", "toOpeningHoursSpecificationModel", "openingHoursModelJson", "sdk_debug"})
public final class TypeConverters {
    private final com.google.gson.Gson gson = null;
    
    public TypeConverters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String fromAddressModel(@org.jetbrains.annotations.Nullable()
    com.example.roomdatabasewithmodelclassess.model.AddressModel addressModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.example.roomdatabasewithmodelclassess.model.AddressModel toAddressModel(@org.jetbrains.annotations.Nullable()
    java.lang.String addressModelJson) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromLocationModel(@org.jetbrains.annotations.Nullable()
    com.example.roomdatabasewithmodelclassess.model.LocationModel locationModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final com.example.roomdatabasewithmodelclassess.model.LocationModel toLocationModel(@org.jetbrains.annotations.Nullable()
    java.lang.String locationModelJson) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromLandmarkModel(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.LandmarkModel> landmarkModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.LandmarkModel> toLandmarkModel(@org.jetbrains.annotations.Nullable()
    java.lang.String landmarkModelJson) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromEntranceModel(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> toEntranceModel(@org.jetbrains.annotations.Nullable()
    java.lang.String entranceModelJson) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromOpeningHoursSpecificationModel(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> openingHoursModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> toOpeningHoursSpecificationModel(@org.jetbrains.annotations.Nullable()
    java.lang.String openingHoursModelJson) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.lang.String fromImages(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> imageArray) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.ArrayList<java.lang.String> toImages(@org.jetbrains.annotations.Nullable()
    java.lang.String imageList) {
        return null;
    }
}