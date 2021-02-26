package com.fretron.vehicleManager.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\r"}, d2 = {"Lcom/fretron/vehicleManager/services/VehicleService;", "", "vehicleRepository", "Lcom/fretron/vehicleManager/repositories/VehicleRepository;", "(Lcom/fretron/vehicleManager/repositories/VehicleRepository;)V", "getVehicleRepository", "()Lcom/fretron/vehicleManager/repositories/VehicleRepository;", "setVehicleRepository", "createNewVehicle", "Lcom/fretron/vehicleManager/model/Vehicle;", "v", "validateVehicle", "", "FRETRON-VEHICLE-MANAGER-WITH-KAFKA"})
public final class VehicleService {
    @org.jetbrains.annotations.NotNull()
    private com.fretron.vehicleManager.repositories.VehicleRepository vehicleRepository;
    
    @org.jetbrains.annotations.Nullable()
    public final com.fretron.vehicleManager.model.Vehicle createNewVehicle(@org.jetbrains.annotations.Nullable()
    com.fretron.vehicleManager.model.Vehicle v) {
        return null;
    }
    
    private final void validateVehicle(com.fretron.vehicleManager.model.Vehicle v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fretron.vehicleManager.repositories.VehicleRepository getVehicleRepository() {
        return null;
    }
    
    public final void setVehicleRepository(@org.jetbrains.annotations.NotNull()
    com.fretron.vehicleManager.repositories.VehicleRepository p0) {
    }
    
    @javax.inject.Inject()
    public VehicleService(@org.jetbrains.annotations.NotNull()
    com.fretron.vehicleManager.repositories.VehicleRepository vehicleRepository) {
        super();
    }
}