package com.fretron.vehicleManager.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/fretron/vehicleManager/di/components/VehicleAppComponent;", "", "server", "Lorg/glassfish/grizzly/http/server/HttpServer;", "FRETRON-VEHICLE-MANAGER-WITH-KAFKA"})
@dagger.Component(modules = {com.fretron.vehicleManager.di.modules.DatabaseModule.class, com.fretron.vehicleManager.di.modules.ConfigModule.class, com.fretron.vehicleManager.di.modules.HttpModule.class})
@javax.inject.Singleton()
public abstract interface VehicleAppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.glassfish.grizzly.http.server.HttpServer server();
}