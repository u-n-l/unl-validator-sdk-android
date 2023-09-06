package com.unl.addressvalidator.network;

import java.lang.System;

/**
 * [SigV4Interceptor] is an [Interceptor] for Authorization of UNL credentials
 *
 * @property api_key is used to load map style
 * @property vpm_id is Virtual Private Map ID
 * @constructor
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/unl/addressvalidator/network/SigV4Interceptor;", "Lokhttp3/Interceptor;", "api_key", "", "vpm_id", "(Ljava/lang/String;Ljava/lang/String;)V", "getApi_key", "()Ljava/lang/String;", "setApi_key", "(Ljava/lang/String;)V", "getVpm_id", "setVpm_id", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "sdk_debug"})
public final class SigV4Interceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String api_key;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String vpm_id;
    
    public SigV4Interceptor(@org.jetbrains.annotations.NotNull()
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    java.lang.String vpm_id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApi_key() {
        return null;
    }
    
    public final void setApi_key(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVpm_id() {
        return null;
    }
    
    public final void setVpm_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Intercept method is used to set header values to an authorized style for Map
     *
     * @return Returns the Response for Map Style
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}