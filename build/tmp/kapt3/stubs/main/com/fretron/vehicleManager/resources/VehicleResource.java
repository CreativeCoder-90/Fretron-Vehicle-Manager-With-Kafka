package com.fretron.vehicleManager.resources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/fretron/vehicleManager/resources/VehicleResource;", "", "vehicleService", "Lcom/fretron/vehicleManager/services/VehicleService;", "(Lcom/fretron/vehicleManager/services/VehicleService;)V", "getVehicleService", "()Lcom/fretron/vehicleManager/services/VehicleService;", "setVehicleService", "createNewVehicle", "Ljavax/ws/rs/core/Response;", "request", "", "FRETRON-VEHICLE-MANAGER-WITH-KAFKA"})
@javax.ws.rs.Path(value = "vehicle/v1")
public final class VehicleResource {
    @org.jetbrains.annotations.NotNull()
    private com.fretron.vehicleManager.services.VehicleService vehicleService;
    
    @org.jetbrains.annotations.NotNull()
    @javax.ws.rs.Produces(value = {"application/json"})
    @javax.ws.rs.Consumes(value = {"application/json"})
    @javax.ws.rs.POST()
    @javax.ws.rs.Path(value = "vehicle")
    public final javax.ws.rs.core.Response createNewVehicle(@org.jetbrains.annotations.NotNull()
    java.lang.String request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fretron.vehicleManager.services.VehicleService getVehicleService() {
        return null;
    }
    
    public final void setVehicleService(@org.jetbrains.annotations.NotNull()
    com.fretron.vehicleManager.services.VehicleService p0) {
    }
    
    @javax.inject.Inject()
    public VehicleResource(@org.jetbrains.annotations.NotNull()
    com.fretron.vehicleManager.services.VehicleService vehicleService) {
        super();
    }
}