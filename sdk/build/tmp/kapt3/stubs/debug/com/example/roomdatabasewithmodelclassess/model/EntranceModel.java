package com.example.roomdatabasewithmodelclassess.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\tH\u00c6\u0003J\t\u00105\u001a\u00020\u000bH\u00c6\u0003J\t\u00106\u001a\u00020\u000bH\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J}\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010H\u00c6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020=H\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000fj\b\u0012\u0004\u0012\u00020\u0003`\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\'\"\u0004\b+\u0010)R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015\u00a8\u0006?"}, d2 = {"Lcom/example/roomdatabasewithmodelclassess/model/EntranceModel;", "", "entranceName", "", "entranceNo", "entranceCategory", "entranceInfo", "imgCount", "entranceId", "", "lattitude", "", "longitude", "url", "imageArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDLjava/lang/String;Ljava/util/ArrayList;)V", "getEntranceCategory", "()Ljava/lang/String;", "setEntranceCategory", "(Ljava/lang/String;)V", "getEntranceId", "()J", "setEntranceId", "(J)V", "getEntranceInfo", "setEntranceInfo", "getEntranceName", "setEntranceName", "getEntranceNo", "setEntranceNo", "getImageArray", "()Ljava/util/ArrayList;", "setImageArray", "(Ljava/util/ArrayList;)V", "getImgCount", "setImgCount", "getLattitude", "()D", "setLattitude", "(D)V", "getLongitude", "setLongitude", "getUrl", "setUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_debug"})
public final class EntranceModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String entranceName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String entranceNo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String entranceCategory;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String entranceInfo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imgCount;
    private long entranceId;
    private double lattitude;
    private double longitude;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String url;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> imageArray;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.roomdatabasewithmodelclassess.model.EntranceModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String entranceName, @org.jetbrains.annotations.NotNull()
    java.lang.String entranceNo, @org.jetbrains.annotations.NotNull()
    java.lang.String entranceCategory, @org.jetbrains.annotations.NotNull()
    java.lang.String entranceInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String imgCount, long entranceId, double lattitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> imageArray) {
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
    
    public EntranceModel(@org.jetbrains.annotations.NotNull()
    java.lang.String entranceName, @org.jetbrains.annotations.NotNull()
    java.lang.String entranceNo, @org.jetbrains.annotations.NotNull()
    java.lang.String entranceCategory, @org.jetbrains.annotations.NotNull()
    java.lang.String entranceInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String imgCount, long entranceId, double lattitude, double longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> imageArray) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntranceName() {
        return null;
    }
    
    public final void setEntranceName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntranceNo() {
        return null;
    }
    
    public final void setEntranceNo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntranceCategory() {
        return null;
    }
    
    public final void setEntranceCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntranceInfo() {
        return null;
    }
    
    public final void setEntranceInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImgCount() {
        return null;
    }
    
    public final void setImgCount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getEntranceId() {
        return 0L;
    }
    
    public final void setEntranceId(long p0) {
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getLattitude() {
        return 0.0;
    }
    
    public final void setLattitude(double p0) {
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImageArray() {
        return null;
    }
    
    public final void setImageArray(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
}