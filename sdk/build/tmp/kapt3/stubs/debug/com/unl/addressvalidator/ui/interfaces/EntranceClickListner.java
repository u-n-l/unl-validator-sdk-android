package com.unl.addressvalidator.ui.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J(\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&\u00a8\u0006\f"}, d2 = {"Lcom/unl/addressvalidator/ui/interfaces/EntranceClickListner;", "", "entranceDeleteClick", "", "position", "", "entranceModel", "Ljava/util/ArrayList;", "Lcom/example/roomdatabasewithmodelclassess/model/EntranceModel;", "Lkotlin/collections/ArrayList;", "entranceEditClick", "entranceImageClick", "sdk_debug"})
public abstract interface EntranceClickListner {
    
    public abstract void entranceEditClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel);
    
    public abstract void entranceDeleteClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel);
    
    public abstract void entranceImageClick(int position, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.roomdatabasewithmodelclassess.model.EntranceModel> entranceModel);
}