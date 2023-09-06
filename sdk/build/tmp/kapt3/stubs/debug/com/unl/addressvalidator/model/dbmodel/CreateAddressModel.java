package com.unl.addressvalidator.model.dbmodel;

import java.lang.System;

@androidx.room.Entity(tableName = "create_address")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00cb\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\f\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\f\u0012\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\f\u0012\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\f\u00a2\u0006\u0002\u0010\u0013J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u001d\u00108\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fH\u00c6\u0003J\u001d\u00109\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\fH\u00c6\u0003J\u001d\u0010:\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\fH\u00c6\u0003J\u001d\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\fH\u00c6\u0003J\u001d\u0010<\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\fH\u00c6\u0003J\u00cf\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\f2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\f2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\f2\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\fH\u00c6\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020%H\u00d6\u0001J\t\u0010B\u001a\u00020\u0005H\u00d6\u0001R.\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017\u00a8\u0006C"}, d2 = {"Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "", "addressModel", "Lcom/example/roomdatabasewithmodelclassess/model/AddressModel;", "addressType", "", "address", "locationModel", "Lcom/example/roomdatabasewithmodelclassess/model/LocationModel;", "landmarkModel", "Ljava/util/ArrayList;", "Lcom/example/roomdatabasewithmodelclassess/model/LandmarkModel;", "Lkotlin/collections/ArrayList;", "entranceModel", "Lcom/example/roomdatabasewithmodelclassess/model/EntranceModel;", "images", "accessibility", "openingHoursSpecificationModel", "Lcom/example/roomdatabasewithmodelclassess/model/OpeningHoursSpecificationModel;", "(Lcom/example/roomdatabasewithmodelclassess/model/AddressModel;Ljava/lang/String;Ljava/lang/String;Lcom/example/roomdatabasewithmodelclassess/model/LocationModel;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getAccessibility", "()Ljava/util/ArrayList;", "setAccessibility", "(Ljava/util/ArrayList;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getAddressModel", "()Lcom/example/roomdatabasewithmodelclassess/model/AddressModel;", "setAddressModel", "(Lcom/example/roomdatabasewithmodelclassess/model/AddressModel;)V", "getAddressType", "setAddressType", "getEntranceModel", "setEntranceModel", "id", "", "getId", "()I", "setId", "(I)V", "getImages", "setImages", "getLandmarkModel", "setLandmarkModel", "getLocationModel", "()Lcom/example/roomdatabasewithmodelclassess/model/LocationModel;", "setLocationModel", "(Lcom/example/roomdatabasewithmodelclassess/model/LocationModel;)V", "getOpeningHoursSpecificationModel", "setOpeningHoursSpecificationModel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "sdk_debug"})
public final class CreateAddressModel {
    @org.jetbrains.annotations.Nullable()
    private com.example.roomdatabasewithmodelclassess.model.AddressModel addressModel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String addressType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String address;
    @org.jetbrains.annotations.Nullable()
    private com.example.roomdatabasewithmodelclassess.model.LocationModel locationModel;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.LandmarkModel> landmarkModel;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> images;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.String> accessibility;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> openingHoursSpecificationModel;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.model.dbmodel.CreateAddressModel copy(@org.jetbrains.annotations.Nullable()
    com.example.roomdatabasewithmodelclassess.model.AddressModel addressModel, @org.jetbrains.annotations.Nullable()
    java.lang.String addressType, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    com.example.roomdatabasewithmodelclassess.model.LocationModel locationModel, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.LandmarkModel> landmarkModel, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> images, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> accessibility, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> openingHoursSpecificationModel) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CreateAddressModel() {
        super();
    }
    
    public CreateAddressModel(@org.jetbrains.annotations.Nullable()
    com.example.roomdatabasewithmodelclassess.model.AddressModel addressModel, @org.jetbrains.annotations.Nullable()
    java.lang.String addressType, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    com.example.roomdatabasewithmodelclassess.model.LocationModel locationModel, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.LandmarkModel> landmarkModel, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> images, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> accessibility, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> openingHoursSpecificationModel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.roomdatabasewithmodelclassess.model.AddressModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.roomdatabasewithmodelclassess.model.AddressModel getAddressModel() {
        return null;
    }
    
    public final void setAddressModel(@org.jetbrains.annotations.Nullable()
    com.example.roomdatabasewithmodelclassess.model.AddressModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddressType() {
        return null;
    }
    
    public final void setAddressType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.roomdatabasewithmodelclassess.model.LocationModel component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.roomdatabasewithmodelclassess.model.LocationModel getLocationModel() {
        return null;
    }
    
    public final void setLocationModel(@org.jetbrains.annotations.Nullable()
    com.example.roomdatabasewithmodelclassess.model.LocationModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.LandmarkModel> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.LandmarkModel> getLandmarkModel() {
        return null;
    }
    
    public final void setLandmarkModel(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.LandmarkModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> getEntranceModel() {
        return null;
    }
    
    public final void setEntranceModel(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.String> getAccessibility() {
        return null;
    }
    
    public final void setAccessibility(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> getOpeningHoursSpecificationModel() {
        return null;
    }
    
    public final void setOpeningHoursSpecificationModel(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
}