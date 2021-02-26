package com.fretron.vehicleManager.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/fretron/vehicleManager/di/modules/ConfigModule;", "", "()V", "hostProvider", "", "portProvider", "", "FRETRON-VEHICLE-MANAGER-WITH-KAFKA"})
@dagger.Module()
public final class ConfigModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "host")
    @dagger.Provides()
    public final java.lang.String hostProvider() {
        return null;
    }
    
    @javax.inject.Named(value = "port")
    @dagger.Provides()
    public final int portProvider() {
        return 0;
    }
    
    public ConfigModule() {
        super();
    }
}