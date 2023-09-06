package com.unl.addressvalidator.ui.deliveryhours;

import java.lang.System;

/**
 * [DeliveryHoursActivity] provide functionality to add Additional information along with the address.
 * You can add accessibility like wheelchair, elevator
 * You can select your business hours for each day
 * @constructor
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u001e2\u0006\u0010j\u001a\u000204H\u0016J\u0006\u0010k\u001a\u000204J\u0006\u0010l\u001a\u00020hJ\u0010\u0010m\u001a\u00020h2\u0006\u0010n\u001a\u00020\u0006H\u0016J\b\u0010o\u001a\u00020hH\u0002J\b\u0010p\u001a\u00020hH\u0002J\u0018\u0010q\u001a\u00020h2\u0006\u0010r\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u0006H\u0016J\"\u0010t\u001a\u00020h2\u0006\u0010u\u001a\u00020\u001e2\u0006\u0010v\u001a\u00020\u001e2\b\u0010w\u001a\u0004\u0018\u00010xH\u0014J\u0012\u0010y\u001a\u00020h2\b\u0010z\u001a\u0004\u0018\u00010{H\u0014J\u000e\u0010|\u001a\u00020h2\u0006\u0010}\u001a\u00020\u001eJ\u000e\u0010~\u001a\u00020\u00062\u0006\u0010\u007f\u001a\u000204J\u000f\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010\u007f\u001a\u000204J\u000f\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010\u007f\u001a\u000204J\u0007\u0010\u0082\u0001\u001a\u00020hJ\u0007\u0010\u0083\u0001\u001a\u00020hJ\u0007\u0010\u0084\u0001\u001a\u00020hJ\u0007\u0010\u0085\u0001\u001a\u00020hJ\u0007\u0010\u0086\u0001\u001a\u00020hJ\u0007\u0010\u0087\u0001\u001a\u00020hJ\u0007\u0010\u0088\u0001\u001a\u00020hJ\u0007\u0010\u0089\u0001\u001a\u00020hJ\u0007\u0010\u008a\u0001\u001a\u00020hJ\u0007\u0010\u008b\u0001\u001a\u00020hJ\u0007\u0010\u008c\u0001\u001a\u00020hJ\u0010\u0010\u008d\u0001\u001a\u00020h2\u0007\u0010\u008e\u0001\u001a\u00020\u0006J\u0007\u0010\u008f\u0001\u001a\u00020hJ\u0013\u0010\u0090\u0001\u001a\u00020hH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0091\u0001J\u0013\u0010\u0092\u0001\u001a\u00020hH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0091\u0001J\u0007\u0010\u0093\u0001\u001a\u00020hR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\b\"\u0004\b)\u0010\nR\u001a\u0010*\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\nR\u001a\u0010-\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\b\"\u0004\b/\u0010\nR\u001a\u00100\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\nR\u001a\u00103\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u001a\u0010:\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001a\u0010<\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010 \"\u0004\b>\u0010?R*\u0010@\u001a\u0012\u0012\u0004\u0012\u00020B0Aj\b\u0012\u0004\u0012\u00020B`CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020IX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010 \"\u0004\bP\u0010?R\u001a\u0010Q\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\b\"\u0004\bS\u0010\nR\u001a\u0010T\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\b\"\u0004\bV\u0010\nR\u001a\u0010W\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\b\"\u0004\bY\u0010\nR\u001a\u0010Z\u001a\u00020[X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00060aX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0094\u0001"}, d2 = {"Lcom/unl/addressvalidator/ui/deliveryhours/DeliveryHoursActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/unl/addressvalidator/ui/interfaces/OperationHoursClickListner;", "Lcom/unl/addressvalidator/ui/interfaces/AddressImageClickListner;", "()V", "accessibilityType", "", "getAccessibilityType", "()Ljava/lang/String;", "setAccessibilityType", "(Ljava/lang/String;)V", "adapter", "Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "getAdapter", "()Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;", "setAdapter", "(Lcom/unl/addressvalidator/ui/imagepicker/adapter/AddPicturesAdapter;)V", "bind", "Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;", "getBind", "()Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;", "setBind", "(Lcom/unl/addressvalidator/databinding/AddPicturesPopupBinding;)V", "binding", "Lcom/unl/addressvalidator/databinding/ActivityDeliveryHoursBinding;", "getBinding", "()Lcom/unl/addressvalidator/databinding/ActivityDeliveryHoursBinding;", "setBinding", "(Lcom/unl/addressvalidator/databinding/ActivityDeliveryHoursBinding;)V", "dataListSize", "", "getDataListSize", "()I", "database", "Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "getDatabase", "()Lcom/unl/addressvalidator/database/UnlAddressDatabase;", "setDatabase", "(Lcom/unl/addressvalidator/database/UnlAddressDatabase;)V", "daysType", "getDaysType", "setDaysType", "fromAMPM", "getFromAMPM", "setFromAMPM", "fromHours", "getFromHours", "setFromHours", "fromMins", "getFromMins", "setFromMins", "isElevatorSelected", "", "()Z", "setElevatorSelected", "(Z)V", "isReplace", "setReplace", "isWheelchairSelected", "setWheelchairSelected", "lastIndex", "getLastIndex", "setLastIndex", "(I)V", "openCloseTimeList", "Ljava/util/ArrayList;", "Lcom/example/roomdatabasewithmodelclassess/model/OpeningHoursSpecificationModel;", "Lkotlin/collections/ArrayList;", "getOpenCloseTimeList", "()Ljava/util/ArrayList;", "setOpenCloseTimeList", "(Ljava/util/ArrayList;)V", "operationalDayAdapter", "Lcom/unl/addressvalidator/ui/adapters/OperationalDayAdapter;", "getOperationalDayAdapter", "()Lcom/unl/addressvalidator/ui/adapters/OperationalDayAdapter;", "setOperationalDayAdapter", "(Lcom/unl/addressvalidator/ui/adapters/OperationalDayAdapter;)V", "replaceIndex", "getReplaceIndex", "setReplaceIndex", "toAMPM", "getToAMPM", "setToAMPM", "toHours", "getToHours", "setToHours", "toMins", "getToMins", "setToMins", "viewModel", "Lcom/unl/addressvalidator/ui/deliveryhours/DeliveryHoursViewModel;", "getViewModel", "()Lcom/unl/addressvalidator/ui/deliveryhours/DeliveryHoursViewModel;", "setViewModel", "(Lcom/unl/addressvalidator/ui/deliveryhours/DeliveryHoursViewModel;)V", "weekDays", "", "getWeekDays", "()[Ljava/lang/String;", "setWeekDays", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "addressImageClick", "", "index", "isReplaceImage", "checkDeliveryHours", "clearAddressImageList", "dayClick", "day", "editAddress", "initiateViewModel", "itemClick", "hour", "type", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openImagePicker", "imageLimit", "returnAmPm", "opening", "returnHoursIndex", "returnMinsIndex", "selectedAccessibility", "setAdapters", "setAddressData", "setFromAndToTime", "setFromHoursAdapters", "setFromMinsAdapters", "setOperationalHoursClick", "setToHoursAdapters", "setToMinsAdapters", "submitData", "updateButtonStatus", "updateOpeningClosinghours", "openCloseType", "updateOperationalHours", "uploadAddressImage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImageWithPart", "uploadImages", "sdk_debug"})
public final class DeliveryHoursActivity extends androidx.appcompat.app.AppCompatActivity implements com.unl.addressvalidator.ui.interfaces.OperationHoursClickListner, com.unl.addressvalidator.ui.interfaces.AddressImageClickListner {
    @org.jetbrains.annotations.Nullable()
    private com.unl.addressvalidator.databinding.ActivityDeliveryHoursBinding binding;
    public com.unl.addressvalidator.ui.deliveryhours.DeliveryHoursViewModel viewModel;
    public com.unl.addressvalidator.database.UnlAddressDatabase database;
    public com.unl.addressvalidator.ui.adapters.OperationalDayAdapter operationalDayAdapter;
    private boolean isReplace = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> openCloseTimeList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String[] weekDays = {"All Day\'s", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
    @org.jetbrains.annotations.NotNull()
    private java.lang.String daysType = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromHours = "09";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromMins = "00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromAMPM = "AM";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String toHours = "18";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String toMins = "00";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String toAMPM = "AM";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accessibilityType = "";
    public com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter adapter;
    private final int dataListSize = 9;
    private int replaceIndex = 0;
    private boolean isWheelchairSelected = false;
    private boolean isElevatorSelected = false;
    public com.unl.addressvalidator.databinding.AddPicturesPopupBinding bind;
    private int lastIndex = -1;
    
    public DeliveryHoursActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.unl.addressvalidator.databinding.ActivityDeliveryHoursBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.unl.addressvalidator.databinding.ActivityDeliveryHoursBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.deliveryhours.DeliveryHoursViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.deliveryhours.DeliveryHoursViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.database.UnlAddressDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.database.UnlAddressDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.adapters.OperationalDayAdapter getOperationalDayAdapter() {
        return null;
    }
    
    public final void setOperationalDayAdapter(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.adapters.OperationalDayAdapter p0) {
    }
    
    public final boolean isReplace() {
        return false;
    }
    
    public final void setReplace(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> getOpenCloseTimeList() {
        return null;
    }
    
    public final void setOpenCloseTimeList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.OpeningHoursSpecificationModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getWeekDays() {
        return null;
    }
    
    public final void setWeekDays(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDaysType() {
        return null;
    }
    
    public final void setDaysType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromHours() {
        return null;
    }
    
    public final void setFromHours(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromMins() {
        return null;
    }
    
    public final void setFromMins(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromAMPM() {
        return null;
    }
    
    public final void setFromAMPM(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToHours() {
        return null;
    }
    
    public final void setToHours(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToMins() {
        return null;
    }
    
    public final void setToMins(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToAMPM() {
        return null;
    }
    
    public final void setToAMPM(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessibilityType() {
        return null;
    }
    
    public final void setAccessibilityType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.ui.imagepicker.adapter.AddPicturesAdapter p0) {
    }
    
    public final int getDataListSize() {
        return 0;
    }
    
    public final int getReplaceIndex() {
        return 0;
    }
    
    public final void setReplaceIndex(int p0) {
    }
    
    public final boolean isWheelchairSelected() {
        return false;
    }
    
    public final void setWheelchairSelected(boolean p0) {
    }
    
    public final boolean isElevatorSelected() {
        return false;
    }
    
    public final void setElevatorSelected(boolean p0) {
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
    
    private final void initiateViewModel() {
    }
    
    public final void setAdapters() {
    }
    
    public final void setOperationalHoursClick() {
    }
    
    private final void editAddress() {
    }
    
    public final void submitData() {
    }
    
    public final void setAddressData() {
    }
    
    public final void updateOpeningClosinghours(@org.jetbrains.annotations.NotNull()
    java.lang.String openCloseType) {
    }
    
    public final void setFromHoursAdapters() {
    }
    
    public final void setToHoursAdapters() {
    }
    
    public final void setFromMinsAdapters() {
    }
    
    public final void setToMinsAdapters() {
    }
    
    public final void selectedAccessibility() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String returnHoursIndex(boolean opening) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String returnMinsIndex(boolean opening) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String returnAmPm(boolean opening) {
        return null;
    }
    
    public final void setFromAndToTime() {
    }
    
    public final void updateOperationalHours() {
    }
    
    public final int getLastIndex() {
        return 0;
    }
    
    public final void setLastIndex(int p0) {
    }
    
    @java.lang.Override()
    public void dayClick(@org.jetbrains.annotations.NotNull()
    java.lang.String day) {
    }
    
    public final void updateButtonStatus() {
    }
    
    @java.lang.Override()
    public void itemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String hour, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
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
    
    public final void uploadImages() {
    }
    
    private final java.lang.Object uploadImageWithPart(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadAddressImage(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void clearAddressImageList() {
    }
    
    public final boolean checkDeliveryHours() {
        return false;
    }
}