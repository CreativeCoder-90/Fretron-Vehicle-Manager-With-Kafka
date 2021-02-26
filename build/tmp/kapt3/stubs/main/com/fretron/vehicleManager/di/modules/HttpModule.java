package com.fretron.vehicleManager.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J$\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/fretron/vehicleManager/di/modules/HttpModule;", "", "()V", "provideResource", "Lorg/glassfish/jersey/server/ResourceConfig;", "vehicleResource", "Lcom/fretron/vehicleManager/resources/VehicleResource;", "provideServer", "Lorg/glassfish/grizzly/http/server/HttpServer;", "host", "", "port", "", "config", "FRETRON-VEHICLE-MANAGER-WITH-KAFKA"})
@dagger.Module()
public final class HttpModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.glassfish.jersey.server.ResourceConfig provideResource(@org.jetbrains.annotations.NotNull()
    com.fretron.vehicleManager.resources.VehicleResource vehicleResource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.glassfish.grizzly.http.server.HttpServer provideServer(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "host")
    java.lang.String host, @javax.inject.Named(value = "port")
    int port, @org.jetbrains.annotations.NotNull()
    org.glassfish.jersey.server.ResourceConfig config) {
        return null;
    }
    
    public HttpModule() {
        super();
    }
}