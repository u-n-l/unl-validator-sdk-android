package com.unl.addressvalidator.ui.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00020\u0005`\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/unl/addressvalidator/ui/interfaces/LandmarkClickListner;", "", "landmarkItemClick", "", "reverseGeoCodeResponse", "Lcom/unl/addressvalidator/model/landmark/LandmarkDataList;", "uploadLandmarkPic", "position", "", "resulttList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sdk_debug"})
public abstract interface LandmarkClickListner {
    
    public abstract void landmarkItemClick(@org.jetbrains.annotations.NotNull()
    com.unl.addressvalidator.model.landmark.LandmarkDataList reverseGeoCodeResponse);
    
    public abstract void uploadLandmarkPic(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.unl.addressvalidator.model.landmark.LandmarkDataList> resulttList);
}