package com.unl.addressvalidator.ui.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/unl/addressvalidator/ui/interfaces/OperationHoursClickListner;", "", "dayClick", "", "day", "", "itemClick", "hour", "type", "sdk_debug"})
public abstract interface OperationHoursClickListner {
    
    public abstract void dayClick(@org.jetbrains.annotations.NotNull()
    java.lang.String day);
    
    public abstract void itemClick(@org.jetbrains.annotations.NotNull()
    java.lang.String hour, @org.jetbrains.annotations.NotNull()
    java.lang.String type);
}