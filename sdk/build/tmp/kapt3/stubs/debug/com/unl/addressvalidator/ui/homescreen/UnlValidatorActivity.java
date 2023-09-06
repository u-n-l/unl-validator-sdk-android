package com.unl.addressvalidator.ui.homescreen;

import java.lang.System;

/**
 * [UnlValidatorActivity] is an [Activity] for Authorization of UNL credentials and start the address validation process
 *
 * @property apiKey is fetched from AndroidManifest file
 * @property vpmId is fetched from AndroidManifest file
 * @property envType to set the environment type at the time of lanching the SDK
 * @constructor
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00b3\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u00b3\u0001B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u0002002\u0006\u0010\u007f\u001a\u00020EH\u0016J\u0013\u0010\u0080\u0001\u001a\u00020}2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0016J\u0013\u0010\u0083\u0001\u001a\u00020}2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0002J\u0013\u0010\u0086\u0001\u001a\u00020}2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0002J\u0007\u0010\u0087\u0001\u001a\u00020}J\u0007\u0010\u0088\u0001\u001a\u00020}J\u0007\u0010\u0089\u0001\u001a\u00020}J\t\u0010\u008a\u0001\u001a\u00020}H\u0002J\t\u0010\u008b\u0001\u001a\u00020}H\u0002J\t\u0010\u008c\u0001\u001a\u00020}H\u0002J\t\u0010\u008d\u0001\u001a\u00020}H\u0002J\t\u0010\u008e\u0001\u001a\u00020}H\u0002J\t\u0010\u008f\u0001\u001a\u00020}H\u0002J\u0018\u0010\u0090\u0001\u001a\u00020}2\u000f\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0092\u0001J\t\u0010\u0093\u0001\u001a\u00020}H\u0002J\u0007\u0010\u0094\u0001\u001a\u00020}J\'\u0010\u0095\u0001\u001a\u00020}2\u0007\u0010\u0096\u0001\u001a\u0002002\u0007\u0010\u0097\u0001\u001a\u0002002\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0014J\t\u0010\u009a\u0001\u001a\u00020}H\u0016J\u0015\u0010\u009b\u0001\u001a\u00020}2\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001H\u0014J\u0012\u0010\u009e\u0001\u001a\u00020}2\u0007\u0010\u009f\u0001\u001a\u00020MH\u0016J\t\u0010\u00a0\u0001\u001a\u00020}H\u0014J\u0010\u0010\u00a1\u0001\u001a\u00020}2\u0007\u0010\u00a2\u0001\u001a\u000200J\u0007\u0010\u00a3\u0001\u001a\u00020}J\t\u0010\u00a4\u0001\u001a\u00020}H\u0002J\u0013\u0010\u00a5\u0001\u001a\u00020}2\b\u0010\u00a6\u0001\u001a\u00030\u00a7\u0001H\u0016J\u0007\u0010\u00a8\u0001\u001a\u00020}J\u0007\u0010\u00a9\u0001\u001a\u00020}J\t\u0010\u00aa\u0001\u001a\u00020}H\u0002J\t\u0010\u00ab\u0001\u001a\u00020}H\u0002J\u001a\u0010\u00ac\u0001\u001a\u00020}2\b\u0010\u00ad\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u00ae\u0001\u001a\u00020\u000eJ\u0007\u0010\u00af\u0001\u001a\u00020}J\u0007\u0010\u00b0\u0001\u001a\u00020}J\u0012\u0010\u00b1\u0001\u001a\u00020}2\u0007\u0010\u009f\u0001\u001a\u00020MH\u0002J\u0007\u0010\u00b2\u0001\u001a\u00020}R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001a\u0010,\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R\u0014\u0010/\u001a\u000200X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R \u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020AX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0:\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010=R\u0014\u0010D\u001a\u00020E8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bD\u0010FR\u001a\u0010G\u001a\u00020EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010F\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010IR\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010MX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010O\u001a\u00020PX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010U\u001a\u0004\u0018\u00010VX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u00102\"\u0004\b]\u0010^R\u000e\u0010_\u001a\u000200X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010`\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0010\"\u0004\bb\u0010\u0012R\u001a\u0010c\u001a\u000200X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u00102\"\u0004\be\u0010^R\u001c\u0010f\u001a\u0004\u0018\u00010gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001c\u0010l\u001a\u0004\u0018\u00010gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010i\"\u0004\bn\u0010kR\u001a\u0010o\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0010\"\u0004\bq\u0010\u0012R\u001a\u0010r\u001a\u00020EX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010F\"\u0004\bt\u0010IR\u001a\u0010u\u001a\u00020vX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0010\u0010{\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00b4\u0001"}, d2 = {"Lcom/unl/addressvalidator/ui/homescreen/UnlValidatorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/unl/addressvalidator/ui/interfaces/AddressImageClickListner;", "Landroid/location/LocationListener;", "Lcom/unl/addressvalidator/ui/interfaces/AddressItemClickListner;", "Lcom/unl/addressvalidator/ui/interfaces/SearchItemClickListner;", "()V", "adapter", "Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "getAdapter", "()Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "setAdapter", "(Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;)V", "addressType", "", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "apiKey", "bind", "Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;", "getBind", "()Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;", "setBind", "(Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;)V", "binding", "Lcom/unl/addressvalidator/databinding/ActivityHomeBinding;", "getBinding", "()Lcom/unl/addressvalidator/databinding/ActivityHomeBinding;", "setBinding", "(Lcom/unl/addressvalidator/databinding/ActivityHomeBinding;)V", "cityText", "getCityText", "setCityText", "currLat", "", "getCurrLat", "()D", "setCurrLat", "(D)V", "currLong", "getCurrLong", "setCurrLong", "currentAddressText", "getCurrentAddressText", "setCurrentAddressText", "dataListSize", "", "getDataListSize", "()I", "database", "Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "getDatabase", "()Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "setDatabase", "(Lcom/unl/addressvalidator/database/UnlAddressDatabase;)V", "entranceList", "Ljava/util/ArrayList;", "Lcom/example/roomdatabasewithmodelclassess/model/EntranceModel;", "getEntranceList", "()Ljava/util/ArrayList;", "setEntranceList", "(Ljava/util/ArrayList;)V", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "imageList", "getImageList", "isLocationEnabled", "", "()Z", "isMoveMarker", "setMoveMarker", "(Z)V", "isReplace", "setReplace", "locationByGps", "Landroid/location/Location;", "locationByNetwork", "locationManager", "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "setLocationManager", "(Landroid/location/LocationManager;)V", "mapBoxMap", "Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "getMapBoxMap", "()Lcom/mapbox/mapboxsdk/maps/MapboxMap;", "setMapBoxMap", "(Lcom/mapbox/mapboxsdk/maps/MapboxMap;)V", "moveCounter", "getMoveCounter", "setMoveCounter", "(I)V", "permissionsRequestCode", "pincodeText", "getPincodeText", "setPincodeText", "replaceIndex", "getReplaceIndex", "setReplaceIndex", "reverseGeoCodeCurrentLocationResponse", "Lcom/unl/addressvalidator/model/reversegeocode/ReverseGeoCodeResponse;", "getReverseGeoCodeCurrentLocationResponse", "()Lcom/unl/addressvalidator/model/reversegeocode/ReverseGeoCodeResponse;", "setReverseGeoCodeCurrentLocationResponse", "(Lcom/unl/addressvalidator/model/reversegeocode/ReverseGeoCodeResponse;)V", "reverseGeoCodeResponse", "getReverseGeoCodeResponse", "setReverseGeoCodeResponse", "stateText", "getStateText", "setStateText", "updateLocation", "getUpdateLocation", "setUpdateLocation", "viewModel", "Lcom/unl/addressvalidator/ui/homescreen/ValidatorViewModel;", "getViewModel", "()Lcom/unl/addressvalidator/ui/homescreen/ValidatorViewModel;", "setViewModel", "(Lcom/unl/addressvalidator/ui/homescreen/ValidatorViewModel;)V", "vpmId", "addressImageClick", "", "index", "isReplaceImage", "addressItemClick", "createAddressModel", "Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "callAddressFromCurrLocation", "latlng", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "callReverseGeoCode", "clearAddressImageList", "clearMap", "getAddressCreated", "getAddressFromCurrLocatinResponse", "getAutocompleteResponse", "getMetadataFromMenifest", "getReversgeoCodeResponse", "getSearchAddressResponse", "iniitLocatinoManager", "initAddressList", "addresses", "", "initiateViewModel", "logEvetn", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLocationChanged", "location", "onResume", "openImagePicker", "imageLimit", "pinMovedPopup", "requestPermissions", "searchItemClick", "searchResultDTO", "Lcom/unl/addressvalidator/model/autocomplet/AutocompleteData;", "setAddressObject", "setMapPointAddress", "setSearchListView", "showAlert", "showMarker", "latLng", "address", "showReverseGeoAddress", "updateAddressButton", "updateCurrentLocation", "updateMoveMarkerBtn", "Companion", "sdk_debug"})
public final class UnlValidatorActivity extends androidx.appcompat.app.AppCompatActivity implements com.unl.addressvalidator.ui.interfaces.AddressImageClickListner, android.location.LocationListener, com.unl.addressvalidator.ui.interfaces.AddressItemClickListner, com.unl.addressvalidator.ui.interfaces.SearchItemClickListner {
    private java.lang.String apiKey;
    private java.lang.String vpmId;
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.databinding.ActivityHomeBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.mapbox.mapboxsdk.maps.MapboxMap mapBoxMap;
    public com.unl.addressvalidator.ui.homescreen.ValidatorViewModel viewModel;
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse reverseGeoCodeResponse;
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse reverseGeoCodeCurrentLocationResponse;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String addressType = "home";
    public com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> imageList = null;
    private final int dataListSize = 9;
    private int replaceIndex = 0;
    private boolean isReplace = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cityText = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String stateText = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pincodeText = "";
    private double currLat = 0.0;
    private double currLong = 0.0;
    private boolean isMoveMarker = true;
    private int moveCounter = 0;
    private boolean updateLocation = true;
    private final int permissionsRequestCode = 123;
    private android.location.Location locationByGps;
    private android.location.Location locationByNetwork;
    public android.location.LocationManager locationManager;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentAddressText = "";
    public com.unl.addressvalidator.database.UnlAddressDatabase database;
    public com.unl.addressvalidator.databinding.AddPicturesPopupBinding bind;
    private com.google.firebase.analytics.FirebaseAnalytics firebaseAnalytics;
    @org.jetbrains.annotations.NotNull()
    public static final com.unl.addressvalidator.ui.homescreen.UnlValidatorActivity.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.unl.addressvalidator.model.dbmodel.CreateAddressModel createAddressModel;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> addressImageList = null;
    private static double pinLat = 0.0;
    private static double pinLong = 0.0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String envType = "PRODUCTION";
    
    public UnlValidatorActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.databinding.ActivityHomeBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.databinding.ActivityHomeBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mapbox.mapboxsdk.maps.MapboxMap getMapBoxMap() {
        return null;
    }
    
    public final void setMapBoxMap(@org.jetbrains.annotations.Nullable()
    com.mapbox.mapboxsdk.maps.MapboxMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.homescreen.ValidatorViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.homescreen.ValidatorViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse getReverseGeoCodeResponse() {
        return null;
    }
    
    public final void setReverseGeoCodeResponse(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse getReverseGeoCodeCurrentLocationResponse() {
        return null;
    }
    
    public final void setReverseGeoCodeCurrentLocationResponse(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.reversegeocode.ReverseGeoCodeResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddressType() {
        return null;
    }
    
    public final void setAddressType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImageList() {
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
    
    public final boolean isReplace() {
        return false;
    }
    
    public final void setReplace(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCityText() {
        return null;
    }
    
    public final void setCityText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStateText() {
        return null;
    }
    
    public final void setStateText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPincodeText() {
        return null;
    }
    
    public final void setPincodeText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getCurrLat() {
        return 0.0;
    }
    
    public final void setCurrLat(double p0) {
    }
    
    public final double getCurrLong() {
        return 0.0;
    }
    
    public final void setCurrLong(double p0) {
    }
    
    public final boolean isMoveMarker() {
        return false;
    }
    
    public final void setMoveMarker(boolean p0) {
    }
    
    public final int getMoveCounter() {
        return 0;
    }
    
    public final void setMoveCounter(int p0) {
    }
    
    public final boolean getUpdateLocation() {
        return false;
    }
    
    public final void setUpdateLocation(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.LocationManager getLocationManager() {
        return null;
    }
    
    public final void setLocationManager(@org.jetbrains.annotations.NotNull()
    android.location.LocationManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> getEntranceList() {
        return null;
    }
    
    public final void setEntranceList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentAddressText() {
        return null;
    }
    
    public final void setCurrentAddressText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.database.UnlAddressDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.database.UnlAddressDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.databinding.AddPicturesPopupBinding getBind() {
        return null;
    }
    
    public final void setBind(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.databinding.AddPicturesPopupBinding p0) {
    }
    
    private final boolean isLocationEnabled() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void logEvetn() {
    }
    
    public final void clearAddressImageList() {
    }
    
    public final void updateMoveMarkerBtn() {
    }
    
    public final void getAddressCreated() {
    }
    
    private final void setSearchListView() {
    }
    
    private final void getAutocompleteResponse() {
    }
    
    public final void clearMap() {
    }
    
    private final void callReverseGeoCode(com.mapbox.mapboxsdk.geometry.LatLng latlng) {
    }
    
    private final void initiateViewModel() {
    }
    
    private final void getReversgeoCodeResponse() {
    }
    
    public final void showReverseGeoAddress() {
    }
    
    public final void setAddressObject() {
    }
    
    public final void setMapPointAddress() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * For get the VPM_ID and API_KEY from third party App
     */
    private final void getMetadataFromMenifest() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.unl.addressvalidator.model.dbmodel.CreateAddressModel getCreateAddressModel() {
        return null;
    }
    
    public static final void setCreateAddressModel(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.model.dbmodel.CreateAddressModel p0) {
    }
    
    @java.lang.Override()
    public void addressImageClick(int index, boolean isReplaceImage) {
    }
    
    public final void openImagePicker(int imageLimit) {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void iniitLocatinoManager() {
    }
    
    private final void updateCurrentLocation(android.location.Location location) {
    }
    
    private final void callAddressFromCurrLocation(com.mapbox.mapboxsdk.geometry.LatLng latlng) {
    }
    
    public final void showMarker(@org.jetbrains.annotations.NotNull()
    com.mapbox.mapboxsdk.geometry.LatLng latLng, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    private final void requestPermissions() {
    }
    
    @java.lang.Override()
    public void searchItemClick(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.autocomplet.AutocompleteData searchResultDTO) {
    }
    
    private final void getSearchAddressResponse() {
    }
    
    public final void updateAddressButton() {
    }
    
    private final void getAddressFromCurrLocatinResponse() {
    }
    
    public final void initAddressList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.unl.addressvalidator.model.dbmodel.CreateAddressModel> addresses) {
    }
    
    @java.lang.Override()
    public void addressItemClick(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.dbmodel.CreateAddressModel createAddressModel) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final void pinMovedPopup() {
    }
    
    private final void showAlert() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a\u00a8\u0006\u001e"}, d2 = {"Lcom/unl/addressvalidator/ui/homescreen/UnlValidatorActivity$Companion;", "", "()V", "addressImageList", "Ljava/util/ArrayList;", "Lcom/unl/addressvalidator/ui/imagepicker/data/AddPicturesModel;", "getAddressImageList", "()Ljava/util/ArrayList;", "createAddressModel", "Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "getCreateAddressModel$annotations", "getCreateAddressModel", "()Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;", "setCreateAddressModel", "(Lcom/unl/addressvalidator/model/dbmodel/CreateAddressModel;)V", "envType", "", "getEnvType", "()Ljava/lang/String;", "setEnvType", "(Ljava/lang/String;)V", "pinLat", "", "getPinLat", "()D", "setPinLat", "(D)V", "pinLong", "getPinLong", "setPinLong", "sdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.unl.addressvalidator.model.dbmodel.CreateAddressModel getCreateAddressModel() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getCreateAddressModel$annotations() {
        }
        
        public final void setCreateAddressModel(@org.jetbrains.annotations.Nullable()
        com.unl.addressvalidator.model.dbmodel.CreateAddressModel p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.unl.addressvalidator.ui.imagepicker.data.AddPicturesModel> getAddressImageList() {
            return null;
        }
        
        public final double getPinLat() {
            return 0.0;
        }
        
        public final void setPinLat(double p0) {
        }
        
        public final double getPinLong() {
            return 0.0;
        }
        
        public final void setPinLong(double p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEnvType() {
            return null;
        }
        
        public final void setEnvType(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}