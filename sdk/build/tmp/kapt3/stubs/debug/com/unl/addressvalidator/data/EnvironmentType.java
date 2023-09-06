package com.unl.addressvalidator.data;

import java.lang.System;

/**
 * [EnvironmentType] is used to store [Enum] of Tiles or styles for our Map.
 *
 * @constructor Create empty Tile enum
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/unl/addressvalidator/data/EnvironmentType;", "", "()V", "PROD", "", "SANDBOX", "sdk_debug"})
public final class EnvironmentType {
    @org.jetbrains.annotations.NotNull()
    public static final com.unl.addressvalidator.data.EnvironmentType INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROD = "PRODUCTION";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SANDBOX = "SANDBOX";
    
    private EnvironmentType() {
        super();
    }
}