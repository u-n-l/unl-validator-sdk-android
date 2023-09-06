package com.unl.addressvalidator.model.reversegeocode;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u000b\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u001d\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u000bH\u00c6\u0003Jw\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u000bH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R%\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"Lcom/unl/addressvalidator/model/reversegeocode/PropertiesData;", "", "match_component", "", "category_name", "businessName", "place", "Lcom/unl/addressvalidator/model/reversegeocode/PlaceData;", "postal_address", "Ljava/util/ArrayList;", "Lcom/unl/addressvalidator/model/reversegeocode/PostalAddressData;", "Lkotlin/collections/ArrayList;", "unl_location", "Lcom/unl/addressvalidator/model/reversegeocode/UnlLocationData;", "contributor_info", "Lcom/unl/addressvalidator/model/reversegeocode/ContributorInfoData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unl/addressvalidator/model/reversegeocode/PlaceData;Ljava/util/ArrayList;Lcom/unl/addressvalidator/model/reversegeocode/UnlLocationData;Ljava/util/ArrayList;)V", "getBusinessName", "()Ljava/lang/String;", "getCategory_name", "getContributor_info", "()Ljava/util/ArrayList;", "getMatch_component", "getPlace", "()Lcom/unl/addressvalidator/model/reversegeocode/PlaceData;", "getPostal_address", "getUnl_location", "()Lcom/unl/addressvalidator/model/reversegeocode/UnlLocationData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_debug"})
public final class PropertiesData {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String match_component = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String category_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String businessName = null;
    @org.jetbrains.annotations.Nullable()
    private final com.unl.addressvalidator.model.reversegeocode.PlaceData place = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.PostalAddressData> postal_address = null;
    @org.jetbrains.annotations.Nullable()
    private final com.unl.addressvalidator.model.reversegeocode.UnlLocationData unl_location = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.ContributorInfoData> contributor_info = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.model.reversegeocode.PropertiesData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String match_component, @org.jetbrains.annotations.NotNull()
    java.lang.String category_name, @org.jetbrains.annotations.NotNull()
    java.lang.String businessName, @org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.reversegeocode.PlaceData place, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.PostalAddressData> postal_address, @org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.reversegeocode.UnlLocationData unl_location, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.ContributorInfoData> contributor_info) {
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
    
    public PropertiesData(@org.jetbrains.annotations.NotNull()
    java.lang.String match_component, @org.jetbrains.annotations.NotNull()
    java.lang.String category_name, @org.jetbrains.annotations.NotNull()
    java.lang.String businessName, @org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.reversegeocode.PlaceData place, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.PostalAddressData> postal_address, @org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.reversegeocode.UnlLocationData unl_location, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.ContributorInfoData> contributor_info) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMatch_component() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBusinessName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.model.reversegeocode.PlaceData component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.model.reversegeocode.PlaceData getPlace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.PostalAddressData> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.PostalAddressData> getPostal_address() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.model.reversegeocode.UnlLocationData component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.model.reversegeocode.UnlLocationData getUnl_location() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.ContributorInfoData> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.unl.addressvalidator.model.reversegeocode.ContributorInfoData> getContributor_info() {
        return null;
    }
}